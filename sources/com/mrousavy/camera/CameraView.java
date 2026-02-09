package com.mrousavy.camera;

import android.content.Context;
import android.content.res.Configuration;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.Camera;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.extensions.ExtensionsManager;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.brentvatne.react.ReactVideoView;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.mrousavy.camera.frameprocessor.FrameProcessorPerformanceDataCollector;
import com.mrousavy.camera.frameprocessor.FrameProcessorRuntimeManager;
import com.mrousavy.camera.frameprocessor.PerformanceSampleCollection;
import com.mrousavy.camera.utils.Context_displayRotationKt;
import com.mrousavy.camera.utils.ViewGroup_installHierarchyFitterKt;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Á\u00012\u00020\u00012\u00020\u0002:\u0002Á\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010¬\u0001\u001a\u00030­\u0001H@ø\u0001\u0000¢\u0006\u0003\u0010®\u0001J\n\u0010¯\u0001\u001a\u00030­\u0001H\u0002J\u0015\u0010°\u0001\u001a\u00030­\u00012\b\u0010±\u0001\u001a\u00030²\u0001H J\n\u0010³\u0001\u001a\u00030´\u0001H\u0016J\n\u0010µ\u0001\u001a\u00020xH J\n\u0010¶\u0001\u001a\u00030­\u0001H\u0014J\u0016\u0010·\u0001\u001a\u00030­\u00012\n\u0010¸\u0001\u001a\u0005\u0018\u00010¹\u0001H\u0014J\n\u0010º\u0001\u001a\u00030­\u0001H\u0014J\"\u0010»\u0001\u001a\u00020\u00112\u0019\u0010¼\u0001\u001a\u0014\u0012\u0004\u0012\u00020 0½\u0001j\t\u0012\u0004\u0012\u00020 `¾\u0001J\n\u0010¿\u0001\u001a\u00030­\u0001H\u0002J\n\u0010À\u0001\u001a\u00030­\u0001H\u0003R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n \u001e*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001a\u0010(\u001a\u00020)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u001e\u00106\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b7\u0010\u0013\"\u0004\b8\u0010\u0015R\u001a\u00109\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00100\"\u0004\b;\u00102R$\u0010=\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u0011@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00100\"\u0004\b?\u00102R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u00020\u00118AX\u0004¢\u0006\f\u0012\u0004\bC\u0010D\u001a\u0004\bE\u00100R\u001c\u0010F\u001a\u0004\u0018\u00010GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010L\u001a\u0004\u0018\u00010MX\u000e¢\u0006\u0010\n\u0002\u0010R\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010S\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u000e\u0010X\u001a\u00020YX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Z\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b[\u0010\u0013\"\u0004\b\\\u0010\u0015R\u000e\u0010]\u001a\u00020^X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010_\u001a\u0004\u0018\u00010`X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010a\u001a\u0004\u0018\u00010bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0014\u0010g\u001a\u00020M8BX\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001a\u0010j\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u00100\"\u0004\bk\u00102R\u000e\u0010l\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010m\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\bm\u00100R\u000e\u0010n\u001a\u00020oX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020oX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020sX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010t\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\bu\u0010\u0013\"\u0004\bv\u0010\u0015R\u0014\u0010w\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020zX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020zX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010|\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\"\"\u0004\b~\u0010$R\u0015\u0010\u001a\u00020M8BX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010iR!\u0010\u0001\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0012\n\u0002\u0010\u0016\u001a\u0005\b\u0001\u0010\u0013\"\u0005\b\u0001\u0010\u0015R\u0012\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u0001\u001a\u00030\u0001X\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0001\u0010D\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\n \u001e*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u0010\u0010\u0001\u001a\u00030\u0001X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0001\u001a\u00030\u0001X\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0001\u001a\n \u001e*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00020 X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\"\"\u0005\b\u0001\u0010$R\u0010\u0010\u0001\u001a\u00030\u0001X\u0004¢\u0006\u0002\n\u0000R!\u0010\u0001\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0012\n\u0002\u0010\u0016\u001a\u0005\b\u0001\u0010\u0013\"\u0005\b\u0001\u0010\u0015R)\u0010 \u0001\u001a\f\u0012\u0005\u0012\u00030¢\u0001\u0018\u00010¡\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u001f\u0010§\u0001\u001a\u00020zX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006Â\u0001"}, d2 = {"Lcom/mrousavy/camera/CameraView;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/LifecycleOwner;", "context", "Landroid/content/Context;", "frameProcessorThread", "Ljava/util/concurrent/ExecutorService;", "(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V", "activeVideoRecording", "Landroidx/camera/video/Recording;", "getActiveVideoRecording$react_native_vision_camera_release", "()Landroidx/camera/video/Recording;", "setActiveVideoRecording$react_native_vision_camera_release", "(Landroidx/camera/video/Recording;)V", "actualFrameProcessorFps", "", "audio", "", "getAudio", "()Ljava/lang/Boolean;", "setAudio", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "camera", "Landroidx/camera/core/Camera;", "getCamera$react_native_vision_camera_release", "()Landroidx/camera/core/Camera;", "setCamera$react_native_vision_camera_release", "(Landroidx/camera/core/Camera;)V", "cameraExecutor", "kotlin.jvm.PlatformType", "cameraId", "", "getCameraId", "()Ljava/lang/String;", "setCameraId", "(Ljava/lang/String;)V", "colorSpace", "getColorSpace", "setColorSpace", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$react_native_vision_camera_release", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope$react_native_vision_camera_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "enableDepthData", "getEnableDepthData", "()Z", "setEnableDepthData", "(Z)V", "enableFrameProcessor", "getEnableFrameProcessor", "setEnableFrameProcessor", "enableHighQualityPhotos", "getEnableHighQualityPhotos", "setEnableHighQualityPhotos", "enablePortraitEffectsMatteDelivery", "getEnablePortraitEffectsMatteDelivery", "setEnablePortraitEffectsMatteDelivery", "value", "enableZoomGesture", "getEnableZoomGesture", "setEnableZoomGesture", "extensionsManager", "Landroidx/camera/extensions/ExtensionsManager;", "fallbackToSnapshot", "getFallbackToSnapshot$react_native_vision_camera_release$annotations", "()V", "getFallbackToSnapshot$react_native_vision_camera_release", "format", "Lcom/facebook/react/bridge/ReadableMap;", "getFormat", "()Lcom/facebook/react/bridge/ReadableMap;", "setFormat", "(Lcom/facebook/react/bridge/ReadableMap;)V", "fps", "", "getFps", "()Ljava/lang/Integer;", "setFps", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "frameProcessorFps", "getFrameProcessorFps", "()D", "setFrameProcessorFps", "(D)V", "frameProcessorPerformanceDataCollector", "Lcom/mrousavy/camera/frameprocessor/FrameProcessorPerformanceDataCollector;", "hdr", "getHdr", "setHdr", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "imageAnalysis", "Landroidx/camera/core/ImageAnalysis;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "getImageCapture$react_native_vision_camera_release", "()Landroidx/camera/core/ImageCapture;", "setImageCapture$react_native_vision_camera_release", "(Landroidx/camera/core/ImageCapture;)V", "inputRotation", "getInputRotation", "()I", "isActive", "setActive", "isMounted", "isReadyForNewEvaluation", "lastFrameProcessorCall", "", "lastFrameProcessorPerformanceEvaluation", "lastSuggestedFrameProcessorFps", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "lowLightBoost", "getLowLightBoost", "setLowLightBoost", "mHybridData", "Lcom/facebook/jni/HybridData;", "maxZoom", "", "minZoom", "orientation", "getOrientation", "setOrientation", "outputRotation", "getOutputRotation", "photo", "getPhoto", "setPhoto", "preview", "Landroidx/camera/core/Preview;", "previewView", "Landroidx/camera/view/PreviewView;", "getPreviewView$react_native_vision_camera_release$annotations", "getPreviewView$react_native_vision_camera_release", "()Landroidx/camera/view/PreviewView;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "recordVideoExecutor", "getRecordVideoExecutor$react_native_vision_camera_release", "()Ljava/util/concurrent/ExecutorService;", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "scaleGestureListener", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "takePhotoExecutor", "getTakePhotoExecutor$react_native_vision_camera_release", "torch", "getTorch", "setTorch", "touchEventListener", "Landroid/view/View$OnTouchListener;", "video", "getVideo", "setVideo", "videoCapture", "Landroidx/camera/video/VideoCapture;", "Landroidx/camera/video/Recorder;", "getVideoCapture$react_native_vision_camera_release", "()Landroidx/camera/video/VideoCapture;", "setVideoCapture$react_native_vision_camera_release", "(Landroidx/camera/video/VideoCapture;)V", "zoom", "getZoom", "()F", "setZoom", "(F)V", "configureSession", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "evaluateNewPerformanceSamples", "frameProcessorCallback", "frame", "Landroidx/camera/core/ImageProxy;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "initHybrid", "onAttachedToWindow", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDetachedFromWindow", "update", "changedProps", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "updateLifecycleState", "updateOrientation", "Companion", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: CameraView.kt */
public final class CameraView extends FrameLayout implements LifecycleOwner {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "CameraView";
    public static final String TAG_PERF = "CameraView.performance";
    /* access modifiers changed from: private */
    public static final ArrayList<String> arrayListOfZoom = CollectionsKt.arrayListOf("zoom");
    /* access modifiers changed from: private */
    public static final ArrayList<String> propsThatRequireSessionReconfiguration = CollectionsKt.arrayListOf("cameraId", "format", "fps", "hdr", "lowLightBoost", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO, "enableFrameProcessor");
    private Recording activeVideoRecording;
    private double actualFrameProcessorFps = 30.0d;
    private Boolean audio;
    private Camera camera;
    /* access modifiers changed from: private */
    public final ExecutorService cameraExecutor = Executors.newSingleThreadExecutor();
    private String cameraId;
    private String colorSpace;
    private CoroutineScope coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
    private boolean enableDepthData;
    private boolean enableFrameProcessor;
    private Boolean enableHighQualityPhotos;
    private boolean enablePortraitEffectsMatteDelivery;
    private boolean enableZoomGesture;
    /* access modifiers changed from: private */
    public ExtensionsManager extensionsManager;
    private ReadableMap format;
    private Integer fps;
    private double frameProcessorFps = 1.0d;
    private final FrameProcessorPerformanceDataCollector frameProcessorPerformanceDataCollector = new FrameProcessorPerformanceDataCollector();
    private final ExecutorService frameProcessorThread;
    private Boolean hdr;
    /* access modifiers changed from: private */
    public Lifecycle.State hostLifecycleState;
    private ImageAnalysis imageAnalysis;
    private ImageCapture imageCapture;
    private boolean isActive;
    private boolean isMounted;
    private long lastFrameProcessorCall = System.currentTimeMillis();
    private long lastFrameProcessorPerformanceEvaluation = System.currentTimeMillis();
    private double lastSuggestedFrameProcessorFps;
    private final LifecycleRegistry lifecycleRegistry;
    private Boolean lowLightBoost;
    private HybridData mHybridData;
    /* access modifiers changed from: private */
    public float maxZoom = 1.0f;
    /* access modifiers changed from: private */
    public float minZoom = 1.0f;
    private String orientation;
    private Boolean photo;
    private Preview preview;
    private final PreviewView previewView;
    private final ExecutorService recordVideoExecutor = Executors.newSingleThreadExecutor();
    private final ScaleGestureDetector scaleGestureDetector;
    private final ScaleGestureDetector.SimpleOnScaleGestureListener scaleGestureListener;
    private final ExecutorService takePhotoExecutor = Executors.newSingleThreadExecutor();
    private String torch = DebugKt.DEBUG_PROPERTY_VALUE_OFF;
    private final View.OnTouchListener touchEventListener;
    private Boolean video;
    private VideoCapture<Recorder> videoCapture;
    private float zoom = 1.0f;

    private final native void frameProcessorCallback(ImageProxy imageProxy);

    public static /* synthetic */ void getFallbackToSnapshot$react_native_vision_camera_release$annotations() {
    }

    public static /* synthetic */ void getPreviewView$react_native_vision_camera_release$annotations() {
    }

    private final native HybridData initHybrid();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mrousavy/camera/CameraView$Companion;", "", "()V", "TAG", "", "TAG_PERF", "arrayListOfZoom", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "propsThatRequireSessionReconfiguration", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: CameraView.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraView(Context context, ExecutorService executorService) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executorService, "frameProcessorThread");
        this.frameProcessorThread = executorService;
        if (FrameProcessorRuntimeManager.Companion.getEnableFrameProcessors()) {
            this.mHybridData = initHybrid();
        }
        PreviewView previewView2 = new PreviewView(context);
        this.previewView = previewView2;
        previewView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ViewGroup_installHierarchyFitterKt.installHierarchyFitter(previewView2);
        addView(previewView2);
        ScaleGestureDetector.SimpleOnScaleGestureListener r4 = new ScaleGestureDetector.SimpleOnScaleGestureListener(this) {
            final /* synthetic */ CameraView this$0;

            {
                this.this$0 = r1;
            }

            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                Intrinsics.checkNotNullParameter(scaleGestureDetector, "detector");
                CameraView cameraView = this.this$0;
                cameraView.setZoom(Math.max(Math.min(cameraView.getZoom() * scaleGestureDetector.getScaleFactor(), this.this$0.maxZoom), this.this$0.minZoom));
                this.this$0.update(CameraView.arrayListOfZoom);
                return true;
            }
        };
        this.scaleGestureListener = r4;
        this.scaleGestureDetector = new ScaleGestureDetector(context, r4);
        this.touchEventListener = new CameraView$$ExternalSyntheticLambda0(this);
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleRegistry = new LifecycleRegistry(this);
        getReactContext().addLifecycleEventListener(new LifecycleEventListener(this) {
            final /* synthetic */ CameraView this$0;

            {
                this.this$0 = r1;
            }

            public void onHostResume() {
                this.this$0.hostLifecycleState = Lifecycle.State.RESUMED;
                this.this$0.updateLifecycleState();
                this.this$0.update(CameraView.propsThatRequireSessionReconfiguration);
            }

            public void onHostPause() {
                this.this$0.hostLifecycleState = Lifecycle.State.CREATED;
                this.this$0.updateLifecycleState();
            }

            public void onHostDestroy() {
                this.this$0.hostLifecycleState = Lifecycle.State.DESTROYED;
                this.this$0.updateLifecycleState();
                this.this$0.cameraExecutor.shutdown();
                this.this$0.getTakePhotoExecutor$react_native_vision_camera_release().shutdown();
                this.this$0.getRecordVideoExecutor$react_native_vision_camera_release().shutdown();
                this.this$0.getReactContext().removeLifecycleEventListener(this);
            }
        });
    }

    public final String getCameraId() {
        return this.cameraId;
    }

    public final void setCameraId(String str) {
        this.cameraId = str;
    }

    public final boolean getEnableDepthData() {
        return this.enableDepthData;
    }

    public final void setEnableDepthData(boolean z) {
        this.enableDepthData = z;
    }

    public final Boolean getEnableHighQualityPhotos() {
        return this.enableHighQualityPhotos;
    }

    public final void setEnableHighQualityPhotos(Boolean bool) {
        this.enableHighQualityPhotos = bool;
    }

    public final boolean getEnablePortraitEffectsMatteDelivery() {
        return this.enablePortraitEffectsMatteDelivery;
    }

    public final void setEnablePortraitEffectsMatteDelivery(boolean z) {
        this.enablePortraitEffectsMatteDelivery = z;
    }

    public final Boolean getPhoto() {
        return this.photo;
    }

    public final void setPhoto(Boolean bool) {
        this.photo = bool;
    }

    public final Boolean getVideo() {
        return this.video;
    }

    public final void setVideo(Boolean bool) {
        this.video = bool;
    }

    public final Boolean getAudio() {
        return this.audio;
    }

    public final void setAudio(Boolean bool) {
        this.audio = bool;
    }

    public final boolean getEnableFrameProcessor() {
        return this.enableFrameProcessor;
    }

    public final void setEnableFrameProcessor(boolean z) {
        this.enableFrameProcessor = z;
    }

    public final ReadableMap getFormat() {
        return this.format;
    }

    public final void setFormat(ReadableMap readableMap) {
        this.format = readableMap;
    }

    public final Integer getFps() {
        return this.fps;
    }

    public final void setFps(Integer num) {
        this.fps = num;
    }

    public final Boolean getHdr() {
        return this.hdr;
    }

    public final void setHdr(Boolean bool) {
        this.hdr = bool;
    }

    public final String getColorSpace() {
        return this.colorSpace;
    }

    public final void setColorSpace(String str) {
        this.colorSpace = str;
    }

    public final Boolean getLowLightBoost() {
        return this.lowLightBoost;
    }

    public final void setLowLightBoost(Boolean bool) {
        this.lowLightBoost = bool;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final String getTorch() {
        return this.torch;
    }

    public final void setTorch(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.torch = str;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public final void setZoom(float f) {
        this.zoom = f;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final void setOrientation(String str) {
        this.orientation = str;
    }

    public final boolean getEnableZoomGesture() {
        return this.enableZoomGesture;
    }

    public final void setEnableZoomGesture(boolean z) {
        this.enableZoomGesture = z;
        setOnTouchListener(z ? this.touchEventListener : null);
    }

    public final double getFrameProcessorFps() {
        return this.frameProcessorFps;
    }

    public final void setFrameProcessorFps(double d) {
        this.frameProcessorFps = d;
        if (d == -1.0d) {
            d = 30.0d;
        }
        this.actualFrameProcessorFps = d;
        this.lastFrameProcessorPerformanceEvaluation = System.currentTimeMillis();
        this.frameProcessorPerformanceDataCollector.clear();
    }

    /* access modifiers changed from: private */
    public final ReactContext getReactContext() {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (ReactContext) context;
    }

    public final PreviewView getPreviewView$react_native_vision_camera_release() {
        return this.previewView;
    }

    public final ExecutorService getTakePhotoExecutor$react_native_vision_camera_release() {
        return this.takePhotoExecutor;
    }

    public final ExecutorService getRecordVideoExecutor$react_native_vision_camera_release() {
        return this.recordVideoExecutor;
    }

    public final CoroutineScope getCoroutineScope$react_native_vision_camera_release() {
        return this.coroutineScope;
    }

    public final void setCoroutineScope$react_native_vision_camera_release(CoroutineScope coroutineScope2) {
        Intrinsics.checkNotNullParameter(coroutineScope2, "<set-?>");
        this.coroutineScope = coroutineScope2;
    }

    public final Camera getCamera$react_native_vision_camera_release() {
        return this.camera;
    }

    public final void setCamera$react_native_vision_camera_release(Camera camera2) {
        this.camera = camera2;
    }

    public final ImageCapture getImageCapture$react_native_vision_camera_release() {
        return this.imageCapture;
    }

    public final void setImageCapture$react_native_vision_camera_release(ImageCapture imageCapture2) {
        this.imageCapture = imageCapture2;
    }

    public final VideoCapture<Recorder> getVideoCapture$react_native_vision_camera_release() {
        return this.videoCapture;
    }

    public final void setVideoCapture$react_native_vision_camera_release(VideoCapture<Recorder> videoCapture2) {
        this.videoCapture = videoCapture2;
    }

    public final Recording getActiveVideoRecording$react_native_vision_camera_release() {
        return this.activeVideoRecording;
    }

    public final void setActiveVideoRecording$react_native_vision_camera_release(Recording recording) {
        this.activeVideoRecording = recording;
    }

    private final int getInputRotation() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return Context_displayRotationKt.getDisplayRotation(context);
    }

    private final int getOutputRotation() {
        String str = this.orientation;
        if (str == null) {
            return getInputRotation();
        }
        Intrinsics.checkNotNull(str);
        switch (str.hashCode()) {
            case -2022952606:
                if (str.equals("landscapeLeft")) {
                    return 3;
                }
                break;
            case -1090566097:
                if (str.equals("portraitUpsideDown")) {
                    return 2;
                }
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    return 0;
                }
                break;
            case 1718639649:
                if (str.equals("landscapeRight")) {
                    return 1;
                }
                break;
        }
        String str2 = this.orientation;
        Intrinsics.checkNotNull(str2);
        throw new InvalidTypeScriptUnionError(ReactVideoView.EVENT_PROP_ORIENTATION, str2);
    }

    private final boolean isReadyForNewEvaluation() {
        return System.currentTimeMillis() - this.lastFrameProcessorPerformanceEvaluation > 1000;
    }

    public final boolean getFallbackToSnapshot$react_native_vision_camera_release() {
        String str;
        if ((Intrinsics.areEqual((Object) this.video, (Object) true) || this.enableFrameProcessor) && (str = this.cameraId) != null) {
            Object systemService = getReactContext().getSystemService("camera");
            CameraManager cameraManager = systemService instanceof CameraManager ? (CameraManager) systemService : null;
            if (cameraManager != null) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "cameraManger.getCameraCharacteristics(cameraId)");
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
                return Intrinsics.areEqual((Object) this.video, (Object) true) && this.enableFrameProcessor;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final boolean _init_$lambda$2(CameraView cameraView, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(cameraView, "this$0");
        return cameraView.scaleGestureDetector.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateOrientation();
    }

    /* access modifiers changed from: private */
    public final void updateOrientation() {
        Preview preview2 = this.preview;
        if (preview2 != null) {
            preview2.setTargetRotation(getInputRotation());
        }
        ImageCapture imageCapture2 = this.imageCapture;
        if (imageCapture2 != null) {
            imageCapture2.setTargetRotation(getOutputRotation());
        }
        VideoCapture<Recorder> videoCapture2 = this.videoCapture;
        if (videoCapture2 != null) {
            videoCapture2.setTargetRotation(getOutputRotation());
        }
        ImageAnalysis imageAnalysis2 = this.imageAnalysis;
        if (imageAnalysis2 != null) {
            imageAnalysis2.setTargetRotation(getOutputRotation());
        }
    }

    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    /* access modifiers changed from: private */
    public final void updateLifecycleState() {
        Lifecycle.State currentState = this.lifecycleRegistry.getCurrentState();
        Intrinsics.checkNotNullExpressionValue(currentState, "lifecycleRegistry.currentState");
        if (this.hostLifecycleState != Lifecycle.State.RESUMED) {
            this.lifecycleRegistry.setCurrentState(this.hostLifecycleState);
        } else if (!this.isActive || !isAttachedToWindow()) {
            this.lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        } else {
            this.lifecycleRegistry.setCurrentState(Lifecycle.State.RESUMED);
        }
        Log.d("CameraView", "Lifecycle went from " + currentState.name() + " -> " + this.lifecycleRegistry.getCurrentState().name() + " (isActive: " + this.isActive + " | isAttachedToWindow: " + isAttachedToWindow() + ')');
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateLifecycleState();
        if (!this.isMounted) {
            this.isMounted = true;
            CameraView_EventsKt.invokeOnViewReady(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CameraView$onDetachedFromWindow$1(this, (Continuation<? super CameraView$onDetachedFromWindow$1>) null), 3, (Object) null);
        super.onDetachedFromWindow();
        updateLifecycleState();
    }

    public final boolean update(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "changedProps");
        return this.previewView.post(new CameraView$$ExternalSyntheticLambda1(this, arrayList));
    }

    /* access modifiers changed from: private */
    public static final void update$lambda$3(CameraView cameraView, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(cameraView, "this$0");
        Intrinsics.checkNotNullParameter(arrayList, "$changedProps");
        Job unused = BuildersKt__Builders_commonKt.launch$default(cameraView.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CameraView$update$1$1(arrayList, cameraView, (Continuation<? super CameraView$update$1$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [androidx.camera.core.ImageAnalysis, androidx.camera.core.ImageCapture, androidx.camera.video.VideoCapture<androidx.camera.video.Recorder>] */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v80 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02f8 A[Catch:{ all -> 0x0564 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x035d A[Catch:{ all -> 0x0550 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03b7 A[Catch:{ all -> 0x0550 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03e6 A[Catch:{ all -> 0x0550 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0408 A[Catch:{ all -> 0x0550 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0433 A[Catch:{ all -> 0x0562 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0442 A[Catch:{ all -> 0x0562 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0463 A[Catch:{ all -> 0x0562 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04fb A[Catch:{ all -> 0x0562 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0500 A[Catch:{ all -> 0x0562 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0518 A[Catch:{ all -> 0x0562 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0190 A[Catch:{ all -> 0x0564 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b3 A[Catch:{ all -> 0x0564 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object configureSession(kotlin.coroutines.Continuation<? super kotlin.Unit> r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.lang.String r2 = "Using custom format - photo: "
            boolean r3 = r0 instanceof com.mrousavy.camera.CameraView$configureSession$1
            if (r3 == 0) goto L_0x001a
            r3 = r0
            com.mrousavy.camera.CameraView$configureSession$1 r3 = (com.mrousavy.camera.CameraView$configureSession$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L_0x001a
            int r0 = r3.label
            int r0 = r0 - r5
            r3.label = r0
            goto L_0x001f
        L_0x001a:
            com.mrousavy.camera.CameraView$configureSession$1 r3 = new com.mrousavy.camera.CameraView$configureSession$1
            r3.<init>(r1, r0)
        L_0x001f:
            java.lang.Object r0 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.label
            r6 = 3
            r7 = 2
            java.lang.String r9 = "CameraView"
            r10 = 1
            if (r5 == 0) goto L_0x0098
            if (r5 == r10) goto L_0x008c
            if (r5 == r7) goto L_0x0061
            if (r5 != r6) goto L_0x0059
            long r4 = r3.J$0
            java.lang.Object r2 = r3.L$6
            androidx.camera.core.ImageAnalysis$Builder r2 = (androidx.camera.core.ImageAnalysis.Builder) r2
            java.lang.Object r6 = r3.L$5
            androidx.camera.video.Recorder$Builder r6 = (androidx.camera.video.Recorder.Builder) r6
            java.lang.Object r12 = r3.L$4
            androidx.camera.core.ImageCapture$Builder r12 = (androidx.camera.core.ImageCapture.Builder) r12
            java.lang.Object r13 = r3.L$3
            androidx.camera.core.Preview$Builder r13 = (androidx.camera.core.Preview.Builder) r13
            java.lang.Object r14 = r3.L$2
            kotlin.jvm.internal.Ref$ObjectRef r14 = (kotlin.jvm.internal.Ref.ObjectRef) r14
            java.lang.Object r15 = r3.L$1
            androidx.camera.lifecycle.ProcessCameraProvider r15 = (androidx.camera.lifecycle.ProcessCameraProvider) r15
            java.lang.Object r3 = r3.L$0
            com.mrousavy.camera.CameraView r3 = (com.mrousavy.camera.CameraView) r3
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x0564 }
            r18 = r9
            goto L_0x03dc
        L_0x0059:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0061:
            long r12 = r3.J$0
            java.lang.Object r2 = r3.L$7
            androidx.camera.core.ImageAnalysis$Builder r2 = (androidx.camera.core.ImageAnalysis.Builder) r2
            java.lang.Object r5 = r3.L$6
            androidx.camera.video.Recorder$Builder r5 = (androidx.camera.video.Recorder.Builder) r5
            java.lang.Object r14 = r3.L$5
            androidx.camera.core.ImageCapture$Builder r14 = (androidx.camera.core.ImageCapture.Builder) r14
            java.lang.Object r15 = r3.L$4
            androidx.camera.core.Preview$Builder r15 = (androidx.camera.core.Preview.Builder) r15
            java.lang.Object r6 = r3.L$3
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            java.lang.Object r7 = r3.L$2
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r11 = r3.L$1
            androidx.camera.lifecycle.ProcessCameraProvider r11 = (androidx.camera.lifecycle.ProcessCameraProvider) r11
            java.lang.Object r8 = r3.L$0
            com.mrousavy.camera.CameraView r8 = (com.mrousavy.camera.CameraView) r8
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x0564 }
            r0 = r2
            r2 = r4
            r18 = r9
            goto L_0x039e
        L_0x008c:
            long r5 = r3.J$0
            java.lang.Object r7 = r3.L$0
            com.mrousavy.camera.CameraView r7 = (com.mrousavy.camera.CameraView) r7
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x0564 }
            r12 = r5
            r8 = r7
            goto L_0x0109
        L_0x0098:
            kotlin.ResultKt.throwOnFailure(r0)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = "Configuring session..."
            android.util.Log.i(r9, r0)     // Catch:{ all -> 0x0564 }
            android.content.Context r0 = r21.getContext()     // Catch:{ all -> 0x0564 }
            java.lang.String r7 = "android.permission.CAMERA"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r7)     // Catch:{ all -> 0x0564 }
            if (r0 != 0) goto L_0x055b
            java.lang.String r0 = r1.cameraId     // Catch:{ all -> 0x0564 }
            if (r0 == 0) goto L_0x0554
            com.facebook.react.bridge.ReadableMap r0 = r1.format     // Catch:{ all -> 0x0564 }
            java.lang.String r7 = "Configuring session with Camera ID "
            if (r0 == 0) goto L_0x00d3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0564 }
            r0.<init>(r7)     // Catch:{ all -> 0x0564 }
            java.lang.String r7 = r1.cameraId     // Catch:{ all -> 0x0564 }
            java.lang.StringBuilder r0 = r0.append(r7)     // Catch:{ all -> 0x0564 }
            java.lang.String r7 = " and custom format..."
            java.lang.StringBuilder r0 = r0.append(r7)     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0564 }
            android.util.Log.i(r9, r0)     // Catch:{ all -> 0x0564 }
            goto L_0x00eb
        L_0x00d3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0564 }
            r0.<init>(r7)     // Catch:{ all -> 0x0564 }
            java.lang.String r7 = r1.cameraId     // Catch:{ all -> 0x0564 }
            java.lang.StringBuilder r0 = r0.append(r7)     // Catch:{ all -> 0x0564 }
            java.lang.String r7 = " and default format options..."
            java.lang.StringBuilder r0 = r0.append(r7)     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0564 }
            android.util.Log.i(r9, r0)     // Catch:{ all -> 0x0564 }
        L_0x00eb:
            com.facebook.react.bridge.ReactContext r0 = r21.getReactContext()     // Catch:{ all -> 0x0564 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0564 }
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.lifecycle.ProcessCameraProvider.getInstance(r0)     // Catch:{ all -> 0x0564 }
            java.lang.String r7 = "getInstance(reactContext)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)     // Catch:{ all -> 0x0564 }
            r3.L$0 = r1     // Catch:{ all -> 0x0564 }
            r3.J$0 = r5     // Catch:{ all -> 0x0564 }
            r3.label = r10     // Catch:{ all -> 0x0564 }
            java.lang.Object r0 = kotlinx.coroutines.guava.ListenableFutureKt.await(r0, r3)     // Catch:{ all -> 0x0564 }
            if (r0 != r4) goto L_0x0107
            return r4
        L_0x0107:
            r8 = r1
            r12 = r5
        L_0x0109:
            r11 = r0
            androidx.camera.lifecycle.ProcessCameraProvider r11 = (androidx.camera.lifecycle.ProcessCameraProvider) r11     // Catch:{ all -> 0x0564 }
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ all -> 0x0564 }
            r7.<init>()     // Catch:{ all -> 0x0564 }
            androidx.camera.core.CameraSelector$Builder r0 = new androidx.camera.core.CameraSelector$Builder     // Catch:{ all -> 0x0564 }
            r0.<init>()     // Catch:{ all -> 0x0564 }
            java.lang.String r5 = r8.cameraId     // Catch:{ all -> 0x0564 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch:{ all -> 0x0564 }
            androidx.camera.core.CameraSelector$Builder r0 = com.mrousavy.camera.utils.CameraSelector_byIDKt.byID(r0, r5)     // Catch:{ all -> 0x0564 }
            androidx.camera.core.CameraSelector r0 = r0.build()     // Catch:{ all -> 0x0564 }
            java.lang.String r5 = "Builder().byID(cameraId!!).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)     // Catch:{ all -> 0x0564 }
            r7.element = r0     // Catch:{ all -> 0x0564 }
            com.mrousavy.camera.CameraView$configureSession$tryEnableExtension$1 r0 = new com.mrousavy.camera.CameraView$configureSession$tryEnableExtension$1     // Catch:{ all -> 0x0564 }
            r5 = 0
            r0.<init>(r8, r11, r7, r5)     // Catch:{ all -> 0x0564 }
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6     // Catch:{ all -> 0x0564 }
            androidx.camera.core.Preview$Builder r0 = new androidx.camera.core.Preview$Builder     // Catch:{ all -> 0x0564 }
            r0.<init>()     // Catch:{ all -> 0x0564 }
            int r5 = r8.getInputRotation()     // Catch:{ all -> 0x0564 }
            androidx.camera.core.Preview$Builder r15 = r0.setTargetRotation((int) r5)     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = "Builder()\n        .setTa…etRotation(inputRotation)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)     // Catch:{ all -> 0x0564 }
            androidx.camera.core.ImageCapture$Builder r0 = new androidx.camera.core.ImageCapture$Builder     // Catch:{ all -> 0x0564 }
            r0.<init>()     // Catch:{ all -> 0x0564 }
            int r5 = r8.getOutputRotation()     // Catch:{ all -> 0x0564 }
            androidx.camera.core.ImageCapture$Builder r0 = r0.setTargetRotation((int) r5)     // Catch:{ all -> 0x0564 }
            androidx.camera.core.ImageCapture$Builder r14 = r0.setCaptureMode(r10)     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = "Builder()\n        .setTa…RE_MODE_MINIMIZE_LATENCY)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r0)     // Catch:{ all -> 0x0564 }
            androidx.camera.video.Recorder$Builder r0 = new androidx.camera.video.Recorder$Builder     // Catch:{ all -> 0x0564 }
            r0.<init>()     // Catch:{ all -> 0x0564 }
            java.util.concurrent.ExecutorService r5 = r8.cameraExecutor     // Catch:{ all -> 0x0564 }
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5     // Catch:{ all -> 0x0564 }
            androidx.camera.video.Recorder$Builder r5 = r0.setExecutor(r5)     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = "Builder()\n        .setExecutor(cameraExecutor)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch:{ all -> 0x0564 }
            androidx.camera.core.ImageAnalysis$Builder r0 = new androidx.camera.core.ImageAnalysis$Builder     // Catch:{ all -> 0x0564 }
            r0.<init>()     // Catch:{ all -> 0x0564 }
            int r10 = r8.getOutputRotation()     // Catch:{ all -> 0x0564 }
            androidx.camera.core.ImageAnalysis$Builder r0 = r0.setTargetRotation((int) r10)     // Catch:{ all -> 0x0564 }
            r10 = 0
            androidx.camera.core.ImageAnalysis$Builder r0 = r0.setBackpressureStrategy(r10)     // Catch:{ all -> 0x0564 }
            java.util.concurrent.ExecutorService r10 = r8.frameProcessorThread     // Catch:{ all -> 0x0564 }
            java.util.concurrent.Executor r10 = (java.util.concurrent.Executor) r10     // Catch:{ all -> 0x0564 }
            androidx.camera.core.ImageAnalysis$Builder r0 = r0.setBackgroundExecutor((java.util.concurrent.Executor) r10)     // Catch:{ all -> 0x0564 }
            java.lang.String r10 = "Builder()\n        .setTa…tor(frameProcessorThread)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r10)     // Catch:{ all -> 0x0564 }
            com.facebook.react.bridge.ReadableMap r10 = r8.format     // Catch:{ all -> 0x0564 }
            if (r10 != 0) goto L_0x01b3
            java.lang.String r2 = "No custom format has been set, CameraX will automatically determine best configuration..."
            android.util.Log.i(r9, r2)     // Catch:{ all -> 0x0564 }
            androidx.camera.view.PreviewView r2 = r8.previewView     // Catch:{ all -> 0x0564 }
            int r2 = r2.getHeight()     // Catch:{ all -> 0x0564 }
            androidx.camera.view.PreviewView r3 = r8.previewView     // Catch:{ all -> 0x0564 }
            int r3 = r3.getWidth()     // Catch:{ all -> 0x0564 }
            int r2 = com.mrousavy.camera.utils.AspectRatioKt.aspectRatio(r2, r3)     // Catch:{ all -> 0x0564 }
            r15.setTargetAspectRatio((int) r2)     // Catch:{ all -> 0x0564 }
            r14.setTargetAspectRatio((int) r2)     // Catch:{ all -> 0x0564 }
            r0.setTargetAspectRatio((int) r2)     // Catch:{ all -> 0x0564 }
            r18 = r9
            r1 = 0
            goto L_0x03ed
        L_0x01b3:
            com.mrousavy.camera.utils.DeviceFormat r10 = new com.mrousavy.camera.utils.DeviceFormat     // Catch:{ all -> 0x0564 }
            com.facebook.react.bridge.ReadableMap r1 = r8.format     // Catch:{ all -> 0x0564 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ all -> 0x0564 }
            r10.<init>(r1)     // Catch:{ all -> 0x0564 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0564 }
            r1.<init>(r2)     // Catch:{ all -> 0x0564 }
            android.util.Size r2 = r10.getPhotoSize()     // Catch:{ all -> 0x0564 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x0564 }
            java.lang.String r2 = ", video: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x0564 }
            android.util.Size r2 = r10.getVideoSize()     // Catch:{ all -> 0x0564 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x0564 }
            java.lang.String r2 = " @ "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x0564 }
            java.lang.Integer r2 = r8.fps     // Catch:{ all -> 0x0564 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x0564 }
            java.lang.String r2 = " FPS"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x0564 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0564 }
            android.util.Log.i(r9, r1)     // Catch:{ all -> 0x0564 }
            java.lang.Boolean r1 = r8.video     // Catch:{ all -> 0x0564 }
            r16 = r4
            r2 = 1
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)     // Catch:{ all -> 0x0564 }
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x0564 }
            if (r1 == 0) goto L_0x0208
            android.util.Size r1 = r10.getVideoSize()     // Catch:{ all -> 0x0564 }
            r15.setTargetResolution((android.util.Size) r1)     // Catch:{ all -> 0x0564 }
            goto L_0x020f
        L_0x0208:
            android.util.Size r1 = r10.getPhotoSize()     // Catch:{ all -> 0x0564 }
            r15.setTargetResolution((android.util.Size) r1)     // Catch:{ all -> 0x0564 }
        L_0x020f:
            android.util.Size r1 = r10.getPhotoSize()     // Catch:{ all -> 0x0564 }
            r14.setTargetResolution((android.util.Size) r1)     // Catch:{ all -> 0x0564 }
            android.util.Size r1 = r10.getPhotoSize()     // Catch:{ all -> 0x0564 }
            r0.setTargetResolution((android.util.Size) r1)     // Catch:{ all -> 0x0564 }
            android.util.Size r1 = r10.getVideoSize()     // Catch:{ all -> 0x0564 }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x0564 }
            android.util.Size r2 = r10.getVideoSize()     // Catch:{ all -> 0x0564 }
            int r2 = r2.getWidth()     // Catch:{ all -> 0x0564 }
            int r1 = java.lang.Math.min(r1, r2)     // Catch:{ all -> 0x0564 }
            if (r1 < 0) goto L_0x0239
            r2 = 481(0x1e1, float:6.74E-43)
            if (r1 >= r2) goto L_0x0239
            r2 = 1
            goto L_0x023a
        L_0x0239:
            r2 = 0
        L_0x023a:
            if (r2 == 0) goto L_0x0247
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.SD     // Catch:{ all -> 0x0564 }
            androidx.camera.video.QualitySelector r1 = androidx.camera.video.QualitySelector.from(r1)     // Catch:{ all -> 0x0564 }
            r5.setQualitySelector(r1)     // Catch:{ all -> 0x0564 }
            goto L_0x02ba
        L_0x0247:
            r2 = 480(0x1e0, float:6.73E-43)
            if (r2 > r1) goto L_0x0251
            r2 = 721(0x2d1, float:1.01E-42)
            if (r1 >= r2) goto L_0x0251
            r2 = 1
            goto L_0x0252
        L_0x0251:
            r2 = 0
        L_0x0252:
            if (r2 == 0) goto L_0x0264
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.HD     // Catch:{ all -> 0x0564 }
            androidx.camera.video.Quality r2 = androidx.camera.video.Quality.HD     // Catch:{ all -> 0x0564 }
            androidx.camera.video.FallbackStrategy r2 = androidx.camera.video.FallbackStrategy.lowerQualityThan(r2)     // Catch:{ all -> 0x0564 }
            androidx.camera.video.QualitySelector r1 = androidx.camera.video.QualitySelector.from(r1, r2)     // Catch:{ all -> 0x0564 }
            r5.setQualitySelector(r1)     // Catch:{ all -> 0x0564 }
            goto L_0x02ba
        L_0x0264:
            r2 = 720(0x2d0, float:1.009E-42)
            if (r2 > r1) goto L_0x026e
            r2 = 1081(0x439, float:1.515E-42)
            if (r1 >= r2) goto L_0x026e
            r2 = 1
            goto L_0x026f
        L_0x026e:
            r2 = 0
        L_0x026f:
            if (r2 == 0) goto L_0x0281
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.FHD     // Catch:{ all -> 0x0564 }
            androidx.camera.video.Quality r2 = androidx.camera.video.Quality.FHD     // Catch:{ all -> 0x0564 }
            androidx.camera.video.FallbackStrategy r2 = androidx.camera.video.FallbackStrategy.lowerQualityThan(r2)     // Catch:{ all -> 0x0564 }
            androidx.camera.video.QualitySelector r1 = androidx.camera.video.QualitySelector.from(r1, r2)     // Catch:{ all -> 0x0564 }
            r5.setQualitySelector(r1)     // Catch:{ all -> 0x0564 }
            goto L_0x02ba
        L_0x0281:
            r2 = 1080(0x438, float:1.513E-42)
            if (r2 > r1) goto L_0x028b
            r2 = 2161(0x871, float:3.028E-42)
            if (r1 >= r2) goto L_0x028b
            r2 = 1
            goto L_0x028c
        L_0x028b:
            r2 = 0
        L_0x028c:
            if (r2 == 0) goto L_0x029e
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.UHD     // Catch:{ all -> 0x0564 }
            androidx.camera.video.Quality r2 = androidx.camera.video.Quality.UHD     // Catch:{ all -> 0x0564 }
            androidx.camera.video.FallbackStrategy r2 = androidx.camera.video.FallbackStrategy.lowerQualityThan(r2)     // Catch:{ all -> 0x0564 }
            androidx.camera.video.QualitySelector r1 = androidx.camera.video.QualitySelector.from(r1, r2)     // Catch:{ all -> 0x0564 }
            r5.setQualitySelector(r1)     // Catch:{ all -> 0x0564 }
            goto L_0x02ba
        L_0x029e:
            r2 = 2160(0x870, float:3.027E-42)
            if (r2 > r1) goto L_0x02a8
            r2 = 4321(0x10e1, float:6.055E-42)
            if (r1 >= r2) goto L_0x02a8
            r1 = 1
            goto L_0x02a9
        L_0x02a8:
            r1 = 0
        L_0x02a9:
            if (r1 == 0) goto L_0x02ba
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.HIGHEST     // Catch:{ all -> 0x0564 }
            androidx.camera.video.Quality r2 = androidx.camera.video.Quality.HIGHEST     // Catch:{ all -> 0x0564 }
            androidx.camera.video.FallbackStrategy r2 = androidx.camera.video.FallbackStrategy.lowerQualityThan(r2)     // Catch:{ all -> 0x0564 }
            androidx.camera.video.QualitySelector r1 = androidx.camera.video.QualitySelector.from(r1, r2)     // Catch:{ all -> 0x0564 }
            r5.setQualitySelector(r1)     // Catch:{ all -> 0x0564 }
        L_0x02ba:
            java.lang.Integer r1 = r8.fps     // Catch:{ all -> 0x0564 }
            if (r1 == 0) goto L_0x0365
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x0564 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0564 }
            java.util.List r2 = r10.getFrameRateRanges()     // Catch:{ all -> 0x0564 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x0564 }
            boolean r4 = r2 instanceof java.util.Collection     // Catch:{ all -> 0x0564 }
            if (r4 == 0) goto L_0x02d9
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x0564 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0564 }
            if (r4 == 0) goto L_0x02d9
        L_0x02d7:
            r2 = 0
            goto L_0x02f6
        L_0x02d9:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0564 }
        L_0x02dd:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0564 }
            if (r4 == 0) goto L_0x02d7
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0564 }
            android.util.Range r4 = (android.util.Range) r4     // Catch:{ all -> 0x0564 }
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch:{ all -> 0x0564 }
            java.lang.Comparable r10 = (java.lang.Comparable) r10     // Catch:{ all -> 0x0564 }
            boolean r4 = r4.contains(r10)     // Catch:{ all -> 0x0564 }
            if (r4 == 0) goto L_0x02dd
            r2 = 1
        L_0x02f6:
            if (r2 == 0) goto L_0x035d
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r19 = r12
            double r12 = (double) r1     // Catch:{ all -> 0x0564 }
            double r12 = r17 / r12
            long r12 = (long) r12     // Catch:{ all -> 0x0564 }
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            r10 = r5
            long r4 = (long) r2     // Catch:{ all -> 0x0564 }
            long r12 = r12 * r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0564 }
            r2.<init>()     // Catch:{ all -> 0x0564 }
            java.lang.String r4 = "Setting AE_TARGET_FPS_RANGE to "
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ all -> 0x0564 }
            java.lang.StringBuilder r2 = r2.append(r1)     // Catch:{ all -> 0x0564 }
            r4 = 45
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ all -> 0x0564 }
            java.lang.StringBuilder r2 = r2.append(r1)     // Catch:{ all -> 0x0564 }
            java.lang.String r4 = ", and SENSOR_FRAME_DURATION to "
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ all -> 0x0564 }
            java.lang.StringBuilder r2 = r2.append(r12)     // Catch:{ all -> 0x0564 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0564 }
            android.util.Log.i(r9, r2)     // Catch:{ all -> 0x0564 }
            androidx.camera.camera2.interop.Camera2Interop$Extender r2 = new androidx.camera.camera2.interop.Camera2Interop$Extender     // Catch:{ all -> 0x0564 }
            r4 = r15
            androidx.camera.core.ExtendableBuilder r4 = (androidx.camera.core.ExtendableBuilder) r4     // Catch:{ all -> 0x0564 }
            r2.<init>(r4)     // Catch:{ all -> 0x0564 }
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE     // Catch:{ all -> 0x0564 }
            android.util.Range r5 = new android.util.Range     // Catch:{ all -> 0x0564 }
            java.lang.Integer r17 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch:{ all -> 0x0564 }
            r18 = r9
            r9 = r17
            java.lang.Comparable r9 = (java.lang.Comparable) r9     // Catch:{ all -> 0x0550 }
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch:{ all -> 0x0550 }
            java.lang.Comparable r1 = (java.lang.Comparable) r1     // Catch:{ all -> 0x0550 }
            r5.<init>(r9, r1)     // Catch:{ all -> 0x0550 }
            androidx.camera.camera2.interop.Camera2Interop$Extender r1 = r2.setCaptureRequestOption(r4, r5)     // Catch:{ all -> 0x0550 }
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.SENSOR_FRAME_DURATION     // Catch:{ all -> 0x0550 }
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r12)     // Catch:{ all -> 0x0550 }
            r1.setCaptureRequestOption(r2, r4)     // Catch:{ all -> 0x0550 }
            goto L_0x036a
        L_0x035d:
            r18 = r9
            com.mrousavy.camera.FpsNotContainedInFormatError r0 = new com.mrousavy.camera.FpsNotContainedInFormatError     // Catch:{ all -> 0x0550 }
            r0.<init>(r1)     // Catch:{ all -> 0x0550 }
            throw r0     // Catch:{ all -> 0x0550 }
        L_0x0365:
            r10 = r5
            r18 = r9
            r19 = r12
        L_0x036a:
            java.lang.Boolean r1 = r8.hdr     // Catch:{ all -> 0x0550 }
            r2 = 1
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)     // Catch:{ all -> 0x0550 }
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x0550 }
            if (r1 == 0) goto L_0x03a5
            r1 = 2
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch:{ all -> 0x0550 }
            r3.L$0 = r8     // Catch:{ all -> 0x0550 }
            r3.L$1 = r11     // Catch:{ all -> 0x0550 }
            r3.L$2 = r7     // Catch:{ all -> 0x0550 }
            r3.L$3 = r6     // Catch:{ all -> 0x0550 }
            r3.L$4 = r15     // Catch:{ all -> 0x0550 }
            r3.L$5 = r14     // Catch:{ all -> 0x0550 }
            r3.L$6 = r10     // Catch:{ all -> 0x0550 }
            r3.L$7 = r0     // Catch:{ all -> 0x0550 }
            r4 = r19
            r3.J$0 = r4     // Catch:{ all -> 0x0550 }
            r1 = 2
            r3.label = r1     // Catch:{ all -> 0x0550 }
            java.lang.Object r1 = r6.invoke(r2, r3)     // Catch:{ all -> 0x0550 }
            r2 = r16
            if (r1 != r2) goto L_0x039c
            return r2
        L_0x039c:
            r12 = r4
            r5 = r10
        L_0x039e:
            r10 = r5
            r4 = r12
        L_0x03a0:
            r12 = r14
            r13 = r15
            r14 = r7
            r15 = r11
            goto L_0x03aa
        L_0x03a5:
            r2 = r16
            r4 = r19
            goto L_0x03a0
        L_0x03aa:
            java.lang.Boolean r1 = r8.lowLightBoost     // Catch:{ all -> 0x0550 }
            r7 = 1
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)     // Catch:{ all -> 0x0550 }
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r9)     // Catch:{ all -> 0x0550 }
            if (r1 == 0) goto L_0x03e6
            r1 = 3
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch:{ all -> 0x0550 }
            r3.L$0 = r8     // Catch:{ all -> 0x0550 }
            r3.L$1 = r15     // Catch:{ all -> 0x0550 }
            r3.L$2 = r14     // Catch:{ all -> 0x0550 }
            r3.L$3 = r13     // Catch:{ all -> 0x0550 }
            r3.L$4 = r12     // Catch:{ all -> 0x0550 }
            r3.L$5 = r10     // Catch:{ all -> 0x0550 }
            r3.L$6 = r0     // Catch:{ all -> 0x0550 }
            r1 = 0
            r3.L$7 = r1     // Catch:{ all -> 0x0550 }
            r3.J$0 = r4     // Catch:{ all -> 0x0550 }
            r1 = 3
            r3.label = r1     // Catch:{ all -> 0x0550 }
            java.lang.Object r1 = r6.invoke(r7, r3)     // Catch:{ all -> 0x0550 }
            if (r1 != r2) goto L_0x03d9
            return r2
        L_0x03d9:
            r2 = r0
            r3 = r8
            r6 = r10
        L_0x03dc:
            r0 = r2
            r8 = r3
            r7 = r14
            r11 = r15
            r1 = 0
            r14 = r12
            r15 = r13
            r12 = r4
            r5 = r6
            goto L_0x03ed
        L_0x03e6:
            r7 = r14
            r11 = r15
            r1 = 0
            r14 = r12
            r15 = r13
            r12 = r4
            r5 = r10
        L_0x03ed:
            r8.videoCapture = r1     // Catch:{ all -> 0x0550 }
            r8.imageCapture = r1     // Catch:{ all -> 0x0550 }
            r8.imageAnalysis = r1     // Catch:{ all -> 0x0550 }
            r11.unbindAll()     // Catch:{ all -> 0x0550 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0550 }
            r1.<init>()     // Catch:{ all -> 0x0550 }
            java.lang.Boolean r2 = r8.video     // Catch:{ all -> 0x0550 }
            r3 = 1
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)     // Catch:{ all -> 0x0550 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)     // Catch:{ all -> 0x0550 }
            if (r2 == 0) goto L_0x0433
            java.lang.String r2 = "Adding VideoCapture use-case..."
            r3 = r18
            android.util.Log.i(r3, r2)     // Catch:{ all -> 0x0562 }
            androidx.camera.video.Recorder r2 = r5.build()     // Catch:{ all -> 0x0562 }
            java.lang.String r4 = "videoRecorderBuilder.build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch:{ all -> 0x0562 }
            androidx.camera.video.VideoOutput r2 = (androidx.camera.video.VideoOutput) r2     // Catch:{ all -> 0x0562 }
            androidx.camera.video.VideoCapture r2 = androidx.camera.video.VideoCapture.withOutput(r2)     // Catch:{ all -> 0x0562 }
            r8.videoCapture = r2     // Catch:{ all -> 0x0562 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch:{ all -> 0x0562 }
            int r4 = r8.getOutputRotation()     // Catch:{ all -> 0x0562 }
            r2.setTargetRotation(r4)     // Catch:{ all -> 0x0562 }
            androidx.camera.video.VideoCapture<androidx.camera.video.Recorder> r2 = r8.videoCapture     // Catch:{ all -> 0x0562 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch:{ all -> 0x0562 }
            r1.add(r2)     // Catch:{ all -> 0x0562 }
            goto L_0x0435
        L_0x0433:
            r3 = r18
        L_0x0435:
            java.lang.Boolean r2 = r8.photo     // Catch:{ all -> 0x0562 }
            r4 = 1
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)     // Catch:{ all -> 0x0562 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)     // Catch:{ all -> 0x0562 }
            if (r2 == 0) goto L_0x045f
            boolean r2 = r8.getFallbackToSnapshot$react_native_vision_camera_release()     // Catch:{ all -> 0x0562 }
            if (r2 == 0) goto L_0x044e
            java.lang.String r2 = "Tried to add photo use-case (`photo={true}`) but the Camera device only supports a single use-case at a time. Falling back to Snapshot capture."
            android.util.Log.i(r3, r2)     // Catch:{ all -> 0x0562 }
            goto L_0x045f
        L_0x044e:
            java.lang.String r2 = "Adding ImageCapture use-case..."
            android.util.Log.i(r3, r2)     // Catch:{ all -> 0x0562 }
            androidx.camera.core.ImageCapture r2 = r14.build()     // Catch:{ all -> 0x0562 }
            r8.imageCapture = r2     // Catch:{ all -> 0x0562 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch:{ all -> 0x0562 }
            r1.add(r2)     // Catch:{ all -> 0x0562 }
        L_0x045f:
            boolean r2 = r8.enableFrameProcessor     // Catch:{ all -> 0x0562 }
            if (r2 == 0) goto L_0x0480
            java.lang.String r2 = "Adding ImageAnalysis use-case..."
            android.util.Log.i(r3, r2)     // Catch:{ all -> 0x0562 }
            androidx.camera.core.ImageAnalysis r0 = r0.build()     // Catch:{ all -> 0x0562 }
            java.util.concurrent.ExecutorService r2 = r8.cameraExecutor     // Catch:{ all -> 0x0562 }
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2     // Catch:{ all -> 0x0562 }
            com.mrousavy.camera.CameraView$$ExternalSyntheticLambda2 r4 = new com.mrousavy.camera.CameraView$$ExternalSyntheticLambda2     // Catch:{ all -> 0x0562 }
            r4.<init>(r8)     // Catch:{ all -> 0x0562 }
            r0.setAnalyzer(r2, r4)     // Catch:{ all -> 0x0562 }
            r8.imageAnalysis = r0     // Catch:{ all -> 0x0562 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ all -> 0x0562 }
            r1.add(r0)     // Catch:{ all -> 0x0562 }
        L_0x0480:
            androidx.camera.core.Preview r0 = r15.build()     // Catch:{ all -> 0x0562 }
            r8.preview = r0     // Catch:{ all -> 0x0562 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0562 }
            r0.<init>()     // Catch:{ all -> 0x0562 }
            java.lang.String r2 = "Attaching "
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ all -> 0x0562 }
            int r2 = r1.size()     // Catch:{ all -> 0x0562 }
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ all -> 0x0562 }
            java.lang.String r2 = " use-cases..."
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ all -> 0x0562 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0562 }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x0562 }
            r0 = r8
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0     // Catch:{ all -> 0x0562 }
            T r2 = r7.element     // Catch:{ all -> 0x0562 }
            androidx.camera.core.CameraSelector r2 = (androidx.camera.core.CameraSelector) r2     // Catch:{ all -> 0x0562 }
            kotlin.jvm.internal.SpreadBuilder r4 = new kotlin.jvm.internal.SpreadBuilder     // Catch:{ all -> 0x0562 }
            r5 = 2
            r4.<init>(r5)     // Catch:{ all -> 0x0562 }
            androidx.camera.core.Preview r5 = r8.preview     // Catch:{ all -> 0x0562 }
            r4.add(r5)     // Catch:{ all -> 0x0562 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x0562 }
            r5 = 0
            androidx.camera.core.UseCase[] r6 = new androidx.camera.core.UseCase[r5]     // Catch:{ all -> 0x0562 }
            java.lang.Object[] r1 = r1.toArray(r6)     // Catch:{ all -> 0x0562 }
            r4.addSpread(r1)     // Catch:{ all -> 0x0562 }
            int r1 = r4.size()     // Catch:{ all -> 0x0562 }
            androidx.camera.core.UseCase[] r1 = new androidx.camera.core.UseCase[r1]     // Catch:{ all -> 0x0562 }
            java.lang.Object[] r1 = r4.toArray(r1)     // Catch:{ all -> 0x0562 }
            androidx.camera.core.UseCase[] r1 = (androidx.camera.core.UseCase[]) r1     // Catch:{ all -> 0x0562 }
            androidx.camera.core.Camera r0 = r11.bindToLifecycle((androidx.lifecycle.LifecycleOwner) r0, (androidx.camera.core.CameraSelector) r2, (androidx.camera.core.UseCase[]) r1)     // Catch:{ all -> 0x0562 }
            r8.camera = r0     // Catch:{ all -> 0x0562 }
            androidx.camera.core.Preview r0 = r8.preview     // Catch:{ all -> 0x0562 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ all -> 0x0562 }
            androidx.camera.view.PreviewView r1 = r8.previewView     // Catch:{ all -> 0x0562 }
            androidx.camera.core.Preview$SurfaceProvider r1 = r1.getSurfaceProvider()     // Catch:{ all -> 0x0562 }
            r0.setSurfaceProvider(r1)     // Catch:{ all -> 0x0562 }
            androidx.camera.core.Camera r0 = r8.camera     // Catch:{ all -> 0x0562 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ all -> 0x0562 }
            androidx.camera.core.CameraInfo r0 = r0.getCameraInfo()     // Catch:{ all -> 0x0562 }
            androidx.lifecycle.LiveData r0 = r0.getZoomState()     // Catch:{ all -> 0x0562 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0562 }
            androidx.camera.core.ZoomState r0 = (androidx.camera.core.ZoomState) r0     // Catch:{ all -> 0x0562 }
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0500
            float r0 = r0.getMinZoomRatio()     // Catch:{ all -> 0x0562 }
            goto L_0x0501
        L_0x0500:
            r0 = r1
        L_0x0501:
            r8.minZoom = r0     // Catch:{ all -> 0x0562 }
            androidx.camera.core.Camera r0 = r8.camera     // Catch:{ all -> 0x0562 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ all -> 0x0562 }
            androidx.camera.core.CameraInfo r0 = r0.getCameraInfo()     // Catch:{ all -> 0x0562 }
            androidx.lifecycle.LiveData r0 = r0.getZoomState()     // Catch:{ all -> 0x0562 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0562 }
            androidx.camera.core.ZoomState r0 = (androidx.camera.core.ZoomState) r0     // Catch:{ all -> 0x0562 }
            if (r0 == 0) goto L_0x051c
            float r1 = r0.getMaxZoomRatio()     // Catch:{ all -> 0x0562 }
        L_0x051c:
            r8.maxZoom = r1     // Catch:{ all -> 0x0562 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0562 }
            long r0 = r0 - r12
            java.lang.String r2 = "CameraView.performance"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0562 }
            r4.<init>()     // Catch:{ all -> 0x0562 }
            java.lang.String r5 = "Session configured in "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ all -> 0x0562 }
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch:{ all -> 0x0562 }
            java.lang.String r1 = " ms! Camera: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x0562 }
            androidx.camera.core.Camera r1 = r8.camera     // Catch:{ all -> 0x0562 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ all -> 0x0562 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x0562 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0562 }
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x0562 }
            com.mrousavy.camera.CameraView_EventsKt.invokeOnInitialized(r8)     // Catch:{ all -> 0x0562 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0550:
            r0 = move-exception
            r3 = r18
            goto L_0x0566
        L_0x0554:
            r3 = r9
            com.mrousavy.camera.NoCameraDeviceError r0 = new com.mrousavy.camera.NoCameraDeviceError     // Catch:{ all -> 0x0562 }
            r0.<init>()     // Catch:{ all -> 0x0562 }
            throw r0     // Catch:{ all -> 0x0562 }
        L_0x055b:
            r3 = r9
            com.mrousavy.camera.CameraPermissionError r0 = new com.mrousavy.camera.CameraPermissionError     // Catch:{ all -> 0x0562 }
            r0.<init>()     // Catch:{ all -> 0x0562 }
            throw r0     // Catch:{ all -> 0x0562 }
        L_0x0562:
            r0 = move-exception
            goto L_0x0566
        L_0x0564:
            r0 = move-exception
            r3 = r9
        L_0x0566:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to configure session: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1)
            boolean r1 = r0 instanceof com.mrousavy.camera.CameraError
            if (r1 != 0) goto L_0x05bb
            boolean r1 = r0 instanceof java.lang.IllegalArgumentException
            if (r1 == 0) goto L_0x05b3
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x059c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "too many use cases"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 2
            r4 = 0
            r5 = 0
            boolean r1 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r1, (java.lang.CharSequence) r2, (boolean) r5, (int) r3, (java.lang.Object) r4)
            r2 = 1
            if (r1 != r2) goto L_0x059d
            r10 = r2
            goto L_0x059e
        L_0x059c:
            r5 = 0
        L_0x059d:
            r10 = r5
        L_0x059e:
            if (r10 == 0) goto L_0x05a8
            com.mrousavy.camera.ParallelVideoProcessingNotSupportedError r1 = new com.mrousavy.camera.ParallelVideoProcessingNotSupportedError
            r1.<init>(r0)
            com.mrousavy.camera.CameraError r1 = (com.mrousavy.camera.CameraError) r1
            goto L_0x05af
        L_0x05a8:
            com.mrousavy.camera.InvalidCameraDeviceError r1 = new com.mrousavy.camera.InvalidCameraDeviceError
            r1.<init>(r0)
            com.mrousavy.camera.CameraError r1 = (com.mrousavy.camera.CameraError) r1
        L_0x05af:
            r0 = r1
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L_0x05bb
        L_0x05b3:
            com.mrousavy.camera.UnknownCameraError r1 = new com.mrousavy.camera.UnknownCameraError
            r1.<init>(r0)
            r0 = r1
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L_0x05bb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView.configureSession(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final void configureSession$lambda$7$lambda$6(CameraView cameraView, ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(cameraView, "this$0");
        Intrinsics.checkNotNullParameter(imageProxy, "image");
        long currentTimeMillis = System.currentTimeMillis();
        if (((double) (currentTimeMillis - cameraView.lastFrameProcessorCall)) > (1.0d / cameraView.actualFrameProcessorFps) * 1000.0d) {
            cameraView.lastFrameProcessorCall = currentTimeMillis;
            PerformanceSampleCollection beginPerformanceSampleCollection = cameraView.frameProcessorPerformanceDataCollector.beginPerformanceSampleCollection();
            cameraView.frameProcessorCallback(imageProxy);
            beginPerformanceSampleCollection.getEndPerformanceSampleCollection().invoke();
        }
        imageProxy.close();
        if (cameraView.isReadyForNewEvaluation()) {
            cameraView.evaluateNewPerformanceSamples();
        }
    }

    private final void evaluateNewPerformanceSamples() {
        this.lastFrameProcessorPerformanceEvaluation = System.currentTimeMillis();
        double floor = Math.floor(Math.min(1.0d / this.frameProcessorPerformanceDataCollector.getAverageExecutionTimeSeconds(), (double) 30));
        double d = this.frameProcessorFps;
        boolean z = true;
        if (d == -1.0d) {
            this.actualFrameProcessorFps = floor;
            return;
        }
        if (!(floor == this.lastSuggestedFrameProcessorFps)) {
            if (floor != d) {
                z = false;
            }
            if (!z) {
                CameraView_EventsKt.invokeOnFrameProcessorPerformanceSuggestionAvailable(this, d, floor);
                this.lastSuggestedFrameProcessorFps = floor;
            }
        }
    }
}
