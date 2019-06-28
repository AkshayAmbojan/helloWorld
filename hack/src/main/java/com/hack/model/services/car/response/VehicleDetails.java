
package com.hack.model.services.car.response;

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
    "Make",
    "CarClass",
    "MinDoors",
    "MaxDoors",
    "FuelLevel",
    "CarCategory",
    "CarType",
    "TransmissionDrive",
    "FuelAC",
    "Capacity"
})
public class VehicleDetails {

    @JsonProperty("Make")
    private String make;
    @JsonProperty("CarClass")
    private String carClass;
    @JsonProperty("MinDoors")
    private Integer minDoors;
    @JsonProperty("MaxDoors")
    private Integer maxDoors;
    @JsonProperty("FuelLevel")
    private String fuelLevel;
    @JsonProperty("CarCategory")
    private CarCategory carCategory;
    @JsonProperty("CarType")
    private CarType carType;
    @JsonProperty("TransmissionDrive")
    private TransmissionDrive transmissionDrive;
    @JsonProperty("FuelAC")
    private FuelAC fuelAC;
    @JsonProperty("Capacity")
    private Capacity capacity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Make")
    public String getMake() {
        return make;
    }

    @JsonProperty("Make")
    public void setMake(String make) {
        this.make = make;
    }

    @JsonProperty("CarClass")
    public String getCarClass() {
        return carClass;
    }

    @JsonProperty("CarClass")
    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    @JsonProperty("MinDoors")
    public Integer getMinDoors() {
        return minDoors;
    }

    @JsonProperty("MinDoors")
    public void setMinDoors(Integer minDoors) {
        this.minDoors = minDoors;
    }

    @JsonProperty("MaxDoors")
    public Integer getMaxDoors() {
        return maxDoors;
    }

    @JsonProperty("MaxDoors")
    public void setMaxDoors(Integer maxDoors) {
        this.maxDoors = maxDoors;
    }

    @JsonProperty("FuelLevel")
    public String getFuelLevel() {
        return fuelLevel;
    }

    @JsonProperty("FuelLevel")
    public void setFuelLevel(String fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @JsonProperty("CarCategory")
    public CarCategory getCarCategory() {
        return carCategory;
    }

    @JsonProperty("CarCategory")
    public void setCarCategory(CarCategory carCategory) {
        this.carCategory = carCategory;
    }

    @JsonProperty("CarType")
    public CarType getCarType() {
        return carType;
    }

    @JsonProperty("CarType")
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @JsonProperty("TransmissionDrive")
    public TransmissionDrive getTransmissionDrive() {
        return transmissionDrive;
    }

    @JsonProperty("TransmissionDrive")
    public void setTransmissionDrive(TransmissionDrive transmissionDrive) {
        this.transmissionDrive = transmissionDrive;
    }

    @JsonProperty("FuelAC")
    public FuelAC getFuelAC() {
        return fuelAC;
    }

    @JsonProperty("FuelAC")
    public void setFuelAC(FuelAC fuelAC) {
        this.fuelAC = fuelAC;
    }

    @JsonProperty("Capacity")
    public Capacity getCapacity() {
        return capacity;
    }

    @JsonProperty("Capacity")
    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
