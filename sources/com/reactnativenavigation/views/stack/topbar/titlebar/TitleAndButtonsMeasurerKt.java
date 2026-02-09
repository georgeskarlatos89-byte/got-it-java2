package com.reactnativenavigation.views.stack.topbar.titlebar;

import android.content.res.Resources;
import android.view.View;
import com.reactnativenavigation.utils.UiUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a&\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b\u001aJ\u0010\f\u001a\u0016\u0012\b\u0012\u00060\u0003j\u0002`\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b\u001a*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000b\u001a*\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000b\u001a*\u0010\u0016\u001a\u0016\u0012\b\u0012\u00060\u0003j\u0002`\u0017\u0012\b\u0012\u00060\u0003j\u0002`\u00180\r2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005*\n\u0010\u001b\"\u00020\u00032\u00020\u0003*\n\u0010\u001c\"\u00020\u00032\u00020\u0003*\n\u0010\u001d\"\u00020\u00032\u00020\u0003*\n\u0010\u001e\"\u00020\u00032\u00020\u0003¨\u0006\u001f"}, d2 = {"DEFAULT_LEFT_MARGIN_DP", "", "DEFAULT_LEFT_MARGIN_PX", "", "getDEFAULT_LEFT_MARGIN_PX", "()I", "makeTitleAtMostWidthMeasureSpec", "containerWidth", "rightBarWidth", "leftBarWidth", "isCenter", "", "resolveHorizontalTitleBoundsLimit", "Lkotlin/Pair;", "Lcom/reactnativenavigation/views/stack/topbar/titlebar/TitleLeft;", "Lcom/reactnativenavigation/views/stack/topbar/titlebar/TitleRight;", "parentWidth", "titleWidth", "isRTL", "resolveLeftButtonsBounds", "barWidth", "resolveRightButtonsBounds", "resolveVerticalTitleBoundsLimit", "Lcom/reactnativenavigation/views/stack/topbar/titlebar/TitleTop;", "Lcom/reactnativenavigation/views/stack/topbar/titlebar/TitleBottom;", "parentHeight", "titleHeight", "TitleBottom", "TitleLeft", "TitleRight", "TitleTop", "react-native-navigation_reactNative71Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TitleAndButtonsMeasurer.kt */
public final class TitleAndButtonsMeasurerKt {
    public static final float DEFAULT_LEFT_MARGIN_DP = 16.0f;
    private static final int DEFAULT_LEFT_MARGIN_PX = ((int) UiUtils.dpToPx(Resources.getSystem().getDisplayMetrics(), 16.0f));

    public static final int getDEFAULT_LEFT_MARGIN_PX() {
        return DEFAULT_LEFT_MARGIN_PX;
    }

    public static final int makeTitleAtMostWidthMeasureSpec(int i, int i2, int i3, boolean z) {
        if (z) {
            return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(((i - i2) - i3) - (DEFAULT_LEFT_MARGIN_PX * 2), Integer.MIN_VALUE);
    }

    public static final Pair<Integer, Integer> resolveVerticalTitleBoundsLimit(int i, int i2) {
        float f = ((float) i) / 2.0f;
        float f2 = ((float) i2) / 2.0f;
        return TuplesKt.to(Integer.valueOf(MathKt.roundToInt(f - f2)), Integer.valueOf(MathKt.roundToInt(f + f2)));
    }

    public static final Pair<Integer, Integer> resolveHorizontalTitleBoundsLimit(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = z2 ? i4 : i3;
        if (!z2) {
            i3 = i4;
        }
        int i10 = i - i3;
        if (!z) {
            if (z2) {
                int i11 = DEFAULT_LEFT_MARGIN_PX;
                i7 = Math.max(i9 + i11, i10 - i11);
                i8 = Math.max(i9 + i11, (i7 - i2) - i11);
            } else {
                int i12 = DEFAULT_LEFT_MARGIN_PX;
                int min = Math.min(i9 + i12, i - i12);
                i7 = Math.min(i10 - i12, i2 + min + i12);
                i8 = min;
            }
            i5 = Math.max(0, i8);
            i6 = Math.min(i, i7);
        } else if (i2 >= (i - i9) - i3) {
            return TuplesKt.to(Integer.valueOf(i9), Integer.valueOf(i10));
        } else {
            i5 = Math.max((i / 2) - (i2 / 2), 0);
            i6 = Math.min(i2 + i5, i);
            int max = Math.max(Math.max(i9 - i5, 0), Math.max(i6 - i10, 0));
            if (max > 0) {
                i5 += max;
                i6 -= max;
            }
        }
        return TuplesKt.to(Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static final Pair<Integer, Integer> resolveLeftButtonsBounds(int i, int i2, boolean z) {
        if (z) {
            return TuplesKt.to(Integer.valueOf(Math.max(0, i - i2)), Integer.valueOf(i));
        }
        return TuplesKt.to(0, Integer.valueOf(Math.min(i2, i)));
    }

    public static final Pair<Integer, Integer> resolveRightButtonsBounds(int i, int i2, boolean z) {
        return resolveLeftButtonsBounds(i, i2, !z);
    }
}
