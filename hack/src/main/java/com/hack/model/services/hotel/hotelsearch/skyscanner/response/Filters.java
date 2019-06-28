
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
    "cancellation",
    "stars",
    "meal_plan",
    "guest_rating",
    "district",
    "chain",
    "amenities",
    "property_type",
    "city",
    "price_buckets",
    "guest_type"
})
public class Filters {

    @JsonProperty("cancellation")
    private List<Cancellation> cancellation = null;
    @JsonProperty("stars")
    private List<Star> stars = null;
    @JsonProperty("meal_plan")
    private List<MealPlan> mealPlan = null;
    @JsonProperty("guest_rating")
    private List<GuestRating> guestRating = null;
    @JsonProperty("district")
    private List<District> district = null;
    @JsonProperty("chain")
    private List<Chain> chain = null;
    @JsonProperty("amenities")
    private List<Amenity> amenities = null;
    @JsonProperty("property_type")
    private List<PropertyType> propertyType = null;
    @JsonProperty("city")
    private List<City> city = null;
    @JsonProperty("price_buckets")
    private List<PriceBucket> priceBuckets = null;
    @JsonProperty("guest_type")
    private List<GuestType> guestType = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cancellation")
    public List<Cancellation> getCancellation() {
        return cancellation;
    }

    @JsonProperty("cancellation")
    public void setCancellation(List<Cancellation> cancellation) {
        this.cancellation = cancellation;
    }

    @JsonProperty("stars")
    public List<Star> getStars() {
        return stars;
    }

    @JsonProperty("stars")
    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    @JsonProperty("meal_plan")
    public List<MealPlan> getMealPlan() {
        return mealPlan;
    }

    @JsonProperty("meal_plan")
    public void setMealPlan(List<MealPlan> mealPlan) {
        this.mealPlan = mealPlan;
    }

    @JsonProperty("guest_rating")
    public List<GuestRating> getGuestRating() {
        return guestRating;
    }

    @JsonProperty("guest_rating")
    public void setGuestRating(List<GuestRating> guestRating) {
        this.guestRating = guestRating;
    }

    @JsonProperty("district")
    public List<District> getDistrict() {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(List<District> district) {
        this.district = district;
    }

    @JsonProperty("chain")
    public List<Chain> getChain() {
        return chain;
    }

    @JsonProperty("chain")
    public void setChain(List<Chain> chain) {
        this.chain = chain;
    }

    @JsonProperty("amenities")
    public List<Amenity> getAmenities() {
        return amenities;
    }

    @JsonProperty("amenities")
    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }

    @JsonProperty("property_type")
    public List<PropertyType> getPropertyType() {
        return propertyType;
    }

    @JsonProperty("property_type")
    public void setPropertyType(List<PropertyType> propertyType) {
        this.propertyType = propertyType;
    }

    @JsonProperty("city")
    public List<City> getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(List<City> city) {
        this.city = city;
    }

    @JsonProperty("price_buckets")
    public List<PriceBucket> getPriceBuckets() {
        return priceBuckets;
    }

    @JsonProperty("price_buckets")
    public void setPriceBuckets(List<PriceBucket> priceBuckets) {
        this.priceBuckets = priceBuckets;
    }

    @JsonProperty("guest_type")
    public List<GuestType> getGuestType() {
        return guestType;
    }

    @JsonProperty("guest_type")
    public void setGuestType(List<GuestType> guestType) {
        this.guestType = guestType;
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
