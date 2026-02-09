package com.braintreepayments.api;

public interface PayPalDataCollectorCallback {
    void onResult(String str, Exception exc);
}
