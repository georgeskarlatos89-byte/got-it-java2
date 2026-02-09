package com.cardinalcommerce.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class setHeadingTextFontSize {
    private static int getInstance = 4096;

    public static int Cardinal(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public static int init(InputStream inputStream, byte[] bArr) throws IOException {
        return Cardinal(inputStream, bArr, 0, bArr.length);
    }

    public static byte[] init(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = getInstance;
        byte[] bArr = new byte[i];
        while (true) {
            int read = inputStream.read(bArr, 0, i);
            if (read < 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
