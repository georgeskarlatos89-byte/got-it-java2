package androidx.camera.video;

import androidx.camera.video.VideoCaptureLegacy;
import java.util.concurrent.Executor;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class VideoCaptureLegacy$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ VideoCaptureLegacy f$0;
    public final /* synthetic */ VideoCaptureLegacy.OutputFileOptions f$1;
    public final /* synthetic */ Executor f$2;
    public final /* synthetic */ VideoCaptureLegacy.OnVideoSavedCallback f$3;

    public /* synthetic */ VideoCaptureLegacy$$ExternalSyntheticLambda2(VideoCaptureLegacy videoCaptureLegacy, VideoCaptureLegacy.OutputFileOptions outputFileOptions, Executor executor, VideoCaptureLegacy.OnVideoSavedCallback onVideoSavedCallback) {
        this.f$0 = videoCaptureLegacy;
        this.f$1 = outputFileOptions;
        this.f$2 = executor;
        this.f$3 = onVideoSavedCallback;
    }

    public final void run() {
        this.f$0.m196lambda$startRecording$0$androidxcameravideoVideoCaptureLegacy(this.f$1, this.f$2, this.f$3);
    }
}
