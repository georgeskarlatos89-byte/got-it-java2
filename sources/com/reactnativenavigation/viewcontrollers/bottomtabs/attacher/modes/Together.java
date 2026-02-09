package com.reactnativenavigation.viewcontrollers.bottomtabs.attacher.modes;

import android.view.ViewGroup;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.viewcontrollers.bottomtabs.BottomTabsPresenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import java.util.List;

public class Together extends AttachMode {
    public Together(ViewGroup viewGroup, List<ViewController<?>> list, BottomTabsPresenter bottomTabsPresenter, Options options) {
        super(viewGroup, list, bottomTabsPresenter, options);
    }

    public void attach() {
        CollectionUtils.forEach(this.tabs, new Together$$ExternalSyntheticLambda0(this));
    }
}
