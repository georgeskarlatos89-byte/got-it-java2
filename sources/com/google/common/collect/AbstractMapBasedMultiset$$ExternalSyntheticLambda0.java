package com.google.common.collect;

import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AbstractMapBasedMultiset$$ExternalSyntheticLambda0 implements BiConsumer {
    public final /* synthetic */ ObjIntConsumer f$0;

    public /* synthetic */ AbstractMapBasedMultiset$$ExternalSyntheticLambda0(ObjIntConsumer objIntConsumer) {
        this.f$0 = objIntConsumer;
    }

    public final void accept(Object obj, Object obj2) {
        this.f$0.accept(obj, ((Count) obj2).get());
    }
}
