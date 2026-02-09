package com.google.common.collect;

import com.google.common.collect.Collections2;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Collections2$FilteredCollection$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ Collections2.FilteredCollection f$0;
    public final /* synthetic */ Consumer f$1;

    public /* synthetic */ Collections2$FilteredCollection$$ExternalSyntheticLambda2(Collections2.FilteredCollection filteredCollection, Consumer consumer) {
        this.f$0 = filteredCollection;
        this.f$1 = consumer;
    }

    public final void accept(Object obj) {
        this.f$0.m846lambda$forEach$0$comgooglecommoncollectCollections2$FilteredCollection(this.f$1, obj);
    }
}
