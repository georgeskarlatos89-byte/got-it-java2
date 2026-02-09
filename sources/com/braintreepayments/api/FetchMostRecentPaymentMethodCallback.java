package com.braintreepayments.api;

public interface FetchMostRecentPaymentMethodCallback {
    void onResult(DropInResult dropInResult, Exception exc);
}
