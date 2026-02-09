package com.reactnativenavigation.viewcontrollers.stack.topbar;

import android.view.ViewGroup;
import com.reactnativenavigation.options.AnimationOptions;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ScrollEventListener;
import com.reactnativenavigation.views.animations.BaseViewAnimator;
import com.reactnativenavigation.views.stack.topbar.TopBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/stack/topbar/TopBarCollapseBehavior;", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ScrollEventListener$OnScrollListener;", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ScrollEventListener$OnDragListener;", "topBar", "Lcom/reactnativenavigation/views/stack/topbar/TopBar;", "(Lcom/reactnativenavigation/views/stack/topbar/TopBar;)V", "animator", "Lcom/reactnativenavigation/viewcontrollers/stack/topbar/TopBarAnimator;", "scrollEventListener", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ScrollEventListener;", "disableCollapse", "", "enableCollapse", "onHide", "onScrollDown", "nextTranslation", "", "onScrollUp", "onShow", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TopBarCollapseBehavior.kt */
public final class TopBarCollapseBehavior implements ScrollEventListener.OnScrollListener, ScrollEventListener.OnDragListener {
    private final TopBarAnimator animator;
    private ScrollEventListener scrollEventListener;
    private final TopBar topBar;

    public TopBarCollapseBehavior(TopBar topBar2) {
        Intrinsics.checkNotNullParameter(topBar2, "topBar");
        this.topBar = topBar2;
        this.animator = new TopBarAnimator(topBar2);
    }

    public final void enableCollapse(ScrollEventListener scrollEventListener2) {
        this.scrollEventListener = scrollEventListener2;
        Intrinsics.checkNotNull(scrollEventListener2);
        scrollEventListener2.register(this.topBar, this, this);
    }

    public final void disableCollapse() {
        ScrollEventListener scrollEventListener2 = this.scrollEventListener;
        if (scrollEventListener2 != null) {
            Intrinsics.checkNotNull(scrollEventListener2);
            scrollEventListener2.unregister();
            this.topBar.setVisibility(0);
            this.topBar.setTranslationY(0.0f);
        }
    }

    public void onScrollUp(float f) {
        int measuredHeight = this.topBar.getMeasuredHeight();
        float f2 = (float) (-measuredHeight);
        if (f < f2 && this.topBar.getVisibility() == 0) {
            this.topBar.setVisibility(8);
            this.topBar.setTranslationY(-((float) measuredHeight));
        } else if (f > f2 && f <= 0.0f) {
            this.topBar.setTranslationY(f);
        }
    }

    public void onScrollDown(float f) {
        int measuredHeight = this.topBar.getMeasuredHeight();
        if (this.topBar.getVisibility() == 8 && f > ((float) (-measuredHeight))) {
            this.topBar.setVisibility(0);
            this.topBar.setTranslationY(f);
        } else if (f <= 0.0f && f >= ((float) (-measuredHeight))) {
            this.topBar.setTranslationY(f);
        }
    }

    public void onShow() {
        BaseViewAnimator.show$default(this.animator, (AnimationOptions) null, this.topBar.getTranslationY(), 1, (Object) null);
    }

    public void onHide() {
        TopBarAnimator topBarAnimator = this.animator;
        float translationY = this.topBar.getTranslationY();
        ViewGroup.LayoutParams layoutParams = this.topBar.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        topBarAnimator.hideOnScroll(translationY, (float) ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
    }
}
