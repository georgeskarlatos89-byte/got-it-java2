package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class ECDH {
    BigInteger Cardinal;
    BigInteger cca_continue;
    private BigInteger cleanup;
    BigInteger configure;
    BigInteger getInstance;
    BigInteger getSDKVersion;
    BigInteger getWarnings;
    BigInteger init;
    int onCReqSuccess;

    public ECDH(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i) {
        cca_continue(bigIntegerArr, "v1");
        cca_continue(bigIntegerArr2, "v2");
        this.Cardinal = bigInteger;
        this.cleanup = bigInteger2;
        this.cca_continue = bigIntegerArr[0];
        this.getInstance = bigIntegerArr[1];
        this.init = bigIntegerArr2[0];
        this.configure = bigIntegerArr2[1];
        this.getSDKVersion = bigInteger3;
        this.getWarnings = bigInteger4;
        this.onCReqSuccess = i;
    }

    private static void cca_continue(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException(new StringBuilder("'").append(str).append("' must consist of exactly 2 (non-null) values").toString());
        }
    }
}
