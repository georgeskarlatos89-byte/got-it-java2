package com.google.common.collect;

import java.util.stream.DoubleStream;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ DoubleStream[] f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda6(DoubleStream[] doubleStreamArr) {
        this.f$0 = doubleStreamArr;
    }

    public final void run() {
        Streams.closeAll(this.f$0);
    }
}
