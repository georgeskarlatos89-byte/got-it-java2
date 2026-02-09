package com.braintreepayments.api;

public interface DropInListener {
    void onDropInFailure(Exception exc);

    void onDropInSuccess(DropInResult dropInResult);
}
