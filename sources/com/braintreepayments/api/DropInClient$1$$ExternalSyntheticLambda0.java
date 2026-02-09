package com.braintreepayments.api;

import com.braintreepayments.api.DropInClient;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInClient$1$$ExternalSyntheticLambda0 implements GooglePayIsReadyToPayCallback {
    public final /* synthetic */ DropInClient.AnonymousClass1 f$0;
    public final /* synthetic */ FetchMostRecentPaymentMethodCallback f$1;

    public /* synthetic */ DropInClient$1$$ExternalSyntheticLambda0(DropInClient.AnonymousClass1 r1, FetchMostRecentPaymentMethodCallback fetchMostRecentPaymentMethodCallback) {
        this.f$0 = r1;
        this.f$1 = fetchMostRecentPaymentMethodCallback;
    }

    public final void onResult(boolean z, Exception exc) {
        this.f$0.m377lambda$onAuthorizationResult$0$combraintreepaymentsapiDropInClient$1(this.f$1, z, exc);
    }
}
