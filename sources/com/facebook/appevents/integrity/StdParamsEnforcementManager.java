package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014H\u0002J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00072\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014H\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\"\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00070\bj\b\u0012\u0004\u0012\u00020\u0007`\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u001a\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\bj\b\u0012\u0004\u0012\u00020\u0007`\t0\u0006X\u000e¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\bj\b\u0012\u0004\u0012\u00020\u0007`\t0\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/facebook/appevents/integrity/StdParamsEnforcementManager;", "", "()V", "enabled", "", "enumRestrictionsConfig", "", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "regexRestrictionsConfig", "configureSchemaRestrictions", "", "schema", "Lorg/json/JSONArray;", "disable", "enable", "isAnyEnumMatched", "value", "enumValues", "", "isAnyRegexMatched", "expressions", "loadConfigs", "loadSet", "paramValues", "processFilterParamSchemaBlocking", "parameters", "Landroid/os/Bundle;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: StdParamsEnforcementManager.kt */
public final class StdParamsEnforcementManager {
    public static final StdParamsEnforcementManager INSTANCE = new StdParamsEnforcementManager();
    private static boolean enabled;
    private static Map<String, HashSet<String>> enumRestrictionsConfig = new HashMap();
    private static Map<String, HashSet<String>> regexRestrictionsConfig = new HashMap();

    private StdParamsEnforcementManager() {
    }

    @JvmStatic
    public static final void enable() {
        boolean z;
        Class<StdParamsEnforcementManager> cls = StdParamsEnforcementManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (!enabled) {
                    INSTANCE.loadConfigs();
                    if (regexRestrictionsConfig.isEmpty()) {
                        if (enumRestrictionsConfig.isEmpty()) {
                            z = false;
                            enabled = z;
                        }
                    }
                    z = true;
                    enabled = z;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void disable() {
        Class<StdParamsEnforcementManager> cls = StdParamsEnforcementManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                enabled = false;
                regexRestrictionsConfig = new HashMap();
                enumRestrictionsConfig = new HashMap();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void loadConfigs() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
                if (queryAppSettings != null) {
                    configureSchemaRestrictions(queryAppSettings.getSchemaRestrictions());
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:32|33|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        enumRestrictionsConfig.remove(r5);
        regexRestrictionsConfig.remove(r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x008e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void configureSchemaRestrictions(org.json.JSONArray r12) {
        /*
            r11 = this;
            java.lang.String r0 = "key"
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r11)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            if (r12 == 0) goto L_0x00a1
            boolean r1 = enabled     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0011
            goto L_0x00a1
        L_0x0011:
            int r1 = r12.length()     // Catch:{ all -> 0x009d }
            r2 = 0
            r3 = r2
        L_0x0017:
            if (r3 >= r1) goto L_0x009c
            org.json.JSONObject r4 = r12.getJSONObject(r3)     // Catch:{ all -> 0x009d }
            java.lang.String r5 = r4.getString(r0)     // Catch:{ all -> 0x009d }
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x009d }
            if (r6 == 0) goto L_0x002f
            int r6 = r6.length()     // Catch:{ all -> 0x009d }
            if (r6 != 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r6 = r2
            goto L_0x0030
        L_0x002f:
            r6 = 1
        L_0x0030:
            if (r6 == 0) goto L_0x0033
            goto L_0x0098
        L_0x0033:
            java.lang.String r6 = "value"
            org.json.JSONArray r4 = r4.getJSONArray(r6)     // Catch:{ Exception -> 0x008e }
            int r6 = r4.length()     // Catch:{ Exception -> 0x008e }
            r7 = r2
        L_0x003e:
            if (r7 >= r6) goto L_0x0098
            org.json.JSONObject r8 = r4.getJSONObject(r7)     // Catch:{ Exception -> 0x008e }
            java.lang.String r9 = "require_exact_match"
            boolean r8 = r8.getBoolean(r9)     // Catch:{ Exception -> 0x008e }
            org.json.JSONObject r9 = r4.getJSONObject(r7)     // Catch:{ Exception -> 0x008e }
            java.lang.String r10 = "potential_matches"
            org.json.JSONArray r9 = r9.getJSONArray(r10)     // Catch:{ Exception -> 0x008e }
            java.util.HashSet r9 = r11.loadSet(r9)     // Catch:{ Exception -> 0x008e }
            if (r8 == 0) goto L_0x0073
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r8 = enumRestrictionsConfig     // Catch:{ Exception -> 0x008e }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch:{ Exception -> 0x008e }
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r10 = enumRestrictionsConfig     // Catch:{ Exception -> 0x008e }
            java.lang.Object r10 = r10.get(r5)     // Catch:{ Exception -> 0x008e }
            java.util.HashSet r10 = (java.util.HashSet) r10     // Catch:{ Exception -> 0x008e }
            if (r10 == 0) goto L_0x006f
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ Exception -> 0x008e }
            r10.addAll(r9)     // Catch:{ Exception -> 0x008e }
            r9 = r10
        L_0x006f:
            r8.put(r5, r9)     // Catch:{ Exception -> 0x008e }
            goto L_0x008b
        L_0x0073:
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r8 = regexRestrictionsConfig     // Catch:{ Exception -> 0x008e }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch:{ Exception -> 0x008e }
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r10 = regexRestrictionsConfig     // Catch:{ Exception -> 0x008e }
            java.lang.Object r10 = r10.get(r5)     // Catch:{ Exception -> 0x008e }
            java.util.HashSet r10 = (java.util.HashSet) r10     // Catch:{ Exception -> 0x008e }
            if (r10 == 0) goto L_0x0088
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ Exception -> 0x008e }
            r10.addAll(r9)     // Catch:{ Exception -> 0x008e }
            r9 = r10
        L_0x0088:
            r8.put(r5, r9)     // Catch:{ Exception -> 0x008e }
        L_0x008b:
            int r7 = r7 + 1
            goto L_0x003e
        L_0x008e:
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r4 = enumRestrictionsConfig     // Catch:{ all -> 0x009d }
            r4.remove(r5)     // Catch:{ all -> 0x009d }
            java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> r4 = regexRestrictionsConfig     // Catch:{ all -> 0x009d }
            r4.remove(r5)     // Catch:{ all -> 0x009d }
        L_0x0098:
            int r3 = r3 + 1
            goto L_0x0017
        L_0x009c:
            return
        L_0x009d:
            r12 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r12, r11)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.StdParamsEnforcementManager.configureSchemaRestrictions(org.json.JSONArray):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return new java.util.HashSet<>();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.HashSet<java.lang.String> loadSet(org.json.JSONArray r3) {
        /*
            r2 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r2)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.HashSet r3 = com.facebook.internal.Utility.convertJSONArrayToHashSet(r3)     // Catch:{ Exception -> 0x0016 }
            if (r3 != 0) goto L_0x001b
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ Exception -> 0x0016 }
            r3.<init>()     // Catch:{ Exception -> 0x0016 }
            goto L_0x001b
        L_0x0014:
            r3 = move-exception
            goto L_0x001c
        L_0x0016:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0014 }
            r3.<init>()     // Catch:{ all -> 0x0014 }
        L_0x001b:
            return r3
        L_0x001c:
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.StdParamsEnforcementManager.loadSet(org.json.JSONArray):java.util.HashSet");
    }

    @JvmStatic
    public static final void processFilterParamSchemaBlocking(Bundle bundle) {
        Class<StdParamsEnforcementManager> cls = StdParamsEnforcementManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (!enabled) {
                    return;
                }
                if (bundle != null) {
                    List<String> arrayList = new ArrayList<>();
                    for (String str : bundle.keySet()) {
                        String valueOf = String.valueOf(bundle.get(str));
                        boolean z = true;
                        boolean z2 = regexRestrictionsConfig.get(str) != null;
                        if (enumRestrictionsConfig.get(str) == null) {
                            z = false;
                        }
                        if (z2 || z) {
                            StdParamsEnforcementManager stdParamsEnforcementManager = INSTANCE;
                            boolean isAnyRegexMatched = stdParamsEnforcementManager.isAnyRegexMatched(valueOf, regexRestrictionsConfig.get(str));
                            boolean isAnyEnumMatched = stdParamsEnforcementManager.isAnyEnumMatched(valueOf, enumRestrictionsConfig.get(str));
                            if (!isAnyRegexMatched && !isAnyEnumMatched) {
                                Intrinsics.checkNotNullExpressionValue(str, SDKConstants.PARAM_KEY);
                                arrayList.add(str);
                            }
                        }
                    }
                    for (String remove : arrayList) {
                        bundle.remove(remove);
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final boolean isAnyRegexMatched(String str, Set<String> set) {
        if (CrashShieldHandler.isObjectCrashing(this) || set == null) {
            return false;
        }
        try {
            Iterable<String> iterable = set;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (String regex : iterable) {
                if (new Regex(regex).matches(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isAnyEnumMatched(String str, Set<String> set) {
        if (CrashShieldHandler.isObjectCrashing(this) || set == null) {
            return false;
        }
        try {
            Iterable<String> iterable = set;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (String lowerCase : iterable) {
                String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase3 = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (Intrinsics.areEqual((Object) lowerCase2, (Object) lowerCase3)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
