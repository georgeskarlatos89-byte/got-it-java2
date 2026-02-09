package com.braintreepayments.api;

import androidx.fragment.app.FragmentActivity;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda11 implements GooglePayIsReadyToPayCallback {
    public final /* synthetic */ DropInInternalClient f$0;
    public final /* synthetic */ FragmentActivity f$1;
    public final /* synthetic */ Configuration f$2;
    public final /* synthetic */ GetSupportedPaymentMethodsCallback f$3;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda11(DropInInternalClient dropInInternalClient, FragmentActivity fragmentActivity, Configuration configuration, GetSupportedPaymentMethodsCallback getSupportedPaymentMethodsCallback) {
        this.f$0 = dropInInternalClient;
        this.f$1 = fragmentActivity;
        this.f$2 = configuration;
        this.f$3 = getSupportedPaymentMethodsCallback;
    }

    public final void onResult(boolean z, Exception exc) {
        this.f$0.m381lambda$getSupportedPaymentMethods$10$combraintreepaymentsapiDropInInternalClient(this.f$1, this.f$2, this.f$3, z, exc);
    }
}
