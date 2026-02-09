package com.cardinalcommerce.a;

import java.io.Serializable;
import kotlin.text.Typography;

public final class setScrollX implements Serializable {
    private static int configure = 1;
    private static int init;
    private String Cardinal = "";
    private boolean getInstance = true;

    public final void getInstance(boolean z, String str) {
        int i = configure;
        int i2 = i & 103;
        int i3 = (i ^ 103) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        init = i5;
        int i6 = i4 % 2;
        if ((!z ? Typography.amp : 'M') != 'M') {
            int i7 = (i5 & 78) + (i5 | 78);
            int i8 = ((i7 | -1) << 1) - (i7 ^ -1);
            configure = i8 % 128;
            int i9 = i8 % 2;
            cca_continue(false);
            Cardinal(str);
            int i10 = configure;
            int i11 = (i10 & 67) + (i10 | 67);
            init = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = configure;
        int i14 = ((i13 | 119) << 1) - (i13 ^ 119);
        init = i14 % 128;
        int i15 = i14 % 2;
    }

    public final boolean cca_continue() {
        int i = configure;
        int i2 = (i & -102) | ((~i) & 101);
        boolean z = true;
        int i3 = -(-((i & 101) << 1));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        init = i4 % 128;
        boolean z2 = i4 % 2 != 0;
        Throwable th = null;
        if (!z2) {
            boolean z3 = this.getInstance;
            int i5 = i & 53;
            int i6 = -(-((i ^ 53) | i5));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            init = i7 % 128;
            if (i7 % 2 == 0) {
                z = false;
            }
            if (!z) {
                return z3;
            }
            super.hashCode();
            throw th;
        }
        super.hashCode();
        throw th;
    }

    public final void cca_continue(boolean z) {
        int i = configure;
        int i2 = i ^ 93;
        int i3 = (((i & 93) | i2) << 1) - i2;
        int i4 = i3 % 128;
        init = i4;
        int i5 = i3 % 2;
        if ((!z ? '9' : '7') != '7') {
            int i6 = (i4 + 84) - 1;
            int i7 = i6 % 128;
            configure = i7;
            int i8 = i6 % 2;
            this.getInstance = false;
            int i9 = i7 & 11;
            int i10 = -(-((i7 ^ 11) | i9));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            init = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = configure;
        int i14 = ((i13 & -124) | ((~i13) & 123)) + ((i13 & 123) << 1);
        init = i14 % 128;
        int i15 = i14 % 2;
    }

    public final String init() {
        int i = init;
        int i2 = ((((i | 94) << 1) - (i ^ 94)) + 0) - 1;
        int i3 = i2 % 128;
        configure = i3;
        if ((i2 % 2 == 0 ? 'B' : Typography.dollar) != 'B') {
            String str = this.Cardinal;
            int i4 = (i3 & 123) + (i3 | 123);
            init = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final void Cardinal(String str) {
        int i = init;
        int i2 = i & 89;
        int i3 = -(-((i ^ 89) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        configure = i4 % 128;
        if (!(i4 % 2 == 0)) {
            if ((this.Cardinal.equals("") ? 'I' : 14) != 'I') {
                this.Cardinal = new StringBuilder().append(this.Cardinal).append(",").append(str).toString();
                int i5 = init;
                int i6 = i5 & 15;
                int i7 = (i5 | 15) & (~i6);
                int i8 = i6 << 1;
                int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                configure = i9 % 128;
                int i10 = i9 % 2;
                return;
            }
            int i11 = configure;
            int i12 = ((i11 & 3) - (~(i11 | 3))) - 1;
            int i13 = i12 % 128;
            init = i13;
            int i14 = i12 % 2;
            this.Cardinal = str;
            int i15 = (i13 + 66) - 1;
            configure = i15 % 128;
            if ((i15 % 2 == 0 ? '7' : 27) != 27) {
                int i16 = 87 / 0;
                return;
            }
            return;
        }
        this.Cardinal.equals("");
        Throwable th = null;
        super.hashCode();
        throw th;
    }
}
