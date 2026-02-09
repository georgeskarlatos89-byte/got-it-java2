package com.reactnativenavigation.react.modal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0016J\u001a\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\rH\u0016J\b\u0010\u001f\u001a\u00020\rH\u0016J\b\u0010 \u001a\u00020\rH\u0016J\b\u0010!\u001a\u00020\rH\u0016J0\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0014H\u0014J\u0012\u0010(\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010)\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006*"}, d2 = {"Lcom/reactnativenavigation/react/modal/ModalHostLayout;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "mHostView", "Lcom/reactnativenavigation/react/modal/ModalContentLayout;", "viewController", "Lcom/reactnativenavigation/react/modal/ModalLayoutController;", "getViewController", "()Lcom/reactnativenavigation/react/modal/ModalLayoutController;", "addChildrenForAccessibility", "", "outChildren", "Ljava/util/ArrayList;", "Landroid/view/View;", "addView", "child", "index", "", "dispatchPopulateAccessibilityEvent", "", "event", "Landroid/view/accessibility/AccessibilityEvent;", "dispatchProvideStructure", "structure", "Landroid/view/ViewStructure;", "getChildAt", "getChildCount", "onDropInstance", "onHostDestroy", "onHostPause", "onHostResume", "onLayout", "changed", "l", "t", "r", "b", "removeView", "removeViewAt", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModalHostLayout.kt */
public class ModalHostLayout extends ViewGroup implements LifecycleEventListener {
    private final ModalContentLayout mHostView;
    private final ModalLayoutController viewController;

    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ModalHostLayout(com.facebook.react.uimanager.ThemedReactContext r10) {
        /*
            r9 = this;
            java.lang.String r0 = "reactContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r10
            android.content.Context r0 = (android.content.Context) r0
            r9.<init>(r0)
            r2 = r10
            com.facebook.react.bridge.ReactContext r2 = (com.facebook.react.bridge.ReactContext) r2
            android.app.Activity r3 = r10.getCurrentActivity()
            int r10 = com.reactnativenavigation.utils.CompatUtils.generateViewId()
            java.lang.String r4 = java.lang.String.valueOf(r10)
            com.reactnativenavigation.viewcontrollers.viewcontroller.YellowBoxDelegate r5 = new com.reactnativenavigation.viewcontrollers.viewcontroller.YellowBoxDelegate
            r5.<init>(r0)
            com.reactnativenavigation.options.Options r6 = new com.reactnativenavigation.options.Options
            r6.<init>()
            com.reactnativenavigation.options.HardwareBackButtonOptions r10 = r6.hardwareBack
            com.reactnativenavigation.options.params.Bool r1 = new com.reactnativenavigation.options.params.Bool
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r1.<init>(r7)
            r10.dismissModalOnPress = r1
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            com.reactnativenavigation.viewcontrollers.viewcontroller.overlay.ViewControllerOverlay r7 = new com.reactnativenavigation.viewcontrollers.viewcontroller.overlay.ViewControllerOverlay
            r7.<init>(r0)
            com.reactnativenavigation.react.modal.ModalHostLayout$viewController$2 r10 = new com.reactnativenavigation.react.modal.ModalHostLayout$viewController$2
            r10.<init>(r9)
            r8 = r10
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            com.reactnativenavigation.react.modal.ModalLayoutController r10 = new com.reactnativenavigation.react.modal.ModalLayoutController
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.viewController = r10
            android.view.ViewGroup r10 = r10.getView()
            com.reactnativenavigation.react.modal.ModalFrameLayout r10 = (com.reactnativenavigation.react.modal.ModalFrameLayout) r10
            com.reactnativenavigation.react.modal.ModalContentLayout r10 = r10.getModalContentLayout()
            r9.mHostView = r10
            android.content.Context r10 = r9.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r0)
            com.facebook.react.bridge.ReactContext r10 = (com.facebook.react.bridge.ReactContext) r10
            r0 = r9
            com.facebook.react.bridge.LifecycleEventListener r0 = (com.facebook.react.bridge.LifecycleEventListener) r0
            r10.addLifecycleEventListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.react.modal.ModalHostLayout.<init>(com.facebook.react.uimanager.ThemedReactContext):void");
    }

    public final ModalLayoutController getViewController() {
        return this.viewController;
    }

    public void dispatchProvideStructure(ViewStructure viewStructure) {
        this.mHostView.dispatchProvideStructure(viewStructure);
    }

    public void addView(View view, int i) {
        UiThreadUtil.assertOnUiThread();
        this.mHostView.addView(view, i);
    }

    public int getChildCount() {
        return this.mHostView.getChildCount();
    }

    public View getChildAt(int i) {
        return this.mHostView.getChildAt(i);
    }

    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        this.mHostView.removeView(view);
    }

    public void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        this.mHostView.removeView(getChildAt(i));
    }

    public void onDropInstance() {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((ReactContext) context).removeLifecycleEventListener(this);
    }

    public void onHostDestroy() {
        onDropInstance();
    }
}
