
package com.rokasi.gmcli.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "channel", "clientId", "id", "data" })
public class SocketResponse {

	@JsonProperty("channel")
	private String channel;
	@JsonProperty("clientId")
	private String clientId;
	@JsonProperty("id")
	private String id;
	@JsonProperty("data")
	private Data data;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The channel
	 */
	@JsonProperty("channel")
	public String getChannel() {
		return channel;
	}

	/**
	 * 
	 * @param channel
	 *            The channel
	 */
	@JsonProperty("channel")
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public SocketResponse withChannel(String channel) {
		this.channel = channel;
		return this;
	}

	/**
	 * 
	 * @return The clientId
	 */
	@JsonProperty("clientId")
	public String getClientId() {
		return clientId;
	}

	/**
	 * 
	 * @param clientId
	 *            The clientId
	 */
	@JsonProperty("clientId")
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public SocketResponse withClientId(String clientId) {
		this.clientId = clientId;
		return this;
	}

	/**
	 * 
	 * @return The id
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public SocketResponse withId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * 
	 * @return The data
	 */
	@JsonProperty("data")
	public Data getData() {
		return data;
	}

	/**
	 * 
	 * @param data
	 *            The data
	 */
	@JsonProperty("data")
	public void setData(Data data) {
		this.data = data;
	}

	public SocketResponse withData(Data data) {
		this.data = data;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public SocketResponse withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
