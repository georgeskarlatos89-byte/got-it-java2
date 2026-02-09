package androidx.camera.video.internal.encoder;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ ListenableFuture f$0;

    public /* synthetic */ EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda5(ListenableFuture listenableFuture) {
        this.f$0 = listenableFuture;
    }

    public final void run() {
        this.f$0.cancel(true);
    }
}
