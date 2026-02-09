package com.cardinalcommerce.a;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.OutputStream;

public final class setHeadingTextColor implements LabelCustomization {
    private byte[] cca_continue = new byte[128];
    private byte[] init = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    public final int init(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte b = bArr[i3] & 255;
            outputStream.write(this.init[b >>> 4]);
            outputStream.write(this.init[b & Ascii.SI]);
        }
        return i2 << 1;
    }

    public setHeadingTextColor() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.cca_continue;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.init;
            if (i < bArr2.length) {
                this.cca_continue[bArr2[i]] = (byte) i;
                i++;
            } else {
                byte[] bArr3 = this.cca_continue;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }

    public final int init(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0) {
            char charAt = str.charAt(length - 1);
            if (!(charAt == 10 || charAt == 13 || charAt == 9 || charAt == ' ')) {
                break;
            }
            length--;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (!(charAt2 == 10 || charAt2 == 13 || charAt2 == 9 || charAt2 == ' ')) {
                    break;
                }
                i++;
            }
            int i3 = i + 1;
            byte b = this.cca_continue[str.charAt(i)];
            while (i3 < length) {
                char charAt3 = str.charAt(i3);
                if (!(charAt3 == 10 || charAt3 == 13 || charAt3 == 9 || charAt3 == ' ')) {
                    break;
                }
                i3++;
            }
            int i4 = i3 + 1;
            byte b2 = this.cca_continue[str.charAt(i3)];
            if ((b | b2) >= 0) {
                outputStream.write((b << 4) | b2);
                i2++;
                i = i4;
            } else {
                throw new IOException("invalid characters encountered in Hex string");
            }
        }
        return i2;
    }
}
