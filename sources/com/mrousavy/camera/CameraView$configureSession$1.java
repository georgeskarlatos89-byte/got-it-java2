package com.mrousavy.camera;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraView", f = "CameraView.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {370, 451, 454}, m = "configureSession", n = {"this", "startTime", "this", "cameraProvider", "cameraSelector", "tryEnableExtension", "previewBuilder", "imageCaptureBuilder", "videoRecorderBuilder", "imageAnalysisBuilder", "startTime", "this", "cameraProvider", "cameraSelector", "previewBuilder", "imageCaptureBuilder", "videoRecorderBuilder", "imageAnalysisBuilder", "startTime"}, s = {"L$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0"})
/* compiled from: CameraView.kt */
final class CameraView$configureSession$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CameraView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CameraView$configureSession$1(CameraView cameraView, Continuation<? super CameraView$configureSession$1> continuation) {
        super(continuation);
        this.this$0 = cameraView;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.configureSession(this);
    }
}
