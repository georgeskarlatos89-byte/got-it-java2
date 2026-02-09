package com.google.common.collect;

import java.util.Map;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class StandardTable$$ExternalSyntheticLambda1 implements Function {
    public final Object apply(Object obj) {
        return CollectSpliterators.map(((Map) ((Map.Entry) obj).getValue()).entrySet().spliterator(), new StandardTable$$ExternalSyntheticLambda0((Map.Entry) obj));
    }
}
