package com.braintreepayments.api;

import com.braintreepayments.api.PaymentMethodClient;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PaymentMethodClient$1$$ExternalSyntheticLambda0 implements HttpResponseCallback {
    public final /* synthetic */ PaymentMethodClient.AnonymousClass1 f$0;
    public final /* synthetic */ DeletePaymentMethodNonceCallback f$1;
    public final /* synthetic */ PaymentMethodNonce f$2;

    public /* synthetic */ PaymentMethodClient$1$$ExternalSyntheticLambda0(PaymentMethodClient.AnonymousClass1 r1, DeletePaymentMethodNonceCallback deletePaymentMethodNonceCallback, PaymentMethodNonce paymentMethodNonce) {
        this.f$0 = r1;
        this.f$1 = deletePaymentMethodNonceCallback;
        this.f$2 = paymentMethodNonce;
    }

    public final void onResult(String str, Exception exc) {
        this.f$0.m394lambda$onAuthorizationResult$0$combraintreepaymentsapiPaymentMethodClient$1(this.f$1, this.f$2, str, exc);
    }
}
