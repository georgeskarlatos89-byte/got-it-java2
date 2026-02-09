package com.cardinalcommerce.a;

import com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError;

public class getString extends setTranslationY {
    private static volatile getString Cardinal = null;
    private static int getInstance = 0;
    private static int onCReqSuccess = 1;

    public static getString getInstance() {
        if (Cardinal == null) {
            synchronized (getString.class) {
                if (Cardinal == null) {
                    Cardinal = new getString();
                }
            }
        }
        return Cardinal;
    }

    private getString() {
        if (Cardinal == null) {
            setTranslationY.getInstance(true);
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance.");
    }

    public final setOutlineProvider configure() {
        int i = onCReqSuccess;
        int i2 = i ^ 111;
        int i3 = ((((i & 111) | i2) << 1) - (~(-i2))) - 1;
        getInstance = i3 % 128;
        int i4 = i3 % 2;
        setOutlineProvider configure = super.configure();
        int i5 = onCReqSuccess;
        int i6 = (i5 | 53) << 1;
        int i7 = -(((~i5) & 53) | (i5 & -54));
        int i8 = (i6 & i7) + (i7 | i6);
        getInstance = i8 % 128;
        int i9 = i8 % 2;
        return configure;
    }

    public final void Cardinal(String str, String str2) {
        int i = getInstance;
        int i2 = i & 43;
        int i3 = ((i | 43) & (~i2)) + (i2 << 1);
        onCReqSuccess = i3 % 128;
        int i4 = i3 % 2;
        cca_continue(str, str2, (String) null);
        int i5 = onCReqSuccess;
        int i6 = (((i5 & -96) | ((~i5) & 95)) - (~((i5 & 95) << 1))) - 1;
        getInstance = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void cca_continue(String str, String str2, String str3) {
        int i = getInstance;
        boolean z = true;
        int i2 = (i | 121) << 1;
        int i3 = -(i ^ 121);
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        onCReqSuccess = i4 % 128;
        int i5 = i4 % 2;
        Throwable th = null;
        if ((cca_continue ? '(' : ',') == '(') {
            int i6 = getInstance;
            int i7 = i6 & 69;
            int i8 = (((i6 | 69) & (~i7)) - (~(i7 << 1))) - 1;
            onCReqSuccess = i8 % 128;
            if (!(i8 % 2 == 0)) {
                getInstance.getInstance();
                configure = getInstance.getSDKVersion();
                init = "CardinalLoggerV1";
                super.cca_continue(str, str2, str3);
            } else {
                getInstance.getInstance();
                configure = getInstance.getSDKVersion();
                init = "CardinalLoggerV1";
                super.cca_continue(str, str2, str3);
                super.hashCode();
                throw th;
            }
        }
        int i9 = onCReqSuccess;
        int i10 = i9 ^ 75;
        int i11 = (((i9 & 75) | i10) << 1) - i10;
        getInstance = i11 % 128;
        if (i11 % 2 != 0) {
            z = false;
        }
        if (!z) {
            super.hashCode();
            throw th;
        }
    }

    public final void configure(String str, String str2, String str3) {
        int i = onCReqSuccess;
        int i2 = (((i | 40) << 1) - (i ^ 40)) - 1;
        getInstance = i2 % 128;
        int i3 = i2 % 2;
        boolean z = false;
        if (!(!cca_continue)) {
            int i4 = getInstance;
            int i5 = i4 ^ 37;
            int i6 = ((i4 & 37) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 & i7) + (i6 | i7);
            onCReqSuccess = i8 % 128;
            if (i8 % 2 == 0) {
                z = true;
            }
            if (!z) {
                getInstance.getInstance();
                configure = getInstance.getSDKVersion();
                init = "CardinalLoggerV1";
                super.configure(str, str2, str3);
            } else {
                getInstance.getInstance();
                configure = getInstance.getSDKVersion();
                init = "CardinalLoggerV1";
                super.configure(str, str2, str3);
                Throwable th = null;
                super.hashCode();
                throw th;
            }
        }
        int i9 = onCReqSuccess;
        int i10 = i9 & 11;
        int i11 = i10 + ((i9 ^ 11) | i10);
        getInstance = i11 % 128;
        int i12 = i11 % 2;
    }

    public final void cca_continue(CardinalError cardinalError, String str) {
        int i = getInstance;
        int i2 = i & 7;
        int i3 = ((i | 7) & (~i2)) + (i2 << 1);
        onCReqSuccess = i3 % 128;
        int i4 = i3 % 2;
        configure(String.valueOf(cardinalError.cca_continue()), cardinalError.Cardinal(), str);
        int i5 = getInstance;
        int i6 = (i5 | 71) << 1;
        int i7 = -(((~i5) & 71) | (i5 & -72));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        onCReqSuccess = i8 % 128;
        int i9 = i8 % 2;
    }

    public final void init(String str) {
        int i = onCReqSuccess + 112;
        int i2 = (i ^ -1) + ((i & -1) << 1);
        getInstance = i2 % 128;
        int i3 = i2 % 2;
        super.init(str);
        int i4 = getInstance;
        int i5 = (((i4 ^ 1) | (i4 & 1)) << 1) - (((~i4) & 1) | (i4 & -2));
        onCReqSuccess = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void init() {
        int i = onCReqSuccess;
        int i2 = i & 23;
        int i3 = ((i ^ 23) | i2) << 1;
        int i4 = -((i | 23) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        getInstance = i5 % 128;
        int i6 = i5 % 2;
        super.init();
        int i7 = onCReqSuccess + 84;
        int i8 = (i7 & -1) + (i7 | -1);
        getInstance = i8 % 128;
        int i9 = i8 % 2;
    }
}
