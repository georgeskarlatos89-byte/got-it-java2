package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BraintreeClient$$ExternalSyntheticLambda8 implements ConfigurationCallback {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ BraintreeClient f$2;
    public final /* synthetic */ Authorization f$3;

    public /* synthetic */ BraintreeClient$$ExternalSyntheticLambda8(String str, String str2, BraintreeClient braintreeClient, Authorization authorization) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = braintreeClient;
        this.f$3 = authorization;
    }

    public final void onResult(Configuration configuration, Exception exc) {
        BraintreeClient.m343sendAnalyticsEvent$lambda3$lambda2(this.f$0, this.f$1, this.f$2, this.f$3, configuration, exc);
    }
}
