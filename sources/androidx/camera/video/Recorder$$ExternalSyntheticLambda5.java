package androidx.camera.video;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.internal.encoder.Encoder;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda5 implements Encoder.SurfaceInput.OnSurfaceUpdateListener {
    public final /* synthetic */ Recorder f$0;
    public final /* synthetic */ SurfaceRequest f$1;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda5(Recorder recorder, SurfaceRequest surfaceRequest) {
        this.f$0 = recorder;
        this.f$1 = surfaceRequest;
    }

    public final void onSurfaceUpdate(Surface surface) {
        this.f$0.m187lambda$setupVideo$9$androidxcameravideoRecorder(this.f$1, surface);
    }
}
