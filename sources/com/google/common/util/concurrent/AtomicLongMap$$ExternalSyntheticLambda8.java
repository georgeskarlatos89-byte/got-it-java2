package com.google.common.util.concurrent;

import java.util.function.BiConsumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AtomicLongMap$$ExternalSyntheticLambda8 implements BiConsumer {
    public final /* synthetic */ AtomicLongMap f$0;

    public /* synthetic */ AtomicLongMap$$ExternalSyntheticLambda8(AtomicLongMap atomicLongMap) {
        this.f$0 = atomicLongMap;
    }

    public final void accept(Object obj, Object obj2) {
        this.f$0.put(obj, ((Long) obj2).longValue());
    }
}
