package io.sentry.android.core;

import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.SentryOptions;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AndroidOptionsInitializer$$ExternalSyntheticLambda1 implements SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath {
    public final /* synthetic */ SentryOptions f$0;

    public /* synthetic */ AndroidOptionsInitializer$$ExternalSyntheticLambda1(SentryOptions sentryOptions) {
        this.f$0 = sentryOptions;
    }

    public final String getDirPath() {
        return this.f$0.getOutboxPath();
    }
}
