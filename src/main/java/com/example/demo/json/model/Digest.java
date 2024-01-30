
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
    "algorithm",
    "value"
})
@Generated("jsonschema2pojo")
public class Digest {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    @NotNull
    private String algorithm;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    @NotNull
    private String value;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Digest() {
    }

    /**
     * 
     * @param value
     * @param algorithm
     */
    public Digest(String algorithm, String value) {
        super();
        this.algorithm = algorithm;
        this.value = value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public Digest withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Digest withValue(String value) {
        this.value = value;
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

    public Digest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
