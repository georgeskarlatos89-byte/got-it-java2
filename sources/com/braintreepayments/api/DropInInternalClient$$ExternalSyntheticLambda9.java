package com.braintreepayments.api;

import androidx.fragment.app.FragmentActivity;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda9 implements GooglePayOnActivityResultCallback {
    public final /* synthetic */ DropInInternalClient f$0;
    public final /* synthetic */ FragmentActivity f$1;
    public final /* synthetic */ DropInResultCallback f$2;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda9(DropInInternalClient dropInInternalClient, FragmentActivity fragmentActivity, DropInResultCallback dropInResultCallback) {
        this.f$0 = dropInInternalClient;
        this.f$1 = fragmentActivity;
        this.f$2 = dropInResultCallback;
    }

    public final void onResult(PaymentMethodNonce paymentMethodNonce, Exception exc) {
        this.f$0.m386lambda$handleGooglePayActivityResult$7$combraintreepaymentsapiDropInInternalClient(this.f$1, this.f$2, paymentMethodNonce, exc);
    }
}
