
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
    "user_id",
    "nickname",
    "image_url",
    "id",
    "muted",
    "autokicked"
})
public class Member {

    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("id")
    private String id;
    @JsonProperty("muted")
    private Boolean muted;
    @JsonProperty("autokicked")
    private Boolean autokicked;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Member withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 
     * @return
     *     The nickname
     */
    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    /**
     * 
     * @param nickname
     *     The nickname
     */
    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Member withNickname(String nickname) {
        this.nickname = nickname;
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

    public Member withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    public Member withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The muted
     */
    @JsonProperty("muted")
    public Boolean getMuted() {
        return muted;
    }

    /**
     * 
     * @param muted
     *     The muted
     */
    @JsonProperty("muted")
    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    public Member withMuted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    /**
     * 
     * @return
     *     The autokicked
     */
    @JsonProperty("autokicked")
    public Boolean getAutokicked() {
        return autokicked;
    }

    /**
     * 
     * @param autokicked
     *     The autokicked
     */
    @JsonProperty("autokicked")
    public void setAutokicked(Boolean autokicked) {
        this.autokicked = autokicked;
    }

    public Member withAutokicked(Boolean autokicked) {
        this.autokicked = autokicked;
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

    public Member withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
