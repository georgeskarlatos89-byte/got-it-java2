package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Multiset$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ Consumer f$0;

    public /* synthetic */ Multiset$$ExternalSyntheticLambda1(Consumer consumer) {
        this.f$0 = consumer;
    }

    public final void accept(Object obj) {
        Multiset.lambda$forEach$1(this.f$0, (Multiset.Entry) obj);
    }
}
