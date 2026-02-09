package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.facebook.FacebookSdk;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0002J\n\u0010\"\u001a\u0004\u0018\u00010\rH\u0007J\n\u0010#\u001a\u0004\u0018\u00010$H\u0007J\b\u0010%\u001a\u00020&H\u0007J\b\u0010'\u001a\u00020&H\u0007J\u0012\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010*\u001a\u00020!2\u0006\u0010)\u001a\u00020\rH\u0002J\u0010\u0010+\u001a\u00020!2\u0006\u0010)\u001a\u00020\rH\u0002J\u0010\u0010,\u001a\u00020!2\u0006\u0010)\u001a\u00020\rH\u0007J\u001a\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/facebook/appevents/internal/ActivityLifecycleTracker;", "", "()V", "INCORRECT_IMPL_WARNING", "", "INTERRUPTION_THRESHOLD_MILLISECONDS", "", "TAG", "activityReferences", "", "appId", "currActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "currentActivityAppearTime", "currentFuture", "Ljava/util/concurrent/ScheduledFuture;", "currentFutureLock", "currentSession", "Lcom/facebook/appevents/internal/SessionInfo;", "foregroundActivityCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "iapExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "previousActivityName", "sessionTimeoutInSeconds", "getSessionTimeoutInSeconds", "()I", "singleThreadExecutor", "tracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cancelCurrentTask", "", "getCurrentActivity", "getCurrentSessionGuid", "Ljava/util/UUID;", "isInBackground", "", "isTracking", "onActivityCreated", "activity", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "startTracking", "application", "Landroid/app/Application;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ActivityLifecycleTracker.kt */
public final class ActivityLifecycleTracker {
    private static final String INCORRECT_IMPL_WARNING = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";
    public static final ActivityLifecycleTracker INSTANCE = new ActivityLifecycleTracker();
    private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000;
    /* access modifiers changed from: private */
    public static final String TAG;
    /* access modifiers changed from: private */
    public static int activityReferences;
    private static String appId;
    private static WeakReference<Activity> currActivity;
    private static long currentActivityAppearTime;
    private static volatile ScheduledFuture<?> currentFuture;
    private static final Object currentFutureLock = new Object();
    private static volatile SessionInfo currentSession;
    private static final AtomicInteger foregroundActivityCount = new AtomicInteger(0);
    private static final ScheduledExecutorService iapExecutor = Executors.newSingleThreadScheduledExecutor();
    private static String previousActivityName;
    private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
    private static final AtomicBoolean tracking = new AtomicBoolean(false);

    private ActivityLifecycleTracker() {
    }

    static {
        String canonicalName = ActivityLifecycleTracker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        TAG = canonicalName;
    }

    @JvmStatic
    public static final void startTracking(Application application, String str) {
        Intrinsics.checkNotNullParameter(application, ThreeDSStrings.APPLICATION_KEY);
        if (tracking.compareAndSet(false, true)) {
            FeatureManager.checkFeature(FeatureManager.Feature.CodelessEvents, new ActivityLifecycleTracker$$ExternalSyntheticLambda4());
            appId = str;
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleTracker$startTracking$2());
        }
    }

    /* access modifiers changed from: private */
    public static final void startTracking$lambda$0(boolean z) {
        if (z) {
            CodelessManager.enable();
        } else {
            CodelessManager.disable();
        }
    }

    @JvmStatic
    public static final boolean isInBackground() {
        return activityReferences == 0;
    }

    @JvmStatic
    public static final boolean isTracking() {
        return tracking.get();
    }

    @JvmStatic
    public static final UUID getCurrentSessionGuid() {
        SessionInfo sessionInfo;
        if (currentSession == null || (sessionInfo = currentSession) == null) {
            return null;
        }
        return sessionInfo.getSessionId();
    }

    @JvmStatic
    public static final void onActivityCreated(Activity activity) {
        singleThreadExecutor.execute(new ActivityLifecycleTracker$$ExternalSyntheticLambda5());
    }

    /* access modifiers changed from: private */
    public static final void onActivityCreated$lambda$1() {
        if (currentSession == null) {
            currentSession = SessionInfo.Companion.getStoredSessionInfo();
        }
    }

    @JvmStatic
    public static final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ActivityLifecycleTracker activityLifecycleTracker = INSTANCE;
        currActivity = new WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        activityLifecycleTracker.cancelCurrentTask();
        long currentTimeMillis = System.currentTimeMillis();
        currentActivityAppearTime = currentTimeMillis;
        String activityName = Utility.getActivityName(activity);
        CodelessManager.onActivityResumed(activity);
        MetadataIndexer.onActivityResumed(activity);
        SuggestedEventsManager.trackActivity(activity);
        String str = previousActivityName;
        boolean z = false;
        if (str != null && StringsKt.contains$default((CharSequence) str, (CharSequence) "ProxyBillingActivity", false, 2, (Object) null)) {
            z = true;
        }
        if (z && !Intrinsics.areEqual((Object) activityName, (Object) "ProxyBillingActivity")) {
            iapExecutor.execute(new ActivityLifecycleTracker$$ExternalSyntheticLambda1());
        }
        singleThreadExecutor.execute(new ActivityLifecycleTracker$$ExternalSyntheticLambda2(currentTimeMillis, activityName, activity.getApplicationContext()));
        previousActivityName = activityName;
    }

    /* access modifiers changed from: private */
    public static final void onActivityResumed$lambda$2() {
        InAppPurchaseManager.startTracking();
    }

    /* access modifiers changed from: private */
    public static final void onActivityResumed$lambda$3(long j, String str, Context context) {
        SessionInfo sessionInfo;
        Intrinsics.checkNotNullParameter(str, "$activityName");
        SessionInfo sessionInfo2 = currentSession;
        Long sessionLastEventTime = sessionInfo2 != null ? sessionInfo2.getSessionLastEventTime() : null;
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null);
            String str2 = appId;
            Intrinsics.checkNotNullExpressionValue(context, "appContext");
            SessionLogger.logActivateApp(str, (SourceApplicationInfo) null, str2, context);
        } else if (sessionLastEventTime != null) {
            long longValue = j - sessionLastEventTime.longValue();
            if (longValue > ((long) (INSTANCE.getSessionTimeoutInSeconds() * 1000))) {
                SessionLogger.logDeactivateApp(str, currentSession, appId);
                String str3 = appId;
                Intrinsics.checkNotNullExpressionValue(context, "appContext");
                SessionLogger.logActivateApp(str, (SourceApplicationInfo) null, str3, context);
                currentSession = new SessionInfo(Long.valueOf(j), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null);
            } else if (longValue > 1000 && (sessionInfo = currentSession) != null) {
                sessionInfo.incrementInterruptionCount();
            }
        }
        SessionInfo sessionInfo3 = currentSession;
        if (sessionInfo3 != null) {
            sessionInfo3.setSessionLastEventTime(Long.valueOf(j));
        }
        SessionInfo sessionInfo4 = currentSession;
        if (sessionInfo4 != null) {
            sessionInfo4.writeSessionToDisk();
        }
    }

    /* access modifiers changed from: private */
    public final void onActivityPaused(Activity activity) {
        AtomicInteger atomicInteger = foregroundActivityCount;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(TAG, INCORRECT_IMPL_WARNING);
        }
        cancelCurrentTask();
        long currentTimeMillis = System.currentTimeMillis();
        String activityName = Utility.getActivityName(activity);
        CodelessManager.onActivityPaused(activity);
        singleThreadExecutor.execute(new ActivityLifecycleTracker$$ExternalSyntheticLambda0(currentTimeMillis, activityName));
    }

    /* access modifiers changed from: private */
    public static final void onActivityPaused$lambda$7(long j, String str) {
        Intrinsics.checkNotNullParameter(str, "$activityName");
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null);
        }
        SessionInfo sessionInfo = currentSession;
        if (sessionInfo != null) {
            sessionInfo.setSessionLastEventTime(Long.valueOf(j));
        }
        if (foregroundActivityCount.get() <= 0) {
            ActivityLifecycleTracker$$ExternalSyntheticLambda3 activityLifecycleTracker$$ExternalSyntheticLambda3 = new ActivityLifecycleTracker$$ExternalSyntheticLambda3(j, str);
            synchronized (currentFutureLock) {
                currentFuture = singleThreadExecutor.schedule(activityLifecycleTracker$$ExternalSyntheticLambda3, (long) INSTANCE.getSessionTimeoutInSeconds(), TimeUnit.SECONDS);
                Unit unit = Unit.INSTANCE;
            }
        }
        long j2 = currentActivityAppearTime;
        long j3 = 0;
        if (j2 > 0) {
            j3 = (j - j2) / ((long) 1000);
        }
        AutomaticAnalyticsLogger.logActivityTimeSpentEvent(str, j3);
        SessionInfo sessionInfo2 = currentSession;
        if (sessionInfo2 != null) {
            sessionInfo2.writeSessionToDisk();
        }
    }

    /* access modifiers changed from: private */
    public static final void onActivityPaused$lambda$7$lambda$5(long j, String str) {
        Intrinsics.checkNotNullParameter(str, "$activityName");
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null);
        }
        if (foregroundActivityCount.get() <= 0) {
            SessionLogger.logDeactivateApp(str, currentSession, appId);
            SessionInfo.Companion.clearSavedSessionFromDisk();
            currentSession = null;
        }
        synchronized (currentFutureLock) {
            currentFuture = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: private */
    public final void onActivityDestroyed(Activity activity) {
        CodelessManager.onActivityDestroyed(activity);
    }

    private final int getSessionTimeoutInSeconds() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if (appSettingsWithoutQuery == null) {
            return Constants.getDefaultAppEventsSessionTimeoutInSeconds();
        }
        return appSettingsWithoutQuery.getSessionTimeoutInSeconds();
    }

    private final void cancelCurrentTask() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (currentFutureLock) {
            if (!(currentFuture == null || (scheduledFuture = currentFuture) == null)) {
                scheduledFuture.cancel(false);
            }
            currentFuture = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }
}
