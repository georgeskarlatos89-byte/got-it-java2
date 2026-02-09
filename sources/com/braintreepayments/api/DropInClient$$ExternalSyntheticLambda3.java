package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInClient$$ExternalSyntheticLambda3 implements AuthorizationCallback {
    public final /* synthetic */ DropInClient f$0;
    public final /* synthetic */ DropInRequest f$1;

    public /* synthetic */ DropInClient$$ExternalSyntheticLambda3(DropInClient dropInClient, DropInRequest dropInRequest) {
        this.f$0 = dropInClient;
        this.f$1 = dropInRequest;
    }

    public final void onAuthorizationResult(Authorization authorization, Exception exc) {
        this.f$0.m375lambda$launchDropIn$2$combraintreepaymentsapiDropInClient(this.f$1, authorization, exc);
    }
}
