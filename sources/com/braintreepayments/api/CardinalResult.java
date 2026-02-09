package com.braintreepayments.api;

import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;

class CardinalResult {
    private final Exception error;
    private final String jwt;
    private final ThreeDSecureResult threeDSecureResult;
    private final ValidateResponse validateResponse;

    CardinalResult(ThreeDSecureResult threeDSecureResult2, String str, ValidateResponse validateResponse2) {
        this.jwt = str;
        this.validateResponse = validateResponse2;
        this.threeDSecureResult = threeDSecureResult2;
        this.error = null;
    }

    CardinalResult(Exception exc) {
        this.error = exc;
        this.jwt = null;
        this.validateResponse = null;
        this.threeDSecureResult = null;
    }

    /* access modifiers changed from: package-private */
    public Exception getError() {
        return this.error;
    }

    /* access modifiers changed from: package-private */
    public ThreeDSecureResult getThreeSecureResult() {
        return this.threeDSecureResult;
    }

    /* access modifiers changed from: package-private */
    public ValidateResponse getValidateResponse() {
        return this.validateResponse;
    }

    /* access modifiers changed from: package-private */
    public String getJWT() {
        return this.jwt;
    }
}
