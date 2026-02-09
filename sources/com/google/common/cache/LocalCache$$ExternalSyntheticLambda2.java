package com.google.common.cache;

import java.util.function.BiFunction;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class LocalCache$$ExternalSyntheticLambda2 implements BiFunction {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ BiFunction f$1;

    public /* synthetic */ LocalCache$$ExternalSyntheticLambda2(Object obj, BiFunction biFunction) {
        this.f$0 = obj;
        this.f$1 = biFunction;
    }

    public final Object apply(Object obj, Object obj2) {
        return LocalCache.lambda$merge$2(this.f$0, this.f$1, obj, obj2);
    }
}
