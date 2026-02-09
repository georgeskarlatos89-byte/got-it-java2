package com.mrousavy.camera;

import android.content.Context;
import android.util.Log;
import co.gotitapp.android.modules.country.CountryPickerActivity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001a\u0010\u0007\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t\u001a\n\u0010\u000b\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\f\u001a\u00020\u0005*\u00020\u0006¨\u0006\r"}, d2 = {"errorToMap", "Lcom/facebook/react/bridge/WritableMap;", "error", "", "invokeOnError", "", "Lcom/mrousavy/camera/CameraView;", "invokeOnFrameProcessorPerformanceSuggestionAvailable", "currentFps", "", "suggestedFps", "invokeOnInitialized", "invokeOnViewReady", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CameraView+Events.kt */
public final class CameraView_EventsKt {
    public static final void invokeOnInitialized(CameraView cameraView) {
        Intrinsics.checkNotNullParameter(cameraView, "<this>");
        Log.i("CameraView", "invokeOnInitialized()");
        Context context = cameraView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(cameraView.getId(), "cameraInitialized", (WritableMap) null);
    }

    public static final void invokeOnError(CameraView cameraView, Throwable th) {
        CameraError cameraError;
        Intrinsics.checkNotNullParameter(cameraView, "<this>");
        Intrinsics.checkNotNullParameter(th, "error");
        Log.e("CameraView", "invokeOnError(...):");
        th.printStackTrace();
        if (th instanceof CameraError) {
            cameraError = (CameraError) th;
        } else {
            cameraError = new UnknownCameraError(th);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString(CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA, ErrorsKt.getCode(cameraError));
        createMap.putString("message", cameraError.getMessage());
        Throwable cause = cameraError.getCause();
        if (cause != null) {
            createMap.putMap("cause", errorToMap(cause));
        }
        Context context = cameraView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(cameraView.getId(), "cameraError", createMap);
    }

    public static final void invokeOnFrameProcessorPerformanceSuggestionAvailable(CameraView cameraView, double d, double d2) {
        Intrinsics.checkNotNullParameter(cameraView, "<this>");
        Log.e("CameraView", "invokeOnFrameProcessorPerformanceSuggestionAvailable(suggestedFps: " + d2 + "):");
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", d2 > d ? "can-use-higher-fps" : "should-use-lower-fps");
        createMap.putDouble("suggestedFrameProcessorFps", d2);
        Context context = cameraView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(cameraView.getId(), "cameraPerformanceSuggestionAvailable", createMap);
    }

    public static final void invokeOnViewReady(CameraView cameraView) {
        Intrinsics.checkNotNullParameter(cameraView, "<this>");
        WritableMap createMap = Arguments.createMap();
        Context context = cameraView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(cameraView.getId(), "cameraViewReady", createMap);
    }

    private static final WritableMap errorToMap(Throwable th) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", th.getMessage());
        createMap.putString("stacktrace", ExceptionsKt.stackTraceToString(th));
        Throwable cause = th.getCause();
        if (cause != null) {
            createMap.putMap("cause", errorToMap(cause));
        }
        Intrinsics.checkNotNullExpressionValue(createMap, "map");
        return createMap;
    }
}
