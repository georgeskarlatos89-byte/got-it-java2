package com.google.common.collect;

import java.util.function.IntFunction;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ImmutableList$$ExternalSyntheticLambda0 implements IntFunction {
    public final /* synthetic */ ImmutableList f$0;

    public /* synthetic */ ImmutableList$$ExternalSyntheticLambda0(ImmutableList immutableList) {
        this.f$0 = immutableList;
    }

    public final Object apply(int i) {
        return this.f$0.get(i);
    }
}
