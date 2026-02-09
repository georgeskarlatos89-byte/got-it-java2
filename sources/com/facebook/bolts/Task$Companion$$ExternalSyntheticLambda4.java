package com.facebook.bolts;

import com.facebook.bolts.Task;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Task$Companion$$ExternalSyntheticLambda4 implements Continuation {
    public final /* synthetic */ CancellationToken f$0;
    public final /* synthetic */ TaskCompletionSource f$1;

    public /* synthetic */ Task$Companion$$ExternalSyntheticLambda4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource) {
        this.f$0 = cancellationToken;
        this.f$1 = taskCompletionSource;
    }

    public final Object then(Task task) {
        return Task.Companion.completeAfterTask$lambda$7$lambda$6(this.f$0, this.f$1, task);
    }
}
