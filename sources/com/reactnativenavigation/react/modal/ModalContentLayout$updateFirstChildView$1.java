package com.reactnativenavigation.react.modal;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/reactnativenavigation/react/modal/ModalContentLayout$updateFirstChildView$1", "Lcom/facebook/react/bridge/GuardedRunnable;", "runGuarded", "", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModalContentLayout.kt */
public final class ModalContentLayout$updateFirstChildView$1 extends GuardedRunnable {
    final /* synthetic */ int $viewTag;
    final /* synthetic */ ModalContentLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModalContentLayout$updateFirstChildView$1(ReactContext reactContext, ModalContentLayout modalContentLayout, int i) {
        super(reactContext);
        this.this$0 = modalContentLayout;
        this.$viewTag = i;
    }

    public void runGuarded() {
        NativeModule nativeModule = this.this$0.getReactContext().getNativeModule(UIManagerModule.class);
        Intrinsics.checkNotNull(nativeModule, "null cannot be cast to non-null type com.facebook.react.uimanager.UIManagerModule");
        ((UIManagerModule) nativeModule).updateNodeSize(this.$viewTag, this.this$0.viewWidth, this.this$0.viewHeight);
    }
}
