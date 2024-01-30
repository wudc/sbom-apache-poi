
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
    "value",
    "spdxExpression",
    "type",
    "urls",
    "locations"
})
@Generated("jsonschema2pojo")
public class License {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    @NotNull
    private String value;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spdxExpression")
    @NotNull
    private String spdxExpression;
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
    @JsonProperty("urls")
    @Valid
    @NotNull
    private List<String> urls;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("locations")
    @Valid
    @NotNull
    private List<Location> locations;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public License() {
    }

    /**
     * 
     * @param urls
     * @param spdxExpression
     * @param locations
     * @param type
     * @param value
     */
    public License(String value, String spdxExpression, String type, List<String> urls, List<Location> locations) {
        super();
        this.value = value;
        this.spdxExpression = spdxExpression;
        this.type = type;
        this.urls = urls;
        this.locations = locations;
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

    public License withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spdxExpression")
    public String getSpdxExpression() {
        return spdxExpression;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spdxExpression")
    public void setSpdxExpression(String spdxExpression) {
        this.spdxExpression = spdxExpression;
    }

    public License withSpdxExpression(String spdxExpression) {
        this.spdxExpression = spdxExpression;
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

    public License withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("urls")
    public List<String> getUrls() {
        return urls;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("urls")
    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public License withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public License withLocations(List<Location> locations) {
        this.locations = locations;
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

    public License withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
