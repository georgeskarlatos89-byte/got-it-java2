package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.GraphRequest;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.hermes.intl.Constants;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import io.sentry.protocol.App;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0012\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001<B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u001eH\u0007J\b\u0010\"\u001a\u00020\u001eH\u0007J\b\u0010#\u001a\u00020\u001eH\u0007J\b\u0010$\u001a\u00020\u001eH\u0007J\b\u0010%\u001a\u00020\u001eH\u0007J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J!\u0010)\u001a\u00020'2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130+\"\u00020\u0013H\u0002¢\u0006\u0002\u0010,J\u000f\u0010-\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010 J\u0010\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0013H\u0002J\b\u00100\u001a\u00020'H\u0007J\b\u00101\u001a\u00020'H\u0002J\b\u00102\u001a\u00020'H\u0002J\u000f\u00103\u001a\u0004\u0018\u00010\u001eH\u0003¢\u0006\u0002\u0010 J\u0010\u00104\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0013H\u0002J\u0010\u00105\u001a\u00020'2\u0006\u00106\u001a\u00020\u001eH\u0007J\u0010\u00107\u001a\u00020'2\u0006\u00106\u001a\u00020\u001eH\u0007J\u0010\u00108\u001a\u00020'2\u0006\u00106\u001a\u00020\u001eH\u0007J\u0010\u00109\u001a\u00020'2\u0006\u00106\u001a\u00020\u001eH\u0007J\b\u0010:\u001a\u00020'H\u0002J\u0010\u0010;\u001a\u00020'2\u0006\u0010/\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/facebook/UserSettingsManager;", "", "()V", "ADVERTISERID_COLLECTION_FALSE_WARNING", "", "ADVERTISERID_COLLECTION_NOT_SET_WARNING", "ADVERTISER_ID_KEY", "APPLICATION_FIELDS", "AUTO_APP_LINK_WARNING", "EVENTS_CODELESS_SETUP_ENABLED", "LAST_TIMESTAMP", "TAG", "kotlin.jvm.PlatformType", "TIMEOUT_7D", "", "USER_SETTINGS", "USER_SETTINGS_BITMASK", "VALUE", "advertiserIDCollectionEnabled", "Lcom/facebook/UserSettingsManager$UserSetting;", "autoInitEnabled", "autoLogAppEventsEnabledLocally", "codelessSetupEnabled", "isFetchingCodelessStatus", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "monitorEnabled", "userSettingPref", "Landroid/content/SharedPreferences;", "checkAutoLogAppEventsEnabled", "", "checkClientSideConfiguration", "()Ljava/lang/Boolean;", "getAdvertiserIDCollectionEnabled", "getAutoInitEnabled", "getAutoLogAppEventsEnabled", "getCodelessSetupEnabled", "getMonitorEnabled", "initializeCodelessSetupEnabledAsync", "", "initializeIfNotInitialized", "initializeUserSetting", "userSettings", "", "([Lcom/facebook/UserSettingsManager$UserSetting;)V", "loadAutoLogAppEventsSettingFromManifest", "loadSettingFromManifest", "userSetting", "logIfAutoAppLinkEnabled", "logIfSDKSettingsChanged", "logWarnings", "readAutoLogAppEventsSettingFromCache", "readSettingFromCache", "setAdvertiserIDCollectionEnabled", "flag", "setAutoInitEnabled", "setAutoLogAppEventsEnabled", "setMonitorEnabled", "validateInitialized", "writeSettingToCache", "UserSetting", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: UserSettingsManager.kt */
public final class UserSettingsManager {
    private static final String ADVERTISERID_COLLECTION_FALSE_WARNING = "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.";
    private static final String ADVERTISERID_COLLECTION_NOT_SET_WARNING = "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.";
    private static final String ADVERTISER_ID_KEY = "advertiser_id";
    private static final String APPLICATION_FIELDS = "fields";
    private static final String AUTO_APP_LINK_WARNING = "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest";
    private static final String EVENTS_CODELESS_SETUP_ENABLED = "auto_event_setup_enabled";
    public static final UserSettingsManager INSTANCE = new UserSettingsManager();
    private static final String LAST_TIMESTAMP = "last_timestamp";
    private static final String TAG = UserSettingsManager.class.getName();
    private static final long TIMEOUT_7D = 604800000;
    private static final String USER_SETTINGS = "com.facebook.sdk.USER_SETTINGS";
    private static final String USER_SETTINGS_BITMASK = "com.facebook.sdk.USER_SETTINGS_BITMASK";
    private static final String VALUE = "value";
    private static final UserSetting advertiserIDCollectionEnabled = new UserSetting(true, FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY);
    private static final UserSetting autoInitEnabled = new UserSetting(true, FacebookSdk.AUTO_INIT_ENABLED_PROPERTY);
    private static final UserSetting autoLogAppEventsEnabledLocally = new UserSetting(true, FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY);
    private static final UserSetting codelessSetupEnabled = new UserSetting(false, EVENTS_CODELESS_SETUP_ENABLED);
    private static final AtomicBoolean isFetchingCodelessStatus = new AtomicBoolean(false);
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private static final UserSetting monitorEnabled = new UserSetting(true, FacebookSdk.MONITOR_ENABLED_PROPERTY);
    private static SharedPreferences userSettingPref;

    private UserSettingsManager() {
    }

    private final void initializeIfNotInitialized() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (FacebookSdk.isInitialized() && isInitialized.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(USER_SETTINGS, 0);
                    Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…GS, Context.MODE_PRIVATE)");
                    userSettingPref = sharedPreferences;
                    initializeUserSetting(autoLogAppEventsEnabledLocally, advertiserIDCollectionEnabled, autoInitEnabled);
                    initializeCodelessSetupEnabledAsync();
                    logWarnings();
                    logIfSDKSettingsChanged();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void initializeUserSetting(UserSetting... userSettingArr) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                for (UserSetting userSetting : userSettingArr) {
                    if (userSetting == codelessSetupEnabled) {
                        initializeCodelessSetupEnabledAsync();
                    } else if (userSetting.getValue() == null) {
                        readSettingFromCache(userSetting);
                        if (userSetting.getValue() == null) {
                            loadSettingFromManifest(userSetting);
                        }
                    } else {
                        writeSettingToCache(userSetting);
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void initializeCodelessSetupEnabledAsync() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                UserSetting userSetting = codelessSetupEnabled;
                readSettingFromCache(userSetting);
                long currentTimeMillis = System.currentTimeMillis();
                if (userSetting.getValue() == null || currentTimeMillis - userSetting.getLastTS() >= TIMEOUT_7D) {
                    userSetting.setValue((Boolean) null);
                    userSetting.setLastTS(0);
                    if (isFetchingCodelessStatus.compareAndSet(false, true)) {
                        FacebookSdk.getExecutor().execute(new UserSettingsManager$$ExternalSyntheticLambda0(currentTimeMillis));
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void initializeCodelessSetupEnabledAsync$lambda$0(long j) {
        FetchedAppSettings queryAppSettings;
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (advertiserIDCollectionEnabled.getValue() && (queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false)) != null && queryAppSettings.getCodelessEventsEnabled()) {
                    AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
                    String androidAdvertiserId = (attributionIdentifiers == null || attributionIdentifiers.getAndroidAdvertiserId() == null) ? null : attributionIdentifiers.getAndroidAdvertiserId();
                    if (androidAdvertiserId != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString(ADVERTISER_ID_KEY, androidAdvertiserId);
                        bundle.putString("fields", EVENTS_CODELESS_SETUP_ENABLED);
                        GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest((AccessToken) null, App.TYPE, (GraphRequest.Callback) null);
                        newGraphPathRequest.setParameters(bundle);
                        JSONObject jSONObject = newGraphPathRequest.executeAndWait().getJSONObject();
                        if (jSONObject != null) {
                            UserSetting userSetting = codelessSetupEnabled;
                            userSetting.setValue(Boolean.valueOf(jSONObject.optBoolean(EVENTS_CODELESS_SETUP_ENABLED, false)));
                            userSetting.setLastTS(j);
                            INSTANCE.writeSettingToCache(userSetting);
                        }
                    }
                }
                isFetchingCodelessStatus.set(false);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void writeSettingToCache(UserSetting userSetting) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                validateInitialized();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", userSetting.getValue());
                jSONObject.put(LAST_TIMESTAMP, userSetting.getLastTS());
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                sharedPreferences.edit().putString(userSetting.getKey(), jSONObject.toString()).apply();
                logIfSDKSettingsChanged();
            } catch (Exception e) {
                Utility.logd(TAG, e);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void readSettingFromCache(UserSetting userSetting) {
        String str = "";
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                validateInitialized();
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(userSetting.getKey(), str);
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    userSetting.setValue(Boolean.valueOf(jSONObject.getBoolean("value")));
                    userSetting.setLastTS(jSONObject.getLong(LAST_TIMESTAMP));
                }
            } catch (JSONException e) {
                Utility.logd(TAG, (Exception) e);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void loadSettingFromManifest(UserSetting userSetting) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                validateInitialized();
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                if (applicationInfo.metaData != null && applicationInfo.metaData.containsKey(userSetting.getKey())) {
                    userSetting.setValue(Boolean.valueOf(applicationInfo.metaData.getBoolean(userSetting.getKey(), userSetting.getDefaultVal())));
                }
            } catch (PackageManager.NameNotFoundException e) {
                Utility.logd(TAG, (Exception) e);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void logWarnings() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                if (applicationInfo.metaData != null) {
                    if (!applicationInfo.metaData.containsKey(FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY)) {
                        Log.w(TAG, ADVERTISERID_COLLECTION_NOT_SET_WARNING);
                    }
                    if (!getAdvertiserIDCollectionEnabled()) {
                        Log.w(TAG, ADVERTISERID_COLLECTION_FALSE_WARNING);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void logIfSDKSettingsChanged() {
        int i;
        int i2;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (isInitialized.get() && FacebookSdk.isInitialized()) {
                    Context applicationContext = FacebookSdk.getApplicationContext();
                    int i3 = 0;
                    int i4 = ((autoInitEnabled.getValue() ? 1 : 0) << 0) | 0 | ((autoLogAppEventsEnabledLocally.getValue() ? 1 : 0) << 1) | ((advertiserIDCollectionEnabled.getValue() ? 1 : 0) << 2) | ((monitorEnabled.getValue() ? 1 : 0) << 3);
                    SharedPreferences sharedPreferences = userSettingPref;
                    SharedPreferences sharedPreferences2 = null;
                    if (sharedPreferences == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        sharedPreferences = null;
                    }
                    int i5 = sharedPreferences.getInt(USER_SETTINGS_BITMASK, 0);
                    if (i5 != i4) {
                        SharedPreferences sharedPreferences3 = userSettingPref;
                        if (sharedPreferences3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        } else {
                            sharedPreferences2 = sharedPreferences3;
                        }
                        sharedPreferences2.edit().putInt(USER_SETTINGS_BITMASK, i4).apply();
                        try {
                            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                            if (applicationInfo.metaData != null) {
                                String[] strArr = {FacebookSdk.AUTO_INIT_ENABLED_PROPERTY, FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY, FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY, FacebookSdk.MONITOR_ENABLED_PROPERTY};
                                boolean[] zArr = {true, true, true, true};
                                int i6 = 0;
                                i = 0;
                                i2 = 0;
                                while (i6 < 4) {
                                    try {
                                        i2 |= (applicationInfo.metaData.containsKey(strArr[i6]) ? 1 : 0) << i6;
                                        i |= (applicationInfo.metaData.getBoolean(strArr[i6], zArr[i6]) ? 1 : 0) << i6;
                                        i6++;
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        i3 = i;
                                        i = i3;
                                        i3 = i2;
                                        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(applicationContext);
                                        Bundle bundle = new Bundle();
                                        bundle.putInt(Constants.COLLATION_OPTION_USAGE, i3);
                                        bundle.putInt("initial", i);
                                        bundle.putInt("previous", i5);
                                        bundle.putInt("current", i4);
                                        internalAppEventsLogger.logChangedSettingsEvent(bundle);
                                    }
                                }
                                i3 = i2;
                                InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(applicationContext);
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt(Constants.COLLATION_OPTION_USAGE, i3);
                                bundle2.putInt("initial", i);
                                bundle2.putInt("previous", i5);
                                bundle2.putInt("current", i4);
                                internalAppEventsLogger2.logChangedSettingsEvent(bundle2);
                            }
                            i = 0;
                            InternalAppEventsLogger internalAppEventsLogger22 = new InternalAppEventsLogger(applicationContext);
                            Bundle bundle22 = new Bundle();
                            bundle22.putInt(Constants.COLLATION_OPTION_USAGE, i3);
                            bundle22.putInt("initial", i);
                            bundle22.putInt("previous", i5);
                            bundle22.putInt("current", i4);
                            internalAppEventsLogger22.logChangedSettingsEvent(bundle22);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i2 = 0;
                            i = i3;
                            i3 = i2;
                            InternalAppEventsLogger internalAppEventsLogger222 = new InternalAppEventsLogger(applicationContext);
                            Bundle bundle222 = new Bundle();
                            bundle222.putInt(Constants.COLLATION_OPTION_USAGE, i3);
                            bundle222.putInt("initial", i);
                            bundle222.putInt("previous", i5);
                            bundle222.putInt("current", i4);
                            internalAppEventsLogger222.logChangedSettingsEvent(bundle222);
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @JvmStatic
    public static final void logIfAutoAppLinkEnabled() {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                if (applicationInfo.metaData != null && applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                    InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(applicationContext);
                    Bundle bundle = new Bundle();
                    if (!Utility.isAutoAppLinkSetup()) {
                        bundle.putString("SchemeWarning", AUTO_APP_LINK_WARNING);
                        Log.w(TAG, AUTO_APP_LINK_WARNING);
                    }
                    internalAppEventsLogger.logEvent("fb_auto_applink", bundle);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void validateInitialized() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (!isInitialized.get()) {
                    throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @JvmStatic
    public static final void setAutoInitEnabled(boolean z) {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                UserSetting userSetting = autoInitEnabled;
                userSetting.setValue(Boolean.valueOf(z));
                userSetting.setLastTS(System.currentTimeMillis());
                if (isInitialized.get()) {
                    INSTANCE.writeSettingToCache(userSetting);
                } else {
                    INSTANCE.initializeIfNotInitialized();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final boolean getAutoInitEnabled() {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return autoInitEnabled.getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    @JvmStatic
    public static final void setAutoLogAppEventsEnabled(boolean z) {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                UserSetting userSetting = autoLogAppEventsEnabledLocally;
                userSetting.setValue(Boolean.valueOf(z));
                userSetting.setLastTS(System.currentTimeMillis());
                if (isInitialized.get()) {
                    INSTANCE.writeSettingToCache(userSetting);
                } else {
                    INSTANCE.initializeIfNotInitialized();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final boolean getAutoLogAppEventsEnabled() {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            UserSettingsManager userSettingsManager = INSTANCE;
            userSettingsManager.initializeIfNotInitialized();
            return userSettingsManager.checkAutoLogAppEventsEnabled();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[Catch:{ all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022 A[Catch:{ all -> 0x004c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean checkAutoLogAppEventsEnabled() {
        /*
            r5 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Map r0 = com.facebook.internal.FetchedAppSettingsManager.getCachedMigratedAutoLogValuesInAppSettings()     // Catch:{ all -> 0x004c }
            r2 = 1
            if (r0 == 0) goto L_0x0018
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r3 = r1
            goto L_0x0019
        L_0x0018:
            r3 = r2
        L_0x0019:
            if (r3 == 0) goto L_0x0022
            com.facebook.UserSettingsManager$UserSetting r0 = autoLogAppEventsEnabledLocally     // Catch:{ all -> 0x004c }
            boolean r0 = r0.getValue()     // Catch:{ all -> 0x004c }
            return r0
        L_0x0022:
            java.lang.String r3 = "auto_log_app_events_enabled"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "auto_log_app_events_default"
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0039
            boolean r0 = r3.booleanValue()     // Catch:{ all -> 0x004c }
            return r0
        L_0x0039:
            java.lang.Boolean r3 = r5.checkClientSideConfiguration()     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0044
            boolean r0 = r3.booleanValue()     // Catch:{ all -> 0x004c }
            return r0
        L_0x0044:
            if (r0 == 0) goto L_0x004b
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            return r0
        L_0x004b:
            return r2
        L_0x004c:
            r0 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.UserSettingsManager.checkAutoLogAppEventsEnabled():boolean");
    }

    private final Boolean checkClientSideConfiguration() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Boolean readAutoLogAppEventsSettingFromCache = readAutoLogAppEventsSettingFromCache();
            if (readAutoLogAppEventsSettingFromCache != null) {
                return Boolean.valueOf(readAutoLogAppEventsSettingFromCache.booleanValue());
            }
            Boolean loadAutoLogAppEventsSettingFromManifest = loadAutoLogAppEventsSettingFromManifest();
            if (loadAutoLogAppEventsSettingFromManifest != null) {
                return Boolean.valueOf(loadAutoLogAppEventsSettingFromManifest.booleanValue());
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JvmStatic
    private static final Boolean readAutoLogAppEventsSettingFromCache() {
        String str = "";
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            INSTANCE.validateInitialized();
            SharedPreferences sharedPreferences = userSettingPref;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString(autoLogAppEventsEnabledLocally.getKey(), str);
            if (string != null) {
                str = string;
            }
            if (str.length() > 0) {
                return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
            }
        } catch (JSONException e) {
            Utility.logd(TAG, (Exception) e);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
        return null;
    }

    private final Boolean loadAutoLogAppEventsSettingFromManifest() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            validateInitialized();
            Context applicationContext = FacebookSdk.getApplicationContext();
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            if (applicationInfo.metaData != null) {
                Bundle bundle = applicationInfo.metaData;
                UserSetting userSetting = autoLogAppEventsEnabledLocally;
                if (bundle.containsKey(userSetting.getKey())) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean(userSetting.getKey()));
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Utility.logd(TAG, (Exception) e);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
        return null;
    }

    @JvmStatic
    public static final void setAdvertiserIDCollectionEnabled(boolean z) {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                UserSetting userSetting = advertiserIDCollectionEnabled;
                userSetting.setValue(Boolean.valueOf(z));
                userSetting.setLastTS(System.currentTimeMillis());
                if (isInitialized.get()) {
                    INSTANCE.writeSettingToCache(userSetting);
                } else {
                    INSTANCE.initializeIfNotInitialized();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final boolean getAdvertiserIDCollectionEnabled() {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return advertiserIDCollectionEnabled.getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    @JvmStatic
    public static final boolean getCodelessSetupEnabled() {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return codelessSetupEnabled.getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    @JvmStatic
    public static final void setMonitorEnabled(boolean z) {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                UserSetting userSetting = monitorEnabled;
                userSetting.setValue(Boolean.valueOf(z));
                userSetting.setLastTS(System.currentTimeMillis());
                if (isInitialized.get()) {
                    INSTANCE.writeSettingToCache(userSetting);
                } else {
                    INSTANCE.initializeIfNotInitialized();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final boolean getMonitorEnabled() {
        Class<UserSettingsManager> cls = UserSettingsManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            INSTANCE.initializeIfNotInitialized();
            return monitorEnabled.getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/facebook/UserSettingsManager$UserSetting;", "", "defaultVal", "", "key", "", "(ZLjava/lang/String;)V", "getDefaultVal", "()Z", "setDefaultVal", "(Z)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "lastTS", "", "getLastTS", "()J", "setLastTS", "(J)V", "value", "getValue", "()Ljava/lang/Boolean;", "setValue", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: UserSettingsManager.kt */
    private static final class UserSetting {
        private boolean defaultVal;
        private String key;
        private long lastTS;
        private Boolean value;

        public UserSetting(boolean z, String str) {
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            this.defaultVal = z;
            this.key = str;
        }

        public final boolean getDefaultVal() {
            return this.defaultVal;
        }

        public final String getKey() {
            return this.key;
        }

        public final void setDefaultVal(boolean z) {
            this.defaultVal = z;
        }

        public final void setKey(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.key = str;
        }

        public final Boolean getValue() {
            return this.value;
        }

        public final void setValue(Boolean bool) {
            this.value = bool;
        }

        public final long getLastTS() {
            return this.lastTS;
        }

        public final void setLastTS(long j) {
            this.lastTS = j;
        }

        /* renamed from: getValue  reason: collision with other method in class */
        public final boolean m434getValue() {
            Boolean bool = this.value;
            return bool != null ? bool.booleanValue() : this.defaultVal;
        }
    }
}
