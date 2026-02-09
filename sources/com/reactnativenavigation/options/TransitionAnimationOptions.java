package com.reactnativenavigation.options;

import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.params.Bool;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0000H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0000H\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001eH\u0007R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/reactnativenavigation/options/TransitionAnimationOptions;", "Lcom/reactnativenavigation/options/LayoutAnimation;", "enter", "Lcom/reactnativenavigation/options/AnimationOptions;", "exit", "sharedElements", "Lcom/reactnativenavigation/options/SharedElements;", "elementTransitions", "Lcom/reactnativenavigation/options/ElementTransitions;", "(Lcom/reactnativenavigation/options/AnimationOptions;Lcom/reactnativenavigation/options/AnimationOptions;Lcom/reactnativenavigation/options/SharedElements;Lcom/reactnativenavigation/options/ElementTransitions;)V", "getElementTransitions", "()Lcom/reactnativenavigation/options/ElementTransitions;", "setElementTransitions", "(Lcom/reactnativenavigation/options/ElementTransitions;)V", "getEnter", "()Lcom/reactnativenavigation/options/AnimationOptions;", "getExit", "getSharedElements", "()Lcom/reactnativenavigation/options/SharedElements;", "setSharedElements", "(Lcom/reactnativenavigation/options/SharedElements;)V", "hasElementTransitions", "", "hasValue", "mergeWith", "", "other", "mergeWithDefault", "setWaitForRender", "waitForRender", "Lcom/reactnativenavigation/options/params/Bool;", "toggle", "enabled", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TransitionAnimationOptions.kt */
public class TransitionAnimationOptions implements LayoutAnimation {
    private ElementTransitions elementTransitions;
    private final AnimationOptions enter;
    private final AnimationOptions exit;
    private SharedElements sharedElements;

    public TransitionAnimationOptions() {
        this((AnimationOptions) null, (AnimationOptions) null, (SharedElements) null, (ElementTransitions) null, 15, (DefaultConstructorMarker) null);
    }

    public TransitionAnimationOptions(AnimationOptions animationOptions, AnimationOptions animationOptions2, SharedElements sharedElements2, ElementTransitions elementTransitions2) {
        Intrinsics.checkNotNullParameter(animationOptions, "enter");
        Intrinsics.checkNotNullParameter(animationOptions2, "exit");
        Intrinsics.checkNotNullParameter(sharedElements2, "sharedElements");
        Intrinsics.checkNotNullParameter(elementTransitions2, "elementTransitions");
        this.enter = animationOptions;
        this.exit = animationOptions2;
        this.sharedElements = sharedElements2;
        this.elementTransitions = elementTransitions2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransitionAnimationOptions(AnimationOptions animationOptions, AnimationOptions animationOptions2, SharedElements sharedElements2, ElementTransitions elementTransitions2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AnimationOptions((JSONObject) null, 1, (DefaultConstructorMarker) null) : animationOptions, (i & 2) != 0 ? new AnimationOptions((JSONObject) null, 1, (DefaultConstructorMarker) null) : animationOptions2, (i & 4) != 0 ? new SharedElements() : sharedElements2, (i & 8) != 0 ? new ElementTransitions() : elementTransitions2);
    }

    public final AnimationOptions getEnter() {
        return this.enter;
    }

    public final AnimationOptions getExit() {
        return this.exit;
    }

    public SharedElements getSharedElements() {
        return this.sharedElements;
    }

    public void setSharedElements(SharedElements sharedElements2) {
        Intrinsics.checkNotNullParameter(sharedElements2, "<set-?>");
        this.sharedElements = sharedElements2;
    }

    public ElementTransitions getElementTransitions() {
        return this.elementTransitions;
    }

    public void setElementTransitions(ElementTransitions elementTransitions2) {
        Intrinsics.checkNotNullParameter(elementTransitions2, "<set-?>");
        this.elementTransitions = elementTransitions2;
    }

    public boolean hasValue() {
        return this.enter.hasValue() || this.exit.hasValue() || getSharedElements().hasValue() || getElementTransitions().hasValue();
    }

    public void mergeWith(TransitionAnimationOptions transitionAnimationOptions) {
        Intrinsics.checkNotNullParameter(transitionAnimationOptions, "other");
        this.enter.mergeWith(transitionAnimationOptions.enter);
        this.exit.mergeWith(transitionAnimationOptions.exit);
        getSharedElements().mergeWith(transitionAnimationOptions.getSharedElements());
        getElementTransitions().mergeWith(transitionAnimationOptions.getElementTransitions());
    }

    public void mergeWithDefault(TransitionAnimationOptions transitionAnimationOptions) {
        Intrinsics.checkNotNullParameter(transitionAnimationOptions, "other");
        if (!this.enter.hasValue()) {
            this.enter.mergeWithDefault(transitionAnimationOptions.enter);
        }
        if (!this.exit.hasValue()) {
            this.exit.mergeWithDefault(transitionAnimationOptions.exit);
        }
        if (!getSharedElements().hasValue()) {
            getSharedElements().mergeWithDefault(transitionAnimationOptions.getSharedElements());
        }
        if (!getElementTransitions().hasValue()) {
            getElementTransitions().mergeWithDefault(transitionAnimationOptions.getElementTransitions());
        }
    }

    public boolean hasElementTransitions() {
        return getSharedElements().hasValue() || getElementTransitions().hasValue();
    }

    public final void setWaitForRender(Bool bool) {
        Intrinsics.checkNotNullParameter(bool, "waitForRender");
        this.enter.waitForRender = bool;
        this.exit.waitForRender = bool;
    }

    public final void toggle(Bool bool) {
        Intrinsics.checkNotNullParameter(bool, ViewProps.ENABLED);
        this.enter.enabled = bool;
        this.exit.enabled = bool;
    }
}
