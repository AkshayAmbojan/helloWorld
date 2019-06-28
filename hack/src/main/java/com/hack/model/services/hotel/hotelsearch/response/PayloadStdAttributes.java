
package com.hack.model.services.hotel.hotelsearch.response;

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
    "timeStamp",
    "version",
    "transactionIdentifier"
})
public class PayloadStdAttributes {

    @JsonProperty("timeStamp")
    private String timeStamp;
    @JsonProperty("version")
    private Double version;
    @JsonProperty("transactionIdentifier")
    private String transactionIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PayloadStdAttributes() {
    }

    /**
     * 
     * @param timeStamp
     * @param transactionIdentifier
     * @param version
     */
    public PayloadStdAttributes(String timeStamp, Double version, String transactionIdentifier) {
        super();
        this.timeStamp = timeStamp;
        this.version = version;
        this.transactionIdentifier = transactionIdentifier;
    }

    @JsonProperty("timeStamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    @JsonProperty("timeStamp")
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @JsonProperty("version")
    public Double getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Double version) {
        this.version = version;
    }

    @JsonProperty("transactionIdentifier")
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    @JsonProperty("transactionIdentifier")
    public void setTransactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
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
