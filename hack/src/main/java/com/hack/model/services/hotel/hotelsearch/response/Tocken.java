
package com.hack.model.services.hotel.hotelsearch.response;

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
    "PayloadStdAttributes",
    "Result",
    "FacilityHotel",
    "version"
})
public class Tocken {

    @JsonProperty("PayloadStdAttributes")
    private PayloadStdAttributes payloadStdAttributes;
    @JsonProperty("Result")
    private Result result;
    @JsonProperty("FacilityHotel")
    private List<FacilityHotel> facilityHotel = null;
    @JsonProperty("version")
    private Double version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tocken() {
    }

    /**
     * 
     * @param result
     * @param payloadStdAttributes
     * @param facilityHotel
     * @param version
     */
    public Tocken(PayloadStdAttributes payloadStdAttributes, Result result, List<FacilityHotel> facilityHotel, Double version) {
        super();
        this.payloadStdAttributes = payloadStdAttributes;
        this.result = result;
        this.facilityHotel = facilityHotel;
        this.version = version;
    }

    @JsonProperty("PayloadStdAttributes")
    public PayloadStdAttributes getPayloadStdAttributes() {
        return payloadStdAttributes;
    }

    @JsonProperty("PayloadStdAttributes")
    public void setPayloadStdAttributes(PayloadStdAttributes payloadStdAttributes) {
        this.payloadStdAttributes = payloadStdAttributes;
    }

    @JsonProperty("Result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("Result")
    public void setResult(Result result) {
        this.result = result;
    }

    @JsonProperty("FacilityHotel")
    public List<FacilityHotel> getFacilityHotel() {
        return facilityHotel;
    }

    @JsonProperty("FacilityHotel")
    public void setFacilityHotel(List<FacilityHotel> facilityHotel) {
        this.facilityHotel = facilityHotel;
    }

    @JsonProperty("version")
    public Double getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Double version) {
        this.version = version;
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
