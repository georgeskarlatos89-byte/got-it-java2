package com.cardinalcommerce.a;

import java.io.ByteArrayOutputStream;

public final class getHeadingTextFontName {
    private static final LabelCustomization getInstance = new setHeadingTextColor();

    public static byte[] cca_continue(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            getInstance.init(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new getHeadingTextColor(new StringBuilder("exception encoding Hex string: ").append(e.getMessage()).toString(), e);
        }
    }

    public static byte[] init(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            getInstance.init(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new setHeadingTextFontName(new StringBuilder("exception decoding Hex string: ").append(e.getMessage()).toString(), e);
        }
    }

    public static byte[] init(byte[] bArr) {
        return cca_continue(bArr, 0, bArr.length);
    }

    public static String configure(byte[] bArr) {
        return getTextFontSize.getInstance(cca_continue(bArr, 0, bArr.length));
    }
}
