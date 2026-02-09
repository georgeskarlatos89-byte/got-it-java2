package com.reactnativenavigation.react.modal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J$\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0016J(\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bH\u0014J\u0012\u0010&\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0007H\u0016J\b\u0010)\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/reactnativenavigation/react/modal/ModalContentLayout;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/uimanager/RootView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hasAdjustedSize", "", "mJSTouchDispatcher", "Lcom/facebook/react/uimanager/JSTouchDispatcher;", "viewHeight", "", "viewWidth", "addView", "", "child", "Landroid/view/View;", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "getEventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getReactContext", "Lcom/facebook/react/bridge/ReactContext;", "handleException", "t", "", "onChildEndedNativeGesture", "androidEvent", "Landroid/view/MotionEvent;", "onChildStartedNativeGesture", "onInterceptTouchEvent", "event", "onSizeChanged", "w", "h", "oldw", "oldh", "onTouchEvent", "requestDisallowInterceptTouchEvent", "disallowIntercept", "updateFirstChildView", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModalContentLayout.kt */
public final class ModalContentLayout extends ReactViewGroup implements RootView {
    private boolean hasAdjustedSize;
    private final JSTouchDispatcher mJSTouchDispatcher = new JSTouchDispatcher(this);
    /* access modifiers changed from: private */
    public int viewHeight;
    /* access modifiers changed from: private */
    public int viewWidth;

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public ModalContentLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.viewWidth = i;
        this.viewHeight = i2;
        updateFirstChildView();
    }

    private final void updateFirstChildView() {
        if (getChildCount() > 0) {
            this.hasAdjustedSize = false;
            int id = getChildAt(0).getId();
            ReactContext reactContext = getReactContext();
            reactContext.runOnNativeModulesQueueThread(new ModalContentLayout$updateFirstChildView$1(reactContext, this, id));
            return;
        }
        this.hasAdjustedSize = true;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (this.hasAdjustedSize) {
            updateFirstChildView();
        }
    }

    public void onChildStartedNativeGesture(View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "child");
        this.mJSTouchDispatcher.onChildStartedNativeGesture(motionEvent, getEventDispatcher());
    }

    public void onChildStartedNativeGesture(MotionEvent motionEvent) {
        this.mJSTouchDispatcher.onChildStartedNativeGesture(motionEvent, getEventDispatcher());
    }

    public void onChildEndedNativeGesture(View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "child");
        this.mJSTouchDispatcher.onChildEndedNativeGesture(motionEvent, getEventDispatcher());
    }

    private final EventDispatcher getEventDispatcher() {
        NativeModule nativeModule = getReactContext().getNativeModule(UIManagerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        return ((UIManagerModule) nativeModule).getEventDispatcher();
    }

    public void handleException(Throwable th) {
        getReactContext().handleException(new RuntimeException(th));
    }

    /* access modifiers changed from: private */
    public final ReactContext getReactContext() {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (ReactContext) context;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.mJSTouchDispatcher.handleTouchEvent(motionEvent, getEventDispatcher());
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mJSTouchDispatcher.handleTouchEvent(motionEvent, getEventDispatcher());
        super.onTouchEvent(motionEvent);
        return true;
    }
}
