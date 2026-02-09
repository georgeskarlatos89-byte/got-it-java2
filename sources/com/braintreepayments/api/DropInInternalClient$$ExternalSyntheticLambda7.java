package com.braintreepayments.api;

import androidx.fragment.app.FragmentActivity;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda7 implements ThreeDSecureResultCallback {
    public final /* synthetic */ DropInInternalClient f$0;
    public final /* synthetic */ FragmentActivity f$1;
    public final /* synthetic */ DropInResultCallback f$2;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda7(DropInInternalClient dropInInternalClient, FragmentActivity fragmentActivity, DropInResultCallback dropInResultCallback) {
        this.f$0 = dropInInternalClient;
        this.f$1 = fragmentActivity;
        this.f$2 = dropInResultCallback;
    }

    public final void onResult(ThreeDSecureResult threeDSecureResult, Exception exc) {
        this.f$0.m387lambda$handleThreeDSecureActivityResult$6$combraintreepaymentsapiDropInInternalClient(this.f$1, this.f$2, threeDSecureResult, exc);
    }
}
