
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
    "classification",
    "lineNumber",
    "lineOffset",
    "seekPosition",
    "length",
    "value"
})
@Generated("jsonschema2pojo")
public class SearchResult {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("classification")
    @NotNull
    private String classification;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lineNumber")
    @NotNull
    private Integer lineNumber;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lineOffset")
    @NotNull
    private Integer lineOffset;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("seekPosition")
    @NotNull
    private Integer seekPosition;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("length")
    @NotNull
    private Integer length;
    @JsonProperty("value")
    private String value;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SearchResult() {
    }

    /**
     * 
     * @param lineOffset
     * @param length
     * @param seekPosition
     * @param classification
     * @param lineNumber
     * @param value
     */
    public SearchResult(String classification, Integer lineNumber, Integer lineOffset, Integer seekPosition, Integer length, String value) {
        super();
        this.classification = classification;
        this.lineNumber = lineNumber;
        this.lineOffset = lineOffset;
        this.seekPosition = seekPosition;
        this.length = length;
        this.value = value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("classification")
    public String getClassification() {
        return classification;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("classification")
    public void setClassification(String classification) {
        this.classification = classification;
    }

    public SearchResult withClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lineNumber")
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lineNumber")
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public SearchResult withLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lineOffset")
    public Integer getLineOffset() {
        return lineOffset;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lineOffset")
    public void setLineOffset(Integer lineOffset) {
        this.lineOffset = lineOffset;
    }

    public SearchResult withLineOffset(Integer lineOffset) {
        this.lineOffset = lineOffset;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("seekPosition")
    public Integer getSeekPosition() {
        return seekPosition;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("seekPosition")
    public void setSeekPosition(Integer seekPosition) {
        this.seekPosition = seekPosition;
    }

    public SearchResult withSeekPosition(Integer seekPosition) {
        this.seekPosition = seekPosition;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("length")
    public Integer getLength() {
        return length;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("length")
    public void setLength(Integer length) {
        this.length = length;
    }

    public SearchResult withLength(Integer length) {
        this.length = length;
        return this;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public SearchResult withValue(String value) {
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

    public SearchResult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
