package com.google.common.collect;

import java.util.function.ObjIntConsumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Multisets$$ExternalSyntheticLambda1 implements ObjIntConsumer {
    public final /* synthetic */ Multiset f$0;

    public /* synthetic */ Multisets$$ExternalSyntheticLambda1(Multiset multiset) {
        this.f$0 = multiset;
    }

    public final void accept(Object obj, int i) {
        this.f$0.add(obj, i);
    }
}
