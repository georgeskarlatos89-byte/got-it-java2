package com.facebook.appevents.iap;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018JK\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u00122\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u001b\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0007JR\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u00152\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007J\b\u0010#\u001a\u00020\u0017H\u0007J4\u0010$\u001a\u00020\u001e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\u001eH\u0007J\b\u0010&\u001a\u00020\u001eH\u0007J\b\u0010'\u001a\u00020\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseLoggerManager;", "", "()V", "APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME", "", "APP_HAS_BEEN_LAUNCHED_KEY", "", "CACHED_PURCHASES_KEY", "IAP_CACHE_GPBLV2V7", "IAP_CACHE_OLD", "IAP_PURCHASE_CACHE_GPBLV1", "IAP_SKU_CACHE_GPBLV1", "MILLISECONDS_IN_SECONDS", "", "PURCHASE_TIME", "TIME_OF_LAST_LOGGED_PURCHASE_KEY", "TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY", "cacheDeDupPurchase", "", "Lorg/json/JSONObject;", "purchaseDetailsMap", "", "isSubscription", "", "cacheDeDupPurchase$facebook_core_release", "constructLoggingReadyMap", "skuDetailsMap", "packageName", "constructLoggingReadyMap$facebook_core_release", "deleteOldCacheHistory", "", "filterPurchaseLogging", "billingClientVersion", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "isFirstAppLaunch", "getIsFirstAppLaunchWithNewIAP", "logPurchases", "migrateOldCacheHistory", "setAppHasBeenLaunchedWithNewIAP", "updateLatestPossiblePurchaseTime", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: InAppPurchaseLoggerManager.kt */
public final class InAppPurchaseLoggerManager {
    private static final long APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME = 1736528400000L;
    private static final String APP_HAS_BEEN_LAUNCHED_KEY = "APP_HAS_BEEN_LAUNCHED_KEY";
    private static final String CACHED_PURCHASES_KEY = "PURCHASE_DETAILS_SET";
    private static final String IAP_CACHE_GPBLV2V7 = "com.facebook.internal.iap.IAP_CACHE_GPBLV2V7";
    private static final String IAP_CACHE_OLD = "com.facebook.internal.iap.PRODUCT_DETAILS";
    private static final String IAP_PURCHASE_CACHE_GPBLV1 = "com.facebook.internal.PURCHASE";
    private static final String IAP_SKU_CACHE_GPBLV1 = "com.facebook.internal.SKU_DETAILS";
    public static final InAppPurchaseLoggerManager INSTANCE = new InAppPurchaseLoggerManager();
    private static final double MILLISECONDS_IN_SECONDS = 1000.0d;
    private static final String PURCHASE_TIME = "purchaseTime";
    private static final String TIME_OF_LAST_LOGGED_PURCHASE_KEY = "TIME_OF_LAST_LOGGED_PURCHASE";
    private static final String TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY = "TIME_OF_LAST_LOGGED_SUBSCRIPTION";

    private InAppPurchaseLoggerManager() {
    }

    @JvmStatic
    public static final void migrateOldCacheHistory() {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0);
                long max = Math.max(Math.max(sharedPreferences.getLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, 0), sharedPreferences.getLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, 0)), APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME);
                Set<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_OLD, 0);
                if (sharedPreferences2.contains(CACHED_PURCHASES_KEY)) {
                    Collection stringSet = sharedPreferences2.getStringSet(CACHED_PURCHASES_KEY, new HashSet());
                    if (stringSet == null) {
                        stringSet = new HashSet();
                    }
                    copyOnWriteArraySet.addAll(stringSet);
                    for (String split$default : copyOnWriteArraySet) {
                        try {
                            long parseLong = Long.parseLong((String) StringsKt.split$default((CharSequence) split$default, new String[]{";"}, false, 2, 2, (Object) null).get(1)) * 1000;
                            if (((double) Math.abs(String.valueOf(parseLong).length() - 13)) < Math.log10(MILLISECONDS_IN_SECONDS)) {
                                max = Math.max(max, parseLong);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, max).apply();
                sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, max).apply();
                deleteOldCacheHistory();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void deleteOldCacheHistory() {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(IAP_SKU_CACHE_GPBLV1, 0);
                SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences(IAP_PURCHASE_CACHE_GPBLV1, 0);
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
                FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_OLD, 0).edit().clear().apply();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final boolean getIsFirstAppLaunchWithNewIAP() {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            return !FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0).contains(APP_HAS_BEEN_LAUNCHED_KEY);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    @JvmStatic
    public static final void setAppHasBeenLaunchedWithNewIAP() {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                try {
                    FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0).edit().putBoolean(APP_HAS_BEEN_LAUNCHED_KEY, true).apply();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void updateLatestPossiblePurchaseTime() {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                setAppHasBeenLaunchedWithNewIAP();
                try {
                    SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, currentTimeMillis).apply();
                    sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, currentTimeMillis).apply();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void filterPurchaseLogging(Map<String, JSONObject> map, Map<String, ? extends JSONObject> map2, boolean z, String str, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z2) {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(map, "purchaseDetailsMap");
                Intrinsics.checkNotNullParameter(map2, "skuDetailsMap");
                Intrinsics.checkNotNullParameter(str, "packageName");
                Intrinsics.checkNotNullParameter(billingClientVersion, "billingClientVersion");
                InAppPurchaseLoggerManager inAppPurchaseLoggerManager = INSTANCE;
                inAppPurchaseLoggerManager.logPurchases(inAppPurchaseLoggerManager.constructLoggingReadyMap$facebook_core_release(inAppPurchaseLoggerManager.cacheDeDupPurchase$facebook_core_release(map, z), map2, str), z, billingClientVersion, z2);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void logPurchases(Map<String, String> map, boolean z, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z2) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    AutomaticAnalyticsLogger.logPurchase((String) next.getKey(), (String) next.getValue(), z, billingClientVersion, z2);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final Map<String, JSONObject> cacheDeDupPurchase$facebook_core_release(Map<String, JSONObject> map, boolean z) {
        long j;
        Map<String, JSONObject> map2 = map;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(map2, "purchaseDetailsMap");
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0);
            if (z) {
                j = sharedPreferences.getLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME);
            } else {
                j = sharedPreferences.getLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME);
            }
            long j2 = 0;
            for (Map.Entry next : MapsKt.toMap(map).entrySet()) {
                String str = (String) next.getKey();
                JSONObject jSONObject = (JSONObject) next.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j3 = jSONObject.getLong("purchaseTime");
                        if (j3 <= j) {
                            map2.remove(str);
                        }
                        j2 = Math.max(j2, j3);
                    }
                } catch (Exception unused) {
                }
            }
            if (j2 >= j) {
                if (z) {
                    sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, j2).apply();
                } else {
                    sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, j2).apply();
                }
            }
            return new HashMap<>(map2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final Map<String, String> constructLoggingReadyMap$facebook_core_release(Map<String, ? extends JSONObject> map, Map<String, ? extends JSONObject> map2, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(map, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(map2, "skuDetailsMap");
            Intrinsics.checkNotNullParameter(str, "packageName");
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            for (Map.Entry next : map.entrySet()) {
                JSONObject jSONObject = (JSONObject) next.getValue();
                JSONObject jSONObject2 = (JSONObject) map2.get((String) next.getKey());
                try {
                    jSONObject.put("packageName", str);
                    if (jSONObject2 != null) {
                        String jSONObject3 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject3, "purchaseDetail.toString()");
                        String jSONObject4 = jSONObject2.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject4, "skuDetail.toString()");
                        linkedHashMap.put(jSONObject3, jSONObject4);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
