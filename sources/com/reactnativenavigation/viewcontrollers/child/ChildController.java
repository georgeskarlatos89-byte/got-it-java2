package com.reactnativenavigation.viewcontrollers.child;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.viewcontrollers.navigator.Navigator;
import com.reactnativenavigation.viewcontrollers.parent.ParentController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.NoOpYellowBoxDelegate;
import com.reactnativenavigation.viewcontrollers.viewcontroller.Presenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.overlay.ViewControllerOverlay;
import com.reactnativenavigation.views.component.Component;

public abstract class ChildController<T extends ViewGroup> extends ViewController<T> {
    private final ChildControllersRegistry childRegistry;
    private final Presenter presenter;

    /* access modifiers changed from: protected */
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return windowInsetsCompat;
    }

    public ChildControllersRegistry getChildRegistry() {
        return this.childRegistry;
    }

    public ChildController(Activity activity, ChildControllersRegistry childControllersRegistry, String str, Presenter presenter2, Options options) {
        super(activity, str, new NoOpYellowBoxDelegate(activity), options, new ViewControllerOverlay(activity));
        this.presenter = presenter2;
        this.childRegistry = childControllersRegistry;
    }

    public T getView() {
        if (this.view == null) {
            super.getView();
            this.view.setFitsSystemWindows(true);
            ViewCompat.setOnApplyWindowInsetsListener(this.view, new ChildController$$ExternalSyntheticLambda1(this));
        }
        return this.view;
    }

    public void setDefaultOptions(Options options) {
        this.presenter.setDefaultOptions(options);
    }

    public void onViewWillAppear() {
        super.onViewWillAppear();
        this.childRegistry.onViewAppeared(this);
    }

    public void onViewDisappear() {
        super.onViewDisappear();
        this.childRegistry.onViewDisappear(this);
    }

    public void onViewBroughtToFront() {
        this.presenter.onViewBroughtToFront(this, resolveCurrentOptions());
    }

    public void applyOptions(Options options) {
        super.applyOptions(options);
        this.presenter.applyOptions(this, resolveCurrentOptions());
    }

    public void mergeOptions(Options options) {
        if (options != Options.EMPTY) {
            if (isViewShown()) {
                this.presenter.mergeOptions(this, options);
            }
            super.mergeOptions(options);
            performOnParentController(new ChildController$$ExternalSyntheticLambda2(this, options));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$mergeOptions$0$com-reactnativenavigation-viewcontrollers-child-ChildController  reason: not valid java name */
    public /* synthetic */ void m1000lambda$mergeOptions$0$comreactnativenavigationviewcontrollerschildChildController(Options options, ParentController parentController) {
        parentController.mergeChildOptions(options, this);
    }

    public void destroy() {
        if (!isDestroyed() && (getView() instanceof Component)) {
            performOnParentController(new ChildController$$ExternalSyntheticLambda0(this));
        }
        super.destroy();
        this.childRegistry.onChildDestroyed(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$destroy$1$com-reactnativenavigation-viewcontrollers-child-ChildController  reason: not valid java name */
    public /* synthetic */ void m999lambda$destroy$1$comreactnativenavigationviewcontrollerschildChildController(ParentController parentController) {
        parentController.onChildDestroyed(this);
    }

    public boolean isRoot() {
        return getParentController() == null && !(this instanceof Navigator) && getView().getParent() != null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.presenter.onConfigurationChanged(this, this.options);
    }
}
