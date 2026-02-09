package com.mrousavy.camera;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraView$update$1$1", f = "CameraView.kt", i = {0, 0, 0}, l = {331}, m = "invokeSuspend", n = {"shouldReconfigureZoom", "shouldReconfigureTorch", "shouldUpdateOrientation"}, s = {"I$0", "I$1", "I$2"})
/* compiled from: CameraView.kt */
final class CameraView$update$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList<String> $changedProps;
    int I$0;
    int I$1;
    int I$2;
    int label;
    final /* synthetic */ CameraView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CameraView$update$1$1(ArrayList<String> arrayList, CameraView cameraView, Continuation<? super CameraView$update$1$1> continuation) {
        super(2, continuation);
        this.$changedProps = arrayList;
        this.this$0 = cameraView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraView$update$1$1(this.$changedProps, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CameraView$update$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b6 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4 A[Catch:{ all -> 0x00da }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            int r0 = r7.I$2
            int r1 = r7.I$1
            int r2 = r7.I$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x00da }
            goto L_0x0085
        L_0x0016:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001e:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.ArrayList<java.lang.String> r8 = r7.$changedProps     // Catch:{ all -> 0x00da }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x00da }
            java.util.ArrayList r1 = com.mrousavy.camera.CameraView.propsThatRequireSessionReconfiguration     // Catch:{ all -> 0x00da }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00da }
            boolean r8 = com.mrousavy.camera.utils.List_containsAnyKt.containsAny(r8, r1)     // Catch:{ all -> 0x00da }
            r1 = 0
            if (r8 != 0) goto L_0x003f
            java.util.ArrayList<java.lang.String> r3 = r7.$changedProps     // Catch:{ all -> 0x00da }
            java.lang.String r4 = "zoom"
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x00da }
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r3 = r1
            goto L_0x0040
        L_0x003f:
            r3 = r2
        L_0x0040:
            if (r8 != 0) goto L_0x004f
            java.util.ArrayList<java.lang.String> r4 = r7.$changedProps     // Catch:{ all -> 0x00da }
            java.lang.String r5 = "torch"
            boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x00da }
            if (r4 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r4 = r1
            goto L_0x0050
        L_0x004f:
            r4 = r2
        L_0x0050:
            if (r8 != 0) goto L_0x005c
            java.util.ArrayList<java.lang.String> r5 = r7.$changedProps     // Catch:{ all -> 0x00da }
            java.lang.String r6 = "orientation"
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x00da }
            if (r5 == 0) goto L_0x005d
        L_0x005c:
            r1 = r2
        L_0x005d:
            java.util.ArrayList<java.lang.String> r5 = r7.$changedProps     // Catch:{ all -> 0x00da }
            java.lang.String r6 = "isActive"
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x00da }
            if (r5 == 0) goto L_0x006c
            com.mrousavy.camera.CameraView r5 = r7.this$0     // Catch:{ all -> 0x00da }
            r5.updateLifecycleState()     // Catch:{ all -> 0x00da }
        L_0x006c:
            if (r8 == 0) goto L_0x0088
            com.mrousavy.camera.CameraView r8 = r7.this$0     // Catch:{ all -> 0x00da }
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch:{ all -> 0x00da }
            r7.I$0 = r3     // Catch:{ all -> 0x00da }
            r7.I$1 = r4     // Catch:{ all -> 0x00da }
            r7.I$2 = r1     // Catch:{ all -> 0x00da }
            r7.label = r2     // Catch:{ all -> 0x00da }
            java.lang.Object r8 = r8.configureSession(r5)     // Catch:{ all -> 0x00da }
            if (r8 != r0) goto L_0x0082
            return r0
        L_0x0082:
            r0 = r1
            r2 = r3
            r1 = r4
        L_0x0085:
            r4 = r1
            r3 = r2
            r1 = r0
        L_0x0088:
            if (r3 == 0) goto L_0x00b4
            com.mrousavy.camera.CameraView r8 = r7.this$0     // Catch:{ all -> 0x00da }
            float r8 = r8.getZoom()     // Catch:{ all -> 0x00da }
            com.mrousavy.camera.CameraView r0 = r7.this$0     // Catch:{ all -> 0x00da }
            float r0 = r0.maxZoom     // Catch:{ all -> 0x00da }
            float r8 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x00da }
            com.mrousavy.camera.CameraView r0 = r7.this$0     // Catch:{ all -> 0x00da }
            float r0 = r0.minZoom     // Catch:{ all -> 0x00da }
            float r8 = java.lang.Math.max(r8, r0)     // Catch:{ all -> 0x00da }
            com.mrousavy.camera.CameraView r0 = r7.this$0     // Catch:{ all -> 0x00da }
            androidx.camera.core.Camera r0 = r0.getCamera$react_native_vision_camera_release()     // Catch:{ all -> 0x00da }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ all -> 0x00da }
            androidx.camera.core.CameraControl r0 = r0.getCameraControl()     // Catch:{ all -> 0x00da }
            r0.setZoomRatio(r8)     // Catch:{ all -> 0x00da }
        L_0x00b4:
            if (r4 == 0) goto L_0x00d2
            com.mrousavy.camera.CameraView r8 = r7.this$0     // Catch:{ all -> 0x00da }
            androidx.camera.core.Camera r8 = r8.getCamera$react_native_vision_camera_release()     // Catch:{ all -> 0x00da }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch:{ all -> 0x00da }
            androidx.camera.core.CameraControl r8 = r8.getCameraControl()     // Catch:{ all -> 0x00da }
            com.mrousavy.camera.CameraView r0 = r7.this$0     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r0.getTorch()     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "on"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x00da }
            r8.enableTorch(r0)     // Catch:{ all -> 0x00da }
        L_0x00d2:
            if (r1 == 0) goto L_0x00f8
            com.mrousavy.camera.CameraView r8 = r7.this$0     // Catch:{ all -> 0x00da }
            r8.updateOrientation()     // Catch:{ all -> 0x00da }
            goto L_0x00f8
        L_0x00da:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "update() threw: "
            r0.<init>(r1)
            java.lang.String r1 = r8.getMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CameraView"
            android.util.Log.e(r1, r0)
            com.mrousavy.camera.CameraView r0 = r7.this$0
            com.mrousavy.camera.CameraView_EventsKt.invokeOnError(r0, r8)
        L_0x00f8:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView$update$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
