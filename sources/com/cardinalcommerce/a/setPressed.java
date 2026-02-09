package com.cardinalcommerce.a;

public enum setPressed {
    KEY,
    CERTIFICATE;
    
    private static int cca_continue = 0;
    private static int init = 1;

    static {
        boolean z;
        int i = init;
        int i2 = i & 43;
        int i3 = -(-((i ^ 43) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        cca_continue = i4 % 128;
        if (i4 % 2 != 0) {
            z = true;
        }
        if (z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }
}
