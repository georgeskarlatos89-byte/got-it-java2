package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BraintreeClient$$ExternalSyntheticLambda6 implements AuthorizationCallback {
    public final /* synthetic */ BraintreeClient f$0;
    public final /* synthetic */ HttpResponseCallback f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ BraintreeClient$$ExternalSyntheticLambda6(BraintreeClient braintreeClient, HttpResponseCallback httpResponseCallback, String str) {
        this.f$0 = braintreeClient;
        this.f$1 = httpResponseCallback;
        this.f$2 = str;
    }

    public final void onAuthorizationResult(Authorization authorization, Exception exc) {
        BraintreeClient.m346sendGraphQLPOST$lambda10(this.f$0, this.f$1, this.f$2, authorization, exc);
    }
}
