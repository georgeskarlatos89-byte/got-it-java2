package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\f\u001a\u00020\nH\u0002J\"\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/integrity/BannedParamManager;", "", "()V", "bannedParamsConfig", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "enabled", "", "disable", "", "enable", "loadConfigs", "loadSet", "paramValues", "Lorg/json/JSONArray;", "processFilterBannedParams", "parameters", "Landroid/os/Bundle;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: BannedParamManager.kt */
public final class BannedParamManager {
    public static final BannedParamManager INSTANCE = new BannedParamManager();
    private static HashSet<String> bannedParamsConfig = new HashSet<>();
    private static boolean enabled;

    private BannedParamManager() {
    }

    @JvmStatic
    public static final void enable() {
        Class<BannedParamManager> cls = BannedParamManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (!enabled) {
                    INSTANCE.loadConfigs();
                    enabled = !bannedParamsConfig.isEmpty();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void disable() {
        Class<BannedParamManager> cls = BannedParamManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                enabled = false;
                bannedParamsConfig = new HashSet<>();
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
                    bannedParamsConfig = loadSet(queryAppSettings.getBannedParams());
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.BannedParamManager.loadSet(org.json.JSONArray):java.util.HashSet");
    }

    @JvmStatic
    public static final void processFilterBannedParams(Bundle bundle) {
        Class<BannedParamManager> cls = BannedParamManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (!enabled) {
                    return;
                }
                if (bundle != null) {
                    for (String str : bannedParamsConfig) {
                        if (bundle != null) {
                            bundle.remove(str);
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }
}
