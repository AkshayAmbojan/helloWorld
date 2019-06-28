
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
    "Id",
    "VehicleDetails",
    "Supplier",
    "PickupDetails",
    "DropOffDetails",
    "RateDetails",
    "Price",
    "CancellationPolicy",
    "Images"
})
public class Car {

    @JsonProperty("Id")
    private String id;
    @JsonProperty("VehicleDetails")
    private VehicleDetails vehicleDetails;
    @JsonProperty("Supplier")
    private Supplier supplier;
    @JsonProperty("PickupDetails")
    private PickupDetails pickupDetails;
    @JsonProperty("DropOffDetails")
    private DropOffDetails dropOffDetails;
    @JsonProperty("RateDetails")
    private RateDetails rateDetails;
    @JsonProperty("Price")
    private Price price;
    @JsonProperty("CancellationPolicy")
    private CancellationPolicy cancellationPolicy;
    @JsonProperty("Images")
    private List<Image> images = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("VehicleDetails")
    public VehicleDetails getVehicleDetails() {
        return vehicleDetails;
    }

    @JsonProperty("VehicleDetails")
    public void setVehicleDetails(VehicleDetails vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    @JsonProperty("Supplier")
    public Supplier getSupplier() {
        return supplier;
    }

    @JsonProperty("Supplier")
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @JsonProperty("PickupDetails")
    public PickupDetails getPickupDetails() {
        return pickupDetails;
    }

    @JsonProperty("PickupDetails")
    public void setPickupDetails(PickupDetails pickupDetails) {
        this.pickupDetails = pickupDetails;
    }

    @JsonProperty("DropOffDetails")
    public DropOffDetails getDropOffDetails() {
        return dropOffDetails;
    }

    @JsonProperty("DropOffDetails")
    public void setDropOffDetails(DropOffDetails dropOffDetails) {
        this.dropOffDetails = dropOffDetails;
    }

    @JsonProperty("RateDetails")
    public RateDetails getRateDetails() {
        return rateDetails;
    }

    @JsonProperty("RateDetails")
    public void setRateDetails(RateDetails rateDetails) {
        this.rateDetails = rateDetails;
    }

    @JsonProperty("Price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("CancellationPolicy")
    public CancellationPolicy getCancellationPolicy() {
        return cancellationPolicy;
    }

    @JsonProperty("CancellationPolicy")
    public void setCancellationPolicy(CancellationPolicy cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    @JsonProperty("Images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("Images")
    public void setImages(List<Image> images) {
        this.images = images;
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
