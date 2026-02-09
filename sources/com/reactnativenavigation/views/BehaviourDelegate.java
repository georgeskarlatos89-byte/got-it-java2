package com.reactnativenavigation.views;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class BehaviourDelegate extends CoordinatorLayout.Behavior<ViewGroup> {
    private BehaviourAdapter delegate;

    public BehaviourDelegate(BehaviourAdapter behaviourAdapter) {
        this.delegate = behaviourAdapter;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, View view) {
        return this.delegate.onDependentViewChanged(coordinatorLayout, viewGroup, view);
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        return this.delegate.onMeasureChild(coordinatorLayout, viewGroup, i, i2, i3, i4);
    }
}
