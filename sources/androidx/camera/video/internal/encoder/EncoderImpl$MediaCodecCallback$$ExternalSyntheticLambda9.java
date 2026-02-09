package androidx.camera.video.internal.encoder;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda9 implements Runnable {
    public final /* synthetic */ EncoderCallback f$0;

    public /* synthetic */ EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda9(EncoderCallback encoderCallback) {
        this.f$0 = encoderCallback;
    }

    public final void run() {
        this.f$0.onEncodeStop();
    }
}
