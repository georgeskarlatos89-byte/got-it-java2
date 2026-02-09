package com.google.common.collect;

import java.util.function.IntFunction;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ArrayTable$$ExternalSyntheticLambda1 implements IntFunction {
    public final /* synthetic */ ArrayTable f$0;

    public /* synthetic */ ArrayTable$$ExternalSyntheticLambda1(ArrayTable arrayTable) {
        this.f$0 = arrayTable;
    }

    public final Object apply(int i) {
        return this.f$0.getCell(i);
    }
}
