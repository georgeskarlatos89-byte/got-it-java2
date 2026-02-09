package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BraintreeClient$$ExternalSyntheticLambda1 implements ConfigurationCallback {
    public final /* synthetic */ BraintreeClient f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Authorization f$3;
    public final /* synthetic */ HttpResponseCallback f$4;

    public /* synthetic */ BraintreeClient$$ExternalSyntheticLambda1(BraintreeClient braintreeClient, String str, String str2, Authorization authorization, HttpResponseCallback httpResponseCallback) {
        this.f$0 = braintreeClient;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = authorization;
        this.f$4 = httpResponseCallback;
    }

    public final void onResult(Configuration configuration, Exception exc) {
        BraintreeClient.m349sendPOST$lambda8$lambda7(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, configuration, exc);
    }
}
