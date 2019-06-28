
package com.hack.model.services.hotel.hotelsearch.skyscanner.response;

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
    "partners",
    "filters",
    "price_includes",
    "map_boundary",
    "average_min_price",
    "hotels"
})
public class Results {

    @JsonProperty("partners")
    private List<Partner> partners = null;
    @JsonProperty("filters")
    private Filters filters;
    @JsonProperty("price_includes")
    private List<String> priceIncludes = null;
    @JsonProperty("map_boundary")
    private MapBoundary mapBoundary;
    @JsonProperty("average_min_price")
    private Integer averageMinPrice;
    @JsonProperty("hotels")
    private List<Hotel> hotels = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("partners")
    public List<Partner> getPartners() {
        return partners;
    }

    @JsonProperty("partners")
    public void setPartners(List<Partner> partners) {
        this.partners = partners;
    }

    @JsonProperty("filters")
    public Filters getFilters() {
        return filters;
    }

    @JsonProperty("filters")
    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    @JsonProperty("price_includes")
    public List<String> getPriceIncludes() {
        return priceIncludes;
    }

    @JsonProperty("price_includes")
    public void setPriceIncludes(List<String> priceIncludes) {
        this.priceIncludes = priceIncludes;
    }

    @JsonProperty("map_boundary")
    public MapBoundary getMapBoundary() {
        return mapBoundary;
    }

    @JsonProperty("map_boundary")
    public void setMapBoundary(MapBoundary mapBoundary) {
        this.mapBoundary = mapBoundary;
    }

    @JsonProperty("average_min_price")
    public Integer getAverageMinPrice() {
        return averageMinPrice;
    }

    @JsonProperty("average_min_price")
    public void setAverageMinPrice(Integer averageMinPrice) {
        this.averageMinPrice = averageMinPrice;
    }

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
