package com.braintreepayments.api;

class BraintreeErrorInspector {
    private static final int ERROR_CODE_DUPLICATE_PAYMENT = 81724;

    BraintreeErrorInspector() {
    }

    /* access modifiers changed from: package-private */
    public boolean isDuplicatePaymentError(ErrorWithResponse errorWithResponse) {
        BraintreeError errorFor;
        BraintreeError errorFor2 = errorWithResponse.errorFor("creditCard");
        if (errorFor2 == null || (errorFor = errorFor2.errorFor("number")) == null || errorFor.getCode() != ERROR_CODE_DUPLICATE_PAYMENT) {
            return false;
        }
        return true;
    }
}
