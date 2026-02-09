package com.reactnativenavigation.viewcontrollers.stack.topbar;

import android.app.Activity;
import com.reactnativenavigation.options.ComponentOptions;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.react.events.ComponentType;
import com.reactnativenavigation.utils.CompatUtils;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.YellowBoxDelegate;
import com.reactnativenavigation.viewcontrollers.viewcontroller.overlay.ViewControllerOverlay;
import com.reactnativenavigation.views.stack.topbar.TopBarBackgroundView;
import com.reactnativenavigation.views.stack.topbar.TopBarBackgroundViewCreator;

public class TopBarBackgroundViewController extends ViewController<TopBarBackgroundView> {
    private ComponentOptions component;
    private TopBarBackgroundViewCreator viewCreator;

    public void sendOnNavigationButtonPressed(String str) {
    }

    public TopBarBackgroundViewController(Activity activity, TopBarBackgroundViewCreator topBarBackgroundViewCreator) {
        super(activity, CompatUtils.generateViewId() + "", new YellowBoxDelegate(activity), new Options(), new ViewControllerOverlay(activity));
        this.viewCreator = topBarBackgroundViewCreator;
    }

    public TopBarBackgroundView createView() {
        return this.viewCreator.create(getActivity(), (String) this.component.componentId.get(), (String) this.component.name.get());
    }

    public void onViewWillAppear() {
        ((TopBarBackgroundView) getView()).sendComponentWillStart(ComponentType.Background);
        super.onViewWillAppear();
        ((TopBarBackgroundView) getView()).sendComponentStart(ComponentType.Background);
    }

    public void onViewDisappear() {
        ((TopBarBackgroundView) getView()).sendComponentStop(ComponentType.Background);
        super.onViewDisappear();
    }

    public String getCurrentComponentName() {
        return (String) this.component.name.get();
    }

    public void setComponent(ComponentOptions componentOptions) {
        this.component = componentOptions;
    }

    public ComponentOptions getComponent() {
        return this.component;
    }
}
