package com.reactnativenavigation.react;

import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.reactnativenavigation.options.LayoutFactory;
import com.reactnativenavigation.react.modal.ModalViewManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/reactnativenavigation/react/NavigationPackage;", "Lcom/facebook/react/ReactPackage;", "reactNativeHost", "Lcom/facebook/react/ReactNativeHost;", "(Lcom/facebook/react/ReactNativeHost;)V", "createNativeModules", "", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createViewManagers", "Lcom/facebook/react/uimanager/ViewManager;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigationPackage.kt */
public final class NavigationPackage implements ReactPackage {
    private final ReactNativeHost reactNativeHost;

    public NavigationPackage(ReactNativeHost reactNativeHost2) {
        Intrinsics.checkNotNullParameter(reactNativeHost2, "reactNativeHost");
        this.reactNativeHost = reactNativeHost2;
    }

    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactContext");
        return CollectionsKt.listOf(new NavigationModule(reactApplicationContext, this.reactNativeHost.getReactInstanceManager(), new LayoutFactory(this.reactNativeHost.getReactInstanceManager())));
    }

    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactContext");
        return CollectionsKt.listOf(new ModalViewManager(reactApplicationContext));
    }
}
