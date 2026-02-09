package com.cardinalcommerce.a;

public enum Cardinal {
    New(0),
    Configured(1),
    InitStarted(2),
    InitCompleted(3),
    Continue(6),
    Validated(9);
    
    private static int cca_continue = 0;
    private static int configure = 1;
    private final int index;

    static {
        int i = cca_continue;
        int i2 = i & 89;
        int i3 = (((i | 89) & (~i2)) - (~(i2 << 1))) - 1;
        configure = i3 % 128;
        int i4 = i3 % 2;
    }

    private Cardinal(int i) {
        this.index = i;
    }

    public final int configure() {
        int i = configure;
        int i2 = i ^ 33;
        int i3 = ((i & 33) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        cca_continue = i5 % 128;
        if (i5 % 2 == 0) {
            return this.index;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }
}
