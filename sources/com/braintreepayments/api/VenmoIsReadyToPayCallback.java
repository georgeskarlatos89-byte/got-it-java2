package com.braintreepayments.api;

public interface VenmoIsReadyToPayCallback {
    void onResult(boolean z, Exception exc);
}
