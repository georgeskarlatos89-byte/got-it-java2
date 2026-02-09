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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "Lcom/facebook/react/bridge/WritableMap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2", f = "CameraView+TakePhoto.kt", i = {1, 1, 1, 2, 2, 2, 2}, l = {22, 68, 87}, m = "invokeSuspend", n = {"lensFacing", "startFunc", "skipMetadata", "photo", "file", "exif", "startFunc"}, s = {"L$0", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
/* compiled from: CameraView+TakePhoto.kt */
final class CameraView_TakePhotoKt$takePhoto$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WritableMap>, Object> {
    final /* synthetic */ ReadableMap $options;
    final /* synthetic */ CameraView $this_takePhoto;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CameraView_TakePhotoKt$takePhoto$2(CameraView cameraView, ReadableMap readableMap, Continuation<? super CameraView_TakePhotoKt$takePhoto$2> continuation) {
        super(2, continuation);
        this.$this_takePhoto = cameraView;
        this.$options = readableMap;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CameraView_TakePhotoKt$takePhoto$2 cameraView_TakePhotoKt$takePhoto$2 = new CameraView_TakePhotoKt$takePhoto$2(this.$this_takePhoto, this.$options, continuation);
        cameraView_TakePhotoKt$takePhoto$2.L$0 = obj;
        return cameraView_TakePhotoKt$takePhoto$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WritableMap> continuation) {
        return ((CameraView_TakePhotoKt$takePhoto$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: androidx.camera.core.ImageProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0255  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 0
            java.lang.String r5 = "CameraView"
            r6 = 0
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r8) goto L_0x0044
            if (r2 == r7) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            long r1 = r0.J$0
            java.lang.Object r3 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            java.lang.Object r6 = r0.L$1
            java.io.File r6 = (java.io.File) r6
            java.lang.Object r7 = r0.L$0
            androidx.camera.core.ImageProxy r7 = (androidx.camera.core.ImageProxy) r7
            kotlin.ResultKt.throwOnFailure(r25)
            goto L_0x0227
        L_0x002a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0032:
            int r2 = r0.I$0
            long r9 = r0.J$0
            java.lang.Object r7 = r0.L$0
            java.lang.Integer r7 = (java.lang.Integer) r7
            kotlin.ResultKt.throwOnFailure(r25)
            r3 = r2
            r21 = r7
            r2 = r25
            goto L_0x01b2
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r25)
            r2 = r25
            goto L_0x006e
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r25)
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            com.mrousavy.camera.CameraView r9 = r0.$this_takePhoto
            boolean r9 = r9.getFallbackToSnapshot$react_native_vision_camera_release()
            if (r9 == 0) goto L_0x006f
            java.lang.String r2 = "takePhoto() called, but falling back to Snapshot because 1 use-case is already occupied."
            android.util.Log.i(r5, r2)
            com.mrousavy.camera.CameraView r2 = r0.$this_takePhoto
            com.facebook.react.bridge.ReadableMap r3 = r0.$options
            r4 = r0
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r0.label = r8
            java.lang.Object r2 = com.mrousavy.camera.CameraView_TakeSnapshotKt.takeSnapshot(r2, r3, r4)
            if (r2 != r1) goto L_0x006e
            return r1
        L_0x006e:
            return r2
        L_0x006f:
            long r14 = java.lang.System.nanoTime()
            java.lang.String r9 = "takePhoto() called"
            android.util.Log.i(r5, r9)
            com.mrousavy.camera.CameraView r9 = r0.$this_takePhoto
            androidx.camera.core.ImageCapture r9 = r9.getImageCapture$react_native_vision_camera_release()
            if (r9 != 0) goto L_0x009c
            com.mrousavy.camera.CameraView r1 = r0.$this_takePhoto
            java.lang.Boolean r1 = r1.getPhoto()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0096
            com.mrousavy.camera.CameraNotReadyError r1 = new com.mrousavy.camera.CameraNotReadyError
            r1.<init>()
            throw r1
        L_0x0096:
            com.mrousavy.camera.PhotoNotEnabledError r1 = new com.mrousavy.camera.PhotoNotEnabledError
            r1.<init>()
            throw r1
        L_0x009c:
            com.facebook.react.bridge.ReadableMap r9 = r0.$options
            java.lang.String r10 = "flash"
            boolean r9 = r9.hasKey(r10)
            if (r9 == 0) goto L_0x00f7
            com.facebook.react.bridge.ReadableMap r9 = r0.$options
            java.lang.String r9 = r9.getString(r10)
            com.mrousavy.camera.CameraView r11 = r0.$this_takePhoto
            androidx.camera.core.ImageCapture r11 = r11.getImageCapture$react_native_vision_camera_release()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            if (r9 == 0) goto L_0x00ed
            int r12 = r9.hashCode()
            r13 = 3551(0xddf, float:4.976E-42)
            if (r12 == r13) goto L_0x00e0
            r13 = 109935(0x1ad6f, float:1.54052E-40)
            if (r12 == r13) goto L_0x00d5
            r13 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r12 == r13) goto L_0x00ca
            goto L_0x00ed
        L_0x00ca:
            java.lang.String r12 = "auto"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x00d3
            goto L_0x00ed
        L_0x00d3:
            r9 = r6
            goto L_0x00e9
        L_0x00d5:
            java.lang.String r12 = "off"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x00de
            goto L_0x00ed
        L_0x00de:
            r9 = r7
            goto L_0x00e9
        L_0x00e0:
            java.lang.String r12 = "on"
            boolean r12 = r9.equals(r12)
            if (r12 == 0) goto L_0x00ed
            r9 = r8
        L_0x00e9:
            r11.setFlashMode(r9)
            goto L_0x00f7
        L_0x00ed:
            com.mrousavy.camera.InvalidTypeScriptUnionError r1 = new com.mrousavy.camera.InvalidTypeScriptUnionError
            if (r9 != 0) goto L_0x00f3
            java.lang.String r9 = "(null)"
        L_0x00f3:
            r1.<init>(r10, r9)
            throw r1
        L_0x00f7:
            com.facebook.react.bridge.ReadableMap r9 = r0.$options
            java.lang.String r10 = "photoCodec"
            r9.hasKey(r10)
            com.facebook.react.bridge.ReadableMap r9 = r0.$options
            java.lang.String r10 = "qualityPrioritization"
            r9.hasKey(r10)
            com.facebook.react.bridge.ReadableMap r9 = r0.$options
            java.lang.String r10 = "enableAutoRedEyeReduction"
            r9.hasKey(r10)
            com.facebook.react.bridge.ReadableMap r9 = r0.$options
            java.lang.String r10 = "enableDualCameraFusion"
            r9.hasKey(r10)
            com.facebook.react.bridge.ReadableMap r9 = r0.$options
            java.lang.String r10 = "enableAutoStabilization"
            r9.hasKey(r10)
            com.facebook.react.bridge.ReadableMap r9 = r0.$options
            java.lang.String r10 = "enableAutoDistortionCorrection"
            r9.hasKey(r10)
            com.facebook.react.bridge.ReadableMap r9 = r0.$options
            java.lang.String r10 = "skipMetadata"
            boolean r9 = r9.hasKey(r10)
            if (r9 == 0) goto L_0x0133
            com.facebook.react.bridge.ReadableMap r9 = r0.$options
            boolean r9 = r9.getBoolean(r10)
            r13 = r9
            goto L_0x0134
        L_0x0133:
            r13 = r6
        L_0x0134:
            com.mrousavy.camera.CameraView r9 = r0.$this_takePhoto
            androidx.camera.core.Camera r9 = r9.getCamera$react_native_vision_camera_release()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            androidx.camera.core.CameraInfo r9 = r9.getCameraInfo()
            androidx.camera.camera2.interop.Camera2CameraInfo r9 = androidx.camera.camera2.interop.Camera2CameraInfo.from(r9)
            java.lang.String r10 = "from(camera!!.cameraInfo)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            android.hardware.camera2.CameraCharacteristics$Key r10 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r9 = r9.getCameraCharacteristic(r10)
            r12 = r9
            java.lang.Integer r12 = (java.lang.Integer) r12
            kotlinx.coroutines.Deferred[] r11 = new kotlinx.coroutines.Deferred[r7]
            kotlin.coroutines.CoroutineContext r10 = r2.getCoroutineContext()
            r16 = 0
            com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$results$1 r9 = new com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$results$1
            com.mrousavy.camera.CameraView r3 = r0.$this_takePhoto
            r9.<init>(r3, r4)
            r3 = r9
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r17 = 2
            r18 = 0
            r9 = r2
            r7 = r11
            r11 = r16
            r20 = r12
            r12 = r3
            r3 = r13
            r13 = r17
            r21 = r14
            r14 = r18
            kotlinx.coroutines.Deferred r9 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(r9, r10, r11, r12, r13, r14)
            r7[r6] = r9
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()
            r10 = r9
            kotlin.coroutines.CoroutineContext r10 = (kotlin.coroutines.CoroutineContext) r10
            r11 = 0
            com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$results$2 r9 = new com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$results$2
            com.mrousavy.camera.CameraView r12 = r0.$this_takePhoto
            r9.<init>(r12, r4)
            r12 = r9
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r13 = 2
            r14 = 0
            r9 = r2
            kotlinx.coroutines.Deferred r2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(r9, r10, r11, r12, r13, r14)
            r7[r8] = r2
            r2 = r0
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r9 = r20
            r0.L$0 = r9
            r10 = r21
            r0.J$0 = r10
            r0.I$0 = r3
            r12 = 2
            r0.label = r12
            java.lang.Object r2 = kotlinx.coroutines.AwaitKt.awaitAll((kotlinx.coroutines.Deferred<? extends T>[]) r7, r2)
            if (r2 != r1) goto L_0x01af
            return r1
        L_0x01af:
            r21 = r9
            r9 = r10
        L_0x01b2:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r7 = r2.iterator()
        L_0x01ba:
            boolean r11 = r7.hasNext()
            java.lang.String r12 = "Collection contains no element matching the predicate."
            if (r11 == 0) goto L_0x0298
            java.lang.Object r11 = r7.next()
            boolean r13 = r11 instanceof androidx.camera.core.ImageProxy
            if (r13 == 0) goto L_0x01ba
            java.lang.String r7 = "null cannot be cast to non-null type androidx.camera.core.ImageProxy"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11, r7)
            r7 = r11
            androidx.camera.core.ImageProxy r7 = (androidx.camera.core.ImageProxy) r7
            java.util.Iterator r2 = r2.iterator()
        L_0x01d6:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x0292
            java.lang.Object r11 = r2.next()
            boolean r13 = r11 instanceof java.io.File
            if (r13 == 0) goto L_0x01d6
            java.lang.String r2 = "null cannot be cast to non-null type java.io.File"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11, r2)
            r2 = r11
            java.io.File r2 = (java.io.File) r2
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            kotlinx.coroutines.CoroutineDispatcher r12 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r12 = (kotlin.coroutines.CoroutineContext) r12
            com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$1 r13 = new com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$1
            if (r3 == 0) goto L_0x01fe
            r20 = r8
            goto L_0x0200
        L_0x01fe:
            r20 = r6
        L_0x0200:
            r23 = 0
            r17 = r13
            r18 = r2
            r19 = r11
            r22 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r3 = r0
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r0.L$0 = r7
            r0.L$1 = r2
            r0.L$2 = r11
            r0.J$0 = r9
            r14 = 3
            r0.label = r14
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r12, r13, r3)
            if (r3 != r1) goto L_0x0224
            return r1
        L_0x0224:
            r6 = r2
            r1 = r9
            r3 = r11
        L_0x0227:
            com.facebook.react.bridge.WritableMap r8 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r9 = "path"
            java.lang.String r6 = r6.getAbsolutePath()
            r8.putString(r9, r6)
            java.lang.String r6 = "width"
            int r9 = r7.getWidth()
            r8.putInt(r6, r9)
            java.lang.String r6 = "height"
            int r9 = r7.getHeight()
            r8.putInt(r6, r9)
            java.lang.String r6 = "isRawPhoto"
            boolean r9 = com.mrousavy.camera.utils.ImageProxy_isRawKt.isRaw(r7)
            r8.putBoolean(r6, r9)
            T r3 = r3.element
            androidx.exifinterface.media.ExifInterface r3 = (androidx.exifinterface.media.ExifInterface) r3
            if (r3 == 0) goto L_0x0259
            com.facebook.react.bridge.WritableMap r4 = com.mrousavy.camera.utils.ExifInterface_buildMetadataMapKt.buildMetadataMap(r3)
        L_0x0259:
            java.lang.String r3 = "metadata"
            com.facebook.react.bridge.ReadableMap r4 = (com.facebook.react.bridge.ReadableMap) r4
            r8.putMap(r3, r4)
            r7.close()
            java.lang.String r3 = "Finished taking photo!"
            android.util.Log.d(r5, r3)
            long r3 = java.lang.System.nanoTime()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Finished function execution in "
            r5.<init>(r6)
            long r3 = r3 - r1
            r1 = 1000000(0xf4240, float:1.401298E-39)
            long r1 = (long) r1
            long r3 = r3 / r1
            java.lang.StringBuilder r1 = r5.append(r3)
            java.lang.String r2 = "ms"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "CameraView.performance"
            android.util.Log.i(r2, r1)
            java.lang.String r1 = "map"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
            return r8
        L_0x0292:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r12)
            throw r1
        L_0x0298:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r12)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
