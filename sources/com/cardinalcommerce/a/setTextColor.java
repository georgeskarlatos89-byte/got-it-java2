package com.cardinalcommerce.a;

import java.io.ByteArrayOutputStream;

public final class setTextColor {
    private static final LabelCustomization init = new setTextFontName();

    public static byte[] cca_continue(byte[] bArr) {
        return init(bArr, bArr.length);
    }

    public static byte[] getInstance(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            init.init(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new setHeadingTextFontName(new StringBuilder("unable to decode base64 string: ").append(e.getMessage()).toString(), e);
        }
    }

    private static byte[] init(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i + 2) / 3) << 2);
        try {
            init.init(bArr, 0, i, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new getHeadingTextColor(new StringBuilder("exception encoding base64 string: ").append(e.getMessage()).toString(), e);
        }
    }
}
