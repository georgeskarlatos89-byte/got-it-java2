package com.mrousavy.camera;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CameraView$$ExternalSyntheticLambda2 implements ImageAnalysis.Analyzer {
    public final /* synthetic */ CameraView f$0;

    public /* synthetic */ CameraView$$ExternalSyntheticLambda2(CameraView cameraView) {
        this.f$0 = cameraView;
    }

    public final void analyze(ImageProxy imageProxy) {
        CameraView.configureSession$lambda$7$lambda$6(this.f$0, imageProxy);
    }
}
