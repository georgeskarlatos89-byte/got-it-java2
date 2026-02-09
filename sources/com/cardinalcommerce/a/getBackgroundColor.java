package com.cardinalcommerce.a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

public final class getBackgroundColor {
    public final Vector getInstance = new Vector();

    public static class Cardinal<T> implements Iterator<T> {
        private int Cardinal = 0;
        private final T[] getInstance;

        public Cardinal(T[] tArr) {
            this.getInstance = tArr;
        }

        public final boolean hasNext() {
            return this.Cardinal < this.getInstance.length;
        }

        public final T next() {
            int i = this.Cardinal;
            T[] tArr = this.getInstance;
            if (i != tArr.length) {
                this.Cardinal = i + 1;
                return tArr[i];
            }
            throw new NoSuchElementException(new StringBuilder("Out of elements: ").append(this.Cardinal).toString());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static int Cardinal(long[] jArr, int i) {
        if (jArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            long j = jArr[i];
            i2 = (((i2 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }

    public static boolean Cardinal(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] Cardinal(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return bArr2;
            }
            bArr2[length] = bArr[i];
            i++;
        }
    }

    public static int cca_continue(int[] iArr, int i) {
        if (iArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ iArr[i];
        }
    }

    public static boolean cca_continue(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i != iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] cca_continue(byte[] bArr, int i, int i2) {
        int init = init(i, i2);
        byte[] bArr2 = new byte[init];
        if (bArr.length - i < init) {
            init = bArr.length - i;
        }
        System.arraycopy(bArr, i, bArr2, 0, init);
        return bArr2;
    }

    public static int[] cca_continue(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return iArr2;
            }
            iArr2[length] = iArr[i];
            i++;
        }
    }

    public static boolean configure(byte[] bArr, int i, int i2) {
        byte b = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            b |= bArr[i + i3];
        }
        return b == 0;
    }

    public static byte[] configure(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null || bArr2 == null || bArr3 == null || bArr4 == null) {
            return bArr4 == null ? getInstance(bArr, bArr2, bArr3) : bArr3 == null ? getInstance(bArr, bArr2, bArr4) : bArr2 == null ? getInstance(bArr, bArr3, bArr4) : getInstance(bArr2, bArr3, bArr4);
        }
        byte[] bArr5 = new byte[(bArr.length + bArr2.length + bArr3.length + bArr4.length)];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
        return bArr5;
    }

    public static int getInstance(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArr[length] & 255);
        }
    }

    public static byte[] getInstance(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            return bArr == null ? configure(bArr2, bArr3) : bArr2 == null ? configure(bArr, bArr3) : configure(bArr, bArr2);
        }
        byte[] bArr4 = new byte[(bArr.length + bArr2.length + bArr3.length)];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static int[] getInstance(int[] iArr, int i) {
        int init = init(1, i);
        int[] iArr2 = new int[init];
        if (iArr.length - 1 < init) {
            init = iArr.length - 1;
        }
        System.arraycopy(iArr, 1, iArr2, 0, init);
        return iArr2;
    }

    private static int init(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ").append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int init(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static int init(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    public static boolean init(byte[] bArr, byte[] bArr2) {
        if (!(bArr == null || bArr2 == null)) {
            if (bArr == bArr2) {
                return true;
            }
            int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
            byte length2 = bArr.length ^ bArr2.length;
            for (int i = 0; i != length; i++) {
                length2 |= bArr[i] ^ bArr2[i];
            }
            while (length < bArr2.length) {
                byte b = bArr2[length];
                length2 |= b ^ (~b);
                length++;
            }
            if (length2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] configure(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return bArr3;
        } else if (bArr2 != null) {
            if (bArr2 == null) {
                return null;
            }
            byte[] bArr4 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            return bArr4;
        } else if (bArr == null) {
            return null;
        } else {
            byte[] bArr5 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
            return bArr5;
        }
    }
}
