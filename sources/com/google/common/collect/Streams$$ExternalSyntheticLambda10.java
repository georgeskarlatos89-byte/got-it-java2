package com.google.common.collect;

import java.util.stream.IntStream;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda10 implements Runnable {
    public final /* synthetic */ IntStream[] f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda10(IntStream[] intStreamArr) {
        this.f$0 = intStreamArr;
    }

    public final void run() {
        Streams.closeAll(this.f$0);
    }
}
