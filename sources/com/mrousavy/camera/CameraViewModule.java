package com.mrousavy.camera;

import android.app.Activity;
import androidx.core.content.ContextCompat;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.mrousavy.camera.frameprocessor.FrameProcessorRuntimeManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J\u0018\u0010#\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J \u0010'\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0007J\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J \u0010,\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J \u0010-\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006/"}, d2 = {"Lcom/mrousavy/camera/CameraViewModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "frameProcessorManager", "Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;", "frameProcessorThread", "Ljava/util/concurrent/ExecutorService;", "getFrameProcessorThread", "()Ljava/util/concurrent/ExecutorService;", "setFrameProcessorThread", "(Ljava/util/concurrent/ExecutorService;)V", "cleanup", "", "findCameraView", "Lcom/mrousavy/camera/CameraView;", "viewId", "", "focus", "viewTag", "point", "Lcom/facebook/react/bridge/ReadableMap;", "promise", "Lcom/facebook/react/bridge/Promise;", "getAvailableCameraDevices", "getCameraPermissionStatus", "getMicrophonePermissionStatus", "getName", "", "initialize", "invalidate", "onCatalystInstanceDestroy", "pauseRecording", "requestCameraPermission", "requestMicrophonePermission", "resumeRecording", "startRecording", "options", "onRecordCallback", "Lcom/facebook/react/bridge/Callback;", "stopRecording", "takePhoto", "takeSnapshot", "Companion", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ReactModule(name = "CameraView")
/* compiled from: CameraViewModule.kt */
public final class CameraViewModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static int RequestCode = 10;
    public static final String TAG = "CameraView";
    private final CoroutineScope coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());
    private FrameProcessorRuntimeManager frameProcessorManager;
    private ExecutorService frameProcessorThread;

    public String getName() {
        return "CameraView";
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/mrousavy/camera/CameraViewModule$Companion;", "", "()V", "RequestCode", "", "getRequestCode", "()I", "setRequestCode", "(I)V", "TAG", "", "parsePermissionStatus", "status", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: CameraViewModule.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String parsePermissionStatus(int i) {
            return i != -1 ? i != 0 ? "not-determined" : "authorized" : "denied";
        }

        private Companion() {
        }

        public final int getRequestCode() {
            return CameraViewModule.RequestCode;
        }

        public final void setRequestCode(int i) {
            CameraViewModule.RequestCode = i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactContext");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.frameProcessorThread = newSingleThreadExecutor;
    }

    public final ExecutorService getFrameProcessorThread() {
        return this.frameProcessorThread;
    }

    public final void setFrameProcessorThread(ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "<set-?>");
        this.frameProcessorThread = executorService;
    }

    private final void cleanup() {
        if (CoroutineScopeKt.isActive(this.coroutineScope)) {
            CoroutineScopeKt.cancel$default(this.coroutineScope, "CameraViewModule has been destroyed.", (Throwable) null, 2, (Object) null);
        }
        this.frameProcessorManager = null;
    }

    public void initialize() {
        super.initialize();
        if (this.frameProcessorManager == null) {
            this.frameProcessorThread.execute(new CameraViewModule$$ExternalSyntheticLambda2(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void initialize$lambda$0(CameraViewModule cameraViewModule) {
        Intrinsics.checkNotNullParameter(cameraViewModule, "this$0");
        ReactApplicationContext reactApplicationContext = cameraViewModule.getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "reactApplicationContext");
        cameraViewModule.frameProcessorManager = new FrameProcessorRuntimeManager(reactApplicationContext, cameraViewModule.frameProcessorThread);
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        cleanup();
    }

    public void invalidate() {
        super.invalidate();
        cleanup();
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.view.View] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mrousavy.camera.CameraView findCameraView(int r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Finding view "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CameraView"
            android.util.Log.d(r1, r0)
            com.facebook.react.bridge.ReactApplicationContext r0 = r5.getReactApplicationContext()
            r2 = 0
            if (r0 == 0) goto L_0x0033
            com.facebook.react.bridge.ReactApplicationContext r0 = r5.getReactApplicationContext()
            com.facebook.react.bridge.ReactContext r0 = (com.facebook.react.bridge.ReactContext) r0
            com.facebook.react.bridge.UIManager r0 = com.facebook.react.uimanager.UIManagerHelper.getUIManager(r0, r6)
            if (r0 == 0) goto L_0x0031
            android.view.View r2 = r0.resolveView(r6)
        L_0x0031:
            com.mrousavy.camera.CameraView r2 = (com.mrousavy.camera.CameraView) r2
        L_0x0033:
            com.facebook.react.bridge.ReactApplicationContext r0 = r5.getReactApplicationContext()
            r3 = 33
            if (r0 == 0) goto L_0x0043
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Found view "
            r0.<init>(r4)
            goto L_0x004a
        L_0x0043:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Couldn't find view "
            r0.<init>(r4)
        L_0x004a:
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
            if (r2 == 0) goto L_0x005c
            return r2
        L_0x005c:
            com.mrousavy.camera.ViewNotFoundError r0 = new com.mrousavy.camera.ViewNotFoundError
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule.findCameraView(int):com.mrousavy.camera.CameraView");
    }

    @ReactMethod
    public final void takePhoto(int i, ReadableMap readableMap, Promise promise) {
        Intrinsics.checkNotNullParameter(readableMap, "options");
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CameraViewModule$takePhoto$1(promise, this, i, readableMap, (Continuation<? super CameraViewModule$takePhoto$1>) null), 3, (Object) null);
    }

    @ReactMethod
    public final void takeSnapshot(int i, ReadableMap readableMap, Promise promise) {
        Intrinsics.checkNotNullParameter(readableMap, "options");
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CameraViewModule$takeSnapshot$1(promise, this, i, readableMap, (Continuation<? super CameraViewModule$takeSnapshot$1>) null), 3, (Object) null);
    }

    @ReactMethod
    public final void startRecording(int i, ReadableMap readableMap, Callback callback) {
        Intrinsics.checkNotNullParameter(readableMap, "options");
        Intrinsics.checkNotNullParameter(callback, "onRecordCallback");
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CameraViewModule$startRecording$1(this, i, readableMap, callback, (Continuation<? super CameraViewModule$startRecording$1>) null), 3, (Object) null);
    }

    @ReactMethod
    public final void pauseRecording(int i, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            CameraView_RecordVideoKt.pauseRecording(findCameraView(i));
            promise.resolve((Object) null);
        } catch (Throwable th) {
            th.printStackTrace();
            CameraError unknownCameraError = th instanceof CameraError ? th : new UnknownCameraError(th);
            promise.reject(unknownCameraError.getDomain() + '/' + unknownCameraError.getId(), unknownCameraError.getMessage(), unknownCameraError.getCause());
        }
    }

    @ReactMethod
    public final void resumeRecording(int i, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            CameraView_RecordVideoKt.resumeRecording(findCameraView(i));
            promise.resolve((Object) null);
        } catch (Throwable th) {
            th.printStackTrace();
            CameraError unknownCameraError = th instanceof CameraError ? th : new UnknownCameraError(th);
            promise.reject(unknownCameraError.getDomain() + '/' + unknownCameraError.getId(), unknownCameraError.getMessage(), unknownCameraError.getCause());
        }
    }

    @ReactMethod
    public final void stopRecording(int i, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            CameraView_RecordVideoKt.stopRecording(findCameraView(i));
            promise.resolve((Object) null);
        } catch (Throwable th) {
            th.printStackTrace();
            CameraError unknownCameraError = th instanceof CameraError ? th : new UnknownCameraError(th);
            promise.reject(unknownCameraError.getDomain() + '/' + unknownCameraError.getId(), unknownCameraError.getMessage(), unknownCameraError.getCause());
        }
    }

    @ReactMethod
    public final void focus(int i, ReadableMap readableMap, Promise promise) {
        Intrinsics.checkNotNullParameter(readableMap, "point");
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CameraViewModule$focus$1(promise, this, i, readableMap, (Continuation<? super CameraViewModule$focus$1>) null), 3, (Object) null);
    }

    @ReactMethod
    public final void getAvailableCameraDevices(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        long currentTimeMillis = System.currentTimeMillis();
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CameraViewModule$getAvailableCameraDevices$1(promise, this, currentTimeMillis, (Continuation<? super CameraViewModule$getAvailableCameraDevices$1>) null), 3, (Object) null);
    }

    @ReactMethod
    public final void getCameraPermissionStatus(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        promise.resolve(Companion.parsePermissionStatus(ContextCompat.checkSelfPermission(getReactApplicationContext(), "android.permission.CAMERA")));
    }

    @ReactMethod
    public final void getMicrophonePermissionStatus(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        promise.resolve(Companion.parsePermissionStatus(ContextCompat.checkSelfPermission(getReactApplicationContext(), "android.permission.RECORD_AUDIO")));
    }

    @ReactMethod
    public final void requestCameraPermission(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity instanceof PermissionAwareActivity) {
            int i = RequestCode;
            RequestCode = i + 1;
            ((PermissionAwareActivity) currentActivity).requestPermissions(new String[]{"android.permission.CAMERA"}, i, new CameraViewModule$$ExternalSyntheticLambda0(i, promise));
            return;
        }
        promise.reject("NO_ACTIVITY", "No PermissionAwareActivity was found! Make sure the app has launched before calling this function.");
    }

    /* access modifiers changed from: private */
    public static final boolean requestCameraPermission$lambda$4(int i, Promise promise, int i2, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(strArr, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        if (i2 != i) {
            return false;
        }
        promise.resolve(Companion.parsePermissionStatus((iArr.length == 0) ^ true ? iArr[0] : -1));
        return true;
    }

    @ReactMethod
    public final void requestMicrophonePermission(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity instanceof PermissionAwareActivity) {
            int i = RequestCode;
            RequestCode = i + 1;
            ((PermissionAwareActivity) currentActivity).requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, i, new CameraViewModule$$ExternalSyntheticLambda1(i, promise));
            return;
        }
        promise.reject("NO_ACTIVITY", "No PermissionAwareActivity was found! Make sure the app has launched before calling this function.");
    }

    /* access modifiers changed from: private */
    public static final boolean requestMicrophonePermission$lambda$5(int i, Promise promise, int i2, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(strArr, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        if (i2 != i) {
            return false;
        }
        promise.resolve(Companion.parsePermissionStatus((iArr.length == 0) ^ true ? iArr[0] : -1));
        return true;
    }
}
