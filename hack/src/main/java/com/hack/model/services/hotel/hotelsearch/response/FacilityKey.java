
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
    "FacilityCode",
    "ChainCode",
    "BrandCode"
})
public class FacilityKey {

    @JsonProperty("FacilityCode")
    private String facilityCode;
    @JsonProperty("ChainCode")
    private String chainCode;
    @JsonProperty("BrandCode")
    private String brandCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FacilityKey() {
    }

    /**
     * 
     * @param facilityCode
     * @param brandCode
     * @param chainCode
     */
    public FacilityKey(String facilityCode, String chainCode, String brandCode) {
        super();
        this.facilityCode = facilityCode;
        this.chainCode = chainCode;
        this.brandCode = brandCode;
    }

    @JsonProperty("FacilityCode")
    public String getFacilityCode() {
        return facilityCode;
    }

    @JsonProperty("FacilityCode")
    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    @JsonProperty("ChainCode")
    public String getChainCode() {
        return chainCode;
    }

    @JsonProperty("ChainCode")
    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
    }

    @JsonProperty("BrandCode")
    public String getBrandCode() {
        return brandCode;
    }

    @JsonProperty("BrandCode")
    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
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
