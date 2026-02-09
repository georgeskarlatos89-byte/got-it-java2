package com.google.common.collect;

import java.util.stream.LongStream;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda12 implements Runnable {
    public final /* synthetic */ LongStream f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda12(LongStream longStream) {
        this.f$0 = longStream;
    }

    public final void run() {
        this.f$0.close();
    }
}
