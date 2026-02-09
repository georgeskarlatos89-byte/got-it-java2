package com.reactnativenavigation.views.stack.topbar.titlebar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.reactnativenavigation.utils.ObjectUtils;
import com.reactnativenavigation.utils.ViewUtils;
import com.reactnativenavigation.viewcontrollers.stack.topbar.button.ButtonController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0006J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0006H\u0016J\u000e\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0006R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006("}, d2 = {"Lcom/reactnativenavigation/views/stack/topbar/titlebar/ButtonBar;", "Landroidx/appcompat/widget/Toolbar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buttonCount", "", "getButtonCount", "()I", "shouldAnimate", "", "getShouldAnimate", "()Z", "setShouldAnimate", "(Z)V", "addButton", "Landroid/view/MenuItem;", "menuItem", "intId", "order", "styledText", "Landroid/text/SpannableString;", "clearBackButton", "", "clearButtons", "containsButton", "getButton", "index", "onViewAdded", "child", "Landroid/view/View;", "removeButton", "buttonId", "setBackButton", "button", "Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/ButtonController;", "setLayoutDirection", "layoutDirection", "setOverflowButtonColor", "color", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ButtonBar.kt */
public class ButtonBar extends Toolbar {
    private boolean shouldAnimate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonBar(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        super.setContentInsetsAbsolute(0, 0);
        setContentInsetStartWithNavigation(0);
    }

    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    public final void setShouldAnimate(boolean z) {
        this.shouldAnimate = z;
    }

    public void onViewAdded(View view) {
        Intrinsics.checkNotNullParameter(view, "child");
        super.onViewAdded(view);
    }

    /* access modifiers changed from: private */
    public static final void setLayoutDirection$lambda$0(int i, ActionMenuView actionMenuView) {
        Intrinsics.checkNotNullParameter(actionMenuView, "buttonsContainer");
        actionMenuView.setLayoutDirection(i);
    }

    public void setLayoutDirection(int i) {
        ObjectUtils.perform(ViewUtils.findChildByClass(this, ActionMenuView.class), new ButtonBar$$ExternalSyntheticLambda0(i));
        super.setLayoutDirection(i);
    }

    public final int getButtonCount() {
        return getMenu().size();
    }

    public final MenuItem addButton(int i, int i2, int i3, SpannableString spannableString) {
        Intrinsics.checkNotNullParameter(spannableString, "styledText");
        if (this.shouldAnimate) {
            TransitionManager.beginDelayedTransition(this, new AutoTransition());
        }
        Menu menu = getMenu();
        if (menu != null) {
            return menu.add(i, i2, i3, spannableString);
        }
        return null;
    }

    public final void removeButton(int i) {
        if (this.shouldAnimate) {
            TransitionManager.beginDelayedTransition(this, new AutoTransition());
        }
        getMenu().removeItem(i);
    }

    public void clearButtons() {
        if (this.shouldAnimate) {
            TransitionManager.beginDelayedTransition(this, new AutoTransition());
        }
        clearBackButton();
        if (getMenu().size() > 0) {
            getMenu().clear();
        }
    }

    public final MenuItem getButton(int i) {
        MenuItem item = getMenu().getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "menu.getItem(index)");
        return item;
    }

    public final boolean containsButton(MenuItem menuItem, int i) {
        return (menuItem == null || getMenu().findItem(menuItem.getItemId()) == null || menuItem.getOrder() != i) ? false : true;
    }

    public final void setBackButton(ButtonController buttonController) {
        Intrinsics.checkNotNullParameter(buttonController, "button");
        buttonController.applyNavigationIcon(this);
    }

    public final void clearBackButton() {
        setNavigationIcon((Drawable) null);
    }

    public final void setOverflowButtonColor(int i) {
        Drawable overflowIcon;
        ActionMenuView actionMenuView = (ActionMenuView) ViewUtils.findChildByClass(this, ActionMenuView.class);
        if (actionMenuView != null && (overflowIcon = actionMenuView.getOverflowIcon()) != null) {
            overflowIcon.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }
}
