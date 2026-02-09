package com.mrousavy.camera;

import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraViewModule$getAvailableCameraDevices$1", f = "CameraViewModule.kt", i = {0, 1, 1, 2, 2, 2}, l = {175, 176, 177}, m = "invokeSuspend", n = {"promise$iv", "promise$iv", "cameraProvider", "promise$iv", "extensionsManager", "cameraProvider"}, s = {"L$0", "L$0", "L$2", "L$0", "L$2", "L$3"})
/* compiled from: CameraViewModule.kt */
final class CameraViewModule$getAvailableCameraDevices$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ long $startTime;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ CameraViewModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CameraViewModule$getAvailableCameraDevices$1(Promise promise, CameraViewModule cameraViewModule, long j, Continuation<? super CameraViewModule$getAvailableCameraDevices$1> continuation) {
        super(2, continuation);
        this.$promise = promise;
        this.this$0 = cameraViewModule;
        this.$startTime = j;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraViewModule$getAvailableCameraDevices$1(this.$promise, this.this$0, this.$startTime, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CameraViewModule$getAvailableCameraDevices$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:156|157) */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        r13 = r25;
        android.util.Log.e(r13, "Minimum Frame Duration for MediaRecorder Output cannot be calculated, format \"" + r1 + "\" is not supported.");
        r25 = r3;
        r12 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x043d */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02a6 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02a8 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02b0 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02b2 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ba A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02bc A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02c4 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02c6 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02ce A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02d0 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02e2 A[SYNTHETIC, Splitter:B:121:0x02e2] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0301 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0322 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0366 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x037e A[Catch:{ all -> 0x0691, all -> 0x06c6 }, LOOP:3: B:133:0x037c->B:134:0x037e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03ad A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03af A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03f4 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04a0 A[Catch:{ all -> 0x0691, all -> 0x06c6 }, LOOP:7: B:167:0x049e->B:168:0x04a0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04f4 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0508 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x050c A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x051b A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x054b A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0583 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x058d A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0595 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x059f A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x05a7 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x05a9 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x05b1 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x05b8 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x05c0 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05c7 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x05da A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x05df A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05f6 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x05f8 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x06ca A[Catch:{ all -> 0x06d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x06db  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0575 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3 A[Catch:{ all -> 0x06d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e6 A[Catch:{ all -> 0x06d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e9 A[Catch:{ all -> 0x06d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d7 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d9 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0204 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x020d A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0216 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x021f A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0266 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0292 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0294 A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x029c A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x029e A[Catch:{ all -> 0x0691, all -> 0x06c6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            r49 = this;
            r1 = r49
            java.lang.String r0 = "cameraConfig.outputFormats"
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            java.lang.String r4 = "getInstance(reactApplicationContext)"
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x005e
            if (r3 == r7) goto L_0x004e
            if (r3 == r6) goto L_0x0036
            if (r3 != r5) goto L_0x002e
            long r2 = r1.J$0
            java.lang.Object r4 = r1.L$3
            androidx.camera.lifecycle.ProcessCameraProvider r4 = (androidx.camera.lifecycle.ProcessCameraProvider) r4
            java.lang.Object r8 = r1.L$2
            androidx.camera.extensions.ExtensionsManager r8 = (androidx.camera.extensions.ExtensionsManager) r8
            java.lang.Object r9 = r1.L$1
            com.mrousavy.camera.CameraViewModule r9 = (com.mrousavy.camera.CameraViewModule) r9
            java.lang.Object r10 = r1.L$0
            com.facebook.react.bridge.Promise r10 = (com.facebook.react.bridge.Promise) r10
            kotlin.ResultKt.throwOnFailure(r50)     // Catch:{ all -> 0x06d0 }
            goto L_0x00d5
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0036:
            long r8 = r1.J$0
            java.lang.Object r3 = r1.L$2
            androidx.camera.lifecycle.ProcessCameraProvider r3 = (androidx.camera.lifecycle.ProcessCameraProvider) r3
            java.lang.Object r10 = r1.L$1
            com.mrousavy.camera.CameraViewModule r10 = (com.mrousavy.camera.CameraViewModule) r10
            java.lang.Object r11 = r1.L$0
            com.facebook.react.bridge.Promise r11 = (com.facebook.react.bridge.Promise) r11
            kotlin.ResultKt.throwOnFailure(r50)     // Catch:{ all -> 0x004a }
            r12 = r50
            goto L_0x00ae
        L_0x004a:
            r0 = move-exception
            r10 = r11
            goto L_0x06d1
        L_0x004e:
            long r8 = r1.J$0
            java.lang.Object r3 = r1.L$1
            com.mrousavy.camera.CameraViewModule r3 = (com.mrousavy.camera.CameraViewModule) r3
            java.lang.Object r10 = r1.L$0
            com.facebook.react.bridge.Promise r10 = (com.facebook.react.bridge.Promise) r10
            kotlin.ResultKt.throwOnFailure(r50)     // Catch:{ all -> 0x06d0 }
            r11 = r50
            goto L_0x0083
        L_0x005e:
            kotlin.ResultKt.throwOnFailure(r50)
            com.facebook.react.bridge.Promise r10 = r1.$promise
            com.mrousavy.camera.CameraViewModule r3 = r1.this$0
            long r8 = r1.$startTime
            com.facebook.react.bridge.ReactApplicationContext r11 = r3.getReactApplicationContext()     // Catch:{ all -> 0x06d0 }
            android.content.Context r11 = (android.content.Context) r11     // Catch:{ all -> 0x06d0 }
            com.google.common.util.concurrent.ListenableFuture r11 = androidx.camera.lifecycle.ProcessCameraProvider.getInstance(r11)     // Catch:{ all -> 0x06d0 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r4)     // Catch:{ all -> 0x06d0 }
            r1.L$0 = r10     // Catch:{ all -> 0x06d0 }
            r1.L$1 = r3     // Catch:{ all -> 0x06d0 }
            r1.J$0 = r8     // Catch:{ all -> 0x06d0 }
            r1.label = r7     // Catch:{ all -> 0x06d0 }
            java.lang.Object r11 = kotlinx.coroutines.guava.ListenableFutureKt.await(r11, r1)     // Catch:{ all -> 0x06d0 }
            if (r11 != r2) goto L_0x0083
            return r2
        L_0x0083:
            androidx.camera.lifecycle.ProcessCameraProvider r11 = (androidx.camera.lifecycle.ProcessCameraProvider) r11     // Catch:{ all -> 0x06d0 }
            com.facebook.react.bridge.ReactApplicationContext r12 = r3.getReactApplicationContext()     // Catch:{ all -> 0x06d0 }
            android.content.Context r12 = (android.content.Context) r12     // Catch:{ all -> 0x06d0 }
            r13 = r11
            androidx.camera.core.CameraProvider r13 = (androidx.camera.core.CameraProvider) r13     // Catch:{ all -> 0x06d0 }
            com.google.common.util.concurrent.ListenableFuture r12 = androidx.camera.extensions.ExtensionsManager.getInstanceAsync(r12, r13)     // Catch:{ all -> 0x06d0 }
            java.lang.String r13 = "getInstanceAsync(reactAp…nContext, cameraProvider)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r13)     // Catch:{ all -> 0x06d0 }
            r1.L$0 = r10     // Catch:{ all -> 0x06d0 }
            r1.L$1 = r3     // Catch:{ all -> 0x06d0 }
            r1.L$2 = r11     // Catch:{ all -> 0x06d0 }
            r1.J$0 = r8     // Catch:{ all -> 0x06d0 }
            r1.label = r6     // Catch:{ all -> 0x06d0 }
            java.lang.Object r12 = kotlinx.coroutines.guava.ListenableFutureKt.await(r12, r1)     // Catch:{ all -> 0x06d0 }
            if (r12 != r2) goto L_0x00a8
            return r2
        L_0x00a8:
            r48 = r10
            r10 = r3
            r3 = r11
            r11 = r48
        L_0x00ae:
            androidx.camera.extensions.ExtensionsManager r12 = (androidx.camera.extensions.ExtensionsManager) r12     // Catch:{ all -> 0x004a }
            com.facebook.react.bridge.ReactApplicationContext r13 = r10.getReactApplicationContext()     // Catch:{ all -> 0x004a }
            android.content.Context r13 = (android.content.Context) r13     // Catch:{ all -> 0x004a }
            com.google.common.util.concurrent.ListenableFuture r13 = androidx.camera.lifecycle.ProcessCameraProvider.getInstance(r13)     // Catch:{ all -> 0x004a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r4)     // Catch:{ all -> 0x004a }
            r1.L$0 = r11     // Catch:{ all -> 0x004a }
            r1.L$1 = r10     // Catch:{ all -> 0x004a }
            r1.L$2 = r12     // Catch:{ all -> 0x004a }
            r1.L$3 = r3     // Catch:{ all -> 0x004a }
            r1.J$0 = r8     // Catch:{ all -> 0x004a }
            r1.label = r5     // Catch:{ all -> 0x004a }
            java.lang.Object r4 = kotlinx.coroutines.guava.ListenableFutureKt.await(r13, r1)     // Catch:{ all -> 0x004a }
            if (r4 != r2) goto L_0x00d0
            return r2
        L_0x00d0:
            r4 = r3
            r2 = r8
            r9 = r10
            r10 = r11
            r8 = r12
        L_0x00d5:
            com.facebook.react.bridge.ReactApplicationContext r9 = r9.getReactApplicationContext()     // Catch:{ all -> 0x06d0 }
            java.lang.String r11 = "camera"
            java.lang.Object r9 = r9.getSystemService(r11)     // Catch:{ all -> 0x06d0 }
            boolean r11 = r9 instanceof android.hardware.camera2.CameraManager     // Catch:{ all -> 0x06d0 }
            if (r11 == 0) goto L_0x00e6
            android.hardware.camera2.CameraManager r9 = (android.hardware.camera2.CameraManager) r9     // Catch:{ all -> 0x06d0 }
            goto L_0x00e7
        L_0x00e6:
            r9 = 0
        L_0x00e7:
            if (r9 == 0) goto L_0x06ca
            com.facebook.react.bridge.WritableArray r11 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ all -> 0x06d0 }
            java.lang.String r13 = "createArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r13)     // Catch:{ all -> 0x06d0 }
            java.lang.String[] r13 = r9.getCameraIdList()     // Catch:{ all -> 0x06d0 }
            java.lang.String r14 = "manager.cameraIdList"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)     // Catch:{ all -> 0x06d0 }
            java.lang.Object[] r13 = (java.lang.Object[]) r13     // Catch:{ all -> 0x06d0 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x06d0 }
            r14.<init>()     // Catch:{ all -> 0x06d0 }
            java.util.Collection r14 = (java.util.Collection) r14     // Catch:{ all -> 0x06d0 }
            int r15 = r13.length     // Catch:{ all -> 0x06d0 }
            r12 = 0
        L_0x0106:
            java.lang.String r7 = "id"
            if (r12 >= r15) goto L_0x0125
            r6 = r13[r12]     // Catch:{ all -> 0x06d0 }
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x06d0 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)     // Catch:{ all -> 0x06d0 }
            java.lang.Integer r5 = kotlin.text.StringsKt.toIntOrNull(r5)     // Catch:{ all -> 0x06d0 }
            if (r5 == 0) goto L_0x011a
            r5 = 1
            goto L_0x011b
        L_0x011a:
            r5 = 0
        L_0x011b:
            if (r5 == 0) goto L_0x0120
            r14.add(r6)     // Catch:{ all -> 0x06d0 }
        L_0x0120:
            int r12 = r12 + 1
            r5 = 3
            r6 = 2
            goto L_0x0106
        L_0x0125:
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x06d0 }
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch:{ all -> 0x06d0 }
            java.util.Iterator r5 = r14.iterator()     // Catch:{ all -> 0x06d0 }
        L_0x012d:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x06d0 }
            java.lang.String r12 = "CameraView"
            if (r6 == 0) goto L_0x0695
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0691 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0691 }
            androidx.camera.core.CameraSelector$Builder r13 = new androidx.camera.core.CameraSelector$Builder     // Catch:{ all -> 0x0691 }
            r13.<init>()     // Catch:{ all -> 0x0691 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch:{ all -> 0x0691 }
            androidx.camera.core.CameraSelector$Builder r13 = com.mrousavy.camera.utils.CameraSelector_byIDKt.byID(r13, r6)     // Catch:{ all -> 0x0691 }
            androidx.camera.core.CameraSelector r13 = r13.build()     // Catch:{ all -> 0x0691 }
            java.lang.String r14 = "Builder().byID(id).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)     // Catch:{ all -> 0x0691 }
            android.hardware.camera2.CameraCharacteristics r14 = r9.getCameraCharacteristics(r6)     // Catch:{ all -> 0x0691 }
            java.lang.String r15 = "manager.getCameraCharacteristics(id)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)     // Catch:{ all -> 0x0691 }
            android.hardware.camera2.CameraCharacteristics$Key r15 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ all -> 0x0691 }
            java.lang.Object r15 = r14.get(r15)     // Catch:{ all -> 0x0691 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)     // Catch:{ all -> 0x0691 }
            java.lang.Number r15 = (java.lang.Number) r15     // Catch:{ all -> 0x0691 }
            int r15 = r15.intValue()     // Catch:{ all -> 0x0691 }
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES     // Catch:{ all -> 0x0691 }
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0691 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ all -> 0x0691 }
            int[] r1 = (int[]) r1     // Catch:{ all -> 0x0691 }
            r18 = r5
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0691 }
            r19 = r9
            r9 = 28
            if (r5 < r9) goto L_0x0187
            r5 = 11
            boolean r5 = kotlin.collections.ArraysKt.contains((int[]) r1, (int) r5)     // Catch:{ all -> 0x06d0 }
            if (r5 == 0) goto L_0x0187
            r5 = 1
            goto L_0x0188
        L_0x0187:
            r5 = 0
        L_0x0188:
            com.facebook.react.bridge.ReadableArray r9 = com.mrousavy.camera.utils.CameraCharacteristicsUtilsKt.getDeviceTypes(r14)     // Catch:{ all -> 0x0691 }
            r21 = r10
            android.hardware.camera2.CameraCharacteristics$Key r10 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ all -> 0x06c6 }
            java.lang.Object r10 = r14.get(r10)     // Catch:{ all -> 0x06c6 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)     // Catch:{ all -> 0x06c6 }
            android.hardware.camera2.params.StreamConfigurationMap r10 = (android.hardware.camera2.params.StreamConfigurationMap) r10     // Catch:{ all -> 0x06c6 }
            r22 = r2
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ all -> 0x06c6 }
            java.lang.Object r2 = r14.get(r2)     // Catch:{ all -> 0x06c6 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch:{ all -> 0x06c6 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ all -> 0x06c6 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x06c6 }
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE     // Catch:{ all -> 0x06c6 }
            java.lang.Object r3 = r14.get(r3)     // Catch:{ all -> 0x06c6 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch:{ all -> 0x06c6 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x06c6 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x06c6 }
            r24 = r11
            android.hardware.camera2.CameraCharacteristics$Key r11 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM     // Catch:{ all -> 0x06c6 }
            java.lang.Object r11 = r14.get(r11)     // Catch:{ all -> 0x06c6 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)     // Catch:{ all -> 0x06c6 }
            java.lang.Number r11 = (java.lang.Number) r11     // Catch:{ all -> 0x06c6 }
            float r11 = r11.floatValue()     // Catch:{ all -> 0x06c6 }
            r25 = r12
            r12 = 8
            boolean r12 = kotlin.collections.ArraysKt.contains((int[]) r1, (int) r12)     // Catch:{ all -> 0x06c6 }
            r26 = r0
            r0 = 3
            if (r12 == 0) goto L_0x01d9
            r12 = 1
            goto L_0x01da
        L_0x01d9:
            r12 = 0
        L_0x01da:
            boolean r1 = kotlin.collections.ArraysKt.contains((int[]) r1, (int) r0)     // Catch:{ all -> 0x06c6 }
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE     // Catch:{ all -> 0x06c6 }
            java.lang.Object r0 = r14.get(r0)     // Catch:{ all -> 0x06c6 }
            android.util.Range r0 = (android.util.Range) r0     // Catch:{ all -> 0x06c6 }
            r27 = r0
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES     // Catch:{ all -> 0x06c6 }
            java.lang.Object r0 = r14.get(r0)     // Catch:{ all -> 0x06c6 }
            int[] r0 = (int[]) r0     // Catch:{ all -> 0x06c6 }
            r28 = r0
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION     // Catch:{ all -> 0x06c6 }
            java.lang.Object r0 = r14.get(r0)     // Catch:{ all -> 0x06c6 }
            int[] r0 = (int[]) r0     // Catch:{ all -> 0x06c6 }
            r29 = r0
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x06c6 }
            r30 = r10
            r10 = 30
            if (r0 < r10) goto L_0x020d
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE     // Catch:{ all -> 0x06c6 }
            java.lang.Object r0 = r14.get(r0)     // Catch:{ all -> 0x06c6 }
            android.util.Range r0 = (android.util.Range) r0     // Catch:{ all -> 0x06c6 }
            goto L_0x020e
        L_0x020d:
            r0 = 0
        L_0x020e:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x06c6 }
            r31 = r4
            r4 = 28
            if (r10 < r4) goto L_0x021f
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.INFO_VERSION     // Catch:{ all -> 0x06c6 }
            java.lang.Object r4 = r14.get(r4)     // Catch:{ all -> 0x06c6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x06c6 }
            goto L_0x0220
        L_0x021f:
            r4 = 0
        L_0x0220:
            android.hardware.camera2.CameraCharacteristics$Key r10 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES     // Catch:{ all -> 0x06c6 }
            java.lang.Object r10 = r14.get(r10)     // Catch:{ all -> 0x06c6 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)     // Catch:{ all -> 0x06c6 }
            android.util.Range[] r10 = (android.util.Range[]) r10     // Catch:{ all -> 0x06c6 }
            r20 = r10
            r10 = 2
            boolean r16 = r8.isExtensionAvailable(r13, r10)     // Catch:{ all -> 0x06c6 }
            r10 = 3
            boolean r17 = r8.isExtensionAvailable(r13, r10)     // Catch:{ all -> 0x06c6 }
            r10 = 2
            if (r15 == r10) goto L_0x0240
            if (r15 == 0) goto L_0x0240
            r32 = r11
            r15 = 1
            goto L_0x0243
        L_0x0240:
            r32 = r11
            r15 = 0
        L_0x0243:
            double r10 = com.mrousavy.camera.utils.CameraCharacteristicsUtilsKt.getFieldOfView(r14)     // Catch:{ all -> 0x06c6 }
            com.facebook.react.bridge.WritableMap r14 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ all -> 0x06c6 }
            r14.putString(r7, r6)     // Catch:{ all -> 0x06c6 }
            r33 = r7
            java.lang.String r7 = "devices"
            r14.putArray(r7, r9)     // Catch:{ all -> 0x06c6 }
            java.lang.String r7 = "position"
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)     // Catch:{ all -> 0x06c6 }
            java.lang.String r9 = com.mrousavy.camera.parsers.LenseFacing_StringKt.parseLensFacing(r9)     // Catch:{ all -> 0x06c6 }
            r14.putString(r7, r9)     // Catch:{ all -> 0x06c6 }
            java.lang.String r7 = "name"
            if (r4 != 0) goto L_0x028b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x06c6 }
            r4.<init>()     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)     // Catch:{ all -> 0x06c6 }
            java.lang.String r2 = com.mrousavy.camera.parsers.LenseFacing_StringKt.parseLensFacing(r2)     // Catch:{ all -> 0x06c6 }
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch:{ all -> 0x06c6 }
            java.lang.String r4 = " ("
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ all -> 0x06c6 }
            java.lang.StringBuilder r2 = r2.append(r6)     // Catch:{ all -> 0x06c6 }
            r4 = 41
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ all -> 0x06c6 }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x06c6 }
        L_0x028b:
            r14.putString(r7, r4)     // Catch:{ all -> 0x06c6 }
            java.lang.String r2 = "hasFlash"
            if (r3 == 0) goto L_0x0294
            r4 = 1
            goto L_0x0295
        L_0x0294:
            r4 = 0
        L_0x0295:
            r14.putBoolean(r2, r4)     // Catch:{ all -> 0x06c6 }
            java.lang.String r2 = "hasTorch"
            if (r3 == 0) goto L_0x029e
            r3 = 1
            goto L_0x029f
        L_0x029e:
            r3 = 0
        L_0x029f:
            r14.putBoolean(r2, r3)     // Catch:{ all -> 0x06c6 }
            java.lang.String r2 = "isMultiCam"
            if (r5 == 0) goto L_0x02a8
            r3 = 1
            goto L_0x02a9
        L_0x02a8:
            r3 = 0
        L_0x02a9:
            r14.putBoolean(r2, r3)     // Catch:{ all -> 0x06c6 }
            java.lang.String r2 = "supportsParallelVideoProcessing"
            if (r15 == 0) goto L_0x02b2
            r3 = 1
            goto L_0x02b3
        L_0x02b2:
            r3 = 0
        L_0x02b3:
            r14.putBoolean(r2, r3)     // Catch:{ all -> 0x06c6 }
            java.lang.String r2 = "supportsRawCapture"
            if (r1 == 0) goto L_0x02bc
            r1 = 1
            goto L_0x02bd
        L_0x02bc:
            r1 = 0
        L_0x02bd:
            r14.putBoolean(r2, r1)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "supportsDepthCapture"
            if (r12 == 0) goto L_0x02c6
            r2 = 1
            goto L_0x02c7
        L_0x02c6:
            r2 = 0
        L_0x02c7:
            r14.putBoolean(r1, r2)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "supportsLowLightBoost"
            if (r17 == 0) goto L_0x02d0
            r2 = 1
            goto L_0x02d1
        L_0x02d0:
            r2 = 0
        L_0x02d1:
            r14.putBoolean(r1, r2)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "supportsFocus"
            r2 = 1
            r14.putBoolean(r1, r2)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "minZoom"
            java.lang.String r2 = "maxZoom"
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto L_0x0301
            java.lang.Comparable r5 = r0.getLower()     // Catch:{ all -> 0x06c6 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x06c6 }
            float r5 = r5.floatValue()     // Catch:{ all -> 0x06c6 }
            double r5 = (double) r5     // Catch:{ all -> 0x06c6 }
            r14.putDouble(r1, r5)     // Catch:{ all -> 0x06c6 }
            java.lang.Comparable r1 = r0.getUpper()     // Catch:{ all -> 0x06c6 }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x06c6 }
            float r1 = r1.floatValue()     // Catch:{ all -> 0x06c6 }
            double r5 = (double) r1     // Catch:{ all -> 0x06c6 }
            r14.putDouble(r2, r5)     // Catch:{ all -> 0x06c6 }
            r1 = r32
            goto L_0x030a
        L_0x0301:
            r14.putDouble(r1, r3)     // Catch:{ all -> 0x06c6 }
            r1 = r32
            double r5 = (double) r1     // Catch:{ all -> 0x06c6 }
            r14.putDouble(r2, r5)     // Catch:{ all -> 0x06c6 }
        L_0x030a:
            java.lang.String r5 = "neutralZoom"
            r14.putDouble(r5, r3)     // Catch:{ all -> 0x06c6 }
            java.util.List r5 = r31.getAvailableCameraInfos()     // Catch:{ all -> 0x06c6 }
            java.util.List r5 = r13.filter((java.util.List<androidx.camera.core.CameraInfo>) r5)     // Catch:{ all -> 0x06c6 }
            java.lang.String r6 = "cameraSelector.filter(ca…der.availableCameraInfos)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch:{ all -> 0x06c6 }
            int r6 = r5.size()     // Catch:{ all -> 0x06c6 }
            if (r6 <= 0) goto L_0x0366
            r6 = 0
            java.lang.Object r7 = r5.get(r6)     // Catch:{ all -> 0x06c6 }
            androidx.camera.core.CameraInfo r7 = (androidx.camera.core.CameraInfo) r7     // Catch:{ all -> 0x06c6 }
            java.util.List r6 = androidx.camera.video.QualitySelector.getSupportedQualities(r7)     // Catch:{ all -> 0x06c6 }
            java.lang.String r7 = "getSupportedQualities(cameraInfos[0])"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch:{ all -> 0x06c6 }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x06c6 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x06c6 }
            r9 = 10
            int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r9)     // Catch:{ all -> 0x06c6 }
            r7.<init>(r9)     // Catch:{ all -> 0x06c6 }
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x06c6 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x06c6 }
        L_0x0345:
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x06c6 }
            if (r9 == 0) goto L_0x0363
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x06c6 }
            androidx.camera.video.Quality r9 = (androidx.camera.video.Quality) r9     // Catch:{ all -> 0x06c6 }
            r12 = 0
            java.lang.Object r13 = r5.get(r12)     // Catch:{ all -> 0x06c6 }
            androidx.camera.core.CameraInfo r13 = (androidx.camera.core.CameraInfo) r13     // Catch:{ all -> 0x06c6 }
            android.util.Size r9 = androidx.camera.video.QualitySelector.getResolution(r13, r9)     // Catch:{ all -> 0x06c6 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)     // Catch:{ all -> 0x06c6 }
            r7.add(r9)     // Catch:{ all -> 0x06c6 }
            goto L_0x0345
        L_0x0363:
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x06c6 }
            goto L_0x036a
        L_0x0366:
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ all -> 0x06c6 }
        L_0x036a:
            int[] r5 = r30.getOutputFormats()     // Catch:{ all -> 0x06c6 }
            r6 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch:{ all -> 0x06c6 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x06c6 }
            r9.<init>()     // Catch:{ all -> 0x06c6 }
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ all -> 0x06c6 }
            int r12 = r5.length     // Catch:{ all -> 0x06c6 }
            r13 = 0
        L_0x037c:
            if (r13 >= r12) goto L_0x039d
            r15 = r5[r13]     // Catch:{ all -> 0x06c6 }
            r3 = r30
            android.util.Size[] r4 = r3.getOutputSizes(r15)     // Catch:{ all -> 0x06c6 }
            java.lang.String r15 = "cameraConfig.getOutputSizes(it)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r15)     // Catch:{ all -> 0x06c6 }
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch:{ all -> 0x06c6 }
            java.util.List r4 = kotlin.collections.ArraysKt.toList((T[]) r4)     // Catch:{ all -> 0x06c6 }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x06c6 }
            kotlin.collections.CollectionsKt.addAll(r9, r4)     // Catch:{ all -> 0x06c6 }
            int r13 = r13 + 1
            r30 = r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x037c
        L_0x039d:
            r3 = r30
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x06c6 }
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ all -> 0x06c6 }
            java.util.Iterator r4 = r9.iterator()     // Catch:{ all -> 0x06c6 }
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x06c6 }
            if (r5 != 0) goto L_0x03af
            r5 = 0
            goto L_0x03e0
        L_0x03af:
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x06c6 }
            boolean r9 = r4.hasNext()     // Catch:{ all -> 0x06c6 }
            if (r9 != 0) goto L_0x03ba
            goto L_0x03e0
        L_0x03ba:
            r9 = r5
            android.util.Size r9 = (android.util.Size) r9     // Catch:{ all -> 0x06c6 }
            int r12 = r9.getWidth()     // Catch:{ all -> 0x06c6 }
            int r9 = r9.getHeight()     // Catch:{ all -> 0x06c6 }
            int r12 = r12 * r9
        L_0x03c6:
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x06c6 }
            r13 = r9
            android.util.Size r13 = (android.util.Size) r13     // Catch:{ all -> 0x06c6 }
            int r15 = r13.getWidth()     // Catch:{ all -> 0x06c6 }
            int r13 = r13.getHeight()     // Catch:{ all -> 0x06c6 }
            int r15 = r15 * r13
            if (r12 >= r15) goto L_0x03da
            r5 = r9
            r12 = r15
        L_0x03da:
            boolean r9 = r4.hasNext()     // Catch:{ all -> 0x06c6 }
            if (r9 != 0) goto L_0x068b
        L_0x03e0:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch:{ all -> 0x06c6 }
            android.util.Size r5 = (android.util.Size) r5     // Catch:{ all -> 0x06c6 }
            com.facebook.react.bridge.WritableArray r4 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ all -> 0x06c6 }
            int[] r9 = r3.getOutputFormats()     // Catch:{ all -> 0x06c6 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)     // Catch:{ all -> 0x06c6 }
            int r12 = r9.length     // Catch:{ all -> 0x06c6 }
            r13 = 0
        L_0x03f2:
            if (r13 >= r12) goto L_0x065e
            r15 = r9[r13]     // Catch:{ all -> 0x06c6 }
            r32 = r1
            java.lang.String r1 = com.mrousavy.camera.parsers.ImageFormat_StringKt.parseImageFormat(r15)     // Catch:{ all -> 0x06c6 }
            r26 = r6
            android.util.Size[] r6 = r3.getOutputSizes(r15)     // Catch:{ all -> 0x06c6 }
            r17 = r8
            java.lang.String r8 = "cameraConfig.getOutputSizes(formatId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)     // Catch:{ all -> 0x06c6 }
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch:{ all -> 0x06c6 }
            int r8 = r6.length     // Catch:{ all -> 0x06c6 }
            r30 = r9
            r9 = 0
        L_0x040f:
            if (r9 >= r8) goto L_0x063b
            r36 = r6[r9]     // Catch:{ all -> 0x06c6 }
            r37 = r6
            r6 = r36
            android.util.Size r6 = (android.util.Size) r6     // Catch:{ all -> 0x06c6 }
            r36 = r8
            java.lang.String r8 = "size"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)     // Catch:{ all -> 0x06c6 }
            boolean r8 = com.mrousavy.camera.parsers.Size_easyKt.areUltimatelyEqual(r6, r5)     // Catch:{ all -> 0x06c6 }
            r38 = r12
            r39 = r13
            long r12 = r3.getOutputMinFrameDuration(r15, r6)     // Catch:{ all -> 0x043d }
            double r12 = (double) r12     // Catch:{ all -> 0x043d }
            r40 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r12 = r12 / r40
            java.lang.Double r12 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r12)     // Catch:{ all -> 0x043d }
            r13 = r25
            r25 = r3
            goto L_0x045e
        L_0x043d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x06c6 }
            r12.<init>()     // Catch:{ all -> 0x06c6 }
            java.lang.String r13 = "Minimum Frame Duration for MediaRecorder Output cannot be calculated, format \""
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch:{ all -> 0x06c6 }
            java.lang.StringBuilder r12 = r12.append(r1)     // Catch:{ all -> 0x06c6 }
            java.lang.String r13 = "\" is not supported."
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch:{ all -> 0x06c6 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x06c6 }
            r13 = r25
            android.util.Log.e(r13, r12)     // Catch:{ all -> 0x06c6 }
            r25 = r3
            r12 = 0
        L_0x045e:
            com.facebook.react.bridge.WritableArray r3 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ all -> 0x06c6 }
            r40 = r5
            java.lang.String r5 = "maxFrameRate"
            r41 = r15
            java.lang.String r15 = "minFrameRate"
            if (r12 == 0) goto L_0x0494
            double r42 = r12.doubleValue()     // Catch:{ all -> 0x06c6 }
            r44 = 0
            int r42 = (r42 > r44 ? 1 : (r42 == r44 ? 0 : -1))
            if (r42 <= 0) goto L_0x0494
            double r42 = r12.doubleValue()     // Catch:{ all -> 0x06c6 }
            r44 = r13
            r34 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r34 / r42
            int r12 = (int) r12     // Catch:{ all -> 0x06c6 }
            com.facebook.react.bridge.WritableMap r13 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ all -> 0x06c6 }
            r42 = r14
            r14 = 1
            r13.putInt(r15, r14)     // Catch:{ all -> 0x06c6 }
            r13.putInt(r5, r12)     // Catch:{ all -> 0x06c6 }
            com.facebook.react.bridge.ReadableMap r13 = (com.facebook.react.bridge.ReadableMap) r13     // Catch:{ all -> 0x06c6 }
            r3.pushMap(r13)     // Catch:{ all -> 0x06c6 }
            goto L_0x049a
        L_0x0494:
            r44 = r13
            r42 = r14
            r34 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x049a:
            r13 = r20
            int r12 = r13.length     // Catch:{ all -> 0x06c6 }
            r14 = 0
        L_0x049e:
            if (r14 >= r12) goto L_0x04de
            r20 = r13[r14]     // Catch:{ all -> 0x06c6 }
            r43 = r12
            com.facebook.react.bridge.WritableMap r12 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ all -> 0x06c6 }
            r45 = r13
            java.lang.Comparable r13 = r20.getLower()     // Catch:{ all -> 0x06c6 }
            r46 = r9
            java.lang.String r9 = "range.lower"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r9)     // Catch:{ all -> 0x06c6 }
            java.lang.Number r13 = (java.lang.Number) r13     // Catch:{ all -> 0x06c6 }
            int r9 = r13.intValue()     // Catch:{ all -> 0x06c6 }
            r12.putInt(r15, r9)     // Catch:{ all -> 0x06c6 }
            java.lang.Comparable r9 = r20.getUpper()     // Catch:{ all -> 0x06c6 }
            java.lang.String r13 = "range.upper"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r13)     // Catch:{ all -> 0x06c6 }
            java.lang.Number r9 = (java.lang.Number) r9     // Catch:{ all -> 0x06c6 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x06c6 }
            r12.putInt(r5, r9)     // Catch:{ all -> 0x06c6 }
            com.facebook.react.bridge.ReadableMap r12 = (com.facebook.react.bridge.ReadableMap) r12     // Catch:{ all -> 0x06c6 }
            r3.pushMap(r12)     // Catch:{ all -> 0x06c6 }
            int r14 = r14 + 1
            r12 = r43
            r13 = r45
            r9 = r46
            goto L_0x049e
        L_0x04de:
            r46 = r9
            r45 = r13
            com.facebook.react.bridge.WritableArray r5 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ all -> 0x06c6 }
            r5.pushString(r1)     // Catch:{ all -> 0x06c6 }
            com.facebook.react.bridge.WritableArray r9 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ all -> 0x06c6 }
            java.lang.String r12 = "off"
            r9.pushString(r12)     // Catch:{ all -> 0x06c6 }
            if (r28 == 0) goto L_0x0508
            r13 = r28
            r12 = 1
            boolean r14 = kotlin.collections.ArraysKt.contains((int[]) r13, (int) r12)     // Catch:{ all -> 0x06c6 }
            if (r14 == 0) goto L_0x050a
            java.lang.String r12 = "auto"
            r9.pushString(r12)     // Catch:{ all -> 0x06c6 }
            java.lang.String r12 = "standard"
            r9.pushString(r12)     // Catch:{ all -> 0x06c6 }
            goto L_0x050a
        L_0x0508:
            r13 = r28
        L_0x050a:
            if (r29 == 0) goto L_0x051b
            r15 = r29
            r14 = 1
            boolean r12 = kotlin.collections.ArraysKt.contains((int[]) r15, (int) r14)     // Catch:{ all -> 0x06c6 }
            if (r12 == 0) goto L_0x051e
            java.lang.String r12 = "cinematic"
            r9.pushString(r12)     // Catch:{ all -> 0x06c6 }
            goto L_0x051e
        L_0x051b:
            r15 = r29
            r14 = 1
        L_0x051e:
            java.lang.String r12 = "420v"
            com.facebook.react.bridge.WritableMap r14 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ all -> 0x06c6 }
            r20 = r1
            java.lang.String r1 = "photoHeight"
            r28 = r13
            int r13 = r6.getHeight()     // Catch:{ all -> 0x06c6 }
            r29 = r12
            double r12 = (double) r13     // Catch:{ all -> 0x06c6 }
            r14.putDouble(r1, r12)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "photoWidth"
            int r12 = r6.getWidth()     // Catch:{ all -> 0x06c6 }
            double r12 = (double) r12     // Catch:{ all -> 0x06c6 }
            r14.putDouble(r1, r12)     // Catch:{ all -> 0x06c6 }
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x06c6 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x06c6 }
        L_0x0545:
            boolean r12 = r1.hasNext()     // Catch:{ all -> 0x06c6 }
            if (r12 == 0) goto L_0x0575
            java.lang.Object r12 = r1.next()     // Catch:{ all -> 0x06c6 }
            r13 = r12
            android.util.Size r13 = (android.util.Size) r13     // Catch:{ all -> 0x06c6 }
            r43 = r1
            int r1 = r13.getWidth()     // Catch:{ all -> 0x06c6 }
            r47 = r7
            int r7 = r6.getWidth()     // Catch:{ all -> 0x06c6 }
            if (r1 > r7) goto L_0x056c
            int r1 = r13.getHeight()     // Catch:{ all -> 0x06c6 }
            int r7 = r6.getHeight()     // Catch:{ all -> 0x06c6 }
            if (r1 > r7) goto L_0x056c
            r1 = 1
            goto L_0x056d
        L_0x056c:
            r1 = 0
        L_0x056d:
            if (r1 == 0) goto L_0x0570
            goto L_0x0578
        L_0x0570:
            r1 = r43
            r7 = r47
            goto L_0x0545
        L_0x0575:
            r47 = r7
            r12 = 0
        L_0x0578:
            android.util.Size r12 = (android.util.Size) r12     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r1)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "videoHeight"
            if (r12 == 0) goto L_0x058d
            int r6 = r12.getHeight()     // Catch:{ all -> 0x06c6 }
            double r6 = (double) r6     // Catch:{ all -> 0x06c6 }
            java.lang.Double r6 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r6)     // Catch:{ all -> 0x06c6 }
            goto L_0x058e
        L_0x058d:
            r6 = 0
        L_0x058e:
            com.mrousavy.camera.utils.WritableMap_NullablesKt.putDouble(r14, r1, r6)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "videoWidth"
            if (r12 == 0) goto L_0x059f
            int r6 = r12.getWidth()     // Catch:{ all -> 0x06c6 }
            double r6 = (double) r6     // Catch:{ all -> 0x06c6 }
            java.lang.Double r6 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r6)     // Catch:{ all -> 0x06c6 }
            goto L_0x05a0
        L_0x059f:
            r6 = 0
        L_0x05a0:
            com.mrousavy.camera.utils.WritableMap_NullablesKt.putDouble(r14, r1, r6)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "isHighestPhotoQualitySupported"
            if (r8 == 0) goto L_0x05a9
            r6 = 1
            goto L_0x05aa
        L_0x05a9:
            r6 = 0
        L_0x05aa:
            r14.putBoolean(r1, r6)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "maxISO"
            if (r27 == 0) goto L_0x05b8
            java.lang.Comparable r6 = r27.getUpper()     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x06c6 }
            goto L_0x05b9
        L_0x05b8:
            r6 = 0
        L_0x05b9:
            com.mrousavy.camera.utils.WritableMap_NullablesKt.putInt(r14, r1, r6)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "minISO"
            if (r27 == 0) goto L_0x05c7
            java.lang.Comparable r6 = r27.getLower()     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x06c6 }
            goto L_0x05c8
        L_0x05c7:
            r6 = 0
        L_0x05c8:
            com.mrousavy.camera.utils.WritableMap_NullablesKt.putInt(r14, r1, r6)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "fieldOfView"
            r14.putDouble(r1, r10)     // Catch:{ all -> 0x06c6 }
            if (r0 == 0) goto L_0x05df
            java.lang.Comparable r1 = r0.getUpper()     // Catch:{ all -> 0x06c6 }
            java.lang.Float r1 = (java.lang.Float) r1     // Catch:{ all -> 0x06c6 }
            if (r1 == 0) goto L_0x05df
            float r1 = r1.floatValue()     // Catch:{ all -> 0x06c6 }
            goto L_0x05e1
        L_0x05df:
            r1 = r32
        L_0x05e1:
            double r6 = (double) r1     // Catch:{ all -> 0x06c6 }
            r14.putDouble(r2, r6)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "colorSpaces"
            com.facebook.react.bridge.ReadableArray r5 = (com.facebook.react.bridge.ReadableArray) r5     // Catch:{ all -> 0x06c6 }
            r14.putArray(r1, r5)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "supportsVideoHDR"
            r6 = 0
            r14.putBoolean(r1, r6)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "supportsPhotoHDR"
            if (r16 == 0) goto L_0x05f8
            r5 = 1
            goto L_0x05f9
        L_0x05f8:
            r5 = r6
        L_0x05f9:
            r14.putBoolean(r1, r5)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "frameRateRanges"
            com.facebook.react.bridge.ReadableArray r3 = (com.facebook.react.bridge.ReadableArray) r3     // Catch:{ all -> 0x06c6 }
            r14.putArray(r1, r3)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "autoFocusSystem"
            java.lang.String r3 = "none"
            r14.putString(r1, r3)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "videoStabilizationModes"
            com.facebook.react.bridge.ReadableArray r9 = (com.facebook.react.bridge.ReadableArray) r9     // Catch:{ all -> 0x06c6 }
            r14.putArray(r1, r9)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = "pixelFormat"
            r3 = r29
            r14.putString(r1, r3)     // Catch:{ all -> 0x06c6 }
            com.facebook.react.bridge.ReadableMap r14 = (com.facebook.react.bridge.ReadableMap) r14     // Catch:{ all -> 0x06c6 }
            r4.pushMap(r14)     // Catch:{ all -> 0x06c6 }
            int r9 = r46 + 1
            r29 = r15
            r1 = r20
            r3 = r25
            r8 = r36
            r6 = r37
            r12 = r38
            r13 = r39
            r5 = r40
            r15 = r41
            r14 = r42
            r25 = r44
            r20 = r45
            r7 = r47
            goto L_0x040f
        L_0x063b:
            r40 = r5
            r47 = r7
            r38 = r12
            r39 = r13
            r42 = r14
            r45 = r20
            r44 = r25
            r15 = r29
            r6 = 0
            r34 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r25 = r3
            int r13 = r39 + 1
            r8 = r17
            r6 = r26
            r9 = r30
            r1 = r32
            r25 = r44
            goto L_0x03f2
        L_0x065e:
            r26 = r6
            r17 = r8
            r42 = r14
            r6 = 0
            java.lang.String r0 = "formats"
            com.facebook.react.bridge.ReadableArray r4 = (com.facebook.react.bridge.ReadableArray) r4     // Catch:{ all -> 0x06c6 }
            r1 = r42
            r1.putArray(r0, r4)     // Catch:{ all -> 0x06c6 }
            r14 = r1
            com.facebook.react.bridge.ReadableMap r14 = (com.facebook.react.bridge.ReadableMap) r14     // Catch:{ all -> 0x06c6 }
            r3 = r24
            r3.pushMap(r14)     // Catch:{ all -> 0x06c6 }
            r1 = r49
            r11 = r3
            r8 = r17
            r5 = r18
            r9 = r19
            r10 = r21
            r2 = r22
            r0 = r26
            r4 = r31
            r7 = r33
            goto L_0x012d
        L_0x068b:
            r44 = r25
            r34 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x03c6
        L_0x0691:
            r0 = move-exception
            r21 = r10
            goto L_0x06d1
        L_0x0695:
            r22 = r2
            r21 = r10
            r3 = r11
            r44 = r12
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x06c6 }
            long r0 = r0 - r22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x06c6 }
            r2.<init>()     // Catch:{ all -> 0x06c6 }
            java.lang.String r4 = "CameraViewModule::getAvailableCameraDevices took: "
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ all -> 0x06c6 }
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch:{ all -> 0x06c6 }
            java.lang.String r1 = " ms"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x06c6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x06c6 }
            r1 = r44
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x06c6 }
            r10 = r21
            r10.resolve(r3)     // Catch:{ all -> 0x06d0 }
            goto L_0x070d
        L_0x06c6:
            r0 = move-exception
            r10 = r21
            goto L_0x06d1
        L_0x06ca:
            com.mrousavy.camera.CameraManagerUnavailableError r0 = new com.mrousavy.camera.CameraManagerUnavailableError     // Catch:{ all -> 0x06d0 }
            r0.<init>()     // Catch:{ all -> 0x06d0 }
            throw r0     // Catch:{ all -> 0x06d0 }
        L_0x06d0:
            r0 = move-exception
        L_0x06d1:
            r0.printStackTrace()
            boolean r1 = r0 instanceof com.mrousavy.camera.CameraError
            if (r1 == 0) goto L_0x06db
            com.mrousavy.camera.CameraError r0 = (com.mrousavy.camera.CameraError) r0
            goto L_0x06e3
        L_0x06db:
            com.mrousavy.camera.UnknownCameraError r1 = new com.mrousavy.camera.UnknownCameraError
            r1.<init>(r0)
            r0 = r1
            com.mrousavy.camera.CameraError r0 = (com.mrousavy.camera.CameraError) r0
        L_0x06e3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.getDomain()
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 47
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r0.getId()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r0.getMessage()
            java.lang.Throwable r0 = r0.getCause()
            r10.reject((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x070d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule$getAvailableCameraDevices$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
