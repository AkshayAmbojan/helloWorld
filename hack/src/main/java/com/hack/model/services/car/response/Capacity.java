
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
    "AdultCount",
    "ChildCount",
    "SmallLuggageCount",
    "LargeLuggageCount"
})
public class Capacity {

    @JsonProperty("AdultCount")
    private Integer adultCount;
    @JsonProperty("ChildCount")
    private Integer childCount;
    @JsonProperty("SmallLuggageCount")
    private Integer smallLuggageCount;
    @JsonProperty("LargeLuggageCount")
    private Integer largeLuggageCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AdultCount")
    public Integer getAdultCount() {
        return adultCount;
    }

    @JsonProperty("AdultCount")
    public void setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
    }

    @JsonProperty("ChildCount")
    public Integer getChildCount() {
        return childCount;
    }

    @JsonProperty("ChildCount")
    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    @JsonProperty("SmallLuggageCount")
    public Integer getSmallLuggageCount() {
        return smallLuggageCount;
    }

    @JsonProperty("SmallLuggageCount")
    public void setSmallLuggageCount(Integer smallLuggageCount) {
        this.smallLuggageCount = smallLuggageCount;
    }

    @JsonProperty("LargeLuggageCount")
    public Integer getLargeLuggageCount() {
        return largeLuggageCount;
    }

    @JsonProperty("LargeLuggageCount")
    public void setLargeLuggageCount(Integer largeLuggageCount) {
        this.largeLuggageCount = largeLuggageCount;
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
