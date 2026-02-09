package com.google.common.collect;

import java.util.stream.IntStream;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ IntStream f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda2(IntStream intStream) {
        this.f$0 = intStream;
    }

    public final void run() {
        this.f$0.close();
    }
}
