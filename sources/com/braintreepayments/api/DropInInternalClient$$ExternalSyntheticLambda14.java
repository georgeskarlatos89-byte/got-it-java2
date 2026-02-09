package com.braintreepayments.api;

import java.util.List;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda14 implements GooglePayIsReadyToPayCallback {
    public final /* synthetic */ DropInInternalClient f$0;
    public final /* synthetic */ Configuration f$1;
    public final /* synthetic */ List f$2;
    public final /* synthetic */ GetPaymentMethodNoncesCallback f$3;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda14(DropInInternalClient dropInInternalClient, Configuration configuration, List list, GetPaymentMethodNoncesCallback getPaymentMethodNoncesCallback) {
        this.f$0 = dropInInternalClient;
        this.f$1 = configuration;
        this.f$2 = list;
        this.f$3 = getPaymentMethodNoncesCallback;
    }

    public final void onResult(boolean z, Exception exc) {
        this.f$0.m383lambda$getVaultedPaymentMethods$13$combraintreepaymentsapiDropInInternalClient(this.f$1, this.f$2, this.f$3, z, exc);
    }
}
