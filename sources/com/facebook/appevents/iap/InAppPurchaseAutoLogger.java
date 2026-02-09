package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseAutoLogger;", "", "()V", "failedToCreateWrapper", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getFailedToCreateWrapper", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "logPurchase", "", "billingClientVersion", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "packageName", "", "startIapLogging", "context", "Landroid/content/Context;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: InAppPurchaseAutoLogger.kt */
public final class InAppPurchaseAutoLogger {
    public static final InAppPurchaseAutoLogger INSTANCE = new InAppPurchaseAutoLogger();
    private static final AtomicBoolean failedToCreateWrapper = new AtomicBoolean(false);

    private InAppPurchaseAutoLogger() {
    }

    public final AtomicBoolean getFailedToCreateWrapper() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return failedToCreateWrapper;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        return;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void startIapLogging(android.content.Context r5, com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion r6) {
        /*
            java.lang.Class<com.facebook.appevents.iap.InAppPurchaseAutoLogger> r0 = com.facebook.appevents.iap.InAppPurchaseAutoLogger.class
            monitor-enter(r0)
            java.lang.Class<com.facebook.appevents.iap.InAppPurchaseAutoLogger> r1 = com.facebook.appevents.iap.InAppPurchaseAutoLogger.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r1)     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "billingClientVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicBoolean r1 = failedToCreateWrapper     // Catch:{ all -> 0x007a }
            boolean r2 = r1.get()     // Catch:{ all -> 0x007a }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r0)
            return
        L_0x0021:
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ all -> 0x007a }
            r2.<init>()     // Catch:{ all -> 0x007a }
            com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r3 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V2_V4     // Catch:{ all -> 0x007a }
            if (r6 != r3) goto L_0x0033
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4$Companion r3 = com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4.Companion     // Catch:{ all -> 0x007a }
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4 r3 = r3.getOrCreateInstance(r5)     // Catch:{ all -> 0x007a }
            r2.element = r3     // Catch:{ all -> 0x007a }
            goto L_0x003f
        L_0x0033:
            com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r3 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V5_V7     // Catch:{ all -> 0x007a }
            if (r6 != r3) goto L_0x003f
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV5V7$Companion r3 = com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV5V7.Companion     // Catch:{ all -> 0x007a }
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV5V7 r3 = r3.getOrCreateInstance(r5)     // Catch:{ all -> 0x007a }
            r2.element = r3     // Catch:{ all -> 0x007a }
        L_0x003f:
            T r3 = r2.element     // Catch:{ all -> 0x007a }
            if (r3 != 0) goto L_0x0049
            r5 = 1
            r1.set(r5)     // Catch:{ all -> 0x007a }
            monitor-exit(r0)
            return
        L_0x0049:
            com.facebook.internal.FeatureManager$Feature r1 = com.facebook.internal.FeatureManager.Feature.AndroidIAPSubscriptionAutoLogging     // Catch:{ all -> 0x007a }
            boolean r1 = com.facebook.internal.FeatureManager.isEnabled(r1)     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x006a
            boolean r1 = com.facebook.appevents.integrity.ProtectedModeManager.isEnabled()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x005b
            com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r1 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V2_V4     // Catch:{ all -> 0x007a }
            if (r6 != r1) goto L_0x006a
        L_0x005b:
            T r1 = r2.element     // Catch:{ all -> 0x007a }
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper r1 = (com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper) r1     // Catch:{ all -> 0x007a }
            com.facebook.appevents.iap.InAppPurchaseUtils$IAPProductType r3 = com.facebook.appevents.iap.InAppPurchaseUtils.IAPProductType.INAPP     // Catch:{ all -> 0x007a }
            com.facebook.appevents.iap.InAppPurchaseAutoLogger$$ExternalSyntheticLambda1 r4 = new com.facebook.appevents.iap.InAppPurchaseAutoLogger$$ExternalSyntheticLambda1     // Catch:{ all -> 0x007a }
            r4.<init>(r2, r6, r5)     // Catch:{ all -> 0x007a }
            r1.queryPurchaseHistory(r3, r4)     // Catch:{ all -> 0x007a }
            goto L_0x0078
        L_0x006a:
            T r1 = r2.element     // Catch:{ all -> 0x007a }
            com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper r1 = (com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper) r1     // Catch:{ all -> 0x007a }
            com.facebook.appevents.iap.InAppPurchaseUtils$IAPProductType r2 = com.facebook.appevents.iap.InAppPurchaseUtils.IAPProductType.INAPP     // Catch:{ all -> 0x007a }
            com.facebook.appevents.iap.InAppPurchaseAutoLogger$$ExternalSyntheticLambda2 r3 = new com.facebook.appevents.iap.InAppPurchaseAutoLogger$$ExternalSyntheticLambda2     // Catch:{ all -> 0x007a }
            r3.<init>(r6, r5)     // Catch:{ all -> 0x007a }
            r1.queryPurchaseHistory(r2, r3)     // Catch:{ all -> 0x007a }
        L_0x0078:
            monitor-exit(r0)
            return
        L_0x007a:
            r5 = move-exception
            java.lang.Class<com.facebook.appevents.iap.InAppPurchaseAutoLogger> r6 = com.facebook.appevents.iap.InAppPurchaseAutoLogger.class
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r5, r6)     // Catch:{ all -> 0x0082 }
            monitor-exit(r0)
            return
        L_0x0082:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.InAppPurchaseAutoLogger.startIapLogging(android.content.Context, com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion):void");
    }

    /* access modifiers changed from: private */
    public static final void startIapLogging$lambda$1(Ref.ObjectRef objectRef, InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        Class<InAppPurchaseAutoLogger> cls = InAppPurchaseAutoLogger.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(objectRef, "$billingClientWrapper");
                Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
                Intrinsics.checkNotNullParameter(context, "$context");
                ((InAppPurchaseBillingClientWrapper) objectRef.element).queryPurchaseHistory(InAppPurchaseUtils.IAPProductType.SUBS, new InAppPurchaseAutoLogger$$ExternalSyntheticLambda0(billingClientVersion, context));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void startIapLogging$lambda$1$lambda$0(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        Class<InAppPurchaseAutoLogger> cls = InAppPurchaseAutoLogger.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
                Intrinsics.checkNotNullParameter(context, "$context");
                InAppPurchaseAutoLogger inAppPurchaseAutoLogger = INSTANCE;
                String packageName = context.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                inAppPurchaseAutoLogger.logPurchase(billingClientVersion, packageName);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void startIapLogging$lambda$2(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        Class<InAppPurchaseAutoLogger> cls = InAppPurchaseAutoLogger.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
                Intrinsics.checkNotNullParameter(context, "$context");
                InAppPurchaseAutoLogger inAppPurchaseAutoLogger = INSTANCE;
                String packageName = context.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                inAppPurchaseAutoLogger.logPurchase(billingClientVersion, packageName);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void logPurchase(InAppPurchaseUtils.BillingClientVersion billingClientVersion, String str) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                boolean isFirstAppLaunchWithNewIAP = InAppPurchaseLoggerManager.getIsFirstAppLaunchWithNewIAP();
                if (isFirstAppLaunchWithNewIAP) {
                    InAppPurchaseLoggerManager.migrateOldCacheHistory();
                }
                if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V2_V4) {
                    InAppPurchaseLoggerManager.filterPurchaseLogging(InAppPurchaseBillingClientWrapperV2V4.Companion.getIapPurchaseDetailsMap(), InAppPurchaseBillingClientWrapperV2V4.Companion.getSkuDetailsMap(), false, str, billingClientVersion, isFirstAppLaunchWithNewIAP);
                    InAppPurchaseLoggerManager.filterPurchaseLogging(InAppPurchaseBillingClientWrapperV2V4.Companion.getSubsPurchaseDetailsMap(), InAppPurchaseBillingClientWrapperV2V4.Companion.getSkuDetailsMap(), true, str, billingClientVersion, isFirstAppLaunchWithNewIAP);
                    InAppPurchaseBillingClientWrapperV2V4.Companion.getIapPurchaseDetailsMap().clear();
                    InAppPurchaseBillingClientWrapperV2V4.Companion.getSubsPurchaseDetailsMap().clear();
                } else {
                    InAppPurchaseLoggerManager.filterPurchaseLogging(InAppPurchaseBillingClientWrapperV5V7.Companion.getIapPurchaseDetailsMap(), InAppPurchaseBillingClientWrapperV5V7.Companion.getProductDetailsMap(), false, str, billingClientVersion, isFirstAppLaunchWithNewIAP);
                    InAppPurchaseLoggerManager.filterPurchaseLogging(InAppPurchaseBillingClientWrapperV5V7.Companion.getSubsPurchaseDetailsMap(), InAppPurchaseBillingClientWrapperV5V7.Companion.getProductDetailsMap(), true, str, billingClientVersion, isFirstAppLaunchWithNewIAP);
                    InAppPurchaseBillingClientWrapperV5V7.Companion.getIapPurchaseDetailsMap().clear();
                    InAppPurchaseBillingClientWrapperV5V7.Companion.getSubsPurchaseDetailsMap().clear();
                }
                if (isFirstAppLaunchWithNewIAP) {
                    InAppPurchaseLoggerManager.setAppHasBeenLaunchedWithNewIAP();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
