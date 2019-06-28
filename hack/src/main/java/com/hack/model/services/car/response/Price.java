
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
    "RatePeriodUnitPrice",
    "BasePrice",
    "TotalPrice"
})
public class Price {

    @JsonProperty("RatePeriodUnitPrice")
    private RatePeriodUnitPrice ratePeriodUnitPrice;
    @JsonProperty("BasePrice")
    private BasePrice basePrice;
    @JsonProperty("TotalPrice")
    private TotalPrice totalPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("RatePeriodUnitPrice")
    public RatePeriodUnitPrice getRatePeriodUnitPrice() {
        return ratePeriodUnitPrice;
    }

    @JsonProperty("RatePeriodUnitPrice")
    public void setRatePeriodUnitPrice(RatePeriodUnitPrice ratePeriodUnitPrice) {
        this.ratePeriodUnitPrice = ratePeriodUnitPrice;
    }

    @JsonProperty("BasePrice")
    public BasePrice getBasePrice() {
        return basePrice;
    }

    @JsonProperty("BasePrice")
    public void setBasePrice(BasePrice basePrice) {
        this.basePrice = basePrice;
    }

    @JsonProperty("TotalPrice")
    public TotalPrice getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("TotalPrice")
    public void setTotalPrice(TotalPrice totalPrice) {
        this.totalPrice = totalPrice;
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
