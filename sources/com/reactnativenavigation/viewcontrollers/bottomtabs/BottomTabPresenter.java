package com.reactnativenavigation.viewcontrollers.bottomtabs;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;
import com.reactnativenavigation.options.BottomTabOptions;
import com.reactnativenavigation.options.DotIndicatorOptions;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.options.parsers.TypefaceLoader;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.utils.ImageLoader;
import com.reactnativenavigation.utils.ImageLoadingListenerAdapter;
import com.reactnativenavigation.utils.LateInit;
import com.reactnativenavigation.utils.UiUtils;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.bottomtabs.BottomTabs;
import java.util.List;

public class BottomTabPresenter {
    private final BottomTabFinder bottomTabFinder;
    private final LateInit<BottomTabs> bottomTabs = new LateInit<>();
    private final Context context;
    private final int defaultDotIndicatorSize;
    private Options defaultOptions;
    private final Typeface defaultTypeface;
    private final ImageLoader imageLoader;
    private final List<ViewController<?>> tabs;
    private final TypefaceLoader typefaceLoader;

    public BottomTabPresenter(Context context2, List<ViewController<?>> list, ImageLoader imageLoader2, TypefaceLoader typefaceLoader2, Options options) {
        this.tabs = list;
        this.context = context2;
        this.bottomTabFinder = new BottomTabFinder(list);
        this.imageLoader = imageLoader2;
        this.typefaceLoader = typefaceLoader2;
        this.defaultTypeface = typefaceLoader2.getDefaultTypeFace();
        this.defaultOptions = options;
        this.defaultDotIndicatorSize = UiUtils.dpToPx(context2, 6);
    }

    public void setDefaultOptions(Options options) {
        this.defaultOptions = options;
    }

    public void bindView(BottomTabs bottomTabs2) {
        this.bottomTabs.set(bottomTabs2);
    }

    public void applyOptions() {
        this.bottomTabs.perform(new BottomTabPresenter$$ExternalSyntheticLambda4(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$applyOptions$0$com-reactnativenavigation-viewcontrollers-bottomtabs-BottomTabPresenter  reason: not valid java name */
    public /* synthetic */ void m988lambda$applyOptions$0$comreactnativenavigationviewcontrollersbottomtabsBottomTabPresenter(BottomTabs bottomTabs2) {
        for (int i = 0; i < this.tabs.size(); i++) {
            BottomTabOptions bottomTabOptions = this.tabs.get(i).resolveCurrentOptions(this.defaultOptions).bottomTabOptions;
            bottomTabs2.setIconWidth(i, (Integer) bottomTabOptions.iconWidth.get(null));
            bottomTabs2.setIconHeight(i, (Integer) bottomTabOptions.iconHeight.get(null));
            bottomTabs2.setTitleTypeface(i, bottomTabOptions.font.getTypeface(this.typefaceLoader, this.defaultTypeface));
            if (bottomTabOptions.selectedIconColor.canApplyValue()) {
                bottomTabs2.setIconActiveColor(i, bottomTabOptions.selectedIconColor.get((Integer) null));
            }
            if (bottomTabOptions.iconColor.canApplyValue()) {
                bottomTabs2.setIconInactiveColor(i, bottomTabOptions.iconColor.get((Integer) null));
            }
            bottomTabs2.setTitleActiveColor(i, bottomTabOptions.selectedTextColor.get((Integer) null));
            bottomTabs2.setTitleInactiveColor(i, bottomTabOptions.textColor.get((Integer) null));
            if (bottomTabOptions.fontSize.hasValue()) {
                bottomTabs2.setTitleInactiveTextSizeInSp(i, Float.valueOf((float) ((Integer) bottomTabOptions.fontSize.get()).intValue()));
            }
            if (bottomTabOptions.selectedFontSize.hasValue()) {
                bottomTabs2.setTitleActiveTextSizeInSp(i, Float.valueOf((float) ((Integer) bottomTabOptions.selectedFontSize.get()).intValue()));
            }
            if (bottomTabOptions.testId.hasValue()) {
                bottomTabs2.setTag(i, (String) bottomTabOptions.testId.get());
            }
            if (shouldApplyDot(bottomTabOptions)) {
                applyDotIndicator(i, bottomTabOptions.dotIndicator);
            }
            if (bottomTabOptions.badge.hasValue()) {
                applyBadge(i, bottomTabOptions);
            }
        }
    }

    public void mergeOptions(Options options) {
        this.bottomTabs.perform(new BottomTabPresenter$$ExternalSyntheticLambda1(this, options));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$mergeOptions$2$com-reactnativenavigation-viewcontrollers-bottomtabs-BottomTabPresenter  reason: not valid java name */
    public /* synthetic */ void m991lambda$mergeOptions$2$comreactnativenavigationviewcontrollersbottomtabsBottomTabPresenter(Options options, BottomTabs bottomTabs2) {
        bottomTabs2.disableItemsCreation();
        CollectionUtils.forEach(this.tabs, new BottomTabPresenter$$ExternalSyntheticLambda7(this, options));
        bottomTabs2.enableItemsCreation();
    }

    /* renamed from: mergeChildOptions */
    public void m990lambda$mergeOptions$1$comreactnativenavigationviewcontrollersbottomtabsBottomTabPresenter(Options options, ViewController<?> viewController) {
        this.bottomTabs.perform(new BottomTabPresenter$$ExternalSyntheticLambda8(this, viewController, options));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$mergeChildOptions$3$com-reactnativenavigation-viewcontrollers-bottomtabs-BottomTabPresenter  reason: not valid java name */
    public /* synthetic */ void m989lambda$mergeChildOptions$3$comreactnativenavigationviewcontrollersbottomtabsBottomTabPresenter(ViewController viewController, Options options, final BottomTabs bottomTabs2) {
        final int findByControllerId = this.bottomTabFinder.findByControllerId(viewController.getId());
        if (findByControllerId >= 0) {
            BottomTabOptions bottomTabOptions = options.bottomTabOptions;
            if (bottomTabOptions.iconWidth.hasValue()) {
                bottomTabs2.setIconWidth(findByControllerId, (Integer) bottomTabOptions.iconWidth.get(null));
            }
            if (bottomTabOptions.iconHeight.hasValue()) {
                bottomTabs2.setIconHeight(findByControllerId, (Integer) bottomTabOptions.iconHeight.get(null));
            }
            if (bottomTabOptions.font.hasValue()) {
                bottomTabs2.setTitleTypeface(findByControllerId, bottomTabOptions.font.getTypeface(this.typefaceLoader, this.defaultTypeface));
            }
            if (canMergeColor(bottomTabOptions.selectedIconColor)) {
                bottomTabs2.setIconActiveColor(findByControllerId, Integer.valueOf(bottomTabOptions.selectedIconColor.get()));
            }
            if (canMergeColor(bottomTabOptions.iconColor)) {
                bottomTabs2.setIconInactiveColor(findByControllerId, Integer.valueOf(bottomTabOptions.iconColor.get()));
            }
            if (bottomTabOptions.selectedTextColor.hasValue()) {
                bottomTabs2.setTitleActiveColor(findByControllerId, Integer.valueOf(bottomTabOptions.selectedTextColor.get()));
            }
            if (bottomTabOptions.textColor.hasValue()) {
                bottomTabs2.setTitleInactiveColor(findByControllerId, Integer.valueOf(bottomTabOptions.textColor.get()));
            }
            if (bottomTabOptions.text.hasValue()) {
                bottomTabs2.setText(findByControllerId, (String) bottomTabOptions.text.get());
            }
            if (bottomTabOptions.icon.hasValue()) {
                this.imageLoader.loadIcon(this.context, (String) bottomTabOptions.icon.get(), new ImageLoadingListenerAdapter() {
                    public void onComplete(Drawable drawable) {
                        bottomTabs2.setIcon(findByControllerId, drawable);
                    }
                });
            }
            if (bottomTabOptions.selectedIcon.hasValue()) {
                this.imageLoader.loadIcon(this.context, (String) bottomTabOptions.selectedIcon.get(), new ImageLoadingListenerAdapter() {
                    public void onComplete(Drawable drawable) {
                        bottomTabs2.setSelectedIcon(findByControllerId, drawable);
                    }
                });
            }
            if (bottomTabOptions.testId.hasValue()) {
                bottomTabs2.setTag(findByControllerId, (String) bottomTabOptions.testId.get());
            }
            if (shouldApplyDot(bottomTabOptions)) {
                mergeDotIndicator(findByControllerId, bottomTabOptions.dotIndicator);
            } else {
                mergeBadge(findByControllerId, bottomTabOptions);
            }
        }
    }

    private void applyDotIndicator(int i, DotIndicatorOptions dotIndicatorOptions) {
        if (!dotIndicatorOptions.visible.isFalse()) {
            this.bottomTabs.perform(new BottomTabPresenter$$ExternalSyntheticLambda0(new AHNotification.Builder().setText("").setBackgroundColor(dotIndicatorOptions.color.get((Integer) null)).setSize(((Integer) dotIndicatorOptions.size.get(Integer.valueOf(this.defaultDotIndicatorSize))).intValue()).animate(((Boolean) dotIndicatorOptions.animate.get(false)).booleanValue()), i));
        }
    }

    private void applyBadge(int i, BottomTabOptions bottomTabOptions) {
        if (this.bottomTabs != null) {
            this.bottomTabs.perform(new BottomTabPresenter$$ExternalSyntheticLambda5(new AHNotification.Builder().setText((String) bottomTabOptions.badge.get("")).setBackgroundColor(bottomTabOptions.badgeColor.get((Integer) null)).animate(((Boolean) bottomTabOptions.animateBadge.get(false)).booleanValue()), i));
        }
    }

    private void mergeBadge(int i, BottomTabOptions bottomTabOptions) {
        if (this.bottomTabs != null && bottomTabOptions.badge.hasValue()) {
            AHNotification.Builder builder = new AHNotification.Builder();
            if (bottomTabOptions.badge.hasValue()) {
                builder.setText((String) bottomTabOptions.badge.get());
            }
            if (bottomTabOptions.badgeColor.hasValue()) {
                builder.setBackgroundColor(Integer.valueOf(bottomTabOptions.badgeColor.get()));
            }
            if (bottomTabOptions.animateBadge.hasValue()) {
                builder.animate(((Boolean) bottomTabOptions.animateBadge.get()).booleanValue());
            }
            this.bottomTabs.perform(new BottomTabPresenter$$ExternalSyntheticLambda2(builder, i));
        }
    }

    private void mergeDotIndicator(int i, DotIndicatorOptions dotIndicatorOptions) {
        if (this.bottomTabs != null) {
            AHNotification.Builder builder = new AHNotification.Builder();
            if (dotIndicatorOptions.color.hasValue()) {
                builder.setBackgroundColor(Integer.valueOf(dotIndicatorOptions.color.get()));
            }
            builder.setSize(dotIndicatorOptions.visible.isFalse() ? 0 : ((Integer) dotIndicatorOptions.size.get(Integer.valueOf(this.defaultDotIndicatorSize))).intValue());
            if (dotIndicatorOptions.animate.hasValue()) {
                builder.animate(((Boolean) dotIndicatorOptions.animate.get()).booleanValue());
            }
            AHNotification build = builder.build();
            if (build.hasValue()) {
                this.bottomTabs.perform(new BottomTabPresenter$$ExternalSyntheticLambda6(build, i));
            }
        }
    }

    private boolean shouldApplyDot(BottomTabOptions bottomTabOptions) {
        return bottomTabOptions.dotIndicator.visible.hasValue() && !bottomTabOptions.badge.hasValue();
    }

    private boolean canMergeColor(ThemeColour themeColour) {
        return themeColour.hasValue() && themeColour.canApplyValue();
    }

    public void onConfigurationChanged(Options options) {
        this.bottomTabs.perform(new BottomTabPresenter$$ExternalSyntheticLambda3(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onConfigurationChanged$8$com-reactnativenavigation-viewcontrollers-bottomtabs-BottomTabPresenter  reason: not valid java name */
    public /* synthetic */ void m992lambda$onConfigurationChanged$8$comreactnativenavigationviewcontrollersbottomtabsBottomTabPresenter(BottomTabs bottomTabs2) {
        for (int i = 0; i < this.tabs.size(); i++) {
            BottomTabOptions bottomTabOptions = this.tabs.get(i).resolveCurrentOptions(this.defaultOptions).bottomTabOptions;
            if (bottomTabOptions.selectedIconColor.canApplyValue()) {
                bottomTabs2.setIconActiveColor(i, bottomTabOptions.selectedIconColor.get((Integer) null));
            }
            if (bottomTabOptions.iconColor.canApplyValue()) {
                bottomTabs2.setIconInactiveColor(i, bottomTabOptions.iconColor.get((Integer) null));
            }
            bottomTabs2.setTitleActiveColor(i, bottomTabOptions.selectedTextColor.get((Integer) null));
            bottomTabs2.setTitleInactiveColor(i, bottomTabOptions.textColor.get((Integer) null));
            if (shouldApplyDot(bottomTabOptions)) {
                applyDotIndicator(i, bottomTabOptions.dotIndicator);
            }
            if (bottomTabOptions.badge.hasValue()) {
                applyBadge(i, bottomTabOptions);
            }
        }
    }
}
