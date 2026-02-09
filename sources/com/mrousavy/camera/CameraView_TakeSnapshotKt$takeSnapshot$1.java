package com.mrousavy.camera;

import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraView_TakeSnapshotKt", f = "CameraView+TakeSnapshot.kt", i = {}, l = {16}, m = "takeSnapshot", n = {}, s = {})
/* compiled from: CameraView+TakeSnapshot.kt */
final class CameraView_TakeSnapshotKt$takeSnapshot$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    CameraView_TakeSnapshotKt$takeSnapshot$1(Continuation<? super CameraView_TakeSnapshotKt$takeSnapshot$1> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CameraView_TakeSnapshotKt.takeSnapshot((CameraView) null, (ReadableMap) null, this);
    }
}
