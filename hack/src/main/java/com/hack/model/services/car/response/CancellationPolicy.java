
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
    "FreeCancellation",
    "FreeCancellationEndDateTime"
})
public class CancellationPolicy {

    @JsonProperty("FreeCancellation")
    private Boolean freeCancellation;
    @JsonProperty("FreeCancellationEndDateTime")
    private String freeCancellationEndDateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FreeCancellation")
    public Boolean getFreeCancellation() {
        return freeCancellation;
    }

    @JsonProperty("FreeCancellation")
    public void setFreeCancellation(Boolean freeCancellation) {
        this.freeCancellation = freeCancellation;
    }

    @JsonProperty("FreeCancellationEndDateTime")
    public String getFreeCancellationEndDateTime() {
        return freeCancellationEndDateTime;
    }

    @JsonProperty("FreeCancellationEndDateTime")
    public void setFreeCancellationEndDateTime(String freeCancellationEndDateTime) {
        this.freeCancellationEndDateTime = freeCancellationEndDateTime;
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
