
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
    "name",
    "version",
    "type",
    "foundBy",
    "locations",
    "licenses",
    "language",
    "cpes",
    "purl",
    "metadataType",
    "metadata"
})
@Generated("jsonschema2pojo")
public class Package {

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
    @JsonProperty("foundBy")
    @NotNull
    private String foundBy;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("locations")
    @Valid
    @NotNull
    private List<Location> locations;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("licenses")
    @Valid
    @NotNull
    private List<License> licenses;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    @NotNull
    private String language;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cpes")
    @Valid
    @NotNull
    private List<String> cpes;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("purl")
    @NotNull
    private String purl;
    @JsonProperty("metadataType")
    private String metadataType;
    @JsonProperty("metadata")
    private Object metadata;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Package() {
    }

    /**
     * 
     * @param foundBy
     * @param licenses
     * @param metadata
     * @param cpes
     * @param name
     * @param locations
     * @param language
     * @param id
     * @param purl
     * @param type
     * @param version
     * @param metadataType
     */
    public Package(String id, String name, String version, String type, String foundBy, List<Location> locations, List<License> licenses, String language, List<String> cpes, String purl, String metadataType, Object metadata) {
        super();
        this.id = id;
        this.name = name;
        this.version = version;
        this.type = type;
        this.foundBy = foundBy;
        this.locations = locations;
        this.licenses = licenses;
        this.language = language;
        this.cpes = cpes;
        this.purl = purl;
        this.metadataType = metadataType;
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

    public Package withId(String id) {
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

    public Package withName(String name) {
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

    public Package withVersion(String version) {
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

    public Package withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("foundBy")
    public String getFoundBy() {
        return foundBy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("foundBy")
    public void setFoundBy(String foundBy) {
        this.foundBy = foundBy;
    }

    public Package withFoundBy(String foundBy) {
        this.foundBy = foundBy;
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

    public Package withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("licenses")
    public List<License> getLicenses() {
        return licenses;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("licenses")
    public void setLicenses(List<License> licenses) {
        this.licenses = licenses;
    }

    public Package withLicenses(List<License> licenses) {
        this.licenses = licenses;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    public Package withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cpes")
    public List<String> getCpes() {
        return cpes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cpes")
    public void setCpes(List<String> cpes) {
        this.cpes = cpes;
    }

    public Package withCpes(List<String> cpes) {
        this.cpes = cpes;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("purl")
    public String getPurl() {
        return purl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("purl")
    public void setPurl(String purl) {
        this.purl = purl;
    }

    public Package withPurl(String purl) {
        this.purl = purl;
        return this;
    }

    @JsonProperty("metadataType")
    public String getMetadataType() {
        return metadataType;
    }

    @JsonProperty("metadataType")
    public void setMetadataType(String metadataType) {
        this.metadataType = metadataType;
    }

    public Package withMetadataType(String metadataType) {
        this.metadataType = metadataType;
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

    public Package withMetadata(Object metadata) {
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

    public Package withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
