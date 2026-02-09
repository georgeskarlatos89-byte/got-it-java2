package io.sentry;

import io.sentry.Scope;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SentryClient$$ExternalSyntheticLambda0 implements Scope.IWithSession {
    public final /* synthetic */ SentryClient f$0;
    public final /* synthetic */ SentryEvent f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ SentryClient$$ExternalSyntheticLambda0(SentryClient sentryClient, SentryEvent sentryEvent, Object obj) {
        this.f$0 = sentryClient;
        this.f$1 = sentryEvent;
        this.f$2 = obj;
    }

    public final void accept(Session session) {
        this.f$0.m1076lambda$updateSessionData$0$iosentrySentryClient(this.f$1, this.f$2, session);
    }
}
