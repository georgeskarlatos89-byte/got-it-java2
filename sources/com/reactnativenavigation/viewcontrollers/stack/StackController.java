package com.reactnativenavigation.viewcontrollers.stack;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.ReactRootView;
import com.reactnativenavigation.options.ButtonOptions;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.react.CommandListenerAdapter;
import com.reactnativenavigation.react.Constants;
import com.reactnativenavigation.react.events.EventEmitter;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.utils.CompatUtils;
import com.reactnativenavigation.utils.CoordinatorLayoutUtils;
import com.reactnativenavigation.utils.ObjectUtils;
import com.reactnativenavigation.viewcontrollers.child.ChildControllersRegistry;
import com.reactnativenavigation.viewcontrollers.parent.ParentController;
import com.reactnativenavigation.viewcontrollers.stack.topbar.TopBarController;
import com.reactnativenavigation.viewcontrollers.stack.topbar.button.BackButtonHelper;
import com.reactnativenavigation.viewcontrollers.viewcontroller.Presenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.component.Component;
import com.reactnativenavigation.views.stack.StackBehaviour;
import com.reactnativenavigation.views.stack.StackLayout;
import com.reactnativenavigation.views.stack.fab.Fab;
import com.reactnativenavigation.views.stack.fab.FabMenu;
import com.reactnativenavigation.views.stack.topbar.TopBar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StackController extends ParentController<StackLayout> {
    private final StackAnimator animator;
    /* access modifiers changed from: private */
    public final BackButtonHelper backButtonHelper;
    private final EventEmitter eventEmitter;
    private final FabPresenter fabPresenter;
    private final StackPresenter presenter;
    /* access modifiers changed from: private */
    public IdStack<ViewController<?>> stack = new IdStack<>();
    private final TopBarController topBarController;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StackController(Activity activity, List<ViewController<?>> list, ChildControllersRegistry childControllersRegistry, EventEmitter eventEmitter2, TopBarController topBarController2, StackAnimator stackAnimator, String str, Options options, BackButtonHelper backButtonHelper2, StackPresenter stackPresenter, Presenter presenter2, FabPresenter fabPresenter2) {
        super(activity, childControllersRegistry, str, presenter2, options);
        StackPresenter stackPresenter2 = stackPresenter;
        this.eventEmitter = eventEmitter2;
        this.topBarController = topBarController2;
        this.animator = stackAnimator;
        this.backButtonHelper = backButtonHelper2;
        this.presenter = stackPresenter2;
        this.fabPresenter = fabPresenter2;
        stackPresenter2.setButtonOnClickListener(new StackController$$ExternalSyntheticLambda1(this));
        List<ViewController<?>> list2 = list;
        setChildren(list);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.presenter.onConfigurationChanged(resolveCurrentOptions());
        this.fabPresenter.onConfigurationChanged(resolveCurrentOptions());
    }

    public boolean isRendered() {
        if (isEmpty() || getCurrentChild().isDestroyed()) {
            return false;
        }
        ViewGroup view = getCurrentChild().getView();
        if (!(view instanceof Component)) {
            return super.isRendered();
        }
        if (!super.isRendered() || !this.presenter.isRendered(view)) {
            return false;
        }
        return true;
    }

    public void setDefaultOptions(Options options) {
        super.setDefaultOptions(options);
        this.presenter.setDefaultOptions(options);
    }

    public ViewController<?> getCurrentChild() {
        return this.stack.peek();
    }

    public void onAttachToParent() {
        if (!isEmpty() && !getCurrentChild().isDestroyed() && !isViewShown()) {
            this.presenter.applyChildOptions(resolveCurrentOptions(), this, getCurrentChild());
        }
    }

    public void mergeOptions(Options options) {
        if (isViewShown()) {
            this.presenter.mergeOptions(options, this, getCurrentChild());
        }
        super.mergeOptions(options);
    }

    public void applyChildOptions(Options options, ViewController<?> viewController) {
        super.applyChildOptions(options, viewController);
        this.presenter.applyChildOptions(resolveCurrentOptions(), this, viewController);
        this.fabPresenter.applyOptions(this.options.fabOptions, viewController, getView());
        performOnParentController(new StackController$$ExternalSyntheticLambda2(this, viewController));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$applyChildOptions$0$com-reactnativenavigation-viewcontrollers-stack-StackController  reason: not valid java name */
    public /* synthetic */ void m1020lambda$applyChildOptions$0$comreactnativenavigationviewcontrollersstackStackController(ViewController viewController, ParentController parentController) {
        parentController.applyChildOptions(this.options.copy().clearTopBarOptions().clearAnimationOptions().clearFabOptions().clearTopTabOptions().clearTopTabsOptions(), viewController);
    }

    public void mergeChildOptions(Options options, ViewController<?> viewController) {
        super.mergeChildOptions(options, viewController);
        if (viewController.isViewShown() && peek() == viewController) {
            this.presenter.mergeChildOptions(options, resolveCurrentOptions(), this, viewController);
            if (options.fabOptions.hasValue()) {
                this.fabPresenter.mergeOptions(options.fabOptions, viewController, getView());
            }
        }
        performOnParentController(new StackController$$ExternalSyntheticLambda5(options, viewController));
    }

    public void onChildDestroyed(ViewController<?> viewController) {
        super.onChildDestroyed(viewController);
        this.presenter.onChildDestroyed(viewController);
    }

    public void push(ViewController<?> viewController, CommandListener commandListener) {
        if (findController(viewController.getId()) != null) {
            commandListener.onError("A stack can't contain two children with the same id: " + viewController.getId());
            return;
        }
        ViewController peek = this.stack.peek();
        if (size() > 0) {
            this.backButtonHelper.addToPushedChild(viewController);
        }
        viewController.setParentController(this);
        this.stack.push(viewController.getId(), viewController);
        if (isViewCreated()) {
            Options resolveCurrentOptions = resolveCurrentOptions(this.presenter.getDefaultOptions());
            addChildToStack(viewController, resolveCurrentOptions);
            if (peek == null) {
                commandListener.onSuccess(viewController.getId());
            } else if (resolveCurrentOptions.animations.push.enabled.isTrueOrUndefined()) {
                this.animator.push(viewController, peek, resolveCurrentOptions, this.presenter.getAdditionalPushAnimations(this, viewController, resolveCurrentOptions), new StackController$$ExternalSyntheticLambda7(this, viewController, peek, commandListener));
            } else {
                m1023lambda$push$2$comreactnativenavigationviewcontrollersstackStackController(viewController, peek, commandListener);
            }
        }
    }

    public void destroy() {
        super.destroy();
        this.animator.cancelAllAnimations();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?>, java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: onPushAnimationComplete */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1023lambda$push$2$comreactnativenavigationviewcontrollersstackStackController(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r2, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r3, com.reactnativenavigation.react.CommandListener r4) {
        /*
            r1 = this;
            r2.onViewDidAppear()
            com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController r0 = r1.peek()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x001a
            android.view.ViewGroup r0 = r1.getView()
            com.reactnativenavigation.views.stack.StackLayout r0 = (com.reactnativenavigation.views.stack.StackLayout) r0
            android.view.ViewGroup r3 = r3.getView()
            r0.removeView(r3)
        L_0x001a:
            java.lang.String r2 = r2.getId()
            r4.onSuccess(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.stack.StackController.m1023lambda$push$2$comreactnativenavigationviewcontrollersstackStackController(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.react.CommandListener):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void addChildToStack(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r3, com.reactnativenavigation.options.Options r4) {
        /*
            r2 = this;
            com.reactnativenavigation.options.AnimationsOptions r0 = r4.animations
            com.reactnativenavigation.options.StackAnimationOptions r0 = r0.push
            com.reactnativenavigation.options.params.Bool r0 = r0.waitForRender
            r3.setWaitForRender(r0)
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L_0x0015
            com.reactnativenavigation.viewcontrollers.stack.StackPresenter r0 = r2.presenter
            r0.applyInitialChildLayoutOptions(r4)
        L_0x0015:
            android.view.ViewGroup r4 = r2.getView()
            com.reactnativenavigation.views.stack.StackLayout r4 = (com.reactnativenavigation.views.stack.StackLayout) r4
            android.view.ViewGroup r3 = r3.getView()
            android.view.ViewGroup r0 = r2.getView()
            com.reactnativenavigation.views.stack.StackLayout r0 = (com.reactnativenavigation.views.stack.StackLayout) r0
            int r0 = r0.getChildCount()
            int r0 = r0 - r1
            com.reactnativenavigation.views.stack.StackBehaviour r1 = new com.reactnativenavigation.views.stack.StackBehaviour
            r1.<init>(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = com.reactnativenavigation.utils.CoordinatorLayoutUtils.matchParentWithBehaviour(r1)
            r4.addView(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.stack.StackController.addChildToStack(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.options.Options):void");
    }

    public void setRoot(List<ViewController<?>> list, CommandListener commandListener) {
        if (!isViewCreated()) {
            setChildren(list);
            return;
        }
        this.animator.cancelPushAnimations();
        ViewController peek = this.stack.peek();
        final IdStack<ViewController<?>> idStack = this.stack;
        this.stack = new IdStack<>();
        ViewController viewController = (ViewController) CollectionUtils.requireLast(list);
        if (list.size() == 1) {
            this.backButtonHelper.clear(viewController);
        } else {
            this.backButtonHelper.addToPushedChild(viewController);
        }
        viewController.setParentController(this);
        this.stack.push(viewController.getId(), viewController);
        Options resolveCurrentOptions = resolveCurrentOptions(this.presenter.getDefaultOptions());
        addChildToStack(viewController, resolveCurrentOptions);
        final ViewController viewController2 = viewController;
        final List<ViewController<?>> list2 = list;
        final CommandListener commandListener2 = commandListener;
        AnonymousClass1 r1 = new CommandListenerAdapter() {
            public void onSuccess(String str) {
                if (viewController2.isViewShown()) {
                    viewController2.onViewDidAppear();
                }
                StackController.this.destroyStack(idStack);
                if (list2.size() > 1) {
                    for (int i = 0; i < list2.size() - 1; i++) {
                        StackController.this.stack.set(((ViewController) list2.get(i)).getId(), (ViewController) list2.get(i), i);
                        ((ViewController) list2.get(i)).setParentController(StackController.this);
                        if (i == 0) {
                            StackController.this.backButtonHelper.clear((ViewController) list2.get(i));
                        } else {
                            StackController.this.backButtonHelper.addToPushedChild((ViewController) list2.get(i));
                        }
                    }
                    StackController.this.startChildrenBellowTopChild();
                }
                commandListener2.onSuccess(str);
            }
        };
        if (peek == null || !resolveCurrentOptions.animations.setStackRoot.enabled.isTrueOrUndefined()) {
            r1.onSuccess(viewController.getId());
        } else if (resolveCurrentOptions.animations.setStackRoot.waitForRender.isTrue()) {
            viewController.getView().setAlpha(0.0f);
            viewController.addOnAppearedListener(new StackController$$ExternalSyntheticLambda3(this, viewController, peek, resolveCurrentOptions, r1));
        } else {
            this.animator.setRoot(viewController, peek, resolveCurrentOptions, this.presenter.getAdditionalSetRootAnimations(this, viewController, resolveCurrentOptions), new StackController$$ExternalSyntheticLambda4(r1, viewController));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setRoot$4$com-reactnativenavigation-viewcontrollers-stack-StackController  reason: not valid java name */
    public /* synthetic */ void m1024lambda$setRoot$4$comreactnativenavigationviewcontrollersstackStackController(ViewController viewController, ViewController viewController2, Options options, CommandListener commandListener) {
        this.animator.setRoot(viewController, viewController2, options, this.presenter.getAdditionalSetRootAnimations(this, viewController, options), new StackController$$ExternalSyntheticLambda9(commandListener, viewController));
    }

    private void setChildren(List<ViewController<?>> list) {
        this.stack.clear();
        for (ViewController next : list) {
            if (!this.stack.containsId(next.getId())) {
                next.setParentController(this);
                this.stack.push(next.getId(), next);
                if (size() > 1) {
                    this.backButtonHelper.addToPushedChild(next);
                }
            } else {
                throw new IllegalArgumentException("A stack can't contain two children with the same id: " + next.getId());
            }
        }
    }

    /* access modifiers changed from: private */
    public void destroyStack(IdStack<?> idStack) {
        this.animator.cancelAllAnimations();
        Iterator<T> it = idStack.iterator();
        while (it.hasNext()) {
            ((ViewController) idStack.get((String) it.next())).destroy();
        }
    }

    public void pop(Options options, CommandListener commandListener) {
        if (!canPop()) {
            commandListener.onError("Nothing to pop");
            return;
        }
        peek().mergeOptions(options);
        Options resolveCurrentOptions = resolveCurrentOptions(this.presenter.getDefaultOptions());
        ViewController pop = this.stack.pop();
        if (isViewCreated()) {
            ViewController peek = this.stack.peek();
            pop.onViewWillDisappear();
            ViewGroup view = peek.getView();
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(CoordinatorLayoutUtils.matchParentWithBehaviour(new StackBehaviour(this)));
            }
            if (view.getParent() == null) {
                ((StackLayout) getView()).addView(view, 0);
            }
            if (resolveCurrentOptions.animations.pop.enabled.isTrueOrUndefined()) {
                this.animator.pop(peek, pop, resolveCurrentOptions, this.presenter.getAdditionalPopAnimations(resolveChildOptions(peek).withDefaultOptions(this.presenter.getDefaultOptions()), resolveCurrentOptions), new StackController$$ExternalSyntheticLambda0(this, peek, pop, commandListener));
                return;
            }
            m1022lambda$pop$6$comreactnativenavigationviewcontrollersstackStackController(peek, pop, commandListener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: finishPopping */
    public void m1022lambda$pop$6$comreactnativenavigationviewcontrollersstackStackController(ViewController<?> viewController, ViewController<?> viewController2, CommandListener commandListener) {
        viewController.onViewDidAppear();
        viewController2.destroy();
        commandListener.onSuccess(viewController2.getId());
        this.eventEmitter.emitScreenPoppedEvent(viewController2.getId());
    }

    public void popTo(ViewController<?> viewController, Options options, CommandListener commandListener) {
        if (!this.stack.containsId(viewController.getId()) || peek().equals(viewController)) {
            commandListener.onError("Nothing to pop");
            return;
        }
        this.animator.cancelPushAnimations();
        for (int size = this.stack.size() - 2; size >= 0; size--) {
            String id = this.stack.get(size).getId();
            if (id.equals(viewController.getId())) {
                break;
            }
            ViewController viewController2 = this.stack.get(id);
            this.stack.remove(viewController2.getId());
            viewController2.destroy();
        }
        pop(options, commandListener);
    }

    public void popToRoot(Options options, CommandListener commandListener) {
        if (!canPop()) {
            commandListener.onSuccess("");
            return;
        }
        this.animator.cancelPushAnimations();
        Iterator<String> it = this.stack.iterator();
        it.next();
        while (this.stack.size() > 2) {
            ViewController viewController = this.stack.get(it.next());
            if (!this.stack.isTop(viewController.getId())) {
                this.stack.remove(it, viewController.getId());
                viewController.destroy();
            }
        }
        pop(options, commandListener);
    }

    /* access modifiers changed from: package-private */
    public ViewController<?> peek() {
        return this.stack.peek();
    }

    public int size() {
        return this.stack.size();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public boolean isChildInTransition(ViewController<?> viewController) {
        return this.animator.isChildInTransition(viewController);
    }

    public boolean handleBack(CommandListener commandListener) {
        if (!canPop()) {
            return false;
        }
        if (this.presenter.shouldPopOnHardwareButtonPress(peek())) {
            pop(Options.EMPTY, commandListener);
            return true;
        }
        sendOnNavigationButtonPressed(Constants.HARDWARE_BACK_BUTTON_ID);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean canPop() {
        return this.stack.size() > 1;
    }

    public StackLayout createView() {
        StackLayout stackLayout = new StackLayout(getActivity(), this.topBarController, getId());
        this.presenter.bindView(this.topBarController, getBottomTabsController());
        addInitialChild(stackLayout);
        return stackLayout;
    }

    private void addInitialChild(StackLayout stackLayout) {
        if (!isEmpty()) {
            ViewController peek = peek();
            ViewGroup view = peek.getView();
            setChildId(view);
            peek.addOnAppearedListener(new StackController$$ExternalSyntheticLambda6(this));
            stackLayout.addView(view, 0, CoordinatorLayoutUtils.matchParentWithBehaviour(new StackBehaviour(this)));
            this.presenter.applyInitialChildLayoutOptions(resolveCurrentOptions());
        }
    }

    private void setChildId(ViewGroup viewGroup) {
        if (!(viewGroup instanceof ReactRootView)) {
            viewGroup.setId(CompatUtils.generateViewId());
        }
    }

    /* access modifiers changed from: private */
    public void startChildrenBellowTopChild() {
        ArrayList arrayList = new ArrayList(getChildControllers());
        for (int size = arrayList.size() - 2; size >= 0; size--) {
            ((ViewController) arrayList.get(size)).start();
        }
    }

    /* access modifiers changed from: private */
    public void onNavigationButtonPressed(ButtonOptions buttonOptions) {
        if (!buttonOptions.isBackButton() || !buttonOptions.shouldPopOnPress()) {
            sendOnNavigationButtonPressed(buttonOptions.id);
        } else {
            pop(Options.EMPTY, new CommandListenerAdapter());
        }
    }

    public void sendOnNavigationButtonPressed(String str) {
        peek().sendOnNavigationButtonPressed(str);
    }

    public Collection<ViewController<?>> getChildControllers() {
        return this.stack.values();
    }

    public void setupTopTabsWithViewPager(ViewPager viewPager) {
        this.topBarController.initTopTabs(viewPager);
    }

    public void clearTopTabs() {
        this.topBarController.clearTopTabs();
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, View view) {
        ObjectUtils.perform(findController((View) viewGroup), new StackController$$ExternalSyntheticLambda8(this, view));
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onDependentViewChanged$7$com-reactnativenavigation-viewcontrollers-stack-StackController  reason: not valid java name */
    public /* synthetic */ void m1021lambda$onDependentViewChanged$7$comreactnativenavigationviewcontrollersstackStackController(View view, ViewController viewController) {
        if (view instanceof TopBar) {
            this.presenter.applyTopInsets(this, viewController);
        }
        if ((view instanceof Fab) || (view instanceof FabMenu)) {
            CoordinatorLayoutUtils.updateBottomMargin(view, getBottomInset());
        }
    }

    public int getTopInset(ViewController<?> viewController) {
        return this.presenter.getTopInset(resolveChildOptions(viewController));
    }

    public TopBar getTopBar() {
        return this.topBarController.getView();
    }

    public StackLayout getStackLayout() {
        return (StackLayout) getView();
    }

    public void setView(StackLayout stackLayout) {
        this.view = stackLayout;
    }
}
