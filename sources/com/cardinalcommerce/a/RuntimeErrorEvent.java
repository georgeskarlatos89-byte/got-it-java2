package com.cardinalcommerce.a;

import java.math.BigInteger;

public abstract class RuntimeErrorEvent {
    public static int Cardinal(int[] iArr, int[] iArr2) {
        long j = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (4294967295L & ((long) iArr[5])));
        iArr2[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static void Cardinal(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[3]) & 4294967295L;
        long j4 = ((long) iArr2[4]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr[0]) & 4294967295L;
        long j8 = (j7 * j) + 0;
        iArr3[0] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j5);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j3);
        iArr3[3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j4);
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[5] = (int) j13;
        iArr3[6] = (int) (j13 >>> 32);
        int i = 1;
        for (int i2 = 6; i < i2; i2 = 6) {
            long j14 = ((long) iArr[i]) & 4294967295L;
            long j15 = (j14 * j) + (((long) iArr3[i]) & 4294967295L) + 0;
            iArr3[i] = (int) j15;
            int i3 = i + 1;
            int i4 = i3;
            long j16 = (j15 >>> 32) + (j14 * j2) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i4] = (int) j16;
            int i5 = i + 2;
            long j17 = j2;
            long j18 = (j16 >>> 32) + (j14 * j5) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j18;
            int i6 = i + 3;
            long j19 = (j18 >>> 32) + (j14 * j3) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j19;
            int i7 = i + 4;
            long j20 = (j19 >>> 32) + (j14 * j4) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j20;
            int i8 = i + 5;
            long j21 = (j20 >>> 32) + (j14 * j6) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j21;
            iArr3[i + 6] = (int) (j21 >>> 32);
            j3 = j3;
            j = j;
            i = i4;
            j2 = j17;
        }
    }

    public static boolean Cardinal(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int cca_continue(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        long j8 = 0;
        while (i < 6) {
            long j9 = j7;
            long j10 = ((long) iArr[i]) & j;
            long j11 = j2;
            long j12 = (j10 * j2) + (((long) iArr3[i]) & j) + 0;
            iArr3[i] = (int) j12;
            int i2 = i + 1;
            long j13 = (j12 >>> 32) + (j10 * j3) + (((long) iArr3[i2]) & 4294967295L);
            iArr3[i2] = (int) j13;
            int i3 = i + 2;
            long j14 = (j13 >>> 32) + (j10 * j4) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j14;
            int i4 = i + 3;
            long j15 = (j14 >>> 32) + (j10 * j5) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j15;
            int i5 = i + 4;
            long j16 = (j15 >>> 32) + (j10 * j6) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j16;
            int i6 = i + 5;
            long j17 = (j16 >>> 32) + (j10 * j9) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j17;
            int i7 = i + 6;
            long j18 = (j17 >>> 32) + j8 + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j18;
            j8 = j18 >>> 32;
            i = i2;
            j = 4294967295L;
            j7 = j9;
            j2 = j11;
            j4 = j4;
            j3 = j3;
        }
        return (int) j8;
    }

    public static BigInteger cca_continue(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                setTextFontSize.init(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void cca_continue(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        int i = 0;
        int i2 = 5;
        int i3 = 12;
        while (true) {
            int i4 = i2 - 1;
            long j2 = ((long) iArr[i2 + 6]) & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i3 - 1;
            iArr2[i5 + 12] = (i << 31) | ((int) (j3 >>> 33));
            i3 = i5 - 1;
            iArr2[i3 + 12] = (int) (j3 >>> 1);
            i = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[12] = (int) j4;
                long j5 = ((long) iArr[7]) & 4294967295L;
                long j6 = ((((long) (i << 31)) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i6 = (int) j6;
                iArr2[13] = (((int) (j4 >>> 32)) & 1) | (i6 << 1);
                long j7 = (((long) iArr2[14]) & 4294967295L) + (j6 >>> 32);
                long j8 = ((long) iArr[8]) & 4294967295L;
                long j9 = ((long) iArr2[15]) & 4294967295L;
                long j10 = j7 + (j8 * j);
                int i7 = (int) j10;
                iArr2[14] = (i7 << 1) | (i6 >>> 31);
                int i8 = i7 >>> 31;
                long j11 = j9 + (j10 >>> 32) + (j8 * j5);
                long j12 = (((long) iArr2[16]) & 4294967295L) + (j11 >>> 32);
                long j13 = j;
                long j14 = ((long) iArr[9]) & 4294967295L;
                long j15 = j5;
                long j16 = (((long) iArr2[17]) & 4294967295L) + (j12 >>> 32);
                long j17 = j8;
                long j18 = (((long) iArr2[18]) & 4294967295L) + (j16 >>> 32);
                long j19 = (j11 & 4294967295L) + (j14 * j13);
                int i9 = (int) j19;
                iArr2[15] = (i9 << 1) | i8;
                int i10 = i9 >>> 31;
                long j20 = (j12 & 4294967295L) + (j19 >>> 32) + (j14 * j15);
                long j21 = (j16 & 4294967295L) + (j20 >>> 32) + (j14 * j17);
                long j22 = j20 & 4294967295L;
                long j23 = j18 + (j21 >>> 32);
                long j24 = ((long) iArr[10]) & 4294967295L;
                long j25 = (((long) iArr2[19]) & 4294967295L) + (j23 >>> 32);
                long j26 = j14;
                long j27 = (((long) iArr2[20]) & 4294967295L) + (j25 >>> 32);
                long j28 = j22 + (j24 * j13);
                int i11 = (int) j28;
                iArr2[16] = (i11 << 1) | i10;
                long j29 = (j21 & 4294967295L) + (j28 >>> 32) + (j24 * j15);
                long j30 = (j23 & 4294967295L) + (j29 >>> 32) + (j24 * j17);
                long j31 = j29 & 4294967295L;
                long j32 = (j25 & 4294967295L) + (j30 >>> 32) + (j24 * j26);
                long j33 = j30 & 4294967295L;
                long j34 = j27 + (j32 >>> 32);
                long j35 = j32 & 4294967295L;
                long j36 = ((long) iArr[11]) & 4294967295L;
                long j37 = j24;
                long j38 = (((long) iArr2[21]) & 4294967295L) + (j34 >>> 32);
                long j39 = 4294967295L & j38;
                long j40 = j31 + (j36 * j13);
                int i12 = (int) j40;
                iArr2[17] = (i11 >>> 31) | (i12 << 1);
                long j41 = j33 + (j40 >>> 32) + (j36 * j15);
                long j42 = j35 + (j41 >>> 32) + (j36 * j17);
                long j43 = (j34 & 4294967295L) + (j42 >>> 32) + (j36 * j26);
                long j44 = j39 + (j43 >>> 32) + (j36 * j37);
                long j45 = (((long) iArr2[22]) & 4294967295L) + (j38 >>> 32) + (j44 >>> 32);
                int i13 = (int) j41;
                iArr2[18] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) j42;
                iArr2[19] = i14 | (i15 << 1);
                int i16 = (int) j43;
                iArr2[20] = (i15 >>> 31) | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j44;
                iArr2[21] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j45;
                iArr2[22] = i19 | (i20 << 1);
                iArr2[23] = ((iArr2[23] + ((int) (j45 >>> 32))) << 1) | (i20 >>> 31);
                return;
            }
            i2 = i4;
        }
    }

    public static int configure(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static void configure(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i2 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (((long) (i6 << 31)) & 4294967295L) | (j4 >>> 33);
                iArr2[0] = (int) j4;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = j5 + (j6 * j);
                int i7 = (int) j7;
                iArr2[1] = (i7 << 1) | (((int) (j4 >>> 32)) & 1);
                long j8 = (((long) iArr2[2]) & 4294967295L) + (j7 >>> 32);
                long j9 = ((long) iArr[2]) & 4294967295L;
                long j10 = j8 + (j9 * j);
                int i8 = (int) j10;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long j11 = (((long) iArr2[3]) & 4294967295L) + (j10 >>> 32) + (j9 * j6);
                long j12 = (((long) iArr2[4]) & 4294967295L) + (j11 >>> 32);
                long j13 = ((long) iArr[3]) & 4294967295L;
                long j14 = j9;
                long j15 = (((long) iArr2[5]) & 4294967295L) + (j12 >>> 32);
                long j16 = j12 & 4294967295L;
                long j17 = (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
                long j18 = (j11 & 4294967295L) + (j13 * j);
                int i9 = (int) j18;
                iArr2[3] = (i9 << 1) | (i8 >>> 31);
                long j19 = j16 + (j18 >>> 32) + (j13 * j6);
                long j20 = (j15 & 4294967295L) + (j19 >>> 32) + (j13 * j14);
                long j21 = j17 + (j20 >>> 32);
                long j22 = j13;
                long j23 = ((long) iArr[4]) & 4294967295L;
                long j24 = j20 & 4294967295L;
                long j25 = (((long) iArr2[7]) & 4294967295L) + (j21 >>> 32);
                long j26 = (j19 & 4294967295L) + (j23 * j);
                int i10 = (int) j26;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                long j27 = j24 + (j26 >>> 32) + (j23 * j6);
                long j28 = (j21 & 4294967295L) + (j27 >>> 32) + (j23 * j14);
                long j29 = (j25 & 4294967295L) + (j28 >>> 32) + (j23 * j22);
                long j30 = (((long) iArr2[8]) & 4294967295L) + (j25 >>> 32) + (j29 >>> 32);
                long j31 = j23;
                long j32 = ((long) iArr[5]) & 4294967295L;
                long j33 = (((long) iArr2[9]) & 4294967295L) + (j30 >>> 32);
                long j34 = (j27 & 4294967295L) + (j * j32);
                int i11 = (int) j34;
                iArr2[5] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                long j35 = (j28 & 4294967295L) + (j34 >>> 32) + (j6 * j32);
                long j36 = (j29 & 4294967295L) + (j35 >>> 32) + (j32 * j14);
                long j37 = (j30 & 4294967295L) + (j36 >>> 32) + (j32 * j22);
                long j38 = (j33 & 4294967295L) + (j37 >>> 32) + (j32 * j31);
                long j39 = (((long) iArr2[10]) & 4294967295L) + (j33 >>> 32) + (j38 >>> 32);
                int i13 = (int) j35;
                iArr2[6] = i12 | (i13 << 1);
                int i14 = (int) j36;
                iArr2[7] = (i13 >>> 31) | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) j37;
                iArr2[8] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j38;
                iArr2[9] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j39;
                iArr2[10] = i19 | (i20 << 1);
                iArr2[11] = (i20 >>> 31) | ((iArr2[11] + ((int) (j39 >>> 32))) << 1);
                return;
            }
            i3 = i4;
            i2 = i6;
        }
    }

    public static void configure(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        long j = ((long) iArr2[6]) & 4294967295L;
        long j2 = ((long) iArr2[7]) & 4294967295L;
        long j3 = ((long) iArr2[8]) & 4294967295L;
        long j4 = ((long) iArr2[9]) & 4294967295L;
        long j5 = ((long) iArr2[10]) & 4294967295L;
        long j6 = ((long) iArr2[11]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = (j7 * j) + 0;
        iArr3[12] = (int) j8;
        char c = ' ';
        long j9 = (j8 >>> 32) + (j7 * j2);
        long j10 = j2;
        iArr3[13] = (int) j9;
        long j11 = (j9 >>> 32) + (j7 * j3);
        iArr3[14] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j4);
        iArr3[15] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j5);
        iArr3[16] = (int) j13;
        long j14 = (j13 >>> 32) + (j7 * j6);
        iArr3[17] = (int) j14;
        iArr3[18] = (int) (j14 >>> 32);
        int i2 = 1;
        int i3 = i;
        int i4 = 1;
        while (i4 < 6) {
            i3 += i2;
            long j15 = ((long) iArr[i4 + 6]) & 4294967295L;
            long j16 = j3;
            long j17 = (j15 * j) + (((long) iArr3[i3]) & 4294967295L) + 0;
            iArr3[i3] = (int) j17;
            int i5 = i3 + 1;
            long j18 = j4;
            long j19 = (j17 >>> c) + (j15 * j10) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j19;
            int i6 = i3 + 2;
            long j20 = j;
            long j21 = (j19 >>> c) + (j15 * j16) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j21;
            c = ' ';
            int i7 = i3 + 3;
            long j22 = (j21 >>> 32) + (j15 * j18) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j22;
            int i8 = i3 + 4;
            long j23 = (j22 >>> 32) + (j15 * j5) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j23;
            int i9 = i3 + 5;
            long j24 = (j23 >>> 32) + (j15 * j6) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j24;
            iArr3[i3 + 6] = (int) (j24 >>> 32);
            i4++;
            j = j20;
            j3 = j16;
            j4 = j18;
            i2 = 1;
        }
    }

    public static int getInstance(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (((long) i3) & 4294967295L) + (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (4294967295L & ((long) iArr2[i8]));
        iArr2[i8] = (int) j6;
        return (int) (j6 >>> 32);
    }

    private static int getInstance(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((((long) iArr[i]) & 4294967295L) - (((long) iArr2[i2]) & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L));
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int getInstance(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[12]) & 4294967295L) + 0;
        int i = (int) j;
        iArr[6] = i;
        iArr2[12] = i;
        long j2 = (j >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[13]) & 4294967295L);
        int i2 = (int) j2;
        iArr[7] = i2;
        iArr2[13] = i2;
        long j3 = (j2 >>> 32) + (((long) iArr[8]) & 4294967295L) + (((long) iArr2[14]) & 4294967295L);
        int i3 = (int) j3;
        iArr[8] = i3;
        iArr2[14] = i3;
        long j4 = (j3 >>> 32) + (((long) iArr[9]) & 4294967295L) + (((long) iArr2[15]) & 4294967295L);
        int i4 = (int) j4;
        iArr[9] = i4;
        iArr2[15] = i4;
        long j5 = (j4 >>> 32) + (((long) iArr[10]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L);
        int i5 = (int) j5;
        iArr[10] = i5;
        iArr2[16] = i5;
        long j6 = (j5 >>> 32) + (((long) iArr[11]) & 4294967295L) + (4294967295L & ((long) iArr2[17]));
        int i6 = (int) j6;
        iArr[11] = i6;
        iArr2[17] = i6;
        return (int) (j6 >>> 32);
    }

    public static void getInstance(int[] iArr, int[] iArr2, int i) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
    }

    public static long getSDKVersion(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = (j * 4553) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j2;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = (j2 >>> 32) + (j3 * 4553) + j + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j4;
        long j5 = j4 >>> 32;
        long j6 = ((long) iArr[8]) & 4294967295L;
        long j7 = j5 + (j6 * 4553) + j3 + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j7;
        long j8 = ((long) iArr[9]) & 4294967295L;
        long j9 = (j7 >>> 32) + (j8 * 4553) + j6 + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j9;
        long j10 = ((long) iArr[10]) & 4294967295L;
        long j11 = (j9 >>> 32) + (j10 * 4553) + j8 + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j11;
        long j12 = ((long) iArr[11]) & 4294967295L;
        long j13 = (j11 >>> 32) + (4553 * j12) + j10 + (4294967295L & ((long) iArr2[5]));
        iArr3[5] = (int) j13;
        return (j13 >>> 32) + j12;
    }

    public static int getWarnings(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int init(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static boolean init(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean init(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getInstance(int[] r13, int[] r14, int[] r15) {
        /*
            r0 = 5
        L_0x0001:
            if (r0 < 0) goto L_0x0018
            int r1 = r0 + 6
            r1 = r13[r1]
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 ^ r2
            int r3 = r0 + 0
            r3 = r14[r3]
            r2 = r2 ^ r3
            if (r1 >= r2) goto L_0x0013
            r0 = 0
            goto L_0x0019
        L_0x0013:
            if (r1 > r2) goto L_0x0018
            int r0 = r0 + -1
            goto L_0x0001
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 == 0) goto L_0x0025
            r2 = 6
            r4 = 0
            r6 = 0
            r1 = r13
            r3 = r14
            r5 = r15
            getInstance(r1, r2, r3, r4, r5, r6)
            goto L_0x002e
        L_0x0025:
            r8 = 0
            r10 = 6
            r12 = 0
            r7 = r14
            r9 = r13
            r11 = r15
            getInstance(r7, r8, r9, r10, r11, r12)
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.RuntimeErrorEvent.getInstance(int[], int[], int[]):boolean");
    }

    public static int[] configure(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[6];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static long[] cca_continue(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[3];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArr;
    }

    public static int Cardinal(long j, int[] iArr) {
        long j2 = j & 4294967295L;
        long j3 = (j2 * 4553) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr[0] = (int) j3;
        long j4 = j >>> 32;
        long j5 = (j3 >>> 32) + (4553 * j4) + j2 + (((long) iArr[1]) & 4294967295L);
        iArr[1] = (int) j5;
        long j6 = (j5 >>> 32) + j4 + (((long) iArr[2]) & 4294967295L);
        iArr[2] = (int) j6;
        long j7 = (j6 >>> 32) + (4294967295L & ((long) iArr[3]));
        iArr[3] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        for (int i = 4; i < 6; i++) {
            int i2 = i + 0;
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static BigInteger cca_continue(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                int i2 = (2 - i) << 3;
                setTextFontSize.init((int) (j >>> 32), bArr, i2);
                setTextFontSize.init((int) j, bArr, i2 + 4);
            }
        }
        return new BigInteger(1, bArr);
    }
}
