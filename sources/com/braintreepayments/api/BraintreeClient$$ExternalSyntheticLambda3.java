package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BraintreeClient$$ExternalSyntheticLambda3 implements AuthorizationCallback {
    public final /* synthetic */ BraintreeClient f$0;
    public final /* synthetic */ ConfigurationCallback f$1;

    public /* synthetic */ BraintreeClient$$ExternalSyntheticLambda3(BraintreeClient braintreeClient, ConfigurationCallback configurationCallback) {
        this.f$0 = braintreeClient;
        this.f$1 = configurationCallback;
    }

    public final void onAuthorizationResult(Authorization authorization, Exception exc) {
        BraintreeClient.m339getConfiguration$lambda1(this.f$0, this.f$1, authorization, exc);
    }
}
