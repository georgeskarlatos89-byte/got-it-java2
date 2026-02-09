package com.mrousavy.camera;

import androidx.camera.core.CameraSelector;
import androidx.camera.lifecycle.ProcessCameraProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@"}, d2 = {"<anonymous>", "", "extension", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraView$configureSession$tryEnableExtension$1", f = "CameraView.kt", i = {0}, l = {377}, m = "invokeSuspend", n = {"extension"}, s = {"I$0"})
/* compiled from: CameraView.kt */
final class CameraView$configureSession$tryEnableExtension$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProcessCameraProvider $cameraProvider;
    final /* synthetic */ Ref.ObjectRef<CameraSelector> $cameraSelector;
    /* synthetic */ int I$0;
    Object L$0;
    int label;
    final /* synthetic */ CameraView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CameraView$configureSession$tryEnableExtension$1(CameraView cameraView, ProcessCameraProvider processCameraProvider, Ref.ObjectRef<CameraSelector> objectRef, Continuation<? super CameraView$configureSession$tryEnableExtension$1> continuation) {
        super(2, continuation);
        this.this$0 = cameraView;
        this.$cameraProvider = processCameraProvider;
        this.$cameraSelector = objectRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CameraView$configureSession$tryEnableExtension$1 cameraView$configureSession$tryEnableExtension$1 = new CameraView$configureSession$tryEnableExtension$1(this.this$0, this.$cameraProvider, this.$cameraSelector, continuation);
        cameraView$configureSession$tryEnableExtension$1.I$0 = ((Number) obj).intValue();
        return cameraView$configureSession$tryEnableExtension$1;
    }

    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((CameraView$configureSession$tryEnableExtension$1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) (Continuation) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            java.lang.String r3 = "CameraView"
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            int r0 = r6.I$0
            java.lang.Object r1 = r6.L$0
            com.mrousavy.camera.CameraView r1 = (com.mrousavy.camera.CameraView) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0056
        L_0x0017:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r7)
            int r7 = r6.I$0
            com.mrousavy.camera.CameraView r1 = r6.this$0
            androidx.camera.extensions.ExtensionsManager r1 = r1.extensionsManager
            if (r1 != 0) goto L_0x005c
            java.lang.String r1 = "Initializing ExtensionsManager..."
            android.util.Log.i(r3, r1)
            com.mrousavy.camera.CameraView r1 = r6.this$0
            android.content.Context r4 = r1.getContext()
            androidx.camera.lifecycle.ProcessCameraProvider r5 = r6.$cameraProvider
            androidx.camera.core.CameraProvider r5 = (androidx.camera.core.CameraProvider) r5
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.camera.extensions.ExtensionsManager.getInstanceAsync(r4, r5)
            java.lang.String r5 = "getInstanceAsync(context, cameraProvider)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r5 = r6
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r6.L$0 = r1
            r6.I$0 = r7
            r6.label = r2
            java.lang.Object r2 = kotlinx.coroutines.guava.ListenableFutureKt.await(r4, r5)
            if (r2 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r0 = r7
            r7 = r2
        L_0x0056:
            androidx.camera.extensions.ExtensionsManager r7 = (androidx.camera.extensions.ExtensionsManager) r7
            r1.extensionsManager = r7
            r7 = r0
        L_0x005c:
            com.mrousavy.camera.CameraView r0 = r6.this$0
            androidx.camera.extensions.ExtensionsManager r0 = r0.extensionsManager
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            kotlin.jvm.internal.Ref$ObjectRef<androidx.camera.core.CameraSelector> r1 = r6.$cameraSelector
            T r1 = r1.element
            androidx.camera.core.CameraSelector r1 = (androidx.camera.core.CameraSelector) r1
            boolean r0 = r0.isExtensionAvailable(r1, r7)
            if (r0 == 0) goto L_0x00a8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Enabling extension "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r3, r0)
            kotlin.jvm.internal.Ref$ObjectRef<androidx.camera.core.CameraSelector> r0 = r6.$cameraSelector
            com.mrousavy.camera.CameraView r1 = r6.this$0
            androidx.camera.extensions.ExtensionsManager r1 = r1.extensionsManager
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            kotlin.jvm.internal.Ref$ObjectRef<androidx.camera.core.CameraSelector> r2 = r6.$cameraSelector
            T r2 = r2.element
            androidx.camera.core.CameraSelector r2 = (androidx.camera.core.CameraSelector) r2
            androidx.camera.core.CameraSelector r7 = r1.getExtensionEnabledCameraSelector(r2, r7)
            java.lang.String r1 = "extensionsManager!!.getE…ameraSelector, extension)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            r0.element = r7
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x00a8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Extension "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r1 = " is not available for the given Camera!"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r3, r0)
            r0 = 2
            if (r7 == r0) goto L_0x00ec
            r0 = 3
            if (r7 == r0) goto L_0x00e3
            java.lang.Error r0 = new java.lang.Error
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid extension supplied! Extension "
            r1.<init>(r2)
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r1 = " is not available."
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L_0x00f4
        L_0x00e3:
            com.mrousavy.camera.LowLightBoostNotContainedInFormatError r7 = new com.mrousavy.camera.LowLightBoostNotContainedInFormatError
            r7.<init>()
            r0 = r7
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L_0x00f4
        L_0x00ec:
            com.mrousavy.camera.HdrNotContainedInFormatError r7 = new com.mrousavy.camera.HdrNotContainedInFormatError
            r7.<init>()
            r0 = r7
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L_0x00f4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView$configureSession$tryEnableExtension$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
