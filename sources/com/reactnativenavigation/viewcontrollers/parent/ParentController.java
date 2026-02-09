package com.reactnativenavigation.viewcontrollers.parent;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.utils.ObjectUtils;
import com.reactnativenavigation.viewcontrollers.bottomtabs.BottomTabsController;
import com.reactnativenavigation.viewcontrollers.child.ChildController;
import com.reactnativenavigation.viewcontrollers.child.ChildControllersRegistry;
import com.reactnativenavigation.viewcontrollers.viewcontroller.Presenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.component.Component;
import java.util.Collection;

public abstract class ParentController<T extends ViewGroup> extends ChildController<T> {
    public void clearTopTabs() {
    }

    public abstract T createView();

    public abstract Collection<? extends ViewController<?>> getChildControllers();

    public abstract ViewController<?> getCurrentChild();

    public void mergeChildOptions(Options options, ViewController<?> viewController) {
    }

    public void onChildDestroyed(ViewController<?> viewController) {
    }

    public void setupTopTabsWithViewPager(ViewPager viewPager) {
    }

    public ParentController(Activity activity, ChildControllersRegistry childControllersRegistry, String str, Presenter presenter, Options options) {
        super(activity, childControllersRegistry, str, presenter, options);
    }

    public void setWaitForRender(Bool bool) {
        super.setWaitForRender(bool);
        applyOnController(getCurrentChild(), new ParentController$$ExternalSyntheticLambda5(bool));
    }

    public void setDefaultOptions(Options options) {
        super.setDefaultOptions(options);
        CollectionUtils.forEach(getChildControllers(), new ParentController$$ExternalSyntheticLambda1(options));
    }

    public void onViewDidAppear() {
        super.onViewDidAppear();
        ViewController<?> currentChild = getCurrentChild();
        if (currentChild != null) {
            currentChild.onViewDidAppear();
        }
    }

    public void onViewDisappear() {
        super.onViewDisappear();
        ViewController<?> currentChild = getCurrentChild();
        if (currentChild != null) {
            currentChild.onViewDisappear();
        }
    }

    public Options resolveCurrentOptions() {
        if (CollectionUtils.isNullOrEmpty(getChildControllers())) {
            return this.initialOptions;
        }
        return getCurrentChild().resolveCurrentOptions().copy().withDefaultOptions(this.initialOptions);
    }

    public Options resolveChildOptions(ViewController<?> viewController) {
        if (viewController == this) {
            return resolveCurrentOptions();
        }
        return viewController.resolveCurrentOptions().copy().withDefaultOptions(this.initialOptions);
    }

    public Options resolveCurrentOptions(Options options) {
        return resolveCurrentOptions().withDefaultOptions(options);
    }

    public boolean isCurrentChild(ViewController<?> viewController) {
        return getCurrentChild() == viewController;
    }

    /* access modifiers changed from: protected */
    public BottomTabsController getBottomTabsController() {
        if (this instanceof BottomTabsController) {
            return (BottomTabsController) this;
        }
        return (BottomTabsController) ObjectUtils.perform(getParentController(), null, new ParentController$$ExternalSyntheticLambda2());
    }

    public ViewController<?> findController(String str) {
        ViewController<?> findController = super.findController(str);
        if (findController != null) {
            return findController;
        }
        for (ViewController findController2 : getChildControllers()) {
            ViewController<?> findController3 = findController2.findController(str);
            if (findController3 != null) {
                return findController3;
            }
        }
        return null;
    }

    public ViewController<?> findController(View view) {
        ViewController<?> findController = super.findController(view);
        if (findController != null) {
            return findController;
        }
        for (ViewController findController2 : getChildControllers()) {
            ViewController<?> findController3 = findController2.findController(view);
            if (findController3 != null) {
                return findController3;
            }
        }
        return null;
    }

    public boolean containsComponent(Component component) {
        if (super.containsComponent(component)) {
            return true;
        }
        for (ViewController containsComponent : getChildControllers()) {
            if (containsComponent.containsComponent(component)) {
                return true;
            }
        }
        return false;
    }

    public void applyChildOptions(Options options, ViewController<?> viewController) {
        this.options = this.initialOptions.mergeWith(options);
    }

    public void destroy() {
        super.destroy();
        CollectionUtils.forEach(getChildControllers(), new ParentController$$ExternalSyntheticLambda7());
    }

    public void clearOptions() {
        performOnParentController(new ParentController$$ExternalSyntheticLambda4());
        this.options = this.initialOptions.copy().clearOneTimeOptions();
    }

    public boolean isRendered() {
        return getCurrentChild() != null && getCurrentChild().isRendered();
    }

    public void applyTopInset() {
        CollectionUtils.forEach(getChildControllers(), new ParentController$$ExternalSyntheticLambda8());
    }

    public int getTopInset(ViewController<?> viewController) {
        return ((Integer) ObjectUtils.perform(getParentController(), 0, new ParentController$$ExternalSyntheticLambda3(viewController))).intValue();
    }

    public void applyBottomInset() {
        CollectionUtils.forEach(getChildControllers(), new ParentController$$ExternalSyntheticLambda0());
    }

    public int getBottomInset(ViewController<?> viewController) {
        return ((Integer) ObjectUtils.perform(getParentController(), 0, new ParentController$$ExternalSyntheticLambda6(viewController))).intValue();
    }

    public String getCurrentComponentName() {
        return getCurrentChild().getCurrentComponentName();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (ViewController viewController : getChildControllers()) {
            if (viewController.isViewShown()) {
                viewController.onConfigurationChanged(configuration);
            }
        }
    }
}
