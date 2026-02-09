package com.cardinalcommerce.a;

import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.GMSignatureSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;

public final class ISOSignatureSpi implements IESCipher.ECIESwithCipher {
    private KeyAgreementSpi.X25519withSHA256CKDF configure;

    public ISOSignatureSpi(KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF) {
        this.configure = x25519withSHA256CKDF;
    }

    public final class SHA384WithRSAEncryption implements KeyAgreementSpi.CDHwithSHA256KDFAndSharedInfo {
        private boolean cca_continue;
        private KeyPairGeneratorSpi.X448 configure;
        private final configure getInstance = new configure((byte) 0);
        private KeyPairGeneratorSpi.X25519 init;

        public final void cca_continue(byte[] bArr, int i, int i2) {
            this.getInstance.write(bArr, i, i2);
        }

        public final void init(byte b) {
            this.getInstance.write(b);
        }

        public final boolean init(byte[] bArr) {
            KeyPairGeneratorSpi.X25519 x25519;
            if (!this.cca_continue && (x25519 = this.init) != null) {
                return this.getInstance.Cardinal(x25519, bArr);
            }
            throw new IllegalStateException("Ed25519Signer not initialised for verification");
        }

        public final byte[] init() {
            KeyPairGeneratorSpi.X448 x448;
            if (this.cca_continue && (x448 = this.configure) != null) {
                return this.getInstance.init(x448, this.init);
            }
            throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
        }

        static class configure extends ByteArrayOutputStream {
            private configure() {
            }

            /* synthetic */ configure(byte b) {
                this();
            }

            /* access modifiers changed from: package-private */
            public final synchronized byte[] init(KeyPairGeneratorSpi.X448 x448, KeyPairGeneratorSpi.X25519 x25519) {
                byte[] bArr;
                bArr = new byte[64];
                byte[] bArr2 = this.buf;
                int i = this.count;
                byte[] bArr3 = new byte[32];
                if (x25519 == null) {
                    Curve.configure(x448.getInstance, bArr3);
                } else {
                    System.arraycopy(x25519.getInstance, 0, bArr3, 0, 32);
                }
                Curve.getInstance(x448.getInstance, bArr3, bArr2, 0, i, bArr, 0);
                reset();
                return bArr;
            }

            /* access modifiers changed from: package-private */
            public final synchronized boolean Cardinal(KeyPairGeneratorSpi.X25519 x25519, byte[] bArr) {
                byte[] bArr2;
                if (64 != bArr.length) {
                    return false;
                }
                byte[] bArr3 = x25519.getInstance;
                if (bArr3 == null) {
                    bArr2 = null;
                } else {
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    bArr2 = bArr4;
                }
                boolean init = Curve.init(bArr, bArr2, this.buf, this.count);
                reset();
                return init;
            }

            public final synchronized void reset() {
                byte[] bArr = this.buf;
                int i = this.count;
                for (int i2 = 0; i2 < i; i2++) {
                    bArr[i2] = 0;
                }
                this.count = 0;
            }
        }

        public final void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            KeyPairGeneratorSpi.X25519 x25519;
            this.cca_continue = z;
            if (z) {
                KeyPairGeneratorSpi.X448 x448 = (KeyPairGeneratorSpi.X448) sM2withRMD;
                this.configure = x448;
                byte[] bArr = new byte[32];
                Curve.configure(x448.getInstance, bArr);
                x25519 = new KeyPairGeneratorSpi.X25519(bArr, 0);
            } else {
                this.configure = null;
                x25519 = (KeyPairGeneratorSpi.X25519) sM2withRMD;
            }
            this.init = x25519;
            this.getInstance.reset();
        }
    }

    public final class SHA512_224WithRSAEncryption implements KeyAgreementSpi.CDHwithSHA256KDFAndSharedInfo {
        private CipherSpi Cardinal;
        private BCElGamalPublicKey cca_continue;
        private boolean configure;
        private final byte[] getInstance;
        private final Cardinal init = new Cardinal((byte) 0);

        public final void cca_continue(byte[] bArr, int i, int i2) {
            this.init.write(bArr, i, i2);
        }

        public final void init(byte b) {
            this.init.write(b);
        }

        public final boolean init(byte[] bArr) {
            BCElGamalPublicKey bCElGamalPublicKey;
            if (!this.configure && (bCElGamalPublicKey = this.cca_continue) != null) {
                return this.init.Cardinal(bCElGamalPublicKey, this.getInstance, bArr);
            }
            throw new IllegalStateException("Ed448Signer not initialised for verification");
        }

        public final byte[] init() {
            CipherSpi cipherSpi;
            if (this.configure && (cipherSpi = this.Cardinal) != null) {
                return this.init.cca_continue(cipherSpi, this.cca_continue, this.getInstance);
            }
            throw new IllegalStateException("Ed448Signer not initialised for signature generation.");
        }

        static class Cardinal extends ByteArrayOutputStream {
            private Cardinal() {
            }

            /* synthetic */ Cardinal(byte b) {
                this();
            }

            /* access modifiers changed from: package-private */
            public final synchronized byte[] cca_continue(CipherSpi cipherSpi, BCElGamalPublicKey bCElGamalPublicKey, byte[] bArr) {
                byte[] bArr2;
                bArr2 = new byte[114];
                byte[] bArr3 = this.buf;
                int i = this.count;
                byte[] bArr4 = new byte[57];
                if (bCElGamalPublicKey == null) {
                    Base64URL.configure(cipherSpi.Cardinal, bArr4);
                } else {
                    System.arraycopy(bCElGamalPublicKey.configure, 0, bArr4, 0, 57);
                }
                Base64URL.Cardinal(cipherSpi.Cardinal, bArr4, bArr, bArr3, 0, i, bArr2, 0);
                reset();
                return bArr2;
            }

            /* access modifiers changed from: package-private */
            public final synchronized boolean Cardinal(BCElGamalPublicKey bCElGamalPublicKey, byte[] bArr, byte[] bArr2) {
                byte[] bArr3;
                if (114 != bArr2.length) {
                    return false;
                }
                byte[] bArr4 = bCElGamalPublicKey.configure;
                if (bArr4 == null) {
                    bArr3 = null;
                } else {
                    byte[] bArr5 = new byte[bArr4.length];
                    System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
                    bArr3 = bArr5;
                }
                boolean Cardinal = Base64URL.Cardinal(bArr2, bArr3, bArr, this.buf, this.count);
                reset();
                return Cardinal;
            }

            public final synchronized void reset() {
                byte[] bArr = this.buf;
                int i = this.count;
                for (int i2 = 0; i2 < i; i2++) {
                    bArr[i2] = 0;
                }
                this.count = 0;
            }
        }

        public SHA512_224WithRSAEncryption(byte[] bArr) {
            byte[] bArr2;
            if (bArr == null) {
                bArr2 = null;
            } else {
                byte[] bArr3 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                bArr2 = bArr3;
            }
            this.getInstance = bArr2;
        }

        public final void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            BCElGamalPublicKey bCElGamalPublicKey;
            this.configure = z;
            if (z) {
                CipherSpi cipherSpi = (CipherSpi) sM2withRMD;
                this.Cardinal = cipherSpi;
                byte[] bArr = new byte[57];
                Base64URL.configure(cipherSpi.Cardinal, bArr);
                bCElGamalPublicKey = new BCElGamalPublicKey(bArr, 0);
            } else {
                this.Cardinal = null;
                bCElGamalPublicKey = (BCElGamalPublicKey) sM2withRMD;
            }
            this.cca_continue = bCElGamalPublicKey;
            this.init.reset();
        }
    }

    public final class MD5WithRSAEncryption implements GMSignatureSpi.sha256WithSM2 {
        private KeyAgreementSpi.X448withSHA512KDF Cardinal;
        private SecureRandom cca_continue;
        private final DigestSignatureSpi.SHA512 getInstance;

        public MD5WithRSAEncryption() {
            this.getInstance = new PSSSignatureSpi.SHA224withRSA();
        }

        public MD5WithRSAEncryption(DigestSignatureSpi.SHA512 sha512) {
            this.getInstance = sha512;
        }

        private static BigInteger getInstance(BigInteger bigInteger, byte[] bArr) {
            if (bigInteger.bitLength() >= (bArr.length << 3)) {
                return new BigInteger(1, bArr);
            }
            int bitLength = bigInteger.bitLength() / 8;
            byte[] bArr2 = new byte[bitLength];
            System.arraycopy(bArr, 0, bArr2, 0, bitLength);
            return new BigInteger(1, bArr2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void cca_continue(boolean r3, com.cardinalcommerce.a.GMCipherSpi.SM2withRMD r4) {
            /*
                r2 = this;
                r0 = 0
                if (r3 == 0) goto L_0x0015
                boolean r1 = r4 instanceof com.cardinalcommerce.a.DigestSignatureSpi.RIPEMD128
                if (r1 == 0) goto L_0x0012
                com.cardinalcommerce.a.DigestSignatureSpi$RIPEMD128 r4 = (com.cardinalcommerce.a.DigestSignatureSpi.RIPEMD128) r4
                com.cardinalcommerce.a.GMCipherSpi$SM2withRMD r1 = r4.cca_continue
                com.cardinalcommerce.a.KeyAgreementSpi$X448UwithSHA512KDF r1 = (com.cardinalcommerce.a.KeyAgreementSpi.X448UwithSHA512KDF) r1
                r2.Cardinal = r1
                java.security.SecureRandom r4 = r4.Cardinal
                goto L_0x001a
            L_0x0012:
                com.cardinalcommerce.a.KeyAgreementSpi$X448UwithSHA512KDF r4 = (com.cardinalcommerce.a.KeyAgreementSpi.X448UwithSHA512KDF) r4
                goto L_0x0017
            L_0x0015:
                com.cardinalcommerce.a.KeyAgreementSpi$X448withSHA512CKDF r4 = (com.cardinalcommerce.a.KeyAgreementSpi.X448withSHA512CKDF) r4
            L_0x0017:
                r2.Cardinal = r4
                r4 = r0
            L_0x001a:
                if (r3 == 0) goto L_0x0026
                com.cardinalcommerce.a.DigestSignatureSpi$SHA512 r3 = r2.getInstance
                boolean r3 = r3.cca_continue()
                if (r3 != 0) goto L_0x0026
                r3 = 1
                goto L_0x0027
            L_0x0026:
                r3 = 0
            L_0x0027:
                if (r3 != 0) goto L_0x002a
                goto L_0x0032
            L_0x002a:
                if (r4 == 0) goto L_0x002e
                r0 = r4
                goto L_0x0032
            L_0x002e:
                java.security.SecureRandom r0 = com.cardinalcommerce.a.GMCipherSpi.SM2withWhirlpool.configure()
            L_0x0032:
                r2.cca_continue = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.ISOSignatureSpi.MD5WithRSAEncryption.cca_continue(boolean, com.cardinalcommerce.a.GMCipherSpi$SM2withRMD):void");
        }

        public final BigInteger init() {
            return this.Cardinal.configure.init;
        }

        public final BigInteger[] init(byte[] bArr) {
            KeyAgreementSpi.X448withSHA256CKDF x448withSHA256CKDF = this.Cardinal.configure;
            BigInteger bigInteger = x448withSHA256CKDF.init;
            BigInteger instance = getInstance(bigInteger, bArr);
            BigInteger bigInteger2 = ((KeyAgreementSpi.X448UwithSHA512KDF) this.Cardinal).Cardinal;
            if (this.getInstance.cca_continue()) {
                this.getInstance.Cardinal(bigInteger, bigInteger2, bArr);
            } else {
                this.getInstance.getInstance(bigInteger, this.cca_continue);
            }
            BigInteger configure = this.getInstance.configure();
            BigInteger bigInteger3 = x448withSHA256CKDF.Cardinal;
            SecureRandom secureRandom = this.cca_continue;
            if (secureRandom == null) {
                secureRandom = GMCipherSpi.SM2withWhirlpool.configure();
            }
            BigInteger mod = bigInteger3.modPow(configure.add(setCornerRadius.configure(7, secureRandom).add(BigInteger.valueOf(128)).multiply(bigInteger)), x448withSHA256CKDF.configure).mod(bigInteger);
            return new BigInteger[]{mod, configure.modInverse(bigInteger).multiply(instance.add(bigInteger2.multiply(mod))).mod(bigInteger)};
        }

        public final boolean configure(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
            KeyAgreementSpi.X448withSHA256CKDF x448withSHA256CKDF = this.Cardinal.configure;
            BigInteger bigInteger3 = x448withSHA256CKDF.init;
            BigInteger instance = getInstance(bigInteger3, bArr);
            BigInteger valueOf = BigInteger.valueOf(0);
            if (valueOf.compareTo(bigInteger) >= 0 || bigInteger3.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || bigInteger3.compareTo(bigInteger2) <= 0) {
                return false;
            }
            BigInteger modInverse = bigInteger2.modInverse(bigInteger3);
            BigInteger mod = instance.multiply(modInverse).mod(bigInteger3);
            BigInteger mod2 = bigInteger.multiply(modInverse).mod(bigInteger3);
            BigInteger bigInteger4 = x448withSHA256CKDF.configure;
            return x448withSHA256CKDF.Cardinal.modPow(mod, bigInteger4).multiply(((KeyAgreementSpi.X448withSHA512CKDF) this.Cardinal).init.modPow(mod2, bigInteger4)).mod(bigInteger4).mod(bigInteger3).equals(bigInteger);
        }
    }

    public final class RIPEMD160WithRSAEncryption implements GMSignatureSpi.sha256WithSM2 {
        private static final BigInteger Cardinal = BigInteger.valueOf(1);
        private SecureRandom configure;
        private KeyPairGeneratorSpi.Ed448 init;

        public final void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            KeyPairGeneratorSpi.Ed448 ed448;
            if (z) {
                if (sM2withRMD instanceof DigestSignatureSpi.RIPEMD128) {
                    DigestSignatureSpi.RIPEMD128 ripemd128 = (DigestSignatureSpi.RIPEMD128) sM2withRMD;
                    this.configure = ripemd128.Cardinal;
                    sM2withRMD = ripemd128.cca_continue;
                } else {
                    this.configure = GMCipherSpi.SM2withWhirlpool.configure();
                }
                ed448 = (KeyPairGeneratorSpi.EdDSA) sM2withRMD;
            } else {
                ed448 = (KeyPairGeneratorSpi.XDH) sM2withRMD;
            }
            this.init = ed448;
        }

        public final BigInteger init() {
            return this.init.Cardinal.getInstance;
        }

        public final BigInteger[] init(byte[] bArr) {
            KeyFactorySpi.EDDSA eddsa = this.init.Cardinal;
            toJSONString tojsonstring = eddsa.cca_continue;
            BigInteger bigInteger = new BigInteger(1, getBackgroundColor.Cardinal(bArr));
            int instance = tojsonstring.getInstance();
            if (bigInteger.bitLength() > instance) {
                bigInteger = bigInteger.mod(Cardinal.shiftLeft(instance));
            }
            merge init2 = tojsonstring.init(bigInteger);
            if (init2.onCReqSuccess()) {
                init2 = tojsonstring.init(Cardinal);
            }
            BigInteger bigInteger2 = eddsa.getInstance;
            BigInteger bigInteger3 = ((KeyPairGeneratorSpi.EdDSA) this.init).init;
            JSONAware jSONAware = new JSONAware();
            while (true) {
                BigInteger configure2 = setCornerRadius.configure(bigInteger2.bitLength() - 1, this.configure);
                merge onCReqSuccess = jSONAware.cca_continue(eddsa.init, configure2).CardinalRenderType().onCReqSuccess();
                if (!onCReqSuccess.onCReqSuccess()) {
                    BigInteger cca_continue = init2.init(onCReqSuccess).cca_continue();
                    int bitLength = bigInteger2.bitLength() - 1;
                    if (cca_continue.bitLength() > bitLength) {
                        cca_continue = cca_continue.mod(Cardinal.shiftLeft(bitLength));
                    }
                    if (cca_continue.signum() != 0) {
                        BigInteger mod = cca_continue.multiply(bigInteger3).add(configure2).mod(bigInteger2);
                        if (mod.signum() != 0) {
                            return new BigInteger[]{cca_continue, mod};
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

        public final boolean configure(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
            if (bigInteger.signum() > 0 && bigInteger2.signum() > 0) {
                KeyFactorySpi.EDDSA eddsa = this.init.Cardinal;
                BigInteger bigInteger3 = eddsa.getInstance;
                if (bigInteger.compareTo(bigInteger3) < 0 && bigInteger2.compareTo(bigInteger3) < 0) {
                    toJSONString tojsonstring = eddsa.cca_continue;
                    BigInteger bigInteger4 = new BigInteger(1, getBackgroundColor.Cardinal(bArr));
                    int instance = tojsonstring.getInstance();
                    if (bigInteger4.bitLength() > instance) {
                        bigInteger4 = bigInteger4.mod(Cardinal.shiftLeft(instance));
                    }
                    merge init2 = tojsonstring.init(bigInteger4);
                    if (init2.onCReqSuccess()) {
                        init2 = tojsonstring.init(Cardinal);
                    }
                    JSONNavi CardinalRenderType = appendElement.cca_continue(eddsa.init, bigInteger2, ((KeyPairGeneratorSpi.XDH) this.init).configure, bigInteger).CardinalRenderType();
                    if (CardinalRenderType.getString()) {
                        return false;
                    }
                    BigInteger cca_continue = init2.init(CardinalRenderType.onCReqSuccess()).cca_continue();
                    int bitLength = bigInteger3.bitLength() - 1;
                    if (cca_continue.bitLength() > bitLength) {
                        cca_continue = cca_continue.mod(Cardinal.shiftLeft(bitLength));
                    }
                    if (cca_continue.compareTo(bigInteger) == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final class SHA1WithRSAEncryption implements GMSignatureSpi.sha256WithSM2, writeJSONString {
        private SecureRandom Cardinal;
        private final DigestSignatureSpi.SHA512 configure;
        private KeyPairGeneratorSpi.Ed448 getInstance;

        public SHA1WithRSAEncryption() {
            this.configure = new PSSSignatureSpi.SHA224withRSA();
        }

        public SHA1WithRSAEncryption(DigestSignatureSpi.SHA512 sha512) {
            this.configure = sha512;
        }

        private static BigInteger init(BigInteger bigInteger, byte[] bArr) {
            int bitLength = bigInteger.bitLength();
            int length = bArr.length << 3;
            BigInteger bigInteger2 = new BigInteger(1, bArr);
            return bitLength < length ? bigInteger2.shiftRight(length - bitLength) : bigInteger2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void cca_continue(boolean r3, com.cardinalcommerce.a.GMCipherSpi.SM2withRMD r4) {
            /*
                r2 = this;
                r0 = 0
                if (r3 == 0) goto L_0x0015
                boolean r1 = r4 instanceof com.cardinalcommerce.a.DigestSignatureSpi.RIPEMD128
                if (r1 == 0) goto L_0x0012
                com.cardinalcommerce.a.DigestSignatureSpi$RIPEMD128 r4 = (com.cardinalcommerce.a.DigestSignatureSpi.RIPEMD128) r4
                com.cardinalcommerce.a.GMCipherSpi$SM2withRMD r1 = r4.cca_continue
                com.cardinalcommerce.a.KeyPairGeneratorSpi$EdDSA r1 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.EdDSA) r1
                r2.getInstance = r1
                java.security.SecureRandom r4 = r4.Cardinal
                goto L_0x001a
            L_0x0012:
                com.cardinalcommerce.a.KeyPairGeneratorSpi$EdDSA r4 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.EdDSA) r4
                goto L_0x0017
            L_0x0015:
                com.cardinalcommerce.a.KeyPairGeneratorSpi$XDH r4 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.XDH) r4
            L_0x0017:
                r2.getInstance = r4
                r4 = r0
            L_0x001a:
                if (r3 == 0) goto L_0x0026
                com.cardinalcommerce.a.DigestSignatureSpi$SHA512 r3 = r2.configure
                boolean r3 = r3.cca_continue()
                if (r3 != 0) goto L_0x0026
                r3 = 1
                goto L_0x0027
            L_0x0026:
                r3 = 0
            L_0x0027:
                if (r3 != 0) goto L_0x002a
                goto L_0x0032
            L_0x002a:
                if (r4 == 0) goto L_0x002e
                r0 = r4
                goto L_0x0032
            L_0x002e:
                java.security.SecureRandom r0 = com.cardinalcommerce.a.GMCipherSpi.SM2withWhirlpool.configure()
            L_0x0032:
                r2.Cardinal = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.ISOSignatureSpi.SHA1WithRSAEncryption.cca_continue(boolean, com.cardinalcommerce.a.GMCipherSpi$SM2withRMD):void");
        }

        public final BigInteger init() {
            return this.getInstance.Cardinal.getInstance;
        }

        public final BigInteger[] init(byte[] bArr) {
            KeyFactorySpi.EDDSA eddsa = this.getInstance.Cardinal;
            BigInteger bigInteger = eddsa.getInstance;
            BigInteger init = init(bigInteger, bArr);
            BigInteger bigInteger2 = ((KeyPairGeneratorSpi.EdDSA) this.getInstance).init;
            if (this.configure.cca_continue()) {
                this.configure.Cardinal(bigInteger, bigInteger2, bArr);
            } else {
                this.configure.getInstance(bigInteger, this.Cardinal);
            }
            JSONAware jSONAware = new JSONAware();
            while (true) {
                BigInteger configure2 = this.configure.configure();
                BigInteger mod = jSONAware.cca_continue(eddsa.init, configure2).CardinalRenderType().onCReqSuccess().cca_continue().mod(bigInteger);
                if (!mod.equals(getSDKVersion)) {
                    BigInteger mod2 = configure2.modInverse(bigInteger).multiply(init.add(bigInteger2.multiply(mod))).mod(bigInteger);
                    if (!mod2.equals(getSDKVersion)) {
                        return new BigInteger[]{mod, mod2};
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x009d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean configure(byte[] r6, java.math.BigInteger r7, java.math.BigInteger r8) {
            /*
                r5 = this;
                com.cardinalcommerce.a.KeyPairGeneratorSpi$Ed448 r0 = r5.getInstance
                com.cardinalcommerce.a.KeyFactorySpi$EDDSA r0 = r0.Cardinal
                java.math.BigInteger r1 = r0.getInstance
                java.math.BigInteger r6 = init(r1, r6)
                java.math.BigInteger r2 = CardinalRenderType
                int r2 = r7.compareTo(r2)
                r3 = 0
                if (r2 < 0) goto L_0x00c7
                int r2 = r7.compareTo(r1)
                if (r2 < 0) goto L_0x001b
                goto L_0x00c7
            L_0x001b:
                java.math.BigInteger r2 = CardinalRenderType
                int r2 = r8.compareTo(r2)
                if (r2 < 0) goto L_0x00c7
                int r2 = r8.compareTo(r1)
                if (r2 < 0) goto L_0x002b
                goto L_0x00c7
            L_0x002b:
                java.math.BigInteger r8 = r8.modInverse(r1)
                java.math.BigInteger r6 = r6.multiply(r8)
                java.math.BigInteger r6 = r6.mod(r1)
                java.math.BigInteger r8 = r7.multiply(r8)
                java.math.BigInteger r8 = r8.mod(r1)
                com.cardinalcommerce.a.JSONNavi r0 = r0.init
                com.cardinalcommerce.a.KeyPairGeneratorSpi$Ed448 r2 = r5.getInstance
                com.cardinalcommerce.a.KeyPairGeneratorSpi$XDH r2 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.XDH) r2
                com.cardinalcommerce.a.JSONNavi r2 = r2.configure
                com.cardinalcommerce.a.JSONNavi r6 = com.cardinalcommerce.a.appendElement.cca_continue(r0, r6, r2, r8)
                boolean r8 = r6.getString()
                if (r8 == 0) goto L_0x0052
                return r3
            L_0x0052:
                com.cardinalcommerce.a.toJSONString r8 = r6.configure()
                if (r8 == 0) goto L_0x00b2
                java.math.BigInteger r0 = r8.onValidated()
                if (r0 == 0) goto L_0x00b2
                java.math.BigInteger r2 = values
                int r0 = r0.compareTo(r2)
                if (r0 > 0) goto L_0x00b2
                int r0 = r8.valueOf()
                r2 = 1
                if (r0 == r2) goto L_0x0087
                r4 = 2
                if (r0 == r4) goto L_0x007e
                r4 = 3
                if (r0 == r4) goto L_0x007e
                r4 = 4
                if (r0 == r4) goto L_0x007e
                r4 = 6
                if (r0 == r4) goto L_0x0087
                r4 = 7
                if (r0 == r4) goto L_0x0087
                r0 = 0
                goto L_0x008b
            L_0x007e:
                com.cardinalcommerce.a.merge r0 = r6.getInstance((int) r3)
                com.cardinalcommerce.a.merge r0 = r0.getInstance()
                goto L_0x008b
            L_0x0087:
                com.cardinalcommerce.a.merge r0 = r6.getInstance((int) r3)
            L_0x008b:
                if (r0 == 0) goto L_0x00b2
                boolean r4 = r0.onCReqSuccess()
                if (r4 != 0) goto L_0x00b2
                com.cardinalcommerce.a.merge r6 = r6.onValidated()
            L_0x0097:
                boolean r4 = r8.getInstance(r7)
                if (r4 == 0) goto L_0x00b1
                com.cardinalcommerce.a.merge r4 = r8.init((java.math.BigInteger) r7)
                com.cardinalcommerce.a.merge r4 = r4.init((com.cardinalcommerce.a.merge) r0)
                boolean r4 = r4.equals(r6)
                if (r4 == 0) goto L_0x00ac
                return r2
            L_0x00ac:
                java.math.BigInteger r7 = r7.add(r1)
                goto L_0x0097
            L_0x00b1:
                return r3
            L_0x00b2:
                com.cardinalcommerce.a.JSONNavi r6 = r6.CardinalRenderType()
                com.cardinalcommerce.a.merge r6 = r6.onCReqSuccess()
                java.math.BigInteger r6 = r6.cca_continue()
                java.math.BigInteger r6 = r6.mod(r1)
                boolean r6 = r6.equals(r7)
                return r6
            L_0x00c7:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.ISOSignatureSpi.SHA1WithRSAEncryption.configure(byte[], java.math.BigInteger, java.math.BigInteger):boolean");
        }
    }

    public final class SHA224WithRSAEncryption implements GMSignatureSpi.sha256WithSM2 {
        private KeyPairGeneratorSpi.Ed448 Cardinal;
        private SecureRandom cca_continue;

        public final void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            if (!z) {
                this.Cardinal = (KeyPairGeneratorSpi.XDH) sM2withRMD;
            } else if (sM2withRMD instanceof DigestSignatureSpi.RIPEMD128) {
                DigestSignatureSpi.RIPEMD128 ripemd128 = (DigestSignatureSpi.RIPEMD128) sM2withRMD;
                this.cca_continue = ripemd128.Cardinal;
                this.Cardinal = (KeyPairGeneratorSpi.EdDSA) ripemd128.cca_continue;
            } else {
                this.cca_continue = GMCipherSpi.SM2withWhirlpool.configure();
                this.Cardinal = (KeyPairGeneratorSpi.EdDSA) sM2withRMD;
            }
        }

        public final BigInteger init() {
            return this.Cardinal.Cardinal.getInstance;
        }

        public final BigInteger[] init(byte[] bArr) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i != length; i++) {
                bArr2[i] = bArr[(length - 1) - i];
            }
            BigInteger bigInteger = new BigInteger(1, bArr2);
            KeyFactorySpi.EDDSA eddsa = this.Cardinal.Cardinal;
            BigInteger bigInteger2 = eddsa.getInstance;
            BigInteger bigInteger3 = ((KeyPairGeneratorSpi.EdDSA) this.Cardinal).init;
            JSONAware jSONAware = new JSONAware();
            while (true) {
                BigInteger configure = setCornerRadius.configure(bigInteger2.bitLength(), this.cca_continue);
                if (!configure.equals(writeJSONString.getSDKVersion)) {
                    BigInteger mod = jSONAware.cca_continue(eddsa.init, configure).CardinalRenderType().onCReqSuccess().cca_continue().mod(bigInteger2);
                    if (!mod.equals(writeJSONString.getSDKVersion)) {
                        BigInteger mod2 = configure.multiply(bigInteger).add(bigInteger3.multiply(mod)).mod(bigInteger2);
                        if (!mod2.equals(writeJSONString.getSDKVersion)) {
                            return new BigInteger[]{mod, mod2};
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

        public final boolean configure(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i != length; i++) {
                bArr2[i] = bArr[(length - 1) - i];
            }
            BigInteger bigInteger3 = new BigInteger(1, bArr2);
            BigInteger bigInteger4 = this.Cardinal.Cardinal.getInstance;
            if (bigInteger.compareTo(writeJSONString.CardinalRenderType) < 0 || bigInteger.compareTo(bigInteger4) >= 0 || bigInteger2.compareTo(writeJSONString.CardinalRenderType) < 0 || bigInteger2.compareTo(bigInteger4) >= 0) {
                return false;
            }
            BigInteger modInverse = bigInteger3.modInverse(bigInteger4);
            JSONNavi CardinalRenderType = appendElement.cca_continue(this.Cardinal.Cardinal.init, bigInteger2.multiply(modInverse).mod(bigInteger4), ((KeyPairGeneratorSpi.XDH) this.Cardinal).configure, bigInteger4.subtract(bigInteger).multiply(modInverse).mod(bigInteger4)).CardinalRenderType();
            if (CardinalRenderType.getString()) {
                return false;
            }
            return CardinalRenderType.onCReqSuccess().cca_continue().mod(bigInteger4).equals(bigInteger);
        }
    }

    public final class SHA256WithRSAEncryption implements GMSignatureSpi.sha256WithSM2 {
        private KeyPairGeneratorSpi.Ed448 getInstance;
        private SecureRandom init;

        public final void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            if (!z) {
                this.getInstance = (KeyPairGeneratorSpi.XDH) sM2withRMD;
            } else if (sM2withRMD instanceof DigestSignatureSpi.RIPEMD128) {
                DigestSignatureSpi.RIPEMD128 ripemd128 = (DigestSignatureSpi.RIPEMD128) sM2withRMD;
                this.init = ripemd128.Cardinal;
                this.getInstance = (KeyPairGeneratorSpi.EdDSA) ripemd128.cca_continue;
            } else {
                this.init = GMCipherSpi.SM2withWhirlpool.configure();
                this.getInstance = (KeyPairGeneratorSpi.EdDSA) sM2withRMD;
            }
        }

        public final BigInteger init() {
            return this.getInstance.Cardinal.getInstance;
        }

        public final BigInteger[] init(byte[] bArr) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i != length; i++) {
                bArr2[i] = bArr[(length - 1) - i];
            }
            BigInteger bigInteger = new BigInteger(1, bArr2);
            KeyFactorySpi.EDDSA eddsa = this.getInstance.Cardinal;
            BigInteger bigInteger2 = eddsa.getInstance;
            BigInteger bigInteger3 = ((KeyPairGeneratorSpi.EdDSA) this.getInstance).init;
            JSONAware jSONAware = new JSONAware();
            while (true) {
                BigInteger configure = setCornerRadius.configure(bigInteger2.bitLength(), this.init);
                if (!configure.equals(writeJSONString.getSDKVersion)) {
                    BigInteger mod = jSONAware.cca_continue(eddsa.init, configure).CardinalRenderType().onCReqSuccess().cca_continue().mod(bigInteger2);
                    if (!mod.equals(writeJSONString.getSDKVersion)) {
                        BigInteger mod2 = configure.multiply(bigInteger).add(bigInteger3.multiply(mod)).mod(bigInteger2);
                        if (!mod2.equals(writeJSONString.getSDKVersion)) {
                            return new BigInteger[]{mod, mod2};
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

        public final boolean configure(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i != length; i++) {
                bArr2[i] = bArr[(length - 1) - i];
            }
            BigInteger bigInteger3 = new BigInteger(1, bArr2);
            BigInteger bigInteger4 = this.getInstance.Cardinal.getInstance;
            if (bigInteger.compareTo(writeJSONString.CardinalRenderType) < 0 || bigInteger.compareTo(bigInteger4) >= 0 || bigInteger2.compareTo(writeJSONString.CardinalRenderType) < 0 || bigInteger2.compareTo(bigInteger4) >= 0) {
                return false;
            }
            BigInteger modInverse = bigInteger3.modInverse(bigInteger4);
            JSONNavi CardinalRenderType = appendElement.cca_continue(this.getInstance.Cardinal.init, bigInteger2.multiply(modInverse).mod(bigInteger4), ((KeyPairGeneratorSpi.XDH) this.getInstance).configure, bigInteger4.subtract(bigInteger).multiply(modInverse).mod(bigInteger4)).CardinalRenderType();
            if (CardinalRenderType.getString()) {
                return false;
            }
            return CardinalRenderType.onCReqSuccess().cca_continue().mod(bigInteger4).equals(bigInteger);
        }
    }

    public final class SHA512WithRSAEncryption implements DigestSignatureSpi.SHA512 {
        private static final BigInteger getInstance = BigInteger.valueOf(0);
        private final byte[] Cardinal;
        private BigInteger cca_continue;
        private final BCECGOST3410_2012PrivateKey configure;
        private final byte[] init;

        private BigInteger getInstance(byte[] bArr) {
            BigInteger bigInteger = new BigInteger(1, bArr);
            return (bArr.length << 3) > this.cca_continue.bitLength() ? bigInteger.shiftRight((bArr.length << 3) - this.cca_continue.bitLength()) : bigInteger;
        }

        public final boolean cca_continue() {
            return true;
        }

        public final void getInstance(BigInteger bigInteger, SecureRandom secureRandom) {
            throw new IllegalStateException("Operation not supported");
        }

        public SHA512WithRSAEncryption(IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
            BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = new BCECGOST3410_2012PrivateKey(eCIESwithAESCBC);
            this.configure = bCECGOST3410_2012PrivateKey;
            this.init = new byte[bCECGOST3410_2012PrivateKey.cca_continue];
            this.Cardinal = new byte[bCECGOST3410_2012PrivateKey.cca_continue];
        }

        public final void Cardinal(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
            this.cca_continue = bigInteger;
            byte[] bArr2 = this.init;
            for (int i = 0; i < bArr2.length; i++) {
                bArr2[i] = 1;
            }
            byte[] bArr3 = this.Cardinal;
            for (int i2 = 0; i2 < bArr3.length; i2++) {
                bArr3[i2] = 0;
            }
            int cca_continue2 = setCornerRadius.cca_continue(bigInteger);
            byte[] bArr4 = new byte[cca_continue2];
            byte[] configure2 = setCornerRadius.configure(bigInteger2);
            System.arraycopy(configure2, 0, bArr4, cca_continue2 - configure2.length, configure2.length);
            byte[] bArr5 = new byte[cca_continue2];
            BigInteger instance = getInstance(bArr);
            if (instance.compareTo(bigInteger) >= 0) {
                instance = instance.subtract(bigInteger);
            }
            byte[] configure3 = setCornerRadius.configure(instance);
            System.arraycopy(configure3, 0, bArr5, cca_continue2 - configure3.length, configure3.length);
            this.configure.configure(new CipherSpi.ISO9796d1Padding(this.Cardinal));
            BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = this.configure;
            byte[] bArr6 = this.init;
            bCECGOST3410_2012PrivateKey.getInstance.init(bArr6, 0, bArr6.length);
            this.configure.getInstance.cca_continue((byte) 0);
            this.configure.getInstance.init(bArr4, 0, cca_continue2);
            this.configure.getInstance.init(bArr5, 0, cca_continue2);
            this.configure.getInstance(this.Cardinal);
            this.configure.configure(new CipherSpi.ISO9796d1Padding(this.Cardinal));
            BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey2 = this.configure;
            byte[] bArr7 = this.init;
            bCECGOST3410_2012PrivateKey2.getInstance.init(bArr7, 0, bArr7.length);
            this.configure.getInstance(this.init);
            BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey3 = this.configure;
            byte[] bArr8 = this.init;
            bCECGOST3410_2012PrivateKey3.getInstance.init(bArr8, 0, bArr8.length);
            this.configure.getInstance.cca_continue((byte) 1);
            this.configure.getInstance.init(bArr4, 0, cca_continue2);
            this.configure.getInstance.init(bArr5, 0, cca_continue2);
            this.configure.getInstance(this.Cardinal);
            this.configure.configure(new CipherSpi.ISO9796d1Padding(this.Cardinal));
            BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey4 = this.configure;
            byte[] bArr9 = this.init;
            bCECGOST3410_2012PrivateKey4.getInstance.init(bArr9, 0, bArr9.length);
            this.configure.getInstance(this.init);
        }

        public final BigInteger configure() {
            int cca_continue2 = setCornerRadius.cca_continue(this.cca_continue);
            byte[] bArr = new byte[cca_continue2];
            while (true) {
                int i = 0;
                while (i < cca_continue2) {
                    BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = this.configure;
                    byte[] bArr2 = this.init;
                    bCECGOST3410_2012PrivateKey.getInstance.init(bArr2, 0, bArr2.length);
                    this.configure.getInstance(this.init);
                    int min = Math.min(cca_continue2 - i, this.init.length);
                    System.arraycopy(this.init, 0, bArr, i, min);
                    i += min;
                }
                BigInteger instance = getInstance(bArr);
                if (instance.compareTo(getInstance) > 0 && instance.compareTo(this.cca_continue) < 0) {
                    return instance;
                }
                BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey2 = this.configure;
                byte[] bArr3 = this.init;
                bCECGOST3410_2012PrivateKey2.getInstance.init(bArr3, 0, bArr3.length);
                this.configure.getInstance.cca_continue((byte) 0);
                this.configure.getInstance(this.Cardinal);
                this.configure.configure(new CipherSpi.ISO9796d1Padding(this.Cardinal));
                BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey3 = this.configure;
                byte[] bArr4 = this.init;
                bCECGOST3410_2012PrivateKey3.getInstance.init(bArr4, 0, bArr4.length);
                this.configure.getInstance(this.init);
            }
        }
    }

    public final class SHA512_256WithRSAEncryption implements GMSignatureSpi.sha256WithSM2 {
        private BCGOST3410PublicKey Cardinal;
        private SecureRandom init;

        public final void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            if (!z) {
                this.Cardinal = (BCRSAPrivateKey) sM2withRMD;
            } else if (sM2withRMD instanceof DigestSignatureSpi.RIPEMD128) {
                DigestSignatureSpi.RIPEMD128 ripemd128 = (DigestSignatureSpi.RIPEMD128) sM2withRMD;
                this.init = ripemd128.Cardinal;
                this.Cardinal = (GOSTUtil) ripemd128.cca_continue;
            } else {
                this.init = GMCipherSpi.SM2withWhirlpool.configure();
                this.Cardinal = (GOSTUtil) sM2withRMD;
            }
        }

        public final BigInteger init() {
            return this.Cardinal.Cardinal.configure;
        }

        public final BigInteger[] init(byte[] bArr) {
            BigInteger configure;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i != length; i++) {
                bArr2[i] = bArr[(length - 1) - i];
            }
            BigInteger bigInteger = new BigInteger(1, bArr2);
            CipherSpi.PKCS1v1_5Padding pKCS1v1_5Padding = this.Cardinal.Cardinal;
            do {
                configure = setCornerRadius.configure(pKCS1v1_5Padding.configure.bitLength(), this.init);
            } while (configure.compareTo(pKCS1v1_5Padding.configure) >= 0);
            BigInteger mod = pKCS1v1_5Padding.Cardinal.modPow(configure, pKCS1v1_5Padding.cca_continue).mod(pKCS1v1_5Padding.configure);
            return new BigInteger[]{mod, configure.multiply(bigInteger).add(((GOSTUtil) this.Cardinal).configure.multiply(mod)).mod(pKCS1v1_5Padding.configure)};
        }

        public final boolean configure(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i != length; i++) {
                bArr2[i] = bArr[(length - 1) - i];
            }
            BigInteger bigInteger3 = new BigInteger(1, bArr2);
            CipherSpi.PKCS1v1_5Padding pKCS1v1_5Padding = this.Cardinal.Cardinal;
            BigInteger valueOf = BigInteger.valueOf(0);
            if (valueOf.compareTo(bigInteger) >= 0 || pKCS1v1_5Padding.configure.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || pKCS1v1_5Padding.configure.compareTo(bigInteger2) <= 0) {
                return false;
            }
            BigInteger modPow = bigInteger3.modPow(pKCS1v1_5Padding.configure.subtract(new BigInteger("2")), pKCS1v1_5Padding.configure);
            return pKCS1v1_5Padding.Cardinal.modPow(bigInteger2.multiply(modPow).mod(pKCS1v1_5Padding.configure), pKCS1v1_5Padding.cca_continue).multiply(((BCRSAPrivateKey) this.Cardinal).getInstance.modPow(pKCS1v1_5Padding.configure.subtract(bigInteger).multiply(modPow).mod(pKCS1v1_5Padding.configure), pKCS1v1_5Padding.cca_continue)).mod(pKCS1v1_5Padding.cca_continue).mod(pKCS1v1_5Padding.configure).equals(bigInteger);
        }
    }

    public final class WhirlpoolWithRSAEncryption implements GMSignatureSpi.sha256WithSM2 {
        private boolean configure;
        private SecureRandom getInstance;
        private KeyPairGeneratorSpi.Ed448 init;

        public final void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            this.configure = z;
            if (!z) {
                this.init = (KeyPairGeneratorSpi.XDH) sM2withRMD;
            } else if (sM2withRMD instanceof DigestSignatureSpi.RIPEMD128) {
                DigestSignatureSpi.RIPEMD128 ripemd128 = (DigestSignatureSpi.RIPEMD128) sM2withRMD;
                this.getInstance = ripemd128.Cardinal;
                this.init = (KeyPairGeneratorSpi.EdDSA) ripemd128.cca_continue;
            } else {
                this.getInstance = GMCipherSpi.SM2withWhirlpool.configure();
                this.init = (KeyPairGeneratorSpi.EdDSA) sM2withRMD;
            }
        }

        public final BigInteger init() {
            return this.init.Cardinal.getInstance;
        }

        public final BigInteger[] init(byte[] bArr) {
            PSSSignatureSpi.SHA256withRSA init2;
            BigInteger mod;
            if (this.configure) {
                BigInteger bigInteger = this.init.Cardinal.getInstance;
                int bitLength = bigInteger.bitLength();
                BigInteger bigInteger2 = new BigInteger(1, bArr);
                int bitLength2 = bigInteger2.bitLength();
                KeyPairGeneratorSpi.EdDSA edDSA = (KeyPairGeneratorSpi.EdDSA) this.init;
                if (bitLength2 <= bitLength) {
                    do {
                        SignatureSpi.ecNR224 ecnr224 = new SignatureSpi.ecNR224();
                        ecnr224.getInstance(new KeyPairGeneratorSpi.Ed25519(edDSA.Cardinal, this.getInstance));
                        init2 = ecnr224.init();
                        mod = ((KeyPairGeneratorSpi.XDH) init2.getInstance).configure.onCReqSuccess().cca_continue().add(bigInteger2).mod(bigInteger);
                    } while (mod.equals(writeJSONString.getSDKVersion));
                    return new BigInteger[]{mod, ((KeyPairGeneratorSpi.EdDSA) init2.init).init.subtract(mod.multiply(edDSA.init)).mod(bigInteger)};
                }
                throw new GMSignatureSpi("input too large for ECNR key.");
            }
            throw new IllegalStateException("not initialised for signing");
        }

        public final boolean configure(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
            if (!this.configure) {
                KeyPairGeneratorSpi.XDH xdh = (KeyPairGeneratorSpi.XDH) this.init;
                BigInteger bigInteger3 = xdh.Cardinal.getInstance;
                int bitLength = bigInteger3.bitLength();
                BigInteger bigInteger4 = new BigInteger(1, bArr);
                if (bigInteger4.bitLength() > bitLength) {
                    throw new GMSignatureSpi("input too large for ECNR key.");
                } else if (bigInteger.compareTo(writeJSONString.CardinalRenderType) < 0 || bigInteger.compareTo(bigInteger3) >= 0 || bigInteger2.compareTo(writeJSONString.getSDKVersion) < 0 || bigInteger2.compareTo(bigInteger3) >= 0) {
                    return false;
                } else {
                    JSONNavi CardinalRenderType = appendElement.cca_continue(xdh.Cardinal.init, bigInteger2, xdh.configure, bigInteger).CardinalRenderType();
                    if (CardinalRenderType.getString()) {
                        return false;
                    }
                    return bigInteger.subtract(CardinalRenderType.onCReqSuccess().cca_continue()).mod(bigInteger3).equals(bigInteger4);
                }
            } else {
                throw new IllegalStateException("not initialised for verifying");
            }
        }
    }

    public final setCCAImageUri getInstance(InputStream inputStream) throws IOException {
        int bitLength = (this.configure.Cardinal.bitLength() + 7) / 8;
        byte[] bArr = new byte[bitLength];
        setHeadingTextFontSize.Cardinal(inputStream, bArr, 0, bitLength);
        return new KeyAgreementSpi.X25519withSHA256KDF(new BigInteger(1, bArr), this.configure);
    }
}
