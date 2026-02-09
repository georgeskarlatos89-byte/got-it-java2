package com.reactnativenavigation.viewcontrollers.bottomtabs;

import android.animation.Animator;
import android.view.ViewGroup;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.reactnativenavigation.options.AnimationOptions;
import com.reactnativenavigation.options.BottomTabsOptions;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.options.animations.ViewAnimationOptions;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.options.params.Fraction;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.animations.BaseViewAnimator;
import com.reactnativenavigation.views.bottomtabs.BottomTabs;
import com.reactnativenavigation.views.bottomtabs.BottomTabsContainer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u001a\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00062\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0004J\u0012\u0010 \u001a\u00020\u00192\b\b\u0001\u0010!\u001a\u00020\u001bH\u0002J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0006J\u0016\u0010#\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010&J\u000e\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0006J\u0018\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006J\u0010\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0006J\u0010\u0010.\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0006J\u001c\u0010/\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00062\n\u00100\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u001a\u00101\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00062\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0004J\u0010\u00102\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u001bH\u0002J\u001a\u00103\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00062\n\u00100\u001a\u0006\u0012\u0002\b\u00030\u0004J\u000e\u00104\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0006J\u000e\u00105\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/bottomtabs/BottomTabsPresenter;", "", "tabs", "", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;", "defaultOptions", "Lcom/reactnativenavigation/options/Options;", "animator", "Lcom/reactnativenavigation/viewcontrollers/bottomtabs/BottomTabsAnimator;", "(Ljava/util/List;Lcom/reactnativenavigation/options/Options;Lcom/reactnativenavigation/viewcontrollers/bottomtabs/BottomTabsAnimator;)V", "getAnimator", "()Lcom/reactnativenavigation/viewcontrollers/bottomtabs/BottomTabsAnimator;", "bottomTabFinder", "Lcom/reactnativenavigation/viewcontrollers/bottomtabs/BottomTabFinder;", "bottomTabs", "Lcom/reactnativenavigation/views/bottomtabs/BottomTabs;", "bottomTabsContainer", "Lcom/reactnativenavigation/views/bottomtabs/BottomTabsContainer;", "defaultTitleState", "Lcom/aurelhubert/ahbottomnavigation/AHBottomNavigation$TitleState;", "getDefaultTitleState", "()Lcom/aurelhubert/ahbottomnavigation/AHBottomNavigation$TitleState;", "tabSelector", "Lcom/reactnativenavigation/viewcontrollers/bottomtabs/TabSelector;", "applyBottomInset", "", "bottomInset", "", "applyBottomTabsOptions", "options", "applyChildOptions", "child", "applyDrawBehind", "tabIndex", "applyOptions", "bindView", "findTabIndexByTabId", "id", "", "getBottomInset", "resolvedOptions", "getPopAnimation", "Landroid/animation/Animator;", "appearingOptions", "disappearingOptions", "getPushAnimation", "getSetStackRootAnimation", "mergeBottomTabsOptions", "view", "mergeChildOptions", "mergeDrawBehind", "mergeOptions", "onConfigurationChanged", "setDefaultOptions", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: BottomTabsPresenter.kt */
public final class BottomTabsPresenter {
    private final BottomTabsAnimator animator;
    private final BottomTabFinder bottomTabFinder;
    private BottomTabs bottomTabs;
    private BottomTabsContainer bottomTabsContainer;
    private Options defaultOptions;
    private TabSelector tabSelector;
    private final List<ViewController<?>> tabs;

    public BottomTabsPresenter(List<? extends ViewController<?>> list, Options options, BottomTabsAnimator bottomTabsAnimator) {
        Intrinsics.checkNotNullParameter(list, "tabs");
        Intrinsics.checkNotNullParameter(options, "defaultOptions");
        Intrinsics.checkNotNullParameter(bottomTabsAnimator, "animator");
        this.tabs = list;
        this.defaultOptions = options;
        this.animator = bottomTabsAnimator;
        this.bottomTabFinder = new BottomTabFinder(list);
    }

    public final BottomTabsAnimator getAnimator() {
        return this.animator;
    }

    private final AHBottomNavigation.TitleState getDefaultTitleState() {
        BottomTabs bottomTabs2 = this.bottomTabs;
        if (bottomTabs2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
            bottomTabs2 = null;
        }
        int itemsCount = bottomTabs2.getItemsCount();
        for (int i = 0; i < itemsCount; i++) {
            BottomTabs bottomTabs3 = this.bottomTabs;
            if (bottomTabs3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
                bottomTabs3 = null;
            }
            if (bottomTabs3.getItem(i).hasIcon()) {
                return AHBottomNavigation.TitleState.SHOW_WHEN_ACTIVE;
            }
        }
        return AHBottomNavigation.TitleState.ALWAYS_SHOW;
    }

    public final void setDefaultOptions(Options options) {
        Intrinsics.checkNotNullParameter(options, "defaultOptions");
        this.defaultOptions = options;
    }

    public final void bindView(BottomTabsContainer bottomTabsContainer2, TabSelector tabSelector2) {
        Intrinsics.checkNotNullParameter(bottomTabsContainer2, "bottomTabsContainer");
        Intrinsics.checkNotNullParameter(tabSelector2, "tabSelector");
        this.bottomTabsContainer = bottomTabsContainer2;
        BottomTabs bottomTabs2 = bottomTabsContainer2.getBottomTabs();
        this.bottomTabs = bottomTabs2;
        this.tabSelector = tabSelector2;
        BottomTabsAnimator bottomTabsAnimator = this.animator;
        if (bottomTabs2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
            bottomTabs2 = null;
        }
        bottomTabsAnimator.bindView(bottomTabs2);
    }

    public final void mergeOptions(Options options, ViewController<?> viewController) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(viewController, ViewHierarchyConstants.VIEW_KEY);
        mergeBottomTabsOptions(options, viewController);
    }

    public final void applyOptions(Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Options withDefaultOptions = options.copy().withDefaultOptions(this.defaultOptions);
        Intrinsics.checkNotNullExpressionValue(withDefaultOptions, "options.copy().withDefaultOptions(defaultOptions)");
        applyBottomTabsOptions(withDefaultOptions);
    }

    public final void applyChildOptions(Options options, ViewController<?> viewController) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(viewController, "child");
        int findByControllerId = this.bottomTabFinder.findByControllerId(viewController.getId());
        if (findByControllerId >= 0) {
            Options withDefaultOptions = options.copy().withDefaultOptions(this.defaultOptions);
            Intrinsics.checkNotNullExpressionValue(withDefaultOptions, "options.copy().withDefaultOptions(defaultOptions)");
            applyBottomTabsOptions(withDefaultOptions);
            applyDrawBehind(findByControllerId);
        }
    }

    public final void mergeChildOptions(Options options, ViewController<?> viewController) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(viewController, "child");
        mergeBottomTabsOptions(options, viewController);
        int findByControllerId = this.bottomTabFinder.findByControllerId(viewController.getId());
        if (findByControllerId >= 0) {
            mergeDrawBehind(findByControllerId);
        }
    }

    private final void mergeBottomTabsOptions(Options options, ViewController<?> viewController) {
        int findByControllerId;
        BottomTabsOptions bottomTabsOptions = options.bottomTabsOptions;
        Intrinsics.checkNotNullExpressionValue(bottomTabsOptions, "options.bottomTabsOptions");
        BottomTabsContainer bottomTabsContainer2 = null;
        if (options.layout.direction.hasValue()) {
            BottomTabs bottomTabs2 = this.bottomTabs;
            if (bottomTabs2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
                bottomTabs2 = null;
            }
            bottomTabs2.setLayoutDirection(options.layout.direction);
        }
        if (bottomTabsOptions.preferLargeIcons.hasValue()) {
            BottomTabs bottomTabs3 = this.bottomTabs;
            if (bottomTabs3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
                bottomTabs3 = null;
            }
            Object obj = bottomTabsOptions.preferLargeIcons.get();
            Intrinsics.checkNotNullExpressionValue(obj, "bottomTabsOptions.preferLargeIcons.get()");
            bottomTabs3.setPreferLargeIcons(((Boolean) obj).booleanValue());
        }
        if (bottomTabsOptions.titleDisplayMode.hasValue()) {
            BottomTabs bottomTabs4 = this.bottomTabs;
            if (bottomTabs4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
                bottomTabs4 = null;
            }
            bottomTabs4.setTitleState(bottomTabsOptions.titleDisplayMode.toState());
        }
        if (bottomTabsOptions.backgroundColor.hasValue()) {
            BottomTabsContainer bottomTabsContainer3 = this.bottomTabsContainer;
            if (bottomTabsContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer3 = null;
            }
            bottomTabsContainer3.setBackgroundColor(bottomTabsOptions.backgroundColor.get());
        }
        if (bottomTabsOptions.animateTabSelection.hasValue()) {
            BottomTabs bottomTabs5 = this.bottomTabs;
            if (bottomTabs5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
                bottomTabs5 = null;
            }
            Object obj2 = bottomTabsOptions.animateTabSelection.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "bottomTabsOptions.animateTabSelection.get()");
            bottomTabs5.setAnimateTabSelection(((Boolean) obj2).booleanValue());
        }
        if (bottomTabsOptions.currentTabIndex.hasValue()) {
            Integer num = (Integer) bottomTabsOptions.currentTabIndex.get();
            Intrinsics.checkNotNullExpressionValue(num, "tabIndex");
            if (num.intValue() >= 0) {
                TabSelector tabSelector2 = this.tabSelector;
                if (tabSelector2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabSelector");
                    tabSelector2 = null;
                }
                tabSelector2.selectTab(num.intValue());
            }
        }
        if (bottomTabsOptions.testId.hasValue()) {
            BottomTabs bottomTabs6 = this.bottomTabs;
            if (bottomTabs6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
                bottomTabs6 = null;
            }
            bottomTabs6.setTag(bottomTabsOptions.testId.get());
        }
        if (bottomTabsOptions.currentTabId.hasValue() && (findByControllerId = this.bottomTabFinder.findByControllerId((String) bottomTabsOptions.currentTabId.get())) >= 0) {
            TabSelector tabSelector3 = this.tabSelector;
            if (tabSelector3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabSelector");
                tabSelector3 = null;
            }
            tabSelector3.selectTab(findByControllerId);
        }
        if (bottomTabsOptions.hideOnScroll.hasValue()) {
            BottomTabs bottomTabs7 = this.bottomTabs;
            if (bottomTabs7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
                bottomTabs7 = null;
            }
            Object obj3 = bottomTabsOptions.hideOnScroll.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "bottomTabsOptions.hideOnScroll.get()");
            bottomTabs7.setBehaviorTranslationEnabled(((Boolean) obj3).booleanValue());
        }
        if (bottomTabsOptions.borderColor.hasValue()) {
            BottomTabsContainer bottomTabsContainer4 = this.bottomTabsContainer;
            if (bottomTabsContainer4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer4 = null;
            }
            bottomTabsContainer4.setTopOutLineColor(bottomTabsOptions.borderColor.get());
            BottomTabsContainer bottomTabsContainer5 = this.bottomTabsContainer;
            if (bottomTabsContainer5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer5 = null;
            }
            bottomTabsContainer5.showTopLine();
        }
        if (bottomTabsOptions.borderWidth.hasValue()) {
            BottomTabsContainer bottomTabsContainer6 = this.bottomTabsContainer;
            if (bottomTabsContainer6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer6 = null;
            }
            Object obj4 = bottomTabsOptions.borderWidth.get();
            Intrinsics.checkNotNullExpressionValue(obj4, "bottomTabsOptions.borderWidth.get()");
            bottomTabsContainer6.setTopOutlineWidth(MathKt.roundToInt(((Number) obj4).doubleValue()));
            BottomTabsContainer bottomTabsContainer7 = this.bottomTabsContainer;
            if (bottomTabsContainer7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer7 = null;
            }
            bottomTabsContainer7.showTopLine();
        }
        if (bottomTabsOptions.shadowOptions.hasValue()) {
            if (bottomTabsOptions.shadowOptions.getColor().hasValue()) {
                BottomTabsContainer bottomTabsContainer8 = this.bottomTabsContainer;
                if (bottomTabsContainer8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                    bottomTabsContainer8 = null;
                }
                bottomTabsContainer8.setShadowColor(bottomTabsOptions.shadowOptions.getColor().get());
            }
            if (bottomTabsOptions.shadowOptions.getRadius().hasValue()) {
                BottomTabsContainer bottomTabsContainer9 = this.bottomTabsContainer;
                if (bottomTabsContainer9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                    bottomTabsContainer9 = null;
                }
                bottomTabsContainer9.setShadowRadius((float) ((Number) bottomTabsOptions.shadowOptions.getRadius().get()).doubleValue());
            }
            if (bottomTabsOptions.shadowOptions.getOpacity().hasValue()) {
                BottomTabsContainer bottomTabsContainer10 = this.bottomTabsContainer;
                if (bottomTabsContainer10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                    bottomTabsContainer10 = null;
                }
                bottomTabsContainer10.setShadowOpacity((float) ((Number) bottomTabsOptions.shadowOptions.getOpacity().get()).doubleValue());
            }
            BottomTabsContainer bottomTabsContainer11 = this.bottomTabsContainer;
            if (bottomTabsContainer11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer11 = null;
            }
            bottomTabsContainer11.showShadow();
        }
        if (viewController.isViewShown()) {
            if (bottomTabsOptions.visible.isTrue()) {
                if (bottomTabsOptions.animate.isTrueOrUndefined()) {
                    BaseViewAnimator.show$default(this.animator, (AnimationOptions) null, 0.0f, 3, (Object) null);
                } else {
                    BottomTabs bottomTabs8 = this.bottomTabs;
                    if (bottomTabs8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
                        bottomTabs8 = null;
                    }
                    bottomTabs8.restoreBottomNavigation(false);
                }
                BottomTabsContainer bottomTabsContainer12 = this.bottomTabsContainer;
                if (bottomTabsContainer12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                    bottomTabsContainer12 = null;
                }
                bottomTabsContainer12.revealTopOutline();
            }
            if (bottomTabsOptions.visible.isFalse()) {
                if (bottomTabsOptions.animate.isTrueOrUndefined()) {
                    BaseViewAnimator.hide$default(this.animator, (AnimationOptions) null, 0.0f, (Runnable) null, 7, (Object) null);
                } else {
                    BottomTabs bottomTabs9 = this.bottomTabs;
                    if (bottomTabs9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
                        bottomTabs9 = null;
                    }
                    bottomTabs9.hideBottomNavigation(false);
                }
                BottomTabsContainer bottomTabsContainer13 = this.bottomTabsContainer;
                if (bottomTabsContainer13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                } else {
                    bottomTabsContainer2 = bottomTabsContainer13;
                }
                bottomTabsContainer2.hideTopOutLine();
            }
        }
    }

    private final void applyDrawBehind(int i) {
        this.tabs.get(i).applyBottomInset();
    }

    private final void mergeDrawBehind(int i) {
        this.tabs.get(i).applyBottomInset();
    }

    private final void applyBottomTabsOptions(Options options) {
        int findByControllerId;
        BottomTabsOptions bottomTabsOptions = options.bottomTabsOptions;
        Intrinsics.checkNotNullExpressionValue(bottomTabsOptions, "options.bottomTabsOptions");
        BottomTabs bottomTabs2 = this.bottomTabs;
        BottomTabs bottomTabs3 = null;
        if (bottomTabs2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
            bottomTabs2 = null;
        }
        bottomTabs2.setLayoutDirection(options.layout.direction);
        BottomTabs bottomTabs4 = this.bottomTabs;
        if (bottomTabs4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
            bottomTabs4 = null;
        }
        Object obj = options.bottomTabsOptions.preferLargeIcons.get(false);
        Intrinsics.checkNotNullExpressionValue(obj, "options.bottomTabsOptions.preferLargeIcons[false]");
        bottomTabs4.setPreferLargeIcons(((Boolean) obj).booleanValue());
        BottomTabs bottomTabs5 = this.bottomTabs;
        if (bottomTabs5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
            bottomTabs5 = null;
        }
        bottomTabs5.setTitleState(bottomTabsOptions.titleDisplayMode.get(getDefaultTitleState()));
        BottomTabsContainer bottomTabsContainer2 = this.bottomTabsContainer;
        if (bottomTabsContainer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
            bottomTabsContainer2 = null;
        }
        Integer num = bottomTabsOptions.backgroundColor.get(-1);
        Intrinsics.checkNotNull(num);
        bottomTabsContainer2.setBackgroundColor(num.intValue());
        BottomTabs bottomTabs6 = this.bottomTabs;
        if (bottomTabs6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
            bottomTabs6 = null;
        }
        Object obj2 = bottomTabsOptions.animateTabSelection.get(true);
        Intrinsics.checkNotNullExpressionValue(obj2, "bottomTabsOptions.animateTabSelection.get(true)");
        bottomTabs6.setAnimateTabSelection(((Boolean) obj2).booleanValue());
        if (bottomTabsOptions.currentTabIndex.hasValue()) {
            Integer num2 = (Integer) bottomTabsOptions.currentTabIndex.get();
            Intrinsics.checkNotNullExpressionValue(num2, "tabIndex");
            if (num2.intValue() >= 0) {
                bottomTabsOptions.currentTabIndex.consume();
                TabSelector tabSelector2 = this.tabSelector;
                if (tabSelector2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabSelector");
                    tabSelector2 = null;
                }
                tabSelector2.selectTab(num2.intValue());
            }
        }
        if (bottomTabsOptions.testId.hasValue()) {
            BottomTabs bottomTabs7 = this.bottomTabs;
            if (bottomTabs7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
                bottomTabs7 = null;
            }
            bottomTabs7.setTag(bottomTabsOptions.testId.get());
        }
        if (bottomTabsOptions.currentTabId.hasValue() && (findByControllerId = this.bottomTabFinder.findByControllerId((String) bottomTabsOptions.currentTabId.get())) >= 0) {
            bottomTabsOptions.currentTabId.consume();
            TabSelector tabSelector3 = this.tabSelector;
            if (tabSelector3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabSelector");
                tabSelector3 = null;
            }
            tabSelector3.selectTab(findByControllerId);
        }
        if (bottomTabsOptions.visible.isTrueOrUndefined()) {
            if (bottomTabsOptions.animate.isTrueOrUndefined()) {
                BaseViewAnimator.show$default(this.animator, (AnimationOptions) null, 0.0f, 3, (Object) null);
            } else {
                BottomTabs bottomTabs8 = this.bottomTabs;
                if (bottomTabs8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
                    bottomTabs8 = null;
                }
                bottomTabs8.restoreBottomNavigation(false);
            }
        }
        if (bottomTabsOptions.visible.isFalse()) {
            if (bottomTabsOptions.animate.isTrueOrUndefined()) {
                BaseViewAnimator.hide$default(this.animator, (AnimationOptions) null, 0.0f, (Runnable) null, 7, (Object) null);
            } else {
                BottomTabs bottomTabs9 = this.bottomTabs;
                if (bottomTabs9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
                    bottomTabs9 = null;
                }
                bottomTabs9.hideBottomNavigation(false);
            }
        }
        if (bottomTabsOptions.elevation.hasValue()) {
            BottomTabsContainer bottomTabsContainer3 = this.bottomTabsContainer;
            if (bottomTabsContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer3 = null;
            }
            Fraction fraction = bottomTabsOptions.elevation;
            Intrinsics.checkNotNullExpressionValue(fraction, "bottomTabsOptions.elevation");
            bottomTabsContainer3.setElevation(fraction);
        }
        if (bottomTabsOptions.borderColor.hasValue()) {
            BottomTabsContainer bottomTabsContainer4 = this.bottomTabsContainer;
            if (bottomTabsContainer4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer4 = null;
            }
            bottomTabsContainer4.setTopOutLineColor(bottomTabsOptions.borderColor.get());
            BottomTabsContainer bottomTabsContainer5 = this.bottomTabsContainer;
            if (bottomTabsContainer5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer5 = null;
            }
            bottomTabsContainer5.showTopLine();
        } else if (bottomTabsOptions.borderWidth.hasValue()) {
            BottomTabsContainer bottomTabsContainer6 = this.bottomTabsContainer;
            if (bottomTabsContainer6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer6 = null;
            }
            Object obj3 = bottomTabsOptions.borderWidth.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "bottomTabsOptions.borderWidth.get()");
            bottomTabsContainer6.setTopOutlineWidth(MathKt.roundToInt(((Number) obj3).doubleValue()));
            BottomTabsContainer bottomTabsContainer7 = this.bottomTabsContainer;
            if (bottomTabsContainer7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer7 = null;
            }
            bottomTabsContainer7.showTopLine();
        } else {
            BottomTabsContainer bottomTabsContainer8 = this.bottomTabsContainer;
            if (bottomTabsContainer8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer8 = null;
            }
            bottomTabsContainer8.clearTopOutline();
        }
        if (bottomTabsOptions.shadowOptions.hasValue()) {
            if (bottomTabsOptions.shadowOptions.getColor().hasValue()) {
                BottomTabsContainer bottomTabsContainer9 = this.bottomTabsContainer;
                if (bottomTabsContainer9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                    bottomTabsContainer9 = null;
                }
                bottomTabsContainer9.setShadowColor(bottomTabsOptions.shadowOptions.getColor().get());
            }
            if (bottomTabsOptions.shadowOptions.getRadius().hasValue()) {
                BottomTabsContainer bottomTabsContainer10 = this.bottomTabsContainer;
                if (bottomTabsContainer10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                    bottomTabsContainer10 = null;
                }
                bottomTabsContainer10.setShadowRadius((float) ((Number) bottomTabsOptions.shadowOptions.getRadius().get()).doubleValue());
            }
            if (bottomTabsOptions.shadowOptions.getOpacity().hasValue()) {
                BottomTabsContainer bottomTabsContainer11 = this.bottomTabsContainer;
                if (bottomTabsContainer11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                    bottomTabsContainer11 = null;
                }
                bottomTabsContainer11.setShadowOpacity((float) ((Number) bottomTabsOptions.shadowOptions.getOpacity().get()).doubleValue());
            }
            BottomTabsContainer bottomTabsContainer12 = this.bottomTabsContainer;
            if (bottomTabsContainer12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer12 = null;
            }
            bottomTabsContainer12.showShadow();
        } else {
            BottomTabsContainer bottomTabsContainer13 = this.bottomTabsContainer;
            if (bottomTabsContainer13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer13 = null;
            }
            bottomTabsContainer13.clearShadow();
        }
        BottomTabs bottomTabs10 = this.bottomTabs;
        if (bottomTabs10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
        } else {
            bottomTabs3 = bottomTabs10;
        }
        Object obj4 = bottomTabsOptions.hideOnScroll.get(false);
        Intrinsics.checkNotNullExpressionValue(obj4, "bottomTabsOptions.hideOnScroll[false]");
        bottomTabs3.setBehaviorTranslationEnabled(((Boolean) obj4).booleanValue());
    }

    public final void applyBottomInset(int i) {
        BottomTabsContainer bottomTabsContainer2 = this.bottomTabsContainer;
        BottomTabsContainer bottomTabsContainer3 = null;
        if (bottomTabsContainer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
            bottomTabsContainer2 = null;
        }
        ViewGroup.LayoutParams layoutParams = bottomTabsContainer2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i);
        BottomTabsContainer bottomTabsContainer4 = this.bottomTabsContainer;
        if (bottomTabsContainer4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
        } else {
            bottomTabsContainer3 = bottomTabsContainer4;
        }
        bottomTabsContainer3.requestLayout();
    }

    public final int getBottomInset(Options options) {
        Intrinsics.checkNotNullParameter(options, "resolvedOptions");
        if (options.withDefaultOptions(this.defaultOptions).bottomTabsOptions.isHiddenOrDrawBehind()) {
            return 0;
        }
        BottomTabs bottomTabs2 = this.bottomTabs;
        if (bottomTabs2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
            bottomTabs2 = null;
        }
        return bottomTabs2.getHeight();
    }

    public final Animator getPushAnimation(Options options) {
        Intrinsics.checkNotNullParameter(options, "appearingOptions");
        if (options.bottomTabsOptions.animate.isFalse()) {
            return null;
        }
        ViewAnimationOptions viewAnimationOptions = options.animations.push.bottomTabs;
        Bool bool = options.bottomTabsOptions.visible;
        Intrinsics.checkNotNullExpressionValue(bool, "appearingOptions.bottomTabsOptions.visible");
        return BaseViewAnimator.getPushAnimation$default(this.animator, viewAnimationOptions, bool, 0.0f, 4, (Object) null);
    }

    public final Animator getPopAnimation(Options options, Options options2) {
        Intrinsics.checkNotNullParameter(options, "appearingOptions");
        Intrinsics.checkNotNullParameter(options2, "disappearingOptions");
        if (options.bottomTabsOptions.animate.isFalse()) {
            return null;
        }
        ViewAnimationOptions viewAnimationOptions = options2.animations.pop.bottomTabs;
        Bool bool = options.bottomTabsOptions.visible;
        Intrinsics.checkNotNullExpressionValue(bool, "appearingOptions.bottomTabsOptions.visible");
        return BaseViewAnimator.getPopAnimation$default(this.animator, viewAnimationOptions, bool, 0.0f, 4, (Object) null);
    }

    public final Animator getSetStackRootAnimation(Options options) {
        Intrinsics.checkNotNullParameter(options, "appearingOptions");
        if (options.bottomTabsOptions.animate.isFalse()) {
            return null;
        }
        ViewAnimationOptions viewAnimationOptions = options.animations.setStackRoot.bottomTabs;
        Bool bool = options.bottomTabsOptions.visible;
        Intrinsics.checkNotNullExpressionValue(bool, "appearingOptions.bottomTabsOptions.visible");
        return BaseViewAnimator.getSetStackRootAnimation$default(this.animator, viewAnimationOptions, bool, 0.0f, 4, (Object) null);
    }

    public final int findTabIndexByTabId(String str) {
        return Math.max(this.bottomTabFinder.findByControllerId(str), 0);
    }

    public final void onConfigurationChanged(Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        BottomTabsOptions bottomTabsOptions = options.withDefaultOptions(this.defaultOptions).bottomTabsOptions;
        Intrinsics.checkNotNullExpressionValue(bottomTabsOptions, "options.withDefaultOptio…ptions).bottomTabsOptions");
        BottomTabs bottomTabs2 = this.bottomTabs;
        BottomTabsContainer bottomTabsContainer2 = null;
        if (bottomTabs2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomTabs");
            bottomTabs2 = null;
        }
        Integer num = bottomTabsOptions.backgroundColor.get(-1);
        Intrinsics.checkNotNull(num);
        bottomTabs2.setBackgroundColor(num.intValue());
        if (bottomTabsOptions.shadowOptions.hasValue() && bottomTabsOptions.shadowOptions.getColor().hasValue()) {
            BottomTabsContainer bottomTabsContainer3 = this.bottomTabsContainer;
            if (bottomTabsContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer3 = null;
            }
            bottomTabsContainer3.setShadowColor(bottomTabsOptions.shadowOptions.getColor().get());
        }
        if (bottomTabsOptions.borderColor.hasValue()) {
            BottomTabsContainer bottomTabsContainer4 = this.bottomTabsContainer;
            if (bottomTabsContainer4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
                bottomTabsContainer4 = null;
            }
            bottomTabsContainer4.setTopOutLineColor(bottomTabsOptions.borderColor.get());
            BottomTabsContainer bottomTabsContainer5 = this.bottomTabsContainer;
            if (bottomTabsContainer5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomTabsContainer");
            } else {
                bottomTabsContainer2 = bottomTabsContainer5;
            }
            bottomTabsContainer2.showTopLine();
        }
    }
}
