package com.braintreepayments.api;

import com.google.android.gms.wallet.PaymentDataRequest;

class GooglePayIntentData {
    private final int googlePayEnvironment;
    private final PaymentDataRequest paymentDataRequest;

    GooglePayIntentData(int i, PaymentDataRequest paymentDataRequest2) {
        this.googlePayEnvironment = i;
        this.paymentDataRequest = paymentDataRequest2;
    }

    public int getGooglePayEnvironment() {
        return this.googlePayEnvironment;
    }

    public PaymentDataRequest getPaymentDataRequest() {
        return this.paymentDataRequest;
    }
}
