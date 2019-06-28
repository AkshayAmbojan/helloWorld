
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
    "Location",
    "Distance"
})
public class DropOffDetails {

    @JsonProperty("DateTime")
    private String dateTime;
    @JsonProperty("Location")
    private Location_ location;
    @JsonProperty("Distance")
    private Distance_ distance;
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

    @JsonProperty("Location")
    public Location_ getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(Location_ location) {
        this.location = location;
    }

    @JsonProperty("Distance")
    public Distance_ getDistance() {
        return distance;
    }

    @JsonProperty("Distance")
    public void setDistance(Distance_ distance) {
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
