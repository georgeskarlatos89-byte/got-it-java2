package com.google.common.collect;

import java.util.stream.LongStream;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda18 implements Runnable {
    public final /* synthetic */ LongStream[] f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda18(LongStream[] longStreamArr) {
        this.f$0 = longStreamArr;
    }

    public final void run() {
        Streams.closeAll(this.f$0);
    }
}
