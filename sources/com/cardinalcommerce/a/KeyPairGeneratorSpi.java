package com.cardinalcommerce.a;

import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.google.common.base.Ascii;
import java.math.BigInteger;
import java.security.SecureRandom;

public final class KeyPairGeneratorSpi extends setRenderType {
    private isEnableLogging init;

    public class Ed448 extends setCCAImageUri {
        public KeyFactorySpi.EDDSA Cardinal;

        protected Ed448(boolean z, KeyFactorySpi.EDDSA eddsa) {
            super(z);
            this.Cardinal = eddsa;
        }
    }

    public final class EdDSA extends Ed448 {
        public BigInteger init;

        public EdDSA(BigInteger bigInteger, KeyFactorySpi.EDDSA eddsa) {
            super(true, eddsa);
            this.init = bigInteger;
        }
    }

    public KeyPairGeneratorSpi(isEnableLogging isenablelogging) {
        this.init = isenablelogging;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        return this.init;
    }

    public final class ECDHC extends KeyAgreementSpi.MQVwithSHA512KDFAndSharedInfo {
        private static int[] CardinalError = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
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

        public ECDHC() {
            init();
        }

        private ECDHC(ECDHC ecdhc) {
            super(ecdhc);
            cca_continue(ecdhc);
        }

        private void cca_continue(ECDHC ecdhc) {
            super.init(ecdhc);
            this.configure = ecdhc.configure;
            this.Cardinal = ecdhc.Cardinal;
            this.getInstance = ecdhc.getInstance;
            this.init = ecdhc.init;
            this.cca_continue = ecdhc.cca_continue;
            this.getWarnings = ecdhc.getWarnings;
            this.getSDKVersion = ecdhc.getSDKVersion;
            this.onCReqSuccess = ecdhc.onCReqSuccess;
            int[] iArr = ecdhc.cleanup;
            System.arraycopy(iArr, 0, this.cleanup, 0, iArr.length);
            this.onValidated = ecdhc.onValidated;
        }

        public final setBackgroundColor Cardinal() {
            return new ECDHC(this);
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            cca_continue((ECDHC) setbackgroundcolor);
        }

        public final String configure() {
            return "SHA-224";
        }

        /* access modifiers changed from: protected */
        public final void configure(long j) {
            if (this.onValidated > 14) {
                cleanup();
            }
            int[] iArr = this.cleanup;
            iArr[14] = (int) (j >>> 32);
            iArr[15] = (int) j;
        }

        public final int getInstance() {
            return 28;
        }

        /* access modifiers changed from: protected */
        public final void getInstance(byte[] bArr, int i) {
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << Ascii.CAN) | ((bArr[i2] & 255) << Ascii.DLE) | ((bArr[i3] & 255) << 8);
            int[] iArr = this.cleanup;
            int i5 = this.onValidated;
            iArr[i5] = i4;
            int i6 = i5 + 1;
            this.onValidated = i6;
            if (i6 == 16) {
                cleanup();
            }
        }

        public final int init(byte[] bArr, int i) {
            getSDKVersion();
            setTextFontSize.init(this.configure, bArr, i);
            setTextFontSize.init(this.Cardinal, bArr, i + 4);
            setTextFontSize.init(this.getInstance, bArr, i + 8);
            setTextFontSize.init(this.init, bArr, i + 12);
            setTextFontSize.init(this.cca_continue, bArr, i + 16);
            setTextFontSize.init(this.getWarnings, bArr, i + 20);
            setTextFontSize.init(this.getSDKVersion, bArr, i + 24);
            init();
            return 28;
        }

        public final void init() {
            super.init();
            this.configure = -1056596264;
            this.Cardinal = 914150663;
            this.getInstance = 812702999;
            this.init = -150054599;
            this.cca_continue = -4191439;
            this.getWarnings = 1750603025;
            this.getSDKVersion = 1694076839;
            this.onCReqSuccess = -1090891868;
            this.onValidated = 0;
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
            ECDHC ecdhc = this;
            for (int i = 16; i <= 63; i++) {
                int[] iArr = ecdhc.cleanup;
                int i2 = iArr[i - 2];
                int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
                int i4 = iArr[i - 15];
                iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
            }
            int i5 = ecdhc.configure;
            int i6 = ecdhc.Cardinal;
            int i7 = ecdhc.getInstance;
            int i8 = ecdhc.init;
            int i9 = ecdhc.cca_continue;
            int i10 = ecdhc.getWarnings;
            int i11 = ecdhc.getSDKVersion;
            int i12 = ecdhc.onCReqSuccess;
            int i13 = 0;
            int i14 = 0;
            while (i13 < 8) {
                int i15 = ((((i9 >>> 6) | (i9 << 26)) ^ ((i9 >>> 11) | (i9 << 21))) ^ ((i9 >>> 25) | (i9 << 7))) + ((i9 & i10) ^ ((~i9) & i11));
                int[] iArr2 = CardinalError;
                int i16 = i15 + iArr2[i14];
                int[] iArr3 = ecdhc.cleanup;
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
                ecdhc = this;
            }
            ecdhc.configure += i5;
            ecdhc.Cardinal += i6;
            ecdhc.getInstance += i7;
            ecdhc.init += i8;
            ecdhc.cca_continue += i9;
            ecdhc.getWarnings += i10;
            ecdhc.getSDKVersion += i11;
            ecdhc.onCReqSuccess += i12;
            ecdhc.onValidated = 0;
            for (int i47 = 0; i47 < 16; i47++) {
                ecdhc.cleanup[i47] = 0;
            }
        }
    }

    public final class ECDSA extends KeyAgreementSpi.MQVwithSHA256KDFAndSharedInfo {
        public ECDSA() {
            this(256);
        }

        public final String configure() {
            return new StringBuilder("SHA3-").append(this.init).toString();
        }

        public final int init(byte[] bArr, int i) {
            getInstance(2, 2);
            return super.init(bArr, i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ECDSA(int i) {
            super(i);
            if (i == 224 || i == 256 || i == 384 || i == 512) {
                return;
            }
            throw new IllegalArgumentException(new StringBuilder("'bitLength' ").append(i).append(" not supported for SHA-3").toString());
        }
    }

    public final class ECMQV extends KeyFactorySpi.EC {
        public ECMQV() {
        }

        private ECMQV(ECMQV ecmqv) {
            super(ecmqv);
        }

        public final setBackgroundColor Cardinal() {
            return new ECMQV(this);
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            init((ECMQV) setbackgroundcolor);
        }

        public final String configure() {
            return "SHA-512";
        }

        public final int getInstance() {
            return 64;
        }

        public final void init() {
            super.init();
            this.cca_continue = 7640891576956012808L;
            this.init = -4942790177534073029L;
            this.Cardinal = 4354685564936845355L;
            this.configure = -6534734903238641935L;
            this.getInstance = 5840696475078001361L;
            this.getSDKVersion = -7276294671716946913L;
            this.getWarnings = 2270897969802886507L;
            this.cleanup = 6620516959819538809L;
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
            long j7 = this.getWarnings;
            int i7 = i + 48;
            setTextFontSize.init((int) (j7 >>> 32), bArr, i7);
            setTextFontSize.init((int) j7, bArr, i7 + 4);
            long j8 = this.cleanup;
            int i8 = i + 56;
            setTextFontSize.init((int) (j8 >>> 32), bArr, i8);
            setTextFontSize.init((int) j8, bArr, i8 + 4);
            init();
            return 64;
        }
    }

    public final class Ed25519 extends appendElement {
        public KeyFactorySpi.EDDSA cca_continue;

        public Ed25519(KeyFactorySpi.EDDSA eddsa, SecureRandom secureRandom) {
            super(secureRandom, eddsa.getInstance.bitLength());
            this.cca_continue = eddsa;
        }
    }

    public final class X25519 extends setCCAImageUri {
        public final byte[] getInstance;

        public X25519(byte[] bArr, int i) {
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

    public final class X448 extends setCCAImageUri {
        public final byte[] getInstance;

        public X448(SecureRandom secureRandom) {
            super(true);
            byte[] bArr = new byte[32];
            this.getInstance = bArr;
            Curve.Cardinal(secureRandom, bArr);
        }

        public X448(byte[] bArr) {
            super(true);
            byte[] bArr2 = new byte[32];
            this.getInstance = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, 32);
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

    public final class XDH extends Ed448 {
        public final JSONNavi configure;

        public XDH(JSONNavi jSONNavi, KeyFactorySpi.EDDSA eddsa) {
            super(false, eddsa);
            this.configure = KeyFactorySpi.EDDSA.getInstance(eddsa.cca_continue, jSONNavi);
        }
    }

    public final String toString() {
        DSASigner.detDSASha3_512 detdsasha3_512;
        StringBuffer stringBuffer = new StringBuffer("CRLDistPoint:");
        String instance = getTextFontSize.getInstance();
        stringBuffer.append(instance);
        int cca_continue = this.init.cca_continue();
        DSASigner.detDSASha3_512[] detdsasha3_512Arr = new DSASigner.detDSASha3_512[cca_continue];
        for (int i = 0; i != this.init.cca_continue(); i++) {
            CardinalConfigurationParameters init2 = this.init.init(i);
            if (init2 == null || (init2 instanceof DSASigner.detDSASha3_512)) {
                detdsasha3_512 = (DSASigner.detDSASha3_512) init2;
            } else if (init2 instanceof isEnableLogging) {
                detdsasha3_512 = new DSASigner.detDSASha3_512((isEnableLogging) init2);
            } else {
                throw new IllegalArgumentException(new StringBuilder("Invalid DistributionPoint: ").append(init2.getClass().getName()).toString());
            }
            detdsasha3_512Arr[i] = detdsasha3_512;
        }
        for (int i2 = 0; i2 != cca_continue; i2++) {
            stringBuffer.append("    ");
            stringBuffer.append(detdsasha3_512Arr[i2]);
            stringBuffer.append(instance);
        }
        return stringBuffer.toString();
    }

    public final class EC extends KeyAgreementSpi.MQVwithSHA512KDFAndSharedInfo {
        private int Cardinal;
        private int cca_continue;
        private int[] cleanup = new int[16];
        private int configure;
        private int getInstance;
        private int getSDKVersion;
        private int getWarnings;
        private int init;
        private int onCReqSuccess;
        private int onValidated;

        public EC() {
            init();
        }

        private EC(EC ec) {
            super(ec);
            init(ec);
        }

        private static int Cardinal(int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i + (((~i2) & i4) | (i3 & i2)) + i5 + 1518500249;
            return (i7 >>> (32 - i6)) | (i7 << i6);
        }

        private static int cca_continue(int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i + (((~i2) & i4) | (i3 & i2)) + i5 + 1836072691;
            return (i7 >>> (32 - i6)) | (i7 << i6);
        }

        private static int configure(int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i + ((i2 | (~i3)) ^ i4) + i5 + 1548603684;
            return (i7 >>> (32 - i6)) | (i7 << i6);
        }

        private static int getInstance(int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i + ((i2 | (~i3)) ^ i4) + i5 + 1859775393;
            return (i7 >>> (32 - i6)) | (i7 << i6);
        }

        private static void getInstance(int i, byte[] bArr, int i2) {
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >>> 8);
            bArr[i2 + 2] = (byte) (i >>> 16);
            bArr[i2 + 3] = (byte) (i >>> 24);
        }

        private static int getSDKVersion(int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i + ((i2 & i4) | (i3 & (~i4))) + i5 + 1352829926;
            return (i7 >>> (32 - i6)) | (i7 << i6);
        }

        private static int init(int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ((i + ((i2 & i4) | (i3 & (~i4)))) + i5) - 1894007588;
            return (i7 >>> (32 - i6)) | (i7 << i6);
        }

        private void init(EC ec) {
            super.init(ec);
            this.configure = ec.configure;
            this.init = ec.init;
            this.cca_continue = ec.cca_continue;
            this.Cardinal = ec.Cardinal;
            this.getInstance = ec.getInstance;
            this.getSDKVersion = ec.getSDKVersion;
            this.getWarnings = ec.getWarnings;
            this.onCReqSuccess = ec.onCReqSuccess;
            int[] iArr = ec.cleanup;
            System.arraycopy(iArr, 0, this.cleanup, 0, iArr.length);
            this.onValidated = ec.onValidated;
        }

        public final setBackgroundColor Cardinal() {
            return new EC(this);
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            init((EC) setbackgroundcolor);
        }

        public final String configure() {
            return "RIPEMD256";
        }

        /* access modifiers changed from: protected */
        public final void configure(long j) {
            if (this.onValidated > 14) {
                cleanup();
            }
            int[] iArr = this.cleanup;
            iArr[14] = (int) j;
            iArr[15] = (int) (j >>> 32);
        }

        public final int getInstance() {
            return 32;
        }

        /* access modifiers changed from: protected */
        public final void getInstance(byte[] bArr, int i) {
            int[] iArr = this.cleanup;
            int i2 = this.onValidated;
            int i3 = i2 + 1;
            this.onValidated = i3;
            iArr[i2] = ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
            if (i3 == 16) {
                cleanup();
            }
        }

        public final int init(byte[] bArr, int i) {
            getSDKVersion();
            getInstance(this.configure, bArr, i);
            getInstance(this.init, bArr, i + 4);
            getInstance(this.cca_continue, bArr, i + 8);
            getInstance(this.Cardinal, bArr, i + 12);
            getInstance(this.getInstance, bArr, i + 16);
            getInstance(this.getSDKVersion, bArr, i + 20);
            getInstance(this.getWarnings, bArr, i + 24);
            getInstance(this.onCReqSuccess, bArr, i + 28);
            init();
            return 32;
        }

        public final void init() {
            super.init();
            this.configure = 1732584193;
            this.init = -271733879;
            this.cca_continue = -1732584194;
            this.Cardinal = 271733878;
            this.getInstance = 1985229328;
            this.getSDKVersion = -19088744;
            this.getWarnings = -1985229329;
            this.onCReqSuccess = 19088743;
            this.onValidated = 0;
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
            int i = this.configure;
            int i2 = this.init;
            int i3 = this.cca_continue;
            int i4 = this.Cardinal;
            int i5 = this.getInstance;
            int i6 = this.getSDKVersion;
            int i7 = this.getWarnings;
            int i8 = this.onCReqSuccess;
            int[] iArr = this.cleanup;
            int i9 = i + ((i2 ^ i3) ^ i4) + iArr[0];
            int i10 = (i9 >>> 21) | (i9 << 11);
            int i11 = i4 + ((i10 ^ i2) ^ i3) + iArr[1];
            int i12 = (i11 >>> 18) | (i11 << 14);
            int i13 = i3 + ((i12 ^ i10) ^ i2) + iArr[2];
            int i14 = (i13 >>> 17) | (i13 << 15);
            int i15 = i2 + ((i14 ^ i12) ^ i10) + iArr[3];
            int i16 = (i15 >>> 20) | (i15 << 12);
            int i17 = i10 + ((i16 ^ i14) ^ i12) + iArr[4];
            int i18 = (i17 >>> 27) | (i17 << 5);
            int i19 = iArr[5];
            int i20 = i12 + ((i18 ^ i16) ^ i14) + i19;
            int i21 = (i20 >>> 24) | (i20 << 8);
            int i22 = i14 + ((i21 ^ i18) ^ i16) + iArr[6];
            int i23 = (i22 >>> 25) | (i22 << 7);
            int i24 = i16 + ((i23 ^ i21) ^ i18) + iArr[7];
            int i25 = (i24 >>> 23) | (i24 << 9);
            int i26 = i18 + ((i25 ^ i23) ^ i21) + iArr[8];
            int i27 = (i26 >>> 21) | (i26 << 11);
            int i28 = i21 + ((i27 ^ i25) ^ i23) + iArr[9];
            int i29 = (i28 >>> 19) | (i28 << 13);
            int i30 = i23 + ((i29 ^ i27) ^ i25) + iArr[10];
            int i31 = (i30 >>> 18) | (i30 << 14);
            int i32 = i25 + ((i31 ^ i29) ^ i27) + iArr[11];
            int i33 = (i32 >>> 17) | (i32 << 15);
            int i34 = i27 + ((i33 ^ i31) ^ i29) + iArr[12];
            int i35 = (i34 << 6) | (i34 >>> 26);
            int i36 = i29 + ((i35 ^ i33) ^ i31) + iArr[13];
            int i37 = (i36 >>> 25) | (i36 << 7);
            int i38 = i31 + ((i37 ^ i35) ^ i33) + iArr[14];
            int i39 = (i38 >>> 23) | (i38 << 9);
            int i40 = i33 + ((i39 ^ i37) ^ i35) + iArr[15];
            int i41 = (i40 >>> 24) | (i40 << 8);
            int sDKVersion = getSDKVersion(i5, i6, i7, i8, i19, 8);
            int sDKVersion2 = getSDKVersion(i8, sDKVersion, i6, i7, this.cleanup[14], 9);
            int sDKVersion3 = getSDKVersion(i7, sDKVersion2, sDKVersion, i6, this.cleanup[7], 9);
            int sDKVersion4 = getSDKVersion(i6, sDKVersion3, sDKVersion2, sDKVersion, this.cleanup[0], 11);
            int sDKVersion5 = getSDKVersion(sDKVersion, sDKVersion4, sDKVersion3, sDKVersion2, this.cleanup[9], 13);
            int sDKVersion6 = getSDKVersion(sDKVersion2, sDKVersion5, sDKVersion4, sDKVersion3, this.cleanup[2], 15);
            int sDKVersion7 = getSDKVersion(sDKVersion3, sDKVersion6, sDKVersion5, sDKVersion4, this.cleanup[11], 15);
            int sDKVersion8 = getSDKVersion(sDKVersion4, sDKVersion7, sDKVersion6, sDKVersion5, this.cleanup[4], 5);
            int sDKVersion9 = getSDKVersion(sDKVersion5, sDKVersion8, sDKVersion7, sDKVersion6, this.cleanup[13], 7);
            int sDKVersion10 = getSDKVersion(sDKVersion6, sDKVersion9, sDKVersion8, sDKVersion7, this.cleanup[6], 7);
            int sDKVersion11 = getSDKVersion(sDKVersion7, sDKVersion10, sDKVersion9, sDKVersion8, this.cleanup[15], 8);
            int sDKVersion12 = getSDKVersion(sDKVersion8, sDKVersion11, sDKVersion10, sDKVersion9, this.cleanup[8], 11);
            int sDKVersion13 = getSDKVersion(sDKVersion9, sDKVersion12, sDKVersion11, sDKVersion10, this.cleanup[1], 14);
            int sDKVersion14 = getSDKVersion(sDKVersion10, sDKVersion13, sDKVersion12, sDKVersion11, this.cleanup[10], 14);
            int sDKVersion15 = getSDKVersion(sDKVersion11, sDKVersion14, sDKVersion13, sDKVersion12, this.cleanup[3], 12);
            int sDKVersion16 = getSDKVersion(sDKVersion12, sDKVersion15, sDKVersion14, sDKVersion13, this.cleanup[12], 6);
            int Cardinal2 = Cardinal(sDKVersion13, i41, i39, i37, this.cleanup[7], 7);
            int Cardinal3 = Cardinal(i37, Cardinal2, i41, i39, this.cleanup[4], 6);
            int Cardinal4 = Cardinal(i39, Cardinal3, Cardinal2, i41, this.cleanup[13], 8);
            int Cardinal5 = Cardinal(i41, Cardinal4, Cardinal3, Cardinal2, this.cleanup[1], 13);
            int Cardinal6 = Cardinal(Cardinal2, Cardinal5, Cardinal4, Cardinal3, this.cleanup[10], 11);
            int Cardinal7 = Cardinal(Cardinal3, Cardinal6, Cardinal5, Cardinal4, this.cleanup[6], 9);
            int Cardinal8 = Cardinal(Cardinal4, Cardinal7, Cardinal6, Cardinal5, this.cleanup[15], 7);
            int Cardinal9 = Cardinal(Cardinal5, Cardinal8, Cardinal7, Cardinal6, this.cleanup[3], 15);
            int Cardinal10 = Cardinal(Cardinal6, Cardinal9, Cardinal8, Cardinal7, this.cleanup[12], 7);
            int Cardinal11 = Cardinal(Cardinal7, Cardinal10, Cardinal9, Cardinal8, this.cleanup[0], 12);
            int Cardinal12 = Cardinal(Cardinal8, Cardinal11, Cardinal10, Cardinal9, this.cleanup[9], 15);
            int Cardinal13 = Cardinal(Cardinal9, Cardinal12, Cardinal11, Cardinal10, this.cleanup[5], 9);
            int Cardinal14 = Cardinal(Cardinal10, Cardinal13, Cardinal12, Cardinal11, this.cleanup[2], 11);
            int Cardinal15 = Cardinal(Cardinal11, Cardinal14, Cardinal13, Cardinal12, this.cleanup[14], 7);
            int Cardinal16 = Cardinal(Cardinal12, Cardinal15, Cardinal14, Cardinal13, this.cleanup[11], 13);
            int Cardinal17 = Cardinal(Cardinal13, Cardinal16, Cardinal15, Cardinal14, this.cleanup[8], 12);
            int configure2 = configure(i35, sDKVersion16, sDKVersion15, sDKVersion14, this.cleanup[6], 9);
            int configure3 = configure(sDKVersion14, configure2, sDKVersion16, sDKVersion15, this.cleanup[11], 13);
            int configure4 = configure(sDKVersion15, configure3, configure2, sDKVersion16, this.cleanup[3], 15);
            int configure5 = configure(sDKVersion16, configure4, configure3, configure2, this.cleanup[7], 7);
            int configure6 = configure(configure2, configure5, configure4, configure3, this.cleanup[0], 12);
            int configure7 = configure(configure3, configure6, configure5, configure4, this.cleanup[13], 8);
            int configure8 = configure(configure4, configure7, configure6, configure5, this.cleanup[5], 9);
            int configure9 = configure(configure5, configure8, configure7, configure6, this.cleanup[10], 11);
            int configure10 = configure(configure6, configure9, configure8, configure7, this.cleanup[14], 7);
            int configure11 = configure(configure7, configure10, configure9, configure8, this.cleanup[15], 7);
            int configure12 = configure(configure8, configure11, configure10, configure9, this.cleanup[8], 12);
            int configure13 = configure(configure9, configure12, configure11, configure10, this.cleanup[12], 7);
            int configure14 = configure(configure10, configure13, configure12, configure11, this.cleanup[4], 6);
            int configure15 = configure(configure11, configure14, configure13, configure12, this.cleanup[9], 15);
            int configure16 = configure(configure12, configure15, configure14, configure13, this.cleanup[1], 13);
            int configure17 = configure(configure13, configure16, configure15, configure14, this.cleanup[2], 11);
            int instance = getInstance(Cardinal14, configure17, Cardinal16, Cardinal15, this.cleanup[3], 11);
            int instance2 = getInstance(Cardinal15, instance, configure17, Cardinal16, this.cleanup[10], 13);
            int instance3 = getInstance(Cardinal16, instance2, instance, configure17, this.cleanup[14], 6);
            int instance4 = getInstance(configure17, instance3, instance2, instance, this.cleanup[4], 7);
            int instance5 = getInstance(instance, instance4, instance3, instance2, this.cleanup[9], 14);
            int instance6 = getInstance(instance2, instance5, instance4, instance3, this.cleanup[15], 9);
            int instance7 = getInstance(instance3, instance6, instance5, instance4, this.cleanup[8], 13);
            int instance8 = getInstance(instance4, instance7, instance6, instance5, this.cleanup[1], 15);
            int instance9 = getInstance(instance5, instance8, instance7, instance6, this.cleanup[2], 14);
            int instance10 = getInstance(instance6, instance9, instance8, instance7, this.cleanup[7], 8);
            int instance11 = getInstance(instance7, instance10, instance9, instance8, this.cleanup[0], 13);
            int instance12 = getInstance(instance8, instance11, instance10, instance9, this.cleanup[6], 6);
            int instance13 = getInstance(instance9, instance12, instance11, instance10, this.cleanup[13], 5);
            int instance14 = getInstance(instance10, instance13, instance12, instance11, this.cleanup[11], 12);
            int instance15 = getInstance(instance11, instance14, instance13, instance12, this.cleanup[5], 7);
            int instance16 = getInstance(instance12, instance15, instance14, instance13, this.cleanup[12], 5);
            int cca_continue2 = cca_continue(configure14, Cardinal17, configure16, configure15, this.cleanup[15], 9);
            int cca_continue3 = cca_continue(configure15, cca_continue2, Cardinal17, configure16, this.cleanup[5], 7);
            int cca_continue4 = cca_continue(configure16, cca_continue3, cca_continue2, Cardinal17, this.cleanup[1], 15);
            int cca_continue5 = cca_continue(Cardinal17, cca_continue4, cca_continue3, cca_continue2, this.cleanup[3], 11);
            int cca_continue6 = cca_continue(cca_continue2, cca_continue5, cca_continue4, cca_continue3, this.cleanup[7], 8);
            int cca_continue7 = cca_continue(cca_continue3, cca_continue6, cca_continue5, cca_continue4, this.cleanup[14], 6);
            int cca_continue8 = cca_continue(cca_continue4, cca_continue7, cca_continue6, cca_continue5, this.cleanup[6], 6);
            int cca_continue9 = cca_continue(cca_continue5, cca_continue8, cca_continue7, cca_continue6, this.cleanup[9], 14);
            int cca_continue10 = cca_continue(cca_continue6, cca_continue9, cca_continue8, cca_continue7, this.cleanup[11], 12);
            int cca_continue11 = cca_continue(cca_continue7, cca_continue10, cca_continue9, cca_continue8, this.cleanup[8], 13);
            int cca_continue12 = cca_continue(cca_continue8, cca_continue11, cca_continue10, cca_continue9, this.cleanup[12], 5);
            int cca_continue13 = cca_continue(cca_continue9, cca_continue12, cca_continue11, cca_continue10, this.cleanup[2], 14);
            int cca_continue14 = cca_continue(cca_continue10, cca_continue13, cca_continue12, cca_continue11, this.cleanup[10], 13);
            int cca_continue15 = cca_continue(cca_continue11, cca_continue14, cca_continue13, cca_continue12, this.cleanup[0], 13);
            int cca_continue16 = cca_continue(cca_continue12, cca_continue15, cca_continue14, cca_continue13, this.cleanup[4], 7);
            int cca_continue17 = cca_continue(cca_continue13, cca_continue16, cca_continue15, cca_continue14, this.cleanup[13], 5);
            int init2 = init(instance13, instance16, cca_continue16, instance14, this.cleanup[1], 11);
            int init3 = init(instance14, init2, instance16, cca_continue16, this.cleanup[9], 12);
            int init4 = init(cca_continue16, init3, init2, instance16, this.cleanup[11], 14);
            int init5 = init(instance16, init4, init3, init2, this.cleanup[10], 15);
            int init6 = init(init2, init5, init4, init3, this.cleanup[0], 14);
            int init7 = init(init3, init6, init5, init4, this.cleanup[8], 15);
            int init8 = init(init4, init7, init6, init5, this.cleanup[12], 9);
            int init9 = init(init5, init8, init7, init6, this.cleanup[4], 8);
            int init10 = init(init6, init9, init8, init7, this.cleanup[13], 9);
            int init11 = init(init7, init10, init9, init8, this.cleanup[3], 14);
            int init12 = init(init8, init11, init10, init9, this.cleanup[7], 5);
            int init13 = init(init9, init12, init11, init10, this.cleanup[15], 6);
            int init14 = init(init10, init13, init12, init11, this.cleanup[14], 8);
            int init15 = init(init11, init14, init13, init12, this.cleanup[5], 6);
            int init16 = init(init12, init15, init14, init13, this.cleanup[6], 5);
            int init17 = init(init13, init16, init15, init14, this.cleanup[2], 12);
            int[] iArr2 = this.cleanup;
            int i42 = cca_continue14 + ((cca_continue17 ^ instance15) ^ cca_continue15) + iArr2[8];
            int i43 = (i42 >>> 17) | (i42 << 15);
            int i44 = cca_continue15 + ((i43 ^ cca_continue17) ^ instance15) + iArr2[6];
            int i45 = (i44 >>> 27) | (i44 << 5);
            int i46 = instance15 + ((i45 ^ i43) ^ cca_continue17) + iArr2[4];
            int i47 = (i46 >>> 24) | (i46 << 8);
            int i48 = cca_continue17 + ((i47 ^ i45) ^ i43) + iArr2[1];
            int i49 = (i48 >>> 21) | (i48 << 11);
            int i50 = i43 + ((i49 ^ i47) ^ i45) + iArr2[3];
            int i51 = (i50 >>> 18) | (i50 << 14);
            int i52 = i45 + ((i51 ^ i49) ^ i47) + iArr2[11];
            int i53 = (i52 >>> 18) | (i52 << 14);
            int i54 = i47 + ((i53 ^ i51) ^ i49) + iArr2[15];
            int i55 = (i54 >>> 26) | (i54 << 6);
            int i56 = i49 + ((i55 ^ i53) ^ i51) + iArr2[0];
            int i57 = (i56 >>> 18) | (i56 << 14);
            int i58 = i51 + ((i57 ^ i55) ^ i53) + iArr2[5];
            int i59 = (i58 >>> 26) | (i58 << 6);
            int i60 = i53 + ((i59 ^ i57) ^ i55) + iArr2[12];
            int i61 = (i60 >>> 23) | (i60 << 9);
            int i62 = i55 + ((i61 ^ i59) ^ i57) + iArr2[2];
            int i63 = (i62 >>> 20) | (i62 << 12);
            int i64 = i57 + ((i63 ^ i61) ^ i59) + iArr2[13];
            int i65 = (i64 << 9) | (i64 >>> 23);
            int i66 = i59 + ((i65 ^ i63) ^ i61) + iArr2[9];
            int i67 = (i66 << 12) | (i66 >>> 20);
            int i68 = i61 + ((i67 ^ i65) ^ i63) + iArr2[7];
            int i69 = (i68 >>> 27) | (i68 << 5);
            int i70 = i63 + ((i69 ^ i67) ^ i65) + iArr2[10];
            int i71 = (i70 >>> 17) | (i70 << 15);
            int i72 = i65 + ((i71 ^ i69) ^ i67) + iArr2[14];
            this.configure += init14;
            this.init += init17;
            this.cca_continue += init16;
            this.Cardinal += i69;
            this.getInstance += i67;
            this.getSDKVersion += (i72 >>> 24) | (i72 << 8);
            this.getWarnings += i71;
            this.onCReqSuccess += init15;
            this.onValidated = 0;
            int i73 = 0;
            while (true) {
                int[] iArr3 = this.cleanup;
                if (i73 != iArr3.length) {
                    iArr3[i73] = 0;
                    i73++;
                } else {
                    return;
                }
            }
        }
    }

    public final class ECDH extends KeyAgreementSpi.MQVwithSHA512KDFAndSharedInfo {
        private int Cardinal;
        private int cca_continue;
        private int configure;
        private int[] getInstance = new int[16];
        private int init;
        private int onCReqSuccess;

        public ECDH() {
            init();
        }

        private ECDH(ECDH ecdh) {
            super(ecdh);
            init(ecdh);
        }

        private static int Cardinal(int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i + (((~i2) & i4) | (i3 & i2)) + i5 + 1518500249;
            return (i7 >>> (32 - i6)) | (i7 << i6);
        }

        private static void Cardinal(int i, byte[] bArr, int i2) {
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >>> 8);
            bArr[i2 + 2] = (byte) (i >>> 16);
            bArr[i2 + 3] = (byte) (i >>> 24);
        }

        private static int cca_continue(int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i + ((i2 | (~i3)) ^ i4) + i5 + 1548603684;
            return (i7 >>> (32 - i6)) | (i7 << i6);
        }

        private static int cleanup(int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i + ((i2 & i4) | (i3 & (~i4))) + i5 + 1352829926;
            return (i7 >>> (32 - i6)) | (i7 << i6);
        }

        private static int configure(int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i + ((i2 | (~i3)) ^ i4) + i5 + 1859775393;
            return (i7 >>> (32 - i6)) | (i7 << i6);
        }

        private static int getInstance(int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i + (((~i2) & i4) | (i3 & i2)) + i5 + 1836072691;
            return (i7 >>> (32 - i6)) | (i7 << i6);
        }

        private static int init(int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ((i + ((i2 & i4) | (i3 & (~i4)))) + i5) - 1894007588;
            return (i7 >>> (32 - i6)) | (i7 << i6);
        }

        private void init(ECDH ecdh) {
            super.init(ecdh);
            this.init = ecdh.init;
            this.configure = ecdh.configure;
            this.cca_continue = ecdh.cca_continue;
            this.Cardinal = ecdh.Cardinal;
            int[] iArr = ecdh.getInstance;
            System.arraycopy(iArr, 0, this.getInstance, 0, iArr.length);
            this.onCReqSuccess = ecdh.onCReqSuccess;
        }

        public final setBackgroundColor Cardinal() {
            return new ECDH(this);
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            init((ECDH) setbackgroundcolor);
        }

        public final String configure() {
            return "RIPEMD128";
        }

        /* access modifiers changed from: protected */
        public final void configure(long j) {
            if (this.onCReqSuccess > 14) {
                cleanup();
            }
            int[] iArr = this.getInstance;
            iArr[14] = (int) j;
            iArr[15] = (int) (j >>> 32);
        }

        public final int getInstance() {
            return 16;
        }

        /* access modifiers changed from: protected */
        public final void getInstance(byte[] bArr, int i) {
            int[] iArr = this.getInstance;
            int i2 = this.onCReqSuccess;
            int i3 = i2 + 1;
            this.onCReqSuccess = i3;
            iArr[i2] = ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
            if (i3 == 16) {
                cleanup();
            }
        }

        public final int init(byte[] bArr, int i) {
            getSDKVersion();
            Cardinal(this.init, bArr, i);
            Cardinal(this.configure, bArr, i + 4);
            Cardinal(this.cca_continue, bArr, i + 8);
            Cardinal(this.Cardinal, bArr, i + 12);
            init();
            return 16;
        }

        public final void init() {
            super.init();
            this.init = 1732584193;
            this.configure = -271733879;
            this.cca_continue = -1732584194;
            this.Cardinal = 271733878;
            this.onCReqSuccess = 0;
            int i = 0;
            while (true) {
                int[] iArr = this.getInstance;
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
            int i = this.init;
            int i2 = this.configure;
            int i3 = this.cca_continue;
            int i4 = this.Cardinal;
            int[] iArr = this.getInstance;
            int i5 = ((i2 ^ i3) ^ i4) + i + iArr[0];
            int i6 = (i5 << 11) | (i5 >>> 21);
            int i7 = ((i6 ^ i2) ^ i3) + i4 + iArr[1];
            int i8 = (i7 << 14) | (i7 >>> 18);
            int i9 = ((i8 ^ i6) ^ i2) + i3 + iArr[2];
            int i10 = (i9 << 15) | (i9 >>> 17);
            int i11 = ((i10 ^ i8) ^ i6) + i2 + iArr[3];
            int i12 = (i11 << 12) | (i11 >>> 20);
            int i13 = i6 + ((i12 ^ i10) ^ i8) + iArr[4];
            int i14 = (i13 >>> 27) | (i13 << 5);
            int i15 = i8 + ((i14 ^ i12) ^ i10) + iArr[5];
            int i16 = (i15 << 8) | (i15 >>> 24);
            int i17 = i10 + ((i16 ^ i14) ^ i12) + iArr[6];
            int i18 = (i17 << 7) | (i17 >>> 25);
            int i19 = iArr[7];
            int i20 = i12 + ((i18 ^ i16) ^ i14) + i19;
            int i21 = (i20 << 9) | (i20 >>> 23);
            int i22 = i14 + ((i21 ^ i18) ^ i16) + iArr[8];
            int i23 = (i22 << 11) | (i22 >>> 21);
            int i24 = i16 + ((i23 ^ i21) ^ i18) + iArr[9];
            int i25 = (i24 << 13) | (i24 >>> 19);
            int i26 = i18 + ((i25 ^ i23) ^ i21) + iArr[10];
            int i27 = (i26 << 14) | (i26 >>> 18);
            int i28 = i21 + ((i27 ^ i25) ^ i23) + iArr[11];
            int i29 = (i28 << 15) | (i28 >>> 17);
            int i30 = i23 + ((i29 ^ i27) ^ i25) + iArr[12];
            int i31 = (i30 << 6) | (i30 >>> 26);
            int i32 = i25 + ((i31 ^ i29) ^ i27) + iArr[13];
            int i33 = (i32 << 7) | (i32 >>> 25);
            int i34 = i27 + ((i33 ^ i31) ^ i29) + iArr[14];
            int i35 = (i34 << 9) | (i34 >>> 23);
            int i36 = i29 + ((i35 ^ i33) ^ i31) + iArr[15];
            int i37 = (i36 << 8) | (i36 >>> 24);
            int Cardinal2 = Cardinal(i31, i37, i35, i33, i19, 7);
            int Cardinal3 = Cardinal(i33, Cardinal2, i37, i35, this.getInstance[4], 6);
            int Cardinal4 = Cardinal(i35, Cardinal3, Cardinal2, i37, this.getInstance[13], 8);
            int Cardinal5 = Cardinal(i37, Cardinal4, Cardinal3, Cardinal2, this.getInstance[1], 13);
            int Cardinal6 = Cardinal(Cardinal2, Cardinal5, Cardinal4, Cardinal3, this.getInstance[10], 11);
            int Cardinal7 = Cardinal(Cardinal3, Cardinal6, Cardinal5, Cardinal4, this.getInstance[6], 9);
            int Cardinal8 = Cardinal(Cardinal4, Cardinal7, Cardinal6, Cardinal5, this.getInstance[15], 7);
            int Cardinal9 = Cardinal(Cardinal5, Cardinal8, Cardinal7, Cardinal6, this.getInstance[3], 15);
            int Cardinal10 = Cardinal(Cardinal6, Cardinal9, Cardinal8, Cardinal7, this.getInstance[12], 7);
            int Cardinal11 = Cardinal(Cardinal7, Cardinal10, Cardinal9, Cardinal8, this.getInstance[0], 12);
            int Cardinal12 = Cardinal(Cardinal8, Cardinal11, Cardinal10, Cardinal9, this.getInstance[9], 15);
            int Cardinal13 = Cardinal(Cardinal9, Cardinal12, Cardinal11, Cardinal10, this.getInstance[5], 9);
            int Cardinal14 = Cardinal(Cardinal10, Cardinal13, Cardinal12, Cardinal11, this.getInstance[2], 11);
            int Cardinal15 = Cardinal(Cardinal11, Cardinal14, Cardinal13, Cardinal12, this.getInstance[14], 7);
            int Cardinal16 = Cardinal(Cardinal12, Cardinal15, Cardinal14, Cardinal13, this.getInstance[11], 13);
            int Cardinal17 = Cardinal(Cardinal13, Cardinal16, Cardinal15, Cardinal14, this.getInstance[8], 12);
            int configure2 = configure(Cardinal14, Cardinal17, Cardinal16, Cardinal15, this.getInstance[3], 11);
            int configure3 = configure(Cardinal15, configure2, Cardinal17, Cardinal16, this.getInstance[10], 13);
            int configure4 = configure(Cardinal16, configure3, configure2, Cardinal17, this.getInstance[14], 6);
            int configure5 = configure(Cardinal17, configure4, configure3, configure2, this.getInstance[4], 7);
            int configure6 = configure(configure2, configure5, configure4, configure3, this.getInstance[9], 14);
            int configure7 = configure(configure3, configure6, configure5, configure4, this.getInstance[15], 9);
            int configure8 = configure(configure4, configure7, configure6, configure5, this.getInstance[8], 13);
            int configure9 = configure(configure5, configure8, configure7, configure6, this.getInstance[1], 15);
            int configure10 = configure(configure6, configure9, configure8, configure7, this.getInstance[2], 14);
            int configure11 = configure(configure7, configure10, configure9, configure8, this.getInstance[7], 8);
            int configure12 = configure(configure8, configure11, configure10, configure9, this.getInstance[0], 13);
            int configure13 = configure(configure9, configure12, configure11, configure10, this.getInstance[6], 6);
            int configure14 = configure(configure10, configure13, configure12, configure11, this.getInstance[13], 5);
            int configure15 = configure(configure11, configure14, configure13, configure12, this.getInstance[11], 12);
            int configure16 = configure(configure12, configure15, configure14, configure13, this.getInstance[5], 7);
            int configure17 = configure(configure13, configure16, configure15, configure14, this.getInstance[12], 5);
            int init2 = init(configure14, configure17, configure16, configure15, this.getInstance[1], 11);
            int init3 = init(configure15, init2, configure17, configure16, this.getInstance[9], 12);
            int init4 = init(configure16, init3, init2, configure17, this.getInstance[11], 14);
            int init5 = init(configure17, init4, init3, init2, this.getInstance[10], 15);
            int init6 = init(init2, init5, init4, init3, this.getInstance[0], 14);
            int init7 = init(init3, init6, init5, init4, this.getInstance[8], 15);
            int init8 = init(init4, init7, init6, init5, this.getInstance[12], 9);
            int init9 = init(init5, init8, init7, init6, this.getInstance[4], 8);
            int init10 = init(init6, init9, init8, init7, this.getInstance[13], 9);
            int init11 = init(init7, init10, init9, init8, this.getInstance[3], 14);
            int init12 = init(init8, init11, init10, init9, this.getInstance[7], 5);
            int init13 = init(init9, init12, init11, init10, this.getInstance[15], 6);
            int init14 = init(init10, init13, init12, init11, this.getInstance[14], 8);
            int init15 = init(init11, init14, init13, init12, this.getInstance[5], 6);
            int init16 = init(init12, init15, init14, init13, this.getInstance[6], 5);
            int init17 = init(init13, init16, init15, init14, this.getInstance[2], 12);
            int cleanup = cleanup(i, i2, i3, i4, this.getInstance[5], 8);
            int cleanup2 = cleanup(i4, cleanup, i2, i3, this.getInstance[14], 9);
            int cleanup3 = cleanup(i3, cleanup2, cleanup, i2, this.getInstance[7], 9);
            int cleanup4 = cleanup(i2, cleanup3, cleanup2, cleanup, this.getInstance[0], 11);
            int cleanup5 = cleanup(cleanup, cleanup4, cleanup3, cleanup2, this.getInstance[9], 13);
            int cleanup6 = cleanup(cleanup2, cleanup5, cleanup4, cleanup3, this.getInstance[2], 15);
            int cleanup7 = cleanup(cleanup3, cleanup6, cleanup5, cleanup4, this.getInstance[11], 15);
            int cleanup8 = cleanup(cleanup4, cleanup7, cleanup6, cleanup5, this.getInstance[4], 5);
            int cleanup9 = cleanup(cleanup5, cleanup8, cleanup7, cleanup6, this.getInstance[13], 7);
            int cleanup10 = cleanup(cleanup6, cleanup9, cleanup8, cleanup7, this.getInstance[6], 7);
            int cleanup11 = cleanup(cleanup7, cleanup10, cleanup9, cleanup8, this.getInstance[15], 8);
            int cleanup12 = cleanup(cleanup8, cleanup11, cleanup10, cleanup9, this.getInstance[8], 11);
            int cleanup13 = cleanup(cleanup9, cleanup12, cleanup11, cleanup10, this.getInstance[1], 14);
            int cleanup14 = cleanup(cleanup10, cleanup13, cleanup12, cleanup11, this.getInstance[10], 14);
            int cleanup15 = cleanup(cleanup11, cleanup14, cleanup13, cleanup12, this.getInstance[3], 12);
            int cleanup16 = cleanup(cleanup12, cleanup15, cleanup14, cleanup13, this.getInstance[12], 6);
            int cca_continue2 = cca_continue(cleanup13, cleanup16, cleanup15, cleanup14, this.getInstance[6], 9);
            int cca_continue3 = cca_continue(cleanup14, cca_continue2, cleanup16, cleanup15, this.getInstance[11], 13);
            int cca_continue4 = cca_continue(cleanup15, cca_continue3, cca_continue2, cleanup16, this.getInstance[3], 15);
            int cca_continue5 = cca_continue(cleanup16, cca_continue4, cca_continue3, cca_continue2, this.getInstance[7], 7);
            int cca_continue6 = cca_continue(cca_continue2, cca_continue5, cca_continue4, cca_continue3, this.getInstance[0], 12);
            int cca_continue7 = cca_continue(cca_continue3, cca_continue6, cca_continue5, cca_continue4, this.getInstance[13], 8);
            int cca_continue8 = cca_continue(cca_continue4, cca_continue7, cca_continue6, cca_continue5, this.getInstance[5], 9);
            int cca_continue9 = cca_continue(cca_continue5, cca_continue8, cca_continue7, cca_continue6, this.getInstance[10], 11);
            int cca_continue10 = cca_continue(cca_continue6, cca_continue9, cca_continue8, cca_continue7, this.getInstance[14], 7);
            int cca_continue11 = cca_continue(cca_continue7, cca_continue10, cca_continue9, cca_continue8, this.getInstance[15], 7);
            int cca_continue12 = cca_continue(cca_continue8, cca_continue11, cca_continue10, cca_continue9, this.getInstance[8], 12);
            int cca_continue13 = cca_continue(cca_continue9, cca_continue12, cca_continue11, cca_continue10, this.getInstance[12], 7);
            int cca_continue14 = cca_continue(cca_continue10, cca_continue13, cca_continue12, cca_continue11, this.getInstance[4], 6);
            int cca_continue15 = cca_continue(cca_continue11, cca_continue14, cca_continue13, cca_continue12, this.getInstance[9], 15);
            int cca_continue16 = cca_continue(cca_continue12, cca_continue15, cca_continue14, cca_continue13, this.getInstance[1], 13);
            int cca_continue17 = cca_continue(cca_continue13, cca_continue16, cca_continue15, cca_continue14, this.getInstance[2], 11);
            int instance = getInstance(cca_continue14, cca_continue17, cca_continue16, cca_continue15, this.getInstance[15], 9);
            int instance2 = getInstance(cca_continue15, instance, cca_continue17, cca_continue16, this.getInstance[5], 7);
            int instance3 = getInstance(cca_continue16, instance2, instance, cca_continue17, this.getInstance[1], 15);
            int instance4 = getInstance(cca_continue17, instance3, instance2, instance, this.getInstance[3], 11);
            int instance5 = getInstance(instance, instance4, instance3, instance2, this.getInstance[7], 8);
            int instance6 = getInstance(instance2, instance5, instance4, instance3, this.getInstance[14], 6);
            int instance7 = getInstance(instance3, instance6, instance5, instance4, this.getInstance[6], 6);
            int instance8 = getInstance(instance4, instance7, instance6, instance5, this.getInstance[9], 14);
            int instance9 = getInstance(instance5, instance8, instance7, instance6, this.getInstance[11], 12);
            int instance10 = getInstance(instance6, instance9, instance8, instance7, this.getInstance[8], 13);
            int instance11 = getInstance(instance7, instance10, instance9, instance8, this.getInstance[12], 5);
            int instance12 = getInstance(instance8, instance11, instance10, instance9, this.getInstance[2], 14);
            int instance13 = getInstance(instance9, instance12, instance11, instance10, this.getInstance[10], 13);
            int instance14 = getInstance(instance10, instance13, instance12, instance11, this.getInstance[0], 13);
            int instance15 = getInstance(instance11, instance14, instance13, instance12, this.getInstance[4], 7);
            int instance16 = getInstance(instance12, instance15, instance14, instance13, this.getInstance[13], 5);
            int[] iArr2 = this.getInstance;
            int i38 = instance13 + ((instance16 ^ instance15) ^ instance14) + iArr2[8];
            int i39 = (i38 >>> 17) | (i38 << 15);
            int i40 = instance14 + ((i39 ^ instance16) ^ instance15) + iArr2[6];
            int i41 = (i40 >>> 27) | (i40 << 5);
            int i42 = instance15 + ((i41 ^ i39) ^ instance16) + iArr2[4];
            int i43 = (i42 >>> 24) | (i42 << 8);
            int i44 = instance16 + ((i43 ^ i41) ^ i39) + iArr2[1];
            int i45 = (i44 >>> 21) | (i44 << 11);
            int i46 = i39 + ((i45 ^ i43) ^ i41) + iArr2[3];
            int i47 = (i46 >>> 18) | (i46 << 14);
            int i48 = i41 + ((i47 ^ i45) ^ i43) + iArr2[11];
            int i49 = (i48 >>> 18) | (i48 << 14);
            int i50 = i43 + ((i49 ^ i47) ^ i45) + iArr2[15];
            int i51 = (i50 >>> 26) | (i50 << 6);
            int i52 = i45 + ((i51 ^ i49) ^ i47) + iArr2[0];
            int i53 = (i52 >>> 18) | (i52 << 14);
            int i54 = i47 + ((i53 ^ i51) ^ i49) + iArr2[5];
            int i55 = (i54 >>> 26) | (i54 << 6);
            int i56 = i49 + ((i55 ^ i53) ^ i51) + iArr2[12];
            int i57 = (i56 >>> 23) | (i56 << 9);
            int i58 = i51 + ((i57 ^ i55) ^ i53) + iArr2[2];
            int i59 = (i58 >>> 20) | (i58 << 12);
            int i60 = i53 + ((i59 ^ i57) ^ i55) + iArr2[13];
            int i61 = (i60 >>> 23) | (i60 << 9);
            int i62 = i55 + ((i61 ^ i59) ^ i57) + iArr2[9];
            int i63 = (i62 >>> 20) | (i62 << 12);
            int i64 = i57 + ((i63 ^ i61) ^ i59) + iArr2[7];
            int i65 = (i64 >>> 27) | (i64 << 5);
            int i66 = i59 + ((i65 ^ i63) ^ i61) + iArr2[10];
            int i67 = (i66 >>> 17) | (i66 << 15);
            int i68 = i61 + ((i67 ^ i65) ^ i63) + iArr2[14];
            this.configure = this.cca_continue + init15 + i63;
            this.cca_continue = this.Cardinal + init14 + ((i68 >>> 24) | (i68 << 8));
            this.Cardinal = this.init + init17 + i67;
            this.init = i65 + init16 + this.configure;
            this.onCReqSuccess = 0;
            int i69 = 0;
            while (true) {
                int[] iArr3 = this.getInstance;
                if (i69 != iArr3.length) {
                    iArr3[i69] = 0;
                    i69++;
                } else {
                    return;
                }
            }
        }
    }
}
