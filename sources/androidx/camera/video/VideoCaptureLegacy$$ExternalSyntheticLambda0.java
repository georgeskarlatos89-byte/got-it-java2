package androidx.camera.video;

import android.view.Surface;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class VideoCaptureLegacy$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Surface f$0;

    public /* synthetic */ VideoCaptureLegacy$$ExternalSyntheticLambda0(Surface surface) {
        this.f$0 = surface;
    }

    public final void run() {
        this.f$0.release();
    }
}
