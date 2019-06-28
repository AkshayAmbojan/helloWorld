
package com.hack.model.services.car.response;

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
    "DateTime",
    "ShuttleCategory",
    "Location",
    "Distance"
})
public class PickupDetails {

    @JsonProperty("DateTime")
    private String dateTime;
    @JsonProperty("ShuttleCategory")
    private String shuttleCategory;
    @JsonProperty("Location")
    private Location location;
    @JsonProperty("Distance")
    private Distance distance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("ShuttleCategory")
    public String getShuttleCategory() {
        return shuttleCategory;
    }

    @JsonProperty("ShuttleCategory")
    public void setShuttleCategory(String shuttleCategory) {
        this.shuttleCategory = shuttleCategory;
    }

    @JsonProperty("Location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("Distance")
    public Distance getDistance() {
        return distance;
    }

    @JsonProperty("Distance")
    public void setDistance(Distance distance) {
        this.distance = distance;
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
