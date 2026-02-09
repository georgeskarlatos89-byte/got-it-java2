package com.reactnativenavigation.views;

import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.views.component.Component;

public class ExternalComponentLayout extends CoordinatorLayout implements Component {
    public ExternalComponentLayout(Context context) {
        super(context);
    }

    public boolean isRendered() {
        return getChildCount() >= 1;
    }
}
