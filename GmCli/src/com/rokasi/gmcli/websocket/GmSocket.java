package com.rokasi.gmcli.websocket;

import java.io.IOException;
import java.net.URI;
import java.nio.channels.NotYetConnectedException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rokasi.gmcli.api.RestApi;
import com.rokasi.gmcli.json.SocketResponse;
import com.rokasi.gmcli.main.GmCli;

public class GmSocket extends WebSocketClient {

	ObjectMapper mapper = new ObjectMapper();
	AtomicInteger id = new AtomicInteger();
	CountDownLatch ready = new CountDownLatch(1);
	GmSocketResponseHandler listenHandler;

	private enum Connection_Status {
		initalize, handshake, subscribe, listen, error
	};

	private Connection_Status status;

	public GmSocket(URI serverURI) {
		super(serverURI);
		this.status = Connection_Status.initalize;
	}

	public GmSocket(URI serverURI, GmSocketResponseHandler rh) {
		super(serverURI);
		this.listenHandler = rh;
	}

	@Override
	public void onOpen(ServerHandshake handshakedata) {
		System.out.println("onOpen");

		SocketResponse handshakeRequest = new SocketResponse();
		handshakeRequest.setChannel("/meta/handshake");
		handshakeRequest.setAdditionalProperty("version", "1.0");
		handshakeRequest.setAdditionalProperty("supportedConnectionTypes", new String[] { "websocket" });
		handshakeRequest.setId("" + id.getAndIncrement());

		try {
			// Send the handshake
			String hsReq = mapper.writeValueAsString(handshakeRequest);
			System.out.println("Handshake Request: \n" + hsReq + "\n");
			this.status = Connection_Status.handshake;
			this.send(hsReq);

		} catch (NotYetConnectedException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onMessage(String message) {

		// convert the message into an object
		SocketResponse msg = null;
		try {
			// remove the array wrapper (delete the first and last chars)
			message = message.substring(1, message.length() - 1);
			msg = mapper.readValue(message, SocketResponse.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (msg == null)
			return;

		switch (this.status) {
		case handshake:
			// rcv the handshake
			System.out.println("Handshake Response: \n" + message + "\n");
			String client_id = msg.getClientId();

			// create the subscribe request
			SocketResponse subscribeRequest = new SocketResponse();
			subscribeRequest.setChannel("/meta/subscribe");
			subscribeRequest.setClientId(client_id);
			subscribeRequest.setAdditionalProperty("subscription", "/user/" + RestApi.USER_ID);
			subscribeRequest.setId("" + id.getAndIncrement());
			HashMap<String, String> ext = new HashMap<String, String>();
			ext.put("access_token", GmCli.ACCESS_TOKEN);
			subscribeRequest.setAdditionalProperty("ext", ext);

			// send the subscribe request
			try {
				String subRq = mapper.writeValueAsString(subscribeRequest);
				System.out.println("Subscribe Request: \n" + subRq + "\n");
				this.status = Connection_Status.subscribe;
				this.send(subRq);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			break;
		case subscribe:
			// rcv the subscribe
			System.out.println("Subscribe Response: \n" + message + "\n");

			// check if successful
			Map<String, Object> adp = msg.getAdditionalProperties();
			boolean sub_stat = (boolean) adp.get("successful");

			if (sub_stat) {
				System.out.println("WS is ready to recive mesages");
				this.status = Connection_Status.listen;
				this.ready.countDown();
			} else {
				System.out.println("subscribe not successful");
				status = Connection_Status.error;
				this.close();
			}
			break;

		case listen:
			// System.out.println("Listent Response: " + message + "\n");
			this.listenHandler.handelMessage(msg);
			break;

		case error:
			this.close();
			break;

		default:
			System.out.println("Default: \n" + message);
			break;
		}

	}

	@Override
	public void onClose(int code, String reason, boolean remote) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onError(Exception ex) {
		// TODO Auto-generated method stub
	}

	public CountDownLatch getLatch() {
		return this.ready;
	}

}
