package com.rokasi.gmcli.api;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.rokasi.gmcli.json.Groups;
import com.rokasi.gmcli.json.messages.Message;
import com.rokasi.gmcli.json.messages.Messages;
import com.rokasi.gmcli.main.GmCli;

public class RestApi {

	private static final String API_URL = "https://api.groupme.com/v3/";

	private static final String GROUP_MESSAGES = "groups/{group_id}/messages";

	private static final String GROUP_LIST = "groups";

	public static String USER_ID;

	public static Groups groups;

	/**
	 * Start the Unirest json mapper. Populate the user id. Get the current
	 * groups
	 */
	public static void init() {

		// Start the json object mapper
		initUnirest();

		try {
			// load the user_id
			HttpResponse<com.mashape.unirest.http.JsonNode> httpMe = Unirest.get(API_URL + "users/me")
					.queryString("token", GmCli.ACCESS_TOKEN).asJson();

			if (httpMe.getStatus() == 200) {
				USER_ID = httpMe.getBody().getObject().getJSONObject("response").getString("id");
				System.out.println("Current user id: " + USER_ID);
			} else {
				System.out.println("Current user self lookup failed");
			}

			// load the groups
			groups = getGroupList();

		} catch (UnirestException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}

	}

	public void refreshGroupList() {
		groups = getGroupList();
	}

	private static void initUnirest() {
		Unirest.setObjectMapper(new com.mashape.unirest.http.ObjectMapper() {

			private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper = new com.fasterxml.jackson.databind.ObjectMapper();

			public <T> T readValue(String value, Class<T> valueType) {
				try {
					return jacksonObjectMapper.readValue(value, valueType);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}

			public String writeValue(Object value) {
				try {
					return jacksonObjectMapper.writeValueAsString(value);
				} catch (JsonProcessingException e) {
					throw new RuntimeException(e);
				}
			}
		});

	}

	public static List<Message> getGroupMessages(String groupid) {

		try {
			HttpResponse<com.rokasi.gmcli.json.messages.Messages> httpMsgs = Unirest.get(API_URL + GROUP_MESSAGES)
					.routeParam("group_id", groupid).queryString("token", GmCli.ACCESS_TOKEN)
					.queryString("limit", 100).asObject(Messages.class);

			if (httpMsgs.getStatus() != 200) {
				System.out.println("GroupMe message listing api failed");
				return null;
			}

			Messages msgs = httpMsgs.getBody();

			return msgs.getResponse().getMessages();

		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static Groups getGroupList() {
		try {
			HttpResponse<com.rokasi.gmcli.json.Groups> httpMsgs = Unirest.get(API_URL + GROUP_LIST)
					.queryString("token", GmCli.ACCESS_TOKEN).queryString("per_page", 20).asObject(Groups.class);

			if (httpMsgs.getStatus() != 200) {
				System.out.println("GroupMe group listing api failed");
			}

			return httpMsgs.getBody();

		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static void sendMessage(String groupId, String message) {
		// TODO: make an object for this
		JSONObject sendJSON = null;
		try {
			sendJSON = new JSONObject();
			JSONObject msgJSON = new JSONObject();
			msgJSON.put("text", message);
			sendJSON.put("message", msgJSON);
		} catch (JSONException e) {
			e.printStackTrace();
			return;
		}

		try {
			Unirest.post(API_URL + GROUP_MESSAGES).routeParam("group_id", groupId)
					.header("content-type", "application/json").queryString("token", GmCli.ACCESS_TOKEN).body(sendJSON)
					.asJson();
		} catch (UnirestException e) {
			e.printStackTrace();
		}
	}

}
