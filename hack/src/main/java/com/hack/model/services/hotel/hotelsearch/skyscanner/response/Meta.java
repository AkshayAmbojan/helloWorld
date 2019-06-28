
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
    "sorting_status",
    "status",
    "search_id",
    "total",
    "completion_percentage",
    "total_available",
    "hotels_filtered",
    "offers",
    "total_available_filtered",
    "request_id"
})
public class Meta {

    @JsonProperty("sorting_status")
    private String sortingStatus;
    @JsonProperty("status")
    private String status;
    @JsonProperty("search_id")
    private String searchId;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("completion_percentage")
    private Integer completionPercentage;
    @JsonProperty("total_available")
    private Integer totalAvailable;
    @JsonProperty("hotels_filtered")
    private Integer hotelsFiltered;
    @JsonProperty("offers")
    private Integer offers;
    @JsonProperty("total_available_filtered")
    private Integer totalAvailableFiltered;
    @JsonProperty("request_id")
    private String requestId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sorting_status")
    public String getSortingStatus() {
        return sortingStatus;
    }

    @JsonProperty("sorting_status")
    public void setSortingStatus(String sortingStatus) {
        this.sortingStatus = sortingStatus;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("search_id")
    public String getSearchId() {
        return searchId;
    }

    @JsonProperty("search_id")
    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("completion_percentage")
    public Integer getCompletionPercentage() {
        return completionPercentage;
    }

    @JsonProperty("completion_percentage")
    public void setCompletionPercentage(Integer completionPercentage) {
        this.completionPercentage = completionPercentage;
    }

    @JsonProperty("total_available")
    public Integer getTotalAvailable() {
        return totalAvailable;
    }

    @JsonProperty("total_available")
    public void setTotalAvailable(Integer totalAvailable) {
        this.totalAvailable = totalAvailable;
    }

    @JsonProperty("hotels_filtered")
    public Integer getHotelsFiltered() {
        return hotelsFiltered;
    }

    @JsonProperty("hotels_filtered")
    public void setHotelsFiltered(Integer hotelsFiltered) {
        this.hotelsFiltered = hotelsFiltered;
    }

    @JsonProperty("offers")
    public Integer getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(Integer offers) {
        this.offers = offers;
    }

    @JsonProperty("total_available_filtered")
    public Integer getTotalAvailableFiltered() {
        return totalAvailableFiltered;
    }

    @JsonProperty("total_available_filtered")
    public void setTotalAvailableFiltered(Integer totalAvailableFiltered) {
        this.totalAvailableFiltered = totalAvailableFiltered;
    }

    @JsonProperty("request_id")
    public String getRequestId() {
        return requestId;
    }

    @JsonProperty("request_id")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
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
