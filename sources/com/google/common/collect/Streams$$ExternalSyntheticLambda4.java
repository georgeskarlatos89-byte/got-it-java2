package com.google.common.collect;

import java.util.stream.Stream;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ Stream[] f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda4(Stream[] streamArr) {
        this.f$0 = streamArr;
    }

    public final void run() {
        Streams.closeAll(this.f$0);
    }
}
