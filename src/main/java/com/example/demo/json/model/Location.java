
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
    "path",
    "layerID",
    "annotations"
})
@Generated("jsonschema2pojo")
public class Location {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("path")
    @NotNull
    private String path;
    @JsonProperty("layerID")
    private String layerID;
    @JsonProperty("annotations")
    @Valid
    private Annotations annotations;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param path
     * @param layerID
     * @param annotations
     */
    public Location(String path, String layerID, Annotations annotations) {
        super();
        this.path = path;
        this.layerID = layerID;
        this.annotations = annotations;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    public Location withPath(String path) {
        this.path = path;
        return this;
    }

    @JsonProperty("layerID")
    public String getLayerID() {
        return layerID;
    }

    @JsonProperty("layerID")
    public void setLayerID(String layerID) {
        this.layerID = layerID;
    }

    public Location withLayerID(String layerID) {
        this.layerID = layerID;
        return this;
    }

    @JsonProperty("annotations")
    public Annotations getAnnotations() {
        return annotations;
    }

    @JsonProperty("annotations")
    public void setAnnotations(Annotations annotations) {
        this.annotations = annotations;
    }

    public Location withAnnotations(Annotations annotations) {
        this.annotations = annotations;
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

    public Location withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
