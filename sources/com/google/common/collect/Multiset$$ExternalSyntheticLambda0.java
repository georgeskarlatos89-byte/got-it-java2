package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Multiset$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ ObjIntConsumer f$0;

    public /* synthetic */ Multiset$$ExternalSyntheticLambda0(ObjIntConsumer objIntConsumer) {
        this.f$0 = objIntConsumer;
    }

    public final void accept(Object obj) {
        this.f$0.accept(((Multiset.Entry) obj).getElement(), ((Multiset.Entry) obj).getCount());
    }
}
