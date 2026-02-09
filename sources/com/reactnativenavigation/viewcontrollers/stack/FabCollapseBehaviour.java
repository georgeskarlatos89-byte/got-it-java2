package com.reactnativenavigation.viewcontrollers.stack;

import com.reactnativenavigation.viewcontrollers.viewcontroller.ScrollEventListener;

public class FabCollapseBehaviour implements ScrollEventListener.OnScrollListener, ScrollEventListener.OnDragListener {
    private FabAnimator fabAnimator;
    private ScrollEventListener scrollEventListener;

    public void onScrollDown(float f) {
    }

    public void onScrollUp(float f) {
    }

    public FabCollapseBehaviour(FabAnimator fabAnimator2) {
        this.fabAnimator = fabAnimator2;
    }

    public void enableCollapse(ScrollEventListener scrollEventListener2) {
        this.scrollEventListener = scrollEventListener2;
        scrollEventListener2.register((ScrollEventListener.ScrollAwareView) null, this, this);
    }

    public void disableCollapse() {
        ScrollEventListener scrollEventListener2 = this.scrollEventListener;
        if (scrollEventListener2 != null) {
            scrollEventListener2.unregister();
        }
    }

    public void onShow() {
        this.fabAnimator.show();
    }

    public void onHide() {
        this.fabAnimator.hide();
    }
}
