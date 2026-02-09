package com.cardinalcommerce.a;

import java.math.BigInteger;
import java.security.SecureRandom;

public final class setCornerRadius {
    public static final BigInteger Cardinal = BigInteger.valueOf(1);
    private static final BigInteger cca_continue = BigInteger.valueOf(3);
    private static final BigInteger configure = BigInteger.valueOf(2);
    private static final BigInteger getInstance = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
    public static final BigInteger init = BigInteger.valueOf(0);
    private static final int onCReqSuccess = BigInteger.valueOf(743).bitLength();

    public static int cca_continue(BigInteger bigInteger) {
        return (bigInteger.bitLength() + 7) / 8;
    }

    private static byte[] cca_continue(int i, SecureRandom secureRandom) throws IllegalArgumentException {
        if (i > 0) {
            int i2 = (i + 7) / 8;
            byte[] bArr = new byte[i2];
            secureRandom.nextBytes(bArr);
            bArr[0] = (byte) (((byte) (255 >>> ((i2 << 3) - i))) & bArr[0]);
            return bArr;
        }
        throw new IllegalArgumentException("bitLength must be at least 1");
    }

    public static BigInteger configure(int i, SecureRandom secureRandom) {
        return new BigInteger(1, cca_continue(i, secureRandom));
    }

    public static byte[] configure(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    public static BigInteger getInstance(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigInteger;
        if (i < 2) {
            throw new IllegalArgumentException("bitLength < 2");
        } else if (i == 2) {
            return secureRandom.nextInt() < 0 ? configure : cca_continue;
        } else {
            do {
                byte[] cca_continue2 = cca_continue(i, secureRandom);
                cca_continue2[0] = (byte) (((byte) (1 << (7 - ((cca_continue2.length * 8) - i)))) | cca_continue2[0]);
                int length = cca_continue2.length - 1;
                cca_continue2[length] = (byte) (cca_continue2[length] | 1);
                bigInteger = new BigInteger(1, cca_continue2);
                if (i > onCReqSuccess) {
                    while (!bigInteger.gcd(getInstance).equals(Cardinal)) {
                        bigInteger = bigInteger.add(configure);
                    }
                }
            } while (!bigInteger.isProbablePrime(i2));
            return bigInteger;
        }
    }

    public static BigInteger getInstance(byte[] bArr, int i, int i2) {
        if (!(i == 0 && i2 == bArr.length)) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static byte[] getInstance(int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = 0;
        if (byteArray[0] == 0) {
            i2 = 1;
        }
        int length = byteArray.length - i2;
        if (length <= i) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, i2, bArr, i - length, length);
            return bArr;
        }
        throw new IllegalArgumentException("standard length exceeded for value");
    }

    public static BigInteger Cardinal(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        int compareTo = bigInteger.compareTo(bigInteger2);
        if (compareTo >= 0) {
            if (compareTo <= 0) {
                return bigInteger;
            }
            throw new IllegalArgumentException("'min' may not be greater than 'max'");
        } else if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            return Cardinal(init, bigInteger2.subtract(bigInteger), secureRandom).add(bigInteger);
        } else {
            for (int i = 0; i < 1000; i++) {
                BigInteger bigInteger3 = new BigInteger(1, cca_continue(bigInteger2.bitLength(), secureRandom));
                if (bigInteger3.compareTo(bigInteger) >= 0 && bigInteger3.compareTo(bigInteger2) <= 0) {
                    return bigInteger3;
                }
            }
            return new BigInteger(1, cca_continue(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom)).add(bigInteger);
        }
    }
}
