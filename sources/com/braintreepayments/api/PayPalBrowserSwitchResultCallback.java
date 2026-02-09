package com.braintreepayments.api;

public interface PayPalBrowserSwitchResultCallback {
    void onResult(PayPalAccountNonce payPalAccountNonce, Exception exc);
}
