package com.cardinalcommerce.a;

import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import java.math.BigInteger;

public final class BCECGOST3410PublicKey implements GMCipherSpi.SM2 {
    private static final BigInteger getInstance = BigInteger.valueOf(1);
    public DigestSignatureSpi.SHA224 Cardinal;

    private static int init(int i, int i2) {
        if (i >= 1536) {
            if (i2 <= 100) {
                return 3;
            }
            if (i2 <= 128) {
                return 4;
            }
            return (((i2 - 128) + 1) / 2) + 4;
        } else if (i >= 1024) {
            if (i2 <= 100) {
                return 4;
            }
            if (i2 <= 112) {
                return 5;
            }
            return (((i2 - 112) + 1) / 2) + 5;
        } else if (i >= 512) {
            if (i2 <= 80) {
                return 5;
            }
            if (i2 <= 100) {
                return 7;
            }
            return (((i2 - 100) + 1) / 2) + 7;
        } else if (i2 <= 80) {
            return 40;
        } else {
            return (((i2 - 80) + 1) / 2) + 40;
        }
    }

    public final void getInstance(appendElement appendelement) {
        this.Cardinal = (DigestSignatureSpi.SHA224) appendelement;
    }

    public final PSSSignatureSpi.SHA256withRSA init() {
        BigInteger Cardinal2;
        BigInteger Cardinal3;
        BigInteger multiply;
        BigInteger bigInteger;
        BCECGOST3410PublicKey bCECGOST3410PublicKey = this;
        int i = bCECGOST3410PublicKey.Cardinal.onValidated;
        int i2 = (i + 1) / 2;
        int i3 = i - i2;
        int i4 = i / 2;
        int i5 = i4 - 100;
        int i6 = i / 3;
        if (i5 < i6) {
            i5 = i6;
        }
        int i7 = i >> 2;
        BigInteger pow = BigInteger.valueOf(2).pow(i4);
        BigInteger bigInteger2 = getInstance;
        BigInteger shiftLeft = bigInteger2.shiftLeft(i - 1);
        BigInteger shiftLeft2 = bigInteger2.shiftLeft(i5);
        PSSSignatureSpi.SHA256withRSA sHA256withRSA = null;
        boolean z = false;
        while (!z) {
            BigInteger bigInteger3 = bCECGOST3410PublicKey.Cardinal.init;
            do {
                Cardinal2 = bCECGOST3410PublicKey.Cardinal(i2, bigInteger3, shiftLeft);
                while (true) {
                    Cardinal3 = bCECGOST3410PublicKey.Cardinal(i3, bigInteger3, shiftLeft);
                    BigInteger abs = Cardinal3.subtract(Cardinal2).abs();
                    if (abs.bitLength() >= i5 && abs.compareTo(shiftLeft2) > 0) {
                        multiply = Cardinal2.multiply(Cardinal3);
                        if (multiply.bitLength() == i) {
                            break;
                        }
                        Cardinal2 = Cardinal2.max(Cardinal3);
                    } else {
                        bCECGOST3410PublicKey = this;
                        i = i;
                    }
                }
            } while (get.cca_continue(multiply) < i7);
            if (Cardinal2.compareTo(Cardinal3) < 0) {
                bigInteger = Cardinal2;
                Cardinal2 = Cardinal3;
            } else {
                bigInteger = Cardinal3;
            }
            BigInteger bigInteger4 = getInstance;
            BigInteger subtract = Cardinal2.subtract(bigInteger4);
            BigInteger subtract2 = bigInteger.subtract(bigInteger4);
            int i8 = i;
            BigInteger modInverse = bigInteger3.modInverse(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2));
            if (modInverse.compareTo(pow) > 0) {
                BigInteger remainder = modInverse.remainder(subtract);
                BigInteger remainder2 = modInverse.remainder(subtract2);
                BigInteger modInverse2 = bigInteger.modInverse(Cardinal2);
                DigestSignatureSpi.SHA256 sha256 = new DigestSignatureSpi.SHA256(false, multiply, bigInteger3);
                DigestSignatureSpi.RIPEMD256 ripemd256 = r13;
                DigestSignatureSpi.RIPEMD256 ripemd2562 = new DigestSignatureSpi.RIPEMD256(multiply, bigInteger3, modInverse, Cardinal2, bigInteger, remainder, remainder2, modInverse2);
                sHA256withRSA = new PSSSignatureSpi.SHA256withRSA(sha256, ripemd256);
                z = true;
                i = i8;
                bCECGOST3410PublicKey = this;
            } else {
                bCECGOST3410PublicKey = this;
                i = i8;
            }
        }
        return sHA256withRSA;
    }

    private BigInteger Cardinal(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i2 = 0; i2 != i * 5; i2++) {
            BigInteger instance = setCornerRadius.getInstance(i, 1, this.Cardinal.configure);
            BigInteger mod = instance.mod(bigInteger);
            BigInteger bigInteger3 = getInstance;
            if (!mod.equals(bigInteger3) && instance.multiply(instance).compareTo(bigInteger2) >= 0 && getInstance(instance) && bigInteger.gcd(instance.subtract(bigInteger3)).equals(bigInteger3)) {
                return instance;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    private boolean getInstance(BigInteger bigInteger) {
        return !XMSSKeyFactorySpi.Cardinal(bigInteger) && XMSSKeyFactorySpi.Cardinal(bigInteger, this.Cardinal.configure, init(bigInteger.bitLength(), this.Cardinal.getInstance));
    }
}
