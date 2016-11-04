
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
    "id",
    "group_id",
    "name",
    "phone_number",
    "type",
    "description",
    "image_url",
    "creator_user_id",
    "created_at",
    "updated_at",
    "office_mode",
    "share_url",
    "members",
    "messages",
    "max_members"
})
public class Group {

    @JsonProperty("id")
    private String id;
    @JsonProperty("group_id")
    private String groupId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("type")
    private String type;
    @JsonProperty("description")
    private String description;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("creator_user_id")
    private String creatorUserId;
    @JsonProperty("created_at")
    private Long createdAt;
    @JsonProperty("updated_at")
    private Long updatedAt;
    @JsonProperty("office_mode")
    private Boolean officeMode;
    @JsonProperty("share_url")
    private Object shareUrl;
    @JsonProperty("members")
    private List<Member> members = new ArrayList<Member>();
    @JsonProperty("messages")
    private Messages messages;
    @JsonProperty("max_members")
    private Long maxMembers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Group withId(String id) {
        this.id = id;
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

    public Group withGroupId(String groupId) {
        this.groupId = groupId;
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

    public Group withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The phoneNumber
     */
    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 
     * @param phoneNumber
     *     The phone_number
     */
    @JsonProperty("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Group withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public Group withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Group withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The imageUrl
     */
    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The image_url
     */
    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Group withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The creatorUserId
     */
    @JsonProperty("creator_user_id")
    public String getCreatorUserId() {
        return creatorUserId;
    }

    /**
     * 
     * @param creatorUserId
     *     The creator_user_id
     */
    @JsonProperty("creator_user_id")
    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public Group withCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
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

    public Group withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    @JsonProperty("updated_at")
    public Long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Group withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The officeMode
     */
    @JsonProperty("office_mode")
    public Boolean getOfficeMode() {
        return officeMode;
    }

    /**
     * 
     * @param officeMode
     *     The office_mode
     */
    @JsonProperty("office_mode")
    public void setOfficeMode(Boolean officeMode) {
        this.officeMode = officeMode;
    }

    public Group withOfficeMode(Boolean officeMode) {
        this.officeMode = officeMode;
        return this;
    }

    /**
     * 
     * @return
     *     The shareUrl
     */
    @JsonProperty("share_url")
    public Object getShareUrl() {
        return shareUrl;
    }

    /**
     * 
     * @param shareUrl
     *     The share_url
     */
    @JsonProperty("share_url")
    public void setShareUrl(Object shareUrl) {
        this.shareUrl = shareUrl;
    }

    public Group withShareUrl(Object shareUrl) {
        this.shareUrl = shareUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The members
     */
    @JsonProperty("members")
    public List<Member> getMembers() {
        return members;
    }

    /**
     * 
     * @param members
     *     The members
     */
    @JsonProperty("members")
    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Group withMembers(List<Member> members) {
        this.members = members;
        return this;
    }

    /**
     * 
     * @return
     *     The messages
     */
    @JsonProperty("messages")
    public Messages getMessages() {
        return messages;
    }

    /**
     * 
     * @param messages
     *     The messages
     */
    @JsonProperty("messages")
    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    public Group withMessages(Messages messages) {
        this.messages = messages;
        return this;
    }

    /**
     * 
     * @return
     *     The maxMembers
     */
    @JsonProperty("max_members")
    public Long getMaxMembers() {
        return maxMembers;
    }

    /**
     * 
     * @param maxMembers
     *     The max_members
     */
    @JsonProperty("max_members")
    public void setMaxMembers(Long maxMembers) {
        this.maxMembers = maxMembers;
    }

    public Group withMaxMembers(Long maxMembers) {
        this.maxMembers = maxMembers;
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

    public Group withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
