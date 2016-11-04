
package com.rokasi.gmcli.json;

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
    "group_id",
    "id",
    "location",
    "name",
    "picture_url",
    "sender_id",
    "sender_type",
    "source_guid",
    "system",
    "text",
    "user_id"
})
public class Subject {

    @JsonProperty("attachments")
    private List<Object> attachments = new ArrayList<Object>();
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("created_at")
    private Long createdAt;
    @JsonProperty("group_id")
    private String groupId;
    @JsonProperty("id")
    private String id;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("name")
    private String name;
    @JsonProperty("picture_url")
    private Object pictureUrl;
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

    public Subject withAttachments(List<Object> attachments) {
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

    public Subject withAvatarUrl(String avatarUrl) {
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

    public Subject withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
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

    public Subject withGroupId(String groupId) {
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

    public Subject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    public Subject withLocation(Location location) {
        this.location = location;
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

    public Subject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The pictureUrl
     */
    @JsonProperty("picture_url")
    public Object getPictureUrl() {
        return pictureUrl;
    }

    /**
     * 
     * @param pictureUrl
     *     The picture_url
     */
    @JsonProperty("picture_url")
    public void setPictureUrl(Object pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Subject withPictureUrl(Object pictureUrl) {
        this.pictureUrl = pictureUrl;
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

    public Subject withSenderId(String senderId) {
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

    public Subject withSenderType(String senderType) {
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

    public Subject withSourceGuid(String sourceGuid) {
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

    public Subject withSystem(Boolean system) {
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

    public Subject withText(String text) {
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

    public Subject withUserId(String userId) {
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

    public Subject withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
