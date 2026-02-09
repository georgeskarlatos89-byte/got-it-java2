package com.cardinalcommerce.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import java.nio.charset.StandardCharsets;

public final class setLayoutParams {
    private static setTranslationY cca_continue = null;
    private static int configure = 1;
    private static setLayoutParams getInstance;
    private static int init;
    private final SharedPreferences Cardinal;

    private setLayoutParams(Context context) {
        this.Cardinal = context.getSharedPreferences("com.cardinalcommerce.cardinalmobilesdkcmsdk", 0);
    }

    public static synchronized setLayoutParams getInstance(Context context) {
        synchronized (setLayoutParams.class) {
            int i = init;
            int i2 = (i | 17) << 1;
            int i3 = -(((~i) & 17) | (i & -18));
            int i4 = (i2 & i3) + (i3 | i2);
            configure = i4 % 128;
            int i5 = i4 % 2;
            cca_continue = setTranslationY.cca_continue();
            if (getInstance == null) {
                getInstance = new setLayoutParams(context);
                int i6 = init;
                int i7 = i6 & 69;
                int i8 = (i6 ^ 69) | i7;
                int i9 = (i7 & i8) + (i8 | i7);
                configure = i9 % 128;
                int i10 = i9 % 2;
            }
            setLayoutParams setlayoutparams = getInstance;
            int i11 = configure;
            int i12 = ((i11 | 36) << 1) - (i11 ^ 36);
            int i13 = (i12 & -1) + (i12 | -1);
            init = i13 % 128;
            if ((i13 % 2 != 0 ? '4' : 'K') == 'K') {
                return setlayoutparams;
            }
            int i14 = 34 / 0;
            return setlayoutparams;
        }
    }

    public final synchronized void Cardinal(String str, String str2) {
        SharedPreferences.Editor putString;
        int i = init;
        int i2 = ((i & -64) | ((~i) & 63)) + ((i & 63) << 1);
        configure = i2 % 128;
        if ((i2 % 2 == 0 ? '^' : '5') != '5') {
            try {
                putString = this.Cardinal.edit().putString(str, Base64.encodeToString(str2.getBytes(StandardCharsets.UTF_8), 1));
            } catch (Exception e) {
                cca_continue.configure("10706", new StringBuilder(ThreeDSStrings.SHARED_PREFERENCES_EXCEPTION_MESSAGE).append(str).append(e.getLocalizedMessage()).toString(), (String) null);
                return;
            }
        } else {
            putString = this.Cardinal.edit().putString(str, Base64.encodeToString(str2.getBytes(StandardCharsets.UTF_8), 0));
        }
        putString.apply();
    }

    public final synchronized String init(String str, String str2) {
        String str3;
        int i = init;
        int i2 = i & 107;
        int i3 = i2 + ((i ^ 107) | i2);
        configure = i3 % 128;
        int i4 = i3 % 2;
        try {
            boolean z = false;
            byte[] decode = Base64.decode(this.Cardinal.getString(str, str2), 0);
            if (str.equals("SDKAppID")) {
                int i5 = init;
                int i6 = i5 & 29;
                int i7 = (~i6) & (i5 | 29);
                int i8 = -(-(i6 << 1));
                int i9 = (i7 & i8) + (i8 | i7);
                configure = i9 % 128;
                int i10 = i9 % 2;
                if (decode != null) {
                    z = true;
                }
                if (!z) {
                    int i11 = (i5 & 63) + (i5 | 63);
                    configure = i11 % 128;
                    int i12 = i11 % 2;
                    cca_continue.cca_continue("CardinalConfigure", ThreeDSStrings.SHARED_PREFERENCES_SDKAPPID_WARNING_MESSAGE, (String) null);
                    int i13 = configure;
                    int i14 = i13 ^ 77;
                    int i15 = ((i13 & 77) | i14) << 1;
                    int i16 = -i14;
                    int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                    init = i17 % 128;
                    if (i17 % 2 != 0) {
                    }
                }
            }
            str3 = new String(decode, StandardCharsets.UTF_8);
            int i18 = init;
            int i19 = (i18 & -50) | ((~i18) & 49);
            int i20 = (i18 & 49) << 1;
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            configure = i21 % 128;
            int i22 = i21 % 2;
        } catch (Exception e) {
            cca_continue.configure("10704", new StringBuilder(ThreeDSStrings.SHARED_PREFERENCES_EXCEPTION_MESSAGE).append(str).append(e.getLocalizedMessage()).toString(), (String) null);
            return str2;
        }
        return str3;
    }

    public final synchronized void Cardinal(String str, long j) {
        int i = (configure + 31) - 1;
        int i2 = (i & -1) + (i | -1);
        init = i2 % 128;
        int i3 = i2 % 2;
        try {
            Cardinal(str, Long.toString(j));
            int i4 = init;
            int i5 = i4 & 51;
            int i6 = (i4 | 51) & (~i5);
            int i7 = i5 << 1;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            configure = i8 % 128;
            int i9 = i8 % 2;
        } catch (Exception e) {
            cca_continue.configure("10706", new StringBuilder(ThreeDSStrings.SHARED_PREFERENCES_EXCEPTION_MESSAGE).append(str).append(e.getLocalizedMessage()).toString(), (String) null);
        }
    }

    public final synchronized long getInstance(String str) {
        String init2;
        long parseLong;
        int i = init;
        int i2 = i ^ 25;
        int i3 = -(-((i & 25) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        configure = i4 % 128;
        if ((i4 % 2 == 0 ? ':' : '`') != ':') {
            try {
                init2 = init(str, Long.toString(0));
            } catch (Exception e) {
                cca_continue.configure("10704", new StringBuilder(ThreeDSStrings.SHARED_PREFERENCES_PARSE_LONG_EXCEPTION_MESSAGE).append(str).append(e.getLocalizedMessage()).toString(), (String) null);
                return 0;
            }
        } else {
            init2 = init(str, Long.toString(1));
        }
        parseLong = Long.parseLong(init2);
        int i5 = configure;
        int i6 = i5 & 89;
        int i7 = ((i5 | 89) & (~i6)) + (i6 << 1);
        init = i7 % 128;
        int i8 = i7 % 2;
        return parseLong;
    }
}
