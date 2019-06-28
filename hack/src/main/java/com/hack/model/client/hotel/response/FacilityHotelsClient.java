
package com.hack.model.client.hotel.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hack.model.services.hotel.hotelsearch.skyscanner.response.Hotel;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FacilityHotel"
})
public class FacilityHotelsClient {

    @JsonProperty("hotels")
    private List<Hotel> hotels;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @JsonProperty("hotels")
    public List<Hotel> getHotels() {
		return hotels;
	}
    
    @JsonProperty("hotels")
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
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
