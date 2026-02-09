package com.braintreepayments.api;

public interface ThreeDSecurePrepareLookupCallback {
    void onResult(ThreeDSecureRequest threeDSecureRequest, String str, Exception exc);
}
