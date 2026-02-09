package io.sentry.react;

import com.facebook.react.bridge.ReadableMap;
import io.sentry.Scope;
import io.sentry.ScopeCallback;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNSentryModule$$ExternalSyntheticLambda1 implements ScopeCallback {
    public final /* synthetic */ ReadableMap f$0;
    public final /* synthetic */ ReadableMap f$1;

    public /* synthetic */ RNSentryModule$$ExternalSyntheticLambda1(ReadableMap readableMap, ReadableMap readableMap2) {
        this.f$0 = readableMap;
        this.f$1 = readableMap2;
    }

    public final void run(Scope scope) {
        RNSentryModule.lambda$setUser$2(this.f$0, this.f$1, scope);
    }
}
