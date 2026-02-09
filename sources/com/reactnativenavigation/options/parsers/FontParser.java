package com.reactnativenavigation.options.parsers;

import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.FontOptions;
import com.reactnativenavigation.options.params.Text;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/reactnativenavigation/options/parsers/FontParser;", "", "()V", "Companion", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FontParser.kt */
public final class FontParser {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @JvmStatic
    public static final FontOptions parse(JSONObject jSONObject) {
        return Companion.parse(jSONObject);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/reactnativenavigation/options/parsers/FontParser$Companion;", "", "()V", "parse", "Lcom/reactnativenavigation/options/FontOptions;", "title", "Lorg/json/JSONObject;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FontParser.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FontOptions parse(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "title");
            FontOptions fontOptions = new FontOptions();
            Text parse = TextParser.parse(jSONObject, ViewProps.FONT_FAMILY);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(title, \"fontFamily\")");
            fontOptions.setFontFamily(parse);
            Text parse2 = TextParser.parse(jSONObject, ViewProps.FONT_STYLE);
            Intrinsics.checkNotNullExpressionValue(parse2, "parse(title, \"fontStyle\")");
            fontOptions.setFontStyle(parse2);
            Text parse3 = TextParser.parse(jSONObject, ViewProps.FONT_WEIGHT);
            Intrinsics.checkNotNullExpressionValue(parse3, "parse(title, \"fontWeight\")");
            fontOptions.setFontWeight(parse3);
            return fontOptions;
        }
    }
}
