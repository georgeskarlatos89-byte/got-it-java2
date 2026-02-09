package com.reactnativenavigation.viewcontrollers.bottomtabs.attacher.modes;

import android.view.ViewGroup;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.viewcontrollers.bottomtabs.BottomTabsPresenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import java.util.List;

public class OnSwitchToTab extends AttachMode {
    public OnSwitchToTab(ViewGroup viewGroup, List<ViewController<?>> list, BottomTabsPresenter bottomTabsPresenter, Options options) {
        super(viewGroup, list, bottomTabsPresenter, options);
    }

    public void attach() {
        attach(this.initialTab);
    }

    public void onTabSelected(ViewController<?> viewController) {
        if (viewController != this.initialTab && isNotAttached(viewController)) {
            attach(viewController);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isNotAttached(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r1) {
        /*
            r0 = this;
            android.view.ViewGroup r1 = r1.getView()
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != 0) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.bottomtabs.attacher.modes.OnSwitchToTab.isNotAttached(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController):boolean");
    }
}
