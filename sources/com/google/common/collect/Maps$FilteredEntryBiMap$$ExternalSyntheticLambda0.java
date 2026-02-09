package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.function.BiFunction;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Maps$FilteredEntryBiMap$$ExternalSyntheticLambda0 implements BiFunction {
    public final /* synthetic */ Maps.FilteredEntryBiMap f$0;
    public final /* synthetic */ BiFunction f$1;

    public /* synthetic */ Maps$FilteredEntryBiMap$$ExternalSyntheticLambda0(Maps.FilteredEntryBiMap filteredEntryBiMap, BiFunction biFunction) {
        this.f$0 = filteredEntryBiMap;
        this.f$1 = biFunction;
    }

    public final Object apply(Object obj, Object obj2) {
        return this.f$0.m855lambda$replaceAll$0$comgooglecommoncollectMaps$FilteredEntryBiMap(this.f$1, obj, obj2);
    }
}
