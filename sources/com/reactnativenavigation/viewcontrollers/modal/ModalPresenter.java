package com.reactnativenavigation.viewcontrollers.modal;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.options.ModalPresentationStyle;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.utils.ScreenAnimationListener;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;

public class ModalPresenter {
    private Options defaultOptions = new Options();
    private final ModalAnimator modalAnimator;
    private CoordinatorLayout modalsLayout;
    private ViewGroup rootLayout;

    ModalPresenter(ModalAnimator modalAnimator2) {
        this.modalAnimator = modalAnimator2;
    }

    /* access modifiers changed from: package-private */
    public void setRootLayout(ViewGroup viewGroup) {
        this.rootLayout = viewGroup;
    }

    /* access modifiers changed from: package-private */
    public void setModalsLayout(CoordinatorLayout coordinatorLayout) {
        this.modalsLayout = coordinatorLayout;
    }

    public void setDefaultOptions(Options options) {
        this.defaultOptions = options;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void showModal(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r8, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r9, com.reactnativenavigation.react.CommandListener r10) {
        /*
            r7 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r7.modalsLayout
            if (r0 != 0) goto L_0x000a
            java.lang.String r8 = "Can not show modal before activity is created"
            r10.onError(r8)
            return
        L_0x000a:
            com.reactnativenavigation.options.Options r0 = r7.defaultOptions
            com.reactnativenavigation.options.Options r5 = r8.resolveCurrentOptions(r0)
            com.reactnativenavigation.options.AnimationsOptions r0 = r5.animations
            com.reactnativenavigation.options.TransitionAnimationOptions r0 = r0.showModal
            com.reactnativenavigation.options.AnimationOptions r0 = r0.getEnter()
            com.reactnativenavigation.options.params.Bool r1 = r0.waitForRender
            r8.setWaitForRender(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r7.modalsLayout
            r2 = 0
            r1.setVisibility(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r7.modalsLayout
            android.view.ViewGroup r2 = r8.getView()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = com.reactnativenavigation.utils.CoordinatorLayoutUtils.matchParentLP()
            r1.addView(r2, r3)
            com.reactnativenavigation.options.params.Bool r1 = r0.enabled
            boolean r1 = r1.isTrueOrUndefined()
            if (r1 == 0) goto L_0x005e
            com.reactnativenavigation.options.params.Bool r0 = r0.shouldWaitForRender()
            boolean r0 = r0.isTrue()
            if (r0 == 0) goto L_0x0050
            com.reactnativenavigation.viewcontrollers.modal.ModalPresenter$$ExternalSyntheticLambda0 r0 = new com.reactnativenavigation.viewcontrollers.modal.ModalPresenter$$ExternalSyntheticLambda0
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r8.addOnAppearedListener(r0)
            goto L_0x0072
        L_0x0050:
            com.reactnativenavigation.viewcontrollers.modal.ModalAnimator r0 = r7.modalAnimator
            com.reactnativenavigation.options.AnimationsOptions r1 = r5.animations
            com.reactnativenavigation.options.TransitionAnimationOptions r1 = r1.showModal
            com.reactnativenavigation.utils.ScreenAnimationListener r10 = r7.createListener(r8, r9, r10)
            r0.show(r8, r9, r1, r10)
            goto L_0x0072
        L_0x005e:
            com.reactnativenavigation.options.params.Bool r0 = r0.waitForRender
            boolean r0 = r0.isTrue()
            if (r0 == 0) goto L_0x006f
            com.reactnativenavigation.viewcontrollers.modal.ModalPresenter$$ExternalSyntheticLambda1 r0 = new com.reactnativenavigation.viewcontrollers.modal.ModalPresenter$$ExternalSyntheticLambda1
            r0.<init>(r7, r8, r9, r10)
            r8.addOnAppearedListener(r0)
            goto L_0x0072
        L_0x006f:
            r7.m1006lambda$showModal$1$comreactnativenavigationviewcontrollersmodalModalPresenter(r8, r9, r10)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.modal.ModalPresenter.showModal(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.react.CommandListener):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$showModal$0$com-reactnativenavigation-viewcontrollers-modal-ModalPresenter  reason: not valid java name */
    public /* synthetic */ void m1005lambda$showModal$0$comreactnativenavigationviewcontrollersmodalModalPresenter(ViewController viewController, ViewController viewController2, Options options, CommandListener commandListener) {
        this.modalAnimator.show(viewController, viewController2, options.animations.showModal, createListener(viewController, viewController2, commandListener));
    }

    private ScreenAnimationListener createListener(final ViewController<?> viewController, final ViewController<?> viewController2, final CommandListener commandListener) {
        return new ScreenAnimationListener() {
            public void onStart() {
                viewController.getView().setAlpha(1.0f);
            }

            public void onEnd() {
                ModalPresenter.this.m1006lambda$showModal$1$comreactnativenavigationviewcontrollersmodalModalPresenter(viewController, viewController2, commandListener);
            }

            public void onCancel() {
                commandListener.onSuccess(viewController.getId());
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: onShowModalEnd */
    public void m1006lambda$showModal$1$comreactnativenavigationviewcontrollersmodalModalPresenter(ViewController<?> viewController, ViewController<?> viewController2, CommandListener commandListener) {
        viewController.onViewDidAppear();
        if (!(viewController2 == null || viewController.resolveCurrentOptions(this.defaultOptions).modal.presentationStyle == ModalPresentationStyle.OverCurrentContext)) {
            viewController2.detachView();
        }
        commandListener.onSuccess(viewController.getId());
    }

    /* access modifiers changed from: package-private */
    public void dismissModal(final ViewController<?> viewController, ViewController<?> viewController2, ViewController<?> viewController3, final CommandListener commandListener) {
        ViewGroup viewGroup = this.modalsLayout;
        if (viewGroup == null) {
            commandListener.onError("Can not dismiss modal before activity is created");
            return;
        }
        if (viewController2 != null) {
            if (viewController2 == viewController3) {
                viewGroup = this.rootLayout;
            }
            viewController2.attachView(viewGroup, 0);
            viewController2.onViewDidAppear();
        }
        Options resolveCurrentOptions = viewController.resolveCurrentOptions(this.defaultOptions);
        if (resolveCurrentOptions.animations.dismissModal.getExit().enabled.isTrueOrUndefined()) {
            this.modalAnimator.dismiss(viewController2, viewController, resolveCurrentOptions.animations.dismissModal, new ScreenAnimationListener() {
                public void onEnd() {
                    ModalPresenter.this.onDismissEnd(viewController, commandListener);
                }
            });
        } else {
            onDismissEnd(viewController, commandListener);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDismissModal(ViewController<?> viewController) {
        return ((Boolean) viewController.resolveCurrentOptions(this.defaultOptions).hardwareBack.dismissModalOnPress.get(true)).booleanValue();
    }

    public Options resolveOptions(ViewController<?> viewController) {
        return viewController.resolveCurrentOptions(this.defaultOptions);
    }

    /* access modifiers changed from: private */
    public void onDismissEnd(ViewController<?> viewController, CommandListener commandListener) {
        commandListener.onSuccess(viewController.getId());
        viewController.destroy();
        if (isEmpty()) {
            this.modalsLayout.setVisibility(8);
        }
    }

    private boolean isEmpty() {
        return this.modalsLayout.getChildCount() == 0;
    }
}
