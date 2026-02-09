package com.reactnativenavigation.viewcontrollers.stack.topbar.button;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;
import com.reactnativenavigation.utils.Functions;
import kotlin.jvm.functions.Function1;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ButtonPresenter$$ExternalSyntheticLambda1 implements Functions.Func1 {
    public final /* synthetic */ ButtonPresenter f$0;
    public final /* synthetic */ Toolbar f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ ButtonPresenter$$ExternalSyntheticLambda1(ButtonPresenter buttonPresenter, Toolbar toolbar, Function1 function1) {
        this.f$0 = buttonPresenter;
        this.f$1 = toolbar;
        this.f$2 = function1;
    }

    public final void run(Object obj) {
        ButtonPresenter.applyNavigationIcon$lambda$7(this.f$0, this.f$1, this.f$2, (Drawable) obj);
    }
}
