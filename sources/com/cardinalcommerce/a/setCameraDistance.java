package com.cardinalcommerce.a;

import java.io.Serializable;

public final class setCameraDistance implements Serializable {
    private static int getInstance = 1;
    private static int init;
    private String Cardinal;
    private String configure;

    public setCameraDistance(String str, String str2) {
        this.configure = str;
        this.Cardinal = str2;
    }

    public final String cca_continue() {
        int i = init;
        int i2 = i ^ 95;
        int i3 = ((((i & 95) | i2) << 1) - (~(-i2))) - 1;
        int i4 = i3 % 128;
        getInstance = i4;
        if ((i3 % 2 == 0 ? '*' : 'N') != '*') {
            String str = this.configure;
            int i5 = i4 + 17;
            init = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
        throw null;
    }

    public final String getInstance() {
        int i = getInstance;
        int i2 = i & 93;
        int i3 = -(-((i ^ 93) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        init = i4 % 128;
        if ((i4 % 2 != 0 ? 'H' : 'G') != 'H') {
            return this.Cardinal;
        }
        throw null;
    }
}
