package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInActivity$$ExternalSyntheticLambda8 implements ConfigurationCallback {
    public final /* synthetic */ DropInActivity f$0;
    public final /* synthetic */ Authorization f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ DropInActivity$$ExternalSyntheticLambda8(DropInActivity dropInActivity, Authorization authorization, String str) {
        this.f$0 = dropInActivity;
        this.f$1 = authorization;
        this.f$2 = str;
    }

    public final void onResult(Configuration configuration, Exception exc) {
        this.f$0.m368lambda$showCardDetailsFragment$6$combraintreepaymentsapiDropInActivity(this.f$1, this.f$2, configuration, exc);
    }
}
