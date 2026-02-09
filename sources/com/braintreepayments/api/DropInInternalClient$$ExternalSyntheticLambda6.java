package com.braintreepayments.api;

import androidx.fragment.app.FragmentActivity;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda6 implements ConfigurationCallback {
    public final /* synthetic */ DropInInternalClient f$0;
    public final /* synthetic */ GetPaymentMethodNoncesCallback f$1;
    public final /* synthetic */ FragmentActivity f$2;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda6(DropInInternalClient dropInInternalClient, GetPaymentMethodNoncesCallback getPaymentMethodNoncesCallback, FragmentActivity fragmentActivity) {
        this.f$0 = dropInInternalClient;
        this.f$1 = getPaymentMethodNoncesCallback;
        this.f$2 = fragmentActivity;
    }

    public final void onResult(Configuration configuration, Exception exc) {
        this.f$0.m385lambda$getVaultedPaymentMethods$15$combraintreepaymentsapiDropInInternalClient(this.f$1, this.f$2, configuration, exc);
    }
}
