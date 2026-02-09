package com.braintreepayments.api;

public interface ThreeDSecureListener {
    void onThreeDSecureFailure(Exception exc);

    void onThreeDSecureSuccess(ThreeDSecureResult threeDSecureResult);
}
