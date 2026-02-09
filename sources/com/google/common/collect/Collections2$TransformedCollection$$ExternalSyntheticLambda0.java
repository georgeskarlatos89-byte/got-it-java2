package com.google.common.collect;

import com.google.common.collect.Collections2;
import java.util.function.Predicate;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Collections2$TransformedCollection$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ Collections2.TransformedCollection f$0;
    public final /* synthetic */ Predicate f$1;

    public /* synthetic */ Collections2$TransformedCollection$$ExternalSyntheticLambda0(Collections2.TransformedCollection transformedCollection, Predicate predicate) {
        this.f$0 = transformedCollection;
        this.f$1 = predicate;
    }

    public final boolean test(Object obj) {
        return this.f$0.m849lambda$removeIf$1$comgooglecommoncollectCollections2$TransformedCollection(this.f$1, obj);
    }
}
