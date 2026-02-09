package com.braintreepayments.api;

import androidx.fragment.app.FragmentActivity;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda5 implements VenmoOnActivityResultCallback {
    public final /* synthetic */ DropInInternalClient f$0;
    public final /* synthetic */ FragmentActivity f$1;
    public final /* synthetic */ DropInResultCallback f$2;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda5(DropInInternalClient dropInInternalClient, FragmentActivity fragmentActivity, DropInResultCallback dropInResultCallback) {
        this.f$0 = dropInInternalClient;
        this.f$1 = fragmentActivity;
        this.f$2 = dropInResultCallback;
    }

    public final void onResult(VenmoAccountNonce venmoAccountNonce, Exception exc) {
        this.f$0.m388lambda$handleVenmoActivityResult$8$combraintreepaymentsapiDropInInternalClient(this.f$1, this.f$2, venmoAccountNonce, exc);
    }
}
