package androidx.camera.video;

import androidx.camera.video.VideoCaptureLegacy;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class VideoCaptureLegacy$VideoSavedListenerWrapper$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ VideoCaptureLegacy.VideoSavedListenerWrapper f$0;
    public final /* synthetic */ VideoCaptureLegacy.OutputFileResults f$1;

    public /* synthetic */ VideoCaptureLegacy$VideoSavedListenerWrapper$$ExternalSyntheticLambda1(VideoCaptureLegacy.VideoSavedListenerWrapper videoSavedListenerWrapper, VideoCaptureLegacy.OutputFileResults outputFileResults) {
        this.f$0 = videoSavedListenerWrapper;
        this.f$1 = outputFileResults;
    }

    public final void run() {
        this.f$0.m202lambda$onVideoSaved$0$androidxcameravideoVideoCaptureLegacy$VideoSavedListenerWrapper(this.f$1);
    }
}
