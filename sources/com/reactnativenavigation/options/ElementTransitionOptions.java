package com.reactnativenavigation.options;

import android.animation.Animator;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/reactnativenavigation/options/ElementTransitionOptions;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "animation", "Lcom/reactnativenavigation/options/AnimationOptions;", "id", "", "getId", "()Ljava/lang/String;", "getAnimation", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ElementTransitionOptions.kt */
public final class ElementTransitionOptions {
    private final AnimationOptions animation;

    public ElementTransitionOptions(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        this.animation = new AnimationOptions(jSONObject);
    }

    public final String getId() {
        Object obj = this.animation.id.get();
        Intrinsics.checkNotNullExpressionValue(obj, "animation.id.get()");
        return (String) obj;
    }

    public final Animator getAnimation(View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        return this.animation.getAnimation(view);
    }
}
