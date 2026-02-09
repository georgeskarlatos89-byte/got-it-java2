package io.sentry.react;

import com.facebook.react.bridge.ReadableMap;
import io.sentry.Sentry;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNSentryModule$$ExternalSyntheticLambda4 implements Sentry.OptionsConfiguration {
    public final /* synthetic */ RNSentryModule f$0;
    public final /* synthetic */ ReadableMap f$1;

    public /* synthetic */ RNSentryModule$$ExternalSyntheticLambda4(RNSentryModule rNSentryModule, ReadableMap readableMap) {
        this.f$0 = rNSentryModule;
        this.f$1 = readableMap;
    }

    public final void configure(SentryOptions sentryOptions) {
        this.f$0.m1097lambda$initNativeSdk$1$iosentryreactRNSentryModule(this.f$1, (SentryAndroidOptions) sentryOptions);
    }
}
