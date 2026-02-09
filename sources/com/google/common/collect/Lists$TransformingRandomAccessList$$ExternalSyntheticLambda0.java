package com.google.common.collect;

import com.google.common.collect.Lists;
import java.util.function.Predicate;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Lists$TransformingRandomAccessList$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ Lists.TransformingRandomAccessList f$0;
    public final /* synthetic */ Predicate f$1;

    public /* synthetic */ Lists$TransformingRandomAccessList$$ExternalSyntheticLambda0(Lists.TransformingRandomAccessList transformingRandomAccessList, Predicate predicate) {
        this.f$0 = transformingRandomAccessList;
        this.f$1 = predicate;
    }

    public final boolean test(Object obj) {
        return this.f$0.m852lambda$removeIf$0$comgooglecommoncollectLists$TransformingRandomAccessList(this.f$1, obj);
    }
}
