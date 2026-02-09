package com.cardinalcommerce.a;

import com.cardinalcommerce.a.ConcatKDF;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.google.common.base.Ascii;
import java.security.SecureRandom;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

public abstract class Base64URL {
    private static final int[] Cardinal = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final int[] cca_continue = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] configure = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final byte[] getInstance = getTextFontSize.configure("SigEd448");
    private static Object getWarnings = new Object();
    private static final int[] init = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};
    private static cca_continue[] onCReqSuccess = null;
    private static int[] onValidated = null;

    private static void cca_continue(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    private static void cca_continue(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    private static byte[] cca_continue(int[] iArr, int i) {
        int i2;
        int[] iArr2 = new int[28];
        int i3 = 0;
        int i4 = 14;
        int i5 = 28;
        int i6 = 0;
        while (true) {
            i4--;
            if (i4 < 0) {
                break;
            }
            int i7 = iArr[i4];
            int i8 = i5 - 1;
            iArr2[i8] = (i6 << 16) | (i7 >>> 16);
            i5 = i8 - 1;
            iArr2[i5] = i7;
            i6 = i7;
        }
        byte[] bArr = new byte[448];
        int i9 = 1 << i;
        int i10 = i9 - 1;
        int i11 = i9 >>> 1;
        int i12 = 0;
        int i13 = 0;
        while (i3 < 28) {
            int i14 = iArr2[i3];
            while (i2 < 16) {
                int i15 = i14 >>> i2;
                if ((i15 & 1) == i13) {
                    i2++;
                } else {
                    int i16 = (i15 & i10) + i13;
                    int i17 = i16 & i11;
                    int i18 = i16 - (i17 << 1);
                    i13 = i17 >>> (i - 1);
                    bArr[(i3 << 4) + i2] = (byte) i18;
                    i2 += i;
                }
            }
            i3++;
            i12 = i2 - 16;
        }
        return bArr;
    }

    private static int configure(byte[] bArr, int i) {
        int i2 = i + 1;
        return ((bArr[i2 + 1] & 255) << Ascii.DLE) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
    }

    private static cca_continue[] configure(cca_continue cca_continue2, int i) {
        cca_continue instance = getInstance(cca_continue2);
        configure(instance);
        cca_continue[] cca_continueArr = new cca_continue[i];
        cca_continueArr[0] = getInstance(cca_continue2);
        for (int i2 = 1; i2 < i; i2++) {
            cca_continue instance2 = getInstance(cca_continueArr[i2 - 1]);
            cca_continueArr[i2] = instance2;
            init(false, instance, instance2);
        }
        return cca_continueArr;
    }

    public static void getInstance(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    private static int init(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << Ascii.DLE);
    }

    private static void init(KeyAgreementSpi.DH dh, byte b, byte[] bArr) {
        byte[] bArr2 = getInstance;
        dh.init(bArr2, 0, bArr2.length);
        dh.cca_continue(b);
        dh.cca_continue((byte) bArr.length);
        dh.init(bArr, 0, bArr.length);
    }

    static class cca_continue {
        int[] Cardinal;
        int[] configure;
        int[] init;

        /* synthetic */ cca_continue(byte b) {
            this();
        }

        private cca_continue() {
            this.Cardinal = new int[16];
            this.configure = new int[16];
            this.init = new int[16];
        }
    }

    static class configure {
        int[] configure;
        int[] init;

        /* synthetic */ configure(byte b) {
            this();
        }

        private configure() {
            this.configure = new int[16];
            this.init = new int[16];
        }
    }

    private static boolean cca_continue(byte[] bArr) {
        if ((bArr[56] & Byte.MAX_VALUE) != 0) {
            return false;
        }
        int[] iArr = new int[14];
        for (int i = 0; i < 14; i++) {
            iArr[i] = init(bArr, (i << 2) + 0);
        }
        return !getErrorMessage.init(14, iArr, cca_continue);
    }

    private static void init(long j, byte[] bArr, int i) {
        cca_continue((int) j, bArr, i);
        int i2 = (int) (j >>> 32);
        int i3 = i + 4;
        bArr[i3] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        bArr[i4 + 1] = (byte) (i2 >>> 16);
    }

    private static void configure(cca_continue cca_continue2, byte[] bArr, int i) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        KeyAgreementSpi.MQVwithSHA224CKDF.init(cca_continue2.init, iArr2);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(cca_continue2.Cardinal, iArr2, iArr);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(cca_continue2.configure, iArr2, iArr2);
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr, 1);
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr, -1);
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr2, 1);
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr2, -1);
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr2, bArr, 0);
        bArr[56] = (byte) ((1 & iArr[0]) << 7);
    }

    public static void configure(byte[] bArr, byte[] bArr2) {
        SignatureSpi.ecCVCDSA512 eccvcdsa512 = new SignatureSpi.ecCVCDSA512(256);
        byte[] bArr3 = new byte[114];
        eccvcdsa512.init(bArr, 0, 57);
        eccvcdsa512.getInstance(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        cca_continue(bArr3, 0, bArr4);
        cca_continue cca_continue2 = new cca_continue((byte) 0);
        init(bArr4, cca_continue2);
        configure(cca_continue2, bArr2, 0);
    }

    private static void init(boolean z, cca_continue cca_continue2, cca_continue cca_continue3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        cca_continue cca_continue4 = cca_continue2;
        cca_continue cca_continue5 = cca_continue3;
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[16];
        int[] iArr10 = new int[16];
        int[] iArr11 = new int[16];
        int[] iArr12 = new int[16];
        int[] iArr13 = cca_continue4.configure;
        int[] iArr14 = cca_continue4.Cardinal;
        if (z) {
            KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr13, iArr14, iArr12);
            iArr = iArr6;
            iArr2 = iArr9;
            iArr3 = iArr10;
            iArr4 = iArr11;
        } else {
            for (int i = 0; i < 16; i++) {
                iArr12[i] = iArr13[i] + iArr14[i];
            }
            iArr2 = iArr6;
            iArr = iArr9;
            iArr4 = iArr10;
            iArr3 = iArr11;
        }
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(cca_continue4.init, cca_continue5.init, iArr5);
        KeyAgreementSpi.MQVwithSHA224CKDF.configure(iArr5, iArr6);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(cca_continue4.Cardinal, cca_continue5.Cardinal, iArr7);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(cca_continue4.configure, cca_continue5.configure, iArr8);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr7, iArr8, iArr9);
        KeyAgreementSpi.MQVwithSHA224CKDF.configure(iArr9, 39081, iArr9);
        for (int i2 = 0; i2 < 16; i2++) {
            iArr4[i2] = iArr6[i2] + iArr9[i2];
        }
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr6, iArr9, iArr3);
        int[] iArr15 = cca_continue5.Cardinal;
        int[] iArr16 = cca_continue5.configure;
        for (int i3 = 0; i3 < 16; i3++) {
            iArr9[i3] = iArr15[i3] + iArr16[i3];
        }
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr12, iArr9, iArr12);
        for (int i4 = 0; i4 < 16; i4++) {
            iArr2[i4] = iArr8[i4] + iArr7[i4];
        }
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr8, iArr7, iArr);
        KeyAgreementSpi.MQVwithSHA224CKDF.getInstance(iArr2);
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr12, iArr6, iArr12);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr12, iArr5, iArr12);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr9, iArr5, iArr9);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr10, iArr12, cca_continue5.Cardinal);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr9, iArr11, cca_continue5.configure);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr10, iArr11, cca_continue5.init);
    }

    private static cca_continue getInstance(cca_continue cca_continue2) {
        cca_continue cca_continue3 = new cca_continue((byte) 0);
        int[] iArr = cca_continue2.Cardinal;
        int[] iArr2 = cca_continue3.Cardinal;
        for (int i = 0; i < 16; i++) {
            iArr2[i + 0] = iArr[i];
        }
        int[] iArr3 = cca_continue2.configure;
        int[] iArr4 = cca_continue3.configure;
        for (int i2 = 0; i2 < 16; i2++) {
            iArr4[i2 + 0] = iArr3[i2];
        }
        int[] iArr5 = cca_continue2.init;
        int[] iArr6 = cca_continue3.init;
        for (int i3 = 0; i3 < 16; i3++) {
            iArr6[i3 + 0] = iArr5[i3];
        }
        return cca_continue3;
    }

    private static void configure(cca_continue cca_continue2) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = cca_continue2.Cardinal;
        int[] iArr8 = cca_continue2.configure;
        for (int i = 0; i < 16; i++) {
            iArr[i] = iArr7[i] + iArr8[i];
        }
        KeyAgreementSpi.MQVwithSHA224CKDF.configure(iArr, iArr);
        KeyAgreementSpi.MQVwithSHA224CKDF.configure(cca_continue2.Cardinal, iArr2);
        KeyAgreementSpi.MQVwithSHA224CKDF.configure(cca_continue2.configure, iArr3);
        for (int i2 = 0; i2 < 16; i2++) {
            iArr4[i2] = iArr2[i2] + iArr3[i2];
        }
        KeyAgreementSpi.MQVwithSHA224CKDF.getInstance(iArr4);
        KeyAgreementSpi.MQVwithSHA224CKDF.configure(cca_continue2.init, iArr5);
        for (int i3 = 0; i3 < 16; i3++) {
            int i4 = iArr5[i3];
            iArr5[i3] = i4 + i4;
        }
        KeyAgreementSpi.MQVwithSHA224CKDF.getInstance(iArr5);
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr4, iArr5, iArr6);
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr, iArr4, iArr);
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr2, iArr3, iArr2);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr, iArr6, cca_continue2.Cardinal);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr4, iArr2, cca_continue2.configure);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr4, iArr6, cca_continue2.init);
    }

    private static void cca_continue(cca_continue cca_continue2) {
        int[] iArr = cca_continue2.Cardinal;
        for (int i = 0; i < 16; i++) {
            iArr[i] = 0;
        }
        int[] iArr2 = cca_continue2.configure;
        iArr2[0] = 1;
        for (int i2 = 1; i2 < 16; i2++) {
            iArr2[i2] = 0;
        }
        int[] iArr3 = cca_continue2.init;
        iArr3[0] = 1;
        for (int i3 = 1; i3 < 16; i3++) {
            iArr3[i3] = 0;
        }
    }

    private static void cca_continue() {
        synchronized (getWarnings) {
            if (onValidated == null) {
                cca_continue cca_continue2 = new cca_continue((byte) 0);
                int[] iArr = configure;
                int[] iArr2 = cca_continue2.Cardinal;
                for (int i = 0; i < 16; i++) {
                    iArr2[i + 0] = iArr[i];
                }
                int[] iArr3 = Cardinal;
                int[] iArr4 = cca_continue2.configure;
                for (int i2 = 0; i2 < 16; i2++) {
                    iArr4[i2 + 0] = iArr3[i2];
                }
                int[] iArr5 = cca_continue2.init;
                iArr5[0] = 1;
                for (int i3 = 1; i3 < 16; i3++) {
                    iArr5[i3] = 0;
                }
                onCReqSuccess = configure(cca_continue2, 32);
                onValidated = new int[2560];
                int i4 = 0;
                for (int i5 = 0; i5 < 5; i5++) {
                    cca_continue[] cca_continueArr = new cca_continue[5];
                    cca_continue cca_continue3 = new cca_continue((byte) 0);
                    cca_continue(cca_continue3);
                    for (int i6 = 0; i6 < 5; i6++) {
                        init(true, cca_continue2, cca_continue3);
                        configure(cca_continue2);
                        cca_continueArr[i6] = getInstance(cca_continue2);
                        if (i5 + i6 != 8) {
                            for (int i7 = 1; i7 < 18; i7++) {
                                configure(cca_continue2);
                            }
                        }
                    }
                    cca_continue[] cca_continueArr2 = new cca_continue[16];
                    cca_continueArr2[0] = cca_continue3;
                    int i8 = 1;
                    for (int i9 = 0; i9 < 4; i9++) {
                        int i10 = 1 << i9;
                        int i11 = 0;
                        while (i11 < i10) {
                            cca_continue instance = getInstance(cca_continueArr2[i8 - i10]);
                            cca_continueArr2[i8] = instance;
                            init(false, cca_continueArr[i9], instance);
                            i11++;
                            i8++;
                        }
                    }
                    for (int i12 = 0; i12 < 16; i12++) {
                        cca_continue cca_continue4 = cca_continueArr2[i12];
                        KeyAgreementSpi.MQVwithSHA224CKDF.init(cca_continue4.init, cca_continue4.init);
                        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(cca_continue4.Cardinal, cca_continue4.init, cca_continue4.Cardinal);
                        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(cca_continue4.configure, cca_continue4.init, cca_continue4.configure);
                        int[] iArr6 = cca_continue4.Cardinal;
                        int[] iArr7 = onValidated;
                        for (int i13 = 0; i13 < 16; i13++) {
                            iArr7[i4 + i13] = iArr6[i13];
                        }
                        int i14 = i4 + 16;
                        int[] iArr8 = cca_continue4.configure;
                        int[] iArr9 = onValidated;
                        for (int i15 = 0; i15 < 16; i15++) {
                            iArr9[i14 + i15] = iArr8[i15];
                        }
                        i4 = i14 + 16;
                    }
                }
            }
        }
    }

    private static byte[] init(byte[] bArr) {
        byte[] bArr2 = bArr;
        long configure2 = ((long) (configure(bArr2, 4) << 4)) & 4294967295L;
        long init2 = ((long) init(bArr2, 7)) & 4294967295L;
        long configure3 = ((long) (configure(bArr2, 11) << 4)) & 4294967295L;
        long init3 = ((long) init(bArr2, 14)) & 4294967295L;
        long configure4 = ((long) (configure(bArr2, 18) << 4)) & 4294967295L;
        long init4 = ((long) init(bArr2, 21)) & 4294967295L;
        long configure5 = ((long) (configure(bArr2, 25) << 4)) & 4294967295L;
        long init5 = ((long) init(bArr2, 28)) & 4294967295L;
        long configure6 = ((long) (configure(bArr2, 32) << 4)) & 4294967295L;
        long init6 = ((long) init(bArr2, 35)) & 4294967295L;
        long configure7 = ((long) (configure(bArr2, 39) << 4)) & 4294967295L;
        long init7 = ((long) init(bArr2, 42)) & 4294967295L;
        long configure8 = ((long) (configure(bArr2, 46) << 4)) & 4294967295L;
        long init8 = ((long) init(bArr2, 49)) & 4294967295L;
        long configure9 = ((long) (configure(bArr2, 53) << 4)) & 4294967295L;
        long configure10 = ((long) (configure(bArr2, 74) << 4)) & 4294967295L;
        long init9 = ((long) init(bArr2, 77)) & 4294967295L;
        long configure11 = ((long) (configure(bArr2, 81) << 4)) & 4294967295L;
        long init10 = ((long) init(bArr2, 84)) & 4294967295L;
        long configure12 = ((long) (configure(bArr2, 88) << 4)) & 4294967295L;
        long init11 = ((long) init(bArr2, 91)) & 4294967295L;
        long configure13 = ((long) (configure(bArr2, 95) << 4)) & 4294967295L;
        long init12 = ((long) init(bArr2, 98)) & 4294967295L;
        long configure14 = ((long) (configure(bArr2, 102) << 4)) & 4294967295L;
        long init13 = ((long) init(bArr2, 105)) & 4294967295L;
        int i = (bArr2[113] & 255) << 8;
        long configure15 = ((long) (configure(bArr2, 109) << 4)) & 4294967295L;
        long j = ((long) (i | (bArr2[112] & 255))) & 4294967295L;
        long j2 = configure11 + (j * 550336261);
        long j3 = configure15 + (init13 >>> 28);
        long j4 = init13 & 268435455;
        long init14 = (((long) init(bArr2, 56)) & 4294967295L) + (j * 43969588) + (j3 * 30366549);
        long configure16 = (((long) (configure(bArr2, 60) << 4)) & 4294967295L) + (j * 30366549) + (j3 * 163752818);
        long init15 = (((long) init(bArr2, 63)) & 4294967295L) + (j * 163752818) + (j3 * 258169998);
        long configure17 = (((long) (configure(bArr2, 67) << 4)) & 4294967295L) + (j * 258169998) + (j3 * 96434764);
        long j5 = init9 + (j * 149865618) + (j3 * 550336261);
        long j6 = configure14 + (init12 >>> 28);
        long j7 = init12 & 268435455;
        long init16 = (((long) init(bArr2, 70)) & 4294967295L) + (j * 96434764) + (j3 * 227822194) + (j4 * 149865618) + (j6 * 550336261);
        long j8 = configure13 + (init11 >>> 28);
        long j9 = init11 & 268435455;
        long j10 = init15 + (j4 * 96434764) + (j6 * 227822194) + (j7 * 149865618) + (j8 * 550336261);
        long j11 = configure16 + (j4 * 258169998) + (j6 * 96434764) + (j7 * 227822194) + (j8 * 149865618) + (j9 * 550336261);
        long j12 = configure12 + (init10 >>> 28);
        long j13 = configure10 + (j * 227822194) + (j3 * 149865618) + (j4 * 550336261) + (init16 >>> 28);
        long j14 = j5 + (j13 >>> 28);
        long j15 = j2 + (j14 >>> 28);
        long j16 = j14 & 268435455;
        long j17 = (init10 & 268435455) + (j15 >>> 28);
        long j18 = j15 & 268435455;
        long j19 = configure5 + (j18 * 43969588);
        long j20 = init5 + (j17 * 43969588) + (j18 * 30366549);
        long j21 = configure6 + (j12 * 43969588) + (j17 * 30366549) + (j18 * 163752818);
        long j22 = init6 + (j9 * 43969588) + (j12 * 30366549) + (j17 * 163752818) + (j18 * 258169998);
        long j23 = configure7 + (j8 * 43969588) + (j9 * 30366549) + (j12 * 163752818) + (j17 * 258169998) + (j18 * 96434764);
        long j24 = init7 + (j7 * 43969588) + (j8 * 30366549) + (j9 * 163752818) + (j12 * 258169998) + (j17 * 96434764) + (j18 * 227822194);
        long j25 = init8 + (j4 * 43969588) + (j6 * 30366549) + (j7 * 163752818) + (j8 * 258169998) + (j9 * 96434764) + (j12 * 227822194) + (j17 * 149865618) + (j18 * 550336261);
        long j26 = j10 + (j11 >>> 28);
        long j27 = configure17 + (j4 * 227822194) + (j6 * 149865618) + (j7 * 550336261) + (j26 >>> 28);
        long j28 = (init16 & 268435455) + (j27 >>> 28);
        long j29 = j27 & 268435455;
        long j30 = (j13 & 268435455) + (j28 >>> 28);
        long j31 = j28 & 268435455;
        long j32 = init3 + (j31 * 43969588);
        long j33 = configure4 + (j30 * 43969588) + (j31 * 30366549);
        long j34 = init4 + (j16 * 43969588) + (j30 * 30366549) + (j31 * 163752818);
        long j35 = j19 + (j16 * 30366549) + (j30 * 163752818) + (j31 * 258169998);
        long j36 = j20 + (j16 * 163752818) + (j30 * 258169998) + (j31 * 96434764);
        long j37 = j21 + (j16 * 258169998) + (j30 * 96434764) + (j31 * 227822194);
        long j38 = j23 + (j16 * 227822194) + (j30 * 149865618) + (j31 * 550336261);
        long j39 = configure3 + (j29 * 43969588);
        long j40 = j22 + (j16 * 96434764) + (j30 * 227822194) + (j31 * 149865618) + (j29 * 550336261);
        long j41 = configure9 + (j3 * 43969588) + (j4 * 30366549) + (j6 * 163752818) + (j7 * 258169998) + (j8 * 96434764) + (j9 * 227822194) + (j12 * 149865618) + (j17 * 550336261) + (j25 >>> 28);
        long j42 = init14 + (j4 * 163752818) + (j6 * 258169998) + (j7 * 96434764) + (j8 * 227822194) + (j9 * 149865618) + (j12 * 550336261) + (j41 >>> 28);
        long j43 = j41 & 268435455;
        long j44 = (j11 & 268435455) + (j42 >>> 28);
        long j45 = (j26 & 268435455) + (j44 >>> 28);
        long j46 = j44 & 268435455;
        long j47 = init2 + (j45 * 43969588);
        long j48 = j39 + (j45 * 30366549);
        long j49 = j32 + (j29 * 30366549) + (j45 * 163752818);
        long j50 = j33 + (j29 * 163752818) + (j45 * 258169998);
        long j51 = j34 + (j29 * 258169998) + (j45 * 96434764);
        long j52 = j35 + (j29 * 96434764) + (j45 * 227822194);
        long j53 = j37 + (j29 * 149865618) + (j45 * 550336261);
        long j54 = j36 + (j29 * 227822194) + (j45 * 149865618) + (j46 * 550336261);
        long j55 = j43 & 67108863;
        long j56 = ((j42 & 268435455) << 2) + (j43 >>> 26) + 1;
        long init17 = (((long) init(bArr2, 0)) & 4294967295L) + (78101261 * j56);
        long j57 = configure2 + (43969588 * j46) + (141809365 * j56) + (init17 >>> 28);
        long j58 = j47 + (30366549 * j46) + (175155932 * j56) + (j57 >>> 28);
        long j59 = j48 + (163752818 * j46) + (64542499 * j56) + (j58 >>> 28);
        long j60 = j49 + (258169998 * j46) + (158326419 * j56) + (j59 >>> 28);
        long j61 = j50 + (96434764 * j46) + (191173276 * j56) + (j60 >>> 28);
        long j62 = j60 & 268435455;
        long j63 = j51 + (227822194 * j46) + (104575268 * j56) + (j61 >>> 28);
        long j64 = j61 & 268435455;
        long j65 = j52 + (149865618 * j46) + (j56 * 137584065) + (j63 >>> 28);
        long j66 = j54 + (j65 >>> 28);
        long j67 = j65 & 268435455;
        long j68 = j53 + (j66 >>> 28);
        long j69 = j66 & 268435455;
        long j70 = j40 + (j68 >>> 28);
        long j71 = j38 + (j70 >>> 28);
        long j72 = j24 + (j16 * 149865618) + (j30 * 550336261) + (j71 >>> 28);
        long j73 = configure8 + (j6 * 43969588) + (j7 * 30366549) + (j8 * 163752818) + (j9 * 258169998) + (j12 * 96434764) + (j17 * 227822194) + (j18 * 149865618) + (j16 * 550336261) + (j72 >>> 28);
        long j74 = (j25 & 268435455) + (j73 >>> 28);
        long j75 = j55 + (j74 >>> 28);
        long j76 = j74 & 268435455;
        long j77 = 67108863 & j75;
        long j78 = (j75 >>> 26) - 1;
        long j79 = (init17 & 268435455) - (78101261 & j78);
        long j80 = (j58 & 268435455) - (175155932 & j78);
        long j81 = (j59 & 268435455) - (64542499 & j78);
        long j82 = j62 - (158326419 & j78);
        long j83 = j64 - (191173276 & j78);
        long j84 = (j63 & 268435455) - (104575268 & j78);
        long j85 = j67 - (j78 & 137584065);
        long j86 = ((j57 & 268435455) - (141809365 & j78)) + (j79 >> 28);
        long j87 = j79 & 268435455;
        long j88 = j80 + (j86 >> 28);
        long j89 = j81 + (j88 >> 28);
        long j90 = j88 & 268435455;
        long j91 = j82 + (j89 >> 28);
        long j92 = j83 + (j91 >> 28);
        long j93 = j91 & 268435455;
        long j94 = j84 + (j92 >> 28);
        long j95 = j92 & 268435455;
        long j96 = j85 + (j94 >> 28);
        long j97 = j69 + (j96 >> 28);
        long j98 = j96 & 268435455;
        long j99 = (j68 & 268435455) + (j97 >> 28);
        long j100 = (j70 & 268435455) + (j99 >> 28);
        long j101 = (j71 & 268435455) + (j100 >> 28);
        long j102 = (j72 & 268435455) + (j101 >> 28);
        long j103 = (j73 & 268435455) + (j102 >> 28);
        long j104 = j76 + (j103 >> 28);
        byte[] bArr3 = new byte[57];
        init(((j86 & 268435455) << 28) | j87, bArr3, 0);
        init(((j89 & 268435455) << 28) | j90, bArr3, 7);
        init(j93 | (j95 << 28), bArr3, 14);
        init((j94 & 268435455) | (j98 << 28), bArr3, 21);
        init((j97 & 268435455) | ((j99 & 268435455) << 28), bArr3, 28);
        init((j100 & 268435455) | ((j101 & 268435455) << 28), bArr3, 35);
        init((j102 & 268435455) | ((j103 & 268435455) << 28), bArr3, 42);
        init((j104 & 268435455) | ((j77 + (j104 >> 28)) << 28), bArr3, 49);
        return bArr3;
    }

    private static void init(byte[] bArr, cca_continue cca_continue2) {
        cca_continue cca_continue3 = cca_continue2;
        cca_continue();
        cca_continue(cca_continue2);
        int i = 15;
        int[] iArr = new int[15];
        int i2 = 0;
        for (int i3 = 0; i3 < 14; i3++) {
            iArr[i3] = init(bArr, (i3 << 2) + 0);
        }
        int i4 = 1;
        iArr[14] = getErrorMessage.init(14, (~iArr[0]) & 1, iArr, init, iArr) + 4;
        getErrorMessage.init(15, iArr, 0);
        configure configure2 = new configure((byte) 0);
        int i5 = 17;
        while (true) {
            int i6 = i2;
            int i7 = i5;
            while (i6 < 5) {
                int i8 = i2;
                int i9 = i8;
                while (i8 < 5) {
                    i9 = (i9 & (~(i4 << i8))) ^ ((iArr[i7 >>> 5] >>> (i7 & 31)) << i8);
                    i7 += 18;
                    i8++;
                }
                int i10 = (i9 >>> 4) & i4;
                int i11 = ((-i10) ^ i9) & i;
                int i12 = ((i6 << 4) << i4) << 4;
                for (int i13 = i2; i13 < 16; i13++) {
                    int i14 = ((i13 ^ i11) - i4) >> 31;
                    getErrorMessage.configure(16, i14, onValidated, i12, configure2.configure);
                    int i15 = i12 + 16;
                    getErrorMessage.configure(16, i14, onValidated, i15, configure2.init);
                    i12 = i15 + 16;
                }
                int[] iArr2 = configure2.configure;
                int[] iArr3 = new int[16];
                KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr3, iArr2, iArr3);
                getErrorMessage.configure(16, i10, iArr3, i2, iArr2);
                int[] iArr4 = new int[16];
                int[] iArr5 = new int[16];
                int[] iArr6 = new int[16];
                int[] iArr7 = new int[16];
                int[] iArr8 = new int[16];
                int[] iArr9 = new int[16];
                int[] iArr10 = new int[16];
                KeyAgreementSpi.MQVwithSHA224CKDF.configure(cca_continue3.init, iArr4);
                KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(configure2.configure, cca_continue3.Cardinal, iArr5);
                KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(configure2.init, cca_continue3.configure, iArr6);
                KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr5, iArr6, iArr7);
                KeyAgreementSpi.MQVwithSHA224CKDF.configure(iArr7, 39081, iArr7);
                for (int i16 = 0; i16 < 16; i16++) {
                    iArr8[i16] = iArr4[i16] + iArr7[i16];
                }
                KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr4, iArr7, iArr9);
                int[] iArr11 = configure2.configure;
                int[] iArr12 = configure2.init;
                int[] iArr13 = iArr;
                for (int i17 = 0; i17 < 16; i17++) {
                    iArr4[i17] = iArr11[i17] + iArr12[i17];
                }
                int[] iArr14 = cca_continue3.Cardinal;
                int[] iArr15 = cca_continue3.configure;
                for (int i18 = 0; i18 < 16; i18++) {
                    iArr7[i18] = iArr14[i18] + iArr15[i18];
                }
                KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr4, iArr7, iArr10);
                for (int i19 = 0; i19 < 16; i19++) {
                    iArr4[i19] = iArr6[i19] + iArr5[i19];
                }
                KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr6, iArr5, iArr7);
                KeyAgreementSpi.MQVwithSHA224CKDF.getInstance(iArr4);
                KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr10, iArr4, iArr10);
                KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr10, cca_continue3.init, iArr10);
                KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr7, cca_continue3.init, iArr7);
                KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr8, iArr10, cca_continue3.Cardinal);
                KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr7, iArr9, cca_continue3.configure);
                KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr8, iArr9, cca_continue3.init);
                i6++;
                iArr = iArr13;
                i = 15;
                i2 = 0;
                i4 = 1;
            }
            int[] iArr16 = iArr;
            i5--;
            if (i5 >= 0) {
                configure(cca_continue2);
                iArr = iArr16;
                i = 15;
                i2 = 0;
                i4 = 1;
            } else {
                return;
            }
        }
    }

    public static void configure(ConcatKDF.init init2, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (init2 != null) {
            byte[] bArr2 = new byte[57];
            cca_continue(bArr, i, bArr2);
            cca_continue cca_continue2 = new cca_continue((byte) 0);
            init(bArr2, cca_continue2);
            int[] iArr3 = cca_continue2.Cardinal;
            for (int i2 = 0; i2 < 16; i2++) {
                iArr[i2 + 0] = iArr3[i2];
            }
            int[] iArr4 = cca_continue2.configure;
            for (int i3 = 0; i3 < 16; i3++) {
                iArr2[i3 + 0] = iArr4[i3];
            }
            return;
        }
        throw new NullPointerException("This method is only for use by X448");
    }

    public static void Cardinal(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, int i2, byte[] bArr5, int i3) {
        int i4;
        byte[] bArr6 = bArr3;
        byte[] bArr7 = bArr4;
        int i5 = i2;
        byte[] bArr8 = bArr5;
        if (bArr6 != null && bArr6.length < 256) {
            SignatureSpi.ecCVCDSA512 eccvcdsa512 = new SignatureSpi.ecCVCDSA512(256);
            byte[] bArr9 = new byte[114];
            eccvcdsa512.init(bArr, 0, 57);
            eccvcdsa512.getInstance(bArr9, 0, 114);
            byte[] bArr10 = new byte[57];
            cca_continue(bArr9, 0, bArr10);
            init((KeyAgreementSpi.DH) eccvcdsa512, (byte) 0, bArr6);
            eccvcdsa512.init(bArr9, 57, 57);
            eccvcdsa512.init(bArr7, 0, i5);
            eccvcdsa512.getInstance(bArr9, 0, 114);
            byte[] init2 = init(bArr9);
            byte[] bArr11 = new byte[57];
            cca_continue cca_continue2 = new cca_continue((byte) 0);
            init(init2, cca_continue2);
            configure(cca_continue2, bArr11, 0);
            init((KeyAgreementSpi.DH) eccvcdsa512, (byte) 0, bArr6);
            eccvcdsa512.init(bArr11, 0, 57);
            eccvcdsa512.init(bArr2, 0, 57);
            eccvcdsa512.init(bArr7, 0, i5);
            eccvcdsa512.getInstance(bArr9, 0, 114);
            byte[] init3 = init(bArr9);
            int[] iArr = new int[28];
            int i6 = 0;
            while (true) {
                if (i6 >= 14) {
                    break;
                }
                iArr[i6] = init(init2, (i6 << 2) + 0);
                i6++;
            }
            int[] iArr2 = new int[14];
            for (int i7 = 0; i7 < 14; i7++) {
                iArr2[i7] = init(init3, (i7 << 2) + 0);
            }
            int[] iArr3 = new int[14];
            for (int i8 = 0; i8 < 14; i8++) {
                iArr3[i8] = init(bArr10, (i8 << 2) + 0);
            }
            long j = 0;
            int i9 = 0;
            for (i4 = 14; i9 < i4; i4 = 14) {
                int i10 = i9 + 14;
                long Cardinal2 = (((long) getErrorMessage.Cardinal(i4, iArr2[i9], iArr3, iArr, i9)) & 4294967295L) + j + (((long) iArr[i10]) & 4294967295L);
                iArr[i10] = (int) Cardinal2;
                j = Cardinal2 >>> 32;
                i9++;
                iArr2 = iArr2;
            }
            byte[] bArr12 = new byte[114];
            for (int i11 = 0; i11 < 28; i11++) {
                cca_continue(iArr[i11], bArr12, i11 << 2);
            }
            byte[] init4 = init(bArr12);
            System.arraycopy(bArr11, 0, bArr8, 0, 57);
            System.arraycopy(init4, 0, bArr8, 57, 57);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0102, code lost:
        if ((r11 == 0) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean Cardinal(byte[] r17, byte[] r18, byte[] r19, byte[] r20, int r21) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 256(0x100, float:3.59E-43)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0011
            int r6 = r2.length
            if (r6 >= r3) goto L_0x0011
            r6 = r4
            goto L_0x0012
        L_0x0011:
            r6 = r5
        L_0x0012:
            if (r6 == 0) goto L_0x01d5
            r6 = 57
            byte[] r7 = com.cardinalcommerce.a.getBackgroundColor.cca_continue(r0, r5, r6)
            r8 = 114(0x72, float:1.6E-43)
            byte[] r0 = com.cardinalcommerce.a.getBackgroundColor.cca_continue(r0, r6, r8)
            boolean r9 = cca_continue((byte[]) r7)
            if (r9 != 0) goto L_0x0027
            return r5
        L_0x0027:
            r9 = 56
            byte r10 = r0[r9]
            r11 = 14
            if (r10 != 0) goto L_0x004a
            int[] r10 = new int[r11]
            r12 = r5
        L_0x0032:
            if (r12 >= r11) goto L_0x0040
            int r13 = r12 << 2
            int r13 = r13 + r5
            int r13 = init((byte[]) r0, (int) r13)
            r10[r12] = r13
            int r12 = r12 + 1
            goto L_0x0032
        L_0x0040:
            int[] r12 = init
            boolean r10 = com.cardinalcommerce.a.getErrorMessage.init((int) r11, (int[]) r10, (int[]) r12)
            if (r10 != 0) goto L_0x004a
            r10 = r4
            goto L_0x004b
        L_0x004a:
            r10 = r5
        L_0x004b:
            if (r10 != 0) goto L_0x004e
            return r5
        L_0x004e:
            com.cardinalcommerce.a.Base64URL$cca_continue r10 = new com.cardinalcommerce.a.Base64URL$cca_continue
            r10.<init>(r5)
            byte[] r12 = com.cardinalcommerce.a.getBackgroundColor.cca_continue(r1, r5, r6)
            boolean r13 = cca_continue((byte[]) r12)
            r14 = 7
            if (r13 != 0) goto L_0x0061
        L_0x005e:
            r6 = r5
            goto L_0x0129
        L_0x0061:
            byte r13 = r12[r9]
            r15 = r13 & 128(0x80, float:1.794E-43)
            int r15 = r15 >>> r14
            r13 = r13 & 127(0x7f, float:1.78E-43)
            byte r13 = (byte) r13
            r12[r9] = r13
            int[] r9 = r10.configure
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal((byte[]) r12, (int) r5, (int[]) r9)
            r9 = 16
            int[] r12 = new int[r9]
            int[] r13 = new int[r9]
            int[] r14 = r10.configure
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.configure(r14, r12)
            r14 = 39081(0x98a9, float:5.4764E-41)
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.configure(r12, r14, r13)
            int[] r14 = new int[r9]
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue((int[]) r14, (int[]) r12, (int[]) r12)
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            r14 = r13[r5]
            int r14 = r14 + r4
            r13[r5] = r14
            int[] r14 = r10.Cardinal
            int[] r11 = new int[r9]
            int[] r6 = new int[r9]
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.configure(r12, r11)
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal((int[]) r11, (int[]) r13, (int[]) r11)
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.configure(r11, r6)
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal((int[]) r11, (int[]) r12, (int[]) r11)
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal((int[]) r6, (int[]) r12, (int[]) r6)
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal((int[]) r6, (int[]) r13, (int[]) r6)
            int[] r8 = new int[r9]
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(r6, r8)
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal((int[]) r8, (int[]) r11, (int[]) r8)
            int[] r6 = new int[r9]
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.configure(r8, r6)
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal((int[]) r6, (int[]) r13, (int[]) r6)
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue((int[]) r12, (int[]) r6, (int[]) r6)
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue((int[]) r6, (int) r4)
            r11 = -1
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue((int[]) r6, (int) r11)
            r12 = r5
            r13 = r12
        L_0x00c4:
            if (r12 >= r9) goto L_0x00cd
            r16 = r6[r12]
            r13 = r13 | r16
            int r12 = r12 + 1
            goto L_0x00c4
        L_0x00cd:
            if (r13 != 0) goto L_0x00d1
            r6 = r4
            goto L_0x00d2
        L_0x00d1:
            r6 = r5
        L_0x00d2:
            if (r6 == 0) goto L_0x00e2
            r6 = r5
        L_0x00d5:
            if (r6 >= r9) goto L_0x00e0
            int r12 = r6 + 0
            r13 = r8[r6]
            r14[r12] = r13
            int r6 = r6 + 1
            goto L_0x00d5
        L_0x00e0:
            r6 = r4
            goto L_0x00e3
        L_0x00e2:
            r6 = r5
        L_0x00e3:
            if (r6 != 0) goto L_0x00e7
            goto L_0x005e
        L_0x00e7:
            int[] r6 = r10.Cardinal
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue((int[]) r6, (int) r4)
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue((int[]) r6, (int) r11)
            if (r15 != r4) goto L_0x0106
            int[] r6 = r10.Cardinal
            r8 = r5
            r11 = r8
        L_0x00f5:
            if (r8 >= r9) goto L_0x00fd
            r12 = r6[r8]
            r11 = r11 | r12
            int r8 = r8 + 1
            goto L_0x00f5
        L_0x00fd:
            if (r11 != 0) goto L_0x0101
            r6 = r4
            goto L_0x0102
        L_0x0101:
            r6 = r5
        L_0x0102:
            if (r6 == 0) goto L_0x0106
            goto L_0x005e
        L_0x0106:
            int[] r6 = r10.Cardinal
            r6 = r6[r5]
            r6 = r6 & r4
            if (r15 == r6) goto L_0x010f
            r6 = r4
            goto L_0x0110
        L_0x010f:
            r6 = r5
        L_0x0110:
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x011c
            int[] r6 = r10.Cardinal
            int[] r8 = r10.Cardinal
            int[] r11 = new int[r9]
            com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue((int[]) r11, (int[]) r6, (int[]) r8)
        L_0x011c:
            int[] r6 = r10.init
            r6[r5] = r4
            r8 = r4
        L_0x0121:
            if (r8 >= r9) goto L_0x0128
            r6[r8] = r5
            int r8 = r8 + 1
            goto L_0x0121
        L_0x0128:
            r6 = r4
        L_0x0129:
            if (r6 != 0) goto L_0x012c
            return r5
        L_0x012c:
            com.cardinalcommerce.a.SignatureSpi$ecCVCDSA512 r6 = new com.cardinalcommerce.a.SignatureSpi$ecCVCDSA512
            r6.<init>(r3)
            r3 = 114(0x72, float:1.6E-43)
            byte[] r8 = new byte[r3]
            init((com.cardinalcommerce.a.KeyAgreementSpi.DH) r6, (byte) r5, (byte[]) r2)
            r2 = 57
            r6.init(r7, r5, r2)
            r6.init(r1, r5, r2)
            r1 = r20
            r2 = r21
            r6.init(r1, r5, r2)
            r6.getInstance(r8, r5, r3)
            byte[] r1 = init(r8)
            r2 = 14
            int[] r3 = new int[r2]
            r6 = r5
        L_0x0153:
            if (r6 >= r2) goto L_0x0161
            int r8 = r6 << 2
            int r8 = r8 + r5
            int r8 = init((byte[]) r0, (int) r8)
            r3[r6] = r8
            int r6 = r6 + 1
            goto L_0x0153
        L_0x0161:
            int[] r0 = new int[r2]
            r6 = r5
        L_0x0164:
            if (r6 >= r2) goto L_0x0172
            int r8 = r6 << 2
            int r8 = r8 + r5
            int r8 = init((byte[]) r1, (int) r8)
            r0[r6] = r8
            int r6 = r6 + 1
            goto L_0x0164
        L_0x0172:
            com.cardinalcommerce.a.Base64URL$cca_continue r1 = new com.cardinalcommerce.a.Base64URL$cca_continue
            r1.<init>(r5)
            cca_continue()
            r2 = 7
            byte[] r2 = cca_continue(r3, r2)
            r3 = 5
            byte[] r0 = cca_continue(r0, r3)
            r3 = 8
            com.cardinalcommerce.a.Base64URL$cca_continue[] r3 = configure((com.cardinalcommerce.a.Base64URL.cca_continue) r10, (int) r3)
            cca_continue((com.cardinalcommerce.a.Base64URL.cca_continue) r1)
            r6 = 447(0x1bf, float:6.26E-43)
        L_0x018f:
            if (r6 <= 0) goto L_0x019b
            byte r8 = r2[r6]
            byte r9 = r0[r6]
            r8 = r8 | r9
            if (r8 != 0) goto L_0x019b
            int r6 = r6 + -1
            goto L_0x018f
        L_0x019b:
            byte r8 = r2[r6]
            if (r8 == 0) goto L_0x01af
            int r9 = r8 >> 31
            r8 = r8 ^ r9
            int r8 = r8 >>> r4
            if (r9 == 0) goto L_0x01a7
            r9 = r4
            goto L_0x01a8
        L_0x01a7:
            r9 = r5
        L_0x01a8:
            com.cardinalcommerce.a.Base64URL$cca_continue[] r10 = onCReqSuccess
            r8 = r10[r8]
            init((boolean) r9, (com.cardinalcommerce.a.Base64URL.cca_continue) r8, (com.cardinalcommerce.a.Base64URL.cca_continue) r1)
        L_0x01af:
            byte r8 = r0[r6]
            if (r8 == 0) goto L_0x01c1
            int r9 = r8 >> 31
            r8 = r8 ^ r9
            int r8 = r8 >>> r4
            if (r9 == 0) goto L_0x01bb
            r9 = r4
            goto L_0x01bc
        L_0x01bb:
            r9 = r5
        L_0x01bc:
            r8 = r3[r8]
            init((boolean) r9, (com.cardinalcommerce.a.Base64URL.cca_continue) r8, (com.cardinalcommerce.a.Base64URL.cca_continue) r1)
        L_0x01c1:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x01c9
            configure(r1)
            goto L_0x019b
        L_0x01c9:
            r6 = 57
            byte[] r0 = new byte[r6]
            configure(r1, r0, r5)
            boolean r0 = com.cardinalcommerce.a.getBackgroundColor.Cardinal((byte[]) r0, (byte[]) r7)
            return r0
        L_0x01d5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "ctx"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.Base64URL.Cardinal(byte[], byte[], byte[], byte[], int):boolean");
    }
}
