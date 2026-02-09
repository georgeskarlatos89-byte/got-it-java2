package com.braintreepayments.api;

public class ReadyForGooglePayRequest {
    private boolean existingPaymentMethodRequired;

    public void setExistingPaymentMethodRequired(boolean z) {
        this.existingPaymentMethodRequired = z;
    }

    public boolean isExistingPaymentMethodRequired() {
        return this.existingPaymentMethodRequired;
    }
}
