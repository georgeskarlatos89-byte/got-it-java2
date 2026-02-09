package com.dooboolab.rniap;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.Purchase;
import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RNIapModule.kt */
final class RNIapModule$consumeItems$1 extends Lambda implements Function1<BillingClient, Unit> {
    final /* synthetic */ int $expectedResponseCode;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ Purchase $purchase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RNIapModule$consumeItems$1(Purchase purchase, int i, Promise promise) {
        super(1);
        this.$purchase = purchase;
        this.$expectedResponseCode = i;
        this.$promise = promise;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BillingClient) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(BillingClient billingClient) {
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        ConsumeParams build = ConsumeParams.newBuilder().setPurchaseToken(this.$purchase.getPurchaseToken()).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …                 .build()");
        billingClient.consumeAsync(build, new RNIapModule$consumeItems$1$$ExternalSyntheticLambda0(this.$expectedResponseCode, this.$promise));
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$0(int i, Promise promise, BillingResult billingResult, String str) {
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (billingResult.getResponseCode() != i) {
            PlayUtils.INSTANCE.rejectPromiseWithBillingError(promise, billingResult.getResponseCode());
        } else {
            PromiseUtlisKt.safeResolve(promise, true);
        }
    }
}
