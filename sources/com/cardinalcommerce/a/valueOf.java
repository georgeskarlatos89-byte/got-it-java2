package com.cardinalcommerce.a;

public class valueOf {
    private static int cca_continue = 1;
    private static int init;

    public static String configure() {
        int i = cca_continue;
        int i2 = i & 125;
        int i3 = (~i2) & (i | 125);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        init = i5 % 128;
        if (!(i5 % 2 != 0)) {
            int i6 = i + 77;
            init = i6 % 128;
            if (i6 % 2 == 0) {
                return "Order/JWT/Init";
            }
            int i7 = 57 / 0;
            return "Order/JWT/Init";
        }
        throw null;
    }

    public static String getInstance() {
        int i = init;
        boolean z = true;
        int i2 = ((i ^ 11) - (~((i & 11) << 1))) - 1;
        cca_continue = i2 % 128;
        if (i2 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return "Order/JWT/StepUp";
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public static String Cardinal() {
        int i = (cca_continue + 23) - 1;
        int i2 = ((i | -1) << 1) - (i ^ -1);
        int i3 = i2 % 128;
        init = i3;
        Throwable th = null;
        if (!(i2 % 2 != 0)) {
            int i4 = i3 & 73;
            int i5 = ((i3 ^ 73) | i4) << 1;
            int i6 = -((i3 | 73) & (~i4));
            int i7 = (i5 & i6) + (i6 | i5);
            cca_continue = i7 % 128;
            if ((i7 % 2 == 0 ? 'X' : 30) != 'X') {
                return "/V2/Browser/SaveBrowserData";
            }
            super.hashCode();
            throw th;
        }
        super.hashCode();
        throw th;
    }
}
