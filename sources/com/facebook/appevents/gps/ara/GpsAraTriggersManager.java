package com.facebook.appevents.gps.ara;

import android.adservices.common.AdServicesOutcomeReceiver;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.braintreepayments.api.AnalyticsClient;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.GpsCapabilityChecker;
import com.facebook.appevents.gps.GpsDebugLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.json.JSONObject;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/gps/ara/GpsAraTriggersManager;", "", "()V", "GPS_PREFIX", "", "REPLACEMENT_STRING", "TAG", "enabled", "", "gpsDebugLogger", "Lcom/facebook/appevents/gps/GpsDebugLogger;", "serverUri", "canRegisterTrigger", "enable", "", "getEventParameters", "event", "Lcom/facebook/appevents/AppEvent;", "isValidEvent", "registerTrigger", "applicationId", "registerTriggerAsync", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: GpsAraTriggersManager.kt */
public final class GpsAraTriggersManager {
    private static final String GPS_PREFIX = "gps";
    public static final GpsAraTriggersManager INSTANCE = new GpsAraTriggersManager();
    private static final String REPLACEMENT_STRING = "_removed_";
    private static final String TAG;
    private static boolean enabled;
    private static GpsDebugLogger gpsDebugLogger;
    private static String serverUri;

    private GpsAraTriggersManager() {
    }

    public static final /* synthetic */ GpsDebugLogger access$getGpsDebugLogger$p() {
        Class<GpsAraTriggersManager> cls = GpsAraTriggersManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return gpsDebugLogger;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$p() {
        Class<GpsAraTriggersManager> cls = GpsAraTriggersManager.class;
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

    static {
        String cls = GpsAraTriggersManager.class.toString();
        Intrinsics.checkNotNullExpressionValue(cls, "GpsAraTriggersManager::class.java.toString()");
        TAG = cls;
    }

    @JvmStatic
    public static final void enable() {
        Class<GpsAraTriggersManager> cls = GpsAraTriggersManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                enabled = true;
                gpsDebugLogger = new GpsDebugLogger(FacebookSdk.getApplicationContext());
                serverUri = "https://www." + FacebookSdk.getFacebookDomain() + "/privacy_sandbox/mobile/register/trigger";
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public final void registerTriggerAsync(String str, AppEvent appEvent) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Intrinsics.checkNotNullParameter(str, "applicationId");
                Intrinsics.checkNotNullParameter(appEvent, "event");
                FacebookSdk.getExecutor().execute(new GpsAraTriggersManager$$ExternalSyntheticLambda0(str, appEvent));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void registerTriggerAsync$lambda$0(String str, AppEvent appEvent) {
        Class<GpsAraTriggersManager> cls = GpsAraTriggersManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(str, "$applicationId");
                Intrinsics.checkNotNullParameter(appEvent, "$event");
                INSTANCE.registerTrigger(str, appEvent);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public final void registerTrigger(String str, AppEvent appEvent) {
        GpsDebugLogger gpsDebugLogger2;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Intrinsics.checkNotNullParameter(str, "applicationId");
                Intrinsics.checkNotNullParameter(appEvent, "event");
                if (isValidEvent(appEvent) && canRegisterTrigger()) {
                    Context applicationContext = FacebookSdk.getApplicationContext();
                    gpsDebugLogger2 = null;
                    MeasurementManager measurementManager = (MeasurementManager) applicationContext.getSystemService(MeasurementManager.class);
                    if (measurementManager == null) {
                        measurementManager = MeasurementManager.get(applicationContext.getApplicationContext());
                    }
                    if (measurementManager == null) {
                        Log.w(TAG, "FAILURE_GET_MEASUREMENT_MANAGER");
                        GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                        if (gpsDebugLogger3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                            gpsDebugLogger3 = null;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString(Constants.GPS_ARA_FAILED_REASON, "Failed to get measurement manager");
                        Unit unit = Unit.INSTANCE;
                        gpsDebugLogger3.log(Constants.GPS_ARA_FAILED, bundle);
                        return;
                    }
                    String eventParameters = getEventParameters(appEvent);
                    StringBuilder sb = new StringBuilder();
                    String str2 = serverUri;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("serverUri");
                        str2 = null;
                    }
                    Uri parse = Uri.parse(sb.append(str2).append("?app_id=").append(str).append(Typography.amp).append(eventParameters).toString());
                    Intrinsics.checkNotNullExpressionValue(parse, "parse(\"$serverUri?$appId…=$applicationId&$params\")");
                    if (GpsCapabilityChecker.useOutcomeReceiver()) {
                        measurementManager.registerTrigger(parse, FacebookSdk.getExecutor(), (OutcomeReceiver<Object, Exception>) new GpsAraTriggersManager$registerTrigger$outcomeReceiver$1());
                        return;
                    }
                    measurementManager.registerTrigger(parse, FacebookSdk.getExecutor(), (AdServicesOutcomeReceiver<Object, Exception>) new GpsAraTriggersManager$registerTrigger$adServicesOutcomeReceiver$1());
                }
            } catch (Exception e) {
                Log.w(TAG, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                GpsDebugLogger gpsDebugLogger4 = gpsDebugLogger;
                if (gpsDebugLogger4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    gpsDebugLogger2 = gpsDebugLogger4;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString(Constants.GPS_ARA_FAILED_REASON, e.toString());
                Unit unit2 = Unit.INSTANCE;
                gpsDebugLogger2.log(Constants.GPS_ARA_FAILED, bundle2);
            } catch (NoClassDefFoundError e2) {
                Log.w(TAG, "FAILURE_TRIGGER_REGISTRATION_NO_CLASS_FOUND");
                GpsDebugLogger gpsDebugLogger5 = gpsDebugLogger;
                if (gpsDebugLogger5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    gpsDebugLogger2 = gpsDebugLogger5;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString(Constants.GPS_ARA_FAILED_REASON, e2.toString());
                Unit unit3 = Unit.INSTANCE;
                gpsDebugLogger2.log(Constants.GPS_ARA_FAILED, bundle3);
            } catch (NoSuchMethodError e3) {
                Log.w(TAG, "FAILURE_TRIGGER_REGISTRATION_NO_METHOD_FOUND");
                GpsDebugLogger gpsDebugLogger6 = gpsDebugLogger;
                if (gpsDebugLogger6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    gpsDebugLogger2 = gpsDebugLogger6;
                }
                Bundle bundle4 = new Bundle();
                bundle4.putString(Constants.GPS_ARA_FAILED_REASON, e3.toString());
                Unit unit4 = Unit.INSTANCE;
                gpsDebugLogger2.log(Constants.GPS_ARA_FAILED, bundle4);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final boolean canRegisterTrigger() {
        GpsDebugLogger gpsDebugLogger2;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (!enabled) {
                return false;
            }
            gpsDebugLogger2 = null;
            Class.forName("android.adservices.measurement.MeasurementManager");
            return true;
        } catch (Exception e) {
            Log.i(TAG, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
            GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
            if (gpsDebugLogger3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
            } else {
                gpsDebugLogger2 = gpsDebugLogger3;
            }
            Bundle bundle = new Bundle();
            bundle.putString(Constants.GPS_ARA_FAILED_REASON, e.toString());
            Unit unit = Unit.INSTANCE;
            gpsDebugLogger2.log(Constants.GPS_ARA_FAILED, bundle);
            return false;
        } catch (NoClassDefFoundError e2) {
            Log.i(TAG, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS_DEF");
            GpsDebugLogger gpsDebugLogger4 = gpsDebugLogger;
            if (gpsDebugLogger4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
            } else {
                gpsDebugLogger2 = gpsDebugLogger4;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(Constants.GPS_ARA_FAILED_REASON, e2.toString());
            Unit unit2 = Unit.INSTANCE;
            gpsDebugLogger2.log(Constants.GPS_ARA_FAILED, bundle2);
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final String getEventParameters(AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = appEvent.getJSONObject();
            if (jSONObject == null) {
                return "";
            }
            if (jSONObject.length() == 0) {
                return "";
            }
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "params.keys()");
            return SequencesKt.joinToString$default(SequencesKt.mapNotNull(SequencesKt.asSequence(keys), new GpsAraTriggersManager$getEventParameters$1(jSONObject)), "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean isValidEvent(AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            String string = appEvent.getJSONObject().getString(Constants.EVENT_NAME_EVENT_KEY);
            if (Intrinsics.areEqual((Object) string, (Object) REPLACEMENT_STRING)) {
                return false;
            }
            Intrinsics.checkNotNullExpressionValue(string, AnalyticsClient.WORK_INPUT_KEY_EVENT_NAME);
            if (!StringsKt.contains$default((CharSequence) string, (CharSequence) GPS_PREFIX, false, 2, (Object) null)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
