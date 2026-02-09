package com.reactnativenavigation.options.animations;

import com.reactnativenavigation.options.AnimationOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0000J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/reactnativenavigation/options/animations/ViewAnimationOptions;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "enter", "Lcom/reactnativenavigation/options/AnimationOptions;", "exit", "mergeWith", "", "other", "mergeWithDefault", "defaultOptions", "parse", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ViewAnimationOptions.kt */
public final class ViewAnimationOptions {
    public AnimationOptions enter;
    public AnimationOptions exit;

    public ViewAnimationOptions() {
        this((JSONObject) null, 1, (DefaultConstructorMarker) null);
    }

    public ViewAnimationOptions(JSONObject jSONObject) {
        this.enter = new AnimationOptions((JSONObject) null, 1, (DefaultConstructorMarker) null);
        this.exit = new AnimationOptions((JSONObject) null, 1, (DefaultConstructorMarker) null);
        if (jSONObject != null) {
            parse(jSONObject);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewAnimationOptions(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jSONObject);
    }

    public final void mergeWith(ViewAnimationOptions viewAnimationOptions) {
        Intrinsics.checkNotNullParameter(viewAnimationOptions, "other");
        this.enter.mergeWith(viewAnimationOptions.enter);
        this.exit.mergeWith(viewAnimationOptions.exit);
    }

    public final void mergeWithDefault(ViewAnimationOptions viewAnimationOptions) {
        Intrinsics.checkNotNullParameter(viewAnimationOptions, "defaultOptions");
        this.enter.mergeWithDefault(viewAnimationOptions.enter);
        this.exit.mergeWithDefault(viewAnimationOptions.exit);
    }

    private final void parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("enter");
            if (optJSONObject != null) {
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "optJSONObject(\"enter\")");
                this.enter = new AnimationOptions(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("exit");
            if (optJSONObject2 != null) {
                Intrinsics.checkNotNullExpressionValue(optJSONObject2, "optJSONObject(\"exit\")");
                this.exit = new AnimationOptions(optJSONObject2);
            }
        }
    }
}
