package androidx.camera.video;

import android.media.MediaCodec;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class VideoCaptureLegacy$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ MediaCodec f$1;

    public /* synthetic */ VideoCaptureLegacy$$ExternalSyntheticLambda7(boolean z, MediaCodec mediaCodec) {
        this.f$0 = z;
        this.f$1 = mediaCodec;
    }

    public final void run() {
        VideoCaptureLegacy.lambda$releaseCameraSurface$7(this.f$0, this.f$1);
    }
}
