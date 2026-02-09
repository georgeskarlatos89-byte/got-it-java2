package com.cardinalcommerce.a;

import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X509;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.security.spec.DSAParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.objectweb.asm.Opcodes;

public final class PSSSignatureSpi implements KeyAgreementSpi.CDHwithSHA256KDFAndSharedInfo {
    private int Cardinal = Opcodes.NEWARRAY;
    private byte[] CardinalError;
    private IESCipher.ECIESwithAESCBC cca_continue;
    private byte[] cleanup;
    private byte[] configure;
    private GMCipherSpi.SM2withBlake2b getInstance;
    private byte[] getSDKVersion;
    private boolean getWarnings;
    private int init;
    private byte[] onCReqSuccess;
    private int onValidated;

    public final class SHA224withRSA implements DigestSignatureSpi.SHA512 {
        private static final BigInteger init = BigInteger.valueOf(0);
        private BigInteger Cardinal;
        private SecureRandom getInstance;

        public final void Cardinal(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
            throw new IllegalStateException("Operation not supported");
        }

        public final boolean cca_continue() {
            return false;
        }

        public final BigInteger configure() {
            int bitLength = this.Cardinal.bitLength();
            while (true) {
                BigInteger configure = setCornerRadius.configure(bitLength, this.getInstance);
                if (!configure.equals(init) && configure.compareTo(this.Cardinal) < 0) {
                    return configure;
                }
            }
        }

        public final void getInstance(BigInteger bigInteger, SecureRandom secureRandom) {
            this.Cardinal = bigInteger;
            this.getInstance = secureRandom;
        }
    }

    public final class SHA3_512withRSA {
        public final ByteArrayOutputStream configure = new ByteArrayOutputStream();

        public final void configure(long j) {
            this.configure.write((int) ((j >>> 24) & 255));
            this.configure.write((int) ((j >>> 16) & 255));
            this.configure.write((int) ((j >>> 8) & 255));
            this.configure.write((int) (j & 255));
        }
    }

    public interface SHA512_224withRSA {
        boolean Cardinal(String str, String str2);

        void cca_continue(ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter);

        void cca_continue(String str, Map<String, String> map);

        void configure(String str, String str2);

        void init(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2);
    }

    public interface SHA512_256withRSA {
        X509CertificateObject cca_continue();

        DSAParameterSpec cca_continue(int i);

        DHParameterSpec configure(int i);

        Map getInstance();

        Set init();
    }

    public final class SHA512withRSA {
        public int cca_continue = 0;
        public final byte[] init;

        public SHA512withRSA(byte[] bArr) {
            this.init = bArr;
        }

        public SHA512withRSA(byte[] bArr, byte[] bArr2) {
            int i = 0;
            this.init = bArr2;
            while (i != bArr.length) {
                if (bArr[i] == bArr2[i]) {
                    i++;
                } else {
                    throw new IllegalArgumentException("magic-number incorrect");
                }
            }
            this.cca_continue += bArr.length;
        }

        public final BigInteger Cardinal() {
            int configure = configure();
            int i = this.cca_continue;
            int i2 = i + configure;
            byte[] bArr = this.init;
            if (i2 <= bArr.length) {
                byte[] bArr2 = new byte[configure];
                System.arraycopy(bArr, i, bArr2, 0, configure);
                this.cca_continue += configure;
                return new BigInteger(1, bArr2);
            }
            throw new IllegalArgumentException("not enough data for big num");
        }

        public final int configure() {
            int i = this.cca_continue;
            int i2 = i + 4;
            byte[] bArr = this.init;
            if (i2 <= bArr.length) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                byte b = ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i3] & 255) << Ascii.DLE);
                int i5 = i4 + 1;
                byte b2 = b | ((bArr[i4] & 255) << 8);
                this.cca_continue = i5 + 1;
                return b2 | (bArr[i5] & 255);
            }
            throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
        }

        public final byte[] getInstance() {
            int configure = configure();
            if (configure == 0) {
                return new byte[0];
            }
            int i = this.cca_continue;
            int i2 = i + configure;
            byte[] bArr = this.init;
            if (i2 <= bArr.length) {
                int i3 = configure + i;
                this.cca_continue = i3;
                return getBackgroundColor.cca_continue(bArr, i, i3);
            }
            throw new IllegalArgumentException("not enough data for string");
        }
    }

    public PSSSignatureSpi(GMCipherSpi.SM2withBlake2b sM2withBlake2b, IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
        this.getInstance = sM2withBlake2b;
        this.cca_continue = eCIESwithAESCBC;
    }

    public final void cca_continue(byte[] bArr, int i, int i2) {
        while (i2 > 0 && this.onValidated < this.onCReqSuccess.length) {
            init(bArr[i]);
            i++;
            i2--;
        }
        this.cca_continue.init(bArr, i, i2);
        this.onValidated += i2;
    }

    public final void init(byte b) {
        this.cca_continue.cca_continue(b);
        int i = this.onValidated;
        byte[] bArr = this.onCReqSuccess;
        if (i < bArr.length) {
            bArr[i] = b;
        }
        this.onValidated = i + 1;
    }

    public final class NullPssDigest {
        private static final Map<String, Integer> init;

        public static Integer getInstance(IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
            return init.get(eCIESwithAESCBC.configure());
        }

        static {
            HashMap hashMap = new HashMap();
            hashMap.put("RIPEMD128", 13004);
            hashMap.put("RIPEMD160", 12748);
            hashMap.put("SHA-1", 13260);
            hashMap.put("SHA-224", 14540);
            hashMap.put("SHA-256", 13516);
            hashMap.put("SHA-384", 14028);
            hashMap.put("SHA-512", 13772);
            hashMap.put("SHA-512/224", 14796);
            hashMap.put("SHA-512/256", 15052);
            hashMap.put("Whirlpool", 14284);
            init = Collections.unmodifiableMap(hashMap);
        }
    }

    public final class PSSwithRSA implements KeyAgreementSpi.CDHwithSHA256KDFAndSharedInfo {
        public IESCipher.ECIESwithAESCBC Cardinal;
        private byte CardinalEnvironment;
        private byte[] CardinalRenderType;
        private int cca_continue;
        private boolean cleanup = false;
        private IESCipher.ECIESwithAESCBC configure;
        private SecureRandom getInstance;
        private byte[] getSDKVersion;
        private int getWarnings;
        private GMCipherSpi.SM2withBlake2b init;
        private int onCReqSuccess;
        private int onValidated;
        private byte[] values;

        public PSSwithRSA(GMCipherSpi.SM2withBlake2b sM2withBlake2b, IESCipher.ECIESwithAESCBC eCIESwithAESCBC, IESCipher.ECIESwithAESCBC eCIESwithAESCBC2, int i, byte b) {
            this.init = sM2withBlake2b;
            this.Cardinal = eCIESwithAESCBC;
            this.configure = eCIESwithAESCBC2;
            this.cca_continue = eCIESwithAESCBC.getInstance();
            this.onCReqSuccess = eCIESwithAESCBC2.getInstance();
            this.getWarnings = i;
            this.getSDKVersion = new byte[i];
            this.values = new byte[(i + 8 + this.cca_continue)];
            this.CardinalEnvironment = b;
        }

        public final void cca_continue(byte[] bArr, int i, int i2) {
            this.Cardinal.init(bArr, i, i2);
        }

        public final void init(byte b) {
            this.Cardinal.cca_continue(b);
        }

        public final void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            GMCipherSpi.SM2withRMD sM2withRMD2;
            DigestSignatureSpi.SHA256 sha256;
            if (sM2withRMD instanceof DigestSignatureSpi.RIPEMD128) {
                DigestSignatureSpi.RIPEMD128 ripemd128 = (DigestSignatureSpi.RIPEMD128) sM2withRMD;
                sM2withRMD2 = ripemd128.cca_continue;
                this.getInstance = ripemd128.Cardinal;
            } else {
                if (z) {
                    this.getInstance = GMCipherSpi.SM2withWhirlpool.configure();
                }
                sM2withRMD2 = sM2withRMD;
            }
            if (sM2withRMD2 instanceof DigestSignatureSpi.MD5) {
                sha256 = ((DigestSignatureSpi.MD5) sM2withRMD2).Cardinal;
                this.init.getInstance(z, sM2withRMD);
            } else {
                sha256 = (DigestSignatureSpi.SHA256) sM2withRMD2;
                this.init.getInstance(z, sM2withRMD2);
            }
            int bitLength = sha256.getInstance.bitLength() - 1;
            this.onValidated = bitLength;
            if (bitLength >= (this.cca_continue * 8) + (this.getWarnings * 8) + 9) {
                this.CardinalRenderType = new byte[((bitLength + 7) / 8)];
                this.Cardinal.init();
                return;
            }
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        }

        public final byte[] init() throws GMCipherSpi.SM2withSha224, GMSignatureSpi {
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC = this.Cardinal;
            byte[] bArr = this.values;
            eCIESwithAESCBC.init(bArr, (bArr.length - this.cca_continue) - this.getWarnings);
            if (this.getWarnings != 0) {
                this.getInstance.nextBytes(this.getSDKVersion);
                byte[] bArr2 = this.getSDKVersion;
                byte[] bArr3 = this.values;
                int length = bArr3.length;
                int i = this.getWarnings;
                System.arraycopy(bArr2, 0, bArr3, length - i, i);
            }
            int i2 = this.cca_continue;
            byte[] bArr4 = new byte[i2];
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC2 = this.Cardinal;
            byte[] bArr5 = this.values;
            eCIESwithAESCBC2.init(bArr5, 0, bArr5.length);
            this.Cardinal.init(bArr4, 0);
            byte[] bArr6 = this.CardinalRenderType;
            int length2 = bArr6.length;
            int i3 = this.getWarnings;
            int i4 = this.cca_continue;
            bArr6[(((length2 - i3) - 1) - i4) - 1] = 1;
            System.arraycopy(this.getSDKVersion, 0, bArr6, ((bArr6.length - i3) - i4) - 1, i3);
            byte[] init2 = init(bArr4, 0, i2, (this.CardinalRenderType.length - this.cca_continue) - 1);
            for (int i5 = 0; i5 != init2.length; i5++) {
                byte[] bArr7 = this.CardinalRenderType;
                bArr7[i5] = (byte) (bArr7[i5] ^ init2[i5]);
            }
            byte[] bArr8 = this.CardinalRenderType;
            bArr8[0] = (byte) (bArr8[0] & (255 >> ((bArr8.length << 3) - this.onValidated)));
            int length3 = bArr8.length;
            int i6 = this.cca_continue;
            System.arraycopy(bArr4, 0, bArr8, (length3 - i6) - 1, i6);
            byte[] bArr9 = this.CardinalRenderType;
            bArr9[bArr9.length - 1] = this.CardinalEnvironment;
            byte[] Cardinal2 = this.init.Cardinal(bArr9, 0, bArr9.length);
            byte[] bArr10 = this.CardinalRenderType;
            for (int i7 = 0; i7 != bArr10.length; i7++) {
                bArr10[i7] = 0;
            }
            return Cardinal2;
        }

        public final boolean init(byte[] bArr) {
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC = this.Cardinal;
            byte[] bArr2 = this.values;
            eCIESwithAESCBC.init(bArr2, (bArr2.length - this.cca_continue) - this.getWarnings);
            try {
                byte[] Cardinal2 = this.init.Cardinal(bArr, 0, bArr.length);
                byte[] bArr3 = this.CardinalRenderType;
                System.arraycopy(Cardinal2, 0, bArr3, bArr3.length - Cardinal2.length, Cardinal2.length);
                byte[] bArr4 = this.CardinalRenderType;
                if (bArr4[bArr4.length - 1] != this.CardinalEnvironment) {
                    for (int i = 0; i != bArr4.length; i++) {
                        bArr4[i] = 0;
                    }
                    return false;
                }
                int length = bArr4.length;
                int i2 = this.cca_continue;
                byte[] init2 = init(bArr4, (length - i2) - 1, i2, (bArr4.length - i2) - 1);
                for (int i3 = 0; i3 != init2.length; i3++) {
                    byte[] bArr5 = this.CardinalRenderType;
                    bArr5[i3] = (byte) (bArr5[i3] ^ init2[i3]);
                }
                byte[] bArr6 = this.CardinalRenderType;
                bArr6[0] = (byte) (bArr6[0] & (255 >> ((bArr6.length << 3) - this.onValidated)));
                int i4 = 0;
                while (true) {
                    byte[] bArr7 = this.CardinalRenderType;
                    int length2 = bArr7.length;
                    int i5 = this.cca_continue;
                    int i6 = this.getWarnings;
                    if (i4 != ((length2 - i5) - i6) - 2) {
                        if (bArr7[i4] != 0) {
                            for (int i7 = 0; i7 != bArr7.length; i7++) {
                                bArr7[i7] = 0;
                            }
                            return false;
                        }
                        i4++;
                    } else if (bArr7[((bArr7.length - i5) - i6) - 2] != 1) {
                        for (int i8 = 0; i8 != bArr7.length; i8++) {
                            bArr7[i8] = 0;
                        }
                        return false;
                    } else {
                        byte[] bArr8 = this.values;
                        System.arraycopy(bArr7, ((bArr7.length - i6) - i5) - 1, bArr8, bArr8.length - i6, i6);
                        IESCipher.ECIESwithAESCBC eCIESwithAESCBC2 = this.Cardinal;
                        byte[] bArr9 = this.values;
                        eCIESwithAESCBC2.init(bArr9, 0, bArr9.length);
                        IESCipher.ECIESwithAESCBC eCIESwithAESCBC3 = this.Cardinal;
                        byte[] bArr10 = this.values;
                        eCIESwithAESCBC3.init(bArr10, bArr10.length - this.cca_continue);
                        int length3 = this.CardinalRenderType.length;
                        int i9 = this.cca_continue;
                        int i10 = (length3 - i9) - 1;
                        int length4 = this.values.length - i9;
                        while (true) {
                            byte[] bArr11 = this.values;
                            if (length4 == bArr11.length) {
                                for (int i11 = 0; i11 != bArr11.length; i11++) {
                                    bArr11[i11] = 0;
                                }
                                byte[] bArr12 = this.CardinalRenderType;
                                for (int i12 = 0; i12 != bArr12.length; i12++) {
                                    bArr12[i12] = 0;
                                }
                                return true;
                            } else if ((this.CardinalRenderType[i10] ^ bArr11[length4]) != 0) {
                                for (int i13 = 0; i13 != bArr11.length; i13++) {
                                    bArr11[i13] = 0;
                                }
                                byte[] bArr13 = this.CardinalRenderType;
                                for (int i14 = 0; i14 != bArr13.length; i14++) {
                                    bArr13[i14] = 0;
                                }
                                return false;
                            } else {
                                i10++;
                                length4++;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }

        private byte[] init(byte[] bArr, int i, int i2, int i3) {
            int i4;
            byte[] bArr2 = new byte[i3];
            byte[] bArr3 = new byte[this.onCReqSuccess];
            byte[] bArr4 = new byte[4];
            this.configure.init();
            int i5 = 0;
            while (true) {
                i4 = this.onCReqSuccess;
                if (i5 >= i3 / i4) {
                    break;
                }
                bArr4[0] = (byte) (i5 >>> 24);
                bArr4[1] = (byte) (i5 >>> 16);
                bArr4[2] = (byte) (i5 >>> 8);
                bArr4[3] = (byte) i5;
                this.configure.init(bArr, i, i2);
                this.configure.init(bArr4, 0, 4);
                this.configure.init(bArr3, 0);
                int i6 = this.onCReqSuccess;
                System.arraycopy(bArr3, 0, bArr2, i5 * i6, i6);
                i5++;
            }
            if (i4 * i5 < i3) {
                bArr4[0] = (byte) (i5 >>> 24);
                bArr4[1] = (byte) (i5 >>> 16);
                bArr4[2] = (byte) (i5 >>> 8);
                bArr4[3] = (byte) i5;
                this.configure.init(bArr, i, i2);
                this.configure.init(bArr4, 0, 4);
                this.configure.init(bArr3, 0);
                int i7 = this.onCReqSuccess;
                System.arraycopy(bArr3, 0, bArr2, i5 * i7, i3 - (i5 * i7));
            }
            return bArr2;
        }
    }

    public final class SHA1withRSA implements DigestSignatureSpi.noneRSA {
        public static final SHA1withRSA cca_continue = new SHA1withRSA();

        public final byte[] configure(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int cca_continue2 = setCornerRadius.cca_continue(bigInteger);
            byte[] bArr = new byte[(cca_continue2 << 1)];
            getInstance(bigInteger, bigInteger2, bArr, 0, cca_continue2);
            getInstance(bigInteger, bigInteger3, bArr, cca_continue2, cca_continue2);
            return bArr;
        }

        public final BigInteger[] getInstance(BigInteger bigInteger, byte[] bArr) {
            int cca_continue2 = setCornerRadius.cca_continue(bigInteger);
            if (bArr.length == (cca_continue2 << 1)) {
                BigInteger[] bigIntegerArr = new BigInteger[2];
                BigInteger bigInteger2 = new BigInteger(1, getBackgroundColor.cca_continue(bArr, 0, cca_continue2 + 0));
                if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
                    throw new IllegalArgumentException("Value out of range");
                }
                bigIntegerArr[0] = bigInteger2;
                BigInteger bigInteger3 = new BigInteger(1, getBackgroundColor.cca_continue(bArr, cca_continue2, cca_continue2 + cca_continue2));
                if (bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                    throw new IllegalArgumentException("Value out of range");
                }
                bigIntegerArr[1] = bigInteger3;
                return bigIntegerArr;
            }
            throw new IllegalArgumentException("Encoding has incorrect length");
        }

        private static void getInstance(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i, int i2) {
            if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("Value out of range");
            }
            byte[] byteArray = bigInteger2.toByteArray();
            int max = Math.max(0, byteArray.length - i2);
            int length = byteArray.length - max;
            int i3 = (i2 - length) + i;
            while (i < i3) {
                bArr[i] = 0;
                i++;
            }
            System.arraycopy(byteArray, max, bArr, i3, length);
        }
    }

    public final class SHA256withRSA {
        public setCCAImageUri getInstance;
        public setCCAImageUri init;

        public SHA256withRSA() {
        }

        public SHA256withRSA(setCCAImageUri setccaimageuri, setCCAImageUri setccaimageuri2) {
            this.getInstance = setccaimageuri;
            this.init = setccaimageuri2;
        }
    }

    public final class SHA384withRSA implements DigestSignatureSpi.noneRSA {
        public static final SHA384withRSA getInstance = new SHA384withRSA();

        public final byte[] configure(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) throws IOException {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            if (bigInteger2.signum() < 0 || (bigInteger != null && bigInteger2.compareTo(bigInteger) >= 0)) {
                throw new IllegalArgumentException("Value out of range");
            }
            getbackgroundcolor.getInstance.addElement(new setEnvironment(bigInteger2));
            if (bigInteger3.signum() < 0 || (bigInteger != null && bigInteger3.compareTo(bigInteger) >= 0)) {
                throw new IllegalArgumentException("Value out of range");
            }
            getbackgroundcolor.getInstance.addElement(new setEnvironment(bigInteger3));
            return new getProcessorTransactionId(getbackgroundcolor).configure("DER");
        }

        public final BigInteger[] getInstance(BigInteger bigInteger, byte[] bArr) throws IOException {
            isEnableLogging isenablelogging = (isEnableLogging) getThreeDSRequestorAppURL.Cardinal(bArr);
            if (isenablelogging.cca_continue() == 2) {
                BigInteger bigInteger2 = new BigInteger(((setEnvironment) isenablelogging.init(0)).getInstance);
                if (bigInteger2.signum() < 0 || (bigInteger != null && bigInteger2.compareTo(bigInteger) >= 0)) {
                    throw new IllegalArgumentException("Value out of range");
                }
                BigInteger bigInteger3 = new BigInteger(((setEnvironment) isenablelogging.init(1)).getInstance);
                if (bigInteger3.signum() < 0 || (bigInteger != null && bigInteger3.compareTo(bigInteger) >= 0)) {
                    throw new IllegalArgumentException("Value out of range");
                } else if (getBackgroundColor.Cardinal(configure(bigInteger, bigInteger2, bigInteger3), bArr)) {
                    return new BigInteger[]{bigInteger2, bigInteger3};
                }
            }
            throw new IllegalArgumentException("Malformed signature");
        }
    }

    public final class SHA3_224withRSA implements KeyAgreementSpi.CDHwithSHA256KDFAndSharedInfo {
        private GMCipherSpi.SM2withBlake2b Cardinal;
        private int cca_continue;
        private byte[] cleanup;
        public IESCipher.ECIESwithAESCBC configure;
        private DigestSignatureSpi.SHA256 getInstance;
        private int init;

        public SHA3_224withRSA(GMCipherSpi.SM2withBlake2b sM2withBlake2b, IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
            this(sM2withBlake2b, eCIESwithAESCBC, (byte) 0);
        }

        private SHA3_224withRSA(GMCipherSpi.SM2withBlake2b sM2withBlake2b, IESCipher.ECIESwithAESCBC eCIESwithAESCBC, byte b) {
            this.Cardinal = sM2withBlake2b;
            this.configure = eCIESwithAESCBC;
            Integer instance = NullPssDigest.getInstance(eCIESwithAESCBC);
            if (instance != null) {
                this.cca_continue = instance.intValue();
                return;
            }
            throw new IllegalArgumentException(new StringBuilder("no valid trailer for digest: ").append(eCIESwithAESCBC.configure()).toString());
        }

        private void init(int i) {
            int i2;
            int instance = this.configure.getInstance();
            if (i == 188) {
                byte[] bArr = this.cleanup;
                i2 = (bArr.length - instance) - 1;
                this.configure.init(bArr, i2);
                byte[] bArr2 = this.cleanup;
                bArr2[bArr2.length - 1] = -68;
            } else {
                byte[] bArr3 = this.cleanup;
                int length = (bArr3.length - instance) - 2;
                this.configure.init(bArr3, length);
                byte[] bArr4 = this.cleanup;
                bArr4[bArr4.length - 2] = (byte) (i >>> 8);
                bArr4[bArr4.length - 1] = (byte) i;
                i2 = length;
            }
            this.cleanup[0] = 107;
            for (int i3 = i2 - 2; i3 != 0; i3--) {
                this.cleanup[i3] = -69;
            }
            this.cleanup[i2 - 1] = -70;
        }

        public final void cca_continue(byte[] bArr, int i, int i2) {
            this.configure.init(bArr, i, i2);
        }

        public final void init(byte b) {
            this.configure.cca_continue(b);
        }

        public final void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            DigestSignatureSpi.SHA256 sha256 = (DigestSignatureSpi.SHA256) sM2withRMD;
            this.getInstance = sha256;
            this.Cardinal.getInstance(z, sha256);
            int bitLength = this.getInstance.getInstance.bitLength();
            this.init = bitLength;
            this.cleanup = new byte[((bitLength + 7) / 8)];
            this.configure.init();
        }

        public final byte[] init() throws GMCipherSpi.SM2withSha224 {
            init(this.cca_continue);
            GMCipherSpi.SM2withBlake2b sM2withBlake2b = this.Cardinal;
            byte[] bArr = this.cleanup;
            BigInteger bigInteger = new BigInteger(1, sM2withBlake2b.Cardinal(bArr, 0, bArr.length));
            byte[] bArr2 = this.cleanup;
            for (int i = 0; i != bArr2.length; i++) {
                bArr2[i] = 0;
            }
            return setCornerRadius.getInstance(setCornerRadius.cca_continue(this.getInstance.getInstance), bigInteger.min(this.getInstance.getInstance.subtract(bigInteger)));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
            if ((r6.intValue() & 15) == 12) goto L_0x002d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean init(byte[] r6) {
            /*
                r5 = this;
                r0 = 0
                com.cardinalcommerce.a.GMCipherSpi$SM2withBlake2b r1 = r5.Cardinal     // Catch:{ Exception -> 0x0069 }
                int r2 = r6.length     // Catch:{ Exception -> 0x0069 }
                byte[] r6 = r1.Cardinal(r6, r0, r2)     // Catch:{ Exception -> 0x0069 }
                r5.cleanup = r6     // Catch:{ Exception -> 0x0069 }
                java.math.BigInteger r6 = new java.math.BigInteger
                byte[] r1 = r5.cleanup
                r2 = 1
                r6.<init>(r2, r1)
                int r1 = r6.intValue()
                r1 = r1 & 15
                r2 = 12
                if (r1 != r2) goto L_0x001d
                goto L_0x002d
            L_0x001d:
                com.cardinalcommerce.a.DigestSignatureSpi$SHA256 r1 = r5.getInstance
                java.math.BigInteger r1 = r1.getInstance
                java.math.BigInteger r6 = r1.subtract(r6)
                int r1 = r6.intValue()
                r1 = r1 & 15
                if (r1 != r2) goto L_0x0069
            L_0x002d:
                int r1 = r5.cca_continue
                r5.init((int) r1)
                byte[] r1 = r5.cleanup
                int r1 = r1.length
                byte[] r6 = com.cardinalcommerce.a.setCornerRadius.getInstance(r1, r6)
                byte[] r1 = r5.cleanup
                boolean r1 = com.cardinalcommerce.a.getBackgroundColor.init((byte[]) r1, (byte[]) r6)
                int r2 = r5.cca_continue
                r3 = 15052(0x3acc, float:2.1092E-41)
                if (r2 != r3) goto L_0x0054
                if (r1 != 0) goto L_0x0054
                byte[] r1 = r5.cleanup
                int r2 = r1.length
                int r2 = r2 + -2
                r3 = 64
                r1[r2] = r3
                boolean r1 = com.cardinalcommerce.a.getBackgroundColor.init((byte[]) r1, (byte[]) r6)
            L_0x0054:
                byte[] r2 = r5.cleanup
                r3 = r0
            L_0x0057:
                int r4 = r2.length
                if (r3 == r4) goto L_0x005f
                r2[r3] = r0
                int r3 = r3 + 1
                goto L_0x0057
            L_0x005f:
                r2 = r0
            L_0x0060:
                int r3 = r6.length
                if (r2 == r3) goto L_0x0068
                r6[r2] = r0
                int r2 = r2 + 1
                goto L_0x0060
            L_0x0068:
                return r1
            L_0x0069:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.PSSSignatureSpi.SHA3_224withRSA.init(byte[]):boolean");
        }
    }

    public final class SHA3_256withRSA {
        private static byte[] configure = getTextFontSize.configure("openssh-key-v1\u0000");

        public static byte[] init(setCCAImageUri setccaimageuri) throws IOException {
            byte[] bArr;
            if (setccaimageuri instanceof DigestSignatureSpi.RIPEMD256) {
                return getThreeDSRequestorAppURL.Cardinal(nonePSS.configure(setccaimageuri).Cardinal.getInstance()).onCReqSuccess().getEncoded();
            }
            if (setccaimageuri instanceof KeyPairGeneratorSpi.EdDSA) {
                return getThreeDSRequestorAppURL.Cardinal(nonePSS.configure(setccaimageuri).Cardinal.getInstance()).onCReqSuccess().getEncoded();
            }
            if (setccaimageuri instanceof KeyAgreementSpi.X448UwithSHA512KDF) {
                getBackgroundColor getbackgroundcolor = new getBackgroundColor();
                getbackgroundcolor.getInstance.addElement(new setEnvironment(0));
                KeyAgreementSpi.X448UwithSHA512KDF x448UwithSHA512KDF = (KeyAgreementSpi.X448UwithSHA512KDF) setccaimageuri;
                getbackgroundcolor.getInstance.addElement(new setEnvironment(x448UwithSHA512KDF.configure.configure));
                getbackgroundcolor.getInstance.addElement(new setEnvironment(x448UwithSHA512KDF.configure.init));
                getbackgroundcolor.getInstance.addElement(new setEnvironment(x448UwithSHA512KDF.configure.Cardinal));
                getbackgroundcolor.getInstance.addElement(new setEnvironment(x448UwithSHA512KDF.configure.Cardinal.modPow(x448UwithSHA512KDF.Cardinal, x448UwithSHA512KDF.configure.configure)));
                getbackgroundcolor.getInstance.addElement(new setEnvironment(x448UwithSHA512KDF.Cardinal));
                try {
                    return new getProcessorTransactionId(getbackgroundcolor).getEncoded();
                } catch (Exception e) {
                    throw new IllegalStateException(new StringBuilder("unable to encode DSAPrivateKeyParameters ").append(e.getMessage()).toString());
                }
            } else if (setccaimageuri instanceof KeyPairGeneratorSpi.X448) {
                SHA3_512withRSA sHA3_512withRSA = new SHA3_512withRSA();
                try {
                    sHA3_512withRSA.configure.write(configure);
                    byte[] configure2 = getTextFontSize.configure("none");
                    sHA3_512withRSA.configure((long) configure2.length);
                    try {
                        sHA3_512withRSA.configure.write(configure2);
                        byte[] configure3 = getTextFontSize.configure("none");
                        sHA3_512withRSA.configure((long) configure3.length);
                        try {
                            sHA3_512withRSA.configure.write(configure3);
                            sHA3_512withRSA.configure(0);
                            sHA3_512withRSA.configure(1);
                            KeyPairGeneratorSpi.X448 x448 = (KeyPairGeneratorSpi.X448) setccaimageuri;
                            byte[] bArr2 = new byte[32];
                            Curve.configure(x448.getInstance, bArr2);
                            byte[] instance = KeyAgreementSpi.MQVwithSHA1KDF.getInstance((setCCAImageUri) new KeyPairGeneratorSpi.X25519(bArr2, 0));
                            sHA3_512withRSA.configure((long) instance.length);
                            try {
                                sHA3_512withRSA.configure.write(instance);
                                SHA3_512withRSA sHA3_512withRSA2 = new SHA3_512withRSA();
                                sHA3_512withRSA2.configure(16711935);
                                sHA3_512withRSA2.configure(16711935);
                                byte[] configure4 = getTextFontSize.configure("ssh-ed25519");
                                sHA3_512withRSA2.configure((long) configure4.length);
                                try {
                                    sHA3_512withRSA2.configure.write(configure4);
                                    byte[] bArr3 = new byte[32];
                                    Curve.configure(x448.getInstance, bArr3);
                                    byte[] bArr4 = new KeyPairGeneratorSpi.X25519(bArr3, 0).getInstance;
                                    byte[] bArr5 = null;
                                    if (bArr4 == null) {
                                        bArr = null;
                                    } else {
                                        bArr = new byte[bArr4.length];
                                        System.arraycopy(bArr4, 0, bArr, 0, bArr4.length);
                                    }
                                    sHA3_512withRSA2.configure((long) bArr.length);
                                    try {
                                        sHA3_512withRSA2.configure.write(bArr);
                                        byte[] bArr6 = x448.getInstance;
                                        if (bArr6 != null) {
                                            bArr5 = new byte[bArr6.length];
                                            System.arraycopy(bArr6, 0, bArr5, 0, bArr6.length);
                                        }
                                        byte[] configure5 = getBackgroundColor.configure(bArr5, bArr);
                                        sHA3_512withRSA2.configure((long) configure5.length);
                                        try {
                                            sHA3_512withRSA2.configure.write(configure5);
                                            sHA3_512withRSA2.configure(0);
                                            byte[] byteArray = sHA3_512withRSA2.configure.toByteArray();
                                            sHA3_512withRSA.configure((long) byteArray.length);
                                            try {
                                                sHA3_512withRSA.configure.write(byteArray);
                                                return sHA3_512withRSA.configure.toByteArray();
                                            } catch (IOException e2) {
                                                throw new IllegalStateException(e2.getMessage(), e2);
                                            }
                                        } catch (IOException e3) {
                                            throw new IllegalStateException(e3.getMessage(), e3);
                                        }
                                    } catch (IOException e4) {
                                        throw new IllegalStateException(e4.getMessage(), e4);
                                    }
                                } catch (IOException e5) {
                                    throw new IllegalStateException(e5.getMessage(), e5);
                                }
                            } catch (IOException e6) {
                                throw new IllegalStateException(e6.getMessage(), e6);
                            }
                        } catch (IOException e7) {
                            throw new IllegalStateException(e7.getMessage(), e7);
                        }
                    } catch (IOException e8) {
                        throw new IllegalStateException(e8.getMessage(), e8);
                    }
                } catch (IOException e9) {
                    throw new IllegalStateException(e9.getMessage(), e9);
                }
            } else {
                throw new IllegalArgumentException(new StringBuilder("unable to convert ").append(setccaimageuri.getClass().getName()).append(" to openssh private key").toString());
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.cardinalcommerce.a.KeyPairGeneratorSpi$X448} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA512CKDF} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA512CKDF} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.cardinalcommerce.a.DigestSignatureSpi$RIPEMD256} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA512CKDF} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA512CKDF} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA512CKDF} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: com.cardinalcommerce.a.KeyAgreementSpi$X448UwithSHA512KDF} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: com.cardinalcommerce.a.DigestSignatureSpi$RIPEMD256} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA512CKDF} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: com.cardinalcommerce.a.DigestSignatureSpi$RIPEMD256} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA512CKDF} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: com.cardinalcommerce.a.DigestSignatureSpi$RIPEMD256} */
        /* JADX WARNING: type inference failed for: r1v1, types: [com.cardinalcommerce.a.setCCAImageUri] */
        /* JADX WARNING: type inference failed for: r3v10, types: [com.cardinalcommerce.a.KeyPairGeneratorSpi$EdDSA] */
        /* JADX WARNING: type inference failed for: r7v6, types: [byte[], java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.cardinalcommerce.a.setCCAImageUri Cardinal(byte[] r17) {
            /*
                r0 = r17
                r1 = 0
                byte r2 = r0[r1]
                r3 = 48
                r4 = 1
                if (r2 != r3) goto L_0x0146
                com.cardinalcommerce.a.isEnableLogging r0 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r17)
                int r2 = r0.cca_continue()
                r3 = 6
                r5 = 2
                r6 = 3
                r7 = 0
                if (r2 != r3) goto L_0x0085
                r2 = r1
            L_0x0019:
                int r3 = r0.cca_continue()
                if (r2 >= r3) goto L_0x002c
                com.cardinalcommerce.a.CardinalConfigurationParameters r3 = r0.init(r2)
                boolean r3 = r3 instanceof com.cardinalcommerce.a.setEnvironment
                if (r3 != 0) goto L_0x0029
                r2 = r1
                goto L_0x002d
            L_0x0029:
                int r2 = r2 + 1
                goto L_0x0019
            L_0x002c:
                r2 = r4
            L_0x002d:
                if (r2 == 0) goto L_0x0143
                com.cardinalcommerce.a.CardinalConfigurationParameters r1 = r0.init(r1)
                com.cardinalcommerce.a.setEnvironment r1 = (com.cardinalcommerce.a.setEnvironment) r1
                java.math.BigInteger r2 = new java.math.BigInteger
                byte[] r1 = r1.getInstance
                r2.<init>(r4, r1)
                java.math.BigInteger r1 = com.cardinalcommerce.a.setCornerRadius.init
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L_0x0143
                com.cardinalcommerce.a.KeyAgreementSpi$X448UwithSHA512KDF r1 = new com.cardinalcommerce.a.KeyAgreementSpi$X448UwithSHA512KDF
                r2 = 5
                com.cardinalcommerce.a.CardinalConfigurationParameters r2 = r0.init(r2)
                com.cardinalcommerce.a.setEnvironment r2 = (com.cardinalcommerce.a.setEnvironment) r2
                java.math.BigInteger r3 = new java.math.BigInteger
                byte[] r2 = r2.getInstance
                r3.<init>(r4, r2)
                com.cardinalcommerce.a.KeyAgreementSpi$X448withSHA256CKDF r2 = new com.cardinalcommerce.a.KeyAgreementSpi$X448withSHA256CKDF
                com.cardinalcommerce.a.CardinalConfigurationParameters r7 = r0.init(r4)
                com.cardinalcommerce.a.setEnvironment r7 = (com.cardinalcommerce.a.setEnvironment) r7
                java.math.BigInteger r8 = new java.math.BigInteger
                byte[] r7 = r7.getInstance
                r8.<init>(r4, r7)
                com.cardinalcommerce.a.CardinalConfigurationParameters r5 = r0.init(r5)
                com.cardinalcommerce.a.setEnvironment r5 = (com.cardinalcommerce.a.setEnvironment) r5
                java.math.BigInteger r7 = new java.math.BigInteger
                byte[] r5 = r5.getInstance
                r7.<init>(r4, r5)
                com.cardinalcommerce.a.CardinalConfigurationParameters r0 = r0.init(r6)
                com.cardinalcommerce.a.setEnvironment r0 = (com.cardinalcommerce.a.setEnvironment) r0
                java.math.BigInteger r5 = new java.math.BigInteger
                byte[] r0 = r0.getInstance
                r5.<init>(r4, r0)
                r2.<init>(r8, r7, r5)
                r1.<init>(r3, r2)
                goto L_0x01cc
            L_0x0085:
                int r2 = r0.cca_continue()
                r3 = 9
                if (r2 != r3) goto L_0x00de
                r2 = r1
            L_0x008e:
                int r3 = r0.cca_continue()
                if (r2 >= r3) goto L_0x00a1
                com.cardinalcommerce.a.CardinalConfigurationParameters r3 = r0.init(r2)
                boolean r3 = r3 instanceof com.cardinalcommerce.a.setEnvironment
                if (r3 != 0) goto L_0x009e
                r2 = r1
                goto L_0x00a2
            L_0x009e:
                int r2 = r2 + 1
                goto L_0x008e
            L_0x00a1:
                r2 = r4
            L_0x00a2:
                if (r2 == 0) goto L_0x0143
                com.cardinalcommerce.a.CardinalConfigurationParameters r1 = r0.init(r1)
                com.cardinalcommerce.a.setEnvironment r1 = (com.cardinalcommerce.a.setEnvironment) r1
                java.math.BigInteger r2 = new java.math.BigInteger
                byte[] r1 = r1.getInstance
                r2.<init>(r4, r1)
                java.math.BigInteger r1 = com.cardinalcommerce.a.setCornerRadius.init
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L_0x0143
                if (r0 == 0) goto L_0x00c4
                com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA512CKDF r7 = new com.cardinalcommerce.a.KeyAgreementSpi$DHUwithSHA512CKDF
                com.cardinalcommerce.a.isEnableLogging r0 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r0)
                r7.<init>(r0)
            L_0x00c4:
                com.cardinalcommerce.a.DigestSignatureSpi$RIPEMD256 r1 = new com.cardinalcommerce.a.DigestSignatureSpi$RIPEMD256
                java.math.BigInteger r9 = r7.getInstance
                java.math.BigInteger r10 = r7.configure
                java.math.BigInteger r11 = r7.Cardinal
                java.math.BigInteger r12 = r7.init
                java.math.BigInteger r13 = r7.cca_continue
                java.math.BigInteger r14 = r7.getSDKVersion
                java.math.BigInteger r15 = r7.getWarnings
                java.math.BigInteger r0 = r7.onCReqSuccess
                r8 = r1
                r16 = r0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                goto L_0x01cc
            L_0x00de:
                int r2 = r0.cca_continue()
                r3 = 4
                if (r2 != r3) goto L_0x0143
                com.cardinalcommerce.a.CardinalConfigurationParameters r2 = r0.init(r6)
                boolean r2 = r2 instanceof com.cardinalcommerce.a.getPayment
                if (r2 == 0) goto L_0x0143
                com.cardinalcommerce.a.CardinalConfigurationParameters r2 = r0.init(r5)
                boolean r2 = r2 instanceof com.cardinalcommerce.a.getPayment
                if (r2 == 0) goto L_0x0143
                if (r0 == 0) goto L_0x0101
                com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF r2 = new com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA1CKDF
                com.cardinalcommerce.a.isEnableLogging r0 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r0)
                r2.<init>(r0)
                goto L_0x0102
            L_0x0101:
                r2 = r7
            L_0x0102:
                com.cardinalcommerce.a.getThreeDSRequestorAppURL r0 = r2.Cardinal(r1)
                r9 = r0
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r9 = (com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r9
                com.cardinalcommerce.a.GMCipherSpi r0 = com.cardinalcommerce.a.SignatureSpi.Cardinal(r9)
                com.cardinalcommerce.a.KeyPairGeneratorSpi$EdDSA r3 = new com.cardinalcommerce.a.KeyPairGeneratorSpi$EdDSA
                com.cardinalcommerce.a.isEnableLogging r2 = r2.getInstance
                com.cardinalcommerce.a.CardinalConfigurationParameters r2 = r2.init(r4)
                com.cardinalcommerce.a.setUICustomization r2 = (com.cardinalcommerce.a.setUICustomization) r2
                java.math.BigInteger r5 = new java.math.BigInteger
                byte[] r2 = r2.getInstance()
                r5.<init>(r4, r2)
                com.cardinalcommerce.a.KeyFactorySpi$XDH r2 = new com.cardinalcommerce.a.KeyFactorySpi$XDH
                com.cardinalcommerce.a.toJSONString r10 = r0.init
                com.cardinalcommerce.a.ECUtils r4 = r0.getInstance
                com.cardinalcommerce.a.JSONNavi r11 = r4.cca_continue()
                java.math.BigInteger r12 = r0.cca_continue
                java.math.BigInteger r13 = r0.configure
                byte[] r0 = r0.Cardinal
                if (r0 != 0) goto L_0x0133
                goto L_0x013a
            L_0x0133:
                int r4 = r0.length
                byte[] r7 = new byte[r4]
                int r4 = r0.length
                java.lang.System.arraycopy(r0, r1, r7, r1, r4)
            L_0x013a:
                r14 = r7
                r8 = r2
                r8.<init>(r9, r10, r11, r12, r13, r14)
                r3.<init>(r5, r2)
                r7 = r3
            L_0x0143:
                r1 = r7
                goto L_0x01cc
            L_0x0146:
                com.cardinalcommerce.a.PSSSignatureSpi$SHA512withRSA r2 = new com.cardinalcommerce.a.PSSSignatureSpi$SHA512withRSA
                byte[] r3 = configure
                r2.<init>(r3, r0)
                byte[] r0 = r2.getInstance()
                java.lang.String r0 = com.cardinalcommerce.a.getTextFontSize.getInstance(r0)
                java.lang.String r3 = "none"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L_0x01f7
                r2.getInstance()
                r2.getInstance()
                int r0 = r2.configure()
                long r5 = (long) r0
                r0 = r1
            L_0x0169:
                long r7 = (long) r0
                int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r3 == 0) goto L_0x0178
                byte[] r3 = r2.getInstance()
                com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA1KDF.configure((byte[]) r3)
                int r0 = r0 + 1
                goto L_0x0169
            L_0x0178:
                com.cardinalcommerce.a.PSSSignatureSpi$SHA512withRSA r0 = new com.cardinalcommerce.a.PSSSignatureSpi$SHA512withRSA
                int r3 = r2.configure()
                if (r3 != 0) goto L_0x0183
                byte[] r1 = new byte[r1]
                goto L_0x01a3
            L_0x0183:
                int r1 = r2.cca_continue
                int r1 = r1 + r3
                byte[] r5 = r2.init
                int r5 = r5.length
                if (r1 > r5) goto L_0x01ef
                byte[] r1 = r2.init
                int r5 = r2.cca_continue
                int r6 = r2.cca_continue
                byte[] r7 = r2.init
                int r8 = r2.cca_continue
                int r8 = r8 + r3
                int r8 = r8 - r4
                byte r4 = r7[r8]
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r3 = r3 - r4
                int r6 = r6 + r3
                r2.cca_continue = r6
                byte[] r1 = com.cardinalcommerce.a.getBackgroundColor.cca_continue(r1, r5, r6)
            L_0x01a3:
                r0.<init>(r1)
                int r1 = r0.configure()
                int r2 = r0.configure()
                if (r1 != r2) goto L_0x01e7
                byte[] r1 = r0.getInstance()
                java.lang.String r1 = com.cardinalcommerce.a.getTextFontSize.getInstance(r1)
                java.lang.String r2 = "ssh-ed25519"
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x01d7
                r0.getInstance()
                byte[] r0 = r0.getInstance()
                com.cardinalcommerce.a.KeyPairGeneratorSpi$X448 r1 = new com.cardinalcommerce.a.KeyPairGeneratorSpi$X448
                r1.<init>((byte[]) r0)
            L_0x01cc:
                if (r1 == 0) goto L_0x01cf
                return r1
            L_0x01cf:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "unable to parse key"
                r0.<init>(r1)
                throw r0
            L_0x01d7:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "can not parse private key of type "
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r1 = r2.concat(r1)
                r0.<init>(r1)
                throw r0
            L_0x01e7:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "private key check values are not the same"
                r0.<init>(r1)
                throw r0
            L_0x01ef:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "not enough data for string"
                r0.<init>(r1)
                throw r0
            L_0x01f7:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "encrypted keys not supported"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.PSSSignatureSpi.SHA3_256withRSA.Cardinal(byte[]):com.cardinalcommerce.a.setCCAImageUri");
        }
    }

    public final class SHA3_384withRSA implements KeyAgreementSpi.CDHwithSHA256KDFAndSharedInfo, writeJSONString {
        private final DigestSignatureSpi.SHA512 Cardinal;
        private KeyFactorySpi.EDDSA cca_continue;
        private byte[] cleanup;
        private JSONNavi configure;
        private final DigestSignatureSpi.noneRSA getInstance;
        public final IESCipher.ECIESwithAESCBC init;
        private KeyPairGeneratorSpi.Ed448 onValidated;

        public SHA3_384withRSA() {
            this(SHA384withRSA.getInstance, new SignatureSpi.ecDSA());
        }

        private SHA3_384withRSA(DigestSignatureSpi.noneRSA nonersa, IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
            this.Cardinal = new SHA224withRSA();
            this.getInstance = nonersa;
            this.init = eCIESwithAESCBC;
        }

        public SHA3_384withRSA(IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
            this(SHA384withRSA.getInstance, eCIESwithAESCBC);
        }

        private void configure() {
            this.init.init();
            byte[] bArr = this.cleanup;
            if (bArr != null) {
                this.init.init(bArr, 0, bArr.length);
            }
        }

        public final void cca_continue(byte[] bArr, int i, int i2) {
            this.init.init(bArr, i, i2);
        }

        public final void init(byte b) {
            this.init.cca_continue(b);
        }

        public final void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            byte[] bArr;
            if (sM2withRMD instanceof CipherSpi.PKCS1v1_5Padding_PublicOnly) {
                CipherSpi.PKCS1v1_5Padding_PublicOnly pKCS1v1_5Padding_PublicOnly = (CipherSpi.PKCS1v1_5Padding_PublicOnly) sM2withRMD;
                GMCipherSpi.SM2withRMD sM2withRMD2 = pKCS1v1_5Padding_PublicOnly.getInstance;
                byte[] bArr2 = pKCS1v1_5Padding_PublicOnly.cca_continue;
                if (bArr2.length < 8192) {
                    GMCipherSpi.SM2withRMD sM2withRMD3 = sM2withRMD2;
                    bArr = bArr2;
                    sM2withRMD = sM2withRMD3;
                } else {
                    throw new IllegalArgumentException("SM2 user ID must be less than 2^16 bits long");
                }
            } else {
                bArr = getHeadingTextFontName.init("31323334353637383132333435363738");
            }
            if (z) {
                if (sM2withRMD instanceof DigestSignatureSpi.RIPEMD128) {
                    DigestSignatureSpi.RIPEMD128 ripemd128 = (DigestSignatureSpi.RIPEMD128) sM2withRMD;
                    KeyPairGeneratorSpi.Ed448 ed448 = (KeyPairGeneratorSpi.Ed448) ripemd128.cca_continue;
                    this.onValidated = ed448;
                    KeyFactorySpi.EDDSA eddsa = ed448.Cardinal;
                    this.cca_continue = eddsa;
                    this.Cardinal.getInstance(eddsa.getInstance, ripemd128.Cardinal);
                } else {
                    KeyPairGeneratorSpi.Ed448 ed4482 = (KeyPairGeneratorSpi.Ed448) sM2withRMD;
                    this.onValidated = ed4482;
                    KeyFactorySpi.EDDSA eddsa2 = ed4482.Cardinal;
                    this.cca_continue = eddsa2;
                    this.Cardinal.getInstance(eddsa2.getInstance, GMCipherSpi.SM2withWhirlpool.configure());
                }
                this.configure = new JSONAware().cca_continue(this.cca_continue.init, ((KeyPairGeneratorSpi.EdDSA) this.onValidated).init).CardinalRenderType();
            } else {
                KeyPairGeneratorSpi.Ed448 ed4483 = (KeyPairGeneratorSpi.Ed448) sM2withRMD;
                this.onValidated = ed4483;
                this.cca_continue = ed4483.Cardinal;
                this.configure = ((KeyPairGeneratorSpi.XDH) this.onValidated).configure;
            }
            this.init.init();
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC = this.init;
            int length = bArr.length << 3;
            eCIESwithAESCBC.cca_continue((byte) (length >> 8));
            eCIESwithAESCBC.cca_continue((byte) length);
            eCIESwithAESCBC.init(bArr, 0, bArr.length);
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC2 = this.init;
            merge sDKVersion = this.cca_continue.cca_continue.getSDKVersion();
            byte[] instance = setCornerRadius.getInstance((sDKVersion.Cardinal() + 7) / 8, sDKVersion.cca_continue());
            eCIESwithAESCBC2.init(instance, 0, instance.length);
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC3 = this.init;
            merge cleanup2 = this.cca_continue.cca_continue.cleanup();
            byte[] instance2 = setCornerRadius.getInstance((cleanup2.Cardinal() + 7) / 8, cleanup2.cca_continue());
            eCIESwithAESCBC3.init(instance2, 0, instance2.length);
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC4 = this.init;
            merge onCReqSuccess = this.cca_continue.init.onCReqSuccess();
            byte[] instance3 = setCornerRadius.getInstance((onCReqSuccess.Cardinal() + 7) / 8, onCReqSuccess.cca_continue());
            eCIESwithAESCBC4.init(instance3, 0, instance3.length);
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC5 = this.init;
            merge warnings = this.cca_continue.init.getWarnings();
            byte[] instance4 = setCornerRadius.getInstance((warnings.Cardinal() + 7) / 8, warnings.cca_continue());
            eCIESwithAESCBC5.init(instance4, 0, instance4.length);
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC6 = this.init;
            merge onCReqSuccess2 = this.configure.onCReqSuccess();
            byte[] instance5 = setCornerRadius.getInstance((onCReqSuccess2.Cardinal() + 7) / 8, onCReqSuccess2.cca_continue());
            eCIESwithAESCBC6.init(instance5, 0, instance5.length);
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC7 = this.init;
            merge warnings2 = this.configure.getWarnings();
            byte[] instance6 = setCornerRadius.getInstance((warnings2.Cardinal() + 7) / 8, warnings2.cca_continue());
            eCIESwithAESCBC7.init(instance6, 0, instance6.length);
            byte[] bArr3 = new byte[this.init.getInstance()];
            this.init.init(bArr3, 0);
            this.cleanup = bArr3;
            this.init.init(bArr3, 0, bArr3.length);
        }

        public final boolean init(byte[] bArr) {
            try {
                BigInteger[] instance = this.getInstance.getInstance(this.cca_continue.getInstance, bArr);
                BigInteger bigInteger = instance[0];
                BigInteger bigInteger2 = instance[1];
                BigInteger bigInteger3 = this.cca_continue.getInstance;
                if (bigInteger.compareTo(CardinalRenderType) >= 0) {
                    if (bigInteger.compareTo(bigInteger3) < 0) {
                        if (bigInteger2.compareTo(CardinalRenderType) >= 0) {
                            if (bigInteger2.compareTo(bigInteger3) < 0) {
                                byte[] bArr2 = new byte[this.init.getInstance()];
                                this.init.init(bArr2, 0);
                                configure();
                                BigInteger bigInteger4 = new BigInteger(1, bArr2);
                                BigInteger mod = bigInteger.add(bigInteger2).mod(bigInteger3);
                                if (mod.equals(getSDKVersion)) {
                                    return false;
                                }
                                JSONNavi CardinalRenderType = appendElement.cca_continue(this.cca_continue.init, bigInteger2, ((KeyPairGeneratorSpi.XDH) this.onValidated).configure, mod).CardinalRenderType();
                                if (CardinalRenderType.getString()) {
                                    return false;
                                }
                                return bigInteger4.add(CardinalRenderType.onCReqSuccess().cca_continue()).mod(bigInteger3).equals(bigInteger);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }

        public final byte[] init() throws GMCipherSpi.SM2withSha224 {
            byte[] bArr = new byte[this.init.getInstance()];
            this.init.init(bArr, 0);
            configure();
            BigInteger bigInteger = this.cca_continue.getInstance;
            BigInteger bigInteger2 = new BigInteger(1, bArr);
            BigInteger bigInteger3 = ((KeyPairGeneratorSpi.EdDSA) this.onValidated).init;
            JSONAware jSONAware = new JSONAware();
            while (true) {
                BigInteger configure2 = this.Cardinal.configure();
                BigInteger mod = bigInteger2.add(jSONAware.cca_continue(this.cca_continue.init, configure2).CardinalRenderType().onCReqSuccess().cca_continue()).mod(bigInteger);
                if (!mod.equals(getSDKVersion) && !mod.add(configure2).equals(bigInteger)) {
                    BigInteger mod2 = bigInteger3.add(CardinalRenderType).modInverse(bigInteger).multiply(configure2.subtract(mod.multiply(bigInteger3)).mod(bigInteger)).mod(bigInteger);
                    if (!mod2.equals(getSDKVersion)) {
                        try {
                            return this.getInstance.configure(this.cca_continue.getInstance, mod, mod2);
                        } catch (Exception e) {
                            throw new GMCipherSpi.SM2withSha224(new StringBuilder("unable to encode signature: ").append(e.getMessage()).toString(), e);
                        }
                    }
                }
            }
        }
    }

    public final class nonePSS {
        private static Set cca_continue;

        static {
            HashSet hashSet = new HashSet(5);
            cca_continue = hashSet;
            hashSet.add(IES.CardinalRenderType);
            cca_continue.add(IES.CardinalError);
            cca_continue.add(IES.CardinalUiType);
            cca_continue.add(IES.CardinalActionCode);
            cca_continue.add(IES.getActionCode);
        }

        public static PrivateKeyInfo configure(setCCAImageUri setccaimageuri) throws IOException {
            return getInstance(setccaimageuri, (setEnableDFSync) null);
        }

        private static void init(byte[] bArr, int i, BigInteger bigInteger) {
            byte[] byteArray = bigInteger.toByteArray();
            if (byteArray.length < i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
                byteArray = bArr2;
            }
            for (int i2 = 0; i2 != i; i2++) {
                bArr[i2] = byteArray[(byteArray.length - 1) - i2];
            }
        }

        public static PrivateKeyInfo getInstance(setCCAImageUri setccaimageuri, setEnableDFSync setenabledfsync) throws IOException {
            byte[] bArr;
            byte[] bArr2;
            byte[] bArr3;
            byte[] bArr4;
            int i;
            DSAUtil dSAUtil;
            ASN1ObjectIdentifier aSN1ObjectIdentifier;
            if (setccaimageuri instanceof DigestSignatureSpi.SHA256) {
                DigestSignatureSpi.RIPEMD256 ripemd256 = (DigestSignatureSpi.RIPEMD256) setccaimageuri;
                return new PrivateKeyInfo(new BCDSAPrivateKey(KeyAgreementSpi.DHUwithSHA224CKDF.configure, isEnabledVisaCheckout.configure), new KeyAgreementSpi.DHUwithSHA512CKDF(ripemd256.getInstance, ripemd256.Cardinal, ripemd256.cca_continue, ripemd256.init, ripemd256.configure, ripemd256.cleanup, ripemd256.onValidated, ripemd256.getWarnings), setenabledfsync);
            } else if (setccaimageuri instanceof KeyAgreementSpi.X448UwithSHA512KDF) {
                KeyAgreementSpi.X448UwithSHA512KDF x448UwithSHA512KDF = (KeyAgreementSpi.X448UwithSHA512KDF) setccaimageuri;
                KeyAgreementSpi.X448withSHA256CKDF x448withSHA256CKDF = x448UwithSHA512KDF.configure;
                return new PrivateKeyInfo(new BCDSAPrivateKey(GMCipherSpi.SM2withMD5.ExtendedData, new DSASigner.detDSA256(x448withSHA256CKDF.configure, x448withSHA256CKDF.init, x448withSHA256CKDF.Cardinal)), new setEnvironment(x448UwithSHA512KDF.Cardinal), setenabledfsync);
            } else {
                int i2 = 32;
                byte[] bArr5 = null;
                boolean z = false;
                if (setccaimageuri instanceof KeyPairGeneratorSpi.EdDSA) {
                    KeyPairGeneratorSpi.EdDSA edDSA = (KeyPairGeneratorSpi.EdDSA) setccaimageuri;
                    KeyFactorySpi.EDDSA eddsa = edDSA.Cardinal;
                    if (eddsa == null) {
                        dSAUtil = new DSAUtil((setUiType) isEnabledVisaCheckout.configure);
                        i = edDSA.init.bitLength();
                    } else if (eddsa instanceof KeyFactorySpi.X448) {
                        KeyFactorySpi.X448 x448 = (KeyFactorySpi.X448) eddsa;
                        AlgorithmParameterGeneratorSpi algorithmParameterGeneratorSpi = new AlgorithmParameterGeneratorSpi(x448.onValidated, x448.cleanup, x448.getWarnings);
                        if (cca_continue.contains(algorithmParameterGeneratorSpi.configure)) {
                            aSN1ObjectIdentifier = IES.onValidated;
                        } else {
                            if (edDSA.init.bitLength() > 256) {
                                z = true;
                            }
                            aSN1ObjectIdentifier = z ? KeyAgreementSpi.DHwithSHA224CKDF.getInstance : KeyAgreementSpi.DHwithSHA224CKDF.Cardinal;
                            if (z) {
                                i2 = 64;
                            }
                        }
                        byte[] bArr6 = new byte[i2];
                        init(bArr6, i2, edDSA.init);
                        return new PrivateKeyInfo(new BCDSAPrivateKey(aSN1ObjectIdentifier, algorithmParameterGeneratorSpi), new setEnabledVisaCheckout(bArr6));
                    } else if (eddsa instanceof KeyFactorySpi.XDH) {
                        dSAUtil = new DSAUtil(((KeyFactorySpi.XDH) eddsa).onCReqSuccess);
                        i = eddsa.getInstance.bitLength();
                    } else {
                        toJSONString tojsonstring = eddsa.cca_continue;
                        JSONNavi jSONNavi = eddsa.init;
                        BigInteger bigInteger = eddsa.getInstance;
                        BigInteger bigInteger2 = eddsa.Cardinal;
                        byte[] bArr7 = eddsa.configure;
                        if (bArr7 != null) {
                            bArr5 = new byte[bArr7.length];
                            System.arraycopy(bArr7, 0, bArr5, 0, bArr7.length);
                        }
                        DSAUtil dSAUtil2 = new DSAUtil(new GMCipherSpi(tojsonstring, jSONNavi, bigInteger, bigInteger2, bArr5));
                        i = eddsa.getInstance.bitLength();
                        dSAUtil = dSAUtil2;
                    }
                    return new PrivateKeyInfo(new BCDSAPrivateKey(GMCipherSpi.SM2withMD5.CardinalError, dSAUtil), new KeyAgreementSpi.DHwithSHA1CKDF(i, edDSA.init, new getDeviceFingerprint(eddsa.init.Cardinal(edDSA.init).Cardinal(false)), dSAUtil), setenabledfsync);
                } else if (setccaimageuri instanceof DigestSignatureSpi.SHA3_384) {
                    DigestSignatureSpi.SHA3_384 sha3_384 = (DigestSignatureSpi.SHA3_384) setccaimageuri;
                    BCDSAPrivateKey bCDSAPrivateKey = new BCDSAPrivateKey(X509.Mappings.configure);
                    byte[] bArr8 = sha3_384.cca_continue;
                    if (bArr8 == null) {
                        bArr4 = null;
                    } else {
                        bArr4 = new byte[bArr8.length];
                        System.arraycopy(bArr8, 0, bArr4, 0, bArr8.length);
                    }
                    setEnabledVisaCheckout setenabledvisacheckout = new setEnabledVisaCheckout(bArr4);
                    byte[] bArr9 = sha3_384.getInstance().Cardinal;
                    if (bArr9 != null) {
                        bArr5 = new byte[bArr9.length];
                        System.arraycopy(bArr9, 0, bArr5, 0, bArr9.length);
                    }
                    return new PrivateKeyInfo(bCDSAPrivateKey, setenabledvisacheckout, setenabledfsync, bArr5);
                } else if (setccaimageuri instanceof DigestSignatureSpi.RIPEMD160) {
                    DigestSignatureSpi.RIPEMD160 ripemd160 = (DigestSignatureSpi.RIPEMD160) setccaimageuri;
                    BCDSAPrivateKey bCDSAPrivateKey2 = new BCDSAPrivateKey(X509.Mappings.Cardinal);
                    byte[] bArr10 = ripemd160.getInstance;
                    if (bArr10 == null) {
                        bArr3 = null;
                    } else {
                        bArr3 = new byte[bArr10.length];
                        System.arraycopy(bArr10, 0, bArr3, 0, bArr10.length);
                    }
                    setEnabledVisaCheckout setenabledvisacheckout2 = new setEnabledVisaCheckout(bArr3);
                    byte[] bArr11 = new byte[32];
                    ECKey.Cardinal(ripemd160.getInstance, 0, bArr11, 0);
                    byte[] bArr12 = new DigestSignatureSpi.SHA3_224(bArr11, 0).getInstance;
                    if (bArr12 != null) {
                        bArr5 = new byte[bArr12.length];
                        System.arraycopy(bArr12, 0, bArr5, 0, bArr12.length);
                    }
                    return new PrivateKeyInfo(bCDSAPrivateKey2, setenabledvisacheckout2, setenabledfsync, bArr5);
                } else if (setccaimageuri instanceof CipherSpi) {
                    CipherSpi cipherSpi = (CipherSpi) setccaimageuri;
                    BCDSAPrivateKey bCDSAPrivateKey3 = new BCDSAPrivateKey(X509.Mappings.init);
                    byte[] bArr13 = cipherSpi.Cardinal;
                    if (bArr13 == null) {
                        bArr2 = null;
                    } else {
                        bArr2 = new byte[bArr13.length];
                        System.arraycopy(bArr13, 0, bArr2, 0, bArr13.length);
                    }
                    setEnabledVisaCheckout setenabledvisacheckout3 = new setEnabledVisaCheckout(bArr2);
                    byte[] bArr14 = new byte[57];
                    Base64URL.configure(cipherSpi.Cardinal, bArr14);
                    byte[] bArr15 = new BCElGamalPublicKey(bArr14, 0).configure;
                    if (bArr15 != null) {
                        bArr5 = new byte[bArr15.length];
                        System.arraycopy(bArr15, 0, bArr5, 0, bArr15.length);
                    }
                    return new PrivateKeyInfo(bCDSAPrivateKey3, setenabledvisacheckout3, setenabledfsync, bArr5);
                } else if (setccaimageuri instanceof KeyPairGeneratorSpi.X448) {
                    KeyPairGeneratorSpi.X448 x4482 = (KeyPairGeneratorSpi.X448) setccaimageuri;
                    BCDSAPrivateKey bCDSAPrivateKey4 = new BCDSAPrivateKey(X509.Mappings.cca_continue);
                    byte[] bArr16 = x4482.getInstance;
                    if (bArr16 == null) {
                        bArr = null;
                    } else {
                        bArr = new byte[bArr16.length];
                        System.arraycopy(bArr16, 0, bArr, 0, bArr16.length);
                    }
                    setEnabledVisaCheckout setenabledvisacheckout4 = new setEnabledVisaCheckout(bArr);
                    byte[] bArr17 = new byte[32];
                    Curve.configure(x4482.getInstance, bArr17);
                    byte[] bArr18 = new KeyPairGeneratorSpi.X25519(bArr17, 0).getInstance;
                    if (bArr18 != null) {
                        bArr5 = new byte[bArr18.length];
                        System.arraycopy(bArr18, 0, bArr5, 0, bArr18.length);
                    }
                    return new PrivateKeyInfo(bCDSAPrivateKey4, setenabledvisacheckout4, setenabledfsync, bArr5);
                } else {
                    throw new IOException("key parameters not recognized");
                }
            }
        }
    }

    public final void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
        DigestSignatureSpi.SHA256 sha256 = (DigestSignatureSpi.SHA256) sM2withRMD;
        this.getInstance.getInstance(z, sha256);
        int bitLength = sha256.getInstance.bitLength();
        this.init = bitLength;
        byte[] bArr = new byte[((bitLength + 7) / 8)];
        this.configure = bArr;
        int i = this.Cardinal;
        int length = bArr.length;
        if (i == 188) {
            this.onCReqSuccess = new byte[((length - this.cca_continue.getInstance()) - 2)];
        } else {
            this.onCReqSuccess = new byte[((length - this.cca_continue.getInstance()) - 3)];
        }
        this.cca_continue.init();
        this.onValidated = 0;
        byte[] bArr2 = this.onCReqSuccess;
        for (int i2 = 0; i2 != bArr2.length; i2++) {
            bArr2[i2] = 0;
        }
        byte[] bArr3 = this.cleanup;
        if (bArr3 != null) {
            for (int i3 = 0; i3 != bArr3.length; i3++) {
                bArr3[i3] = 0;
            }
        }
        this.cleanup = null;
        this.getWarnings = false;
        if (this.getSDKVersion != null) {
            this.getSDKVersion = null;
            byte[] bArr4 = this.CardinalError;
            for (int i4 = 0; i4 != bArr4.length; i4++) {
                bArr4[i4] = 0;
            }
            this.CardinalError = null;
        }
    }

    public final byte[] init() throws GMCipherSpi.SM2withSha224 {
        int i;
        int i2;
        int i3;
        int i4;
        int instance = this.cca_continue.getInstance();
        boolean z = true;
        if (this.Cardinal == 188) {
            byte[] bArr = this.configure;
            i = (bArr.length - instance) - 1;
            this.cca_continue.init(bArr, i);
            byte[] bArr2 = this.configure;
            bArr2[bArr2.length - 1] = -68;
            i2 = 8;
        } else {
            byte[] bArr3 = this.configure;
            i = (bArr3.length - instance) - 2;
            this.cca_continue.init(bArr3, i);
            byte[] bArr4 = this.configure;
            int i5 = this.Cardinal;
            bArr4[bArr4.length - 2] = (byte) (i5 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i5;
            i2 = 16;
        }
        int i6 = this.onValidated;
        int i7 = ((((instance + i6) << 3) + i2) + 4) - this.init;
        if (i7 > 0) {
            int i8 = i6 - ((i7 + 7) / 8);
            i3 = i - i8;
            System.arraycopy(this.onCReqSuccess, 0, this.configure, i3, i8);
            this.cleanup = new byte[i8];
            i4 = 96;
        } else {
            i3 = i - i6;
            System.arraycopy(this.onCReqSuccess, 0, this.configure, i3, i6);
            this.cleanup = new byte[this.onValidated];
            i4 = 64;
        }
        int i9 = i3 - 1;
        if (i9 > 0) {
            for (int i10 = i9; i10 != 0; i10--) {
                this.configure[i10] = -69;
            }
            byte[] bArr5 = this.configure;
            bArr5[i9] = (byte) (bArr5[i9] ^ 1);
            bArr5[0] = Ascii.VT;
            bArr5[0] = (byte) (11 | i4);
        } else {
            byte[] bArr6 = this.configure;
            bArr6[0] = 10;
            bArr6[0] = (byte) (10 | i4);
        }
        GMCipherSpi.SM2withBlake2b sM2withBlake2b = this.getInstance;
        byte[] bArr7 = this.configure;
        byte[] Cardinal2 = sM2withBlake2b.Cardinal(bArr7, 0, bArr7.length);
        if ((i4 & 32) != 0) {
            z = false;
        }
        this.getWarnings = z;
        byte[] bArr8 = this.onCReqSuccess;
        byte[] bArr9 = this.cleanup;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        this.onValidated = 0;
        byte[] bArr10 = this.onCReqSuccess;
        for (int i11 = 0; i11 != bArr10.length; i11++) {
            bArr10[i11] = 0;
        }
        byte[] bArr11 = this.configure;
        for (int i12 = 0; i12 != bArr11.length; i12++) {
            bArr11[i12] = 0;
        }
        return Cardinal2;
    }

    public final boolean init(byte[] bArr) {
        byte[] bArr2;
        int i;
        boolean z;
        byte[] bArr3 = this.getSDKVersion;
        if (bArr3 == null) {
            try {
                bArr2 = this.getInstance.Cardinal(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else if (getBackgroundColor.Cardinal(bArr3, bArr)) {
            bArr2 = this.CardinalError;
            this.getSDKVersion = null;
            this.CardinalError = null;
        } else {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        }
        if (((bArr2[0] & 192) ^ SignedBytes.MAX_POWER_OF_TWO) != 0) {
            this.onValidated = 0;
            byte[] bArr4 = this.onCReqSuccess;
            for (int i2 = 0; i2 != bArr4.length; i2++) {
                bArr4[i2] = 0;
            }
            for (int i3 = 0; i3 != bArr2.length; i3++) {
                bArr2[i3] = 0;
            }
            return false;
        } else if (((bArr2[bArr2.length - 1] & Ascii.SI) ^ Ascii.FF) != 0) {
            this.onValidated = 0;
            byte[] bArr5 = this.onCReqSuccess;
            for (int i4 = 0; i4 != bArr5.length; i4++) {
                bArr5[i4] = 0;
            }
            for (int i5 = 0; i5 != bArr2.length; i5++) {
                bArr2[i5] = 0;
            }
            return false;
        } else {
            if (((bArr2[bArr2.length - 1] & 255) ^ 188) == 0) {
                i = 1;
            } else {
                i = 2;
                byte b = ((bArr2[bArr2.length - 2] & 255) << 8) | (bArr2[bArr2.length - 1] & 255);
                Integer instance = NullPssDigest.getInstance(this.cca_continue);
                if (instance != null) {
                    int intValue = instance.intValue();
                    if (!(b == intValue || (intValue == 15052 && b == 16588))) {
                        throw new IllegalStateException("signer initialised with wrong digest for trailer ".concat(String.valueOf(b)));
                    }
                } else {
                    throw new IllegalArgumentException("unrecognised hash in signature");
                }
            }
            int i6 = 0;
            while (i6 != bArr2.length && ((bArr2[i6] & Ascii.SI) ^ 10) != 0) {
                i6++;
            }
            int i7 = i6 + 1;
            int instance2 = this.cca_continue.getInstance();
            byte[] bArr6 = new byte[instance2];
            int length = (bArr2.length - i) - instance2;
            int i8 = length - i7;
            if (i8 <= 0) {
                this.onValidated = 0;
                byte[] bArr7 = this.onCReqSuccess;
                for (int i9 = 0; i9 != bArr7.length; i9++) {
                    bArr7[i9] = 0;
                }
                for (int i10 = 0; i10 != bArr2.length; i10++) {
                    bArr2[i10] = 0;
                }
                return false;
            }
            if ((bArr2[0] & 32) == 0) {
                this.getWarnings = true;
                if (this.onValidated > i8) {
                    this.onValidated = 0;
                    byte[] bArr8 = this.onCReqSuccess;
                    for (int i11 = 0; i11 != bArr8.length; i11++) {
                        bArr8[i11] = 0;
                    }
                    for (int i12 = 0; i12 != bArr2.length; i12++) {
                        bArr2[i12] = 0;
                    }
                    return false;
                }
                this.cca_continue.init();
                this.cca_continue.init(bArr2, i7, i8);
                this.cca_continue.init(bArr6, 0);
                boolean z2 = true;
                for (int i13 = 0; i13 != instance2; i13++) {
                    int i14 = length + i13;
                    byte b2 = (byte) (bArr2[i14] ^ bArr6[i13]);
                    bArr2[i14] = b2;
                    if (b2 != 0) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    this.onValidated = 0;
                    byte[] bArr9 = this.onCReqSuccess;
                    for (int i15 = 0; i15 != bArr9.length; i15++) {
                        bArr9[i15] = 0;
                    }
                    for (int i16 = 0; i16 != bArr2.length; i16++) {
                        bArr2[i16] = 0;
                    }
                    return false;
                }
                byte[] bArr10 = new byte[i8];
                this.cleanup = bArr10;
                System.arraycopy(bArr2, i7, bArr10, 0, bArr10.length);
            } else {
                this.getWarnings = false;
                this.cca_continue.init(bArr6, 0);
                boolean z3 = true;
                for (int i17 = 0; i17 != instance2; i17++) {
                    int i18 = length + i17;
                    byte b3 = (byte) (bArr2[i18] ^ bArr6[i17]);
                    bArr2[i18] = b3;
                    if (b3 != 0) {
                        z3 = false;
                    }
                }
                if (!z3) {
                    this.onValidated = 0;
                    byte[] bArr11 = this.onCReqSuccess;
                    for (int i19 = 0; i19 != bArr11.length; i19++) {
                        bArr11[i19] = 0;
                    }
                    for (int i20 = 0; i20 != bArr2.length; i20++) {
                        bArr2[i20] = 0;
                    }
                    return false;
                }
                byte[] bArr12 = new byte[i8];
                this.cleanup = bArr12;
                System.arraycopy(bArr2, i7, bArr12, 0, bArr12.length);
            }
            int i21 = this.onValidated;
            if (i21 != 0) {
                byte[] bArr13 = this.onCReqSuccess;
                byte[] bArr14 = this.cleanup;
                if (i21 > bArr13.length) {
                    z = bArr13.length <= bArr14.length;
                    for (int i22 = 0; i22 != this.onCReqSuccess.length; i22++) {
                        if (bArr13[i22] != bArr14[i22]) {
                            z = false;
                        }
                    }
                } else {
                    z = i21 == bArr14.length;
                    for (int i23 = 0; i23 != bArr14.length; i23++) {
                        if (bArr13[i23] != bArr14[i23]) {
                            z = false;
                        }
                    }
                }
                if (!z) {
                    this.onValidated = 0;
                    byte[] bArr15 = this.onCReqSuccess;
                    for (int i24 = 0; i24 != bArr15.length; i24++) {
                        bArr15[i24] = 0;
                    }
                    for (int i25 = 0; i25 != bArr2.length; i25++) {
                        bArr2[i25] = 0;
                    }
                    return false;
                }
            }
            byte[] bArr16 = this.onCReqSuccess;
            for (int i26 = 0; i26 != bArr16.length; i26++) {
                bArr16[i26] = 0;
            }
            for (int i27 = 0; i27 != bArr2.length; i27++) {
                bArr2[i27] = 0;
            }
            this.onValidated = 0;
            return true;
        }
    }
}
