package com.google.common.collect;

import java.util.Map;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Multimaps$Keys$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ Consumer f$0;

    public /* synthetic */ Multimaps$Keys$$ExternalSyntheticLambda0(Consumer consumer) {
        this.f$0 = consumer;
    }

    public final void accept(Object obj) {
        this.f$0.accept(((Map.Entry) obj).getKey());
    }
}
