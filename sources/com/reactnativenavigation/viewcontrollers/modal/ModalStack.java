package com.reactnativenavigation.viewcontrollers.modal;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.options.ModalPresentationStyle;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.react.CommandListenerAdapter;
import com.reactnativenavigation.react.Constants;
import com.reactnativenavigation.react.events.EventEmitter;
import com.reactnativenavigation.utils.ObjectUtils;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.overlay.ModalOverlay;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class ModalStack {
    /* access modifiers changed from: private */
    public EventEmitter eventEmitter;
    private final List<ViewController<?>> modals = new ArrayList();
    private final ModalOverlay overlay;
    private final ModalPresenter presenter;

    public void setEventEmitter(EventEmitter eventEmitter2) {
        this.eventEmitter = eventEmitter2;
    }

    public ModalStack(Context context) {
        this.presenter = new ModalPresenter(new ModalAnimator(context));
        this.overlay = new ModalOverlay(context);
    }

    ModalStack(Context context, ModalPresenter modalPresenter) {
        this.presenter = modalPresenter;
        this.overlay = new ModalOverlay(context);
    }

    public void setModalsLayout(CoordinatorLayout coordinatorLayout) {
        this.presenter.setModalsLayout(coordinatorLayout);
        this.overlay.setModalsLayout(coordinatorLayout);
    }

    public void setRootLayout(ViewGroup viewGroup) {
        this.presenter.setRootLayout(viewGroup);
    }

    public void setDefaultOptions(Options options) {
        this.presenter.setDefaultOptions(options);
    }

    public void showModal(ViewController<?> viewController, ViewController<?> viewController2, CommandListener commandListener) {
        if (!isEmpty()) {
            viewController2 = peek();
        }
        this.modals.add(viewController);
        viewController.setOverlay(this.overlay);
        this.presenter.showModal(viewController, viewController2, commandListener);
    }

    public boolean dismissModal(String str, ViewController<?> viewController, CommandListener commandListener) {
        final ViewController<?> findModalByComponentId = findModalByComponentId(str);
        if (findModalByComponentId != null) {
            boolean isTop = isTop(findModalByComponentId);
            this.modals.remove(findModalByComponentId);
            ViewController<?> viewController2 = isEmpty() ? viewController : isTop ? get(size() - 1) : null;
            if (!isTop || viewController2 != null) {
                this.presenter.dismissModal(findModalByComponentId, viewController2, viewController, new CommandListenerAdapter(commandListener) {
                    public void onSuccess(String str) {
                        ModalStack.this.eventEmitter.emitModalDismissed(findModalByComponentId.getId(), findModalByComponentId.getCurrentComponentName(), 1);
                        super.onSuccess(findModalByComponentId.getId());
                    }
                });
                return true;
            }
            commandListener.onError("Could not dismiss modal");
            return false;
        }
        commandListener.onError("Nothing to dismiss");
        return false;
    }

    public void dismissAllModals(ViewController<?> viewController, Options options, CommandListener commandListener) {
        if (this.modals.isEmpty()) {
            commandListener.onSuccess((String) ObjectUtils.perform(viewController, "", new ModalStack$$ExternalSyntheticLambda0()));
            return;
        }
        String id = peek().getId();
        String currentComponentName = peek().getCurrentComponentName();
        int size = size();
        peek().mergeOptions(options);
        while (!this.modals.isEmpty()) {
            if (this.modals.size() == 1) {
                final String str = id;
                final String str2 = currentComponentName;
                final int i = size;
                dismissModal(this.modals.get(0).getId(), viewController, new CommandListenerAdapter(commandListener) {
                    public void onSuccess(String str) {
                        ModalStack.this.eventEmitter.emitModalDismissed(str, str2, i);
                        super.onSuccess(str);
                    }
                });
            } else {
                this.modals.get(0).destroy();
                this.modals.remove(0);
            }
        }
    }

    public boolean handleBack(CommandListener commandListener, ViewController<?> viewController) {
        if (isEmpty()) {
            return false;
        }
        if (peek().handleBack(commandListener)) {
            return true;
        }
        if (this.presenter.shouldDismissModal(peek())) {
            return dismissModal(peek().getId(), viewController, commandListener);
        }
        peek().sendOnNavigationButtonPressed(Constants.HARDWARE_BACK_BUTTON_ID);
        return true;
    }

    /* access modifiers changed from: package-private */
    public ViewController<?> peek() {
        if (!this.modals.isEmpty()) {
            List<ViewController<?>> list = this.modals;
            return list.get(list.size() - 1);
        }
        throw new EmptyStackException();
    }

    public ViewController<?> get(int i) {
        return this.modals.get(i);
    }

    public boolean isEmpty() {
        return this.modals.isEmpty();
    }

    public int size() {
        return this.modals.size();
    }

    private boolean isTop(ViewController<?> viewController) {
        return !isEmpty() && peek().equals(viewController);
    }

    private ViewController<?> findModalByComponentId(String str) {
        for (ViewController<?> next : this.modals) {
            if (next.findController(str) != null) {
                return next;
            }
        }
        return null;
    }

    public ViewController<?> findControllerById(String str) {
        for (ViewController<?> findController : this.modals) {
            ViewController<?> findController2 = findController.findController(str);
            if (findController2 != null) {
                return findController2;
            }
        }
        return null;
    }

    public void destroy() {
        for (ViewController<?> destroy : this.modals) {
            destroy.destroy();
        }
        this.modals.clear();
    }

    public void onConfigurationChanged(Configuration configuration) {
        for (ViewController<?> onConfigurationChanged : this.modals) {
            onConfigurationChanged.onConfigurationChanged(configuration);
        }
    }

    public void onHostPause() {
        if (!isEmpty()) {
            peek().onViewDisappear();
        }
    }

    public void onHostResume() {
        if (!isEmpty()) {
            peek().onViewDidAppear();
        }
    }

    public boolean peekDisplayedOverCurrentContext() {
        return !isEmpty() && this.presenter.resolveOptions(peek()).modal.presentationStyle == ModalPresentationStyle.OverCurrentContext;
    }
}
