package com.braintreepayments.api;

class PayPalResponse {
    private String approvalUrl;
    private String clientMetadataId;
    private String pairingId;
    private final PayPalRequest payPalRequest;
    private String successUrl;

    PayPalResponse(PayPalRequest payPalRequest2) {
        this.payPalRequest = payPalRequest2;
    }

    /* access modifiers changed from: package-private */
    public String getApprovalUrl() {
        return this.approvalUrl;
    }

    /* access modifiers changed from: package-private */
    public PayPalResponse approvalUrl(String str) {
        this.approvalUrl = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public String getClientMetadataId() {
        return this.clientMetadataId;
    }

    /* access modifiers changed from: package-private */
    public PayPalResponse clientMetadataId(String str) {
        this.clientMetadataId = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public String getIntent() {
        PayPalRequest payPalRequest2 = this.payPalRequest;
        if (payPalRequest2 instanceof PayPalCheckoutRequest) {
            return ((PayPalCheckoutRequest) payPalRequest2).getIntent();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String getUserAction() {
        PayPalRequest payPalRequest2 = this.payPalRequest;
        return payPalRequest2 instanceof PayPalCheckoutRequest ? ((PayPalCheckoutRequest) payPalRequest2).getUserAction() : "";
    }

    /* access modifiers changed from: package-private */
    public boolean isBillingAgreement() {
        return this.payPalRequest instanceof PayPalVaultRequest;
    }

    /* access modifiers changed from: package-private */
    public String getMerchantAccountId() {
        return this.payPalRequest.getMerchantAccountId();
    }

    /* access modifiers changed from: package-private */
    public String getPairingId() {
        return this.pairingId;
    }

    /* access modifiers changed from: package-private */
    public PayPalResponse pairingId(String str) {
        this.pairingId = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public String getSuccessUrl() {
        return this.successUrl;
    }

    /* access modifiers changed from: package-private */
    public PayPalResponse successUrl(String str) {
        this.successUrl = str;
        return this;
    }
}
