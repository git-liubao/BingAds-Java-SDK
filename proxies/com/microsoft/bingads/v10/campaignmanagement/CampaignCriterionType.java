package com.microsoft.bingads.v10.campaignmanagement;

/**
 * Enum class for CampaignCriterionType.
 */
public enum CampaignCriterionType {

    PRODUCT_SCOPE("ProductScope"),
    WEBPAGE("Webpage");
        
    private final String value;

    CampaignCriterionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignCriterionType fromValue(String v) {
        for (CampaignCriterionType c : CampaignCriterionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}