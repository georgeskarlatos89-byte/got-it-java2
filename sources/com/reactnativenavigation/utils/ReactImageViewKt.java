package com.reactnativenavigation.utils;

import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.react.views.image.ReactImageView;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getCornerRadius", "", "Lcom/facebook/react/views/image/ReactImageView;", "react-native-navigation_reactNative71Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ReactImageView.kt */
public final class ReactImageViewKt {
    public static final float getCornerRadius(ReactImageView reactImageView) {
        Intrinsics.checkNotNullParameter(reactImageView, "<this>");
        RoundingParams roundingParams = ((GenericDraweeHierarchy) reactImageView.getHierarchy()).getRoundingParams();
        Intrinsics.checkNotNull(roundingParams);
        float[] cornersRadii = roundingParams.getCornersRadii();
        Intrinsics.checkNotNull(cornersRadii);
        return ArraysKt.first(cornersRadii);
    }
}
