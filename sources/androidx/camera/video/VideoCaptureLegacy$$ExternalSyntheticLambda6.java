package androidx.camera.video;

import android.util.Size;
import androidx.camera.video.VideoCaptureLegacy;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class VideoCaptureLegacy$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ VideoCaptureLegacy f$0;
    public final /* synthetic */ VideoCaptureLegacy.OnVideoSavedCallback f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Size f$3;
    public final /* synthetic */ CallbackToFutureAdapter.Completer f$4;

    public /* synthetic */ VideoCaptureLegacy$$ExternalSyntheticLambda6(VideoCaptureLegacy videoCaptureLegacy, VideoCaptureLegacy.OnVideoSavedCallback onVideoSavedCallback, String str, Size size, CallbackToFutureAdapter.Completer completer) {
        this.f$0 = videoCaptureLegacy;
        this.f$1 = onVideoSavedCallback;
        this.f$2 = str;
        this.f$3 = size;
        this.f$4 = completer;
    }

    public final void run() {
        this.f$0.m199lambda$startRecording$4$androidxcameravideoVideoCaptureLegacy(this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
