
package com.hack.model.services.car.response;

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
    "TransactionId",
    "CarCount",
    "Cars"
})
public class CarSearchResponse {

    @JsonProperty("TransactionId")
    private String transactionId;
    @JsonProperty("CarCount")
    private Integer carCount;
    @JsonProperty("Cars")
    private List<Car> cars = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TransactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("TransactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("CarCount")
    public Integer getCarCount() {
        return carCount;
    }

    @JsonProperty("CarCount")
    public void setCarCount(Integer carCount) {
        this.carCount = carCount;
    }

    @JsonProperty("Cars")
    public List<Car> getCars() {
        return cars;
    }

    @JsonProperty("Cars")
    public void setCars(List<Car> cars) {
        this.cars = cars;
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
