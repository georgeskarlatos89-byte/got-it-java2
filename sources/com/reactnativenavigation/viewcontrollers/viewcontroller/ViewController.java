package com.reactnativenavigation.viewcontrollers.viewcontroller;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.options.params.NullBool;
import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.utils.Functions;
import com.reactnativenavigation.utils.ObjectUtils;
import com.reactnativenavigation.utils.StringUtils;
import com.reactnativenavigation.utils.UiThread;
import com.reactnativenavigation.utils.UiUtils;
import com.reactnativenavigation.viewcontrollers.parent.ParentController;
import com.reactnativenavigation.viewcontrollers.stack.StackController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.overlay.ViewControllerOverlay;
import com.reactnativenavigation.views.BehaviourAdapter;
import com.reactnativenavigation.views.component.Component;
import com.reactnativenavigation.views.component.Renderable;
import java.util.ArrayList;
import java.util.List;

public abstract class ViewController<T extends ViewGroup> implements ViewTreeObserver.OnGlobalLayoutListener, ViewGroup.OnHierarchyChangeListener, BehaviourAdapter {
    private final Activity activity;
    private boolean appearEventPosted;
    private final String id;
    public Options initialOptions;
    private boolean isDestroyed;
    private boolean isFirstLayout = true;
    private boolean isShown;
    private final List<Runnable> onAppearedListeners = new ArrayList();
    public Options options;
    private ViewControllerOverlay overlay;
    private ParentController<? extends ViewGroup> parentController;
    protected T view;
    private ViewVisibilityListener viewVisibilityListener = new ViewVisibilityListenerAdapter();
    private Bool waitForRender = new NullBool();
    /* access modifiers changed from: private */
    public final YellowBoxDelegate yellowBoxDelegate;

    public interface ViewVisibilityListener {
        boolean onViewAppeared(View view);

        boolean onViewDisappear(View view);
    }

    public void applyBottomInset() {
    }

    public void applyOptions(Options options2) {
    }

    public void applyTopInset() {
    }

    public abstract T createView();

    public abstract String getCurrentComponentName();

    public ScrollEventListener getScrollEventListener() {
        return null;
    }

    public int getTopInset() {
        return 0;
    }

    public boolean handleBack(CommandListener commandListener) {
        return false;
    }

    public void onAttachToParent() {
    }

    public void onChildViewRemoved(View view2, View view3) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, View view2) {
        return false;
    }

    public void onViewDidAppear() {
    }

    public void onViewWillDisappear() {
    }

    public abstract void sendOnNavigationButtonPressed(String str);

    public void setDefaultOptions(Options options2) {
    }

    public void start() {
    }

    public void setOverlay(ViewControllerOverlay viewControllerOverlay) {
        this.overlay = viewControllerOverlay;
    }

    public boolean isDestroyed() {
        return this.isDestroyed;
    }

    public ViewController(Activity activity2, String str, YellowBoxDelegate yellowBoxDelegate2, Options options2, ViewControllerOverlay viewControllerOverlay) {
        this.activity = activity2;
        this.id = str;
        this.yellowBoxDelegate = yellowBoxDelegate2;
        this.initialOptions = options2;
        this.overlay = viewControllerOverlay;
        this.options = options2.copy();
    }

    public void setWaitForRender(Bool bool) {
        this.waitForRender = bool;
    }

    public void addOnAppearedListener(Runnable runnable) {
        if (this.isShown) {
            runnable.run();
        } else {
            this.onAppearedListeners.add(runnable);
        }
    }

    public void removeOnAppearedListener(Runnable runnable) {
        this.onAppearedListeners.remove(runnable);
    }

    public void setViewVisibilityListener(ViewVisibilityListener viewVisibilityListener2) {
        this.viewVisibilityListener = viewVisibilityListener2;
    }

    public void ensureViewIsCreated() {
        getView();
    }

    /* access modifiers changed from: protected */
    public boolean isViewCreated() {
        return this.view != null;
    }

    public void addOverlay(View view2, ViewGroup.LayoutParams layoutParams) {
        ObjectUtils.perform(this.view, new ViewController$$ExternalSyntheticLambda2(this, view2, layoutParams));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$addOverlay$0$com-reactnativenavigation-viewcontrollers-viewcontroller-ViewController  reason: not valid java name */
    public /* synthetic */ void m1037lambda$addOverlay$0$comreactnativenavigationviewcontrollersviewcontrollerViewController(View view2, ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup) {
        this.overlay.add(viewGroup, view2, layoutParams);
    }

    public void removeOverlay(View view2) {
        this.overlay.remove(view2);
    }

    public Options resolveCurrentOptions() {
        return this.options;
    }

    public Options resolveCurrentOptions(Options options2) {
        return this.options.copy().withDefaultOptions(options2);
    }

    public void mergeOptions(Options options2) {
        this.initialOptions = this.initialOptions.mergeWith(options2);
        this.options = this.options.mergeWith(options2);
        if (getParentController() != null) {
            this.options.clearOneTimeOptions();
            this.initialOptions.clearOneTimeOptions();
        }
    }

    public ViewController<?> getTopMostParent() {
        ParentController<? extends ViewGroup> parentController2 = this.parentController;
        return parentController2 != null ? parentController2.getTopMostParent() : this;
    }

    public Activity getActivity() {
        return this.activity;
    }

    public void performOnView(Functions.Func1<View> func1) {
        T t = this.view;
        if (t != null) {
            func1.run(t);
        }
    }

    public void performOnParentController(Functions.Func1<ParentController> func1) {
        ParentController<? extends ViewGroup> parentController2 = this.parentController;
        if (parentController2 != null) {
            func1.run(parentController2);
        }
    }

    public ParentController getParentController() {
        return this.parentController;
    }

    public ParentController requireParentController() {
        return this.parentController;
    }

    public void setParentController(ParentController parentController2) {
        this.parentController = parentController2;
    }

    public void performOnParentStack(Functions.Func1<StackController> func1) {
        ParentController<? extends ViewGroup> parentController2 = this.parentController;
        if (parentController2 instanceof StackController) {
            func1.run((StackController) parentController2);
        } else if (this instanceof StackController) {
            func1.run((StackController) this);
        } else {
            performOnParentController(new ViewController$$ExternalSyntheticLambda1(func1));
        }
    }

    public T getView() {
        if (this.view == null) {
            if (!this.isDestroyed) {
                T createView = createView();
                this.view = createView;
                createView.setOnHierarchyChangeListener(this);
                this.view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            } else {
                throw new RuntimeException("Tried to create view after it has already been destroyed");
            }
        }
        return this.view;
    }

    public void detachView() {
        T t = this.view;
        if (t != null && t.getParent() != null) {
            ((ViewManager) this.view.getParent()).removeView(this.view);
        }
    }

    public void attachView(ViewGroup viewGroup, int i) {
        T t = this.view;
        if (t != null && t.getParent() == null) {
            viewGroup.addView(this.view, i);
        }
    }

    public String getId() {
        return this.id;
    }

    /* access modifiers changed from: package-private */
    public boolean isSameId(String str) {
        return StringUtils.isEqual(this.id, str);
    }

    public ViewController findController(String str) {
        if (isSameId(str)) {
            return this;
        }
        return null;
    }

    public ViewController findController(View view2) {
        if (this.view == view2) {
            return this;
        }
        return null;
    }

    public boolean containsComponent(Component component) {
        return getView().equals(component);
    }

    public void onViewWillAppear() {
        this.isShown = true;
        applyOptions(this.options);
        performOnParentController(new ViewController$$ExternalSyntheticLambda4(this));
        if (!this.onAppearedListeners.isEmpty() && !this.appearEventPosted) {
            this.appearEventPosted = true;
            UiThread.post(new ViewController$$ExternalSyntheticLambda5(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onViewWillAppear$2$com-reactnativenavigation-viewcontrollers-viewcontroller-ViewController  reason: not valid java name */
    public /* synthetic */ void m1039lambda$onViewWillAppear$2$comreactnativenavigationviewcontrollersviewcontrollerViewController(ParentController parentController2) {
        parentController2.clearOptions();
        if (getView() instanceof Component) {
            parentController2.applyChildOptions(this.options, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onViewWillAppear$3$com-reactnativenavigation-viewcontrollers-viewcontroller-ViewController  reason: not valid java name */
    public /* synthetic */ void m1040lambda$onViewWillAppear$3$comreactnativenavigationviewcontrollersviewcontrollerViewController() {
        CollectionUtils.forEach(this.onAppearedListeners, new ViewController$$ExternalSyntheticLambda3());
        this.onAppearedListeners.clear();
    }

    public void onViewDisappear() {
        this.isShown = false;
    }

    public void destroy() {
        if (this.isShown) {
            this.isShown = false;
            onViewDisappear();
        }
        this.yellowBoxDelegate.destroy();
        T t = this.view;
        if (t instanceof Destroyable) {
            ((Destroyable) t).destroy();
        }
        T t2 = this.view;
        if (t2 != null) {
            t2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.view.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
            if (this.view.getParent() instanceof ViewGroup) {
                ((ViewManager) this.view.getParent()).removeView(this.view);
            }
            setParentController((ParentController) null);
            this.view = null;
            this.isDestroyed = true;
        }
    }

    public void onGlobalLayout() {
        if (this.isFirstLayout) {
            onAttachToParent();
            this.isFirstLayout = false;
        }
        if (this.isShown || !isViewShown()) {
            if (this.isShown && !isViewShown() && !this.viewVisibilityListener.onViewDisappear(this.view)) {
                this.isShown = false;
                onViewDisappear();
            }
        } else if (!this.viewVisibilityListener.onViewAppeared(this.view)) {
            this.isShown = true;
            onViewWillAppear();
        }
    }

    public void onChildViewAdded(View view2, View view3) {
        if ((view2 instanceof ViewGroup) && (view3 instanceof ViewGroup)) {
            ((ViewGroup) view3).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() {
                public void onChildViewRemoved(View view, View view2) {
                }

                public void onChildViewAdded(View view, View view2) {
                    ViewController.this.yellowBoxDelegate.onChildViewAdded(view, view2);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void runOnPreDraw(Functions.Func1<T> func1) {
        if (!this.isDestroyed) {
            UiUtils.runOnPreDrawOnce(getView(), func1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.view;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isViewShown() {
        /*
            r1 = this;
            boolean r0 = r1.isDestroyed
            if (r0 != 0) goto L_0x0016
            T r0 = r1.view
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0016
            boolean r0 = r1.isRendered()
            if (r0 == 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController.isViewShown():boolean");
    }

    public boolean isRendered() {
        if (this.view != null) {
            if (!this.waitForRender.isFalseOrUndefined()) {
                T t = this.view;
                if (!(t instanceof Renderable) || ((Renderable) t).isRendered()) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public void applyOnController(ViewController viewController, Functions.Func1<ViewController> func1) {
        if (viewController != null) {
            func1.run(viewController);
        }
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        ObjectUtils.perform(findController((View) viewGroup), new ViewController$$ExternalSyntheticLambda0());
        return false;
    }

    public int getBottomInset() {
        return ((Integer) ObjectUtils.perform(this.parentController, 0, new ViewController$$ExternalSyntheticLambda6(this))).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getBottomInset$4$com-reactnativenavigation-viewcontrollers-viewcontroller-ViewController  reason: not valid java name */
    public /* synthetic */ Integer m1038lambda$getBottomInset$4$comreactnativenavigationviewcontrollersviewcontrollerViewController(ParentController parentController2) {
        return Integer.valueOf(parentController2.getBottomInset(this));
    }
}
