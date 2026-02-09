package com.reactnativenavigation.viewcontrollers.stack.topbar.button;

import com.reactnativenavigation.views.stack.topbar.titlebar.TitleBarReactButtonView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ButtonController.kt */
/* synthetic */ class ButtonController$addToMenu$1$1 extends FunctionReferenceImpl implements Function0<TitleBarReactButtonView> {
    ButtonController$addToMenu$1$1(Object obj) {
        super(0, obj, ButtonController.class, "getView", "getView()Landroid/view/ViewGroup;", 0);
    }

    public final TitleBarReactButtonView invoke() {
        return (TitleBarReactButtonView) ((ButtonController) this.receiver).getView();
    }
}
