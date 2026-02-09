package com.reactnativenavigation.options;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"parseTransitionAnimationOptions", "Lcom/reactnativenavigation/options/TransitionAnimationOptions;", "jsonObject", "Lorg/json/JSONObject;", "react-native-navigation_reactNative71Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TransitionAnimationOptions.kt */
public final class TransitionAnimationOptionsKt {
    public static final TransitionAnimationOptions parseTransitionAnimationOptions(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new TransitionAnimationOptions((AnimationOptions) null, (AnimationOptions) null, (SharedElements) null, (ElementTransitions) null, 15, (DefaultConstructorMarker) null);
        }
        TransitionAnimationOptions transitionAnimationOptions = new TransitionAnimationOptions(new AnimationOptions(jSONObject.optJSONObject("enter")), new AnimationOptions(jSONObject.optJSONObject("exit")), (SharedElements) null, (ElementTransitions) null, 12, (DefaultConstructorMarker) null);
        if (jSONObject.has("sharedElementTransitions")) {
            transitionAnimationOptions.setSharedElements(SharedElements.Companion.parse(jSONObject));
        }
        if (!jSONObject.has("elementTransitions")) {
            return transitionAnimationOptions;
        }
        transitionAnimationOptions.setElementTransitions(ElementTransitions.Companion.parse(jSONObject));
        return transitionAnimationOptions;
    }
}
