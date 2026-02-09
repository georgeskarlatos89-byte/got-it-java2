package com.mrousavy.camera;

import android.util.Log;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H@"}, d2 = {"<anonymous>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$results$2", f = "CameraView+TakePhoto.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: CameraView+TakePhoto.kt */
final class CameraView_TakePhotoKt$takePhoto$2$results$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    final /* synthetic */ CameraView $this_takePhoto;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CameraView_TakePhotoKt$takePhoto$2$results$2(CameraView cameraView, Continuation<? super CameraView_TakePhotoKt$takePhoto$2$results$2> continuation) {
        super(2, continuation);
        this.$this_takePhoto = cameraView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraView_TakePhotoKt$takePhoto$2$results$2(this.$this_takePhoto, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((CameraView_TakePhotoKt$takePhoto$2$results$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Log.d("CameraView", "Creating temp file...");
            File createTempFile = File.createTempFile("mrousavy", ".jpg", this.$this_takePhoto.getContext().getCacheDir());
            createTempFile.deleteOnExit();
            return createTempFile;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
