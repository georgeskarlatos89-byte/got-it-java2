package com.reactnativenavigation.viewcontrollers.component;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.utils.ObjectUtils;
import com.reactnativenavigation.utils.SystemUiUtils;
import com.reactnativenavigation.viewcontrollers.child.ChildController;
import com.reactnativenavigation.viewcontrollers.child.ChildControllersRegistry;
import com.reactnativenavigation.viewcontrollers.parent.ParentController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.Presenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ReactViewCreator;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ScrollEventListener;
import com.reactnativenavigation.views.component.ComponentLayout;

public class ComponentViewController extends ChildController<ComponentLayout> {
    private final String componentName;
    private VisibilityState lastVisibilityState = VisibilityState.Disappear;
    private final ComponentPresenter presenter;
    private final ReactViewCreator viewCreator;

    private enum VisibilityState {
        Appear,
        Disappear
    }

    public ComponentViewController(Activity activity, ChildControllersRegistry childControllersRegistry, String str, String str2, ReactViewCreator reactViewCreator, Options options, Presenter presenter2, ComponentPresenter componentPresenter) {
        super(activity, childControllersRegistry, str, presenter2, options);
        this.componentName = str2;
        this.viewCreator = reactViewCreator;
        this.presenter = componentPresenter;
    }

    public void start() {
        if (!isDestroyed()) {
            ((ComponentLayout) getView()).start();
        }
    }

    public String getCurrentComponentName() {
        return this.componentName;
    }

    public void setDefaultOptions(Options options) {
        super.setDefaultOptions(options);
        this.presenter.setDefaultOptions(options);
    }

    public ScrollEventListener getScrollEventListener() {
        return (ScrollEventListener) ObjectUtils.perform((ComponentLayout) this.view, null, new ComponentViewController$$ExternalSyntheticLambda1());
    }

    public void onViewWillAppear() {
        super.onViewWillAppear();
        if (this.view != null) {
            ((ComponentLayout) this.view).sendComponentWillStart();
        }
    }

    public void onViewDidAppear() {
        if (this.view != null) {
            ((ComponentLayout) this.view).sendComponentWillStart();
        }
        super.onViewDidAppear();
        if (this.view != null) {
            ((ComponentLayout) this.view).requestApplyInsets();
        }
        if (this.view != null && this.lastVisibilityState == VisibilityState.Disappear) {
            ((ComponentLayout) this.view).sendComponentStart();
        }
        this.lastVisibilityState = VisibilityState.Appear;
    }

    public void onViewDisappear() {
        if (this.lastVisibilityState != VisibilityState.Disappear) {
            this.lastVisibilityState = VisibilityState.Disappear;
            if (this.view != null) {
                ((ComponentLayout) this.view).sendComponentStop();
            }
            super.onViewDisappear();
        }
    }

    public void sendOnNavigationButtonPressed(String str) {
        ((ComponentLayout) getView()).sendOnNavigationButtonPressed(str);
    }

    public void applyOptions(Options options) {
        if (isRoot()) {
            applyTopInset();
        }
        super.applyOptions(options);
        ((ComponentLayout) getView()).applyOptions(options);
        this.presenter.applyOptions((ComponentLayout) getView(), resolveCurrentOptions(this.presenter.defaultOptions));
    }

    public boolean isViewShown() {
        return super.isViewShown() && this.view != null && ((ComponentLayout) this.view).isReady();
    }

    public ComponentLayout createView() {
        return (ComponentLayout) ((ComponentLayout) this.viewCreator.create(getActivity(), getId(), this.componentName)).asView();
    }

    public void mergeOptions(Options options) {
        if (options != Options.EMPTY) {
            if (isViewShown()) {
                this.presenter.mergeOptions((ComponentLayout) getView(), options);
            }
            super.mergeOptions(options);
        }
    }

    public void applyTopInset() {
        if (this.view != null) {
            this.presenter.applyTopInsets(this.view, getTopInset());
        }
    }

    public int getTopInset() {
        int i;
        if (resolveCurrentOptions(this.presenter.defaultOptions).statusBar.isHiddenOrDrawBehind()) {
            i = 0;
        } else {
            i = SystemUiUtils.getStatusBarHeight(getActivity());
        }
        return i + ((Integer) ObjectUtils.perform(getParentController(), 0, new ComponentViewController$$ExternalSyntheticLambda0(this))).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getTopInset$0$com-reactnativenavigation-viewcontrollers-component-ComponentViewController  reason: not valid java name */
    public /* synthetic */ Integer m1001lambda$getTopInset$0$comreactnativenavigationviewcontrollerscomponentComponentViewController(ParentController parentController) {
        return Integer.valueOf(parentController.getTopInset(this));
    }

    public void applyBottomInset() {
        if (this.view != null) {
            this.presenter.applyBottomInset(this.view, getBottomInset());
        }
    }

    /* access modifiers changed from: protected */
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        ViewCompat.onApplyWindowInsets(view, new WindowInsetsCompat.Builder().setInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime(), Insets.of(insets.left, (windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars()).top + windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).top) - insets.top, insets.right, Math.max(((windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom + windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom) - insets.bottom) - getBottomInset(), 0))).build());
        return windowInsetsCompat;
    }

    public void destroy() {
        if (this.options != null && this.options.modal.blurOnUnmount.isTrue()) {
            blurActivityFocus();
        }
        super.destroy();
    }

    private void blurActivityFocus() {
        Activity activity = getActivity();
        View currentFocus = activity != null ? activity.getCurrentFocus() : null;
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.presenter.onConfigurationChanged((ComponentLayout) this.view, this.options);
    }
}
