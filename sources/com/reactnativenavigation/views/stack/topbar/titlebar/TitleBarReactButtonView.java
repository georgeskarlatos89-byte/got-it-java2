package com.reactnativenavigation.views.stack.topbar.titlebar;

import android.content.Context;
import android.view.View;
import com.facebook.react.ReactInstanceManager;
import com.reactnativenavigation.options.ComponentOptions;
import com.reactnativenavigation.options.params.Number;
import com.reactnativenavigation.react.ReactView;
import com.reactnativenavigation.utils.UiUtils;

public class TitleBarReactButtonView extends ReactView {
    private final ComponentOptions component;

    public TitleBarReactButtonView(Context context, ReactInstanceManager reactInstanceManager, ComponentOptions componentOptions) {
        super(context, reactInstanceManager, (String) componentOptions.componentId.get(), (String) componentOptions.name.get());
        this.component = componentOptions;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!isAttachedToWindow() || getReactInstanceManager() == null) {
            setId(-1);
        }
        super.onMeasure(createSpec(i, this.component.width), createSpec(i2, this.component.height));
    }

    private int createSpec(int i, Number number) {
        if (number.hasValue()) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(UiUtils.dpToPx(getContext(), ((Integer) number.get()).intValue())), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
    }
}
