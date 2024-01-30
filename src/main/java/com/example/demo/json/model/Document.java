
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
    "artifacts",
    "artifactRelationships",
    "files",
    "secrets",
    "source",
    "distro",
    "descriptor",
    "schema"
})
@Generated("jsonschema2pojo")
public class Document {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("artifacts")
    @Valid
    @NotNull
    private List<Package> artifacts;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("artifactRelationships")
    @Valid
    @NotNull
    private List<Relationship> artifactRelationships;
    @JsonProperty("files")
    @Valid
    private List<File> files;
    @JsonProperty("secrets")
    @Valid
    private List<Secrets> secrets;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("source")
    @Valid
    @NotNull
    private Source source;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("distro")
    @Valid
    @NotNull
    private LinuxRelease distro;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("descriptor")
    @Valid
    @NotNull
    private Descriptor descriptor;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("schema")
    @Valid
    @NotNull
    private Schema schema;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Document() {
    }

    /**
     * 
     * @param schema
     * @param distro
     * @param files
     * @param source
     * @param descriptor
     * @param secrets
     * @param artifactRelationships
     * @param artifacts
     */
    public Document(List<Package> artifacts, List<Relationship> artifactRelationships, List<File> files, List<Secrets> secrets, Source source, LinuxRelease distro, Descriptor descriptor, Schema schema) {
        super();
        this.artifacts = artifacts;
        this.artifactRelationships = artifactRelationships;
        this.files = files;
        this.secrets = secrets;
        this.source = source;
        this.distro = distro;
        this.descriptor = descriptor;
        this.schema = schema;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("artifacts")
    public List<Package> getArtifacts() {
        return artifacts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("artifacts")
    public void setArtifacts(List<Package> artifacts) {
        this.artifacts = artifacts;
    }

    public Document withArtifacts(List<Package> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("artifactRelationships")
    public List<Relationship> getArtifactRelationships() {
        return artifactRelationships;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("artifactRelationships")
    public void setArtifactRelationships(List<Relationship> artifactRelationships) {
        this.artifactRelationships = artifactRelationships;
    }

    public Document withArtifactRelationships(List<Relationship> artifactRelationships) {
        this.artifactRelationships = artifactRelationships;
        return this;
    }

    @JsonProperty("files")
    public List<File> getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Document withFiles(List<File> files) {
        this.files = files;
        return this;
    }

    @JsonProperty("secrets")
    public List<Secrets> getSecrets() {
        return secrets;
    }

    @JsonProperty("secrets")
    public void setSecrets(List<Secrets> secrets) {
        this.secrets = secrets;
    }

    public Document withSecrets(List<Secrets> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    public Document withSource(Source source) {
        this.source = source;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("distro")
    public LinuxRelease getDistro() {
        return distro;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("distro")
    public void setDistro(LinuxRelease distro) {
        this.distro = distro;
    }

    public Document withDistro(LinuxRelease distro) {
        this.distro = distro;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("descriptor")
    public Descriptor getDescriptor() {
        return descriptor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("descriptor")
    public void setDescriptor(Descriptor descriptor) {
        this.descriptor = descriptor;
    }

    public Document withDescriptor(Descriptor descriptor) {
        this.descriptor = descriptor;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("schema")
    public Schema getSchema() {
        return schema;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("schema")
    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    public Document withSchema(Schema schema) {
        this.schema = schema;
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

    public Document withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
