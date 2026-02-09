package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BraintreeClient$$ExternalSyntheticLambda7 implements ConfigurationCallback {
    public final /* synthetic */ BraintreeClient f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Authorization f$2;
    public final /* synthetic */ HttpResponseCallback f$3;

    public /* synthetic */ BraintreeClient$$ExternalSyntheticLambda7(BraintreeClient braintreeClient, String str, Authorization authorization, HttpResponseCallback httpResponseCallback) {
        this.f$0 = braintreeClient;
        this.f$1 = str;
        this.f$2 = authorization;
        this.f$3 = httpResponseCallback;
    }

    public final void onResult(Configuration configuration, Exception exc) {
        BraintreeClient.m347sendGraphQLPOST$lambda10$lambda9(this.f$0, this.f$1, this.f$2, this.f$3, configuration, exc);
    }
}
