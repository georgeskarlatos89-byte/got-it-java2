package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Maps$NavigableAsMapView$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ Maps.NavigableAsMapView f$0;
    public final /* synthetic */ BiConsumer f$1;

    public /* synthetic */ Maps$NavigableAsMapView$$ExternalSyntheticLambda1(Maps.NavigableAsMapView navigableAsMapView, BiConsumer biConsumer) {
        this.f$0 = navigableAsMapView;
        this.f$1 = biConsumer;
    }

    public final void accept(Object obj) {
        this.f$0.m857lambda$forEach$1$comgooglecommoncollectMaps$NavigableAsMapView(this.f$1, obj);
    }
}
