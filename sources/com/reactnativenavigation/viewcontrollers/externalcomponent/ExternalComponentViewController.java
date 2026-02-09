package com.reactnativenavigation.viewcontrollers.externalcomponent;

import android.app.Activity;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.ReactInstanceManager;
import com.reactnativenavigation.options.ExternalComponent;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.react.events.ComponentType;
import com.reactnativenavigation.react.events.EventEmitter;
import com.reactnativenavigation.utils.CoordinatorLayoutUtils;
import com.reactnativenavigation.utils.ObjectUtils;
import com.reactnativenavigation.utils.SystemUiUtils;
import com.reactnativenavigation.viewcontrollers.child.ChildController;
import com.reactnativenavigation.viewcontrollers.child.ChildControllersRegistry;
import com.reactnativenavigation.viewcontrollers.parent.ParentController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.Presenter;
import com.reactnativenavigation.views.BehaviourDelegate;
import com.reactnativenavigation.views.ExternalComponentLayout;

public class ExternalComponentViewController extends ChildController<ExternalComponentLayout> {
    private final ExternalComponentCreator componentCreator;
    private final EventEmitter emitter;
    private final ExternalComponent externalComponent;
    private final ExternalComponentPresenter presenter;
    private ReactInstanceManager reactInstanceManager;

    static /* synthetic */ WindowInsetsCompat lambda$enableDrawingBehindStatusBar$1(View view, WindowInsetsCompat windowInsetsCompat) {
        return windowInsetsCompat;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExternalComponentViewController(Activity activity, ChildControllersRegistry childControllersRegistry, String str, Presenter presenter2, ExternalComponent externalComponent2, ExternalComponentCreator externalComponentCreator, ReactInstanceManager reactInstanceManager2, EventEmitter eventEmitter, ExternalComponentPresenter externalComponentPresenter, Options options) {
        super(activity, childControllersRegistry, str, presenter2, options);
        this.externalComponent = externalComponent2;
        this.componentCreator = externalComponentCreator;
        this.reactInstanceManager = reactInstanceManager2;
        this.emitter = eventEmitter;
        this.presenter = externalComponentPresenter;
    }

    public ExternalComponentLayout createView() {
        ExternalComponentLayout externalComponentLayout = new ExternalComponentLayout(getActivity());
        enableDrawingBehindStatusBar(externalComponentLayout);
        externalComponentLayout.addView(this.componentCreator.create(getActivity(), this.reactInstanceManager, this.externalComponent.passProps).asView(), CoordinatorLayoutUtils.matchParentWithBehaviour(new BehaviourDelegate(this)));
        return externalComponentLayout;
    }

    public void sendOnNavigationButtonPressed(String str) {
        this.emitter.emitOnNavigationButtonPressed(getId(), str);
    }

    public void onViewWillAppear() {
        this.emitter.emitComponentWillAppear(getId(), (String) this.externalComponent.name.get(), ComponentType.Component);
        super.onViewWillAppear();
        this.emitter.emitComponentDidAppear(getId(), (String) this.externalComponent.name.get(), ComponentType.Component);
    }

    public void onViewDisappear() {
        super.onViewDisappear();
        this.emitter.emitComponentDidDisappear(getId(), (String) this.externalComponent.name.get(), ComponentType.Component);
    }

    public void applyTopInset() {
        if (this.view != null) {
            this.presenter.applyTopInsets(this.view, getTopInset());
        }
    }

    public int getTopInset() {
        return (resolveCurrentOptions().statusBar.drawBehind.isTrue() ? 0 : SystemUiUtils.getStatusBarHeight(getActivity())) + ((Integer) ObjectUtils.perform(getParentController(), 0, new ExternalComponentViewController$$ExternalSyntheticLambda1(this))).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getTopInset$0$com-reactnativenavigation-viewcontrollers-externalcomponent-ExternalComponentViewController  reason: not valid java name */
    public /* synthetic */ Integer m1002lambda$getTopInset$0$comreactnativenavigationviewcontrollersexternalcomponentExternalComponentViewController(ParentController parentController) {
        return Integer.valueOf(parentController.getTopInset(this));
    }

    public void applyBottomInset() {
        if (this.view != null) {
            this.presenter.applyBottomInset(this.view, getBottomInset());
        }
    }

    public String getCurrentComponentName() {
        return (String) this.externalComponent.name.get();
    }

    public FragmentActivity getActivity() {
        return (FragmentActivity) super.getActivity();
    }

    private void enableDrawingBehindStatusBar(View view) {
        view.setFitsSystemWindows(true);
        ViewCompat.setOnApplyWindowInsetsListener(view, new ExternalComponentViewController$$ExternalSyntheticLambda0());
    }
}
