package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BraintreeClient$$ExternalSyntheticLambda10 implements AuthorizationCallback {
    public final /* synthetic */ BraintreeClient f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ BraintreeClient$$ExternalSyntheticLambda10(BraintreeClient braintreeClient, String str, String str2) {
        this.f$0 = braintreeClient;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final void onAuthorizationResult(Authorization authorization, Exception exc) {
        BraintreeClient.m342sendAnalyticsEvent$lambda3(this.f$0, this.f$1, this.f$2, authorization, exc);
    }
}
