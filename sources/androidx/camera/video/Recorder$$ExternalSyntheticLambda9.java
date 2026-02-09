package androidx.camera.video;

import androidx.camera.video.VideoOutput;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda9 implements Runnable {
    public final /* synthetic */ Recorder f$0;
    public final /* synthetic */ VideoOutput.SourceState f$1;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda9(Recorder recorder, VideoOutput.SourceState sourceState) {
        this.f$0 = recorder;
        this.f$1 = sourceState;
    }

    public final void run() {
        this.f$0.m181lambda$onSourceStateChanged$2$androidxcameravideoRecorder(this.f$1);
    }
}
