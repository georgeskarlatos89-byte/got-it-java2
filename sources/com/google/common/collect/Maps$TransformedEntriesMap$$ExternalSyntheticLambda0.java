package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.function.BiConsumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Maps$TransformedEntriesMap$$ExternalSyntheticLambda0 implements BiConsumer {
    public final /* synthetic */ Maps.TransformedEntriesMap f$0;
    public final /* synthetic */ BiConsumer f$1;

    public /* synthetic */ Maps$TransformedEntriesMap$$ExternalSyntheticLambda0(Maps.TransformedEntriesMap transformedEntriesMap, BiConsumer biConsumer) {
        this.f$0 = transformedEntriesMap;
        this.f$1 = biConsumer;
    }

    public final void accept(Object obj, Object obj2) {
        this.f$0.m858lambda$forEach$0$comgooglecommoncollectMaps$TransformedEntriesMap(this.f$1, obj, obj2);
    }
}
