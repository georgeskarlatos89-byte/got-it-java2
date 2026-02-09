package com.reactnativenavigation.viewcontrollers.overlay;

import android.content.res.Configuration;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.utils.CoordinatorLayoutUtils;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.BehaviourDelegate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\u000bJ\"\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u001d\u001a\u00020\u001eR\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/overlay/OverlayManager;", "", "()V", "isEmpty", "", "()Z", "overlayRegistry", "", "", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;", "destroy", "", "overlaysContainer", "Landroid/view/ViewGroup;", "destroyOverlay", "overlay", "dismiss", "componentId", "listener", "Lcom/reactnativenavigation/react/CommandListener;", "dismissAll", "findControllerById", "id", "onConfigurationChanged", "configuration", "Landroid/content/res/Configuration;", "onHostPause", "onHostResume", "show", "size", "", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: OverlayManager.kt */
public final class OverlayManager {
    private final Map<String, ViewController<?>> overlayRegistry = new LinkedHashMap();

    public final void show(ViewGroup viewGroup, ViewController<?> viewController, CommandListener commandListener) {
        Intrinsics.checkNotNullParameter(viewGroup, "overlaysContainer");
        Intrinsics.checkNotNullParameter(viewController, "overlay");
        Intrinsics.checkNotNullParameter(commandListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        viewGroup.setVisibility(0);
        Map<String, ViewController<?>> map = this.overlayRegistry;
        String id = viewController.getId();
        Intrinsics.checkNotNullExpressionValue(id, "overlay.id");
        map.put(id, viewController);
        viewController.addOnAppearedListener(new OverlayManager$$ExternalSyntheticLambda0(viewController, commandListener));
        viewGroup.addView(viewController.getView(), CoordinatorLayoutUtils.matchParentWithBehaviour(new BehaviourDelegate(viewController)));
    }

    /* access modifiers changed from: private */
    public static final void show$lambda$0(ViewController viewController, CommandListener commandListener) {
        Intrinsics.checkNotNullParameter(viewController, "$overlay");
        Intrinsics.checkNotNullParameter(commandListener, "$listener");
        viewController.onViewDidAppear();
        commandListener.onSuccess(viewController.getId());
    }

    public final void onConfigurationChanged(Configuration configuration) {
        for (ViewController onConfigurationChanged : this.overlayRegistry.values()) {
            onConfigurationChanged.onConfigurationChanged(configuration);
        }
    }

    public final void dismiss(ViewGroup viewGroup, String str, CommandListener commandListener) {
        Intrinsics.checkNotNullParameter(viewGroup, "overlaysContainer");
        Intrinsics.checkNotNullParameter(str, "componentId");
        Intrinsics.checkNotNullParameter(commandListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ViewController remove = this.overlayRegistry.remove(str);
        if (remove == null) {
            commandListener.onError("Could not dismiss Overlay. Overlay with id " + str + " was not found.");
            return;
        }
        destroyOverlay(viewGroup, remove);
        commandListener.onSuccess(str);
    }

    public final void dismissAll(ViewGroup viewGroup, CommandListener commandListener) {
        Intrinsics.checkNotNullParameter(viewGroup, "overlaysContainer");
        Intrinsics.checkNotNullParameter(commandListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        destroy(viewGroup);
        commandListener.onSuccess("");
    }

    public final void destroy(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "overlaysContainer");
        Iterable<ViewController> values = this.overlayRegistry.values();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
        for (ViewController viewController : values) {
            destroyOverlay(viewGroup, viewController);
            arrayList.add(viewController.getId());
        }
        for (String remove : CollectionsKt.toList((List) arrayList)) {
            this.overlayRegistry.remove(remove);
        }
    }

    public final int size() {
        return this.overlayRegistry.size();
    }

    public final ViewController<?> findControllerById(String str) {
        return this.overlayRegistry.get(str);
    }

    private final void destroyOverlay(ViewGroup viewGroup, ViewController<?> viewController) {
        viewController.destroy();
        if (isEmpty()) {
            viewGroup.setVisibility(8);
        }
    }

    private final boolean isEmpty() {
        return size() == 0;
    }

    public final void onHostPause() {
        for (ViewController onViewDisappear : this.overlayRegistry.values()) {
            onViewDisappear.onViewDisappear();
        }
    }

    public final void onHostResume() {
        for (ViewController onViewDidAppear : this.overlayRegistry.values()) {
            onViewDidAppear.onViewDidAppear();
        }
    }
}
