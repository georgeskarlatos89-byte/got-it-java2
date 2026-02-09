package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/internal/AppLinkManager;", "", "()V", "preferences", "Landroid/content/SharedPreferences;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences$delegate", "Lkotlin/Lazy;", "getCampaignIDFromIntentExtra", "", "intent", "Landroid/content/Intent;", "getCampaignIDFromUri", "uri", "Landroid/net/Uri;", "getInfo", "key", "handleURL", "", "activity", "Landroid/app/Activity;", "processCampaignIds", "setupLifecycleListener", "application", "Landroid/app/Application;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppLinkManager.kt */
public final class AppLinkManager {
    public static final String APPLINK_DATA_KEY = "al_applink_data";
    public static final String APPLINK_INFO = "com.facebook.sdk.APPLINK_INFO";
    public static final String CAMPAIGN_IDS_KEY = "campaign_ids";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static volatile AppLinkManager instance;
    private final Lazy preferences$delegate;

    public /* synthetic */ AppLinkManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AppLinkManager() {
        this.preferences$delegate = LazyKt.lazy(AppLinkManager$preferences$2.INSTANCE);
    }

    public static final /* synthetic */ AppLinkManager access$getInstance$cp() {
        Class<AppLinkManager> cls = AppLinkManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(AppLinkManager appLinkManager) {
        Class<AppLinkManager> cls = AppLinkManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                instance = appLinkManager;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final SharedPreferences getPreferences() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Object value = this.preferences$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-preferences>(...)");
            return (SharedPreferences) value;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/appevents/internal/AppLinkManager$Companion;", "", "()V", "APPLINK_DATA_KEY", "", "APPLINK_INFO", "CAMPAIGN_IDS_KEY", "instance", "Lcom/facebook/appevents/internal/AppLinkManager;", "getInstance", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AppLinkManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AppLinkManager getInstance() {
            AppLinkManager access$getInstance$cp = AppLinkManager.access$getInstance$cp();
            if (access$getInstance$cp == null) {
                synchronized (this) {
                    if (!FacebookSdk.isInitialized()) {
                        return null;
                    }
                    access$getInstance$cp = AppLinkManager.access$getInstance$cp();
                    if (access$getInstance$cp == null) {
                        access$getInstance$cp = new AppLinkManager((DefaultConstructorMarker) null);
                        Companion companion = AppLinkManager.Companion;
                        AppLinkManager.access$setInstance$cp(access$getInstance$cp);
                    }
                }
            }
            return access$getInstance$cp;
        }
    }

    public final void handleURL(Activity activity) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Uri data = activity.getIntent().getData();
                if (data != null) {
                    Intent intent = activity.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent, "activity.intent");
                    processCampaignIds(data, intent);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void processCampaignIds(Uri uri, Intent intent) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(intent, SDKConstants.PARAM_INTENT);
                String campaignIDFromUri = getCampaignIDFromUri(uri);
                if (campaignIDFromUri == null) {
                    campaignIDFromUri = getCampaignIDFromIntentExtra(intent);
                }
                if (campaignIDFromUri != null) {
                    getPreferences().edit().putString(CAMPAIGN_IDS_KEY, campaignIDFromUri).apply();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final String getCampaignIDFromUri(Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(uri, "uri");
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            return new JSONObject(queryParameter).getString(CAMPAIGN_IDS_KEY);
        } catch (Exception unused) {
            Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getCampaignIDFromIntentExtra(Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, SDKConstants.PARAM_INTENT);
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            return bundleExtra.getString(CAMPAIGN_IDS_KEY);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getInfo(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            return getPreferences().getString(str, (String) null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void setupLifecycleListener(Application application) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Intrinsics.checkNotNullParameter(application, ThreeDSStrings.APPLICATION_KEY);
                application.registerActivityLifecycleCallbacks(new AppLinkManager$setupLifecycleListener$1());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
