
package com.rokasi.gmcli.json.messages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "attachments",
    "avatar_url",
    "created_at",
    "favorited_by",
    "group_id",
    "id",
    "name",
    "sender_id",
    "sender_type",
    "source_guid",
    "system",
    "text",
    "user_id"
})
public class Message {

    @JsonProperty("attachments")
    private List<Object> attachments = new ArrayList<Object>();
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("created_at")
    private Long createdAt;
    @JsonProperty("favorited_by")
    private List<Object> favoritedBy = new ArrayList<Object>();
    @JsonProperty("group_id")
    private String groupId;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("sender_id")
    private String senderId;
    @JsonProperty("sender_type")
    private String senderType;
    @JsonProperty("source_guid")
    private String sourceGuid;
    @JsonProperty("system")
    private Boolean system;
    @JsonProperty("text")
    private String text;
    @JsonProperty("user_id")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The attachments
     */
    @JsonProperty("attachments")
    public List<Object> getAttachments() {
        return attachments;
    }

    /**
     * 
     * @param attachments
     *     The attachments
     */
    @JsonProperty("attachments")
    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }

    public Message withAttachments(List<Object> attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * 
     * @return
     *     The avatarUrl
     */
    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 
     * @param avatarUrl
     *     The avatar_url
     */
    @JsonProperty("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Message withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    public Long getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Message withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * @return
     *     The favoritedBy
     */
    @JsonProperty("favorited_by")
    public List<Object> getFavoritedBy() {
        return favoritedBy;
    }

    /**
     * 
     * @param favoritedBy
     *     The favorited_by
     */
    @JsonProperty("favorited_by")
    public void setFavoritedBy(List<Object> favoritedBy) {
        this.favoritedBy = favoritedBy;
    }

    public Message withFavoritedBy(List<Object> favoritedBy) {
        this.favoritedBy = favoritedBy;
        return this;
    }

    /**
     * 
     * @return
     *     The groupId
     */
    @JsonProperty("group_id")
    public String getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId
     *     The group_id
     */
    @JsonProperty("group_id")
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Message withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Message withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Message withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The senderId
     */
    @JsonProperty("sender_id")
    public String getSenderId() {
        return senderId;
    }

    /**
     * 
     * @param senderId
     *     The sender_id
     */
    @JsonProperty("sender_id")
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public Message withSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * 
     * @return
     *     The senderType
     */
    @JsonProperty("sender_type")
    public String getSenderType() {
        return senderType;
    }

    /**
     * 
     * @param senderType
     *     The sender_type
     */
    @JsonProperty("sender_type")
    public void setSenderType(String senderType) {
        this.senderType = senderType;
    }

    public Message withSenderType(String senderType) {
        this.senderType = senderType;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceGuid
     */
    @JsonProperty("source_guid")
    public String getSourceGuid() {
        return sourceGuid;
    }

    /**
     * 
     * @param sourceGuid
     *     The source_guid
     */
    @JsonProperty("source_guid")
    public void setSourceGuid(String sourceGuid) {
        this.sourceGuid = sourceGuid;
    }

    public Message withSourceGuid(String sourceGuid) {
        this.sourceGuid = sourceGuid;
        return this;
    }

    /**
     * 
     * @return
     *     The system
     */
    @JsonProperty("system")
    public Boolean getSystem() {
        return system;
    }

    /**
     * 
     * @param system
     *     The system
     */
    @JsonProperty("system")
    public void setSystem(Boolean system) {
        this.system = system;
    }

    public Message withSystem(Boolean system) {
        this.system = system;
        return this;
    }

    /**
     * 
     * @return
     *     The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public Message withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 
     * @return
     *     The userId
     */
    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The user_id
     */
    @JsonProperty("user_id")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Message withUserId(String userId) {
        this.userId = userId;
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

    public Message withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
