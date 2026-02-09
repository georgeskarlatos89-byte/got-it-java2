package com.reactnativenavigation.options.layout;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.LayoutDirection;
import com.reactnativenavigation.options.OrientationOptions;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.options.params.NullBool;
import com.reactnativenavigation.options.params.NullNumber;
import com.reactnativenavigation.options.params.NullThemeColour;
import com.reactnativenavigation.options.params.Number;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.options.parsers.BoolParser;
import com.reactnativenavigation.options.parsers.NumberParser;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0000J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0000R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/reactnativenavigation/options/layout/LayoutOptions;", "", "()V", "adjustResize", "Lcom/reactnativenavigation/options/params/Bool;", "backgroundColor", "Lcom/reactnativenavigation/options/params/ThemeColour;", "componentBackgroundColor", "direction", "Lcom/reactnativenavigation/options/LayoutDirection;", "insets", "Lcom/reactnativenavigation/options/layout/LayoutInsets;", "getInsets", "()Lcom/reactnativenavigation/options/layout/LayoutInsets;", "setInsets", "(Lcom/reactnativenavigation/options/layout/LayoutInsets;)V", "orientation", "Lcom/reactnativenavigation/options/OrientationOptions;", "topMargin", "Lcom/reactnativenavigation/options/params/Number;", "mergeWith", "", "other", "mergeWithDefault", "defaultOptions", "Companion", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LayoutOptions.kt */
public final class LayoutOptions {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public Bool adjustResize = new NullBool();
    public ThemeColour backgroundColor = new NullThemeColour();
    public ThemeColour componentBackgroundColor = new NullThemeColour();
    public LayoutDirection direction = LayoutDirection.DEFAULT;
    private LayoutInsets insets = new LayoutInsets((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    public OrientationOptions orientation = new OrientationOptions();
    public Number topMargin = new NullNumber();

    @JvmStatic
    public static final LayoutOptions parse(Context context, JSONObject jSONObject) {
        return Companion.parse(context, jSONObject);
    }

    public final LayoutInsets getInsets() {
        return this.insets;
    }

    public final void setInsets(LayoutInsets layoutInsets) {
        Intrinsics.checkNotNullParameter(layoutInsets, "<set-?>");
        this.insets = layoutInsets;
    }

    public final void mergeWith(LayoutOptions layoutOptions) {
        Intrinsics.checkNotNullParameter(layoutOptions, "other");
        if (layoutOptions.backgroundColor.hasValue()) {
            this.backgroundColor = layoutOptions.backgroundColor;
        }
        if (layoutOptions.componentBackgroundColor.hasValue()) {
            this.componentBackgroundColor = layoutOptions.componentBackgroundColor;
        }
        if (layoutOptions.topMargin.hasValue()) {
            this.topMargin = layoutOptions.topMargin;
        }
        if (layoutOptions.orientation.hasValue()) {
            this.orientation = layoutOptions.orientation;
        }
        if (layoutOptions.direction.hasValue()) {
            this.direction = layoutOptions.direction;
        }
        if (layoutOptions.adjustResize.hasValue()) {
            this.adjustResize = layoutOptions.adjustResize;
        }
        this.insets.merge(layoutOptions.insets, (LayoutInsets) null);
    }

    public final void mergeWithDefault(LayoutOptions layoutOptions) {
        Intrinsics.checkNotNullParameter(layoutOptions, "defaultOptions");
        if (!this.backgroundColor.hasValue()) {
            this.backgroundColor = layoutOptions.backgroundColor;
        }
        if (!this.componentBackgroundColor.hasValue()) {
            this.componentBackgroundColor = layoutOptions.componentBackgroundColor;
        }
        if (!this.topMargin.hasValue()) {
            this.topMargin = layoutOptions.topMargin;
        }
        if (!this.orientation.hasValue()) {
            this.orientation = layoutOptions.orientation;
        }
        if (!this.direction.hasValue()) {
            this.direction = layoutOptions.direction;
        }
        if (!this.adjustResize.hasValue()) {
            this.adjustResize = layoutOptions.adjustResize;
        }
        this.insets.merge((LayoutInsets) null, layoutOptions.insets);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lcom/reactnativenavigation/options/layout/LayoutOptions$Companion;", "", "()V", "parse", "Lcom/reactnativenavigation/options/layout/LayoutOptions;", "context", "Landroid/content/Context;", "json", "Lorg/json/JSONObject;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: LayoutOptions.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LayoutOptions parse(Context context, JSONObject jSONObject) {
            LayoutOptions layoutOptions = new LayoutOptions();
            if (jSONObject == null) {
                return layoutOptions;
            }
            ThemeColour.Companion companion = ThemeColour.Companion;
            Intrinsics.checkNotNull(context);
            layoutOptions.backgroundColor = companion.parse(context, jSONObject.optJSONObject(ViewProps.BACKGROUND_COLOR));
            layoutOptions.componentBackgroundColor = ThemeColour.Companion.parse(context, jSONObject.optJSONObject("componentBackgroundColor"));
            Number parse = NumberParser.parse(jSONObject, "topMargin");
            Intrinsics.checkNotNullExpressionValue(parse, "parse(json, \"topMargin\")");
            layoutOptions.topMargin = parse;
            layoutOptions.setInsets(LayoutInsets.Companion.parse(jSONObject.optJSONObject("insets")));
            OrientationOptions parse2 = OrientationOptions.parse(jSONObject);
            Intrinsics.checkNotNullExpressionValue(parse2, "parse(json)");
            layoutOptions.orientation = parse2;
            LayoutDirection fromString = LayoutDirection.fromString(jSONObject.optString("direction", ""));
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(json.optString(\"direction\", \"\"))");
            layoutOptions.direction = fromString;
            Bool parse3 = BoolParser.parse(jSONObject, "adjustResize");
            Intrinsics.checkNotNullExpressionValue(parse3, "parse(json, \"adjustResize\")");
            layoutOptions.adjustResize = parse3;
            return layoutOptions;
        }
    }
}
