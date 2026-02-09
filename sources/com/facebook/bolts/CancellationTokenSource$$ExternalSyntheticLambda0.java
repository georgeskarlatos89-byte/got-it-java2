package com.facebook.bolts;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CancellationTokenSource$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ CancellationTokenSource f$0;

    public /* synthetic */ CancellationTokenSource$$ExternalSyntheticLambda0(CancellationTokenSource cancellationTokenSource) {
        this.f$0 = cancellationTokenSource;
    }

    public final void run() {
        CancellationTokenSource.cancelAfter$lambda$6$lambda$5(this.f$0);
    }
}
