
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
    "dbook_link",
    "cancellation",
    "closed_user_groups",
    "cancellation_text",
    "meal_plan",
    "price_gbp",
    "available",
    "price",
    "deeplink",
    "room_type",
    "strike_through",
    "is_official",
    "partner_id"
})
public class Offer {

    @JsonProperty("dbook_link")
    private Object dbookLink;
    @JsonProperty("cancellation")
    private String cancellation;
    @JsonProperty("closed_user_groups")
    private Object closedUserGroups;
    @JsonProperty("cancellation_text")
    private String cancellationText;
    @JsonProperty("meal_plan")
    private String mealPlan;
    @JsonProperty("price_gbp")
    private Integer priceGbp;
    @JsonProperty("available")
    private Object available;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("deeplink")
    private String deeplink;
    @JsonProperty("room_type")
    private List<String> roomType = null;
    @JsonProperty("strike_through")
    private Object strikeThrough;
    @JsonProperty("is_official")
    private Boolean isOfficial;
    @JsonProperty("partner_id")
    private String partnerId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dbook_link")
    public Object getDbookLink() {
        return dbookLink;
    }

    @JsonProperty("dbook_link")
    public void setDbookLink(Object dbookLink) {
        this.dbookLink = dbookLink;
    }

    @JsonProperty("cancellation")
    public String getCancellation() {
        return cancellation;
    }

    @JsonProperty("cancellation")
    public void setCancellation(String cancellation) {
        this.cancellation = cancellation;
    }

    @JsonProperty("closed_user_groups")
    public Object getClosedUserGroups() {
        return closedUserGroups;
    }

    @JsonProperty("closed_user_groups")
    public void setClosedUserGroups(Object closedUserGroups) {
        this.closedUserGroups = closedUserGroups;
    }

    @JsonProperty("cancellation_text")
    public String getCancellationText() {
        return cancellationText;
    }

    @JsonProperty("cancellation_text")
    public void setCancellationText(String cancellationText) {
        this.cancellationText = cancellationText;
    }

    @JsonProperty("meal_plan")
    public String getMealPlan() {
        return mealPlan;
    }

    @JsonProperty("meal_plan")
    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    @JsonProperty("price_gbp")
    public Integer getPriceGbp() {
        return priceGbp;
    }

    @JsonProperty("price_gbp")
    public void setPriceGbp(Integer priceGbp) {
        this.priceGbp = priceGbp;
    }

    @JsonProperty("available")
    public Object getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Object available) {
        this.available = available;
    }

    @JsonProperty("price")
    public Integer getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    @JsonProperty("deeplink")
    public String getDeeplink() {
        return deeplink;
    }

    @JsonProperty("deeplink")
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    @JsonProperty("room_type")
    public List<String> getRoomType() {
        return roomType;
    }

    @JsonProperty("room_type")
    public void setRoomType(List<String> roomType) {
        this.roomType = roomType;
    }

    @JsonProperty("strike_through")
    public Object getStrikeThrough() {
        return strikeThrough;
    }

    @JsonProperty("strike_through")
    public void setStrikeThrough(Object strikeThrough) {
        this.strikeThrough = strikeThrough;
    }

    @JsonProperty("is_official")
    public Boolean getIsOfficial() {
        return isOfficial;
    }

    @JsonProperty("is_official")
    public void setIsOfficial(Boolean isOfficial) {
        this.isOfficial = isOfficial;
    }

    @JsonProperty("partner_id")
    public String getPartnerId() {
        return partnerId;
    }

    @JsonProperty("partner_id")
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
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
