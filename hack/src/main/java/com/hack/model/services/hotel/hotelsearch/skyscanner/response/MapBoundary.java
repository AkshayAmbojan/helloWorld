
package com.hack.model.services.hotel.hotelsearch.skyscanner.response;

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
    "n_e_lng",
    "n_e_lat",
    "s_w_lat",
    "s_w_lng"
})
public class MapBoundary {

    @JsonProperty("n_e_lng")
    private Double nELng;
    @JsonProperty("n_e_lat")
    private Double nELat;
    @JsonProperty("s_w_lat")
    private Double sWLat;
    @JsonProperty("s_w_lng")
    private Double sWLng;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("n_e_lng")
    public Double getNELng() {
        return nELng;
    }

    @JsonProperty("n_e_lng")
    public void setNELng(Double nELng) {
        this.nELng = nELng;
    }

    @JsonProperty("n_e_lat")
    public Double getNELat() {
        return nELat;
    }

    @JsonProperty("n_e_lat")
    public void setNELat(Double nELat) {
        this.nELat = nELat;
    }

    @JsonProperty("s_w_lat")
    public Double getSWLat() {
        return sWLat;
    }

    @JsonProperty("s_w_lat")
    public void setSWLat(Double sWLat) {
        this.sWLat = sWLat;
    }

    @JsonProperty("s_w_lng")
    public Double getSWLng() {
        return sWLng;
    }

    @JsonProperty("s_w_lng")
    public void setSWLng(Double sWLng) {
        this.sWLng = sWLng;
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
