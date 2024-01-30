
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
    "version",
    "url"
})
@Generated("jsonschema2pojo")
public class Schema {

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
    @JsonProperty("url")
    @NotNull
    private String url;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Schema() {
    }

    /**
     * 
     * @param version
     * @param url
     */
    public Schema(String version, String url) {
        super();
        this.version = version;
        this.url = url;
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

    public Schema withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Schema withUrl(String url) {
        this.url = url;
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

    public Schema withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
