package com.reactnativenavigation.views.bottomtabs;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.views.BehaviourAdapter;
import com.reactnativenavigation.views.BehaviourDelegate;

public class BottomTabsBehaviour extends BehaviourDelegate {
    public BottomTabsBehaviour(BehaviourAdapter behaviourAdapter) {
        super(behaviourAdapter);
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, View view) {
        return view instanceof BottomTabsContainer;
    }
}
