
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
    "distance",
    "reviews_count",
    "coordinates",
    "district",
    "amenities",
    "property_type",
    "relevance",
    "hotel_id",
    "group_id",
    "checkout_time",
    "city",
    "group_name",
    "images",
    "offers",
    "stars",
    "chain_id",
    "rating",
    "chain",
    "checkin_time",
    "name"
})
public class Hotel {

    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("reviews_count")
    private Integer reviewsCount;
    @JsonProperty("coordinates")
    private List<Double> coordinates = null;
    @JsonProperty("district")
    private String district;
    @JsonProperty("amenities")
    private List<String> amenities = null;
    @JsonProperty("property_type")
    private String propertyType;
    @JsonProperty("relevance")
    private Double relevance;
    @JsonProperty("hotel_id")
    private String hotelId;
    @JsonProperty("group_id")
    private List<String> groupId = null;
    @JsonProperty("checkout_time")
    private String checkoutTime;
    @JsonProperty("city")
    private String city;
    @JsonProperty("group_name")
    private List<String> groupName = null;
    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("offers")
    private List<Offer> offers = null; 
    @JsonProperty("stars")
    private String stars;
    @JsonProperty("chain_id")
    private String chainId;
    @JsonProperty("rating")
    private Rating rating;
    @JsonProperty("chain")
    private String chain;
    @JsonProperty("checkin_time")
    private String checkinTime;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @JsonProperty("reviews_count")
    public Integer getReviewsCount() {
        return reviewsCount;
    }

    @JsonProperty("reviews_count")
    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    @JsonProperty("coordinates")
    public List<Double> getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    @JsonProperty("district")
    public String getDistrict() {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(String district) {
        this.district = district;
    }

    @JsonProperty("amenities")
    public List<String> getAmenities() {
        return amenities;
    }

    @JsonProperty("amenities")
    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    @JsonProperty("property_type")
    public String getPropertyType() {
        return propertyType;
    }

    @JsonProperty("property_type")
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    @JsonProperty("relevance")
    public Double getRelevance() {
        return relevance;
    }

    @JsonProperty("relevance")
    public void setRelevance(Double relevance) {
        this.relevance = relevance;
    }

    @JsonProperty("hotel_id")
    public String getHotelId() {
        return hotelId;
    }

    @JsonProperty("hotel_id")
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    @JsonProperty("group_id")
    public List<String> getGroupId() {
        return groupId;
    }

    @JsonProperty("group_id")
    public void setGroupId(List<String> groupId) {
        this.groupId = groupId;
    }

    @JsonProperty("checkout_time")
    public String getCheckoutTime() {
        return checkoutTime;
    }

    @JsonProperty("checkout_time")
    public void setCheckoutTime(String checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("group_name")
    public List<String> getGroupName() {
        return groupName;
    }

    @JsonProperty("group_name")
    public void setGroupName(List<String> groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("offers")
    public List<Offer> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    @JsonProperty("stars")
    public String getStars() {
        return stars;
    }

    @JsonProperty("stars")
    public void setStars(String stars) {
        this.stars = stars;
    }

    @JsonProperty("chain_id")
    public String getChainId() {
        return chainId;
    }

    @JsonProperty("chain_id")
    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    @JsonProperty("rating")
    public Rating getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @JsonProperty("chain")
    public String getChain() {
        return chain;
    }

    @JsonProperty("chain")
    public void setChain(String chain) {
        this.chain = chain;
    }

    @JsonProperty("checkin_time")
    public String getCheckinTime() {
        return checkinTime;
    }

    @JsonProperty("checkin_time")
    public void setCheckinTime(String checkinTime) {
        this.checkinTime = checkinTime;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
