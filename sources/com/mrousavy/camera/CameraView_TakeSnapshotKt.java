package com.mrousavy.camera;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"takeSnapshot", "Lcom/facebook/react/bridge/WritableMap;", "Lcom/mrousavy/camera/CameraView;", "options", "Lcom/facebook/react/bridge/ReadableMap;", "(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CameraView+TakeSnapshot.kt */
public final class CameraView_TakeSnapshotKt {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object takeSnapshot(com.mrousavy.camera.CameraView r4, com.facebook.react.bridge.ReadableMap r5, kotlin.coroutines.Continuation<? super com.facebook.react.bridge.WritableMap> r6) {
        /*
            boolean r0 = r6 instanceof com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$1
            if (r0 == 0) goto L_0x0014
            r0 = r6
            com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$1 r0 = (com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$1 r0 = new com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$1
            r0.<init>(r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0046
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r6)
            com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2 r6 = new com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r6, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            java.lang.String r4 = "CameraView.takeSnapshot(…orch == \"on\")\n    }\n  }\n}"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView_TakeSnapshotKt.takeSnapshot(com.mrousavy.camera.CameraView, com.facebook.react.bridge.ReadableMap, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
