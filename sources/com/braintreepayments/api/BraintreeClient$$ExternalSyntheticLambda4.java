package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BraintreeClient$$ExternalSyntheticLambda4 implements ConfigurationCallback {
    public final /* synthetic */ BraintreeClient f$0;
    public final /* synthetic */ Authorization f$1;

    public /* synthetic */ BraintreeClient$$ExternalSyntheticLambda4(BraintreeClient braintreeClient, Authorization authorization) {
        this.f$0 = braintreeClient;
        this.f$1 = authorization;
    }

    public final void onResult(Configuration configuration, Exception exc) {
        BraintreeClient.m341reportCrash$lambda12$lambda11(this.f$0, this.f$1, configuration, exc);
    }
}
