
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
    "FreeDistance",
    "FreeDistanceRatePeriod"
})
public class Mileage {

    @JsonProperty("FreeDistance")
    private FreeDistance freeDistance;
    @JsonProperty("FreeDistanceRatePeriod")
    private String freeDistanceRatePeriod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FreeDistance")
    public FreeDistance getFreeDistance() {
        return freeDistance;
    }

    @JsonProperty("FreeDistance")
    public void setFreeDistance(FreeDistance freeDistance) {
        this.freeDistance = freeDistance;
    }

    @JsonProperty("FreeDistanceRatePeriod")
    public String getFreeDistanceRatePeriod() {
        return freeDistanceRatePeriod;
    }

    @JsonProperty("FreeDistanceRatePeriod")
    public void setFreeDistanceRatePeriod(String freeDistanceRatePeriod) {
        this.freeDistanceRatePeriod = freeDistanceRatePeriod;
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
