package com.cardinalcommerce.a;

public abstract class getTransactionStatus {
    public static int Cardinal(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int cca_continue(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static void cca_continue(int[] iArr, int[] iArr2) {
        long j = 4294967295L;
        long j2 = ((long) iArr[0]) & 4294967295L;
        char c = 3;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
        while (true) {
            int i4 = i3 - 1;
            long j3 = ((long) iArr[i3]) & j;
            long j4 = j3 * j3;
            int i5 = i - 1;
            iArr2[i5] = (i2 << 31) | ((int) (j4 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j4 >>> 1);
            int i6 = (int) j4;
            if (i4 <= 0) {
                long j5 = j2 * j2;
                long j6 = (((long) (i6 << 31)) & j) | (j5 >>> 33);
                iArr2[0] = (int) j5;
                long j7 = ((long) iArr[1]) & j;
                long j8 = j6 + (j7 * j2);
                int i7 = (int) j8;
                iArr2[1] = (i7 << 1) | (((int) (j5 >>> 32)) & 1);
                long j9 = (((long) iArr2[2]) & j) + (j8 >>> 32);
                long j10 = ((long) iArr[2]) & j;
                long j11 = ((long) iArr2[c]) & j;
                long j12 = ((long) iArr2[4]) & j;
                long j13 = j9 + (j10 * j2);
                int i8 = (int) j13;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long j14 = j11 + (j13 >>> 32) + (j10 * j7);
                long j15 = j12 + (j14 >>> 32);
                long j16 = ((long) iArr[3]) & 4294967295L;
                long j17 = j10;
                long j18 = (((long) iArr2[5]) & 4294967295L) + (j15 >>> 32);
                long j19 = (j14 & 4294967295L) + (j2 * j16);
                int i9 = (int) j19;
                iArr2[3] = (i9 << 1) | (i8 >>> 31);
                long j20 = (j15 & 4294967295L) + (j19 >>> 32) + (j7 * j16);
                long j21 = (j18 & 4294967295L) + (j20 >>> 32) + (j16 * j17);
                long j22 = (((long) iArr2[6]) & 4294967295L) + (j18 >>> 32) + (j21 >>> 32);
                int i10 = (int) j20;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                int i11 = (int) (4294967295L & j21);
                iArr2[5] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                int i13 = (int) j22;
                iArr2[6] = i12 | (i13 << 1);
                iArr2[7] = (i13 >>> 31) | ((iArr2[7] + ((int) (j22 >>> 32))) << 1);
                return;
            }
            long j23 = j;
            long j24 = j23;
            i3 = i4;
            i2 = i6;
            c = c;
            j = j23;
        }
    }

    public static void getInstance(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr[0]) & 4294967295L;
        long j6 = (j5 * j) + 0;
        iArr3[0] = (int) j6;
        long j7 = (j6 >>> 32) + (j5 * j2);
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (j5 * j3);
        iArr3[2] = (int) j8;
        long j9 = (j8 >>> 32) + (j5 * j4);
        iArr3[3] = (int) j9;
        iArr3[4] = (int) (j9 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j10 = ((long) iArr[i]) & 4294967295L;
            long j11 = (j10 * j) + (((long) iArr3[i]) & 4294967295L) + 0;
            iArr3[i] = (int) j11;
            int i3 = i + 1;
            int i4 = i;
            long j12 = (j11 >>> 32) + (j10 * j2) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j12;
            int i5 = i4 + 2;
            long j13 = (j12 >>> 32) + (j10 * j3) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j13;
            int i6 = i4 + 3;
            long j14 = (j13 >>> 32) + (j10 * j4) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j14;
            iArr3[i4 + 4] = (int) (j14 >>> 32);
            i = i3;
            j = j;
        }
    }

    public static boolean init(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
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
}
