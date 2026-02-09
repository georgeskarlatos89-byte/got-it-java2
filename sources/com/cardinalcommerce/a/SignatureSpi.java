package com.cardinalcommerce.a;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.GOST;
import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.JStylerObj;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.facebook.imageutils.JfifUtil;
import com.facebook.internal.ServerProtocol;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.apache.http.HttpStatus;
import org.objectweb.asm.Opcodes;

public final class SignatureSpi {
    public int Cardinal;
    private String cca_continue;

    public final class Ed25519 extends appendElement {
        public Ed25519(SecureRandom secureRandom) {
            super(secureRandom, 256);
        }
    }

    public final class Ed448 extends appendElement {
        public Ed448(SecureRandom secureRandom) {
            super(secureRandom, 448);
        }
    }

    final class ecDetDSA384 {
        private static final BigInteger getInstance = BigInteger.valueOf(2);
        private static final BigInteger init = BigInteger.valueOf(1);

        ecDetDSA384() {
        }

        static BigInteger[] Cardinal(int i, int i2, SecureRandom secureRandom) {
            int i3 = i - 1;
            int i4 = i >>> 2;
            while (true) {
                BigInteger instance = setCornerRadius.getInstance(i3, 2, secureRandom);
                BigInteger add = instance.shiftLeft(1).add(init);
                if (add.isProbablePrime(i2) && ((i2 <= 2 || instance.isProbablePrime(i2 - 2)) && get.cca_continue(add) >= i4)) {
                    return new BigInteger[]{add, instance};
                }
            }
        }

        static BigInteger init(BigInteger bigInteger, SecureRandom secureRandom) {
            BigInteger modPow;
            BigInteger subtract = bigInteger.subtract(getInstance);
            do {
                BigInteger bigInteger2 = getInstance;
                modPow = setCornerRadius.Cardinal(bigInteger2, subtract, secureRandom).modPow(bigInteger2, bigInteger);
            } while (modPow.equals(init));
            return modPow;
        }
    }

    public final class ecDetDSASha3_224 {
        private static final BigInteger configure = BigInteger.valueOf(2);
        public SecureRandom cca_continue;
        public int getInstance;
        public int init;

        public final KeyAgreementSpi.X25519withSHA256CKDF configure() {
            BigInteger[] Cardinal = ecDetDSA384.Cardinal(this.init, this.getInstance, this.cca_continue);
            BigInteger bigInteger = Cardinal[0];
            return new KeyAgreementSpi.X25519withSHA256CKDF(bigInteger, ecDetDSA384.init(bigInteger, this.cca_continue), Cardinal[1], configure, (KeyAgreementSpi.X448UwithSHA512CKDF) null);
        }
    }

    public final class ecNR384 extends EncryptedJWT {
        public ecNR384(IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
            super(eCIESwithAESCBC);
        }
    }

    public SignatureSpi() {
    }

    public static GMCipherSpi Cardinal(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        GMCipherSpi init = BCDSTU4145PublicKey.init(aSN1ObjectIdentifier);
        if (init == null) {
            init = KeyAgreementSpi.DHwithSHA224KDF.configure(aSN1ObjectIdentifier);
        }
        if (init == null) {
            init = KeyAgreementSpi.DHwithSHA1KDF.configure(aSN1ObjectIdentifier);
        }
        if (init == null) {
            init = ElGamal.Cardinal(aSN1ObjectIdentifier);
        }
        if (init == null) {
            init = init(IES.Mappings.configure(aSN1ObjectIdentifier));
        }
        return init == null ? X509.configure(aSN1ObjectIdentifier) : init;
    }

    public static GMCipherSpi cca_continue(String str) {
        GMCipherSpi configure = BCDSTU4145PublicKey.configure(str);
        if (configure == null) {
            configure = KeyAgreementSpi.DHwithSHA224KDF.Cardinal(str);
        }
        if (configure == null) {
            configure = IESCipher.IES.configure(str);
        }
        if (configure == null) {
            configure = KeyAgreementSpi.DHwithSHA1KDF.getInstance(str);
        }
        if (configure == null) {
            configure = ElGamal.getInstance(str);
        }
        if (configure == null) {
            configure = init(IES.Mappings.getInstance(str));
        }
        return configure == null ? X509.cca_continue(str) : configure;
    }

    public static String cca_continue(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String instance = BCDSTU4145PublicKey.getInstance(aSN1ObjectIdentifier);
        if (instance == null) {
            instance = KeyAgreementSpi.DHwithSHA224KDF.getInstance(aSN1ObjectIdentifier);
        }
        if (instance == null) {
            instance = IESCipher.IES.getInstance(aSN1ObjectIdentifier);
        }
        if (instance == null) {
            instance = KeyAgreementSpi.DHwithSHA1KDF.getInstance(aSN1ObjectIdentifier);
        }
        if (instance == null) {
            instance = ElGamal.configure(aSN1ObjectIdentifier);
        }
        if (instance == null) {
            instance = IES.Mappings.init(aSN1ObjectIdentifier);
        }
        if (instance == null) {
            instance = X509.init(aSN1ObjectIdentifier);
        }
        return instance == null ? ecCVCDSA384.init(aSN1ObjectIdentifier) : instance;
    }

    public static ASN1ObjectIdentifier getInstance(String str) {
        ASN1ObjectIdentifier init = BCDSTU4145PublicKey.init(str);
        if (init == null) {
            init = KeyAgreementSpi.DHwithSHA224KDF.init(str);
        }
        if (init == null) {
            init = IESCipher.IES.cca_continue(str);
        }
        if (init == null) {
            init = KeyAgreementSpi.DHwithSHA1KDF.configure(str);
        }
        if (init == null) {
            init = ElGamal.init(str);
        }
        if (init == null) {
            init = IES.Mappings.init(str);
        }
        return init == null ? X509.configure(str) : init;
    }

    public class EdDSA extends setCCAImageUri {
        public BCElGamalPrivateKey configure;

        protected EdDSA(boolean z, BCElGamalPrivateKey bCElGamalPrivateKey) {
            super(z);
            this.configure = bCElGamalPrivateKey;
        }

        public int hashCode() {
            BCElGamalPrivateKey bCElGamalPrivateKey = this.configure;
            if (bCElGamalPrivateKey != null) {
                return bCElGamalPrivateKey.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof EdDSA)) {
                return false;
            }
            EdDSA edDSA = (EdDSA) obj;
            BCElGamalPrivateKey bCElGamalPrivateKey = this.configure;
            if (bCElGamalPrivateKey != null) {
                return bCElGamalPrivateKey.equals(edDSA.configure);
            }
            if (edDSA.configure == null) {
                return true;
            }
            return false;
        }
    }

    public final class ecCVCDSA extends KeyFactorySpi.EC {
        public ecCVCDSA() {
        }

        private ecCVCDSA(ecCVCDSA eccvcdsa) {
            super(eccvcdsa);
        }

        public final setBackgroundColor Cardinal() {
            return new ecCVCDSA(this);
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            super.init((ecCVCDSA) setbackgroundcolor);
        }

        public final String configure() {
            return "SHA-384";
        }

        public final int getInstance() {
            return 48;
        }

        public final void init() {
            super.init();
            this.cca_continue = -3766243637369397544L;
            this.init = 7105036623409894663L;
            this.Cardinal = -7973340178411365097L;
            this.configure = 1526699215303891257L;
            this.getInstance = 7436329637833083697L;
            this.getSDKVersion = -8163818279084223215L;
            this.getWarnings = -2662702644619276377L;
            this.cleanup = 5167115440072839076L;
        }

        public final int init(byte[] bArr, int i) {
            onCReqSuccess();
            long j = this.cca_continue;
            setTextFontSize.init((int) (j >>> 32), bArr, i);
            setTextFontSize.init((int) j, bArr, i + 4);
            long j2 = this.init;
            int i2 = i + 8;
            setTextFontSize.init((int) (j2 >>> 32), bArr, i2);
            setTextFontSize.init((int) j2, bArr, i2 + 4);
            long j3 = this.Cardinal;
            int i3 = i + 16;
            setTextFontSize.init((int) (j3 >>> 32), bArr, i3);
            setTextFontSize.init((int) j3, bArr, i3 + 4);
            long j4 = this.configure;
            int i4 = i + 24;
            setTextFontSize.init((int) (j4 >>> 32), bArr, i4);
            setTextFontSize.init((int) j4, bArr, i4 + 4);
            long j5 = this.getInstance;
            int i5 = i + 32;
            setTextFontSize.init((int) (j5 >>> 32), bArr, i5);
            setTextFontSize.init((int) j5, bArr, i5 + 4);
            long j6 = this.getSDKVersion;
            int i6 = i + 40;
            setTextFontSize.init((int) (j6 >>> 32), bArr, i6);
            setTextFontSize.init((int) j6, bArr, i6 + 4);
            init();
            return 48;
        }
    }

    public final class ecCVCDSA224 extends KeyAgreementSpi.MQVwithSHA512KDFAndSharedInfo {
        private static int[] valueOf = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
        private int Cardinal;
        private int cca_continue;
        private int[] cleanup = new int[64];
        private int configure;
        private int getInstance;
        private int getSDKVersion;
        private int getWarnings;
        private int init;
        private int onCReqSuccess;
        private int onValidated;

        public ecCVCDSA224() {
            init();
        }

        private ecCVCDSA224(ecCVCDSA224 eccvcdsa224) {
            super(eccvcdsa224);
            configure(eccvcdsa224);
        }

        private void configure(ecCVCDSA224 eccvcdsa224) {
            super.init(eccvcdsa224);
            this.Cardinal = eccvcdsa224.Cardinal;
            this.configure = eccvcdsa224.configure;
            this.getInstance = eccvcdsa224.getInstance;
            this.init = eccvcdsa224.init;
            this.cca_continue = eccvcdsa224.cca_continue;
            this.onCReqSuccess = eccvcdsa224.onCReqSuccess;
            this.getWarnings = eccvcdsa224.getWarnings;
            this.onValidated = eccvcdsa224.onValidated;
            int[] iArr = eccvcdsa224.cleanup;
            System.arraycopy(iArr, 0, this.cleanup, 0, iArr.length);
            this.getSDKVersion = eccvcdsa224.getSDKVersion;
        }

        public final setBackgroundColor Cardinal() {
            return new ecCVCDSA224(this);
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            configure((ecCVCDSA224) setbackgroundcolor);
        }

        public final String configure() {
            return "SHA-256";
        }

        /* access modifiers changed from: protected */
        public final void configure(long j) {
            if (this.getSDKVersion > 14) {
                cleanup();
            }
            int[] iArr = this.cleanup;
            iArr[14] = (int) (j >>> 32);
            iArr[15] = (int) j;
        }

        public final int getInstance() {
            return 32;
        }

        /* access modifiers changed from: protected */
        public final void getInstance(byte[] bArr, int i) {
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << Ascii.CAN) | ((bArr[i2] & 255) << Ascii.DLE) | ((bArr[i3] & 255) << 8);
            int[] iArr = this.cleanup;
            int i5 = this.getSDKVersion;
            iArr[i5] = i4;
            int i6 = i5 + 1;
            this.getSDKVersion = i6;
            if (i6 == 16) {
                cleanup();
            }
        }

        public final int init(byte[] bArr, int i) {
            getSDKVersion();
            setTextFontSize.init(this.Cardinal, bArr, i);
            setTextFontSize.init(this.configure, bArr, i + 4);
            setTextFontSize.init(this.getInstance, bArr, i + 8);
            setTextFontSize.init(this.init, bArr, i + 12);
            setTextFontSize.init(this.cca_continue, bArr, i + 16);
            setTextFontSize.init(this.onCReqSuccess, bArr, i + 20);
            setTextFontSize.init(this.getWarnings, bArr, i + 24);
            setTextFontSize.init(this.onValidated, bArr, i + 28);
            init();
            return 32;
        }

        public final void init() {
            super.init();
            this.Cardinal = 1779033703;
            this.configure = -1150833019;
            this.getInstance = 1013904242;
            this.init = -1521486534;
            this.cca_continue = 1359893119;
            this.onCReqSuccess = -1694144372;
            this.getWarnings = 528734635;
            this.onValidated = 1541459225;
            this.getSDKVersion = 0;
            int i = 0;
            while (true) {
                int[] iArr = this.cleanup;
                if (i != iArr.length) {
                    iArr[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void cleanup() {
            ecCVCDSA224 eccvcdsa224 = this;
            for (int i = 16; i <= 63; i++) {
                int[] iArr = eccvcdsa224.cleanup;
                int i2 = iArr[i - 2];
                int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
                int i4 = iArr[i - 15];
                iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
            }
            int i5 = eccvcdsa224.Cardinal;
            int i6 = eccvcdsa224.configure;
            int i7 = eccvcdsa224.getInstance;
            int i8 = eccvcdsa224.init;
            int i9 = eccvcdsa224.cca_continue;
            int i10 = eccvcdsa224.onCReqSuccess;
            int i11 = eccvcdsa224.getWarnings;
            int i12 = eccvcdsa224.onValidated;
            int i13 = 0;
            int i14 = 0;
            while (i13 < 8) {
                int i15 = ((((i9 >>> 6) | (i9 << 26)) ^ ((i9 >>> 11) | (i9 << 21))) ^ ((i9 >>> 25) | (i9 << 7))) + ((i9 & i10) ^ ((~i9) & i11));
                int[] iArr2 = valueOf;
                int i16 = i15 + iArr2[i14];
                int[] iArr3 = eccvcdsa224.cleanup;
                int i17 = i12 + i16 + iArr3[i14];
                int i18 = i8 + i17;
                int i19 = i5 & i6;
                int i20 = i17 + ((((i5 >>> 2) | (i5 << 30)) ^ ((i5 >>> 13) | (i5 << 19))) ^ ((i5 >>> 22) | (i5 << 10))) + ((i19 ^ (i5 & i7)) ^ (i6 & i7));
                int i21 = i14 + 1;
                int i22 = i11 + ((((i18 >>> 6) | (i18 << 26)) ^ ((i18 >>> 11) | (i18 << 21))) ^ ((i18 >>> 25) | (i18 << 7))) + ((i18 & i9) ^ ((~i18) & i10)) + iArr2[i21] + iArr3[i21];
                int i23 = i7 + i22;
                int i24 = i20 & i5;
                int i25 = i22 + ((((i20 >>> 2) | (i20 << 30)) ^ ((i20 >>> 13) | (i20 << 19))) ^ ((i20 >>> 22) | (i20 << 10))) + ((i24 ^ (i20 & i6)) ^ i19);
                int i26 = i21 + 1;
                int i27 = i10 + ((((i23 >>> 6) | (i23 << 26)) ^ ((i23 >>> 11) | (i23 << 21))) ^ ((i23 >>> 25) | (i23 << 7))) + ((i23 & i18) ^ ((~i23) & i9)) + iArr2[i26] + iArr3[i26];
                int i28 = i6 + i27;
                int i29 = i25 & i20;
                int i30 = i27 + ((((i25 >>> 2) | (i25 << 30)) ^ ((i25 >>> 13) | (i25 << 19))) ^ ((i25 >>> 22) | (i25 << 10))) + ((i29 ^ (i25 & i5)) ^ i24);
                int i31 = i26 + 1;
                int i32 = i9 + ((((i28 >>> 6) | (i28 << 26)) ^ ((i28 >>> 11) | (i28 << 21))) ^ ((i28 >>> 25) | (i28 << 7))) + (((~i28) & i18) ^ (i28 & i23)) + iArr2[i31] + iArr3[i31];
                int i33 = i5 + i32;
                int i34 = i30 & i25;
                int i35 = i32 + ((((i30 >>> 2) | (i30 << 30)) ^ ((i30 >>> 13) | (i30 << 19))) ^ ((i30 >>> 22) | (i30 << 10))) + (i29 ^ ((i30 & i20) ^ i34));
                int i36 = i31 + 1;
                int i37 = i18 + ((((i33 >>> 6) | (i33 << 26)) ^ ((i33 >>> 11) | (i33 << 21))) ^ ((i33 >>> 25) | (i33 << 7))) + ((i33 & i28) ^ ((~i33) & i23)) + iArr2[i36] + iArr3[i36];
                i12 = i20 + i37;
                int i38 = i35 & i30;
                i8 = i37 + ((((i35 >>> 2) | (i35 << 30)) ^ ((i35 >>> 13) | (i35 << 19))) ^ ((i35 >>> 22) | (i35 << 10))) + (i34 ^ ((i35 & i25) ^ i38));
                int i39 = i36 + 1;
                int i40 = i23 + ((((i12 >>> 6) | (i12 << 26)) ^ ((i12 >>> 11) | (i12 << 21))) ^ ((i12 >>> 25) | (i12 << 7))) + ((i12 & i33) ^ ((~i12) & i28)) + iArr2[i39] + iArr3[i39];
                i11 = i25 + i40;
                int i41 = i8 & i35;
                i7 = i40 + ((((i8 >>> 2) | (i8 << 30)) ^ ((i8 >>> 13) | (i8 << 19))) ^ ((i8 >>> 22) | (i8 << 10))) + (i38 ^ ((i8 & i30) ^ i41));
                int i42 = i39 + 1;
                int i43 = i28 + ((((i11 >>> 6) | (i11 << 26)) ^ ((i11 >>> 11) | (i11 << 21))) ^ ((i11 >>> 25) | (i11 << 7))) + ((i11 & i12) ^ ((~i11) & i33)) + iArr2[i42] + iArr3[i42];
                i10 = i30 + i43;
                int i44 = i7 & i8;
                i6 = i43 + ((((i7 >>> 2) | (i7 << 30)) ^ ((i7 >>> 13) | (i7 << 19))) ^ ((i7 >>> 22) | (i7 << 10))) + (i41 ^ ((i7 & i35) ^ i44));
                int i45 = i42 + 1;
                int i46 = i33 + ((((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21))) ^ ((i10 >>> 25) | (i10 << 7))) + ((i10 & i11) ^ ((~i10) & i12)) + iArr2[i45] + iArr3[i45];
                i9 = i35 + i46;
                i5 = i46 + ((((i6 >>> 2) | (i6 << 30)) ^ ((i6 >>> 13) | (i6 << 19))) ^ ((i6 >>> 22) | (i6 << 10))) + (((i6 & i7) ^ (i6 & i8)) ^ i44);
                i14 = i45 + 1;
                i13++;
                eccvcdsa224 = this;
            }
            eccvcdsa224.Cardinal += i5;
            eccvcdsa224.configure += i6;
            eccvcdsa224.getInstance += i7;
            eccvcdsa224.init += i8;
            eccvcdsa224.cca_continue += i9;
            eccvcdsa224.onCReqSuccess += i10;
            eccvcdsa224.getWarnings += i11;
            eccvcdsa224.onValidated += i12;
            eccvcdsa224.getSDKVersion = 0;
            for (int i47 = 0; i47 < 16; i47++) {
                eccvcdsa224.cleanup[i47] = 0;
            }
        }
    }

    public final class ecCVCDSA256 extends KeyFactorySpi.EC {
        private long CardinalEnvironment;
        private long CardinalError;
        private long CardinalRenderType;
        private long getActionCode;
        private long getString;
        private int onCReqSuccess;
        private long onValidated;
        private long valueOf;
        private long values;

        private ecCVCDSA256(ecCVCDSA256 eccvcdsa256) {
            super(eccvcdsa256);
            this.onCReqSuccess = eccvcdsa256.onCReqSuccess;
            cca_continue(eccvcdsa256);
        }

        private static void cca_continue(int i, byte[] bArr, int i2, int i3) {
            int min = Math.min(4, i3);
            while (true) {
                min--;
                if (min >= 0) {
                    bArr[i2 + min] = (byte) (i >>> ((3 - min) * 8));
                } else {
                    return;
                }
            }
        }

        private static void init(long j, byte[] bArr, int i, int i2) {
            if (i2 > 0) {
                cca_continue((int) (j >>> 32), bArr, i, i2);
                if (i2 > 4) {
                    cca_continue((int) j, bArr, i + 4, i2 - 4);
                }
            }
        }

        public final setBackgroundColor Cardinal() {
            return new ecCVCDSA256(this);
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            ecCVCDSA256 eccvcdsa256 = (ecCVCDSA256) setbackgroundcolor;
            if (this.onCReqSuccess == eccvcdsa256.onCReqSuccess) {
                super.init(eccvcdsa256);
                this.onValidated = eccvcdsa256.onValidated;
                this.CardinalError = eccvcdsa256.CardinalError;
                this.CardinalRenderType = eccvcdsa256.CardinalRenderType;
                this.CardinalEnvironment = eccvcdsa256.CardinalEnvironment;
                this.values = eccvcdsa256.values;
                this.valueOf = eccvcdsa256.valueOf;
                this.getActionCode = eccvcdsa256.getActionCode;
                this.getString = eccvcdsa256.getString;
                return;
            }
            throw new getCornerRadius("digestLength inappropriate in other");
        }

        public final String configure() {
            return new StringBuilder("SHA-512/").append(Integer.toString(this.onCReqSuccess << 3)).toString();
        }

        public final int getInstance() {
            return this.onCReqSuccess;
        }

        public final int init(byte[] bArr, int i) {
            onCReqSuccess();
            init(this.cca_continue, bArr, i, this.onCReqSuccess);
            init(this.init, bArr, i + 8, this.onCReqSuccess - 8);
            init(this.Cardinal, bArr, i + 16, this.onCReqSuccess - 16);
            init(this.configure, bArr, i + 24, this.onCReqSuccess - 24);
            init(this.getInstance, bArr, i + 32, this.onCReqSuccess - 32);
            init(this.getSDKVersion, bArr, i + 40, this.onCReqSuccess - 40);
            init(this.getWarnings, bArr, i + 48, this.onCReqSuccess - 48);
            init(this.cleanup, bArr, i + 56, this.onCReqSuccess - 56);
            init();
            return this.onCReqSuccess;
        }

        public final void init() {
            super.init();
            this.cca_continue = this.onValidated;
            this.init = this.CardinalError;
            this.Cardinal = this.CardinalRenderType;
            this.configure = this.CardinalEnvironment;
            this.getInstance = this.values;
            this.getSDKVersion = this.valueOf;
            this.getWarnings = this.getActionCode;
            this.cleanup = this.getString;
        }

        public ecCVCDSA256(int i) {
            if (i >= 512) {
                throw new IllegalArgumentException("bitLength cannot be >= 512");
            } else if (i % 8 != 0) {
                throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
            } else if (i != 384) {
                int i2 = i / 8;
                this.onCReqSuccess = i2;
                int i3 = i2 << 3;
                this.cca_continue = -3482333909917012819L;
                this.init = 2216346199247487646L;
                this.Cardinal = -7364697282686394994L;
                this.configure = 65953792586715988L;
                this.getInstance = -816286391624063116L;
                this.getSDKVersion = 4512832404995164602L;
                this.getWarnings = -5033199132376557362L;
                this.cleanup = -124578254951840548L;
                cca_continue((byte) 83);
                cca_continue((byte) 72);
                cca_continue((byte) 65);
                cca_continue((byte) 45);
                cca_continue((byte) 53);
                cca_continue((byte) 49);
                cca_continue((byte) 50);
                cca_continue((byte) 47);
                if (i3 > 100) {
                    cca_continue((byte) ((i3 / 100) + 48));
                    int i4 = i3 % 100;
                    cca_continue((byte) ((i4 / 10) + 48));
                    i3 = i4 % 10;
                } else if (i3 > 10) {
                    cca_continue((byte) ((i3 / 10) + 48));
                    i3 %= 10;
                }
                cca_continue((byte) (i3 + 48));
                onCReqSuccess();
                this.onValidated = this.cca_continue;
                this.CardinalError = this.init;
                this.CardinalRenderType = this.Cardinal;
                this.CardinalEnvironment = this.configure;
                this.values = this.getInstance;
                this.valueOf = this.getSDKVersion;
                this.getActionCode = this.getWarnings;
                this.getString = this.cleanup;
                init();
            } else {
                throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
            }
        }
    }

    public final class ecCVCDSA512 extends KeyAgreementSpi.MQVwithSHA256KDFAndSharedInfo implements KeyAgreementSpi.DH {
        public ecCVCDSA512() {
            this(128);
        }

        public final String configure() {
            return new StringBuilder("SHAKE").append(this.init).toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ecCVCDSA512(int i) {
            super(i);
            if (i == 128 || i == 256) {
                return;
            }
            throw new IllegalArgumentException(new StringBuilder("'bitLength' ").append(i).append(" not supported for SHAKE").toString());
        }

        public final int init(byte[] bArr, int i) {
            int instance = getInstance();
            if (!this.configure) {
                getInstance(15, 4);
            }
            Cardinal(bArr, i, ((long) instance) << 3);
            init();
            return instance;
        }

        public final int getInstance(byte[] bArr, int i, int i2) {
            if (!this.configure) {
                getInstance(15, 4);
            }
            Cardinal(bArr, 0, ((long) i2) << 3);
            init();
            return i2;
        }
    }

    public final class ecDSA extends KeyAgreementSpi.MQVwithSHA512KDFAndSharedInfo {
        private static final int[] cca_continue = new int[64];
        private int[] Cardinal = new int[68];
        private int configure;
        private int[] getInstance = new int[16];
        private int[] init = new int[8];

        static {
            int i;
            int i2 = 0;
            while (true) {
                if (i2 >= 16) {
                    break;
                }
                cca_continue[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
                i2++;
            }
            for (i = 16; i < 64; i++) {
                int i3 = i % 32;
                cca_continue[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
            }
        }

        public ecDSA() {
            init();
        }

        private ecDSA(ecDSA ecdsa) {
            super(ecdsa);
            init(ecdsa);
        }

        private void init(ecDSA ecdsa) {
            int[] iArr = ecdsa.init;
            int[] iArr2 = this.init;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            int[] iArr3 = ecdsa.getInstance;
            int[] iArr4 = this.getInstance;
            System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
            this.configure = ecdsa.configure;
        }

        public final setBackgroundColor Cardinal() {
            return new ecDSA(this);
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            ecDSA ecdsa = (ecDSA) setbackgroundcolor;
            super.init(ecdsa);
            init(ecdsa);
        }

        public final String configure() {
            return "SM3";
        }

        /* access modifiers changed from: protected */
        public final void configure(long j) {
            int i = this.configure;
            if (i > 14) {
                this.getInstance[i] = 0;
                this.configure = i + 1;
                cleanup();
            }
            while (true) {
                int i2 = this.configure;
                if (i2 < 14) {
                    this.getInstance[i2] = 0;
                    this.configure = i2 + 1;
                } else {
                    int[] iArr = this.getInstance;
                    int i3 = i2 + 1;
                    iArr[i2] = (int) (j >>> 32);
                    this.configure = i3 + 1;
                    iArr[i3] = (int) j;
                    return;
                }
            }
        }

        public final int getInstance() {
            return 32;
        }

        /* access modifiers changed from: protected */
        public final void getInstance(byte[] bArr, int i) {
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = (bArr[i3 + 1] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i2] & 255) << Ascii.DLE) | ((bArr[i3] & 255) << 8);
            int[] iArr = this.getInstance;
            int i5 = this.configure;
            iArr[i5] = i4;
            int i6 = i5 + 1;
            this.configure = i6;
            if (i6 >= 16) {
                cleanup();
            }
        }

        public final void init() {
            super.init();
            int[] iArr = this.init;
            iArr[0] = 1937774191;
            iArr[1] = 1226093241;
            iArr[2] = 388252375;
            iArr[3] = -628488704;
            iArr[4] = -1452330820;
            iArr[5] = 372324522;
            iArr[6] = -477237683;
            iArr[7] = -1325724082;
            this.configure = 0;
        }

        public final int init(byte[] bArr, int i) {
            getSDKVersion();
            int[] iArr = this.init;
            for (int init2 : iArr) {
                setTextFontSize.init(init2, bArr, i);
                i += 4;
            }
            init();
            return 32;
        }

        /* access modifiers changed from: protected */
        public final void cleanup() {
            int i;
            int i2 = 0;
            while (true) {
                if (i2 >= 16) {
                    break;
                }
                this.Cardinal[i2] = this.getInstance[i2];
                i2++;
            }
            for (int i3 = 16; i3 < 68; i3++) {
                int[] iArr = this.Cardinal;
                int i4 = iArr[i3 - 3];
                int i5 = iArr[i3 - 13];
                int i6 = ((i4 >>> 17) | (i4 << 15)) ^ (iArr[i3 - 16] ^ iArr[i3 - 9]);
                iArr[i3] = (((i6 ^ ((i6 << 15) | (i6 >>> 17))) ^ ((i6 << 23) | (i6 >>> 9))) ^ ((i5 >>> 25) | (i5 << 7))) ^ iArr[i3 - 6];
            }
            int[] iArr2 = this.init;
            int i7 = iArr2[0];
            int i8 = iArr2[1];
            int i9 = iArr2[2];
            int i10 = iArr2[3];
            int i11 = iArr2[4];
            int i12 = iArr2[5];
            int i13 = iArr2[6];
            int i14 = iArr2[7];
            int i15 = 0;
            for (i = 16; i15 < i; i = 16) {
                int i16 = (i7 << 12) | (i7 >>> 20);
                int i17 = i16 + i11 + cca_continue[i15];
                int i18 = (i17 << 7) | (i17 >>> 25);
                int[] iArr3 = this.Cardinal;
                int i19 = iArr3[i15];
                int i20 = ((i11 ^ i12) ^ i13) + i14 + i18 + i19;
                int i21 = (i8 << 9) | (i8 >>> 23);
                int i22 = (i12 << 19) | (i12 >>> 13);
                i15++;
                i12 = i11;
                i11 = (i20 ^ ((i20 << 9) | (i20 >>> 23))) ^ ((i20 << 17) | (i20 >>> 15));
                i10 = i9;
                i9 = i21;
                i14 = i13;
                i13 = i22;
                i8 = i7;
                i7 = ((i7 ^ i8) ^ i9) + i10 + (i18 ^ i16) + (i19 ^ iArr3[i15 + 4]);
            }
            int i23 = i14;
            int i24 = i12;
            int i25 = i13;
            int i26 = i11;
            int i27 = i10;
            int i28 = i9;
            int i29 = i8;
            int i30 = i7;
            int i31 = 16;
            while (i31 < 64) {
                int i32 = (i30 << 12) | (i30 >>> 20);
                int i33 = i32 + i26 + cca_continue[i31];
                int i34 = (i33 << 7) | (i33 >>> 25);
                int[] iArr4 = this.Cardinal;
                int i35 = iArr4[i31];
                int i36 = ((i30 & i29) | (i30 & i28) | (i29 & i28)) + i27 + (i34 ^ i32);
                int i37 = ((i26 & i24) | ((~i26) & i25)) + i23 + i34 + i35;
                int i38 = (i24 << 19) | (i24 >>> 13);
                i31++;
                i24 = i26;
                i26 = (i37 ^ ((i37 << 9) | (i37 >>> 23))) ^ ((i37 << 17) | (i37 >>> 15));
                i27 = i28;
                i28 = (i29 >>> 23) | (i29 << 9);
                i29 = i30;
                i30 = i36 + (i35 ^ iArr4[i31 + 4]);
                int i39 = i38;
                i23 = i25;
                i25 = i39;
            }
            int[] iArr5 = this.init;
            iArr5[0] = i30 ^ iArr5[0];
            iArr5[1] = iArr5[1] ^ i29;
            iArr5[2] = iArr5[2] ^ i28;
            iArr5[3] = iArr5[3] ^ i27;
            iArr5[4] = iArr5[4] ^ i26;
            iArr5[5] = iArr5[5] ^ i24;
            iArr5[6] = i25 ^ iArr5[6];
            iArr5[7] = iArr5[7] ^ i23;
            this.configure = 0;
        }
    }

    public final class ecDSA224 implements GMCipherSpi.SM2withBlake2b {
        private static byte[] Cardinal = {Ascii.SO, 3, 5, 8, 9, 4, 2, Ascii.SI, 0, Ascii.CR, Ascii.VT, 6, 7, 10, Ascii.FF, 1};
        private static final BigInteger cca_continue = BigInteger.valueOf(6);
        private static final BigInteger getInstance = BigInteger.valueOf(16);
        private static byte[] init = {8, Ascii.SI, 6, 1, 5, 2, Ascii.VT, Ascii.FF, 3, 4, Ascii.CR, 10, Ascii.SO, 9, 0, 7};
        private int cleanup;
        private GMCipherSpi.SM2withBlake2b configure;
        private BigInteger getSDKVersion;
        private int getWarnings = 0;
        private boolean onCReqSuccess;

        public ecDSA224(GMCipherSpi.SM2withBlake2b sM2withBlake2b) {
            this.configure = sM2withBlake2b;
        }

        public final int getInstance() {
            int instance = this.configure.getInstance();
            return this.onCReqSuccess ? instance : (instance + 1) / 2;
        }

        public final int init() {
            int init2 = this.configure.init();
            return this.onCReqSuccess ? (init2 + 1) / 2 : init2;
        }

        public final void getInstance(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            DigestSignatureSpi.SHA256 sha256 = sM2withRMD instanceof DigestSignatureSpi.RIPEMD128 ? (DigestSignatureSpi.SHA256) ((DigestSignatureSpi.RIPEMD128) sM2withRMD).cca_continue : (DigestSignatureSpi.SHA256) sM2withRMD;
            this.configure.getInstance(z, sM2withRMD);
            BigInteger bigInteger = sha256.getInstance;
            this.getSDKVersion = bigInteger;
            this.cleanup = bigInteger.bitLength();
            this.onCReqSuccess = z;
        }

        public final byte[] Cardinal(byte[] bArr, int i, int i2) throws KeyAgreementSpi.AnonymousClass1 {
            byte[] bArr2 = bArr;
            int i3 = i;
            int i4 = i2;
            int i5 = 0;
            if (this.onCReqSuccess) {
                int i6 = this.cleanup;
                int i7 = (i6 + 7) / 8;
                byte[] bArr3 = new byte[i7];
                int i8 = this.getWarnings + 1;
                int i9 = (i6 + 13) / 16;
                for (int i10 = 0; i10 < i9; i10 += i4) {
                    if (i10 > i9 - i4) {
                        int i11 = i9 - i10;
                        System.arraycopy(bArr2, (i3 + i4) - i11, bArr3, i7 - i9, i11);
                    } else {
                        System.arraycopy(bArr2, i3, bArr3, i7 - (i10 + i4), i4);
                    }
                }
                for (int i12 = i7 - (i9 * 2); i12 != i7; i12 += 2) {
                    byte b = bArr3[(i7 - i9) + (i12 / 2)];
                    byte[] bArr4 = Cardinal;
                    bArr3[i12] = (byte) (bArr4[b & Ascii.SI] | (bArr4[(b & 255) >>> 4] << 4));
                    bArr3[i12 + 1] = b;
                }
                int i13 = i7 - (i4 * 2);
                bArr3[i13] = (byte) (bArr3[i13] ^ i8);
                int i14 = i7 - 1;
                bArr3[i14] = (byte) ((bArr3[i14] << 4) | 6);
                int i15 = 8 - ((this.cleanup - 1) % 8);
                if (i15 != 8) {
                    byte b2 = (byte) (bArr3[0] & (255 >>> i15));
                    bArr3[0] = b2;
                    bArr3[0] = (byte) ((128 >>> i15) | b2);
                } else {
                    bArr3[0] = 0;
                    bArr3[1] = (byte) (bArr3[1] | 128);
                    i5 = 1;
                }
                return this.configure.Cardinal(bArr3, i5, i7 - i5);
            }
            byte[] Cardinal2 = this.configure.Cardinal(bArr2, i3, i4);
            int i16 = (this.cleanup + 13) / 16;
            BigInteger bigInteger = new BigInteger(1, Cardinal2);
            BigInteger bigInteger2 = getInstance;
            BigInteger mod = bigInteger.mod(bigInteger2);
            BigInteger bigInteger3 = cca_continue;
            if (!mod.equals(bigInteger3)) {
                if (this.getSDKVersion.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                    bigInteger = this.getSDKVersion.subtract(bigInteger);
                } else {
                    throw new KeyAgreementSpi.AnonymousClass1("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
                }
            }
            byte[] byteArray = bigInteger.toByteArray();
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                byte[] bArr5 = new byte[length];
                System.arraycopy(byteArray, 1, bArr5, 0, length);
                byteArray = bArr5;
            }
            if ((byteArray[byteArray.length - 1] & Ascii.SI) == 6) {
                byteArray[byteArray.length - 1] = (byte) (((byteArray[byteArray.length - 1] & 255) >>> 4) | (init[(byteArray[byteArray.length - 2] & 255) >> 4] << 4));
                byte[] bArr6 = Cardinal;
                byte b3 = byteArray[1];
                byteArray[0] = (byte) (bArr6[b3 & Ascii.SI] | (bArr6[(b3 & 255) >>> 4] << 4));
                int i17 = 0;
                boolean z = false;
                byte b4 = 1;
                for (int length2 = byteArray.length - 1; length2 >= byteArray.length - (i16 * 2); length2 -= 2) {
                    byte[] bArr7 = Cardinal;
                    byte b5 = byteArray[length2];
                    byte b6 = bArr7[b5 & Ascii.SI] | (bArr7[(b5 & 255) >>> 4] << 4);
                    int i18 = length2 - 1;
                    byte b7 = byteArray[i18];
                    if (((b7 ^ b6) & 255) != 0) {
                        if (!z) {
                            b4 = (b7 ^ b6) & 255;
                            z = true;
                            i17 = i18;
                        } else {
                            throw new KeyAgreementSpi.AnonymousClass1("invalid tsums in block");
                        }
                    }
                }
                byteArray[i17] = 0;
                int length3 = (byteArray.length - i17) / 2;
                byte[] bArr8 = new byte[length3];
                while (i5 < length3) {
                    bArr8[i5] = byteArray[(i5 * 2) + i17 + 1];
                    i5++;
                }
                this.getWarnings = b4 - 1;
                return bArr8;
            }
            throw new KeyAgreementSpi.AnonymousClass1("invalid forcing byte in block");
        }
    }

    public final class ecDSA384 extends ecDSASha3_256 {
        private int[] Cardinal = null;
        private int[] cca_continue = null;
        private int[] configure = null;
        private boolean init;

        public final int Cardinal(byte[] bArr, int i, byte[] bArr2, int i2) {
            int[] iArr = this.Cardinal;
            if (iArr == null) {
                throw new IllegalStateException("DESede engine not initialised");
            } else if (i + 8 > bArr.length) {
                throw new GMSignatureSpi("input buffer too short");
            } else if (i2 + 8 <= bArr2.length) {
                byte[] bArr3 = new byte[8];
                if (this.init) {
                    init(iArr, bArr, i, bArr3, 0);
                    init(this.configure, bArr3, 0, bArr3, 0);
                    init(this.cca_continue, bArr3, 0, bArr2, i2);
                } else {
                    init(this.cca_continue, bArr, i, bArr3, 0);
                    init(this.configure, bArr3, 0, bArr3, 0);
                    init(this.Cardinal, bArr3, 0, bArr2, i2);
                }
                return 8;
            } else {
                throw new KeyAgreementSpi.CDHwithSHA224KDFAndSharedInfo("output buffer too short");
            }
        }

        public final void Cardinal() {
        }

        public final String cca_continue() {
            return "DESede";
        }

        public final int getInstance() {
            return 8;
        }

        public final void getInstance(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            if (sM2withRMD instanceof CipherSpi.ISO9796d1Padding) {
                byte[] bArr = ((CipherSpi.ISO9796d1Padding) sM2withRMD).getInstance;
                if (bArr.length == 24 || bArr.length == 16) {
                    this.init = z;
                    byte[] bArr2 = new byte[8];
                    System.arraycopy(bArr, 0, bArr2, 0, 8);
                    this.Cardinal = Cardinal(z, bArr2);
                    byte[] bArr3 = new byte[8];
                    System.arraycopy(bArr, 8, bArr3, 0, 8);
                    this.configure = Cardinal(!z, bArr3);
                    if (bArr.length == 24) {
                        byte[] bArr4 = new byte[8];
                        System.arraycopy(bArr, 16, bArr4, 0, 8);
                        this.cca_continue = Cardinal(z, bArr4);
                        return;
                    }
                    this.cca_continue = this.Cardinal;
                    return;
                }
                throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
            }
            throw new IllegalArgumentException(new StringBuilder("invalid parameter passed to DESede init - ").append(sM2withRMD.getClass().getName()).toString());
        }
    }

    public final class ecDSA512 implements GMCipherSpi.SM2withBlake2b {
        private static final BigInteger cleanup = BigInteger.valueOf(1);
        private static final BigInteger getSDKVersion = BigInteger.valueOf(2);
        private static final BigInteger init = BigInteger.valueOf(0);
        private EdDSA Cardinal;
        private SecureRandom cca_continue;
        private boolean configure;
        private int getInstance;

        public final int getInstance() {
            return this.configure ? ((this.getInstance + 7) / 8) * 2 : (this.getInstance - 1) / 8;
        }

        public final int init() {
            return this.configure ? (this.getInstance - 1) / 8 : ((this.getInstance + 7) / 8) * 2;
        }

        public final void getInstance(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            SecureRandom secureRandom;
            if (sM2withRMD instanceof DigestSignatureSpi.RIPEMD128) {
                DigestSignatureSpi.RIPEMD128 ripemd128 = (DigestSignatureSpi.RIPEMD128) sM2withRMD;
                this.Cardinal = (EdDSA) ripemd128.cca_continue;
                secureRandom = ripemd128.Cardinal;
            } else {
                this.Cardinal = (EdDSA) sM2withRMD;
                secureRandom = GMCipherSpi.SM2withWhirlpool.configure();
            }
            this.cca_continue = secureRandom;
            this.configure = z;
            this.getInstance = this.Cardinal.configure.init.bitLength();
            if (z) {
                if (!(this.Cardinal instanceof BCGOST3410PrivateKey)) {
                    throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
                }
            } else if (!(this.Cardinal instanceof ElGamalUtil)) {
                throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
            }
        }

        public final byte[] Cardinal(byte[] bArr, int i, int i2) {
            int i3;
            BigInteger configure2;
            EdDSA edDSA = this.Cardinal;
            if (edDSA != null) {
                boolean z = this.configure;
                if (z) {
                    i3 = ((this.getInstance - 1) + 7) / 8;
                } else {
                    i3 = z ? (this.getInstance - 1) / 8 : ((this.getInstance + 7) / 8) * 2;
                }
                if (i2 <= i3) {
                    BigInteger bigInteger = edDSA.configure.init;
                    if (this.Cardinal instanceof ElGamalUtil) {
                        int i4 = i2 / 2;
                        byte[] bArr2 = new byte[i4];
                        byte[] bArr3 = new byte[i4];
                        System.arraycopy(bArr, i, bArr2, 0, i4);
                        System.arraycopy(bArr, i + i4, bArr3, 0, i4);
                        return setCornerRadius.configure(new BigInteger(1, bArr2).modPow(bigInteger.subtract(cleanup).subtract(((ElGamalUtil) this.Cardinal).init), bigInteger).multiply(new BigInteger(1, bArr3)).mod(bigInteger));
                    }
                    if (!(i == 0 && i2 == bArr.length)) {
                        byte[] bArr4 = new byte[i2];
                        System.arraycopy(bArr, i, bArr4, 0, i2);
                        bArr = bArr4;
                    }
                    BigInteger bigInteger2 = new BigInteger(1, bArr);
                    if (bigInteger2.compareTo(bigInteger) < 0) {
                        BCGOST3410PrivateKey bCGOST3410PrivateKey = (BCGOST3410PrivateKey) this.Cardinal;
                        int bitLength = bigInteger.bitLength();
                        while (true) {
                            configure2 = setCornerRadius.configure(bitLength, this.cca_continue);
                            if (!configure2.equals(init) && configure2.compareTo(bigInteger.subtract(getSDKVersion)) <= 0) {
                                break;
                            }
                        }
                        BigInteger modPow = this.Cardinal.configure.getInstance.modPow(configure2, bigInteger);
                        BigInteger mod = bigInteger2.multiply(bCGOST3410PrivateKey.cca_continue.modPow(configure2, bigInteger)).mod(bigInteger);
                        byte[] byteArray = modPow.toByteArray();
                        byte[] byteArray2 = mod.toByteArray();
                        int i5 = this.configure ? ((this.getInstance + 7) / 8) * 2 : (this.getInstance - 1) / 8;
                        byte[] bArr5 = new byte[i5];
                        int i6 = i5 / 2;
                        if (byteArray.length > i6) {
                            System.arraycopy(byteArray, 1, bArr5, i6 - (byteArray.length - 1), byteArray.length - 1);
                        } else {
                            System.arraycopy(byteArray, 0, bArr5, i6 - byteArray.length, byteArray.length);
                        }
                        if (byteArray2.length > i6) {
                            System.arraycopy(byteArray2, 1, bArr5, i5 - (byteArray2.length - 1), byteArray2.length - 1);
                        } else {
                            System.arraycopy(byteArray2, 0, bArr5, i5 - byteArray2.length, byteArray2.length);
                        }
                        return bArr5;
                    }
                    throw new GMSignatureSpi("input too large for ElGamal cipher.\n");
                }
                throw new GMSignatureSpi("input too large for ElGamal cipher.\n");
            }
            throw new IllegalStateException("ElGamal engine not initialised");
        }
    }

    public final class ecDSARipeMD160 implements GMCipherSpi.SM2withBlake2b, PrivilegedAction {
        private SecureRandom Cardinal;
        private boolean cca_continue;
        private boolean configure;
        private boolean getInstance;
        private int getWarnings = -1;
        private GMCipherSpi.SM2withBlake2b init;
        private byte[] onCReqSuccess;
        private byte[] onValidated = null;

        public final int getInstance() {
            int instance = this.init.getInstance();
            return this.getInstance ? instance : instance - 10;
        }

        public final int init() {
            int init2 = this.init.init();
            return this.getInstance ? init2 - 10 : init2;
        }

        public ecDSARipeMD160(GMCipherSpi.SM2withBlake2b sM2withBlake2b) {
            this.init = sM2withBlake2b;
            String str = (String) AccessController.doPrivileged(this);
            String str2 = (String) AccessController.doPrivileged(new PrivilegedAction() {
                public final Object run() {
                    return System.getProperty("com.cardinalcommerce.dependencies.internal.bouncycastle.pkcs1.not_strict");
                }
            });
            boolean z = false;
            if (str2 == null ? str == null || str.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE) : !str2.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                z = true;
            }
            this.cca_continue = z;
        }

        public final void getInstance(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            setCCAImageUri setccaimageuri;
            if (sM2withRMD instanceof DigestSignatureSpi.RIPEMD128) {
                DigestSignatureSpi.RIPEMD128 ripemd128 = (DigestSignatureSpi.RIPEMD128) sM2withRMD;
                this.Cardinal = ripemd128.Cardinal;
                setccaimageuri = (setCCAImageUri) ripemd128.cca_continue;
            } else {
                setccaimageuri = (setCCAImageUri) sM2withRMD;
                if (!setccaimageuri.getSDKVersion && z) {
                    this.Cardinal = GMCipherSpi.SM2withWhirlpool.configure();
                }
            }
            this.init.getInstance(z, sM2withRMD);
            this.configure = setccaimageuri.getSDKVersion;
            this.getInstance = z;
            this.onCReqSuccess = new byte[this.init.getInstance()];
            if (this.getWarnings > 0 && this.onValidated == null && this.Cardinal == null) {
                throw new IllegalArgumentException("encoder requires random");
            }
        }

        public final byte[] Cardinal(byte[] bArr, int i, int i2) throws KeyAgreementSpi.AnonymousClass1 {
            int i3 = -1;
            boolean z = true;
            if (this.getInstance) {
                int init2 = this.init.init();
                if (this.getInstance) {
                    init2 -= 10;
                }
                if (i2 <= init2) {
                    int init3 = this.init.init();
                    byte[] bArr2 = new byte[init3];
                    if (this.configure) {
                        bArr2[0] = 1;
                        for (int i4 = 1; i4 != (init3 - i2) - 1; i4++) {
                            bArr2[i4] = -1;
                        }
                    } else {
                        this.Cardinal.nextBytes(bArr2);
                        bArr2[0] = 2;
                        for (int i5 = 1; i5 != (init3 - i2) - 1; i5++) {
                            while (bArr2[i5] == 0) {
                                bArr2[i5] = (byte) this.Cardinal.nextInt();
                            }
                        }
                    }
                    int i6 = init3 - i2;
                    bArr2[i6 - 1] = 0;
                    System.arraycopy(bArr, i, bArr2, i6, i2);
                    return this.init.Cardinal(bArr2, 0, init3);
                }
                throw new IllegalArgumentException("input data too large");
            } else if (this.getWarnings == -1) {
                byte[] Cardinal2 = this.init.Cardinal(bArr, i, i2);
                boolean z2 = this.cca_continue & (Cardinal2.length != this.init.getInstance());
                int length = Cardinal2.length;
                int instance = this.init.getInstance();
                if (!this.getInstance) {
                    instance -= 10;
                }
                if (length < instance) {
                    Cardinal2 = this.onCReqSuccess;
                }
                byte b = Cardinal2[0];
                boolean z3 = !this.configure ? b != 1 : b != 2;
                int i7 = -1;
                boolean z4 = false;
                for (int i8 = 1; i8 != Cardinal2.length; i8++) {
                    byte b2 = Cardinal2[i8];
                    if ((b2 == 0) && (i7 < 0)) {
                        i7 = i8;
                    }
                    z4 |= (b2 != -1) & (b == 1) & (i7 < 0);
                }
                if (!z4) {
                    i3 = i7;
                }
                int i9 = i3 + 1;
                if (i9 >= 10) {
                    z = false;
                }
                if (z3 || z) {
                    for (int i10 = 0; i10 < Cardinal2.length; i10++) {
                        Cardinal2[i10] = 0;
                    }
                    throw new KeyAgreementSpi.AnonymousClass1("block incorrect");
                } else if (z2) {
                    for (int i11 = 0; i11 < Cardinal2.length; i11++) {
                        Cardinal2[i11] = 0;
                    }
                    throw new KeyAgreementSpi.AnonymousClass1("block incorrect size");
                } else {
                    int length2 = Cardinal2.length - i9;
                    byte[] bArr3 = new byte[length2];
                    System.arraycopy(Cardinal2, i9, bArr3, 0, length2);
                    return bArr3;
                }
            } else if (this.configure) {
                byte[] Cardinal3 = this.init.Cardinal(bArr, i, i2);
                byte[] bArr4 = this.onValidated;
                if (bArr4 == null) {
                    bArr4 = new byte[this.getWarnings];
                    this.Cardinal.nextBytes(bArr4);
                }
                if (this.cca_continue && (Cardinal3.length != this.init.getInstance())) {
                    Cardinal3 = this.onCReqSuccess;
                }
                int i12 = this.getWarnings;
                byte b3 = (Cardinal3[0] ^ 2) | 0;
                int i13 = i12 + 1;
                int length3 = Cardinal3.length - i13;
                for (int i14 = 1; i14 < length3; i14++) {
                    byte b4 = Cardinal3[i14];
                    byte b5 = b4 | (b4 >> 1);
                    byte b6 = b5 | (b5 >> 2);
                    b3 |= ((b6 | (b6 >> 4)) & 1) - 1;
                }
                byte b7 = Cardinal3[Cardinal3.length - i13] | b3;
                byte b8 = b7 | (b7 >> 1);
                byte b9 = b8 | (b8 >> 2);
                int i15 = ~(((b9 | (b9 >> 4)) & 1) - 1);
                byte[] bArr5 = new byte[this.getWarnings];
                int i16 = 0;
                while (true) {
                    int i17 = this.getWarnings;
                    if (i16 >= i17) {
                        break;
                    }
                    bArr5[i16] = (byte) ((Cardinal3[(Cardinal3.length - i17) + i16] & (~i15)) | (bArr4[i16] & i15));
                    i16++;
                }
                for (int i18 = 0; i18 < Cardinal3.length; i18++) {
                    Cardinal3[i18] = 0;
                }
                return bArr5;
            } else {
                throw new KeyAgreementSpi.AnonymousClass1("sorry, this method is only for decryption, not for signing");
            }
        }

        public final Object run() {
            return System.getProperty("com.cardinalcommerce.dependencies.internal.bouncycastle.pkcs1.strict");
        }
    }

    public final class ecDSASha3_224 implements GMCipherSpi.SM2withSha256 {
        private static final int[] Cardinal = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};
        private static final int[] cca_continue = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
        private static final int[] configure = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, JfifUtil.MARKER_SOI, Opcodes.LOOKUPSWITCH, 77, Opcodes.IFNE, 47, 94, Opcodes.NEWARRAY, 99, Opcodes.IFNULL, Opcodes.DCMPL, 53, 106, 212, Opcodes.PUTSTATIC, 125, 250, 239, Opcodes.MULTIANEWARRAY, Opcodes.I2B};
        private static final byte[] getInstance = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, Utf8.REPLACEMENT_BYTE, -9, -52, 52, -91, -27, -15, 113, -40, 49, Ascii.NAK, 4, -57, 35, -61, Ascii.CAN, -106, 5, -102, 7, Ascii.DC2, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, Ascii.ESC, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, SignedBytes.MAX_POWER_OF_TWO, -113, -110, -99, 56, -11, -68, -74, -38, 33, Ascii.DLE, -1, -13, -46, -51, Ascii.FF, 19, -20, 95, -105, 68, Ascii.ETB, -60, -89, 126, Base64.padSymbol, 100, 93, Ascii.EM, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, Ascii.DC4, -34, 94, Ascii.VT, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, Ascii.FS, -90, -76, -58, -24, -35, 116, Ascii.US, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, Ascii.SO, 97, 53, 87, -71, -122, -63, Ascii.GS, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, Ascii.RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, Ascii.CR, -65, -26, 66, 104, 65, -103, 45, Ascii.SI, -80, 84, -69, Ascii.SYN};
        private static final byte[] init = {82, 9, 106, -43, 48, 54, -91, 56, -65, SignedBytes.MAX_POWER_OF_TWO, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base64.padSymbol, -18, 76, -107, Ascii.VT, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, Ascii.SYN, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, Ascii.NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, Ascii.RS, -113, -54, Utf8.REPLACEMENT_BYTE, Ascii.SI, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, Ascii.FS, 117, -33, 110, 71, -15, 26, 113, Ascii.GS, 41, -59, -119, 111, -73, 98, Ascii.SO, -86, Ascii.CAN, -66, Ascii.ESC, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, Ascii.US, -35, -88, 51, -120, 7, -57, 49, -79, Ascii.DC2, Ascii.DLE, 89, 39, Byte.MIN_VALUE, -20, 95, 96, 81, Byte.MAX_VALUE, -87, Ascii.EM, -75, 74, Ascii.CR, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, Ascii.ETB, 43, 4, 126, -70, 119, -42, 38, -31, 105, Ascii.DC4, 99, 85, 33, Ascii.FF, 125};
        private boolean CardinalEnvironment;
        private int CardinalRenderType;
        private int[][] cleanup = null;
        private int getSDKVersion;
        private int getWarnings;
        private int onCReqSuccess;
        private int onValidated;
        private byte[] values;

        public ecDSASha3_224() {
            int[][] iArr = null;
        }

        private void Cardinal(byte[] bArr, int i) {
            int i2 = i + 1;
            int i3 = i2 + 1;
            byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
            int i4 = i3 + 1;
            byte b2 = b | ((bArr[i3] & 255) << Ascii.DLE);
            int i5 = i4 + 1;
            this.onCReqSuccess = b2 | (bArr[i4] << Ascii.CAN);
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            byte b3 = ((bArr[i6] & 255) << 8) | (bArr[i5] & 255) | ((bArr[i7] & 255) << Ascii.DLE);
            int i9 = i8 + 1;
            this.onValidated = b3 | (bArr[i8] << Ascii.CAN);
            int i10 = i9 + 1;
            int i11 = i10 + 1;
            int i12 = i11 + 1;
            byte b4 = ((bArr[i10] & 255) << 8) | (bArr[i9] & 255) | ((bArr[i11] & 255) << Ascii.DLE);
            int i13 = i12 + 1;
            this.getWarnings = b4 | (bArr[i12] << Ascii.CAN);
            int i14 = i13 + 1;
            int i15 = i14 + 1;
            byte b5 = ((bArr[i14] & 255) << 8) | (bArr[i13] & 255);
            this.CardinalRenderType = (bArr[i15 + 1] << Ascii.CAN) | b5 | ((bArr[i15] & 255) << Ascii.DLE);
        }

        private static int configure(int i) {
            byte[] bArr = getInstance;
            return (bArr[i >>> 24] << Ascii.CAN) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << Ascii.DLE);
        }

        private void init(byte[] bArr, int i) {
            int i2 = i + 1;
            int i3 = this.onCReqSuccess;
            bArr[i] = (byte) i3;
            int i4 = i2 + 1;
            bArr[i2] = (byte) (i3 >> 8);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (i3 >> 16);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (i3 >> 24);
            int i7 = i6 + 1;
            int i8 = this.onValidated;
            bArr[i6] = (byte) i8;
            int i9 = i7 + 1;
            bArr[i7] = (byte) (i8 >> 8);
            int i10 = i9 + 1;
            bArr[i9] = (byte) (i8 >> 16);
            int i11 = i10 + 1;
            bArr[i10] = (byte) (i8 >> 24);
            int i12 = i11 + 1;
            int i13 = this.getWarnings;
            bArr[i11] = (byte) i13;
            int i14 = i12 + 1;
            bArr[i12] = (byte) (i13 >> 8);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (i13 >> 16);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (i13 >> 24);
            int i17 = i16 + 1;
            int i18 = this.CardinalRenderType;
            bArr[i16] = (byte) i18;
            int i19 = i17 + 1;
            bArr[i17] = (byte) (i18 >> 8);
            bArr[i19] = (byte) (i18 >> 16);
            bArr[i19 + 1] = (byte) (i18 >> 24);
        }

        public final void Cardinal() {
        }

        public final String cca_continue() {
            return "AES";
        }

        public final int getInstance() {
            return 16;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: int[][]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: int[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void getInstance(boolean r20, com.cardinalcommerce.a.GMCipherSpi.SM2withRMD r21) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                boolean r3 = r2 instanceof com.cardinalcommerce.a.CipherSpi.ISO9796d1Padding
                if (r3 == 0) goto L_0x0266
                com.cardinalcommerce.a.CipherSpi$ISO9796d1Padding r2 = (com.cardinalcommerce.a.CipherSpi.ISO9796d1Padding) r2
                byte[] r2 = r2.getInstance
                int r3 = r2.length
                r4 = 16
                if (r3 < r4) goto L_0x025e
                r5 = 32
                if (r3 > r5) goto L_0x025e
                r5 = r3 & 7
                if (r5 != 0) goto L_0x025e
                r5 = 2
                int r3 = r3 >>> r5
                int r6 = r3 + 6
                r0.getSDKVersion = r6
                r7 = 1
                int r6 = r6 + r7
                int[] r8 = new int[r5]
                r9 = 4
                r8[r7] = r9
                r10 = 0
                r8[r10] = r6
                java.lang.Class r6 = java.lang.Integer.TYPE
                java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r8)
                int[][] r6 = (int[][]) r6
                r8 = 12
                r11 = 8
                r12 = 3
                if (r3 == r9) goto L_0x01aa
                r13 = 20
                r14 = 6
                if (r3 == r14) goto L_0x00e7
                if (r3 != r11) goto L_0x00df
                int r3 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r10)
                r14 = r6[r10]
                r14[r10] = r3
                int r14 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r9)
                r15 = r6[r10]
                r15[r7] = r14
                int r11 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r11)
                r15 = r6[r10]
                r15[r5] = r11
                int r8 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r8)
                r15 = r6[r10]
                r15[r12] = r8
                int r4 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r4)
                r15 = r6[r7]
                r15[r10] = r4
                int r13 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r13)
                r15 = r6[r7]
                r15[r7] = r13
                r15 = 24
                int r15 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r15)
                r16 = r6[r7]
                r16[r5] = r15
                r9 = 28
                int r2 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r9)
                r9 = r6[r7]
                r9[r12] = r2
                r9 = r5
                r16 = r7
            L_0x0088:
                r12 = 14
                if (r9 >= r12) goto L_0x00c3
                int r12 = r2 >>> 8
                int r18 = r2 << -8
                r12 = r12 | r18
                int r12 = configure(r12)
                r12 = r12 ^ r16
                int r16 = r16 << 1
                r3 = r3 ^ r12
                r12 = r6[r9]
                r12[r10] = r3
                r14 = r14 ^ r3
                r12[r7] = r14
                r11 = r11 ^ r14
                r12[r5] = r11
                r8 = r8 ^ r11
                r17 = 3
                r12[r17] = r8
                int r12 = configure(r8)
                r4 = r4 ^ r12
                int r12 = r9 + 1
                r12 = r6[r12]
                r12[r10] = r4
                r13 = r13 ^ r4
                r12[r7] = r13
                r15 = r15 ^ r13
                r12[r5] = r15
                r2 = r2 ^ r15
                r17 = 3
                r12[r17] = r2
                int r9 = r9 + 2
                goto L_0x0088
            L_0x00c3:
                int r4 = r2 >>> 8
                int r2 = r2 << -8
                r2 = r2 | r4
                int r2 = configure(r2)
                r2 = r2 ^ r16
                r2 = r2 ^ r3
                r3 = r6[r12]
                r3[r10] = r2
                r2 = r2 ^ r14
                r3[r7] = r2
                r2 = r2 ^ r11
                r3[r5] = r2
                r2 = r2 ^ r8
                r4 = 3
                r3[r4] = r2
                goto L_0x01f3
            L_0x00df:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Should never get here"
                r1.<init>(r2)
                throw r1
            L_0x00e7:
                int r3 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r10)
                r9 = r6[r10]
                r9[r10] = r3
                r9 = 4
                int r12 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r9)
                r9 = r6[r10]
                r9[r7] = r12
                int r9 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r11)
                r11 = r6[r10]
                r11[r5] = r9
                int r11 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r8)
                r14 = r6[r10]
                r15 = 3
                r14[r15] = r11
                int r4 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r4)
                r14 = r6[r7]
                r14[r10] = r4
                int r2 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r13)
                r13 = r6[r7]
                r13[r7] = r2
                int r13 = r2 >>> 8
                int r14 = r2 << -8
                r13 = r13 | r14
                int r13 = configure(r13)
                r13 = r13 ^ r7
                r3 = r3 ^ r13
                r13 = r6[r7]
                r13[r5] = r3
                r12 = r12 ^ r3
                r14 = 3
                r13[r14] = r12
                r9 = r9 ^ r12
                r13 = r6[r5]
                r13[r10] = r9
                r11 = r11 ^ r9
                r13[r7] = r11
                r4 = r4 ^ r11
                r13[r5] = r4
                r2 = r2 ^ r4
                r13[r14] = r2
                r14 = r5
                r13 = 3
            L_0x013c:
                if (r13 >= r8) goto L_0x018f
                int r15 = r2 >>> 8
                int r16 = r2 << -8
                r15 = r15 | r16
                int r15 = configure(r15)
                r15 = r15 ^ r14
                int r14 = r14 << r7
                r3 = r3 ^ r15
                r15 = r6[r13]
                r15[r10] = r3
                r12 = r12 ^ r3
                r15[r7] = r12
                r9 = r9 ^ r12
                r15[r5] = r9
                r11 = r11 ^ r9
                r16 = 3
                r15[r16] = r11
                r4 = r4 ^ r11
                int r15 = r13 + 1
                r16 = r6[r15]
                r16[r10] = r4
                r2 = r2 ^ r4
                r16[r7] = r2
                int r16 = r2 >>> 8
                int r18 = r2 << -8
                r16 = r16 | r18
                int r16 = configure(r16)
                r16 = r16 ^ r14
                int r14 = r14 << r7
                r3 = r3 ^ r16
                r15 = r6[r15]
                r15[r5] = r3
                r12 = r12 ^ r3
                r16 = 3
                r15[r16] = r12
                r9 = r9 ^ r12
                int r15 = r13 + 2
                r15 = r6[r15]
                r15[r10] = r9
                r11 = r11 ^ r9
                r15[r7] = r11
                r4 = r4 ^ r11
                r15[r5] = r4
                r2 = r2 ^ r4
                r15[r16] = r2
                int r13 = r13 + 3
                goto L_0x013c
            L_0x018f:
                int r4 = r2 >>> 8
                int r2 = r2 << -8
                r2 = r2 | r4
                int r2 = configure(r2)
                r2 = r2 ^ 128(0x80, float:1.794E-43)
                r2 = r2 ^ r3
                r3 = r6[r8]
                r3[r10] = r2
                r2 = r2 ^ r12
                r3[r7] = r2
                r2 = r2 ^ r9
                r3[r5] = r2
                r2 = r2 ^ r11
                r4 = 3
                r3[r4] = r2
                goto L_0x01f3
            L_0x01aa:
                int r3 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r10)
                r4 = r6[r10]
                r4[r10] = r3
                r4 = 4
                int r9 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r4)
                r4 = r6[r10]
                r4[r7] = r9
                int r4 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r11)
                r11 = r6[r10]
                r11[r5] = r4
                int r2 = com.cardinalcommerce.a.setTextFontSize.cca_continue(r2, r8)
                r8 = r6[r10]
                r11 = 3
                r8[r11] = r2
                r8 = r7
            L_0x01cd:
                r11 = 10
                if (r8 > r11) goto L_0x01f3
                int r11 = r2 >>> 8
                int r12 = r2 << -8
                r11 = r11 | r12
                int r11 = configure(r11)
                int[] r12 = configure
                int r13 = r8 + -1
                r12 = r12[r13]
                r11 = r11 ^ r12
                r3 = r3 ^ r11
                r11 = r6[r8]
                r11[r10] = r3
                r9 = r9 ^ r3
                r11[r7] = r9
                r4 = r4 ^ r9
                r11[r5] = r4
                r2 = r2 ^ r4
                r12 = 3
                r11[r12] = r2
                int r8 = r8 + 1
                goto L_0x01cd
            L_0x01f3:
                if (r1 != 0) goto L_0x0239
                r2 = r7
            L_0x01f6:
                int r3 = r0.getSDKVersion
                if (r2 >= r3) goto L_0x0239
                r3 = r10
                r4 = 4
            L_0x01fc:
                if (r3 >= r4) goto L_0x0236
                r8 = r6[r2]
                r9 = r8[r3]
                int r11 = r9 >>> 8
                int r12 = r9 << -8
                r11 = r11 | r12
                r11 = r11 ^ r9
                r12 = 2139062143(0x7f7f7f7f, float:3.3961514E38)
                r12 = r12 & r11
                int r12 = r12 << r7
                r13 = -2139062144(0xffffffff80808080, float:-1.180104E-38)
                r13 = r13 & r11
                int r13 = r13 >>> 7
                int r13 = r13 * 27
                r12 = r12 ^ r13
                r9 = r9 ^ r12
                r12 = 1061109567(0x3f3f3f3f, float:0.7470588)
                r12 = r12 & r9
                int r12 = r12 << r5
                r13 = -1061109568(0xffffffffc0c0c0c0, float:-6.023529)
                r13 = r13 & r9
                int r14 = r13 >>> 1
                r13 = r13 ^ r14
                int r14 = r13 >>> 2
                r12 = r12 ^ r14
                int r13 = r13 >>> 5
                r12 = r12 ^ r13
                r11 = r11 ^ r12
                int r12 = r11 >>> 16
                int r13 = r11 << -16
                r12 = r12 | r13
                r11 = r11 ^ r12
                r9 = r9 ^ r11
                r8[r3] = r9
                int r3 = r3 + 1
                goto L_0x01fc
            L_0x0236:
                int r2 = r2 + 1
                goto L_0x01f6
            L_0x0239:
                r0.cleanup = r6
                r0.CardinalEnvironment = r1
                r2 = 0
                if (r1 == 0) goto L_0x024f
                byte[] r1 = getInstance
                if (r1 != 0) goto L_0x0245
                goto L_0x024c
            L_0x0245:
                int r2 = r1.length
                byte[] r2 = new byte[r2]
                int r3 = r1.length
                java.lang.System.arraycopy(r1, r10, r2, r10, r3)
            L_0x024c:
                r0.values = r2
                return
            L_0x024f:
                byte[] r1 = init
                if (r1 != 0) goto L_0x0254
                goto L_0x025b
            L_0x0254:
                int r2 = r1.length
                byte[] r2 = new byte[r2]
                int r3 = r1.length
                java.lang.System.arraycopy(r1, r10, r2, r10, r3)
            L_0x025b:
                r0.values = r2
                return
            L_0x025e:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Key length not 128/192/256 bits."
                r1.<init>(r2)
                throw r1
            L_0x0266:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "invalid parameter passed to AES init - "
                r3.<init>(r4)
                java.lang.Class r2 = r21.getClass()
                java.lang.String r2 = r2.getName()
                java.lang.StringBuilder r2 = r3.append(r2)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.SignatureSpi.ecDSASha3_224.getInstance(boolean, com.cardinalcommerce.a.GMCipherSpi$SM2withRMD):void");
        }

        public final int Cardinal(byte[] bArr, int i, byte[] bArr2, int i2) {
            byte[] bArr3 = bArr2;
            int i3 = i2;
            if (this.cleanup == null) {
                throw new IllegalStateException("AES engine not initialised");
            } else if (i + 16 > bArr.length) {
                throw new GMSignatureSpi("input buffer too short");
            } else if (i3 + 16 <= bArr3.length) {
                char c = 0;
                if (this.CardinalEnvironment) {
                    Cardinal(bArr, i);
                    int[][] iArr = this.cleanup;
                    int i4 = this.onCReqSuccess;
                    int[] iArr2 = iArr[0];
                    int i5 = i4 ^ iArr2[0];
                    int i6 = this.onValidated ^ iArr2[1];
                    int i7 = this.getWarnings ^ iArr2[2];
                    int i8 = iArr2[3] ^ this.CardinalRenderType;
                    int i9 = 1;
                    for (int i10 = 1; i9 < this.getSDKVersion - i10; i10 = 1) {
                        int[] iArr3 = cca_continue;
                        int i11 = iArr3[i5 & 255];
                        int i12 = iArr3[(i6 >> 8) & 255];
                        char c2 = ((i12 >>> 24) | (i12 << -24)) ^ i11;
                        int i13 = iArr3[(i7 >> 16) & 255];
                        char c3 = c2 ^ ((i13 >>> 16) | (i13 << -16));
                        int i14 = iArr3[i8 >>> 24];
                        char c4 = c3 ^ ((i14 >>> 8) | (i14 << -8));
                        int[] iArr4 = iArr[i9];
                        char c5 = c4 ^ iArr4[c];
                        int i15 = iArr3[i6 & 255];
                        int i16 = iArr3[(i7 >> 8) & 255];
                        int i17 = ((i16 >>> 24) | (i16 << -24)) ^ i15;
                        int i18 = iArr3[(i8 >> 16) & 255];
                        int i19 = i17 ^ ((i18 >>> 16) | (i18 << -16));
                        int i20 = iArr3[i5 >>> 24];
                        int i21 = (i19 ^ ((i20 >>> 8) | (i20 << -8))) ^ iArr4[i10];
                        int i22 = iArr3[i7 & 255];
                        int i23 = iArr3[(i8 >> 8) & 255];
                        int i24 = i22 ^ ((i23 >>> 24) | (i23 << -24));
                        int i25 = iArr3[(i5 >> 16) & 255];
                        int i26 = i24 ^ ((i25 >>> 16) | (i25 << -16));
                        int i27 = iArr3[i6 >>> 24];
                        int i28 = (i26 ^ ((i27 >>> 8) | (i27 << -8))) ^ iArr4[2];
                        int i29 = iArr3[i8 & 255];
                        int i30 = iArr3[(i5 >> 8) & 255];
                        int i31 = ((i30 << -24) | (i30 >>> 24)) ^ i29;
                        int i32 = iArr3[(i6 >> 16) & 255];
                        int i33 = i31 ^ ((i32 << -16) | (i32 >>> 16));
                        int i34 = iArr3[i7 >>> 24];
                        int i35 = i9 + 1;
                        int i36 = (i33 ^ ((i34 << -8) | (i34 >>> 8))) ^ iArr4[3];
                        int i37 = iArr3[c5 & 255];
                        int i38 = iArr3[(i21 >> 8) & 255];
                        int i39 = i37 ^ ((i38 << -24) | (i38 >>> 24));
                        int i40 = iArr3[(i28 >> 16) & 255];
                        int i41 = i39 ^ ((i40 << -16) | (i40 >>> 16));
                        int i42 = iArr3[i36 >>> 24];
                        int i43 = i41 ^ ((i42 << -8) | (i42 >>> 8));
                        int[] iArr5 = iArr[i35];
                        int i44 = i43 ^ iArr5[0];
                        int i45 = iArr3[i21 & 255];
                        int i46 = iArr3[(i28 >> 8) & 255];
                        int i47 = i45 ^ ((i46 << -24) | (i46 >>> 24));
                        int i48 = iArr3[(i36 >> 16) & 255];
                        int i49 = i47 ^ ((i48 << -16) | (i48 >>> 16));
                        int i50 = iArr3[c5 >>> 24];
                        i6 = (i49 ^ ((i50 << -8) | (i50 >>> 8))) ^ iArr5[1];
                        int i51 = iArr3[i28 & 255];
                        int i52 = iArr3[(i36 >> 8) & 255];
                        int i53 = i51 ^ ((i52 >>> 24) | (i52 << -24));
                        int i54 = iArr3[(c5 >> 16) & 255];
                        int i55 = i53 ^ ((i54 >>> 16) | (i54 << -16));
                        int i56 = iArr3[i21 >>> 24];
                        i7 = (i55 ^ ((i56 >>> 8) | (i56 << -8))) ^ iArr5[2];
                        int i57 = iArr3[i36 & 255];
                        int i58 = iArr3[(c5 >> 8) & 255];
                        int i59 = iArr3[(i21 >> 16) & 255];
                        int i60 = (i57 ^ ((i58 << -24) | (i58 >>> 24))) ^ ((i59 << -16) | (i59 >>> 16));
                        int i61 = iArr3[i28 >>> 24];
                        i9 = i35 + 1;
                        i8 = (i60 ^ ((i61 << -8) | (i61 >>> 8))) ^ iArr5[3];
                        i5 = i44;
                        c = 0;
                    }
                    int[] iArr6 = cca_continue;
                    int i62 = iArr6[i5 & 255];
                    int i63 = iArr6[(i6 >> 8) & 255];
                    int i64 = i62 ^ ((i63 << -24) | (i63 >>> 24));
                    int i65 = iArr6[(i7 >> 16) & 255];
                    int i66 = i64 ^ ((i65 << -16) | (i65 >>> 16));
                    int i67 = iArr6[i8 >>> 24];
                    int i68 = i66 ^ ((i67 << -8) | (i67 >>> 8));
                    int[] iArr7 = iArr[i9];
                    int i69 = i68 ^ iArr7[0];
                    int i70 = iArr6[i6 & 255];
                    int i71 = iArr6[(i7 >> 8) & 255];
                    int i72 = i70 ^ ((i71 << -24) | (i71 >>> 24));
                    int i73 = iArr6[(i8 >> 16) & 255];
                    int i74 = i72 ^ ((i73 << -16) | (i73 >>> 16));
                    int i75 = iArr6[i5 >>> 24];
                    int i76 = (i74 ^ ((i75 << -8) | (i75 >>> 8))) ^ iArr7[1];
                    int i77 = iArr6[i7 & 255];
                    int i78 = iArr6[(i8 >> 8) & 255];
                    int i79 = i77 ^ ((i78 >>> 24) | (i78 << -24));
                    int i80 = iArr6[(i5 >> 16) & 255];
                    int i81 = i79 ^ ((i80 >>> 16) | (i80 << -16));
                    int i82 = iArr6[i6 >>> 24];
                    int i83 = (i81 ^ ((i82 >>> 8) | (i82 << -8))) ^ iArr7[2];
                    int i84 = iArr6[i8 & 255];
                    int i85 = iArr6[(i5 >> 8) & 255];
                    int i86 = ((i85 << -24) | (i85 >>> 24)) ^ i84;
                    int i87 = iArr6[(i6 >> 16) & 255];
                    int i88 = iArr6[i7 >>> 24];
                    int i89 = ((i86 ^ ((i87 << -16) | (i87 >>> 16))) ^ ((i88 << -8) | (i88 >>> 8))) ^ iArr7[3];
                    byte[] bArr4 = getInstance;
                    byte b = (bArr4[i69 & 255] & 255) ^ ((bArr4[(i76 >> 8) & 255] & 255) << 8);
                    byte[] bArr5 = this.values;
                    int[] iArr8 = iArr[i9 + 1];
                    this.onCReqSuccess = ((b ^ ((bArr5[(i83 >> 16) & 255] & 255) << Ascii.DLE)) ^ (bArr5[i89 >>> 24] << Ascii.CAN)) ^ iArr8[0];
                    this.onValidated = ((((bArr5[i76 & 255] & 255) ^ ((bArr4[(i83 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i89 >> 16) & 255] & 255) << Ascii.DLE)) ^ (bArr5[i69 >>> 24] << Ascii.CAN)) ^ iArr8[1];
                    this.getWarnings = iArr8[2] ^ ((((bArr5[i83 & 255] & 255) ^ ((bArr4[(i89 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i69 >> 16) & 255] & 255) << Ascii.DLE)) ^ (bArr4[i76 >>> 24] << Ascii.CAN));
                    this.CardinalRenderType = iArr8[3] ^ ((((bArr5[i89 & 255] & 255) ^ ((bArr5[(i69 >> 8) & 255] & 255) << 8)) ^ ((bArr5[(i76 >> 16) & 255] & 255) << Ascii.DLE)) ^ (bArr4[i83 >>> 24] << Ascii.CAN));
                    init(bArr3, i3);
                    return 16;
                }
                Cardinal(bArr, i);
                int[][] iArr9 = this.cleanup;
                int i90 = this.onCReqSuccess;
                int i91 = this.getSDKVersion;
                int[] iArr10 = iArr9[i91];
                int i92 = i90 ^ iArr10[0];
                int i93 = 1;
                int i94 = this.onValidated ^ iArr10[1];
                int i95 = this.getWarnings ^ iArr10[2];
                int i96 = i91 - 1;
                int i97 = iArr10[3] ^ this.CardinalRenderType;
                while (i96 > i93) {
                    int[] iArr11 = Cardinal;
                    int i98 = iArr11[i92 & 255];
                    int i99 = iArr11[(i97 >> 8) & 255];
                    int i100 = i98 ^ ((i99 << -24) | (i99 >>> 24));
                    int i101 = iArr11[(i95 >> 16) & 255];
                    int i102 = i100 ^ ((i101 << -16) | (i101 >>> 16));
                    int i103 = iArr11[i94 >>> 24];
                    int i104 = i102 ^ ((i103 << -8) | (i103 >>> 8));
                    int[] iArr12 = iArr9[i96];
                    int i105 = i104 ^ iArr12[0];
                    int i106 = iArr11[i94 & 255];
                    int i107 = iArr11[(i92 >> 8) & 255];
                    int i108 = i106 ^ ((i107 << -24) | (i107 >>> 24));
                    int i109 = iArr11[(i97 >> 16) & 255];
                    int i110 = i108 ^ ((i109 << -16) | (i109 >>> 16));
                    int i111 = iArr11[i95 >>> 24];
                    int i112 = (i110 ^ ((i111 << -8) | (i111 >>> 8))) ^ iArr12[1];
                    int i113 = iArr11[i95 & 255];
                    int i114 = iArr11[(i94 >> 8) & 255];
                    int i115 = i113 ^ ((i114 >>> 24) | (i114 << -24));
                    int i116 = iArr11[(i92 >> 16) & 255];
                    int i117 = i115 ^ ((i116 >>> 16) | (i116 << -16));
                    int i118 = iArr11[i97 >>> 24];
                    int i119 = (i117 ^ ((i118 >>> 8) | (i118 << -8))) ^ iArr12[2];
                    int i120 = iArr11[i97 & 255];
                    int i121 = iArr11[(i95 >> 8) & 255];
                    int i122 = iArr11[(i94 >> 16) & 255];
                    int i123 = iArr11[i92 >>> 24];
                    int i124 = i96 - 1;
                    int i125 = (((i123 << -8) | (i123 >>> 8)) ^ ((i120 ^ ((i121 << -24) | (i121 >>> 24))) ^ ((i122 << -16) | (i122 >>> 16)))) ^ iArr12[3];
                    int i126 = iArr11[i105 & 255];
                    int i127 = iArr11[(i125 >> 8) & 255];
                    int i128 = i126 ^ ((i127 << -24) | (i127 >>> 24));
                    int i129 = iArr11[(i119 >> 16) & 255];
                    int i130 = i128 ^ ((i129 << -16) | (i129 >>> 16));
                    int i131 = iArr11[i112 >>> 24];
                    int i132 = i130 ^ ((i131 << -8) | (i131 >>> 8));
                    int[] iArr13 = iArr9[i124];
                    int i133 = i132 ^ iArr13[0];
                    int i134 = iArr11[i112 & 255];
                    int i135 = iArr11[(i105 >> 8) & 255];
                    int i136 = i134 ^ ((i135 << -24) | (i135 >>> 24));
                    int i137 = iArr11[(i125 >> 16) & 255];
                    int i138 = i136 ^ ((i137 << -16) | (i137 >>> 16));
                    int i139 = iArr11[i119 >>> 24];
                    int i140 = (i138 ^ ((i139 << -8) | (i139 >>> 8))) ^ iArr13[1];
                    int i141 = iArr11[i119 & 255];
                    int i142 = iArr11[(i112 >> 8) & 255];
                    int i143 = i141 ^ ((i142 >>> 24) | (i142 << -24));
                    int i144 = iArr11[(i105 >> 16) & 255];
                    int i145 = i143 ^ ((i144 >>> 16) | (i144 << -16));
                    int i146 = iArr11[i125 >>> 24];
                    int i147 = (i145 ^ ((i146 >>> 8) | (i146 << -8))) ^ iArr13[2];
                    int i148 = iArr11[i125 & 255];
                    int i149 = iArr11[(i119 >> 8) & 255];
                    int i150 = iArr11[(i112 >> 16) & 255];
                    int i151 = iArr11[i105 >>> 24];
                    i96 = i124 - 1;
                    int i152 = (((i148 ^ ((i149 << -24) | (i149 >>> 24))) ^ ((i150 << -16) | (i150 >>> 16))) ^ ((i151 << -8) | (i151 >>> 8))) ^ iArr13[3];
                    i94 = i140;
                    i95 = i147;
                    i93 = 1;
                    int i153 = i133;
                    i97 = i152;
                    i92 = i153;
                }
                int[] iArr14 = Cardinal;
                int i154 = iArr14[i92 & 255];
                int i155 = iArr14[(i97 >> 8) & 255];
                int i156 = i154 ^ ((i155 << -24) | (i155 >>> 24));
                int i157 = iArr14[(i95 >> 16) & 255];
                int i158 = i156 ^ ((i157 << -16) | (i157 >>> 16));
                int i159 = iArr14[i94 >>> 24];
                int[] iArr15 = iArr9[i96];
                int i160 = (i158 ^ ((i159 << -8) | (i159 >>> 8))) ^ iArr15[0];
                int i161 = iArr14[i94 & 255];
                int i162 = iArr14[(i92 >> 8) & 255];
                int i163 = i161 ^ ((i162 << -24) | (i162 >>> 24));
                int i164 = iArr14[(i97 >> 16) & 255];
                int i165 = i163 ^ ((i164 << -16) | (i164 >>> 16));
                int i166 = iArr14[i95 >>> 24];
                int i167 = (i165 ^ ((i166 << -8) | (i166 >>> 8))) ^ iArr15[1];
                int i168 = iArr14[i95 & 255];
                int i169 = iArr14[(i94 >> 8) & 255];
                int i170 = i168 ^ ((i169 << -24) | (i169 >>> 24));
                int i171 = iArr14[(i92 >> 16) & 255];
                int i172 = i170 ^ ((i171 << -16) | (i171 >>> 16));
                int i173 = iArr14[i97 >>> 24];
                int i174 = (i172 ^ ((i173 << -8) | (i173 >>> 8))) ^ iArr15[2];
                int i175 = iArr14[i97 & 255];
                int i176 = iArr14[(i95 >> 8) & 255];
                int i177 = iArr14[(i94 >> 16) & 255];
                int i178 = iArr14[i92 >>> 24];
                int i179 = (((i178 << -8) | (i178 >>> 8)) ^ ((i175 ^ ((i176 << -24) | (i176 >>> 24))) ^ ((i177 << -16) | (i177 >>> 16)))) ^ iArr15[3];
                byte[] bArr6 = init;
                byte[] bArr7 = this.values;
                int[] iArr16 = iArr9[0];
                this.onCReqSuccess = ((((bArr6[i160 & 255] & 255) ^ ((bArr7[(i179 >> 8) & 255] & 255) << 8)) ^ ((bArr7[(i174 >> 16) & 255] & 255) << Ascii.DLE)) ^ (bArr6[i167 >>> 24] << Ascii.CAN)) ^ iArr16[0];
                this.onValidated = ((((bArr7[i167 & 255] & 255) ^ ((bArr7[(i160 >> 8) & 255] & 255) << 8)) ^ ((bArr6[(i179 >> 16) & 255] & 255) << Ascii.DLE)) ^ (bArr7[i174 >>> 24] << Ascii.CAN)) ^ iArr16[1];
                this.getWarnings = iArr16[2] ^ ((((bArr7[i174 & 255] & 255) ^ ((bArr6[(i167 >> 8) & 255] & 255) << 8)) ^ ((bArr6[(i160 >> 16) & 255] & 255) << Ascii.DLE)) ^ (bArr7[i179 >>> 24] << Ascii.CAN));
                this.CardinalRenderType = iArr16[3] ^ ((((bArr6[i179 & 255] & 255) ^ ((bArr7[(i174 >> 8) & 255] & 255) << 8)) ^ ((bArr7[(i167 >> 16) & 255] & 255) << Ascii.DLE)) ^ (bArr7[i160 >>> 24] << Ascii.CAN));
                init(bArr3, i3);
                return 16;
            } else {
                throw new KeyAgreementSpi.CDHwithSHA224KDFAndSharedInfo("output buffer too short");
            }
        }
    }

    public class ecDSASha3_256 implements GMCipherSpi.SM2withSha256 {
        private static final byte[] Cardinal = {1, 2, 4, 6, 8, 10, Ascii.FF, Ascii.SO, Ascii.SI, 17, 19, Ascii.NAK, Ascii.ETB, Ascii.EM, Ascii.ESC, Ascii.FS};
        private static final int[] CardinalEnvironment = {256, 34078976, 34078720, 1107296512, 524288, 256, 1073741824, 34078720, 1074266368, 524288, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, 524288, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, 524288, 0, 1074266112, 34078976, 1073742080};
        private static final int[] CardinalRenderType = {268439616, 4096, 262144, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696};
        private static final int[] cleanup = {16843776, 0, 65536, 16843780, 16842756, 66564, 4, 65536, 1024, 16843776, 16843780, 1024, 16778244, 16842756, 16777216, 4, 1028, 16778240, 16778240, 66560, 66560, 16842752, 16842752, 16778244, 65540, 16777220, 16777220, 65540, 0, 1028, 66564, 16777216, 65536, 16843780, 4, 16842752, 16843776, 16777216, 16777216, 1024, 16842756, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, 16843780, 65540, 16842752, 16778244, 16777220, 1028, 66564, 16843776, 1028, 16778240, 16778240, 0, 65540, 66560, 0, 16842756};
        private static final int[] configure = {8388608, 4194304, 2097152, 1048576, 524288, 262144, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        private static final short[] getInstance = {128, 64, 32, 16, 8, 4, 2, 1};
        private static final int[] getSDKVersion = {8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, Opcodes.LOR, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, Opcodes.LOR, 8388736, 8388609, 8396800, 8396929, Opcodes.LOR, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, Opcodes.LOR, 1, 8192, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928};
        private static final int[] getWarnings = {520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, 134217728, 134349312, 134217728, 131080, 520, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584};
        private static final byte[] init = {56, 48, 40, 32, Ascii.CAN, Ascii.DLE, 8, 0, 57, 49, 41, 33, Ascii.EM, 17, 9, 1, 58, 50, 42, 34, 26, Ascii.DC2, 10, 2, 59, 51, 43, 35, 62, 54, 46, 38, Ascii.RS, Ascii.SYN, Ascii.SO, 6, Base64.padSymbol, 53, 45, 37, Ascii.GS, Ascii.NAK, Ascii.CR, 5, 60, 52, 44, 36, Ascii.FS, Ascii.DC4, Ascii.FF, 4, Ascii.ESC, 19, Ascii.VT, 3};
        private static final byte[] onCReqSuccess = {Ascii.CR, Ascii.DLE, 10, Ascii.ETB, 0, 4, 2, Ascii.ESC, Ascii.SO, 5, Ascii.DC4, 9, Ascii.SYN, Ascii.DC2, Ascii.VT, 3, Ascii.EM, 7, Ascii.SI, 6, 26, 19, Ascii.FF, 1, 40, 51, Ascii.RS, 36, 46, 54, Ascii.GS, 39, 50, 44, 32, 47, 43, 48, 38, 55, 33, 52, 45, 41, 49, 35, Ascii.FS, Ascii.US};
        private static final int[] onValidated = {-2146402272, -2147450880, 32768, 1081376, 1048576, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, Integer.MIN_VALUE, -2147450880, 1048576, 32, -2146435040, 1081344, 1048608, -2147450848, 0, Integer.MIN_VALUE, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, 1048576, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, Integer.MIN_VALUE, 32800, -2146402304, 1048576, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, Integer.MIN_VALUE, -2146435040, -2146402272, 1081344};
        private static final int[] valueOf = {536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, 536870912, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, 536870912, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, 536870912, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, 536870912, 4194320, 536887312};
        private static final int[] values = {2097152, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, 2097152, 0, 67108866, 2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 2099200, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 2099200, 2097152, 67110914, 67110914, 69206018, 69206018, 2, 2097154, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 67110912, 2097152, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};
        private int[] cca_continue = null;

        protected static int[] Cardinal(boolean z, byte[] bArr) {
            int i;
            int[] iArr = new int[32];
            boolean[] zArr = new boolean[56];
            boolean[] zArr2 = new boolean[56];
            int i2 = 0;
            while (true) {
                boolean z2 = true;
                if (i2 >= 56) {
                    break;
                }
                byte b = init[i2];
                if ((getInstance[b & 7] & bArr[b >>> 3]) == 0) {
                    z2 = false;
                }
                zArr[i2] = z2;
                i2++;
            }
            for (int i3 = 0; i3 < 16; i3++) {
                int i4 = z ? i3 << 1 : (15 - i3) << 1;
                int i5 = i4 + 1;
                iArr[i5] = 0;
                iArr[i4] = 0;
                int i6 = 0;
                while (true) {
                    if (i6 >= 28) {
                        break;
                    }
                    int i7 = Cardinal[i3] + i6;
                    if (i7 < 28) {
                        zArr2[i6] = zArr[i7];
                    } else {
                        zArr2[i6] = zArr[i7 - 28];
                    }
                    i6++;
                }
                for (i = 28; i < 56; i++) {
                    int i8 = Cardinal[i3] + i;
                    if (i8 < 56) {
                        zArr2[i] = zArr[i8];
                    } else {
                        zArr2[i] = zArr[i8 - 28];
                    }
                }
                for (int i9 = 0; i9 < 24; i9++) {
                    byte[] bArr2 = onCReqSuccess;
                    if (zArr2[bArr2[i9]]) {
                        iArr[i4] = iArr[i4] | configure[i9];
                    }
                    if (zArr2[bArr2[i9 + 24]]) {
                        iArr[i5] = iArr[i5] | configure[i9];
                    }
                }
            }
            for (int i10 = 0; i10 != 32; i10 += 2) {
                int i11 = iArr[i10];
                int i12 = i10 + 1;
                int i13 = iArr[i12];
                iArr[i10] = ((16515072 & i13) >>> 10) | ((i11 & 16515072) << 6) | ((i11 & 4032) << 10) | ((i13 & 4032) >>> 6);
                iArr[i12] = ((i11 & 63) << 16) | ((i11 & 258048) << 12) | ((258048 & i13) >>> 4) | (i13 & 63);
            }
            return iArr;
        }

        protected static void init(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
            byte[] bArr3 = bArr2;
            int i3 = i2;
            int instance = setTextFontSize.getInstance(bArr, i);
            int instance2 = setTextFontSize.getInstance(bArr, i + 4);
            int i4 = ((instance >>> 4) ^ instance2) & 252645135;
            int i5 = instance2 ^ i4;
            int i6 = instance ^ (i4 << 4);
            int i7 = ((i6 >>> 16) ^ i5) & 65535;
            int i8 = i5 ^ i7;
            int i9 = i6 ^ (i7 << 16);
            int i10 = ((i8 >>> 2) ^ i9) & 858993459;
            int i11 = i9 ^ i10;
            int i12 = i8 ^ (i10 << 2);
            int i13 = ((i12 >>> 8) ^ i11) & 16711935;
            int i14 = i11 ^ i13;
            int i15 = i12 ^ (i13 << 8);
            int i16 = (i15 >>> 31) | (i15 << 1);
            int i17 = (i14 ^ i16) & -1431655766;
            int i18 = i14 ^ i17;
            int i19 = i16 ^ i17;
            int i20 = (i18 >>> 31) | (i18 << 1);
            for (int i21 = 0; i21 < 8; i21++) {
                int i22 = i21 << 2;
                int i23 = ((i19 << 28) | (i19 >>> 4)) ^ iArr[i22];
                int[] iArr2 = values;
                int i24 = iArr2[i23 & 63];
                int[] iArr3 = CardinalEnvironment;
                int i25 = i24 | iArr3[(i23 >>> 8) & 63];
                int[] iArr4 = getWarnings;
                int i26 = i25 | iArr4[(i23 >>> 16) & 63];
                int[] iArr5 = cleanup;
                int i27 = iArr5[(i23 >>> 24) & 63] | i26;
                int i28 = iArr[i22 + 1] ^ i19;
                int[] iArr6 = CardinalRenderType;
                int i29 = i27 | iArr6[i28 & 63];
                int[] iArr7 = valueOf;
                int i30 = i29 | iArr7[(i28 >>> 8) & 63];
                int[] iArr8 = getSDKVersion;
                int i31 = i30 | iArr8[(i28 >>> 16) & 63];
                int[] iArr9 = onValidated;
                i20 ^= i31 | iArr9[(i28 >>> 24) & 63];
                int i32 = ((i20 << 28) | (i20 >>> 4)) ^ iArr[i22 + 2];
                int i33 = iArr5[(i32 >>> 24) & 63];
                int i34 = iArr[i22 + 3] ^ i20;
                i19 ^= ((((i33 | ((iArr2[i32 & 63] | iArr3[(i32 >>> 8) & 63]) | iArr4[(i32 >>> 16) & 63])) | iArr6[i34 & 63]) | iArr7[(i34 >>> 8) & 63]) | iArr8[(i34 >>> 16) & 63]) | iArr9[(i34 >>> 24) & 63];
            }
            int i35 = (i19 >>> 1) | (i19 << 31);
            int i36 = (i20 ^ i35) & -1431655766;
            int i37 = i20 ^ i36;
            int i38 = i35 ^ i36;
            int i39 = (i37 >>> 1) | (i37 << 31);
            int i40 = ((i39 >>> 8) ^ i38) & 16711935;
            int i41 = i38 ^ i40;
            int i42 = i39 ^ (i40 << 8);
            int i43 = ((i42 >>> 2) ^ i41) & 858993459;
            int i44 = i41 ^ i43;
            int i45 = i42 ^ (i43 << 2);
            int i46 = ((i44 >>> 16) ^ i45) & 65535;
            int i47 = i45 ^ i46;
            int i48 = i44 ^ (i46 << 16);
            int i49 = ((i48 >>> 4) ^ i47) & 252645135;
            setTextFontSize.init(i48 ^ (i49 << 4), bArr3, i3);
            setTextFontSize.init(i47 ^ i49, bArr3, i3 + 4);
        }

        public int Cardinal(byte[] bArr, int i, byte[] bArr2, int i2) {
            int[] iArr = this.cca_continue;
            if (iArr == null) {
                throw new IllegalStateException("DES engine not initialised");
            } else if (i + 8 > bArr.length) {
                throw new GMSignatureSpi("input buffer too short");
            } else if (i2 + 8 <= bArr2.length) {
                init(iArr, bArr, i, bArr2, i2);
                return 8;
            } else {
                throw new KeyAgreementSpi.CDHwithSHA224KDFAndSharedInfo("output buffer too short");
            }
        }

        public void Cardinal() {
        }

        public String cca_continue() {
            return "DES";
        }

        public int getInstance() {
            return 8;
        }

        public void getInstance(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            if (sM2withRMD instanceof CipherSpi.ISO9796d1Padding) {
                CipherSpi.ISO9796d1Padding iSO9796d1Padding = (CipherSpi.ISO9796d1Padding) sM2withRMD;
                if (iSO9796d1Padding.getInstance.length <= 8) {
                    this.cca_continue = Cardinal(z, iSO9796d1Padding.getInstance);
                    return;
                }
                throw new IllegalArgumentException("DES key too long - should be 8 bytes");
            }
            throw new IllegalArgumentException(new StringBuilder("invalid parameter passed to DES init - ").append(sM2withRMD.getClass().getName()).toString());
        }
    }

    public final class ecDSASha3_384 implements GMCipherSpi.SM2withBlake2b {
        private static final BigInteger init = BigInteger.valueOf(1);
        private DigestSignatureSpi.SHA256 cca_continue;
        private ecDetDSA224 configure = new ecDetDSA224();
        private SecureRandom getInstance;

        public final int getInstance() {
            return this.configure.Cardinal();
        }

        public final int init() {
            return this.configure.cca_continue();
        }

        public final void getInstance(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            DigestSignatureSpi.SHA256 sha256;
            SecureRandom configure2;
            ecDetDSA224 ecdetdsa224 = this.configure;
            boolean z2 = sM2withRMD instanceof DigestSignatureSpi.RIPEMD128;
            if (z2) {
                sha256 = (DigestSignatureSpi.SHA256) ((DigestSignatureSpi.RIPEMD128) sM2withRMD).cca_continue;
            } else {
                sha256 = (DigestSignatureSpi.SHA256) sM2withRMD;
            }
            ecdetdsa224.getInstance = sha256;
            ecdetdsa224.cca_continue = z;
            if (z2) {
                DigestSignatureSpi.RIPEMD128 ripemd128 = (DigestSignatureSpi.RIPEMD128) sM2withRMD;
                this.cca_continue = (DigestSignatureSpi.SHA256) ripemd128.cca_continue;
                configure2 = ripemd128.Cardinal;
            } else {
                this.cca_continue = (DigestSignatureSpi.SHA256) sM2withRMD;
                configure2 = GMCipherSpi.SM2withWhirlpool.configure();
            }
            this.getInstance = configure2;
        }

        public final byte[] Cardinal(byte[] bArr, int i, int i2) {
            BigInteger bigInteger;
            byte[] bArr2;
            DigestSignatureSpi.RIPEMD256 ripemd256;
            BigInteger bigInteger2;
            if (this.cca_continue != null) {
                ecDetDSA224 ecdetdsa224 = this.configure;
                if (i2 > ecdetdsa224.cca_continue() + 1) {
                    throw new GMSignatureSpi("input too large for RSA cipher.");
                } else if (i2 != ecdetdsa224.cca_continue() + 1 || ecdetdsa224.cca_continue) {
                    if (!(i == 0 && i2 == bArr.length)) {
                        byte[] bArr3 = new byte[i2];
                        System.arraycopy(bArr, i, bArr3, 0, i2);
                        bArr = bArr3;
                    }
                    BigInteger bigInteger3 = new BigInteger(1, bArr);
                    if (bigInteger3.compareTo(ecdetdsa224.getInstance.getInstance) < 0) {
                        DigestSignatureSpi.SHA256 sha256 = this.cca_continue;
                        if (!(sha256 instanceof DigestSignatureSpi.RIPEMD256) || (bigInteger2 = ripemd256.Cardinal) == null) {
                            bigInteger = this.configure.configure(bigInteger3);
                        } else {
                            BigInteger bigInteger4 = (ripemd256 = (DigestSignatureSpi.RIPEMD256) sha256).getInstance;
                            BigInteger bigInteger5 = init;
                            BigInteger Cardinal = setCornerRadius.Cardinal(bigInteger5, bigInteger4.subtract(bigInteger5), this.getInstance);
                            bigInteger = this.configure.configure(Cardinal.modPow(bigInteger2, bigInteger4).multiply(bigInteger3).mod(bigInteger4)).multiply(Cardinal.modInverse(bigInteger4)).mod(bigInteger4);
                            if (!bigInteger3.equals(bigInteger.modPow(bigInteger2, bigInteger4))) {
                                throw new IllegalStateException("RSA engine faulty decryption/signing detected");
                            }
                        }
                        ecDetDSA224 ecdetdsa2242 = this.configure;
                        byte[] byteArray = bigInteger.toByteArray();
                        if (!ecdetdsa2242.cca_continue) {
                            if (byteArray[0] == 0) {
                                int length = byteArray.length - 1;
                                bArr2 = new byte[length];
                                System.arraycopy(byteArray, 1, bArr2, 0, length);
                            } else {
                                int length2 = byteArray.length;
                                bArr2 = new byte[length2];
                                System.arraycopy(byteArray, 0, bArr2, 0, length2);
                            }
                            for (int i3 = 0; i3 < byteArray.length; i3++) {
                                byteArray[i3] = 0;
                            }
                            return bArr2;
                        } else if (byteArray[0] == 0 && byteArray.length > ecdetdsa2242.Cardinal()) {
                            int length3 = byteArray.length - 1;
                            byte[] bArr4 = new byte[length3];
                            System.arraycopy(byteArray, 1, bArr4, 0, length3);
                            return bArr4;
                        } else if (byteArray.length >= ecdetdsa2242.Cardinal()) {
                            return byteArray;
                        } else {
                            int Cardinal2 = ecdetdsa2242.Cardinal();
                            byte[] bArr5 = new byte[Cardinal2];
                            System.arraycopy(byteArray, 0, bArr5, Cardinal2 - byteArray.length, byteArray.length);
                            return bArr5;
                        }
                    } else {
                        throw new GMSignatureSpi("input too large for RSA cipher.");
                    }
                } else {
                    throw new GMSignatureSpi("input too large for RSA cipher.");
                }
            } else {
                throw new IllegalStateException("RSA engine not initialised");
            }
        }
    }

    public final class ecDSASha3_512 implements GMCipherSpi.SM2withSha256 {
        private static byte[] Cardinal = {4, 2, Ascii.SI, 5, 9, 1, 0, 8, Ascii.SO, 3, Ascii.VT, Ascii.FF, Ascii.CR, 7, 10, 6, Ascii.FF, 9, Ascii.SI, Ascii.SO, 8, 1, 3, 10, 2, 7, 4, Ascii.CR, 6, 0, Ascii.VT, 5, Ascii.CR, 8, Ascii.SO, Ascii.FF, 7, 3, 9, 10, 1, 5, 2, 4, 6, Ascii.SI, 0, Ascii.VT, Ascii.SO, 9, Ascii.VT, 2, 5, Ascii.SI, 7, 1, 0, Ascii.CR, Ascii.FF, 6, 10, 4, 3, 8, 3, Ascii.SO, 5, 9, 6, 8, 0, Ascii.CR, 10, Ascii.VT, 7, Ascii.FF, 2, 1, Ascii.SI, 4, 8, Ascii.SI, 6, Ascii.VT, 1, 9, Ascii.FF, 5, Ascii.CR, 3, 7, 10, 0, Ascii.SO, 2, 4, 9, Ascii.VT, Ascii.FF, 0, 3, 6, 7, 5, 4, 8, Ascii.SO, Ascii.SI, 1, 10, 2, Ascii.CR, Ascii.FF, 6, 5, 2, Ascii.VT, 0, 9, Ascii.CR, 3, Ascii.SO, 7, 10, Ascii.SI, 4, 1, 8};
        private static Hashtable CardinalEnvironment;
        private static byte[] CardinalError = {4, 10, 9, 2, Ascii.CR, 8, 0, Ascii.SO, 6, Ascii.VT, 1, Ascii.FF, 7, Ascii.SI, 5, 3, Ascii.SO, Ascii.VT, 4, Ascii.FF, 6, Ascii.CR, Ascii.SI, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, Ascii.CR, 10, 3, 4, 2, Ascii.SO, Ascii.SI, Ascii.FF, 7, 6, 0, 9, Ascii.VT, 7, Ascii.CR, 10, 1, 0, 8, 9, Ascii.SI, Ascii.SO, 4, 6, Ascii.FF, Ascii.VT, 2, 5, 3, 6, Ascii.FF, 7, 1, 5, Ascii.SI, Ascii.CR, 8, 4, 10, 9, Ascii.SO, 0, 3, Ascii.VT, 2, 4, Ascii.VT, 10, 0, 7, 2, 1, Ascii.CR, 3, 6, 8, 5, 9, Ascii.FF, Ascii.SI, Ascii.SO, Ascii.CR, Ascii.VT, 4, 1, 3, Ascii.SI, 5, 9, 0, 10, Ascii.SO, 7, 6, 8, 2, Ascii.FF, 1, Ascii.SI, Ascii.CR, 0, 5, 7, 10, 4, 9, 2, 3, Ascii.SO, 6, Ascii.VT, 8, Ascii.FF};
        private static byte[] cleanup = {1, Ascii.VT, Ascii.FF, 2, 9, Ascii.CR, 0, Ascii.SI, 4, 5, 8, Ascii.SO, 10, 7, 6, 3, 0, 1, 7, Ascii.CR, Ascii.VT, 4, 5, 2, 8, Ascii.SO, Ascii.SI, Ascii.FF, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, Ascii.SI, 10, 3, 7, Ascii.FF, Ascii.CR, 6, Ascii.SO, 1, Ascii.VT, 3, 6, 0, 1, 5, Ascii.CR, 10, 8, Ascii.VT, 2, 9, 7, Ascii.SO, Ascii.SI, Ascii.FF, 4, 8, Ascii.CR, Ascii.VT, 0, 4, 5, 1, 2, 9, 3, Ascii.FF, Ascii.SO, 6, Ascii.SI, 10, 7, Ascii.FF, 9, Ascii.VT, 1, 8, Ascii.SO, 2, 4, 7, 3, 6, 5, 10, 0, Ascii.SI, Ascii.CR, 10, 9, 6, 8, Ascii.CR, Ascii.SO, 2, 0, Ascii.SI, 3, 5, Ascii.VT, 4, 1, Ascii.FF, 7, 7, 4, 0, 5, 10, 2, Ascii.SI, Ascii.SO, Ascii.FF, 6, 1, Ascii.VT, Ascii.CR, 9, 3, 8};
        private static byte[] getInstance = {4, 10, 9, 2, Ascii.CR, 8, 0, Ascii.SO, 6, Ascii.VT, 1, Ascii.FF, 7, Ascii.SI, 5, 3, Ascii.SO, Ascii.VT, 4, Ascii.FF, 6, Ascii.CR, Ascii.SI, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, Ascii.CR, 10, 3, 4, 2, Ascii.SO, Ascii.SI, Ascii.FF, 7, 6, 0, 9, Ascii.VT, 7, Ascii.CR, 10, 1, 0, 8, 9, Ascii.SI, Ascii.SO, 4, 6, Ascii.FF, Ascii.VT, 2, 5, 3, 6, Ascii.FF, 7, 1, 5, Ascii.SI, Ascii.CR, 8, 4, 10, 9, Ascii.SO, 0, 3, Ascii.VT, 2, 4, Ascii.VT, 10, 0, 7, 2, 1, Ascii.CR, 3, 6, 8, 5, 9, Ascii.FF, Ascii.SI, Ascii.SO, Ascii.CR, Ascii.VT, 4, 1, 3, Ascii.SI, 5, 9, 0, 10, Ascii.SO, 7, 6, 8, 2, Ascii.FF, 1, Ascii.SI, Ascii.CR, 0, 5, 7, 10, 4, 9, 2, 3, Ascii.SO, 6, Ascii.VT, 8, Ascii.FF};
        private static byte[] getSDKVersion = {Ascii.SI, Ascii.FF, 2, 10, 6, 4, 5, 0, 7, 9, Ascii.SO, Ascii.CR, 1, Ascii.VT, 8, 3, Ascii.VT, 6, 3, 4, Ascii.FF, Ascii.SI, Ascii.SO, 2, 7, Ascii.CR, 8, 0, 5, 10, 9, 1, 1, Ascii.FF, Ascii.VT, 0, Ascii.SI, Ascii.SO, 6, 5, 10, Ascii.CR, 4, 8, 9, 3, 7, 2, 1, 5, Ascii.SO, Ascii.FF, 10, 7, 0, Ascii.CR, 6, 2, Ascii.VT, 4, 9, 3, Ascii.SI, 8, 0, Ascii.FF, 8, 9, Ascii.CR, 2, 10, Ascii.VT, 7, 3, 6, 5, 4, Ascii.SO, Ascii.SI, 1, 8, 0, Ascii.SI, 3, 2, 5, Ascii.SO, Ascii.VT, 1, 10, 4, 7, Ascii.FF, 9, Ascii.CR, 6, 3, 0, 6, Ascii.SI, 1, Ascii.SO, 9, 2, Ascii.CR, 8, Ascii.FF, 4, Ascii.VT, 10, 5, 7, 1, 10, 6, 8, Ascii.SI, Ascii.VT, 0, 4, Ascii.FF, 3, 5, 9, 7, Ascii.CR, 2, Ascii.SO};
        private static byte[] getWarnings = {9, 6, 3, 2, 8, Ascii.VT, 1, 7, 10, 4, Ascii.SO, Ascii.SI, Ascii.FF, 0, Ascii.CR, 5, 3, 7, Ascii.SO, 9, 8, 10, Ascii.SI, 0, 5, 2, 6, Ascii.FF, Ascii.VT, 4, Ascii.CR, 1, Ascii.SO, 4, 6, 2, Ascii.VT, 3, Ascii.CR, 8, Ascii.FF, Ascii.SI, 5, 10, 0, 7, 1, 9, Ascii.SO, 7, 10, Ascii.FF, Ascii.CR, 1, 3, 9, 0, 2, Ascii.VT, 4, Ascii.SI, 8, 5, 6, Ascii.VT, 5, 1, 9, 8, Ascii.CR, Ascii.SI, 0, Ascii.SO, 4, 2, 3, Ascii.FF, 7, 10, 6, 3, 10, Ascii.CR, Ascii.FF, 1, 2, 0, Ascii.VT, 7, 5, 9, 4, 8, Ascii.SI, Ascii.SO, 6, 1, Ascii.CR, 2, 9, 7, 10, 6, 0, 8, Ascii.FF, 4, 5, Ascii.SI, 3, Ascii.VT, Ascii.SO, Ascii.VT, 10, Ascii.SI, 5, 0, Ascii.FF, Ascii.SO, 8, 6, 2, 3, 9, 1, 7, Ascii.CR, 4};
        private static byte[] onCReqSuccess = {8, 4, Ascii.VT, 1, 3, 5, 0, 9, 2, Ascii.SO, 10, Ascii.FF, Ascii.CR, 6, 7, Ascii.SI, 0, 1, 2, 10, 4, Ascii.CR, 5, Ascii.FF, 9, 7, 3, Ascii.SI, Ascii.VT, 8, 6, Ascii.SO, Ascii.SO, Ascii.FF, 0, 10, 9, 2, Ascii.CR, Ascii.VT, 7, 5, 8, Ascii.SI, 3, 6, 1, 4, 7, 5, 0, Ascii.CR, Ascii.VT, 6, 1, 2, 3, 10, Ascii.FF, Ascii.SI, 4, Ascii.SO, 9, 8, 2, 7, Ascii.FF, Ascii.SI, 9, 5, 10, Ascii.VT, 1, 4, 0, Ascii.CR, 6, 8, Ascii.SO, 3, 8, 3, 2, 6, 4, Ascii.CR, Ascii.SO, Ascii.VT, Ascii.FF, 1, 7, Ascii.SI, 10, 0, 9, 5, 5, 2, 10, Ascii.VT, 9, 1, Ascii.FF, 3, 7, 4, Ascii.CR, 0, 6, Ascii.SI, 8, Ascii.SO, 0, 4, Ascii.VT, Ascii.SO, 8, 3, 7, 1, 10, 2, 9, 6, Ascii.SI, Ascii.CR, 5, Ascii.FF};
        private static byte[] onValidated = {Ascii.FF, 4, 6, 2, 10, 5, Ascii.VT, 9, Ascii.SO, 8, Ascii.CR, 7, 0, 3, Ascii.SI, 1, 6, 8, 2, 3, 9, 10, 5, Ascii.FF, 1, Ascii.SO, 4, 7, Ascii.VT, Ascii.CR, 0, Ascii.SI, Ascii.VT, 3, 5, 8, 2, Ascii.SI, 10, Ascii.CR, Ascii.SO, 1, 7, 4, Ascii.FF, 9, 6, 0, Ascii.FF, 8, 2, 1, Ascii.CR, 4, Ascii.SI, 6, 7, 0, 10, 5, 3, Ascii.SO, 9, Ascii.VT, 7, Ascii.SI, 5, 10, 8, 1, 6, Ascii.CR, 0, 9, 3, Ascii.SO, Ascii.VT, 4, 2, Ascii.FF, 5, Ascii.CR, Ascii.SI, 6, 9, 2, Ascii.FF, 10, Ascii.VT, 7, 8, 1, 4, 3, Ascii.SO, 0, 8, Ascii.SO, 2, 5, 6, 9, 1, Ascii.FF, Ascii.SI, 4, Ascii.VT, 0, Ascii.CR, 10, 3, 7, 1, 7, Ascii.SO, Ascii.CR, 0, 5, 8, 3, 4, Ascii.SI, 10, 6, 9, Ascii.FF, Ascii.VT, 2};
        private static byte[] valueOf = {10, 4, 5, 6, 8, 1, 3, 7, Ascii.CR, Ascii.FF, Ascii.SO, 0, 9, 2, Ascii.VT, Ascii.SI, 5, Ascii.SI, 4, 0, 2, Ascii.CR, Ascii.VT, 9, 1, 7, 6, 3, Ascii.FF, Ascii.SO, 10, 8, 7, Ascii.SI, Ascii.FF, Ascii.SO, 9, 4, 1, 0, 3, Ascii.VT, 5, 2, 6, 10, 8, Ascii.CR, 4, 10, 7, Ascii.FF, 0, Ascii.SI, 2, 8, Ascii.SO, 1, 6, 5, Ascii.CR, Ascii.VT, 9, 3, 7, 6, 4, Ascii.VT, 9, Ascii.FF, 2, 10, 1, 8, 0, Ascii.SO, Ascii.SI, Ascii.CR, 3, 5, 7, 6, 2, 4, Ascii.CR, 9, Ascii.SI, 0, 10, 1, 5, Ascii.VT, 8, Ascii.SO, Ascii.FF, 3, Ascii.CR, Ascii.SO, 4, 1, 7, 0, 5, 10, 3, Ascii.FF, 8, Ascii.SI, 6, 2, 9, Ascii.VT, 1, 3, 10, 9, 5, Ascii.VT, 4, Ascii.SI, 8, 6, 7, Ascii.SO, Ascii.CR, 0, 2, Ascii.FF};
        private byte[] cca_continue = getInstance;
        private boolean configure;
        private int[] init = null;

        private static int cca_continue(byte[] bArr, int i) {
            return ((bArr[i + 3] << Ascii.CAN) & -16777216) + ((bArr[i + 2] << Ascii.DLE) & 16711680) + ((bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i] & 255);
        }

        private int[] cca_continue(boolean z, byte[] bArr) {
            this.configure = z;
            if (bArr.length == 32) {
                int[] iArr = new int[8];
                for (int i = 0; i != 8; i++) {
                    iArr[i] = cca_continue(bArr, i << 2);
                }
                return iArr;
            }
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }

        private int configure(int i, int i2) {
            int i3 = i2 + i;
            byte[] bArr = this.cca_continue;
            int i4 = bArr[(i3 & 15) + 0] + (bArr[((i3 >> 4) & 15) + 16] << 4) + (bArr[((i3 >> 8) & 15) + 32] << 8) + (bArr[((i3 >> 12) & 15) + 48] << Ascii.FF) + (bArr[((i3 >> 16) & 15) + 64] << Ascii.DLE) + (bArr[((i3 >> 20) & 15) + 80] << Ascii.DC4) + (bArr[((i3 >> 24) & 15) + 96] << Ascii.CAN) + (bArr[((i3 >> 28) & 15) + 112] << Ascii.FS);
            return (i4 << 11) | (i4 >>> 21);
        }

        private static void getInstance(int i, byte[] bArr, int i2) {
            bArr[i2 + 3] = (byte) (i >>> 24);
            bArr[i2 + 2] = (byte) (i >>> 16);
            bArr[i2 + 1] = (byte) (i >>> 8);
            bArr[i2] = (byte) i;
        }

        public final void Cardinal() {
        }

        public final String cca_continue() {
            return "GOST28147";
        }

        public final int getInstance() {
            return 8;
        }

        public final void getInstance(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            byte[] bArr;
            if (sM2withRMD instanceof DigestSignatureSpi) {
                DigestSignatureSpi digestSignatureSpi = (DigestSignatureSpi) sM2withRMD;
                byte[] bArr2 = digestSignatureSpi.configure;
                if (bArr2.length == getInstance.length) {
                    if (bArr2 == null) {
                        bArr = null;
                    } else {
                        byte[] bArr3 = new byte[bArr2.length];
                        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                        bArr = bArr3;
                    }
                    this.cca_continue = bArr;
                    if (digestSignatureSpi.getInstance != null) {
                        this.init = cca_continue(z, ((CipherSpi.ISO9796d1Padding) digestSignatureSpi.getInstance).getInstance);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("invalid S-box passed to GOST28147 init");
            } else if (sM2withRMD instanceof CipherSpi.ISO9796d1Padding) {
                this.init = cca_continue(z, ((CipherSpi.ISO9796d1Padding) sM2withRMD).getInstance);
            } else if (sM2withRMD != null) {
                throw new IllegalArgumentException(new StringBuilder("invalid parameter passed to GOST28147 init - ").append(sM2withRMD.getClass().getName()).toString());
            }
        }

        public final int Cardinal(byte[] bArr, int i, byte[] bArr2, int i2) {
            int[] iArr = this.init;
            if (iArr == null) {
                throw new IllegalStateException("GOST28147 engine not initialised");
            } else if (i + 8 > bArr.length) {
                throw new GMSignatureSpi("input buffer too short");
            } else if (i2 + 8 <= bArr2.length) {
                int cca_continue2 = cca_continue(bArr, i);
                int cca_continue3 = cca_continue(bArr, i + 4);
                int i3 = 7;
                if (this.configure) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        int i5 = 0;
                        while (i5 < 8) {
                            i5++;
                            int i6 = cca_continue2;
                            cca_continue2 = cca_continue3 ^ configure(cca_continue2, iArr[i5]);
                            cca_continue3 = i6;
                        }
                    }
                    while (i3 > 0) {
                        i3--;
                        int i7 = cca_continue2;
                        cca_continue2 = cca_continue3 ^ configure(cca_continue2, iArr[i3]);
                        cca_continue3 = i7;
                    }
                } else {
                    int i8 = 0;
                    while (i8 < 8) {
                        i8++;
                        int i9 = cca_continue2;
                        cca_continue2 = cca_continue3 ^ configure(cca_continue2, iArr[i8]);
                        cca_continue3 = i9;
                    }
                    int i10 = 0;
                    while (i10 < 3) {
                        int i11 = 7;
                        while (i11 >= 0 && (i10 != 2 || i11 != 0)) {
                            i11--;
                            int i12 = cca_continue2;
                            cca_continue2 = cca_continue3 ^ configure(cca_continue2, iArr[i11]);
                            cca_continue3 = i12;
                        }
                        i10++;
                    }
                }
                getInstance(cca_continue2, bArr2, i2);
                getInstance(cca_continue3 ^ configure(cca_continue2, iArr[0]), bArr2, i2 + 4);
                return 8;
            } else {
                throw new KeyAgreementSpi.CDHwithSHA224KDFAndSharedInfo("output buffer too short");
            }
        }

        public static byte[] Cardinal(String str) {
            byte[] bArr = (byte[]) CardinalEnvironment.get(getTextFontSize.cca_continue(str));
            if (bArr == null) {
                throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
            } else if (bArr == null) {
                return null;
            } else {
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                return bArr2;
            }
        }

        static {
            Hashtable hashtable = new Hashtable();
            CardinalEnvironment = hashtable;
            hashtable.put(getTextFontSize.cca_continue("Default"), getInstance);
            CardinalEnvironment.put(getTextFontSize.cca_continue("E-TEST"), Cardinal);
            CardinalEnvironment.put(getTextFontSize.cca_continue("E-A"), getWarnings);
            CardinalEnvironment.put(getTextFontSize.cca_continue("E-B"), onCReqSuccess);
            CardinalEnvironment.put(getTextFontSize.cca_continue("E-C"), cleanup);
            CardinalEnvironment.put(getTextFontSize.cca_continue("E-D"), getSDKVersion);
            CardinalEnvironment.put(getTextFontSize.cca_continue("Param-Z"), onValidated);
            CardinalEnvironment.put(getTextFontSize.cca_continue("D-TEST"), CardinalError);
            CardinalEnvironment.put(getTextFontSize.cca_continue("D-A"), valueOf);
        }
    }

    public final class ecDSAnone implements GMCipherSpi.SM2 {
        public KeyAgreementSpi.X25519UwithSHA256KDF cca_continue;

        public final void getInstance(appendElement appendelement) {
            this.cca_continue = (KeyAgreementSpi.X25519UwithSHA256KDF) appendelement;
        }

        public final PSSSignatureSpi.SHA256withRSA init() {
            ecDetDSA256 ecdetdsa256 = ecDetDSA256.cca_continue;
            KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF = this.cca_continue.getInstance;
            BigInteger Cardinal = ecDetDSA256.Cardinal(x25519withSHA256CKDF, this.cca_continue.configure);
            return new PSSSignatureSpi.SHA256withRSA(new KeyAgreementSpi.X25519withSHA256KDF(ecDetDSA256.init(x25519withSHA256CKDF, Cardinal), x25519withSHA256CKDF), new KeyAgreementSpi.X25519UwithSHA256CKDF(Cardinal, x25519withSHA256CKDF));
        }
    }

    public final class ecDetDSA {
        private KeyPairGeneratorSpi.Ed448 Cardinal;
        private boolean cca_continue;
        private SecureRandom cleanup;
        private final init configure;
        public final IESCipher.ECIESwithAESCBC getInstance;
        private KeyFactorySpi.EDDSA getSDKVersion;
        public int init;

        /* renamed from: com.cardinalcommerce.a.SignatureSpi$ecDetDSA$5  reason: invalid class name */
        static /* synthetic */ class AnonymousClass5 {
            static final /* synthetic */ int[] getInstance;

            static {
                int[] iArr = new int[init.values().length];
                getInstance = iArr;
                try {
                    iArr[init.C1C3C2.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
            }
        }

        public enum init {
            C1C2C3,
            C1C3C2
        }

        public ecDetDSA() {
            this(new ecDSA());
        }

        public ecDetDSA(IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
            this(eCIESwithAESCBC, init.C1C2C3);
        }

        private ecDetDSA(IESCipher.ECIESwithAESCBC eCIESwithAESCBC, init init2) {
            if (init2 != null) {
                this.getInstance = eCIESwithAESCBC;
                this.configure = init2;
                return;
            }
            throw new IllegalArgumentException("mode cannot be NULL");
        }

        public final void Cardinal(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) {
            this.cca_continue = z;
            if (z) {
                DigestSignatureSpi.RIPEMD128 ripemd128 = (DigestSignatureSpi.RIPEMD128) sM2withRMD;
                KeyPairGeneratorSpi.Ed448 ed448 = (KeyPairGeneratorSpi.Ed448) ripemd128.cca_continue;
                this.Cardinal = ed448;
                this.getSDKVersion = ed448.Cardinal;
                if (!((KeyPairGeneratorSpi.XDH) this.Cardinal).configure.Cardinal(this.getSDKVersion.Cardinal).getString()) {
                    this.cleanup = ripemd128.Cardinal;
                } else {
                    throw new IllegalArgumentException("invalid key: [h]Q at infinity");
                }
            } else {
                KeyPairGeneratorSpi.Ed448 ed4482 = (KeyPairGeneratorSpi.Ed448) sM2withRMD;
                this.Cardinal = ed4482;
                this.getSDKVersion = ed4482.Cardinal;
            }
            this.init = (this.getSDKVersion.cca_continue.getInstance() + 7) / 8;
        }

        public final byte[] Cardinal(byte[] bArr, int i) throws KeyAgreementSpi.AnonymousClass1 {
            byte b;
            BigInteger configure2;
            byte[] Cardinal2;
            JSONNavi CardinalRenderType;
            boolean z;
            if (this.cca_continue) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                JSONAware jSONAware = new JSONAware();
                do {
                    int bitLength = this.getSDKVersion.getInstance.bitLength();
                    while (true) {
                        configure2 = setCornerRadius.configure(bitLength, this.cleanup);
                        if (!configure2.equals(setCornerRadius.init) && configure2.compareTo(this.getSDKVersion.getInstance) < 0) {
                            break;
                        }
                    }
                    Cardinal2 = jSONAware.cca_continue(this.getSDKVersion.init, configure2).CardinalRenderType().Cardinal(false);
                    CardinalRenderType = ((KeyPairGeneratorSpi.XDH) this.Cardinal).configure.Cardinal(configure2).CardinalRenderType();
                    getInstance(this.getInstance, CardinalRenderType, bArr2);
                    int i2 = 0;
                    while (true) {
                        if (i2 == i) {
                            z = true;
                            continue;
                            break;
                        } else if (bArr2[i2] != bArr[i2 + 0]) {
                            z = false;
                            continue;
                            break;
                        } else {
                            i2++;
                        }
                    }
                } while (z);
                byte[] bArr3 = new byte[this.getInstance.getInstance()];
                IESCipher.ECIESwithAESCBC eCIESwithAESCBC = this.getInstance;
                byte[] instance = setCornerRadius.getInstance(this.init, CardinalRenderType.onCReqSuccess().cca_continue());
                eCIESwithAESCBC.init(instance, 0, instance.length);
                this.getInstance.init(bArr, 0, i);
                IESCipher.ECIESwithAESCBC eCIESwithAESCBC2 = this.getInstance;
                byte[] instance2 = setCornerRadius.getInstance(this.init, CardinalRenderType.getWarnings().cca_continue());
                eCIESwithAESCBC2.init(instance2, 0, instance2.length);
                this.getInstance.init(bArr3, 0);
                return AnonymousClass5.getInstance[this.configure.ordinal()] != 1 ? getBackgroundColor.getInstance(Cardinal2, bArr2, bArr3) : getBackgroundColor.getInstance(Cardinal2, bArr3, bArr2);
            }
            int i3 = (this.init << 1) + 1;
            byte[] bArr4 = new byte[i3];
            System.arraycopy(bArr, 0, bArr4, 0, i3);
            JSONNavi cca_continue2 = this.getSDKVersion.cca_continue.cca_continue(bArr4);
            if (!cca_continue2.Cardinal(this.getSDKVersion.Cardinal).getString()) {
                JSONNavi CardinalRenderType2 = cca_continue2.Cardinal(((KeyPairGeneratorSpi.EdDSA) this.Cardinal).init).CardinalRenderType();
                int instance3 = this.getInstance.getInstance();
                int i4 = (i - i3) - instance3;
                byte[] bArr5 = new byte[i4];
                if (this.configure == init.C1C3C2) {
                    System.arraycopy(bArr, i3 + 0 + instance3, bArr5, 0, i4);
                } else {
                    System.arraycopy(bArr, i3 + 0, bArr5, 0, i4);
                }
                getInstance(this.getInstance, CardinalRenderType2, bArr5);
                int instance4 = this.getInstance.getInstance();
                byte[] bArr6 = new byte[instance4];
                IESCipher.ECIESwithAESCBC eCIESwithAESCBC3 = this.getInstance;
                byte[] instance5 = setCornerRadius.getInstance(this.init, CardinalRenderType2.onCReqSuccess().cca_continue());
                eCIESwithAESCBC3.init(instance5, 0, instance5.length);
                this.getInstance.init(bArr5, 0, i4);
                IESCipher.ECIESwithAESCBC eCIESwithAESCBC4 = this.getInstance;
                byte[] instance6 = setCornerRadius.getInstance(this.init, CardinalRenderType2.getWarnings().cca_continue());
                eCIESwithAESCBC4.init(instance6, 0, instance6.length);
                this.getInstance.init(bArr6, 0);
                if (this.configure == init.C1C3C2) {
                    b = 0;
                    for (int i5 = 0; i5 != instance4; i5++) {
                        b |= bArr6[i5] ^ bArr[(i3 + 0) + i5];
                    }
                } else {
                    byte b2 = 0;
                    for (int i6 = 0; i6 != instance4; i6++) {
                        b2 = b | (bArr6[i6] ^ bArr[((i3 + 0) + i4) + i6]);
                    }
                }
                for (int i7 = 0; i7 < i3; i7++) {
                    bArr4[i7] = 0;
                }
                for (int i8 = 0; i8 < instance4; i8++) {
                    bArr6[i8] = 0;
                }
                if (b == 0) {
                    return bArr5;
                }
                for (int i9 = 0; i9 < i4; i9++) {
                    bArr5[i9] = 0;
                }
                throw new KeyAgreementSpi.AnonymousClass1("invalid cipher text");
            }
            throw new KeyAgreementSpi.AnonymousClass1("[h]C1 at infinity");
        }

        private void getInstance(IESCipher.ECIESwithAESCBC eCIESwithAESCBC, JSONNavi jSONNavi, byte[] bArr) {
            setBackgroundColor setbackgroundcolor;
            setBackgroundColor setbackgroundcolor2;
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC2 = eCIESwithAESCBC;
            byte[] bArr2 = bArr;
            int instance = eCIESwithAESCBC.getInstance();
            byte[] bArr3 = new byte[Math.max(4, instance)];
            if (eCIESwithAESCBC2 instanceof setBackgroundColor) {
                byte[] instance2 = setCornerRadius.getInstance(this.init, jSONNavi.onCReqSuccess().cca_continue());
                eCIESwithAESCBC2.init(instance2, 0, instance2.length);
                byte[] instance3 = setCornerRadius.getInstance(this.init, jSONNavi.getWarnings().cca_continue());
                eCIESwithAESCBC2.init(instance3, 0, instance3.length);
                setbackgroundcolor2 = (setBackgroundColor) eCIESwithAESCBC2;
                setbackgroundcolor = setbackgroundcolor2.Cardinal();
            } else {
                setbackgroundcolor2 = null;
                setbackgroundcolor = null;
            }
            int i = 0;
            int i2 = 0;
            while (i < bArr2.length) {
                if (setbackgroundcolor2 != null) {
                    setbackgroundcolor2.cca_continue(setbackgroundcolor);
                } else {
                    byte[] instance4 = setCornerRadius.getInstance(this.init, jSONNavi.onCReqSuccess().cca_continue());
                    eCIESwithAESCBC2.init(instance4, 0, instance4.length);
                    byte[] instance5 = setCornerRadius.getInstance(this.init, jSONNavi.getWarnings().cca_continue());
                    eCIESwithAESCBC2.init(instance5, 0, instance5.length);
                }
                i2++;
                setTextFontSize.init(i2, bArr3, 0);
                eCIESwithAESCBC2.init(bArr3, 0, 4);
                eCIESwithAESCBC2.init(bArr3, 0);
                int min = Math.min(instance, bArr2.length - i);
                for (int i3 = 0; i3 != min; i3++) {
                    int i4 = i + i3;
                    bArr2[i4] = (byte) (bArr2[i4] ^ bArr3[i3]);
                }
                i += min;
            }
        }
    }

    final class ecDetDSA224 {
        boolean cca_continue;
        DigestSignatureSpi.SHA256 getInstance;

        ecDetDSA224() {
        }

        public final int cca_continue() {
            int bitLength = (this.getInstance.getInstance.bitLength() + 7) / 8;
            return this.cca_continue ? bitLength - 1 : bitLength;
        }

        public final int Cardinal() {
            int bitLength = (this.getInstance.getInstance.bitLength() + 7) / 8;
            return this.cca_continue ? bitLength : bitLength - 1;
        }

        public final BigInteger configure(BigInteger bigInteger) {
            DigestSignatureSpi.SHA256 sha256 = this.getInstance;
            if (!(sha256 instanceof DigestSignatureSpi.RIPEMD256)) {
                return bigInteger.modPow(sha256.cca_continue, this.getInstance.getInstance);
            }
            DigestSignatureSpi.RIPEMD256 ripemd256 = (DigestSignatureSpi.RIPEMD256) sha256;
            BigInteger bigInteger2 = ripemd256.init;
            BigInteger bigInteger3 = ripemd256.configure;
            BigInteger bigInteger4 = ripemd256.cleanup;
            BigInteger bigInteger5 = ripemd256.onValidated;
            BigInteger bigInteger6 = ripemd256.getWarnings;
            BigInteger modPow = bigInteger.remainder(bigInteger2).modPow(bigInteger4, bigInteger2);
            BigInteger modPow2 = bigInteger.remainder(bigInteger3).modPow(bigInteger5, bigInteger3);
            return modPow.subtract(modPow2).multiply(bigInteger6).mod(bigInteger2).multiply(bigInteger3).add(modPow2);
        }
    }

    final class ecDetDSA256 {
        private static final BigInteger Cardinal = BigInteger.valueOf(2);
        static final ecDetDSA256 cca_continue = new ecDetDSA256();
        private static final BigInteger init = BigInteger.valueOf(1);

        private ecDetDSA256() {
        }

        static BigInteger Cardinal(KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF, SecureRandom secureRandom) {
            BigInteger Cardinal2;
            BigInteger bit;
            int i = x25519withSHA256CKDF.getWarnings;
            if (i != 0) {
                int i2 = i >>> 2;
                do {
                    bit = setCornerRadius.configure(i, secureRandom).setBit(i - 1);
                } while (get.cca_continue(bit) < i2);
                return bit;
            }
            BigInteger bigInteger = Cardinal;
            int i3 = x25519withSHA256CKDF.cca_continue;
            BigInteger shiftLeft = i3 != 0 ? init.shiftLeft(i3 - 1) : bigInteger;
            BigInteger bigInteger2 = x25519withSHA256CKDF.getInstance;
            if (bigInteger2 == null) {
                bigInteger2 = x25519withSHA256CKDF.Cardinal;
            }
            BigInteger subtract = bigInteger2.subtract(bigInteger);
            int bitLength = subtract.bitLength() >>> 2;
            do {
                Cardinal2 = setCornerRadius.Cardinal(shiftLeft, subtract, secureRandom);
            } while (get.cca_continue(Cardinal2) < bitLength);
            return Cardinal2;
        }

        static BigInteger init(KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF, BigInteger bigInteger) {
            return x25519withSHA256CKDF.init.modPow(bigInteger, x25519withSHA256CKDF.Cardinal);
        }
    }

    public final class ecDetDSA512 implements GMCipherSpi.SM2 {
        private static final BigInteger init = BigInteger.valueOf(1);
        public KeyAgreementSpi.X25519withSHA512CKDF getInstance;

        public final void getInstance(appendElement appendelement) {
            this.getInstance = (KeyAgreementSpi.X25519withSHA512CKDF) appendelement;
        }

        public final PSSSignatureSpi.SHA256withRSA init() {
            BigInteger Cardinal;
            KeyAgreementSpi.X448withSHA256CKDF x448withSHA256CKDF = this.getInstance.cca_continue;
            BigInteger bigInteger = x448withSHA256CKDF.init;
            SecureRandom secureRandom = this.getInstance.configure;
            int bitLength = bigInteger.bitLength() >>> 2;
            do {
                BigInteger bigInteger2 = init;
                Cardinal = setCornerRadius.Cardinal(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
            } while (get.cca_continue(Cardinal) < bitLength);
            return new PSSSignatureSpi.SHA256withRSA(new KeyAgreementSpi.X448withSHA512CKDF(x448withSHA256CKDF.Cardinal.modPow(Cardinal, x448withSHA256CKDF.configure), x448withSHA256CKDF), new KeyAgreementSpi.X448UwithSHA512KDF(Cardinal, x448withSHA256CKDF));
        }
    }

    public final class ecDetDSASha3_256 implements GMCipherSpi.SM2 {
        public KeyAgreementSpi.X25519UwithSHA256KDF configure;

        public final void getInstance(appendElement appendelement) {
            this.configure = (KeyAgreementSpi.X25519UwithSHA256KDF) appendelement;
        }

        public final PSSSignatureSpi.SHA256withRSA init() {
            ecDetDSA256 ecdetdsa256 = ecDetDSA256.cca_continue;
            KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF = this.configure.getInstance;
            BigInteger Cardinal = ecDetDSA256.Cardinal(x25519withSHA256CKDF, this.configure.configure);
            return new PSSSignatureSpi.SHA256withRSA(new KeyAgreementSpi.X25519withSHA256KDF(ecDetDSA256.init(x25519withSHA256CKDF, Cardinal), x25519withSHA256CKDF), new KeyAgreementSpi.X25519UwithSHA256CKDF(Cardinal, x25519withSHA256CKDF));
        }
    }

    public final class ecDetDSASha3_384 {
        private static final BigInteger getInstance = BigInteger.valueOf(2);
        private static final BigInteger init = BigInteger.valueOf(1);
        private IESCipher.ECIESwithAESCBC Cardinal;
        private int cca_continue;
        private boolean cleanup;
        private int configure;
        private int getSDKVersion;
        private SecureRandom getWarnings;
        private int onCReqSuccess;
        private int onValidated;

        static {
            BigInteger.valueOf(0);
        }

        public ecDetDSASha3_384(IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
            this.Cardinal = eCIESwithAESCBC;
        }

        private static BigInteger init(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
            BigInteger modPow;
            BigInteger divide = bigInteger.subtract(init).divide(bigInteger2);
            BigInteger subtract = bigInteger.subtract(getInstance);
            do {
                modPow = setCornerRadius.Cardinal(getInstance, subtract, secureRandom).modPow(divide, bigInteger);
            } while (modPow.bitLength() <= 1);
            return modPow;
        }

        public ecDetDSASha3_384() {
            this(new KeyFactorySpi.ECMQV());
        }

        public final void cca_continue(int i, int i2, SecureRandom secureRandom) {
            this.configure = i;
            this.cca_continue = i > 1024 ? 256 : Opcodes.IF_ICMPNE;
            this.onCReqSuccess = i2;
            this.onValidated = Math.max(i <= 1024 ? 40 : (((i - 1) / 1024) * 8) + 48, (i2 + 1) / 2);
            this.getWarnings = secureRandom;
            this.cleanup = false;
            this.getSDKVersion = -1;
        }

        public final void cca_continue(KeyAgreementSpi.X448withSHA384CKDF x448withSHA384CKDF) {
            int i;
            int i2 = x448withSHA384CKDF.getInstance;
            int i3 = x448withSHA384CKDF.cca_continue;
            if (i2 < 1024 || i2 > 3072 || i2 % 1024 != 0) {
                throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
            } else if (i2 == 1024 && i3 != 160) {
                throw new IllegalArgumentException("N must be 160 for L = 1024");
            } else if (i2 == 2048 && i3 != 224 && i3 != 256) {
                throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
            } else if (i2 == 3072 && i3 != 256) {
                throw new IllegalArgumentException("N must be 256 for L = 3072");
            } else if ((this.Cardinal.getInstance() << 3) >= i3) {
                this.configure = i2;
                this.cca_continue = i3;
                int i4 = x448withSHA384CKDF.Cardinal;
                this.onCReqSuccess = i4;
                if (i2 <= 1024) {
                    i = 40;
                } else {
                    i = (((i2 - 1) / 1024) * 8) + 48;
                }
                this.onValidated = Math.max(i, (i4 + 1) / 2);
                this.getWarnings = x448withSHA384CKDF.configure;
                this.cleanup = true;
                this.getSDKVersion = x448withSHA384CKDF.init;
            } else {
                throw new IllegalStateException("Digest output size too small for value of N");
            }
        }

        public final KeyAgreementSpi.X448withSHA256CKDF getInstance() {
            BigInteger bit;
            int i;
            BigInteger bigInteger;
            BigInteger subtract;
            BigInteger bigInteger2;
            int i2 = 0;
            int i3 = 1;
            if (this.cleanup) {
                IESCipher.ECIESwithAESCBC eCIESwithAESCBC = this.Cardinal;
                int instance = eCIESwithAESCBC.getInstance() << 3;
                int i4 = this.cca_continue / 8;
                byte[] bArr = new byte[i4];
                int i5 = this.configure;
                int i6 = (i5 - 1) / instance;
                int i7 = (i5 - 1) % instance;
                int i8 = i5 / 8;
                byte[] bArr2 = new byte[i8];
                int instance2 = eCIESwithAESCBC.getInstance();
                byte[] bArr3 = new byte[instance2];
                loop0:
                while (true) {
                    this.getWarnings.nextBytes(bArr);
                    eCIESwithAESCBC.init(bArr, i2, i4);
                    eCIESwithAESCBC.init(bArr3, i2);
                    bit = new BigInteger(i3, bArr3).mod(init.shiftLeft(this.cca_continue - i3)).setBit(i2).setBit(this.cca_continue - i3);
                    if (bit.isProbablePrime(this.onCReqSuccess)) {
                        byte[] bArr4 = new byte[i4];
                        System.arraycopy(bArr, i2, bArr4, i2, i4);
                        int i9 = this.configure * 4;
                        i = i2;
                        while (i < i9) {
                            for (int i10 = i3; i10 <= i6; i10++) {
                                for (int i11 = i4 - 1; i11 >= 0; i11--) {
                                    byte b = (byte) (bArr4[i11] + 1);
                                    bArr4[i11] = b;
                                    if (b != 0) {
                                        break;
                                    }
                                }
                                eCIESwithAESCBC.init(bArr4, 0, i4);
                                eCIESwithAESCBC.init(bArr2, i8 - (i10 * instance2));
                            }
                            int i12 = i8 - (i6 * instance2);
                            for (int i13 = i4 - 1; i13 >= 0; i13--) {
                                byte b2 = (byte) (bArr4[i13] + 1);
                                bArr4[i13] = b2;
                                if (b2 != 0) {
                                    break;
                                }
                            }
                            eCIESwithAESCBC.init(bArr4, 0, i4);
                            eCIESwithAESCBC.init(bArr3, 0);
                            System.arraycopy(bArr3, instance2 - i12, bArr2, 0, i12);
                            bArr2[0] = (byte) (bArr2[0] | Byte.MIN_VALUE);
                            BigInteger bigInteger3 = new BigInteger(1, bArr2);
                            BigInteger mod = bigInteger3.mod(bit.shiftLeft(1));
                            bigInteger = init;
                            subtract = bigInteger3.subtract(mod.subtract(bigInteger));
                            byte[] bArr5 = bArr2;
                            if (subtract.bitLength() == this.configure && subtract.isProbablePrime(this.onCReqSuccess)) {
                                break loop0;
                            }
                            i++;
                            bArr2 = bArr5;
                            i2 = 0;
                            i3 = 1;
                        }
                        continue;
                    }
                }
                int i14 = this.getSDKVersion;
                if (i14 >= 0) {
                    BigInteger divide = subtract.subtract(bigInteger).divide(bit);
                    byte[] init2 = getHeadingTextFontName.init("6767656E");
                    int length = init2.length + i4 + 1 + 2;
                    byte[] bArr6 = new byte[length];
                    System.arraycopy(bArr, 0, bArr6, 0, i4);
                    System.arraycopy(init2, 0, bArr6, i4, init2.length);
                    bArr6[length - 3] = (byte) i14;
                    byte[] bArr7 = new byte[eCIESwithAESCBC.getInstance()];
                    int i15 = 1;
                    while (true) {
                        if (i15 >= 65536) {
                            bigInteger2 = null;
                            break;
                        }
                        for (int i16 = length - 1; i16 >= 0; i16--) {
                            byte b3 = (byte) (bArr6[i16] + 1);
                            bArr6[i16] = b3;
                            if (b3 != 0) {
                                break;
                            }
                        }
                        eCIESwithAESCBC.init(bArr6, 0, length);
                        eCIESwithAESCBC.init(bArr7, 0);
                        bigInteger2 = new BigInteger(1, bArr7).modPow(divide, subtract);
                        if (bigInteger2.compareTo(getInstance) >= 0) {
                            break;
                        }
                        i15++;
                    }
                    if (bigInteger2 != null) {
                        return new KeyAgreementSpi.X448withSHA256CKDF(subtract, bit, bigInteger2, new KeyFactorySpi.ED25519(bArr, i, this.getSDKVersion));
                    }
                }
                return new KeyAgreementSpi.X448withSHA256CKDF(subtract, bit, init(subtract, bit, this.getWarnings), new KeyFactorySpi.ED25519(bArr, i));
            }
            int i17 = 20;
            byte[] bArr8 = new byte[20];
            byte[] bArr9 = new byte[20];
            byte[] bArr10 = new byte[20];
            byte[] bArr11 = new byte[20];
            int i18 = this.configure;
            int i19 = (i18 - 1) / Opcodes.IF_ICMPNE;
            int i20 = i18 / 8;
            byte[] bArr12 = new byte[i20];
            if (this.Cardinal instanceof KeyFactorySpi.ECMQV) {
                while (true) {
                    this.getWarnings.nextBytes(bArr8);
                    IESCipher.ECIESwithAESCBC eCIESwithAESCBC2 = this.Cardinal;
                    eCIESwithAESCBC2.init(bArr8, 0, i17);
                    eCIESwithAESCBC2.init(bArr9, 0);
                    System.arraycopy(bArr8, 0, bArr10, 0, i17);
                    int i21 = 19;
                    for (int i22 = 19; i22 >= 0; i22--) {
                        byte b4 = (byte) (bArr10[i22] + 1);
                        bArr10[i22] = b4;
                        if (b4 != 0) {
                            break;
                        }
                    }
                    IESCipher.ECIESwithAESCBC eCIESwithAESCBC3 = this.Cardinal;
                    eCIESwithAESCBC3.init(bArr10, 0, i17);
                    eCIESwithAESCBC3.init(bArr10, 0);
                    for (int i23 = 0; i23 != i17; i23++) {
                        bArr11[i23] = (byte) (bArr9[i23] ^ bArr10[i23]);
                    }
                    bArr11[0] = (byte) (bArr11[0] | Byte.MIN_VALUE);
                    byte b5 = 1;
                    bArr11[19] = (byte) (bArr11[19] | 1);
                    BigInteger bigInteger4 = new BigInteger(1, bArr11);
                    if (bigInteger4.isProbablePrime(this.onCReqSuccess)) {
                        byte[] bArr13 = new byte[i17];
                        System.arraycopy(bArr8, 0, bArr13, 0, i17);
                        int i24 = 19;
                        while (i24 >= 0) {
                            byte b6 = (byte) (bArr13[i24] + b5);
                            bArr13[i24] = b6;
                            if (b6 != 0) {
                                break;
                            }
                            i24--;
                            b5 = 1;
                        }
                        int i25 = 0;
                        while (i25 < 4096) {
                            int i26 = 1;
                            while (i26 <= i19) {
                                for (int i27 = i21; i27 >= 0; i27--) {
                                    byte b7 = (byte) (bArr13[i27] + 1);
                                    bArr13[i27] = b7;
                                    if (b7 != 0) {
                                        break;
                                    }
                                }
                                IESCipher.ECIESwithAESCBC eCIESwithAESCBC4 = this.Cardinal;
                                eCIESwithAESCBC4.init(bArr13, 0, i17);
                                eCIESwithAESCBC4.init(bArr12, i20 - (i26 * 20));
                                i26++;
                                i21 = 19;
                            }
                            int i28 = i20 - (i19 * 20);
                            for (int i29 = 19; i29 >= 0; i29--) {
                                byte b8 = (byte) (bArr13[i29] + 1);
                                bArr13[i29] = b8;
                                if (b8 != 0) {
                                    break;
                                }
                            }
                            IESCipher.ECIESwithAESCBC eCIESwithAESCBC5 = this.Cardinal;
                            eCIESwithAESCBC5.init(bArr13, 0, i17);
                            eCIESwithAESCBC5.init(bArr9, 0);
                            System.arraycopy(bArr9, 20 - i28, bArr12, 0, i28);
                            bArr12[0] = (byte) (bArr12[0] | Byte.MIN_VALUE);
                            BigInteger bigInteger5 = new BigInteger(1, bArr12);
                            BigInteger subtract2 = bigInteger5.subtract(bigInteger5.mod(bigInteger4.shiftLeft(1)).subtract(init));
                            if (subtract2.bitLength() == this.configure && subtract2.isProbablePrime(this.onCReqSuccess)) {
                                return new KeyAgreementSpi.X448withSHA256CKDF(subtract2, bigInteger4, init(subtract2, bigInteger4, this.getWarnings), new KeyFactorySpi.ED25519(bArr8, i25));
                            }
                            i25++;
                            i17 = 20;
                            i21 = 19;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("can only use SHA-1 for generating FIPS 186-2 parameters");
            }
        }
    }

    public final class ecDetDSASha3_512 implements GMCipherSpi.SM2 {
        private SecureRandom configure;

        public final void getInstance(appendElement appendelement) {
            this.configure = appendelement.configure;
        }

        public final PSSSignatureSpi.SHA256withRSA init() {
            CipherSpi cipherSpi = new CipherSpi(this.configure);
            byte[] bArr = new byte[57];
            Base64URL.configure(cipherSpi.Cardinal, bArr);
            return new PSSSignatureSpi.SHA256withRSA(new BCElGamalPublicKey(bArr, 0), cipherSpi);
        }
    }

    public final class ecNR implements GMCipherSpi.SM2 {
        private SecureRandom configure;

        public final void getInstance(appendElement appendelement) {
            this.configure = appendelement.configure;
        }

        public final PSSSignatureSpi.SHA256withRSA init() {
            KeyPairGeneratorSpi.X448 x448 = new KeyPairGeneratorSpi.X448(this.configure);
            byte[] bArr = new byte[32];
            Curve.configure(x448.getInstance, bArr);
            return new PSSSignatureSpi.SHA256withRSA(new KeyPairGeneratorSpi.X25519(bArr, 0), x448);
        }
    }

    public class ecNR224 implements GMCipherSpi.SM2, writeJSONString {
        private SecureRandom Cardinal;
        private KeyFactorySpi.EDDSA init;

        public final void getInstance(appendElement appendelement) {
            KeyPairGeneratorSpi.Ed25519 ed25519 = (KeyPairGeneratorSpi.Ed25519) appendelement;
            this.Cardinal = ed25519.configure;
            this.init = ed25519.cca_continue;
            if (this.Cardinal == null) {
                this.Cardinal = GMCipherSpi.SM2withWhirlpool.configure();
            }
        }

        public PSSSignatureSpi.SHA256withRSA init() {
            BigInteger bigInteger = this.init.getInstance;
            int bitLength = bigInteger.bitLength();
            int i = bitLength >>> 2;
            while (true) {
                BigInteger configure = setCornerRadius.configure(bitLength, this.Cardinal);
                if (configure.compareTo(CardinalEnvironment) >= 0 && configure.compareTo(bigInteger) < 0 && get.cca_continue(configure) >= i) {
                    return new PSSSignatureSpi.SHA256withRSA(new KeyPairGeneratorSpi.XDH(new JSONAware().cca_continue(this.init.init, configure), this.init), new KeyPairGeneratorSpi.EdDSA(configure, this.init));
                }
            }
        }
    }

    public final class ecNR256 extends ecNR224 {
        public final PSSSignatureSpi.SHA256withRSA init() {
            PSSSignatureSpi.SHA256withRSA init = super.init();
            KeyPairGeneratorSpi.XDH xdh = (KeyPairGeneratorSpi.XDH) init.getInstance;
            return new PSSSignatureSpi.SHA256withRSA(new KeyPairGeneratorSpi.XDH(xdh.configure.CardinalChallengeObserver(), xdh.Cardinal), (KeyPairGeneratorSpi.EdDSA) init.init);
        }
    }

    public final class ecNR512 implements GMCipherSpi.SM2 {
        public Utils Cardinal;

        public final void getInstance(appendElement appendelement) {
            this.Cardinal = (Utils) appendelement;
        }

        public final PSSSignatureSpi.SHA256withRSA init() {
            ecDetDSA256 ecdetdsa256 = ecDetDSA256.cca_continue;
            BCElGamalPrivateKey bCElGamalPrivateKey = this.Cardinal.Cardinal;
            KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF = new KeyAgreementSpi.X25519withSHA256CKDF(bCElGamalPrivateKey.init, bCElGamalPrivateKey.getInstance, (BigInteger) null, bCElGamalPrivateKey.cca_continue);
            BigInteger Cardinal2 = ecDetDSA256.Cardinal(x25519withSHA256CKDF, this.Cardinal.configure);
            return new PSSSignatureSpi.SHA256withRSA(new BCGOST3410PrivateKey(ecDetDSA256.init(x25519withSHA256CKDF, Cardinal2), bCElGamalPrivateKey), new ElGamalUtil(Cardinal2, bCElGamalPrivateKey));
        }
    }

    public final class ecPlainDSARP160 implements GMCipherSpi.SM2 {
        public CipherSpi.NoPadding getInstance;

        public final void getInstance(appendElement appendelement) {
            this.getInstance = (CipherSpi.NoPadding) appendelement;
        }

        public final PSSSignatureSpi.SHA256withRSA init() {
            CipherSpi.PKCS1v1_5Padding pKCS1v1_5Padding = this.getInstance.Cardinal;
            SecureRandom secureRandom = this.getInstance.configure;
            BigInteger bigInteger = pKCS1v1_5Padding.configure;
            BigInteger bigInteger2 = pKCS1v1_5Padding.cca_continue;
            BigInteger bigInteger3 = pKCS1v1_5Padding.Cardinal;
            while (true) {
                BigInteger configure = setCornerRadius.configure(256, secureRandom);
                if (configure.signum() > 0 && configure.compareTo(bigInteger) < 0 && get.cca_continue(configure) >= 64) {
                    return new PSSSignatureSpi.SHA256withRSA(new BCRSAPrivateKey(bigInteger3.modPow(configure, bigInteger2), pKCS1v1_5Padding), new GOSTUtil(configure, pKCS1v1_5Padding));
                }
            }
        }
    }

    private static GMCipherSpi init(KeyFactorySpi.EDDSA eddsa) {
        byte[] bArr = null;
        if (eddsa == null) {
            return null;
        }
        toJSONString tojsonstring = eddsa.cca_continue;
        JSONNavi jSONNavi = eddsa.init;
        BigInteger bigInteger = eddsa.getInstance;
        BigInteger bigInteger2 = eddsa.Cardinal;
        byte[] bArr2 = eddsa.configure;
        if (bArr2 != null) {
            bArr = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        }
        return new GMCipherSpi(tojsonstring, jSONNavi, bigInteger, bigInteger2, bArr);
    }

    public final class ecCVCDSA384 {
        private static BCECPublicKey Cardinal = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("000E0D4D696E6768756151750CC03A4473D03679");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new asInt());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("04161FF7528B899B2D0C28607CA52C5B86CF5AC8395BAFEB13C02DA292DDED7A83")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey CardinalActionCode = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("4D696E676875615175985BD3ADBADA21B43A97E2");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new parse());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey CardinalChallengeObserver = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("85E25BFE5C86226CDB12016F7553F9D0E693A268");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new registerReader());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("0403F0EBA16286A2D57EA0991168D4994637E8343E3600D51FBC6C71A0094FA2CDD545B11C5C0C797324F1")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey CardinalConfigurationParameters = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new isUnicode());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("04017232BA853A7E731AF129F22FF4149563A419C26BF50A4C9D6EEFAD612601DB537DECE819B7F70F555A67C427A8CD9BF18AEB9B56E0C11056FAE6A3")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), (byte[]) null);
            }
        };
        private static BCECPublicKey CardinalEnvironment = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("A335926AA319A27A1D00896A6773A4827ACDAC73");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new arrayStart());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("04AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB73617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey CardinalError = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("D09E8800291CB85396CC6717393284AAA0DA64BA");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new objectEndOfKey());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("0400C6858E06B70404E9CD9E3ECB662395B4429C648139053FB521F828AF606B4D3DBAA14B5E77EFE75928FE1DC127A2FFA8DE3348B3C1856A429BF97E7E31C2E5BD66011839296A789A3BC0045C8A5FB42C7D1BD998F54449579B446817AFBD17273E662C97EE72995EF42640C550B9013FAD0761353C7086A272C24088BE94769FD16650")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey CardinalRenderType = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("C49D360886E704936A6678E1139D26B7819F7E90");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new objectFirstStart());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("046B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C2964FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey CardinalUiType = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("24B7B137C8A14D696E6768756151756FD0DA2E5C");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new isValidJsonStrict());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey cca_continue = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("1053CDE42C14D696E67687561517533BF3F83345");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new object());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("044A96B5688EF573284664698968C38BB913CBFC8223A628553168947D59DCC912042351377AC5FB32")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey cleanup = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("3045AE6FC8422F64ED579528D38120EAE12196D5");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new writeJSONKV());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("04188DA80EB03090F67CBF20EB43A18800F4FF0AFD82FF101207192B95FFC8DA78631011ED6B24CDD573F977A11E794811")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey configure = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                toJSONString init = ecCVCDSA384.init((toJSONString) new getRoot(), new ECDH(new BigInteger("9ba48cba5ebcb9b6bd33b92830b2a2e0e192f10a", 16), new BigInteger("c39c6c3b3a36d7701b9c71a1f5804ae5d0003f4", 16), new BigInteger[]{new BigInteger("9162fbe73984472a0a9e", 16), new BigInteger("-96341f1138933bc2f505", 16)}, new BigInteger[]{new BigInteger("127971af8721782ecffa3", 16), new BigInteger("9162fbe73984472a0a9e", 16)}, new BigInteger("9162fbe73984472a0a9d0590", 16), new BigInteger("96341f1138933bc2f503fd44", 16), Opcodes.ARETURN));
                return new GMCipherSpi(init, new ECUtils(init, getHeadingTextFontName.init("043B4C382CE37AA192A4019E763036F4F5DD4D7EBB938CF935318FDCED6BC28286531733C3F03C4FEE")), init.onCReqSuccess(), init.onValidated(), (byte[]) null);
            }
        };
        private static BCECPublicKey getActionCode = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new parseStrict());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("0402FE13C0537BBC11ACAA07D793DE4E6D5E5C94EEE80289070FB05D38FF58321F2E800536D538CCDAA3D9")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), (byte[]) null);
            }
        };
        private static BCECPublicKey getChallengeTimeout = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("74D59FF07F6B413D0EA14B344B20A2DB049B50C3");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new JStylerObj.EscapeLT());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("0400FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey getEnvironment = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("4099B5A457F9D69F79213D094C4BCD4D4262210B");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new JWEObject());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("04015D4860D088DDB3496B0C6064756260441CDE4AF1771D4DB01FFE5B34E59703DC255A868A1180515603AEAB60794E54BB7996A70061B1CFAB6BE5F32BBFA78324ED106A7636B9C5A7BD198D0158AA4F5488D08F38514F1FDF4B4F40D2181B3681C364BA0273C706")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey getInstance = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new add());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("042AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD245A20AE19A1B8A086B4E01EDD2C7748D14C923D4D7E6D7C61B229E9C5A27ECED3D9")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), (byte[]) null);
            }
        };
        private static BCECPublicKey getProxyAddress = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new RSAEncrypter());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("04026EB7A859923FBC82189631F8103FE4AC9CA2970012D5D46024804801841CA44370958493B205E647DA304DB4CEB08CBBD1BA39494776FB988B47174DCA88C7E2945283A01C89720349DC807F4FBF374F4AEADE3BCA95314DD58CEC9F307A54FFC61EFC006D8A2C9D4979C0AC44AEA74FBEBBB9F772AEDCB620B01A7BA7AF1B320430C8591984F601CD4C143EF1C7A3")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), (byte[]) null);
            }
        };
        private static BCECPublicKey getRenderType = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("2AA058F73A0E33AB486B0F610410C53A7F132310");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new AESGCM());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("040303001D34B856296C16C0D40D3CD7750A93D1D2955FA80AA5F40FC8DB7B2ABDBDE53950F4C0D293CDD711A35B67FB1499AE60038614F1394ABFA3B4C850D927E1E7769C8EEC2D19037BF27342DA639B6DCCFFFEB73D69D78C6C27A6009CBBCA1980F8533921E8A684423E43BAB08A576291AF8F461BB2A8B3531D2F0485C19B16E2F1516E23DD3C1A4827AF1B8AC15B")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey getRequestTimeout = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("103FAEC74D696E676875615175777FC5B191EF30");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new isSpecialClose());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("0401F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E10025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey getSDKVersion = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                toJSONString init = ecCVCDSA384.init((toJSONString) new getAsNumber(), new ECDH(new BigInteger("fe0e87005b4e83761908c5131d552a850b3f58b749c37cf5b84d6768", 16), new BigInteger("60dcd2104c4cbc0be6eeefc2bdd610739ec34e317f9b33046c9e4788", 16), new BigInteger[]{new BigInteger("6b8cf07d4ca75c88957d9d670591", 16), new BigInteger("-b8adf1378a6eb73409fa6c9c637d", 16)}, new BigInteger[]{new BigInteger("1243ae1b4d71613bc9f780a03690e", 16), new BigInteger("6b8cf07d4ca75c88957d9d670591", 16)}, new BigInteger("6b8cf07d4ca75c88957d9d67059037a4", 16), new BigInteger("b8adf1378a6eb73409fa6c9c637ba7f5", 16), 240));
                return new GMCipherSpi(init, new ECUtils(init, getHeadingTextFontName.init("04A1455B334DF099DF30FC28A169A467E9E47075A90F7E650EB6B7A45C7E089FED7FBA344282CAFBD6F7E319F7C0B0BD59E2CA4BDB556D61A5")), init.onCReqSuccess(), init.onValidated(), (byte[]) null);
            }
        };
        private static BCECPublicKey getString = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("985BD3ADBAD4D696E676875615175A21B43A97E3");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new JSONValue());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("040356DCD8F2F95031AD652D23951BB366A80648F06D867940A5366D9E265DE9EB240F")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static Vector getThreeDSRequestorAppURL = new Vector();
        private static BCECPublicKey getUICustomization = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new asFloat());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), (byte[]) null);
            }
        };
        private static BCECPublicKey getUiType = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("77E2B07370EB0F832A6DD5B62DFC88CD06BB84BE");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new JWECryptoParts());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("0405F939258DB7DD90E1934F8C70B0DFEC2EED25B8557EAC9C80E2E198F8CDBECD86B1205303676854FE24141CB98FE6D4B20D02B4516FF702350EDDB0826779C813F0DF45BE8112F4")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey getWarnings = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("BD71344799D5C7FCDC45B59FA3B9AB8F6A948BC5");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new JSONStyle());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("04B70E0CBD6BB4BF7F321390B94A03C1D356C21122343280D6115C1D21BD376388B5F723FB4C22DFE6CD4375A05A07476444D5819985007E34")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey init = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("B99B99B099B323E02709A4D696E6768756151751");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new o());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("0452DCB034293A117E1F4FF11B30F7199D3144CE6DFEAFFEF2E331F296E071FA0DF9982CFEA7D43F2E")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey onCReqSuccess = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                toJSONString init = ecCVCDSA384.init((toJSONString) new protect4Web(), new ECDH(new BigInteger("7ae96a2b657c07106e64479eac3434e99cf0497512f58995c1396c28719501ee", 16), new BigInteger("5363ad4cc05c30e0a5261c028812645a122e22ea20816678df02967c1b23bd72", 16), new BigInteger[]{new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16), new BigInteger("-e4437ed6010e88286f547fa90abfe4c3", 16)}, new BigInteger[]{new BigInteger("114ca50f7a8e2f3f657c1108d9d44cfd8", 16), new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16)}, new BigInteger("3086d221a7d46bcde86c90e49284eb153dab", 16), new BigInteger("e4437ed6010e88286f547fa90abfe4c42212", 16), 272));
                return new GMCipherSpi(init, new ECUtils(init, getHeadingTextFontName.init("0479BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8")), init.onCReqSuccess(), init.onValidated(), (byte[]) null);
            }
        };
        private static BCECPublicKey onValidated = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                toJSONString init = ecCVCDSA384.init((toJSONString) new escape(), new ECDH(new BigInteger("bb85691939b869c1d087f601554b96b80cb4f55b35f433c2", 16), new BigInteger("3d84f26c12238d7b4f3d516613c1759033b1a5800175d0b1", 16), new BigInteger[]{new BigInteger("71169be7330b3038edb025f1", 16), new BigInteger("-b3fb3400dec5c4adceb8655c", 16)}, new BigInteger[]{new BigInteger("12511cfe811d0f4e6bc688b4d", 16), new BigInteger("71169be7330b3038edb025f1", 16)}, new BigInteger("71169be7330b3038edb025f1d0f9", 16), new BigInteger("b3fb3400dec5c4adceb8655d4c94", 16), JfifUtil.MARKER_RST0));
                return new GMCipherSpi(init, new ECUtils(init, getHeadingTextFontName.init("04DB4FF10EC057E9AE26B07D0280B7F4341DA5D1B1EAE06C7D9B2F2F6D9C5628A7844163D015BE86344082AA88D95E2F9D")), init.onCReqSuccess(), init.onValidated(), (byte[]) null);
            }
        };
        private static BCECPublicKey setChallengeTimeout = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new JStylerObj.StringProtector());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("0429A0B6A887A983E9730988A68727A8B2D126C44CC2CC7B2A6555193035DC76310804F12E549BDB011C103089E73510ACB275FC312A5DC6B76553F0CA")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), (byte[]) null);
            }
        };
        private static BCECPublicKey setEnvironment = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new JWSAlgorithm());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("040060F05F658F49C1AD3AB1890F7184210EFD0987E307C84C27ACCFB8F9F67CC2C460189EB5AAAA62EE222EB1B35540CFE902374601E369050B7C4E42ACBA1DACBF04299C3460782F918EA427E6325165E9EA10E3DA5F6C42E9C55215AA9CA27A5863EC48D8E0286B")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), (byte[]) null);
            }
        };
        private static BCECPublicKey setProxyAddress = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new EncryptionMethod());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("040503213F78CA44883F1A3B8162F188E553CD265F23C1567A16876913B0C2AC245849283601CCDA380F1C9E318D90F95D07E5426FE87E45C0E8184698E45962364E34116177DD2259")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), (byte[]) null);
            }
        };
        private static Hashtable setRenderType = new Hashtable();
        private static BCECPublicKey setRequestTimeout = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("10B7B4D696E676875615175137C8A16FD0DA2211");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new isSpecialChar());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("0400D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static Hashtable setThreeDSRequestorAppURL = new Hashtable();
        private static Hashtable setUICustomization = new Hashtable();
        private static Hashtable setUiType = new Hashtable();
        private static BCECPublicKey valueOf = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("10E723AB14D696E6768756151756FEBF8FCB49A9");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new getSetterName());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };
        private static BCECPublicKey values = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                byte[] init = getHeadingTextFontName.init("10C0FB15760860DEF1EEF4D696E676875615175D");
                toJSONString cca_continue = ecCVCDSA384.cca_continue(new getIsName());
                return new GMCipherSpi(cca_continue, new ECUtils(cca_continue, getHeadingTextFontName.init("0401A57A6A7B26CA5EF52FCDB816479700B3ADC94ED1FE674C06E695BABA1D")), cca_continue.onCReqSuccess(), cca_continue.onValidated(), init);
            }
        };

        static {
            configure("curve25519", GOST.Mappings.Cardinal, getInstance);
            configure("secp128r1", KeyAgreementSpi.DHwithRFC2631KDF.setRequestTimeout, Cardinal);
            configure("secp160k1", KeyAgreementSpi.DHwithRFC2631KDF.cleanup, configure);
            configure("secp160r1", KeyAgreementSpi.DHwithRFC2631KDF.getSDKVersion, cca_continue);
            configure("secp160r2", KeyAgreementSpi.DHwithRFC2631KDF.getRequestTimeout, init);
            configure("secp192k1", KeyAgreementSpi.DHwithRFC2631KDF.CardinalConfigurationParameters, onValidated);
            configure("secp192r1", KeyAgreementSpi.DHwithRFC2631KDF.setUICustomization, cleanup);
            configure("secp224k1", KeyAgreementSpi.DHwithRFC2631KDF.setChallengeTimeout, getSDKVersion);
            configure("secp224r1", KeyAgreementSpi.DHwithRFC2631KDF.getProxyAddress, getWarnings);
            configure("secp256k1", KeyAgreementSpi.DHwithRFC2631KDF.CardinalError, onCReqSuccess);
            configure("secp256r1", KeyAgreementSpi.DHwithRFC2631KDF.setRenderType, CardinalRenderType);
            configure("secp384r1", KeyAgreementSpi.DHwithRFC2631KDF.setProxyAddress, CardinalEnvironment);
            configure("secp521r1", KeyAgreementSpi.DHwithRFC2631KDF.getUiType, CardinalError);
            configure("sect113r1", KeyAgreementSpi.DHwithRFC2631KDF.cca_continue, valueOf);
            configure("sect113r2", KeyAgreementSpi.DHwithRFC2631KDF.getWarnings, values);
            configure("sect131r1", KeyAgreementSpi.DHwithRFC2631KDF.CardinalRenderType, CardinalActionCode);
            configure("sect131r2", KeyAgreementSpi.DHwithRFC2631KDF.getActionCode, getString);
            configure("sect163k1", KeyAgreementSpi.DHwithRFC2631KDF.init, getActionCode);
            configure("sect163r1", KeyAgreementSpi.DHwithRFC2631KDF.getInstance, CardinalUiType);
            configure("sect163r2", KeyAgreementSpi.DHwithRFC2631KDF.valueOf, CardinalChallengeObserver);
            configure("sect193r1", KeyAgreementSpi.DHwithRFC2631KDF.getString, getRequestTimeout);
            configure("sect193r2", KeyAgreementSpi.DHwithRFC2631KDF.CardinalUiType, setRequestTimeout);
            configure("sect233k1", KeyAgreementSpi.DHwithRFC2631KDF.CardinalChallengeObserver, CardinalConfigurationParameters);
            configure("sect233r1", KeyAgreementSpi.DHwithRFC2631KDF.CardinalActionCode, getChallengeTimeout);
            configure("sect239k1", KeyAgreementSpi.DHwithRFC2631KDF.configure, setChallengeTimeout);
            configure("sect283k1", KeyAgreementSpi.DHwithRFC2631KDF.CardinalEnvironment, setProxyAddress);
            configure("sect283r1", KeyAgreementSpi.DHwithRFC2631KDF.values, getUiType);
            configure("sect409k1", KeyAgreementSpi.DHwithRFC2631KDF.getEnvironment, setEnvironment);
            configure("sect409r1", KeyAgreementSpi.DHwithRFC2631KDF.setEnvironment, getEnvironment);
            configure("sect571k1", KeyAgreementSpi.DHwithRFC2631KDF.getRenderType, getProxyAddress);
            configure("sect571r1", KeyAgreementSpi.DHwithRFC2631KDF.setUiType, getRenderType);
            configure("sm2p256v1", AlgorithmParametersSpi.getInstance, getUICustomization);
            init("B-163", KeyAgreementSpi.DHwithRFC2631KDF.valueOf);
            init("B-233", KeyAgreementSpi.DHwithRFC2631KDF.CardinalActionCode);
            init("B-283", KeyAgreementSpi.DHwithRFC2631KDF.values);
            init("B-409", KeyAgreementSpi.DHwithRFC2631KDF.setEnvironment);
            init("B-571", KeyAgreementSpi.DHwithRFC2631KDF.setUiType);
            init("K-163", KeyAgreementSpi.DHwithRFC2631KDF.init);
            init("K-233", KeyAgreementSpi.DHwithRFC2631KDF.CardinalChallengeObserver);
            init("K-283", KeyAgreementSpi.DHwithRFC2631KDF.CardinalEnvironment);
            init("K-409", KeyAgreementSpi.DHwithRFC2631KDF.getEnvironment);
            init("K-571", KeyAgreementSpi.DHwithRFC2631KDF.getRenderType);
            init("P-192", KeyAgreementSpi.DHwithRFC2631KDF.setUICustomization);
            init("P-224", KeyAgreementSpi.DHwithRFC2631KDF.getProxyAddress);
            init("P-256", KeyAgreementSpi.DHwithRFC2631KDF.setRenderType);
            init("P-384", KeyAgreementSpi.DHwithRFC2631KDF.setProxyAddress);
            init("P-521", KeyAgreementSpi.DHwithRFC2631KDF.getUiType);
        }

        public static GMCipherSpi Cardinal(String str) {
            BCECPublicKey bCECPublicKey = (BCECPublicKey) setUICustomization.get(getTextFontSize.Cardinal(str));
            if (bCECPublicKey == null) {
                return null;
            }
            return bCECPublicKey.Cardinal();
        }

        static /* synthetic */ toJSONString cca_continue(toJSONString tojsonstring) {
            return tojsonstring;
        }

        public static GMCipherSpi configure(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            BCECPublicKey bCECPublicKey = (BCECPublicKey) setRenderType.get(aSN1ObjectIdentifier);
            if (bCECPublicKey == null) {
                return null;
            }
            return bCECPublicKey.Cardinal();
        }

        private static void configure(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, BCECPublicKey bCECPublicKey) {
            getThreeDSRequestorAppURL.addElement(str);
            setThreeDSRequestorAppURL.put(aSN1ObjectIdentifier, str);
            setRenderType.put(aSN1ObjectIdentifier, bCECPublicKey);
            String Cardinal2 = getTextFontSize.Cardinal(str);
            setUiType.put(Cardinal2, aSN1ObjectIdentifier);
            setUICustomization.put(Cardinal2, bCECPublicKey);
        }

        public static String init(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            return (String) setThreeDSRequestorAppURL.get(aSN1ObjectIdentifier);
        }

        public static Enumeration init() {
            return getThreeDSRequestorAppURL.elements();
        }

        private static void init(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            Object obj = setRenderType.get(aSN1ObjectIdentifier);
            if (obj != null) {
                String Cardinal2 = getTextFontSize.Cardinal(str);
                setUiType.put(Cardinal2, aSN1ObjectIdentifier);
                setUICustomization.put(Cardinal2, obj);
                return;
            }
            throw new IllegalStateException();
        }

        static /* synthetic */ toJSONString init(toJSONString tojsonstring, ECDH ecdh) {
            toJSONString.configure configure2 = tojsonstring.configure();
            configure2.Cardinal = new AlgorithmSupportMessage(tojsonstring, ecdh);
            return configure2.cca_continue();
        }
    }

    public final class ecDSA256 implements IESCipher.ECIESwithDESedeCBC, setBackgroundColor {
        private static final long[] Cardinal = new long[256];
        private static final long[] cca_continue = new long[256];
        private static final long[] cleanup = new long[256];
        private static final long[] configure = new long[256];
        private static final long[] getInstance = new long[256];
        private static final long[] getSDKVersion = new long[256];
        private static final short[] getString;
        private static final int[] init = {24, 35, Opcodes.IFNULL, 232, Opcodes.I2D, Opcodes.INVOKESTATIC, 1, 79, 54, Opcodes.IF_ACMPNE, 210, 245, 121, 111, Opcodes.I2B, 82, 96, Opcodes.NEWARRAY, Opcodes.IFLT, Opcodes.D2I, Opcodes.IF_ICMPGT, 12, 123, 53, 29, 224, JfifUtil.MARKER_RST7, Opcodes.MONITORENTER, 46, 75, 254, 87, 21, 119, 55, 229, Opcodes.IF_ICMPEQ, 240, 74, JfifUtil.MARKER_SOS, 88, HttpStatus.SC_CREATED, 41, 10, Opcodes.RETURN, Opcodes.IF_ICMPNE, 107, Opcodes.I2L, Opcodes.ANEWARRAY, 93, 16, 244, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 62, 5, 103, 228, 39, 65, Opcodes.F2I, Opcodes.GOTO, 125, Opcodes.FCMPL, JfifUtil.MARKER_SOI, 251, 238, 124, 102, 221, 23, 71, Opcodes.IFLE, HttpStatus.SC_ACCEPTED, 45, Opcodes.ATHROW, 7, Opcodes.LRETURN, 90, Opcodes.LXOR, 51, 99, 2, Opcodes.TABLESWITCH, 113, 200, 25, 73, JfifUtil.MARKER_EOI, 242, 227, 91, Opcodes.L2I, Opcodes.IFNE, 38, 50, Opcodes.ARETURN, 233, 15, 213, 128, 190, HttpStatus.SC_RESET_CONTENT, 52, 72, 255, 122, Opcodes.D2F, 95, 32, 104, 26, Opcodes.FRETURN, 180, 84, Opcodes.I2S, 34, 100, 241, 115, 18, 64, 8, Opcodes.MONITOREXIT, 236, 219, Opcodes.IF_ICMPLT, Opcodes.F2D, 61, Opcodes.DCMPL, 0, HttpStatus.SC_MULTI_STATUS, 43, 118, Opcodes.IXOR, 214, 27, Opcodes.PUTFIELD, Opcodes.DRETURN, 106, 80, 69, 243, 48, 239, 63, 85, Opcodes.IF_ICMPGE, 234, 101, Opcodes.INVOKEDYNAMIC, 47, 192, 222, 28, 253, 77, Opcodes.I2C, 117, 6, Opcodes.L2D, Opcodes.GETSTATIC, 230, 14, 31, 98, 212, Opcodes.JSR, Opcodes.FCMPG, 249, Opcodes.MULTIANEWARRAY, 37, 89, Opcodes.IINC, 114, 57, 76, 94, 120, 56, Opcodes.F2L, 209, Opcodes.IF_ACMPEQ, 226, 97, Opcodes.PUTSTATIC, 33, Opcodes.IFGE, 30, 67, Opcodes.IFNONNULL, 252, 4, 81, Opcodes.IFEQ, 109, 13, 250, 223, 126, 36, 59, Opcodes.LOOKUPSWITCH, HttpStatus.SC_PARTIAL_CONTENT, 17, Opcodes.D2L, 78, Opcodes.INVOKESPECIAL, 235, 60, Opcodes.LOR, Opcodes.LCMP, 247, Opcodes.INVOKEINTERFACE, 19, 44, 211, 231, 110, 196, 3, 86, 68, 127, Opcodes.RET, 42, Opcodes.NEW, Opcodes.INSTANCEOF, 83, 220, 11, Opcodes.IFGT, 108, 49, 116, 246, 70, Opcodes.IRETURN, Opcodes.L2F, 20, JfifUtil.MARKER_APP1, 22, 58, 105, 9, 112, Opcodes.INVOKEVIRTUAL, JfifUtil.MARKER_RST0, 237, 204, 66, Opcodes.DCMPG, Opcodes.IF_ICMPLE, 40, 92, 248, Opcodes.I2F};
        private static final long[] onCReqSuccess = new long[256];
        private static final long[] onValidated = new long[256];
        private long[] CardinalActionCode = new long[8];
        private byte[] CardinalEnvironment = new byte[64];
        private int CardinalError = 0;
        private short[] CardinalRenderType = new short[32];
        private long[] CardinalUiType = new long[8];
        private long[] getActionCode = new long[8];
        private final long[] getWarnings = new long[11];
        private long[] valueOf = new long[8];
        private long[] values = new long[8];

        static {
            short[] sArr = new short[32];
            getString = sArr;
            sArr[31] = 8;
        }

        private ecDSA256(ecDSA256 ecdsa256) {
            cca_continue((setBackgroundColor) ecdsa256);
        }

        private void cleanup() {
            long[] jArr;
            for (int i = 0; i < 8; i++) {
                long[] jArr2 = this.CardinalActionCode;
                long j = this.CardinalUiType[i];
                long[] jArr3 = this.valueOf;
                long j2 = this.values[i];
                jArr3[i] = j2;
                jArr2[i] = j ^ j2;
            }
            int i2 = 1;
            while (i2 <= 10) {
                int i3 = 0;
                while (i3 < 8) {
                    long[] jArr4 = this.getActionCode;
                    jArr4[i3] = 0;
                    long[] jArr5 = Cardinal;
                    long[] jArr6 = this.valueOf;
                    long j3 = jArr5[((int) (jArr6[i3 & 7] >>> 56)) & 255] ^ 0;
                    jArr4[i3] = j3;
                    long j4 = j3 ^ configure[((int) (jArr6[(i3 - 1) & 7] >>> 48)) & 255];
                    jArr4[i3] = j4;
                    long j5 = j4 ^ cca_continue[((int) (jArr6[(i3 - 2) & 7] >>> 40)) & 255];
                    jArr4[i3] = j5;
                    long j6 = j5 ^ getInstance[((int) (jArr6[(i3 - 3) & 7] >>> 32)) & 255];
                    jArr4[i3] = j6;
                    long j7 = j6 ^ cleanup[((int) (jArr6[(i3 - 4) & 7] >>> 24)) & 255];
                    jArr4[i3] = j7;
                    long j8 = j7 ^ onValidated[((int) (jArr6[(i3 - 5) & 7] >>> 16)) & 255];
                    jArr4[i3] = j8;
                    long j9 = j8 ^ onCReqSuccess[((int) (jArr6[(i3 - 6) & 7] >>> 8)) & 255];
                    jArr4[i3] = j9;
                    jArr4[i3] = j9 ^ getSDKVersion[((int) jArr6[(i3 - 7) & 7]) & 255];
                    i3++;
                    i2 = i2;
                }
                int i4 = i2;
                long[] jArr7 = this.getActionCode;
                long[] jArr8 = this.valueOf;
                System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
                long[] jArr9 = this.valueOf;
                jArr9[0] = jArr9[0] ^ this.getWarnings[i4];
                int i5 = 0;
                while (true) {
                    jArr = this.getActionCode;
                    if (i5 >= 8) {
                        break;
                    }
                    long j10 = this.valueOf[i5];
                    jArr[i5] = j10;
                    long[] jArr10 = Cardinal;
                    long[] jArr11 = this.CardinalActionCode;
                    long j11 = j10 ^ jArr10[((int) (jArr11[i5 & 7] >>> 56)) & 255];
                    jArr[i5] = j11;
                    long j12 = j11 ^ configure[((int) (jArr11[(i5 - 1) & 7] >>> 48)) & 255];
                    jArr[i5] = j12;
                    long j13 = j12 ^ cca_continue[((int) (jArr11[(i5 - 2) & 7] >>> 40)) & 255];
                    jArr[i5] = j13;
                    long j14 = j13 ^ getInstance[((int) (jArr11[(i5 - 3) & 7] >>> 32)) & 255];
                    jArr[i5] = j14;
                    long j15 = j14 ^ cleanup[((int) (jArr11[(i5 - 4) & 7] >>> 24)) & 255];
                    jArr[i5] = j15;
                    long j16 = j15 ^ onValidated[((int) (jArr11[(i5 - 5) & 7] >>> 16)) & 255];
                    jArr[i5] = j16;
                    long j17 = j16 ^ onCReqSuccess[((int) (jArr11[(i5 - 6) & 7] >>> 8)) & 255];
                    jArr[i5] = j17;
                    jArr[i5] = j17 ^ getSDKVersion[((int) jArr11[(i5 - 7) & 7]) & 255];
                    i5++;
                }
                long[] jArr12 = this.CardinalActionCode;
                System.arraycopy(jArr, 0, jArr12, 0, jArr12.length);
                i2 = i4 + 1;
            }
            for (int i6 = 0; i6 < 8; i6++) {
                long[] jArr13 = this.values;
                jArr13[i6] = jArr13[i6] ^ (this.CardinalActionCode[i6] ^ this.CardinalUiType[i6]);
            }
        }

        private static long configure(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            return (((((((((long) i2) << 48) ^ (((long) i) << 56)) ^ (((long) i3) << 40)) ^ (((long) i4) << 32)) ^ (((long) i5) << 24)) ^ (((long) i6) << 16)) ^ (((long) i7) << 8)) ^ ((long) i8);
        }

        private static long configure(byte[] bArr, int i) {
            return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        }

        private void getSDKVersion() {
            int i = 0;
            for (int length = this.CardinalRenderType.length - 1; length >= 0; length--) {
                short[] sArr = this.CardinalRenderType;
                int i2 = (sArr[length] & 255) + getString[length] + i;
                i = i2 >>> 8;
                sArr[length] = (short) (i2 & 255);
            }
        }

        public final setBackgroundColor Cardinal() {
            return new ecDSA256(this);
        }

        public final int cca_continue() {
            return 64;
        }

        public final void cca_continue(byte b) {
            byte[] bArr = this.CardinalEnvironment;
            int i = this.CardinalError;
            bArr[i] = b;
            int i2 = i + 1;
            this.CardinalError = i2;
            if (i2 == bArr.length) {
                getWarnings();
            }
            getSDKVersion();
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            ecDSA256 ecdsa256 = (ecDSA256) setbackgroundcolor;
            long[] jArr = ecdsa256.getWarnings;
            long[] jArr2 = this.getWarnings;
            System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
            byte[] bArr = ecdsa256.CardinalEnvironment;
            byte[] bArr2 = this.CardinalEnvironment;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            this.CardinalError = ecdsa256.CardinalError;
            short[] sArr = ecdsa256.CardinalRenderType;
            short[] sArr2 = this.CardinalRenderType;
            System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
            long[] jArr3 = ecdsa256.values;
            long[] jArr4 = this.values;
            System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
            long[] jArr5 = ecdsa256.valueOf;
            long[] jArr6 = this.valueOf;
            System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
            long[] jArr7 = ecdsa256.getActionCode;
            long[] jArr8 = this.getActionCode;
            System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
            long[] jArr9 = ecdsa256.CardinalUiType;
            long[] jArr10 = this.CardinalUiType;
            System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
            long[] jArr11 = ecdsa256.CardinalActionCode;
            long[] jArr12 = this.CardinalActionCode;
            System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
        }

        public final String configure() {
            return "Whirlpool";
        }

        public final int getInstance() {
            return 64;
        }

        public final void init(byte[] bArr, int i, int i2) {
            while (i2 > 0) {
                cca_continue(bArr[i]);
                i++;
                i2--;
            }
        }

        public ecDSA256() {
            for (int i = 0; i < 256; i++) {
                int i2 = init[i];
                int i3 = i2 << 1;
                int i4 = ((long) i3) >= 256 ? i3 ^ 285 : i3;
                int i5 = i4 << 1;
                int i6 = ((long) i5) >= 256 ? i5 ^ 285 : i5;
                int i7 = i6 ^ i2;
                int i8 = i6 << 1;
                if (((long) i8) >= 256) {
                    i8 ^= 285;
                }
                int i9 = i8;
                int i10 = i9 ^ i2;
                Cardinal[i] = configure(i2, i2, i6, i2, i9, i7, i4, i10);
                int i11 = i2;
                configure[i] = configure(i10, i2, i11, i6, i2, i9, i7, i4);
                int i12 = i2;
                cca_continue[i] = configure(i4, i10, i11, i12, i6, i2, i9, i7);
                int i13 = i2;
                getInstance[i] = configure(i7, i4, i10, i12, i13, i6, i2, i9);
                int i14 = i2;
                cleanup[i] = configure(i9, i7, i4, i10, i13, i14, i6, i2);
                int i15 = i2;
                onValidated[i] = configure(i2, i9, i7, i4, i10, i14, i15, i6);
                int i16 = i2;
                onCReqSuccess[i] = configure(i6, i2, i9, i7, i4, i10, i15, i16);
                getSDKVersion[i] = configure(i2, i6, i2, i9, i7, i4, i10, i16);
            }
            this.getWarnings[0] = 0;
            for (int i17 = 1; i17 <= 10; i17++) {
                int i18 = (i17 - 1) * 8;
                this.getWarnings[i17] = (((((((Cardinal[i18] & -72057594037927936L) ^ (configure[i18 + 1] & 71776119061217280L)) ^ (cca_continue[i18 + 2] & 280375465082880L)) ^ (getInstance[i18 + 3] & 1095216660480L)) ^ (cleanup[i18 + 4] & 4278190080L)) ^ (onValidated[i18 + 5] & 16711680)) ^ (onCReqSuccess[i18 + 6] & 65280)) ^ (getSDKVersion[i18 + 7] & 255);
            }
        }

        public final int init(byte[] bArr, int i) {
            byte[] bArr2 = new byte[32];
            for (int i2 = 0; i2 < 32; i2++) {
                bArr2[i2] = (byte) this.CardinalRenderType[i2];
            }
            byte[] bArr3 = this.CardinalEnvironment;
            int i3 = this.CardinalError;
            int i4 = i3 + 1;
            this.CardinalError = i4;
            bArr3[i3] = (byte) (bArr3[i3] | 128);
            if (i4 == bArr3.length) {
                getWarnings();
            }
            if (this.CardinalError > 32) {
                while (this.CardinalError != 0) {
                    cca_continue((byte) 0);
                }
            }
            while (this.CardinalError <= 32) {
                cca_continue((byte) 0);
            }
            System.arraycopy(bArr2, 0, this.CardinalEnvironment, 32, 32);
            getWarnings();
            for (int i5 = 0; i5 < 8; i5++) {
                long j = this.values[i5];
                int i6 = (i5 << 3) + i;
                for (int i7 = 0; i7 < 8; i7++) {
                    bArr[i6 + i7] = (byte) ((int) ((j >> (56 - (i7 << 3))) & 255));
                }
            }
            init();
            return 64;
        }

        public final void init() {
            this.CardinalError = 0;
            short[] sArr = this.CardinalRenderType;
            for (int i = 0; i < sArr.length; i++) {
                sArr[i] = 0;
            }
            byte[] bArr = this.CardinalEnvironment;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr[i2] = 0;
            }
            long[] jArr = this.values;
            for (int i3 = 0; i3 < jArr.length; i3++) {
                jArr[i3] = 0;
            }
            long[] jArr2 = this.valueOf;
            for (int i4 = 0; i4 < jArr2.length; i4++) {
                jArr2[i4] = 0;
            }
            long[] jArr3 = this.getActionCode;
            for (int i5 = 0; i5 < jArr3.length; i5++) {
                jArr3[i5] = 0;
            }
            long[] jArr4 = this.CardinalUiType;
            for (int i6 = 0; i6 < jArr4.length; i6++) {
                jArr4[i6] = 0;
            }
            long[] jArr5 = this.CardinalActionCode;
            for (int i7 = 0; i7 < jArr5.length; i7++) {
                jArr5[i7] = 0;
            }
        }

        private void getWarnings() {
            for (int i = 0; i < this.CardinalActionCode.length; i++) {
                this.CardinalUiType[i] = configure(this.CardinalEnvironment, i << 3);
            }
            cleanup();
            this.CardinalError = 0;
            byte[] bArr = this.CardinalEnvironment;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr[i2] = 0;
            }
        }
    }

    public SignatureSpi(String str) {
        this.cca_continue = str;
        this.Cardinal = 0;
    }

    public final String Cardinal() {
        int i = this.Cardinal;
        if (i == -1) {
            return null;
        }
        int indexOf = this.cca_continue.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.cca_continue.substring(this.Cardinal);
            this.Cardinal = -1;
            return substring;
        }
        String substring2 = this.cca_continue.substring(this.Cardinal, indexOf);
        this.Cardinal = indexOf + 1;
        return substring2;
    }
}
