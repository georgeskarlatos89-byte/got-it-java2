package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ImmutableMultimap$$ExternalSyntheticLambda1 implements Function {
    public final Object apply(Object obj) {
        return CollectSpliterators.map(((Collection) ((Map.Entry) obj).getValue()).spliterator(), new ImmutableMultimap$$ExternalSyntheticLambda2(((Map.Entry) obj).getKey()));
    }
}
