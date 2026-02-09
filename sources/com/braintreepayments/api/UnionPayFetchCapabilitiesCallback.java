package com.braintreepayments.api;

public interface UnionPayFetchCapabilitiesCallback {
    void onResult(UnionPayCapabilities unionPayCapabilities, Exception exc);
}
