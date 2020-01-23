package com.appdynamics.dgcops.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "description",
        "name",
        "installationDir",
        "controllerCluster",
        "clusterSummaries",
        "platformServices",
        "deploymentMode",
        "numHosts",
        "numActiveJobs",
        "clusters"
})
public class Platform {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("name")
    private String name;
    @JsonProperty("installationDir")
    private String installationDir;
    @JsonProperty("controllerCluster")
    private PlatformService controllerCluster;
    @JsonProperty("clusterSummaries")
    private List<ClusterSummary> clusterSummaries = null;
    @JsonProperty("platformServices")
    private List<PlatformService> platformServices = null;
    @JsonProperty("deploymentMode")
    private Object deploymentMode;
    @JsonProperty("numHosts")
    private Integer numHosts;
    @JsonProperty("numActiveJobs")
    private Integer numActiveJobs;
    @JsonProperty("clusters")
    private List<Cluster> clusters = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("installationDir")
    public String getInstallationDir() {
        return installationDir;
    }

    @JsonProperty("installationDir")
    public void setInstallationDir(String installationDir) {
        this.installationDir = installationDir;
    }

    @JsonProperty("controllerCluster")
    public PlatformService getControllerCluster() {
        return controllerCluster;
    }

    @JsonProperty("controllerCluster")
    public void setControllerCluster(PlatformService controllerCluster) {
        this.controllerCluster = controllerCluster;
    }

    @JsonProperty("clusterSummaries")
    public List<ClusterSummary> getClusterSummaries() {
        return clusterSummaries;
    }

    @JsonProperty("clusterSummaries")
    public void setClusterSummaries(List<ClusterSummary> clusterSummaries) {
        this.clusterSummaries = clusterSummaries;
    }

    @JsonProperty("platformServices")
    public List<PlatformService> getPlatformServices() {
        return platformServices;
    }

    @JsonProperty("platformServices")
    public void setPlatformServices(List<PlatformService> platformServices) {
        this.platformServices = platformServices;
    }

    @JsonProperty("deploymentMode")
    public Object getDeploymentMode() {
        return deploymentMode;
    }

    @JsonProperty("deploymentMode")
    public void setDeploymentMode(Object deploymentMode) {
        this.deploymentMode = deploymentMode;
    }

    @JsonProperty("numHosts")
    public Integer getNumHosts() {
        return numHosts;
    }

    @JsonProperty("numHosts")
    public void setNumHosts(Integer numHosts) {
        this.numHosts = numHosts;
    }

    @JsonProperty("numActiveJobs")
    public Integer getNumActiveJobs() {
        return numActiveJobs;
    }

    @JsonProperty("numActiveJobs")
    public void setNumActiveJobs(Integer numActiveJobs) {
        this.numActiveJobs = numActiveJobs;
    }

    @JsonProperty("clusters")
    public List<Cluster> getClusters() {
        return clusters;
    }

    @JsonProperty("clusters")
    public void setClusters(List<Cluster> clusters) {
        this.clusters = clusters;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}