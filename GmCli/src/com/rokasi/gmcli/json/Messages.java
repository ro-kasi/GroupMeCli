
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
    "count",
    "last_message_id",
    "last_message_created_at",
    "preview"
})
public class Messages {

    @JsonProperty("count")
    private Long count;
    @JsonProperty("last_message_id")
    private String lastMessageId;
    @JsonProperty("last_message_created_at")
    private Long lastMessageCreatedAt;
    @JsonProperty("preview")
    private Preview preview;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public Long getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(Long count) {
        this.count = count;
    }

    public Messages withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 
     * @return
     *     The lastMessageId
     */
    @JsonProperty("last_message_id")
    public String getLastMessageId() {
        return lastMessageId;
    }

    /**
     * 
     * @param lastMessageId
     *     The last_message_id
     */
    @JsonProperty("last_message_id")
    public void setLastMessageId(String lastMessageId) {
        this.lastMessageId = lastMessageId;
    }

    public Messages withLastMessageId(String lastMessageId) {
        this.lastMessageId = lastMessageId;
        return this;
    }

    /**
     * 
     * @return
     *     The lastMessageCreatedAt
     */
    @JsonProperty("last_message_created_at")
    public Long getLastMessageCreatedAt() {
        return lastMessageCreatedAt;
    }

    /**
     * 
     * @param lastMessageCreatedAt
     *     The last_message_created_at
     */
    @JsonProperty("last_message_created_at")
    public void setLastMessageCreatedAt(Long lastMessageCreatedAt) {
        this.lastMessageCreatedAt = lastMessageCreatedAt;
    }

    public Messages withLastMessageCreatedAt(Long lastMessageCreatedAt) {
        this.lastMessageCreatedAt = lastMessageCreatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The preview
     */
    @JsonProperty("preview")
    public Preview getPreview() {
        return preview;
    }

    /**
     * 
     * @param preview
     *     The preview
     */
    @JsonProperty("preview")
    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public Messages withPreview(Preview preview) {
        this.preview = preview;
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

    public Messages withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
