package com.cardinalcommerce.a;

import com.cardinalcommerce.shared.userinterfaces.UiCustomization;

public final class configure {
    private static configure cca_continue = null;
    private static int cleanup = 1;
    private static int onValidated;
    private String Cardinal;
    private String configure;
    private char[] getInstance;
    private UiCustomization getWarnings;
    private String init;
    private String onCReqSuccess;

    public static configure configure() {
        int i = cleanup;
        int i2 = (i ^ 86) + ((i & 86) << 1);
        int i3 = ((i2 | -1) << 1) - (i2 ^ -1);
        onValidated = i3 % 128;
        int i4 = i3 % 2;
        if (cca_continue == null) {
            cca_continue = new configure();
            int i5 = cleanup;
            int i6 = ((i5 ^ 101) - (~(-(-((i5 & 101) << 1))))) - 1;
            onValidated = i6 % 128;
            int i7 = i6 % 2;
        }
        configure configure2 = cca_continue;
        int i8 = cleanup;
        int i9 = ((i8 ^ 99) | (i8 & 99)) << 1;
        int i10 = -(((~i8) & 99) | (i8 & -100));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        onValidated = i11 % 128;
        if ((i11 % 2 != 0 ? '[' : '9') != '[') {
            return configure2;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void getInstance(UiCustomization uiCustomization, char[] cArr, String str, String str2, String str3, String str4) {
        int i = cleanup;
        int i2 = ((i | 45) << 1) - (i ^ 45);
        int i3 = i2 % 128;
        onValidated = i3;
        int i4 = i2 % 2;
        this.getWarnings = uiCustomization;
        this.getInstance = cArr;
        this.Cardinal = str;
        this.init = str2;
        this.configure = str3;
        this.onCReqSuccess = str4;
        int i5 = (i3 ^ 90) + ((i3 & 90) << 1);
        int i6 = ((i5 | -1) << 1) - (i5 ^ -1);
        cleanup = i6 % 128;
        if ((i6 % 2 == 0 ? 'O' : 'B') == 'O') {
            throw null;
        }
    }

    public final char[] cca_continue() {
        int i = cleanup;
        int i2 = i & 37;
        int i3 = ((i | 37) & (~i2)) + (i2 << 1);
        int i4 = i3 % 128;
        onValidated = i4;
        if (!(i3 % 2 != 0)) {
            char[] cArr = this.getInstance;
            int i5 = i4 & 41;
            int i6 = ((i4 ^ 41) | i5) << 1;
            int i7 = -((i4 | 41) & (~i5));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            cleanup = i8 % 128;
            if ((i8 % 2 == 0 ? '&' : '*') != '&') {
                return cArr;
            }
            int i9 = 34 / 0;
            return cArr;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final String init() {
        int i = onValidated;
        int i2 = (i & -4) | ((~i) & 3);
        int i3 = -(-((i & 3) << 1));
        int i4 = (i2 & i3) + (i2 | i3);
        cleanup = i4 % 128;
        int i5 = i4 % 2;
        String str = this.Cardinal;
        int i6 = ((i & 15) - (~(-(-(i | 15))))) - 1;
        cleanup = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String Cardinal() {
        int i = onValidated;
        int i2 = (i & -84) | ((~i) & 83);
        int i3 = (i & 83) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        cleanup = i5;
        int i6 = i4 % 2;
        String str = this.init;
        int i7 = (((i5 & -112) | ((~i5) & 111)) - (~((i5 & 111) << 1))) - 1;
        onValidated = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public final String getInstance() {
        String str;
        int i = onValidated;
        int i2 = (i & 55) + (i | 55);
        cleanup = i2 % 128;
        boolean z = false;
        if ((i2 % 2 == 0 ? 10 : '`') != '`') {
            str = this.configure;
            int i3 = 52 / 0;
        } else {
            str = this.configure;
        }
        int i4 = (i ^ 119) + ((i & 119) << 1);
        cleanup = i4 % 128;
        if (i4 % 2 != 0) {
            z = true;
        }
        if (z) {
            return str;
        }
        throw null;
    }

    public final String getWarnings() {
        int i = cleanup;
        boolean z = true;
        int i2 = (i | 37) << 1;
        int i3 = -((i & -38) | ((~i) & 37));
        int i4 = (i2 & i3) + (i2 | i3);
        onValidated = i4 % 128;
        if (!(i4 % 2 != 0)) {
            String str = this.onCReqSuccess;
            int i5 = (((i ^ 63) | (i & 63)) << 1) - (((~i) & 63) | (i & -64));
            onValidated = i5 % 128;
            if (i5 % 2 == 0) {
                z = false;
            }
            if (!z) {
                return str;
            }
            int i6 = 87 / 0;
            return str;
        }
        throw null;
    }

    public final UiCustomization getSDKVersion() {
        int i = cleanup;
        int i2 = ((i ^ 44) + ((i & 44) << 1)) - 1;
        onValidated = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getWarnings;
        }
        throw null;
    }
}
