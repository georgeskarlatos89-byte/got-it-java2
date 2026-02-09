package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInActivity$$ExternalSyntheticLambda1 implements AuthorizationCallback {
    public final /* synthetic */ DropInActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ DropInActivity$$ExternalSyntheticLambda1(DropInActivity dropInActivity, String str) {
        this.f$0 = dropInActivity;
        this.f$1 = str;
    }

    public final void onAuthorizationResult(Authorization authorization, Exception exc) {
        this.f$0.m369lambda$showCardDetailsFragment$7$combraintreepaymentsapiDropInActivity(this.f$1, authorization, exc);
    }
}
