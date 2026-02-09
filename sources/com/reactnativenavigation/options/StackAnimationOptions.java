package com.reactnativenavigation.options;

import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.animations.ViewAnimationOptions;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.options.params.NullBool;
import com.reactnativenavigation.options.parsers.BoolParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0000J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0000J\u0012\u0010 \u001a\u00020\u001c2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/reactnativenavigation/options/StackAnimationOptions;", "Lcom/reactnativenavigation/options/LayoutAnimation;", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "bottomTabs", "Lcom/reactnativenavigation/options/animations/ViewAnimationOptions;", "content", "elementTransitions", "Lcom/reactnativenavigation/options/ElementTransitions;", "getElementTransitions", "()Lcom/reactnativenavigation/options/ElementTransitions;", "setElementTransitions", "(Lcom/reactnativenavigation/options/ElementTransitions;)V", "enabled", "Lcom/reactnativenavigation/options/params/Bool;", "sharedElements", "Lcom/reactnativenavigation/options/SharedElements;", "getSharedElements", "()Lcom/reactnativenavigation/options/SharedElements;", "setSharedElements", "(Lcom/reactnativenavigation/options/SharedElements;)V", "topBar", "waitForRender", "hasEnterValue", "", "hasExitValue", "mergeWith", "", "other", "mergeWithDefault", "defaultOptions", "parse", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: StackAnimationOptions.kt */
public class StackAnimationOptions implements LayoutAnimation {
    public ViewAnimationOptions bottomTabs;
    public ViewAnimationOptions content;
    private ElementTransitions elementTransitions;
    public Bool enabled;
    private SharedElements sharedElements;
    public ViewAnimationOptions topBar;
    public Bool waitForRender;

    public StackAnimationOptions() {
        this((JSONObject) null, 1, (DefaultConstructorMarker) null);
    }

    public StackAnimationOptions(JSONObject jSONObject) {
        this.enabled = new NullBool();
        this.waitForRender = new NullBool();
        this.content = new ViewAnimationOptions((JSONObject) null, 1, (DefaultConstructorMarker) null);
        this.bottomTabs = new ViewAnimationOptions((JSONObject) null, 1, (DefaultConstructorMarker) null);
        this.topBar = new ViewAnimationOptions((JSONObject) null, 1, (DefaultConstructorMarker) null);
        this.sharedElements = new SharedElements();
        this.elementTransitions = new ElementTransitions();
        parse(jSONObject);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StackAnimationOptions(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jSONObject);
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

    public final void mergeWith(StackAnimationOptions stackAnimationOptions) {
        Intrinsics.checkNotNullParameter(stackAnimationOptions, "other");
        this.topBar.mergeWith(stackAnimationOptions.topBar);
        this.content.mergeWith(stackAnimationOptions.content);
        this.bottomTabs.mergeWith(stackAnimationOptions.bottomTabs);
        getSharedElements().mergeWith(stackAnimationOptions.getSharedElements());
        getElementTransitions().mergeWith(stackAnimationOptions.getElementTransitions());
        if (stackAnimationOptions.enabled.hasValue()) {
            this.enabled = stackAnimationOptions.enabled;
        }
        if (stackAnimationOptions.waitForRender.hasValue()) {
            this.waitForRender = stackAnimationOptions.waitForRender;
        }
    }

    public final void mergeWithDefault(StackAnimationOptions stackAnimationOptions) {
        Intrinsics.checkNotNullParameter(stackAnimationOptions, "defaultOptions");
        this.content.mergeWithDefault(stackAnimationOptions.content);
        this.bottomTabs.mergeWithDefault(stackAnimationOptions.bottomTabs);
        this.topBar.mergeWithDefault(stackAnimationOptions.topBar);
        getSharedElements().mergeWithDefault(stackAnimationOptions.getSharedElements());
        getElementTransitions().mergeWithDefault(stackAnimationOptions.getElementTransitions());
        if (!this.enabled.hasValue()) {
            this.enabled = stackAnimationOptions.enabled;
        }
        if (!this.waitForRender.hasValue()) {
            this.waitForRender = stackAnimationOptions.waitForRender;
        }
    }

    public final boolean hasEnterValue() {
        return this.topBar.enter.hasValue() || this.content.enter.hasValue() || this.bottomTabs.enter.hasValue() || this.waitForRender.hasValue();
    }

    public final boolean hasExitValue() {
        return this.topBar.exit.hasValue() || this.content.exit.hasValue() || this.bottomTabs.exit.hasValue() || this.waitForRender.hasValue();
    }

    private final void parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.content = new ViewAnimationOptions(jSONObject.optJSONObject("content"));
            this.bottomTabs = new ViewAnimationOptions(jSONObject.optJSONObject("bottomTabs"));
            this.topBar = new ViewAnimationOptions(jSONObject.optJSONObject("topBar"));
            Bool parseFirst = BoolParser.parseFirst(jSONObject, ViewProps.ENABLED, "enable");
            Intrinsics.checkNotNullExpressionValue(parseFirst, "parseFirst(json, \"enabled\", \"enable\")");
            this.enabled = parseFirst;
            Bool parse = BoolParser.parse(jSONObject, "waitForRender");
            Intrinsics.checkNotNullExpressionValue(parse, "parse(json, \"waitForRender\")");
            this.waitForRender = parse;
            setSharedElements(SharedElements.Companion.parse(jSONObject));
            setElementTransitions(ElementTransitions.Companion.parse(jSONObject));
        }
    }
}
