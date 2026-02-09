package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PaymentMethodClient$$ExternalSyntheticLambda0 implements HttpResponseCallback {
    public final /* synthetic */ PaymentMethodClient f$0;
    public final /* synthetic */ GetPaymentMethodNoncesCallback f$1;

    public /* synthetic */ PaymentMethodClient$$ExternalSyntheticLambda0(PaymentMethodClient paymentMethodClient, GetPaymentMethodNoncesCallback getPaymentMethodNoncesCallback) {
        this.f$0 = paymentMethodClient;
        this.f$1 = getPaymentMethodNoncesCallback;
    }

    public final void onResult(String str, Exception exc) {
        this.f$0.m393lambda$getPaymentMethodNonces$0$combraintreepaymentsapiPaymentMethodClient(this.f$1, str, exc);
    }
}
