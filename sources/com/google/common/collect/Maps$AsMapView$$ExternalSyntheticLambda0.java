package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Maps$AsMapView$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ Maps.AsMapView f$0;
    public final /* synthetic */ BiConsumer f$1;

    public /* synthetic */ Maps$AsMapView$$ExternalSyntheticLambda0(Maps.AsMapView asMapView, BiConsumer biConsumer) {
        this.f$0 = asMapView;
        this.f$1 = biConsumer;
    }

    public final void accept(Object obj) {
        this.f$0.m854lambda$forEach$0$comgooglecommoncollectMaps$AsMapView(this.f$1, obj);
    }
}
