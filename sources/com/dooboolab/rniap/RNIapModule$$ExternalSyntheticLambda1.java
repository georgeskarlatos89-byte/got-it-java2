package com.dooboolab.rniap;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNIapModule$$ExternalSyntheticLambda1 implements Callback {
    public final /* synthetic */ Promise f$0;

    public /* synthetic */ RNIapModule$$ExternalSyntheticLambda1(Promise promise) {
        this.f$0 = promise;
    }

    public final void invoke(Object[] objArr) {
        RNIapModule.ensureConnection$lambda$1(this.f$0, objArr);
    }
}
