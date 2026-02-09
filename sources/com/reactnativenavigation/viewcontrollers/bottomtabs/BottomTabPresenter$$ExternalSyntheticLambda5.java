package com.reactnativenavigation.viewcontrollers.bottomtabs;

import com.aurelhubert.ahbottomnavigation.notification.AHNotification;
import com.reactnativenavigation.utils.Functions;
import com.reactnativenavigation.views.bottomtabs.BottomTabs;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BottomTabPresenter$$ExternalSyntheticLambda5 implements Functions.Func1 {
    public final /* synthetic */ AHNotification.Builder f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ BottomTabPresenter$$ExternalSyntheticLambda5(AHNotification.Builder builder, int i) {
        this.f$0 = builder;
        this.f$1 = i;
    }

    public final void run(Object obj) {
        ((BottomTabs) obj).setNotification(this.f$0.build(), this.f$1);
    }
}
