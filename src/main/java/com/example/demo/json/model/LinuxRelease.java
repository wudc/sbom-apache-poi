
package com.example.demo.json.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prettyName",
    "name",
    "id",
    "idLike",
    "version",
    "versionID",
    "versionCodename",
    "buildID",
    "imageID",
    "imageVersion",
    "variant",
    "variantID",
    "homeURL",
    "supportURL",
    "bugReportURL",
    "privacyPolicyURL",
    "cpeName",
    "supportEnd"
})
@Generated("jsonschema2pojo")
public class LinuxRelease {

    @JsonProperty("prettyName")
    private String prettyName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;
    @JsonProperty("idLike")
    @Valid
    private List<String> idLike;
    @JsonProperty("version")
    private String version;
    @JsonProperty("versionID")
    private String versionID;
    @JsonProperty("versionCodename")
    private String versionCodename;
    @JsonProperty("buildID")
    private String buildID;
    @JsonProperty("imageID")
    private String imageID;
    @JsonProperty("imageVersion")
    private String imageVersion;
    @JsonProperty("variant")
    private String variant;
    @JsonProperty("variantID")
    private String variantID;
    @JsonProperty("homeURL")
    private String homeURL;
    @JsonProperty("supportURL")
    private String supportURL;
    @JsonProperty("bugReportURL")
    private String bugReportURL;
    @JsonProperty("privacyPolicyURL")
    private String privacyPolicyURL;
    @JsonProperty("cpeName")
    private String cpeName;
    @JsonProperty("supportEnd")
    private String supportEnd;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LinuxRelease() {
    }

    /**
     * 
     * @param idLike
     * @param imageVersion
     * @param imageID
     * @param supportEnd
     * @param prettyName
     * @param supportURL
     * @param buildID
     * @param version
     * @param privacyPolicyURL
     * @param versionCodename
     * @param homeURL
     * @param bugReportURL
     * @param versionID
     * @param name
     * @param variant
     * @param cpeName
     * @param id
     * @param variantID
     */
    public LinuxRelease(String prettyName, String name, String id, List<String> idLike, String version, String versionID, String versionCodename, String buildID, String imageID, String imageVersion, String variant, String variantID, String homeURL, String supportURL, String bugReportURL, String privacyPolicyURL, String cpeName, String supportEnd) {
        super();
        this.prettyName = prettyName;
        this.name = name;
        this.id = id;
        this.idLike = idLike;
        this.version = version;
        this.versionID = versionID;
        this.versionCodename = versionCodename;
        this.buildID = buildID;
        this.imageID = imageID;
        this.imageVersion = imageVersion;
        this.variant = variant;
        this.variantID = variantID;
        this.homeURL = homeURL;
        this.supportURL = supportURL;
        this.bugReportURL = bugReportURL;
        this.privacyPolicyURL = privacyPolicyURL;
        this.cpeName = cpeName;
        this.supportEnd = supportEnd;
    }

    @JsonProperty("prettyName")
    public String getPrettyName() {
        return prettyName;
    }

    @JsonProperty("prettyName")
    public void setPrettyName(String prettyName) {
        this.prettyName = prettyName;
    }

    public LinuxRelease withPrettyName(String prettyName) {
        this.prettyName = prettyName;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public LinuxRelease withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public LinuxRelease withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("idLike")
    public List<String> getIdLike() {
        return idLike;
    }

    @JsonProperty("idLike")
    public void setIdLike(List<String> idLike) {
        this.idLike = idLike;
    }

    public LinuxRelease withIdLike(List<String> idLike) {
        this.idLike = idLike;
        return this;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public LinuxRelease withVersion(String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("versionID")
    public String getVersionID() {
        return versionID;
    }

    @JsonProperty("versionID")
    public void setVersionID(String versionID) {
        this.versionID = versionID;
    }

    public LinuxRelease withVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }

    @JsonProperty("versionCodename")
    public String getVersionCodename() {
        return versionCodename;
    }

    @JsonProperty("versionCodename")
    public void setVersionCodename(String versionCodename) {
        this.versionCodename = versionCodename;
    }

    public LinuxRelease withVersionCodename(String versionCodename) {
        this.versionCodename = versionCodename;
        return this;
    }

    @JsonProperty("buildID")
    public String getBuildID() {
        return buildID;
    }

    @JsonProperty("buildID")
    public void setBuildID(String buildID) {
        this.buildID = buildID;
    }

    public LinuxRelease withBuildID(String buildID) {
        this.buildID = buildID;
        return this;
    }

    @JsonProperty("imageID")
    public String getImageID() {
        return imageID;
    }

    @JsonProperty("imageID")
    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public LinuxRelease withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    @JsonProperty("imageVersion")
    public String getImageVersion() {
        return imageVersion;
    }

    @JsonProperty("imageVersion")
    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public LinuxRelease withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    @JsonProperty("variant")
    public String getVariant() {
        return variant;
    }

    @JsonProperty("variant")
    public void setVariant(String variant) {
        this.variant = variant;
    }

    public LinuxRelease withVariant(String variant) {
        this.variant = variant;
        return this;
    }

    @JsonProperty("variantID")
    public String getVariantID() {
        return variantID;
    }

    @JsonProperty("variantID")
    public void setVariantID(String variantID) {
        this.variantID = variantID;
    }

    public LinuxRelease withVariantID(String variantID) {
        this.variantID = variantID;
        return this;
    }

    @JsonProperty("homeURL")
    public String getHomeURL() {
        return homeURL;
    }

    @JsonProperty("homeURL")
    public void setHomeURL(String homeURL) {
        this.homeURL = homeURL;
    }

    public LinuxRelease withHomeURL(String homeURL) {
        this.homeURL = homeURL;
        return this;
    }

    @JsonProperty("supportURL")
    public String getSupportURL() {
        return supportURL;
    }

    @JsonProperty("supportURL")
    public void setSupportURL(String supportURL) {
        this.supportURL = supportURL;
    }

    public LinuxRelease withSupportURL(String supportURL) {
        this.supportURL = supportURL;
        return this;
    }

    @JsonProperty("bugReportURL")
    public String getBugReportURL() {
        return bugReportURL;
    }

    @JsonProperty("bugReportURL")
    public void setBugReportURL(String bugReportURL) {
        this.bugReportURL = bugReportURL;
    }

    public LinuxRelease withBugReportURL(String bugReportURL) {
        this.bugReportURL = bugReportURL;
        return this;
    }

    @JsonProperty("privacyPolicyURL")
    public String getPrivacyPolicyURL() {
        return privacyPolicyURL;
    }

    @JsonProperty("privacyPolicyURL")
    public void setPrivacyPolicyURL(String privacyPolicyURL) {
        this.privacyPolicyURL = privacyPolicyURL;
    }

    public LinuxRelease withPrivacyPolicyURL(String privacyPolicyURL) {
        this.privacyPolicyURL = privacyPolicyURL;
        return this;
    }

    @JsonProperty("cpeName")
    public String getCpeName() {
        return cpeName;
    }

    @JsonProperty("cpeName")
    public void setCpeName(String cpeName) {
        this.cpeName = cpeName;
    }

    public LinuxRelease withCpeName(String cpeName) {
        this.cpeName = cpeName;
        return this;
    }

    @JsonProperty("supportEnd")
    public String getSupportEnd() {
        return supportEnd;
    }

    @JsonProperty("supportEnd")
    public void setSupportEnd(String supportEnd) {
        this.supportEnd = supportEnd;
    }

    public LinuxRelease withSupportEnd(String supportEnd) {
        this.supportEnd = supportEnd;
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

    public LinuxRelease withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
