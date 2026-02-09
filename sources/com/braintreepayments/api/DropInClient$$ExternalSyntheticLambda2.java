package com.braintreepayments.api;

import androidx.fragment.app.FragmentActivity;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInClient$$ExternalSyntheticLambda2 implements AuthorizationCallback {
    public final /* synthetic */ DropInClient f$0;
    public final /* synthetic */ FragmentActivity f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ DropInClient$$ExternalSyntheticLambda2(DropInClient dropInClient, FragmentActivity fragmentActivity, int i) {
        this.f$0 = dropInClient;
        this.f$1 = fragmentActivity;
        this.f$2 = i;
    }

    public final void onAuthorizationResult(Authorization authorization, Exception exc) {
        this.f$0.m376lambda$launchDropInForResult$0$combraintreepaymentsapiDropInClient(this.f$1, this.f$2, authorization, exc);
    }
}
