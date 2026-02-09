package com.google.common.hash;

import java.util.function.Supplier;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BloomFilter$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ Funnel f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ double f$2;

    public /* synthetic */ BloomFilter$$ExternalSyntheticLambda0(Funnel funnel, long j, double d) {
        this.f$0 = funnel;
        this.f$1 = j;
        this.f$2 = d;
    }

    public final Object get() {
        return BloomFilter.create(this.f$0, this.f$1, this.f$2);
    }
}
