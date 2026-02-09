package com.cardinalcommerce.a;

import java.math.BigInteger;

final class getKeys {
    final BigInteger cca_continue;
    final int configure;

    public getKeys(BigInteger bigInteger, int i) {
        if (i >= 0) {
            this.cca_continue = bigInteger;
            this.configure = i;
            return;
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getKeys)) {
            return false;
        }
        getKeys getkeys = (getKeys) obj;
        return this.cca_continue.equals(getkeys.cca_continue) && this.configure == getkeys.configure;
    }

    public final int hashCode() {
        return this.cca_continue.hashCode() ^ this.configure;
    }

    public final getKeys Cardinal(getKeys getkeys) {
        if (this.configure == getkeys.configure) {
            return new getKeys(this.cca_continue.add(getkeys.cca_continue), this.configure);
        }
        throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }

    public final BigInteger cca_continue() {
        getKeys getkeys = new getKeys(writeJSONString.CardinalRenderType, 1);
        int i = this.configure;
        if (i >= 0) {
            int i2 = getkeys.configure;
            if (i != i2) {
                getkeys = new getKeys(getkeys.cca_continue.shiftLeft(i - i2), i);
            }
            getKeys Cardinal = Cardinal(getkeys);
            return Cardinal.cca_continue.shiftRight(Cardinal.configure);
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    public final String toString() {
        int i = this.configure;
        if (i == 0) {
            return this.cca_continue.toString();
        }
        BigInteger shiftRight = this.cca_continue.shiftRight(i);
        BigInteger subtract = this.cca_continue.subtract(shiftRight.shiftLeft(this.configure));
        if (this.cca_continue.signum() == -1) {
            subtract = writeJSONString.CardinalRenderType.shiftLeft(this.configure).subtract(subtract);
        }
        if (shiftRight.signum() == -1 && !subtract.equals(writeJSONString.getSDKVersion)) {
            shiftRight = shiftRight.add(writeJSONString.CardinalRenderType);
        }
        String obj = shiftRight.toString();
        char[] cArr = new char[this.configure];
        String bigInteger = subtract.toString(2);
        int length = bigInteger.length();
        int i2 = this.configure - length;
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = '0';
        }
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i2 + i4] = bigInteger.charAt(i4);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(obj);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
