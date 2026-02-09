package com.reactnativenavigation.viewcontrollers.child;

import com.reactnativenavigation.utils.ObjectUtils;
import java.util.ArrayDeque;

public class ChildControllersRegistry {
    private ArrayDeque<ChildController<?>> children = new ArrayDeque<>();

    public void onViewAppeared(ChildController<?> childController) {
        this.children.push(childController);
    }

    public void onViewDisappear(ChildController<?> childController) {
        if (isTopChild(childController)) {
            this.children.pop();
            if (!this.children.isEmpty()) {
                this.children.peek().onViewBroughtToFront();
                return;
            }
            return;
        }
        this.children.remove(childController);
    }

    private boolean isTopChild(ChildController<?> childController) {
        return ((Boolean) ObjectUtils.perform(this.children.peek(), false, new ChildControllersRegistry$$ExternalSyntheticLambda0(childController))).booleanValue();
    }

    public int size() {
        return this.children.size();
    }

    public void onChildDestroyed(ChildController<?> childController) {
        this.children.remove(childController);
    }
}
