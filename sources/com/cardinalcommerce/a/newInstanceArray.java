package com.cardinalcommerce.a;

import com.google.common.primitives.Shorts;
import java.math.BigInteger;

final class newInstanceArray implements Cloneable {
    static final byte[] Cardinal = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
    private static final short[] configure = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, Shorts.MAX_POWER_OF_TWO, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    long[] cca_continue;

    private newInstanceArray(int i) {
        this.cca_continue = new long[i];
    }

    public newInstanceArray(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0) {
            throw new IllegalArgumentException("invalid F2m field value");
        }
        int i = 1;
        if (bigInteger.signum() == 0) {
            this.cca_continue = new long[]{0};
            return;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (byteArray[0] == 0) {
            length--;
        } else {
            i = 0;
        }
        int i2 = (length + 7) / 8;
        this.cca_continue = new long[i2];
        int i3 = i2 - 1;
        int i4 = (length % 8) + i;
        if (i < i4) {
            long j = 0;
            while (i < i4) {
                j = (j << 8) | ((long) (byteArray[i] & 255));
                i++;
            }
            this.cca_continue[i3] = j;
            i3--;
        }
        while (i3 >= 0) {
            long j2 = 0;
            int i5 = 0;
            while (i5 < 8) {
                j2 = (j2 << 8) | ((long) (byteArray[i] & 255));
                i5++;
                i++;
            }
            this.cca_continue[i3] = j2;
            i3--;
        }
    }

    public newInstanceArray(long[] jArr) {
        this.cca_continue = jArr;
    }

    public newInstanceArray(long[] jArr, int i, int i2) {
        if (i2 == jArr.length) {
            this.cca_continue = jArr;
            return;
        }
        long[] jArr2 = new long[i2];
        this.cca_continue = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, i2);
    }

    private static long Cardinal(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        int i6 = i3;
        for (int i7 = 0; i7 < i6; i7++) {
            long j2 = jArr2[i2 + i7];
            int i8 = i + i7;
            jArr[i8] = (j | (j2 << i4)) ^ jArr[i8];
            j = j2 >>> i5;
        }
        return j;
    }

    private int cca_continue(int i) {
        int i2 = (i + 62) >>> 6;
        while (i2 != 0) {
            i2--;
            long j = this.cca_continue[i2];
            if (j != 0) {
                return (i2 << 6) + init(j);
            }
        }
        return 0;
    }

    private static void cca_continue(long[] jArr, int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i3 >>> 6;
        int i6 = i2;
        while (true) {
            int i7 = i6 - 1;
            if (i7 <= i5) {
                break;
            }
            int i8 = i + i7;
            long j = jArr[i8];
            if (j != 0) {
                jArr[i8] = 0;
                configure(jArr, i, i7 << 6, j, i4, iArr);
            }
            i6 = i7;
        }
        int i9 = i3 & 63;
        int i10 = i + i5;
        long j2 = jArr[i10];
        long j3 = j2 >>> i9;
        if (j3 != 0) {
            jArr[i10] = (j3 << i9) ^ j2;
            configure(jArr, i, i3, j3, i4, iArr);
        }
    }

    private static void cca_continue(long[] jArr, int i, int i2, long j) {
        int i3 = i + (i2 >>> 6);
        int i4 = i2 & 63;
        if (i4 == 0) {
            jArr[i3] = jArr[i3] ^ j;
            return;
        }
        jArr[i3] = jArr[i3] ^ (j << i4);
        long j2 = j >>> (64 - i4);
        if (j2 != 0) {
            int i5 = i3 + 1;
            jArr[i5] = j2 ^ jArr[i5];
        }
    }

    private static long configure(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        while (true) {
            i3--;
            if (i3 < 0) {
                return j;
            }
            long j2 = jArr2[i2 + i3];
            int i6 = i + i3;
            jArr[i6] = (j | (j2 >>> i4)) ^ jArr[i6];
            j = j2 << i5;
        }
    }

    private static void configure(long[] jArr, int i, int i2, long j, int i3, int[] iArr) {
        int i4 = i2 - i3;
        int length = iArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                cca_continue(jArr, i, iArr[length] + i4, j);
            } else {
                cca_continue(jArr, i, i4, j);
                return;
            }
        }
    }

    static long getInstance(int i) {
        short[] sArr = configure;
        short s = sArr[i & 255] | (sArr[(i >>> 8) & 255] << 16);
        short s2 = sArr[(i >>> 16) & 255];
        return (((long) s) & 4294967295L) | ((((long) ((sArr[i >>> 24] << 16) | s2)) & 4294967295L) << 32);
    }

    private static void getInstance(long[] jArr, int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = (i3 << 6) - i4;
        int length = iArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                cca_continue(jArr, i, jArr, i + i3, i2 - i3, i5 + iArr[length]);
            } else {
                cca_continue(jArr, i, jArr, i + i3, i2 - i3, i5);
                return;
            }
        }
    }

    private static void getInstance(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            jArr[i6] = jArr[i6] ^ (jArr2[i2 + i5] ^ jArr3[i3 + i5]);
        }
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r3v12, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v12, types: [byte] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int init(long r3) {
        /*
            r0 = 32
            long r1 = r3 >>> r0
            int r1 = (int) r1
            if (r1 != 0) goto L_0x0009
            int r1 = (int) r3
            r0 = 0
        L_0x0009:
            int r3 = r1 >>> 16
            if (r3 != 0) goto L_0x001d
            int r3 = r1 >>> 8
            if (r3 != 0) goto L_0x0016
            byte[] r3 = Cardinal
            byte r3 = r3[r1]
            goto L_0x002e
        L_0x0016:
            byte[] r4 = Cardinal
            byte r3 = r4[r3]
            int r3 = r3 + 8
            goto L_0x002e
        L_0x001d:
            int r4 = r3 >>> 8
            if (r4 != 0) goto L_0x0028
            byte[] r4 = Cardinal
            byte r3 = r4[r3]
            int r3 = r3 + 16
            goto L_0x002e
        L_0x0028:
            byte[] r3 = Cardinal
            byte r3 = r3[r4]
            int r3 = r3 + 24
        L_0x002e:
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.newInstanceArray.init(long):int");
    }

    private static long init(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr[i + i6];
            jArr2[i2 + i6] = j | (j2 << i4);
            j = j2 >>> i5;
        }
        return j;
    }

    private static void init(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            jArr3[i3 + i5] = jArr[i + i5] ^ jArr2[i2 + i5];
        }
    }

    public final void cca_continue(int i, int[] iArr) {
        long[] jArr = this.cca_continue;
        int init = init(jArr, 0, jArr.length, i, iArr);
        if (init < jArr.length) {
            long[] jArr2 = new long[init];
            this.cca_continue = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, init);
        }
    }

    public final int configure(int i) {
        long[] jArr = this.cca_continue;
        int min = Math.min(i, jArr.length);
        if (min <= 0) {
            return 0;
        }
        if (jArr[0] != 0) {
            do {
                min--;
            } while (jArr[min] == 0);
            return min + 1;
        }
        do {
            min--;
            if (jArr[min] != 0) {
                return min + 1;
            }
        } while (min > 0);
        return 0;
    }

    public final boolean configure() {
        long[] jArr = this.cca_continue;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final newInstanceArray getInstance(int i, int[] iArr) {
        int init = init();
        if (init != 0) {
            int i2 = 1;
            if (init == 1) {
                return this;
            }
            int i3 = (i + 63) >>> 6;
            newInstanceArray newinstancearray = new newInstanceArray(i3);
            Cardinal(newinstancearray.cca_continue, 0, i, i, iArr);
            newInstanceArray newinstancearray2 = new newInstanceArray(i3);
            newinstancearray2.cca_continue[0] = 1;
            newInstanceArray newinstancearray3 = new newInstanceArray(i3);
            int i4 = i + 1;
            int[] iArr2 = {init, i4};
            newInstanceArray[] newinstancearrayArr = {(newInstanceArray) clone(), newinstancearray};
            int[] iArr3 = {1, 0};
            newInstanceArray[] newinstancearrayArr2 = {newinstancearray2, newinstancearray3};
            int i5 = iArr3[1];
            int i6 = i4 - init;
            while (true) {
                if (i6 < 0) {
                    i6 = -i6;
                    iArr2[i2] = i4;
                    iArr3[i2] = i5;
                    int i7 = 1 - i2;
                    int i8 = iArr2[i7];
                    int i9 = iArr3[i7];
                    i2 = i7;
                    i4 = i8;
                    i5 = i9;
                }
                int i10 = 1 - i2;
                newinstancearrayArr[i2].cca_continue(newinstancearrayArr[i10], iArr2[i10], i6);
                int cca_continue2 = newinstancearrayArr[i2].cca_continue(i4);
                if (cca_continue2 == 0) {
                    return newinstancearrayArr2[i10];
                }
                int i11 = iArr3[i10];
                newinstancearrayArr2[i2].cca_continue(newinstancearrayArr2[i10], i11, i6);
                int i12 = i11 + i6;
                if (i12 > i5) {
                    i5 = i12;
                } else if (i12 == i5) {
                    i5 = newinstancearrayArr2[i2].cca_continue(i5);
                }
                i6 += cca_continue2 - i4;
                i4 = cca_continue2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final newInstanceArray getInstance(newInstanceArray newinstancearray) {
        int i;
        int i2;
        newInstanceArray newinstancearray2;
        newInstanceArray newinstancearray3;
        int init = init();
        if (init == 0) {
            return this;
        }
        int init2 = newinstancearray.init();
        if (init2 == 0) {
            return newinstancearray;
        }
        if (init > init2) {
            i = init;
            i2 = init2;
            newinstancearray3 = this;
            newinstancearray2 = newinstancearray;
        } else {
            i2 = init;
            i = init2;
            newinstancearray2 = this;
            newinstancearray3 = newinstancearray;
        }
        int i3 = (i2 + 63) >>> 6;
        int i4 = (i + 63) >>> 6;
        int i5 = ((i2 + i) + 62) >>> 6;
        if (i3 == 1) {
            long j = newinstancearray2.cca_continue[0];
            if (j == 1) {
                return newinstancearray3;
            }
            long[] jArr = new long[i5];
            configure(j, newinstancearray3.cca_continue, i4, jArr);
            return new newInstanceArray(jArr, 0, i5);
        }
        int i6 = ((i + 7) + 63) >>> 6;
        int[] iArr = new int[16];
        int i7 = i6 << 4;
        long[] jArr2 = new long[i7];
        iArr[1] = i6;
        System.arraycopy(newinstancearray3.cca_continue, 0, jArr2, i6, i4);
        int i8 = i6;
        for (int i9 = 2; i9 < 16; i9++) {
            i8 += i6;
            iArr[i9] = i8;
            if ((i9 & 1) == 0) {
                init(jArr2, i8 >>> 1, jArr2, i8, i6, 1);
            } else {
                init(jArr2, i6, jArr2, i8 - i6, jArr2, i8, i6);
            }
        }
        long[] jArr3 = new long[i7];
        init(jArr2, 0, jArr3, 0, i7, 4);
        long[] jArr4 = newinstancearray2.cca_continue;
        int i10 = i5 << 3;
        long[] jArr5 = new long[i10];
        for (int i11 = 0; i11 < i3; i11++) {
            long j2 = jArr4[i11];
            int i12 = i11;
            while (true) {
                long j3 = j2 >>> 4;
                getInstance(jArr5, i12, jArr2, iArr[((int) j2) & 15], jArr3, iArr[((int) j3) & 15], i6);
                j2 = j3 >>> 4;
                if (j2 == 0) {
                    break;
                }
                i12 += i5;
            }
        }
        while (true) {
            i10 -= i5;
            if (i10 == 0) {
                return new newInstanceArray(jArr5, 0, i5);
            }
            Cardinal(jArr5, i10 - i5, jArr5, i10, i5, 8);
            jArr5 = jArr5;
        }
    }

    public final int init() {
        int length = this.cca_continue.length;
        while (length != 0) {
            length--;
            long j = this.cca_continue[length];
            if (j != 0) {
                return (length << 6) + init(j);
            }
        }
        return 0;
    }

    private void cca_continue(newInstanceArray newinstancearray, int i, int i2) {
        int i3 = (i + 63) >>> 6;
        int i4 = i2 >>> 6;
        int i5 = i2 & 63;
        if (i5 == 0) {
            long[] jArr = this.cca_continue;
            long[] jArr2 = newinstancearray.cca_continue;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = i4 + i6;
                jArr[i7] = jArr[i7] ^ jArr2[i6 + 0];
            }
            return;
        }
        long Cardinal2 = Cardinal(this.cca_continue, i4, newinstancearray.cca_continue, 0, i3, i5);
        if (Cardinal2 != 0) {
            long[] jArr3 = this.cca_continue;
            int i8 = i3 + i4;
            jArr3[i8] = Cardinal2 ^ jArr3[i8];
        }
    }

    public final void configure(newInstanceArray newinstancearray) {
        int configure2 = newinstancearray.configure(newinstancearray.cca_continue.length);
        if (configure2 != 0) {
            long[] jArr = this.cca_continue;
            if (configure2 > jArr.length) {
                long[] jArr2 = new long[configure2];
                System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, configure2));
                this.cca_continue = jArr2;
            }
            long[] jArr3 = this.cca_continue;
            long[] jArr4 = newinstancearray.cca_continue;
            for (int i = 0; i < configure2; i++) {
                int i2 = i + 0;
                jArr3[i2] = jArr3[i2] ^ jArr4[i2];
            }
        }
    }

    private static void configure(long j, long[] jArr, int i, long[] jArr2) {
        int i2 = i;
        if ((j & 1) != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 + 0;
                jArr2[i4] = jArr2[i4] ^ jArr[i4];
            }
        }
        long j2 = j;
        int i5 = 1;
        while (true) {
            long j3 = j2 >>> 1;
            if (j3 != 0) {
                if ((j3 & 1) != 0) {
                    long Cardinal2 = Cardinal(jArr2, 0, jArr, 0, i, i5);
                    if (Cardinal2 != 0) {
                        jArr2[i2] = Cardinal2 ^ jArr2[i2];
                    }
                }
                i5++;
                j2 = j3;
            } else {
                return;
            }
        }
    }

    public final newInstanceArray cca_continue(newInstanceArray newinstancearray, int i, int[] iArr) {
        int i2;
        int i3;
        newInstanceArray newinstancearray2;
        newInstanceArray newinstancearray3;
        long[] jArr;
        int i4 = i;
        int[] iArr2 = iArr;
        int init = init();
        if (init == 0) {
            return this;
        }
        int init2 = newinstancearray.init();
        if (init2 == 0) {
            return newinstancearray;
        }
        if (init > init2) {
            i2 = init;
            i3 = init2;
            newinstancearray3 = this;
            newinstancearray2 = newinstancearray;
        } else {
            i3 = init;
            i2 = init2;
            newinstancearray2 = this;
            newinstancearray3 = newinstancearray;
        }
        int i5 = (i3 + 63) >>> 6;
        int i6 = (i2 + 63) >>> 6;
        int i7 = ((i3 + i2) + 62) >>> 6;
        if (i5 == 1) {
            long j = newinstancearray2.cca_continue[0];
            if (j == 1) {
                return newinstancearray3;
            }
            long[] jArr2 = new long[i7];
            configure(j, newinstancearray3.cca_continue, i6, jArr2);
            return new newInstanceArray(jArr2, 0, init(jArr2, 0, i7, i4, iArr2));
        }
        int i8 = ((i2 + 7) + 63) >>> 6;
        int[] iArr3 = new int[16];
        int i9 = i8 << 4;
        long[] jArr3 = new long[i9];
        iArr3[1] = i8;
        System.arraycopy(newinstancearray3.cca_continue, 0, jArr3, i8, i6);
        int i10 = i8;
        for (int i11 = 2; i11 < 16; i11++) {
            i10 += i8;
            iArr3[i11] = i10;
            if ((i11 & 1) == 0) {
                init(jArr3, i10 >>> 1, jArr3, i10, i8, 1);
            } else {
                init(jArr3, i8, jArr3, i10 - i8, jArr3, i10, i8);
            }
        }
        long[] jArr4 = new long[i9];
        init(jArr3, 0, jArr4, 0, i9, 4);
        long[] jArr5 = newinstancearray2.cca_continue;
        int i12 = i7 << 3;
        long[] jArr6 = new long[i12];
        int i13 = 0;
        while (i13 < i5) {
            int i14 = i13;
            long j2 = jArr5[i13];
            while (true) {
                long j3 = j2 >>> 4;
                jArr = jArr5;
                getInstance(jArr6, i14, jArr3, iArr3[((int) j2) & 15], jArr4, iArr3[((int) j3) & 15], i8);
                j2 = j3 >>> 4;
                if (j2 == 0) {
                    break;
                }
                i14 += i7;
                jArr5 = jArr;
            }
            i13++;
            jArr5 = jArr;
        }
        while (true) {
            i12 -= i7;
            if (i12 != 0) {
                Cardinal(jArr6, i12 - i7, jArr6, i12, i7, 8);
                jArr6 = jArr6;
            } else {
                long[] jArr7 = jArr6;
                return new newInstanceArray(jArr7, 0, init(jArr7, 0, i7, i4, iArr2));
            }
        }
    }

    private static int init(long[] jArr, int i, int i2, int i3, int[] iArr) {
        long[] jArr2 = jArr;
        int i4 = i2;
        int i5 = i3;
        int[] iArr2 = iArr;
        int i6 = (i5 + 63) >>> 6;
        if (i4 < i6) {
            return i4;
        }
        int i7 = i4 << 6;
        int min = Math.min(i7, (i5 << 1) - 1);
        int i8 = i7 - min;
        int i9 = i4;
        while (i8 >= 64) {
            i9--;
            i8 -= 64;
        }
        int length = iArr2.length;
        int i10 = iArr2[length - 1];
        int i11 = length > 1 ? iArr2[length - 2] : 0;
        int max = Math.max(i5, i10 + 64);
        int min2 = (i8 + Math.min(min - max, i5 - i11)) >> 6;
        if (min2 > 1) {
            int i12 = i9 - min2;
            int i13 = i12;
            getInstance(jArr, 0, i9, i12, i3, iArr);
            while (i9 > i13) {
                i9--;
                jArr2[i9 + 0] = 0;
            }
            min = i13 << 6;
        }
        if (min > max) {
            cca_continue(jArr, 0, i9, max, i3, iArr);
        } else {
            max = min;
        }
        if (max > i5) {
            while (true) {
                max--;
                if (max < i5) {
                    break;
                }
                if ((jArr2[(max >>> 6) + 0] & (1 << (max & 63))) != 0) {
                    Cardinal(jArr2, 0, max, i5, iArr2);
                }
            }
        }
        return i6;
    }

    private static void Cardinal(long[] jArr, int i, int i2, int i3, int[] iArr) {
        int i4 = (i2 >>> 6) + i;
        jArr[i4] = (1 << (i2 & 63)) ^ jArr[i4];
        int i5 = i2 - i3;
        int length = iArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                int i6 = iArr[length] + i5;
                int i7 = (i6 >>> 6) + i;
                jArr[i7] = (1 << (i6 & 63)) ^ jArr[i7];
            } else {
                int i8 = i + (i5 >>> 6);
                jArr[i8] = jArr[i8] ^ (1 << (i5 & 63));
                return;
            }
        }
    }

    private static void cca_continue(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = i + (i4 >>> 6);
        int i6 = i4 & 63;
        if (i6 == 0) {
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = i5 + i7;
                jArr[i8] = jArr[i8] ^ jArr2[i2 + i7];
            }
            return;
        }
        jArr[i5] = configure(jArr, i5 + 1, jArr2, i2, i3, 64 - i6) ^ jArr[i5];
    }

    public final newInstanceArray Cardinal(int i, int[] iArr) {
        int configure2 = configure(this.cca_continue.length);
        if (configure2 == 0) {
            return this;
        }
        int i2 = configure2 << 1;
        long[] jArr = new long[i2];
        int i3 = 0;
        while (i3 < i2) {
            long j = this.cca_continue[i3 >>> 1];
            int i4 = i3 + 1;
            jArr[i3] = getInstance((int) j);
            i3 = i4 + 1;
            jArr[i4] = getInstance((int) (j >>> 32));
        }
        return new newInstanceArray(jArr, 0, init(jArr, 0, i2, i, iArr));
    }

    public final newInstanceArray getInstance(int i, int i2, int[] iArr) {
        int configure2 = configure(this.cca_continue.length);
        if (configure2 == 0) {
            return this;
        }
        int i3 = ((i2 + 63) >>> 6) << 1;
        long[] jArr = new long[i3];
        System.arraycopy(this.cca_continue, 0, jArr, 0, configure2);
        while (true) {
            i--;
            if (i < 0) {
                return new newInstanceArray(jArr, 0, configure2);
            }
            int i4 = configure2 << 1;
            while (true) {
                configure2--;
                if (configure2 < 0) {
                    break;
                }
                long j = jArr[configure2];
                int i5 = i4 - 1;
                jArr[i5] = getInstance((int) (j >>> 32));
                i4 = i5 - 1;
                jArr[i4] = getInstance((int) j);
            }
            configure2 = init(jArr, 0, i3, i2, iArr);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof newInstanceArray)) {
            return false;
        }
        newInstanceArray newinstancearray = (newInstanceArray) obj;
        int configure2 = configure(this.cca_continue.length);
        if (newinstancearray.configure(newinstancearray.cca_continue.length) != configure2) {
            return false;
        }
        for (int i = 0; i < configure2; i++) {
            if (this.cca_continue[i] != newinstancearray.cca_continue[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int configure2 = configure(this.cca_continue.length);
        int i = 1;
        for (int i2 = 0; i2 < configure2; i2++) {
            long j = this.cca_continue[i2];
            i = (((i * 31) ^ ((int) j)) * 31) ^ ((int) (j >>> 32));
        }
        return i;
    }

    public final Object clone() {
        long[] jArr;
        long[] jArr2 = this.cca_continue;
        if (jArr2 == null) {
            jArr = null;
        } else {
            long[] jArr3 = new long[jArr2.length];
            System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
            jArr = jArr3;
        }
        return new newInstanceArray(jArr);
    }

    public final String toString() {
        int configure2 = configure(this.cca_continue.length);
        if (configure2 == 0) {
            return "0";
        }
        int i = configure2 - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.cca_continue[i]));
        while (true) {
            i--;
            if (i < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.cca_continue[i]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }
}
