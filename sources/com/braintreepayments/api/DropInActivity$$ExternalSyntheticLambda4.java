package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInActivity$$ExternalSyntheticLambda4 implements DataCollectorCallback {
    public final /* synthetic */ DropInActivity f$0;
    public final /* synthetic */ DropInResult f$1;

    public /* synthetic */ DropInActivity$$ExternalSyntheticLambda4(DropInActivity dropInActivity, DropInResult dropInResult) {
        this.f$0 = dropInActivity;
        this.f$1 = dropInResult;
    }

    public final void onResult(String str, Exception exc) {
        this.f$0.m360lambda$onPaymentMethodNonceCreated$17$combraintreepaymentsapiDropInActivity(this.f$1, str, exc);
    }
}
