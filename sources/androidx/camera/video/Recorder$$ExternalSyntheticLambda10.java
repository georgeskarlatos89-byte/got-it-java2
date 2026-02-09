package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.core.util.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda10 implements Consumer {
    public final /* synthetic */ Recorder f$0;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda10(Recorder recorder) {
        this.f$0 = recorder;
    }

    public final void accept(Object obj) {
        this.f$0.onSurfaceRequestComplete((SurfaceRequest.Result) obj);
    }
}
