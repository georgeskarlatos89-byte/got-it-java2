package co.gotitapp.giap;

import ai.gotit.giap.GIAP;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.module.annotations.ReactModule;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = "GotItAnalytics")
public class GotItAnalyticsModule extends ReactContextBaseJavaModule {
    public static final String NAME = "GotItAnalytics";
    GIAP giap;

    public String getName() {
        return NAME;
    }

    public GotItAnalyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    static JSONObject reactToJSON(ReadableMap readableMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    jSONObject.put(nextKey, JSONObject.NULL);
                    break;
                case 2:
                    jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 4:
                    jSONObject.put(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    jSONObject.put(nextKey, reactToJSON(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    jSONObject.put(nextKey, reactToJSON(readableMap.getArray(nextKey)));
                    break;
            }
        }
        return jSONObject;
    }

    /* renamed from: co.gotitapp.giap.GotItAnalyticsModule$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$facebook$react$bridge$ReadableType = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: co.gotitapp.giap.GotItAnalyticsModule.AnonymousClass1.<clinit>():void");
        }
    }

    static JSONArray reactToJSON(ReadableArray readableArray) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()]) {
                case 1:
                    jSONArray.put(JSONObject.NULL);
                    break;
                case 2:
                    jSONArray.put(readableArray.getBoolean(i));
                    break;
                case 3:
                    jSONArray.put(readableArray.getDouble(i));
                    break;
                case 4:
                    jSONArray.put(readableArray.getString(i));
                    break;
                case 5:
                    jSONArray.put(reactToJSON(readableArray.getMap(i)));
                    break;
                case 6:
                    jSONArray.put(reactToJSON(readableArray.getArray(i)));
                    break;
            }
        }
        return jSONArray;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        return;
     */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setup(java.lang.String r3, java.lang.String r4, com.facebook.react.bridge.Promise r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            ai.gotit.giap.GIAP r0 = r2.giap     // Catch:{ all -> 0x0037 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r5.resolve(r1)     // Catch:{ all -> 0x0037 }
            goto L_0x0035
        L_0x000a:
            ai.gotit.giap.GIAP r0 = ai.gotit.giap.GIAP.getInstance()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x001a
            ai.gotit.giap.GIAP r3 = ai.gotit.giap.GIAP.getInstance()     // Catch:{ all -> 0x0037 }
            r2.giap = r3     // Catch:{ all -> 0x0037 }
            r5.resolve(r1)     // Catch:{ all -> 0x0037 }
            goto L_0x0035
        L_0x001a:
            com.facebook.react.bridge.ReactApplicationContext r0 = r2.getReactApplicationContext()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x002c
            java.lang.Throwable r3 = new java.lang.Throwable     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = "no React application context"
            r3.<init>(r4)     // Catch:{ all -> 0x0037 }
            r5.reject((java.lang.Throwable) r3)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            return
        L_0x002c:
            ai.gotit.giap.GIAP r3 = ai.gotit.giap.GIAP.initialize(r4, r3, r0)     // Catch:{ all -> 0x0037 }
            r2.giap = r3     // Catch:{ all -> 0x0037 }
            r5.resolve(r1)     // Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: co.gotitapp.giap.GotItAnalyticsModule.setup(java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void createAlias(String str) {
        this.giap.alias(str);
    }

    @ReactMethod
    public void identify(String str) {
        this.giap.identify(str);
    }

    @ReactMethod
    public void track(String str, Promise promise) {
        synchronized (this.giap) {
            this.giap.track(str);
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void trackWithProperties(String str, ReadableMap readableMap, Promise promise) {
        JSONObject jSONObject;
        try {
            jSONObject = reactToJSON(readableMap);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        synchronized (this.giap) {
            this.giap.track(str, jSONObject);
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void set(ReadableMap readableMap, Promise promise) {
        JSONObject jSONObject;
        try {
            jSONObject = reactToJSON(readableMap);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        synchronized (this.giap) {
            this.giap.updateProfile(jSONObject);
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void reset() {
        this.giap.reset();
    }
}
