package com.braintreepayments.api;

import androidx.fragment.app.FragmentActivity;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda4 implements ThreeDSecureResultCallback {
    public final /* synthetic */ DropInInternalClient f$0;
    public final /* synthetic */ DropInResultCallback f$1;
    public final /* synthetic */ FragmentActivity f$2;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda4(DropInInternalClient dropInInternalClient, DropInResultCallback dropInResultCallback, FragmentActivity fragmentActivity) {
        this.f$0 = dropInInternalClient;
        this.f$1 = dropInResultCallback;
        this.f$2 = fragmentActivity;
    }

    public final void onResult(ThreeDSecureResult threeDSecureResult, Exception exc) {
        this.f$0.m389lambda$performThreeDSecureVerification$1$combraintreepaymentsapiDropInInternalClient(this.f$1, this.f$2, threeDSecureResult, exc);
    }
}
