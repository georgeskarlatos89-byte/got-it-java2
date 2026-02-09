package com.braintreepayments.api;

interface PayPalInternalClientCallback {
    void onResult(PayPalResponse payPalResponse, Exception exc);
}
