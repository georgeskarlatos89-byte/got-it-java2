package com.google.common.collect;

import com.google.common.collect.ImmutableSet;
import java.util.function.IntFunction;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ImmutableSet$Indexed$$ExternalSyntheticLambda0 implements IntFunction {
    public final /* synthetic */ ImmutableSet.Indexed f$0;

    public /* synthetic */ ImmutableSet$Indexed$$ExternalSyntheticLambda0(ImmutableSet.Indexed indexed) {
        this.f$0 = indexed;
    }

    public final Object apply(int i) {
        return this.f$0.get(i);
    }
}
