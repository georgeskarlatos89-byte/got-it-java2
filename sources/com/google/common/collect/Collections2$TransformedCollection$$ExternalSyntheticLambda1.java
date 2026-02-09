package com.google.common.collect;

import com.google.common.collect.Collections2;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Collections2$TransformedCollection$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ Collections2.TransformedCollection f$0;
    public final /* synthetic */ Consumer f$1;

    public /* synthetic */ Collections2$TransformedCollection$$ExternalSyntheticLambda1(Collections2.TransformedCollection transformedCollection, Consumer consumer) {
        this.f$0 = transformedCollection;
        this.f$1 = consumer;
    }

    public final void accept(Object obj) {
        this.f$0.m848lambda$forEach$0$comgooglecommoncollectCollections2$TransformedCollection(this.f$1, obj);
    }
}
