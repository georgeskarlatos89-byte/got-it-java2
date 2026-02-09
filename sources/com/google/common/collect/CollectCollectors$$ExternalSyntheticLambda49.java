package com.google.common.collect;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CollectCollectors$$ExternalSyntheticLambda49 implements Supplier {
    public final /* synthetic */ BinaryOperator f$0;

    public /* synthetic */ CollectCollectors$$ExternalSyntheticLambda49(BinaryOperator binaryOperator) {
        this.f$0 = binaryOperator;
    }

    public final Object get() {
        return CollectCollectors.lambda$toImmutableEnumMap$14(this.f$0);
    }
}
