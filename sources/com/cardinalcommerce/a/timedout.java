package com.cardinalcommerce.a;

public final class timedout extends setCCAImageUri {
    public final short[] cca_continue;

    public timedout(short[] sArr) {
        super(true);
        short[] sArr2;
        if (sArr == null) {
            sArr2 = null;
        } else {
            short[] sArr3 = new short[sArr.length];
            System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
            sArr2 = sArr3;
        }
        this.cca_continue = sArr2;
    }
}
