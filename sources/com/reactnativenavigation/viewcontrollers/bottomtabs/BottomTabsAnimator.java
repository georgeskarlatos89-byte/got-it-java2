package com.reactnativenavigation.viewcontrollers.bottomtabs;

import com.reactnativenavigation.views.animations.BaseViewAnimator;
import com.reactnativenavigation.views.animations.ViewAnimatorCreator;
import com.reactnativenavigation.views.bottomtabs.BottomTabs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/bottomtabs/BottomTabsAnimator;", "Lcom/reactnativenavigation/views/animations/BaseViewAnimator;", "Lcom/reactnativenavigation/views/bottomtabs/BottomTabs;", "view", "(Lcom/reactnativenavigation/views/bottomtabs/BottomTabs;)V", "onHideAnimationEnd", "", "onShowAnimationEnd", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: BottomTabsAnimator.kt */
public final class BottomTabsAnimator extends BaseViewAnimator<BottomTabs> {
    public BottomTabsAnimator() {
        this((BottomTabs) null, 1, (DefaultConstructorMarker) null);
    }

    public BottomTabsAnimator(BottomTabs bottomTabs) {
        super(BaseViewAnimator.HideDirection.Down, bottomTabs, (ViewAnimatorCreator) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomTabsAnimator(BottomTabs bottomTabs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bottomTabs);
    }

    public void onShowAnimationEnd() {
        ((BottomTabs) getView()).restoreBottomNavigation(false);
    }

    public void onHideAnimationEnd() {
        ((BottomTabs) getView()).hideBottomNavigation(false);
    }
}
