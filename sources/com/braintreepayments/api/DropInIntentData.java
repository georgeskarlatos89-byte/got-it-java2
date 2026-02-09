package com.braintreepayments.api;

class DropInIntentData {
    private final Authorization authorization;
    private final DropInRequest dropInRequest;
    private final String sessionId;

    DropInIntentData(DropInRequest dropInRequest2, Authorization authorization2, String str) {
        this.sessionId = str;
        this.dropInRequest = dropInRequest2;
        this.authorization = authorization2;
    }

    /* access modifiers changed from: package-private */
    public DropInRequest getDropInRequest() {
        return this.dropInRequest;
    }

    /* access modifiers changed from: package-private */
    public Authorization getAuthorization() {
        return this.authorization;
    }

    /* access modifiers changed from: package-private */
    public String getSessionId() {
        return this.sessionId;
    }
}
