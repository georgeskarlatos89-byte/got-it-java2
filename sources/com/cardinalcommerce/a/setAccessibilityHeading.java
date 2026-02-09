package com.cardinalcommerce.a;

public enum setAccessibilityHeading {
    LOW,
    MEDIUM,
    HIGH;
    
    private static int cca_continue = 0;
    private static int init = 1;

    static {
        int i = init;
        int i2 = ((i | 107) << 1) - (i ^ 107);
        cca_continue = i2 % 128;
        int i3 = i2 % 2;
    }
}
