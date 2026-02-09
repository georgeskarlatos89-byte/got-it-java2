package com.braintreepayments.api;

import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda3 implements GetPaymentMethodNoncesCallback {
    public final /* synthetic */ DropInInternalClient f$0;
    public final /* synthetic */ GetPaymentMethodNoncesCallback f$1;
    public final /* synthetic */ FragmentActivity f$2;
    public final /* synthetic */ Configuration f$3;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda3(DropInInternalClient dropInInternalClient, GetPaymentMethodNoncesCallback getPaymentMethodNoncesCallback, FragmentActivity fragmentActivity, Configuration configuration) {
        this.f$0 = dropInInternalClient;
        this.f$1 = getPaymentMethodNoncesCallback;
        this.f$2 = fragmentActivity;
        this.f$3 = configuration;
    }

    public final void onResult(List list, Exception exc) {
        this.f$0.m384lambda$getVaultedPaymentMethods$14$combraintreepaymentsapiDropInInternalClient(this.f$1, this.f$2, this.f$3, list, exc);
    }
}
