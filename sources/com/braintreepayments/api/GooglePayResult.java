package com.braintreepayments.api;

import com.google.android.gms.wallet.PaymentData;

class GooglePayResult {
    private final Exception error;
    private final PaymentData paymentData;

    GooglePayResult(PaymentData paymentData2, Exception exc) {
        this.paymentData = paymentData2;
        this.error = exc;
    }

    public PaymentData getPaymentData() {
        return this.paymentData;
    }

    public Exception getError() {
        return this.error;
    }
}
