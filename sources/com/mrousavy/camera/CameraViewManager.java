package com.mrousavy.camera;

import com.brentvatne.react.ReactVideoView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u001f\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000bH\u0007J\u001a\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0007J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0013H\u0007J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0013H\u0007J\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0013H\u0007J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0013H\u0007J\u001a\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010%H\u0007J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(H\u0007J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+H\u0007J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0013H\u0007J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u0018\u00102\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u000bH\u0007J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u0018\u00106\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u000bH\u0007J\u001f\u00108\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u0018\u0010:\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010;\u001a\u00020+H\u0007¨\u0006="}, d2 = {"Lcom/mrousavy/camera/CameraViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/mrousavy/camera/CameraView;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "onAfterUpdateTransaction", "", "view", "setAudio", "audio", "", "(Lcom/mrousavy/camera/CameraView;Ljava/lang/Boolean;)V", "setCameraId", "cameraId", "setColorSpace", "colorSpace", "setEnableDepthData", "enableDepthData", "setEnableFrameProcessor", "enableFrameProcessor", "setEnableHighQualityPhotos", "enableHighQualityPhotos", "setEnablePortraitEffectsMatteDelivery", "enablePortraitEffectsMatteDelivery", "setEnableZoomGesture", "enableZoomGesture", "setFormat", "format", "Lcom/facebook/react/bridge/ReadableMap;", "setFps", "fps", "", "setFrameProcessorFps", "frameProcessorFps", "", "setHdr", "hdr", "setIsActive", "isActive", "setLowLightBoost", "lowLightBoost", "setOrientation", "orientation", "setPhoto", "photo", "setTorch", "torch", "setVideo", "video", "setZoom", "zoom", "Companion", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: CameraViewManager.kt */
public final class CameraViewManager extends ViewGroupManager<CameraView> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "CameraView";
    /* access modifiers changed from: private */
    public static final HashMap<CameraView, ArrayList<String>> cameraViewTransactions = new HashMap<>();

    public String getName() {
        return "CameraView";
    }

    public CameraViewManager(ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactContext");
    }

    public CameraView createViewInstance(ThemedReactContext themedReactContext) {
        Intrinsics.checkNotNullParameter(themedReactContext, "context");
        NativeModule nativeModule = themedReactContext.getNativeModule(CameraViewModule.class);
        Intrinsics.checkNotNull(nativeModule);
        return new CameraView(themedReactContext, ((CameraViewModule) nativeModule).getFrameProcessorThread());
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(CameraView cameraView) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        super.onAfterUpdateTransaction(cameraView);
        HashMap<CameraView, ArrayList<String>> hashMap = cameraViewTransactions;
        ArrayList arrayList = hashMap.get(cameraView);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        cameraView.update(arrayList);
        hashMap.remove(cameraView);
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put("cameraViewReady", MapBuilder.of("registrationName", "onViewReady")).put("cameraInitialized", MapBuilder.of("registrationName", "onInitialized")).put("cameraError", MapBuilder.of("registrationName", "onError")).put("cameraPerformanceSuggestionAvailable", MapBuilder.of("registrationName", "onFrameProcessorPerformanceSuggestionAvailable")).build();
    }

    @ReactProp(name = "cameraId")
    public final void setCameraId(CameraView cameraView, String str) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(str, "cameraId");
        if (!Intrinsics.areEqual((Object) cameraView.getCameraId(), (Object) str)) {
            Companion.addChangedPropToTransaction(cameraView, "cameraId");
        }
        cameraView.setCameraId(str);
    }

    @ReactProp(name = "photo")
    public final void setPhoto(CameraView cameraView, Boolean bool) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (!Intrinsics.areEqual((Object) cameraView.getPhoto(), (Object) bool)) {
            Companion.addChangedPropToTransaction(cameraView, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO);
        }
        cameraView.setPhoto(bool);
    }

    @ReactProp(name = "video")
    public final void setVideo(CameraView cameraView, Boolean bool) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (!Intrinsics.areEqual((Object) cameraView.getVideo(), (Object) bool)) {
            Companion.addChangedPropToTransaction(cameraView, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
        }
        cameraView.setVideo(bool);
    }

    @ReactProp(name = "audio")
    public final void setAudio(CameraView cameraView, Boolean bool) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (!Intrinsics.areEqual((Object) cameraView.getAudio(), (Object) bool)) {
            Companion.addChangedPropToTransaction(cameraView, "audio");
        }
        cameraView.setAudio(bool);
    }

    @ReactProp(name = "enableFrameProcessor")
    public final void setEnableFrameProcessor(CameraView cameraView, boolean z) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (cameraView.getEnableFrameProcessor() != z) {
            Companion.addChangedPropToTransaction(cameraView, "enableFrameProcessor");
        }
        cameraView.setEnableFrameProcessor(z);
    }

    @ReactProp(name = "enableDepthData")
    public final void setEnableDepthData(CameraView cameraView, boolean z) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (cameraView.getEnableDepthData() != z) {
            Companion.addChangedPropToTransaction(cameraView, "enableDepthData");
        }
        cameraView.setEnableDepthData(z);
    }

    @ReactProp(name = "enableHighQualityPhotos")
    public final void setEnableHighQualityPhotos(CameraView cameraView, Boolean bool) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (!Intrinsics.areEqual((Object) cameraView.getEnableHighQualityPhotos(), (Object) bool)) {
            Companion.addChangedPropToTransaction(cameraView, "enableHighQualityPhotos");
        }
        cameraView.setEnableHighQualityPhotos(bool);
    }

    @ReactProp(name = "enablePortraitEffectsMatteDelivery")
    public final void setEnablePortraitEffectsMatteDelivery(CameraView cameraView, boolean z) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (cameraView.getEnablePortraitEffectsMatteDelivery() != z) {
            Companion.addChangedPropToTransaction(cameraView, "enablePortraitEffectsMatteDelivery");
        }
        cameraView.setEnablePortraitEffectsMatteDelivery(z);
    }

    @ReactProp(name = "format")
    public final void setFormat(CameraView cameraView, ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (!Intrinsics.areEqual((Object) cameraView.getFormat(), (Object) readableMap)) {
            Companion.addChangedPropToTransaction(cameraView, "format");
        }
        cameraView.setFormat(readableMap);
    }

    @ReactProp(defaultInt = -1, name = "fps")
    public final void setFps(CameraView cameraView, int i) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        Integer fps = cameraView.getFps();
        if (fps == null || fps.intValue() != i) {
            Companion.addChangedPropToTransaction(cameraView, "fps");
        }
        cameraView.setFps(i > 0 ? Integer.valueOf(i) : null);
    }

    @ReactProp(defaultDouble = 1.0d, name = "frameProcessorFps")
    public final void setFrameProcessorFps(CameraView cameraView, double d) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (!(cameraView.getFrameProcessorFps() == d)) {
            Companion.addChangedPropToTransaction(cameraView, "frameProcessorFps");
        }
        cameraView.setFrameProcessorFps(d);
    }

    @ReactProp(name = "hdr")
    public final void setHdr(CameraView cameraView, Boolean bool) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (!Intrinsics.areEqual((Object) cameraView.getHdr(), (Object) bool)) {
            Companion.addChangedPropToTransaction(cameraView, "hdr");
        }
        cameraView.setHdr(bool);
    }

    @ReactProp(name = "lowLightBoost")
    public final void setLowLightBoost(CameraView cameraView, Boolean bool) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (!Intrinsics.areEqual((Object) cameraView.getLowLightBoost(), (Object) bool)) {
            Companion.addChangedPropToTransaction(cameraView, "lowLightBoost");
        }
        cameraView.setLowLightBoost(bool);
    }

    @ReactProp(name = "colorSpace")
    public final void setColorSpace(CameraView cameraView, String str) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (!Intrinsics.areEqual((Object) cameraView.getColorSpace(), (Object) str)) {
            Companion.addChangedPropToTransaction(cameraView, "colorSpace");
        }
        cameraView.setColorSpace(str);
    }

    @ReactProp(name = "isActive")
    public final void setIsActive(CameraView cameraView, boolean z) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (cameraView.isActive() != z) {
            Companion.addChangedPropToTransaction(cameraView, "isActive");
        }
        cameraView.setActive(z);
    }

    @ReactProp(name = "torch")
    public final void setTorch(CameraView cameraView, String str) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(str, "torch");
        if (!Intrinsics.areEqual((Object) cameraView.getTorch(), (Object) str)) {
            Companion.addChangedPropToTransaction(cameraView, "torch");
        }
        cameraView.setTorch(str);
    }

    @ReactProp(name = "zoom")
    public final void setZoom(CameraView cameraView, double d) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        float f = (float) d;
        if (!(cameraView.getZoom() == f)) {
            Companion.addChangedPropToTransaction(cameraView, "zoom");
        }
        cameraView.setZoom(f);
    }

    @ReactProp(name = "enableZoomGesture")
    public final void setEnableZoomGesture(CameraView cameraView, boolean z) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        if (cameraView.getEnableZoomGesture() != z) {
            Companion.addChangedPropToTransaction(cameraView, "enableZoomGesture");
        }
        cameraView.setEnableZoomGesture(z);
    }

    @ReactProp(name = "orientation")
    public final void setOrientation(CameraView cameraView, String str) {
        Intrinsics.checkNotNullParameter(cameraView, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(str, ReactVideoView.EVENT_PROP_ORIENTATION);
        if (!Intrinsics.areEqual((Object) cameraView.getOrientation(), (Object) str)) {
            Companion.addChangedPropToTransaction(cameraView, ReactVideoView.EVENT_PROP_ORIENTATION);
        }
        cameraView.setOrientation(str);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000RC\u0010\u0005\u001a4\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0006j\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\n`\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/mrousavy/camera/CameraViewManager$Companion;", "", "()V", "TAG", "", "cameraViewTransactions", "Ljava/util/HashMap;", "Lcom/mrousavy/camera/CameraView;", "Ljava/util/ArrayList;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "getCameraViewTransactions", "()Ljava/util/HashMap;", "addChangedPropToTransaction", "", "view", "changedProp", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: CameraViewManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HashMap<CameraView, ArrayList<String>> getCameraViewTransactions() {
            return CameraViewManager.cameraViewTransactions;
        }

        /* access modifiers changed from: private */
        public final void addChangedPropToTransaction(CameraView cameraView, String str) {
            if (getCameraViewTransactions().get(cameraView) == null) {
                getCameraViewTransactions().put(cameraView, new ArrayList());
            }
            ArrayList<String> arrayList = getCameraViewTransactions().get(cameraView);
            Intrinsics.checkNotNull(arrayList);
            arrayList.add(str);
        }
    }
}
