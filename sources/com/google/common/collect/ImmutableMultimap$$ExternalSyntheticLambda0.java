package com.google.common.collect;

import java.util.Collection;
import java.util.function.BiConsumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ImmutableMultimap$$ExternalSyntheticLambda0 implements BiConsumer {
    public final /* synthetic */ BiConsumer f$0;

    public /* synthetic */ ImmutableMultimap$$ExternalSyntheticLambda0(BiConsumer biConsumer) {
        this.f$0 = biConsumer;
    }

    public final void accept(Object obj, Object obj2) {
        ((Collection) obj2).forEach(new ImmutableMultimap$$ExternalSyntheticLambda3(this.f$0, obj));
    }
}
