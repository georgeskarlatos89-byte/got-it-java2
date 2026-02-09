package com.cardinalcommerce.a;

public enum setAccessibilityDataSensitive {
    JOSE,
    JSON;
    
    private static int Cardinal = 0;
    private static int cca_continue = 1;

    static {
        boolean z;
        int i = Cardinal;
        int i2 = i & 17;
        int i3 = ((i ^ 17) | i2) << 1;
        int i4 = -((i | 17) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        cca_continue = i5 % 128;
        if (i5 % 2 == 0) {
            z = true;
        }
        if (z) {
            throw null;
        }
    }
}
