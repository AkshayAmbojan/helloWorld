
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
    "AddressLine",
    "City",
    "StateProv",
    "Country",
    "PostalCode"
})
public class Address {

    @JsonProperty("AddressLine")
    private List<String> addressLine = null;
    @JsonProperty("City")
    private String city;
    @JsonProperty("StateProv")
    private StateProv stateProv;
    @JsonProperty("Country")
    private Country country;
    @JsonProperty("PostalCode")
    private String postalCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param stateProv
     * @param addressLine
     * @param postalCode
     * @param country
     * @param city
     */
    public Address(List<String> addressLine, String city, StateProv stateProv, Country country, String postalCode) {
        super();
        this.addressLine = addressLine;
        this.city = city;
        this.stateProv = stateProv;
        this.country = country;
        this.postalCode = postalCode;
    }

    @JsonProperty("AddressLine")
    public List<String> getAddressLine() {
        return addressLine;
    }

    @JsonProperty("AddressLine")
    public void setAddressLine(List<String> addressLine) {
        this.addressLine = addressLine;
    }

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("StateProv")
    public StateProv getStateProv() {
        return stateProv;
    }

    @JsonProperty("StateProv")
    public void setStateProv(StateProv stateProv) {
        this.stateProv = stateProv;
    }

    @JsonProperty("Country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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
