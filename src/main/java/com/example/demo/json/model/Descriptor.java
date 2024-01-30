
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
    "name",
    "version",
    "configuration"
})
@Generated("jsonschema2pojo")
public class Descriptor {

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
    @JsonProperty("configuration")
    private Object configuration;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Descriptor() {
    }

    /**
     * 
     * @param configuration
     * @param name
     * @param version
     */
    public Descriptor(String name, String version, Object configuration) {
        super();
        this.name = name;
        this.version = version;
        this.configuration = configuration;
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

    public Descriptor withName(String name) {
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

    public Descriptor withVersion(String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("configuration")
    public Object getConfiguration() {
        return configuration;
    }

    @JsonProperty("configuration")
    public void setConfiguration(Object configuration) {
        this.configuration = configuration;
    }

    public Descriptor withConfiguration(Object configuration) {
        this.configuration = configuration;
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

    public Descriptor withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
