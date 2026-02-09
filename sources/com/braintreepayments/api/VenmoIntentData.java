package com.braintreepayments.api;

class VenmoIntentData {
    private final Configuration configuration;
    private final String integrationType;
    private final String paymentContextId;
    private final String profileId;
    private final String sessionId;

    VenmoIntentData(Configuration configuration2, String str, String str2, String str3, String str4) {
        this.configuration = configuration2;
        this.profileId = str;
        this.paymentContextId = str2;
        this.sessionId = str3;
        this.integrationType = str4;
    }

    /* access modifiers changed from: package-private */
    public Configuration getConfiguration() {
        return this.configuration;
    }

    /* access modifiers changed from: package-private */
    public String getProfileId() {
        return this.profileId;
    }

    /* access modifiers changed from: package-private */
    public String getPaymentContextId() {
        return this.paymentContextId;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getIntegrationType() {
        return this.integrationType;
    }
}
