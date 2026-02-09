package com.reactnativenavigation.viewcontrollers.stack.topbar;

import android.animation.Animator;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.reactnativenavigation.options.Alignment;
import com.reactnativenavigation.options.AnimationOptions;
import com.reactnativenavigation.options.ComponentOptions;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.options.animations.ViewAnimationOptions;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.utils.ViewExtensionsKt;
import com.reactnativenavigation.utils.ViewUtils;
import com.reactnativenavigation.viewcontrollers.stack.topbar.button.ButtonController;
import com.reactnativenavigation.viewcontrollers.stack.topbar.title.TitleBarReactViewController;
import com.reactnativenavigation.views.animations.BaseViewAnimator;
import com.reactnativenavigation.views.stack.StackLayout;
import com.reactnativenavigation.views.stack.topbar.TopBar;
import com.reactnativenavigation.views.stack.topbar.titlebar.ButtonBar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u0014\u0010\u001e\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u0006\u0010\u001f\u001a\u00020\u0017J\u0018\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014J\u0016\u0010%\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010&\u001a\u00020$J\u0018\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*J\u001a\u0010,\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0006J\u001a\u00102\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020.J\u0006\u00103\u001a\u00020\u0017J\u0016\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u0002062\u0006\u0010-\u001a\u00020.J\u0010\u00107\u001a\u00020\u00172\b\u00108\u001a\u0004\u0018\u000109J$\u0010:\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\"\u0010<\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u000e\u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020?J\u0006\u0010@\u001a\u00020\u0017J\u0016\u0010A\u001a\u00020\u00172\u0006\u00105\u001a\u0002062\u0006\u0010-\u001a\u00020.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u000e\u0010\r\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006B"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/stack/topbar/TopBarController;", "", "animator", "Lcom/reactnativenavigation/viewcontrollers/stack/topbar/TopBarAnimator;", "(Lcom/reactnativenavigation/viewcontrollers/stack/topbar/TopBarAnimator;)V", "height", "", "getHeight", "()I", "leftButtonBar", "Lcom/reactnativenavigation/views/stack/topbar/titlebar/ButtonBar;", "leftButtonCount", "getLeftButtonCount", "rightButtonBar", "rightButtonCount", "getRightButtonCount", "view", "Lcom/reactnativenavigation/views/stack/topbar/TopBar;", "getView", "()Lcom/reactnativenavigation/views/stack/topbar/TopBar;", "setView", "(Lcom/reactnativenavigation/views/stack/topbar/TopBar;)V", "alignTitleComponent", "", "alignment", "Lcom/reactnativenavigation/options/Alignment;", "applyLeftButtons", "toAdd", "", "Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/ButtonController;", "applyRightButtons", "clearTopTabs", "createTopBar", "context", "Landroid/content/Context;", "stackLayout", "Lcom/reactnativenavigation/views/stack/StackLayout;", "createView", "parent", "getPopAnimation", "Landroid/animation/Animator;", "appearingOptions", "Lcom/reactnativenavigation/options/Options;", "disappearingOptions", "getPushAnimation", "additionalDy", "", "getRightButton", "Landroid/view/MenuItem;", "index", "getSetStackRootAnimation", "hide", "hideAnimate", "options", "Lcom/reactnativenavigation/options/AnimationOptions;", "initTopTabs", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "mergeLeftButtons", "toRemove", "mergeRightButtons", "setTitleComponent", "component", "Lcom/reactnativenavigation/viewcontrollers/stack/topbar/title/TitleBarReactViewController;", "show", "showAnimate", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TopBarController.kt */
public class TopBarController {
    private final TopBarAnimator animator;
    private ButtonBar leftButtonBar;
    private ButtonBar rightButtonBar;
    public TopBar view;

    public TopBarController() {
        this((TopBarAnimator) null, 1, (DefaultConstructorMarker) null);
    }

    public TopBarController(TopBarAnimator topBarAnimator) {
        Intrinsics.checkNotNullParameter(topBarAnimator, "animator");
        this.animator = topBarAnimator;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TopBarController(TopBarAnimator topBarAnimator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TopBarAnimator((TopBar) null, 1, (DefaultConstructorMarker) null) : topBarAnimator);
    }

    public final TopBar getView() {
        TopBar topBar = this.view;
        if (topBar != null) {
            return topBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ViewHierarchyConstants.VIEW_KEY);
        return null;
    }

    public final void setView(TopBar topBar) {
        Intrinsics.checkNotNullParameter(topBar, "<set-?>");
        this.view = topBar;
    }

    public final int getHeight() {
        return getView().getHeight();
    }

    public final int getRightButtonCount() {
        ButtonBar buttonBar = this.rightButtonBar;
        if (buttonBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightButtonBar");
            buttonBar = null;
        }
        return buttonBar.getButtonCount();
    }

    public final int getLeftButtonCount() {
        ButtonBar buttonBar = this.leftButtonBar;
        if (buttonBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leftButtonBar");
            buttonBar = null;
        }
        return buttonBar.getButtonCount();
    }

    public final MenuItem getRightButton(int i) {
        ButtonBar buttonBar = this.rightButtonBar;
        if (buttonBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightButtonBar");
            buttonBar = null;
        }
        return buttonBar.getButton(i);
    }

    public final TopBar createView(Context context, StackLayout stackLayout) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stackLayout, "parent");
        if (this.view == null) {
            setView(createTopBar(context, stackLayout));
            ButtonBar leftButtonBar2 = getView().getLeftButtonBar();
            Intrinsics.checkNotNullExpressionValue(leftButtonBar2, "view.leftButtonBar");
            this.leftButtonBar = leftButtonBar2;
            ButtonBar rightButtonBar2 = getView().getRightButtonBar();
            Intrinsics.checkNotNullExpressionValue(rightButtonBar2, "view.rightButtonBar");
            this.rightButtonBar = rightButtonBar2;
            this.animator.bindView(getView());
        }
        return getView();
    }

    /* access modifiers changed from: protected */
    public TopBar createTopBar(Context context, StackLayout stackLayout) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stackLayout, "stackLayout");
        return new TopBar(context);
    }

    public final void initTopTabs(ViewPager viewPager) {
        getView().initTopTabs(viewPager);
    }

    public final void clearTopTabs() {
        getView().clearTopTabs();
    }

    public static /* synthetic */ Animator getPushAnimation$default(TopBarController topBarController, Options options, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            return topBarController.getPushAnimation(options, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPushAnimation");
    }

    public final Animator getPushAnimation(Options options, float f) {
        Intrinsics.checkNotNullParameter(options, "appearingOptions");
        if (options.topBar.animate.isFalse()) {
            return null;
        }
        TopBarAnimator topBarAnimator = this.animator;
        ViewAnimationOptions viewAnimationOptions = options.animations.push.topBar;
        Bool bool = options.topBar.visible;
        Intrinsics.checkNotNullExpressionValue(bool, "appearingOptions.topBar.visible");
        return topBarAnimator.getPushAnimation(viewAnimationOptions, bool, f);
    }

    public final Animator getPopAnimation(Options options, Options options2) {
        Intrinsics.checkNotNullParameter(options, "appearingOptions");
        Intrinsics.checkNotNullParameter(options2, "disappearingOptions");
        if (options.topBar.animate.isFalse()) {
            return null;
        }
        ViewAnimationOptions viewAnimationOptions = options2.animations.pop.topBar;
        Bool bool = options.topBar.visible;
        Intrinsics.checkNotNullExpressionValue(bool, "appearingOptions.topBar.visible");
        return BaseViewAnimator.getPopAnimation$default(this.animator, viewAnimationOptions, bool, 0.0f, 4, (Object) null);
    }

    public static /* synthetic */ Animator getSetStackRootAnimation$default(TopBarController topBarController, Options options, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            return topBarController.getSetStackRootAnimation(options, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSetStackRootAnimation");
    }

    public final Animator getSetStackRootAnimation(Options options, float f) {
        Intrinsics.checkNotNullParameter(options, "appearingOptions");
        if (options.topBar.animate.isFalse()) {
            return null;
        }
        TopBarAnimator topBarAnimator = this.animator;
        ViewAnimationOptions viewAnimationOptions = options.animations.setStackRoot.topBar;
        Bool bool = options.topBar.visible;
        Intrinsics.checkNotNullExpressionValue(bool, "appearingOptions.topBar.visible");
        return topBarAnimator.getSetStackRootAnimation(viewAnimationOptions, bool, f);
    }

    public final void show() {
        if (!ViewUtils.isVisible(getView()) && !this.animator.isAnimatingShow()) {
            ViewExtensionsKt.resetViewProperties(getView());
            getView().setVisibility(0);
        }
    }

    public final void showAnimate(AnimationOptions animationOptions, float f) {
        Intrinsics.checkNotNullParameter(animationOptions, "options");
        if (!ViewUtils.isVisible(getView()) && !this.animator.isAnimatingShow()) {
            this.animator.show(animationOptions, f);
        }
    }

    public final void hide() {
        if (!this.animator.isAnimatingHide()) {
            getView().setVisibility(8);
        }
    }

    public final void hideAnimate(AnimationOptions animationOptions, float f) {
        Intrinsics.checkNotNullParameter(animationOptions, "options");
        if (ViewUtils.isVisible(getView()) && !this.animator.isAnimatingHide()) {
            BaseViewAnimator.hide$default(this.animator, animationOptions, f, (Runnable) null, 4, (Object) null);
        }
    }

    public final void setTitleComponent(TitleBarReactViewController titleBarReactViewController) {
        Intrinsics.checkNotNullParameter(titleBarReactViewController, "component");
        TopBar view2 = getView();
        View view3 = titleBarReactViewController.getView();
        ComponentOptions component = titleBarReactViewController.getComponent();
        Alignment alignment = component != null ? component.alignment : null;
        if (alignment == null) {
            alignment = Alignment.Default;
        }
        view2.setTitleComponent(view3, alignment);
    }

    public final void alignTitleComponent(Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        getView().alignTitleComponent(alignment);
    }

    public final void applyRightButtons(List<? extends ButtonController> list) {
        Intrinsics.checkNotNullParameter(list, "toAdd");
        getView().clearRightButtons();
        int i = 0;
        for (Object next : CollectionsKt.reversed(list)) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ButtonController buttonController = (ButtonController) next;
            ButtonBar buttonBar = this.rightButtonBar;
            if (buttonBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rightButtonBar");
                buttonBar = null;
            }
            buttonController.addToMenu(buttonBar, i * 10);
            i = i2;
        }
    }

    public final void mergeRightButtons(List<? extends ButtonController> list, List<? extends ButtonController> list2) {
        Intrinsics.checkNotNullParameter(list, "toAdd");
        Intrinsics.checkNotNullParameter(list2, "toRemove");
        for (ButtonController removeRightButton : list2) {
            getView().removeRightButton(removeRightButton);
        }
        int i = 0;
        for (Object next : CollectionsKt.reversed(list)) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ButtonController buttonController = (ButtonController) next;
            ButtonBar buttonBar = this.rightButtonBar;
            if (buttonBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rightButtonBar");
                buttonBar = null;
            }
            buttonController.addToMenu(buttonBar, i * 10);
            i = i2;
        }
    }

    public void applyLeftButtons(List<? extends ButtonController> list) {
        Intrinsics.checkNotNullParameter(list, "toAdd");
        getView().clearBackButton();
        getView().clearLeftButtons();
        CollectionUtils.forEachIndexed(list, new TopBarController$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    public static final void applyLeftButtons$lambda$3(TopBarController topBarController, ButtonController buttonController, int i) {
        Intrinsics.checkNotNullParameter(topBarController, "this$0");
        Intrinsics.checkNotNullParameter(buttonController, "b");
        ButtonBar buttonBar = topBarController.leftButtonBar;
        if (buttonBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leftButtonBar");
            buttonBar = null;
        }
        buttonController.addToMenu(buttonBar, i * 10);
    }

    public void mergeLeftButtons(List<? extends ButtonController> list, List<? extends ButtonController> list2) {
        Intrinsics.checkNotNullParameter(list, "toAdd");
        Intrinsics.checkNotNullParameter(list2, "toRemove");
        getView().clearBackButton();
        for (ButtonController removeLeftButton : list2) {
            getView().removeLeftButton(removeLeftButton);
        }
        CollectionUtils.forEachIndexed(list, new TopBarController$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    public static final void mergeLeftButtons$lambda$5(TopBarController topBarController, ButtonController buttonController, int i) {
        Intrinsics.checkNotNullParameter(topBarController, "this$0");
        Intrinsics.checkNotNullParameter(buttonController, "b");
        ButtonBar buttonBar = topBarController.leftButtonBar;
        if (buttonBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leftButtonBar");
            buttonBar = null;
        }
        buttonController.addToMenu(buttonBar, i * 10);
    }
}
