package com.google.common.collect;

import com.google.common.collect.ArrayTable;
import java.util.function.IntFunction;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ArrayTable$ArrayMap$$ExternalSyntheticLambda0 implements IntFunction {
    public final /* synthetic */ ArrayTable.ArrayMap f$0;

    public /* synthetic */ ArrayTable$ArrayMap$$ExternalSyntheticLambda0(ArrayTable.ArrayMap arrayMap) {
        this.f$0 = arrayMap;
    }

    public final Object apply(int i) {
        return this.f$0.getEntry(i);
    }
}
