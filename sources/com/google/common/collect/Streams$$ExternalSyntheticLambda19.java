package com.google.common.collect;

import java.util.stream.DoubleStream;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda19 implements Runnable {
    public final /* synthetic */ DoubleStream f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda19(DoubleStream doubleStream) {
        this.f$0 = doubleStream;
    }

    public final void run() {
        this.f$0.close();
    }
}
