package com.google.common.collect;

import com.google.common.collect.StandardTable;
import java.util.Map;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class StandardTable$Row$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ StandardTable.Row f$0;

    public /* synthetic */ StandardTable$Row$$ExternalSyntheticLambda0(StandardTable.Row row) {
        this.f$0 = row;
    }

    public final Object apply(Object obj) {
        return this.f$0.wrapEntry((Map.Entry) obj);
    }
}
