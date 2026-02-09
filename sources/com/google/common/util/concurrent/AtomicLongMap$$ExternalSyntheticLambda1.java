package com.google.common.util.concurrent;

import java.util.function.BiFunction;
import java.util.function.LongUnaryOperator;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AtomicLongMap$$ExternalSyntheticLambda1 implements BiFunction {
    public final /* synthetic */ LongUnaryOperator f$0;

    public /* synthetic */ AtomicLongMap$$ExternalSyntheticLambda1(LongUnaryOperator longUnaryOperator) {
        this.f$0 = longUnaryOperator;
    }

    public final Object apply(Object obj, Object obj2) {
        return AtomicLongMap.lambda$updateAndGet$0(this.f$0, obj, (Long) obj2);
    }
}
