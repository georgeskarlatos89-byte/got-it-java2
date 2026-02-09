package com.google.common.collect;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CollectSpliterators$1WithCharacteristics$$ExternalSyntheticLambda1 implements IntConsumer {
    public final /* synthetic */ Consumer f$0;
    public final /* synthetic */ IntFunction f$1;

    public /* synthetic */ CollectSpliterators$1WithCharacteristics$$ExternalSyntheticLambda1(Consumer consumer, IntFunction intFunction) {
        this.f$0 = consumer;
        this.f$1 = intFunction;
    }

    public final void accept(int i) {
        this.f$0.accept(this.f$1.apply(i));
    }
}
