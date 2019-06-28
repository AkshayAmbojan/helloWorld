
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
    "Errors",
    "Warnings",
    "Status"
})
public class Result {

    @JsonProperty("Errors")
    private List<Object> errors = null;
    @JsonProperty("Warnings")
    private List<Warning> warnings = null;
    @JsonProperty("Status")
    private Status status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param errors
     * @param status
     * @param warnings
     */
    public Result(List<Object> errors, List<Warning> warnings, Status status) {
        super();
        this.errors = errors;
        this.warnings = warnings;
        this.status = status;
    }

    @JsonProperty("Errors")
    public List<Object> getErrors() {
        return errors;
    }

    @JsonProperty("Errors")
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    @JsonProperty("Warnings")
    public List<Warning> getWarnings() {
        return warnings;
    }

    @JsonProperty("Warnings")
    public void setWarnings(List<Warning> warnings) {
        this.warnings = warnings;
    }

    @JsonProperty("Status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Status status) {
        this.status = status;
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
