package com.reactnativenavigation.viewcontrollers.stack.topbar.title;

import android.app.Activity;
import com.reactnativenavigation.options.ComponentOptions;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.react.events.ComponentType;
import com.reactnativenavigation.utils.CompatUtils;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.YellowBoxDelegate;
import com.reactnativenavigation.viewcontrollers.viewcontroller.overlay.ViewControllerOverlay;
import com.reactnativenavigation.views.stack.topbar.titlebar.TitleBarReactView;
import com.reactnativenavigation.views.stack.topbar.titlebar.TitleBarReactViewCreator;

public class TitleBarReactViewController extends ViewController<TitleBarReactView> {
    private final ComponentOptions component;
    private final TitleBarReactViewCreator reactViewCreator;

    public String getCurrentComponentName() {
        return null;
    }

    public void sendOnNavigationButtonPressed(String str) {
    }

    public ComponentOptions getComponent() {
        return this.component;
    }

    public TitleBarReactViewController(Activity activity, TitleBarReactViewCreator titleBarReactViewCreator, ComponentOptions componentOptions) {
        super(activity, CompatUtils.generateViewId() + "", new YellowBoxDelegate(activity), new Options(), new ViewControllerOverlay(activity));
        this.reactViewCreator = titleBarReactViewCreator;
        this.component = componentOptions;
    }

    public void onViewWillAppear() {
        if (!isDestroyed()) {
            ((TitleBarReactView) getView()).sendComponentWillStart(ComponentType.Title);
        }
        super.onViewWillAppear();
        if (!isDestroyed()) {
            runOnPreDraw(new TitleBarReactViewController$$ExternalSyntheticLambda0());
            ((TitleBarReactView) getView()).sendComponentStart(ComponentType.Title);
        }
    }

    public void onViewDisappear() {
        ((TitleBarReactView) getView()).sendComponentStop(ComponentType.Title);
        super.onViewDisappear();
    }

    public TitleBarReactView createView() {
        return this.reactViewCreator.create(getActivity(), (String) this.component.componentId.get(), (String) this.component.name.get());
    }
}
