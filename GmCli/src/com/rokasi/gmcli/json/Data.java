
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
@JsonPropertyOrder({
    "alert",
    "received_at",
    "subject",
    "type"
})
public class Data {

    @JsonProperty("alert")
    private String alert;
    @JsonProperty("received_at")
    private Long receivedAt;
    @JsonProperty("subject")
    private Subject subject;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The alert
     */
    @JsonProperty("alert")
    public String getAlert() {
        return alert;
    }

    /**
     * 
     * @param alert
     *     The alert
     */
    @JsonProperty("alert")
    public void setAlert(String alert) {
        this.alert = alert;
    }

    public Data withAlert(String alert) {
        this.alert = alert;
        return this;
    }

    /**
     * 
     * @return
     *     The receivedAt
     */
    @JsonProperty("received_at")
    public Long getReceivedAt() {
        return receivedAt;
    }

    /**
     * 
     * @param receivedAt
     *     The received_at
     */
    @JsonProperty("received_at")
    public void setReceivedAt(Long receivedAt) {
        this.receivedAt = receivedAt;
    }

    public Data withReceivedAt(Long receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The subject
     */
    @JsonProperty("subject")
    public Subject getSubject() {
        return subject;
    }

    /**
     * 
     * @param subject
     *     The subject
     */
    @JsonProperty("subject")
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Data withSubject(Subject subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Data withType(String type) {
        this.type = type;
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

    public Data withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
