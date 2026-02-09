package com.braintreepayments.api;

import androidx.fragment.app.FragmentActivity;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda1 implements PayPalBrowserSwitchResultCallback {
    public final /* synthetic */ DropInInternalClient f$0;
    public final /* synthetic */ FragmentActivity f$1;
    public final /* synthetic */ DropInResultCallback f$2;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda1(DropInInternalClient dropInInternalClient, FragmentActivity fragmentActivity, DropInResultCallback dropInResultCallback) {
        this.f$0 = dropInInternalClient;
        this.f$1 = fragmentActivity;
        this.f$2 = dropInResultCallback;
    }

    public final void onResult(PayPalAccountNonce payPalAccountNonce, Exception exc) {
        this.f$0.m378lambda$deliverBrowserSwitchResult$4$combraintreepaymentsapiDropInInternalClient(this.f$1, this.f$2, payPalAccountNonce, exc);
    }
}
