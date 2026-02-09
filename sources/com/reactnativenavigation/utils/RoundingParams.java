package com.reactnativenavigation.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/reactnativenavigation/utils/RoundingParams;", "", "()V", "Companion", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RoundingParams.kt */
public final class RoundingParams {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/reactnativenavigation/utils/RoundingParams$Companion;", "", "()V", "fromCornersRadii", "Lcom/facebook/drawee/generic/RoundingParams;", "radius", "", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: RoundingParams.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.facebook.drawee.generic.RoundingParams fromCornersRadii(float f) {
            float[] fArr = new float[8];
            for (int i = 0; i < 8; i++) {
                fArr[i] = f;
            }
            com.facebook.drawee.generic.RoundingParams fromCornersRadii = com.facebook.drawee.generic.RoundingParams.fromCornersRadii(fArr);
            Intrinsics.checkNotNullExpressionValue(fromCornersRadii, "fromCornersRadii(FloatArray(8) { radius })");
            return fromCornersRadii;
        }
    }
}
