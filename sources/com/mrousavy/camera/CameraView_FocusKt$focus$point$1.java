package com.mrousavy.camera;

import androidx.camera.core.MeteringPoint;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "Landroidx/camera/core/MeteringPoint;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraView_FocusKt$focus$point$1", f = "CameraView+Focus.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: CameraView+Focus.kt */
final class CameraView_FocusKt$focus$point$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MeteringPoint>, Object> {
    final /* synthetic */ CameraView $this_focus;
    final /* synthetic */ double $x;
    final /* synthetic */ double $y;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CameraView_FocusKt$focus$point$1(CameraView cameraView, double d, double d2, Continuation<? super CameraView_FocusKt$focus$point$1> continuation) {
        super(2, continuation);
        this.$this_focus = cameraView;
        this.$x = d;
        this.$y = d2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraView_FocusKt$focus$point$1(this.$this_focus, this.$x, this.$y, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MeteringPoint> continuation) {
        return ((CameraView_FocusKt$focus$point$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return this.$this_focus.getPreviewView$react_native_vision_camera_release().getMeteringPointFactory().createPoint((float) this.$x, (float) this.$y);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
