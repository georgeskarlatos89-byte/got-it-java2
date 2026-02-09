package com.reactnativenavigation.options;

import com.reactnativenavigation.options.params.Fraction;
import com.reactnativenavigation.options.params.ThemeColour;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/reactnativenavigation/options/NullShadowOptions;", "Lcom/reactnativenavigation/options/ShadowOptions;", "()V", "hasValue", "", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ShadowOptions.kt */
public final class NullShadowOptions extends ShadowOptions {
    public static final NullShadowOptions INSTANCE = new NullShadowOptions();

    public boolean hasValue() {
        return false;
    }

    private NullShadowOptions() {
        super((ThemeColour) null, (Fraction) null, (Fraction) null, 7, (DefaultConstructorMarker) null);
    }
}
