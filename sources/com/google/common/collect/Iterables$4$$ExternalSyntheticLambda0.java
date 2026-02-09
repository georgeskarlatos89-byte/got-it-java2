package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Iterables$4$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ Predicate f$0;
    public final /* synthetic */ Consumer f$1;

    public /* synthetic */ Iterables$4$$ExternalSyntheticLambda0(Predicate predicate, Consumer consumer) {
        this.f$0 = predicate;
        this.f$1 = consumer;
    }

    public final void accept(Object obj) {
        Iterables.AnonymousClass4.lambda$forEach$0(this.f$0, this.f$1, obj);
    }
}
