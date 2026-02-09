package com.google.common.collect;

import java.util.Map;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class StandardTable$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ Map.Entry f$0;

    public /* synthetic */ StandardTable$$ExternalSyntheticLambda0(Map.Entry entry) {
        this.f$0 = entry;
    }

    public final Object apply(Object obj) {
        return Tables.immutableCell(this.f$0.getKey(), ((Map.Entry) obj).getKey(), ((Map.Entry) obj).getValue());
    }
}
