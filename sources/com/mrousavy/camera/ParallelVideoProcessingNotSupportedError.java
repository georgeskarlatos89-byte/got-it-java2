package com.mrousavy.camera;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/mrousavy/camera/ParallelVideoProcessingNotSupportedError;", "Lcom/mrousavy/camera/CameraError;", "cause", "", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Errors.kt */
public final class ParallelVideoProcessingNotSupportedError extends CameraError {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParallelVideoProcessingNotSupportedError(Throwable th) {
        super("device", "parallel-video-processing-not-supported", "The given LEGACY Camera device does not support parallel video processing (`video={true}` + `frameProcessor={...}`). Disable either `video` or `frameProcessor`. To find out if a device supports parallel video processing, check the `supportsParallelVideoProcessing` property on the CameraDevice. See https://react-native-vision-camera.com/docs/guides/devices#the-supportsparallelvideoprocessing-prop for more information.", th);
        Intrinsics.checkNotNullParameter(th, "cause");
    }
}
