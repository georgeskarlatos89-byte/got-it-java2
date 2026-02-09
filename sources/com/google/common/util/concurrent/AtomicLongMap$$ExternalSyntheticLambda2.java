package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiFunction;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AtomicLongMap$$ExternalSyntheticLambda2 implements BiFunction {
    public final /* synthetic */ AtomicBoolean f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ AtomicLongMap$$ExternalSyntheticLambda2(AtomicBoolean atomicBoolean, long j) {
        this.f$0 = atomicBoolean;
        this.f$1 = j;
    }

    public final Object apply(Object obj, Object obj2) {
        return AtomicLongMap.lambda$putIfAbsent$6(this.f$0, this.f$1, obj, (Long) obj2);
    }
}
