package com.google.common.collect;

import com.google.common.collect.Collections2;
import java.util.function.Predicate;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Collections2$FilteredCollection$$ExternalSyntheticLambda3 implements Predicate {
    public final /* synthetic */ Collections2.FilteredCollection f$0;
    public final /* synthetic */ Predicate f$1;

    public /* synthetic */ Collections2$FilteredCollection$$ExternalSyntheticLambda3(Collections2.FilteredCollection filteredCollection, Predicate predicate) {
        this.f$0 = filteredCollection;
        this.f$1 = predicate;
    }

    public final boolean test(Object obj) {
        return this.f$0.m847lambda$removeIf$2$comgooglecommoncollectCollections2$FilteredCollection(this.f$1, obj);
    }
}
