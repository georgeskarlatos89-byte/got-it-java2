package com.reactnativenavigation.views.touch;

import android.view.MotionEvent;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.options.params.NullBool;
import com.reactnativenavigation.react.ReactView;
import com.reactnativenavigation.utils.MotionEventKt;
import com.reactnativenavigation.views.component.ComponentLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/reactnativenavigation/views/touch/OverlayTouchDelegate;", "", "component", "Lcom/reactnativenavigation/views/component/ComponentLayout;", "reactView", "Lcom/reactnativenavigation/react/ReactView;", "(Lcom/reactnativenavigation/views/component/ComponentLayout;Lcom/reactnativenavigation/react/ReactView;)V", "interceptTouchOutside", "Lcom/reactnativenavigation/options/params/Bool;", "getInterceptTouchOutside", "()Lcom/reactnativenavigation/options/params/Bool;", "setInterceptTouchOutside", "(Lcom/reactnativenavigation/options/params/Bool;)V", "handleDown", "", "event", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: OverlayTouchDelegate.kt */
public class OverlayTouchDelegate {
    private final ComponentLayout component;
    private Bool interceptTouchOutside = new NullBool();
    private final ReactView reactView;

    public OverlayTouchDelegate(ComponentLayout componentLayout, ReactView reactView2) {
        Intrinsics.checkNotNullParameter(componentLayout, "component");
        Intrinsics.checkNotNullParameter(reactView2, "reactView");
        this.component = componentLayout;
        this.reactView = reactView2;
    }

    public final Bool getInterceptTouchOutside() {
        return this.interceptTouchOutside;
    }

    public final void setInterceptTouchOutside(Bool bool) {
        Intrinsics.checkNotNullParameter(bool, "<set-?>");
        this.interceptTouchOutside = bool;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        boolean z = this.interceptTouchOutside.hasValue() && motionEvent.getActionMasked() == 0;
        if (z) {
            return handleDown(motionEvent);
        }
        if (!z) {
            return this.component.superOnInterceptTouchEvent(motionEvent);
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean handleDown(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        boolean coordinatesInsideView = MotionEventKt.coordinatesInsideView(motionEvent, this.reactView.getChildAt(0));
        if (coordinatesInsideView) {
            return this.component.superOnInterceptTouchEvent(motionEvent);
        }
        if (!coordinatesInsideView) {
            return this.interceptTouchOutside.isFalse();
        }
        throw new NoWhenBranchMatchedException();
    }
}
