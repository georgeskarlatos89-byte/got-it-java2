package com.reactnativenavigation.viewcontrollers.viewcontroller;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.ReactInstanceManager;
import com.reactnativenavigation.hierarchy.root.RootAnimator;
import com.reactnativenavigation.options.AnimationOptions;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.utils.CoordinatorLayoutUtils;
import com.reactnativenavigation.views.BehaviourDelegate;

public class RootPresenter {
    private final RootAnimator animator;
    private final LayoutDirectionApplier layoutDirectionApplier;
    private CoordinatorLayout rootLayout;

    public void setRootContainer(CoordinatorLayout coordinatorLayout) {
        this.rootLayout = coordinatorLayout;
    }

    public RootPresenter() {
        this(new RootAnimator(), new LayoutDirectionApplier());
    }

    public RootPresenter(RootAnimator rootAnimator, LayoutDirectionApplier layoutDirectionApplier2) {
        this.animator = rootAnimator;
        this.layoutDirectionApplier = layoutDirectionApplier2;
    }

    public void setRoot(ViewController viewController, ViewController<?> viewController2, Options options, CommandListener commandListener, ReactInstanceManager reactInstanceManager) {
        this.layoutDirectionApplier.apply(viewController, options, reactInstanceManager);
        this.rootLayout.addView(viewController.getView(), CoordinatorLayoutUtils.matchParentWithBehaviour(new BehaviourDelegate(viewController)));
        Options resolveCurrentOptions = viewController.resolveCurrentOptions(options);
        AnimationOptions enter = resolveCurrentOptions.animations.setRoot.getEnter();
        viewController.setWaitForRender(enter.waitForRender);
        if (enter.waitForRender.isTrue()) {
            viewController.getView().setAlpha(0.0f);
            viewController.addOnAppearedListener(new RootPresenter$$ExternalSyntheticLambda0(this, viewController, commandListener, viewController2, resolveCurrentOptions));
            return;
        }
        animateSetRootAndReportSuccess(viewController, viewController2, commandListener, resolveCurrentOptions);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setRoot$0$com-reactnativenavigation-viewcontrollers-viewcontroller-RootPresenter  reason: not valid java name */
    public /* synthetic */ void m1034lambda$setRoot$0$comreactnativenavigationviewcontrollersviewcontrollerRootPresenter(ViewController viewController, CommandListener commandListener, ViewController viewController2, Options options) {
        if (viewController.isDestroyed()) {
            commandListener.onError("Could not set root - Waited for the view to become visible but it was destroyed");
            return;
        }
        viewController.getView().setAlpha(1.0f);
        animateSetRootAndReportSuccess(viewController, viewController2, commandListener, options);
    }

    private void animateSetRootAndReportSuccess(ViewController viewController, ViewController viewController2, CommandListener commandListener, Options options) {
        AnimationOptions exit = options.animations.setRoot.getExit();
        AnimationOptions enter = options.animations.setRoot.getEnter();
        if ((!enter.enabled.isTrueOrUndefined() || !enter.hasAnimation()) && (viewController2 == null || !exit.enabled.isTrueOrUndefined() || !exit.hasAnimation())) {
            commandListener.onSuccess(viewController.getId());
        } else {
            this.animator.setRoot(viewController, viewController2, options.animations.setRoot, new RootPresenter$$ExternalSyntheticLambda1(commandListener, viewController));
        }
    }
}
