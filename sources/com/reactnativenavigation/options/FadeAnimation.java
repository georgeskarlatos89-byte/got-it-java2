package com.reactnativenavigation.options;

import com.brentvatne.react.ReactVideoView;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/reactnativenavigation/options/FadeAnimation;", "Lcom/reactnativenavigation/options/StackAnimationOptions;", "()V", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FadeAnimation.kt */
public final class FadeAnimation extends StackAnimationOptions {
    public static final FadeAnimation INSTANCE;

    private FadeAnimation() {
        super((JSONObject) null, 1, (DefaultConstructorMarker) null);
    }

    static {
        FadeAnimation fadeAnimation = new FadeAnimation();
        INSTANCE = fadeAnimation;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.MessagePayloadKeys.FROM, 0);
        jSONObject.put("to", 1);
        jSONObject.put(ReactVideoView.EVENT_PROP_DURATION, 300);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alpha", jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(Constants.MessagePayloadKeys.FROM, 1);
        jSONObject3.put("to", 0);
        jSONObject3.put(ReactVideoView.EVENT_PROP_DURATION, 300);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("alpha", jSONObject3);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("enter", jSONObject2);
        jSONObject5.put("exit", jSONObject4);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("content", jSONObject5);
        fadeAnimation.mergeWith(new StackAnimationOptions(jSONObject6));
    }
}
