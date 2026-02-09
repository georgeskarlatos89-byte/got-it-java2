package com.facebook.appevents.integrity;

import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001c\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/integrity/IntegrityManager;", "", "()V", "INTEGRITY_TYPE_ADDRESS", "", "INTEGRITY_TYPE_HEALTH", "INTEGRITY_TYPE_NONE", "RESTRICTIVE_ON_DEVICE_PARAMS_KEY", "enabled", "", "isSampleEnabled", "enable", "", "getIntegrityPredictionResult", "textFeature", "processParameters", "parameters", "", "shouldFilter", "input", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: IntegrityManager.kt */
public final class IntegrityManager {
    public static final IntegrityManager INSTANCE = new IntegrityManager();
    public static final String INTEGRITY_TYPE_ADDRESS = "address";
    public static final String INTEGRITY_TYPE_HEALTH = "health";
    public static final String INTEGRITY_TYPE_NONE = "none";
    private static final String RESTRICTIVE_ON_DEVICE_PARAMS_KEY = "_onDeviceParams";
    private static boolean enabled;
    private static boolean isSampleEnabled;

    private IntegrityManager() {
    }

    @JvmStatic
    public static final void enable() {
        Class<IntegrityManager> cls = IntegrityManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                enabled = true;
                isSampleEnabled = FetchedAppGateKeepersManager.getGateKeeperForKey("FBSDKFeatureIntegritySample", FacebookSdk.getApplicationId(), false);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void processParameters(Map<String, String> map) {
        Class<IntegrityManager> cls = IntegrityManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(map, "parameters");
                if (enabled && !map.isEmpty()) {
                    try {
                        List<String> list = CollectionsKt.toList(map.keySet());
                        JSONObject jSONObject = new JSONObject();
                        for (String str : list) {
                            String str2 = map.get(str);
                            if (str2 != null) {
                                String str3 = str2;
                                IntegrityManager integrityManager = INSTANCE;
                                if (integrityManager.shouldFilter(str) || integrityManager.shouldFilter(str3)) {
                                    map.remove(str);
                                    if (!isSampleEnabled) {
                                        str3 = "";
                                    }
                                    jSONObject.put(str, str3);
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                        }
                        if (jSONObject.length() != 0) {
                            String jSONObject2 = jSONObject.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject2, "restrictiveParamJson.toString()");
                            map.put(RESTRICTIVE_ON_DEVICE_PARAMS_KEY, jSONObject2);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final boolean shouldFilter(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return !Intrinsics.areEqual((Object) "none", (Object) getIntegrityPredictionResult(str));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r7 = r7[0];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getIntegrityPredictionResult(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 30
            float[] r2 = new float[r0]     // Catch:{ all -> 0x002e }
            r3 = 0
            r4 = r3
        L_0x000e:
            if (r4 >= r0) goto L_0x0016
            r5 = 0
            r2[r4] = r5     // Catch:{ all -> 0x002e }
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0016:
            com.facebook.appevents.ml.ModelManager$Task r0 = com.facebook.appevents.ml.ModelManager.Task.MTML_INTEGRITY_DETECT     // Catch:{ all -> 0x002e }
            r4 = 1
            float[][] r5 = new float[r4][]     // Catch:{ all -> 0x002e }
            r5[r3] = r2     // Catch:{ all -> 0x002e }
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch:{ all -> 0x002e }
            r2[r3] = r7     // Catch:{ all -> 0x002e }
            java.lang.String[] r7 = com.facebook.appevents.ml.ModelManager.predict(r0, r5, r2)     // Catch:{ all -> 0x002e }
            if (r7 == 0) goto L_0x002b
            r7 = r7[r3]     // Catch:{ all -> 0x002e }
            if (r7 != 0) goto L_0x002d
        L_0x002b:
            java.lang.String r7 = "none"
        L_0x002d:
            return r7
        L_0x002e:
            r7 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r7, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.IntegrityManager.getIntegrityPredictionResult(java.lang.String):java.lang.String");
    }
}
