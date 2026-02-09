package com.braintreepayments.api;

public interface GooglePayListener {
    void onGooglePayFailure(Exception exc);

    void onGooglePaySuccess(PaymentMethodNonce paymentMethodNonce);
}
