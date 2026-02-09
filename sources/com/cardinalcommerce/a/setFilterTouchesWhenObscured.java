package com.cardinalcommerce.a;

public enum setFilterTouchesWhenObscured {
    RSA,
    EC;
    
    private static int getInstance = 0;
    private static int init = 1;

    static {
        int i = getInstance + 74;
        int i2 = (i & -1) + (i | -1);
        init = i2 % 128;
        int i3 = i2 % 2;
    }
}
