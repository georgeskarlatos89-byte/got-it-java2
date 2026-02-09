package com.braintreepayments.api;

public interface PayPalListener {
    void onPayPalFailure(Exception exc);

    void onPayPalSuccess(PayPalAccountNonce payPalAccountNonce);
}
