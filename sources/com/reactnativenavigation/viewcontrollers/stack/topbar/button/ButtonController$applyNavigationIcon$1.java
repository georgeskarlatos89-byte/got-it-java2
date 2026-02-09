package com.reactnativenavigation.viewcontrollers.stack.topbar.button;

import com.reactnativenavigation.options.ButtonOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/reactnativenavigation/options/ButtonOptions;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ButtonController.kt */
final class ButtonController$applyNavigationIcon$1 extends Lambda implements Function1<ButtonOptions, Unit> {
    final /* synthetic */ ButtonController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ButtonController$applyNavigationIcon$1(ButtonController buttonController) {
        super(1);
        this.this$0 = buttonController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ButtonOptions) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(ButtonOptions buttonOptions) {
        Intrinsics.checkNotNullParameter(buttonOptions, "it");
        this.this$0.onPressListener.onPress(buttonOptions);
    }
}
