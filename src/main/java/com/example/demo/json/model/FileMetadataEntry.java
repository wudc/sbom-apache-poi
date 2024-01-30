
package com.example.demo.json.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mode",
    "type",
    "linkDestination",
    "userID",
    "groupID",
    "mimeType",
    "size"
})
@Generated("jsonschema2pojo")
public class FileMetadataEntry {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mode")
    @NotNull
    private Integer mode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    @NotNull
    private String type;
    @JsonProperty("linkDestination")
    private String linkDestination;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("userID")
    @NotNull
    private Integer userID;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("groupID")
    @NotNull
    private Integer groupID;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mimeType")
    @NotNull
    private String mimeType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    @NotNull
    private Integer size;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FileMetadataEntry() {
    }

    /**
     * 
     * @param mode
     * @param linkDestination
     * @param size
     * @param groupID
     * @param mimeType
     * @param type
     * @param userID
     */
    public FileMetadataEntry(Integer mode, String type, String linkDestination, Integer userID, Integer groupID, String mimeType, Integer size) {
        super();
        this.mode = mode;
        this.type = type;
        this.linkDestination = linkDestination;
        this.userID = userID;
        this.groupID = groupID;
        this.mimeType = mimeType;
        this.size = size;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mode")
    public Integer getMode() {
        return mode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mode")
    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public FileMetadataEntry withMode(Integer mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public FileMetadataEntry withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("linkDestination")
    public String getLinkDestination() {
        return linkDestination;
    }

    @JsonProperty("linkDestination")
    public void setLinkDestination(String linkDestination) {
        this.linkDestination = linkDestination;
    }

    public FileMetadataEntry withLinkDestination(String linkDestination) {
        this.linkDestination = linkDestination;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("userID")
    public Integer getUserID() {
        return userID;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("userID")
    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public FileMetadataEntry withUserID(Integer userID) {
        this.userID = userID;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("groupID")
    public Integer getGroupID() {
        return groupID;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("groupID")
    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    public FileMetadataEntry withGroupID(Integer groupID) {
        this.groupID = groupID;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public FileMetadataEntry withMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    public FileMetadataEntry withSize(Integer size) {
        this.size = size;
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

    public FileMetadataEntry withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
