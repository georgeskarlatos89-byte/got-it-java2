package com.reactnativenavigation.options;

import com.facebook.react.uimanager.ViewProps;
import com.reactnativenavigation.options.params.Fraction;
import com.reactnativenavigation.options.params.NullFraction;
import com.reactnativenavigation.options.params.NullThemeColour;
import com.reactnativenavigation.options.params.ThemeColour;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0000J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000J\u0010\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/reactnativenavigation/options/ShadowOptions;", "", "color", "Lcom/reactnativenavigation/options/params/ThemeColour;", "radius", "Lcom/reactnativenavigation/options/params/Fraction;", "opacity", "(Lcom/reactnativenavigation/options/params/ThemeColour;Lcom/reactnativenavigation/options/params/Fraction;Lcom/reactnativenavigation/options/params/Fraction;)V", "getColor", "()Lcom/reactnativenavigation/options/params/ThemeColour;", "setColor", "(Lcom/reactnativenavigation/options/params/ThemeColour;)V", "getOpacity", "()Lcom/reactnativenavigation/options/params/Fraction;", "setOpacity", "(Lcom/reactnativenavigation/options/params/Fraction;)V", "getRadius", "setRadius", "copy", "hasValue", "", "mergeWith", "other", "mergeWithDefaults", "defaultOptions", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ShadowOptions.kt */
public class ShadowOptions {
    private ThemeColour color;
    private Fraction opacity;
    private Fraction radius;

    public ShadowOptions() {
        this((ThemeColour) null, (Fraction) null, (Fraction) null, 7, (DefaultConstructorMarker) null);
    }

    public ShadowOptions(ThemeColour themeColour, Fraction fraction, Fraction fraction2) {
        Intrinsics.checkNotNullParameter(themeColour, ViewProps.COLOR);
        Intrinsics.checkNotNullParameter(fraction, "radius");
        Intrinsics.checkNotNullParameter(fraction2, ViewProps.OPACITY);
        this.color = themeColour;
        this.radius = fraction;
        this.opacity = fraction2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShadowOptions(ThemeColour themeColour, Fraction fraction, Fraction fraction2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new NullThemeColour() : themeColour, (i & 2) != 0 ? new NullFraction() : fraction, (i & 4) != 0 ? new NullFraction() : fraction2);
    }

    public final ThemeColour getColor() {
        return this.color;
    }

    public final Fraction getOpacity() {
        return this.opacity;
    }

    public final Fraction getRadius() {
        return this.radius;
    }

    public final void setColor(ThemeColour themeColour) {
        Intrinsics.checkNotNullParameter(themeColour, "<set-?>");
        this.color = themeColour;
    }

    public final void setOpacity(Fraction fraction) {
        Intrinsics.checkNotNullParameter(fraction, "<set-?>");
        this.opacity = fraction;
    }

    public final void setRadius(Fraction fraction) {
        Intrinsics.checkNotNullParameter(fraction, "<set-?>");
        this.radius = fraction;
    }

    public final ShadowOptions copy() {
        return new ShadowOptions(this.color, this.radius, this.opacity);
    }

    public final ShadowOptions mergeWith(ShadowOptions shadowOptions) {
        Intrinsics.checkNotNullParameter(shadowOptions, "other");
        if (shadowOptions.color.hasValue()) {
            this.color = shadowOptions.color;
        }
        if (shadowOptions.opacity.hasValue()) {
            this.opacity = shadowOptions.opacity;
        }
        if (shadowOptions.radius.hasValue()) {
            this.radius = shadowOptions.radius;
        }
        return this;
    }

    public static /* synthetic */ ShadowOptions mergeWithDefaults$default(ShadowOptions shadowOptions, ShadowOptions shadowOptions2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                shadowOptions2 = NullShadowOptions.INSTANCE;
            }
            return shadowOptions.mergeWithDefaults(shadowOptions2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeWithDefaults");
    }

    public final ShadowOptions mergeWithDefaults(ShadowOptions shadowOptions) {
        Intrinsics.checkNotNullParameter(shadowOptions, "defaultOptions");
        if (!this.color.hasValue()) {
            this.color = shadowOptions.color;
        }
        if (!this.opacity.hasValue()) {
            this.opacity = shadowOptions.opacity;
        }
        if (!this.radius.hasValue()) {
            this.radius = shadowOptions.radius;
        }
        return this;
    }

    public boolean hasValue() {
        return this.color.hasValue() || this.radius.hasValue() || this.opacity.hasValue();
    }
}
