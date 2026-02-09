package com.reactnativenavigation.views.stack.topbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class ScrollDIsabledBehavior extends AppBarLayout.Behavior {
    public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public ScrollDIsabledBehavior() {
        setDragCallback(new AppBarLayout.Behavior.DragCallback() {
            public boolean canDrag(AppBarLayout appBarLayout) {
                return false;
            }
        });
    }
}
