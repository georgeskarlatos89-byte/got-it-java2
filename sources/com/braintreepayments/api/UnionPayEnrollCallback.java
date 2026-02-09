package com.braintreepayments.api;

public interface UnionPayEnrollCallback {
    void onResult(UnionPayEnrollment unionPayEnrollment, Exception exc);
}
