package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AbstractMapBasedMultimap$AsMap$AsMapEntries$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ AbstractMapBasedMultimap.AsMap f$0;

    public /* synthetic */ AbstractMapBasedMultimap$AsMap$AsMapEntries$$ExternalSyntheticLambda0(AbstractMapBasedMultimap.AsMap asMap) {
        this.f$0 = asMap;
    }

    public final Object apply(Object obj) {
        return this.f$0.wrapEntry((Map.Entry) obj);
    }
}
