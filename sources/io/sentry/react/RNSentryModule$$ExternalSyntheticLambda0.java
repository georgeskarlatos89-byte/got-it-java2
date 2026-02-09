package io.sentry.react;

import com.facebook.react.bridge.ReadableMap;
import io.sentry.Scope;
import io.sentry.ScopeCallback;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNSentryModule$$ExternalSyntheticLambda0 implements ScopeCallback {
    public final /* synthetic */ ReadableMap f$0;

    public /* synthetic */ RNSentryModule$$ExternalSyntheticLambda0(ReadableMap readableMap) {
        this.f$0 = readableMap;
    }

    public final void run(Scope scope) {
        RNSentryModule.lambda$addBreadcrumb$3(this.f$0, scope);
    }
}
