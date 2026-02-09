package com.cardinalcommerce.a;

import java.math.BigInteger;

public abstract class setErrorCode {
    public static int Cardinal(int[] iArr, int i, int[] iArr2, int i2, int i3) {
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
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L);
        iArr2[i8] = (int) j6;
        int i9 = i2 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i9]) & 4294967295L);
        iArr2[i9] = (int) j7;
        int i10 = i2 + 7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i10]));
        iArr2[i10] = (int) j8;
        return (int) (j8 >>> 32);
    }

    private static int Cardinal(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
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
        long j7 = (j6 >> 32) + ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int Cardinal(int[] iArr, int[] iArr2) {
        long j = ((((long) iArr2[0]) & 4294967295L) * 19) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + ((((long) iArr2[1]) & 4294967295L) * 19) + (((long) iArr[1]) & 4294967295L);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr2[2]) & 4294967295L) * 19) + (((long) iArr[2]) & 4294967295L);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr2[3]) & 4294967295L) * 19) + (((long) iArr[3]) & 4294967295L);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr2[4]) & 4294967295L) * 19) + (((long) iArr[4]) & 4294967295L);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr2[5]) & 4294967295L) * 19) + (((long) iArr[5]) & 4294967295L);
        iArr2[5] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr2[6]) & 4294967295L) * 19) + (((long) iArr[6]) & 4294967295L);
        iArr2[6] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr2[7]) & 4294967295L) * 19) + (4294967295L & ((long) iArr[7]));
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static boolean Cardinal(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean configure = configure(iArr, 8, iArr2, 0);
        if (configure) {
            Cardinal(iArr, 8, iArr2, 0, iArr3, 0);
        } else {
            Cardinal(iArr2, 0, iArr, 8, iArr3, 0);
        }
        return configure;
    }

    public static boolean Cardinal(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
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
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static boolean cca_continue(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
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

    public static int cleanup(int[] iArr, int[] iArr2) {
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
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L));
        iArr2[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7])));
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int configure(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr2[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr2[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7]));
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int configure(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[0]) & 4294967295L;
        long j8 = ((long) iArr2[6]) & 4294967295L;
        long j9 = ((long) iArr2[7]) & 4294967295L;
        long j10 = 0;
        int i = 0;
        while (i < 8) {
            long j11 = j9;
            long j12 = ((long) iArr[i]) & j;
            long j13 = j6;
            long j14 = (j12 * j7) + (((long) iArr3[i]) & j) + 0;
            iArr3[i] = (int) j14;
            int i2 = i + 1;
            long j15 = j2;
            long j16 = (j14 >>> 32) + (j12 * j2) + (((long) iArr3[i2]) & j);
            iArr3[i2] = (int) j16;
            int i3 = i + 2;
            long j17 = (j16 >>> 32) + (j12 * j3) + (((long) iArr3[i3]) & j);
            iArr3[i3] = (int) j17;
            int i4 = i + 3;
            long j18 = (j17 >>> 32) + (j12 * j4) + (((long) iArr3[i4]) & j);
            iArr3[i4] = (int) j18;
            int i5 = i + 4;
            long j19 = (j18 >>> 32) + (j12 * j5) + (((long) iArr3[i5]) & j);
            iArr3[i5] = (int) j19;
            int i6 = i + 5;
            long j20 = (j19 >>> 32) + (j12 * j13) + (((long) iArr3[i6]) & j);
            iArr3[i6] = (int) j20;
            int i7 = i + 6;
            long j21 = (j20 >>> 32) + (j12 * j8) + (((long) iArr3[i7]) & j);
            iArr3[i7] = (int) j21;
            int i8 = i + 7;
            long j22 = (j21 >>> 32) + (j12 * j11) + (((long) iArr3[i8]) & j);
            iArr3[i8] = (int) j22;
            int i9 = i + 8;
            long j23 = (j22 >>> 32) + j10 + (((long) iArr3[i9]) & j);
            iArr3[i9] = (int) j23;
            j10 = j23 >>> 32;
            i = i2;
            j9 = j11;
            j6 = j13;
            j2 = j15;
            j = 4294967295L;
        }
        return (int) j10;
    }

    public static BigInteger configure(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                setTextFontSize.init(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    private static boolean configure(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
            int i4 = iArr[i3 + 8] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i3 + 0];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static int getInstance(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static void getInstance(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static void getInstance(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 16;
        int i2 = 0;
        int i3 = 7;
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
                int i11 = i10 >>> 31;
                long j27 = j24 + (j26 >>> 32) + (j23 * j6);
                long j28 = (j21 & 4294967295L) + (j27 >>> 32) + (j23 * j14);
                long j29 = (j25 & 4294967295L) + (j28 >>> 32) + (j23 * j22);
                long j30 = (((long) iArr2[8]) & 4294967295L) + (j25 >>> 32) + (j29 >>> 32);
                long j31 = j23;
                long j32 = ((long) iArr[5]) & 4294967295L;
                long j33 = j29 & 4294967295L;
                long j34 = (((long) iArr2[9]) & 4294967295L) + (j30 >>> 32);
                long j35 = j30 & 4294967295L;
                long j36 = (((long) iArr2[10]) & 4294967295L) + (j34 >>> 32);
                long j37 = (j27 & 4294967295L) + (j32 * j);
                int i12 = (int) j37;
                iArr2[5] = (i12 << 1) | i11;
                long j38 = (j28 & 4294967295L) + (j37 >>> 32) + (j32 * j6);
                long j39 = j33 + (j38 >>> 32) + (j32 * j14);
                long j40 = j35 + (j39 >>> 32) + (j32 * j22);
                long j41 = (j34 & 4294967295L) + (j40 >>> 32) + (j32 * j31);
                long j42 = j36 + (j41 >>> 32);
                long j43 = j32;
                long j44 = ((long) iArr[6]) & 4294967295L;
                long j45 = (((long) iArr2[11]) & 4294967295L) + (j42 >>> 32);
                long j46 = j42 & 4294967295L;
                long j47 = (((long) iArr2[12]) & 4294967295L) + (j45 >>> 32);
                long j48 = (j38 & 4294967295L) + (j44 * j);
                int i13 = (int) j48;
                iArr2[6] = (i13 << 1) | (i12 >>> 31);
                long j49 = (j39 & 4294967295L) + (j48 >>> 32) + (j44 * j6);
                long j50 = (j40 & 4294967295L) + (j49 >>> 32) + (j44 * j14);
                long j51 = (j41 & 4294967295L) + (j50 >>> 32) + (j44 * j22);
                long j52 = j46 + (j51 >>> 32) + (j44 * j31);
                long j53 = (j45 & 4294967295L) + (j52 >>> 32) + (j44 * j43);
                long j54 = j47 + (j53 >>> 32);
                long j55 = j44;
                long j56 = ((long) iArr[7]) & 4294967295L;
                long j57 = j53 & 4294967295L;
                long j58 = (((long) iArr2[13]) & 4294967295L) + (j54 >>> 32);
                long j59 = (j49 & 4294967295L) + (j * j56);
                int i14 = (int) j59;
                iArr2[7] = (i13 >>> 31) | (i14 << 1);
                int i15 = i14 >>> 31;
                long j60 = (j50 & 4294967295L) + (j59 >>> 32) + (j6 * j56);
                long j61 = (j51 & 4294967295L) + (j60 >>> 32) + (j56 * j14);
                long j62 = (j52 & 4294967295L) + (j61 >>> 32) + (j56 * j22);
                long j63 = j57 + (j62 >>> 32) + (j56 * j31);
                long j64 = j63;
                long j65 = (j54 & 4294967295L) + (j63 >>> 32) + (j56 * j43);
                long j66 = (j58 & 4294967295L) + (j65 >>> 32) + (j56 * j55);
                long j67 = (((long) iArr2[14]) & 4294967295L) + (j58 >>> 32) + (j66 >>> 32);
                int i16 = (int) j60;
                iArr2[8] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j61;
                iArr2[9] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j62;
                iArr2[10] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j64;
                iArr2[11] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j65;
                iArr2[12] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j66;
                iArr2[13] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j67;
                iArr2[14] = i27 | (i28 << 1);
                iArr2[15] = (i28 >>> 31) | ((iArr2[15] + ((int) (j67 >>> 32))) << 1);
                return;
            }
            i3 = i4;
            i2 = i6;
        }
    }

    public static void getInstance(int[] iArr, int[] iArr2, int i) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
        iArr2[i + 6] = iArr[6];
        iArr2[i + 7] = iArr[7];
    }

    public static int getSDKVersion(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j7 = (j6 >> 32) + ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static void getWarnings(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & 4294967295L;
        int i = 0;
        int i2 = 7;
        int i3 = 16;
        while (true) {
            int i4 = i2 - 1;
            long j2 = ((long) iArr[i2 + 8]) & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i3 - 1;
            iArr2[i5 + 16] = (i << 31) | ((int) (j3 >>> 33));
            i3 = i5 - 1;
            iArr2[i3 + 16] = (int) (j3 >>> 1);
            i = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[16] = (int) j4;
                long j5 = ((long) iArr[9]) & 4294967295L;
                long j6 = ((((long) (i << 31)) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i6 = (int) j6;
                iArr2[17] = (i6 << 1) | (((int) (j4 >>> 32)) & 1);
                long j7 = (((long) iArr2[18]) & 4294967295L) + (j6 >>> 32);
                long j8 = ((long) iArr[10]) & 4294967295L;
                long j9 = j5;
                long j10 = j7 + (j8 * j);
                int i7 = (int) j10;
                iArr2[18] = (i7 << 1) | (i6 >>> 31);
                long j11 = (((long) iArr2[19]) & 4294967295L) + (j10 >>> 32) + (j8 * j9);
                long j12 = (((long) iArr2[20]) & 4294967295L) + (j11 >>> 32);
                long j13 = ((long) iArr[11]) & 4294967295L;
                long j14 = j8;
                long j15 = (((long) iArr2[21]) & 4294967295L) + (j12 >>> 32);
                long j16 = (j11 & 4294967295L) + (j13 * j);
                int i8 = (int) j16;
                iArr2[19] = (i8 << 1) | (i7 >>> 31);
                long j17 = (j12 & 4294967295L) + (j16 >>> 32) + (j13 * j9);
                long j18 = (j15 & 4294967295L) + (j17 >>> 32) + (j13 * j14);
                long j19 = (((long) iArr2[22]) & 4294967295L) + (j15 >>> 32) + (j18 >>> 32);
                long j20 = ((long) iArr[12]) & 4294967295L;
                long j21 = j13;
                long j22 = (((long) iArr2[23]) & 4294967295L) + (j19 >>> 32);
                long j23 = (j17 & 4294967295L) + (j20 * j);
                int i9 = (int) j23;
                iArr2[20] = (i8 >>> 31) | (i9 << 1);
                long j24 = (j18 & 4294967295L) + (j23 >>> 32) + (j20 * j9);
                long j25 = (j19 & 4294967295L) + (j24 >>> 32) + (j20 * j14);
                long j26 = (j22 & 4294967295L) + (j25 >>> 32) + (j20 * j21);
                long j27 = (((long) iArr2[24]) & 4294967295L) + (j22 >>> 32) + (j26 >>> 32);
                long j28 = j;
                long j29 = ((long) iArr[13]) & 4294967295L;
                long j30 = (((long) iArr2[25]) & 4294967295L) + (j27 >>> 32);
                long j31 = j20;
                long j32 = (((long) iArr2[26]) & 4294967295L) + (j30 >>> 32);
                long j33 = (j24 & 4294967295L) + (j29 * j28);
                int i10 = (int) j33;
                iArr2[21] = (i10 << 1) | (i9 >>> 31);
                long j34 = (j25 & 4294967295L) + (j33 >>> 32) + (j29 * j9);
                long j35 = (j26 & 4294967295L) + (j34 >>> 32) + (j29 * j14);
                long j36 = (j27 & 4294967295L) + (j35 >>> 32) + (j29 * j21);
                long j37 = (j30 & 4294967295L) + (j36 >>> 32) + (j29 * j31);
                long j38 = j32 + (j37 >>> 32);
                long j39 = j29;
                long j40 = ((long) iArr[14]) & 4294967295L;
                long j41 = j37 & 4294967295L;
                long j42 = (((long) iArr2[27]) & 4294967295L) + (j38 >>> 32);
                long j43 = j38 & 4294967295L;
                long j44 = (((long) iArr2[28]) & 4294967295L) + (j42 >>> 32);
                long j45 = (j34 & 4294967295L) + (j40 * j28);
                int i11 = (int) j45;
                iArr2[22] = (i10 >>> 31) | (i11 << 1);
                long j46 = (j35 & 4294967295L) + (j45 >>> 32) + (j40 * j9);
                long j47 = (j36 & 4294967295L) + (j46 >>> 32) + (j40 * j14);
                long j48 = j46 & 4294967295L;
                long j49 = j41 + (j47 >>> 32) + (j40 * j21);
                long j50 = j43 + (j49 >>> 32) + (j40 * j31);
                long j51 = (j42 & 4294967295L) + (j50 >>> 32) + (j40 * j39);
                long j52 = j44 + (j51 >>> 32);
                long j53 = j40;
                long j54 = ((long) iArr[15]) & 4294967295L;
                long j55 = j51 & 4294967295L;
                long j56 = (((long) iArr2[29]) & 4294967295L) + (j52 >>> 32);
                long j57 = j48 + (j54 * j28);
                int i12 = (int) j57;
                iArr2[23] = (i11 >>> 31) | (i12 << 1);
                long j58 = (j47 & 4294967295L) + (j57 >>> 32) + (j54 * j9);
                long j59 = (j49 & 4294967295L) + (j58 >>> 32) + (j54 * j14);
                long j60 = (j50 & 4294967295L) + (j59 >>> 32) + (j54 * j21);
                long j61 = j55 + (j60 >>> 32) + (j54 * j31);
                long j62 = j61;
                long j63 = (j52 & 4294967295L) + (j61 >>> 32) + (j54 * j39);
                long j64 = (j56 & 4294967295L) + (j63 >>> 32) + (j54 * j53);
                long j65 = (((long) iArr2[30]) & 4294967295L) + (j56 >>> 32) + (j64 >>> 32);
                int i13 = (int) j58;
                iArr2[24] = (i13 << 1) | (i12 >>> 31);
                int i14 = (int) j59;
                iArr2[25] = (i13 >>> 31) | (i14 << 1);
                int i15 = (int) j60;
                iArr2[26] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j62;
                iArr2[27] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) j63;
                iArr2[28] = i18 | (i19 << 1);
                int i20 = (int) j64;
                iArr2[29] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j65;
                iArr2[30] = i21 | (i22 << 1);
                iArr2[31] = (i22 >>> 31) | ((iArr2[31] + ((int) (j65 >>> 32))) << 1);
                return;
            }
            i2 = i4;
        }
    }

    public static int init(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L) + 0;
        int i = (int) j;
        iArr[8] = i;
        iArr2[16] = i;
        long j2 = (j >>> 32) + (((long) iArr[9]) & 4294967295L) + (((long) iArr2[17]) & 4294967295L);
        int i2 = (int) j2;
        iArr[9] = i2;
        iArr2[17] = i2;
        long j3 = (j2 >>> 32) + (((long) iArr[10]) & 4294967295L) + (((long) iArr2[18]) & 4294967295L);
        int i3 = (int) j3;
        iArr[10] = i3;
        iArr2[18] = i3;
        long j4 = (j3 >>> 32) + (((long) iArr[11]) & 4294967295L) + (((long) iArr2[19]) & 4294967295L);
        int i4 = (int) j4;
        iArr[11] = i4;
        iArr2[19] = i4;
        long j5 = (j4 >>> 32) + (((long) iArr[12]) & 4294967295L) + (((long) iArr2[20]) & 4294967295L);
        int i5 = (int) j5;
        iArr[12] = i5;
        iArr2[20] = i5;
        long j6 = (j5 >>> 32) + (((long) iArr[13]) & 4294967295L) + (((long) iArr2[21]) & 4294967295L);
        int i6 = (int) j6;
        iArr[13] = i6;
        iArr2[21] = i6;
        long j7 = (j6 >>> 32) + (((long) iArr[14]) & 4294967295L) + (((long) iArr2[22]) & 4294967295L);
        int i7 = (int) j7;
        iArr[14] = i7;
        iArr2[22] = i7;
        long j8 = (j7 >>> 32) + (((long) iArr[15]) & 4294967295L) + (4294967295L & ((long) iArr2[23]));
        int i8 = (int) j8;
        iArr[15] = i8;
        iArr2[23] = i8;
        return (int) (j8 >>> 32);
    }

    public static void init(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[3]) & 4294967295L;
        long j4 = ((long) iArr2[4]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = ((long) iArr[0]) & 4294967295L;
        long j10 = (j9 * j) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j5);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j3);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j4);
        iArr3[4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[6] = (int) j16;
        long j17 = (j16 >>> 32) + (j9 * j8);
        iArr3[7] = (int) j17;
        iArr3[8] = (int) (j17 >>> 32);
        int i = 1;
        for (int i2 = 8; i < i2; i2 = 8) {
            long j18 = ((long) iArr[i]) & 4294967295L;
            long j19 = (j18 * j) + (((long) iArr3[i]) & 4294967295L) + 0;
            iArr3[i] = (int) j19;
            int i3 = i + 1;
            int i4 = i3;
            long j20 = (j19 >>> 32) + (j18 * j2) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i4] = (int) j20;
            int i5 = i + 2;
            long j21 = j2;
            long j22 = (j20 >>> 32) + (j18 * j5) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j22;
            int i6 = i + 3;
            long j23 = (j22 >>> 32) + (j18 * j3) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j23;
            int i7 = i + 4;
            long j24 = (j23 >>> 32) + (j18 * j4) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j24;
            int i8 = i + 5;
            long j25 = (j24 >>> 32) + (j18 * j6) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j25;
            int i9 = i + 6;
            long j26 = (j25 >>> 32) + (j18 * j7) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j26;
            int i10 = i + 7;
            long j27 = (j26 >>> 32) + (j18 * j8) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j27;
            iArr3[i + 8] = (int) (j27 >>> 32);
            j3 = j3;
            j = j;
            i = i4;
            j2 = j21;
        }
    }

    public static boolean init(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static long onCReqSuccess(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = (j * 977) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j2;
        long j3 = ((long) iArr[9]) & 4294967295L;
        long j4 = (j2 >>> 32) + (j3 * 977) + j + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j4;
        long j5 = j4 >>> 32;
        long j6 = ((long) iArr[10]) & 4294967295L;
        long j7 = j5 + (j6 * 977) + j3 + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j7;
        long j8 = ((long) iArr[11]) & 4294967295L;
        long j9 = (j7 >>> 32) + (j8 * 977) + j6 + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j9;
        long j10 = ((long) iArr[12]) & 4294967295L;
        long j11 = (j9 >>> 32) + (j10 * 977) + j8 + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j11;
        long j12 = ((long) iArr[13]) & 4294967295L;
        long j13 = (j11 >>> 32) + (j12 * 977) + j10 + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j13;
        long j14 = ((long) iArr[14]) & 4294967295L;
        long j15 = (j13 >>> 32) + (j14 * 977) + j12 + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j15;
        long j16 = ((long) iArr[15]) & 4294967295L;
        long j17 = (j15 >>> 32) + (977 * j16) + j14 + (4294967295L & ((long) iArr2[7]));
        iArr3[7] = (int) j17;
        return (j17 >>> 32) + j16;
    }

    public static int[] Cardinal(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[8];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static long[] init(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[4];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArr;
    }

    public static int getInstance(long j, int[] iArr) {
        long j2 = j & 4294967295L;
        long j3 = (j2 * 977) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr[0] = (int) j3;
        long j4 = j >>> 32;
        long j5 = (j3 >>> 32) + (977 * j4) + j2 + (((long) iArr[1]) & 4294967295L);
        iArr[1] = (int) j5;
        long j6 = (j5 >>> 32) + j4 + (((long) iArr[2]) & 4294967295L);
        iArr[2] = (int) j6;
        long j7 = (j6 >>> 32) + (4294967295L & ((long) iArr[3]));
        iArr[3] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        for (int i = 4; i < 8; i++) {
            int i2 = i + 0;
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static BigInteger init(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                int i2 = (3 - i) << 3;
                setTextFontSize.init((int) (j >>> 32), bArr, i2);
                setTextFontSize.init((int) j, bArr, i2 + 4);
            }
        }
        return new BigInteger(1, bArr);
    }
}
