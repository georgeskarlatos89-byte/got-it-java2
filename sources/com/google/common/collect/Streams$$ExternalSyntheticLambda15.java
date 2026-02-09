package com.google.common.collect;

import com.google.common.collect.Streams;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda15 implements Consumer {
    public final /* synthetic */ BiConsumer f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda15(BiConsumer biConsumer) {
        this.f$0 = biConsumer;
    }

    public final void accept(Object obj) {
        this.f$0.accept(((Streams.TemporaryPair) obj).a, ((Streams.TemporaryPair) obj).b);
    }
}
