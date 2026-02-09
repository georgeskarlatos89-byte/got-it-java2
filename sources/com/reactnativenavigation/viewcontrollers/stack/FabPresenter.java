package com.reactnativenavigation.viewcontrollers.stack;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.R;
import com.reactnativenavigation.options.FabOptions;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.utils.ObjectUtils;
import com.reactnativenavigation.utils.UiUtils;
import com.reactnativenavigation.utils.ViewExtensionsKt;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.stack.fab.Fab;
import com.reactnativenavigation.views.stack.fab.FabMenu;
import java.util.Iterator;

public class FabPresenter {
    private static final int DURATION = 200;
    private Fab fab;
    private FabMenu fabMenu;
    private ViewGroup viewGroup;

    public void applyOptions(FabOptions fabOptions, ViewController<?> viewController, ViewGroup viewGroup2) {
        this.viewGroup = viewGroup2;
        if (fabOptions.id.hasValue()) {
            FabMenu fabMenu2 = this.fabMenu;
            if (fabMenu2 == null || !fabMenu2.getFabId().equals(fabOptions.id.get())) {
                Fab fab2 = this.fab;
                if (fab2 == null || !fab2.getFabId().equals(fabOptions.id.get())) {
                    createFab(viewController, fabOptions);
                    return;
                }
                this.fab.bringToFront();
                setParams(viewController, this.fab, fabOptions);
                applyFabOptions(viewController, this.fab, fabOptions);
                this.fab.setOnClickListener(new FabPresenter$$ExternalSyntheticLambda4(viewController, fabOptions));
                return;
            }
            this.fabMenu.bringToFront();
            applyFabMenuOptions(viewController, this.fabMenu, fabOptions);
            setParams(viewController, this.fabMenu, fabOptions);
            return;
        }
        removeFab();
        removeFabMenu();
    }

    public void mergeOptions(FabOptions fabOptions, ViewController<?> viewController, ViewGroup viewGroup2) {
        this.viewGroup = viewGroup2;
        if (fabOptions.id.hasValue()) {
            FabMenu fabMenu2 = this.fabMenu;
            if (fabMenu2 == null || !fabMenu2.getFabId().equals(fabOptions.id.get())) {
                Fab fab2 = this.fab;
                if (fab2 == null || !fab2.getFabId().equals(fabOptions.id.get())) {
                    createFab(viewController, fabOptions);
                    return;
                }
                mergeParams(this.fab, fabOptions);
                this.fab.bringToFront();
                mergeFabOptions(viewController, this.fab, fabOptions);
                this.fab.setOnClickListener(new FabPresenter$$ExternalSyntheticLambda7(viewController, fabOptions));
                return;
            }
            mergeParams(this.fabMenu, fabOptions);
            this.fabMenu.bringToFront();
            mergeFabMenuOptions(viewController, this.fabMenu, fabOptions);
        }
    }

    private void createFab(ViewController<?> viewController, FabOptions fabOptions) {
        ViewExtensionsKt.removeFromParent(this.fabMenu);
        ViewExtensionsKt.removeFromParent(this.fab);
        if (fabOptions.actionsArray.size() > 0) {
            FabMenu fabMenu2 = new FabMenu(this.viewGroup.getContext(), (String) fabOptions.id.get());
            this.fabMenu = fabMenu2;
            setParams(viewController, fabMenu2, fabOptions);
            applyFabMenuOptions(viewController, this.fabMenu, fabOptions);
            this.viewGroup.addView(this.fabMenu);
            return;
        }
        Fab fab2 = new Fab(this.viewGroup.getContext(), (String) fabOptions.id.get());
        this.fab = fab2;
        setParams(viewController, fab2, fabOptions);
        applyFabOptions(viewController, this.fab, fabOptions);
        this.viewGroup.addView(this.fab);
        this.fab.setOnClickListener(new FabPresenter$$ExternalSyntheticLambda0(viewController, fabOptions));
        UiUtils.doOnLayout(this.fab, new FabPresenter$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$createFab$3$com-reactnativenavigation-viewcontrollers-stack-FabPresenter  reason: not valid java name */
    public /* synthetic */ void m1012lambda$createFab$3$comreactnativenavigationviewcontrollersstackFabPresenter() {
        Fab fab2 = this.fab;
        fab2.setPivotX(((float) fab2.getWidth()) / 2.0f);
        Fab fab3 = this.fab;
        fab3.setPivotY(((float) fab3.getHeight()) / 2.0f);
    }

    private void removeFabMenu() {
        FabMenu fabMenu2 = this.fabMenu;
        if (fabMenu2 != null) {
            fabMenu2.hideMenuButton(true);
            this.viewGroup.removeView(this.fabMenu);
            this.fabMenu = null;
        }
    }

    private void removeFab() {
        if (this.fab != null) {
            animateHide(new FabPresenter$$ExternalSyntheticLambda3(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$removeFab$4$com-reactnativenavigation-viewcontrollers-stack-FabPresenter  reason: not valid java name */
    public /* synthetic */ void m1013lambda$removeFab$4$comreactnativenavigationviewcontrollersstackFabPresenter() {
        this.viewGroup.removeView(this.fab);
        this.fab = null;
    }

    public void animateHide(final Runnable runnable) {
        this.fab.animate().scaleX(0.0f).scaleY(0.0f).setDuration(200).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                runnable.run();
            }
        });
    }

    private void setParams(ViewController<?> viewController, View view, FabOptions fabOptions) {
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = (int) this.viewGroup.getContext().getResources().getDimension(R.dimen.margin);
        layoutParams.leftMargin = (int) this.viewGroup.getContext().getResources().getDimension(R.dimen.margin);
        layoutParams.bottomMargin = viewController.getBottomInset() + ((int) this.viewGroup.getContext().getResources().getDimension(R.dimen.margin));
        view.setTag(R.id.fab_bottom_margin, Integer.valueOf((int) this.viewGroup.getContext().getResources().getDimension(R.dimen.margin)));
        layoutParams.gravity = 80;
        if (fabOptions.alignHorizontally.hasValue()) {
            if (ViewProps.RIGHT.equals(fabOptions.alignHorizontally.get())) {
                layoutParams.gravity |= 5;
            }
            if ("left".equals(fabOptions.alignHorizontally.get())) {
                layoutParams.gravity |= 3;
            }
        } else {
            layoutParams.gravity |= 5;
        }
        view.setLayoutParams(layoutParams);
    }

    private void mergeParams(View view, FabOptions fabOptions) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) ObjectUtils.perform(view, new CoordinatorLayout.LayoutParams(-2, -2), new FabPresenter$$ExternalSyntheticLambda2());
        view.setTag(R.id.fab_bottom_margin, Integer.valueOf(layoutParams.leftMargin));
        layoutParams.gravity = 80;
        if (fabOptions.alignHorizontally.hasValue()) {
            if (ViewProps.RIGHT.equals(fabOptions.alignHorizontally.get())) {
                layoutParams.gravity |= 5;
            }
            if ("left".equals(fabOptions.alignHorizontally.get())) {
                layoutParams.gravity |= 5;
            }
        } else {
            layoutParams.gravity |= 5;
        }
        view.setLayoutParams(layoutParams);
    }

    private void applyFabOptions(ViewController<?> viewController, Fab fab2, FabOptions fabOptions) {
        if (fabOptions.visible.isTrueOrUndefined()) {
            fab2.setScaleX(0.6f);
            fab2.setScaleY(0.6f);
            fab2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).start();
        }
        if (fabOptions.visible.isFalse()) {
            fab2.animate().scaleX(0.0f).scaleY(0.0f).setDuration(200).start();
        }
        if (fabOptions.backgroundColor.hasValue()) {
            fab2.setColorNormal(fabOptions.backgroundColor.get());
        }
        if (fabOptions.clickColor.hasValue()) {
            fab2.setColorPressed(fabOptions.clickColor.get());
        }
        if (fabOptions.rippleColor.hasValue()) {
            fab2.setColorRipple(fabOptions.rippleColor.get());
        }
        if (fabOptions.icon.hasValue()) {
            fab2.applyIcon((String) fabOptions.icon.get(), fabOptions.iconColor);
        }
        if (fabOptions.size.hasValue()) {
            fab2.setButtonSize("mini".equals(fabOptions.size.get()) ? 1 : 0);
        }
        if (fabOptions.hideOnScroll.isTrue()) {
            fab2.enableCollapse(viewController.getScrollEventListener());
        }
        if (fabOptions.hideOnScroll.isFalseOrUndefined()) {
            fab2.disableCollapse();
        }
    }

    private void mergeFabOptions(ViewController<?> viewController, Fab fab2, FabOptions fabOptions) {
        if (fabOptions.visible.isTrue()) {
            fab2.show(true);
        }
        if (fabOptions.visible.isFalse()) {
            fab2.hide(true);
        }
        if (fabOptions.backgroundColor.hasValue()) {
            fab2.setColorNormal(fabOptions.backgroundColor.get());
        }
        if (fabOptions.clickColor.hasValue()) {
            fab2.setColorPressed(fabOptions.clickColor.get());
        }
        if (fabOptions.rippleColor.hasValue()) {
            fab2.setColorRipple(fabOptions.rippleColor.get());
        }
        if (fabOptions.icon.hasValue()) {
            fab2.applyIcon((String) fabOptions.icon.get(), fabOptions.iconColor);
        }
        if (fabOptions.size.hasValue()) {
            fab2.setButtonSize("mini".equals(fabOptions.size.get()) ? 1 : 0);
        }
        if (fabOptions.hideOnScroll.isTrue()) {
            fab2.enableCollapse(viewController.getScrollEventListener());
        }
        if (fabOptions.hideOnScroll.isFalse()) {
            fab2.disableCollapse();
        }
    }

    private void applyFabMenuOptions(ViewController<?> viewController, FabMenu fabMenu2, FabOptions fabOptions) {
        if (fabOptions.visible.isTrueOrUndefined()) {
            fabMenu2.showMenuButton(true);
        }
        if (fabOptions.visible.isFalse()) {
            fabMenu2.hideMenuButton(true);
        }
        if (fabOptions.backgroundColor.hasValue()) {
            fabMenu2.setMenuButtonColorNormal(fabOptions.backgroundColor.get());
        }
        if (fabOptions.clickColor.hasValue()) {
            fabMenu2.setMenuButtonColorPressed(fabOptions.clickColor.get());
        }
        if (fabOptions.rippleColor.hasValue()) {
            fabMenu2.setMenuButtonColorRipple(fabOptions.rippleColor.get());
        }
        Iterator<Fab> it = fabMenu2.getActions().iterator();
        while (it.hasNext()) {
            fabMenu2.removeMenuButton(it.next());
        }
        fabMenu2.getActions().clear();
        Iterator<FabOptions> it2 = fabOptions.actionsArray.iterator();
        while (it2.hasNext()) {
            FabOptions next = it2.next();
            Fab fab2 = new Fab(this.viewGroup.getContext(), (String) next.id.get());
            applyFabOptions(viewController, fab2, next);
            fab2.setOnClickListener(new FabPresenter$$ExternalSyntheticLambda6(viewController, fabOptions));
            fabMenu2.getActions().add(fab2);
            fabMenu2.addMenuButton(fab2);
        }
        if (fabOptions.hideOnScroll.isTrue()) {
            fabMenu2.enableCollapse(viewController.getScrollEventListener());
        }
        if (fabOptions.hideOnScroll.isFalseOrUndefined()) {
            fabMenu2.disableCollapse();
        }
    }

    private void mergeFabMenuOptions(ViewController<?> viewController, FabMenu fabMenu2, FabOptions fabOptions) {
        if (fabOptions.visible.isTrue()) {
            fabMenu2.showMenuButton(true);
        }
        if (fabOptions.visible.isFalse()) {
            fabMenu2.hideMenuButton(true);
        }
        if (fabOptions.backgroundColor.hasValue()) {
            fabMenu2.setMenuButtonColorNormal(fabOptions.backgroundColor.get());
        }
        if (fabOptions.clickColor.hasValue()) {
            fabMenu2.setMenuButtonColorPressed(fabOptions.clickColor.get());
        }
        if (fabOptions.rippleColor.hasValue()) {
            fabMenu2.setMenuButtonColorRipple(fabOptions.rippleColor.get());
        }
        if (fabOptions.actionsArray.size() > 0) {
            Iterator<Fab> it = fabMenu2.getActions().iterator();
            while (it.hasNext()) {
                fabMenu2.removeMenuButton(it.next());
            }
            fabMenu2.getActions().clear();
            Iterator<FabOptions> it2 = fabOptions.actionsArray.iterator();
            while (it2.hasNext()) {
                FabOptions next = it2.next();
                Fab fab2 = new Fab(this.viewGroup.getContext(), (String) next.id.get());
                applyFabOptions(viewController, fab2, next);
                fab2.setOnClickListener(new FabPresenter$$ExternalSyntheticLambda5(viewController, fabOptions));
                fabMenu2.getActions().add(fab2);
                fabMenu2.addMenuButton(fab2);
            }
        }
        if (fabOptions.hideOnScroll.isTrue()) {
            fabMenu2.enableCollapse(viewController.getScrollEventListener());
        }
        if (fabOptions.hideOnScroll.isFalse()) {
            fabMenu2.disableCollapse();
        }
    }

    public void onConfigurationChanged(Options options) {
        FabOptions fabOptions = options.fabOptions;
        if (this.fab != null) {
            if (fabOptions.backgroundColor.hasValue()) {
                this.fab.setColorNormal(fabOptions.backgroundColor.get());
            }
            if (fabOptions.clickColor.hasValue()) {
                this.fab.setColorPressed(fabOptions.clickColor.get());
            }
            if (fabOptions.rippleColor.hasValue()) {
                this.fab.setColorRipple(fabOptions.rippleColor.get());
            }
            if (fabOptions.icon.hasValue()) {
                this.fab.applyIcon((String) fabOptions.icon.get(), fabOptions.iconColor);
            }
        }
        if (this.fabMenu != null) {
            if (fabOptions.backgroundColor.hasValue()) {
                this.fabMenu.setMenuButtonColorNormal(fabOptions.backgroundColor.get());
            }
            if (fabOptions.clickColor.hasValue()) {
                this.fabMenu.setMenuButtonColorPressed(fabOptions.clickColor.get());
            }
            if (fabOptions.rippleColor.hasValue()) {
                this.fabMenu.setMenuButtonColorRipple(fabOptions.rippleColor.get());
            }
        }
    }
}
