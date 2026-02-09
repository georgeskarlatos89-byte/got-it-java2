package io.sentry.android.core;

import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.SentryOptions;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AndroidOptionsInitializer$$ExternalSyntheticLambda0 implements SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath {
    public final /* synthetic */ SentryOptions f$0;

    public /* synthetic */ AndroidOptionsInitializer$$ExternalSyntheticLambda0(SentryOptions sentryOptions) {
        this.f$0 = sentryOptions;
    }

    public final String getDirPath() {
        return this.f$0.getCacheDirPath();
    }
}
