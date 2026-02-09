package com.mrousavy.camera;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"focus", "", "Lcom/mrousavy/camera/CameraView;", "pointMap", "Lcom/facebook/react/bridge/ReadableMap;", "(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CameraView+Focus.kt */
public final class CameraView_FocusKt {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ce A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object focus(com.mrousavy.camera.CameraView r21, com.facebook.react.bridge.ReadableMap r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
        /*
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof com.mrousavy.camera.CameraView_FocusKt$focus$1
            if (r2 == 0) goto L_0x0018
            r2 = r1
            com.mrousavy.camera.CameraView_FocusKt$focus$1 r2 = (com.mrousavy.camera.CameraView_FocusKt$focus$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0018
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L_0x001d
        L_0x0018:
            com.mrousavy.camera.CameraView_FocusKt$focus$1 r2 = new com.mrousavy.camera.CameraView_FocusKt$focus$1
            r2.<init>(r1)
        L_0x001d:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0042
            if (r4 == r6) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00cf
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            java.lang.Object r0 = r2.L$0
            androidx.camera.core.CameraControl r0 = (androidx.camera.core.CameraControl) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x009c
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.camera.core.Camera r1 = r21.getCamera$react_native_vision_camera_release()
            if (r1 == 0) goto L_0x00de
            androidx.camera.core.CameraControl r1 = r1.getCameraControl()
            if (r1 == 0) goto L_0x00de
            java.lang.String r4 = "x"
            boolean r7 = r0.hasKey(r4)
            if (r7 == 0) goto L_0x00d2
            java.lang.String r7 = "y"
            boolean r8 = r0.hasKey(r7)
            if (r8 == 0) goto L_0x00d2
            android.content.res.Resources r8 = r21.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            double r9 = r0.getDouble(r4)
            double r11 = (double) r8
            double r15 = r9 * r11
            double r7 = r0.getDouble(r7)
            double r17 = r7 * r11
            kotlinx.coroutines.CoroutineScope r0 = r21.getCoroutineScope$react_native_vision_camera_release()
            kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
            com.mrousavy.camera.CameraView_FocusKt$focus$point$1 r4 = new com.mrousavy.camera.CameraView_FocusKt$focus$point$1
            r19 = 0
            r13 = r4
            r14 = r21
            r13.<init>(r14, r15, r17, r19)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r2.L$0 = r1
            r2.label = r6
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r4, r2)
            if (r0 != r3) goto L_0x0097
            return r3
        L_0x0097:
            r20 = r1
            r1 = r0
            r0 = r20
        L_0x009c:
            java.lang.String r4 = "CameraView.focus(pointMa…loat(), y.toFloat());\n  }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            androidx.camera.core.MeteringPoint r1 = (androidx.camera.core.MeteringPoint) r1
            androidx.camera.core.FocusMeteringAction$Builder r4 = new androidx.camera.core.FocusMeteringAction$Builder
            r6 = 3
            r4.<init>(r1, r6)
            r6 = 5
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            androidx.camera.core.FocusMeteringAction$Builder r1 = r4.setAutoCancelDuration(r6, r1)
            androidx.camera.core.FocusMeteringAction r1 = r1.build()
            java.lang.String r4 = "Builder(point, FocusMete…er 5 seconds\n    .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.startFocusAndMetering(r1)
            java.lang.String r1 = "cameraControl.startFocusAndMetering(action)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
            r2.L$0 = r1
            r2.label = r5
            java.lang.Object r0 = kotlinx.coroutines.guava.ListenableFutureKt.await(r0, r2)
            if (r0 != r3) goto L_0x00cf
            return r3
        L_0x00cf:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00d2:
            com.mrousavy.camera.InvalidTypeScriptUnionError r1 = new com.mrousavy.camera.InvalidTypeScriptUnionError
            java.lang.String r2 = "point"
            java.lang.String r0 = r22.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00de:
            com.mrousavy.camera.CameraNotReadyError r0 = new com.mrousavy.camera.CameraNotReadyError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView_FocusKt.focus(com.mrousavy.camera.CameraView, com.facebook.react.bridge.ReadableMap, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
