package io.sentry.react;

import io.sentry.SentryEvent;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNSentryModule$$ExternalSyntheticLambda3 implements SentryOptions.BeforeSendCallback {
    public final /* synthetic */ RNSentryModule f$0;
    public final /* synthetic */ SentryAndroidOptions f$1;

    public /* synthetic */ RNSentryModule$$ExternalSyntheticLambda3(RNSentryModule rNSentryModule, SentryAndroidOptions sentryAndroidOptions) {
        this.f$0 = rNSentryModule;
        this.f$1 = sentryAndroidOptions;
    }

    public final SentryEvent execute(SentryEvent sentryEvent, Object obj) {
        return this.f$0.m1096lambda$initNativeSdk$0$iosentryreactRNSentryModule(this.f$1, sentryEvent, obj);
    }
}
