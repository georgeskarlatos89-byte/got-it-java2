package com.braintreepayments.api;

public interface CardTokenizeCallback {
    void onResult(CardNonce cardNonce, Exception exc);
}
