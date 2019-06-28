package com.hack.model.client.hotel.request;

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
"countryCode",
"fromAirportCode",
"checkInDate",
"checkOutDate",
"toAirportCode",
"numberOfPax",
"radius"
})
public class HotelSearchRQ {

@JsonProperty("countryCode")
private String countryCode;
@JsonProperty("fromAirportCode")
private String fromAirportCode;
@JsonProperty("checkInDate")
private String checkInDate;
@JsonProperty("checkOutDate")
private String checkOutDate;
@JsonProperty("toAirportCode")
private String toAirportCode;
@JsonProperty("numberOfPax")
private String numberOfPax;
@JsonProperty("currency")
private String currency;
@JsonProperty("radius")
private Integer radius;
@JsonProperty("GeoLocation")
private GeoLocation geoLocation;

@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("GeoLocation")
public GeoLocation getGeoLocation() {
return geoLocation;
}

@JsonProperty("GeoLocation")
public void setGeoLocation(GeoLocation geoLocation) {
this.geoLocation = geoLocation;
}


@JsonProperty("currency")
public String getCurrency() {
	return currency;
}
@JsonProperty("currency")
public void setCurrency(String currency) {
	this.currency = currency;
}

@JsonProperty("countryCode")
public String getCountryCode() {
return countryCode;
}

@JsonProperty("countryCode")
public void setCountryCode(String countryCode) {
this.countryCode = countryCode;
}

@JsonProperty("fromAirportCode")
public String getFromAirportCode() {
return fromAirportCode;
}

@JsonProperty("fromAirportCode")
public void setFromAirportCode(String fromAirportCode) {
this.fromAirportCode = fromAirportCode;
}

@JsonProperty("checkInDate")
public String getCheckInDate() {
return checkInDate;
}

@JsonProperty("checkInDate")
public void setCheckInDate(String checkInDate) {
this.checkInDate = checkInDate;
}

@JsonProperty("checkOutDate")
public String getCheckOutDate() {
return checkOutDate;
}

@JsonProperty("checkOutDate")
public void setCheckOutDate(String checkOutDate) {
this.checkOutDate = checkOutDate;
}

@JsonProperty("toAirportCode")
public String getToAirportCode() {
return toAirportCode;
}

@JsonProperty("toAirportCode")
public void setToAirportCode(String toAirportCode) {
this.toAirportCode = toAirportCode;
}

@JsonProperty("numberOfPax")
public String getNumberOfPax() {
return numberOfPax;
}

@JsonProperty("numberOfPax")
public void setNumberOfPax(String numberOfPax) {
this.numberOfPax = numberOfPax;
}

@JsonProperty("radius")
public Integer getRadius() {
return radius;
}

@JsonProperty("radius")
public void setRadius(Integer radius) {
this.radius = radius;
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