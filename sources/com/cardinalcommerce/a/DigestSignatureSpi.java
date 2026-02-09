package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;

public final class DigestSignatureSpi implements GMCipherSpi.SM2withRMD {
    public byte[] configure;
    public GMCipherSpi.SM2withRMD getInstance;

    public final class MD2 implements GMCipherSpi.SM2withRMD {
        public GMCipherSpi.SM2withRMD Cardinal;
        public byte[] cca_continue;

        public MD2(GMCipherSpi.SM2withRMD sM2withRMD, byte[] bArr) {
            this(sM2withRMD, bArr, bArr.length);
        }

        private MD2(GMCipherSpi.SM2withRMD sM2withRMD, byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            this.cca_continue = bArr2;
            this.Cardinal = sM2withRMD;
            System.arraycopy(bArr, 0, bArr2, 0, i);
        }
    }

    public final class MD4 implements GMCipherSpi.SM2withRMD {
        public GMCipherSpi.SM2withRMD cca_continue;
        public byte[] init;

        public MD4(GMCipherSpi.SM2withRMD sM2withRMD, byte[] bArr) {
            this(sM2withRMD, bArr, bArr.length);
        }

        private MD4(GMCipherSpi.SM2withRMD sM2withRMD, byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            this.init = bArr2;
            this.cca_continue = sM2withRMD;
            System.arraycopy(bArr, 0, bArr2, 0, i);
        }
    }

    public final class MD5 implements GMCipherSpi.SM2withRMD {
        public SHA256 Cardinal;
    }

    public final class RIPEMD128 implements GMCipherSpi.SM2withRMD {
        public SecureRandom Cardinal;
        public GMCipherSpi.SM2withRMD cca_continue;

        public RIPEMD128(GMCipherSpi.SM2withRMD sM2withRMD, SecureRandom secureRandom) {
            this.Cardinal = secureRandom;
            this.cca_continue = sM2withRMD;
        }
    }

    public final class RIPEMD256 extends SHA256 {
        public BigInteger Cardinal;
        public BigInteger cleanup;
        public BigInteger configure;
        public BigInteger getWarnings;
        public BigInteger init;
        public BigInteger onValidated;

        public RIPEMD256(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
            super(true, bigInteger, bigInteger3);
            this.Cardinal = bigInteger2;
            this.init = bigInteger4;
            this.configure = bigInteger5;
            this.cleanup = bigInteger6;
            this.onValidated = bigInteger7;
            this.getWarnings = bigInteger8;
        }
    }

    public final class SHA1 extends appendElement {
        public SHA1(SecureRandom secureRandom) {
            super(secureRandom, 255);
        }
    }

    public final class SHA224 extends appendElement {
        public int getInstance;
        public BigInteger init;

        public SHA224(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
            super(secureRandom, i);
            if (i < 12) {
                throw new IllegalArgumentException("key strength too small");
            } else if (bigInteger.testBit(0)) {
                this.init = bigInteger;
                this.getInstance = i2;
            } else {
                throw new IllegalArgumentException("public exponent cannot be even");
            }
        }
    }

    public final class SHA3_256 extends appendElement {
        public SHA3_256(SecureRandom secureRandom) {
            super(secureRandom, 448);
        }
    }

    public interface SHA512 {
        void Cardinal(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr);

        boolean cca_continue();

        BigInteger configure();

        void getInstance(BigInteger bigInteger, SecureRandom secureRandom);
    }

    public final class SHA512_224 implements GMCipherSpi.SM2withRMD {
        public setCCAImageUri getInstance;
        public setCCAImageUri init;

        public SHA512_224(setCCAImageUri setccaimageuri, setCCAImageUri setccaimageuri2) {
            if (setccaimageuri == null) {
                throw new NullPointerException("staticPublicKey cannot be null");
            } else if (!(setccaimageuri instanceof SHA3_512) && !(setccaimageuri instanceof SHA3_224)) {
                throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
            } else if (setccaimageuri2 == null) {
                throw new NullPointerException("ephemeralPublicKey cannot be null");
            } else if (setccaimageuri.getClass().isAssignableFrom(setccaimageuri2.getClass())) {
                this.getInstance = setccaimageuri;
                this.init = setccaimageuri2;
            } else {
                throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
            }
        }
    }

    public interface noneRSA {
        byte[] configure(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) throws IOException;

        BigInteger[] getInstance(BigInteger bigInteger, byte[] bArr) throws IOException;
    }

    public DigestSignatureSpi(GMCipherSpi.SM2withRMD sM2withRMD, byte[] bArr) {
        this.getInstance = sM2withRMD;
        this.configure = bArr;
    }

    public final class RIPEMD160 extends setCCAImageUri {
        public final byte[] getInstance;

        public RIPEMD160(byte[] bArr) {
            super(true);
            byte[] bArr2 = new byte[32];
            this.getInstance = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, 32);
        }

        public RIPEMD160(SecureRandom secureRandom) {
            super(true);
            byte[] bArr = new byte[32];
            this.getInstance = bArr;
            secureRandom.nextBytes(bArr);
            bArr[0] = (byte) (bArr[0] & 248);
            byte b = (byte) (bArr[31] & Byte.MAX_VALUE);
            bArr[31] = b;
            bArr[31] = (byte) (b | SignedBytes.MAX_POWER_OF_TWO);
        }

        public final byte[] getEncoded() {
            byte[] bArr = this.getInstance;
            if (bArr == null) {
                return null;
            }
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
    }

    public class SHA256 extends setCCAImageUri {
        private static final BigInteger Cardinal = BigInteger.valueOf(1);
        private static final BigInteger configure = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
        public BigInteger cca_continue;
        public BigInteger getInstance;

        public SHA256(boolean z, BigInteger bigInteger, BigInteger bigInteger2) {
            super(z);
            if (!z && (bigInteger2.intValue() & 1) == 0) {
                throw new IllegalArgumentException("RSA publicExponent is even");
            } else if ((bigInteger.intValue() & 1) == 0) {
                throw new IllegalArgumentException("RSA modulus is even");
            } else if (getTextColor.getInstance("com.cardinalcommerce.dependencies.internal.bouncycastle.rsa.allow_unsafe_mod") || bigInteger.gcd(configure).equals(Cardinal)) {
                this.getInstance = bigInteger;
                this.cca_continue = bigInteger2;
            } else {
                throw new IllegalArgumentException("RSA modulus has a small prime factor");
            }
        }
    }

    public final class SHA384 implements GMCipherSpi.SM2withRMD {
        private setCCAImageUri Cardinal;
        public setCCAImageUri cca_continue;
        public setCCAImageUri configure;

        public SHA384(setCCAImageUri setccaimageuri, setCCAImageUri setccaimageuri2, setCCAImageUri setccaimageuri3) {
            if (setccaimageuri != null) {
                boolean z = setccaimageuri instanceof SHA3_384;
                if (!z && !(setccaimageuri instanceof RIPEMD160)) {
                    throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
                } else if (setccaimageuri2 == null) {
                    throw new NullPointerException("ephemeralPrivateKey cannot be null");
                } else if (setccaimageuri.getClass().isAssignableFrom(setccaimageuri2.getClass())) {
                    if (setccaimageuri3 == null) {
                        if (setccaimageuri2 instanceof SHA3_384) {
                            byte[] bArr = new byte[56];
                            ConcatKDF.cca_continue(((SHA3_384) setccaimageuri2).cca_continue, 0, bArr, 0);
                            setccaimageuri3 = new SHA3_512(bArr, 0);
                        } else {
                            byte[] bArr2 = new byte[32];
                            ECKey.Cardinal(((RIPEMD160) setccaimageuri2).getInstance, 0, bArr2, 0);
                            setccaimageuri3 = new SHA3_224(bArr2, 0);
                        }
                    } else if ((setccaimageuri3 instanceof SHA3_512) && !z) {
                        throw new IllegalArgumentException("ephemeral public key has different domain parameters");
                    } else if ((setccaimageuri3 instanceof SHA3_224) && !(setccaimageuri instanceof RIPEMD160)) {
                        throw new IllegalArgumentException("ephemeral public key has different domain parameters");
                    }
                    this.configure = setccaimageuri;
                    this.cca_continue = setccaimageuri2;
                    this.Cardinal = setccaimageuri3;
                } else {
                    throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
                }
            } else {
                throw new NullPointerException("staticPrivateKey cannot be null");
            }
        }
    }

    public final class SHA3_224 extends setCCAImageUri {
        public final byte[] getInstance;

        public SHA3_224(byte[] bArr, int i) {
            super(false);
            byte[] bArr2 = new byte[32];
            this.getInstance = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, 32);
        }

        public final byte[] getEncoded() {
            byte[] bArr = this.getInstance;
            if (bArr == null) {
                return null;
            }
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
    }

    public final class SHA3_384 extends setCCAImageUri {
        public final byte[] cca_continue;

        public SHA3_384(byte[] bArr) {
            super(true);
            byte[] bArr2 = new byte[56];
            this.cca_continue = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, 56);
        }

        public SHA3_384(SecureRandom secureRandom) {
            super(true);
            byte[] bArr = new byte[56];
            this.cca_continue = bArr;
            secureRandom.nextBytes(bArr);
            bArr[0] = (byte) (bArr[0] & 252);
            bArr[55] = (byte) (bArr[55] | 128);
        }

        public final byte[] getEncoded() {
            byte[] bArr = this.cca_continue;
            if (bArr == null) {
                return null;
            }
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        public final SHA3_512 getInstance() {
            byte[] bArr = new byte[56];
            ConcatKDF.cca_continue(this.cca_continue, 0, bArr, 0);
            return new SHA3_512(bArr, 0);
        }
    }

    public final class SHA3_512 extends setCCAImageUri {
        public final byte[] Cardinal;

        public SHA3_512(byte[] bArr, int i) {
            super(false);
            byte[] bArr2 = new byte[56];
            this.Cardinal = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, 56);
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

    public final class SHA512_256 implements IESCipher.ECIESwithCipher {
        private KeyFactorySpi.EDDSA init;

        public SHA512_256(KeyFactorySpi.EDDSA eddsa) {
            this.init = eddsa;
        }

        public final setCCAImageUri getInstance(InputStream inputStream) throws IOException {
            byte[] bArr;
            int read = inputStream.read();
            if (read != 0) {
                if (read == 2 || read == 3) {
                    bArr = new byte[(((this.init.cca_continue.getInstance() + 7) / 8) + 1)];
                } else if (read == 4 || read == 6 || read == 7) {
                    bArr = new byte[((((this.init.cca_continue.getInstance() + 7) / 8) * 2) + 1)];
                } else {
                    throw new IOException(new StringBuilder("Sender's public key has invalid point encoding 0x").append(Integer.toString(read, 16)).toString());
                }
                bArr[0] = (byte) read;
                setHeadingTextFontSize.Cardinal(inputStream, bArr, 1, bArr.length - 1);
                return new KeyPairGeneratorSpi.XDH(this.init.cca_continue.cca_continue(bArr), this.init);
            }
            throw new IOException("Sender's public key invalid.");
        }
    }
}
