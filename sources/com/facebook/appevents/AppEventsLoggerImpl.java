package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import com.braintreepayments.api.AnalyticsClient;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.UserSettingsManager;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.gps.pa.PACustomAudienceClient;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.InstallReferrerUtil;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 <2\u00020\u0001:\u0001<B%\b\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0018\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0019J\"\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017JG\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fJ\u001a\u0010 \u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0005J:\u0010\"\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ)\u0010\"\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010'J\u0001\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010/\u001a\u0004\u0018\u00010\u00052\b\u00100\u001a\u0004\u0018\u00010\u00052\b\u00101\u001a\u0004\u0018\u00010\u00052\b\u00102\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u00103\u001a\u0004\u0018\u00010\u00052\b\u00104\u001a\u0004\u0018\u00010\u00052\b\u00105\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u001a\u00106\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&J&\u00106\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017J8\u00106\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ0\u00107\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0018\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00172\b\u0010:\u001a\u0004\u0018\u00010\u0005J'\u0010;\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010'R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/facebook/appevents/AppEventsLoggerImpl;", "", "context", "Landroid/content/Context;", "applicationId", "", "accessToken", "Lcom/facebook/AccessToken;", "(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "activityName", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "accessTokenAppId", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "getApplicationId", "()Ljava/lang/String;", "contextName", "flush", "", "isValidForAccessToken", "", "logEvent", "eventName", "parameters", "Landroid/os/Bundle;", "valueToSum", "", "isImplicitlyLogged", "currentSessionId", "Ljava/util/UUID;", "operationalData", "Lcom/facebook/appevents/OperationalData;", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZLjava/util/UUID;Lcom/facebook/appevents/OperationalData;)V", "logEventFromSE", "buttonText", "logEventImplicitly", "purchaseAmount", "Ljava/math/BigDecimal;", "currency", "Ljava/util/Currency;", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "logProductItem", "itemID", "availability", "Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;", "condition", "Lcom/facebook/appevents/AppEventsLogger$ProductCondition;", "description", "imageLink", "link", "title", "priceAmount", "gtin", "mpn", "brand", "logPurchase", "logPurchaseImplicitly", "logPushNotificationOpen", "payload", "action", "logSdkEvent", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppEventsLoggerImpl.kt */
public final class AppEventsLoggerImpl {
    private static final String ACCOUNT_KIT_EVENT_NAME_PREFIX = "fb_ak";
    public static final String APP_EVENTS_KILLSWITCH = "app_events_killswitch";
    private static final String APP_EVENT_NAME_PUSH_OPENED = "fb_mobile_push_opened";
    private static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
    private static final String APP_EVENT_PUSH_PARAMETER_ACTION = "fb_push_action";
    private static final String APP_EVENT_PUSH_PARAMETER_CAMPAIGN = "fb_push_campaign";
    private static final int APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS = 86400;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String PUSH_PAYLOAD_CAMPAIGN_KEY = "campaign";
    private static final String PUSH_PAYLOAD_KEY = "fb_push_payload";
    private static final String TAG;
    private static String anonymousAppDeviceGUID;
    private static ScheduledThreadPoolExecutor backgroundExecutor;
    private static AppEventsLogger.FlushBehavior flushBehaviorField = AppEventsLogger.FlushBehavior.AUTO;
    private static boolean isActivateAppEventRequested;
    private static String pushNotificationsRegistrationIdField;
    private static final Object staticLock = new Object();
    private AccessTokenAppIdPair accessTokenAppId;
    private final String contextName;

    @JvmStatic
    public static final void activateApp(Application application, String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.activateApp(application, str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final Pair<Bundle, OperationalData> addImplicitPurchaseParameters(Bundle bundle, OperationalData operationalData) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.addImplicitPurchaseParameters(bundle, operationalData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final void augmentWebView(WebView webView, Context context) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.augmentWebView(webView, context);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void functionDEPRECATED(String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.functionDEPRECATED(str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final Executor getAnalyticsExecutor() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getAnalyticsExecutor();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final String getAnonymousAppDeviceGUID(Context context) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getAnonymousAppDeviceGUID(context);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final AppEventsLogger.FlushBehavior getFlushBehavior() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getFlushBehavior();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final String getInstallReferrer() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getInstallReferrer();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final String getPushNotificationsRegistrationId() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getPushNotificationsRegistrationId();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final void initializeLib(Context context, String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.initializeLib(context, str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void onContextStop() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.onContextStop();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void setFlushBehavior(AppEventsLogger.FlushBehavior flushBehavior) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.setFlushBehavior(flushBehavior);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void setInstallReferrer(String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.setInstallReferrer(str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void setPushNotificationsRegistrationId(String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.setPushNotificationsRegistrationId(str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public AppEventsLoggerImpl(String str, String str2, AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(str, "activityName");
        Validate.sdkInitialized();
        this.contextName = str;
        accessToken = accessToken == null ? AccessToken.Companion.getCurrentAccessToken() : accessToken;
        if (accessToken == null || accessToken.isExpired() || (str2 != null && !Intrinsics.areEqual((Object) str2, (Object) accessToken.getApplicationId()))) {
            str2 = str2 == null ? Utility.getMetadataApplicationId(FacebookSdk.getApplicationContext()) : str2;
            if (str2 != null) {
                this.accessTokenAppId = new AccessTokenAppIdPair((String) null, str2);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } else {
            this.accessTokenAppId = new AccessTokenAppIdPair(accessToken);
        }
        Companion.initializeTimersIfNeeded();
    }

    public static final /* synthetic */ String access$getAnonymousAppDeviceGUID$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return anonymousAppDeviceGUID;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return backgroundExecutor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ AppEventsLogger.FlushBehavior access$getFlushBehaviorField$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return flushBehaviorField;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ String access$getPushNotificationsRegistrationIdField$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return pushNotificationsRegistrationIdField;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ Object access$getStaticLock$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return staticLock;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ boolean access$isActivateAppEventRequested$cp() {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            return isActivateAppEventRequested;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    public static final /* synthetic */ void access$setActivateAppEventRequested$cp(boolean z) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                isActivateAppEventRequested = z;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$setAnonymousAppDeviceGUID$cp(String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                anonymousAppDeviceGUID = str;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$setBackgroundExecutor$cp(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                backgroundExecutor = scheduledThreadPoolExecutor;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$setFlushBehaviorField$cp(AppEventsLogger.FlushBehavior flushBehavior) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                flushBehaviorField = flushBehavior;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$setPushNotificationsRegistrationIdField$cp(String str) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                pushNotificationsRegistrationIdField = str;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public AppEventsLoggerImpl(Context context, String str, AccessToken accessToken) {
        this(Utility.getActivityName(context), str, accessToken);
    }

    public final void logEvent(String str) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                logEvent(str, (Bundle) null);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static /* synthetic */ void logEvent$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, Bundle bundle, int i, Object obj) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            try {
                appEventsLoggerImpl.logEvent(str, bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public final void logEvent(String str, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                logEvent$default(this, str, (Double) null, bundle, false, ActivityLifecycleTracker.getCurrentSessionGuid(), (OperationalData) null, 32, (Object) null);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logEvent(String str, double d) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                logEvent(str, d, (Bundle) null);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logEvent(String str, double d, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                logEvent$default(this, str, Double.valueOf(d), bundle, false, ActivityLifecycleTracker.getCurrentSessionGuid(), (OperationalData) null, 32, (Object) null);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logEventFromSE(String str, String str2) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                logEvent(str, bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                logPurchase(bigDecimal, currency, (Bundle) null);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static /* synthetic */ void logPurchase$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, int i, Object obj) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            if ((i & 4) != 0) {
                bundle = null;
            }
            try {
                appEventsLoggerImpl.logPurchase(bigDecimal, currency, bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                logPurchase$default(this, bigDecimal, currency, bundle, false, (OperationalData) null, 16, (Object) null);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static /* synthetic */ void logPurchaseImplicitly$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i, Object obj) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            if ((i & 8) != 0) {
                operationalData = null;
            }
            try {
                appEventsLoggerImpl.logPurchaseImplicitly(bigDecimal, currency, bundle, operationalData);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public final void logPurchaseImplicitly(BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                logPurchase(bigDecimal, currency, bundle, true, operationalData);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static /* synthetic */ void logPurchase$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z, OperationalData operationalData, int i, Object obj) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            if ((i & 16) != 0) {
                operationalData = null;
            }
            try {
                appEventsLoggerImpl.logPurchase(bigDecimal, currency, bundle, z, operationalData);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z, OperationalData operationalData) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (bigDecimal == null) {
                try {
                    Companion.notifyDeveloperError("purchaseAmount cannot be null");
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } else if (currency == null) {
                Companion.notifyDeveloperError("currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
                logEvent(AppEventsConstants.EVENT_NAME_PURCHASED, Double.valueOf(bigDecimal.doubleValue()), bundle2, z, ActivityLifecycleTracker.getCurrentSessionGuid(), operationalData);
                Companion.eagerFlush();
            }
        }
    }

    public final void logPushNotificationOpen(Bundle bundle, String str) {
        String str2;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Intrinsics.checkNotNullParameter(bundle, "payload");
                try {
                    String string = bundle.getString(PUSH_PAYLOAD_KEY);
                    if (!Utility.isNullOrEmpty(string)) {
                        str2 = new JSONObject(string).getString("campaign");
                        if (str2 == null) {
                            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "Malformed payload specified for logging a push notification open.");
                            return;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(APP_EVENT_PUSH_PARAMETER_CAMPAIGN, str2);
                        if (str != null) {
                            bundle2.putString(APP_EVENT_PUSH_PARAMETER_ACTION, str);
                        }
                        logEvent(APP_EVENT_NAME_PUSH_OPENED, bundle2);
                    }
                } catch (JSONException unused) {
                    str2 = null;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void logProductItem(String str, AppEventsLogger.ProductAvailability productAvailability, AppEventsLogger.ProductCondition productCondition, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Currency currency, String str6, String str7, String str8, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (str == null) {
                try {
                    Companion.notifyDeveloperError("itemID cannot be null");
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } else if (productAvailability == null) {
                Companion.notifyDeveloperError("availability cannot be null");
            } else if (productCondition == null) {
                Companion.notifyDeveloperError("condition cannot be null");
            } else if (str2 == null) {
                Companion.notifyDeveloperError("description cannot be null");
            } else if (str3 == null) {
                Companion.notifyDeveloperError("imageLink cannot be null");
            } else if (str4 == null) {
                Companion.notifyDeveloperError("link cannot be null");
            } else if (str5 == null) {
                Companion.notifyDeveloperError("title cannot be null");
            } else if (bigDecimal == null) {
                Companion.notifyDeveloperError("priceAmount cannot be null");
            } else if (currency == null) {
                Companion.notifyDeveloperError("currency cannot be null");
            } else if (str6 == null && str7 == null && str8 == null) {
                Companion.notifyDeveloperError("Either gtin, mpn or brand is required");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_ITEM_ID, str);
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_AVAILABILITY, productAvailability.name());
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_CONDITION, productCondition.name());
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_DESCRIPTION, str2);
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_IMAGE_LINK, str3);
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_LINK, str4);
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_TITLE, str5);
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_PRICE_AMOUNT, bigDecimal.setScale(3, 4).toString());
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_PRICE_CURRENCY, currency.getCurrencyCode());
                if (str6 != null) {
                    bundle.putString(Constants.EVENT_PARAM_PRODUCT_GTIN, str6);
                }
                if (str7 != null) {
                    bundle.putString(Constants.EVENT_PARAM_PRODUCT_MPN, str7);
                }
                if (str8 != null) {
                    bundle.putString(Constants.EVENT_PARAM_PRODUCT_BRAND, str8);
                }
                logEvent(AppEventsConstants.EVENT_NAME_PRODUCT_CATALOG_UPDATE, bundle);
                Companion.eagerFlush();
            }
        }
    }

    public final void flush() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                AppEventQueue.flush(FlushReason.EXPLICIT);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final boolean isValidForAccessToken(AccessToken accessToken) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(accessToken, SDKConstants.PARAM_ACCESS_TOKEN);
            return Intrinsics.areEqual((Object) this.accessTokenAppId, (Object) new AccessTokenAppIdPair(accessToken));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public final void logSdkEvent(String str, Double d, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Intrinsics.checkNotNullParameter(str, AnalyticsClient.WORK_INPUT_KEY_EVENT_NAME);
                if (!StringsKt.startsWith$default(str, ACCOUNT_KIT_EVENT_NAME_PREFIX, false, 2, (Object) null)) {
                    Log.e(TAG, "logSdkEvent is deprecated and only supports account kit for legacy, please use logEvent instead");
                } else if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                    logEvent$default(this, str, d, bundle, true, ActivityLifecycleTracker.getCurrentSessionGuid(), (OperationalData) null, 32, (Object) null);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final String getApplicationId() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.accessTokenAppId.getApplicationId();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void logEventImplicitly(String str, Double d, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                logEvent$default(this, str, d, bundle, true, ActivityLifecycleTracker.getCurrentSessionGuid(), (OperationalData) null, 32, (Object) null);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static /* synthetic */ void logEventImplicitly$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i, Object obj) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            if ((i & 16) != 0) {
                operationalData = null;
            }
            try {
                appEventsLoggerImpl.logEventImplicitly(str, bigDecimal, currency, bundle, operationalData);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public final void logEventImplicitly(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (bigDecimal == null || currency == null) {
                Utility.logd(TAG, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                    return;
                }
            }
            Bundle bundle2 = bundle;
            bundle2.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
            logEvent(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, ActivityLifecycleTracker.getCurrentSessionGuid(), operationalData);
        }
    }

    public static /* synthetic */ void logEvent$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, Double d, Bundle bundle, boolean z, UUID uuid, OperationalData operationalData, int i, Object obj) {
        Class<AppEventsLoggerImpl> cls = AppEventsLoggerImpl.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            if ((i & 32) != 0) {
                operationalData = null;
            }
            try {
                appEventsLoggerImpl.logEvent(str, d, bundle, z, uuid, operationalData);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) com.facebook.appevents.AppEventsConstants.EVENT_NAME_START_TRIAL) == false) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024 A[Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e, all -> 0x0144 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[ADDED_TO_REGION, Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4 A[SYNTHETIC, Splitter:B:43:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d2 A[Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e, all -> 0x0144 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void logEvent(java.lang.String r18, java.lang.Double r19, android.os.Bundle r20, boolean r21, java.util.UUID r22, com.facebook.appevents.OperationalData r23) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r20
            r3 = r23
            java.lang.String r4 = "fb_mobile_purchase"
            boolean r5 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r17)
            if (r5 == 0) goto L_0x0011
            return
        L_0x0011:
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x0144 }
            r11 = 1
            r12 = 0
            if (r5 == 0) goto L_0x0021
            int r5 = r5.length()     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r5 = r12
            goto L_0x0022
        L_0x0021:
            r5 = r11
        L_0x0022:
            if (r5 == 0) goto L_0x0025
            return
        L_0x0025:
            if (r21 != 0) goto L_0x00b4
            boolean r5 = com.facebook.appevents.internal.AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()     // Catch:{ all -> 0x0144 }
            if (r5 == 0) goto L_0x00b4
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r4)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = "StartTrial"
            java.lang.String r7 = "Subscribe"
            if (r5 != 0) goto L_0x0043
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r7)     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x0043
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r6)     // Catch:{ all -> 0x0144 }
            if (r5 == 0) goto L_0x00b4
        L_0x0043:
            java.lang.String r5 = TAG     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events"
            android.util.Log.w(r5, r8)     // Catch:{ all -> 0x0144 }
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe     // Catch:{ all -> 0x0144 }
            boolean r5 = com.facebook.internal.FeatureManager.isEnabled(r5)     // Catch:{ all -> 0x0144 }
            if (r5 == 0) goto L_0x0058
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r4)     // Catch:{ all -> 0x0144 }
            if (r4 != 0) goto L_0x006c
        L_0x0058:
            com.facebook.internal.FeatureManager$Feature r4 = com.facebook.internal.FeatureManager.Feature.AndroidManualImplicitSubsDedupe     // Catch:{ all -> 0x0144 }
            boolean r4 = com.facebook.internal.FeatureManager.isEnabled(r4)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x00b4
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r7)     // Catch:{ all -> 0x0144 }
            if (r4 != 0) goto L_0x006c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r6)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x00b4
        L_0x006c:
            com.facebook.appevents.iap.InAppPurchaseDedupeConfig r4 = com.facebook.appevents.iap.InAppPurchaseDedupeConfig.INSTANCE     // Catch:{ all -> 0x0144 }
            r5 = r19
            java.lang.Double r4 = r4.getValueOfManualEvent(r5, r2)     // Catch:{ all -> 0x0144 }
            com.facebook.appevents.iap.InAppPurchaseDedupeConfig r6 = com.facebook.appevents.iap.InAppPurchaseDedupeConfig.INSTANCE     // Catch:{ all -> 0x0144 }
            java.util.Currency r6 = r6.getCurrencyOfManualEvent(r2)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x00b6
            if (r6 == 0) goto L_0x00b6
            com.facebook.appevents.iap.InAppPurchase r7 = new com.facebook.appevents.iap.InAppPurchase     // Catch:{ all -> 0x0144 }
            double r8 = r4.doubleValue()     // Catch:{ all -> 0x0144 }
            r7.<init>(r0, r8, r6)     // Catch:{ all -> 0x0144 }
            java.util.List r4 = kotlin.collections.CollectionsKt.listOf(r7)     // Catch:{ all -> 0x0144 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0144 }
            kotlin.Pair r8 = new kotlin.Pair     // Catch:{ all -> 0x0144 }
            r8.<init>(r2, r3)     // Catch:{ all -> 0x0144 }
            java.util.List r8 = kotlin.collections.CollectionsKt.listOf(r8)     // Catch:{ all -> 0x0144 }
            android.os.Bundle r4 = com.facebook.appevents.iap.InAppPurchaseManager.performDedupe(r4, r6, r12, r8)     // Catch:{ all -> 0x0144 }
            com.facebook.appevents.iap.InAppPurchaseDedupeConfig r6 = com.facebook.appevents.iap.InAppPurchaseDedupeConfig.INSTANCE     // Catch:{ all -> 0x0144 }
            kotlin.Pair r2 = r6.addDedupeParameters(r4, r2, r3)     // Catch:{ all -> 0x0144 }
            java.lang.Object r3 = r2.component1()     // Catch:{ all -> 0x0144 }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x0144 }
            java.lang.Object r2 = r2.component2()     // Catch:{ all -> 0x0144 }
            com.facebook.appevents.OperationalData r2 = (com.facebook.appevents.OperationalData) r2     // Catch:{ all -> 0x0144 }
            r16 = r3
            r3 = r2
            r2 = r16
            goto L_0x00b6
        L_0x00b4:
            r5 = r19
        L_0x00b6:
            java.lang.String r4 = "app_events_killswitch"
            java.lang.String r6 = com.facebook.FacebookSdk.getApplicationId()     // Catch:{ all -> 0x0144 }
            boolean r4 = com.facebook.internal.FetchedAppGateKeepersManager.getGateKeeperForKey(r4, r6, r12)     // Catch:{ all -> 0x0144 }
            java.lang.String r13 = "AppEvents"
            if (r4 == 0) goto L_0x00d2
            com.facebook.internal.Logger$Companion r2 = com.facebook.internal.Logger.Companion     // Catch:{ all -> 0x0144 }
            com.facebook.LoggingBehavior r3 = com.facebook.LoggingBehavior.APP_EVENTS     // Catch:{ all -> 0x0144 }
            java.lang.String r4 = "KillSwitch is enabled and fail to log app event: %s"
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ all -> 0x0144 }
            r5[r12] = r0     // Catch:{ all -> 0x0144 }
            r2.log((com.facebook.LoggingBehavior) r3, (java.lang.String) r13, (java.lang.String) r4, (java.lang.Object[]) r5)     // Catch:{ all -> 0x0144 }
            return
        L_0x00d2:
            boolean r4 = com.facebook.appevents.integrity.BlocklistEventsManager.isInBlocklist(r18)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x00d9
            return
        L_0x00d9:
            com.facebook.appevents.AppEventsLoggerImpl$Companion r14 = Companion     // Catch:{ all -> 0x0144 }
            kotlin.Pair r2 = r14.addImplicitPurchaseParameters(r2, r3)     // Catch:{ all -> 0x0144 }
            java.lang.Object r3 = r2.component1()     // Catch:{ all -> 0x0144 }
            r6 = r3
            android.os.Bundle r6 = (android.os.Bundle) r6     // Catch:{ all -> 0x0144 }
            java.lang.Object r2 = r2.component2()     // Catch:{ all -> 0x0144 }
            r10 = r2
            com.facebook.appevents.OperationalData r10 = (com.facebook.appevents.OperationalData) r10     // Catch:{ all -> 0x0144 }
            com.facebook.appevents.integrity.ProtectedModeManager r2 = com.facebook.appevents.integrity.ProtectedModeManager.INSTANCE     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
            boolean r2 = r2.protectedModeIsApplied(r6)     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
            if (r2 != 0) goto L_0x00f8
            com.facebook.appevents.integrity.SensitiveParamsManager.processFilterSensitiveParams(r6, r0)     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
        L_0x00f8:
            com.facebook.appevents.integrity.BannedParamManager.processFilterBannedParams(r6)     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
            com.facebook.appevents.integrity.MACARuleMatchingManager.processParameters(r6, r0)     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
            com.facebook.appevents.integrity.StdParamsEnforcementManager.processFilterParamSchemaBlocking(r6)     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
            com.facebook.appevents.integrity.ProtectedModeManager.processParametersForProtectedMode(r6)     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
            com.facebook.appevents.AppEvent r15 = new com.facebook.appevents.AppEvent     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
            java.lang.String r3 = r1.contextName     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
            boolean r8 = com.facebook.appevents.internal.ActivityLifecycleTracker.isInBackground()     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
            r2 = r15
            r4 = r18
            r5 = r19
            r7 = r21
            r9 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
            com.facebook.appevents.AccessTokenAppIdPair r0 = r1.accessTokenAppId     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
            r14.logEvent(r15, r0)     // Catch:{ JSONException -> 0x0131, FacebookException -> 0x011e }
            goto L_0x0143
        L_0x011e:
            r0 = move-exception
            com.facebook.internal.Logger$Companion r2 = com.facebook.internal.Logger.Companion     // Catch:{ all -> 0x0144 }
            com.facebook.LoggingBehavior r3 = com.facebook.LoggingBehavior.APP_EVENTS     // Catch:{ all -> 0x0144 }
            java.lang.String r4 = "Invalid app event: %s"
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0144 }
            r5[r12] = r0     // Catch:{ all -> 0x0144 }
            r2.log((com.facebook.LoggingBehavior) r3, (java.lang.String) r13, (java.lang.String) r4, (java.lang.Object[]) r5)     // Catch:{ all -> 0x0144 }
            goto L_0x0143
        L_0x0131:
            r0 = move-exception
            com.facebook.internal.Logger$Companion r2 = com.facebook.internal.Logger.Companion     // Catch:{ all -> 0x0144 }
            com.facebook.LoggingBehavior r3 = com.facebook.LoggingBehavior.APP_EVENTS     // Catch:{ all -> 0x0144 }
            java.lang.String r4 = "JSON encoding for app event failed: '%s'"
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0144 }
            r5[r12] = r0     // Catch:{ all -> 0x0144 }
            r2.log((com.facebook.LoggingBehavior) r3, (java.lang.String) r13, (java.lang.String) r4, (java.lang.Object[]) r5)     // Catch:{ all -> 0x0144 }
        L_0x0143:
            return
        L_0x0144:
            r0 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AppEventsLoggerImpl.logEvent(java.lang.String, java.lang.Double, android.os.Bundle, boolean, java.util.UUID, com.facebook.appevents.OperationalData):void");
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J,\u0010\u001d\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010 H\u0007J\u001a\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0007J\u0006\u0010(\u001a\u00020\u0019J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0004H\u0007J\b\u0010+\u001a\u00020,H\u0007J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'H\u0007J\b\u0010.\u001a\u00020\u0013H\u0007J\n\u0010/\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u00100\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u00101\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u00102\u001a\u00020\u0019H\u0002J\u0018\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u0004H\u0002J\b\u0010:\u001a\u00020\u0019H\u0007J\u0010\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u0013H\u0007J\u0012\u0010=\u001a\u00020\u00192\b\u0010>\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010?\u001a\u00020\u00192\b\u0010@\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/facebook/appevents/AppEventsLoggerImpl$Companion;", "", "()V", "ACCOUNT_KIT_EVENT_NAME_PREFIX", "", "APP_EVENTS_KILLSWITCH", "APP_EVENT_NAME_PUSH_OPENED", "APP_EVENT_PREFERENCES", "APP_EVENT_PUSH_PARAMETER_ACTION", "APP_EVENT_PUSH_PARAMETER_CAMPAIGN", "APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS", "", "PUSH_PAYLOAD_CAMPAIGN_KEY", "PUSH_PAYLOAD_KEY", "TAG", "anonymousAppDeviceGUID", "backgroundExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "flushBehaviorField", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "isActivateAppEventRequested", "", "pushNotificationsRegistrationIdField", "staticLock", "activateApp", "", "application", "Landroid/app/Application;", "applicationId", "addImplicitPurchaseParameters", "Lkotlin/Pair;", "Landroid/os/Bundle;", "Lcom/facebook/appevents/OperationalData;", "params", "operationalData", "augmentWebView", "webView", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "eagerFlush", "functionDEPRECATED", "extraMsg", "getAnalyticsExecutor", "Ljava/util/concurrent/Executor;", "getAnonymousAppDeviceGUID", "getFlushBehavior", "getInstallReferrer", "getPushNotificationsRegistrationId", "initializeLib", "initializeTimersIfNeeded", "logEvent", "event", "Lcom/facebook/appevents/AppEvent;", "accessTokenAppId", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "notifyDeveloperError", "message", "onContextStop", "setFlushBehavior", "flushBehavior", "setInstallReferrer", "referrer", "setPushNotificationsRegistrationId", "registrationId", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AppEventsLoggerImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            AppEventsLogger.FlushBehavior access$getFlushBehaviorField$cp;
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                access$getFlushBehaviorField$cp = AppEventsLoggerImpl.access$getFlushBehaviorField$cp();
            }
            return access$getFlushBehaviorField$cp;
        }

        @JvmStatic
        public final void setFlushBehavior(AppEventsLogger.FlushBehavior flushBehavior) {
            Intrinsics.checkNotNullParameter(flushBehavior, "flushBehavior");
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                Companion companion = AppEventsLoggerImpl.Companion;
                AppEventsLoggerImpl.access$setFlushBehaviorField$cp(flushBehavior);
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        public final String getPushNotificationsRegistrationId() {
            String access$getPushNotificationsRegistrationIdField$cp;
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                access$getPushNotificationsRegistrationIdField$cp = AppEventsLoggerImpl.access$getPushNotificationsRegistrationIdField$cp();
            }
            return access$getPushNotificationsRegistrationIdField$cp;
        }

        @JvmStatic
        public final void setPushNotificationsRegistrationId(String str) {
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                if (!Utility.stringsEqualOrEmpty(AppEventsLoggerImpl.access$getPushNotificationsRegistrationIdField$cp(), str)) {
                    Companion companion = AppEventsLoggerImpl.Companion;
                    AppEventsLoggerImpl.access$setPushNotificationsRegistrationIdField$cp(str);
                    AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(FacebookSdk.getApplicationContext(), (String) null, (AccessToken) null);
                    appEventsLoggerImpl.logEvent(AppEventsConstants.EVENT_NAME_PUSH_TOKEN_OBTAINED);
                    if (AppEventsLoggerImpl.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                        appEventsLoggerImpl.flush();
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        public final void activateApp(Application application, String str) {
            Intrinsics.checkNotNullParameter(application, ThreeDSStrings.APPLICATION_KEY);
            if (FacebookSdk.isInitialized()) {
                AnalyticsUserIDStore.initStore();
                UserDataStore.initStore();
                if (str == null) {
                    str = FacebookSdk.getApplicationId();
                }
                FacebookSdk.publishInstallAsync(application, str);
                ActivityLifecycleTracker.startTracking(application, str);
                return;
            }
            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
        }

        @JvmStatic
        public final Pair<Bundle, OperationalData> addImplicitPurchaseParameters(Bundle bundle, OperationalData operationalData) {
            Pair<Bundle, OperationalData> addParameterAndReturn = OperationalData.Companion.addParameterAndReturn(OperationalDataEnum.IAPParameters, Constants.EVENT_PARAM_IS_IMPLICIT_PURCHASE_LOGGING_ENABLED, AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled() ? "1" : "0", bundle, operationalData);
            Pair<Bundle, OperationalData> addParameterAndReturn2 = OperationalData.Companion.addParameterAndReturn(OperationalDataEnum.IAPParameters, Constants.EVENT_PARAM_IS_AUTOLOG_APP_EVENTS_ENABLED, UserSettingsManager.getAutoLogAppEventsEnabled() ? "1" : "0", addParameterAndReturn.getFirst(), addParameterAndReturn.getSecond());
            return new Pair<>(addParameterAndReturn2.getFirst(), addParameterAndReturn2.getSecond());
        }

        @JvmStatic
        public final void functionDEPRECATED(String str) {
            Intrinsics.checkNotNullParameter(str, "extraMsg");
            Log.w(AppEventsLoggerImpl.access$getTAG$cp(), "This function is deprecated. " + str);
        }

        @JvmStatic
        public final void initializeLib(Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
                if (access$getBackgroundExecutor$cp != null) {
                    access$getBackgroundExecutor$cp.execute(new AppEventsLoggerImpl$Companion$$ExternalSyntheticLambda1(context, appEventsLoggerImpl));
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        }

        /* access modifiers changed from: private */
        public static final void initializeLib$lambda$4(Context context, AppEventsLoggerImpl appEventsLoggerImpl) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(appEventsLoggerImpl, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT, "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i = 0;
            for (int i2 = 0; i2 < 11; i2++) {
                String str = strArr[i2];
                String str2 = strArr2[i2];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i |= 1 << i2;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                appEventsLoggerImpl.logEventImplicitly(AnalyticsEvents.EVENT_SDK_INITIALIZE, (Double) null, bundle);
            }
        }

        @JvmStatic
        public final void onContextStop() {
            AppEventQueue.persistToDisk();
        }

        @JvmStatic
        public final String getInstallReferrer() {
            InstallReferrerUtil.tryUpdateReferrerInfo(new AppEventsLoggerImpl$Companion$getInstallReferrer$1());
            return FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", (String) null);
        }

        @JvmStatic
        public final void setInstallReferrer(String str) {
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }

        @JvmStatic
        public final void augmentWebView(WebView webView, Context context) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            String str = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(str, "RELEASE");
            int i = 0;
            String[] strArr = (String[]) StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
            int parseInt = (strArr.length == 0) ^ true ? Integer.parseInt(strArr[0]) : 0;
            if (strArr.length > 1) {
                i = Integer.parseInt(strArr[1]);
            }
            if (parseInt < 4 || (parseInt == 4 && i <= 1)) {
                Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, AppEventsLoggerImpl.access$getTAG$cp(), "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2");
            } else {
                webView.addJavascriptInterface(new FacebookSDKJSInterface(context), "fbmq_" + FacebookSdk.getApplicationId());
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
            r3 = new com.facebook.appevents.AppEventsLoggerImpl$Companion$$ExternalSyntheticLambda0();
            r2 = com.facebook.appevents.AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
            if (r2 == null) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            r2.scheduleAtFixedRate(r3, 0, 86400, java.util.concurrent.TimeUnit.SECONDS);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
            throw new java.lang.IllegalStateException("Required value was null.".toString());
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void initializeTimersIfNeeded() {
            /*
                r9 = this;
                java.lang.Object r0 = com.facebook.appevents.AppEventsLoggerImpl.access$getStaticLock$cp()
                monitor-enter(r0)
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.facebook.appevents.AppEventsLoggerImpl.access$getBackgroundExecutor$cp()     // Catch:{ all -> 0x003d }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r0)
                return
            L_0x000d:
                com.facebook.appevents.AppEventsLoggerImpl$Companion r1 = com.facebook.appevents.AppEventsLoggerImpl.Companion     // Catch:{ all -> 0x003d }
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch:{ all -> 0x003d }
                r2 = 1
                r1.<init>(r2)     // Catch:{ all -> 0x003d }
                com.facebook.appevents.AppEventsLoggerImpl.access$setBackgroundExecutor$cp(r1)     // Catch:{ all -> 0x003d }
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003d }
                monitor-exit(r0)
                com.facebook.appevents.AppEventsLoggerImpl$Companion$$ExternalSyntheticLambda0 r3 = new com.facebook.appevents.AppEventsLoggerImpl$Companion$$ExternalSyntheticLambda0
                r3.<init>()
                java.util.concurrent.ScheduledThreadPoolExecutor r2 = com.facebook.appevents.AppEventsLoggerImpl.access$getBackgroundExecutor$cp()
                if (r2 == 0) goto L_0x0031
                r4 = 0
                r6 = 86400(0x15180, double:4.26873E-319)
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                r2.scheduleAtFixedRate(r3, r4, r6, r8)
                return
            L_0x0031:
                java.lang.String r0 = "Required value was null."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x003d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AppEventsLoggerImpl.Companion.initializeTimersIfNeeded():void");
        }

        /* access modifiers changed from: private */
        public static final void initializeTimersIfNeeded$lambda$6() {
            Set<String> hashSet = new HashSet<>();
            for (AccessTokenAppIdPair applicationId : AppEventQueue.getKeySet()) {
                hashSet.add(applicationId.getApplicationId());
            }
            for (String queryAppSettings : hashSet) {
                FetchedAppSettingsManager.queryAppSettings(queryAppSettings, true);
            }
        }

        /* access modifiers changed from: private */
        public final void logEvent(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
            AppEventQueue.add(accessTokenAppIdPair, appEvent);
            if (FeatureManager.isEnabled(FeatureManager.Feature.OnDevicePostInstallEventProcessing) && OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                OnDeviceProcessingManager.sendCustomEventAsync(accessTokenAppIdPair.getApplicationId(), appEvent);
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.GPSARATriggers)) {
                GpsAraTriggersManager.INSTANCE.registerTriggerAsync(accessTokenAppIdPair.getApplicationId(), appEvent);
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.GPSPACAProcessing)) {
                PACustomAudienceClient.INSTANCE.joinCustomAudience(accessTokenAppIdPair.getApplicationId(), appEvent);
            }
            if (!appEvent.getIsImplicit() && !AppEventsLoggerImpl.access$isActivateAppEventRequested$cp()) {
                if (Intrinsics.areEqual((Object) appEvent.getName(), (Object) AppEventsConstants.EVENT_NAME_ACTIVATED_APP)) {
                    AppEventsLoggerImpl.access$setActivateAppEventRequested$cp(true);
                } else {
                    Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                }
            }
        }

        public final void eagerFlush() {
            if (getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                AppEventQueue.flush(FlushReason.EAGER_FLUSHING_EVENT);
            }
        }

        /* access modifiers changed from: private */
        public final void notifyDeveloperError(String str) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", str);
        }

        @JvmStatic
        public final Executor getAnalyticsExecutor() {
            if (AppEventsLoggerImpl.access$getBackgroundExecutor$cp() == null) {
                initializeTimersIfNeeded();
            }
            ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
            if (access$getBackgroundExecutor$cp != null) {
                return access$getBackgroundExecutor$cp;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        @JvmStatic
        public final String getAnonymousAppDeviceGUID(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                    if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        Companion companion = AppEventsLoggerImpl.Companion;
                        AppEventsLoggerImpl.access$setAnonymousAppDeviceGUID$cp(sharedPreferences.getString("anonymousAppDeviceGUID", (String) null));
                        if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                            Companion companion2 = AppEventsLoggerImpl.Companion;
                            AppEventsLoggerImpl.access$setAnonymousAppDeviceGUID$cp("XZ" + UUID.randomUUID());
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp()).apply();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            String access$getAnonymousAppDeviceGUID$cp = AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp();
            if (access$getAnonymousAppDeviceGUID$cp != null) {
                return access$getAnonymousAppDeviceGUID$cp;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    static {
        String canonicalName = AppEventsLoggerImpl.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        TAG = canonicalName;
    }
}
