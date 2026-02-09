package com.mrousavy.camera;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H@"}, d2 = {"<anonymous>", "Lcom/facebook/react/bridge/WritableMap;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2", f = "CameraView+TakeSnapshot.kt", i = {0, 0, 1, 1, 2, 2, 2, 2, 2}, l = {22, 25, 34}, m = "invokeSuspend", n = {"camera", "enableFlash", "camera", "enableFlash", "camera", "bitmap", "file", "exif", "enableFlash"}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"})
/* compiled from: CameraView+TakeSnapshot.kt */
final class CameraView_TakeSnapshotKt$takeSnapshot$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WritableMap>, Object> {
    final /* synthetic */ ReadableMap $options;
    final /* synthetic */ CameraView $this_takeSnapshot;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CameraView_TakeSnapshotKt$takeSnapshot$2(CameraView cameraView, ReadableMap readableMap, Continuation<? super CameraView_TakeSnapshotKt$takeSnapshot$2> continuation) {
        super(2, continuation);
        this.$this_takeSnapshot = cameraView;
        this.$options = readableMap;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraView_TakeSnapshotKt$takeSnapshot$2(this.$this_takeSnapshot, this.$options, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WritableMap> continuation) {
        return ((CameraView_TakeSnapshotKt$takeSnapshot$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d3 A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014a A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0152 A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0154 A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r0 = "skipMetadata"
            java.lang.String r2 = "quality"
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            r5 = 0
            r6 = 3
            r7 = 2
            java.lang.String r8 = "on"
            r9 = 1
            if (r4 == 0) goto L_0x005d
            if (r4 == r9) goto L_0x004e
            if (r4 == r7) goto L_0x003c
            if (r4 != r6) goto L_0x0034
            boolean r2 = r1.Z$0
            java.lang.Object r3 = r1.L$3
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            java.lang.Object r4 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            java.lang.Object r6 = r1.L$1
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            java.lang.Object r7 = r1.L$0
            androidx.camera.core.Camera r7 = (androidx.camera.core.Camera) r7
            kotlin.ResultKt.throwOnFailure(r21)     // Catch:{ all -> 0x0031 }
            goto L_0x0119
        L_0x0031:
            r0 = move-exception
            goto L_0x0177
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003c:
            boolean r4 = r1.Z$0
            java.lang.Object r7 = r1.L$0
            androidx.camera.core.Camera r7 = (androidx.camera.core.Camera) r7
            kotlin.ResultKt.throwOnFailure(r21)     // Catch:{ all -> 0x004a }
            r9 = r7
            r7 = r21
            goto L_0x00bd
        L_0x004a:
            r0 = move-exception
            r2 = r4
            goto L_0x0177
        L_0x004e:
            boolean r4 = r1.Z$0
            java.lang.Object r9 = r1.L$0
            androidx.camera.core.Camera r9 = (androidx.camera.core.Camera) r9
            kotlin.ResultKt.throwOnFailure(r21)     // Catch:{ all -> 0x0058 }
            goto L_0x009a
        L_0x0058:
            r0 = move-exception
            r2 = r4
            r7 = r9
            goto L_0x0177
        L_0x005d:
            kotlin.ResultKt.throwOnFailure(r21)
            com.mrousavy.camera.CameraView r4 = r1.$this_takeSnapshot
            androidx.camera.core.Camera r4 = r4.getCamera$react_native_vision_camera_release()
            if (r4 == 0) goto L_0x018b
            com.facebook.react.bridge.ReadableMap r10 = r1.$options
            java.lang.String r11 = "flash"
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r8)
            if (r10 == 0) goto L_0x0098
            androidx.camera.core.CameraControl r11 = r4.getCameraControl()     // Catch:{ all -> 0x0093 }
            com.google.common.util.concurrent.ListenableFuture r11 = r11.enableTorch(r9)     // Catch:{ all -> 0x0093 }
            java.lang.String r12 = "camera.cameraControl.enableTorch(true)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)     // Catch:{ all -> 0x0093 }
            r12 = r1
            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12     // Catch:{ all -> 0x0093 }
            r1.L$0 = r4     // Catch:{ all -> 0x0093 }
            r1.Z$0 = r10     // Catch:{ all -> 0x0093 }
            r1.label = r9     // Catch:{ all -> 0x0093 }
            java.lang.Object r9 = kotlinx.coroutines.guava.ListenableFutureKt.await(r11, r12)     // Catch:{ all -> 0x0093 }
            if (r9 != r3) goto L_0x0098
            return r3
        L_0x0093:
            r0 = move-exception
            r7 = r4
            r2 = r10
            goto L_0x0177
        L_0x0098:
            r9 = r4
            r4 = r10
        L_0x009a:
            com.mrousavy.camera.CameraView r10 = r1.$this_takeSnapshot     // Catch:{ all -> 0x0058 }
            kotlinx.coroutines.CoroutineScope r10 = r10.getCoroutineScope$react_native_vision_camera_release()     // Catch:{ all -> 0x0058 }
            kotlin.coroutines.CoroutineContext r10 = r10.getCoroutineContext()     // Catch:{ all -> 0x0058 }
            com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2$bitmap$1 r11 = new com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2$bitmap$1     // Catch:{ all -> 0x0058 }
            com.mrousavy.camera.CameraView r12 = r1.$this_takeSnapshot     // Catch:{ all -> 0x0058 }
            r11.<init>(r12, r5)     // Catch:{ all -> 0x0058 }
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11     // Catch:{ all -> 0x0058 }
            r12 = r1
            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12     // Catch:{ all -> 0x0058 }
            r1.L$0 = r9     // Catch:{ all -> 0x0058 }
            r1.Z$0 = r4     // Catch:{ all -> 0x0058 }
            r1.label = r7     // Catch:{ all -> 0x0058 }
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r10, r11, r12)     // Catch:{ all -> 0x0058 }
            if (r7 != r3) goto L_0x00bd
            return r3
        L_0x00bd:
            java.lang.String r10 = "CameraView.takeSnapshot(…meraNotReadyError()\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r10)     // Catch:{ all -> 0x0058 }
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ all -> 0x0058 }
            com.facebook.react.bridge.ReadableMap r10 = r1.$options     // Catch:{ all -> 0x0058 }
            boolean r10 = r10.hasKey(r2)     // Catch:{ all -> 0x0058 }
            if (r10 == 0) goto L_0x00d3
            com.facebook.react.bridge.ReadableMap r10 = r1.$options     // Catch:{ all -> 0x0058 }
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x0058 }
            goto L_0x00d5
        L_0x00d3:
            r2 = 100
        L_0x00d5:
            r16 = r2
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ all -> 0x0058 }
            r2.<init>()     // Catch:{ all -> 0x0058 }
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ all -> 0x0058 }
            r10.<init>()     // Catch:{ all -> 0x0058 }
            kotlinx.coroutines.CoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getIO()     // Catch:{ all -> 0x0058 }
            r15 = r11
            kotlin.coroutines.CoroutineContext r15 = (kotlin.coroutines.CoroutineContext) r15     // Catch:{ all -> 0x0058 }
            com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2$1 r18 = new com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2$1     // Catch:{ all -> 0x0058 }
            com.mrousavy.camera.CameraView r13 = r1.$this_takeSnapshot     // Catch:{ all -> 0x0058 }
            r17 = 0
            r11 = r18
            r12 = r2
            r14 = r10
            r5 = r15
            r15 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0058 }
            r11 = r18
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11     // Catch:{ all -> 0x0058 }
            r12 = r1
            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12     // Catch:{ all -> 0x0058 }
            r1.L$0 = r9     // Catch:{ all -> 0x0058 }
            r1.L$1 = r7     // Catch:{ all -> 0x0058 }
            r1.L$2 = r2     // Catch:{ all -> 0x0058 }
            r1.L$3 = r10     // Catch:{ all -> 0x0058 }
            r1.Z$0 = r4     // Catch:{ all -> 0x0058 }
            r1.label = r6     // Catch:{ all -> 0x0058 }
            java.lang.Object r5 = kotlinx.coroutines.BuildersKt.withContext(r5, r11, r12)     // Catch:{ all -> 0x0058 }
            if (r5 != r3) goto L_0x0111
            return r3
        L_0x0111:
            r6 = r7
            r7 = r9
            r3 = r10
            r19 = r4
            r4 = r2
            r2 = r19
        L_0x0119:
            com.facebook.react.bridge.WritableMap r5 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ all -> 0x0031 }
            java.lang.String r9 = "path"
            T r4 = r4.element     // Catch:{ all -> 0x0031 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x0031 }
            r5.putString(r9, r4)     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = "width"
            int r9 = r6.getWidth()     // Catch:{ all -> 0x0031 }
            r5.putInt(r4, r9)     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = "height"
            int r6 = r6.getHeight()     // Catch:{ all -> 0x0031 }
            r5.putInt(r4, r6)     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = "isRawPhoto"
            r6 = 0
            r5.putBoolean(r4, r6)     // Catch:{ all -> 0x0031 }
            com.facebook.react.bridge.ReadableMap r4 = r1.$options     // Catch:{ all -> 0x0031 }
            boolean r4 = r4.hasKey(r0)     // Catch:{ all -> 0x0031 }
            if (r4 == 0) goto L_0x0150
            com.facebook.react.bridge.ReadableMap r4 = r1.$options     // Catch:{ all -> 0x0031 }
            boolean r6 = r4.getBoolean(r0)     // Catch:{ all -> 0x0031 }
        L_0x0150:
            if (r6 == 0) goto L_0x0154
            r0 = 0
            goto L_0x015c
        L_0x0154:
            T r0 = r3.element     // Catch:{ all -> 0x0031 }
            androidx.exifinterface.media.ExifInterface r0 = (androidx.exifinterface.media.ExifInterface) r0     // Catch:{ all -> 0x0031 }
            com.facebook.react.bridge.WritableMap r0 = com.mrousavy.camera.utils.ExifInterface_buildMetadataMapKt.buildMetadataMap(r0)     // Catch:{ all -> 0x0031 }
        L_0x015c:
            java.lang.String r3 = "metadata"
            com.facebook.react.bridge.ReadableMap r0 = (com.facebook.react.bridge.ReadableMap) r0     // Catch:{ all -> 0x0031 }
            r5.putMap(r3, r0)     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x0176
            androidx.camera.core.CameraControl r0 = r7.getCameraControl()
            com.mrousavy.camera.CameraView r2 = r1.$this_takeSnapshot
            java.lang.String r2 = r2.getTorch()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r8)
            r0.enableTorch(r2)
        L_0x0176:
            return r5
        L_0x0177:
            if (r2 == 0) goto L_0x018a
            androidx.camera.core.CameraControl r2 = r7.getCameraControl()
            com.mrousavy.camera.CameraView r3 = r1.$this_takeSnapshot
            java.lang.String r3 = r3.getTorch()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r8)
            r2.enableTorch(r3)
        L_0x018a:
            throw r0
        L_0x018b:
            com.mrousavy.camera.CameraNotReadyError r0 = new com.mrousavy.camera.CameraNotReadyError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
