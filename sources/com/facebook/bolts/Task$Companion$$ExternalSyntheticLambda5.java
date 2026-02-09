package com.facebook.bolts;

import com.facebook.bolts.Task;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Task$Companion$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ TaskCompletionSource f$0;

    public /* synthetic */ Task$Companion$$ExternalSyntheticLambda5(TaskCompletionSource taskCompletionSource) {
        this.f$0 = taskCompletionSource;
    }

    public final void run() {
        Task.Companion.delay$lambda$0(this.f$0);
    }
}
