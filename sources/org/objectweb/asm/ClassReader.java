package org.objectweb.asm;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import okio.Utf8;

public class ClassReader {
    public static final int EXPAND_FRAMES = 8;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;
    private final int[] a;
    public final byte[] b;
    private final String[] c;
    private final int d;
    public final int header;

    public ClassReader(InputStream inputStream) throws IOException {
        this(a(inputStream, false));
    }

    public ClassReader(String str) throws IOException {
        this(a(ClassLoader.getSystemResourceAsStream(new StringBuffer().append(str.replace('.', '/')).append(".class").toString()), true));
    }

    public ClassReader(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ClassReader(byte[] bArr, int i, int i2) {
        this.b = bArr;
        if (readShort(i + 6) <= 52) {
            int[] iArr = new int[readUnsignedShort(i + 8)];
            this.a = iArr;
            int length = iArr.length;
            this.c = new String[length];
            int i3 = i + 10;
            int i4 = 0;
            int i5 = 1;
            while (i5 < length) {
                int i6 = i3 + 1;
                this.a[i5] = i6;
                byte b2 = bArr[i3];
                int i7 = 3;
                if (b2 == 1) {
                    i7 = 3 + readUnsignedShort(i6);
                    if (i7 > i4) {
                        i4 = i7;
                    }
                } else if (b2 != 15) {
                    if (!(b2 == 18 || b2 == 3 || b2 == 4)) {
                        if (b2 != 5 && b2 != 6) {
                            switch (b2) {
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                    break;
                            }
                        } else {
                            i5++;
                            i7 = 9;
                        }
                    }
                    i7 = 5;
                } else {
                    i7 = 4;
                }
                i3 += i7;
                i5++;
            }
            this.d = i4;
            this.header = i3;
            return;
        }
        throw new IllegalArgumentException();
    }

    private int a() {
        int i = this.header;
        int readUnsignedShort = i + 8 + (readUnsignedShort(i + 6) * 2);
        for (int readUnsignedShort2 = readUnsignedShort(readUnsignedShort); readUnsignedShort2 > 0; readUnsignedShort2--) {
            for (int readUnsignedShort3 = readUnsignedShort(readUnsignedShort + 8); readUnsignedShort3 > 0; readUnsignedShort3--) {
                readUnsignedShort += readInt(readUnsignedShort + 12) + 6;
            }
            readUnsignedShort += 8;
        }
        int i2 = readUnsignedShort + 2;
        for (int readUnsignedShort4 = readUnsignedShort(i2); readUnsignedShort4 > 0; readUnsignedShort4--) {
            for (int readUnsignedShort5 = readUnsignedShort(i2 + 8); readUnsignedShort5 > 0; readUnsignedShort5--) {
                i2 += readInt(i2 + 12) + 6;
            }
            i2 += 8;
        }
        return i2 + 2;
    }

    private int a(int i, boolean z, boolean z2, Context context) {
        int i2;
        int i3;
        int i4;
        char[] cArr = context.c;
        Label[] labelArr = context.h;
        if (z) {
            int i5 = i + 1;
            i2 = this.b[i] & 255;
            i3 = i5;
        } else {
            context.o = -1;
            i3 = i;
            i2 = 255;
        }
        int i6 = 0;
        context.r = 0;
        if (i2 < 64) {
            context.p = 3;
            context.t = 0;
        } else if (i2 < 128) {
            i2 -= 64;
            i3 = a(context.u, 0, i3, cArr, labelArr);
            context.p = 4;
            context.t = 1;
        } else {
            int readUnsignedShort = readUnsignedShort(i3);
            int i7 = i3 + 2;
            if (i2 == 247) {
                i4 = a(context.u, 0, i7, cArr, labelArr);
                context.p = 4;
                context.t = 1;
            } else {
                if (i2 < 248 || i2 >= 251) {
                    if (i2 != 251) {
                        if (i2 >= 255) {
                            context.p = 0;
                            int readUnsignedShort2 = readUnsignedShort(i7);
                            int i8 = i7 + 2;
                            context.r = readUnsignedShort2;
                            context.q = readUnsignedShort2;
                            int i9 = 0;
                            while (readUnsignedShort2 > 0) {
                                i8 = a(context.s, i9, i8, cArr, labelArr);
                                readUnsignedShort2--;
                                i9++;
                            }
                            int readUnsignedShort3 = readUnsignedShort(i8);
                            i4 = i8 + 2;
                            context.t = readUnsignedShort3;
                            while (true) {
                                int i10 = i6;
                                if (readUnsignedShort3 <= 0) {
                                    break;
                                }
                                i6 = i10 + 1;
                                i4 = a(context.u, i10, i4, cArr, labelArr);
                                readUnsignedShort3--;
                            }
                        } else {
                            int i11 = i2 - 251;
                            int i12 = z2 ? context.q : 0;
                            int i13 = i11;
                            while (i13 > 0) {
                                i7 = a(context.s, i12, i7, cArr, labelArr);
                                i13--;
                                i12++;
                            }
                            context.p = 1;
                            context.r = i11;
                            context.q += context.r;
                        }
                    } else {
                        context.p = 3;
                    }
                } else {
                    context.p = 2;
                    context.r = 251 - i2;
                    context.q -= context.r;
                }
                context.t = 0;
            }
            i2 = readUnsignedShort;
        }
        context.o += i2 + 1;
        readLabel(context.o, labelArr);
        return i3;
    }

    private int a(int i, char[] cArr, String str, AnnotationVisitor annotationVisitor) {
        Object obj;
        Object sh;
        int i2 = 0;
        if (annotationVisitor == null) {
            byte b2 = this.b[i] & 255;
            return b2 != 64 ? b2 != 91 ? b2 != 101 ? i + 3 : i + 5 : a(i + 1, cArr, false, (AnnotationVisitor) null) : a(i + 3, cArr, true, (AnnotationVisitor) null);
        }
        int i3 = i + 1;
        byte b3 = this.b[i] & 255;
        if (b3 == 64) {
            return a(i3 + 2, cArr, true, annotationVisitor.visitAnnotation(str, readUTF8(i3, cArr)));
        }
        if (b3 != 70) {
            if (b3 != 83) {
                if (b3 == 99) {
                    obj = Type.getType(readUTF8(i3, cArr));
                } else if (b3 == 101) {
                    annotationVisitor.visitEnum(str, readUTF8(i3, cArr), readUTF8(i3 + 2, cArr));
                    return i3 + 4;
                } else if (b3 == 115) {
                    obj = readUTF8(i3, cArr);
                } else if (!(b3 == 73 || b3 == 74)) {
                    if (b3 == 90) {
                        obj = readInt(this.a[readUnsignedShort(i3)]) == 0 ? Boolean.FALSE : Boolean.TRUE;
                    } else if (b3 != 91) {
                        switch (b3) {
                            case 66:
                                sh = new Byte((byte) readInt(this.a[readUnsignedShort(i3)]));
                                break;
                            case 67:
                                sh = new Character((char) readInt(this.a[readUnsignedShort(i3)]));
                                break;
                            case 68:
                                break;
                            default:
                                return i3;
                        }
                    } else {
                        int readUnsignedShort = readUnsignedShort(i3);
                        int i4 = i3 + 2;
                        if (readUnsignedShort == 0) {
                            return a(i4 - 2, cArr, false, annotationVisitor.visitArray(str));
                        }
                        int i5 = i4 + 1;
                        byte b4 = this.b[i4] & 255;
                        if (b4 == 70) {
                            float[] fArr = new float[readUnsignedShort];
                            while (i2 < readUnsignedShort) {
                                fArr[i2] = Float.intBitsToFloat(readInt(this.a[readUnsignedShort(i5)]));
                                i5 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, fArr);
                        } else if (b4 == 83) {
                            short[] sArr = new short[readUnsignedShort];
                            while (i2 < readUnsignedShort) {
                                sArr[i2] = (short) readInt(this.a[readUnsignedShort(i5)]);
                                i5 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, sArr);
                        } else if (b4 == 90) {
                            boolean[] zArr = new boolean[readUnsignedShort];
                            for (int i6 = 0; i6 < readUnsignedShort; i6++) {
                                zArr[i6] = readInt(this.a[readUnsignedShort(i5)]) != 0;
                                i5 += 3;
                            }
                            annotationVisitor.visit(str, zArr);
                        } else if (b4 == 73) {
                            int[] iArr = new int[readUnsignedShort];
                            while (i2 < readUnsignedShort) {
                                iArr[i2] = readInt(this.a[readUnsignedShort(i5)]);
                                i5 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, iArr);
                        } else if (b4 != 74) {
                            switch (b4) {
                                case 66:
                                    byte[] bArr = new byte[readUnsignedShort];
                                    while (i2 < readUnsignedShort) {
                                        bArr[i2] = (byte) readInt(this.a[readUnsignedShort(i5)]);
                                        i5 += 3;
                                        i2++;
                                    }
                                    annotationVisitor.visit(str, bArr);
                                    break;
                                case 67:
                                    char[] cArr2 = new char[readUnsignedShort];
                                    while (i2 < readUnsignedShort) {
                                        cArr2[i2] = (char) readInt(this.a[readUnsignedShort(i5)]);
                                        i5 += 3;
                                        i2++;
                                    }
                                    annotationVisitor.visit(str, cArr2);
                                    break;
                                case 68:
                                    double[] dArr = new double[readUnsignedShort];
                                    while (i2 < readUnsignedShort) {
                                        dArr[i2] = Double.longBitsToDouble(readLong(this.a[readUnsignedShort(i5)]));
                                        i5 += 3;
                                        i2++;
                                    }
                                    annotationVisitor.visit(str, dArr);
                                    break;
                                default:
                                    return a(i5 - 3, cArr, false, annotationVisitor.visitArray(str));
                            }
                        } else {
                            long[] jArr = new long[readUnsignedShort];
                            while (i2 < readUnsignedShort) {
                                jArr[i2] = readLong(this.a[readUnsignedShort(i5)]);
                                i5 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, jArr);
                        }
                        return i5 - 1;
                    }
                }
                annotationVisitor.visit(str, obj);
                return i3 + 2;
            }
            sh = new Short((short) readInt(this.a[readUnsignedShort(i3)]));
            annotationVisitor.visit(str, sh);
            return i3 + 2;
        }
        obj = readConst(readUnsignedShort(i3), cArr);
        annotationVisitor.visit(str, obj);
        return i3 + 2;
    }

    private int a(int i, char[] cArr, boolean z, AnnotationVisitor annotationVisitor) {
        int readUnsignedShort = readUnsignedShort(i);
        int i2 = i + 2;
        if (z) {
            while (readUnsignedShort > 0) {
                i2 = a(i2 + 2, cArr, readUTF8(i2, cArr), annotationVisitor);
                readUnsignedShort--;
            }
        } else {
            while (readUnsignedShort > 0) {
                i2 = a(i2, cArr, (String) null, annotationVisitor);
                readUnsignedShort--;
            }
        }
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
        return i2;
    }

    private int a(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        Context context2 = context;
        int i3 = i;
        char[] cArr = context2.c;
        int readUnsignedShort = readUnsignedShort(i3);
        String readUTF8 = readUTF8(i3 + 2, cArr);
        String readUTF82 = readUTF8(i3 + 4, cArr);
        int i4 = i3 + 6;
        int i5 = i4;
        int i6 = readUnsignedShort;
        int readUnsignedShort2 = readUnsignedShort(i4);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        Attribute attribute = null;
        String str = null;
        Object obj = null;
        while (readUnsignedShort2 > 0) {
            String readUTF83 = readUTF8(i5 + 2, cArr);
            if ("ConstantValue".equals(readUTF83)) {
                int readUnsignedShort3 = readUnsignedShort(i5 + 8);
                obj = readUnsignedShort3 == 0 ? null : readConst(readUnsignedShort3, cArr);
            } else if ("Signature".equals(readUTF83)) {
                str = readUTF8(i5 + 8, cArr);
            } else {
                if ("Deprecated".equals(readUTF83)) {
                    i2 = 131072;
                } else if ("Synthetic".equals(readUTF83)) {
                    i2 = 266240;
                } else if ("RuntimeVisibleAnnotations".equals(readUTF83)) {
                    i10 = i5 + 8;
                } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF83)) {
                    i8 = i5 + 8;
                } else if ("RuntimeInvisibleAnnotations".equals(readUTF83)) {
                    i9 = i5 + 8;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF83)) {
                    i7 = i5 + 8;
                } else {
                    Attribute attribute2 = attribute;
                    int i11 = i7;
                    int i12 = i8;
                    int i13 = i9;
                    int i14 = i10;
                    attribute = a(context2.a, readUTF83, i5 + 8, readInt(i5 + 4), cArr, -1, (Label[]) null);
                    Attribute attribute3 = attribute2;
                    if (attribute != null) {
                        attribute.a = attribute3;
                        i9 = i13;
                    } else {
                        i9 = i13;
                        attribute = attribute3;
                    }
                    i10 = i14;
                    i7 = i11;
                    i8 = i12;
                }
                i6 |= i2;
            }
            i5 += readInt(i5 + 4) + 6;
            readUnsignedShort2--;
            context2 = context;
        }
        Attribute attribute4 = attribute;
        int i15 = i7;
        int i16 = i8;
        int i17 = i9;
        int i18 = i10;
        int i19 = i5 + 2;
        FieldVisitor visitField = classVisitor.visitField(i6, readUTF8, readUTF82, str, obj);
        if (visitField == null) {
            return i19;
        }
        if (i18 != 0) {
            int i20 = i18 + 2;
            for (int readUnsignedShort4 = readUnsignedShort(i18); readUnsignedShort4 > 0; readUnsignedShort4--) {
                i20 = a(i20 + 2, cArr, true, visitField.visitAnnotation(readUTF8(i20, cArr), true));
            }
        }
        if (i17 != 0) {
            int i21 = i17;
            int i22 = i21 + 2;
            for (int readUnsignedShort5 = readUnsignedShort(i21); readUnsignedShort5 > 0; readUnsignedShort5--) {
                i22 = a(i22 + 2, cArr, true, visitField.visitAnnotation(readUTF8(i22, cArr), false));
            }
        }
        int i23 = i16;
        if (i23 != 0) {
            int i24 = i23 + 2;
            for (int readUnsignedShort6 = readUnsignedShort(i23); readUnsignedShort6 > 0; readUnsignedShort6--) {
                Context context3 = context;
                int a2 = a(context3, i24);
                i24 = a(a2 + 2, cArr, true, visitField.visitTypeAnnotation(context3.i, context3.j, readUTF8(a2, cArr), true));
            }
        }
        Context context4 = context;
        int i25 = i15;
        if (i25 != 0) {
            int i26 = i25 + 2;
            for (int readUnsignedShort7 = readUnsignedShort(i25); readUnsignedShort7 > 0; readUnsignedShort7--) {
                int a3 = a(context4, i26);
                i26 = a(a3 + 2, cArr, true, visitField.visitTypeAnnotation(context4.i, context4.j, readUTF8(a3, cArr), false));
            }
        }
        while (attribute4 != null) {
            Attribute attribute5 = attribute4.a;
            attribute4.a = null;
            visitField.visitAttribute(attribute4);
            attribute4 = attribute5;
        }
        visitField.visitEnd();
        return i19;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(org.objectweb.asm.Context r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.readInt(r10)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L_0x0075
            if (r1 == r2) goto L_0x0075
            r3 = 64
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r1 == r3) goto L_0x002f
            r3 = 65
            if (r1 == r3) goto L_0x002f
            switch(r1) {
                case 19: goto L_0x002c;
                case 20: goto L_0x002c;
                case 21: goto L_0x002c;
                case 22: goto L_0x0075;
                default: goto L_0x0018;
            }
        L_0x0018:
            switch(r1) {
                case 71: goto L_0x0025;
                case 72: goto L_0x0025;
                case 73: goto L_0x0025;
                case 74: goto L_0x0025;
                case 75: goto L_0x0025;
                default: goto L_0x001b;
            }
        L_0x001b:
            r3 = 67
            if (r1 >= r3) goto L_0x0021
            r4 = -256(0xffffffffffffff00, float:NaN)
        L_0x0021:
            r0 = r0 & r4
            int r10 = r10 + 3
            goto L_0x007a
        L_0x0025:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r10 = r10 + 4
            goto L_0x007a
        L_0x002c:
            r0 = r0 & r4
            int r10 = r10 + r2
            goto L_0x007a
        L_0x002f:
            r0 = r0 & r4
            int r1 = r10 + 1
            int r1 = r8.readUnsignedShort(r1)
            org.objectweb.asm.Label[] r3 = new org.objectweb.asm.Label[r1]
            r9.l = r3
            org.objectweb.asm.Label[] r3 = new org.objectweb.asm.Label[r1]
            r9.m = r3
            int[] r3 = new int[r1]
            r9.n = r3
            int r10 = r10 + 3
            r3 = 0
        L_0x0045:
            if (r3 >= r1) goto L_0x007a
            int r4 = r8.readUnsignedShort(r10)
            int r5 = r10 + 2
            int r5 = r8.readUnsignedShort(r5)
            org.objectweb.asm.Label[] r6 = r9.l
            org.objectweb.asm.Label[] r7 = r9.h
            org.objectweb.asm.Label r7 = r8.readLabel(r4, r7)
            r6[r3] = r7
            org.objectweb.asm.Label[] r6 = r9.m
            int r4 = r4 + r5
            org.objectweb.asm.Label[] r5 = r9.h
            org.objectweb.asm.Label r4 = r8.readLabel(r4, r5)
            r6[r3] = r4
            int[] r4 = r9.n
            int r5 = r10 + 4
            int r5 = r8.readUnsignedShort(r5)
            r4[r3] = r5
            int r10 = r10 + 6
            int r3 = r3 + 1
            goto L_0x0045
        L_0x0075:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r10 = r10 + 2
        L_0x007a:
            int r1 = r8.readByte(r10)
            r9.i = r0
            if (r1 != 0) goto L_0x0084
            r0 = 0
            goto L_0x008b
        L_0x0084:
            org.objectweb.asm.TypePath r0 = new org.objectweb.asm.TypePath
            byte[] r3 = r8.b
            r0.<init>(r3, r10)
        L_0x008b:
            r9.j = r0
            int r10 = r10 + r2
            int r1 = r1 * 2
            int r10 = r10 + r1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.a(org.objectweb.asm.Context, int):int");
    }

    private int a(Object[] objArr, int i, int i2, char[] cArr, Label[] labelArr) {
        int i3 = i2 + 1;
        switch (this.b[i2] & 255) {
            case 0:
                objArr[i] = Opcodes.TOP;
                return i3;
            case 1:
                objArr[i] = Opcodes.INTEGER;
                return i3;
            case 2:
                objArr[i] = Opcodes.FLOAT;
                return i3;
            case 3:
                objArr[i] = Opcodes.DOUBLE;
                return i3;
            case 4:
                objArr[i] = Opcodes.LONG;
                return i3;
            case 5:
                objArr[i] = Opcodes.NULL;
                return i3;
            case 6:
                objArr[i] = Opcodes.UNINITIALIZED_THIS;
                return i3;
            case 7:
                objArr[i] = readClass(i3, cArr);
                break;
            default:
                objArr[i] = readLabel(readUnsignedShort(i3), labelArr);
                break;
        }
        return i3 + 2;
    }

    private String a(int i, int i2, char[] cArr) {
        byte b2;
        int i3 = i2 + i;
        byte[] bArr = this.b;
        int i4 = 0;
        boolean z = false;
        char c2 = 0;
        while (i < i3) {
            int i5 = i + 1;
            byte b3 = bArr[i];
            if (z) {
                if (z) {
                    cArr[i4] = (char) ((b3 & Utf8.REPLACEMENT_BYTE) | (c2 << 6));
                    i4++;
                    z = false;
                } else if (z) {
                    b2 = (b3 & Utf8.REPLACEMENT_BYTE) | (c2 << 6);
                }
                i = i5;
            } else {
                byte b4 = b3 & 255;
                if (b4 < 128) {
                    cArr[i4] = (char) b4;
                    i4++;
                } else if (b4 >= 224 || b4 <= 191) {
                    c2 = (char) (b4 & Ascii.SI);
                    z = true;
                } else {
                    b2 = b4 & Ascii.US;
                }
                i = i5;
            }
            c2 = (char) b2;
            z = true;
            i = i5;
        }
        return new String(cArr, 0, i4);
    }

    private Attribute a(Attribute[] attributeArr, String str, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        Attribute[] attributeArr2 = attributeArr;
        String str2 = str;
        for (int i4 = 0; i4 < attributeArr2.length; i4++) {
            if (attributeArr2[i4].type.equals(str)) {
                return attributeArr2[i4].read(this, i, i2, cArr, i3, labelArr);
            }
        }
        return new Attribute(str).read(this, i, i2, (char[]) null, -1, (Label[]) null);
    }

    private void a(ClassWriter classWriter, Item[] itemArr, char[] cArr) {
        int i;
        boolean z;
        int a2 = a();
        int readUnsignedShort = readUnsignedShort(a2);
        while (true) {
            if (readUnsignedShort <= 0) {
                z = false;
                break;
            } else if ("BootstrapMethods".equals(readUTF8(a2 + 2, cArr))) {
                z = true;
                break;
            } else {
                a2 += readInt(a2 + 4) + 6;
                readUnsignedShort--;
            }
        }
        if (z) {
            int readUnsignedShort2 = readUnsignedShort(a2 + 8);
            int i2 = a2 + 10;
            int i3 = i2;
            for (i = 0; i < readUnsignedShort2; i++) {
                int i4 = (i3 - a2) - 10;
                int hashCode = readConst(readUnsignedShort(i3), cArr).hashCode();
                for (int readUnsignedShort3 = readUnsignedShort(i3 + 2); readUnsignedShort3 > 0; readUnsignedShort3--) {
                    hashCode ^= readConst(readUnsignedShort(i3 + 4), cArr).hashCode();
                    i3 += 2;
                }
                i3 += 4;
                Item item = new Item(i);
                item.a(i4, hashCode & Integer.MAX_VALUE);
                int length = item.j % itemArr.length;
                item.k = itemArr[length];
                itemArr[length] = item;
            }
            int readInt = readInt(a2 + 4);
            ByteVector byteVector = new ByteVector(readInt + 62);
            byteVector.putByteArray(this.b, i2, readInt - 2);
            classWriter.z = readUnsignedShort2;
            classWriter.A = byteVector;
        }
    }

    private void a(Context context) {
        int i;
        int i2;
        String str = context.g;
        Object[] objArr = context.s;
        int i3 = 0;
        if ((context.e & 8) == 0) {
            if ("<init>".equals(context.f)) {
                objArr[0] = Opcodes.UNINITIALIZED_THIS;
            } else {
                objArr[0] = readClass(this.header + 2, context.c);
            }
            i3 = 1;
        }
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt == 'F') {
                i2 = i + 1;
                objArr[i] = Opcodes.FLOAT;
            } else if (charAt != 'L') {
                if (!(charAt == 'S' || charAt == 'I')) {
                    if (charAt == 'J') {
                        i2 = i + 1;
                        objArr[i] = Opcodes.LONG;
                    } else if (charAt != 'Z') {
                        if (charAt != '[') {
                            switch (charAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    i2 = i + 1;
                                    objArr[i] = Opcodes.DOUBLE;
                                    break;
                                default:
                                    context.q = i;
                                    return;
                            }
                        } else {
                            while (str.charAt(i5) == '[') {
                                i5++;
                            }
                            if (str.charAt(i5) == 'L') {
                                do {
                                    i5++;
                                } while (str.charAt(i5) != ';');
                            }
                            int i6 = i5 + 1;
                            objArr[i] = str.substring(i4, i6);
                            i4 = i6;
                            i++;
                        }
                    }
                }
                i2 = i + 1;
                objArr[i] = Opcodes.INTEGER;
            } else {
                int i7 = i5;
                while (str.charAt(i7) != ';') {
                    i7++;
                }
                objArr[i] = str.substring(i5, i7);
                i++;
                i4 = i7 + 1;
            }
            i = i2;
            i4 = i5;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x07fd: MOVE  (r0v23 int) = (r23v1 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05cb  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0641  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0693  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x06a6  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x06ca  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x06dd  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x06f2  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0705  */
    private void a(org.objectweb.asm.MethodVisitor r41, org.objectweb.asm.Context r42, int r43) {
        /*
            r40 = this;
            r7 = r40
            r15 = r41
            r14 = r42
            r0 = r43
            byte[] r8 = r7.b
            char[] r13 = r14.c
            int r12 = r7.readUnsignedShort(r0)
            int r1 = r0 + 2
            int r11 = r7.readUnsignedShort(r1)
            int r1 = r0 + 4
            int r9 = r7.readInt(r1)
            r10 = 8
            int r16 = r0 + 8
            int r6 = r16 + r9
            int r0 = r9 + 2
            org.objectweb.asm.Label[] r5 = new org.objectweb.asm.Label[r0]
            r14.h = r5
            int r0 = r9 + 1
            r7.readLabel(r0, r5)
            r0 = r16
        L_0x002f:
            r4 = 132(0x84, float:1.85E-43)
            r3 = 1
            if (r0 >= r6) goto L_0x00cb
            int r1 = r0 - r16
            byte r2 = r8[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte[] r17 = org.objectweb.asm.ClassWriter.a
            byte r2 = r17[r2]
            switch(r2) {
                case 0: goto L_0x00c7;
                case 1: goto L_0x00c3;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00c3;
                case 4: goto L_0x00c7;
                case 5: goto L_0x00bf;
                case 6: goto L_0x00bf;
                case 7: goto L_0x00bb;
                case 8: goto L_0x00bb;
                case 9: goto L_0x00b0;
                case 10: goto L_0x00a5;
                case 11: goto L_0x00c3;
                case 12: goto L_0x00bf;
                case 13: goto L_0x00bf;
                case 14: goto L_0x0076;
                case 15: goto L_0x004f;
                case 16: goto L_0x0041;
                case 17: goto L_0x0044;
                default: goto L_0x0041;
            }
        L_0x0041:
            int r0 = r0 + 4
            goto L_0x002f
        L_0x0044:
            int r1 = r0 + 1
            byte r1 = r8[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != r4) goto L_0x0041
            int r0 = r0 + 6
            goto L_0x002f
        L_0x004f:
            int r0 = r0 + 4
            r2 = r1 & 3
            int r0 = r0 - r2
            int r2 = r7.readInt(r0)
            int r2 = r2 + r1
            r7.readLabel(r2, r5)
            int r2 = r0 + 4
            int r2 = r7.readInt(r2)
        L_0x0062:
            if (r2 <= 0) goto L_0x0073
            int r3 = r0 + 12
            int r3 = r7.readInt(r3)
            int r3 = r3 + r1
            r7.readLabel(r3, r5)
            int r0 = r0 + 8
            int r2 = r2 + -1
            goto L_0x0062
        L_0x0073:
            int r0 = r0 + 8
            goto L_0x002f
        L_0x0076:
            int r0 = r0 + 4
            r2 = r1 & 3
            int r0 = r0 - r2
            int r2 = r7.readInt(r0)
            int r2 = r2 + r1
            r7.readLabel(r2, r5)
            int r2 = r0 + 8
            int r2 = r7.readInt(r2)
            int r4 = r0 + 4
            int r4 = r7.readInt(r4)
            int r2 = r2 - r4
            int r2 = r2 + r3
        L_0x0091:
            if (r2 <= 0) goto L_0x00a2
            int r3 = r0 + 12
            int r3 = r7.readInt(r3)
            int r3 = r3 + r1
            r7.readLabel(r3, r5)
            int r0 = r0 + 4
            int r2 = r2 + -1
            goto L_0x0091
        L_0x00a2:
            int r0 = r0 + 12
            goto L_0x002f
        L_0x00a5:
            int r2 = r0 + 1
            int r2 = r7.readInt(r2)
            int r1 = r1 + r2
            r7.readLabel(r1, r5)
            goto L_0x00bb
        L_0x00b0:
            int r2 = r0 + 1
            short r2 = r7.readShort(r2)
            int r1 = r1 + r2
            r7.readLabel(r1, r5)
            goto L_0x00bf
        L_0x00bb:
            int r0 = r0 + 5
            goto L_0x002f
        L_0x00bf:
            int r0 = r0 + 3
            goto L_0x002f
        L_0x00c3:
            int r0 = r0 + 2
            goto L_0x002f
        L_0x00c7:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x00cb:
            int r1 = r7.readUnsignedShort(r0)
        L_0x00cf:
            if (r1 <= 0) goto L_0x0108
            int r2 = r0 + 2
            int r2 = r7.readUnsignedShort(r2)
            org.objectweb.asm.Label r2 = r7.readLabel(r2, r5)
            int r4 = r0 + 4
            int r4 = r7.readUnsignedShort(r4)
            org.objectweb.asm.Label r4 = r7.readLabel(r4, r5)
            int r3 = r0 + 6
            int r3 = r7.readUnsignedShort(r3)
            org.objectweb.asm.Label r3 = r7.readLabel(r3, r5)
            int[] r10 = r7.a
            int r0 = r0 + 8
            int r19 = r7.readUnsignedShort(r0)
            r10 = r10[r19]
            java.lang.String r10 = r7.readUTF8(r10, r13)
            r15.visitTryCatchBlock(r2, r4, r3, r10)
            int r1 = r1 + -1
            r3 = 1
            r4 = 132(0x84, float:1.85E-43)
            r10 = 8
            goto L_0x00cf
        L_0x0108:
            int r0 = r0 + 2
            int r1 = r14.b
            r2 = 8
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0113
            r4 = 1
            goto L_0x0114
        L_0x0113:
            r4 = 0
        L_0x0114:
            int r1 = r7.readUnsignedShort(r0)
            r19 = r0
            r20 = r1
            r0 = 0
            r1 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 1
            r26 = 0
            r27 = 0
            r28 = -1
            r29 = -1
        L_0x0130:
            r10 = 67
            if (r20 <= 0) goto L_0x034f
            int r2 = r19 + 2
            java.lang.String r2 = r7.readUTF8(r2, r13)
            java.lang.String r3 = "LocalVariableTable"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x01ac
            int r2 = r14.b
            r2 = r2 & 2
            if (r2 != 0) goto L_0x01a5
            int r2 = r19 + 8
            int r3 = r7.readUnsignedShort(r2)
            r10 = r19
        L_0x0150:
            if (r3 <= 0) goto L_0x0195
            r32 = r0
            int r0 = r10 + 10
            r33 = r1
            int r1 = r7.readUnsignedShort(r0)
            r23 = r5[r1]
            if (r23 != 0) goto L_0x0171
            r23 = r0
            org.objectweb.asm.Label r0 = r7.readLabel(r1, r5)
            r34 = r2
            int r2 = r0.a
            r17 = 1
            r2 = r2 | 1
            r0.a = r2
            goto L_0x0175
        L_0x0171:
            r23 = r0
            r34 = r2
        L_0x0175:
            int r10 = r10 + 12
            int r0 = r7.readUnsignedShort(r10)
            int r1 = r1 + r0
            r0 = r5[r1]
            if (r0 != 0) goto L_0x018a
            org.objectweb.asm.Label r0 = r7.readLabel(r1, r5)
            int r1 = r0.a
            r2 = 1
            r1 = r1 | r2
            r0.a = r1
        L_0x018a:
            int r3 = r3 + -1
            r10 = r23
            r0 = r32
            r1 = r33
            r2 = r34
            goto L_0x0150
        L_0x0195:
            r32 = r0
            r33 = r1
            r34 = r2
            r37 = r4
            r43 = r5
            r38 = r6
            r23 = r34
            goto L_0x02c0
        L_0x01a5:
            r32 = r0
            r33 = r1
        L_0x01a9:
            r3 = 1
            goto L_0x02b6
        L_0x01ac:
            r32 = r0
            r33 = r1
            java.lang.String r0 = "LocalVariableTypeTable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01bc
            int r24 = r19 + 8
            goto L_0x02b6
        L_0x01bc:
            java.lang.String r0 = "LineNumberTable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x020b
            int r0 = r14.b
            r0 = r0 & 2
            if (r0 != 0) goto L_0x01a9
            int r0 = r19 + 8
            int r0 = r7.readUnsignedShort(r0)
            r1 = r19
        L_0x01d2:
            if (r0 <= 0) goto L_0x01a9
            int r2 = r1 + 10
            int r2 = r7.readUnsignedShort(r2)
            r3 = r5[r2]
            if (r3 != 0) goto L_0x01ea
            org.objectweb.asm.Label r3 = r7.readLabel(r2, r5)
            int r10 = r3.a
            r17 = 1
            r10 = r10 | 1
            r3.a = r10
        L_0x01ea:
            r2 = r5[r2]
        L_0x01ec:
            int r3 = r2.b
            if (r3 <= 0) goto L_0x01fe
            org.objectweb.asm.Label r3 = r2.k
            if (r3 != 0) goto L_0x01fb
            org.objectweb.asm.Label r3 = new org.objectweb.asm.Label
            r3.<init>()
            r2.k = r3
        L_0x01fb:
            org.objectweb.asm.Label r2 = r2.k
            goto L_0x01ec
        L_0x01fe:
            int r3 = r1 + 12
            int r3 = r7.readUnsignedShort(r3)
            r2.b = r3
            int r1 = r1 + 4
            int r0 = r0 + -1
            goto L_0x01d2
        L_0x020b:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x023e
            int r0 = r19 + 8
            r1 = 1
            int[] r0 = r7.a((org.objectweb.asm.MethodVisitor) r15, (org.objectweb.asm.Context) r14, (int) r0, (boolean) r1)
            int r2 = r0.length
            if (r2 == 0) goto L_0x022f
            r2 = 0
            r3 = r0[r2]
            int r3 = r7.readByte(r3)
            if (r3 >= r10) goto L_0x0227
            goto L_0x022f
        L_0x0227:
            r3 = r0[r2]
            int r3 = r3 + r1
            int r1 = r7.readUnsignedShort(r3)
            goto L_0x0230
        L_0x022f:
            r1 = -1
        L_0x0230:
            r28 = r1
            r37 = r4
            r43 = r5
            r38 = r6
            r15 = -1
            r1 = r0
            r0 = r32
            goto L_0x0339
        L_0x023e:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x026d
            int r0 = r19 + 8
            r1 = 0
            int[] r0 = r7.a((org.objectweb.asm.MethodVisitor) r15, (org.objectweb.asm.Context) r14, (int) r0, (boolean) r1)
            int r2 = r0.length
            if (r2 == 0) goto L_0x0262
            r2 = r0[r1]
            int r2 = r7.readByte(r2)
            if (r2 >= r10) goto L_0x0259
            goto L_0x0262
        L_0x0259:
            r2 = r0[r1]
            r3 = 1
            int r2 = r2 + r3
            int r1 = r7.readUnsignedShort(r2)
            goto L_0x0264
        L_0x0262:
            r3 = 1
            r1 = -1
        L_0x0264:
            r29 = r1
            r37 = r4
            r43 = r5
            r38 = r6
            goto L_0x02be
        L_0x026d:
            r3 = 1
            java.lang.String r0 = "StackMapTable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x028b
            int r0 = r14.b
            r0 = r0 & 4
            if (r0 != 0) goto L_0x02b6
            int r21 = r19 + 10
            int r0 = r19 + 4
            int r22 = r7.readInt(r0)
            int r0 = r19 + 8
            int r27 = r7.readUnsignedShort(r0)
            goto L_0x02b6
        L_0x028b:
            java.lang.String r0 = "StackMap"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x02c3
            int r0 = r14.b
            r0 = r0 & 4
            if (r0 != 0) goto L_0x02b6
            int r21 = r19 + 10
            int r0 = r19 + 4
            int r22 = r7.readInt(r0)
            int r0 = r19 + 8
            int r27 = r7.readUnsignedShort(r0)
            r37 = r4
            r43 = r5
            r38 = r6
            r0 = r32
            r1 = r33
            r15 = -1
            r25 = 0
            goto L_0x0339
        L_0x02b6:
            r37 = r4
            r43 = r5
            r38 = r6
            r0 = r32
        L_0x02be:
            r1 = r33
        L_0x02c0:
            r15 = -1
            goto L_0x0339
        L_0x02c3:
            r10 = r26
            r1 = 0
        L_0x02c6:
            org.objectweb.asm.Attribute[] r0 = r14.a
            int r0 = r0.length
            if (r1 >= r0) goto L_0x0328
            org.objectweb.asm.Attribute[] r0 = r14.a
            r0 = r0[r1]
            java.lang.String r0 = r0.type
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0307
            org.objectweb.asm.Attribute[] r0 = r14.a
            r0 = r0[r1]
            int r17 = r19 + 8
            int r3 = r19 + 4
            int r3 = r7.readInt(r3)
            int r26 = r16 + -8
            r35 = r32
            r32 = r1
            r36 = r33
            r1 = r40
            r30 = r2
            r15 = -1
            r2 = r17
            r37 = r4
            r4 = r13
            r43 = r5
            r5 = r26
            r38 = r6
            r6 = r43
            org.objectweb.asm.Attribute r0 = r0.read(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0316
            r0.a = r10
            r10 = r0
            goto L_0x0316
        L_0x0307:
            r30 = r2
            r37 = r4
            r43 = r5
            r38 = r6
            r35 = r32
            r36 = r33
            r15 = -1
            r32 = r1
        L_0x0316:
            int r1 = r32 + 1
            r15 = r41
            r5 = r43
            r2 = r30
            r32 = r35
            r33 = r36
            r4 = r37
            r6 = r38
            r3 = 1
            goto L_0x02c6
        L_0x0328:
            r37 = r4
            r43 = r5
            r38 = r6
            r35 = r32
            r36 = r33
            r15 = -1
            r26 = r10
            r0 = r35
            r1 = r36
        L_0x0339:
            int r2 = r19 + 4
            int r2 = r7.readInt(r2)
            int r2 = r2 + 6
            int r19 = r19 + r2
            int r20 = r20 + -1
            r15 = r41
            r5 = r43
            r4 = r37
            r6 = r38
            goto L_0x0130
        L_0x034f:
            r35 = r0
            r36 = r1
            r37 = r4
            r43 = r5
            r38 = r6
            r15 = -1
            if (r21 == 0) goto L_0x03a9
            r14.o = r15
            r0 = 0
            r14.p = r0
            r14.q = r0
            r14.r = r0
            r14.t = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r14.s = r0
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r14.u = r0
            r6 = r37
            if (r6 == 0) goto L_0x0376
            r7.a((org.objectweb.asm.Context) r14)
        L_0x0376:
            r0 = r21
        L_0x0378:
            int r1 = r21 + r22
            int r1 = r1 + -2
            if (r0 >= r1) goto L_0x03a5
            byte r1 = r8[r0]
            r2 = 8
            if (r1 != r2) goto L_0x039e
            int r1 = r0 + 1
            int r1 = r7.readUnsignedShort(r1)
            if (r1 < 0) goto L_0x039e
            if (r1 >= r9) goto L_0x039e
            int r2 = r16 + r1
            byte r2 = r8[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 187(0xbb, float:2.62E-43)
            if (r2 != r3) goto L_0x039e
            r5 = r43
            r7.readLabel(r1, r5)
            goto L_0x03a0
        L_0x039e:
            r5 = r43
        L_0x03a0:
            int r0 = r0 + 1
            r43 = r5
            goto L_0x0378
        L_0x03a5:
            r5 = r43
            r3 = r14
            goto L_0x03ae
        L_0x03a9:
            r5 = r43
            r6 = r37
            r3 = 0
        L_0x03ae:
            r4 = r16
            r17 = 0
            r19 = 0
        L_0x03b4:
            r2 = r38
            if (r4 >= r2) goto L_0x07df
            int r1 = r4 - r16
            r0 = r5[r1]
            if (r0 == 0) goto L_0x03ea
            org.objectweb.asm.Label r15 = r0.k
            r20 = r15
            r15 = 0
            r0.k = r15
            r15 = r41
            r10 = -1
            r15.visitLabel(r0)
            int r10 = r14.b
            r10 = r10 & 2
            if (r10 != 0) goto L_0x03ec
            int r10 = r0.b
            if (r10 <= 0) goto L_0x03ec
            int r10 = r0.b
            r15.visitLineNumber(r10, r0)
            r10 = r20
        L_0x03dc:
            if (r10 == 0) goto L_0x03ec
            r38 = r2
            int r2 = r10.b
            r15.visitLineNumber(r2, r0)
            org.objectweb.asm.Label r10 = r10.k
            r2 = r38
            goto L_0x03dc
        L_0x03ea:
            r15 = r41
        L_0x03ec:
            r38 = r2
            r10 = r3
            r3 = r21
        L_0x03f1:
            if (r10 == 0) goto L_0x0490
            int r0 = r10.o
            if (r0 == r1) goto L_0x03fd
            int r0 = r10.o
            r2 = -1
            if (r0 != r2) goto L_0x0490
            goto L_0x03fe
        L_0x03fd:
            r2 = -1
        L_0x03fe:
            int r0 = r10.o
            if (r0 == r2) goto L_0x0454
            r2 = r25
            if (r2 == 0) goto L_0x0436
            if (r6 == 0) goto L_0x0409
            goto L_0x0436
        L_0x0409:
            int r0 = r10.p
            r20 = r2
            int r2 = r10.r
            r21 = r3
            java.lang.Object[] r3 = r10.s
            r22 = r4
            int r4 = r10.t
            r25 = r5
            java.lang.Object[] r5 = r10.u
            r31 = r0
            r0 = r41
            r32 = r11
            r11 = r1
            r1 = r31
            r31 = r12
            r12 = r20
            r20 = r38
            r33 = r9
            r9 = r21
            r21 = r22
            r22 = r25
            r0.visitFrame(r1, r2, r3, r4, r5)
            goto L_0x0464
        L_0x0436:
            r21 = r4
            r22 = r5
            r33 = r9
            r32 = r11
            r31 = r12
            r20 = r38
            r11 = r1
            r12 = r2
            r9 = r3
            r1 = -1
            int r2 = r10.q
            java.lang.Object[] r3 = r10.s
            int r4 = r10.t
            java.lang.Object[] r5 = r10.u
            r0 = r41
            r0.visitFrame(r1, r2, r3, r4, r5)
            goto L_0x0464
        L_0x0454:
            r21 = r4
            r22 = r5
            r33 = r9
            r32 = r11
            r31 = r12
            r12 = r25
            r20 = r38
            r11 = r1
            r9 = r3
        L_0x0464:
            if (r27 <= 0) goto L_0x047d
            int r3 = r7.a((int) r9, (boolean) r12, (boolean) r6, (org.objectweb.asm.Context) r10)
            int r27 = r27 + -1
            r1 = r11
            r25 = r12
            r38 = r20
            r4 = r21
            r5 = r22
            r12 = r31
            r11 = r32
            r9 = r33
            goto L_0x03f1
        L_0x047d:
            r3 = r9
            r1 = r11
            r25 = r12
            r38 = r20
            r4 = r21
            r5 = r22
            r12 = r31
            r11 = r32
            r9 = r33
            r10 = 0
            goto L_0x03f1
        L_0x0490:
            r21 = r4
            r22 = r5
            r33 = r9
            r32 = r11
            r31 = r12
            r12 = r25
            r20 = r38
            r11 = r1
            r9 = r3
            byte r0 = r8[r21]
            r5 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = org.objectweb.asm.ClassWriter.a
            byte r0 = r0[r5]
            switch(r0) {
                case 0: goto L_0x0705;
                case 1: goto L_0x06f2;
                case 2: goto L_0x06dd;
                case 3: goto L_0x06ca;
                case 4: goto L_0x06a6;
                case 5: goto L_0x0693;
                case 6: goto L_0x0641;
                case 7: goto L_0x0641;
                case 8: goto L_0x05eb;
                case 9: goto L_0x05cb;
                case 10: goto L_0x05b4;
                case 11: goto L_0x05a0;
                case 12: goto L_0x058e;
                case 13: goto L_0x057c;
                case 14: goto L_0x053f;
                case 15: goto L_0x04fe;
                case 16: goto L_0x04ab;
                case 17: goto L_0x04c6;
                default: goto L_0x04ab;
            }
        L_0x04ab:
            r37 = r6
            r34 = r9
            r18 = 8
            r25 = 132(0x84, float:1.85E-43)
            int r4 = r21 + 1
            java.lang.String r0 = r7.readClass(r4, r13)
            int r4 = r21 + 3
            byte r1 = r8[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r15.visitMultiANewArrayInsn(r0, r1)
            int r4 = r21 + 4
            goto L_0x0713
        L_0x04c6:
            int r4 = r21 + 1
            byte r0 = r8[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = 132(0x84, float:1.85E-43)
            if (r0 != r4) goto L_0x04e2
            int r0 = r21 + 2
            int r0 = r7.readUnsignedShort(r0)
            int r1 = r21 + 4
            short r1 = r7.readShort(r1)
            r15.visitIincInsn(r0, r1)
            int r0 = r21 + 6
            goto L_0x04ed
        L_0x04e2:
            int r1 = r21 + 2
            int r1 = r7.readUnsignedShort(r1)
            r15.visitVarInsn(r0, r1)
            int r0 = r21 + 4
        L_0x04ed:
            r25 = r4
            r37 = r6
            r34 = r9
            r1 = r28
            r9 = r36
            r18 = 8
            r4 = r0
            r0 = r17
            goto L_0x0719
        L_0x04fe:
            r4 = 132(0x84, float:1.85E-43)
            int r0 = r21 + 4
            r1 = r11 & 3
            int r0 = r0 - r1
            int r1 = r7.readInt(r0)
            int r1 = r1 + r11
            int r2 = r0 + 4
            int r2 = r7.readInt(r2)
            int[] r3 = new int[r2]
            org.objectweb.asm.Label[] r5 = new org.objectweb.asm.Label[r2]
            r18 = 8
            int r0 = r0 + 8
            r4 = 0
        L_0x0519:
            if (r4 >= r2) goto L_0x0535
            int r21 = r7.readInt(r0)
            r3[r4] = r21
            r21 = r2
            int r2 = r0 + 4
            int r2 = r7.readInt(r2)
            int r2 = r2 + r11
            r2 = r22[r2]
            r5[r4] = r2
            int r0 = r0 + 8
            int r4 = r4 + 1
            r2 = r21
            goto L_0x0519
        L_0x0535:
            r1 = r22[r1]
            r15.visitLookupSwitchInsn(r1, r3, r5)
            r4 = r0
            r37 = r6
            goto L_0x05df
        L_0x053f:
            r18 = 8
            int r4 = r21 + 4
            r0 = r11 & 3
            int r4 = r4 - r0
            int r0 = r7.readInt(r4)
            int r1 = r11 + r0
            int r0 = r4 + 4
            int r0 = r7.readInt(r0)
            int r2 = r4 + 8
            int r2 = r7.readInt(r2)
            int r3 = r2 - r0
            r5 = 1
            int r3 = r3 + r5
            org.objectweb.asm.Label[] r5 = new org.objectweb.asm.Label[r3]
            int r4 = r4 + 12
            r37 = r6
            r6 = r4
            r4 = 0
        L_0x0564:
            if (r4 >= r3) goto L_0x0575
            int r21 = r7.readInt(r6)
            int r21 = r11 + r21
            r21 = r22[r21]
            r5[r4] = r21
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L_0x0564
        L_0x0575:
            r1 = r22[r1]
            r15.visitTableSwitchInsn(r0, r2, r1, r5)
            r4 = r6
            goto L_0x05df
        L_0x057c:
            r37 = r6
            r18 = 8
            int r4 = r21 + 1
            byte r0 = r8[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r21 + 2
            byte r1 = r8[r4]
            r15.visitIincInsn(r0, r1)
            goto L_0x05dd
        L_0x058e:
            r37 = r6
            r18 = 8
            int r4 = r21 + 1
            int r0 = r7.readUnsignedShort(r4)
            java.lang.Object r0 = r7.readConst(r0, r13)
            r15.visitLdcInsn(r0)
            goto L_0x05dd
        L_0x05a0:
            r37 = r6
            r18 = 8
            int r4 = r21 + 1
            byte r0 = r8[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Object r0 = r7.readConst(r0, r13)
            r15.visitLdcInsn(r0)
            int r4 = r21 + 2
            goto L_0x05df
        L_0x05b4:
            r37 = r6
            r6 = 1
            r18 = 8
            int r5 = r5 + -33
            int r4 = r21 + 1
            int r0 = r7.readInt(r4)
            int r1 = r11 + r0
            r0 = r22[r1]
            r15.visitJumpInsn(r5, r0)
        L_0x05c8:
            int r4 = r21 + 5
            goto L_0x05df
        L_0x05cb:
            r37 = r6
            r6 = 1
            r18 = 8
            int r4 = r21 + 1
            short r0 = r7.readShort(r4)
            int r1 = r11 + r0
            r0 = r22[r1]
            r15.visitJumpInsn(r5, r0)
        L_0x05dd:
            int r4 = r21 + 3
        L_0x05df:
            r34 = r9
            r0 = r17
            r1 = r28
            r9 = r36
            r25 = 132(0x84, float:1.85E-43)
            goto L_0x0719
        L_0x05eb:
            r37 = r6
            r6 = 1
            r18 = 8
            int[] r0 = r7.a
            int r4 = r21 + 1
            int r1 = r7.readUnsignedShort(r4)
            r0 = r0[r1]
            int[] r1 = r14.d
            int r2 = r7.readUnsignedShort(r0)
            r1 = r1[r2]
            int r2 = r7.readUnsignedShort(r1)
            java.lang.Object r2 = r7.readConst(r2, r13)
            org.objectweb.asm.Handle r2 = (org.objectweb.asm.Handle) r2
            int r3 = r1 + 2
            int r3 = r7.readUnsignedShort(r3)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r1 = r1 + 4
            r5 = 0
        L_0x0617:
            if (r5 >= r3) goto L_0x0629
            int r6 = r7.readUnsignedShort(r1)
            java.lang.Object r6 = r7.readConst(r6, r13)
            r4[r5] = r6
            int r1 = r1 + 2
            int r5 = r5 + 1
            r6 = 1
            goto L_0x0617
        L_0x0629:
            int[] r1 = r7.a
            int r0 = r0 + 2
            int r0 = r7.readUnsignedShort(r0)
            r0 = r1[r0]
            java.lang.String r1 = r7.readUTF8(r0, r13)
            int r0 = r0 + 2
            java.lang.String r0 = r7.readUTF8(r0, r13)
            r15.visitInvokeDynamicInsn(r1, r0, r2, r4)
            goto L_0x05c8
        L_0x0641:
            r37 = r6
            r18 = 8
            int[] r0 = r7.a
            int r4 = r21 + 1
            int r1 = r7.readUnsignedShort(r4)
            r0 = r0[r1]
            int r1 = r0 + -1
            byte r1 = r8[r1]
            r2 = 11
            if (r1 != r2) goto L_0x0659
            r6 = 1
            goto L_0x065a
        L_0x0659:
            r6 = 0
        L_0x065a:
            java.lang.String r2 = r7.readClass(r0, r13)
            int[] r1 = r7.a
            int r0 = r0 + 2
            int r0 = r7.readUnsignedShort(r0)
            r0 = r1[r0]
            java.lang.String r3 = r7.readUTF8(r0, r13)
            int r0 = r0 + 2
            java.lang.String r4 = r7.readUTF8(r0, r13)
            r0 = 182(0xb6, float:2.55E-43)
            if (r5 >= r0) goto L_0x067f
            r15.visitFieldInsn(r5, r2, r3, r4)
            r34 = r9
            r25 = 132(0x84, float:1.85E-43)
            r9 = r5
            goto L_0x068b
        L_0x067f:
            r0 = r41
            r1 = r5
            r25 = 132(0x84, float:1.85E-43)
            r34 = r9
            r9 = r5
            r5 = r6
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
        L_0x068b:
            r0 = 185(0xb9, float:2.59E-43)
            if (r9 != r0) goto L_0x06ef
            int r4 = r21 + 5
            goto L_0x0713
        L_0x0693:
            r37 = r6
            r34 = r9
            r18 = 8
            r25 = 132(0x84, float:1.85E-43)
            r9 = r5
            int r4 = r21 + 1
            java.lang.String r0 = r7.readClass(r4, r13)
            r15.visitTypeInsn(r9, r0)
            goto L_0x06ef
        L_0x06a6:
            r37 = r6
            r34 = r9
            r18 = 8
            r25 = 132(0x84, float:1.85E-43)
            r9 = r5
            r0 = 54
            if (r9 <= r0) goto L_0x06be
            int r5 = r9 + -59
            int r1 = r5 >> 2
            int r1 = r1 + r0
            r0 = r5 & 3
            r15.visitVarInsn(r1, r0)
            goto L_0x0711
        L_0x06be:
            int r5 = r9 + -26
            int r0 = r5 >> 2
            int r0 = r0 + 21
            r1 = r5 & 3
            r15.visitVarInsn(r0, r1)
            goto L_0x0711
        L_0x06ca:
            r37 = r6
            r34 = r9
            r18 = 8
            r25 = 132(0x84, float:1.85E-43)
            r9 = r5
            int r4 = r21 + 1
            byte r0 = r8[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r15.visitVarInsn(r9, r0)
            goto L_0x0702
        L_0x06dd:
            r37 = r6
            r34 = r9
            r18 = 8
            r25 = 132(0x84, float:1.85E-43)
            r9 = r5
            int r4 = r21 + 1
            short r0 = r7.readShort(r4)
            r15.visitIntInsn(r9, r0)
        L_0x06ef:
            int r4 = r21 + 3
            goto L_0x0713
        L_0x06f2:
            r37 = r6
            r34 = r9
            r18 = 8
            r25 = 132(0x84, float:1.85E-43)
            r9 = r5
            int r4 = r21 + 1
            byte r0 = r8[r4]
            r15.visitIntInsn(r9, r0)
        L_0x0702:
            int r4 = r21 + 2
            goto L_0x0713
        L_0x0705:
            r37 = r6
            r34 = r9
            r18 = 8
            r25 = 132(0x84, float:1.85E-43)
            r9 = r5
            r15.visitInsn(r9)
        L_0x0711:
            int r4 = r21 + 1
        L_0x0713:
            r0 = r17
            r1 = r28
            r9 = r36
        L_0x0719:
            if (r9 == 0) goto L_0x0756
            int r2 = r9.length
            if (r0 >= r2) goto L_0x0756
            if (r1 > r11) goto L_0x0756
            if (r1 != r11) goto L_0x073a
            r1 = r9[r0]
            int r1 = r7.a((org.objectweb.asm.Context) r14, (int) r1)
            int r2 = r1 + 2
            int r3 = r14.i
            org.objectweb.asm.TypePath r5 = r14.j
            java.lang.String r1 = r7.readUTF8(r1, r13)
            r6 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r15.visitInsnAnnotation(r3, r5, r1, r6)
            r7.a((int) r2, (char[]) r13, (boolean) r6, (org.objectweb.asm.AnnotationVisitor) r1)
        L_0x073a:
            int r0 = r0 + 1
            int r1 = r9.length
            if (r0 >= r1) goto L_0x0754
            r1 = r9[r0]
            int r1 = r7.readByte(r1)
            r2 = 67
            if (r1 >= r2) goto L_0x074a
            goto L_0x0754
        L_0x074a:
            r1 = r9[r0]
            r2 = 1
            int r1 = r1 + r2
            int r2 = r7.readUnsignedShort(r1)
            r1 = r2
            goto L_0x0719
        L_0x0754:
            r1 = -1
            goto L_0x0719
        L_0x0756:
            r2 = r19
            r3 = r29
            r6 = r35
        L_0x075c:
            if (r6 == 0) goto L_0x07b4
            int r5 = r6.length
            if (r2 >= r5) goto L_0x07b4
            if (r3 > r11) goto L_0x07b4
            if (r3 != r11) goto L_0x0785
            r3 = r6[r2]
            int r3 = r7.a((org.objectweb.asm.Context) r14, (int) r3)
            int r5 = r3 + 2
            r17 = r0
            int r0 = r14.i
            r19 = r1
            org.objectweb.asm.TypePath r1 = r14.j
            java.lang.String r3 = r7.readUTF8(r3, r13)
            r21 = r10
            r10 = 0
            org.objectweb.asm.AnnotationVisitor r0 = r15.visitInsnAnnotation(r0, r1, r3, r10)
            r1 = 1
            r7.a((int) r5, (char[]) r13, (boolean) r1, (org.objectweb.asm.AnnotationVisitor) r0)
            goto L_0x078c
        L_0x0785:
            r17 = r0
            r19 = r1
            r21 = r10
            r10 = 0
        L_0x078c:
            int r2 = r2 + 1
            int r0 = r6.length
            if (r2 >= r0) goto L_0x07a8
            r0 = r6[r2]
            int r0 = r7.readByte(r0)
            r1 = 67
            if (r0 >= r1) goto L_0x079c
            goto L_0x07aa
        L_0x079c:
            r0 = r6[r2]
            r28 = 1
            int r0 = r0 + 1
            int r0 = r7.readUnsignedShort(r0)
            r3 = r0
            goto L_0x07ad
        L_0x07a8:
            r1 = 67
        L_0x07aa:
            r28 = 1
            r3 = -1
        L_0x07ad:
            r0 = r17
            r1 = r19
            r10 = r21
            goto L_0x075c
        L_0x07b4:
            r17 = r0
            r19 = r1
            r21 = r10
            r1 = 67
            r10 = 0
            r28 = 1
            r10 = r1
            r29 = r3
            r35 = r6
            r36 = r9
            r25 = r12
            r28 = r19
            r38 = r20
            r3 = r21
            r5 = r22
            r12 = r31
            r11 = r32
            r9 = r33
            r21 = r34
            r6 = r37
            r15 = -1
            r19 = r2
            goto L_0x03b4
        L_0x07df:
            r15 = r41
            r22 = r5
            r33 = r9
            r32 = r11
            r31 = r12
            r6 = r35
            r9 = r36
            r10 = 0
            r28 = 1
            r0 = r22[r33]
            if (r0 == 0) goto L_0x07f7
            r15.visitLabel(r0)
        L_0x07f7:
            int r0 = r14.b
            r0 = r0 & 2
            if (r0 != 0) goto L_0x0896
            r0 = r23
            if (r0 == 0) goto L_0x0896
            r1 = r24
            if (r1 == 0) goto L_0x082f
            int r24 = r1 + 2
            int r1 = r7.readUnsignedShort(r1)
            int r1 = r1 * 3
            int[] r3 = new int[r1]
            r2 = r24
        L_0x0811:
            if (r1 <= 0) goto L_0x082d
            int r1 = r1 + -1
            int r4 = r2 + 6
            r3[r1] = r4
            r4 = -1
            int r1 = r1 + r4
            int r5 = r2 + 8
            int r5 = r7.readUnsignedShort(r5)
            r3[r1] = r5
            int r1 = r1 + r4
            int r5 = r7.readUnsignedShort(r2)
            r3[r1] = r5
            int r2 = r2 + 10
            goto L_0x0811
        L_0x082d:
            r8 = r3
            goto L_0x0830
        L_0x082f:
            r8 = 0
        L_0x0830:
            int r23 = r0 + 2
            int r0 = r7.readUnsignedShort(r0)
            r11 = r0
            r12 = r23
        L_0x0839:
            if (r11 <= 0) goto L_0x0896
            int r0 = r7.readUnsignedShort(r12)
            int r1 = r12 + 2
            int r1 = r7.readUnsignedShort(r1)
            int r2 = r12 + 8
            int r5 = r7.readUnsignedShort(r2)
            if (r8 == 0) goto L_0x0868
            r2 = r10
        L_0x084e:
            int r3 = r8.length
            if (r2 >= r3) goto L_0x0868
            r3 = r8[r2]
            if (r3 != r0) goto L_0x0865
            int r3 = r2 + 1
            r3 = r8[r3]
            if (r3 != r5) goto L_0x0865
            int r2 = r2 + 2
            r2 = r8[r2]
            java.lang.String r2 = r7.readUTF8(r2, r13)
            r3 = r2
            goto L_0x0869
        L_0x0865:
            int r2 = r2 + 3
            goto L_0x084e
        L_0x0868:
            r3 = 0
        L_0x0869:
            int r2 = r12 + 4
            java.lang.String r2 = r7.readUTF8(r2, r13)
            int r4 = r12 + 6
            java.lang.String r4 = r7.readUTF8(r4, r13)
            r16 = r22[r0]
            int r0 = r0 + r1
            r17 = r22[r0]
            r0 = r41
            r1 = r2
            r2 = r4
            r4 = r16
            r16 = r5
            r5 = r17
            r39 = r6
            r15 = r28
            r6 = r16
            r0.visitLocalVariable(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 10
            int r11 = r11 + -1
            r6 = r39
            r15 = r41
            goto L_0x0839
        L_0x0896:
            r39 = r6
            r15 = r28
            r0 = 32
            if (r9 == 0) goto L_0x08f5
            r2 = r10
        L_0x089f:
            int r1 = r9.length
            if (r2 >= r1) goto L_0x08f5
            r1 = r9[r2]
            int r1 = r7.readByte(r1)
            int r1 = r1 >> r15
            if (r1 != r0) goto L_0x08df
            r1 = r9[r2]
            int r1 = r7.a((org.objectweb.asm.Context) r14, (int) r1)
            int r3 = r1 + 2
            int r4 = r14.i
            org.objectweb.asm.TypePath r5 = r14.j
            org.objectweb.asm.Label[] r11 = r14.l
            org.objectweb.asm.Label[] r12 = r14.m
            int[] r6 = r14.n
            java.lang.String r1 = r7.readUTF8(r1, r13)
            r16 = 1
            r8 = r41
            r17 = r9
            r9 = r4
            r4 = r10
            r10 = r5
            r5 = r32
            r4 = r31
            r0 = r13
            r13 = r6
            r6 = r14
            r14 = r1
            r1 = r41
            r4 = r15
            r15 = r16
            org.objectweb.asm.AnnotationVisitor r8 = r8.visitLocalVariableAnnotation(r9, r10, r11, r12, r13, r14, r15)
            r7.a((int) r3, (char[]) r0, (boolean) r4, (org.objectweb.asm.AnnotationVisitor) r8)
            goto L_0x08e8
        L_0x08df:
            r1 = r41
            r17 = r9
            r0 = r13
            r6 = r14
            r4 = r15
            r5 = r32
        L_0x08e8:
            int r2 = r2 + 1
            r13 = r0
            r15 = r4
            r32 = r5
            r14 = r6
            r9 = r17
            r0 = 32
            r10 = 0
            goto L_0x089f
        L_0x08f5:
            r1 = r41
            r0 = r13
            r6 = r14
            r4 = r15
            r5 = r32
            r3 = r39
            if (r3 == 0) goto L_0x0943
            r2 = 0
        L_0x0901:
            int r8 = r3.length
            if (r2 >= r8) goto L_0x0943
            r8 = r3[r2]
            int r8 = r7.readByte(r8)
            int r8 = r8 >> r4
            r15 = 32
            if (r8 != r15) goto L_0x093a
            r8 = r3[r2]
            int r8 = r7.a((org.objectweb.asm.Context) r6, (int) r8)
            int r14 = r8 + 2
            int r9 = r6.i
            org.objectweb.asm.TypePath r10 = r6.j
            org.objectweb.asm.Label[] r11 = r6.l
            org.objectweb.asm.Label[] r12 = r6.m
            int[] r13 = r6.n
            java.lang.String r16 = r7.readUTF8(r8, r0)
            r17 = 0
            r8 = r41
            r35 = r3
            r3 = r14
            r14 = r16
            r16 = r15
            r15 = r17
            org.objectweb.asm.AnnotationVisitor r8 = r8.visitLocalVariableAnnotation(r9, r10, r11, r12, r13, r14, r15)
            r7.a((int) r3, (char[]) r0, (boolean) r4, (org.objectweb.asm.AnnotationVisitor) r8)
            goto L_0x093e
        L_0x093a:
            r35 = r3
            r16 = r15
        L_0x093e:
            int r2 = r2 + 1
            r3 = r35
            goto L_0x0901
        L_0x0943:
            r0 = r26
        L_0x0945:
            if (r0 == 0) goto L_0x0951
            org.objectweb.asm.Attribute r2 = r0.a
            r3 = 0
            r0.a = r3
            r1.visitAttribute(r0)
            r0 = r2
            goto L_0x0945
        L_0x0951:
            r0 = r31
            r1.visitMaxs(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.a(org.objectweb.asm.MethodVisitor, org.objectweb.asm.Context, int):void");
    }

    private static byte[] a(InputStream inputStream, boolean z) throws IOException {
        if (inputStream != null) {
            try {
                byte[] bArr = new byte[inputStream.available()];
                int i = 0;
                while (true) {
                    int read = inputStream.read(bArr, i, bArr.length - i);
                    if (read == -1) {
                        if (i < bArr.length) {
                            byte[] bArr2 = new byte[i];
                            System.arraycopy(bArr, 0, bArr2, 0, i);
                            bArr = bArr2;
                        }
                        if (z) {
                            inputStream.close();
                        }
                        return bArr;
                    }
                    i += read;
                    if (i == bArr.length) {
                        int read2 = inputStream.read();
                        if (read2 < 0) {
                            return bArr;
                        }
                        byte[] bArr3 = new byte[(bArr.length + 1000)];
                        System.arraycopy(bArr, 0, bArr3, 0, i);
                        int i2 = i + 1;
                        bArr3[i] = (byte) read2;
                        i = i2;
                        bArr = bArr3;
                    }
                }
            } finally {
                if (z) {
                    inputStream.close();
                }
            }
        } else {
            throw new IOException("Class not found");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] a(org.objectweb.asm.MethodVisitor r12, org.objectweb.asm.Context r13, int r14, boolean r15) {
        /*
            r11 = this;
            char[] r0 = r13.c
            int r1 = r11.readUnsignedShort(r14)
            int[] r2 = new int[r1]
            int r14 = r14 + 2
            r3 = 0
        L_0x000b:
            if (r3 >= r1) goto L_0x0089
            r2[r3] = r14
            int r4 = r11.readInt(r14)
            int r5 = r4 >>> 24
            r6 = 1
            if (r5 == 0) goto L_0x0055
            if (r5 == r6) goto L_0x0055
            r7 = 64
            if (r5 == r7) goto L_0x0031
            r7 = 65
            if (r5 == r7) goto L_0x0031
            switch(r5) {
                case 19: goto L_0x002e;
                case 20: goto L_0x002e;
                case 21: goto L_0x002e;
                case 22: goto L_0x0055;
                default: goto L_0x0025;
            }
        L_0x0025:
            switch(r5) {
                case 71: goto L_0x002b;
                case 72: goto L_0x002b;
                case 73: goto L_0x002b;
                case 74: goto L_0x002b;
                case 75: goto L_0x002b;
                default: goto L_0x0028;
            }
        L_0x0028:
            int r14 = r14 + 3
            goto L_0x0057
        L_0x002b:
            int r14 = r14 + 4
            goto L_0x0057
        L_0x002e:
            int r14 = r14 + 1
            goto L_0x0057
        L_0x0031:
            int r7 = r14 + 1
            int r7 = r11.readUnsignedShort(r7)
        L_0x0037:
            if (r7 <= 0) goto L_0x0028
            int r8 = r14 + 3
            int r8 = r11.readUnsignedShort(r8)
            int r9 = r14 + 5
            int r9 = r11.readUnsignedShort(r9)
            org.objectweb.asm.Label[] r10 = r13.h
            r11.readLabel(r8, r10)
            int r8 = r8 + r9
            org.objectweb.asm.Label[] r9 = r13.h
            r11.readLabel(r8, r9)
            int r14 = r14 + 6
            int r7 = r7 + -1
            goto L_0x0037
        L_0x0055:
            int r14 = r14 + 2
        L_0x0057:
            int r7 = r11.readByte(r14)
            r8 = 66
            r9 = 0
            if (r5 != r8) goto L_0x007d
            if (r7 != 0) goto L_0x0063
            goto L_0x006a
        L_0x0063:
            org.objectweb.asm.TypePath r9 = new org.objectweb.asm.TypePath
            byte[] r5 = r11.b
            r9.<init>(r5, r14)
        L_0x006a:
            int r7 = r7 * 2
            int r7 = r7 + r6
            int r14 = r14 + r7
            int r5 = r14 + 2
            java.lang.String r14 = r11.readUTF8(r14, r0)
            org.objectweb.asm.AnnotationVisitor r14 = r12.visitTryCatchAnnotation(r4, r9, r14, r15)
            int r14 = r11.a((int) r5, (char[]) r0, (boolean) r6, (org.objectweb.asm.AnnotationVisitor) r14)
            goto L_0x0086
        L_0x007d:
            int r14 = r14 + 3
            int r7 = r7 * 2
            int r14 = r14 + r7
            int r14 = r11.a((int) r14, (char[]) r0, (boolean) r6, (org.objectweb.asm.AnnotationVisitor) r9)
        L_0x0086:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0089:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.a(org.objectweb.asm.MethodVisitor, org.objectweb.asm.Context, int, boolean):int[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b1, code lost:
        if (r1.j == 0) goto L_0x01d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b(org.objectweb.asm.ClassVisitor r32, org.objectweb.asm.Context r33, int r34) {
        /*
            r31 = this;
            r8 = r31
            r9 = r33
            r0 = r34
            char[] r10 = r9.c
            int r1 = r8.readUnsignedShort(r0)
            r9.e = r1
            int r1 = r0 + 2
            java.lang.String r1 = r8.readUTF8(r1, r10)
            r9.f = r1
            int r1 = r0 + 4
            java.lang.String r1 = r8.readUTF8(r1, r10)
            r9.g = r1
            int r11 = r0 + 6
            int r0 = r8.readUnsignedShort(r11)
            r14 = r0
            r15 = r11
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0037:
            if (r14 <= 0) goto L_0x0174
            int r13 = r15 + 2
            java.lang.String r13 = r8.readUTF8(r13, r10)
            r21 = r0
            java.lang.String r0 = "Code"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0068
            int r0 = r9.b
            r13 = 1
            r0 = r0 & r13
            if (r0 != 0) goto L_0x0057
            int r0 = r15 + 8
            r19 = r0
        L_0x0053:
            r0 = r21
            goto L_0x0167
        L_0x0057:
            r27 = r1
            r28 = r2
            r13 = r3
            r29 = r4
            r30 = r5
            r22 = r7
        L_0x0062:
            r26 = r21
            r21 = r6
            goto L_0x0158
        L_0x0068:
            java.lang.String r0 = "Exceptions"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x008e
            int r0 = r15 + 8
            int r0 = r8.readUnsignedShort(r0)
            java.lang.String[] r6 = new java.lang.String[r0]
            int r13 = r15 + 10
            r20 = r1
            r1 = r13
            r13 = 0
        L_0x007e:
            if (r13 >= r0) goto L_0x008b
            java.lang.String r17 = r8.readClass(r1, r10)
            r6[r13] = r17
            int r1 = r1 + 2
            int r13 = r13 + 1
            goto L_0x007e
        L_0x008b:
            r17 = r1
            goto L_0x009e
        L_0x008e:
            r20 = r1
            java.lang.String r0 = "Signature"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00a1
            int r0 = r15 + 8
            java.lang.String r7 = r8.readUTF8(r0, r10)
        L_0x009e:
            r1 = r20
            goto L_0x0053
        L_0x00a1:
            java.lang.String r0 = "Deprecated"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00bc
            int r0 = r9.e
            r1 = 131072(0x20000, float:1.83671E-40)
        L_0x00ad:
            r0 = r0 | r1
            r9.e = r0
            r28 = r2
            r13 = r3
            r29 = r4
            r30 = r5
            r22 = r7
            r27 = r20
            goto L_0x0062
        L_0x00bc:
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00c7
            int r5 = r15 + 8
            goto L_0x009e
        L_0x00c7:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00d2
            int r2 = r15 + 8
            goto L_0x009e
        L_0x00d2:
            java.lang.String r0 = "AnnotationDefault"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00dd
            int r3 = r15 + 8
            goto L_0x009e
        L_0x00dd:
            java.lang.String r0 = "Synthetic"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00eb
            int r0 = r9.e
            r1 = 266240(0x41000, float:3.73082E-40)
            goto L_0x00ad
        L_0x00eb:
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00f6
            int r4 = r15 + 8
            goto L_0x009e
        L_0x00f6:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0102
            int r1 = r15 + 8
            goto L_0x0053
        L_0x0102:
            java.lang.String r0 = "RuntimeVisibleParameterAnnotations"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x010d
            int r18 = r15 + 8
            goto L_0x009e
        L_0x010d:
            java.lang.String r0 = "RuntimeInvisibleParameterAnnotations"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x011a
            int r0 = r15 + 8
            r1 = r20
            goto L_0x0167
        L_0x011a:
            java.lang.String r0 = "MethodParameters"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0126
            int r16 = r15 + 8
            goto L_0x009e
        L_0x0126:
            org.objectweb.asm.Attribute[] r1 = r9.a
            int r22 = r15 + 8
            int r0 = r15 + 4
            int r23 = r8.readInt(r0)
            r24 = -1
            r25 = 0
            r26 = r21
            r0 = r31
            r27 = r20
            r28 = r2
            r2 = r13
            r13 = r3
            r3 = r22
            r29 = r4
            r4 = r23
            r30 = r5
            r5 = r10
            r21 = r6
            r6 = r24
            r22 = r7
            r7 = r25
            org.objectweb.asm.Attribute r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0158
            r0.a = r12
            r12 = r0
        L_0x0158:
            r3 = r13
            r6 = r21
            r7 = r22
            r0 = r26
            r1 = r27
            r2 = r28
            r4 = r29
            r5 = r30
        L_0x0167:
            int r13 = r15 + 4
            int r13 = r8.readInt(r13)
            int r13 = r13 + 6
            int r15 = r15 + r13
            int r14 = r14 + -1
            goto L_0x0037
        L_0x0174:
            r26 = r0
            r27 = r1
            r28 = r2
            r13 = r3
            r29 = r4
            r30 = r5
            r21 = r6
            r22 = r7
            int r15 = r15 + 2
            int r1 = r9.e
            java.lang.String r2 = r9.f
            java.lang.String r3 = r9.g
            r0 = r32
            r4 = r22
            r5 = r21
            org.objectweb.asm.MethodVisitor r0 = r0.visitMethod(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0198
            return r15
        L_0x0198:
            boolean r1 = r0 instanceof org.objectweb.asm.MethodWriter
            if (r1 == 0) goto L_0x01dc
            r1 = r0
            org.objectweb.asm.MethodWriter r1 = (org.objectweb.asm.MethodWriter) r1
            org.objectweb.asm.ClassWriter r2 = r1.b
            org.objectweb.asm.ClassReader r2 = r2.M
            if (r2 != r8) goto L_0x01dc
            java.lang.String r2 = r1.g
            r7 = r22
            if (r7 != r2) goto L_0x01dc
            r6 = r21
            if (r6 != 0) goto L_0x01b4
            int r2 = r1.j
            if (r2 != 0) goto L_0x01d2
            goto L_0x01d0
        L_0x01b4:
            int r2 = r6.length
            int r3 = r1.j
            if (r2 != r3) goto L_0x01d2
            int r2 = r6.length
            r3 = 1
            int r2 = r2 - r3
        L_0x01bc:
            if (r2 < 0) goto L_0x01d0
            int r3 = r17 + -2
            int[] r4 = r1.k
            r4 = r4[r2]
            int r5 = r8.readUnsignedShort(r3)
            if (r4 == r5) goto L_0x01cb
            goto L_0x01d2
        L_0x01cb:
            int r2 = r2 + -1
            r17 = r3
            goto L_0x01bc
        L_0x01d0:
            r2 = 1
            goto L_0x01d3
        L_0x01d2:
            r2 = 0
        L_0x01d3:
            if (r2 == 0) goto L_0x01dc
            r1.h = r11
            int r0 = r15 - r11
            r1.i = r0
            return r15
        L_0x01dc:
            if (r16 == 0) goto L_0x01fd
            byte[] r1 = r8.b
            byte r1 = r1[r16]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 1
            int r16 = r16 + 1
            r2 = r16
        L_0x01e9:
            if (r1 <= 0) goto L_0x01fd
            java.lang.String r3 = r8.readUTF8(r2, r10)
            int r4 = r2 + 2
            int r4 = r8.readUnsignedShort(r4)
            r0.visitParameter(r3, r4)
            int r1 = r1 + -1
            int r2 = r2 + 4
            goto L_0x01e9
        L_0x01fd:
            if (r13 == 0) goto L_0x020c
            org.objectweb.asm.AnnotationVisitor r1 = r0.visitAnnotationDefault()
            r2 = 0
            r8.a((int) r13, (char[]) r10, (java.lang.String) r2, (org.objectweb.asm.AnnotationVisitor) r1)
            if (r1 == 0) goto L_0x020c
            r1.visitEnd()
        L_0x020c:
            r5 = r30
            if (r5 == 0) goto L_0x022a
            int r1 = r8.readUnsignedShort(r5)
            int r5 = r5 + 2
        L_0x0216:
            if (r1 <= 0) goto L_0x022a
            int r2 = r5 + 2
            java.lang.String r3 = r8.readUTF8(r5, r10)
            r4 = 1
            org.objectweb.asm.AnnotationVisitor r3 = r0.visitAnnotation(r3, r4)
            int r5 = r8.a((int) r2, (char[]) r10, (boolean) r4, (org.objectweb.asm.AnnotationVisitor) r3)
            int r1 = r1 + -1
            goto L_0x0216
        L_0x022a:
            r4 = r29
            if (r4 == 0) goto L_0x024a
            int r1 = r8.readUnsignedShort(r4)
            int r4 = r4 + 2
        L_0x0234:
            if (r1 <= 0) goto L_0x024a
            int r2 = r4 + 2
            java.lang.String r3 = r8.readUTF8(r4, r10)
            r4 = 0
            org.objectweb.asm.AnnotationVisitor r3 = r0.visitAnnotation(r3, r4)
            r4 = 1
            int r2 = r8.a((int) r2, (char[]) r10, (boolean) r4, (org.objectweb.asm.AnnotationVisitor) r3)
            int r1 = r1 + -1
            r4 = r2
            goto L_0x0234
        L_0x024a:
            r2 = r28
            if (r2 == 0) goto L_0x0270
            int r1 = r8.readUnsignedShort(r2)
            int r2 = r2 + 2
        L_0x0254:
            if (r1 <= 0) goto L_0x0270
            int r2 = r8.a((org.objectweb.asm.Context) r9, (int) r2)
            int r3 = r2 + 2
            int r4 = r9.i
            org.objectweb.asm.TypePath r5 = r9.j
            java.lang.String r2 = r8.readUTF8(r2, r10)
            r6 = 1
            org.objectweb.asm.AnnotationVisitor r2 = r0.visitTypeAnnotation(r4, r5, r2, r6)
            int r2 = r8.a((int) r3, (char[]) r10, (boolean) r6, (org.objectweb.asm.AnnotationVisitor) r2)
            int r1 = r1 + -1
            goto L_0x0254
        L_0x0270:
            r1 = r27
            if (r1 == 0) goto L_0x0297
            int r2 = r8.readUnsignedShort(r1)
            int r1 = r1 + 2
        L_0x027a:
            if (r2 <= 0) goto L_0x0297
            int r1 = r8.a((org.objectweb.asm.Context) r9, (int) r1)
            int r3 = r1 + 2
            int r4 = r9.i
            org.objectweb.asm.TypePath r5 = r9.j
            java.lang.String r1 = r8.readUTF8(r1, r10)
            r6 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r0.visitTypeAnnotation(r4, r5, r1, r6)
            r4 = 1
            int r1 = r8.a((int) r3, (char[]) r10, (boolean) r4, (org.objectweb.asm.AnnotationVisitor) r1)
            int r2 = r2 + -1
            goto L_0x027a
        L_0x0297:
            r4 = 1
            r1 = r18
            if (r1 == 0) goto L_0x029f
            r8.b(r0, r9, r1, r4)
        L_0x029f:
            r1 = r26
            if (r1 == 0) goto L_0x02a7
            r2 = 0
            r8.b(r0, r9, r1, r2)
        L_0x02a7:
            if (r12 == 0) goto L_0x02b3
            org.objectweb.asm.Attribute r1 = r12.a
            r2 = 0
            r12.a = r2
            r0.visitAttribute(r12)
            r12 = r1
            goto L_0x02a7
        L_0x02b3:
            r12 = r19
            if (r12 == 0) goto L_0x02bd
            r0.visitCode()
            r8.a((org.objectweb.asm.MethodVisitor) r0, (org.objectweb.asm.Context) r9, (int) r12)
        L_0x02bd:
            r0.visitEnd()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.b(org.objectweb.asm.ClassVisitor, org.objectweb.asm.Context, int):int");
    }

    private void b(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int i2 = i + 1;
        byte b2 = this.b[i] & 255;
        int length = Type.getArgumentTypes(context.g).length - b2;
        int i3 = 0;
        while (i3 < length) {
            AnnotationVisitor visitParameterAnnotation = methodVisitor.visitParameterAnnotation(i3, "Ljava/lang/Synthetic;", false);
            if (visitParameterAnnotation != null) {
                visitParameterAnnotation.visitEnd();
            }
            i3++;
        }
        char[] cArr = context.c;
        while (i3 < b2 + length) {
            i2 += 2;
            for (int readUnsignedShort = readUnsignedShort(i2); readUnsignedShort > 0; readUnsignedShort--) {
                i2 = a(i2 + 2, cArr, true, methodVisitor.visitParameterAnnotation(i3, readUTF8(i2, cArr), z));
            }
            i3++;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ClassWriter classWriter) {
        char[] cArr = new char[this.d];
        int length = this.a.length;
        Item[] itemArr = new Item[length];
        int i = 1;
        while (i < length) {
            int i2 = this.a[i];
            byte b2 = this.b[i2 - 1];
            Item item = new Item(i);
            if (b2 == 1) {
                String[] strArr = this.c;
                String str = strArr[i];
                if (str == null) {
                    int i3 = this.a[i];
                    str = a(i3 + 2, readUnsignedShort(i3), cArr);
                    strArr[i] = str;
                }
                item.a(b2, str, (String) null, (String) null);
            } else if (b2 == 15) {
                int i4 = this.a[readUnsignedShort(i2 + 1)];
                int i5 = this.a[readUnsignedShort(i4 + 2)];
                item.a(readByte(i2) + 20, readClass(i4, cArr), readUTF8(i5, cArr), readUTF8(i5 + 2, cArr));
            } else if (b2 == 18) {
                if (classWriter.A == null) {
                    a(classWriter, itemArr, cArr);
                }
                int i6 = this.a[readUnsignedShort(i2 + 2)];
                item.a(readUTF8(i6, cArr), readUTF8(i6 + 2, cArr), readUnsignedShort(i2));
            } else if (b2 == 3) {
                item.a(readInt(i2));
            } else if (b2 != 4) {
                if (b2 == 5) {
                    item.a(readLong(i2));
                } else if (b2 != 6) {
                    switch (b2) {
                        case 9:
                        case 10:
                        case 11:
                            int i7 = this.a[readUnsignedShort(i2 + 2)];
                            item.a(b2, readClass(i2, cArr), readUTF8(i7, cArr), readUTF8(i7 + 2, cArr));
                            break;
                        case 12:
                            item.a(b2, readUTF8(i2, cArr), readUTF8(i2 + 2, cArr), (String) null);
                            break;
                        default:
                            item.a(b2, readUTF8(i2, cArr), (String) null, (String) null);
                            break;
                    }
                } else {
                    item.a(Double.longBitsToDouble(readLong(i2)));
                }
                i++;
            } else {
                item.a(Float.intBitsToFloat(readInt(i2)));
            }
            int i8 = item.j % length;
            item.k = itemArr[i8];
            itemArr[i8] = item;
            i++;
        }
        int i9 = this.a[1] - 1;
        classWriter.d.putByteArray(this.b, i9, this.header - i9);
        classWriter.e = itemArr;
        classWriter.f = (int) (((double) length) * 0.75d);
        classWriter.c = length;
    }

    public void accept(ClassVisitor classVisitor, int i) {
        accept(classVisitor, new Attribute[0], i);
    }

    public void accept(ClassVisitor classVisitor, Attribute[] attributeArr, int i) {
        String[] strArr;
        String str;
        String str2;
        int i2;
        String str3;
        Attribute attribute;
        int i3;
        ClassVisitor classVisitor2 = classVisitor;
        int i4 = i;
        int i5 = this.header;
        char[] cArr = new char[this.d];
        Context context = new Context();
        context.a = attributeArr;
        context.b = i4;
        context.c = cArr;
        int readUnsignedShort = readUnsignedShort(i5);
        String readClass = readClass(i5 + 2, cArr);
        String readClass2 = readClass(i5 + 4, cArr);
        int readUnsignedShort2 = readUnsignedShort(i5 + 6);
        String[] strArr2 = new String[readUnsignedShort2];
        int i6 = i5 + 8;
        for (int i7 = 0; i7 < readUnsignedShort2; i7++) {
            strArr2[i7] = readClass(i6, cArr);
            i6 += 2;
        }
        int a2 = a();
        int i8 = a2;
        int i9 = readUnsignedShort;
        int readUnsignedShort3 = readUnsignedShort(a2);
        int i10 = readUnsignedShort2;
        int i11 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        Attribute attribute2 = null;
        while (readUnsignedShort3 > 0) {
            String readUTF8 = readUTF8(i8 + 2, cArr);
            if ("SourceFile".equals(readUTF8)) {
                str6 = readUTF8(i8 + 8, cArr);
            } else if ("InnerClasses".equals(readUTF8)) {
                i15 = i8 + 8;
            } else if ("EnclosingMethod".equals(readUTF8)) {
                String readClass3 = readClass(i8 + 8, cArr);
                int readUnsignedShort4 = readUnsignedShort(i8 + 10);
                if (readUnsignedShort4 != 0) {
                    str9 = readUTF8(this.a[readUnsignedShort4], cArr);
                    str4 = readUTF8(this.a[readUnsignedShort4] + 2, cArr);
                }
                str8 = readClass3;
            } else if ("Signature".equals(readUTF8)) {
                str7 = readUTF8(i8 + 8, cArr);
            } else if ("RuntimeVisibleAnnotations".equals(readUTF8)) {
                i11 = i8 + 8;
            } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF8)) {
                i13 = i8 + 8;
            } else {
                if ("Deprecated".equals(readUTF8)) {
                    i3 = 131072;
                } else if ("Synthetic".equals(readUTF8)) {
                    i3 = 266240;
                } else if ("SourceDebugExtension".equals(readUTF8)) {
                    int readInt = readInt(i8 + 4);
                    str5 = a(i8 + 8, readInt, new char[readInt]);
                } else if ("RuntimeInvisibleAnnotations".equals(readUTF8)) {
                    i12 = i8 + 8;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF8)) {
                    i14 = i8 + 8;
                } else {
                    if ("BootstrapMethods".equals(readUTF8)) {
                        int readUnsignedShort5 = readUnsignedShort(i8 + 8);
                        int[] iArr = new int[readUnsignedShort5];
                        int i16 = i8 + 10;
                        int i17 = 0;
                        while (i17 < readUnsignedShort5) {
                            iArr[i17] = i16;
                            i16 += (readUnsignedShort(i16 + 2) + 2) << 1;
                            i17++;
                            i11 = i11;
                        }
                        context.d = iArr;
                        str2 = str4;
                        str = str5;
                        str3 = str6;
                        strArr = strArr2;
                        attribute = attribute2;
                        i2 = i11;
                    } else {
                        i2 = i11;
                        str2 = str4;
                        str = str5;
                        String str10 = readUTF8;
                        String str11 = str6;
                        strArr = strArr2;
                        str3 = str11;
                        Attribute a3 = a(attributeArr, str10, i8 + 8, readInt(i8 + 4), cArr, -1, (Label[]) null);
                        attribute = attribute2;
                        if (a3 != null) {
                            a3.a = attribute;
                            attribute2 = a3;
                            str6 = str3;
                            i11 = i2;
                            str4 = str2;
                            str5 = str;
                            i8 += readInt(i8 + 4) + 6;
                            readUnsignedShort3--;
                            Attribute[] attributeArr2 = attributeArr;
                            strArr2 = strArr;
                        }
                    }
                    attribute2 = attribute;
                    str6 = str3;
                    i11 = i2;
                    str4 = str2;
                    str5 = str;
                    i8 += readInt(i8 + 4) + 6;
                    readUnsignedShort3--;
                    Attribute[] attributeArr22 = attributeArr;
                    strArr2 = strArr;
                }
                i9 |= i3;
            }
            strArr = strArr2;
            i8 += readInt(i8 + 4) + 6;
            readUnsignedShort3--;
            Attribute[] attributeArr222 = attributeArr;
            strArr2 = strArr;
        }
        int i18 = i11;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String[] strArr3 = strArr2;
        Attribute attribute3 = attribute2;
        classVisitor.visit(readInt(this.a[1] - 7), i9, readClass, str7, readClass2, strArr2);
        if ((i4 & 2) == 0) {
            String str15 = str13;
            if (!(str14 == null && str15 == null)) {
                classVisitor2.visitSource(str14, str15);
            }
        }
        String str16 = str8;
        if (str16 != null) {
            classVisitor2.visitOuterClass(str16, str9, str12);
        }
        int i19 = i18;
        if (i19 != 0) {
            int i20 = i19 + 2;
            for (int readUnsignedShort6 = readUnsignedShort(i19); readUnsignedShort6 > 0; readUnsignedShort6--) {
                i20 = a(i20 + 2, cArr, true, classVisitor2.visitAnnotation(readUTF8(i20, cArr), true));
            }
        }
        int i21 = i12;
        if (i21 != 0) {
            int i22 = i21 + 2;
            for (int readUnsignedShort7 = readUnsignedShort(i21); readUnsignedShort7 > 0; readUnsignedShort7--) {
                i22 = a(i22 + 2, cArr, true, classVisitor2.visitAnnotation(readUTF8(i22, cArr), false));
            }
        }
        int i23 = i13;
        if (i23 != 0) {
            int i24 = i23 + 2;
            for (int readUnsignedShort8 = readUnsignedShort(i23); readUnsignedShort8 > 0; readUnsignedShort8--) {
                int a4 = a(context, i24);
                i24 = a(a4 + 2, cArr, true, classVisitor2.visitTypeAnnotation(context.i, context.j, readUTF8(a4, cArr), true));
            }
        }
        int i25 = i14;
        if (i25 != 0) {
            int i26 = i25 + 2;
            for (int readUnsignedShort9 = readUnsignedShort(i25); readUnsignedShort9 > 0; readUnsignedShort9--) {
                int a5 = a(context, i26);
                i26 = a(a5 + 2, cArr, true, classVisitor2.visitTypeAnnotation(context.i, context.j, readUTF8(a5, cArr), false));
            }
        }
        while (attribute3 != null) {
            Attribute attribute4 = attribute3.a;
            attribute3.a = null;
            classVisitor2.visitAttribute(attribute3);
            attribute3 = attribute4;
        }
        int i27 = i15;
        if (i27 != 0) {
            int i28 = i27 + 2;
            for (int readUnsignedShort10 = readUnsignedShort(i27); readUnsignedShort10 > 0; readUnsignedShort10--) {
                classVisitor2.visitInnerClass(readClass(i28, cArr), readClass(i28 + 2, cArr), readUTF8(i28 + 4, cArr), readUnsignedShort(i28 + 6));
                i28 += 8;
            }
        }
        int i29 = this.header + 10 + (i10 * 2);
        for (int readUnsignedShort11 = readUnsignedShort(i29 - 2); readUnsignedShort11 > 0; readUnsignedShort11--) {
            i29 = a(classVisitor2, context, i29);
        }
        int i30 = i29 + 2;
        for (int readUnsignedShort12 = readUnsignedShort(i30 - 2); readUnsignedShort12 > 0; readUnsignedShort12--) {
            i30 = b(classVisitor2, context, i30);
        }
        classVisitor.visitEnd();
    }

    public int getAccess() {
        return readUnsignedShort(this.header);
    }

    public String getClassName() {
        return readClass(this.header + 2, new char[this.d]);
    }

    public String[] getInterfaces() {
        int i = this.header + 6;
        int readUnsignedShort = readUnsignedShort(i);
        String[] strArr = new String[readUnsignedShort];
        if (readUnsignedShort > 0) {
            char[] cArr = new char[this.d];
            for (int i2 = 0; i2 < readUnsignedShort; i2++) {
                i += 2;
                strArr[i2] = readClass(i, cArr);
            }
        }
        return strArr;
    }

    public int getItem(int i) {
        return this.a[i];
    }

    public int getItemCount() {
        return this.a.length;
    }

    public int getMaxStringLength() {
        return this.d;
    }

    public String getSuperName() {
        return readClass(this.header + 4, new char[this.d]);
    }

    public int readByte(int i) {
        return this.b[i] & 255;
    }

    public String readClass(int i, char[] cArr) {
        return readUTF8(this.a[readUnsignedShort(i)], cArr);
    }

    public Object readConst(int i, char[] cArr) {
        int i2 = this.a[i];
        byte b2 = this.b[i2 - 1];
        if (b2 == 16) {
            return Type.getMethodType(readUTF8(i2, cArr));
        }
        switch (b2) {
            case 3:
                return new Integer(readInt(i2));
            case 4:
                return new Float(Float.intBitsToFloat(readInt(i2)));
            case 5:
                return new Long(readLong(i2));
            case 6:
                return new Double(Double.longBitsToDouble(readLong(i2)));
            case 7:
                return Type.getObjectType(readUTF8(i2, cArr));
            case 8:
                return readUTF8(i2, cArr);
            default:
                int readByte = readByte(i2);
                int[] iArr = this.a;
                int i3 = iArr[readUnsignedShort(i2 + 1)];
                String readClass = readClass(i3, cArr);
                int i4 = iArr[readUnsignedShort(i3 + 2)];
                return new Handle(readByte, readClass, readUTF8(i4, cArr), readUTF8(i4 + 2, cArr));
        }
    }

    public int readInt(int i) {
        byte[] bArr = this.b;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }

    /* access modifiers changed from: protected */
    public Label readLabel(int i, Label[] labelArr) {
        if (labelArr[i] == null) {
            labelArr[i] = new Label();
        }
        return labelArr[i];
    }

    public long readLong(int i) {
        return (((long) readInt(i)) << 32) | (((long) readInt(i + 4)) & 4294967295L);
    }

    public short readShort(int i) {
        byte[] bArr = this.b;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public String readUTF8(int i, char[] cArr) {
        int readUnsignedShort = readUnsignedShort(i);
        if (i == 0 || readUnsignedShort == 0) {
            return null;
        }
        String[] strArr = this.c;
        String str = strArr[readUnsignedShort];
        if (str != null) {
            return str;
        }
        int i2 = this.a[readUnsignedShort];
        String a2 = a(i2 + 2, readUnsignedShort(i2), cArr);
        strArr[readUnsignedShort] = a2;
        return a2;
    }

    public int readUnsignedShort(int i) {
        byte[] bArr = this.b;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }
}
