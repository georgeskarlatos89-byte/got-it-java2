package com.cardinalcommerce.a;

import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;

public final class setHovered {
    private static int getSDKVersion = 1;
    private static int getWarnings;
    public char[] Cardinal = ThreeDSStrings.DEFAULT_CHAR_VALUE;
    public char[] cca_continue = ThreeDSStrings.DEFAULT_CHAR_VALUE;
    public char[] configure = ThreeDSStrings.DEFAULT_CHAR_VALUE;
    public boolean getInstance = false;
    public char[] init = ThreeDSStrings.DEFAULT_CHAR_VALUE;
    private char[] onCReqSuccess;

    public final void Cardinal(char[] cArr) {
        int i = getWarnings;
        int i2 = ((i ^ 59) | (i & 59)) << 1;
        int i3 = -((i & -60) | ((~i) & 59));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        getSDKVersion = i4 % 128;
        int i5 = i4 % 2;
        this.Cardinal = cArr;
        int i6 = (i & 80) + (i | 80);
        int i7 = (i6 ^ -1) + ((i6 & -1) << 1);
        getSDKVersion = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void configure(char[] cArr) {
        int i = (getWarnings + 78) - 1;
        getSDKVersion = i % 128;
        char c = i % 2 == 0 ? ';' : 'L';
        this.init = cArr;
        if (c != 'L') {
            int i2 = 65 / 0;
        }
    }

    public final void getInstance(char[] cArr) {
        int i = getWarnings;
        int i2 = i ^ 3;
        int i3 = -(-((i & 3) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getSDKVersion = i4 % 128;
        char c = i4 % 2 == 0 ? 'C' : ' ';
        this.cca_continue = cArr;
        if (c == 'C') {
            int i5 = 60 / 0;
        }
    }

    public final void getInstance() {
        int i = getWarnings;
        int i2 = i & 55;
        int i3 = -(-((i ^ 55) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getSDKVersion = i4 % 128;
        char c = 2;
        if (i4 % 2 != 0) {
            c = 'U';
        }
        if (c != 'U') {
            this.getInstance = false;
        } else {
            this.getInstance = true;
        }
    }

    public final void cca_continue(char[] cArr) {
        int i = getSDKVersion;
        int i2 = i & 55;
        int i3 = (i2 - (~(-(-((i ^ 55) | i2))))) - 1;
        int i4 = i3 % 128;
        getWarnings = i4;
        boolean z = i3 % 2 == 0;
        this.configure = cArr;
        if (!z) {
            int i5 = 83 / 0;
        }
        int i6 = ((i4 + 97) - 1) - 1;
        getSDKVersion = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void init(char[] cArr) {
        int i = getSDKVersion;
        int i2 = (((i ^ 6) + ((i & 6) << 1)) + 0) - 1;
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        this.onCReqSuccess = cArr;
        int i4 = i + 119;
        getWarnings = i4 % 128;
        int i5 = i4 % 2;
    }

    public final char[] Cardinal() {
        int i = getSDKVersion;
        int i2 = ((i | 43) << 1) - (((~i) & 43) | (i & -44));
        getWarnings = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return this.onCReqSuccess;
        }
        throw null;
    }
}
