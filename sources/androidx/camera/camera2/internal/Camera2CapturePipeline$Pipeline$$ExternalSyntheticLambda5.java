package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Camera2CapturePipeline$Pipeline$$ExternalSyntheticLambda5 implements Camera2CapturePipeline.ResultListener.Checker {
    public final /* synthetic */ Camera2CapturePipeline.Pipeline f$0;

    public /* synthetic */ Camera2CapturePipeline$Pipeline$$ExternalSyntheticLambda5(Camera2CapturePipeline.Pipeline pipeline) {
        this.f$0 = pipeline;
    }

    public final boolean check(TotalCaptureResult totalCaptureResult) {
        return this.f$0.is3AConverged(totalCaptureResult);
    }
}
