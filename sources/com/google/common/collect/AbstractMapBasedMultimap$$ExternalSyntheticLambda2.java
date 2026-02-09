package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AbstractMapBasedMultimap$$ExternalSyntheticLambda2 implements Function {
    public final Object apply(Object obj) {
        return CollectSpliterators.map(((Collection) ((Map.Entry) obj).getValue()).spliterator(), new AbstractMapBasedMultimap$$ExternalSyntheticLambda4(((Map.Entry) obj).getKey()));
    }
}
