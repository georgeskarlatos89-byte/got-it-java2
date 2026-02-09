package com.reactnativenavigation.react.modal;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.reactnativenavigation.NavigationActivity;
import com.reactnativenavigation.options.ModalPresentationStyle;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.options.TransitionAnimationOptions;
import com.reactnativenavigation.options.TransitionAnimationOptionsKt;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.options.parsers.JSONParser;
import com.reactnativenavigation.react.CommandListenerAdapter;
import com.reactnativenavigation.viewcontrollers.navigator.Navigator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0011H\u0014J\u0016\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0014J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0007J\u0018\u0010#\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\"H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006%"}, d2 = {"Lcom/reactnativenavigation/react/modal/ModalViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativenavigation/react/modal/ModalHostLayout;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "jsonParser", "Lcom/reactnativenavigation/options/parsers/JSONParser;", "navigator", "Lcom/reactnativenavigation/viewcontrollers/navigator/Navigator;", "getNavigator", "()Lcom/reactnativenavigation/viewcontrollers/navigator/Navigator;", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "createShadowNodeInstance", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createViewInstance", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "getShadowNodeClass", "Ljava/lang/Class;", "onAfterUpdateTransaction", "", "modal", "onDropViewInstance", "setAnimation", "animation", "Lcom/facebook/react/bridge/ReadableMap;", "setBlurOnUnmount", "blurOnUnmount", "", "setTransparent", "transparent", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ReactModule(name = "RNNModalViewManager")
/* compiled from: ModalViewManager.kt */
public final class ModalViewManager extends ViewGroupManager<ModalHostLayout> {
    private final JSONParser jsonParser = new JSONParser();
    private final ReactContext reactContext;

    public String getName() {
        return "RNNModalViewManager";
    }

    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return ModalHostShadowNode.class;
    }

    public ModalViewManager(ReactContext reactContext2) {
        Intrinsics.checkNotNullParameter(reactContext2, "reactContext");
        this.reactContext = reactContext2;
    }

    public final ReactContext getReactContext() {
        return this.reactContext;
    }

    private final Navigator getNavigator() {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        NavigationActivity navigationActivity = currentActivity instanceof NavigationActivity ? (NavigationActivity) currentActivity : null;
        if (navigationActivity == null || navigationActivity.isFinishing() || navigationActivity.isDestroyed()) {
            return null;
        }
        return navigationActivity.getNavigator();
    }

    /* access modifiers changed from: protected */
    public ModalHostLayout createViewInstance(ThemedReactContext themedReactContext) {
        Intrinsics.checkNotNullParameter(themedReactContext, "reactContext");
        return new ModalHostLayout(themedReactContext);
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new ModalHostShadowNode();
    }

    public void onDropViewInstance(ModalHostLayout modalHostLayout) {
        Intrinsics.checkNotNullParameter(modalHostLayout, "modal");
        super.onDropViewInstance(modalHostLayout);
        Navigator navigator = getNavigator();
        if (navigator != null) {
            navigator.dismissModal(modalHostLayout.getViewController().getId(), new CommandListenerAdapter());
            modalHostLayout.onDropInstance();
        }
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(ModalHostLayout modalHostLayout) {
        Intrinsics.checkNotNullParameter(modalHostLayout, "modal");
        super.onAfterUpdateTransaction(modalHostLayout);
        Navigator navigator = getNavigator();
        if (navigator != null) {
            navigator.showModal(modalHostLayout.getViewController(), new CommandListenerAdapter(new ModalViewManager$onAfterUpdateTransaction$1(modalHostLayout)));
        }
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put("topRequestClose", MapBuilder.of("registrationName", "onRequestClose")).put("topShow", MapBuilder.of("registrationName", "onShow")).build();
    }

    @ReactProp(name = "animation")
    public final void setAnimation(ModalHostLayout modalHostLayout, ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(modalHostLayout, "modal");
        Intrinsics.checkNotNullParameter(readableMap, "animation");
        ModalLayoutController viewController = modalHostLayout.getViewController();
        Options options = new Options();
        JSONObject parse = this.jsonParser.parse(readableMap);
        TransitionAnimationOptions parseTransitionAnimationOptions = TransitionAnimationOptionsKt.parseTransitionAnimationOptions(parse.optJSONObject("showModal"));
        TransitionAnimationOptions parseTransitionAnimationOptions2 = TransitionAnimationOptionsKt.parseTransitionAnimationOptions(parse.optJSONObject("dismissModal"));
        options.animations.showModal = parseTransitionAnimationOptions;
        options.animations.dismissModal = parseTransitionAnimationOptions2;
        viewController.mergeOptions(options);
    }

    @ReactProp(name = "blurOnUnmount")
    public final void setBlurOnUnmount(ModalHostLayout modalHostLayout, boolean z) {
        Intrinsics.checkNotNullParameter(modalHostLayout, "modal");
        ModalLayoutController viewController = modalHostLayout.getViewController();
        Options options = new Options();
        options.modal.blurOnUnmount = new Bool(Boolean.valueOf(z));
        viewController.mergeOptions(options);
    }

    @ReactProp(name = "transparent")
    public final void setTransparent(ModalHostLayout modalHostLayout, boolean z) {
        Intrinsics.checkNotNullParameter(modalHostLayout, "modal");
        ModalLayoutController viewController = modalHostLayout.getViewController();
        Options options = new Options();
        options.modal.presentationStyle = z ? ModalPresentationStyle.OverCurrentContext : ModalPresentationStyle.None;
        viewController.mergeOptions(options);
    }
}
