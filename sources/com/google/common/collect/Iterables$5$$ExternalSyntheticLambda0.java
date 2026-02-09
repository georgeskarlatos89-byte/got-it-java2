package com.google.common.collect;

import com.google.common.base.Function;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Iterables$5$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ Consumer f$0;
    public final /* synthetic */ Function f$1;

    public /* synthetic */ Iterables$5$$ExternalSyntheticLambda0(Consumer consumer, Function function) {
        this.f$0 = consumer;
        this.f$1 = function;
    }

    public final void accept(Object obj) {
        this.f$0.accept(this.f$1.apply(obj));
    }
}
