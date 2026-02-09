package com.reactnativenavigation.options;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.params.Fraction;
import com.reactnativenavigation.options.params.ThemeColour;
import com.reactnativenavigation.options.parsers.FractionParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¨\u0006\u0006"}, d2 = {"parseShadowOptions", "Lcom/reactnativenavigation/options/ShadowOptions;", "context", "Landroid/content/Context;", "shadowJson", "Lorg/json/JSONObject;", "react-native-navigation_reactNative71Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ShadowOptions.kt */
public final class ShadowOptionsKt {
    public static final ShadowOptions parseShadowOptions(Context context, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (jSONObject == null) {
            return NullShadowOptions.INSTANCE;
        }
        ThemeColour parse = ThemeColour.Companion.parse(context, jSONObject.optJSONObject(ViewProps.COLOR));
        Fraction parse2 = FractionParser.parse(jSONObject, "radius");
        Intrinsics.checkNotNullExpressionValue(parse2, "parse(json, \"radius\")");
        Fraction parse3 = FractionParser.parse(jSONObject, ViewProps.OPACITY);
        Intrinsics.checkNotNullExpressionValue(parse3, "parse(\n                j…  \"opacity\"\n            )");
        return new ShadowOptions(parse, parse2, parse3);
    }
}
