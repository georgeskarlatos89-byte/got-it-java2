package com.braintreepayments.api;

class PaymentMethodDeleteException extends Exception {
    private final PaymentMethodNonce paymentMethodNonce;

    PaymentMethodDeleteException(PaymentMethodNonce paymentMethodNonce2, Exception exc) {
        super(exc);
        this.paymentMethodNonce = paymentMethodNonce2;
    }

    /* access modifiers changed from: package-private */
    public PaymentMethodNonce getPaymentMethodNonce() {
        return this.paymentMethodNonce;
    }
}
