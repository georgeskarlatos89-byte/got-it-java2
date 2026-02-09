package com.braintreepayments.api;

import android.content.Context;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ThreeDSecureActivity$$ExternalSyntheticLambda0 implements CardinalValidateReceiver {
    public final /* synthetic */ ThreeDSecureActivity f$0;

    public /* synthetic */ ThreeDSecureActivity$$ExternalSyntheticLambda0(ThreeDSecureActivity threeDSecureActivity) {
        this.f$0 = threeDSecureActivity;
    }

    public final void onValidated(Context context, ValidateResponse validateResponse, String str) {
        this.f$0.m401lambda$onCreate$0$combraintreepaymentsapiThreeDSecureActivity(context, validateResponse, str);
    }
}
