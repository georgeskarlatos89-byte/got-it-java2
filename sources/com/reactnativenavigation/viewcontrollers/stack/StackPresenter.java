package com.reactnativenavigation.viewcontrollers.stack;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.reactnativenavigation.options.Alignment;
import com.reactnativenavigation.options.AnimationOptions;
import com.reactnativenavigation.options.ButtonOptions;
import com.reactnativenavigation.options.ComponentOptions;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.options.OrientationOptions;
import com.reactnativenavigation.options.TopBarButtons;
import com.reactnativenavigation.options.TopBarOptions;
import com.reactnativenavigation.options.TopTabOptions;
import com.reactnativenavigation.options.TopTabsOptions;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.options.parsers.TypefaceLoader;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.utils.ObjectUtils;
import com.reactnativenavigation.utils.RenderChecker;
import com.reactnativenavigation.utils.SystemUiUtils;
import com.reactnativenavigation.utils.UiUtils;
import com.reactnativenavigation.viewcontrollers.bottomtabs.BottomTabsController;
import com.reactnativenavigation.viewcontrollers.stack.topbar.TopBarBackgroundViewController;
import com.reactnativenavigation.viewcontrollers.stack.topbar.TopBarController;
import com.reactnativenavigation.viewcontrollers.stack.topbar.button.ButtonController;
import com.reactnativenavigation.viewcontrollers.stack.topbar.button.ButtonPresenter;
import com.reactnativenavigation.viewcontrollers.stack.topbar.button.IconResolver;
import com.reactnativenavigation.viewcontrollers.stack.topbar.title.TitleBarReactViewController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.IReactView;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.stack.topbar.TopBar;
import com.reactnativenavigation.views.stack.topbar.TopBarBackgroundView;
import com.reactnativenavigation.views.stack.topbar.TopBarBackgroundViewCreator;
import com.reactnativenavigation.views.stack.topbar.titlebar.TitleBarButtonCreator;
import com.reactnativenavigation.views.stack.topbar.titlebar.TitleBarReactViewCreator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StackPresenter {
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final double DEFAULT_ELEVATION = 4.0d;
    private final Activity activity;
    private final Map<View, TopBarBackgroundViewController> backgroundControllers = new HashMap();
    private BottomTabsController bottomTabsController;
    private final TitleBarButtonCreator buttonCreator;
    private final Map<View, Map<String, ButtonController>> componentLeftButtons = new HashMap();
    private final Map<View, Map<String, ButtonController>> componentRightButtons = new HashMap();
    private List<ButtonController> currentLeftButtons = new ArrayList();
    private List<ButtonController> currentRightButtons = new ArrayList();
    private Options defaultOptions;
    private final IconResolver iconResolver;
    private ButtonController.OnClickListener onClickListener;
    private final RenderChecker renderChecker;
    private final Map<View, TitleBarReactViewController> titleControllers = new HashMap();
    private final TitleBarReactViewCreator titleViewCreator;
    private TopBar topBar;
    private final TopBarBackgroundViewCreator topBarBackgroundViewCreator;
    private TopBarController topBarController;
    private final TypefaceLoader typefaceLoader;

    public StackPresenter(Activity activity2, TitleBarReactViewCreator titleBarReactViewCreator, TopBarBackgroundViewCreator topBarBackgroundViewCreator2, TitleBarButtonCreator titleBarButtonCreator, IconResolver iconResolver2, TypefaceLoader typefaceLoader2, RenderChecker renderChecker2, Options options) {
        this.activity = activity2;
        this.titleViewCreator = titleBarReactViewCreator;
        this.topBarBackgroundViewCreator = topBarBackgroundViewCreator2;
        this.buttonCreator = titleBarButtonCreator;
        this.iconResolver = iconResolver2;
        this.typefaceLoader = typefaceLoader2;
        this.renderChecker = renderChecker2;
        this.defaultOptions = options;
    }

    public void setDefaultOptions(Options options) {
        this.defaultOptions = options;
    }

    public void setButtonOnClickListener(ButtonController.OnClickListener onClickListener2) {
        this.onClickListener = onClickListener2;
    }

    public Options getDefaultOptions() {
        return this.defaultOptions;
    }

    public void bindView(TopBarController topBarController2, BottomTabsController bottomTabsController2) {
        this.topBarController = topBarController2;
        this.bottomTabsController = bottomTabsController2;
        this.topBar = topBarController2.getView();
    }

    public boolean isRendered(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((Collection) ObjectUtils.perform(this.componentRightButtons.get(view), new ArrayList(), new StackPresenter$$ExternalSyntheticLambda16()));
        arrayList.addAll((Collection) ObjectUtils.perform(this.componentLeftButtons.get(view), new ArrayList(), new StackPresenter$$ExternalSyntheticLambda16()));
        arrayList.add(this.backgroundControllers.get(view));
        arrayList.add(this.titleControllers.get(view));
        return this.renderChecker.areRendered(CollectionUtils.filter(arrayList, new StackPresenter$$ExternalSyntheticLambda1()));
    }

    public void mergeOptions(Options options, StackController stackController, ViewController<?> viewController) {
        TopBarOptions mergeWithDefault = options.topBar.copy().mergeWithDefault(stackController.resolveChildOptions(viewController).topBar).mergeWithDefault(this.defaultOptions.topBar);
        mergeOrientation(options.layout.orientation);
        mergeTopBarOptions(mergeWithDefault, options, stackController, viewController);
        mergeTopTabsOptions(options.topTabs);
        mergeTopTabOptions(options.topTabOptions);
    }

    public void onConfigurationChanged(Options options) {
        if (this.topBar != null) {
            Options withDefaultOptions = options.copy().withDefaultOptions(this.defaultOptions);
            List<ButtonController> list = this.currentRightButtons;
            if (list != null && !list.isEmpty()) {
                this.topBarController.applyRightButtons(this.currentRightButtons);
            }
            List<ButtonController> list2 = this.currentLeftButtons;
            if (list2 != null && !list2.isEmpty()) {
                this.topBarController.applyLeftButtons(this.currentLeftButtons);
            }
            if (withDefaultOptions.topBar.buttons.back.visible.isTrue()) {
                this.topBar.setBackButton(m1025lambda$getOrCreateButtonControllersByInstanceId$0$comreactnativenavigationviewcontrollersstackStackPresenter(withDefaultOptions.topBar.buttons.back));
            }
            this.topBar.setOverflowButtonColor(withDefaultOptions.topBar.rightButtonColor.get(-16777216).intValue());
            this.topBar.applyTopTabsColors(withDefaultOptions.topTabs.selectedTabColor, withDefaultOptions.topTabs.unselectedTabColor);
            this.topBar.setBorderColor(withDefaultOptions.topBar.borderColor.get(-16777216).intValue());
            this.topBar.setBackgroundColor(withDefaultOptions.topBar.background.color.get(-1).intValue());
            this.topBar.setTitleTextColor(withDefaultOptions.topBar.title.color.get(-16777216).intValue());
            this.topBar.setSubtitleColor(withDefaultOptions.topBar.subtitle.color.get(-16777216).intValue());
        }
    }

    public void applyInitialChildLayoutOptions(Options options) {
        applyTopBarVisibility(options.copy().withDefaultOptions(this.defaultOptions).topBar);
    }

    public void applyChildOptions(Options options, StackController stackController, ViewController<?> viewController) {
        Options withDefaultOptions = options.copy().withDefaultOptions(this.defaultOptions);
        applyOrientation(withDefaultOptions.layout.orientation);
        applyButtons(withDefaultOptions.topBar, viewController);
        applyTopBarOptions(withDefaultOptions, stackController, viewController);
        applyTopTabsOptions(withDefaultOptions.topTabs);
        applyTopTabOptions(withDefaultOptions.topTabOptions);
    }

    public void applyOrientation(OrientationOptions orientationOptions) {
        ((Activity) this.topBar.getContext()).setRequestedOrientation(orientationOptions.copy().mergeWithDefault(this.defaultOptions.layout.orientation).getValue());
    }

    public void onChildDestroyed(ViewController<?> viewController) {
        ObjectUtils.perform(this.titleControllers.remove(viewController.getView()), new StackPresenter$$ExternalSyntheticLambda10());
        ObjectUtils.perform(this.backgroundControllers.remove(viewController.getView()), new StackPresenter$$ExternalSyntheticLambda6());
        destroyButtons(this.componentRightButtons.get(viewController.getView()));
        destroyButtons(this.componentLeftButtons.get(viewController.getView()));
        this.componentRightButtons.remove(viewController.getView());
        this.componentLeftButtons.remove(viewController.getView());
    }

    private void destroyButtons(Map<String, ButtonController> map) {
        if (map != null) {
            CollectionUtils.forEach(map.values(), new StackPresenter$$ExternalSyntheticLambda13());
        }
    }

    private void applyTopBarOptions(Options options, StackController stackController, ViewController<?> viewController) {
        Object view = viewController.getView();
        TopBarOptions topBarOptions = options.topBar;
        Options withDefaultOptions = stackController.resolveChildOptions(viewController).withDefaultOptions(this.defaultOptions);
        this.topBar.setTestId((String) topBarOptions.testId.get(""));
        this.topBar.setLayoutDirection(options.layout.direction);
        applyStatusBarDrawBehindOptions(topBarOptions, withDefaultOptions);
        this.topBar.setElevation((Double) topBarOptions.elevation.get(Double.valueOf(DEFAULT_ELEVATION)));
        if (topBarOptions.topMargin.hasValue() && (this.topBar.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) this.topBar.getLayoutParams()).topMargin = UiUtils.dpToPx((Context) this.activity, ((Integer) topBarOptions.topMargin.get(0)).intValue());
        }
        this.topBar.setTitleHeight(((Integer) topBarOptions.title.height.get(Integer.valueOf(UiUtils.getTopBarHeightDp(this.activity)))).intValue());
        this.topBar.setTitleTopMargin(((Integer) topBarOptions.title.topMargin.get(0)).intValue());
        if (topBarOptions.title.component.hasValue()) {
            if (this.titleControllers.containsKey(view)) {
                this.topBarController.setTitleComponent((TitleBarReactViewController) Objects.requireNonNull(this.titleControllers.get(view)));
            } else {
                TitleBarReactViewController titleBarReactViewController = new TitleBarReactViewController(this.activity, this.titleViewCreator, topBarOptions.title.component);
                titleBarReactViewController.setWaitForRender(topBarOptions.title.component.waitForRender);
                this.titleControllers.put(view, titleBarReactViewController);
                this.topBarController.setTitleComponent(titleBarReactViewController);
            }
            this.topBarController.alignTitleComponent(topBarOptions.title.component.alignment);
        } else {
            this.topBar.applyTitleOptions(topBarOptions.title, this.typefaceLoader);
            this.topBar.applySubtitleOptions(topBarOptions.subtitle, this.typefaceLoader);
            this.topBarController.alignTitleComponent(topBarOptions.title.alignment);
        }
        this.topBar.setBorderHeight(((Double) topBarOptions.borderHeight.get(Double.valueOf(0.0d))).doubleValue());
        this.topBar.setBorderColor(topBarOptions.borderColor.get(-16777216).intValue());
        this.topBar.setBackgroundColor(topBarOptions.background.color.get(-1).intValue());
        if (topBarOptions.background.component.hasValue()) {
            View findBackgroundComponent = findBackgroundComponent(topBarOptions.background.component);
            if (findBackgroundComponent != null) {
                this.topBar.setBackgroundComponent(findBackgroundComponent);
            } else {
                TopBarBackgroundViewController topBarBackgroundViewController = new TopBarBackgroundViewController(this.activity, this.topBarBackgroundViewCreator);
                topBarBackgroundViewController.setWaitForRender(topBarOptions.background.waitForRender);
                this.backgroundControllers.put(view, topBarBackgroundViewController);
                topBarBackgroundViewController.setComponent(topBarOptions.background.component);
                ((TopBarBackgroundView) topBarBackgroundViewController.getView()).setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.topBar.setBackgroundComponent(topBarBackgroundViewController.getView());
            }
        } else {
            this.topBar.clearBackgroundComponent();
        }
        applyTopBarVisibilityIfChildIsNotBeingAnimated(topBarOptions, stackController, viewController);
        if (topBarOptions.hideOnScroll.isTrue()) {
            if (view instanceof IReactView) {
                this.topBar.enableCollapse(((IReactView) view).getScrollEventListener());
            }
        } else if (topBarOptions.hideOnScroll.isFalseOrUndefined()) {
            this.topBar.disableCollapse();
        }
    }

    private void applyStatusBarDrawBehindOptions(TopBarOptions topBarOptions, Options options) {
        if (!options.statusBar.visible.isTrueOrUndefined() || !options.statusBar.drawBehind.isTrue()) {
            this.topBar.setTopPadding(0);
            this.topBar.setHeight(((Integer) topBarOptions.height.get(Integer.valueOf(UiUtils.getTopBarHeightDp(this.activity)))).intValue());
            return;
        }
        this.topBar.setTopPadding(SystemUiUtils.getStatusBarHeight(this.activity));
        this.topBar.setHeight(((Integer) topBarOptions.height.get(Integer.valueOf(UiUtils.getTopBarHeightDp(this.activity)))).intValue() + SystemUiUtils.getStatusBarHeightDp(this.activity));
    }

    private void mergeStatusBarDrawBehindOptions(TopBarOptions topBarOptions, Options options) {
        if (options.statusBar.visible.isTrueOrUndefined()) {
            if (!options.statusBar.drawBehind.hasValue()) {
                return;
            }
            if (options.statusBar.drawBehind.isTrue()) {
                this.topBar.setTopPadding(SystemUiUtils.getStatusBarHeight(this.activity));
                this.topBar.setHeight(((Integer) topBarOptions.height.get(Integer.valueOf(UiUtils.getTopBarHeightDp(this.activity)))).intValue() + SystemUiUtils.getStatusBarHeightDp(this.activity));
                return;
            }
            this.topBar.setTopPadding(0);
            this.topBar.setHeight(((Integer) topBarOptions.height.get(Integer.valueOf(UiUtils.getTopBarHeightDp(this.activity)))).intValue());
        } else if (!options.statusBar.drawBehind.hasValue()) {
        } else {
            if (options.statusBar.drawBehind.isFalseOrUndefined()) {
                this.topBar.setTopPadding(SystemUiUtils.getStatusBarHeight(this.activity));
                this.topBar.setHeight(((Integer) topBarOptions.height.get(Integer.valueOf(UiUtils.getTopBarHeightDp(this.activity)))).intValue() + SystemUiUtils.getStatusBarHeightDp(this.activity));
                return;
            }
            this.topBar.setTopPadding(0);
            this.topBar.setHeight(((Integer) topBarOptions.height.get(Integer.valueOf(UiUtils.getTopBarHeightDp(this.activity)))).intValue());
        }
    }

    private View findBackgroundComponent(ComponentOptions componentOptions) {
        for (TopBarBackgroundViewController next : this.backgroundControllers.values()) {
            if (ObjectUtils.equalsNotNull((String) next.getComponent().name.get(null), (String) componentOptions.name.get(null)) && ObjectUtils.equalsNotNull((String) next.getComponent().componentId.get(null), (String) componentOptions.componentId.get(null))) {
                return next.getView();
            }
        }
        return null;
    }

    private void applyTopBarVisibilityIfChildIsNotBeingAnimated(TopBarOptions topBarOptions, StackController stackController, ViewController<?> viewController) {
        if (!stackController.isChildInTransition(viewController) || topBarOptions.animate.isFalse()) {
            applyTopBarVisibility(topBarOptions);
        }
    }

    private void applyTopBarVisibility(TopBarOptions topBarOptions) {
        if (topBarOptions.visible.isFalse()) {
            this.topBarController.hide();
        }
        if (topBarOptions.visible.isTrueOrUndefined()) {
            this.topBarController.show();
        }
    }

    private void applyButtons(TopBarOptions topBarOptions, ViewController<?> viewController) {
        if (topBarOptions.buttons.right != null) {
            List<ButtonController> orCreateButtonControllersByInstanceId = getOrCreateButtonControllersByInstanceId(this.componentRightButtons.get(viewController.getView()), mergeButtonsWithColor(topBarOptions.buttons.right, topBarOptions.rightButtonColor, topBarOptions.rightButtonDisabledColor));
            this.componentRightButtons.put(viewController.getView(), CollectionUtils.keyBy(orCreateButtonControllersByInstanceId, new StackPresenter$$ExternalSyntheticLambda15()));
            if (!CollectionUtils.equals(this.currentRightButtons, orCreateButtonControllersByInstanceId)) {
                this.currentRightButtons = orCreateButtonControllersByInstanceId;
                this.topBarController.applyRightButtons(orCreateButtonControllersByInstanceId);
            }
        } else {
            this.currentRightButtons = null;
            this.topBar.clearRightButtons();
        }
        if (topBarOptions.buttons.left != null) {
            List<ButtonController> orCreateButtonControllersByInstanceId2 = getOrCreateButtonControllersByInstanceId(this.componentLeftButtons.get(viewController.getView()), mergeButtonsWithColor(topBarOptions.buttons.left, topBarOptions.leftButtonColor, topBarOptions.leftButtonDisabledColor));
            this.componentLeftButtons.put(viewController.getView(), CollectionUtils.keyBy(orCreateButtonControllersByInstanceId2, new StackPresenter$$ExternalSyntheticLambda15()));
            if (!CollectionUtils.equals(this.currentLeftButtons, orCreateButtonControllersByInstanceId2)) {
                this.currentLeftButtons = orCreateButtonControllersByInstanceId2;
                this.topBarController.applyLeftButtons(orCreateButtonControllersByInstanceId2);
            }
        } else {
            this.currentLeftButtons = null;
            this.topBar.clearLeftButtons();
        }
        if (topBarOptions.buttons.back.visible.isTrue() && !topBarOptions.buttons.hasLeftButtons()) {
            this.topBar.setBackButton(m1025lambda$getOrCreateButtonControllersByInstanceId$0$comreactnativenavigationviewcontrollersstackStackPresenter(topBarOptions.buttons.back));
        }
        if (topBarOptions.animateRightButtons.hasValue()) {
            this.topBar.animateRightButtons(topBarOptions.animateRightButtons.isTrue());
        }
        if (topBarOptions.animateLeftButtons.hasValue()) {
            this.topBar.animateLeftButtons(topBarOptions.animateLeftButtons.isTrue());
        }
        this.topBar.setOverflowButtonColor(topBarOptions.rightButtonColor.get(-16777216).intValue());
    }

    private List<ButtonController> getOrCreateButtonControllersByInstanceId(Map<String, ButtonController> map, List<ButtonOptions> list) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        CollectionUtils.forEach(list, new StackPresenter$$ExternalSyntheticLambda0(this, linkedHashMap, map));
        return new ArrayList(linkedHashMap.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getOrCreateButtonControllersByInstanceId$1$com-reactnativenavigation-viewcontrollers-stack-StackPresenter  reason: not valid java name */
    public /* synthetic */ void m1026lambda$getOrCreateButtonControllersByInstanceId$1$comreactnativenavigationviewcontrollersstackStackPresenter(Map map, Map map2, ButtonOptions buttonOptions) {
        map.put(buttonOptions.instanceId, (ButtonController) CollectionUtils.getOrDefault(map2, buttonOptions.instanceId, new StackPresenter$$ExternalSyntheticLambda7(this, buttonOptions)));
    }

    private List<ButtonController> getOrCreateButtonControllers(Map<String, ButtonController> map, List<ButtonOptions> list) {
        ArrayList arrayList = new ArrayList();
        for (ButtonOptions next : list) {
            arrayList.add((ButtonController) ObjectUtils.take((ButtonController) CollectionUtils.first((Collection) ObjectUtils.perform(map, null, new StackPresenter$$ExternalSyntheticLambda16()), new StackPresenter$$ExternalSyntheticLambda3(next)), m1025lambda$getOrCreateButtonControllersByInstanceId$0$comreactnativenavigationviewcontrollersstackStackPresenter(next)));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: createButtonController */
    public ButtonController m1025lambda$getOrCreateButtonControllersByInstanceId$0$comreactnativenavigationviewcontrollersstackStackPresenter(ButtonOptions buttonOptions) {
        ButtonController buttonController = new ButtonController(this.activity, new ButtonPresenter(this.activity, buttonOptions, this.iconResolver), buttonOptions, this.buttonCreator, this.onClickListener);
        buttonController.setWaitForRender(buttonOptions.component.waitForRender);
        return buttonController;
    }

    private void applyTopTabsOptions(TopTabsOptions topTabsOptions) {
        this.topBar.applyTopTabsColors(topTabsOptions.selectedTabColor, topTabsOptions.unselectedTabColor);
        this.topBar.applyTopTabsFontSize(topTabsOptions.fontSize);
        this.topBar.setTopTabsVisible(topTabsOptions.visible.isTrueOrUndefined());
        this.topBar.setTopTabsHeight(((Integer) topTabsOptions.height.get(-2)).intValue());
    }

    private void applyTopTabOptions(TopTabOptions topTabOptions) {
        if (topTabOptions.fontFamily != null) {
            this.topBar.setTopTabFontFamily(topTabOptions.tabIndex, topTabOptions.fontFamily);
        }
    }

    public List<Animator> getAdditionalPushAnimations(StackController stackController, ViewController<?> viewController, Options options) {
        return CollectionUtils.asList(this.topBarController.getPushAnimation(options, (float) getTopBarTranslationAnimationDelta(stackController, viewController)), (Animator) ObjectUtils.perform(this.bottomTabsController, null, new StackPresenter$$ExternalSyntheticLambda5(options)));
    }

    public List<Animator> getAdditionalPopAnimations(Options options, Options options2) {
        return CollectionUtils.asList(this.topBarController.getPopAnimation(options, options2), (Animator) ObjectUtils.perform(this.bottomTabsController, null, new StackPresenter$$ExternalSyntheticLambda4(options, options2)));
    }

    public List<Animator> getAdditionalSetRootAnimations(StackController stackController, ViewController<?> viewController, Options options) {
        return CollectionUtils.asList(this.topBarController.getSetStackRootAnimation(options, (float) getTopBarTranslationAnimationDelta(stackController, viewController)), (Animator) ObjectUtils.perform(this.bottomTabsController, null, new StackPresenter$$ExternalSyntheticLambda2(options)));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mergeChildOptions(com.reactnativenavigation.options.Options r3, com.reactnativenavigation.options.Options r4, com.reactnativenavigation.viewcontrollers.stack.StackController r5, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r6) {
        /*
            r2 = this;
            com.reactnativenavigation.options.Options r0 = r3.copy()
            com.reactnativenavigation.options.TopBarOptions r0 = r0.topBar
            com.reactnativenavigation.options.TopBarOptions r4 = r4.topBar
            com.reactnativenavigation.options.TopBarOptions r4 = r0.mergeWithDefault(r4)
            com.reactnativenavigation.options.Options r0 = r2.defaultOptions
            com.reactnativenavigation.options.TopBarOptions r0 = r0.topBar
            com.reactnativenavigation.options.TopBarOptions r4 = r4.mergeWithDefault(r0)
            com.reactnativenavigation.options.layout.LayoutOptions r0 = r3.layout
            com.reactnativenavigation.options.OrientationOptions r0 = r0.orientation
            r2.mergeOrientation(r0)
            com.reactnativenavigation.options.TopBarOptions r0 = r3.topBar
            android.view.ViewGroup r1 = r6.getView()
            r2.mergeButtons(r4, r0, r1, r5)
            r2.mergeTopBarOptions(r4, r3, r5, r6)
            com.reactnativenavigation.options.TopTabsOptions r4 = r3.topTabs
            r2.mergeTopTabsOptions(r4)
            com.reactnativenavigation.options.TopTabOptions r3 = r3.topTabOptions
            r2.mergeTopTabOptions(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.stack.StackPresenter.mergeChildOptions(com.reactnativenavigation.options.Options, com.reactnativenavigation.options.Options, com.reactnativenavigation.viewcontrollers.stack.StackController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController):void");
    }

    private void mergeOrientation(OrientationOptions orientationOptions) {
        if (orientationOptions.hasValue()) {
            applyOrientation(orientationOptions);
        }
    }

    private void mergeButtons(TopBarOptions topBarOptions, TopBarOptions topBarOptions2, View view, StackController stackController) {
        mergeRightButtons(topBarOptions, topBarOptions2.buttons, view);
        mergeLeftButton(topBarOptions, topBarOptions2.buttons, view);
        mergeLeftButtonsColor(view, topBarOptions2.leftButtonColor, topBarOptions2.leftButtonDisabledColor, topBarOptions2.leftButtonBackgroundColor);
        mergeRightButtonsColor(view, topBarOptions2.rightButtonColor, topBarOptions2.rightButtonDisabledColor, topBarOptions2.rightButtonBackgroundColor);
        mergeBackButton(topBarOptions2.buttons, stackController);
    }

    private void mergeLeftButtonsColor(View view, ThemeColour themeColour, ThemeColour themeColour2, ThemeColour themeColour3) {
        Map map;
        if ((themeColour.hasValue() || themeColour2.hasValue()) && (map = this.componentLeftButtons.get(view)) != null) {
            CollectionUtils.forEach(map.values(), new StackPresenter$$ExternalSyntheticLambda9(this, themeColour, themeColour2, themeColour3));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$mergeLeftButtonsColor$6$com-reactnativenavigation-viewcontrollers-stack-StackPresenter  reason: not valid java name */
    public /* synthetic */ void m1027lambda$mergeLeftButtonsColor$6$comreactnativenavigationviewcontrollersstackStackPresenter(ThemeColour themeColour, ThemeColour themeColour2, ThemeColour themeColour3, ButtonController buttonController) {
        if (themeColour.hasValue()) {
            buttonController.applyColor(this.topBarController.getView().getLeftButtonBar(), themeColour);
        }
        if (themeColour2.hasValue()) {
            buttonController.applyDisabledColor(this.topBarController.getView().getLeftButtonBar(), themeColour2);
        }
        if (themeColour3.hasValue()) {
            buttonController.applyBackgroundColor(this.topBarController.getView().getLeftButtonBar(), themeColour3);
        }
    }

    private void mergeRightButtonsColor(View view, ThemeColour themeColour, ThemeColour themeColour2, ThemeColour themeColour3) {
        Map map;
        if ((themeColour.hasValue() || themeColour2.hasValue()) && (map = this.componentRightButtons.get(view)) != null) {
            CollectionUtils.forEach(map.values(), new StackPresenter$$ExternalSyntheticLambda8(this, themeColour, themeColour2, themeColour3));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$mergeRightButtonsColor$7$com-reactnativenavigation-viewcontrollers-stack-StackPresenter  reason: not valid java name */
    public /* synthetic */ void m1028lambda$mergeRightButtonsColor$7$comreactnativenavigationviewcontrollersstackStackPresenter(ThemeColour themeColour, ThemeColour themeColour2, ThemeColour themeColour3, ButtonController buttonController) {
        if (themeColour.hasValue()) {
            buttonController.applyColor(this.topBarController.getView().getRightButtonBar(), themeColour);
        }
        if (themeColour2.hasValue()) {
            buttonController.applyDisabledColor(this.topBarController.getView().getRightButtonBar(), themeColour2);
        }
        if (themeColour3.hasValue()) {
            buttonController.applyBackgroundColor(this.topBarController.getView().getRightButtonBar(), themeColour3);
        }
    }

    private void mergeRightButtons(TopBarOptions topBarOptions, TopBarButtons topBarButtons, View view) {
        if (topBarButtons.right != null) {
            List<ButtonController> orCreateButtonControllers = getOrCreateButtonControllers(this.componentRightButtons.get(view), mergeButtonsWithColor(topBarButtons.right, topBarOptions.rightButtonColor, topBarOptions.rightButtonDisabledColor));
            List<T> difference = CollectionUtils.difference(this.currentRightButtons, orCreateButtonControllers, new StackPresenter$$ExternalSyntheticLambda14());
            CollectionUtils.forEach(difference, new StackPresenter$$ExternalSyntheticLambda13());
            if (!CollectionUtils.equals(this.currentRightButtons, orCreateButtonControllers)) {
                this.componentRightButtons.put(view, CollectionUtils.keyBy(orCreateButtonControllers, new StackPresenter$$ExternalSyntheticLambda15()));
                this.topBarController.mergeRightButtons(orCreateButtonControllers, difference);
                this.currentRightButtons = orCreateButtonControllers;
            }
            if (topBarOptions.rightButtonColor.hasValue()) {
                this.topBar.setOverflowButtonColor(topBarOptions.rightButtonColor.get());
            }
        }
    }

    private void mergeLeftButton(TopBarOptions topBarOptions, TopBarButtons topBarButtons, View view) {
        if (topBarButtons.left != null) {
            List<ButtonController> orCreateButtonControllers = getOrCreateButtonControllers(this.componentLeftButtons.get(view), mergeButtonsWithColor(topBarButtons.left, topBarOptions.leftButtonColor, topBarOptions.leftButtonDisabledColor));
            List<T> difference = CollectionUtils.difference(this.currentLeftButtons, orCreateButtonControllers, new StackPresenter$$ExternalSyntheticLambda14());
            CollectionUtils.forEach(difference, new StackPresenter$$ExternalSyntheticLambda13());
            if (!CollectionUtils.equals(this.currentLeftButtons, orCreateButtonControllers)) {
                this.componentLeftButtons.put(view, CollectionUtils.keyBy(orCreateButtonControllers, new StackPresenter$$ExternalSyntheticLambda15()));
                this.topBarController.mergeLeftButtons(orCreateButtonControllers, difference);
                this.currentLeftButtons = orCreateButtonControllers;
            }
        }
    }

    private void mergeBackButton(TopBarButtons topBarButtons, StackController stackController) {
        if (topBarButtons.back.hasValue() && CollectionUtils.isNullOrEmpty(topBarButtons.left)) {
            if (topBarButtons.back.visible.isFalse()) {
                this.topBar.clearBackButton();
            } else if (stackController.size() > 1) {
                this.topBar.setBackButton(m1025lambda$getOrCreateButtonControllersByInstanceId$0$comreactnativenavigationviewcontrollersstackStackPresenter(topBarButtons.back));
            }
        }
    }

    private List<ButtonOptions> mergeButtonsWithColor(List<ButtonOptions> list, ThemeColour themeColour, ThemeColour themeColour2) {
        ArrayList arrayList = new ArrayList();
        for (ButtonOptions next : list) {
            ButtonOptions copy = next.copy();
            if (!next.color.hasValue()) {
                copy.color = themeColour;
            }
            if (!next.disabledColor.hasValue()) {
                copy.disabledColor = themeColour2;
            }
            arrayList.add(copy);
        }
        return arrayList;
    }

    private void mergeTopBarOptions(TopBarOptions topBarOptions, Options options, StackController stackController, ViewController<?> viewController) {
        TopBarOptions topBarOptions2 = options.topBar;
        Object view = viewController.getView();
        if (options.layout.direction.hasValue()) {
            this.topBar.setLayoutDirection(options.layout.direction);
        }
        if (topBarOptions2.height.hasValue()) {
            this.topBar.setHeight(((Integer) topBarOptions2.height.get()).intValue());
        }
        if (topBarOptions2.elevation.hasValue()) {
            this.topBar.setElevation((Double) topBarOptions2.elevation.get());
        }
        if (topBarOptions2.topMargin.hasValue() && (this.topBar.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) this.topBar.getLayoutParams()).topMargin = UiUtils.dpToPx((Context) this.activity, ((Integer) topBarOptions2.topMargin.get()).intValue());
        }
        mergeStatusBarDrawBehindOptions(topBarOptions, stackController.resolveChildOptions(viewController).mergeWith(options).withDefaultOptions(this.defaultOptions));
        if (topBarOptions2.title.height.hasValue()) {
            this.topBar.setTitleHeight(((Integer) topBarOptions2.title.height.get()).intValue());
        }
        if (topBarOptions2.title.topMargin.hasValue()) {
            this.topBar.setTitleTopMargin(((Integer) topBarOptions2.title.topMargin.get()).intValue());
        }
        if (topBarOptions2.animateLeftButtons.hasValue()) {
            this.topBar.animateLeftButtons(topBarOptions2.animateLeftButtons.isTrue());
        }
        if (topBarOptions2.animateRightButtons.hasValue()) {
            this.topBar.animateRightButtons(topBarOptions2.animateRightButtons.isTrue());
        }
        if (topBarOptions2.title.component.hasValue()) {
            TitleBarReactViewController findTitleComponent = findTitleComponent(topBarOptions2.title.component);
            if (findTitleComponent == null) {
                findTitleComponent = new TitleBarReactViewController(this.activity, this.titleViewCreator, topBarOptions2.title.component);
                ObjectUtils.perform(this.titleControllers.put(view, findTitleComponent), new StackPresenter$$ExternalSyntheticLambda10());
            }
            this.topBarController.setTitleComponent(findTitleComponent);
            this.topBarController.alignTitleComponent(topBarOptions2.title.component.alignment);
        } else if (topBarOptions2.title.text.hasValue()) {
            ObjectUtils.perform(this.titleControllers.remove(view), new StackPresenter$$ExternalSyntheticLambda10());
            this.topBar.setTitle((String) topBarOptions2.title.text.get());
            this.topBarController.alignTitleComponent(topBarOptions2.title.alignment);
        }
        if (topBarOptions.title.alignment != Alignment.Default) {
            this.topBarController.alignTitleComponent(topBarOptions.title.alignment);
        }
        if (topBarOptions.title.color.hasValue()) {
            this.topBar.setTitleTextColor(topBarOptions.title.color.get());
        }
        if (topBarOptions.title.fontSize.hasValue()) {
            this.topBar.setTitleFontSize(((Double) topBarOptions.title.fontSize.get()).doubleValue());
        }
        if (topBarOptions.title.font.hasValue()) {
            this.topBar.setTitleTypeface(this.typefaceLoader, topBarOptions.title.font);
        }
        if (topBarOptions.subtitle.text.hasValue()) {
            this.topBar.setSubtitle((String) topBarOptions.subtitle.text.get());
            this.topBar.setSubtitleAlignment(topBarOptions.subtitle.alignment);
        }
        if (topBarOptions.subtitle.color.hasValue()) {
            this.topBar.setSubtitleColor(topBarOptions.subtitle.color.get());
        }
        if (topBarOptions.subtitle.fontSize.hasValue()) {
            this.topBar.setSubtitleFontSize(((Double) topBarOptions.subtitle.fontSize.get()).doubleValue());
        }
        if (topBarOptions.subtitle.font.hasValue()) {
            this.topBar.setSubtitleTypeface(this.typefaceLoader, topBarOptions.subtitle.font);
        }
        if (topBarOptions2.background.color.hasValue()) {
            this.topBar.setBackgroundColor(topBarOptions2.background.color.get());
        }
        if (topBarOptions2.background.component.hasValue()) {
            if (this.backgroundControllers.containsKey(view)) {
                this.topBar.setBackgroundComponent(((TopBarBackgroundViewController) Objects.requireNonNull(this.backgroundControllers.get(view))).getView());
            } else {
                TopBarBackgroundViewController topBarBackgroundViewController = new TopBarBackgroundViewController(this.activity, this.topBarBackgroundViewCreator);
                this.backgroundControllers.put(view, topBarBackgroundViewController);
                topBarBackgroundViewController.setComponent(topBarOptions2.background.component);
                ((TopBarBackgroundView) topBarBackgroundViewController.getView()).setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.topBar.setBackgroundComponent(topBarBackgroundViewController.getView());
            }
        }
        if (topBarOptions2.testId.hasValue()) {
            this.topBar.setTestId((String) topBarOptions2.testId.get());
        }
        if (topBarOptions2.visible.isFalse()) {
            if (topBarOptions2.animate.isTrueOrUndefined()) {
                this.topBarController.hideAnimate(new AnimationOptions(), (float) getTopBarTranslationAnimationDelta(stackController, viewController));
            } else {
                this.topBarController.hide();
            }
        }
        if (topBarOptions2.visible.isTrue()) {
            if (topBarOptions2.animate.isTrueOrUndefined()) {
                this.topBarController.showAnimate(new AnimationOptions(), (float) getTopBarTranslationAnimationDelta(stackController, viewController));
            } else {
                this.topBarController.show();
            }
        }
        if (topBarOptions2.hideOnScroll.isTrue() && (view instanceof IReactView)) {
            this.topBar.enableCollapse(((IReactView) view).getScrollEventListener());
        }
        if (topBarOptions2.hideOnScroll.isFalse()) {
            this.topBar.disableCollapse();
        }
    }

    private TitleBarReactViewController findTitleComponent(ComponentOptions componentOptions) {
        for (TitleBarReactViewController next : this.titleControllers.values()) {
            if (ObjectUtils.equalsNotNull((String) next.getComponent().name.get(null), (String) componentOptions.name.get(null)) && ObjectUtils.equalsNotNull((String) next.getComponent().componentId.get(null), (String) componentOptions.componentId.get(null))) {
                return next;
            }
        }
        return null;
    }

    private void mergeTopTabsOptions(TopTabsOptions topTabsOptions) {
        if (topTabsOptions.selectedTabColor.hasValue() && topTabsOptions.unselectedTabColor.hasValue()) {
            this.topBar.applyTopTabsColors(topTabsOptions.selectedTabColor, topTabsOptions.unselectedTabColor);
        }
        if (topTabsOptions.fontSize.hasValue()) {
            this.topBar.applyTopTabsFontSize(topTabsOptions.fontSize);
        }
        if (topTabsOptions.visible.hasValue()) {
            this.topBar.setTopTabsVisible(topTabsOptions.visible.isTrue());
        }
        if (topTabsOptions.height.hasValue()) {
            this.topBar.setTopTabsHeight(((Integer) topTabsOptions.height.get(-2)).intValue());
        }
    }

    private void mergeTopTabOptions(TopTabOptions topTabOptions) {
        if (topTabOptions.fontFamily != null) {
            this.topBar.setTopTabFontFamily(topTabOptions.tabIndex, topTabOptions.fontFamily);
        }
    }

    public boolean shouldPopOnHardwareButtonPress(ViewController<?> viewController) {
        return ((Boolean) viewController.resolveCurrentOptions().hardwareBack.popStackOnPress.get(true)).booleanValue();
    }

    public Map<View, TitleBarReactViewController> getTitleComponents() {
        return this.titleControllers;
    }

    public Map<View, TopBarBackgroundViewController> getBackgroundComponents() {
        return this.backgroundControllers;
    }

    public List<ButtonController> getComponentButtons(View view) {
        return CollectionUtils.merge(getRightButtons(view), getLeftButtons(view), Collections.EMPTY_LIST);
    }

    public List<ButtonController> getComponentButtons(View view, List<ButtonController> list) {
        return CollectionUtils.merge(getRightButtons(view), getLeftButtons(view), list);
    }

    public void setComponentsButtonController(View view, ButtonController buttonController, ButtonController buttonController2) {
        CollectionUtils.forEach(this.componentLeftButtons.get(view).keySet(), new StackPresenter$$ExternalSyntheticLambda11(this, view, buttonController2));
        CollectionUtils.forEach(this.componentRightButtons.get(view).keySet(), new StackPresenter$$ExternalSyntheticLambda12(this, view, buttonController));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setComponentsButtonController$8$com-reactnativenavigation-viewcontrollers-stack-StackPresenter  reason: not valid java name */
    public /* synthetic */ void m1029lambda$setComponentsButtonController$8$comreactnativenavigationviewcontrollersstackStackPresenter(View view, ButtonController buttonController, String str) {
        this.componentLeftButtons.get(view).put(str, buttonController);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setComponentsButtonController$9$com-reactnativenavigation-viewcontrollers-stack-StackPresenter  reason: not valid java name */
    public /* synthetic */ void m1030lambda$setComponentsButtonController$9$comreactnativenavigationviewcontrollersstackStackPresenter(View view, ButtonController buttonController, String str) {
        this.componentRightButtons.get(view).put(str, buttonController);
    }

    public void applyTopInsets(StackController stackController, ViewController<?> viewController) {
        if (stackController.isCurrentChild(viewController)) {
            applyStatusBarInsets(stackController, viewController);
        }
        viewController.applyTopInset();
    }

    private List<ButtonController> getRightButtons(View view) {
        if (this.componentRightButtons.containsKey(view)) {
            return new ArrayList(this.componentRightButtons.get(view).values());
        }
        return null;
    }

    private List<ButtonController> getLeftButtons(View view) {
        if (this.componentLeftButtons.containsKey(view)) {
            return new ArrayList(this.componentLeftButtons.get(view).values());
        }
        return null;
    }

    private void applyStatusBarInsets(StackController stackController, ViewController<?> viewController) {
        ((ViewGroup.MarginLayoutParams) this.topBar.getLayoutParams()).topMargin = getTopBarTopMargin(stackController, viewController);
        this.topBar.requestLayout();
    }

    private int getTopBarTranslationAnimationDelta(StackController stackController, ViewController<?> viewController) {
        if (stackController.resolveChildOptions(viewController).withDefaultOptions(this.defaultOptions).statusBar.hasTransparency()) {
            return getTopBarTopMargin(stackController, viewController);
        }
        return 0;
    }

    private int getTopBarTopMargin(StackController stackController, ViewController<?> viewController) {
        Options withDefaultOptions = stackController.resolveChildOptions(viewController).withDefaultOptions(this.defaultOptions);
        int i = 0;
        int dpToPx = UiUtils.dpToPx((Context) this.activity, ((Integer) withDefaultOptions.topBar.topMargin.get(0)).intValue());
        if (withDefaultOptions.statusBar.visible.isTrueOrUndefined() && !withDefaultOptions.statusBar.drawBehind.isTrue()) {
            i = SystemUiUtils.getStatusBarHeight(viewController.getActivity());
        }
        return dpToPx + i;
    }

    public int getTopInset(Options options) {
        if (options.withDefaultOptions(this.defaultOptions).topBar.isHiddenOrDrawBehind()) {
            return 0;
        }
        return this.topBarController.getHeight();
    }
}
