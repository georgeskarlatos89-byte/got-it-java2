package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.util.Collections;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Multisets$$ExternalSyntheticLambda0 implements Function {
    public final Object apply(Object obj) {
        return Collections.nCopies(((Multiset.Entry) obj).getCount(), ((Multiset.Entry) obj).getElement()).spliterator();
    }
}
