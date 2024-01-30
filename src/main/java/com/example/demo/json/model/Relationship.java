
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
    "parent",
    "child",
    "type",
    "metadata"
})
@Generated("jsonschema2pojo")
public class Relationship {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("parent")
    @NotNull
    private String parent;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("child")
    @NotNull
    private String child;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    @NotNull
    private String type;
    @JsonProperty("metadata")
    private Object metadata;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Relationship() {
    }

    /**
     * 
     * @param parent
     * @param metadata
     * @param type
     * @param child
     */
    public Relationship(String parent, String child, String type, Object metadata) {
        super();
        this.parent = parent;
        this.child = child;
        this.type = type;
        this.metadata = metadata;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("parent")
    public String getParent() {
        return parent;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    public Relationship withParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("child")
    public String getChild() {
        return child;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("child")
    public void setChild(String child) {
        this.child = child;
    }

    public Relationship withChild(String child) {
        this.child = child;
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

    public Relationship withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("metadata")
    public Object getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public Relationship withMetadata(Object metadata) {
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

    public Relationship withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
