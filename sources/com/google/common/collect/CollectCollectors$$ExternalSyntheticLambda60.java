package com.google.common.collect;

import java.util.Comparator;
import java.util.function.Supplier;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CollectCollectors$$ExternalSyntheticLambda60 implements Supplier {
    public final /* synthetic */ Comparator f$0;

    public /* synthetic */ CollectCollectors$$ExternalSyntheticLambda60(Comparator comparator) {
        this.f$0 = comparator;
    }

    public final Object get() {
        return CollectCollectors.lambda$toImmutableSortedSet$0(this.f$0);
    }
}
