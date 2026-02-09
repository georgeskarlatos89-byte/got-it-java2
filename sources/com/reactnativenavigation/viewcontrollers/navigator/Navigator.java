package com.reactnativenavigation.viewcontrollers.navigator;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.ReactInstanceManager;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.react.CommandListenerAdapter;
import com.reactnativenavigation.react.events.EventEmitter;
import com.reactnativenavigation.utils.CompatUtils;
import com.reactnativenavigation.utils.Functions;
import com.reactnativenavigation.viewcontrollers.child.ChildControllersRegistry;
import com.reactnativenavigation.viewcontrollers.modal.ModalStack;
import com.reactnativenavigation.viewcontrollers.overlay.OverlayManager;
import com.reactnativenavigation.viewcontrollers.parent.ParentController;
import com.reactnativenavigation.viewcontrollers.stack.StackController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.Presenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.RootPresenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.overlay.RootOverlay;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Navigator extends ParentController<ViewGroup> {
    /* access modifiers changed from: private */
    public ViewGroup contentLayout;
    private Options defaultOptions = new Options();
    private final ModalStack modalStack;
    private final CoordinatorLayout modalsLayout;
    private final OverlayManager overlayManager;
    private final CoordinatorLayout overlaysLayout;
    private ViewController<?> previousRoot;
    /* access modifiers changed from: private */
    public ViewController<?> root;
    private final CoordinatorLayout rootLayout;
    private final RootPresenter rootPresenter;

    public void sendOnNavigationButtonPressed(String str) {
    }

    public void setDefaultOptions(Options options) {
        super.setDefaultOptions(options);
        this.defaultOptions = options;
        this.modalStack.setDefaultOptions(options);
    }

    public Options getDefaultOptions() {
        return this.defaultOptions;
    }

    /* access modifiers changed from: package-private */
    public CoordinatorLayout getRootLayout() {
        return this.rootLayout;
    }

    public void setEventEmitter(EventEmitter eventEmitter) {
        this.modalStack.setEventEmitter(eventEmitter);
    }

    public void setContentLayout(ViewGroup viewGroup) {
        this.contentLayout = viewGroup;
        viewGroup.addView(this.rootLayout);
        this.modalsLayout.setVisibility(8);
        viewGroup.addView(this.modalsLayout);
        this.overlaysLayout.setVisibility(8);
        viewGroup.addView(this.overlaysLayout);
    }

    public Navigator(Activity activity, ChildControllersRegistry childControllersRegistry, ModalStack modalStack2, OverlayManager overlayManager2, RootPresenter rootPresenter2) {
        super(activity, childControllersRegistry, "navigator" + CompatUtils.generateViewId(), new Presenter(activity, new Options()), new Options());
        this.modalStack = modalStack2;
        this.overlayManager = overlayManager2;
        this.rootPresenter = rootPresenter2;
        this.rootLayout = new CoordinatorLayout(getActivity());
        this.modalsLayout = new CoordinatorLayout(getActivity());
        this.overlaysLayout = new CoordinatorLayout(getActivity());
    }

    public void bindViews() {
        this.modalStack.setModalsLayout(this.modalsLayout);
        this.modalStack.setRootLayout(this.rootLayout);
        this.rootPresenter.setRootContainer(this.rootLayout);
    }

    public ViewGroup createView() {
        return this.rootLayout;
    }

    public Collection<ViewController<?>> getChildControllers() {
        ViewController<?> viewController = this.root;
        return viewController == null ? Collections.emptyList() : Collections.singletonList(viewController);
    }

    public boolean handleBack(CommandListener commandListener) {
        if (this.modalStack.isEmpty() && this.root == null) {
            return false;
        }
        if (this.modalStack.isEmpty()) {
            return this.root.handleBack(commandListener);
        }
        return this.modalStack.handleBack(commandListener, this.root);
    }

    public ViewController<?> getCurrentChild() {
        return this.root;
    }

    public void destroy() {
        destroyViews();
        super.destroy();
    }

    public void destroyViews() {
        this.modalStack.destroy();
        this.overlayManager.destroy(this.overlaysLayout);
        destroyRoot();
    }

    private void destroyRoot() {
        ViewController<?> viewController = this.root;
        if (viewController != null) {
            viewController.destroy();
        }
        this.root = null;
    }

    /* access modifiers changed from: private */
    public void destroyPreviousRoot() {
        ViewController<?> viewController = this.previousRoot;
        if (viewController != null) {
            viewController.destroy();
        }
        this.previousRoot = null;
    }

    public void setRoot(ViewController<?> viewController, CommandListener commandListener, ReactInstanceManager reactInstanceManager) {
        this.previousRoot = this.root;
        this.modalStack.destroy();
        final boolean isRootNotCreated = isRootNotCreated();
        if (isRootNotCreated()) {
            getView();
        }
        ViewController<?> viewController2 = this.previousRoot;
        this.root = viewController;
        viewController.setOverlay(new RootOverlay(getActivity(), this.contentLayout));
        this.root.setParentController(this);
        this.rootPresenter.setRoot(viewController, viewController2, this.defaultOptions, new CommandListenerAdapter(commandListener) {
            public void onSuccess(String str) {
                Navigator.this.root.onViewDidAppear();
                if (isRootNotCreated) {
                    Navigator.this.contentLayout.removeViewAt(0);
                }
                Navigator.this.destroyPreviousRoot();
                super.onSuccess(str);
            }
        }, reactInstanceManager);
    }

    public void mergeOptions(String str, Options options) {
        ViewController<?> findController = findController(str);
        if (findController != null) {
            findController.mergeOptions(options);
        }
    }

    public void push(String str, ViewController<?> viewController, CommandListener commandListener) {
        applyOnStack(str, commandListener, new Navigator$$ExternalSyntheticLambda4(viewController, commandListener));
    }

    public void setStackRoot(String str, List<ViewController<?>> list, CommandListener commandListener) {
        applyOnStack(str, commandListener, new Navigator$$ExternalSyntheticLambda3(list, commandListener));
    }

    public void pop(String str, Options options, CommandListener commandListener) {
        applyOnStack(str, commandListener, new Navigator$$ExternalSyntheticLambda1(options, commandListener));
    }

    public void popToRoot(String str, Options options, CommandListener commandListener) {
        applyOnStack(str, commandListener, new Navigator$$ExternalSyntheticLambda0(options, commandListener));
    }

    public void popTo(String str, Options options, CommandListener commandListener) {
        ViewController<?> findController = findController(str);
        if (findController != null) {
            findController.performOnParentStack(new Navigator$$ExternalSyntheticLambda2(findController, options, commandListener));
        } else {
            commandListener.onError("Failed to execute stack command. Stack by " + str + " not found.");
        }
    }

    public void showModal(ViewController<?> viewController, CommandListener commandListener) {
        this.modalStack.showModal(viewController, this.root, commandListener);
    }

    public void dismissModal(String str, CommandListener commandListener) {
        if (!isRootNotCreated() || this.modalStack.size() != 1) {
            this.modalStack.dismissModal(str, this.root, commandListener);
        } else {
            commandListener.onError("Can not dismiss modal if root is not set and only one modal is displayed.");
        }
    }

    public void dismissAllModals(Options options, CommandListener commandListener) {
        this.modalStack.dismissAllModals(this.root, options, commandListener);
    }

    public void showOverlay(ViewController<?> viewController, CommandListener commandListener) {
        this.overlayManager.show(this.overlaysLayout, viewController, commandListener);
    }

    public void dismissOverlay(String str, CommandListener commandListener) {
        this.overlayManager.dismiss(this.overlaysLayout, str, commandListener);
    }

    public void dismissAllOverlays(CommandListener commandListener) {
        this.overlayManager.dismissAll(this.overlaysLayout, commandListener);
    }

    public ViewController<?> findController(String str) {
        ViewController<?> findController = super.findController(str);
        if (findController == null) {
            findController = this.modalStack.findControllerById(str);
        }
        return findController == null ? this.overlayManager.findControllerById(str) : findController;
    }

    private void applyOnStack(String str, CommandListener commandListener, Functions.Func1<StackController> func1) {
        ViewController<?> findController = findController(str);
        if (findController == null) {
            commandListener.onError("Failed to execute stack command. Stack " + str + " not found.");
        } else if (findController instanceof StackController) {
            func1.run((StackController) findController);
        } else {
            findController.performOnParentStack(func1);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.modalStack.onConfigurationChanged(configuration);
        this.overlayManager.onConfigurationChanged(configuration);
        super.onConfigurationChanged(configuration);
    }

    private boolean isRootNotCreated() {
        return this.view == null;
    }

    /* access modifiers changed from: package-private */
    public CoordinatorLayout getModalsLayout() {
        return this.modalsLayout;
    }

    /* access modifiers changed from: package-private */
    public CoordinatorLayout getOverlaysLayout() {
        return this.overlaysLayout;
    }

    public void onHostPause() {
        this.overlayManager.onHostPause();
        if (!this.modalStack.isEmpty()) {
            this.modalStack.onHostPause();
            if (this.modalStack.peekDisplayedOverCurrentContext()) {
                onViewDisappear();
                return;
            }
            return;
        }
        onViewDisappear();
    }

    public void onHostResume() {
        this.overlayManager.onHostResume();
        if (!this.modalStack.isEmpty()) {
            this.modalStack.onHostResume();
            if (this.modalStack.peekDisplayedOverCurrentContext()) {
                onViewDidAppear();
                return;
            }
            return;
        }
        onViewDidAppear();
    }
}
