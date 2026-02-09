package com.mrousavy.camera;

import androidx.camera.lifecycle.ProcessCameraProvider;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.guava.ListenableFutureKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraView$onDetachedFromWindow$1", f = "CameraView.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: CameraView.kt */
final class CameraView$onDetachedFromWindow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CameraView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CameraView$onDetachedFromWindow$1(CameraView cameraView, Continuation<? super CameraView$onDetachedFromWindow$1> continuation) {
        super(2, continuation);
        this.this$0 = cameraView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraView$onDetachedFromWindow$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CameraView$onDetachedFromWindow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ListenableFuture<ProcessCameraProvider> instance = ProcessCameraProvider.getInstance(this.this$0.getReactContext());
            Intrinsics.checkNotNullExpressionValue(instance, "getInstance(reactContext)");
            this.label = 1;
            obj = ListenableFutureKt.await(instance, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((ProcessCameraProvider) obj).unbindAll();
        return Unit.INSTANCE;
    }
}
