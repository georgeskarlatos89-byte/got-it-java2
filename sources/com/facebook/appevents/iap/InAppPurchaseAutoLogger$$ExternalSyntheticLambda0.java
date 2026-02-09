package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseUtils;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class InAppPurchaseAutoLogger$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ InAppPurchaseUtils.BillingClientVersion f$0;
    public final /* synthetic */ Context f$1;

    public /* synthetic */ InAppPurchaseAutoLogger$$ExternalSyntheticLambda0(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        this.f$0 = billingClientVersion;
        this.f$1 = context;
    }

    public final void run() {
        InAppPurchaseAutoLogger.startIapLogging$lambda$1$lambda$0(this.f$0, this.f$1);
    }
}
