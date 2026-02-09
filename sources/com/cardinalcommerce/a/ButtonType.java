package com.cardinalcommerce.a;

import java.security.spec.KeySpec;

public class ButtonType implements KeySpec {
    public short[][] Cardinal;
    public short[] cca_continue;
    public short[][] getInstance;
    public int init;

    public ButtonType(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.init = i;
        this.Cardinal = sArr;
        this.getInstance = sArr2;
        this.cca_continue = sArr3;
    }
}
