package com.braintreepayments.api;

public interface VenmoOnActivityResultCallback {
    void onResult(VenmoAccountNonce venmoAccountNonce, Exception exc);
}
