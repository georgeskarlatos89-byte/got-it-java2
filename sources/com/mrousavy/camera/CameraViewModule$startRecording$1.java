package com.mrousavy.camera;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.mrousavy.camera.utils.CallbackPromiseKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraViewModule$startRecording$1", f = "CameraViewModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: CameraViewModule.kt */
final class CameraViewModule$startRecording$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Callback $onRecordCallback;
    final /* synthetic */ ReadableMap $options;
    final /* synthetic */ int $viewTag;
    int label;
    final /* synthetic */ CameraViewModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CameraViewModule$startRecording$1(CameraViewModule cameraViewModule, int i, ReadableMap readableMap, Callback callback, Continuation<? super CameraViewModule$startRecording$1> continuation) {
        super(2, continuation);
        this.this$0 = cameraViewModule;
        this.$viewTag = i;
        this.$options = readableMap;
        this.$onRecordCallback = callback;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraViewModule$startRecording$1(this.this$0, this.$viewTag, this.$options, this.$onRecordCallback, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CameraViewModule$startRecording$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                CameraView_RecordVideoKt.startRecording(this.this$0.findCameraView(this.$viewTag), this.$options, this.$onRecordCallback);
            } catch (CameraError e) {
                ReadableMap makeErrorMap$default = CallbackPromiseKt.makeErrorMap$default(e.getDomain() + '/' + e.getId(), e.getMessage(), e, (WritableMap) null, 8, (Object) null);
                this.$onRecordCallback.invoke(null, makeErrorMap$default);
            } catch (Throwable th) {
                ReadableMap makeErrorMap$default2 = CallbackPromiseKt.makeErrorMap$default("capture/unknown", "An unknown error occurred while trying to start a video recording!", th, (WritableMap) null, 8, (Object) null);
                this.$onRecordCallback.invoke(null, makeErrorMap$default2);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
