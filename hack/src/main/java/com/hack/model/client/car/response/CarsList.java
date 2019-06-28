package com.hack.model.client.car.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hack.model.services.car.response.Car;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Cars"
})
public class CarsList {

@JsonProperty("Cars")
private List<Car> cars = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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