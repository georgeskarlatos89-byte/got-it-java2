package com.braintreepayments.api;

import java.util.List;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInClient$$ExternalSyntheticLambda1 implements GetPaymentMethodNoncesCallback {
    public final /* synthetic */ FetchMostRecentPaymentMethodCallback f$0;

    public /* synthetic */ DropInClient$$ExternalSyntheticLambda1(FetchMostRecentPaymentMethodCallback fetchMostRecentPaymentMethodCallback) {
        this.f$0 = fetchMostRecentPaymentMethodCallback;
    }

    public final void onResult(List list, Exception exc) {
        DropInClient.lambda$getPaymentMethodNonces$3(this.f$0, list, exc);
    }
}
