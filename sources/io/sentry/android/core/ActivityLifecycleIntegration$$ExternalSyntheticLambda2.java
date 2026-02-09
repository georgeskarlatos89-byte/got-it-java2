package io.sentry.android.core;

import android.app.Activity;
import io.sentry.ITransaction;
import io.sentry.TransactionFinishedCallback;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ActivityLifecycleIntegration$$ExternalSyntheticLambda2 implements TransactionFinishedCallback {
    public final /* synthetic */ ActivityLifecycleIntegration f$0;
    public final /* synthetic */ Activity f$1;

    public /* synthetic */ ActivityLifecycleIntegration$$ExternalSyntheticLambda2(ActivityLifecycleIntegration activityLifecycleIntegration, Activity activity) {
        this.f$0 = activityLifecycleIntegration;
        this.f$1 = activity;
    }

    public final void execute(ITransaction iTransaction) {
        this.f$0.m1083lambda$startTracing$1$iosentryandroidcoreActivityLifecycleIntegration(this.f$1, iTransaction);
    }
}
