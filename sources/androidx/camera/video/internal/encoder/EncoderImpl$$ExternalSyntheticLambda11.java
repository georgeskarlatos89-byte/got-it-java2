package androidx.camera.video.internal.encoder;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class EncoderImpl$$ExternalSyntheticLambda11 implements Runnable {
    public final /* synthetic */ EncoderImpl f$0;
    public final /* synthetic */ CallbackToFutureAdapter.Completer f$1;

    public /* synthetic */ EncoderImpl$$ExternalSyntheticLambda11(EncoderImpl encoderImpl, CallbackToFutureAdapter.Completer completer) {
        this.f$0 = encoderImpl;
        this.f$1 = completer;
    }

    public final void run() {
        this.f$0.m210lambda$acquireInputBuffer$12$androidxcameravideointernalencoderEncoderImpl(this.f$1);
    }
}
