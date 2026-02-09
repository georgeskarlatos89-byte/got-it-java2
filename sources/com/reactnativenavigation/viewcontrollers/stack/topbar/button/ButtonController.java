package com.reactnativenavigation.viewcontrollers.stack.topbar.button;

import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.ButtonOptions;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.react.events.ComponentType;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.stack.topbar.titlebar.ButtonBar;
import com.reactnativenavigation.views.stack.topbar.titlebar.TitleBarButtonCreator;
import com.reactnativenavigation.views.stack.topbar.titlebar.TitleBarReactButtonView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00016B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0016J\u001f\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016¢\u0006\u0002\u0010%J\u001f\u0010&\u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016¢\u0006\u0002\u0010%J\u001f\u0010'\u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010(\u001a\u00020$H\u0016¢\u0006\u0002\u0010%J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0000J\b\u0010-\u001a\u00020\u0002H\u0016J\b\u0010.\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020+H\u0016J\u0010\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\u001aH\u0016J\b\u00102\u001a\u00020\u001cH\u0017J\b\u00103\u001a\u00020\u001cH\u0017J\u0010\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u0012H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/ButtonController;", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;", "Lcom/reactnativenavigation/views/stack/topbar/titlebar/TitleBarReactButtonView;", "Landroid/view/MenuItem$OnMenuItemClickListener;", "activity", "Landroid/app/Activity;", "presenter", "Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/ButtonPresenter;", "button", "Lcom/reactnativenavigation/options/ButtonOptions;", "viewCreator", "Lcom/reactnativenavigation/views/stack/topbar/titlebar/TitleBarButtonCreator;", "onPressListener", "Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/ButtonController$OnClickListener;", "(Landroid/app/Activity;Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/ButtonPresenter;Lcom/reactnativenavigation/options/ButtonOptions;Lcom/reactnativenavigation/views/stack/topbar/titlebar/TitleBarButtonCreator;Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/ButtonController$OnClickListener;)V", "getButton", "()Lcom/reactnativenavigation/options/ButtonOptions;", "buttonInstanceId", "", "getButtonInstanceId", "()Ljava/lang/String;", "buttonIntId", "", "getButtonIntId", "()I", "menuItem", "Landroid/view/MenuItem;", "addToMenu", "", "buttonBar", "Lcom/reactnativenavigation/views/stack/topbar/titlebar/ButtonBar;", "order", "applyBackgroundColor", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "color", "Lcom/reactnativenavigation/options/params/ThemeColour;", "(Landroidx/appcompat/widget/Toolbar;Lcom/reactnativenavigation/options/params/ThemeColour;)Lkotlin/Unit;", "applyColor", "applyDisabledColor", "disabledColour", "applyNavigationIcon", "areButtonsEqual", "", "other", "createView", "getCurrentComponentName", "isRendered", "onMenuItemClick", "item", "onViewDisappear", "onViewWillAppear", "sendOnNavigationButtonPressed", "buttonId", "OnClickListener", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ButtonController.kt */
public class ButtonController extends ViewController<TitleBarReactButtonView> implements MenuItem.OnMenuItemClickListener {
    private final ButtonOptions button;
    private MenuItem menuItem;
    /* access modifiers changed from: private */
    public final OnClickListener onPressListener;
    private final ButtonPresenter presenter;
    private final TitleBarButtonCreator viewCreator;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/stack/topbar/button/ButtonController$OnClickListener;", "", "onPress", "", "button", "Lcom/reactnativenavigation/options/ButtonOptions;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ButtonController.kt */
    public interface OnClickListener {
        void onPress(ButtonOptions buttonOptions);
    }

    public final ButtonOptions getButton() {
        return this.button;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ButtonController(android.app.Activity r8, com.reactnativenavigation.viewcontrollers.stack.topbar.button.ButtonPresenter r9, com.reactnativenavigation.options.ButtonOptions r10, com.reactnativenavigation.views.stack.topbar.titlebar.TitleBarButtonCreator r11, com.reactnativenavigation.viewcontrollers.stack.topbar.button.ButtonController.OnClickListener r12) {
        /*
            r7 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "presenter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "button"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "viewCreator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onPressListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r3 = r10.id
            com.reactnativenavigation.viewcontrollers.viewcontroller.YellowBoxDelegate r4 = new com.reactnativenavigation.viewcontrollers.viewcontroller.YellowBoxDelegate
            r0 = r8
            android.content.Context r0 = (android.content.Context) r0
            r4.<init>(r0)
            com.reactnativenavigation.options.Options r5 = new com.reactnativenavigation.options.Options
            r5.<init>()
            com.reactnativenavigation.viewcontrollers.viewcontroller.overlay.ViewControllerOverlay r6 = new com.reactnativenavigation.viewcontrollers.viewcontroller.overlay.ViewControllerOverlay
            r6.<init>(r0)
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.presenter = r9
            r7.button = r10
            r7.viewCreator = r11
            r7.onPressListener = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.stack.topbar.button.ButtonController.<init>(android.app.Activity, com.reactnativenavigation.viewcontrollers.stack.topbar.button.ButtonPresenter, com.reactnativenavigation.options.ButtonOptions, com.reactnativenavigation.views.stack.topbar.titlebar.TitleBarButtonCreator, com.reactnativenavigation.viewcontrollers.stack.topbar.button.ButtonController$OnClickListener):void");
    }

    public final String getButtonInstanceId() {
        String str = this.button.instanceId;
        Intrinsics.checkNotNullExpressionValue(str, "button.instanceId");
        return str;
    }

    public final int getButtonIntId() {
        return this.button.getIntId();
    }

    public void onViewWillAppear() {
        TitleBarReactButtonView titleBarReactButtonView = (TitleBarReactButtonView) getView();
        if (titleBarReactButtonView != null) {
            titleBarReactButtonView.sendComponentWillStart(ComponentType.Button);
        }
        TitleBarReactButtonView titleBarReactButtonView2 = (TitleBarReactButtonView) getView();
        if (titleBarReactButtonView2 != null) {
            titleBarReactButtonView2.sendComponentStart(ComponentType.Button);
        }
    }

    public void onViewDisappear() {
        TitleBarReactButtonView titleBarReactButtonView = (TitleBarReactButtonView) getView();
        if (titleBarReactButtonView != null) {
            titleBarReactButtonView.sendComponentStop(ComponentType.Button);
        }
    }

    public boolean isRendered() {
        return !this.button.component.componentId.hasValue() || super.isRendered();
    }

    public void sendOnNavigationButtonPressed(String str) {
        Intrinsics.checkNotNullParameter(str, "buttonId");
        ViewGroup view = getView();
        Intrinsics.checkNotNull(view);
        ((TitleBarReactButtonView) view).sendOnNavigationButtonPressed(str);
    }

    public String getCurrentComponentName() {
        Object obj = this.button.component.name.get();
        Intrinsics.checkNotNullExpressionValue(obj, "button.component.name.get()");
        return (String) obj;
    }

    public TitleBarReactButtonView createView() {
        TitleBarReactButtonView create = this.viewCreator.create(getActivity(), this.button.component);
        this.view = create;
        Intrinsics.checkNotNullExpressionValue(create, "viewCreator.create(activ…    view = this\n        }");
        return create;
    }

    public boolean onMenuItemClick(MenuItem menuItem2) {
        Intrinsics.checkNotNullParameter(menuItem2, "item");
        this.onPressListener.onPress(this.button);
        return true;
    }

    public final boolean areButtonsEqual(ButtonController buttonController) {
        Intrinsics.checkNotNullParameter(buttonController, "other");
        if (buttonController == this) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) buttonController.getId(), (Object) getId())) {
            return false;
        }
        return this.button.equals(buttonController.button);
    }

    public final void applyNavigationIcon(Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        this.presenter.applyNavigationIcon(toolbar, new ButtonController$applyNavigationIcon$1(this));
    }

    public Unit applyColor(Toolbar toolbar, ThemeColour themeColour) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(themeColour, ViewProps.COLOR);
        MenuItem menuItem2 = this.menuItem;
        if (menuItem2 == null) {
            return null;
        }
        this.presenter.applyColor(toolbar, menuItem2, themeColour);
        return Unit.INSTANCE;
    }

    public Unit applyDisabledColor(Toolbar toolbar, ThemeColour themeColour) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(themeColour, "disabledColour");
        MenuItem menuItem2 = this.menuItem;
        if (menuItem2 == null) {
            return null;
        }
        this.presenter.applyDisabledColor(toolbar, menuItem2, themeColour);
        return Unit.INSTANCE;
    }

    public Unit applyBackgroundColor(Toolbar toolbar, ThemeColour themeColour) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(themeColour, ViewProps.COLOR);
        MenuItem menuItem2 = this.menuItem;
        if (menuItem2 == null) {
            return null;
        }
        this.presenter.applyBackgroundColor(toolbar, menuItem2, themeColour);
        return Unit.INSTANCE;
    }

    public final void addToMenu(ButtonBar buttonBar, int i) {
        Intrinsics.checkNotNullParameter(buttonBar, "buttonBar");
        if (!this.button.component.hasValue() || !buttonBar.containsButton(this.menuItem, i)) {
            buttonBar.getMenu().removeItem(this.button.getIntId());
            MenuItem addButton = buttonBar.addButton(0, this.button.getIntId(), i, this.presenter.getStyledText());
            if (addButton != null) {
                addButton.setOnMenuItemClickListener(this);
                this.presenter.applyOptions(buttonBar, addButton, new ButtonController$addToMenu$1$1(this));
            } else {
                addButton = null;
            }
            this.menuItem = addButton;
        }
    }
}
