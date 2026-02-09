package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import io.sentry.DateUtils;
import java.util.Date;

public final class SentryPerformanceProvider extends ContentProvider implements Application.ActivityLifecycleCallbacks {
    private static long appStartMillis = SystemClock.uptimeMillis();
    private static Date appStartTime = DateUtils.getCurrentDateTime();
    private Application application;
    private boolean firstActivityCreated = false;

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public SentryPerformanceProvider() {
        AppStartState.getInstance().setAppStartTime(appStartMillis, appStartTime);
    }

    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        if (!(context instanceof Application)) {
            return true;
        }
        Application application2 = (Application) context;
        this.application = application2;
        application2.registerActivityLifecycleCallbacks(this);
        return true;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (!SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            return;
        }
        throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
    }

    static void setAppStartTime(long j, Date date) {
        appStartMillis = j;
        appStartTime = date;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.firstActivityCreated) {
            AppStartState.getInstance().setColdStart(bundle == null);
            Application application2 = this.application;
            if (application2 != null) {
                application2.unregisterActivityLifecycleCallbacks(this);
            }
            this.firstActivityCreated = true;
        }
    }
}
