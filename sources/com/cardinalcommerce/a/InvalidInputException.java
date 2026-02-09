package com.cardinalcommerce.a;

import java.security.spec.KeySpec;

public class InvalidInputException implements KeySpec {
    public int[] Cardinal;
    public short[][] cca_continue;
    public short[][] configure;
    public short[] getInstance;
    public Transaction[] getSDKVersion;
    public short[] init;

    public InvalidInputException(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Transaction[] transactionArr) {
        this.configure = sArr;
        this.init = sArr2;
        this.cca_continue = sArr3;
        this.getInstance = sArr4;
        this.Cardinal = iArr;
        this.getSDKVersion = transactionArr;
    }
}
