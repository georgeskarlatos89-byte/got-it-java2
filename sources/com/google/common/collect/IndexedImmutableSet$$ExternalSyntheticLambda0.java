package com.google.common.collect;

import java.util.function.IntFunction;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class IndexedImmutableSet$$ExternalSyntheticLambda0 implements IntFunction {
    public final /* synthetic */ IndexedImmutableSet f$0;

    public /* synthetic */ IndexedImmutableSet$$ExternalSyntheticLambda0(IndexedImmutableSet indexedImmutableSet) {
        this.f$0 = indexedImmutableSet;
    }

    public final Object apply(int i) {
        return this.f$0.get(i);
    }
}
