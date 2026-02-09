package com.cardinalcommerce.a;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.io.encoding.Base64;

public final class setTextFontName implements LabelCustomization {
    private byte[] cca_continue = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private byte[] getInstance = new byte[128];
    private byte init = Base64.padSymbol;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int init(byte[] r10, int r11, int r12, java.io.OutputStream r13) throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r12 % 3
            int r12 = r12 - r0
            r1 = r11
        L_0x0004:
            int r2 = r11 + r12
            r3 = 4
            r4 = 2
            if (r1 >= r2) goto L_0x004c
            byte r2 = r10[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r1 + 1
            byte r5 = r10[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r1 + 2
            byte r6 = r10[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte[] r7 = r9.cca_continue
            int r8 = r2 >>> 2
            r8 = r8 & 63
            byte r7 = r7[r8]
            r13.write(r7)
            byte[] r7 = r9.cca_continue
            int r2 = r2 << r3
            int r3 = r5 >>> 4
            r2 = r2 | r3
            r2 = r2 & 63
            byte r2 = r7[r2]
            r13.write(r2)
            byte[] r2 = r9.cca_continue
            int r3 = r5 << 2
            int r4 = r6 >>> 6
            r3 = r3 | r4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r13.write(r2)
            byte[] r2 = r9.cca_continue
            r3 = r6 & 63
            byte r2 = r2[r3]
            r13.write(r2)
            int r1 = r1 + 3
            goto L_0x0004
        L_0x004c:
            r11 = 1
            if (r0 == r11) goto L_0x007b
            if (r0 == r4) goto L_0x0052
            goto L_0x009e
        L_0x0052:
            byte r1 = r10[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r11
            byte r10 = r10[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r11 = r1 >>> 2
            r11 = r11 & 63
            int r1 = r1 << r3
            int r2 = r10 >>> 4
            r1 = r1 | r2
            r1 = r1 & 63
            int r10 = r10 << r4
            r10 = r10 & 63
            byte[] r2 = r9.cca_continue
            byte r11 = r2[r11]
            r13.write(r11)
            byte[] r11 = r9.cca_continue
            byte r11 = r11[r1]
            r13.write(r11)
            byte[] r11 = r9.cca_continue
            byte r10 = r11[r10]
            goto L_0x0096
        L_0x007b:
            byte r10 = r10[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r11 = r10 >>> 2
            r11 = r11 & 63
            int r10 = r10 << r3
            r10 = r10 & 63
            byte[] r1 = r9.cca_continue
            byte r11 = r1[r11]
            r13.write(r11)
            byte[] r11 = r9.cca_continue
            byte r10 = r11[r10]
            r13.write(r10)
            byte r10 = r9.init
        L_0x0096:
            r13.write(r10)
            byte r10 = r9.init
            r13.write(r10)
        L_0x009e:
            int r12 = r12 / 3
            int r10 = r12 << 2
            if (r0 != 0) goto L_0x00a5
            r3 = 0
        L_0x00a5:
            int r10 = r10 + r3
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setTextFontName.init(byte[], int, int, java.io.OutputStream):int");
    }

    public setTextFontName() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.getInstance;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.cca_continue;
            if (i < bArr2.length) {
                this.getInstance[bArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }

    public final int init(String str, OutputStream outputStream) throws IOException {
        boolean z;
        int i;
        String str2 = str;
        OutputStream outputStream2 = outputStream;
        int length = str.length();
        while (true) {
            z = false;
            if (length > 0) {
                char charAt = str2.charAt(length - 1);
                if (!(charAt == 10 || charAt == 13 || charAt == 9 || charAt == ' ')) {
                    break;
                }
                length--;
            } else {
                break;
            }
        }
        if (length == 0) {
            return 0;
        }
        int i2 = length;
        int i3 = 0;
        while (i2 > 0 && i3 != 4) {
            char charAt2 = str2.charAt(i2 - 1);
            if (!(charAt2 == 10 || charAt2 == 13 || charAt2 == 9 || charAt2 == ' ')) {
                i3++;
            }
            i2--;
        }
        int i4 = 0;
        while (i < i2) {
            char charAt3 = str2.charAt(i);
            if (!(charAt3 == 10 || charAt3 == 13 || charAt3 == 9 || charAt3 == ' ')) {
                break;
            }
            i4 = i + 1;
        }
        int i5 = 0;
        while (i < i2) {
            int i6 = i + 1;
            byte b = this.getInstance[str2.charAt(i)];
            while (i6 < i2) {
                char charAt4 = str2.charAt(i6);
                if (!((charAt4 == 10 || charAt4 == 13 || charAt4 == 9 || charAt4 == ' ') ? true : z)) {
                    break;
                }
                i6++;
            }
            byte b2 = this.getInstance[str2.charAt(i6)];
            int i7 = i6 + 1;
            while (i7 < i2) {
                char charAt5 = str2.charAt(i7);
                if (!((charAt5 == 10 || charAt5 == 13 || charAt5 == 9 || charAt5 == ' ') ? true : z)) {
                    break;
                }
                i7++;
            }
            byte b3 = this.getInstance[str2.charAt(i7)];
            int i8 = i7 + 1;
            while (i8 < i2) {
                char charAt6 = str2.charAt(i8);
                if (!(charAt6 == 10 || charAt6 == 13 || charAt6 == 9 || charAt6 == ' ')) {
                    break;
                }
                i8++;
            }
            int i9 = i8 + 1;
            byte b4 = this.getInstance[str2.charAt(i8)];
            if ((b | b2 | b3 | b4) >= 0) {
                outputStream2.write((b << 2) | (b2 >> 4));
                outputStream2.write((b2 << 4) | (b3 >> 2));
                outputStream2.write((b3 << 6) | b4);
                i5 += 3;
                i = i9;
                while (i < i2) {
                    char charAt7 = str2.charAt(i);
                    if (!(charAt7 == 10 || charAt7 == 13 || charAt7 == 9 || charAt7 == ' ')) {
                        break;
                    }
                    i++;
                }
                z = false;
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        while (i < length) {
            char charAt8 = str2.charAt(i);
            if (!(charAt8 == 10 || charAt8 == 13 || charAt8 == 9 || charAt8 == ' ')) {
                break;
            }
            i++;
        }
        int i10 = i + 1;
        while (i10 < length) {
            char charAt9 = str2.charAt(i10);
            if (!(charAt9 == 10 || charAt9 == 13 || charAt9 == 9 || charAt9 == ' ')) {
                break;
            }
            i10++;
        }
        int i11 = i10 + 1;
        while (i11 < length) {
            char charAt10 = str2.charAt(i11);
            if (!(charAt10 == 10 || charAt10 == 13 || charAt10 == 9 || charAt10 == ' ')) {
                break;
            }
            i11++;
        }
        int i12 = i11 + 1;
        while (i12 < length) {
            char charAt11 = str2.charAt(i12);
            if (!(charAt11 == 10 || charAt11 == 13 || charAt11 == 9 || charAt11 == ' ')) {
                break;
            }
            i12++;
        }
        char charAt12 = str2.charAt(i);
        char charAt13 = str2.charAt(i10);
        char charAt14 = str2.charAt(i11);
        char charAt15 = str2.charAt(i12);
        byte b5 = this.init;
        int i13 = 2;
        if (charAt14 == b5) {
            if (charAt15 == b5) {
                byte[] bArr = this.getInstance;
                byte b6 = bArr[charAt12];
                byte b7 = bArr[charAt13];
                if ((b6 | b7) >= 0) {
                    outputStream2.write((b7 >> 4) | (b6 << 2));
                    i13 = 1;
                } else {
                    throw new IOException("invalid characters encountered at end of base64 data");
                }
            } else {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
        } else if (charAt15 == b5) {
            byte[] bArr2 = this.getInstance;
            byte b8 = bArr2[charAt12];
            byte b9 = bArr2[charAt13];
            byte b10 = bArr2[charAt14];
            if ((b8 | b9 | b10) >= 0) {
                outputStream2.write((b8 << 2) | (b9 >> 4));
                outputStream2.write((b10 >> 2) | (b9 << 4));
            } else {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
        } else {
            byte[] bArr3 = this.getInstance;
            byte b11 = bArr3[charAt12];
            byte b12 = bArr3[charAt13];
            byte b13 = bArr3[charAt14];
            byte b14 = bArr3[charAt15];
            if ((b11 | b12 | b13 | b14) >= 0) {
                outputStream2.write((b11 << 2) | (b12 >> 4));
                outputStream2.write((b12 << 4) | (b13 >> 2));
                outputStream2.write(b14 | (b13 << 6));
                i13 = 3;
            } else {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
        }
        return i5 + i13;
    }
}
