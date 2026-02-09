package com.google.common.collect;

import com.google.common.collect.Lists;
import java.util.function.Predicate;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Lists$TransformingSequentialList$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ Lists.TransformingSequentialList f$0;
    public final /* synthetic */ Predicate f$1;

    public /* synthetic */ Lists$TransformingSequentialList$$ExternalSyntheticLambda0(Lists.TransformingSequentialList transformingSequentialList, Predicate predicate) {
        this.f$0 = transformingSequentialList;
        this.f$1 = predicate;
    }

    public final boolean test(Object obj) {
        return this.f$0.m853lambda$removeIf$0$comgooglecommoncollectLists$TransformingSequentialList(this.f$1, obj);
    }
}
