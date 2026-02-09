package com.mrousavy.camera;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"takePhoto", "Lcom/facebook/react/bridge/WritableMap;", "Lcom/mrousavy/camera/CameraView;", "options", "Lcom/facebook/react/bridge/ReadableMap;", "(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CameraView+TakePhoto.kt */
public final class CameraView_TakePhotoKt {
    public static final Object takePhoto(CameraView cameraView, ReadableMap readableMap, Continuation<? super WritableMap> continuation) {
        return CoroutineScopeKt.coroutineScope(new CameraView_TakePhotoKt$takePhoto$2(cameraView, readableMap, (Continuation<? super CameraView_TakePhotoKt$takePhoto$2>) null), continuation);
    }
}
