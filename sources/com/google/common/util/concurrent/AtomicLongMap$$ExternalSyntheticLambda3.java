package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;
import java.util.function.LongUnaryOperator;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AtomicLongMap$$ExternalSyntheticLambda3 implements BiFunction {
    public final /* synthetic */ AtomicLong f$0;
    public final /* synthetic */ LongUnaryOperator f$1;

    public /* synthetic */ AtomicLongMap$$ExternalSyntheticLambda3(AtomicLong atomicLong, LongUnaryOperator longUnaryOperator) {
        this.f$0 = atomicLong;
        this.f$1 = longUnaryOperator;
    }

    public final Object apply(Object obj, Object obj2) {
        return AtomicLongMap.lambda$getAndUpdate$1(this.f$0, this.f$1, obj, (Long) obj2);
    }
}
