package androidx.camera.core;

import android.os.HandlerThread;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Preview$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ HandlerThread f$0;

    public /* synthetic */ Preview$$ExternalSyntheticLambda0(HandlerThread handlerThread) {
        this.f$0 = handlerThread;
    }

    public final void run() {
        boolean unused = this.f$0.quitSafely();
    }
}
