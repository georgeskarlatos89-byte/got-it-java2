package com.dooboolab.rniap;

import com.android.billingclient.api.BillingClient;
import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RNIapModule.kt */
final class RNIapModule$isFeatureSupported$1 extends Lambda implements Function1<BillingClient, Unit> {
    final /* synthetic */ String $feature;
    final /* synthetic */ Promise $promise;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RNIapModule$isFeatureSupported$1(String str, Promise promise) {
        super(1);
        this.$feature = str;
        this.$promise = promise;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BillingClient) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        com.dooboolab.rniap.PromiseUtlisKt.safeResolve(r2.$promise, r3.isFeatureSupported(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        com.dooboolab.rniap.PromiseUtlisKt.safeReject(r2.$promise, "Invalid Feature name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(com.android.billingclient.api.BillingClient r3) {
        /*
            r2 = this;
            java.lang.String r0 = "billingClient"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r2.$feature
            int r1 = r0.hashCode()
            switch(r1) {
                case -91953012: goto L_0x003f;
                case 755711666: goto L_0x0033;
                case 808641238: goto L_0x0027;
                case 1739975758: goto L_0x001b;
                case 1785301586: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0054
        L_0x000f:
            java.lang.String r1 = "SUBSCRIPTIONS_UPDATE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0018
            goto L_0x0054
        L_0x0018:
            java.lang.String r0 = "subscriptionsUpdate"
            goto L_0x004a
        L_0x001b:
            java.lang.String r1 = "PRICE_CHANGE_CONFIRMATION"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0024
            goto L_0x0054
        L_0x0024:
            java.lang.String r0 = "priceChangeConfirmation"
            goto L_0x004a
        L_0x0027:
            java.lang.String r1 = "SUBSCRIPTIONS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0030
            goto L_0x0054
        L_0x0030:
            java.lang.String r0 = "subscriptions"
            goto L_0x004a
        L_0x0033:
            java.lang.String r1 = "PRODUCT_DETAILS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003c
            goto L_0x0054
        L_0x003c:
            java.lang.String r0 = "fff"
            goto L_0x004a
        L_0x003f:
            java.lang.String r1 = "IN_APP_MESSAGING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0048
            goto L_0x0054
        L_0x0048:
            java.lang.String r0 = "bbb"
        L_0x004a:
            com.facebook.react.bridge.Promise r1 = r2.$promise
            com.android.billingclient.api.BillingResult r3 = r3.isFeatureSupported(r0)
            com.dooboolab.rniap.PromiseUtlisKt.safeResolve(r1, r3)
            return
        L_0x0054:
            com.facebook.react.bridge.Promise r3 = r2.$promise
            java.lang.String r0 = "Invalid Feature name"
            com.dooboolab.rniap.PromiseUtlisKt.safeReject(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dooboolab.rniap.RNIapModule$isFeatureSupported$1.invoke(com.android.billingclient.api.BillingClient):void");
    }
}
