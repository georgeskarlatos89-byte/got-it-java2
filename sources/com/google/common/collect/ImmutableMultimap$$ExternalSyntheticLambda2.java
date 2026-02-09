package com.google.common.collect;

import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ImmutableMultimap$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ImmutableMultimap$$ExternalSyntheticLambda2(Object obj) {
        this.f$0 = obj;
    }

    public final Object apply(Object obj) {
        return Maps.immutableEntry(this.f$0, obj);
    }
}
