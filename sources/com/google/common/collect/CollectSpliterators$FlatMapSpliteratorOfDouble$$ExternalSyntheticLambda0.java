package com.google.common.collect;

import com.google.common.collect.CollectSpliterators;
import java.util.Spliterator;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CollectSpliterators$FlatMapSpliteratorOfDouble$$ExternalSyntheticLambda0 implements CollectSpliterators.FlatMapSpliterator.Factory {
    public final Spliterator newFlatMapSpliterator(Spliterator spliterator, Spliterator spliterator2, Function function, int i, long j) {
        return new CollectSpliterators.FlatMapSpliteratorOfDouble((Spliterator.OfDouble) spliterator, spliterator2, function, i, j);
    }
}
