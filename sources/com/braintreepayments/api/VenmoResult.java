package com.braintreepayments.api;

class VenmoResult {
    private final Exception error;
    private final String paymentContextId;
    private final String venmoAccountNonce;
    private final String venmoUsername;

    VenmoResult(String str, String str2, String str3, Exception exc) {
        this.paymentContextId = str;
        this.venmoAccountNonce = str2;
        this.venmoUsername = str3;
        this.error = exc;
    }

    /* access modifiers changed from: package-private */
    public Exception getError() {
        return this.error;
    }

    /* access modifiers changed from: package-private */
    public String getPaymentContextId() {
        return this.paymentContextId;
    }

    /* access modifiers changed from: package-private */
    public String getVenmoAccountNonce() {
        return this.venmoAccountNonce;
    }

    /* access modifiers changed from: package-private */
    public String getVenmoUsername() {
        return this.venmoUsername;
    }
}
