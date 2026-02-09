package com.google.common.collect;

import com.google.common.collect.Collections2;
import java.util.Collection;
import java.util.function.Predicate;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Collections2$FilteredCollection$$ExternalSyntheticLambda1 implements Predicate {
    public final /* synthetic */ Collection f$0;

    public /* synthetic */ Collections2$FilteredCollection$$ExternalSyntheticLambda1(Collection collection) {
        this.f$0 = collection;
    }

    public final boolean test(Object obj) {
        return Collections2.FilteredCollection.lambda$retainAll$1(this.f$0, obj);
    }
}
