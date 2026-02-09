package com.dooboolab.rniap;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.facebook.react.bridge.Promise;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RNIapModule.kt */
final class RNIapModule$flushFailedPurchasesCachedAsPending$1 extends Lambda implements Function1<BillingClient, Unit> {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ RNIapModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RNIapModule$flushFailedPurchasesCachedAsPending$1(RNIapModule rNIapModule, Promise promise) {
        super(1);
        this.this$0 = rNIapModule;
        this.$promise = promise;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BillingClient) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(BillingClient billingClient) {
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), (PurchasesResponseListener) new RNIapModule$flushFailedPurchasesCachedAsPending$1$$ExternalSyntheticLambda0(this.this$0, this.$promise));
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$1(RNIapModule rNIapModule, Promise promise, BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(rNIapModule, "this$0");
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (rNIapModule.isValidResult(billingResult, promise)) {
            if (list == null) {
                PromiseUtlisKt.safeResolve(promise, false);
                return;
            }
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((Purchase) next).getPurchaseState() == 2) {
                    arrayList.add(next);
                }
            }
            List list2 = (List) arrayList;
            if (list2.isEmpty()) {
                PromiseUtlisKt.safeResolve(promise, false);
            } else {
                rNIapModule.consumeItems(list2, promise, 8);
            }
        }
    }
}
