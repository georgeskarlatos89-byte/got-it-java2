package com.mrousavy.camera.frameprocessor;

import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH J\t\u0010\u0017\u001a\u00020\u0018H J\t\u0010\u0019\u001a\u00020\u0018H J\u0011\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH J\b\u0010\u001d\u001a\u00020\u0018H\u0007R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;", "", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "frameProcessorThread", "Ljava/util/concurrent/ExecutorService;", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/concurrent/ExecutorService;)V", "mContext", "Ljava/lang/ref/WeakReference;", "mHybridData", "Lcom/facebook/jni/HybridData;", "mScheduler", "Lcom/mrousavy/camera/frameprocessor/VisionCameraScheduler;", "findCameraViewById", "Lcom/mrousavy/camera/CameraView;", "viewId", "", "initHybrid", "jsContext", "", "jsCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "scheduler", "initializeRuntime", "", "installJSIBindings", "registerPlugin", "plugin", "Lcom/mrousavy/camera/frameprocessor/FrameProcessorPlugin;", "registerPlugins", "Companion", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FrameProcessorRuntimeManager.kt */
public final class FrameProcessorRuntimeManager {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final ArrayList<FrameProcessorPlugin> Plugins = new ArrayList<>();
    public static final String TAG = "FrameProcessorRuntime";
    /* access modifiers changed from: private */
    public static boolean enableFrameProcessors;
    private WeakReference<ReactApplicationContext> mContext;
    private HybridData mHybridData;
    private VisionCameraScheduler mScheduler;

    private final native HybridData initHybrid(long j, CallInvokerHolderImpl callInvokerHolderImpl, VisionCameraScheduler visionCameraScheduler);

    private final native void initializeRuntime();

    private final native void installJSIBindings();

    private final native void registerPlugin(FrameProcessorPlugin frameProcessorPlugin);

    public FrameProcessorRuntimeManager(ReactApplicationContext reactApplicationContext, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "context");
        Intrinsics.checkNotNullParameter(executorService, "frameProcessorThread");
        if (enableFrameProcessors) {
            CallInvokerHolder jSCallInvokerHolder = reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
            Intrinsics.checkNotNull(jSCallInvokerHolder, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.CallInvokerHolderImpl");
            this.mScheduler = new VisionCameraScheduler(executorService);
            this.mContext = new WeakReference<>(reactApplicationContext);
            long j = reactApplicationContext.getJavaScriptContextHolder().get();
            VisionCameraScheduler visionCameraScheduler = this.mScheduler;
            Intrinsics.checkNotNull(visionCameraScheduler);
            this.mHybridData = initHybrid(j, (CallInvokerHolderImpl) jSCallInvokerHolder, visionCameraScheduler);
            initializeRuntime();
            Log.i(TAG, "Installing JSI Bindings on JS Thread...");
            reactApplicationContext.runOnJSQueueThread(new FrameProcessorRuntimeManager$$ExternalSyntheticLambda0(this));
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager$Companion;", "", "()V", "Plugins", "Ljava/util/ArrayList;", "Lcom/mrousavy/camera/frameprocessor/FrameProcessorPlugin;", "Lkotlin/collections/ArrayList;", "getPlugins", "()Ljava/util/ArrayList;", "TAG", "", "enableFrameProcessors", "", "getEnableFrameProcessors", "()Z", "setEnableFrameProcessors", "(Z)V", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FrameProcessorRuntimeManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ArrayList<FrameProcessorPlugin> getPlugins() {
            return FrameProcessorRuntimeManager.Plugins;
        }

        public final boolean getEnableFrameProcessors() {
            return FrameProcessorRuntimeManager.enableFrameProcessors;
        }

        public final void setEnableFrameProcessors(boolean z) {
            FrameProcessorRuntimeManager.enableFrameProcessors = z;
        }
    }

    static {
        enableFrameProcessors = true;
        try {
            System.loadLibrary("reanimated");
            System.loadLibrary("VisionCamera");
        } catch (UnsatisfiedLinkError unused) {
            Log.w(TAG, "Failed to load Reanimated/VisionCamera C++ library. Frame Processors are disabled!");
            enableFrameProcessors = false;
        }
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(FrameProcessorRuntimeManager frameProcessorRuntimeManager) {
        Intrinsics.checkNotNullParameter(frameProcessorRuntimeManager, "this$0");
        frameProcessorRuntimeManager.installJSIBindings();
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mrousavy.camera.CameraView findCameraViewById(int r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Finding view "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FrameProcessorRuntime"
            android.util.Log.d(r1, r0)
            java.lang.ref.WeakReference<com.facebook.react.bridge.ReactApplicationContext> r0 = r5.mContext
            r2 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r0.get()
            com.facebook.react.bridge.ReactApplicationContext r0 = (com.facebook.react.bridge.ReactApplicationContext) r0
            goto L_0x0027
        L_0x0026:
            r0 = r2
        L_0x0027:
            if (r0 == 0) goto L_0x0037
            com.facebook.react.bridge.ReactContext r0 = (com.facebook.react.bridge.ReactContext) r0
            com.facebook.react.bridge.UIManager r0 = com.facebook.react.uimanager.UIManagerHelper.getUIManager(r0, r6)
            if (r0 == 0) goto L_0x0035
            android.view.View r2 = r0.resolveView(r6)
        L_0x0035:
            com.mrousavy.camera.CameraView r2 = (com.mrousavy.camera.CameraView) r2
        L_0x0037:
            r0 = 33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r2 == 0) goto L_0x0043
            java.lang.String r4 = "Found view "
            r3.<init>(r4)
            goto L_0x0048
        L_0x0043:
            java.lang.String r4 = "Couldn't find view "
            r3.<init>(r4)
        L_0x0048:
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
            if (r2 == 0) goto L_0x005a
            return r2
        L_0x005a:
            com.mrousavy.camera.ViewNotFoundError r0 = new com.mrousavy.camera.ViewNotFoundError
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.frameprocessor.FrameProcessorRuntimeManager.findCameraViewById(int):com.mrousavy.camera.CameraView");
    }

    public final void registerPlugins() {
        Log.i(TAG, "Installing Frame Processor Plugins...");
        for (FrameProcessorPlugin registerPlugin : Plugins) {
            registerPlugin(registerPlugin);
        }
        Log.i(TAG, "Successfully installed " + Plugins.size() + " Frame Processor Plugins!");
    }
}
