package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.SparseIntArray;
import androidx.autofill.HintConstants;
import androidx.core.app.FrameMetricsAggregator;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.Breadcrumb;
import io.sentry.HubAdapter;
import io.sentry.Integration;
import io.sentry.Scope;
import io.sentry.Sentry;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.AppStartState;
import io.sentry.android.core.BuildConfig;
import io.sentry.android.core.NdkIntegration;
import io.sentry.android.core.SentryAndroid;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryPackage;
import io.sentry.protocol.User;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

@ReactModule(name = "RNSentry")
public class RNSentryModule extends ReactContextBaseJavaModule {
    private static final int FROZEN_FRAME_THRESHOLD = 700;
    public static final String NAME = "RNSentry";
    private static final int SLOW_FRAME_THRESHOLD = 16;
    private static final Logger logger = Logger.getLogger("react-native-sentry");
    private boolean androidXAvailable = true;
    private boolean didFetchAppStart;
    private FrameMetricsAggregator frameMetricsAggregator = null;
    private PackageInfo packageInfo = null;

    public String getName() {
        return NAME;
    }

    public RNSentryModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.packageInfo = getPackageInfo(reactApplicationContext);
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("nativeClientAvailable", true);
        hashMap.put("nativeTransport", true);
        return hashMap;
    }

    @ReactMethod
    public void initNativeSdk(ReadableMap readableMap, Promise promise) {
        SentryAndroid.init((Context) getReactApplicationContext(), (Sentry.OptionsConfiguration<SentryAndroidOptions>) new RNSentryModule$$ExternalSyntheticLambda4(this, readableMap));
        promise.resolve(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$initNativeSdk$1$io-sentry-react-RNSentryModule  reason: not valid java name */
    public /* synthetic */ void m1097lambda$initNativeSdk$1$iosentryreactRNSentryModule(ReadableMap readableMap, SentryAndroidOptions sentryAndroidOptions) {
        if (readableMap.hasKey("debug") && readableMap.getBoolean("debug")) {
            sentryAndroidOptions.setDebug(true);
            logger.setLevel(Level.INFO);
        }
        if (!readableMap.hasKey("dsn") || readableMap.getString("dsn") == null) {
            sentryAndroidOptions.setDsn("");
        } else {
            String string = readableMap.getString("dsn");
            logger.info(String.format("Starting with DSN: '%s'", new Object[]{string}));
            sentryAndroidOptions.setDsn(string);
        }
        if (readableMap.hasKey("maxBreadcrumbs")) {
            sentryAndroidOptions.setMaxBreadcrumbs(readableMap.getInt("maxBreadcrumbs"));
        }
        if (readableMap.hasKey("maxCacheItems")) {
            sentryAndroidOptions.setMaxCacheItems(readableMap.getInt("maxCacheItems"));
        }
        if (readableMap.hasKey("environment") && readableMap.getString("environment") != null) {
            sentryAndroidOptions.setEnvironment(readableMap.getString("environment"));
        }
        if (readableMap.hasKey("release") && readableMap.getString("release") != null) {
            sentryAndroidOptions.setRelease(readableMap.getString("release"));
        }
        if (readableMap.hasKey("dist") && readableMap.getString("dist") != null) {
            sentryAndroidOptions.setDist(readableMap.getString("dist"));
        }
        if (readableMap.hasKey("enableAutoSessionTracking")) {
            sentryAndroidOptions.setEnableAutoSessionTracking(readableMap.getBoolean("enableAutoSessionTracking"));
        }
        if (readableMap.hasKey("sessionTrackingIntervalMillis")) {
            sentryAndroidOptions.setSessionTrackingIntervalMillis((long) readableMap.getInt("sessionTrackingIntervalMillis"));
        }
        if (readableMap.hasKey("shutdownTimeout")) {
            sentryAndroidOptions.setShutdownTimeout((long) readableMap.getInt("shutdownTimeout"));
        }
        if (readableMap.hasKey("enableNdkScopeSync")) {
            sentryAndroidOptions.setEnableScopeSync(readableMap.getBoolean("enableNdkScopeSync"));
        }
        if (readableMap.hasKey("attachStacktrace")) {
            sentryAndroidOptions.setAttachStacktrace(readableMap.getBoolean("attachStacktrace"));
        }
        if (readableMap.hasKey("attachThreads")) {
            sentryAndroidOptions.setAttachThreads(readableMap.getBoolean("attachThreads"));
        }
        if (readableMap.hasKey("sendDefaultPii")) {
            sentryAndroidOptions.setSendDefaultPii(readableMap.getBoolean("sendDefaultPii"));
        }
        if (!readableMap.hasKey("enableAutoPerformanceTracking") || !readableMap.getBoolean("enableAutoPerformanceTracking")) {
            disableNativeFramesTracking();
        } else {
            boolean checkAndroidXAvailability = checkAndroidXAvailability();
            this.androidXAvailable = checkAndroidXAvailability;
            if (checkAndroidXAvailability) {
                this.frameMetricsAggregator = new FrameMetricsAggregator();
                Activity currentActivity = getCurrentActivity();
                FrameMetricsAggregator frameMetricsAggregator2 = this.frameMetricsAggregator;
                if (!(frameMetricsAggregator2 == null || currentActivity == null)) {
                    try {
                        frameMetricsAggregator2.add(currentActivity);
                    } catch (Throwable unused) {
                        logger.warning("Error adding Activity to frameMetricsAggregator.");
                    }
                }
            } else {
                logger.warning("androidx.core' isn't available as a dependency.");
            }
        }
        sentryAndroidOptions.setBeforeSend(new RNSentryModule$$ExternalSyntheticLambda3(this, sentryAndroidOptions));
        if (readableMap.hasKey("enableNativeCrashHandling") && !readableMap.getBoolean("enableNativeCrashHandling")) {
            List<Integration> integrations = sentryAndroidOptions.getIntegrations();
            for (Integration next : integrations) {
                if ((next instanceof UncaughtExceptionHandlerIntegration) || (next instanceof AnrIntegration) || (next instanceof NdkIntegration)) {
                    integrations.remove(next);
                }
            }
        }
        logger.info(String.format("Native Integrations '%s'", new Object[]{sentryAndroidOptions.getIntegrations().toString()}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$initNativeSdk$0$io-sentry-react-RNSentryModule  reason: not valid java name */
    public /* synthetic */ SentryEvent m1096lambda$initNativeSdk$0$iosentryreactRNSentryModule(SentryAndroidOptions sentryAndroidOptions, SentryEvent sentryEvent, Object obj) {
        try {
            SentryException sentryException = sentryEvent.getExceptions().get(0);
            if (sentryException != null && sentryException.getType().contains("JavascriptException")) {
                return null;
            }
        } catch (Throwable unused) {
        }
        setEventOriginTag(sentryEvent);
        addPackages(sentryEvent, sentryAndroidOptions.getSdkVersion());
        return sentryEvent;
    }

    @ReactMethod
    public void crash() {
        throw new RuntimeException("TEST - Sentry Client Crash (only works in release mode)");
    }

    @ReactMethod
    public void fetchNativeRelease(Promise promise) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("id", this.packageInfo.packageName);
        createMap.putString("version", this.packageInfo.versionName);
        createMap.putString(InAppPurchaseConstants.METHOD_BUILD, String.valueOf(this.packageInfo.versionCode));
        promise.resolve(createMap);
    }

    @ReactMethod
    public void fetchNativeAppStart(Promise promise) {
        AppStartState instance = AppStartState.getInstance();
        Date appStartTime = instance.getAppStartTime();
        Boolean isColdStart = instance.isColdStart();
        if (appStartTime == null) {
            logger.warning("App start won't be sent due to missing appStartTime.");
            promise.resolve((Object) null);
        } else if (isColdStart == null) {
            logger.warning("App start won't be sent due to missing isColdStart.");
            promise.resolve((Object) null);
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("appStartTime", (double) appStartTime.getTime());
            createMap.putBoolean("isColdStart", isColdStart.booleanValue());
            createMap.putBoolean("didFetchAppStart", this.didFetchAppStart);
            promise.resolve(createMap);
        }
        this.didFetchAppStart = true;
    }

    @ReactMethod
    public void fetchNativeFrames(Promise promise) {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!isFrameMetricsAggregatorAvailable()) {
            promise.resolve((Object) null);
            return;
        }
        try {
            SparseIntArray[] metrics = this.frameMetricsAggregator.getMetrics();
            int i3 = 0;
            if (metrics == null || (sparseIntArray = metrics[0]) == null) {
                i2 = 0;
                i = 0;
            } else {
                int i4 = 0;
                i2 = 0;
                i = 0;
                while (i3 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i3);
                    int valueAt = sparseIntArray.valueAt(i3);
                    i4 += valueAt;
                    if (keyAt > 700) {
                        i += valueAt;
                    } else if (keyAt > 16) {
                        i2 += valueAt;
                    }
                    i3++;
                }
                i3 = i4;
            }
            if (i3 == 0 && i2 == 0 && i == 0) {
                promise.resolve((Object) null);
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("totalFrames", i3);
            createMap.putInt("slowFrames", i2);
            createMap.putInt("frozenFrames", i);
            promise.resolve(createMap);
        } catch (Throwable unused) {
            logger.warning("Error fetching native frames.");
            promise.resolve((Object) null);
        }
    }

    @ReactMethod
    public void captureEnvelope(String str, Promise promise) {
        FileOutputStream fileOutputStream;
        try {
            String outboxPath = HubAdapter.getInstance().getOptions().getOutboxPath();
            if (outboxPath == null) {
                logger.severe("Error retrieving outboxPath. Envelope will not be sent. Is the Android SDK initialized?");
            } else {
                fileOutputStream = new FileOutputStream(new File(outboxPath, UUID.randomUUID().toString()));
                fileOutputStream.write(str.getBytes(Charset.forName("UTF-8")));
                fileOutputStream.close();
            }
        } catch (Throwable unused) {
            logger.severe("Error reading envelope");
        }
        promise.resolve(true);
        return;
        throw th;
    }

    @ReactMethod
    public void getStringBytesLength(String str, Promise promise) {
        try {
            promise.resolve(Integer.valueOf(str.getBytes("UTF-8").length));
        } catch (UnsupportedEncodingException e) {
            promise.reject((Throwable) e);
        }
    }

    private static PackageInfo getPackageInfo(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            logger.warning("Error getting package info.");
            return null;
        }
    }

    @ReactMethod
    public void setUser(ReadableMap readableMap, ReadableMap readableMap2) {
        Sentry.configureScope(new RNSentryModule$$ExternalSyntheticLambda1(readableMap, readableMap2));
    }

    static /* synthetic */ void lambda$setUser$2(ReadableMap readableMap, ReadableMap readableMap2, Scope scope) {
        if (readableMap == null && readableMap2 == null) {
            scope.setUser((User) null);
            return;
        }
        User user = new User();
        if (readableMap != null) {
            if (readableMap.hasKey("email")) {
                user.setEmail(readableMap.getString("email"));
            }
            if (readableMap.hasKey("id")) {
                user.setId(readableMap.getString("id"));
            }
            if (readableMap.hasKey(HintConstants.AUTOFILL_HINT_USERNAME)) {
                user.setUsername(readableMap.getString(HintConstants.AUTOFILL_HINT_USERNAME));
            }
            if (readableMap.hasKey("ip_address")) {
                user.setIpAddress(readableMap.getString("ip_address"));
            }
        }
        if (readableMap2 != null) {
            HashMap hashMap = new HashMap();
            ReadableMapKeySetIterator keySetIterator = readableMap2.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                hashMap.put(nextKey, readableMap2.getString(nextKey));
            }
            user.setOthers(hashMap);
        }
        scope.setUser(user);
    }

    @ReactMethod
    public void addBreadcrumb(ReadableMap readableMap) {
        Sentry.configureScope(new RNSentryModule$$ExternalSyntheticLambda0(readableMap));
    }

    static /* synthetic */ void lambda$addBreadcrumb$3(ReadableMap readableMap, Scope scope) {
        Breadcrumb breadcrumb = new Breadcrumb();
        if (readableMap.hasKey("message")) {
            breadcrumb.setMessage(readableMap.getString("message"));
        }
        if (readableMap.hasKey("type")) {
            breadcrumb.setType(readableMap.getString("type"));
        }
        if (readableMap.hasKey("category")) {
            breadcrumb.setCategory(readableMap.getString("category"));
        }
        if (readableMap.hasKey(FirebaseAnalytics.Param.LEVEL)) {
            String string = readableMap.getString(FirebaseAnalytics.Param.LEVEL);
            string.hashCode();
            char c = 65535;
            switch (string.hashCode()) {
                case 3237038:
                    if (string.equals("info")) {
                        c = 0;
                        break;
                    }
                    break;
                case 95458899:
                    if (string.equals("debug")) {
                        c = 1;
                        break;
                    }
                    break;
                case 96784904:
                    if (string.equals("error")) {
                        c = 2;
                        break;
                    }
                    break;
                case 97203460:
                    if (string.equals("fatal")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1124446108:
                    if (string.equals("warning")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    breadcrumb.setLevel(SentryLevel.INFO);
                    break;
                case 1:
                    breadcrumb.setLevel(SentryLevel.DEBUG);
                    break;
                case 2:
                    breadcrumb.setLevel(SentryLevel.ERROR);
                    break;
                case 3:
                    breadcrumb.setLevel(SentryLevel.FATAL);
                    break;
                case 4:
                    breadcrumb.setLevel(SentryLevel.WARNING);
                    break;
                default:
                    breadcrumb.setLevel(SentryLevel.ERROR);
                    break;
            }
        }
        if (readableMap.hasKey("data")) {
            ReadableMap map = readableMap.getMap("data");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                breadcrumb.setData(nextKey, map.getString(nextKey));
            }
        }
        scope.addBreadcrumb(breadcrumb);
    }

    @ReactMethod
    public void clearBreadcrumbs() {
        Sentry.configureScope(new RNSentryModule$$ExternalSyntheticLambda5());
    }

    @ReactMethod
    public void setExtra(String str, String str2) {
        Sentry.configureScope(new RNSentryModule$$ExternalSyntheticLambda7(str, str2));
    }

    @ReactMethod
    public void setContext(String str, ReadableMap readableMap) {
        if (str != null && readableMap != null) {
            Sentry.configureScope(new RNSentryModule$$ExternalSyntheticLambda2(readableMap, str));
        }
    }

    @ReactMethod
    public void setTag(String str, String str2) {
        Sentry.configureScope(new RNSentryModule$$ExternalSyntheticLambda6(str, str2));
    }

    @ReactMethod
    public void closeNativeSdk(Promise promise) {
        Sentry.close();
        disableNativeFramesTracking();
        promise.resolve(true);
    }

    @ReactMethod
    public void disableNativeFramesTracking() {
        if (isFrameMetricsAggregatorAvailable()) {
            this.frameMetricsAggregator.stop();
            this.frameMetricsAggregator = null;
        }
    }

    private void setEventOriginTag(SentryEvent sentryEvent) {
        SdkVersion sdk = sentryEvent.getSdk();
        if (sdk != null) {
            String name = sdk.getName();
            name.hashCode();
            if (name.equals("sentry.native")) {
                setEventEnvironmentTag(sentryEvent, "android", AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE);
            } else if (name.equals(BuildConfig.SENTRY_ANDROID_SDK_NAME)) {
                setEventEnvironmentTag(sentryEvent, "android", SentryBaseEvent.DEFAULT_PLATFORM);
            }
        }
    }

    private void setEventEnvironmentTag(SentryEvent sentryEvent, String str, String str2) {
        sentryEvent.setTag("event.origin", str);
        sentryEvent.setTag("event.environment", str2);
    }

    private void addPackages(SentryEvent sentryEvent, SdkVersion sdkVersion) {
        SdkVersion sdk = sentryEvent.getSdk();
        if (sdk != null && sdk.getName().equals("sentry.javascript.react-native") && sdkVersion != null) {
            List<SentryPackage> packages = sdkVersion.getPackages();
            if (packages != null) {
                for (SentryPackage next : packages) {
                    sdk.addPackage(next.getName(), next.getVersion());
                }
            }
            List<String> integrations = sdkVersion.getIntegrations();
            if (integrations != null) {
                for (String addIntegration : integrations) {
                    sdk.addIntegration(addIntegration);
                }
            }
            sentryEvent.setSdk(sdk);
        }
    }

    private boolean checkAndroidXAvailability() {
        try {
            Class.forName("androidx.core.app.FrameMetricsAggregator");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private boolean isFrameMetricsAggregatorAvailable() {
        return this.androidXAvailable && this.frameMetricsAggregator != null;
    }
}
