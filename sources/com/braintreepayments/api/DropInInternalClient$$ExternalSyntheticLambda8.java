package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda8 implements DataCollectorCallback {
    public final /* synthetic */ DropInResult f$0;
    public final /* synthetic */ DropInResultCallback f$1;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda8(DropInResult dropInResult, DropInResultCallback dropInResultCallback) {
        this.f$0 = dropInResult;
        this.f$1 = dropInResultCallback;
    }

    public final void onResult(String str, Exception exc) {
        DropInInternalClient.lambda$performThreeDSecureVerification$0(this.f$0, this.f$1, str, exc);
    }
}
