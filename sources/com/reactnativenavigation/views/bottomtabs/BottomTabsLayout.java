package com.reactnativenavigation.views.bottomtabs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class BottomTabsLayout extends CoordinatorLayout {
    private BottomTabsContainer bottomTabsContainer;

    public BottomTabsLayout(Context context) {
        super(context);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        BottomTabsContainer bottomTabsContainer2 = this.bottomTabsContainer;
        if (bottomTabsContainer2 == null || view == bottomTabsContainer2) {
            super.addView(view, 0, layoutParams);
        } else {
            super.addView(view, getChildCount() - 1, layoutParams);
        }
    }

    public void addBottomTabsContainer(BottomTabsContainer bottomTabsContainer2) {
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        addView(bottomTabsContainer2, layoutParams);
        this.bottomTabsContainer = bottomTabsContainer2;
    }
}
