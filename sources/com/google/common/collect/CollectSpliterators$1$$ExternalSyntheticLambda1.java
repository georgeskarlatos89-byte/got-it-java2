package com.google.common.collect;

import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CollectSpliterators$1$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ Consumer f$0;
    public final /* synthetic */ Function f$1;

    public /* synthetic */ CollectSpliterators$1$$ExternalSyntheticLambda1(Consumer consumer, Function function) {
        this.f$0 = consumer;
        this.f$1 = function;
    }

    public final void accept(Object obj) {
        this.f$0.accept(this.f$1.apply(obj));
    }
}
