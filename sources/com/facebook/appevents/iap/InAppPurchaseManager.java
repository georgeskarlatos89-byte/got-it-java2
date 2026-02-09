package com.facebook.appevents.iap;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0002JB\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\n\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0007JF\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0 2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001b2\u001c\u0010#\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f0 H\u0007J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0004H\u0003J\b\u0010&\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R<\u0010\b\u001a0\u0012\u0004\u0012\u00020\n\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\r\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f0\f0\u000b0\tX\u0004¢\u0006\u0002\n\u0000R<\u0010\u0010\u001a0\u0012\u0004\u0012\u00020\n\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\r\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f0\f0\u000b0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseManager;", "", "()V", "GOOGLE_BILLINGCLIENT_VERSION", "", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "specificBillingLibraryVersion", "timesOfImplicitPurchases", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/facebook/appevents/iap/InAppPurchase;", "", "Lkotlin/Pair;", "", "Landroid/os/Bundle;", "Lcom/facebook/appevents/OperationalData;", "timesOfManualPurchases", "enableAutoLogging", "", "getBillingClientVersion", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "getDedupeParameter", "newPurchaseParameters", "newPurchaseOperationalData", "oldPurchaseParameters", "oldPurchaseOperationalData", "dedupingWithImplicitlyLoggedHistory", "", "withTestDedupeKeys", "getSpecificBillingLibraryVersion", "performDedupe", "purchases", "", "time", "isImplicitlyLogged", "purchaseParameters", "setSpecificBillingLibraryVersion", "version", "startTracking", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: InAppPurchaseManager.kt */
public final class InAppPurchaseManager {
    private static final String GOOGLE_BILLINGCLIENT_VERSION = "com.google.android.play.billingclient.version";
    public static final InAppPurchaseManager INSTANCE = new InAppPurchaseManager();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);
    private static String specificBillingLibraryVersion;
    private static final ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> timesOfImplicitPurchases = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> timesOfManualPurchases = new ConcurrentHashMap<>();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: InAppPurchaseManager.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion[] r0 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r1 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r1 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V1     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r1 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V2_V4     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r1 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V5_V7     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.InAppPurchaseManager.WhenMappings.<clinit>():void");
        }
    }

    private InAppPurchaseManager() {
    }

    @JvmStatic
    public static final void enableAutoLogging() {
        Class<InAppPurchaseManager> cls = InAppPurchaseManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (!AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
                    InAppPurchaseLoggerManager.updateLatestPossiblePurchaseTime();
                    return;
                }
                enabled.set(true);
                startTracking();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void startTracking() {
        Class<InAppPurchaseManager> cls = InAppPurchaseManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (enabled.get()) {
                    InAppPurchaseUtils.BillingClientVersion billingClientVersion = INSTANCE.getBillingClientVersion();
                    int i = WhenMappings.$EnumSwitchMapping$0[billingClientVersion.ordinal()];
                    if (i == 2) {
                        InAppPurchaseActivityLifecycleTracker.startIapLogging(InAppPurchaseUtils.BillingClientVersion.V1);
                    } else if (i != 3) {
                        if (i == 4) {
                            if (FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib5To7)) {
                                InAppPurchaseAutoLogger.startIapLogging(FacebookSdk.getApplicationContext(), billingClientVersion);
                            }
                        }
                    } else if (FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib2)) {
                        InAppPurchaseAutoLogger.startIapLogging(FacebookSdk.getApplicationContext(), billingClientVersion);
                    } else {
                        InAppPurchaseActivityLifecycleTracker.startIapLogging(InAppPurchaseUtils.BillingClientVersion.V2_V4);
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    private static final void setSpecificBillingLibraryVersion(String str) {
        Class<InAppPurchaseManager> cls = InAppPurchaseManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                specificBillingLibraryVersion = str;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final String getSpecificBillingLibraryVersion() {
        Class<InAppPurchaseManager> cls = InAppPurchaseManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return specificBillingLibraryVersion;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        return com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V5_V7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0085 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion getBillingClientVersion() {
        /*
            r9 = this;
            java.lang.String r0 = "GPBL."
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r9)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ Exception -> 0x0085 }
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch:{ Exception -> 0x0085 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x0085 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo(r1, r4)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r3 = "context.packageManager.g…TA_DATA\n                )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch:{ Exception -> 0x0085 }
            android.os.Bundle r1 = r1.metaData     // Catch:{ Exception -> 0x0085 }
            java.lang.String r3 = "com.google.android.play.billingclient.version"
            java.lang.String r1 = r1.getString(r3)     // Catch:{ Exception -> 0x0085 }
            if (r1 != 0) goto L_0x002e
            com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r0 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.NONE     // Catch:{ Exception -> 0x0085 }
            return r0
        L_0x002e:
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x0085 }
            java.lang.String r4 = "."
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ Exception -> 0x0085 }
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 0
            java.util.List r3 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r3, (java.lang.String[]) r4, (boolean) r5, (int) r6, (int) r7, (java.lang.Object) r8)     // Catch:{ Exception -> 0x0085 }
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x0085 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x0085 }
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x004c
            r4 = r5
            goto L_0x004d
        L_0x004c:
            r4 = r6
        L_0x004d:
            if (r4 == 0) goto L_0x0052
            com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r0 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V5_V7     // Catch:{ Exception -> 0x0085 }
            return r0
        L_0x0052:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0085 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0085 }
            java.lang.StringBuilder r0 = r4.append(r1)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0085 }
            setSpecificBillingLibraryVersion(r0)     // Catch:{ Exception -> 0x0085 }
            java.lang.Object r0 = r3.get(r6)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0085 }
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)     // Catch:{ Exception -> 0x0085 }
            if (r0 == 0) goto L_0x0080
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0085 }
            if (r0 != r5) goto L_0x0077
            com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r0 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V1     // Catch:{ Exception -> 0x0085 }
            goto L_0x007f
        L_0x0077:
            r1 = 5
            if (r0 >= r1) goto L_0x007d
            com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r0 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V2_V4     // Catch:{ Exception -> 0x0085 }
            goto L_0x007f
        L_0x007d:
            com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r0 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V5_V7     // Catch:{ Exception -> 0x0085 }
        L_0x007f:
            return r0
        L_0x0080:
            com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r0 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V5_V7     // Catch:{ Exception -> 0x0085 }
            return r0
        L_0x0083:
            r0 = move-exception
            goto L_0x0088
        L_0x0085:
            com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion r0 = com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion.V5_V7     // Catch:{ all -> 0x0083 }
            return r0
        L_0x0088:
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.InAppPurchaseManager.getBillingClientVersion():com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01f7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a6 A[Catch:{ all -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014c A[Catch:{ all -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0154 A[Catch:{ all -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0169 A[Catch:{ all -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d1 A[Catch:{ all -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e6 A[Catch:{ all -> 0x0299 }] */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized android.os.Bundle performDedupe(java.util.List<com.facebook.appevents.iap.InAppPurchase> r28, long r29, boolean r31, java.util.List<kotlin.Pair<android.os.Bundle, com.facebook.appevents.OperationalData>> r32) {
        /*
            r0 = r28
            r1 = r32
            java.lang.Class<com.facebook.appevents.iap.InAppPurchaseManager> r2 = com.facebook.appevents.iap.InAppPurchaseManager.class
            monitor-enter(r2)
            java.lang.Class<com.facebook.appevents.iap.InAppPurchaseManager> r3 = com.facebook.appevents.iap.InAppPurchaseManager.class
            boolean r3 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r3)     // Catch:{ all -> 0x02a2 }
            r4 = 0
            if (r3 == 0) goto L_0x0012
            monitor-exit(r2)
            return r4
        L_0x0012:
            java.lang.String r3 = "purchases"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)     // Catch:{ all -> 0x0299 }
            java.lang.String r3 = "purchaseParameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)     // Catch:{ all -> 0x0299 }
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x0299 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0299 }
            if (r3 == 0) goto L_0x0027
            monitor-exit(r2)
            return r4
        L_0x0027:
            int r3 = r28.size()     // Catch:{ all -> 0x0299 }
            int r5 = r32.size()     // Catch:{ all -> 0x0299 }
            if (r3 != r5) goto L_0x0033
            r3 = 1
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r3 != 0) goto L_0x0038
            monitor-exit(r2)
            return r4
        L_0x0038:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0299 }
            r3.<init>()     // Catch:{ all -> 0x0299 }
            int r5 = r28.size()     // Catch:{ all -> 0x0299 }
            r9 = r4
            r8 = 0
        L_0x0043:
            if (r8 >= r5) goto L_0x01fc
            java.lang.Object r10 = r0.get(r8)     // Catch:{ all -> 0x0299 }
            com.facebook.appevents.iap.InAppPurchase r10 = (com.facebook.appevents.iap.InAppPurchase) r10     // Catch:{ all -> 0x0299 }
            java.lang.Object r11 = r1.get(r8)     // Catch:{ all -> 0x0299 }
            kotlin.Pair r11 = (kotlin.Pair) r11     // Catch:{ all -> 0x0299 }
            java.lang.Object r12 = r11.component1()     // Catch:{ all -> 0x0299 }
            android.os.Bundle r12 = (android.os.Bundle) r12     // Catch:{ all -> 0x0299 }
            java.lang.Object r11 = r11.component2()     // Catch:{ all -> 0x0299 }
            com.facebook.appevents.OperationalData r11 = (com.facebook.appevents.OperationalData) r11     // Catch:{ all -> 0x0299 }
            com.facebook.appevents.iap.InAppPurchase r15 = new com.facebook.appevents.iap.InAppPurchase     // Catch:{ all -> 0x0299 }
            java.lang.String r13 = r10.getEventName()     // Catch:{ all -> 0x0299 }
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch:{ all -> 0x0299 }
            double r16 = r10.getAmount()     // Catch:{ all -> 0x0299 }
            java.lang.String r6 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0299 }
            r14.<init>(r6)     // Catch:{ all -> 0x0299 }
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP     // Catch:{ all -> 0x0299 }
            r7 = 2
            java.math.BigDecimal r6 = r14.setScale(r7, r6)     // Catch:{ all -> 0x0299 }
            double r6 = r6.doubleValue()     // Catch:{ all -> 0x0299 }
            java.util.Currency r10 = r10.getCurrency()     // Catch:{ all -> 0x0299 }
            r15.<init>(r13, r6, r10)     // Catch:{ all -> 0x0299 }
            if (r31 == 0) goto L_0x008d
            java.util.concurrent.ConcurrentHashMap<com.facebook.appevents.iap.InAppPurchase, java.util.List<kotlin.Pair<java.lang.Long, kotlin.Pair<android.os.Bundle, com.facebook.appevents.OperationalData>>>> r6 = timesOfManualPurchases     // Catch:{ all -> 0x0299 }
            java.lang.Object r6 = r6.get(r15)     // Catch:{ all -> 0x0299 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0299 }
            goto L_0x0095
        L_0x008d:
            java.util.concurrent.ConcurrentHashMap<com.facebook.appevents.iap.InAppPurchase, java.util.List<kotlin.Pair<java.lang.Long, kotlin.Pair<android.os.Bundle, com.facebook.appevents.OperationalData>>>> r6 = timesOfImplicitPurchases     // Catch:{ all -> 0x0299 }
            java.lang.Object r6 = r6.get(r15)     // Catch:{ all -> 0x0299 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0299 }
        L_0x0095:
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x0299 }
            if (r7 == 0) goto L_0x00a3
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0299 }
            if (r7 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r7 = 0
            goto L_0x00a4
        L_0x00a3:
            r7 = 1
        L_0x00a4:
            if (r7 != 0) goto L_0x014c
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0299 }
            r7 = r4
            r10 = r7
            r13 = r10
            r22 = 0
        L_0x00af:
            boolean r14 = r6.hasNext()     // Catch:{ all -> 0x0299 }
            if (r14 == 0) goto L_0x014a
            java.lang.Object r14 = r6.next()     // Catch:{ all -> 0x0299 }
            kotlin.Pair r14 = (kotlin.Pair) r14     // Catch:{ all -> 0x0299 }
            java.lang.Object r16 = r14.getFirst()     // Catch:{ all -> 0x0299 }
            java.lang.Number r16 = (java.lang.Number) r16     // Catch:{ all -> 0x0299 }
            long r23 = r16.longValue()     // Catch:{ all -> 0x0299 }
            java.lang.Object r14 = r14.getSecond()     // Catch:{ all -> 0x0299 }
            kotlin.Pair r14 = (kotlin.Pair) r14     // Catch:{ all -> 0x0299 }
            java.lang.Object r16 = r14.component1()     // Catch:{ all -> 0x0299 }
            r25 = r16
            android.os.Bundle r25 = (android.os.Bundle) r25     // Catch:{ all -> 0x0299 }
            java.lang.Object r14 = r14.component2()     // Catch:{ all -> 0x0299 }
            r26 = r14
            com.facebook.appevents.OperationalData r26 = (com.facebook.appevents.OperationalData) r26     // Catch:{ all -> 0x0299 }
            long r16 = r29 - r23
            long r16 = java.lang.Math.abs(r16)     // Catch:{ all -> 0x0299 }
            com.facebook.appevents.iap.InAppPurchaseDedupeConfig r14 = com.facebook.appevents.iap.InAppPurchaseDedupeConfig.INSTANCE     // Catch:{ all -> 0x0299 }
            long r18 = r14.getDedupeWindow()     // Catch:{ all -> 0x0299 }
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 <= 0) goto L_0x00ec
            goto L_0x00af
        L_0x00ec:
            if (r10 == 0) goto L_0x00f6
            long r16 = r10.longValue()     // Catch:{ all -> 0x0299 }
            int r14 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x00af
        L_0x00f6:
            com.facebook.appevents.iap.InAppPurchaseManager r27 = INSTANCE     // Catch:{ all -> 0x0299 }
            if (r31 != 0) goto L_0x00fd
            r18 = 1
            goto L_0x00ff
        L_0x00fd:
            r18 = 0
        L_0x00ff:
            r19 = 0
            r20 = 32
            r21 = 0
            r13 = r27
            r14 = r12
            r4 = r15
            r15 = r11
            r16 = r25
            r17 = r26
            java.lang.String r20 = getDedupeParameter$default(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0299 }
            if (r31 != 0) goto L_0x0117
            r18 = 1
            goto L_0x0119
        L_0x0117:
            r18 = 0
        L_0x0119:
            r19 = 1
            r13 = r27
            r14 = r12
            r15 = r11
            r16 = r25
            r17 = r26
            java.lang.String r13 = r13.getDedupeParameter(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0299 }
            if (r13 == 0) goto L_0x012a
            r7 = r13
        L_0x012a:
            if (r20 == 0) goto L_0x0144
            java.lang.Long r10 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0299 }
            kotlin.Pair r13 = new kotlin.Pair     // Catch:{ all -> 0x0299 }
            java.lang.Long r14 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0299 }
            r13.<init>(r4, r14)     // Catch:{ all -> 0x0299 }
            r3.add(r13)     // Catch:{ all -> 0x0299 }
            r15 = r4
            r13 = r20
            r4 = 0
            r22 = 1
            goto L_0x00af
        L_0x0144:
            r15 = r4
            r13 = r20
            r4 = 0
            goto L_0x00af
        L_0x014a:
            r4 = r15
            goto L_0x0152
        L_0x014c:
            r4 = r15
            r7 = 0
            r10 = 0
            r13 = 0
            r22 = 0
        L_0x0152:
            if (r7 == 0) goto L_0x0167
            if (r9 != 0) goto L_0x015b
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x0299 }
            r9.<init>()     // Catch:{ all -> 0x0299 }
        L_0x015b:
            java.lang.String r6 = "fb_iap_test_dedup_result"
            java.lang.String r14 = "1"
            r9.putString(r6, r14)     // Catch:{ all -> 0x0299 }
            java.lang.String r6 = "fb_iap_test_dedup_key_used"
            r9.putString(r6, r7)     // Catch:{ all -> 0x0299 }
        L_0x0167:
            if (r22 == 0) goto L_0x0192
            if (r9 != 0) goto L_0x0170
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x0299 }
            r9.<init>()     // Catch:{ all -> 0x0299 }
        L_0x0170:
            if (r10 == 0) goto L_0x017b
            long r6 = r10.longValue()     // Catch:{ all -> 0x0299 }
            r10 = 1000(0x3e8, float:1.401E-42)
            long r14 = (long) r10     // Catch:{ all -> 0x0299 }
            long r6 = r6 / r14
            goto L_0x017d
        L_0x017b:
            r6 = 0
        L_0x017d:
            java.lang.String r10 = "fb_iap_non_deduped_event_time"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0299 }
            r9.putString(r10, r6)     // Catch:{ all -> 0x0299 }
            java.lang.String r6 = "fb_iap_actual_dedup_result"
            java.lang.String r7 = "1"
            r9.putString(r6, r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r6 = "fb_iap_actual_dedup_key_used"
            r9.putString(r6, r13)     // Catch:{ all -> 0x0299 }
        L_0x0192:
            if (r31 == 0) goto L_0x01c5
            if (r22 != 0) goto L_0x01c5
            java.util.concurrent.ConcurrentHashMap<com.facebook.appevents.iap.InAppPurchase, java.util.List<kotlin.Pair<java.lang.Long, kotlin.Pair<android.os.Bundle, com.facebook.appevents.OperationalData>>>> r6 = timesOfImplicitPurchases     // Catch:{ all -> 0x0299 }
            java.lang.Object r7 = r6.get(r4)     // Catch:{ all -> 0x0299 }
            if (r7 != 0) goto L_0x01ab
            r7 = r6
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ all -> 0x0299 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0299 }
            r10.<init>()     // Catch:{ all -> 0x0299 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0299 }
            r7.put(r4, r10)     // Catch:{ all -> 0x0299 }
        L_0x01ab:
            java.lang.Object r4 = r6.get(r4)     // Catch:{ all -> 0x0299 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0299 }
            if (r4 == 0) goto L_0x01f7
            kotlin.Pair r6 = new kotlin.Pair     // Catch:{ all -> 0x0299 }
            java.lang.Long r7 = java.lang.Long.valueOf(r29)     // Catch:{ all -> 0x0299 }
            kotlin.Pair r10 = new kotlin.Pair     // Catch:{ all -> 0x0299 }
            r10.<init>(r12, r11)     // Catch:{ all -> 0x0299 }
            r6.<init>(r7, r10)     // Catch:{ all -> 0x0299 }
            r4.add(r6)     // Catch:{ all -> 0x0299 }
            goto L_0x01f7
        L_0x01c5:
            if (r31 != 0) goto L_0x01f7
            if (r22 != 0) goto L_0x01f7
            java.util.concurrent.ConcurrentHashMap<com.facebook.appevents.iap.InAppPurchase, java.util.List<kotlin.Pair<java.lang.Long, kotlin.Pair<android.os.Bundle, com.facebook.appevents.OperationalData>>>> r6 = timesOfManualPurchases     // Catch:{ all -> 0x0299 }
            java.lang.Object r7 = r6.get(r4)     // Catch:{ all -> 0x0299 }
            if (r7 != 0) goto L_0x01de
            r7 = r6
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ all -> 0x0299 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0299 }
            r10.<init>()     // Catch:{ all -> 0x0299 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0299 }
            r7.put(r4, r10)     // Catch:{ all -> 0x0299 }
        L_0x01de:
            java.lang.Object r4 = r6.get(r4)     // Catch:{ all -> 0x0299 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0299 }
            if (r4 == 0) goto L_0x01f7
            kotlin.Pair r6 = new kotlin.Pair     // Catch:{ all -> 0x0299 }
            java.lang.Long r7 = java.lang.Long.valueOf(r29)     // Catch:{ all -> 0x0299 }
            kotlin.Pair r10 = new kotlin.Pair     // Catch:{ all -> 0x0299 }
            r10.<init>(r12, r11)     // Catch:{ all -> 0x0299 }
            r6.<init>(r7, r10)     // Catch:{ all -> 0x0299 }
            r4.add(r6)     // Catch:{ all -> 0x0299 }
        L_0x01f7:
            int r8 = r8 + 1
            r4 = 0
            goto L_0x0043
        L_0x01fc:
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x0299 }
        L_0x0200:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0299 }
            if (r1 == 0) goto L_0x0297
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0299 }
            kotlin.Pair r1 = (kotlin.Pair) r1     // Catch:{ all -> 0x0299 }
            if (r31 == 0) goto L_0x021b
            java.util.concurrent.ConcurrentHashMap<com.facebook.appevents.iap.InAppPurchase, java.util.List<kotlin.Pair<java.lang.Long, kotlin.Pair<android.os.Bundle, com.facebook.appevents.OperationalData>>>> r3 = timesOfManualPurchases     // Catch:{ all -> 0x0299 }
            java.lang.Object r4 = r1.getFirst()     // Catch:{ all -> 0x0299 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0299 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0299 }
            goto L_0x0227
        L_0x021b:
            java.util.concurrent.ConcurrentHashMap<com.facebook.appevents.iap.InAppPurchase, java.util.List<kotlin.Pair<java.lang.Long, kotlin.Pair<android.os.Bundle, com.facebook.appevents.OperationalData>>>> r3 = timesOfImplicitPurchases     // Catch:{ all -> 0x0299 }
            java.lang.Object r4 = r1.getFirst()     // Catch:{ all -> 0x0299 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0299 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0299 }
        L_0x0227:
            if (r3 != 0) goto L_0x022a
            goto L_0x0200
        L_0x022a:
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0299 }
            r5 = 0
        L_0x022f:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0299 }
            if (r6 == 0) goto L_0x025b
            int r6 = r5 + 1
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x0299 }
            kotlin.Pair r7 = (kotlin.Pair) r7     // Catch:{ all -> 0x0299 }
            java.lang.Object r7 = r7.getFirst()     // Catch:{ all -> 0x0299 }
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ all -> 0x0299 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0299 }
            java.lang.Object r10 = r1.getSecond()     // Catch:{ all -> 0x0299 }
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ all -> 0x0299 }
            long r10 = r10.longValue()     // Catch:{ all -> 0x0299 }
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0259
            r3.remove(r5)     // Catch:{ all -> 0x0299 }
            goto L_0x025b
        L_0x0259:
            r5 = r6
            goto L_0x022f
        L_0x025b:
            if (r31 == 0) goto L_0x0279
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0299 }
            if (r4 == 0) goto L_0x026d
            java.util.concurrent.ConcurrentHashMap<com.facebook.appevents.iap.InAppPurchase, java.util.List<kotlin.Pair<java.lang.Long, kotlin.Pair<android.os.Bundle, com.facebook.appevents.OperationalData>>>> r3 = timesOfManualPurchases     // Catch:{ all -> 0x0299 }
            java.lang.Object r1 = r1.getFirst()     // Catch:{ all -> 0x0299 }
            r3.remove(r1)     // Catch:{ all -> 0x0299 }
            goto L_0x0200
        L_0x026d:
            java.util.concurrent.ConcurrentHashMap<com.facebook.appevents.iap.InAppPurchase, java.util.List<kotlin.Pair<java.lang.Long, kotlin.Pair<android.os.Bundle, com.facebook.appevents.OperationalData>>>> r4 = timesOfManualPurchases     // Catch:{ all -> 0x0299 }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x0299 }
            java.lang.Object r1 = r1.getFirst()     // Catch:{ all -> 0x0299 }
            r4.put(r1, r3)     // Catch:{ all -> 0x0299 }
            goto L_0x0200
        L_0x0279:
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0299 }
            if (r4 == 0) goto L_0x028a
            java.util.concurrent.ConcurrentHashMap<com.facebook.appevents.iap.InAppPurchase, java.util.List<kotlin.Pair<java.lang.Long, kotlin.Pair<android.os.Bundle, com.facebook.appevents.OperationalData>>>> r3 = timesOfImplicitPurchases     // Catch:{ all -> 0x0299 }
            java.lang.Object r1 = r1.getFirst()     // Catch:{ all -> 0x0299 }
            r3.remove(r1)     // Catch:{ all -> 0x0299 }
            goto L_0x0200
        L_0x028a:
            java.util.concurrent.ConcurrentHashMap<com.facebook.appevents.iap.InAppPurchase, java.util.List<kotlin.Pair<java.lang.Long, kotlin.Pair<android.os.Bundle, com.facebook.appevents.OperationalData>>>> r4 = timesOfImplicitPurchases     // Catch:{ all -> 0x0299 }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x0299 }
            java.lang.Object r1 = r1.getFirst()     // Catch:{ all -> 0x0299 }
            r4.put(r1, r3)     // Catch:{ all -> 0x0299 }
            goto L_0x0200
        L_0x0297:
            monitor-exit(r2)
            return r9
        L_0x0299:
            r0 = move-exception
            java.lang.Class<com.facebook.appevents.iap.InAppPurchaseManager> r1 = com.facebook.appevents.iap.InAppPurchaseManager.class
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r1)     // Catch:{ all -> 0x02a2 }
            monitor-exit(r2)
            r1 = 0
            return r1
        L_0x02a2:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.InAppPurchaseManager.performDedupe(java.util.List, long, boolean, java.util.List):android.os.Bundle");
    }

    public static /* synthetic */ String getDedupeParameter$default(InAppPurchaseManager inAppPurchaseManager, Bundle bundle, OperationalData operationalData, Bundle bundle2, OperationalData operationalData2, boolean z, boolean z2, int i, Object obj) {
        Class<InAppPurchaseManager> cls = InAppPurchaseManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseManager.getDedupeParameter(bundle, operationalData, bundle2, operationalData2, z, (i & 32) != 0 ? false : z2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008c A[Catch:{ all -> 0x009d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getDedupeParameter(android.os.Bundle r10, com.facebook.appevents.OperationalData r11, android.os.Bundle r12, com.facebook.appevents.OperationalData r13, boolean r14, boolean r15) {
        /*
            r9 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            if (r15 == 0) goto L_0x0011
            com.facebook.appevents.iap.InAppPurchaseDedupeConfig r15 = com.facebook.appevents.iap.InAppPurchaseDedupeConfig.INSTANCE     // Catch:{ all -> 0x009d }
            java.util.List r15 = r15.getTestDedupeParameters(r14)     // Catch:{ all -> 0x009d }
            goto L_0x0017
        L_0x0011:
            com.facebook.appevents.iap.InAppPurchaseDedupeConfig r15 = com.facebook.appevents.iap.InAppPurchaseDedupeConfig.INSTANCE     // Catch:{ all -> 0x009d }
            java.util.List r15 = r15.getDedupeParameters(r14)     // Catch:{ all -> 0x009d }
        L_0x0017:
            if (r15 != 0) goto L_0x001a
            return r1
        L_0x001a:
            java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x009d }
        L_0x001e:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r15.next()     // Catch:{ all -> 0x009d }
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch:{ all -> 0x009d }
            com.facebook.appevents.OperationalData$Companion r2 = com.facebook.appevents.OperationalData.Companion     // Catch:{ all -> 0x009d }
            com.facebook.appevents.OperationalDataEnum r3 = com.facebook.appevents.OperationalDataEnum.IAPParameters     // Catch:{ all -> 0x009d }
            java.lang.Object r4 = r0.getFirst()     // Catch:{ all -> 0x009d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x009d }
            java.lang.Object r2 = r2.getParameter(r3, r4, r10, r11)     // Catch:{ all -> 0x009d }
            boolean r3 = r2 instanceof java.lang.String     // Catch:{ all -> 0x009d }
            if (r3 == 0) goto L_0x003f
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x009d }
            goto L_0x0040
        L_0x003f:
            r2 = r1
        L_0x0040:
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x009d }
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0050
            int r3 = r3.length()     // Catch:{ all -> 0x009d }
            if (r3 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r3 = r4
            goto L_0x0051
        L_0x0050:
            r3 = r5
        L_0x0051:
            if (r3 == 0) goto L_0x0054
            goto L_0x001e
        L_0x0054:
            java.lang.Object r3 = r0.getSecond()     // Catch:{ all -> 0x009d }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x009d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x009d }
        L_0x005e:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x009d }
            if (r6 == 0) goto L_0x001e
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x009d }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x009d }
            com.facebook.appevents.OperationalData$Companion r7 = com.facebook.appevents.OperationalData.Companion     // Catch:{ all -> 0x009d }
            com.facebook.appevents.OperationalDataEnum r8 = com.facebook.appevents.OperationalDataEnum.IAPParameters     // Catch:{ all -> 0x009d }
            java.lang.Object r7 = r7.getParameter(r8, r6, r12, r13)     // Catch:{ all -> 0x009d }
            boolean r8 = r7 instanceof java.lang.String     // Catch:{ all -> 0x009d }
            if (r8 == 0) goto L_0x0079
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x009d }
            goto L_0x007a
        L_0x0079:
            r7 = r1
        L_0x007a:
            r8 = r7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x009d }
            if (r8 == 0) goto L_0x0088
            int r8 = r8.length()     // Catch:{ all -> 0x009d }
            if (r8 != 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r8 = r4
            goto L_0x0089
        L_0x0088:
            r8 = r5
        L_0x0089:
            if (r8 == 0) goto L_0x008c
            goto L_0x005e
        L_0x008c:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r2)     // Catch:{ all -> 0x009d }
            if (r7 == 0) goto L_0x005e
            if (r14 == 0) goto L_0x009b
            java.lang.Object r10 = r0.getFirst()     // Catch:{ all -> 0x009d }
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x009d }
        L_0x009b:
            return r6
        L_0x009c:
            return r1
        L_0x009d:
            r10 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r10, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.InAppPurchaseManager.getDedupeParameter(android.os.Bundle, com.facebook.appevents.OperationalData, android.os.Bundle, com.facebook.appevents.OperationalData, boolean, boolean):java.lang.String");
    }
}
