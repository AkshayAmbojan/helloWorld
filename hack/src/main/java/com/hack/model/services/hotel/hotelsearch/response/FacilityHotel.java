
package com.hack.model.services.hotel.hotelsearch.response;

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
    "Location",
    "Telephone",
    "RelativePosition",
    "name",
    "FacilityKey"
})
public class FacilityHotel {

    @JsonProperty("Location")
    private Location location;
    @JsonProperty("Telephone")
    private List<Telephone> telephone = null;
    @JsonProperty("RelativePosition")
    private RelativePosition relativePosition;
    @JsonProperty("name")
    private String name;
    @JsonProperty("FacilityKey")
    private FacilityKey facilityKey;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FacilityHotel() {
    }

    /**
     * 
     * @param facilityKey
     * @param relativePosition
     * @param location
     * @param name
     * @param telephone
     */
    public FacilityHotel(Location location, List<Telephone> telephone, RelativePosition relativePosition, String name, FacilityKey facilityKey) {
        super();
        this.location = location;
        this.telephone = telephone;
        this.relativePosition = relativePosition;
        this.name = name;
        this.facilityKey = facilityKey;
    }

    @JsonProperty("Location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("Telephone")
    public List<Telephone> getTelephone() {
        return telephone;
    }

    @JsonProperty("Telephone")
    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }

    @JsonProperty("RelativePosition")
    public RelativePosition getRelativePosition() {
        return relativePosition;
    }

    @JsonProperty("RelativePosition")
    public void setRelativePosition(RelativePosition relativePosition) {
        this.relativePosition = relativePosition;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("FacilityKey")
    public FacilityKey getFacilityKey() {
        return facilityKey;
    }

    @JsonProperty("FacilityKey")
    public void setFacilityKey(FacilityKey facilityKey) {
        this.facilityKey = facilityKey;
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
