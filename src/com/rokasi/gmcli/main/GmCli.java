package com.rokasi.gmcli.main;

import java.net.URI;
import java.util.concurrent.CountDownLatch;

import com.rokasi.gmcli.api.RestApi;
import com.rokasi.gmcli.json.SocketResponse;
import com.rokasi.gmcli.ui.UserInterface;
import com.rokasi.gmcli.websocket.GmSocket;
import com.rokasi.gmcli.websocket.GmSocketResponseHandler;

public class GmCli {

	public static final String WS_URL = "ws://push.groupme.com/faye";
	public static String ACCESS_TOKEN;
	
	public static void main(String[] args) throws Exception {
		
		GmCli.ACCESS_TOKEN = args[0];
		
		RestApi.init();

		UserInterface ui = new UserInterface();
		ui.init();

		// Create the websocket connection and bind the ui
		GmSocket gmws = new GmSocket(new URI(WS_URL), new GmSocketResponseHandler() {
			@Override
			public void handelMessage(SocketResponse message) {
				ui.addMessage(message);
			}
		});

		// wait for websocket to be ready
		CountDownLatch wsReadyLatch = gmws.getLatch();
		gmws.connect();
		wsReadyLatch.await();

		// Start the ui
		ui.start();

	}

}
