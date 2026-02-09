package com.cardinalcommerce.a;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import com.cardinalcommerce.cardinalmobilesdk.R;
import com.cardinalcommerce.shared.models.enums.ButtonType;
import com.cardinalcommerce.shared.userinterfaces.LabelCustomization;
import com.cardinalcommerce.shared.userinterfaces.TextBoxCustomization;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import kotlin.text.Typography;

public final class setVerticalFadingEdgeEnabled {
    private static int Cardinal = 0;
    private static int cca_continue = 1;
    private static final setTranslationY init = setTranslationY.cca_continue();

    static {
        int i = Cardinal;
        int i2 = (i ^ 106) + ((i & 106) << 1);
        int i3 = (i2 & -1) + (i2 | -1);
        cca_continue = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if ((r7.getTextColor() != null) != true) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        if ((r7.getTextColor() != null ? '4' : 17) != 17) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void init(com.cardinalcommerce.a.setBottom r6, com.cardinalcommerce.shared.userinterfaces.ButtonCustomization r7, android.app.Activity r8) {
        /*
            int r0 = Cardinal
            int r0 = r0 + 84
            r1 = r0 | -1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 ^ -1
            int r1 = r1 - r0
            int r0 = r1 % 128
            cca_continue = r0
            int r1 = r1 % 2
            r0 = 0
            if (r1 != 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            if (r1 == 0) goto L_0x002a
            java.lang.String r1 = r7.getTextColor()
            r3 = 35
            int r3 = r3 / r0
            if (r1 == 0) goto L_0x0024
            r1 = r2
            goto L_0x0025
        L_0x0024:
            r1 = r0
        L_0x0025:
            if (r1 == r2) goto L_0x0038
            goto L_0x005d
        L_0x0028:
            r6 = move-exception
            throw r6
        L_0x002a:
            java.lang.String r1 = r7.getTextColor()
            r3 = 17
            if (r1 == 0) goto L_0x0035
            r1 = 52
            goto L_0x0036
        L_0x0035:
            r1 = r3
        L_0x0036:
            if (r1 == r3) goto L_0x005d
        L_0x0038:
            java.lang.String r1 = r7.getTextColor()
            int r1 = android.graphics.Color.parseColor(r1)
            r6.setTextColor(r1)
            int r1 = Cardinal
            r3 = r1 ^ 61
            r4 = r1 & 61
            r3 = r3 | r4
            int r3 = r3 << r2
            r4 = r1 & -62
            int r1 = ~r1
            r1 = r1 & 61
            r1 = r1 | r4
            int r1 = -r1
            r4 = r3 | r1
            int r4 = r4 << r2
            r1 = r1 ^ r3
            int r4 = r4 - r1
            int r1 = r4 % 128
            cca_continue = r1
            int r4 = r4 % 2
        L_0x005d:
            int r1 = r7.getTextFontSize()
            r3 = 99
            if (r1 <= 0) goto L_0x0067
            r1 = r3
            goto L_0x0069
        L_0x0067:
            r1 = 88
        L_0x0069:
            r4 = 0
            if (r1 == r3) goto L_0x006d
            goto L_0x008c
        L_0x006d:
            int r1 = Cardinal
            r3 = r1 | 112(0x70, float:1.57E-43)
            int r3 = r3 << r2
            r1 = r1 ^ 112(0x70, float:1.57E-43)
            int r3 = r3 - r1
            int r3 = r3 - r0
            int r3 = r3 - r2
            int r1 = r3 % 128
            cca_continue = r1
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0081
            r1 = r2
            goto L_0x0082
        L_0x0081:
            r1 = r0
        L_0x0082:
            if (r1 != 0) goto L_0x0180
            int r1 = r7.getTextFontSize()
            float r1 = (float) r1
            r6.setTextSize(r1)
        L_0x008c:
            java.lang.String r1 = r7.getTextFontName()
            if (r1 == 0) goto L_0x0094
            r1 = r2
            goto L_0x0095
        L_0x0094:
            r1 = r0
        L_0x0095:
            if (r1 == 0) goto L_0x00db
            int r1 = cca_continue
            r3 = r1 | 37
            int r3 = r3 << r2
            r5 = r1 & -38
            int r1 = ~r1
            r1 = r1 & 37
            r1 = r1 | r5
            int r1 = -r1
            r5 = r3 & r1
            r1 = r1 | r3
            int r5 = r5 + r1
            int r1 = r5 % 128
            Cardinal = r1
            int r5 = r5 % 2
            java.lang.String r1 = r7.getTextFontName()
            android.graphics.Typeface r8 = configure(r1, r8)
            if (r8 == 0) goto L_0x00b9
            r1 = r0
            goto L_0x00ba
        L_0x00b9:
            r1 = r2
        L_0x00ba:
            if (r1 == 0) goto L_0x00bd
            goto L_0x00db
        L_0x00bd:
            int r1 = cca_continue
            r3 = r1 & 9
            r1 = r1 | 9
            int r3 = r3 + r1
            int r1 = r3 % 128
            Cardinal = r1
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x00ce
            r1 = r0
            goto L_0x00cf
        L_0x00ce:
            r1 = r2
        L_0x00cf:
            r6.setTypeface(r8)
            if (r1 == 0) goto L_0x00d5
            goto L_0x00db
        L_0x00d5:
            super.hashCode()     // Catch:{ all -> 0x00d9 }
            throw r4     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r6 = move-exception
            throw r6
        L_0x00db:
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            java.lang.String r1 = r7.getBackgroundColor()
            if (r1 == 0) goto L_0x00e8
            r1 = r2
            goto L_0x00e9
        L_0x00e8:
            r1 = r0
        L_0x00e9:
            if (r1 == 0) goto L_0x011e
            int r1 = Cardinal
            r3 = r1 ^ 49
            r4 = r1 & 49
            r3 = r3 | r4
            int r3 = r3 << r2
            int r4 = ~r4
            r1 = r1 | 49
            r1 = r1 & r4
            int r1 = -r1
            r4 = r3 ^ r1
            r1 = r1 & r3
            int r1 = r1 << r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            cca_continue = r1
            int r4 = r4 % 2
            java.lang.String r1 = r7.getBackgroundColor()
            int r1 = android.graphics.Color.parseColor(r1)
            r8.setColor(r1)
            int r1 = cca_continue
            r3 = r1 & 121(0x79, float:1.7E-43)
            int r4 = ~r3
            r1 = r1 | 121(0x79, float:1.7E-43)
            r1 = r1 & r4
            int r3 = r3 << r2
            int r1 = r1 + r3
            int r3 = r1 % 128
            Cardinal = r3
            int r1 = r1 % 2
        L_0x011e:
            int r1 = r7.getCornerRadius()
            r3 = 66
            if (r1 <= 0) goto L_0x0129
            r1 = 16
            goto L_0x012a
        L_0x0129:
            r1 = r3
        L_0x012a:
            if (r1 == r3) goto L_0x0156
            int r1 = cca_continue
            r3 = r1 | 73
            int r3 = r3 << r2
            r1 = r1 ^ 73
            int r3 = r3 - r1
            int r1 = r3 % 128
            Cardinal = r1
            int r3 = r3 % 2
            int r7 = r7.getCornerRadius()
            float r7 = (float) r7
            r8.setCornerRadius(r7)
            int r7 = cca_continue
            r1 = r7 & 109(0x6d, float:1.53E-43)
            int r3 = ~r1
            r7 = r7 | 109(0x6d, float:1.53E-43)
            r7 = r7 & r3
            int r1 = r1 << r2
            r3 = r7 ^ r1
            r7 = r7 & r1
            int r7 = r7 << r2
            int r3 = r3 + r7
            int r7 = r3 % 128
            Cardinal = r7
            int r3 = r3 % 2
        L_0x0156:
            r6.setBackground(r8)
            int r6 = cca_continue
            r7 = r6 & -44
            int r8 = ~r6
            r1 = 43
            r8 = r8 & r1
            r7 = r7 | r8
            r6 = r6 & r1
            int r6 = r6 << r2
            int r6 = -r6
            int r6 = -r6
            int r6 = ~r6
            int r7 = r7 - r6
            int r7 = r7 - r2
            int r6 = r7 % 128
            Cardinal = r6
            int r7 = r7 % 2
            r6 = 45
            if (r7 == 0) goto L_0x0175
            r7 = r6
            goto L_0x0177
        L_0x0175:
            r7 = 13
        L_0x0177:
            if (r7 == r6) goto L_0x017a
            return
        L_0x017a:
            r6 = 74
            int r6 = r6 / r0
            return
        L_0x017e:
            r6 = move-exception
            throw r6
        L_0x0180:
            int r7 = r7.getTextFontSize()
            float r7 = (float) r7
            r6.setTextSize(r7)
            throw r4     // Catch:{ all -> 0x0189 }
        L_0x0189:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setVerticalFadingEdgeEnabled.init(com.cardinalcommerce.a.setBottom, com.cardinalcommerce.shared.userinterfaces.ButtonCustomization, android.app.Activity):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r3 != true) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r3 != false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void init(com.cardinalcommerce.a.setAnimationMatrix r4, com.cardinalcommerce.shared.userinterfaces.UiCustomization r5, android.app.Activity r6) {
        /*
            int r0 = cca_continue
            r1 = r0 ^ 21
            r0 = r0 & 21
            r0 = r0 | r1
            r2 = 1
            int r0 = r0 << r2
            int r1 = -r1
            r3 = r0 | r1
            int r3 = r3 << r2
            r0 = r0 ^ r1
            int r3 = r3 - r0
            int r0 = r3 % 128
            Cardinal = r0
            int r3 = r3 % 2
            r1 = 46
            if (r4 == 0) goto L_0x001b
            r3 = r1
            goto L_0x001d
        L_0x001b:
            r3 = 24
        L_0x001d:
            if (r3 == r1) goto L_0x0020
            goto L_0x007a
        L_0x0020:
            r1 = r0 ^ 51
            r3 = r0 & 51
            r1 = r1 | r3
            int r1 = r1 << r2
            int r3 = ~r3
            r0 = r0 | 51
            r0 = r0 & r3
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r2
            int r0 = r1 % 128
            cca_continue = r0
            int r1 = r1 % 2
            r0 = 83
            if (r1 != 0) goto L_0x003b
            r1 = 28
            goto L_0x003c
        L_0x003b:
            r1 = r0
        L_0x003c:
            r3 = 0
            if (r1 == r0) goto L_0x0051
            com.cardinalcommerce.shared.models.enums.ButtonType r0 = com.cardinalcommerce.shared.models.enums.ButtonType.CANCEL
            com.cardinalcommerce.shared.userinterfaces.ButtonCustomization r0 = r5.getButtonCustomization((com.cardinalcommerce.shared.models.enums.ButtonType) r0)
            r1 = 8
            int r1 = r1 / r3
            if (r0 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r3 = r2
        L_0x004c:
            if (r3 == r2) goto L_0x007a
            goto L_0x005e
        L_0x004f:
            r4 = move-exception
            throw r4
        L_0x0051:
            com.cardinalcommerce.shared.models.enums.ButtonType r0 = com.cardinalcommerce.shared.models.enums.ButtonType.CANCEL
            com.cardinalcommerce.shared.userinterfaces.ButtonCustomization r0 = r5.getButtonCustomization((com.cardinalcommerce.shared.models.enums.ButtonType) r0)
            if (r0 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r3 = r2
        L_0x005b:
            if (r3 == 0) goto L_0x005e
            goto L_0x007a
        L_0x005e:
            com.cardinalcommerce.shared.models.enums.ButtonType r0 = com.cardinalcommerce.shared.models.enums.ButtonType.CANCEL
            com.cardinalcommerce.shared.userinterfaces.ButtonCustomization r5 = r5.getButtonCustomization((com.cardinalcommerce.shared.models.enums.ButtonType) r0)
            Cardinal((com.cardinalcommerce.a.setAnimationMatrix) r4, (com.cardinalcommerce.shared.userinterfaces.ButtonCustomization) r5, (android.app.Activity) r6)
            int r4 = Cardinal
            r5 = r4 | 73
            int r5 = r5 << r2
            r4 = r4 ^ 73
            int r4 = -r4
            r6 = r5 ^ r4
            r4 = r4 & r5
            int r4 = r4 << r2
            int r6 = r6 + r4
            int r4 = r6 % 128
            cca_continue = r4
            int r6 = r6 % 2
        L_0x007a:
            int r4 = cca_continue
            r5 = r4 & -66
            int r6 = ~r4
            r0 = 65
            r6 = r6 & r0
            r5 = r5 | r6
            r4 = r4 & r0
            int r4 = r4 << r2
            r6 = r5 ^ r4
            r4 = r4 & r5
            int r4 = r4 << r2
            int r6 = r6 + r4
            int r4 = r6 % 128
            Cardinal = r4
            int r6 = r6 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setVerticalFadingEdgeEnabled.init(com.cardinalcommerce.a.setAnimationMatrix, com.cardinalcommerce.shared.userinterfaces.UiCustomization, android.app.Activity):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        if ((r7 != null) != true) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        if (r4 != '9') goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void Cardinal(com.cardinalcommerce.a.setAnimationMatrix r5, com.cardinalcommerce.shared.userinterfaces.ButtonCustomization r6, android.app.Activity r7) {
        /*
            int r0 = Cardinal
            r1 = r0 & 89
            r0 = r0 | 89
            int r1 = r1 + r0
            int r0 = r1 % 128
            cca_continue = r0
            int r1 = r1 % 2
            java.lang.String r0 = r6.getTextColor()
            r1 = 62
            if (r0 == 0) goto L_0x0017
            r0 = r1
            goto L_0x0019
        L_0x0017:
            r0 = 82
        L_0x0019:
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001e
            goto L_0x005a
        L_0x001e:
            int r0 = cca_continue
            int r0 = r0 + 6
            int r0 = r0 - r3
            int r1 = r0 % 128
            Cardinal = r1
            int r0 = r0 % 2
            r1 = 99
            if (r0 == 0) goto L_0x0030
            r0 = 45
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            if (r0 == r1) goto L_0x0044
            java.lang.String r0 = r6.getTextColor()
            int r0 = android.graphics.Color.parseColor(r0)
            r5.setTextColor(r0)
            r0 = 66
            int r0 = r0 / r2
            goto L_0x004f
        L_0x0042:
            r5 = move-exception
            throw r5
        L_0x0044:
            java.lang.String r0 = r6.getTextColor()
            int r0 = android.graphics.Color.parseColor(r0)
            r5.setTextColor(r0)
        L_0x004f:
            int r0 = cca_continue
            int r0 = r0 + 48
            int r0 = r0 - r3
            int r1 = r0 % 128
            Cardinal = r1
            int r0 = r0 % 2
        L_0x005a:
            int r0 = r6.getTextFontSize()
            r1 = 34
            r4 = 67
            if (r0 <= 0) goto L_0x0066
            r0 = r1
            goto L_0x0067
        L_0x0066:
            r0 = r4
        L_0x0067:
            if (r0 == r1) goto L_0x006a
            goto L_0x0093
        L_0x006a:
            int r0 = cca_continue
            r1 = r0 ^ 92
            r0 = r0 & 92
            int r0 = r0 << r3
            int r1 = r1 + r0
            r0 = r1 & -1
            r1 = r1 | -1
            int r0 = r0 + r1
            int r1 = r0 % 128
            Cardinal = r1
            int r0 = r0 % 2
            int r0 = r6.getTextFontSize()
            float r0 = (float) r0
            r5.setTextSize(r0)
            int r0 = cca_continue
            r1 = r0 | 89
            int r1 = r1 << r3
            r0 = r0 ^ 89
            int r1 = r1 - r0
            int r0 = r1 % 128
            Cardinal = r0
            int r1 = r1 % 2
        L_0x0093:
            java.lang.String r0 = r6.getTextFontName()
            if (r0 == 0) goto L_0x009b
            r0 = r2
            goto L_0x009c
        L_0x009b:
            r0 = r3
        L_0x009c:
            if (r0 == 0) goto L_0x009f
            goto L_0x00ec
        L_0x009f:
            int r0 = cca_continue
            r1 = r0 & 65
            r0 = r0 ^ 65
            r0 = r0 | r1
            int r1 = r1 + r0
            int r0 = r1 % 128
            Cardinal = r0
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x00b1
            r0 = r3
            goto L_0x00b2
        L_0x00b1:
            r0 = r2
        L_0x00b2:
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = r6.getTextFontName()
            android.graphics.Typeface r7 = configure(r0, r7)
            r0 = 66
            int r0 = r0 / r2
            if (r7 == 0) goto L_0x00c3
            r0 = r3
            goto L_0x00c4
        L_0x00c3:
            r0 = r2
        L_0x00c4:
            if (r0 == r3) goto L_0x00d9
            goto L_0x00ec
        L_0x00c7:
            r5 = move-exception
            throw r5
        L_0x00c9:
            java.lang.String r0 = r6.getTextFontName()
            android.graphics.Typeface r7 = configure(r0, r7)
            r0 = 57
            if (r7 == 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r4 = r0
        L_0x00d7:
            if (r4 == r0) goto L_0x00ec
        L_0x00d9:
            r5.setTypeface(r7)
            int r7 = cca_continue
            r0 = r7 & 19
            int r1 = ~r0
            r7 = r7 | 19
            r7 = r7 & r1
            int r0 = r0 << r3
            int r7 = r7 + r0
            int r0 = r7 % 128
            Cardinal = r0
            int r7 = r7 % 2
        L_0x00ec:
            java.lang.String r7 = "#00FF0000"
            int r7 = android.graphics.Color.parseColor(r7)
            r5.setBackgroundColor(r7)
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            java.lang.String r0 = r6.getBackgroundColor()
            if (r0 == 0) goto L_0x0102
            r0 = r2
            goto L_0x0103
        L_0x0102:
            r0 = r3
        L_0x0103:
            if (r0 == 0) goto L_0x0106
            goto L_0x013f
        L_0x0106:
            int r0 = Cardinal
            r1 = r0 | 3
            int r1 = r1 << r3
            r0 = r0 ^ 3
            int r1 = r1 - r0
            int r0 = r1 % 128
            cca_continue = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0118
            r0 = r3
            goto L_0x0119
        L_0x0118:
            r0 = r2
        L_0x0119:
            if (r0 == r3) goto L_0x0127
            java.lang.String r0 = r6.getBackgroundColor()
            int r0 = android.graphics.Color.parseColor(r0)
            r7.setColor(r0)
            goto L_0x0135
        L_0x0127:
            java.lang.String r0 = r6.getBackgroundColor()
            int r0 = android.graphics.Color.parseColor(r0)
            r7.setColor(r0)
            r0 = 51
            int r0 = r0 / r2
        L_0x0135:
            int r0 = Cardinal
            int r0 = r0 + 25
            int r1 = r0 % 128
            cca_continue = r1
            int r0 = r0 % 2
        L_0x013f:
            int r0 = r6.getCornerRadius()
            r1 = 98
            if (r0 <= 0) goto L_0x0149
            r0 = r1
            goto L_0x014b
        L_0x0149:
            r0 = 32
        L_0x014b:
            if (r0 == r1) goto L_0x014e
            goto L_0x0186
        L_0x014e:
            int r0 = cca_continue
            r1 = r0 & 85
            int r4 = ~r1
            r0 = r0 | 85
            r0 = r0 & r4
            int r1 = r1 << r3
            int r1 = -r1
            int r1 = -r1
            r4 = r0 ^ r1
            r0 = r0 & r1
            int r0 = r0 << r3
            int r4 = r4 + r0
            int r0 = r4 % 128
            Cardinal = r0
            int r4 = r4 % 2
            int r6 = r6.getCornerRadius()
            float r6 = (float) r6
            r7.setCornerRadius(r6)
            int r6 = cca_continue
            r0 = r6 ^ 31
            r1 = r6 & 31
            r0 = r0 | r1
            int r0 = r0 << r3
            r1 = r6 & -32
            int r6 = ~r6
            r6 = r6 & 31
            r6 = r6 | r1
            int r6 = -r6
            r1 = r0 | r6
            int r1 = r1 << r3
            r6 = r6 ^ r0
            int r1 = r1 - r6
            int r6 = r1 % 128
            Cardinal = r6
            int r1 = r1 % 2
        L_0x0186:
            r5.setBackground(r7)
            int r5 = cca_continue
            r6 = r5 ^ 83
            r7 = r5 & 83
            r6 = r6 | r7
            int r6 = r6 << r3
            r7 = r5 & -84
            int r5 = ~r5
            r5 = r5 & 83
            r5 = r5 | r7
            int r5 = -r5
            r7 = r6 & r5
            r5 = r5 | r6
            int r7 = r7 + r5
            int r5 = r7 % 128
            Cardinal = r5
            int r7 = r7 % 2
            if (r7 == 0) goto L_0x01a5
            goto L_0x01a6
        L_0x01a5:
            r3 = r2
        L_0x01a6:
            if (r3 == 0) goto L_0x01ae
            r5 = 51
            int r5 = r5 / r2
            return
        L_0x01ac:
            r5 = move-exception
            throw r5
        L_0x01ae:
            return
        L_0x01af:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setVerticalFadingEdgeEnabled.Cardinal(com.cardinalcommerce.a.setAnimationMatrix, com.cardinalcommerce.shared.userinterfaces.ButtonCustomization, android.app.Activity):void");
    }

    public static void Cardinal(Toolbar toolbar, UiCustomization uiCustomization, Activity activity) {
        int i = Cardinal;
        int i2 = ((i | 67) << 1) - (i ^ 67);
        cca_continue = i2 % 128;
        if ((i2 % 2 == 0 ? 'Q' : 'Z') != 'Q') {
            if ((uiCustomization.getToolbarCustomization() == null ? Typography.amp : 'V') != 'V') {
                int i3 = cca_continue + 125;
                Cardinal = i3 % 128;
                int i4 = i3 % 2;
                toolbar.setTitle(R.string.secured_checkout);
                setAnimationMatrix setanimationmatrix = (setAnimationMatrix) activity.findViewById(R.id.toolbarButton);
                setanimationmatrix.setCCAText(activity.getResources().getString(R.string.cancel));
                setanimationmatrix.setTextColor(activity.getResources().getColor(R.color.colorBlack));
                int i5 = Cardinal;
                int i6 = i5 ^ 83;
                int i7 = -(-((i5 & 83) << 1));
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                cca_continue = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            init(toolbar, uiCustomization.getToolbarCustomization(), activity);
            int i10 = cca_continue + 45;
            Cardinal = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        uiCustomization.getToolbarCustomization();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if ((r6.getBackgroundColor() != null ? 29 : 'L') != 29) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ((r6.getBackgroundColor() != null ? 'A' : 'F') != 'A') goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void init(androidx.appcompat.widget.Toolbar r5, com.cardinalcommerce.shared.userinterfaces.ToolbarCustomization r6, android.app.Activity r7) {
        /*
            int r0 = Cardinal
            r1 = r0 & 55
            r0 = r0 | 55
            int r1 = r1 + r0
            int r0 = r1 % 128
            cca_continue = r0
            int r1 = r1 % 2
            r0 = 0
            r2 = 1
            if (r1 != 0) goto L_0x0013
            r1 = r0
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = r6.getBackgroundColor()
            r3 = 65
            if (r1 == 0) goto L_0x0020
            r1 = r3
            goto L_0x0022
        L_0x0020:
            r1 = 70
        L_0x0022:
            if (r1 == r3) goto L_0x0037
            goto L_0x0054
        L_0x0025:
            java.lang.String r1 = r6.getBackgroundColor()
            r3 = 36
            int r3 = r3 / r0
            r3 = 29
            if (r1 == 0) goto L_0x0032
            r1 = r3
            goto L_0x0034
        L_0x0032:
            r1 = 76
        L_0x0034:
            if (r1 == r3) goto L_0x0037
            goto L_0x0054
        L_0x0037:
            java.lang.String r1 = r6.getBackgroundColor()
            int r1 = android.graphics.Color.parseColor(r1)
            r5.setBackgroundColor(r1)
            int r1 = Cardinal
            r3 = r1 & 31
            r1 = r1 ^ 31
            r1 = r1 | r3
            r4 = r3 ^ r1
            r1 = r1 & r3
            int r1 = r1 << r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            cca_continue = r1
            int r4 = r4 % 2
        L_0x0054:
            java.lang.String r1 = r6.getHeaderText()
            if (r1 == 0) goto L_0x005c
            r1 = r2
            goto L_0x005d
        L_0x005c:
            r1 = r0
        L_0x005d:
            if (r1 == r2) goto L_0x0060
            goto L_0x0089
        L_0x0060:
            int r1 = cca_continue
            r3 = r1 & 19
            int r4 = ~r3
            r1 = r1 | 19
            r1 = r1 & r4
            int r3 = r3 << r2
            r4 = r1 | r3
            int r4 = r4 << r2
            r1 = r1 ^ r3
            int r4 = r4 - r1
            int r1 = r4 % 128
            Cardinal = r1
            int r4 = r4 % 2
            java.lang.String r1 = r6.getHeaderText()
            r5.setTitle((java.lang.CharSequence) r1)
            int r1 = cca_continue
            r3 = r1 | 39
            int r3 = r3 << r2
            r1 = r1 ^ 39
            int r3 = r3 - r1
            int r1 = r3 % 128
            Cardinal = r1
            int r3 = r3 % 2
        L_0x0089:
            java.lang.String r1 = r6.getTextColor()
            r3 = 75
            if (r1 == 0) goto L_0x0093
            r1 = r0
            goto L_0x0094
        L_0x0093:
            r1 = r3
        L_0x0094:
            if (r1 == r3) goto L_0x00c9
            int r1 = Cardinal
            int r1 = r1 + 64
            int r1 = r1 - r2
            int r3 = r1 % 128
            cca_continue = r3
            int r1 = r1 % 2
            r3 = 96
            if (r1 != 0) goto L_0x00a8
            r1 = 45
            goto L_0x00a9
        L_0x00a8:
            r1 = r3
        L_0x00a9:
            if (r1 != r3) goto L_0x00b7
            java.lang.String r1 = r6.getTextColor()
            int r1 = android.graphics.Color.parseColor(r1)
            r5.setTitleTextColor((int) r1)
            goto L_0x00c9
        L_0x00b7:
            java.lang.String r6 = r6.getTextColor()
            int r6 = android.graphics.Color.parseColor(r6)
            r5.setTitleTextColor((int) r6)
            r5 = 0
            super.hashCode()     // Catch:{ all -> 0x00c7 }
            throw r5     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r5 = move-exception
            throw r5
        L_0x00c9:
            int r5 = com.cardinalcommerce.cardinalmobilesdk.R.id.toolbarButton
            android.view.View r5 = r7.findViewById(r5)
            com.cardinalcommerce.a.setAnimationMatrix r5 = (com.cardinalcommerce.a.setAnimationMatrix) r5
            java.lang.String r7 = r6.getButtonText()
            r1 = 25
            if (r7 == 0) goto L_0x00db
            r7 = r1
            goto L_0x00dd
        L_0x00db:
            r7 = 41
        L_0x00dd:
            if (r7 == r1) goto L_0x00e0
            goto L_0x011d
        L_0x00e0:
            int r7 = cca_continue
            r1 = r7 | 120(0x78, float:1.68E-43)
            int r1 = r1 << r2
            r7 = r7 ^ 120(0x78, float:1.68E-43)
            int r1 = r1 - r7
            int r1 = r1 - r0
            int r1 = r1 - r2
            int r7 = r1 % 128
            Cardinal = r7
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x00f4
            r7 = r2
            goto L_0x00f5
        L_0x00f4:
            r7 = r0
        L_0x00f5:
            if (r7 == r2) goto L_0x00ff
            java.lang.String r6 = r6.getButtonText()
            r5.setCCAText(r6)
            goto L_0x0109
        L_0x00ff:
            java.lang.String r6 = r6.getButtonText()
            r5.setCCAText(r6)
            r5 = 52
            int r5 = r5 / r0
        L_0x0109:
            int r5 = cca_continue
            r6 = r5 & 105(0x69, float:1.47E-43)
            int r7 = ~r6
            r5 = r5 | 105(0x69, float:1.47E-43)
            r5 = r5 & r7
            int r6 = r6 << r2
            r7 = r5 ^ r6
            r5 = r5 & r6
            int r5 = r5 << r2
            int r7 = r7 + r5
            int r5 = r7 % 128
            Cardinal = r5
            int r7 = r7 % 2
        L_0x011d:
            int r5 = cca_continue
            r6 = r5 | 37
            int r6 = r6 << r2
            r5 = r5 ^ 37
            int r6 = r6 - r5
            int r5 = r6 % 128
            Cardinal = r5
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x0130
            r5 = 11
            goto L_0x0131
        L_0x0130:
            r5 = r2
        L_0x0131:
            if (r5 == r2) goto L_0x0139
            r5 = 42
            int r5 = r5 / r0
            return
        L_0x0137:
            r5 = move-exception
            throw r5
        L_0x0139:
            return
        L_0x013a:
            r5 = move-exception
            throw r5
        L_0x013c:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setVerticalFadingEdgeEnabled.init(androidx.appcompat.widget.Toolbar, com.cardinalcommerce.shared.userinterfaces.ToolbarCustomization, android.app.Activity):void");
    }

    public static void getInstance(setAnimationMatrix setanimationmatrix, UiCustomization uiCustomization, Activity activity) {
        Drawable drawable;
        int i = cca_continue;
        int i2 = i | 73;
        int i3 = (i2 << 1) - ((~(i & 73)) & i2);
        Cardinal = i3 % 128;
        boolean z = false;
        Throwable th = null;
        if (!(i3 % 2 != 0)) {
            if ((uiCustomization.getLabelCustomization() != null ? 'J' : 28) != 28) {
                LabelCustomization labelCustomization = uiCustomization.getLabelCustomization();
                if ((labelCustomization.getTextFontSize() > 0 ? 'O' : 25) != 25) {
                    int i4 = cca_continue;
                    int i5 = (i4 & -94) | ((~i4) & 93);
                    int i6 = -(-((i4 & 93) << 1));
                    int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                    Cardinal = i7 % 128;
                    if (i7 % 2 != 0 ? true : true) {
                        setanimationmatrix.setTextSize((float) labelCustomization.getTextFontSize());
                        int i8 = Cardinal;
                        int i9 = (i8 ^ 61) + ((i8 & 61) << 1);
                        cca_continue = i9 % 128;
                        int i10 = i9 % 2;
                    } else {
                        setanimationmatrix.setTextSize((float) labelCustomization.getTextFontSize());
                        super.hashCode();
                        throw th;
                    }
                }
                if (labelCustomization.getTextColor() != null) {
                    int i11 = Cardinal;
                    int i12 = (((i11 & -18) | ((~i11) & 17)) - (~((i11 & 17) << 1))) - 1;
                    cca_continue = i12 % 128;
                    int i13 = i12 % 2;
                    setanimationmatrix.setTextColor(Color.parseColor(labelCustomization.getTextColor()));
                    Drawable[] compoundDrawablesRelative = setanimationmatrix.getCompoundDrawablesRelative();
                    int length = compoundDrawablesRelative.length;
                    int i14 = (cca_continue + 74) - 1;
                    Cardinal = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = 0;
                    while (true) {
                        if ((i16 < length ? 'A' : 18) == 18) {
                            break;
                        }
                        int i17 = (cca_continue + 52) - 1;
                        Cardinal = i17 % 128;
                        if (i17 % 2 != 0) {
                            drawable = compoundDrawablesRelative[i16];
                            int i18 = 66 / 0;
                            if (drawable == null) {
                                int i19 = (((i16 ^ -125) | (i16 & -125)) << 1) - (((~i16) & -125) | (i16 & 124));
                                int i20 = i19 & 126;
                                int i21 = (i19 ^ 126) | i20;
                                i16 = (i20 | i21) + (i20 & i21);
                                int i22 = Cardinal;
                                int i23 = (i22 & 117) + (i22 | 117);
                                cca_continue = i23 % 128;
                                int i24 = i23 % 2;
                            }
                        } else {
                            drawable = compoundDrawablesRelative[i16];
                            if (drawable == null) {
                                int i192 = (((i16 ^ -125) | (i16 & -125)) << 1) - (((~i16) & -125) | (i16 & 124));
                                int i202 = i192 & 126;
                                int i212 = (i192 ^ 126) | i202;
                                i16 = (i202 | i212) + (i202 & i212);
                                int i222 = Cardinal;
                                int i232 = (i222 & 117) + (i222 | 117);
                                cca_continue = i232 % 128;
                                int i242 = i232 % 2;
                            }
                        }
                        drawable.setColorFilter(new PorterDuffColorFilter(Color.parseColor(labelCustomization.getTextColor()), PorterDuff.Mode.SRC_IN));
                        int i25 = Cardinal;
                        int i26 = (i25 ^ 36) + ((i25 & 36) << 1);
                        int i27 = (i26 & -1) + (i26 | -1);
                        cca_continue = i27 % 128;
                        int i28 = i27 % 2;
                        int i1922 = (((i16 ^ -125) | (i16 & -125)) << 1) - (((~i16) & -125) | (i16 & 124));
                        int i2022 = i1922 & 126;
                        int i2122 = (i1922 ^ 126) | i2022;
                        i16 = (i2022 | i2122) + (i2022 & i2122);
                        int i2222 = Cardinal;
                        int i2322 = (i2222 & 117) + (i2222 | 117);
                        cca_continue = i2322 % 128;
                        int i2422 = i2322 % 2;
                    }
                }
                if (labelCustomization.getTextFontName() != null) {
                    int i29 = Cardinal;
                    int i30 = i29 & 11;
                    int i31 = (i29 ^ 11) | i30;
                    int i32 = (i30 & i31) + (i31 | i30);
                    cca_continue = i32 % 128;
                    int i33 = i32 % 2;
                    Typeface configure = configure(labelCustomization.getTextFontName(), activity);
                    if ((configure != null ? '6' : Typography.quote) == '6') {
                        int i34 = cca_continue;
                        int i35 = (i34 ^ 18) + ((i34 & 18) << 1);
                        int i36 = (i35 & -1) + (i35 | -1);
                        Cardinal = i36 % 128;
                        if (i36 % 2 != 0) {
                            setanimationmatrix.setTypeface(configure);
                            int i37 = 45 / 0;
                        } else {
                            setanimationmatrix.setTypeface(configure);
                        }
                    }
                }
            }
            int i38 = cca_continue + 8;
            int i39 = (i38 & -1) + (i38 | -1);
            Cardinal = i39 % 128;
            if (i39 % 2 != 0) {
                z = true;
            }
            if (z) {
                throw th;
            }
            return;
        }
        uiCustomization.getLabelCustomization();
        throw th;
    }

    public static void cca_continue(setAnimationMatrix setanimationmatrix, UiCustomization uiCustomization, Activity activity) {
        int i = Cardinal;
        int i2 = ((i & 68) + (i | 68)) - 1;
        cca_continue = i2 % 128;
        int i3 = i2 % 2;
        Throwable th = null;
        boolean z = false;
        if ((uiCustomization.getLabelCustomization() != null ? 23 : '@') != '@') {
            int i4 = cca_continue;
            int i5 = (i4 & 33) + (i4 | 33);
            Cardinal = i5 % 128;
            int i6 = i5 % 2;
            LabelCustomization labelCustomization = uiCustomization.getLabelCustomization();
            if ((labelCustomization.getHeadingTextFontSize() > 0 ? 'V' : 'H') == 'V') {
                int i7 = (Cardinal + 54) - 1;
                cca_continue = i7 % 128;
                if (!(i7 % 2 != 0)) {
                    setanimationmatrix.setTextSize((float) labelCustomization.getHeadingTextFontSize());
                    int i8 = 71 / 0;
                } else {
                    setanimationmatrix.setTextSize((float) labelCustomization.getHeadingTextFontSize());
                }
                int i9 = Cardinal;
                int i10 = ((i9 | 32) << 1) - (i9 ^ 32);
                int i11 = ((i10 | -1) << 1) - (i10 ^ -1);
                cca_continue = i11 % 128;
                int i12 = i11 % 2;
            }
            if (!(labelCustomization.getHeadingTextColor() == null)) {
                int i13 = Cardinal;
                int i14 = i13 & 15;
                int i15 = (i14 - (~((i13 ^ 15) | i14))) - 1;
                cca_continue = i15 % 128;
                if ((i15 % 2 == 0 ? 'a' : Typography.amp) != 'a') {
                    setanimationmatrix.setTextColor(Color.parseColor(labelCustomization.getHeadingTextColor()));
                } else {
                    setanimationmatrix.setTextColor(Color.parseColor(labelCustomization.getHeadingTextColor()));
                    super.hashCode();
                    throw th;
                }
            }
            if (!(labelCustomization.getHeadingTextFontName() == null)) {
                int i16 = cca_continue;
                int i17 = i16 ^ 19;
                int i18 = -(-((i16 & 19) << 1));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                Cardinal = i19 % 128;
                if (!(i19 % 2 != 0)) {
                    Typeface configure = configure(labelCustomization.getHeadingTextFontName(), activity);
                    if (!(configure == null)) {
                        setanimationmatrix.setTypeface(configure);
                        int i20 = Cardinal;
                        int i21 = i20 & 35;
                        int i22 = (i20 ^ 35) | i21;
                        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                        cca_continue = i23 % 128;
                        int i24 = i23 % 2;
                    }
                } else {
                    configure(labelCustomization.getHeadingTextFontName(), activity);
                    super.hashCode();
                    throw th;
                }
            }
        }
        int i25 = Cardinal;
        int i26 = i25 & 13;
        int i27 = (i25 | 13) & (~i26);
        int i28 = -(-(i26 << 1));
        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
        cca_continue = i29 % 128;
        if (i29 % 2 == 0) {
            z = true;
        }
        if (z) {
            super.hashCode();
            throw th;
        }
    }

    public static void cca_continue(setTranslationX settranslationx, UiCustomization uiCustomization, Activity activity) {
        int i;
        int i2;
        Typeface configure;
        if (uiCustomization.getLabelCustomization() != null) {
            LabelCustomization labelCustomization = uiCustomization.getLabelCustomization();
            if (labelCustomization.getTextFontSize() > 0) {
                settranslationx.setTextSize((float) labelCustomization.getTextFontSize());
            }
            if (labelCustomization.getTextColor() != null) {
                settranslationx.setTextColor(Color.parseColor(labelCustomization.getTextColor()));
            }
            if (!(labelCustomization.getTextFontName() == null || (configure = configure(labelCustomization.getTextFontName(), activity)) == null)) {
                settranslationx.setTypeface(configure);
            }
        }
        int[][] iArr = {new int[]{-16842912}, new int[]{16842912}};
        int[] iArr2 = new int[2];
        if (uiCustomization.getButtonCustomization(ButtonType.VERIFY) != null) {
            i = Color.parseColor(uiCustomization.getButtonCustomization(ButtonType.VERIFY).getBackgroundColor());
        } else {
            i = activity.getResources().getColor(R.color.blue);
        }
        iArr2[0] = i;
        if (uiCustomization.getButtonCustomization(ButtonType.VERIFY) != null) {
            i2 = Color.parseColor(uiCustomization.getButtonCustomization(ButtonType.VERIFY).getBackgroundColor());
        } else {
            i2 = activity.getResources().getColor(R.color.blue);
        }
        iArr2[1] = i2;
        settranslationx.setButtonTintList(new ColorStateList(iArr, iArr2));
    }

    public static void configure(setRight setright, UiCustomization uiCustomization, Activity activity) {
        int i;
        Typeface configure;
        if (uiCustomization.getLabelCustomization() != null) {
            LabelCustomization labelCustomization = uiCustomization.getLabelCustomization();
            if (labelCustomization.getTextFontSize() > 0) {
                setright.setTextSize((float) labelCustomization.getTextFontSize());
            }
            if (labelCustomization.getTextColor() != null) {
                setright.setTextColor(Color.parseColor(labelCustomization.getTextColor()));
            }
            if (!(labelCustomization.getTextFontName() == null || (configure = configure(labelCustomization.getTextFontName(), activity)) == null)) {
                setright.setTypeface(configure);
            }
        }
        int[][] iArr = {new int[]{-16842912}, new int[]{16842912}};
        int[] iArr2 = new int[2];
        if (uiCustomization.getButtonCustomization(ButtonType.VERIFY) != null) {
            i = Color.parseColor(uiCustomization.getButtonCustomization(ButtonType.VERIFY).getBackgroundColor());
        } else {
            i = activity.getResources().getColor(R.color.blue);
        }
        iArr2[0] = i;
        iArr2[1] = -12303292;
        ColorStateList colorStateList = new ColorStateList(iArr, iArr2);
        setright.setButtonTintList(colorStateList);
        Drawable wrap = DrawableCompat.wrap(setright.getButtonDrawable());
        if (uiCustomization.getButtonCustomization(ButtonType.VERIFY) != null) {
            DrawableCompat.setTint(wrap, Color.parseColor(uiCustomization.getButtonCustomization(ButtonType.VERIFY).getBackgroundColor()));
            setright.setButtonTintList(colorStateList);
            return;
        }
        DrawableCompat.setTint(wrap, activity.getResources().getColor(R.color.blue));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.graphics.Typeface, java.lang.Throwable, java.lang.Object, java.lang.String] */
    private static Typeface configure(String str, Activity activity) {
        int i = cca_continue;
        int i2 = (i | 63) << 1;
        int i3 = -(i ^ 63);
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        Cardinal = i4 % 128;
        ? r1 = 0;
        if (i4 % 2 == 0) {
            try {
                Typeface createFromAsset = Typeface.createFromAsset(activity.getAssets(), str);
                int i5 = Cardinal;
                int i6 = i5 & 31;
                int i7 = (i5 | 31) & (~i6);
                int i8 = -(-(i6 << 1));
                int i9 = (i7 & i8) + (i7 | i8);
                cca_continue = i9 % 128;
                int i10 = i9 % 2;
                return createFromAsset;
            } catch (Exception e) {
                init.configure("13201", new StringBuilder("font not found: ").append(str).append(e.getMessage()).toString(), (String) r1);
                return r1;
            }
        } else {
            Typeface.createFromAsset(activity.getAssets(), str);
            super.hashCode();
            throw r1;
        }
    }

    public static void configure(setLeft setleft, UiCustomization uiCustomization, Activity activity) {
        int i;
        int i2;
        int i3 = Cardinal;
        boolean z = true;
        int i4 = (((i3 | 1) << 1) - (~(-(i3 ^ 1)))) - 1;
        int i5 = i4 % 128;
        cca_continue = i5;
        Throwable th = null;
        if (i4 % 2 != 0) {
            if (uiCustomization != null) {
                int i6 = i5 & 107;
                int i7 = ((i5 | 107) & (~i6)) + (i6 << 1);
                Cardinal = i7 % 128;
                int i8 = i7 % 2;
                if (uiCustomization.getTextBoxCustomization() != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    int color = activity.getResources().getColor(R.color.edit_text_border_unselected);
                    TextBoxCustomization textBoxCustomization = uiCustomization.getTextBoxCustomization();
                    if (!(textBoxCustomization == null)) {
                        int i9 = cca_continue;
                        int i10 = i9 & 95;
                        int i11 = -(-((i9 ^ 95) | i10));
                        int i12 = (i10 & i11) + (i11 | i10);
                        Cardinal = i12 % 128;
                        int i13 = i12 % 2;
                        char c = 31;
                        if (!(textBoxCustomization.getBorderWidth() > 0 ? true : true)) {
                            int i14 = cca_continue;
                            int i15 = i14 & 67;
                            int i16 = -(-((i14 ^ 67) | i15));
                            int i17 = (i15 & i16) + (i16 | i15);
                            Cardinal = i17 % 128;
                            int i18 = i17 % 2;
                            i = textBoxCustomization.getBorderWidth();
                            int i19 = Cardinal;
                            int i20 = ((i19 ^ 69) | (i19 & 69)) << 1;
                            int i21 = -(((~i19) & 69) | (i19 & -70));
                            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                            cca_continue = i22 % 128;
                            int i23 = i22 % 2;
                        } else {
                            i = 1;
                        }
                        if (!(textBoxCustomization.getBorderColor() == null)) {
                            int i24 = cca_continue + 34;
                            int i25 = (i24 ^ -1) + ((i24 & -1) << 1);
                            Cardinal = i25 % 128;
                            if (!(i25 % 2 != 0 ? true : true)) {
                                if (!textBoxCustomization.getBorderColor().isEmpty()) {
                                    color = Color.parseColor(textBoxCustomization.getBorderColor());
                                    int i26 = Cardinal + 111;
                                    cca_continue = i26 % 128;
                                    int i27 = i26 % 2;
                                }
                            } else {
                                textBoxCustomization.getBorderColor().isEmpty();
                                throw th;
                            }
                        }
                        if ((textBoxCustomization.getCornerRadius() > 0 ? '/' : 14) != '/') {
                            i2 = 2;
                        } else {
                            int i28 = cca_continue;
                            int i29 = i28 & 65;
                            int i30 = ((i28 ^ 65) | i29) << 1;
                            int i31 = -((i28 | 65) & (~i29));
                            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                            Cardinal = i32 % 128;
                            if (i32 % 2 == 0) {
                                i2 = textBoxCustomization.getCornerRadius();
                                int i33 = cca_continue;
                                int i34 = (i33 ^ 87) + ((i33 & 87) << 1);
                                Cardinal = i34 % 128;
                                int i35 = i34 % 2;
                            } else {
                                textBoxCustomization.getCornerRadius();
                                super.hashCode();
                                throw th;
                            }
                        }
                        gradientDrawable.setStroke(i, color);
                        gradientDrawable.setCornerRadius((float) i2);
                        setleft.setBackground(gradientDrawable);
                        if (!(textBoxCustomization.getTextColor() == null)) {
                            int i36 = Cardinal;
                            int i37 = (i36 ^ 76) + ((i36 & 76) << 1);
                            int i38 = (i37 & -1) + (i37 | -1);
                            cca_continue = i38 % 128;
                            int i39 = i38 % 2;
                            setleft.setTextColor(Color.parseColor(textBoxCustomization.getTextColor()));
                            int i40 = cca_continue;
                            int i41 = i40 ^ 19;
                            int i42 = (((i40 & 19) | i41) << 1) - i41;
                            Cardinal = i42 % 128;
                            int i43 = i42 % 2;
                        }
                        if (textBoxCustomization.getTextFontSize() > 0) {
                            c = '\\';
                        }
                        if (c == '\\') {
                            int i44 = cca_continue;
                            int i45 = (((i44 ^ 66) + ((i44 & 66) << 1)) - 0) - 1;
                            Cardinal = i45 % 128;
                            int i46 = i45 % 2;
                            setleft.setTextSize((float) textBoxCustomization.getTextFontSize());
                            int i47 = Cardinal;
                            int i48 = (i47 ^ 33) + ((i47 & 33) << 1);
                            cca_continue = i48 % 128;
                            int i49 = i48 % 2;
                        }
                        if (textBoxCustomization.getTextFontName() != null) {
                            int i50 = cca_continue;
                            int i51 = ((((i50 ^ 85) | (i50 & 85)) << 1) - (~(-(((~i50) & 85) | (i50 & -86))))) - 1;
                            Cardinal = i51 % 128;
                            int i52 = i51 % 2;
                            Typeface configure = configure(textBoxCustomization.getTextFontName(), activity);
                            if (!(configure == null)) {
                                int i53 = Cardinal;
                                int i54 = i53 & 101;
                                int i55 = (i53 ^ 101) | i54;
                                int i56 = (i54 & i55) + (i55 | i54);
                                cca_continue = i56 % 128;
                                int i57 = i56 % 2;
                                setleft.setTypeface(configure);
                                int i58 = Cardinal;
                                int i59 = (i58 & 85) + (i58 | 85);
                                cca_continue = i59 % 128;
                                int i60 = i59 % 2;
                            }
                        }
                    }
                    int i61 = (Cardinal + 20) - 1;
                    cca_continue = i61 % 128;
                    if (i61 % 2 == 0) {
                        z = false;
                    }
                    if (!z) {
                        throw th;
                    }
                    return;
                }
            }
            setleft.setBackgroundResource(R.drawable.edit_text_border);
            setleft.setTextColor(activity.getResources().getColor(R.color.edit_text_default_color));
            int i62 = ((Cardinal + 92) - 0) - 1;
            cca_continue = i62 % 128;
            int i63 = i62 % 2;
            return;
        }
        throw th;
    }
}
