package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import java.math.BigInteger;
import java.security.SecureRandom;

public final class CipherSpi extends setCCAImageUri {
    public final byte[] Cardinal;

    public final class ISO9796d1Padding implements GMCipherSpi.SM2withRMD {
        public byte[] getInstance;

        public ISO9796d1Padding(byte[] bArr) {
            this(bArr, bArr.length);
        }

        private ISO9796d1Padding(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            this.getInstance = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, i);
        }
    }

    public final class OAEPPadding implements GMCipherSpi.SM2withRMD {
        public byte[] Cardinal;
        public byte[] getInstance;

        public OAEPPadding(byte[] bArr, byte[] bArr2) {
            this.Cardinal = bArr;
            this.getInstance = bArr2;
        }
    }

    public final class PKCS1v1_5Padding_PublicOnly implements GMCipherSpi.SM2withRMD {
        public byte[] cca_continue;
        public GMCipherSpi.SM2withRMD getInstance;

        public PKCS1v1_5Padding_PublicOnly(GMCipherSpi.SM2withRMD sM2withRMD, byte[] bArr) {
            this.getInstance = sM2withRMD;
            this.cca_continue = bArr;
        }
    }

    public CipherSpi(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[57];
        this.Cardinal = bArr;
        Base64URL.getInstance(secureRandom, bArr);
    }

    public CipherSpi(byte[] bArr) {
        super(true);
        byte[] bArr2 = new byte[57];
        this.Cardinal = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 57);
    }

    public final class NoPadding extends appendElement {
        public PKCS1v1_5Padding Cardinal;

        public NoPadding(SecureRandom secureRandom, PKCS1v1_5Padding pKCS1v1_5Padding) {
            super(secureRandom, pKCS1v1_5Padding.cca_continue.bitLength() - 1);
            this.Cardinal = pKCS1v1_5Padding;
        }
    }

    public final class PKCS1v1_5Padding implements GMCipherSpi.SM2withRMD {
        public BigInteger Cardinal;
        public BigInteger cca_continue;
        public BigInteger configure;

        public PKCS1v1_5Padding(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this.cca_continue = bigInteger;
            this.configure = bigInteger2;
            this.Cardinal = bigInteger3;
        }

        public final int hashCode() {
            return (this.cca_continue.hashCode() ^ this.configure.hashCode()) ^ this.Cardinal.hashCode();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PKCS1v1_5Padding)) {
                return false;
            }
            PKCS1v1_5Padding pKCS1v1_5Padding = (PKCS1v1_5Padding) obj;
            if (!pKCS1v1_5Padding.cca_continue.equals(this.cca_continue) || !pKCS1v1_5Padding.configure.equals(this.configure) || !pKCS1v1_5Padding.Cardinal.equals(this.Cardinal)) {
                return false;
            }
            return true;
        }
    }

    public final class PKCS1v1_5Padding_PrivateOnly implements GMCipherSpi.SM2withRMD {
        public KeyPairGeneratorSpi.XDH Cardinal;
        public KeyPairGeneratorSpi.EdDSA cca_continue;
        public KeyPairGeneratorSpi.EdDSA configure;

        public PKCS1v1_5Padding_PrivateOnly(KeyPairGeneratorSpi.EdDSA edDSA, KeyPairGeneratorSpi.EdDSA edDSA2, KeyPairGeneratorSpi.XDH xdh) {
            if (edDSA == null) {
                throw new NullPointerException("staticPrivateKey cannot be null");
            } else if (edDSA2 != null) {
                KeyFactorySpi.EDDSA eddsa = edDSA.Cardinal;
                if (eddsa.equals(edDSA2.Cardinal)) {
                    if (xdh == null) {
                        xdh = new KeyPairGeneratorSpi.XDH(eddsa.init.Cardinal(edDSA2.init), eddsa);
                    } else if (!eddsa.equals(xdh.Cardinal)) {
                        throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
                    }
                    this.configure = edDSA;
                    this.cca_continue = edDSA2;
                    this.Cardinal = xdh;
                    return;
                }
                throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
            } else {
                throw new NullPointerException("ephemeralPrivateKey cannot be null");
            }
        }
    }

    public final byte[] getEncoded() {
        byte[] bArr = this.Cardinal;
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
