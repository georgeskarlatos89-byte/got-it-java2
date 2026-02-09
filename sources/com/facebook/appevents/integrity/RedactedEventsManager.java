package com.facebook.appevents.integrity;

import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\bj\b\u0012\u0004\u0012\u00020\u0007`\t0\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/integrity/RedactedEventsManager;", "", "()V", "enabled", "", "redactedEvents", "", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "disable", "", "enable", "getRedactionString", "eventName", "loadRedactedEvents", "processEventsRedaction", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RedactedEventsManager.kt */
public final class RedactedEventsManager {
    public static final RedactedEventsManager INSTANCE = new RedactedEventsManager();
    private static boolean enabled;
    private static Map<String, HashSet<String>> redactedEvents = new HashMap();

    private RedactedEventsManager() {
    }

    @JvmStatic
    public static final void enable() {
        Class<RedactedEventsManager> cls = RedactedEventsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                INSTANCE.loadRedactedEvents();
                if (!redactedEvents.isEmpty()) {
                    enabled = true;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void disable() {
        Class<RedactedEventsManager> cls = RedactedEventsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                enabled = false;
                redactedEvents = new HashMap();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void loadRedactedEvents() {
        HashSet<String> convertJSONArrayToHashSet;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
                if (queryAppSettings != null) {
                    try {
                        redactedEvents = new HashMap();
                        JSONArray redactedEvents2 = queryAppSettings.getRedactedEvents();
                        if (redactedEvents2 != null && redactedEvents2.length() != 0) {
                            int length = redactedEvents2.length();
                            for (int i = 0; i < length; i++) {
                                JSONObject jSONObject = redactedEvents2.getJSONObject(i);
                                boolean has = jSONObject.has(SDKConstants.PARAM_KEY);
                                boolean has2 = jSONObject.has("value");
                                if (has && has2) {
                                    String string = jSONObject.getString(SDKConstants.PARAM_KEY);
                                    JSONArray jSONArray = jSONObject.getJSONArray("value");
                                    if (!(string == null || (convertJSONArrayToHashSet = Utility.convertJSONArrayToHashSet(jSONArray)) == null)) {
                                        redactedEvents.put(string, convertJSONArrayToHashSet);
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r0 = INSTANCE.getRedactionString(r3);
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String processEventsRedaction(java.lang.String r3) {
        /*
            java.lang.Class<com.facebook.appevents.integrity.RedactedEventsManager> r0 = com.facebook.appevents.integrity.RedactedEventsManager.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "eventName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)     // Catch:{ all -> 0x001d }
            boolean r1 = enabled     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001c
            com.facebook.appevents.integrity.RedactedEventsManager r1 = INSTANCE     // Catch:{ all -> 0x001d }
            java.lang.String r0 = r1.getRedactionString(r3)     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001c
            return r0
        L_0x001c:
            return r3
        L_0x001d:
            r3 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.RedactedEventsManager.processEventsRedaction(java.lang.String):java.lang.String");
    }

    private final String getRedactionString(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            for (String str2 : redactedEvents.keySet()) {
                HashSet hashSet = redactedEvents.get(str2);
                if (hashSet != null && hashSet.contains(str)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
