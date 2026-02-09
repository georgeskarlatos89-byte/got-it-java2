package com.facebook.appevents.gps.pa;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.braintreepayments.api.AnalyticsClient;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.GpsDebugLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/gps/pa/PACustomAudienceClient;", "", "()V", "BUYER", "", "DELIMITER", "GPS_PREFIX", "REPLACEMENT_STRING", "TAG", "baseUri", "customAudienceManager", "Landroid/adservices/customaudience/CustomAudienceManager;", "enabled", "", "gpsDebugLogger", "Lcom/facebook/appevents/gps/GpsDebugLogger;", "enable", "", "joinCustomAudience", "appId", "event", "Lcom/facebook/appevents/AppEvent;", "validateAndCreateCAName", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: PACustomAudienceClient.kt */
public final class PACustomAudienceClient {
    private static final String BUYER = "facebook.com";
    private static final String DELIMITER = "@";
    private static final String GPS_PREFIX = "gps";
    public static final PACustomAudienceClient INSTANCE = new PACustomAudienceClient();
    private static final String REPLACEMENT_STRING = "_removed_";
    private static final String TAG = "Fledge: PACustomAudienceClient";
    private static String baseUri;
    private static CustomAudienceManager customAudienceManager;
    private static boolean enabled;
    private static GpsDebugLogger gpsDebugLogger;

    private PACustomAudienceClient() {
    }

    public static final /* synthetic */ GpsDebugLogger access$getGpsDebugLogger$p() {
        Class<PACustomAudienceClient> cls = PACustomAudienceClient.class;
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
        Class<PACustomAudienceClient> cls = PACustomAudienceClient.class;
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

    @JvmStatic
    public static final void enable() {
        GpsDebugLogger gpsDebugLogger2;
        String str;
        Class<PACustomAudienceClient> cls = PACustomAudienceClient.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                gpsDebugLogger = new GpsDebugLogger(applicationContext);
                baseUri = "https://www." + FacebookSdk.getFacebookDomain() + "/privacy_sandbox/pa/logic";
                gpsDebugLogger2 = null;
                CustomAudienceManager customAudienceManager2 = CustomAudienceManager.get(applicationContext);
                customAudienceManager = customAudienceManager2;
                if (customAudienceManager2 != null) {
                    enabled = true;
                }
                str = null;
            } catch (Exception e) {
                str = e.toString();
                Log.w(TAG, "Failed to get CustomAudienceManager: " + e);
            } catch (NoClassDefFoundError e2) {
                str = e2.toString();
                Log.w(TAG, "Failed to get CustomAudienceManager: " + e2);
            } catch (NoSuchMethodError e3) {
                str = e3.toString();
                Log.w(TAG, "Failed to get CustomAudienceManager: " + e3);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
                return;
            }
            if (!enabled) {
                GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                if (gpsDebugLogger3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    gpsDebugLogger2 = gpsDebugLogger3;
                }
                Bundle bundle = new Bundle();
                bundle.putString(Constants.GPS_PA_FAILED_REASON, str);
                Unit unit = Unit.INSTANCE;
                gpsDebugLogger2.log(Constants.GPS_PA_FAILED, bundle);
            }
        }
    }

    public final void joinCustomAudience(String str, AppEvent appEvent) {
        GpsDebugLogger gpsDebugLogger2;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Intrinsics.checkNotNullParameter(str, "appId");
                Intrinsics.checkNotNullParameter(appEvent, "event");
                if (enabled) {
                    OutcomeReceiver pACustomAudienceClient$joinCustomAudience$callback$1 = new PACustomAudienceClient$joinCustomAudience$callback$1();
                    gpsDebugLogger2 = null;
                    String validateAndCreateCAName = validateAndCreateCAName(str, appEvent);
                    if (validateAndCreateCAName != null) {
                        AdData.Builder builder = new AdData.Builder();
                        StringBuilder sb = new StringBuilder();
                        String str2 = baseUri;
                        if (str2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                            str2 = null;
                        }
                        Uri parse = Uri.parse(sb.append(str2).append("/ad").toString());
                        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(this)");
                        AdData build = builder.setRenderUri(parse).setMetadata("{'isRealAd': false}").build();
                        TrustedBiddingData.Builder builder2 = new TrustedBiddingData.Builder();
                        StringBuilder sb2 = new StringBuilder();
                        String str3 = baseUri;
                        if (str3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                            str3 = null;
                        }
                        Uri parse2 = Uri.parse(sb2.append(str3).append("?trusted_bidding").toString());
                        Intrinsics.checkExpressionValueIsNotNull(parse2, "Uri.parse(this)");
                        TrustedBiddingData build2 = builder2.setTrustedBiddingUri(parse2).setTrustedBiddingKeys(CollectionsKt.listOf("")).build();
                        CustomAudience.Builder buyer = new CustomAudience.Builder().setName(validateAndCreateCAName).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                        StringBuilder sb3 = new StringBuilder();
                        String str4 = baseUri;
                        if (str4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                            str4 = null;
                        }
                        Uri parse3 = Uri.parse(sb3.append(str4).append("?daily&app_id=").append(str).toString());
                        Intrinsics.checkExpressionValueIsNotNull(parse3, "Uri.parse(this)");
                        CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(parse3);
                        StringBuilder sb4 = new StringBuilder();
                        String str5 = baseUri;
                        if (str5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                            str5 = null;
                        }
                        Uri parse4 = Uri.parse(sb4.append(str5).append("?bidding").toString());
                        Intrinsics.checkExpressionValueIsNotNull(parse4, "Uri.parse(this)");
                        CustomAudience build3 = dailyUpdateUri.setBiddingLogicUri(parse4).setTrustedBiddingData(build2).setUserBiddingSignals(AdSelectionSignals.fromString("{}")).setAds(CollectionsKt.listOf(build)).build();
                        Intrinsics.checkNotNullExpressionValue(build3, "Builder()\n              …(listOf(dummyAd)).build()");
                        JoinCustomAudienceRequest build4 = new JoinCustomAudienceRequest.Builder().setCustomAudience(build3).build();
                        Intrinsics.checkNotNullExpressionValue(build4, "Builder().setCustomAudience(ca).build()");
                        CustomAudienceManager customAudienceManager2 = customAudienceManager;
                        if (customAudienceManager2 != null) {
                            customAudienceManager2.joinCustomAudience(build4, Executors.newSingleThreadExecutor(), pACustomAudienceClient$joinCustomAudience$callback$1);
                        }
                    }
                }
            } catch (Exception e) {
                Log.w(TAG, "Failed to join Custom Audience: " + e);
                GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                if (gpsDebugLogger3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    gpsDebugLogger2 = gpsDebugLogger3;
                }
                Bundle bundle = new Bundle();
                bundle.putString(Constants.GPS_PA_FAILED_REASON, e.toString());
                Unit unit = Unit.INSTANCE;
                gpsDebugLogger2.log(Constants.GPS_PA_FAILED, bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final String validateAndCreateCAName(String str, AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            String string = appEvent.getJSONObject().getString(Constants.EVENT_NAME_EVENT_KEY);
            if (!Intrinsics.areEqual((Object) string, (Object) REPLACEMENT_STRING)) {
                Intrinsics.checkNotNullExpressionValue(string, AnalyticsClient.WORK_INPUT_KEY_EVENT_NAME);
                if (!StringsKt.contains$default((CharSequence) string, (CharSequence) GPS_PREFIX, false, 2, (Object) null)) {
                    return str + '@' + string;
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
