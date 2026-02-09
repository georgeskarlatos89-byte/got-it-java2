package com.dooboolab.rniap;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNIapModule$$ExternalSyntheticLambda0 implements Callback {
    public final /* synthetic */ RNIapModule f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Promise f$2;

    public /* synthetic */ RNIapModule$$ExternalSyntheticLambda0(RNIapModule rNIapModule, Function1 function1, Promise promise) {
        this.f$0 = rNIapModule;
        this.f$1 = function1;
        this.f$2 = promise;
    }

    public final void invoke(Object[] objArr) {
        RNIapModule.ensureConnection$lambda$0(this.f$0, this.f$1, this.f$2, objArr);
    }
}
