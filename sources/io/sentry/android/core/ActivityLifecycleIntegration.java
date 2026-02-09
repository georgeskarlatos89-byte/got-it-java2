package io.sentry.android.core;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import androidx.core.app.NotificationCompat;
import com.brentvatne.react.ReactVideoViewManager;
import io.sentry.Breadcrumb;
import io.sentry.IHub;
import io.sentry.ISpan;
import io.sentry.ITransaction;
import io.sentry.Integration;
import io.sentry.Scope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class ActivityLifecycleIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {
    static final String APP_START_COLD = "app.start.cold";
    static final String APP_START_WARM = "app.start.warm";
    static final String UI_LOAD_OP = "ui.load";
    private final WeakHashMap<Activity, ITransaction> activitiesWithOngoingTransactions = new WeakHashMap<>();
    private final ActivityFramesTracker activityFramesTracker;
    private ISpan appStartSpan;
    private final Application application;
    private boolean firstActivityCreated = false;
    private boolean firstActivityResumed = false;
    private boolean foregroundImportance = false;
    private IHub hub;
    private boolean isAllActivityCallbacksAvailable;
    private SentryAndroidOptions options;
    private boolean performanceEnabled = false;

    private String getAppStartDesc(boolean z) {
        return z ? "Cold Start" : "Warm Start";
    }

    private String getAppStartOp(boolean z) {
        return z ? APP_START_COLD : APP_START_WARM;
    }

    public ActivityLifecycleIntegration(Application application2, IBuildInfoProvider iBuildInfoProvider, ActivityFramesTracker activityFramesTracker2) {
        Application application3 = (Application) Objects.requireNonNull(application2, "Application is required");
        this.application = application3;
        Objects.requireNonNull(iBuildInfoProvider, "BuildInfoProvider is required");
        this.activityFramesTracker = (ActivityFramesTracker) Objects.requireNonNull(activityFramesTracker2, "ActivityFramesTracker is required");
        if (iBuildInfoProvider.getSdkInfoVersion() >= 29) {
            this.isAllActivityCallbacksAvailable = true;
        }
        this.foregroundImportance = isForegroundImportance(application3);
    }

    public void register(IHub iHub, SentryOptions sentryOptions) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.hub = (IHub) Objects.requireNonNull(iHub, "Hub is required");
        this.options.getLogger().log(SentryLevel.DEBUG, "ActivityLifecycleIntegration enabled: %s", Boolean.valueOf(this.options.isEnableActivityLifecycleBreadcrumbs()));
        this.performanceEnabled = isPerformanceEnabled(this.options);
        if (this.options.isEnableActivityLifecycleBreadcrumbs() || this.performanceEnabled) {
            this.application.registerActivityLifecycleCallbacks(this);
            this.options.getLogger().log(SentryLevel.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        }
    }

    private boolean isPerformanceEnabled(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    public void close() throws IOException {
        this.application.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.activityFramesTracker.stop();
    }

    private void addBreadcrumb(Activity activity, String str) {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null && this.hub != null && sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setType(NotificationCompat.CATEGORY_NAVIGATION);
            breadcrumb.setData("state", str);
            breadcrumb.setData("screen", getActivityName(activity));
            breadcrumb.setCategory("ui.lifecycle");
            breadcrumb.setLevel(SentryLevel.INFO);
            this.hub.addBreadcrumb(breadcrumb);
        }
    }

    private String getActivityName(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private void stopPreviousTransactions() {
        for (Map.Entry<Activity, ITransaction> value : this.activitiesWithOngoingTransactions.entrySet()) {
            finishTransaction((ITransaction) value.getValue());
        }
    }

    private void startTracing(Activity activity) {
        ITransaction iTransaction;
        if (this.performanceEnabled && !isRunningTransaction(activity) && this.hub != null) {
            stopPreviousTransactions();
            String activityName = getActivityName(activity);
            Date appStartTime = this.foregroundImportance ? AppStartState.getInstance().getAppStartTime() : null;
            Boolean isColdStart = AppStartState.getInstance().isColdStart();
            if (this.firstActivityCreated || appStartTime == null || isColdStart == null) {
                Date date = null;
                iTransaction = this.hub.startTransaction(activityName, UI_LOAD_OP, (Date) null, true, new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(this, activity));
            } else {
                iTransaction = this.hub.startTransaction(activityName, UI_LOAD_OP, appStartTime, true, new ActivityLifecycleIntegration$$ExternalSyntheticLambda2(this, activity));
                this.appStartSpan = iTransaction.startChild(getAppStartOp(isColdStart.booleanValue()), getAppStartDesc(isColdStart.booleanValue()), appStartTime);
            }
            this.hub.configureScope(new ActivityLifecycleIntegration$$ExternalSyntheticLambda3(this, iTransaction));
            this.activitiesWithOngoingTransactions.put(activity, iTransaction);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$startTracing$0$io-sentry-android-core-ActivityLifecycleIntegration  reason: not valid java name */
    public /* synthetic */ void m1082lambda$startTracing$0$iosentryandroidcoreActivityLifecycleIntegration(Activity activity, ITransaction iTransaction) {
        this.activityFramesTracker.setMetrics(activity, iTransaction.getEventId());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$startTracing$1$io-sentry-android-core-ActivityLifecycleIntegration  reason: not valid java name */
    public /* synthetic */ void m1083lambda$startTracing$1$iosentryandroidcoreActivityLifecycleIntegration(Activity activity, ITransaction iTransaction) {
        this.activityFramesTracker.setMetrics(activity, iTransaction.getEventId());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: applyScope */
    public void m1084lambda$startTracing$2$iosentryandroidcoreActivityLifecycleIntegration(Scope scope, ITransaction iTransaction) {
        scope.withTransaction(new ActivityLifecycleIntegration$$ExternalSyntheticLambda0(this, scope, iTransaction));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$applyScope$3$io-sentry-android-core-ActivityLifecycleIntegration  reason: not valid java name */
    public /* synthetic */ void m1081lambda$applyScope$3$iosentryandroidcoreActivityLifecycleIntegration(Scope scope, ITransaction iTransaction, ITransaction iTransaction2) {
        if (iTransaction2 == null) {
            scope.setTransaction(iTransaction);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", iTransaction.getName());
        }
    }

    private boolean isRunningTransaction(Activity activity) {
        return this.activitiesWithOngoingTransactions.containsKey(activity);
    }

    private void stopTracing(Activity activity, boolean z) {
        if (this.performanceEnabled && z) {
            finishTransaction(this.activitiesWithOngoingTransactions.get(activity));
        }
    }

    private void finishTransaction(ITransaction iTransaction) {
        if (iTransaction != null && !iTransaction.isFinished()) {
            SpanStatus status = iTransaction.getStatus();
            if (status == null) {
                status = SpanStatus.OK;
            }
            iTransaction.finish(status);
        }
    }

    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        setColdStart(bundle);
        addBreadcrumb(activity, "created");
        startTracing(activity);
        this.firstActivityCreated = true;
    }

    public synchronized void onActivityStarted(Activity activity) {
        this.activityFramesTracker.addActivity(activity);
        addBreadcrumb(activity, "started");
    }

    public synchronized void onActivityResumed(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions;
        ISpan iSpan;
        if (!this.firstActivityResumed) {
            if (this.foregroundImportance) {
                AppStartState.getInstance().setAppStartEnd();
            } else {
                SentryAndroidOptions sentryAndroidOptions2 = this.options;
                if (sentryAndroidOptions2 != null) {
                    sentryAndroidOptions2.getLogger().log(SentryLevel.DEBUG, "App Start won't be reported because Process wasn't of foregroundImportance.", new Object[0]);
                }
            }
            if (this.performanceEnabled && (iSpan = this.appStartSpan) != null) {
                iSpan.finish();
            }
            this.firstActivityResumed = true;
        }
        addBreadcrumb(activity, "resumed");
        if (!this.isAllActivityCallbacksAvailable && (sentryAndroidOptions = this.options) != null) {
            stopTracing(activity, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish());
        }
    }

    public synchronized void onActivityPostResumed(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions;
        if (this.isAllActivityCallbacksAvailable && (sentryAndroidOptions = this.options) != null) {
            stopTracing(activity, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish());
        }
    }

    public synchronized void onActivityPaused(Activity activity) {
        addBreadcrumb(activity, ReactVideoViewManager.PROP_PAUSED);
    }

    public synchronized void onActivityStopped(Activity activity) {
        addBreadcrumb(activity, "stopped");
    }

    public synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        addBreadcrumb(activity, "saveInstanceState");
    }

    public synchronized void onActivityDestroyed(Activity activity) {
        addBreadcrumb(activity, "destroyed");
        ISpan iSpan = this.appStartSpan;
        if (iSpan != null && !iSpan.isFinished()) {
            this.appStartSpan.finish(SpanStatus.CANCELLED);
        }
        stopTracing(activity, true);
        this.appStartSpan = null;
        if (this.performanceEnabled) {
            this.activitiesWithOngoingTransactions.remove(activity);
        }
    }

    /* access modifiers changed from: package-private */
    public WeakHashMap<Activity, ITransaction> getActivitiesWithOngoingTransactions() {
        return this.activitiesWithOngoingTransactions;
    }

    /* access modifiers changed from: package-private */
    public ISpan getAppStartSpan() {
        return this.appStartSpan;
    }

    private void setColdStart(Bundle bundle) {
        if (!this.firstActivityCreated) {
            AppStartState.getInstance().setColdStart(bundle == null);
        }
    }

    private boolean isForegroundImportance(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager) || (runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses()) == null) {
                return false;
            }
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.importance == 100;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
