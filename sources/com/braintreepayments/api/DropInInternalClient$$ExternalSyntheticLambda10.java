package com.braintreepayments.api;

import androidx.fragment.app.FragmentActivity;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda10 implements ThreeDSecureResultCallback {
    public final /* synthetic */ DropInInternalClient f$0;
    public final /* synthetic */ FragmentActivity f$1;
    public final /* synthetic */ ThreeDSecureRequest f$2;
    public final /* synthetic */ DropInResultCallback f$3;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda10(DropInInternalClient dropInInternalClient, FragmentActivity fragmentActivity, ThreeDSecureRequest threeDSecureRequest, DropInResultCallback dropInResultCallback) {
        this.f$0 = dropInInternalClient;
        this.f$1 = fragmentActivity;
        this.f$2 = threeDSecureRequest;
        this.f$3 = dropInResultCallback;
    }

    public final void onResult(ThreeDSecureResult threeDSecureResult, Exception exc) {
        this.f$0.m390lambda$performThreeDSecureVerification$2$combraintreepaymentsapiDropInInternalClient(this.f$1, this.f$2, this.f$3, threeDSecureResult, exc);
    }
}
