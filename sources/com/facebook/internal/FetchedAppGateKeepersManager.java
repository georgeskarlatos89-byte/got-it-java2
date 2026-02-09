package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.gatekeeper.GateKeeper;
import com.facebook.internal.gatekeeper.GateKeeperRuntimeCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u00013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u001fH\u0007J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004J\u0017\u0010$\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020'J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0012H\u0007J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0002\b+J\b\u0010,\u001a\u00020'H\u0002J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001fH\u0007J\b\u0010/\u001a\u00020'H\u0007J\u001a\u00100\u001a\u00020'2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\u0006\u00101\u001a\u000202H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0004\n\u0002\u0010\u001b¨\u00064"}, d2 = {"Lcom/facebook/internal/FetchedAppGateKeepersManager;", "", "()V", "APPLICATION_FIELDS", "", "APPLICATION_GATEKEEPER_CACHE_TIMEOUT", "", "APPLICATION_GATEKEEPER_EDGE", "APPLICATION_GATEKEEPER_FIELD", "APPLICATION_GRAPH_DATA", "APPLICATION_PLATFORM", "APPLICATION_SDK_VERSION", "APP_GATEKEEPERS_PREFS_KEY_FORMAT", "APP_GATEKEEPERS_PREFS_STORE", "APP_PLATFORM", "TAG", "callbacks", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/facebook/internal/FetchedAppGateKeepersManager$Callback;", "fetchedAppGateKeepers", "", "Lorg/json/JSONObject;", "gateKeeperRuntimeCache", "Lcom/facebook/internal/gatekeeper/GateKeeperRuntimeCache;", "isLoading", "Ljava/util/concurrent/atomic/AtomicBoolean;", "timestamp", "Ljava/lang/Long;", "getAppGateKeepersQueryResponse", "applicationId", "getGateKeeperForKey", "", "name", "defaultValue", "getGateKeepersForApplication", "", "isTimestampValid", "(Ljava/lang/Long;)Z", "loadAppGateKeepersAsync", "", "callback", "parseAppGateKeepersFromJSON", "gateKeepersJSON", "parseAppGateKeepersFromJSON$facebook_core_release", "pollCallbacks", "queryAppGateKeepers", "forceRequery", "resetRuntimeGateKeeperCache", "setRuntimeGateKeeper", "gateKeeper", "Lcom/facebook/internal/gatekeeper/GateKeeper;", "Callback", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FetchedAppGateKeepersManager.kt */
public final class FetchedAppGateKeepersManager {
    private static final String APPLICATION_FIELDS = "fields";
    private static final long APPLICATION_GATEKEEPER_CACHE_TIMEOUT = 3600000;
    private static final String APPLICATION_GATEKEEPER_EDGE = "mobile_sdk_gk";
    private static final String APPLICATION_GATEKEEPER_FIELD = "gatekeepers";
    private static final String APPLICATION_GRAPH_DATA = "data";
    private static final String APPLICATION_PLATFORM = "platform";
    private static final String APPLICATION_SDK_VERSION = "sdk_version";
    private static final String APP_GATEKEEPERS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_GATEKEEPERS.%s";
    private static final String APP_GATEKEEPERS_PREFS_STORE = "com.facebook.internal.preferences.APP_GATEKEEPERS";
    private static final String APP_PLATFORM = "android";
    public static final FetchedAppGateKeepersManager INSTANCE = new FetchedAppGateKeepersManager();
    private static final String TAG = Reflection.getOrCreateKotlinClass(FetchedAppGateKeepersManager.class).getSimpleName();
    private static final ConcurrentLinkedQueue<Callback> callbacks = new ConcurrentLinkedQueue<>();
    private static final Map<String, JSONObject> fetchedAppGateKeepers = new ConcurrentHashMap();
    private static GateKeeperRuntimeCache gateKeeperRuntimeCache;
    private static final AtomicBoolean isLoading = new AtomicBoolean(false);
    private static Long timestamp;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/FetchedAppGateKeepersManager$Callback;", "", "onCompleted", "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FetchedAppGateKeepersManager.kt */
    public interface Callback {
        void onCompleted();
    }

    private FetchedAppGateKeepersManager() {
    }

    public final void loadAppGateKeepersAsync() {
        loadAppGateKeepersAsync((Callback) null);
    }

    @JvmStatic
    public static final synchronized void loadAppGateKeepersAsync(Callback callback) {
        synchronized (FetchedAppGateKeepersManager.class) {
            if (callback != null) {
                callbacks.add(callback);
            }
            String applicationId = FacebookSdk.getApplicationId();
            FetchedAppGateKeepersManager fetchedAppGateKeepersManager = INSTANCE;
            if (!fetchedAppGateKeepersManager.isTimestampValid(timestamp) || !fetchedAppGateKeepers.containsKey(applicationId)) {
                Context applicationContext = FacebookSdk.getApplicationContext();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                if (applicationContext != null) {
                    JSONObject jSONObject = null;
                    String string = applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).getString(format, (String) null);
                    if (!Utility.isNullOrEmpty(string)) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e) {
                            Utility.logd(Utility.LOG_TAG, (Exception) e);
                        }
                        if (jSONObject != null) {
                            parseAppGateKeepersFromJSON$facebook_core_release(applicationId, jSONObject);
                        }
                    }
                    Executor executor = FacebookSdk.getExecutor();
                    if (executor != null) {
                        if (isLoading.compareAndSet(false, true)) {
                            executor.execute(new FetchedAppGateKeepersManager$$ExternalSyntheticLambda0(applicationId, applicationContext, format));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            fetchedAppGateKeepersManager.pollCallbacks();
        }
    }

    /* access modifiers changed from: private */
    public static final void loadAppGateKeepersAsync$lambda$0(String str, Context context, String str2) {
        Intrinsics.checkNotNullParameter(str, "$applicationId");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(str2, "$gateKeepersKey");
        FetchedAppGateKeepersManager fetchedAppGateKeepersManager = INSTANCE;
        JSONObject appGateKeepersQueryResponse = fetchedAppGateKeepersManager.getAppGateKeepersQueryResponse(str);
        if (appGateKeepersQueryResponse.length() != 0) {
            parseAppGateKeepersFromJSON$facebook_core_release(str, appGateKeepersQueryResponse);
            context.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).edit().putString(str2, appGateKeepersQueryResponse.toString()).apply();
            timestamp = Long.valueOf(System.currentTimeMillis());
        }
        fetchedAppGateKeepersManager.pollCallbacks();
        isLoading.set(false);
    }

    private final void pollCallbacks() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<Callback> concurrentLinkedQueue = callbacks;
            if (!concurrentLinkedQueue.isEmpty()) {
                Callback poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new FetchedAppGateKeepersManager$$ExternalSyntheticLambda1(poll));
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void pollCallbacks$lambda$1(Callback callback) {
        callback.onCompleted();
    }

    @JvmStatic
    public static final JSONObject queryAppGateKeepers(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "applicationId");
        if (!z) {
            Map<String, JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(str)) {
                JSONObject jSONObject = map.get(str);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject appGateKeepersQueryResponse = INSTANCE.getAppGateKeepersQueryResponse(str);
        Context applicationContext = FacebookSdk.getApplicationContext();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).edit().putString(format, appGateKeepersQueryResponse.toString()).apply();
        return parseAppGateKeepersFromJSON$facebook_core_release(str, appGateKeepersQueryResponse);
    }

    public final Map<String, Boolean> getGateKeepersForApplication(String str) {
        loadAppGateKeepersAsync();
        if (str != null) {
            Map<String, JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(str)) {
                GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
                List<GateKeeper> dumpGateKeepers = gateKeeperRuntimeCache2 != null ? gateKeeperRuntimeCache2.dumpGateKeepers(str) : null;
                if (dumpGateKeepers != null) {
                    HashMap hashMap = new HashMap();
                    for (GateKeeper gateKeeper : dumpGateKeepers) {
                        hashMap.put(gateKeeper.getName(), Boolean.valueOf(gateKeeper.getValue()));
                    }
                    return hashMap;
                }
                Map<String, Boolean> hashMap2 = new HashMap<>();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Intrinsics.checkNotNullExpressionValue(next, SDKConstants.PARAM_KEY);
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
                if (gateKeeperRuntimeCache3 == null) {
                    gateKeeperRuntimeCache3 = new GateKeeperRuntimeCache();
                }
                Collection arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry next2 : hashMap2.entrySet()) {
                    arrayList.add(new GateKeeper((String) next2.getKey(), ((Boolean) next2.getValue()).booleanValue()));
                }
                gateKeeperRuntimeCache3.setGateKeepers(str, (List) arrayList);
                gateKeeperRuntimeCache = gateKeeperRuntimeCache3;
                return hashMap2;
            }
        }
        return new HashMap<>();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r1 = r2.get(r1);
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean getGateKeeperForKey(java.lang.String r1, java.lang.String r2, boolean r3) {
        /*
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            com.facebook.internal.FetchedAppGateKeepersManager r0 = INSTANCE
            java.util.Map r2 = r0.getGateKeepersForApplication(r2)
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x0012
            goto L_0x001e
        L_0x0012:
            java.lang.Object r1 = r2.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x001e
            boolean r3 = r1.booleanValue()
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppGateKeepersManager.getGateKeeperForKey(java.lang.String, java.lang.String, boolean):boolean");
    }

    public static /* synthetic */ void setRuntimeGateKeeper$default(String str, GateKeeper gateKeeper, int i, Object obj) {
        if ((i & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        setRuntimeGateKeeper(str, gateKeeper);
    }

    @JvmStatic
    public static final void setRuntimeGateKeeper(String str, GateKeeper gateKeeper) {
        Intrinsics.checkNotNullParameter(str, "applicationId");
        Intrinsics.checkNotNullParameter(gateKeeper, "gateKeeper");
        GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        if ((gateKeeperRuntimeCache2 != null ? gateKeeperRuntimeCache2.getGateKeeper(str, gateKeeper.getName()) : null) != null) {
            GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
            if (gateKeeperRuntimeCache3 != null) {
                gateKeeperRuntimeCache3.setGateKeeper(str, gateKeeper);
                return;
            }
            return;
        }
        Log.w(TAG, "Missing gatekeeper runtime cache");
    }

    @JvmStatic
    public static final void resetRuntimeGateKeeperCache() {
        GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        if (gateKeeperRuntimeCache2 != null) {
            GateKeeperRuntimeCache.resetCache$default(gateKeeperRuntimeCache2, (String) null, 1, (Object) null);
        }
    }

    private final JSONObject getAppGateKeepersQueryResponse(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(APPLICATION_PLATFORM, "android");
        bundle.putString("sdk_version", FacebookSdk.getSdkVersion());
        bundle.putString("fields", APPLICATION_GATEKEEPER_FIELD);
        GraphRequest.Companion companion = GraphRequest.Companion;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{APPLICATION_GATEKEEPER_EDGE}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        GraphRequest newGraphPathRequest = companion.newGraphPathRequest((AccessToken) null, format, (GraphRequest.Callback) null);
        newGraphPathRequest.setParameters(bundle);
        JSONObject jsonObject = newGraphPathRequest.executeAndWait().getJsonObject();
        return jsonObject == null ? new JSONObject() : jsonObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r8 = r8.optJSONArray("data");
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized org.json.JSONObject parseAppGateKeepersFromJSON$facebook_core_release(java.lang.String r7, org.json.JSONObject r8) {
        /*
            java.lang.Class<com.facebook.internal.FetchedAppGateKeepersManager> r0 = com.facebook.internal.FetchedAppGateKeepersManager.class
            monitor-enter(r0)
            java.lang.String r1 = "applicationId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)     // Catch:{ all -> 0x0068 }
            java.util.Map<java.lang.String, org.json.JSONObject> r1 = fetchedAppGateKeepers     // Catch:{ all -> 0x0068 }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ all -> 0x0068 }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ all -> 0x0068 }
            if (r1 != 0) goto L_0x0017
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0068 }
            r1.<init>()     // Catch:{ all -> 0x0068 }
        L_0x0017:
            r2 = 0
            if (r8 == 0) goto L_0x0027
            java.lang.String r3 = "data"
            org.json.JSONArray r8 = r8.optJSONArray(r3)     // Catch:{ all -> 0x0068 }
            if (r8 == 0) goto L_0x0027
            org.json.JSONObject r8 = r8.optJSONObject(r2)     // Catch:{ all -> 0x0068 }
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            if (r8 != 0) goto L_0x002f
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x0068 }
            r8.<init>()     // Catch:{ all -> 0x0068 }
        L_0x002f:
            java.lang.String r3 = "gatekeepers"
            org.json.JSONArray r8 = r8.optJSONArray(r3)     // Catch:{ all -> 0x0068 }
            if (r8 != 0) goto L_0x003c
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ all -> 0x0068 }
            r8.<init>()     // Catch:{ all -> 0x0068 }
        L_0x003c:
            int r3 = r8.length()     // Catch:{ all -> 0x0068 }
        L_0x0040:
            if (r2 >= r3) goto L_0x0061
            org.json.JSONObject r4 = r8.getJSONObject(r2)     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r5 = "key"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r6 = "value"
            boolean r4 = r4.getBoolean(r6)     // Catch:{ JSONException -> 0x0056 }
            r1.put(r5, r4)     // Catch:{ JSONException -> 0x0056 }
            goto L_0x005e
        L_0x0056:
            r4 = move-exception
            java.lang.String r5 = "FacebookSDK"
            java.lang.Exception r4 = (java.lang.Exception) r4     // Catch:{ all -> 0x0068 }
            com.facebook.internal.Utility.logd((java.lang.String) r5, (java.lang.Exception) r4)     // Catch:{ all -> 0x0068 }
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x0061:
            java.util.Map<java.lang.String, org.json.JSONObject> r8 = fetchedAppGateKeepers     // Catch:{ all -> 0x0068 }
            r8.put(r7, r1)     // Catch:{ all -> 0x0068 }
            monitor-exit(r0)
            return r1
        L_0x0068:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppGateKeepersManager.parseAppGateKeepersFromJSON$facebook_core_release(java.lang.String, org.json.JSONObject):org.json.JSONObject");
    }

    private final boolean isTimestampValid(Long l) {
        return l != null && System.currentTimeMillis() - l.longValue() < APPLICATION_GATEKEEPER_CACHE_TIMEOUT;
    }
}
