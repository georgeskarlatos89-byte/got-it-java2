package com.braintreepayments.api;

import java.util.HashMap;

class PayPalDataCollectorInternalRequest {
    private HashMap<String, String> additionalData;
    private String applicationGuid;
    private String clientMetadataId;
    private boolean disableBeacon;
    private final boolean hasUserLocationConsent;

    PayPalDataCollectorInternalRequest(boolean z) {
        this.hasUserLocationConsent = z;
    }

    /* access modifiers changed from: package-private */
    public PayPalDataCollectorInternalRequest setAdditionalData(HashMap<String, String> hashMap) {
        this.additionalData = hashMap;
        return this;
    }

    /* access modifiers changed from: package-private */
    public PayPalDataCollectorInternalRequest setApplicationGuid(String str) {
        this.applicationGuid = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public PayPalDataCollectorInternalRequest setRiskCorrelationId(String str) {
        this.clientMetadataId = str.substring(0, Math.min(str.length(), 32));
        return this;
    }

    /* access modifiers changed from: package-private */
    public PayPalDataCollectorInternalRequest setDisableBeacon(boolean z) {
        this.disableBeacon = z;
        return this;
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, String> getAdditionalData() {
        return this.additionalData;
    }

    /* access modifiers changed from: package-private */
    public String getApplicationGuid() {
        return this.applicationGuid;
    }

    /* access modifiers changed from: package-private */
    public String getClientMetadataId() {
        return this.clientMetadataId;
    }

    public boolean getHasUserLocationConsent() {
        return this.hasUserLocationConsent;
    }

    /* access modifiers changed from: package-private */
    public boolean isDisableBeacon() {
        return this.disableBeacon;
    }
}
