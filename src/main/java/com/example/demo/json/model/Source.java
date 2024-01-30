
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
    "id",
    "name",
    "version",
    "type",
    "metadata"
})
@Generated("jsonschema2pojo")
public class Source {

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
    @JsonProperty("name")
    @NotNull
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    @NotNull
    private String version;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    @NotNull
    private String type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    @NotNull
    private Object metadata;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Source() {
    }

    /**
     * 
     * @param metadata
     * @param name
     * @param id
     * @param type
     * @param version
     */
    public Source(String id, String name, String version, String type, Object metadata) {
        super();
        this.id = id;
        this.name = name;
        this.version = version;
        this.type = type;
        this.metadata = metadata;
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

    public Source withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Source withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public Source withVersion(String version) {
        this.version = version;
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

    public Source withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public Object getMetadata() {
        return metadata;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public Source withMetadata(Object metadata) {
        this.metadata = metadata;
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

    public Source withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
