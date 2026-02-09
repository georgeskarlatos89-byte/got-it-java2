package com.reactnativenavigation.viewcontrollers.stack.topbar.button;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.ButtonOptions;
import com.reactnativenavigation.options.params.DensityPixel;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.options.parsers.TypefaceLoader;
import com.reactnativenavigation.utils.ArrayUtils;
import com.reactnativenavigation.utils.ViewUtils;
import com.reactnativenavigation.views.stack.topbar.titlebar.IconBackgroundDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 :2\u00020\u0001:\u0001:B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cH\u0002J\u001e\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0018J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\"\u0010$\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0&J$\u0010'\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cJ,\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0&H\u0002J\u0010\u0010+\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000f\u0010.\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0002\u00100J\u0018\u00101\u001a\u0002022\u0006\u0010\u0012\u001a\u0002032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u00104\u001a\u0002022\u0006\u0010\u0012\u001a\u000203H\u0002J\u0010\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\"H\u0002J\u0010\u00107\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\"2\u0006\u00108\u001a\u00020/H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006;"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/ButtonPresenter;", "", "context", "Landroid/content/Context;", "button", "Lcom/reactnativenavigation/options/ButtonOptions;", "iconResolver", "Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/IconResolver;", "(Landroid/content/Context;Lcom/reactnativenavigation/options/ButtonOptions;Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/IconResolver;)V", "styledText", "Landroid/text/SpannableString;", "getStyledText", "()Landroid/text/SpannableString;", "applyAccessibilityLabel", "", "menuItem", "Landroid/view/MenuItem;", "applyAllCaps", "view", "Landroid/view/View;", "applyBackgroundColor", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "color", "Lcom/reactnativenavigation/options/params/ThemeColour;", "applyColor", "applyComponent", "viewCreator", "Lkotlin/Function0;", "applyDisabledColor", "disabledColor", "applyEnabled", "applyIcon", "applyIconBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "srcDrawable", "applyNavigationIcon", "onPress", "Lkotlin/Function1;", "applyOptions", "applyOptionsDirectlyOnView", "titleBar", "onViewFound", "applyShowAsAction", "applyTestId", "applyTextColor", "getIconColor", "", "()Ljava/lang/Integer;", "isIconButtonView", "", "Landroid/widget/TextView;", "isTextualButtonView", "setIconColor", "icon", "setLeftButtonTestId", "tint", "drawable", "Companion", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ButtonPresenter.kt */
public class ButtonPresenter {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int DISABLED_COLOR = -3355444;
    /* access modifiers changed from: private */
    public final ButtonOptions button;
    private final Context context;
    private final IconResolver iconResolver;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/ButtonPresenter$Companion;", "", "()V", "DISABLED_COLOR", "", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ButtonPresenter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ButtonPresenter(Context context2, ButtonOptions buttonOptions, IconResolver iconResolver2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(buttonOptions, "button");
        Intrinsics.checkNotNullParameter(iconResolver2, "iconResolver");
        this.context = context2;
        this.button = buttonOptions;
        this.iconResolver = iconResolver2;
    }

    public final SpannableString getStyledText() {
        SpannableString spannableString = new SpannableString((CharSequence) this.button.text.get(""));
        spannableString.setSpan(new ButtonSpan(this.context, this.button, (TypefaceLoader) null, 4, (DefaultConstructorMarker) null), 0, this.button.text.length(), 34);
        return spannableString;
    }

    public void tint(Drawable drawable, int i) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    public final void applyOptions(Toolbar toolbar, MenuItem menuItem, Function0<? extends View> function0) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(function0, "viewCreator");
        applyShowAsAction(menuItem);
        applyEnabled(menuItem);
        applyComponent(menuItem, function0);
        applyAccessibilityLabel(menuItem);
        applyIcon(menuItem);
        applyOptionsDirectlyOnView(toolbar, menuItem, new ButtonPresenter$applyOptions$1(this));
    }

    public final void applyColor(Toolbar toolbar, MenuItem menuItem, ThemeColour themeColour) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(themeColour, ViewProps.COLOR);
        this.button.color = themeColour;
        applyIcon(menuItem);
        applyOptionsDirectlyOnView(toolbar, menuItem, new ButtonPresenter$applyColor$1(this));
    }

    public final void applyDisabledColor(Toolbar toolbar, MenuItem menuItem, ThemeColour themeColour) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(themeColour, "disabledColor");
        this.button.disabledColor = themeColour;
        applyIcon(menuItem);
        applyOptionsDirectlyOnView(toolbar, menuItem, new ButtonPresenter$applyDisabledColor$1(this));
    }

    public final void applyBackgroundColor(Toolbar toolbar, MenuItem menuItem, ThemeColour themeColour) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(themeColour, ViewProps.COLOR);
        this.button.iconBackground.color = themeColour;
        applyIcon(menuItem);
    }

    private final void applyAccessibilityLabel(MenuItem menuItem) {
        if (!this.button.accessibilityLabel.hasValue()) {
            return;
        }
        if (this.button.component.hasValue()) {
            View actionView = menuItem.getActionView();
            if (actionView != null) {
                actionView.setContentDescription((CharSequence) this.button.accessibilityLabel.get());
                return;
            }
            return;
        }
        MenuItemCompat.setContentDescription(menuItem, (CharSequence) this.button.accessibilityLabel.get());
    }

    private final void applyComponent(MenuItem menuItem, Function0<? extends View> function0) {
        if (this.button.hasComponent()) {
            menuItem.setActionView((View) function0.invoke());
        }
    }

    private final void applyEnabled(MenuItem menuItem) {
        menuItem.setEnabled(this.button.enabled.isTrueOrUndefined());
    }

    private final Drawable applyIconBackgroundDrawable(Drawable drawable) {
        Integer num;
        if (!this.button.iconBackground.hasValue()) {
            return drawable;
        }
        Integer num2 = (Integer) this.button.iconBackground.width.get(Integer.valueOf(drawable.getIntrinsicWidth()));
        Intrinsics.checkNotNullExpressionValue(num2, "it");
        int max = Math.max(num2.intValue(), drawable.getIntrinsicWidth());
        Integer num3 = (Integer) this.button.iconBackground.height.get(Integer.valueOf(drawable.getIntrinsicHeight()));
        Intrinsics.checkNotNullExpressionValue(num3, "it");
        int max2 = Math.max(num3.intValue(), drawable.getIntrinsicHeight());
        DensityPixel densityPixel = this.button.iconBackground.cornerRadius;
        if (this.button.enabled.isTrueOrUndefined()) {
            num = this.button.iconBackground.color.get((Integer) null);
        } else {
            num = this.button.iconBackground.disabledColor.get((Integer) null);
        }
        Intrinsics.checkNotNullExpressionValue(densityPixel, "cornerRadius");
        return new IconBackgroundDrawable(drawable, densityPixel, max, max2, getIconColor(), num);
    }

    private final void applyIcon(MenuItem menuItem) {
        if (this.button.hasIcon()) {
            this.iconResolver.resolve(this.button, new ButtonPresenter$$ExternalSyntheticLambda2(this, menuItem));
        }
    }

    /* access modifiers changed from: private */
    public static final void applyIcon$lambda$4(ButtonPresenter buttonPresenter, MenuItem menuItem, Drawable drawable) {
        Intrinsics.checkNotNullParameter(buttonPresenter, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "$menuItem");
        if (drawable != null) {
            buttonPresenter.setIconColor(drawable);
            menuItem.setIcon(buttonPresenter.applyIconBackgroundDrawable(drawable));
        }
    }

    private final void applyShowAsAction(MenuItem menuItem) {
        if (this.button.showAsAction.hasValue()) {
            Object obj = this.button.showAsAction.get();
            Intrinsics.checkNotNullExpressionValue(obj, "button.showAsAction.get()");
            menuItem.setShowAsAction(((Number) obj).intValue());
        }
    }

    /* access modifiers changed from: private */
    public final void applyTestId(View view) {
        if (this.button.testId.hasValue()) {
            view.setTag(this.button.testId.get());
        }
    }

    /* access modifiers changed from: private */
    public final void applyTextColor(View view) {
        if (!(view instanceof TextView)) {
            return;
        }
        if (!this.button.enabled.isTrueOrUndefined()) {
            Integer num = this.button.disabledColor.get(Integer.valueOf(DISABLED_COLOR));
            Intrinsics.checkNotNull(num);
            ((TextView) view).setTextColor(num.intValue());
        } else if (this.button.color.hasValue()) {
            ((TextView) view).setTextColor(this.button.color.get());
        }
    }

    /* access modifiers changed from: private */
    public final void applyAllCaps(View view) {
        if (view instanceof TextView) {
            Object obj = this.button.allCaps.get(true);
            Intrinsics.checkNotNullExpressionValue(obj, "button.allCaps.get(true)");
            ((TextView) view).setAllCaps(((Boolean) obj).booleanValue());
        }
    }

    private final void applyOptionsDirectlyOnView(Toolbar toolbar, MenuItem menuItem, Function1<? super View, Unit> function1) {
        View view = toolbar;
        Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(view, new ButtonPresenter$applyOptionsDirectlyOnView$$inlined$doOnPreDraw$1(view, this, function1, menuItem, toolbar)), "View.doOnPreDraw(\n    crossinline action: (view: View) -> Unit\n): OneShotPreDrawListener = OneShotPreDrawListener.add(this) { action(this) }");
    }

    /* access modifiers changed from: private */
    public final boolean isIconButtonView(TextView textView, MenuItem menuItem) {
        return this.button.icon.hasValue() && ArrayUtils.contains(textView.getCompoundDrawables(), menuItem.getIcon());
    }

    /* access modifiers changed from: private */
    public final boolean isTextualButtonView(TextView textView) {
        return this.button.text.hasValue() && Intrinsics.areEqual(this.button.text.get(), (Object) textView.getText().toString());
    }

    public final void applyNavigationIcon(Toolbar toolbar, Function1<? super ButtonOptions, Unit> function1) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(function1, "onPress");
        this.iconResolver.resolve(this.button, new ButtonPresenter$$ExternalSyntheticLambda1(this, toolbar, function1));
    }

    /* access modifiers changed from: private */
    public static final void applyNavigationIcon$lambda$7(ButtonPresenter buttonPresenter, Toolbar toolbar, Function1 function1, Drawable drawable) {
        Intrinsics.checkNotNullParameter(buttonPresenter, "this$0");
        Intrinsics.checkNotNullParameter(toolbar, "$toolbar");
        Intrinsics.checkNotNullParameter(function1, "$onPress");
        Intrinsics.checkNotNullParameter(drawable, "icon");
        buttonPresenter.setIconColor(drawable);
        toolbar.setNavigationOnClickListener(new ButtonPresenter$$ExternalSyntheticLambda0(function1, buttonPresenter));
        toolbar.setNavigationIcon((Drawable) null);
        toolbar.setNavigationIcon(drawable);
        buttonPresenter.setLeftButtonTestId(toolbar);
        if (buttonPresenter.button.accessibilityLabel.hasValue()) {
            toolbar.setNavigationContentDescription((CharSequence) buttonPresenter.button.accessibilityLabel.get());
        }
    }

    /* access modifiers changed from: private */
    public static final void applyNavigationIcon$lambda$7$lambda$6(Function1 function1, ButtonPresenter buttonPresenter, View view) {
        Intrinsics.checkNotNullParameter(function1, "$onPress");
        Intrinsics.checkNotNullParameter(buttonPresenter, "this$0");
        function1.invoke(buttonPresenter.button);
    }

    private final void setIconColor(Drawable drawable) {
        Integer iconColor = getIconColor();
        if (iconColor != null) {
            tint(drawable, iconColor.intValue());
        }
    }

    private final Integer getIconColor() {
        if (this.button.disableIconTint.isTrue()) {
            return null;
        }
        if (this.button.enabled.isTrueOrUndefined() && this.button.color.hasValue()) {
            return Integer.valueOf(this.button.color.get());
        }
        if (this.button.enabled.isFalse()) {
            return this.button.disabledColor.get(Integer.valueOf(DISABLED_COLOR));
        }
        return null;
    }

    private final void setLeftButtonTestId(Toolbar toolbar) {
        if (this.button.testId.hasValue()) {
            toolbar.post(new ButtonPresenter$$ExternalSyntheticLambda3(toolbar, this));
        }
    }

    /* access modifiers changed from: private */
    public static final void setLeftButtonTestId$lambda$10(Toolbar toolbar, ButtonPresenter buttonPresenter) {
        Intrinsics.checkNotNullParameter(toolbar, "$toolbar");
        Intrinsics.checkNotNullParameter(buttonPresenter, "this$0");
        ImageButton imageButton = (ImageButton) ViewUtils.findChildByClass(toolbar, ImageButton.class);
        if (imageButton != null) {
            imageButton.setTag(buttonPresenter.button.testId.get());
            ViewCompat.setAccessibilityDelegate(imageButton, new ButtonPresenter$setLeftButtonTestId$1$1$WixAccessibilityDelegateCompat());
        }
    }
}
