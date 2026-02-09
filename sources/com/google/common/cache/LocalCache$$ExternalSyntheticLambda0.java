package com.google.common.cache;

import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class LocalCache$$ExternalSyntheticLambda0 implements BiFunction {
    public final /* synthetic */ Function f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ LocalCache$$ExternalSyntheticLambda0(Function function, Object obj) {
        this.f$0 = function;
        this.f$1 = obj;
    }

    public final Object apply(Object obj, Object obj2) {
        return LocalCache.lambda$computeIfAbsent$0(this.f$0, this.f$1, obj, obj2);
    }
}
