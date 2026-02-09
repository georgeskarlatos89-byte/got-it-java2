package com.reactnativenavigation.viewcontrollers.sidemenu;

import android.app.Activity;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.options.SideMenuRootOptions;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.utils.ObjectUtils;
import com.reactnativenavigation.viewcontrollers.child.ChildControllersRegistry;
import com.reactnativenavigation.viewcontrollers.parent.ParentController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.Presenter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.sidemenu.SideMenu;
import com.reactnativenavigation.views.sidemenu.SideMenuRoot;
import java.util.ArrayList;
import java.util.Collection;

public class SideMenuController extends ParentController<SideMenuRoot> implements DrawerLayout.DrawerListener {
    private ViewController<?> center;
    private ViewController<?> left;
    private SideMenuPresenter presenter;
    private float prevLeftSlideOffset = 0.0f;
    private float prevRightSlideOffset = 0.0f;
    private ViewController<?> right;

    public void onDrawerStateChanged(int i) {
    }

    public SideMenuController(Activity activity, ChildControllersRegistry childControllersRegistry, String str, Options options, SideMenuPresenter sideMenuPresenter, Presenter presenter2) {
        super(activity, childControllersRegistry, str, presenter2, options);
        this.presenter = sideMenuPresenter;
    }

    public ViewController<?> getCurrentChild() {
        if (!isDestroyed()) {
            if (((SideMenuRoot) getView()).isDrawerOpen(3)) {
                return this.left;
            }
            if (((SideMenuRoot) getView()).isDrawerOpen(5)) {
                return this.right;
            }
        }
        return this.center;
    }

    public SideMenuRoot createView() {
        SideMenu sideMenu = new SideMenu(getActivity());
        this.presenter.bindView(sideMenu);
        sideMenu.addDrawerListener(this);
        SideMenuRoot sideMenuRoot = new SideMenuRoot(getActivity());
        sideMenuRoot.addSideMenu(sideMenu, this);
        return sideMenuRoot;
    }

    public void sendOnNavigationButtonPressed(String str) {
        this.center.sendOnNavigationButtonPressed(str);
    }

    public Collection<ViewController<?>> getChildControllers() {
        ArrayList arrayList = new ArrayList();
        ViewController<?> viewController = this.center;
        if (viewController != null) {
            arrayList.add(viewController);
        }
        ViewController<?> viewController2 = this.left;
        if (viewController2 != null) {
            arrayList.add(viewController2);
        }
        ViewController<?> viewController3 = this.right;
        if (viewController3 != null) {
            arrayList.add(viewController3);
        }
        return arrayList;
    }

    public void applyOptions(Options options) {
        super.applyOptions(options);
        this.presenter.applyOptions(options);
    }

    public void applyChildOptions(Options options, ViewController<?> viewController) {
        super.applyChildOptions(options, viewController);
        this.presenter.applyChildOptions(resolveCurrentOptions());
        performOnParentController(new SideMenuController$$ExternalSyntheticLambda4(this, viewController));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$applyChildOptions$0$com-reactnativenavigation-viewcontrollers-sidemenu-SideMenuController  reason: not valid java name */
    public /* synthetic */ void m1011lambda$applyChildOptions$0$comreactnativenavigationviewcontrollerssidemenuSideMenuController(ViewController viewController, ParentController parentController) {
        parentController.applyChildOptions(this.options, viewController);
    }

    public void mergeChildOptions(Options options, ViewController<?> viewController) {
        super.mergeChildOptions(options, viewController);
        this.presenter.mergeOptions(options.sideMenuRootOptions);
        mergeLockMode(this.initialOptions, options.sideMenuRootOptions);
        performOnParentController(new SideMenuController$$ExternalSyntheticLambda5(options, viewController));
    }

    public void onViewWillAppear() {
        super.onViewWillAppear();
        ViewController<?> viewController = this.left;
        if (viewController != null) {
            viewController.performOnView(new SideMenuController$$ExternalSyntheticLambda0());
        }
        ViewController<?> viewController2 = this.right;
        if (viewController2 != null) {
            viewController2.performOnView(new SideMenuController$$ExternalSyntheticLambda1());
        }
    }

    public void mergeOptions(Options options) {
        super.mergeOptions(options);
        this.presenter.mergeOptions(options.sideMenuRootOptions);
    }

    public Options resolveCurrentOptions() {
        Options resolveCurrentOptions = super.resolveCurrentOptions();
        return (isDrawerOpen(3) || isDrawerOpen(5)) ? resolveCurrentOptions.mergeWith(this.center.resolveCurrentOptions()) : resolveCurrentOptions;
    }

    private boolean isDrawerOpen(int i) {
        return !isDestroyed() && ((SideMenuRoot) getView()).isDrawerOpen(i);
    }

    public void onDrawerOpened(View view) {
        getMatchingView(view).mergeOptions(getOptionsWithVisibility(isLeftMenu(view), true));
    }

    public void onDrawerClosed(View view) {
        getMatchingView(view).mergeOptions(getOptionsWithVisibility(isLeftMenu(view), false));
    }

    public void onDrawerSlide(View view, float f) {
        int sideMenuGravity = getSideMenuGravity(view);
        if (sideMenuGravity == 3) {
            dispatchSideMenuVisibilityEvents(this.left, this.prevLeftSlideOffset, f);
            this.prevLeftSlideOffset = f;
        } else if (sideMenuGravity == 5) {
            dispatchSideMenuVisibilityEvents(this.right, this.prevRightSlideOffset, f);
            this.prevRightSlideOffset = f;
        }
    }

    public boolean handleBack(CommandListener commandListener) {
        return this.presenter.handleBack() || this.center.handleBack(commandListener) || super.handleBack(commandListener);
    }

    public ViewController<?> findController(View view) {
        return ((SideMenuRoot) getView()).isSideMenu(view) ? this : super.findController(view);
    }

    public void setCenterController(ViewController<?> viewController) {
        this.center = viewController;
        ((SideMenuRoot) getView()).setCenter(this.center);
    }

    public void setLeftController(ViewController<?> viewController) {
        this.left = viewController;
        ((SideMenuRoot) getView()).setLeft(this.left, this.options);
        this.presenter.bindLeft(this.left);
    }

    public void setRightController(ViewController<?> viewController) {
        this.right = viewController;
        ((SideMenuRoot) getView()).setRight(this.right, this.options);
        this.presenter.bindRight(this.right);
    }

    private ViewController<?> getMatchingView(View view) {
        return isLeftMenu(view) ? this.left : this.right;
    }

    private boolean isLeftMenu(View view) {
        ViewController<?> viewController = this.left;
        return viewController != null && view.equals(viewController.getView());
    }

    private int getSideMenuGravity(View view) {
        return ((DrawerLayout.LayoutParams) view.getLayoutParams()).gravity;
    }

    private Options getOptionsWithVisibility(boolean z, boolean z2) {
        Options options = new Options();
        if (z) {
            options.sideMenuRootOptions.left.visible = new Bool(Boolean.valueOf(z2));
        } else {
            options.sideMenuRootOptions.right.visible = new Bool(Boolean.valueOf(z2));
        }
        return options;
    }

    private void dispatchSideMenuVisibilityEvents(ViewController<?> viewController, float f, float f2) {
        if (f >= 1.0f || f2 != 1.0f) {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0 && f2 > 0.0f) {
                viewController.onViewWillAppear();
            } else if (i > 0 && f2 == 0.0f) {
                viewController.onViewDisappear();
            }
        } else {
            viewController.onViewDidAppear();
        }
    }

    private void mergeLockMode(Options options, SideMenuRootOptions sideMenuRootOptions) {
        ObjectUtils.perform((Boolean) sideMenuRootOptions.left.enabled.get(null), new SideMenuController$$ExternalSyntheticLambda2(options));
        ObjectUtils.perform((Boolean) sideMenuRootOptions.right.enabled.get(null), new SideMenuController$$ExternalSyntheticLambda3(options));
    }

    /* access modifiers changed from: package-private */
    public SideMenu getSideMenu() {
        return this.presenter.getSideMenu();
    }
}
