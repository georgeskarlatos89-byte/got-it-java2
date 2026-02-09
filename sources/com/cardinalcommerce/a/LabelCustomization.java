package com.cardinalcommerce.a;

import java.io.IOException;
import java.io.OutputStream;

public interface LabelCustomization {
    int init(String str, OutputStream outputStream) throws IOException;

    int init(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException;
}
