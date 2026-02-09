package com.google.common.collect;

import com.google.common.collect.CollectSpliterators;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CollectSpliterators$FlatMapSpliterator$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ CollectSpliterators.FlatMapSpliterator f$0;
    public final /* synthetic */ Consumer f$1;

    public /* synthetic */ CollectSpliterators$FlatMapSpliterator$$ExternalSyntheticLambda0(CollectSpliterators.FlatMapSpliterator flatMapSpliterator, Consumer consumer) {
        this.f$0 = flatMapSpliterator;
        this.f$1 = consumer;
    }

    public final void accept(Object obj) {
        this.f$0.m842lambda$forEachRemaining$1$comgooglecommoncollectCollectSpliterators$FlatMapSpliterator(this.f$1, obj);
    }
}
