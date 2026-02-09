package com.cardinalcommerce.a;

import com.cardinalcommerce.a.AlgorithmParametersSpi;
import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public final class KeyLengthException {
    public KeyAgreementSpi.CDHwithSHA384KDFAndSharedInfo Cardinal;
    private byte[] CardinalEnvironment;
    private byte[] CardinalError;
    private AlgorithmParametersSpi.PSS CardinalRenderType;
    public GMCipherSpi.SM2withSha1 cca_continue;
    public IESCipher.ECIESwithCipher cleanup;
    public GMCipherSpi.SM2withRMD configure;
    public boolean getInstance;
    private GMCipherSpi.SM2withSha384 getSDKVersion;
    public protocolError getWarnings;
    public GMCipherSpi.SM2withRMD init;
    public byte[] onCReqSuccess;
    private GMCipherSpi.SM2withSha512 onValidated;

    public KeyLengthException() {
    }

    private static void Cardinal(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        jArr[0] = j ^ (j2 << 59);
        jArr[1] = (j2 >>> 5) ^ (j3 << 54);
        jArr[2] = (j3 >>> 10) ^ (j4 << 49);
        jArr[3] = (j4 >>> 15) ^ (j5 << 44);
        jArr[4] = (j5 >>> 20) ^ (j6 << 39);
        jArr[5] = (j6 >>> 25) ^ (j7 << 34);
        jArr[6] = (j7 >>> 30) ^ (j8 << 29);
        jArr[7] = (j8 >>> 35) ^ (j9 << 24);
        jArr[8] = (j9 >>> 40) ^ (j10 << 19);
        jArr[9] = (j10 >>> 45) ^ (j11 << 14);
        jArr[10] = (j11 >>> 50) ^ (j12 << 9);
        jArr[11] = ((j12 >>> 55) ^ (j13 << 4)) ^ (j14 << 63);
        jArr[12] = (j13 >>> 60) ^ (j14 >>> 1);
        jArr[13] = 0;
    }

    public static void cca_continue(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j11 = j8 ^ (j9 >>> 2);
        long j12 = jArr[11];
        long j13 = j5 ^ (j12 << 39);
        long j14 = (j6 ^ (j9 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j15 = j10 ^ (j12 >>> 2);
        long j16 = jArr[10];
        long j17 = j4 ^ (j16 << 39);
        long j18 = j13 ^ ((j16 >>> 25) ^ (j16 << 62));
        long j19 = j14 ^ (j16 >>> 2);
        long j20 = jArr[9];
        long j21 = j3 ^ (j20 << 39);
        long j22 = j17 ^ ((j20 >>> 25) ^ (j20 << 62));
        long j23 = j18 ^ (j20 >>> 2);
        long j24 = jArr[8];
        long j25 = j ^ (j11 << 39);
        long j26 = (j21 ^ ((j24 >>> 25) ^ (j24 << 62))) ^ (j11 >>> 2);
        long j27 = j15 >>> 25;
        jArr2[0] = j25 ^ j27;
        long j28 = j27 << 23;
        jArr2[1] = j28 ^ ((j2 ^ (j24 << 39)) ^ ((j11 >>> 25) ^ (j11 << 62)));
        jArr2[2] = j26;
        jArr2[3] = j22 ^ (j24 >>> 2);
        jArr2[4] = j23;
        jArr2[5] = j19;
        jArr2[6] = j15 & 33554431;
    }

    private static void configure(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    private static void init(long[] jArr, long j, long[] jArr2, int i) {
        long[] jArr3 = new long[8];
        jArr3[1] = j;
        long j2 = j << 1;
        jArr3[2] = j2;
        long j3 = j2 ^ j;
        jArr3[3] = j3;
        long j4 = j2 << 1;
        jArr3[4] = j4;
        jArr3[5] = j4 ^ j;
        long j5 = j3 << 1;
        jArr3[6] = j5;
        jArr3[7] = j5 ^ j;
        for (int i2 = 0; i2 < 7; i2++) {
            long j6 = jArr[i2];
            int i3 = (int) j6;
            long j7 = jArr3[i3 & 7] ^ (jArr3[(i3 >>> 3) & 7] << 3);
            long j8 = 0;
            int i4 = 54;
            do {
                int i5 = (int) (j6 >>> i4);
                long j9 = jArr3[i5 & 7] ^ (jArr3[(i5 >>> 3) & 7] << 3);
                j7 ^= j9 << i4;
                j8 ^= j9 >>> (-i4);
                i4 -= 6;
            } while (i4 > 0);
            int i6 = i + i2;
            jArr2[i6] = jArr2[i6] ^ (576460752303423487L & j7);
            int i7 = i6 + 1;
            jArr2[i7] = jArr2[i7] ^ ((j7 >>> 59) ^ (j8 << 5));
        }
    }

    static void init(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 6; i++) {
            EncryptedJWT.Cardinal(jArr[i], jArr2, i << 1);
        }
        jArr2[12] = EncryptedJWT.getInstance((int) jArr[6]);
    }

    static void init(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        configure(jArr, jArr4);
        configure(jArr2, jArr5);
        for (int i = 0; i < 7; i++) {
            init(jArr4, jArr5[i], jArr3, i);
        }
        Cardinal(jArr3);
    }

    public static void configure(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        init(jArr, jArr2, jArr4);
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
    }

    public static void Cardinal(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[13];
        init(jArr, jArr3);
        while (true) {
            cca_continue(jArr3, jArr2);
            i--;
            if (i > 0) {
                init(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    public KeyLengthException(GMCipherSpi.SM2withSha384 sM2withSha384, GMCipherSpi.SM2withSha512 sM2withSha512, KeyAgreementSpi.CDHwithSHA384KDFAndSharedInfo cDHwithSHA384KDFAndSharedInfo) {
        this.getSDKVersion = sM2withSha384;
        this.onValidated = sM2withSha512;
        this.Cardinal = cDHwithSHA384KDFAndSharedInfo;
        this.CardinalEnvironment = new byte[cDHwithSHA384KDFAndSharedInfo.getInstance()];
        this.cca_continue = null;
    }

    public KeyLengthException(GMCipherSpi.SM2withSha384 sM2withSha384, GMCipherSpi.SM2withSha512 sM2withSha512, KeyAgreementSpi.CDHwithSHA384KDFAndSharedInfo cDHwithSHA384KDFAndSharedInfo, GMCipherSpi.SM2withSha1 sM2withSha1) {
        this.getSDKVersion = sM2withSha384;
        this.onValidated = sM2withSha512;
        this.Cardinal = cDHwithSHA384KDFAndSharedInfo;
        this.CardinalEnvironment = new byte[cDHwithSHA384KDFAndSharedInfo.getInstance()];
        this.cca_continue = sM2withSha1;
    }

    public void getInstance(GMCipherSpi.SM2withRMD sM2withRMD) {
        if (sM2withRMD instanceof DigestSignatureSpi.MD4) {
            DigestSignatureSpi.MD4 md4 = (DigestSignatureSpi.MD4) sM2withRMD;
            this.CardinalError = md4.init;
            sM2withRMD = md4.cca_continue;
        } else {
            this.CardinalError = null;
        }
        this.CardinalRenderType = (AlgorithmParametersSpi.PSS) sM2withRMD;
    }

    /* JADX INFO: finally extract failed */
    public final byte[] init(byte[] bArr, int i) throws KeyAgreementSpi.AnonymousClass1 {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i2;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        int i3;
        byte[] bArr10;
        byte[] bArr11;
        GMCipherSpi.SM2withSha1 sM2withSha1;
        GMCipherSpi.SM2withRMD iSO9796d1Padding;
        byte[] bArr12 = bArr;
        int i4 = i;
        if (this.getInstance) {
            protocolError protocolerror = this.getWarnings;
            if (protocolerror != null) {
                BaseKeyFactorySpi baseKeyFactorySpi = new BaseKeyFactorySpi(protocolerror.Cardinal.init(), protocolerror.cca_continue);
                this.configure = baseKeyFactorySpi.Cardinal.init;
                this.onCReqSuccess = baseKeyFactorySpi.cca_continue.init(baseKeyFactorySpi.Cardinal.getInstance);
            }
        } else if (this.cleanup != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr12, 0, i4);
            try {
                this.init = this.cleanup.getInstance(byteArrayInputStream);
                this.onCReqSuccess = getBackgroundColor.cca_continue(bArr12, 0, i4 - byteArrayInputStream.available());
            } catch (IOException e) {
                throw new KeyAgreementSpi.AnonymousClass1(new StringBuilder("unable to recover ephemeral public key: ").append(e.getMessage()).toString(), e);
            } catch (IllegalArgumentException e2) {
                throw new KeyAgreementSpi.AnonymousClass1(new StringBuilder("unable to recover ephemeral public key: ").append(e2.getMessage()).toString(), e2);
            }
        }
        this.getSDKVersion.cca_continue(this.configure);
        byte[] instance = setCornerRadius.getInstance(this.getSDKVersion.Cardinal(), this.getSDKVersion.getInstance(this.init));
        byte[] bArr13 = this.onCReqSuccess;
        if (bArr13.length != 0) {
            byte[] configure2 = getBackgroundColor.configure(bArr13, instance);
            for (int i5 = 0; i5 < instance.length; i5++) {
                instance[i5] = 0;
            }
            instance = configure2;
        }
        try {
            byte[] bArr14 = this.CardinalRenderType.Cardinal;
            if (bArr14 == null) {
                bArr2 = null;
            } else {
                bArr2 = new byte[bArr14.length];
                System.arraycopy(bArr14, 0, bArr2, 0, bArr14.length);
            }
            this.onValidated.getInstance(new CipherSpi.OAEPPadding(instance, bArr2));
            if (this.getInstance) {
                if (this.cca_continue == null) {
                    byte[] bArr15 = new byte[i4];
                    int i6 = this.CardinalRenderType.cca_continue / 8;
                    bArr8 = new byte[i6];
                    int i7 = i4 + i6;
                    byte[] bArr16 = new byte[i7];
                    this.onValidated.cca_continue(bArr16, 0, i7);
                    if (this.onCReqSuccess.length != 0) {
                        System.arraycopy(bArr16, 0, bArr8, 0, i6);
                        System.arraycopy(bArr16, i6, bArr15, 0, i4);
                    } else {
                        System.arraycopy(bArr16, 0, bArr15, 0, i4);
                        System.arraycopy(bArr16, i4, bArr8, 0, i6);
                    }
                    bArr9 = new byte[i4];
                    for (int i8 = 0; i8 != i4; i8++) {
                        bArr9[i8] = (byte) (bArr12[i8 + 0] ^ bArr15[i8]);
                    }
                    i3 = i4;
                } else {
                    int i9 = ((AlgorithmParametersSpi.OAEP) this.CardinalRenderType).configure / 8;
                    byte[] bArr17 = new byte[i9];
                    int i10 = this.CardinalRenderType.cca_continue / 8;
                    byte[] bArr18 = new byte[i10];
                    int i11 = i9 + i10;
                    byte[] bArr19 = new byte[i11];
                    this.onValidated.cca_continue(bArr19, 0, i11);
                    System.arraycopy(bArr19, 0, bArr17, 0, i9);
                    System.arraycopy(bArr19, i9, bArr18, 0, i10);
                    if (this.CardinalError != null) {
                        sM2withSha1 = this.cca_continue;
                        iSO9796d1Padding = new DigestSignatureSpi.MD4(new CipherSpi.ISO9796d1Padding(bArr17), this.CardinalError);
                    } else {
                        sM2withSha1 = this.cca_continue;
                        iSO9796d1Padding = new CipherSpi.ISO9796d1Padding(bArr17);
                    }
                    sM2withSha1.getInstance(true, iSO9796d1Padding);
                    bArr9 = new byte[this.cca_continue.init(i4)];
                    int init2 = this.cca_continue.init(bArr12, 0, i4, bArr9);
                    i3 = init2 + this.cca_continue.configure(bArr9, init2);
                    bArr8 = bArr18;
                }
                byte[] bArr20 = this.CardinalRenderType.getInstance;
                if (bArr20 == null) {
                    bArr10 = null;
                } else {
                    bArr10 = new byte[bArr20.length];
                    System.arraycopy(bArr20, 0, bArr10, 0, bArr20.length);
                }
                if (this.onCReqSuccess.length != 0) {
                    bArr11 = new byte[8];
                    if (bArr10 != null) {
                        long length = ((long) bArr10.length) << 3;
                        setTextFontSize.init((int) (length >>> 32), bArr11, 0);
                        setTextFontSize.init((int) length, bArr11, 4);
                    }
                } else {
                    bArr11 = null;
                }
                int instance2 = this.Cardinal.getInstance();
                byte[] bArr21 = new byte[instance2];
                this.Cardinal.configure(new CipherSpi.ISO9796d1Padding(bArr8));
                this.Cardinal.getInstance(bArr9, 0, bArr9.length);
                if (bArr10 != null) {
                    this.Cardinal.getInstance(bArr10, 0, bArr10.length);
                }
                if (this.onCReqSuccess.length != 0) {
                    this.Cardinal.getInstance(bArr11, 0, bArr11.length);
                }
                this.Cardinal.getInstance(bArr21);
                byte[] bArr22 = this.onCReqSuccess;
                bArr3 = new byte[(bArr22.length + i3 + instance2)];
                System.arraycopy(bArr22, 0, bArr3, 0, bArr22.length);
                System.arraycopy(bArr9, 0, bArr3, this.onCReqSuccess.length, i3);
                System.arraycopy(bArr21, 0, bArr3, this.onCReqSuccess.length + i3, instance2);
            } else if (i4 >= this.onCReqSuccess.length + this.Cardinal.getInstance()) {
                if (this.cca_continue == null) {
                    int length2 = (i4 - this.onCReqSuccess.length) - this.Cardinal.getInstance();
                    byte[] bArr23 = new byte[length2];
                    int i12 = this.CardinalRenderType.cca_continue / 8;
                    bArr4 = new byte[i12];
                    int i13 = length2 + i12;
                    byte[] bArr24 = new byte[i13];
                    this.onValidated.cca_continue(bArr24, 0, i13);
                    if (this.onCReqSuccess.length != 0) {
                        System.arraycopy(bArr24, 0, bArr4, 0, i12);
                        System.arraycopy(bArr24, i12, bArr23, 0, length2);
                    } else {
                        System.arraycopy(bArr24, 0, bArr23, 0, length2);
                        System.arraycopy(bArr24, length2, bArr4, 0, i12);
                    }
                    byte[] bArr25 = new byte[length2];
                    for (int i14 = 0; i14 != length2; i14++) {
                        bArr25[i14] = (byte) (bArr12[(this.onCReqSuccess.length + 0) + i14] ^ bArr23[i14]);
                    }
                    i2 = 0;
                    bArr5 = bArr25;
                } else {
                    int i15 = ((AlgorithmParametersSpi.OAEP) this.CardinalRenderType).configure / 8;
                    byte[] bArr26 = new byte[i15];
                    int i16 = this.CardinalRenderType.cca_continue / 8;
                    bArr4 = new byte[i16];
                    int i17 = i15 + i16;
                    byte[] bArr27 = new byte[i17];
                    this.onValidated.cca_continue(bArr27, 0, i17);
                    System.arraycopy(bArr27, 0, bArr26, 0, i15);
                    System.arraycopy(bArr27, i15, bArr4, 0, i16);
                    GMCipherSpi.SM2withRMD iSO9796d1Padding2 = new CipherSpi.ISO9796d1Padding(bArr26);
                    if (this.CardinalError != null) {
                        iSO9796d1Padding2 = new DigestSignatureSpi.MD4(iSO9796d1Padding2, this.CardinalError);
                    }
                    this.cca_continue.getInstance(false, iSO9796d1Padding2);
                    bArr5 = new byte[this.cca_continue.init((i4 - this.onCReqSuccess.length) - this.Cardinal.getInstance())];
                    GMCipherSpi.SM2withSha1 sM2withSha12 = this.cca_continue;
                    byte[] bArr28 = this.onCReqSuccess;
                    i2 = sM2withSha12.init(bArr12, bArr28.length + 0, (i4 - bArr28.length) - this.Cardinal.getInstance(), bArr5);
                }
                byte[] bArr29 = this.CardinalRenderType.getInstance;
                if (bArr29 == null) {
                    bArr6 = null;
                } else {
                    bArr6 = new byte[bArr29.length];
                    System.arraycopy(bArr29, 0, bArr6, 0, bArr29.length);
                }
                if (this.onCReqSuccess.length != 0) {
                    bArr7 = new byte[8];
                    if (bArr6 != null) {
                        long length3 = ((long) bArr6.length) << 3;
                        setTextFontSize.init((int) (length3 >>> 32), bArr7, 0);
                        setTextFontSize.init((int) length3, bArr7, 4);
                    }
                } else {
                    bArr7 = null;
                }
                int i18 = i4 + 0;
                byte[] cca_continue2 = getBackgroundColor.cca_continue(bArr12, i18 - this.Cardinal.getInstance(), i18);
                int length4 = cca_continue2.length;
                byte[] bArr30 = new byte[length4];
                this.Cardinal.configure(new CipherSpi.ISO9796d1Padding(bArr4));
                KeyAgreementSpi.CDHwithSHA384KDFAndSharedInfo cDHwithSHA384KDFAndSharedInfo = this.Cardinal;
                byte[] bArr31 = this.onCReqSuccess;
                cDHwithSHA384KDFAndSharedInfo.getInstance(bArr12, bArr31.length + 0, (i4 - bArr31.length) - length4);
                if (bArr6 != null) {
                    this.Cardinal.getInstance(bArr6, 0, bArr6.length);
                }
                if (this.onCReqSuccess.length != 0) {
                    this.Cardinal.getInstance(bArr7, 0, bArr7.length);
                }
                this.Cardinal.getInstance(bArr30);
                if (getBackgroundColor.init(cca_continue2, bArr30)) {
                    GMCipherSpi.SM2withSha1 sM2withSha13 = this.cca_continue;
                    bArr3 = sM2withSha13 == null ? bArr5 : getBackgroundColor.cca_continue(bArr5, 0, i2 + sM2withSha13.configure(bArr5, i2));
                } else {
                    throw new KeyAgreementSpi.AnonymousClass1("invalid MAC");
                }
            } else {
                throw new KeyAgreementSpi.AnonymousClass1("Length of input must be greater than the MAC and V combined");
            }
            for (int i19 = 0; i19 < instance.length; i19++) {
                instance[i19] = 0;
            }
            return bArr3;
        } catch (Throwable th) {
            for (int i20 = 0; i20 < instance.length; i20++) {
                instance[i20] = 0;
            }
            throw th;
        }
    }
}
