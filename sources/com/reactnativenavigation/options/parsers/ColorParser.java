package com.reactnativenavigation.options.parsers;

import android.content.Context;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.WritableMap;
import com.reactnativenavigation.options.params.Colour;
import com.reactnativenavigation.options.params.DontApplyColour;
import com.reactnativenavigation.options.params.NullColor;
import com.reactnativenavigation.options.params.ReactPlatformColor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/reactnativenavigation/options/parsers/ColorParser;", "", "()V", "KEY_RESOURCE_PATHS", "", "VAL_NO_COLOR", "parse", "Lcom/reactnativenavigation/options/params/Colour;", "context", "Landroid/content/Context;", "json", "Lorg/json/JSONObject;", "colorName", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ColorParser.kt */
public final class ColorParser {
    public static final ColorParser INSTANCE = new ColorParser();
    private static final String KEY_RESOURCE_PATHS = "resource_paths";
    private static final String VAL_NO_COLOR = "NoColor";

    private ColorParser() {
    }

    @JvmStatic
    public static final Colour parse(Context context, JSONObject jSONObject, String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        if (jSONObject.has(KEY_RESOURCE_PATHS)) {
            WritableMap convert = JSONParser.convert(jSONObject);
            Intrinsics.checkNotNullExpressionValue(convert, "convert(json)");
            return new ReactPlatformColor(convert);
        }
        Object opt = jSONObject.opt(str);
        if (opt == null) {
            z = true;
        } else {
            z = Intrinsics.areEqual(opt, (Object) VAL_NO_COLOR);
        }
        if (z) {
            return new DontApplyColour();
        }
        if (opt instanceof Integer) {
            return new Colour(jSONObject.optInt(str));
        }
        if (!(opt instanceof JSONObject)) {
            return new NullColor();
        }
        Integer color = ColorPropConverter.getColor(opt, context);
        if (color != null) {
            return new Colour(color.intValue());
        }
        return new NullColor();
    }
}
