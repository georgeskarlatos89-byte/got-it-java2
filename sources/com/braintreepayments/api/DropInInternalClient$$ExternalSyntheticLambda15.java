package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda15 implements DataCollectorCallback {
    public final /* synthetic */ DropInResultCallback f$0;
    public final /* synthetic */ DropInResult f$1;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda15(DropInResultCallback dropInResultCallback, DropInResult dropInResult) {
        this.f$0 = dropInResultCallback;
        this.f$1 = dropInResult;
    }

    public final void onResult(String str, Exception exc) {
        DropInInternalClient.lambda$notifyDropInResult$9(this.f$0, this.f$1, str, exc);
    }
}
