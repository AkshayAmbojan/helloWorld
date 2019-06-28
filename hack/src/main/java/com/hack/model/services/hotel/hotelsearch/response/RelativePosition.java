
package com.hack.model.services.hotel.hotelsearch.response;

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
    "distance",
    "unitOfMeasureCode",
    "name"
})
public class RelativePosition {

    @JsonProperty("distance")
    private String distance;
    @JsonProperty("unitOfMeasureCode")
    private String unitOfMeasureCode;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RelativePosition() {
    }

    /**
     * 
     * @param distance
     * @param name
     * @param unitOfMeasureCode
     */
    public RelativePosition(String distance, String unitOfMeasureCode, String name) {
        super();
        this.distance = distance;
        this.unitOfMeasureCode = unitOfMeasureCode;
        this.name = name;
    }

    @JsonProperty("distance")
    public String getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(String distance) {
        this.distance = distance;
    }

    @JsonProperty("unitOfMeasureCode")
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    @JsonProperty("unitOfMeasureCode")
    public void setUnitOfMeasureCode(String unitOfMeasureCode) {
        this.unitOfMeasureCode = unitOfMeasureCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
