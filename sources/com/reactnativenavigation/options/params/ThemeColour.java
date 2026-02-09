package com.reactnativenavigation.options.params;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.parsers.ColorParser;
import com.reactnativenavigation.utils.ContextKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\tJ\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/reactnativenavigation/options/params/ThemeColour;", "", "color", "Lcom/reactnativenavigation/options/params/Colour;", "(Lcom/reactnativenavigation/options/params/Colour;)V", "lightColor", "darkColor", "(Lcom/reactnativenavigation/options/params/Colour;Lcom/reactnativenavigation/options/params/Colour;)V", "canApplyValue", "", "get", "", "defaultColor", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "hasTransparency", "hasValue", "selectedColor", "Companion", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ThemeColour.kt */
public class ThemeColour {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private Colour darkColor;
    private Colour lightColor;

    @JvmStatic
    public static final ThemeColour of(int i) {
        return Companion.of(i);
    }

    @JvmStatic
    public static final ThemeColour of(int i, int i2) {
        return Companion.of(i, i2);
    }

    @JvmStatic
    public static final ThemeColour parse(Context context, JSONObject jSONObject) {
        return Companion.parse(context, jSONObject);
    }

    @JvmStatic
    public static final ThemeColour transparent() {
        return Companion.transparent();
    }

    public ThemeColour(Colour colour, Colour colour2) {
        Intrinsics.checkNotNullParameter(colour, "lightColor");
        Intrinsics.checkNotNullParameter(colour2, "darkColor");
        this.lightColor = colour;
        this.darkColor = colour2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThemeColour(Colour colour) {
        this(colour, colour);
        Intrinsics.checkNotNullParameter(colour, ViewProps.COLOR);
    }

    private final Colour selectedColor() {
        return ContextKt.isDarkMode() ? this.darkColor : this.lightColor;
    }

    public final Integer get(Integer num) {
        return (Integer) selectedColor().get(num);
    }

    public final int get() {
        Object obj = selectedColor().get();
        Intrinsics.checkNotNullExpressionValue(obj, "selectedColor().get()");
        return ((Number) obj).intValue();
    }

    public boolean hasValue() {
        return selectedColor().hasValue();
    }

    public final boolean hasTransparency() {
        return selectedColor().hasTransparency();
    }

    public final boolean canApplyValue() {
        return selectedColor().canApplyValue();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007¨\u0006\u000f"}, d2 = {"Lcom/reactnativenavigation/options/params/ThemeColour$Companion;", "", "()V", "of", "Lcom/reactnativenavigation/options/params/ThemeColour;", "color", "", "light", "dark", "parse", "context", "Landroid/content/Context;", "json", "Lorg/json/JSONObject;", "transparent", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ThemeColour.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ThemeColour of(int i) {
            return new ThemeColour(new Colour(i), new Colour(i));
        }

        @JvmStatic
        public final ThemeColour of(int i, int i2) {
            return new ThemeColour(new Colour(i), new Colour(i2));
        }

        @JvmStatic
        public final ThemeColour parse(Context context, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (jSONObject != null) {
                return new ThemeColour(ColorParser.parse(context, jSONObject, "light"), ColorParser.parse(context, jSONObject, "dark"));
            }
            return new NullThemeColour();
        }

        @JvmStatic
        public final ThemeColour transparent() {
            return of(0);
        }
    }
}
