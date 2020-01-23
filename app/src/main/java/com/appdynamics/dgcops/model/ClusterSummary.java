package com.appdynamics.dgcops.model;

import java.util.HashMap;
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
"type",
"platformId",
"version",
"createdAt",
"name",
"displayName",
"state",
"healthSummary"
})
public class ClusterSummary {

@JsonProperty("id")
private Integer id;
@JsonProperty("type")
private String type;
@JsonProperty("platformId")
private Integer platformId;
@JsonProperty("version")
private String version;
@JsonProperty("createdAt")
private Long createdAt;
@JsonProperty("name")
private String name;
@JsonProperty("displayName")
private String displayName;
@JsonProperty("state")
private String state;
@JsonProperty("healthSummary")
private String healthSummary;
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

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("platformId")
public Integer getPlatformId() {
return platformId;
}

@JsonProperty("platformId")
public void setPlatformId(Integer platformId) {
this.platformId = platformId;
}

@JsonProperty("version")
public String getVersion() {
return version;
}

@JsonProperty("version")
public void setVersion(String version) {
this.version = version;
}

@JsonProperty("createdAt")
public Long getCreatedAt() {
return createdAt;
}

@JsonProperty("createdAt")
public void setCreatedAt(Long createdAt) {
this.createdAt = createdAt;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("displayName")
public String getDisplayName() {
return displayName;
}

@JsonProperty("displayName")
public void setDisplayName(String displayName) {
this.displayName = displayName;
}

@JsonProperty("state")
public String getState() {
return state;
}

@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

@JsonProperty("healthSummary")
public String getHealthSummary() {
return healthSummary;
}

@JsonProperty("healthSummary")
public void setHealthSummary(String healthSummary) {
this.healthSummary = healthSummary;
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
