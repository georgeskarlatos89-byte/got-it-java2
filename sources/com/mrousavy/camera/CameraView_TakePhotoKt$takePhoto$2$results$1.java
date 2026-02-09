package com.mrousavy.camera;

import android.util.Log;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import com.mrousavy.camera.utils.ImageCapture_suspendablesKt$takePicture$4$1;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "Landroidx/camera/core/ImageProxy;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$results$1", f = "CameraView+TakePhoto.kt", i = {0, 0, 0}, l = {116}, m = "invokeSuspend", n = {"$this$takePicture$iv", "executor$iv", "startCapture"}, s = {"L$0", "L$1", "J$0"})
/* compiled from: CameraView+TakePhoto.kt */
final class CameraView_TakePhotoKt$takePhoto$2$results$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageProxy>, Object> {
    final /* synthetic */ CameraView $this_takePhoto;
    long J$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CameraView_TakePhotoKt$takePhoto$2$results$1(CameraView cameraView, Continuation<? super CameraView_TakePhotoKt$takePhoto$2$results$1> continuation) {
        super(2, continuation);
        this.$this_takePhoto = cameraView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraView_TakePhotoKt$takePhoto$2$results$1(this.$this_takePhoto, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageProxy> continuation) {
        return ((CameraView_TakePhotoKt$takePhoto$2$results$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.d("CameraView", "Taking picture...");
            long nanoTime = System.nanoTime();
            ImageCapture imageCapture$react_native_vision_camera_release = this.$this_takePhoto.getImageCapture$react_native_vision_camera_release();
            Intrinsics.checkNotNull(imageCapture$react_native_vision_camera_release);
            ExecutorService takePhotoExecutor$react_native_vision_camera_release = this.$this_takePhoto.getTakePhotoExecutor$react_native_vision_camera_release();
            Intrinsics.checkNotNullExpressionValue(takePhotoExecutor$react_native_vision_camera_release, "takePhotoExecutor");
            Executor executor = takePhotoExecutor$react_native_vision_camera_release;
            this.L$0 = imageCapture$react_native_vision_camera_release;
            this.L$1 = executor;
            this.J$0 = nanoTime;
            this.label = 1;
            Continuation continuation = this;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
            imageCapture$react_native_vision_camera_release.m138lambda$takePicture$3$androidxcameracoreImageCapture(executor, new ImageCapture_suspendablesKt$takePicture$4$1(safeContinuation));
            obj = safeContinuation.getOrThrow();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = nanoTime;
        } else if (i == 1) {
            j = this.J$0;
            Executor executor2 = (Executor) this.L$1;
            ImageCapture imageCapture = (ImageCapture) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ImageProxy imageProxy = (ImageProxy) obj;
        Log.i(CameraView.TAG_PERF, "Finished image capture in " + ((System.nanoTime() - j) / ((long) DurationKt.NANOS_IN_MILLIS)) + "ms");
        return imageProxy;
    }
}
