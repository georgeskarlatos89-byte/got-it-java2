package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BraintreeClient$$ExternalSyntheticLambda2 implements AuthorizationCallback {
    public final /* synthetic */ BraintreeClient f$0;
    public final /* synthetic */ HttpResponseCallback f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ BraintreeClient$$ExternalSyntheticLambda2(BraintreeClient braintreeClient, HttpResponseCallback httpResponseCallback, String str, String str2) {
        this.f$0 = braintreeClient;
        this.f$1 = httpResponseCallback;
        this.f$2 = str;
        this.f$3 = str2;
    }

    public final void onAuthorizationResult(Authorization authorization, Exception exc) {
        BraintreeClient.m348sendPOST$lambda8(this.f$0, this.f$1, this.f$2, this.f$3, authorization, exc);
    }
}
