package com.mrousavy.camera;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2$bitmap$1", f = "CameraView+TakeSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: CameraView+TakeSnapshot.kt */
final class CameraView_TakeSnapshotKt$takeSnapshot$2$bitmap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ CameraView $this_takeSnapshot;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CameraView_TakeSnapshotKt$takeSnapshot$2$bitmap$1(CameraView cameraView, Continuation<? super CameraView_TakeSnapshotKt$takeSnapshot$2$bitmap$1> continuation) {
        super(2, continuation);
        this.$this_takeSnapshot = cameraView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraView_TakeSnapshotKt$takeSnapshot$2$bitmap$1(this.$this_takeSnapshot, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((CameraView_TakeSnapshotKt$takeSnapshot$2$bitmap$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Bitmap bitmap = this.$this_takeSnapshot.getPreviewView$react_native_vision_camera_release().getBitmap();
            if (bitmap != null) {
                return bitmap;
            }
            throw new CameraNotReadyError();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
