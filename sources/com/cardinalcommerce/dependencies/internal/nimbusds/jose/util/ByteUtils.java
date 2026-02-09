package com.cardinalcommerce.dependencies.internal.nimbusds.jose.util;

import com.cardinalcommerce.a.setHandwritingBoundsOffsets;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteUtils {
    public static byte[] cca_continue(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public static byte[] configure(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static int configure(int i) throws setHandwritingBoundsOffsets {
        long j = ((long) i) << 3;
        int i2 = (int) j;
        if (((long) i2) == j) {
            return i2;
        }
        throw new setHandwritingBoundsOffsets();
    }

    public static int init(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length << 3;
    }

    public static int getInstance(byte[] bArr) throws setHandwritingBoundsOffsets {
        if (bArr == null) {
            return 0;
        }
        long length = ((long) bArr.length) << 3;
        int i = (int) length;
        if (((long) i) == length) {
            return i;
        }
        throw new setHandwritingBoundsOffsets();
    }

    public static int Cardinal(int i) {
        return i / 8;
    }
}
