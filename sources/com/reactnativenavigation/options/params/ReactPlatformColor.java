package com.reactnativenavigation.options.params;

import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/reactnativenavigation/options/params/ReactPlatformColor;", "Lcom/reactnativenavigation/options/params/Colour;", "paths", "Lcom/facebook/react/bridge/ReadableMap;", "(Lcom/facebook/react/bridge/ReadableMap;)V", "get", "", "()Ljava/lang/Integer;", "defaultValue", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ReactPlatformColor.kt */
public final class ReactPlatformColor extends Colour {
    private final ReadableMap paths;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReactPlatformColor(com.facebook.react.bridge.ReadableMap r3) {
        /*
            r2 = this;
            java.lang.String r0 = "paths"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Integer r0 = com.reactnativenavigation.options.params.ReactPlatformColorKt.parsePlatformColor(r3)
            java.lang.String r1 = "parsePlatformColor(paths)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.<init>(r0)
            r2.paths = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.options.params.ReactPlatformColor.<init>(com.facebook.react.bridge.ReadableMap):void");
    }

    public Integer get() {
        Integer access$parsePlatformColor = ReactPlatformColorKt.parsePlatformColor(this.paths);
        Intrinsics.checkNotNullExpressionValue(access$parsePlatformColor, "parsePlatformColor(paths)");
        return access$parsePlatformColor;
    }

    public Integer get(Integer num) {
        try {
            return ReactPlatformColorKt.parsePlatformColor(this.paths);
        } catch (Exception unused) {
            return num;
        }
    }
}
