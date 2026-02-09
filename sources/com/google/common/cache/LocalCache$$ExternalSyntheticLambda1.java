package com.google.common.cache;

import java.util.function.BiFunction;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class LocalCache$$ExternalSyntheticLambda1 implements BiFunction {
    public final /* synthetic */ BiFunction f$0;

    public /* synthetic */ LocalCache$$ExternalSyntheticLambda1(BiFunction biFunction) {
        this.f$0 = biFunction;
    }

    public final Object apply(Object obj, Object obj2) {
        return LocalCache.lambda$computeIfPresent$1(this.f$0, obj, obj2);
    }
}
