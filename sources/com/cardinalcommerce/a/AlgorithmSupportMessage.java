package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class AlgorithmSupportMessage implements AuthenticatedCipherText {
    private JSONAwareEx Cardinal;
    private toJSONString cca_continue;
    private ECDH configure;

    private static BigInteger configure(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i - 1);
        BigInteger shiftRight = multiply.shiftRight(i);
        if (testBit) {
            shiftRight = shiftRight.add(writeJSONString.CardinalRenderType);
        }
        return z ? shiftRight.negate() : shiftRight;
    }

    public final JSONAwareEx Cardinal() {
        return this.Cardinal;
    }

    public AlgorithmSupportMessage(toJSONString tojsonstring, ECDH ecdh) {
        this.cca_continue = tojsonstring;
        this.configure = ecdh;
        this.Cardinal = new root(tojsonstring.init(ecdh.Cardinal));
    }

    public final BigInteger[] getInstance(BigInteger bigInteger) {
        int i = this.configure.onCReqSuccess;
        BigInteger configure2 = configure(bigInteger, this.configure.getSDKVersion, i);
        BigInteger configure3 = configure(bigInteger, this.configure.getWarnings, i);
        ECDH ecdh = this.configure;
        return new BigInteger[]{bigInteger.subtract(configure2.multiply(ecdh.cca_continue).add(configure3.multiply(ecdh.init))), configure2.multiply(ecdh.getInstance).add(configure3.multiply(ecdh.configure)).negate()};
    }
}
