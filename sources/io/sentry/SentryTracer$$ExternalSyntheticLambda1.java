package io.sentry;

import io.sentry.Scope;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SentryTracer$$ExternalSyntheticLambda1 implements Scope.IWithTransaction {
    public final /* synthetic */ SentryTracer f$0;
    public final /* synthetic */ Scope f$1;

    public /* synthetic */ SentryTracer$$ExternalSyntheticLambda1(SentryTracer sentryTracer, Scope scope) {
        this.f$0 = sentryTracer;
        this.f$1 = scope;
    }

    public final void accept(ITransaction iTransaction) {
        this.f$0.m1078lambda$finish$1$iosentrySentryTracer(this.f$1, iTransaction);
    }
}
