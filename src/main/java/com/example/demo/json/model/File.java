
package com.example.demo.json.model;

import java.util.LinkedHashMap;
import java.util.List;
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
    "id",
    "location",
    "metadata",
    "contents",
    "digests"
})
@Generated("jsonschema2pojo")
public class File {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    @NotNull
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    @Valid
    @NotNull
    private Coordinates location;
    @JsonProperty("metadata")
    @Valid
    private FileMetadataEntry metadata;
    @JsonProperty("contents")
    private String contents;
    @JsonProperty("digests")
    @Valid
    private List<Digest> digests;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public File() {
    }

    /**
     * 
     * @param metadata
     * @param contents
     * @param digests
     * @param location
     * @param id
     */
    public File(String id, Coordinates location, FileMetadataEntry metadata, String contents, List<Digest> digests) {
        super();
        this.id = id;
        this.location = location;
        this.metadata = metadata;
        this.contents = contents;
        this.digests = digests;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public File withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public Coordinates getLocation() {
        return location;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public void setLocation(Coordinates location) {
        this.location = location;
    }

    public File withLocation(Coordinates location) {
        this.location = location;
        return this;
    }

    @JsonProperty("metadata")
    public FileMetadataEntry getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(FileMetadataEntry metadata) {
        this.metadata = metadata;
    }

    public File withMetadata(FileMetadataEntry metadata) {
        this.metadata = metadata;
        return this;
    }

    @JsonProperty("contents")
    public String getContents() {
        return contents;
    }

    @JsonProperty("contents")
    public void setContents(String contents) {
        this.contents = contents;
    }

    public File withContents(String contents) {
        this.contents = contents;
        return this;
    }

    @JsonProperty("digests")
    public List<Digest> getDigests() {
        return digests;
    }

    @JsonProperty("digests")
    public void setDigests(List<Digest> digests) {
        this.digests = digests;
    }

    public File withDigests(List<Digest> digests) {
        this.digests = digests;
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

    public File withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
