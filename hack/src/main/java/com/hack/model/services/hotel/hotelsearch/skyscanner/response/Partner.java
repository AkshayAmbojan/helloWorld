
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
    "is_dbook",
    "partner_type",
    "website_id",
    "logo",
    "is_official",
    "name"
})
public class Partner {

    @JsonProperty("is_dbook")
    private Boolean isDbook;
    @JsonProperty("partner_type")
    private String partnerType;
    @JsonProperty("website_id")
    private String websiteId;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("is_official")
    private Boolean isOfficial;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("is_dbook")
    public Boolean getIsDbook() {
        return isDbook;
    }

    @JsonProperty("is_dbook")
    public void setIsDbook(Boolean isDbook) {
        this.isDbook = isDbook;
    }

    @JsonProperty("partner_type")
    public String getPartnerType() {
        return partnerType;
    }

    @JsonProperty("partner_type")
    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    @JsonProperty("website_id")
    public String getWebsiteId() {
        return websiteId;
    }

    @JsonProperty("website_id")
    public void setWebsiteId(String websiteId) {
        this.websiteId = websiteId;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @JsonProperty("is_official")
    public Boolean getIsOfficial() {
        return isOfficial;
    }

    @JsonProperty("is_official")
    public void setIsOfficial(Boolean isOfficial) {
        this.isOfficial = isOfficial;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
