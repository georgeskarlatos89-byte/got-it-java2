package com.braintreepayments.api;

public interface DeletePaymentMethodNonceCallback {
    void onResult(PaymentMethodNonce paymentMethodNonce, Exception exc);
}
