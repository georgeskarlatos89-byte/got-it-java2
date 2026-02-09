package com.cardinalcommerce.a;

import androidx.core.view.MotionEventCompat;
import com.cardinalcommerce.a.ECKey;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.security.SecureRandom;

public abstract class Curve {
    private static final int[] Cardinal = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    private static final int[] cca_continue = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] cleanup = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    private static final int[] configure = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    private static final int[] getInstance = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static getInstance[] getSDKVersion = null;
    private static final int[] getWarnings = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    private static final byte[] init = getTextFontSize.configure("SigEd25519 no Ed25519 collisions");
    private static final int[] onCReqSuccess = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    private static Object onValidated = new Object();
    private static int[] valueOf = null;

    static class Cardinal {
        int[] cca_continue;
        int[] configure;
        int[] init;

        private Cardinal() {
            this.init = DeflateHelper.configure();
            this.cca_continue = DeflateHelper.configure();
            this.configure = DeflateHelper.configure();
        }

        /* synthetic */ Cardinal(byte b) {
            this();
        }
    }

    static class cca_continue {
        int[] Cardinal;
        int[] cca_continue;
        int[] configure;
        int[] getInstance;
        int[] init;

        private cca_continue() {
            this.configure = DeflateHelper.configure();
            this.getInstance = DeflateHelper.configure();
            this.Cardinal = DeflateHelper.configure();
            this.cca_continue = DeflateHelper.configure();
            this.init = DeflateHelper.configure();
        }

        /* synthetic */ cca_continue(byte b) {
            this();
        }
    }

    static class getInstance {
        int[] cca_continue;
        int[] configure;
        int[] getInstance;
        int[] init;

        private getInstance() {
            this.init = DeflateHelper.configure();
            this.configure = DeflateHelper.configure();
            this.cca_continue = DeflateHelper.configure();
            this.getInstance = DeflateHelper.configure();
        }

        /* synthetic */ getInstance(byte b) {
            this();
        }
    }

    private static int Cardinal(byte[] bArr, int i) {
        int i2 = i + 1;
        return ((bArr[i2 + 1] & 255) << Ascii.DLE) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
    }

    private static void Cardinal(cca_continue cca_continue2) {
        DeflateHelper.getSDKVersion(cca_continue2.configure);
        DeflateHelper.getInstance(cca_continue2.getInstance);
        DeflateHelper.getInstance(cca_continue2.Cardinal);
        DeflateHelper.getSDKVersion(cca_continue2.cca_continue);
        DeflateHelper.getInstance(cca_continue2.init);
    }

    public static void Cardinal(ECKey.Cardinal cardinal, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (cardinal != null) {
            byte[] bArr2 = new byte[32];
            init(bArr, i, bArr2);
            cca_continue cca_continue2 = new cca_continue((byte) 0);
            init(bArr2, cca_continue2);
            DeflateHelper.init(cca_continue2.getInstance, iArr, 0);
            DeflateHelper.init(cca_continue2.Cardinal, iArr2, 0);
            return;
        }
        throw new NullPointerException("This method is only for use by X25519");
    }

    public static void Cardinal(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    private static byte[] Cardinal(byte[] bArr) {
        byte[] bArr2 = bArr;
        long Cardinal2 = ((long) (Cardinal(bArr2, 4) << 4)) & 4294967295L;
        long cca_continue2 = ((long) cca_continue(bArr2, 7)) & 4294967295L;
        long Cardinal3 = ((long) (Cardinal(bArr2, 11) << 4)) & 4294967295L;
        long cca_continue3 = ((long) cca_continue(bArr2, 14)) & 4294967295L;
        long Cardinal4 = ((long) (Cardinal(bArr2, 18) << 4)) & 4294967295L;
        long cca_continue4 = ((long) cca_continue(bArr2, 21)) & 4294967295L;
        long Cardinal5 = ((long) (Cardinal(bArr2, 25) << 4)) & 4294967295L;
        long cca_continue5 = ((long) cca_continue(bArr2, 28)) & 4294967295L;
        long cca_continue6 = ((long) cca_continue(bArr2, 49)) & 4294967295L;
        long Cardinal6 = ((long) (Cardinal(bArr2, 53) << 4)) & 4294967295L;
        long cca_continue7 = ((long) cca_continue(bArr2, 56)) & 4294967295L;
        long Cardinal7 = ((long) (Cardinal(bArr2, 60) << 4)) & 4294967295L;
        long j = ((long) bArr2[63]) & 255;
        long Cardinal8 = (((long) (Cardinal(bArr2, 46) << 4)) & 4294967295L) - (j * 5343);
        long j2 = Cardinal7 + (cca_continue7 >> 28);
        long j3 = cca_continue7 & 268435455;
        long j4 = cca_continue5 - (j2 * -50998291);
        long Cardinal9 = ((((long) (Cardinal(bArr2, 32) << 4)) & 4294967295L) - (j * -50998291)) - (j2 * 19280294);
        long cca_continue8 = ((((long) cca_continue(bArr2, 35)) & 4294967295L) - (j * 19280294)) - (j2 * 127719000);
        long cca_continue9 = ((((long) cca_continue(bArr2, 42)) & 4294967295L) - (j * -6428113)) - (j2 * 5343);
        long j5 = Cardinal5 - (j3 * -50998291);
        long Cardinal10 = (((((long) (Cardinal(bArr2, 39) << 4)) & 4294967295L) - (j * 127719000)) - (j2 * -6428113)) - (j3 * 5343);
        long j6 = Cardinal6 + (cca_continue6 >> 28);
        long j7 = cca_continue6 & 268435455;
        long j8 = (cca_continue8 - (j3 * -6428113)) - (j6 * 5343);
        long j9 = ((Cardinal9 - (j3 * 127719000)) - (j6 * -6428113)) - (j7 * 5343);
        long j10 = Cardinal8 + (cca_continue9 >> 28);
        long j11 = (cca_continue9 & 268435455) + (Cardinal10 >> 28);
        long j12 = Cardinal3 - (j11 * -50998291);
        long j13 = (cca_continue3 - (j10 * -50998291)) - (j11 * 19280294);
        long j14 = ((Cardinal4 - (j7 * -50998291)) - (j10 * 19280294)) - (j11 * 127719000);
        long j15 = (((j5 - (j6 * 19280294)) - (j7 * 127719000)) - (j10 * -6428113)) - (j11 * 5343);
        long j16 = (Cardinal10 & 268435455) + (j8 >> 28);
        long j17 = j8 & 268435455;
        long j18 = cca_continue2 - (j16 * -50998291);
        long j19 = j12 - (j16 * 19280294);
        long j20 = j13 - (j16 * 127719000);
        long j21 = ((((cca_continue4 - (j6 * -50998291)) - (j7 * 19280294)) - (j10 * 127719000)) - (j11 * -6428113)) - (j16 * 5343);
        long j22 = j17 + (j9 >> 28);
        long j23 = j18 - (j22 * 19280294);
        long j24 = j19 - (j22 * 127719000);
        long j25 = j20 - (j22 * -6428113);
        long j26 = (j14 - (j16 * -6428113)) - (j22 * 5343);
        long j27 = ((((j4 - (j3 * 19280294)) - (j6 * 127719000)) - (j7 * -6428113)) - (j10 * 5343)) + (j15 >> 28);
        long j28 = j27 & 268435455;
        long j29 = j28 >>> 27;
        long j30 = (j9 & 268435455) + (j27 >> 28) + j29;
        long cca_continue10 = (((long) cca_continue(bArr2, 0)) & 4294967295L) - (j30 * -50998291);
        long j31 = ((Cardinal2 - (j22 * -50998291)) - (j30 * 19280294)) + (cca_continue10 >> 28);
        long j32 = cca_continue10 & 268435455;
        long j33 = (j23 - (j30 * 127719000)) + (j31 >> 28);
        long j34 = (j24 - (j30 * -6428113)) + (j33 >> 28);
        long j35 = (j25 - (j30 * 5343)) + (j34 >> 28);
        long j36 = j26 + (j35 >> 28);
        long j37 = j35 & 268435455;
        long j38 = j21 + (j36 >> 28);
        long j39 = (j15 & 268435455) + (j38 >> 28);
        long j40 = j28 + (j39 >> 28);
        long j41 = (j40 >> 28) - j29;
        long j42 = j32 + (j41 & -50998291);
        long j43 = (j31 & 268435455) + (j41 & 19280294) + (j42 >> 28);
        long j44 = (j33 & 268435455) + (j41 & 127719000) + (j43 >> 28);
        long j45 = (j34 & 268435455) + (j41 & -6428113) + (j44 >> 28);
        long j46 = j37 + (j41 & 5343) + (j45 >> 28);
        long j47 = (j36 & 268435455) + (j46 >> 28);
        long j48 = (j38 & 268435455) + (j47 >> 28);
        long j49 = (j39 & 268435455) + (j48 >> 28);
        byte[] bArr3 = new byte[32];
        Cardinal((j42 & 268435455) | ((j43 & 268435455) << 28), bArr3, 0);
        Cardinal(((j45 & 268435455) << 28) | (j44 & 268435455), bArr3, 7);
        Cardinal((j46 & 268435455) | ((j47 & 268435455) << 28), bArr3, 14);
        Cardinal((j48 & 268435455) | ((j49 & 268435455) << 28), bArr3, 21);
        cca_continue((int) ((j40 & 268435455) + (j49 >> 28)), bArr3, 28);
        return bArr3;
    }

    private static int cca_continue(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << Ascii.DLE);
    }

    private static void cca_continue(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    private static void cca_continue(boolean z, getInstance getinstance, cca_continue cca_continue2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] configure2 = DeflateHelper.configure();
        int[] configure3 = DeflateHelper.configure();
        int[] configure4 = DeflateHelper.configure();
        int[] configure5 = DeflateHelper.configure();
        int[] iArr5 = cca_continue2.cca_continue;
        int[] configure6 = DeflateHelper.configure();
        int[] configure7 = DeflateHelper.configure();
        int[] iArr6 = cca_continue2.init;
        if (z) {
            iArr = configure4;
            iArr4 = configure5;
            iArr3 = configure6;
            iArr2 = configure7;
        } else {
            iArr4 = configure4;
            iArr = configure5;
            iArr2 = configure6;
            iArr3 = configure7;
        }
        DeflateHelper.init(cca_continue2.getInstance, cca_continue2.configure, configure3, configure2);
        DeflateHelper.init(getinstance.configure, getinstance.init, iArr, iArr4);
        DeflateHelper.getInstance(configure2, configure4, configure2);
        DeflateHelper.getInstance(configure3, configure5, configure3);
        DeflateHelper.getInstance(cca_continue2.cca_continue, cca_continue2.init, configure4);
        DeflateHelper.getInstance(configure4, getinstance.getInstance, configure4);
        DeflateHelper.getInstance(configure4, cleanup, configure4);
        DeflateHelper.getInstance(cca_continue2.Cardinal, getinstance.cca_continue, configure5);
        DeflateHelper.cca_continue(configure5, configure5, configure5);
        DeflateHelper.init(configure3, configure2, iArr6, iArr5);
        DeflateHelper.init(configure5, configure4, iArr3, iArr2);
        DeflateHelper.cca_continue(iArr3);
        DeflateHelper.getInstance(iArr5, configure6, cca_continue2.configure);
        DeflateHelper.getInstance(configure7, iArr6, cca_continue2.getInstance);
        DeflateHelper.getInstance(configure6, configure7, cca_continue2.Cardinal);
    }

    private static void cca_continue(boolean z, getInstance getinstance, getInstance getinstance2, getInstance getinstance3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        getInstance getinstance4 = getinstance;
        getInstance getinstance5 = getinstance2;
        getInstance getinstance6 = getinstance3;
        int[] configure2 = DeflateHelper.configure();
        int[] configure3 = DeflateHelper.configure();
        int[] configure4 = DeflateHelper.configure();
        int[] configure5 = DeflateHelper.configure();
        int[] configure6 = DeflateHelper.configure();
        int[] configure7 = DeflateHelper.configure();
        int[] configure8 = DeflateHelper.configure();
        int[] configure9 = DeflateHelper.configure();
        if (z) {
            iArr4 = configure4;
            iArr3 = configure5;
            iArr2 = configure7;
            iArr = configure8;
        } else {
            iArr3 = configure4;
            iArr4 = configure5;
            iArr = configure7;
            iArr2 = configure8;
        }
        DeflateHelper.init(getinstance4.configure, getinstance4.init, configure3, configure2);
        DeflateHelper.init(getinstance5.configure, getinstance5.init, iArr4, iArr3);
        DeflateHelper.getInstance(configure2, configure4, configure2);
        DeflateHelper.getInstance(configure3, configure5, configure3);
        DeflateHelper.getInstance(getinstance4.getInstance, getinstance5.getInstance, configure4);
        DeflateHelper.getInstance(configure4, cleanup, configure4);
        DeflateHelper.getInstance(getinstance4.cca_continue, getinstance5.cca_continue, configure5);
        DeflateHelper.cca_continue(configure5, configure5, configure5);
        DeflateHelper.init(configure3, configure2, configure9, configure6);
        DeflateHelper.init(configure5, configure4, iArr2, iArr);
        DeflateHelper.cca_continue(iArr2);
        DeflateHelper.getInstance(configure6, configure7, getinstance6.init);
        int[] iArr5 = configure8;
        DeflateHelper.getInstance(iArr5, configure9, getinstance6.configure);
        DeflateHelper.getInstance(configure7, iArr5, getinstance6.cca_continue);
        DeflateHelper.getInstance(configure6, configure9, getinstance6.getInstance);
    }

    private static getInstance getInstance(cca_continue cca_continue2) {
        getInstance getinstance = new getInstance((byte) 0);
        DeflateHelper.init(cca_continue2.configure, getinstance.init, 0);
        DeflateHelper.init(cca_continue2.getInstance, getinstance.configure, 0);
        DeflateHelper.init(cca_continue2.Cardinal, getinstance.cca_continue, 0);
        DeflateHelper.getInstance(cca_continue2.cca_continue, cca_continue2.init, getinstance.getInstance);
        return getinstance;
    }

    private static void init(cca_continue cca_continue2) {
        int[] configure2 = DeflateHelper.configure();
        int[] configure3 = DeflateHelper.configure();
        int[] configure4 = DeflateHelper.configure();
        int[] iArr = cca_continue2.cca_continue;
        int[] configure5 = DeflateHelper.configure();
        int[] configure6 = DeflateHelper.configure();
        int[] iArr2 = cca_continue2.init;
        DeflateHelper.Cardinal(cca_continue2.configure, configure2);
        DeflateHelper.Cardinal(cca_continue2.getInstance, configure3);
        DeflateHelper.Cardinal(cca_continue2.Cardinal, configure4);
        DeflateHelper.cca_continue(configure4, configure4, configure4);
        DeflateHelper.init(configure2, configure3, iArr2, configure6);
        DeflateHelper.cca_continue(cca_continue2.configure, cca_continue2.getInstance, iArr);
        DeflateHelper.Cardinal(iArr, iArr);
        DeflateHelper.configure(iArr2, iArr, iArr);
        DeflateHelper.cca_continue(configure4, configure6, configure5);
        DeflateHelper.cca_continue(configure5);
        DeflateHelper.getInstance(iArr, configure5, cca_continue2.configure);
        DeflateHelper.getInstance(configure6, iArr2, cca_continue2.getInstance);
        DeflateHelper.getInstance(configure5, configure6, cca_continue2.Cardinal);
    }

    private static void init(cca_continue cca_continue2, byte[] bArr, int i) {
        int[] configure2 = DeflateHelper.configure();
        int[] configure3 = DeflateHelper.configure();
        DeflateHelper.cca_continue(cca_continue2.Cardinal, configure3);
        DeflateHelper.getInstance(cca_continue2.configure, configure3, configure2);
        DeflateHelper.getInstance(cca_continue2.getInstance, configure3, configure3);
        DeflateHelper.configure(configure2);
        DeflateHelper.configure(configure3);
        DeflateHelper.init(configure3, bArr, 0);
        bArr[31] = (byte) (((configure2[0] & 1) << 7) | bArr[31]);
    }

    private static void init(IESCipher.ECIESwithAESCBC eCIESwithAESCBC, byte b, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = init;
            eCIESwithAESCBC.init(bArr2, 0, bArr2.length);
            eCIESwithAESCBC.cca_continue(b);
            eCIESwithAESCBC.cca_continue((byte) bArr.length);
            eCIESwithAESCBC.init(bArr, 0, bArr.length);
        }
    }

    private static void init(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b = (byte) (bArr2[31] & Byte.MAX_VALUE);
        bArr2[31] = b;
        bArr2[31] = (byte) (b | SignedBytes.MAX_POWER_OF_TWO);
    }

    private static byte[] init(int[] iArr, int i) {
        int i2;
        int[] iArr2 = new int[16];
        int i3 = 0;
        int i4 = 8;
        int i5 = 16;
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
        byte[] bArr = new byte[256];
        int i9 = 1 << i;
        int i10 = i9 - 1;
        int i11 = i9 >>> 1;
        int i12 = 0;
        int i13 = 0;
        while (i3 < 16) {
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

    private static boolean configure(byte[] bArr) {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = cca_continue(bArr, (i << 2) + 0);
        }
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !setErrorCode.cca_continue(iArr, getInstance);
    }

    private static void Cardinal(long j, byte[] bArr, int i) {
        cca_continue((int) j, bArr, i);
        int i2 = (int) (j >>> 32);
        int i3 = i + 4;
        bArr[i3] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        bArr[i4 + 1] = (byte) (i2 >>> 16);
    }

    public static void configure(byte[] bArr, byte[] bArr2) {
        KeyPairGeneratorSpi.ECMQV ecmqv = new KeyPairGeneratorSpi.ECMQV();
        byte[] bArr3 = new byte[ecmqv.getInstance()];
        ecmqv.init(bArr, 0, 32);
        ecmqv.init(bArr3, 0);
        byte[] bArr4 = new byte[32];
        init(bArr3, 0, bArr4);
        cca_continue cca_continue2 = new cca_continue((byte) 0);
        init(bArr4, cca_continue2);
        init(cca_continue2, bArr2, 0);
    }

    private static getInstance[] configure(getInstance getinstance, int i) {
        getInstance getinstance2 = new getInstance((byte) 0);
        cca_continue(false, getinstance, getinstance, getinstance2);
        getInstance[] getinstanceArr = new getInstance[i];
        getInstance getinstance3 = new getInstance((byte) 0);
        DeflateHelper.init(getinstance.init, getinstance3.init, 0);
        DeflateHelper.init(getinstance.configure, getinstance3.configure, 0);
        DeflateHelper.init(getinstance.cca_continue, getinstance3.cca_continue, 0);
        DeflateHelper.init(getinstance.getInstance, getinstance3.getInstance, 0);
        getinstanceArr[0] = getinstance3;
        for (int i2 = 1; i2 < i; i2++) {
            getInstance getinstance4 = getinstanceArr[i2 - 1];
            getInstance getinstance5 = new getInstance((byte) 0);
            getinstanceArr[i2] = getinstance5;
            cca_continue(false, getinstance4, getinstance2, getinstance5);
        }
        return getinstanceArr;
    }

    private static void getInstance() {
        synchronized (onValidated) {
            if (valueOf == null) {
                getInstance getinstance = new getInstance((byte) 0);
                int[] iArr = configure;
                DeflateHelper.init(iArr, getinstance.init, 0);
                int[] iArr2 = Cardinal;
                DeflateHelper.init(iArr2, getinstance.configure, 0);
                DeflateHelper.getInstance(getinstance.cca_continue);
                DeflateHelper.getInstance(getinstance.init, getinstance.configure, getinstance.getInstance);
                getSDKVersion = configure(getinstance, 32);
                cca_continue cca_continue2 = new cca_continue((byte) 0);
                DeflateHelper.init(iArr, cca_continue2.configure, 0);
                DeflateHelper.init(iArr2, cca_continue2.getInstance, 0);
                DeflateHelper.getInstance(cca_continue2.Cardinal);
                DeflateHelper.init(cca_continue2.configure, cca_continue2.cca_continue, 0);
                DeflateHelper.init(cca_continue2.getInstance, cca_continue2.init, 0);
                valueOf = new int[1920];
                int i = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    getInstance[] getinstanceArr = new getInstance[4];
                    getInstance getinstance2 = new getInstance((byte) 0);
                    DeflateHelper.getSDKVersion(getinstance2.init);
                    DeflateHelper.getInstance(getinstance2.configure);
                    DeflateHelper.getInstance(getinstance2.cca_continue);
                    DeflateHelper.getSDKVersion(getinstance2.getInstance);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 4) {
                            break;
                        }
                        cca_continue(true, getinstance2, getInstance(cca_continue2), getinstance2);
                        init(cca_continue2);
                        getinstanceArr[i3] = getInstance(cca_continue2);
                        if (i2 + i3 != 10) {
                            for (int i4 = 1; i4 < 8; i4++) {
                                init(cca_continue2);
                            }
                        }
                        i3++;
                    }
                    getInstance[] getinstanceArr2 = new getInstance[8];
                    getinstanceArr2[0] = getinstance2;
                    int i5 = 1;
                    for (int i6 = 0; i6 < 3; i6++) {
                        int i7 = 1 << i6;
                        int i8 = 0;
                        while (i8 < i7) {
                            getInstance getinstance3 = getinstanceArr2[i5 - i7];
                            getInstance getinstance4 = getinstanceArr[i6];
                            getInstance getinstance5 = new getInstance((byte) 0);
                            getinstanceArr2[i5] = getinstance5;
                            cca_continue(false, getinstance3, getinstance4, getinstance5);
                            i8++;
                            i5++;
                        }
                    }
                    for (int i9 = 0; i9 < 8; i9++) {
                        getInstance getinstance6 = getinstanceArr2[i9];
                        int[] configure2 = DeflateHelper.configure();
                        int[] configure3 = DeflateHelper.configure();
                        DeflateHelper.cca_continue(getinstance6.cca_continue, getinstance6.cca_continue, configure2);
                        DeflateHelper.cca_continue(configure2, configure3);
                        DeflateHelper.getInstance(getinstance6.init, configure3, configure2);
                        DeflateHelper.getInstance(getinstance6.configure, configure3, configure3);
                        Cardinal cardinal = new Cardinal((byte) 0);
                        DeflateHelper.init(configure3, configure2, cardinal.init, cardinal.cca_continue);
                        DeflateHelper.getInstance(configure2, configure3, cardinal.configure);
                        DeflateHelper.getInstance(cardinal.configure, onCReqSuccess, cardinal.configure);
                        DeflateHelper.configure(cardinal.init);
                        DeflateHelper.configure(cardinal.cca_continue);
                        DeflateHelper.init(cardinal.init, valueOf, i);
                        int i10 = i + 10;
                        DeflateHelper.init(cardinal.cca_continue, valueOf, i10);
                        int i11 = i10 + 10;
                        DeflateHelper.init(cardinal.configure, valueOf, i11);
                        i = i11 + 10;
                    }
                }
            }
        }
    }

    private static void init(byte[] bArr, cca_continue cca_continue2) {
        cca_continue cca_continue3 = cca_continue2;
        getInstance();
        Cardinal(cca_continue2);
        int i = 8;
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = cca_continue(bArr, (i2 << 2) + 0);
        }
        getErrorMessage.init(8, (~iArr[0]) & 1, iArr, cca_continue, iArr);
        getErrorMessage.init(8, iArr, 1);
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = iArr[i3];
            int i5 = ((i4 >>> 7) ^ i4) & 11141290;
            int i6 = i4 ^ (i5 ^ (i5 << 7));
            int i7 = ((i6 >>> 14) ^ i6) & 52428;
            int i8 = i6 ^ (i7 ^ (i7 << 14));
            int i9 = ((i8 >>> 4) ^ i8) & 15728880;
            int i10 = i8 ^ (i9 ^ (i9 << 4));
            int i11 = ((i10 >>> 8) ^ i10) & MotionEventCompat.ACTION_POINTER_INDEX_MASK;
            iArr[i3] = i10 ^ (i11 ^ (i11 << 8));
        }
        Cardinal cardinal = new Cardinal((byte) 0);
        int i12 = 28;
        while (true) {
            int i13 = 0;
            while (i13 < i) {
                int i14 = iArr[i13] >>> i12;
                int i15 = (i14 >>> 3) & 1;
                int i16 = (i14 ^ (-i15)) & 7;
                int i17 = (i13 << 3) * 3 * 10;
                for (int i18 = 0; i18 < i; i18++) {
                    int i19 = ((i18 ^ i16) - 1) >> 31;
                    getErrorMessage.configure(10, i19, valueOf, i17, cardinal.init);
                    int i20 = i17 + 10;
                    getErrorMessage.configure(10, i19, valueOf, i20, cardinal.cca_continue);
                    int i21 = i20 + 10;
                    getErrorMessage.configure(10, i19, valueOf, i21, cardinal.configure);
                    i17 = i21 + 10;
                }
                DeflateHelper.Cardinal(i15, cardinal.init, cardinal.cca_continue);
                DeflateHelper.init(i15, cardinal.configure);
                int[] configure2 = DeflateHelper.configure();
                int[] configure3 = DeflateHelper.configure();
                int[] configure4 = DeflateHelper.configure();
                int[] iArr2 = cca_continue3.cca_continue;
                int[] configure5 = DeflateHelper.configure();
                int[] configure6 = DeflateHelper.configure();
                int[] iArr3 = cca_continue3.init;
                DeflateHelper.init(cca_continue3.getInstance, cca_continue3.configure, configure3, configure2);
                DeflateHelper.getInstance(configure2, cardinal.cca_continue, configure2);
                DeflateHelper.getInstance(configure3, cardinal.init, configure3);
                DeflateHelper.getInstance(cca_continue3.cca_continue, cca_continue3.init, configure4);
                DeflateHelper.getInstance(configure4, cardinal.configure, configure4);
                DeflateHelper.init(configure3, configure2, iArr3, iArr2);
                DeflateHelper.init(cca_continue3.Cardinal, configure4, configure6, configure5);
                DeflateHelper.cca_continue(configure6);
                DeflateHelper.getInstance(iArr2, configure5, cca_continue3.configure);
                DeflateHelper.getInstance(configure6, iArr3, cca_continue3.getInstance);
                DeflateHelper.getInstance(configure5, configure6, cca_continue3.Cardinal);
                i13++;
                i = 8;
            }
            i12 -= 4;
            if (i12 >= 0) {
                init(cca_continue2);
                i = 8;
            } else {
                return;
            }
        }
    }

    public static void getInstance(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, byte[] bArr4, int i3) {
        KeyPairGeneratorSpi.ECMQV ecmqv = new KeyPairGeneratorSpi.ECMQV();
        byte[] bArr5 = new byte[ecmqv.getInstance()];
        ecmqv.init(bArr, 0, 32);
        ecmqv.init(bArr5, 0);
        byte[] bArr6 = new byte[32];
        init(bArr5, 0, bArr6);
        init((IESCipher.ECIESwithAESCBC) ecmqv, (byte) 0, (byte[]) null);
        ecmqv.init(bArr5, 32, 32);
        ecmqv.init(bArr3, 0, i2);
        ecmqv.init(bArr5, 0);
        byte[] Cardinal2 = Cardinal(bArr5);
        byte[] bArr7 = new byte[32];
        cca_continue cca_continue2 = new cca_continue((byte) 0);
        init(Cardinal2, cca_continue2);
        init(cca_continue2, bArr7, 0);
        init((IESCipher.ECIESwithAESCBC) ecmqv, (byte) 0, (byte[]) null);
        ecmqv.init(bArr7, 0, 32);
        ecmqv.init(bArr2, 0, 32);
        ecmqv.init(bArr3, 0, i2);
        ecmqv.init(bArr5, 0);
        byte[] Cardinal3 = Cardinal(bArr5);
        int[] iArr = new int[16];
        for (int i4 = 0; i4 < 8; i4++) {
            iArr[i4] = cca_continue(Cardinal2, (i4 << 2) + 0);
        }
        int[] iArr2 = new int[8];
        for (int i5 = 0; i5 < 8; i5++) {
            iArr2[i5] = cca_continue(Cardinal3, (i5 << 2) + 0);
        }
        int[] iArr3 = new int[8];
        for (int i6 = 0; i6 < 8; i6++) {
            iArr3[i6] = cca_continue(bArr6, (i6 << 2) + 0);
        }
        setErrorCode.configure(iArr2, iArr3, iArr);
        byte[] bArr8 = new byte[64];
        for (int i7 = 0; i7 < 16; i7++) {
            cca_continue(iArr[i7], bArr8, i7 << 2);
        }
        byte[] Cardinal4 = Cardinal(bArr8);
        System.arraycopy(bArr7, 0, bArr4, 0, 32);
        System.arraycopy(Cardinal4, 0, bArr4, 32, 32);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean init(byte[] r11, byte[] r12, byte[] r13, int r14) {
        /*
            r0 = 0
            r1 = 32
            byte[] r2 = com.cardinalcommerce.a.getBackgroundColor.cca_continue(r11, r0, r1)
            r3 = 64
            byte[] r11 = com.cardinalcommerce.a.getBackgroundColor.cca_continue(r11, r1, r3)
            boolean r3 = configure(r2)
            if (r3 != 0) goto L_0x0014
            return r0
        L_0x0014:
            r3 = 8
            int[] r4 = new int[r3]
            r5 = r0
        L_0x0019:
            if (r5 >= r3) goto L_0x0027
            int r6 = r5 << 2
            int r6 = r6 + r0
            int r6 = cca_continue(r11, r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0019
        L_0x0027:
            int[] r5 = cca_continue
            boolean r4 = com.cardinalcommerce.a.setErrorCode.cca_continue(r4, r5)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 != 0) goto L_0x0032
            return r0
        L_0x0032:
            com.cardinalcommerce.a.Curve$getInstance r4 = new com.cardinalcommerce.a.Curve$getInstance
            r4.<init>(r0)
            byte[] r6 = com.cardinalcommerce.a.getBackgroundColor.cca_continue(r12, r0, r1)
            boolean r7 = configure(r6)
            r8 = 7
            if (r7 != 0) goto L_0x0044
        L_0x0042:
            r6 = r0
            goto L_0x00a9
        L_0x0044:
            r7 = 31
            byte r9 = r6[r7]
            r10 = r9 & 128(0x80, float:1.794E-43)
            int r10 = r10 >>> r8
            r9 = r9 & 127(0x7f, float:1.78E-43)
            byte r9 = (byte) r9
            r6[r7] = r9
            int[] r7 = r4.configure
            com.cardinalcommerce.a.DeflateHelper.cca_continue((byte[]) r6, (int) r0, (int[]) r7)
            int[] r6 = com.cardinalcommerce.a.DeflateHelper.configure()
            int[] r7 = com.cardinalcommerce.a.DeflateHelper.configure()
            int[] r9 = r4.configure
            com.cardinalcommerce.a.DeflateHelper.Cardinal(r9, r6)
            int[] r9 = getWarnings
            com.cardinalcommerce.a.DeflateHelper.getInstance(r9, r6, r7)
            com.cardinalcommerce.a.DeflateHelper.cleanup(r6)
            com.cardinalcommerce.a.DeflateHelper.init(r7)
            int[] r9 = r4.init
            boolean r6 = com.cardinalcommerce.a.DeflateHelper.Cardinal((int[]) r6, (int[]) r7, (int[]) r9)
            if (r6 != 0) goto L_0x0076
            goto L_0x0042
        L_0x0076:
            int[] r6 = r4.init
            com.cardinalcommerce.a.DeflateHelper.configure(r6)
            if (r10 != r5) goto L_0x0086
            int[] r6 = r4.init
            boolean r6 = com.cardinalcommerce.a.DeflateHelper.Cardinal(r6)
            if (r6 == 0) goto L_0x0086
            goto L_0x0042
        L_0x0086:
            int[] r6 = r4.init
            r6 = r6[r0]
            r6 = r6 & r5
            if (r10 == r6) goto L_0x008f
            r6 = r5
            goto L_0x0090
        L_0x008f:
            r6 = r0
        L_0x0090:
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x009a
            int[] r6 = r4.init
            int[] r7 = r4.init
            com.cardinalcommerce.a.DeflateHelper.init((int[]) r6, (int[]) r7)
        L_0x009a:
            int[] r6 = r4.cca_continue
            com.cardinalcommerce.a.DeflateHelper.getInstance(r6)
            int[] r6 = r4.init
            int[] r7 = r4.configure
            int[] r9 = r4.getInstance
            com.cardinalcommerce.a.DeflateHelper.getInstance(r6, r7, r9)
            r6 = r5
        L_0x00a9:
            if (r6 != 0) goto L_0x00ac
            return r0
        L_0x00ac:
            com.cardinalcommerce.a.KeyPairGeneratorSpi$ECMQV r6 = new com.cardinalcommerce.a.KeyPairGeneratorSpi$ECMQV
            r6.<init>()
            int r7 = r6.getInstance()
            byte[] r7 = new byte[r7]
            r9 = 0
            init((com.cardinalcommerce.a.IESCipher.ECIESwithAESCBC) r6, (byte) r0, (byte[]) r9)
            r6.init(r2, r0, r1)
            r6.init(r12, r0, r1)
            r6.init(r13, r0, r14)
            r6.init(r7, r0)
            byte[] r12 = Cardinal((byte[]) r7)
            int[] r13 = new int[r3]
            r14 = r0
        L_0x00ce:
            if (r14 >= r3) goto L_0x00dc
            int r6 = r14 << 2
            int r6 = r6 + r0
            int r6 = cca_continue(r11, r6)
            r13[r14] = r6
            int r14 = r14 + 1
            goto L_0x00ce
        L_0x00dc:
            int[] r11 = new int[r3]
            r14 = r0
        L_0x00df:
            if (r14 >= r3) goto L_0x00ed
            int r6 = r14 << 2
            int r6 = r6 + r0
            int r6 = cca_continue(r12, r6)
            r11[r14] = r6
            int r14 = r14 + 1
            goto L_0x00df
        L_0x00ed:
            com.cardinalcommerce.a.Curve$cca_continue r12 = new com.cardinalcommerce.a.Curve$cca_continue
            r12.<init>(r0)
            getInstance()
            byte[] r13 = init((int[]) r13, (int) r8)
            r14 = 5
            byte[] r11 = init((int[]) r11, (int) r14)
            com.cardinalcommerce.a.Curve$getInstance[] r14 = configure((com.cardinalcommerce.a.Curve.getInstance) r4, (int) r3)
            Cardinal((com.cardinalcommerce.a.Curve.cca_continue) r12)
            r3 = 255(0xff, float:3.57E-43)
        L_0x0107:
            if (r3 <= 0) goto L_0x0113
            byte r4 = r13[r3]
            byte r6 = r11[r3]
            r4 = r4 | r6
            if (r4 != 0) goto L_0x0113
            int r3 = r3 + -1
            goto L_0x0107
        L_0x0113:
            byte r4 = r13[r3]
            if (r4 == 0) goto L_0x0127
            int r6 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = r4 >>> r5
            if (r6 == 0) goto L_0x011f
            r6 = r5
            goto L_0x0120
        L_0x011f:
            r6 = r0
        L_0x0120:
            com.cardinalcommerce.a.Curve$getInstance[] r7 = getSDKVersion
            r4 = r7[r4]
            cca_continue((boolean) r6, (com.cardinalcommerce.a.Curve.getInstance) r4, (com.cardinalcommerce.a.Curve.cca_continue) r12)
        L_0x0127:
            byte r4 = r11[r3]
            if (r4 == 0) goto L_0x0139
            int r6 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = r4 >>> r5
            if (r6 == 0) goto L_0x0133
            r6 = r5
            goto L_0x0134
        L_0x0133:
            r6 = r0
        L_0x0134:
            r4 = r14[r4]
            cca_continue((boolean) r6, (com.cardinalcommerce.a.Curve.getInstance) r4, (com.cardinalcommerce.a.Curve.cca_continue) r12)
        L_0x0139:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0141
            init(r12)
            goto L_0x0113
        L_0x0141:
            byte[] r11 = new byte[r1]
            init((com.cardinalcommerce.a.Curve.cca_continue) r12, (byte[]) r11, (int) r0)
            boolean r11 = com.cardinalcommerce.a.getBackgroundColor.Cardinal((byte[]) r11, (byte[]) r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.Curve.init(byte[], byte[], byte[], int):boolean");
    }
}
