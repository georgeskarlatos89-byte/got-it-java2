package com.reactnativenavigation.viewcontrollers.stack.topbar;

import com.reactnativenavigation.views.animations.BaseViewAnimator;
import com.reactnativenavigation.views.animations.ViewAnimatorCreator;
import com.reactnativenavigation.views.stack.topbar.TopBar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/stack/topbar/TopBarAnimator;", "Lcom/reactnativenavigation/views/animations/BaseViewAnimator;", "Lcom/reactnativenavigation/views/stack/topbar/TopBar;", "view", "(Lcom/reactnativenavigation/views/stack/topbar/TopBar;)V", "hideOnScroll", "", "translationStart", "", "translationEndDy", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TopBarAnimator.kt */
public final class TopBarAnimator extends BaseViewAnimator<TopBar> {
    public TopBarAnimator() {
        this((TopBar) null, 1, (DefaultConstructorMarker) null);
    }

    public final void hideOnScroll(float f, float f2) {
    }

    public TopBarAnimator(TopBar topBar) {
        super(BaseViewAnimator.HideDirection.Up, topBar, (ViewAnimatorCreator) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TopBarAnimator(TopBar topBar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : topBar);
    }
}
