package androidx.camera.video;

import androidx.camera.video.VideoCaptureLegacy;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class VideoCaptureLegacy$VideoSavedListenerWrapper$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ VideoCaptureLegacy.VideoSavedListenerWrapper f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Throwable f$3;

    public /* synthetic */ VideoCaptureLegacy$VideoSavedListenerWrapper$$ExternalSyntheticLambda0(VideoCaptureLegacy.VideoSavedListenerWrapper videoSavedListenerWrapper, int i, String str, Throwable th) {
        this.f$0 = videoSavedListenerWrapper;
        this.f$1 = i;
        this.f$2 = str;
        this.f$3 = th;
    }

    public final void run() {
        this.f$0.m201lambda$onError$1$androidxcameravideoVideoCaptureLegacy$VideoSavedListenerWrapper(this.f$1, this.f$2, this.f$3);
    }
}
