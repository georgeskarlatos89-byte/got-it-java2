package com.reactnativenavigation.options;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0000J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/reactnativenavigation/options/AnimationsOptions;", "", "()V", "dismissModal", "Lcom/reactnativenavigation/options/TransitionAnimationOptions;", "pop", "Lcom/reactnativenavigation/options/StackAnimationOptions;", "push", "setRoot", "setStackRoot", "showModal", "mergeWith", "", "other", "mergeWithDefault", "defaultOptions", "Companion", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AnimationsOptions.kt */
public final class AnimationsOptions {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public TransitionAnimationOptions dismissModal = new TransitionAnimationOptions((AnimationOptions) null, (AnimationOptions) null, (SharedElements) null, (ElementTransitions) null, 15, (DefaultConstructorMarker) null);
    public StackAnimationOptions pop = new StackAnimationOptions((JSONObject) null, 1, (DefaultConstructorMarker) null);
    public StackAnimationOptions push = new StackAnimationOptions((JSONObject) null, 1, (DefaultConstructorMarker) null);
    public TransitionAnimationOptions setRoot = new TransitionAnimationOptions((AnimationOptions) null, (AnimationOptions) null, (SharedElements) null, (ElementTransitions) null, 15, (DefaultConstructorMarker) null);
    public StackAnimationOptions setStackRoot = new StackAnimationOptions((JSONObject) null, 1, (DefaultConstructorMarker) null);
    public TransitionAnimationOptions showModal = new TransitionAnimationOptions((AnimationOptions) null, (AnimationOptions) null, (SharedElements) null, (ElementTransitions) null, 15, (DefaultConstructorMarker) null);

    @JvmStatic
    public static final AnimationsOptions parse(JSONObject jSONObject) {
        return Companion.parse(jSONObject);
    }

    public AnimationsOptions() {
    }

    public final void mergeWith(AnimationsOptions animationsOptions) {
        Intrinsics.checkNotNullParameter(animationsOptions, "other");
        this.push.mergeWith(animationsOptions.push);
        this.pop.mergeWith(animationsOptions.pop);
        this.setRoot.mergeWith(animationsOptions.setRoot);
        this.setStackRoot.mergeWith(animationsOptions.setStackRoot);
        this.showModal.mergeWith(animationsOptions.showModal);
        this.dismissModal.mergeWith(animationsOptions.dismissModal);
    }

    public final void mergeWithDefault(AnimationsOptions animationsOptions) {
        Intrinsics.checkNotNullParameter(animationsOptions, "defaultOptions");
        this.push.mergeWithDefault(animationsOptions.push);
        this.pop.mergeWithDefault(animationsOptions.pop);
        this.setStackRoot.mergeWithDefault(animationsOptions.setStackRoot);
        this.setRoot.mergeWithDefault(animationsOptions.setRoot);
        this.showModal.mergeWithDefault(animationsOptions.showModal);
        this.dismissModal.mergeWithDefault(animationsOptions.dismissModal);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/reactnativenavigation/options/AnimationsOptions$Companion;", "", "()V", "parse", "Lcom/reactnativenavigation/options/AnimationsOptions;", "json", "Lorg/json/JSONObject;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AnimationsOptions.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AnimationsOptions parse(JSONObject jSONObject) {
            AnimationsOptions animationsOptions = new AnimationsOptions();
            if (jSONObject == null) {
                return animationsOptions;
            }
            animationsOptions.push = new StackAnimationOptions(jSONObject.optJSONObject("push"));
            animationsOptions.pop = new StackAnimationOptions(jSONObject.optJSONObject("pop"));
            animationsOptions.setStackRoot = new StackAnimationOptions(jSONObject.optJSONObject("setStackRoot"));
            JSONObject optJSONObject = jSONObject.optJSONObject("setRoot");
            if (optJSONObject != null) {
                animationsOptions.setRoot = TransitionAnimationOptionsKt.parseTransitionAnimationOptions(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("showModal");
            if (optJSONObject2 != null) {
                animationsOptions.showModal = TransitionAnimationOptionsKt.parseTransitionAnimationOptions(optJSONObject2);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("dismissModal");
            if (optJSONObject3 != null) {
                animationsOptions.dismissModal = TransitionAnimationOptionsKt.parseTransitionAnimationOptions(optJSONObject3);
            }
            return animationsOptions;
        }
    }
}
