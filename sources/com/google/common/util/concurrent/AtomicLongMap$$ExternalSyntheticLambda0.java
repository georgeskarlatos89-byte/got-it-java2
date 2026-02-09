package com.google.common.util.concurrent;

import java.util.function.LongUnaryOperator;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AtomicLongMap$$ExternalSyntheticLambda0 implements LongUnaryOperator {
    public final /* synthetic */ long f$0;

    public /* synthetic */ AtomicLongMap$$ExternalSyntheticLambda0(long j) {
        this.f$0 = j;
    }

    public final long applyAsLong(long j) {
        return AtomicLongMap.lambda$put$4(this.f$0, j);
    }
}
