package com.mrousavy.camera.utils;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.InlineMarker;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006HHø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001d\u0010\u0000\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006HHø\u0001\u0000¢\u0006\u0002\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"takePicture", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "Landroidx/camera/core/ImageCapture;", "options", "Landroidx/camera/core/ImageCapture$OutputFileOptions;", "executor", "Ljava/util/concurrent/Executor;", "(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Ljava/util/concurrent/Executor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/core/ImageProxy;", "(Landroidx/camera/core/ImageCapture;Ljava/util/concurrent/Executor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ImageCapture+suspendables.kt */
public final class ImageCapture_suspendablesKt {
    public static final Object takePicture(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, Executor executor, Continuation<? super ImageCapture.OutputFileResults> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        imageCapture.m139lambda$takePicture$4$androidxcameracoreImageCapture(outputFileOptions, executor, new ImageCapture_suspendablesKt$takePicture$2$1(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private static final Object takePicture$$forInline(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, Executor executor, Continuation<? super ImageCapture.OutputFileResults> continuation) {
        InlineMarker.mark(0);
        Continuation continuation2 = continuation;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        imageCapture.m139lambda$takePicture$4$androidxcameracoreImageCapture(outputFileOptions, executor, new ImageCapture_suspendablesKt$takePicture$2$1(safeContinuation));
        Unit unit = Unit.INSTANCE;
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return orThrow;
    }

    public static final Object takePicture(ImageCapture imageCapture, Executor executor, Continuation<? super ImageProxy> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        imageCapture.m138lambda$takePicture$3$androidxcameracoreImageCapture(executor, new ImageCapture_suspendablesKt$takePicture$4$1(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private static final Object takePicture$$forInline(ImageCapture imageCapture, Executor executor, Continuation<? super ImageProxy> continuation) {
        InlineMarker.mark(0);
        Continuation continuation2 = continuation;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        imageCapture.m138lambda$takePicture$3$androidxcameracoreImageCapture(executor, new ImageCapture_suspendablesKt$takePicture$4$1(safeContinuation));
        Unit unit = Unit.INSTANCE;
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return orThrow;
    }
}
