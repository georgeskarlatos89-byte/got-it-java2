package com.mrousavy.camera;

import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.mrousavy.camera.CameraView_FocusKt", f = "CameraView+Focus.kt", i = {0}, l = {20, 28}, m = "focus", n = {"cameraControl"}, s = {"L$0"})
/* compiled from: CameraView+Focus.kt */
final class CameraView_FocusKt$focus$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    CameraView_FocusKt$focus$1(Continuation<? super CameraView_FocusKt$focus$1> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CameraView_FocusKt.focus((CameraView) null, (ReadableMap) null, this);
    }
}
