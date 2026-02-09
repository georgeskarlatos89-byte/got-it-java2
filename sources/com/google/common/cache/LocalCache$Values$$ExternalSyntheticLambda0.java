package com.google.common.cache;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class LocalCache$Values$$ExternalSyntheticLambda0 implements BiPredicate {
    public final /* synthetic */ Predicate f$0;

    public /* synthetic */ LocalCache$Values$$ExternalSyntheticLambda0(Predicate predicate) {
        this.f$0 = predicate;
    }

    public final boolean test(Object obj, Object obj2) {
        return this.f$0.test(obj2);
    }
}
