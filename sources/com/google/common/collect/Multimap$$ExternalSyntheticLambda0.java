package com.google.common.collect;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Multimap$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ BiConsumer f$0;

    public /* synthetic */ Multimap$$ExternalSyntheticLambda0(BiConsumer biConsumer) {
        this.f$0 = biConsumer;
    }

    public final void accept(Object obj) {
        this.f$0.accept(((Map.Entry) obj).getKey(), ((Map.Entry) obj).getValue());
    }
}
