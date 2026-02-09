package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import java.util.function.BinaryOperator;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CollectCollectors$$ExternalSyntheticLambda53 implements BinaryOperator {
    public final Object apply(Object obj, Object obj2) {
        return ((ImmutableSortedMap.Builder) obj).combine((ImmutableMap.Builder) (ImmutableSortedMap.Builder) obj2);
    }
}
