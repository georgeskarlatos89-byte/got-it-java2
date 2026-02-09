package com.dooboolab.rniap;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.GetBillingConfigParams;
import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RNIapModule.kt */
final class RNIapModule$getStorefront$1 extends Lambda implements Function1<BillingClient, Unit> {
    final /* synthetic */ Promise $promise;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RNIapModule$getStorefront$1(Promise promise) {
        super(1);
        this.$promise = promise;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BillingClient) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(BillingClient billingClient) {
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        billingClient.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new RNIapModule$getStorefront$1$$ExternalSyntheticLambda0(this.$promise));
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$0(Promise promise, BillingResult billingResult, BillingConfig billingConfig) {
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(billingResult, "result");
        String str = "";
        if (billingResult.getResponseCode() == 0) {
            String countryCode = billingConfig != null ? billingConfig.getCountryCode() : null;
            if (countryCode != null) {
                str = countryCode;
            }
            PromiseUtlisKt.safeResolve(promise, str);
            return;
        }
        String debugMessage = billingResult.getDebugMessage();
        if (debugMessage != null) {
            str = debugMessage;
        }
        PromiseUtlisKt.safeReject(promise, String.valueOf(billingResult.getResponseCode()), str);
    }
}
