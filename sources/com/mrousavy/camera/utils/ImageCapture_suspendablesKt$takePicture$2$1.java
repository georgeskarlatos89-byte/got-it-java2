package com.mrousavy.camera.utils;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/mrousavy/camera/utils/ImageCapture_suspendablesKt$takePicture$2$1", "Landroidx/camera/core/ImageCapture$OnImageSavedCallback;", "onError", "", "exception", "Landroidx/camera/core/ImageCaptureException;", "onImageSaved", "outputFileResults", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 176)
/* compiled from: ImageCapture+suspendables.kt */
public final class ImageCapture_suspendablesKt$takePicture$2$1 implements ImageCapture.OnImageSavedCallback {
    final /* synthetic */ Continuation<ImageCapture.OutputFileResults> $cont;

    public ImageCapture_suspendablesKt$takePicture$2$1(Continuation<? super ImageCapture.OutputFileResults> continuation) {
        this.$cont = continuation;
    }

    public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
        Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
        Continuation<ImageCapture.OutputFileResults> continuation = this.$cont;
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m1102constructorimpl(outputFileResults));
    }

    public void onError(ImageCaptureException imageCaptureException) {
        Intrinsics.checkNotNullParameter(imageCaptureException, "exception");
        Continuation<ImageCapture.OutputFileResults> continuation = this.$cont;
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m1102constructorimpl(ResultKt.createFailure(imageCaptureException)));
    }
}
