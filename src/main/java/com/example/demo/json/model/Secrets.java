
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
    "location",
    "secrets"
})
@Generated("jsonschema2pojo")
public class Secrets {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    @Valid
    @NotNull
    private Coordinates location;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secrets")
    @Valid
    @NotNull
    private List<SearchResult> secrets;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Secrets() {
    }

    /**
     * 
     * @param location
     * @param secrets
     */
    public Secrets(Coordinates location, List<SearchResult> secrets) {
        super();
        this.location = location;
        this.secrets = secrets;
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

    public Secrets withLocation(Coordinates location) {
        this.location = location;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secrets")
    public List<SearchResult> getSecrets() {
        return secrets;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secrets")
    public void setSecrets(List<SearchResult> secrets) {
        this.secrets = secrets;
    }

    public Secrets withSecrets(List<SearchResult> secrets) {
        this.secrets = secrets;
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

    public Secrets withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
