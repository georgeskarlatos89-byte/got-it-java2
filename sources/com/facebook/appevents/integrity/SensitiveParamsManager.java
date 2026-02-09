package com.facebook.appevents.integrity;

import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J,\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00042\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b0\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/integrity/SensitiveParamsManager;", "", "()V", "DEFAULT_SENSITIVE_PARAMS_KEY", "", "SENSITIVE_PARAMS_KEY", "defaultSensitiveParameters", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "enabled", "", "sensitiveParameters", "", "disable", "", "enable", "loadSensitiveParameters", "processFilterSensitiveParams", "parameters", "Landroid/os/Bundle;", "eventName", "shouldFilterOut", "parameterKey", "sensitiveParamsForEvent", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SensitiveParamsManager.kt */
public final class SensitiveParamsManager {
    private static final String DEFAULT_SENSITIVE_PARAMS_KEY = "_MTSDK_Default_";
    public static final SensitiveParamsManager INSTANCE = new SensitiveParamsManager();
    private static final String SENSITIVE_PARAMS_KEY = "_filteredKey";
    private static HashSet<String> defaultSensitiveParameters = new HashSet<>();
    private static boolean enabled;
    private static Map<String, HashSet<String>> sensitiveParameters = new HashMap();

    private SensitiveParamsManager() {
    }

    @JvmStatic
    public static final void enable() {
        Class<SensitiveParamsManager> cls = SensitiveParamsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                INSTANCE.loadSensitiveParameters();
                if (!defaultSensitiveParameters.isEmpty() || !sensitiveParameters.isEmpty()) {
                    enabled = true;
                } else {
                    enabled = false;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void disable() {
        Class<SensitiveParamsManager> cls = SensitiveParamsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                enabled = false;
                sensitiveParameters = new HashMap();
                defaultSensitiveParameters = new HashSet<>();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void loadSensitiveParameters() {
        HashSet<String> convertJSONArrayToHashSet;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
                if (queryAppSettings != null) {
                    try {
                        defaultSensitiveParameters = new HashSet<>();
                        sensitiveParameters = new HashMap();
                        JSONArray sensitiveParams = queryAppSettings.getSensitiveParams();
                        if (sensitiveParams != null && sensitiveParams.length() != 0) {
                            int length = sensitiveParams.length();
                            for (int i = 0; i < length; i++) {
                                JSONObject jSONObject = sensitiveParams.getJSONObject(i);
                                boolean has = jSONObject.has(SDKConstants.PARAM_KEY);
                                boolean has2 = jSONObject.has("value");
                                if (has && has2) {
                                    String string = jSONObject.getString(SDKConstants.PARAM_KEY);
                                    JSONArray jSONArray = jSONObject.getJSONArray("value");
                                    if (!(jSONArray == null || (convertJSONArrayToHashSet = Utility.convertJSONArrayToHashSet(jSONArray)) == null)) {
                                        if (string.equals(DEFAULT_SENSITIVE_PARAMS_KEY)) {
                                            defaultSensitiveParameters = convertJSONArrayToHashSet;
                                        } else {
                                            Map<String, HashSet<String>> map = sensitiveParameters;
                                            Intrinsics.checkNotNullExpressionValue(string, "sensitiveParamsScope");
                                            map.put(string, convertJSONArrayToHashSet);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:14|15|16|(4:19|(2:21|31)(1:30)|29|17)|22|23|(2:25|32)(1:35)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[Catch:{ all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void processFilterSensitiveParams(android.os.Bundle r6, java.lang.String r7) {
        /*
            java.lang.Class<com.facebook.appevents.integrity.SensitiveParamsManager> r0 = com.facebook.appevents.integrity.SensitiveParamsManager.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "eventName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)     // Catch:{ all -> 0x0072 }
            boolean r1 = enabled     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0071
            if (r6 != 0) goto L_0x0015
            goto L_0x0071
        L_0x0015:
            java.util.HashSet<java.lang.String> r1 = defaultSensitiveParameters     // Catch:{ all -> 0x0072 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0026
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r1 = sensitiveParameters     // Catch:{ all -> 0x0072 }
            boolean r1 = r1.containsKey(r7)     // Catch:{ all -> 0x0072 }
            if (r1 != 0) goto L_0x0026
            return
        L_0x0026:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x0072 }
            r1.<init>()     // Catch:{ all -> 0x0072 }
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r2 = sensitiveParameters     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r7 = r2.get(r7)     // Catch:{ Exception -> 0x0062 }
            java.util.HashSet r7 = (java.util.HashSet) r7     // Catch:{ Exception -> 0x0062 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0062 }
            java.util.Set r3 = r6.keySet()     // Catch:{ Exception -> 0x0062 }
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ Exception -> 0x0062 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0062 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0062 }
        L_0x0042:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0062 }
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0062 }
            com.facebook.appevents.integrity.SensitiveParamsManager r4 = INSTANCE     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)     // Catch:{ Exception -> 0x0062 }
            boolean r4 = r4.shouldFilterOut(r3, r7)     // Catch:{ Exception -> 0x0062 }
            if (r4 == 0) goto L_0x0042
            r6.remove(r3)     // Catch:{ Exception -> 0x0062 }
            r1.put(r3)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0042
        L_0x0062:
            int r7 = r1.length()     // Catch:{ all -> 0x0072 }
            if (r7 <= 0) goto L_0x0071
            java.lang.String r7 = "_filteredKey"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0072 }
            r6.putString(r7, r1)     // Catch:{ all -> 0x0072 }
        L_0x0071:
            return
        L_0x0072:
            r6 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.SensitiveParamsManager.processFilterSensitiveParams(android.os.Bundle, java.lang.String):void");
    }

    private final boolean shouldFilterOut(String str, HashSet<String> hashSet) {
        boolean z;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (!defaultSensitiveParameters.contains(str)) {
                Collection collection = hashSet;
                if (collection != null) {
                    if (!collection.isEmpty()) {
                        z = false;
                        if (z || !hashSet.contains(str)) {
                            return false;
                        }
                    }
                }
                z = true;
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
