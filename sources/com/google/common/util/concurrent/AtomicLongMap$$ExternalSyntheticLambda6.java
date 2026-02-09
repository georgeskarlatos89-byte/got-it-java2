package com.google.common.util.concurrent;

import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AtomicLongMap$$ExternalSyntheticLambda6 implements LongUnaryOperator {
    public final /* synthetic */ LongBinaryOperator f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ AtomicLongMap$$ExternalSyntheticLambda6(LongBinaryOperator longBinaryOperator, long j) {
        this.f$0 = longBinaryOperator;
        this.f$1 = j;
    }

    public final long applyAsLong(long j) {
        return this.f$0.applyAsLong(j, this.f$1);
    }
}
