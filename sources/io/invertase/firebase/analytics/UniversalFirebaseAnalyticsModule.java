package io.invertase.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.invertase.firebase.common.UniversalFirebaseModule;
import java.util.Set;

public class UniversalFirebaseAnalyticsModule extends UniversalFirebaseModule {
    UniversalFirebaseAnalyticsModule(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: package-private */
    public Task<Void> logEvent(String str, Bundle bundle) {
        return Tasks.call(new UniversalFirebaseAnalyticsModule$$ExternalSyntheticLambda4(this, str, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$logEvent$0$io-invertase-firebase-analytics-UniversalFirebaseAnalyticsModule  reason: not valid java name */
    public /* synthetic */ Void m1062lambda$logEvent$0$ioinvertasefirebaseanalyticsUniversalFirebaseAnalyticsModule(String str, Bundle bundle) throws Exception {
        FirebaseAnalytics.getInstance(getContext()).logEvent(str, bundle);
        return null;
    }

    /* access modifiers changed from: package-private */
    public Task<Void> setAnalyticsCollectionEnabled(Boolean bool) {
        return Tasks.call(new UniversalFirebaseAnalyticsModule$$ExternalSyntheticLambda2(this, bool));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setAnalyticsCollectionEnabled$1$io-invertase-firebase-analytics-UniversalFirebaseAnalyticsModule  reason: not valid java name */
    public /* synthetic */ Void m1064lambda$setAnalyticsCollectionEnabled$1$ioinvertasefirebaseanalyticsUniversalFirebaseAnalyticsModule(Boolean bool) throws Exception {
        FirebaseAnalytics.getInstance(getContext()).setAnalyticsCollectionEnabled(bool.booleanValue());
        return null;
    }

    /* access modifiers changed from: package-private */
    public Task<Void> setSessionTimeoutDuration(long j) {
        return Tasks.call(new UniversalFirebaseAnalyticsModule$$ExternalSyntheticLambda5(this, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setSessionTimeoutDuration$2$io-invertase-firebase-analytics-UniversalFirebaseAnalyticsModule  reason: not valid java name */
    public /* synthetic */ Void m1066lambda$setSessionTimeoutDuration$2$ioinvertasefirebaseanalyticsUniversalFirebaseAnalyticsModule(long j) throws Exception {
        FirebaseAnalytics.getInstance(getContext()).setSessionTimeoutDuration(j);
        return null;
    }

    /* access modifiers changed from: package-private */
    public Task<String> getAppInstanceId() {
        return FirebaseAnalytics.getInstance(getContext()).getAppInstanceId();
    }

    /* access modifiers changed from: package-private */
    public Task<Void> setUserId(String str) {
        return Tasks.call(new UniversalFirebaseAnalyticsModule$$ExternalSyntheticLambda6(this, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setUserId$3$io-invertase-firebase-analytics-UniversalFirebaseAnalyticsModule  reason: not valid java name */
    public /* synthetic */ Void m1067lambda$setUserId$3$ioinvertasefirebaseanalyticsUniversalFirebaseAnalyticsModule(String str) throws Exception {
        FirebaseAnalytics.getInstance(getContext()).setUserId(str);
        return null;
    }

    /* access modifiers changed from: package-private */
    public Task<Void> setUserProperty(String str, String str2) {
        return Tasks.call(new UniversalFirebaseAnalyticsModule$$ExternalSyntheticLambda3(this, str, str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setUserProperty$4$io-invertase-firebase-analytics-UniversalFirebaseAnalyticsModule  reason: not valid java name */
    public /* synthetic */ Void m1069lambda$setUserProperty$4$ioinvertasefirebaseanalyticsUniversalFirebaseAnalyticsModule(String str, String str2) throws Exception {
        FirebaseAnalytics.getInstance(getContext()).setUserProperty(str, str2);
        return null;
    }

    /* access modifiers changed from: package-private */
    public Task<Void> setUserProperties(Bundle bundle) {
        return Tasks.call(new UniversalFirebaseAnalyticsModule$$ExternalSyntheticLambda7(this, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setUserProperties$5$io-invertase-firebase-analytics-UniversalFirebaseAnalyticsModule  reason: not valid java name */
    public /* synthetic */ Void m1068lambda$setUserProperties$5$ioinvertasefirebaseanalyticsUniversalFirebaseAnalyticsModule(Bundle bundle) throws Exception {
        Set<String> keySet = bundle.keySet();
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(getContext());
        for (String str : keySet) {
            instance.setUserProperty(str, (String) bundle.get(str));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Task<Void> resetAnalyticsData() {
        return Tasks.call(new UniversalFirebaseAnalyticsModule$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$resetAnalyticsData$6$io-invertase-firebase-analytics-UniversalFirebaseAnalyticsModule  reason: not valid java name */
    public /* synthetic */ Void m1063lambda$resetAnalyticsData$6$ioinvertasefirebaseanalyticsUniversalFirebaseAnalyticsModule() throws Exception {
        FirebaseAnalytics.getInstance(getContext()).resetAnalyticsData();
        return null;
    }

    /* access modifiers changed from: package-private */
    public Task<Void> setDefaultEventParameters(Bundle bundle) {
        return Tasks.call(new UniversalFirebaseAnalyticsModule$$ExternalSyntheticLambda1(this, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setDefaultEventParameters$7$io-invertase-firebase-analytics-UniversalFirebaseAnalyticsModule  reason: not valid java name */
    public /* synthetic */ Void m1065lambda$setDefaultEventParameters$7$ioinvertasefirebaseanalyticsUniversalFirebaseAnalyticsModule(Bundle bundle) throws Exception {
        FirebaseAnalytics.getInstance(getContext()).setDefaultEventParameters(bundle);
        return null;
    }
}
