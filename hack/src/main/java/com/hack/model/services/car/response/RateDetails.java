
package com.hack.model.services.car.response;

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
    "RatePeriod",
    "RateCode",
    "PrePay",
    "CreditCardRequired",
    "Mileages"
})
public class RateDetails {

    @JsonProperty("RatePeriod")
    private String ratePeriod;
    @JsonProperty("RateCode")
    private String rateCode;
    @JsonProperty("PrePay")
    private Boolean prePay;
    @JsonProperty("CreditCardRequired")
    private Boolean creditCardRequired;
    @JsonProperty("Mileages")
    private List<Mileage> mileages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("RatePeriod")
    public String getRatePeriod() {
        return ratePeriod;
    }

    @JsonProperty("RatePeriod")
    public void setRatePeriod(String ratePeriod) {
        this.ratePeriod = ratePeriod;
    }

    @JsonProperty("RateCode")
    public String getRateCode() {
        return rateCode;
    }

    @JsonProperty("RateCode")
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    @JsonProperty("PrePay")
    public Boolean getPrePay() {
        return prePay;
    }

    @JsonProperty("PrePay")
    public void setPrePay(Boolean prePay) {
        this.prePay = prePay;
    }

    @JsonProperty("CreditCardRequired")
    public Boolean getCreditCardRequired() {
        return creditCardRequired;
    }

    @JsonProperty("CreditCardRequired")
    public void setCreditCardRequired(Boolean creditCardRequired) {
        this.creditCardRequired = creditCardRequired;
    }

    @JsonProperty("Mileages")
    public List<Mileage> getMileages() {
        return mileages;
    }

    @JsonProperty("Mileages")
    public void setMileages(List<Mileage> mileages) {
        this.mileages = mileages;
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
