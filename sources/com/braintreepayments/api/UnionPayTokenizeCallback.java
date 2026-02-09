package com.braintreepayments.api;

public interface UnionPayTokenizeCallback {
    void onResult(CardNonce cardNonce, Exception exc);
}
