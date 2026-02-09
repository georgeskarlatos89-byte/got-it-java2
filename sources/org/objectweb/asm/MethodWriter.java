package org.objectweb.asm;

import com.google.common.base.Ascii;
import org.apache.http.HttpStatus;

class MethodWriter extends MethodVisitor {
    private ByteVector $;
    private int A;
    private Handler B;
    private Handler C;
    private int D;
    private ByteVector E;
    private int F;
    private ByteVector G;
    private int H;
    private ByteVector I;
    private Attribute J;
    private boolean K;
    private int L;
    private final int M;
    private Label N;
    private Label O;
    private Label P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private AnnotationWriter U;
    private AnnotationWriter V;
    private AnnotationWriter W;
    private AnnotationWriter X;
    private int Y;
    private int Z;
    final ClassWriter b;
    private int c;
    private final int d;
    private final int e;
    private final String f;
    String g;
    int h;
    int i;
    int j;
    int[] k;
    private ByteVector l;
    private AnnotationWriter m;
    private AnnotationWriter n;
    private AnnotationWriter[] o;
    private AnnotationWriter[] p;
    private Attribute q;
    private ByteVector r = new ByteVector();
    private int s;
    private int t;
    private int u;
    private ByteVector v;
    private int w;
    private int[] x;
    private int[] z;

    MethodWriter(ClassWriter classWriter, int i2, String str, String str2, String str3, String[] strArr, boolean z2, boolean z3) {
        super(Opcodes.ASM5);
        if (classWriter.D == null) {
            classWriter.D = this;
        } else {
            classWriter.E.mv = this;
        }
        classWriter.E = this;
        this.b = classWriter;
        this.c = i2;
        if ("<init>".equals(str)) {
            this.c |= 524288;
        }
        this.d = classWriter.newUTF8(str);
        this.e = classWriter.newUTF8(str2);
        this.f = str2;
        this.g = str3;
        int i3 = 0;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.j = length;
            this.k = new int[length];
            for (int i4 = 0; i4 < this.j; i4++) {
                this.k[i4] = classWriter.newClass(strArr[i4]);
            }
        }
        this.M = !z3 ? z2 ? 1 : 2 : i3;
        if (z2 || z3) {
            int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(this.f) >> 2;
            argumentsAndReturnSizes = (i2 & 8) != 0 ? argumentsAndReturnSizes - 1 : argumentsAndReturnSizes;
            this.t = argumentsAndReturnSizes;
            this.T = argumentsAndReturnSizes;
            Label label = new Label();
            this.N = label;
            label.a |= 8;
            visitLabel(this.N);
        }
    }

    private int a(int i2, int i3, int i4) {
        int i5 = i3 + 3 + i4;
        int[] iArr = this.z;
        if (iArr == null || iArr.length < i5) {
            this.z = new int[i5];
        }
        int[] iArr2 = this.z;
        iArr2[0] = i2;
        iArr2[1] = i3;
        iArr2[2] = i4;
        return 3;
    }

    static int a(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << Ascii.CAN) | ((bArr[i2 + 1] & 255) << Ascii.DLE) | ((bArr[i2 + 2] & 255) << 8);
    }

    static int a(int[] iArr, int[] iArr2, int i2, int i3) {
        int i4 = i3 - i2;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i2 < i6 && i6 <= i3) {
                i4 += iArr2[i5];
            } else if (i3 < i6 && i6 <= i2) {
                i4 -= iArr2[i5];
            }
        }
        return i4;
    }

    private void a(int i2, int i3) {
        int i4;
        ByteVector byteVector;
        char c2;
        while (i2 < i3) {
            int i5 = this.z[i2];
            int i6 = -268435456 & i5;
            if (i6 == 0) {
                int i7 = i5 & 1048575;
                int i8 = i5 & 267386880;
                if (i8 == 24117248) {
                    byteVector = this.v.putByte(7);
                    ClassWriter classWriter = this.b;
                    i4 = classWriter.newClass(classWriter.H[i7].g);
                } else if (i8 != 25165824) {
                    this.v.putByte(i7);
                    i2++;
                } else {
                    byteVector = this.v.putByte(8);
                    i4 = this.b.H[i7].c;
                }
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                int i9 = i6 >> 28;
                while (true) {
                    int i10 = i9 - 1;
                    if (i9 <= 0) {
                        break;
                    }
                    stringBuffer.append('[');
                    i9 = i10;
                }
                if ((i5 & 267386880) == 24117248) {
                    stringBuffer.append('L');
                    stringBuffer.append(this.b.H[i5 & 1048575].g);
                    c2 = ';';
                } else {
                    int i11 = i5 & 15;
                    if (i11 == 1) {
                        c2 = 'I';
                    } else if (i11 == 2) {
                        c2 = 'F';
                    } else if (i11 != 3) {
                        switch (i11) {
                            case 9:
                                c2 = 'Z';
                                break;
                            case 10:
                                c2 = 'B';
                                break;
                            case 11:
                                c2 = 'C';
                                break;
                            case 12:
                                c2 = 'S';
                                break;
                            default:
                                c2 = 'J';
                                break;
                        }
                    } else {
                        c2 = 'D';
                    }
                }
                stringBuffer.append(c2);
                byteVector = this.v.putByte(7);
                i4 = this.b.newClass(stringBuffer.toString());
            }
            byteVector.putShort(i4);
            i2++;
        }
    }

    private void a(int i2, Label label) {
        Edge edge = new Edge();
        edge.a = i2;
        edge.b = label;
        edge.c = this.P.j;
        this.P.j = edge;
    }

    private void a(Object obj) {
        ByteVector putByte;
        int i2;
        if (obj instanceof String) {
            putByte = this.v.putByte(7);
            i2 = this.b.newClass((String) obj);
        } else if (obj instanceof Integer) {
            this.v.putByte(((Integer) obj).intValue());
            return;
        } else {
            putByte = this.v.putByte(8);
            i2 = ((Label) obj).c;
        }
        putByte.putShort(i2);
    }

    private void a(Label label, Label[] labelArr) {
        Label label2 = this.P;
        if (label2 != null) {
            if (this.M == 0) {
                label2.h.a((int) Opcodes.LOOKUPSWITCH, 0, (ClassWriter) null, (Item) null);
                a(0, label);
                label.a().a |= 16;
                for (int i2 = 0; i2 < labelArr.length; i2++) {
                    a(0, labelArr[i2]);
                    labelArr[i2].a().a |= 16;
                }
            } else {
                int i3 = this.Q - 1;
                this.Q = i3;
                a(i3, label);
                for (Label a : labelArr) {
                    a(this.Q, a);
                }
            }
            e();
        }
    }

    static void a(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >>> 8);
        bArr[i2 + 1] = (byte) i3;
    }

    static void a(int[] iArr, int[] iArr2, Label label) {
        if ((label.a & 4) == 0) {
            label.c = a(iArr, iArr2, 0, label.c);
            label.a |= 4;
        }
    }

    static short b(byte[] bArr, int i2) {
        return (short) ((bArr[i2 + 1] & 255) | ((bArr[i2] & 255) << 8));
    }

    private void b() {
        if (this.x != null) {
            if (this.v == null) {
                this.v = new ByteVector();
            }
            c();
            this.u++;
        }
        this.x = this.z;
        this.z = null;
    }

    private void b(Frame frame) {
        int[] iArr = frame.c;
        int[] iArr2 = frame.d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < iArr.length) {
            int i6 = iArr[i3];
            i5++;
            if (i6 != 16777216) {
                i4 += i5;
                i5 = 0;
            }
            if (i6 == 16777220 || i6 == 16777219) {
                i3++;
            }
            i3++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i8++;
            if (i9 == 16777220 || i9 == 16777219) {
                i7++;
            }
            i7++;
        }
        int a = a(frame.b.c, i4, i8);
        int i10 = 0;
        while (i4 > 0) {
            int i11 = iArr[i10];
            int i12 = a + 1;
            this.z[a] = i11;
            if (i11 == 16777220 || i11 == 16777219) {
                i10++;
            }
            i10++;
            i4--;
            a = i12;
        }
        while (i2 < iArr2.length) {
            int i13 = iArr2[i2];
            int i14 = a + 1;
            this.z[a] = i13;
            if (i13 == 16777220 || i13 == 16777219) {
                i2++;
            }
            i2++;
            a = i14;
        }
        b();
    }

    static int c(byte[] bArr, int i2) {
        return (bArr[i2 + 1] & 255) | ((bArr[i2] & 255) << 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.z
            r2 = 1
            r3 = r1[r2]
            r4 = 2
            r1 = r1[r4]
            org.objectweb.asm.ClassWriter r4 = r0.b
            int r4 = r4.b
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            r5 = 50
            r6 = 0
            r7 = 3
            if (r4 >= r5) goto L_0x0033
            org.objectweb.asm.ByteVector r2 = r0.v
            int[] r4 = r0.z
            r4 = r4[r6]
            org.objectweb.asm.ByteVector r2 = r2.putShort(r4)
            r2.putShort(r3)
            int r3 = r3 + r7
            r0.a((int) r7, (int) r3)
            org.objectweb.asm.ByteVector r2 = r0.v
            r2.putShort(r1)
            int r1 = r1 + r3
            r0.a((int) r3, (int) r1)
            return
        L_0x0033:
            int[] r4 = r0.x
            r5 = r4[r2]
            int r8 = r0.u
            if (r8 != 0) goto L_0x0040
            int[] r4 = r0.z
            r4 = r4[r6]
            goto L_0x0049
        L_0x0040:
            int[] r8 = r0.z
            r8 = r8[r6]
            r4 = r4[r6]
            int r8 = r8 - r4
            int r4 = r8 + -1
        L_0x0049:
            r8 = 252(0xfc, float:3.53E-43)
            r9 = 248(0xf8, float:3.48E-43)
            r10 = 247(0xf7, float:3.46E-43)
            r11 = 64
            r12 = 255(0xff, float:3.57E-43)
            r13 = 251(0xfb, float:3.52E-43)
            if (r1 != 0) goto L_0x0068
            int r2 = r3 - r5
            switch(r2) {
                case -3: goto L_0x0065;
                case -2: goto L_0x0065;
                case -1: goto L_0x0065;
                case 0: goto L_0x005f;
                case 1: goto L_0x005d;
                case 2: goto L_0x005d;
                case 3: goto L_0x005d;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x0076
        L_0x005d:
            r14 = r8
            goto L_0x0077
        L_0x005f:
            if (r4 >= r11) goto L_0x0063
            r14 = r6
            goto L_0x0077
        L_0x0063:
            r14 = r13
            goto L_0x0077
        L_0x0065:
            r5 = r3
            r14 = r9
            goto L_0x0077
        L_0x0068:
            if (r3 != r5) goto L_0x0075
            if (r1 != r2) goto L_0x0075
            r2 = 63
            if (r4 >= r2) goto L_0x0072
            r14 = r11
            goto L_0x0073
        L_0x0072:
            r14 = r10
        L_0x0073:
            r2 = r6
            goto L_0x0077
        L_0x0075:
            r2 = r6
        L_0x0076:
            r14 = r12
        L_0x0077:
            if (r14 == r12) goto L_0x0091
            r15 = r7
        L_0x007a:
            if (r6 >= r5) goto L_0x0091
            int[] r7 = r0.z
            r7 = r7[r15]
            int[] r12 = r0.x
            r12 = r12[r15]
            if (r7 == r12) goto L_0x0089
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x0091
        L_0x0089:
            int r15 = r15 + 1
            int r6 = r6 + 1
            r7 = 3
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x007a
        L_0x0091:
            if (r14 == 0) goto L_0x00f6
            if (r14 == r11) goto L_0x00e8
            if (r14 == r10) goto L_0x00de
            if (r14 == r9) goto L_0x00d3
            if (r14 == r13) goto L_0x00cc
            if (r14 == r8) goto L_0x00bb
            org.objectweb.asm.ByteVector r2 = r0.v
            r5 = 255(0xff, float:3.57E-43)
            org.objectweb.asm.ByteVector r2 = r2.putByte(r5)
            org.objectweb.asm.ByteVector r2 = r2.putShort(r4)
            r2.putShort(r3)
            r6 = 3
            int r3 = r3 + r6
            r0.a((int) r6, (int) r3)
            org.objectweb.asm.ByteVector r2 = r0.v
            r2.putShort(r1)
            int r1 = r1 + r3
            r0.a((int) r3, (int) r1)
            goto L_0x00fb
        L_0x00bb:
            r6 = 3
            org.objectweb.asm.ByteVector r1 = r0.v
            int r2 = r2 + r13
            org.objectweb.asm.ByteVector r1 = r1.putByte(r2)
            r1.putShort(r4)
            int r5 = r5 + r6
            int r3 = r3 + r6
            r0.a((int) r5, (int) r3)
            goto L_0x00fb
        L_0x00cc:
            org.objectweb.asm.ByteVector r1 = r0.v
            org.objectweb.asm.ByteVector r1 = r1.putByte(r13)
            goto L_0x00da
        L_0x00d3:
            org.objectweb.asm.ByteVector r1 = r0.v
            int r2 = r2 + r13
            org.objectweb.asm.ByteVector r1 = r1.putByte(r2)
        L_0x00da:
            r1.putShort(r4)
            goto L_0x00fb
        L_0x00de:
            org.objectweb.asm.ByteVector r1 = r0.v
            org.objectweb.asm.ByteVector r1 = r1.putByte(r10)
            r1.putShort(r4)
            goto L_0x00ee
        L_0x00e8:
            org.objectweb.asm.ByteVector r1 = r0.v
            int r4 = r4 + r11
            r1.putByte(r4)
        L_0x00ee:
            int r1 = r3 + 3
            int r3 = r3 + 4
            r0.a((int) r1, (int) r3)
            goto L_0x00fb
        L_0x00f6:
            org.objectweb.asm.ByteVector r1 = r0.v
            r1.putByte(r4)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.MethodWriter.c():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v58, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v59, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v60, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v61, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v62, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
            r18 = this;
            r0 = r18
            org.objectweb.asm.ByteVector r1 = r0.r
            byte[] r1 = r1.a
            r2 = 0
            int[] r3 = new int[r2]
            int[] r4 = new int[r2]
            org.objectweb.asm.ByteVector r5 = r0.r
            int r5 = r5.b
            boolean[] r5 = new boolean[r5]
            r6 = 3
            r7 = r6
        L_0x0013:
            if (r7 != r6) goto L_0x0016
            r7 = 2
        L_0x0016:
            r9 = r2
        L_0x0017:
            int r10 = r1.length
            r13 = 218(0xda, float:3.05E-43)
            r14 = 132(0x84, float:1.85E-43)
            r15 = 201(0xc9, float:2.82E-43)
            r8 = 8
            r11 = 1
            r12 = 4
            if (r9 >= r10) goto L_0x00f9
            byte r10 = r1[r9]
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte[] r17 = org.objectweb.asm.ClassWriter.a
            byte r17 = r17[r10]
            switch(r17) {
                case 0: goto L_0x00d7;
                case 1: goto L_0x00d4;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00d7;
                case 5: goto L_0x00d1;
                case 6: goto L_0x00d1;
                case 7: goto L_0x00ce;
                case 8: goto L_0x00ce;
                case 9: goto L_0x0090;
                case 10: goto L_0x00ce;
                case 11: goto L_0x00d4;
                case 12: goto L_0x00d1;
                case 13: goto L_0x00d1;
                case 14: goto L_0x0063;
                case 15: goto L_0x003f;
                case 16: goto L_0x002f;
                case 17: goto L_0x0033;
                default: goto L_0x002f;
            }
        L_0x002f:
            int r9 = r9 + 4
            goto L_0x00d9
        L_0x0033:
            int r8 = r9 + 1
            byte r8 = r1[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 != r14) goto L_0x002f
            int r9 = r9 + 6
            goto L_0x00d9
        L_0x003f:
            if (r7 != r11) goto L_0x0048
            int r10 = a(r3, r4, r2, r9)
            r10 = r10 & r6
            int r10 = -r10
            goto L_0x0052
        L_0x0048:
            boolean r10 = r5[r9]
            if (r10 != 0) goto L_0x0051
            r10 = r9 & 3
            r5[r9] = r11
            goto L_0x0052
        L_0x0051:
            r10 = r2
        L_0x0052:
            int r12 = r9 + 4
            r9 = r9 & 3
            int r12 = r12 - r9
            int r9 = r12 + 4
            int r9 = a((byte[]) r1, (int) r9)
            int r9 = r9 * r8
            int r9 = r9 + r8
            int r12 = r12 + r9
            r9 = r12
            goto L_0x00da
        L_0x0063:
            if (r7 != r11) goto L_0x006d
            int r8 = a(r3, r4, r2, r9)
            r8 = r8 & r6
            int r8 = -r8
        L_0x006b:
            r10 = r8
            goto L_0x0077
        L_0x006d:
            boolean r8 = r5[r9]
            if (r8 != 0) goto L_0x0076
            r8 = r9 & 3
            r5[r9] = r11
            goto L_0x006b
        L_0x0076:
            r10 = r2
        L_0x0077:
            int r8 = r9 + 4
            r9 = r9 & 3
            int r8 = r8 - r9
            int r9 = r8 + 8
            int r9 = a((byte[]) r1, (int) r9)
            int r13 = r8 + 4
            int r13 = a((byte[]) r1, (int) r13)
            int r9 = r9 - r13
            int r9 = r9 + r11
            int r9 = r9 * r12
            int r9 = r9 + 12
            int r8 = r8 + r9
            r9 = r8
            goto L_0x00da
        L_0x0090:
            if (r10 <= r15) goto L_0x00a0
            if (r10 >= r13) goto L_0x0097
            int r10 = r10 + -49
            goto L_0x0099
        L_0x0097:
            int r10 = r10 + -20
        L_0x0099:
            int r8 = r9 + 1
            int r8 = c(r1, r8)
            goto L_0x00a6
        L_0x00a0:
            int r8 = r9 + 1
            short r8 = b(r1, r8)
        L_0x00a6:
            int r8 = r8 + r9
            int r8 = a(r3, r4, r9, r8)
            r12 = -32768(0xffffffffffff8000, float:NaN)
            if (r8 < r12) goto L_0x00b3
            r12 = 32767(0x7fff, float:4.5916E-41)
            if (r8 <= r12) goto L_0x00ca
        L_0x00b3:
            boolean r8 = r5[r9]
            if (r8 != 0) goto L_0x00ca
            r8 = 167(0xa7, float:2.34E-43)
            if (r10 == r8) goto L_0x00c3
            r8 = 168(0xa8, float:2.35E-43)
            if (r10 != r8) goto L_0x00c0
            goto L_0x00c3
        L_0x00c0:
            r16 = 5
            goto L_0x00c5
        L_0x00c3:
            r16 = 2
        L_0x00c5:
            r5[r9] = r11
            r10 = r16
            goto L_0x00cb
        L_0x00ca:
            r10 = r2
        L_0x00cb:
            int r9 = r9 + 3
            goto L_0x00da
        L_0x00ce:
            int r9 = r9 + 5
            goto L_0x00d9
        L_0x00d1:
            int r9 = r9 + 3
            goto L_0x00d9
        L_0x00d4:
            int r9 = r9 + 2
            goto L_0x00d9
        L_0x00d7:
            int r9 = r9 + 1
        L_0x00d9:
            r10 = r2
        L_0x00da:
            if (r10 == 0) goto L_0x0017
            int r8 = r3.length
            int r8 = r8 + r11
            int[] r8 = new int[r8]
            int r12 = r4.length
            int r12 = r12 + r11
            int[] r11 = new int[r12]
            int r12 = r3.length
            java.lang.System.arraycopy(r3, r2, r8, r2, r12)
            int r12 = r4.length
            java.lang.System.arraycopy(r4, r2, r11, r2, r12)
            int r3 = r3.length
            r8[r3] = r9
            int r3 = r4.length
            r11[r3] = r10
            if (r10 <= 0) goto L_0x00f5
            r7 = r6
        L_0x00f5:
            r3 = r8
            r4 = r11
            goto L_0x0017
        L_0x00f9:
            if (r7 >= r6) goto L_0x00fd
            int r7 = r7 + -1
        L_0x00fd:
            if (r7 != 0) goto L_0x0013
            org.objectweb.asm.ByteVector r7 = new org.objectweb.asm.ByteVector
            org.objectweb.asm.ByteVector r9 = r0.r
            int r9 = r9.b
            r7.<init>(r9)
            r9 = r2
        L_0x0109:
            org.objectweb.asm.ByteVector r10 = r0.r
            int r10 = r10.b
            if (r9 >= r10) goto L_0x025b
            byte r10 = r1[r9]
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte[] r17 = org.objectweb.asm.ClassWriter.a
            byte r17 = r17[r10]
            r6 = 0
            switch(r17) {
                case 0: goto L_0x024e;
                case 1: goto L_0x0246;
                case 2: goto L_0x023e;
                case 3: goto L_0x0246;
                case 4: goto L_0x024e;
                case 5: goto L_0x023e;
                case 6: goto L_0x023e;
                case 7: goto L_0x0237;
                case 8: goto L_0x0237;
                case 9: goto L_0x01e1;
                case 10: goto L_0x01cb;
                case 11: goto L_0x0246;
                case 12: goto L_0x023e;
                case 13: goto L_0x023e;
                case 14: goto L_0x017e;
                case 15: goto L_0x013a;
                case 16: goto L_0x011b;
                case 17: goto L_0x0123;
                default: goto L_0x011b;
            }
        L_0x011b:
            r6 = 5
            r7.putByteArray(r1, r9, r12)
            int r9 = r9 + 4
            goto L_0x0254
        L_0x0123:
            int r6 = r9 + 1
            byte r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 != r14) goto L_0x0133
            r6 = 6
            r7.putByteArray(r1, r9, r6)
            int r9 = r9 + 6
            goto L_0x01de
        L_0x0133:
            r7.putByteArray(r1, r9, r12)
            int r9 = r9 + 4
            goto L_0x01de
        L_0x013a:
            int r10 = r9 + 4
            r17 = r9 & 3
            int r10 = r10 - r17
            r14 = 171(0xab, float:2.4E-43)
            r7.putByte(r14)
            int r14 = r7.b
            int r14 = r14 % r12
            int r14 = 4 - r14
            int r14 = r14 % r12
            r7.putByteArray(r6, r2, r14)
            int r6 = a((byte[]) r1, (int) r10)
            int r6 = r6 + r9
            int r10 = r10 + r12
            int r6 = a(r3, r4, r9, r6)
            r7.putInt(r6)
            int r6 = a((byte[]) r1, (int) r10)
            int r10 = r10 + r12
            r7.putInt(r6)
        L_0x0163:
            if (r6 <= 0) goto L_0x01c9
            int r14 = a((byte[]) r1, (int) r10)
            r7.putInt(r14)
            int r10 = r10 + 4
            int r14 = a((byte[]) r1, (int) r10)
            int r14 = r14 + r9
            int r10 = r10 + r12
            int r14 = a(r3, r4, r9, r14)
            r7.putInt(r14)
            int r6 = r6 + -1
            goto L_0x0163
        L_0x017e:
            int r10 = r9 + 4
            r14 = r9 & 3
            int r10 = r10 - r14
            r14 = 170(0xaa, float:2.38E-43)
            r7.putByte(r14)
            int r14 = r7.b
            int r14 = r14 % r12
            int r14 = 4 - r14
            int r14 = r14 % r12
            r7.putByteArray(r6, r2, r14)
            int r6 = a((byte[]) r1, (int) r10)
            int r6 = r6 + r9
            int r10 = r10 + r12
            int r6 = a(r3, r4, r9, r6)
            r7.putInt(r6)
            int r6 = a((byte[]) r1, (int) r10)
            int r10 = r10 + r12
            r7.putInt(r6)
            int r14 = a((byte[]) r1, (int) r10)
            int r14 = r14 - r6
            int r14 = r14 + r11
            int r10 = r10 + r12
            int r6 = r10 + -4
            int r6 = a((byte[]) r1, (int) r6)
            r7.putInt(r6)
        L_0x01b6:
            if (r14 <= 0) goto L_0x01c9
            int r6 = a((byte[]) r1, (int) r10)
            int r6 = r6 + r9
            int r10 = r10 + 4
            int r6 = a(r3, r4, r9, r6)
            r7.putInt(r6)
            int r14 = r14 + -1
            goto L_0x01b6
        L_0x01c9:
            r9 = r10
            goto L_0x01de
        L_0x01cb:
            int r6 = r9 + 1
            int r6 = a((byte[]) r1, (int) r6)
            int r6 = r6 + r9
            int r6 = a(r3, r4, r9, r6)
            r7.putByte(r10)
            r7.putInt(r6)
            int r9 = r9 + 5
        L_0x01de:
            r6 = 5
            goto L_0x0254
        L_0x01e1:
            if (r10 <= r15) goto L_0x01f1
            if (r10 >= r13) goto L_0x01e8
            int r10 = r10 + -49
            goto L_0x01ea
        L_0x01e8:
            int r10 = r10 + -20
        L_0x01ea:
            int r6 = r9 + 1
            int r6 = c(r1, r6)
            goto L_0x01f7
        L_0x01f1:
            int r6 = r9 + 1
            short r6 = b(r1, r6)
        L_0x01f7:
            int r6 = r6 + r9
            int r6 = a(r3, r4, r9, r6)
            boolean r14 = r5[r9]
            if (r14 == 0) goto L_0x022e
            r14 = 200(0xc8, float:2.8E-43)
            r13 = 167(0xa7, float:2.34E-43)
            if (r10 != r13) goto L_0x020c
            r7.putByte(r14)
            r13 = 168(0xa8, float:2.35E-43)
            goto L_0x022a
        L_0x020c:
            r13 = 168(0xa8, float:2.35E-43)
            if (r10 != r13) goto L_0x0214
            r7.putByte(r15)
            goto L_0x022a
        L_0x0214:
            r13 = 166(0xa6, float:2.33E-43)
            if (r10 > r13) goto L_0x021d
            int r10 = r10 + 1
            r10 = r10 ^ r11
            int r10 = r10 - r11
            goto L_0x021f
        L_0x021d:
            r10 = r10 ^ 1
        L_0x021f:
            r7.putByte(r10)
            r7.putShort(r8)
            r7.putByte(r14)
            int r6 = r6 + -3
        L_0x022a:
            r7.putInt(r6)
            goto L_0x0234
        L_0x022e:
            r7.putByte(r10)
            r7.putShort(r6)
        L_0x0234:
            int r9 = r9 + 3
            goto L_0x01de
        L_0x0237:
            r6 = 5
            r7.putByteArray(r1, r9, r6)
            int r9 = r9 + 5
            goto L_0x0254
        L_0x023e:
            r6 = 5
            r10 = 3
            r7.putByteArray(r1, r9, r10)
            int r9 = r9 + 3
            goto L_0x0254
        L_0x0246:
            r6 = 5
            r10 = 2
            r7.putByteArray(r1, r9, r10)
            int r9 = r9 + 2
            goto L_0x0254
        L_0x024e:
            r6 = 5
            r7.putByte(r10)
            int r9 = r9 + 1
        L_0x0254:
            r6 = 3
            r13 = 218(0xda, float:3.05E-43)
            r14 = 132(0x84, float:1.85E-43)
            goto L_0x0109
        L_0x025b:
            int r1 = r0.M
            if (r1 != 0) goto L_0x02a0
            org.objectweb.asm.Label r1 = r0.N
        L_0x0261:
            if (r1 == 0) goto L_0x0279
            int r6 = r1.c
            r8 = 3
            int r6 = r6 - r8
            if (r6 < 0) goto L_0x0273
            boolean r6 = r5[r6]
            if (r6 == 0) goto L_0x0273
            int r6 = r1.a
            r6 = r6 | 16
            r1.a = r6
        L_0x0273:
            a((int[]) r3, (int[]) r4, (org.objectweb.asm.Label) r1)
            org.objectweb.asm.Label r1 = r1.i
            goto L_0x0261
        L_0x0279:
            org.objectweb.asm.ClassWriter r1 = r0.b
            org.objectweb.asm.Item[] r1 = r1.H
            if (r1 == 0) goto L_0x02a8
            r1 = r2
        L_0x0280:
            org.objectweb.asm.ClassWriter r5 = r0.b
            org.objectweb.asm.Item[] r5 = r5.H
            int r5 = r5.length
            if (r1 >= r5) goto L_0x02a8
            org.objectweb.asm.ClassWriter r5 = r0.b
            org.objectweb.asm.Item[] r5 = r5.H
            r5 = r5[r1]
            if (r5 == 0) goto L_0x029d
            int r6 = r5.b
            r8 = 31
            if (r6 != r8) goto L_0x029d
            int r6 = r5.c
            int r6 = a(r3, r4, r2, r6)
            r5.c = r6
        L_0x029d:
            int r1 = r1 + 1
            goto L_0x0280
        L_0x02a0:
            int r1 = r0.u
            if (r1 <= 0) goto L_0x02a8
            org.objectweb.asm.ClassWriter r1 = r0.b
            r1.L = r11
        L_0x02a8:
            org.objectweb.asm.Handler r1 = r0.B
        L_0x02aa:
            if (r1 == 0) goto L_0x02be
            org.objectweb.asm.Label r5 = r1.a
            a((int[]) r3, (int[]) r4, (org.objectweb.asm.Label) r5)
            org.objectweb.asm.Label r5 = r1.b
            a((int[]) r3, (int[]) r4, (org.objectweb.asm.Label) r5)
            org.objectweb.asm.Label r5 = r1.c
            a((int[]) r3, (int[]) r4, (org.objectweb.asm.Label) r5)
            org.objectweb.asm.Handler r1 = r1.f
            goto L_0x02aa
        L_0x02be:
            r1 = r2
            r5 = 2
        L_0x02c0:
            if (r1 >= r5) goto L_0x02f2
            if (r1 != 0) goto L_0x02c7
            org.objectweb.asm.ByteVector r6 = r0.E
            goto L_0x02c9
        L_0x02c7:
            org.objectweb.asm.ByteVector r6 = r0.G
        L_0x02c9:
            if (r6 == 0) goto L_0x02ef
            byte[] r8 = r6.a
            r9 = r2
        L_0x02ce:
            int r10 = r6.b
            if (r9 >= r10) goto L_0x02ef
            int r10 = c(r8, r9)
            int r12 = a(r3, r4, r2, r10)
            a((byte[]) r8, (int) r9, (int) r12)
            int r13 = r9 + 2
            int r14 = c(r8, r13)
            int r10 = r10 + r14
            int r10 = a(r3, r4, r2, r10)
            int r10 = r10 - r12
            a((byte[]) r8, (int) r13, (int) r10)
            int r9 = r9 + 10
            goto L_0x02ce
        L_0x02ef:
            int r1 = r1 + 1
            goto L_0x02c0
        L_0x02f2:
            org.objectweb.asm.ByteVector r1 = r0.I
            if (r1 == 0) goto L_0x030d
            byte[] r1 = r1.a
            r5 = r2
        L_0x02f9:
            org.objectweb.asm.ByteVector r6 = r0.I
            int r6 = r6.b
            if (r5 >= r6) goto L_0x030d
            int r6 = c(r1, r5)
            int r6 = a(r3, r4, r2, r6)
            a((byte[]) r1, (int) r5, (int) r6)
            int r5 = r5 + 4
            goto L_0x02f9
        L_0x030d:
            org.objectweb.asm.Attribute r1 = r0.J
        L_0x030f:
            if (r1 == 0) goto L_0x0326
            org.objectweb.asm.Label[] r2 = r1.getLabels()
            if (r2 == 0) goto L_0x0323
            int r5 = r2.length
            int r5 = r5 - r11
        L_0x0319:
            if (r5 < 0) goto L_0x0323
            r6 = r2[r5]
            a((int[]) r3, (int[]) r4, (org.objectweb.asm.Label) r6)
            int r5 = r5 + -1
            goto L_0x0319
        L_0x0323:
            org.objectweb.asm.Attribute r1 = r1.a
            goto L_0x030f
        L_0x0326:
            r0.r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.MethodWriter.d():void");
    }

    private void e() {
        if (this.M == 0) {
            Label label = new Label();
            label.h = new Frame();
            label.h.b = label;
            label.a(this, this.r.b, this.r.a);
            this.O.i = label;
            this.O = label;
        } else {
            this.P.g = this.R;
        }
        this.P = null;
    }

    private void f() {
        int i2;
        int i3;
        int i4;
        int i5;
        int a = a(0, this.f.length() + 1, 0);
        int i6 = this.c;
        if ((i6 & 8) == 0) {
            if ((i6 & 524288) == 0) {
                int[] iArr = this.z;
                i5 = a + 1;
                ClassWriter classWriter = this.b;
                iArr[a] = classWriter.c(classWriter.I) | 24117248;
            } else {
                i5 = a + 1;
                this.z[a] = 6;
            }
            a = i5;
        }
        int i7 = 1;
        while (true) {
            int i8 = i7 + 1;
            char charAt = this.f.charAt(i7);
            if (charAt == 'F') {
                i3 = i2 + 1;
                this.z[i2] = 2;
            } else if (charAt != 'L') {
                if (!(charAt == 'S' || charAt == 'I')) {
                    if (charAt == 'J') {
                        i3 = i2 + 1;
                        this.z[i2] = 4;
                    } else if (charAt != 'Z') {
                        if (charAt != '[') {
                            switch (charAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    i4 = i2 + 1;
                                    this.z[i2] = 3;
                                    break;
                                default:
                                    this.z[1] = i2 - 3;
                                    b();
                                    return;
                            }
                        } else {
                            while (this.f.charAt(i8) == '[') {
                                i8++;
                            }
                            if (this.f.charAt(i8) == 'L') {
                                do {
                                    i8++;
                                } while (this.f.charAt(i8) != ';');
                            }
                            i4 = i2 + 1;
                            i8++;
                            this.z[i2] = this.b.c(this.f.substring(i7, i8)) | 24117248;
                        }
                        i7 = i8;
                        i2 = i4;
                    }
                }
                i3 = i2 + 1;
                this.z[i2] = 1;
            } else {
                int i9 = i8;
                while (this.f.charAt(i9) != ';') {
                    i9++;
                }
                this.z[i2] = this.b.c(this.f.substring(i8, i9)) | 24117248;
                i2++;
                i7 = i9 + 1;
            }
            i2 = i3;
            i7 = i8;
        }
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        int i2;
        if (this.h != 0) {
            return this.i + 6;
        }
        if (this.r.b <= 0) {
            i2 = 8;
        } else if (this.r.b <= 65536) {
            this.b.newUTF8("Code");
            i2 = this.r.b + 18 + (this.A * 8) + 8;
            if (this.E != null) {
                this.b.newUTF8("LocalVariableTable");
                i2 += this.E.b + 8;
            }
            if (this.G != null) {
                this.b.newUTF8("LocalVariableTypeTable");
                i2 += this.G.b + 8;
            }
            if (this.I != null) {
                this.b.newUTF8("LineNumberTable");
                i2 += this.I.b + 8;
            }
            if (this.v != null) {
                this.b.newUTF8((this.b.b & 65535) >= 50 ? "StackMapTable" : "StackMap");
                i2 += this.v.b + 8;
            }
            if (this.W != null) {
                this.b.newUTF8("RuntimeVisibleTypeAnnotations");
                i2 += this.W.a() + 8;
            }
            if (this.X != null) {
                this.b.newUTF8("RuntimeInvisibleTypeAnnotations");
                i2 += this.X.a() + 8;
            }
            Attribute attribute = this.J;
            if (attribute != null) {
                i2 += attribute.a(this.b, this.r.a, this.r.b, this.s, this.t);
            }
        } else {
            throw new RuntimeException("Method code too large!");
        }
        if (this.j > 0) {
            this.b.newUTF8("Exceptions");
            i2 += (this.j * 2) + 8;
        }
        if ((this.c & 4096) != 0 && ((65535 & this.b.b) < 49 || (this.c & 262144) != 0)) {
            this.b.newUTF8("Synthetic");
            i2 += 6;
        }
        if ((this.c & 131072) != 0) {
            this.b.newUTF8("Deprecated");
            i2 += 6;
        }
        if (this.g != null) {
            this.b.newUTF8("Signature");
            this.b.newUTF8(this.g);
            i2 += 8;
        }
        if (this.$ != null) {
            this.b.newUTF8("MethodParameters");
            i2 += this.$.b + 7;
        }
        if (this.l != null) {
            this.b.newUTF8("AnnotationDefault");
            i2 += this.l.b + 6;
        }
        if (this.m != null) {
            this.b.newUTF8("RuntimeVisibleAnnotations");
            i2 += this.m.a() + 8;
        }
        if (this.n != null) {
            this.b.newUTF8("RuntimeInvisibleAnnotations");
            i2 += this.n.a() + 8;
        }
        if (this.U != null) {
            this.b.newUTF8("RuntimeVisibleTypeAnnotations");
            i2 += this.U.a() + 8;
        }
        if (this.V != null) {
            this.b.newUTF8("RuntimeInvisibleTypeAnnotations");
            i2 += this.V.a() + 8;
        }
        if (this.o != null) {
            this.b.newUTF8("RuntimeVisibleParameterAnnotations");
            AnnotationWriter[] annotationWriterArr = this.o;
            int length = i2 + ((annotationWriterArr.length - this.S) * 2) + 7;
            for (int length2 = annotationWriterArr.length - 1; length2 >= this.S; length2--) {
                AnnotationWriter annotationWriter = this.o[length2];
                length = i2 + (annotationWriter == null ? 0 : annotationWriter.a());
            }
        }
        if (this.p != null) {
            this.b.newUTF8("RuntimeInvisibleParameterAnnotations");
            AnnotationWriter[] annotationWriterArr2 = this.p;
            int length3 = i2 + ((annotationWriterArr2.length - this.S) * 2) + 7;
            for (int length4 = annotationWriterArr2.length - 1; length4 >= this.S; length4--) {
                AnnotationWriter annotationWriter2 = this.p[length4];
                length3 = i2 + (annotationWriter2 == null ? 0 : annotationWriter2.a());
            }
        }
        Attribute attribute2 = this.q;
        return attribute2 != null ? i2 + attribute2.a(this.b, (byte[]) null, 0, -1, -1) : i2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.objectweb.asm.ByteVector r23) {
        /*
            r22 = this;
            r0 = r22
            r8 = r23
            int r1 = r0.c
            r9 = 262144(0x40000, float:3.67342E-40)
            r2 = r1 & r9
            int r2 = r2 / 64
            r3 = 917504(0xe0000, float:1.285697E-39)
            r2 = r2 | r3
            int r2 = ~r2
            r1 = r1 & r2
            org.objectweb.asm.ByteVector r1 = r8.putShort(r1)
            int r2 = r0.d
            org.objectweb.asm.ByteVector r1 = r1.putShort(r2)
            int r2 = r0.e
            r1.putShort(r2)
            int r1 = r0.h
            if (r1 == 0) goto L_0x0032
            org.objectweb.asm.ClassWriter r1 = r0.b
            org.objectweb.asm.ClassReader r1 = r1.M
            byte[] r1 = r1.b
            int r2 = r0.h
            int r3 = r0.i
            r8.putByteArray(r1, r2, r3)
            return
        L_0x0032:
            org.objectweb.asm.ByteVector r1 = r0.r
            int r1 = r1.b
            r10 = 0
            if (r1 <= 0) goto L_0x003b
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = r10
        L_0x003c:
            int r2 = r0.j
            if (r2 <= 0) goto L_0x0042
            int r1 = r1 + 1
        L_0x0042:
            int r2 = r0.c
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            r12 = 49
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r2 == 0) goto L_0x005b
            org.objectweb.asm.ClassWriter r2 = r0.b
            int r2 = r2.b
            r2 = r2 & r13
            if (r2 < r12) goto L_0x0059
            int r2 = r0.c
            r2 = r2 & r9
            if (r2 == 0) goto L_0x005b
        L_0x0059:
            int r1 = r1 + 1
        L_0x005b:
            int r2 = r0.c
            r14 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r14
            if (r2 == 0) goto L_0x0064
            int r1 = r1 + 1
        L_0x0064:
            java.lang.String r2 = r0.g
            if (r2 == 0) goto L_0x006a
            int r1 = r1 + 1
        L_0x006a:
            org.objectweb.asm.ByteVector r2 = r0.$
            if (r2 == 0) goto L_0x0070
            int r1 = r1 + 1
        L_0x0070:
            org.objectweb.asm.ByteVector r2 = r0.l
            if (r2 == 0) goto L_0x0076
            int r1 = r1 + 1
        L_0x0076:
            org.objectweb.asm.AnnotationWriter r2 = r0.m
            if (r2 == 0) goto L_0x007c
            int r1 = r1 + 1
        L_0x007c:
            org.objectweb.asm.AnnotationWriter r2 = r0.n
            if (r2 == 0) goto L_0x0082
            int r1 = r1 + 1
        L_0x0082:
            org.objectweb.asm.AnnotationWriter r2 = r0.U
            if (r2 == 0) goto L_0x0088
            int r1 = r1 + 1
        L_0x0088:
            org.objectweb.asm.AnnotationWriter r2 = r0.V
            if (r2 == 0) goto L_0x008e
            int r1 = r1 + 1
        L_0x008e:
            org.objectweb.asm.AnnotationWriter[] r2 = r0.o
            if (r2 == 0) goto L_0x0094
            int r1 = r1 + 1
        L_0x0094:
            org.objectweb.asm.AnnotationWriter[] r2 = r0.p
            if (r2 == 0) goto L_0x009a
            int r1 = r1 + 1
        L_0x009a:
            org.objectweb.asm.Attribute r2 = r0.q
            if (r2 == 0) goto L_0x00a3
            int r2 = r2.a()
            int r1 = r1 + r2
        L_0x00a3:
            r8.putShort(r1)
            org.objectweb.asm.ByteVector r1 = r0.r
            int r1 = r1.b
            java.lang.String r15 = "RuntimeInvisibleTypeAnnotations"
            java.lang.String r7 = "RuntimeVisibleTypeAnnotations"
            r6 = 2
            if (r1 <= 0) goto L_0x0294
            org.objectweb.asm.ByteVector r1 = r0.r
            int r1 = r1.b
            int r1 = r1 + 12
            int r2 = r0.A
            int r2 = r2 * 8
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r2 = r0.E
            if (r2 == 0) goto L_0x00c5
            int r2 = r2.b
            int r2 = r2 + 8
            int r1 = r1 + r2
        L_0x00c5:
            org.objectweb.asm.ByteVector r2 = r0.G
            if (r2 == 0) goto L_0x00ce
            int r2 = r2.b
            int r2 = r2 + 8
            int r1 = r1 + r2
        L_0x00ce:
            org.objectweb.asm.ByteVector r2 = r0.I
            if (r2 == 0) goto L_0x00d7
            int r2 = r2.b
            int r2 = r2 + 8
            int r1 = r1 + r2
        L_0x00d7:
            org.objectweb.asm.ByteVector r2 = r0.v
            if (r2 == 0) goto L_0x00e0
            int r2 = r2.b
            int r2 = r2 + 8
            int r1 = r1 + r2
        L_0x00e0:
            org.objectweb.asm.AnnotationWriter r2 = r0.W
            if (r2 == 0) goto L_0x00eb
            int r2 = r2.a()
            int r2 = r2 + 8
            int r1 = r1 + r2
        L_0x00eb:
            org.objectweb.asm.AnnotationWriter r2 = r0.X
            if (r2 == 0) goto L_0x00f6
            int r2 = r2.a()
            int r2 = r2 + 8
            int r1 = r1 + r2
        L_0x00f6:
            org.objectweb.asm.Attribute r2 = r0.J
            if (r2 == 0) goto L_0x0119
            org.objectweb.asm.ClassWriter r3 = r0.b
            org.objectweb.asm.ByteVector r4 = r0.r
            byte[] r4 = r4.a
            org.objectweb.asm.ByteVector r5 = r0.r
            int r5 = r5.b
            int r11 = r0.s
            int r14 = r0.t
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r11
            r21 = r14
            int r2 = r16.a(r17, r18, r19, r20, r21)
            int r1 = r1 + r2
        L_0x0119:
            org.objectweb.asm.ClassWriter r2 = r0.b
            java.lang.String r3 = "Code"
            int r2 = r2.newUTF8(r3)
            org.objectweb.asm.ByteVector r2 = r8.putShort(r2)
            r2.putInt(r1)
            int r1 = r0.s
            org.objectweb.asm.ByteVector r1 = r8.putShort(r1)
            int r2 = r0.t
            r1.putShort(r2)
            org.objectweb.asm.ByteVector r1 = r0.r
            int r1 = r1.b
            org.objectweb.asm.ByteVector r1 = r8.putInt(r1)
            org.objectweb.asm.ByteVector r2 = r0.r
            byte[] r2 = r2.a
            org.objectweb.asm.ByteVector r3 = r0.r
            int r3 = r3.b
            r1.putByteArray(r2, r10, r3)
            int r1 = r0.A
            r8.putShort(r1)
            int r1 = r0.A
            if (r1 <= 0) goto L_0x0173
            org.objectweb.asm.Handler r1 = r0.B
        L_0x0151:
            if (r1 == 0) goto L_0x0173
            org.objectweb.asm.Label r2 = r1.a
            int r2 = r2.c
            org.objectweb.asm.ByteVector r2 = r8.putShort(r2)
            org.objectweb.asm.Label r3 = r1.b
            int r3 = r3.c
            org.objectweb.asm.ByteVector r2 = r2.putShort(r3)
            org.objectweb.asm.Label r3 = r1.c
            int r3 = r3.c
            org.objectweb.asm.ByteVector r2 = r2.putShort(r3)
            int r3 = r1.e
            r2.putShort(r3)
            org.objectweb.asm.Handler r1 = r1.f
            goto L_0x0151
        L_0x0173:
            org.objectweb.asm.ByteVector r1 = r0.E
            if (r1 == 0) goto L_0x0179
            r1 = 1
            goto L_0x017a
        L_0x0179:
            r1 = r10
        L_0x017a:
            org.objectweb.asm.ByteVector r2 = r0.G
            if (r2 == 0) goto L_0x0180
            int r1 = r1 + 1
        L_0x0180:
            org.objectweb.asm.ByteVector r2 = r0.I
            if (r2 == 0) goto L_0x0186
            int r1 = r1 + 1
        L_0x0186:
            org.objectweb.asm.ByteVector r2 = r0.v
            if (r2 == 0) goto L_0x018c
            int r1 = r1 + 1
        L_0x018c:
            org.objectweb.asm.AnnotationWriter r2 = r0.W
            if (r2 == 0) goto L_0x0192
            int r1 = r1 + 1
        L_0x0192:
            org.objectweb.asm.AnnotationWriter r2 = r0.X
            if (r2 == 0) goto L_0x0198
            int r1 = r1 + 1
        L_0x0198:
            org.objectweb.asm.Attribute r2 = r0.J
            if (r2 == 0) goto L_0x01a1
            int r2 = r2.a()
            int r1 = r1 + r2
        L_0x01a1:
            r8.putShort(r1)
            org.objectweb.asm.ByteVector r1 = r0.E
            if (r1 == 0) goto L_0x01cc
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "LocalVariableTable"
            int r1 = r1.newUTF8(r2)
            r8.putShort(r1)
            org.objectweb.asm.ByteVector r1 = r0.E
            int r1 = r1.b
            int r1 = r1 + r6
            org.objectweb.asm.ByteVector r1 = r8.putInt(r1)
            int r2 = r0.D
            r1.putShort(r2)
            org.objectweb.asm.ByteVector r1 = r0.E
            byte[] r1 = r1.a
            org.objectweb.asm.ByteVector r2 = r0.E
            int r2 = r2.b
            r8.putByteArray(r1, r10, r2)
        L_0x01cc:
            org.objectweb.asm.ByteVector r1 = r0.G
            if (r1 == 0) goto L_0x01f4
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "LocalVariableTypeTable"
            int r1 = r1.newUTF8(r2)
            r8.putShort(r1)
            org.objectweb.asm.ByteVector r1 = r0.G
            int r1 = r1.b
            int r1 = r1 + r6
            org.objectweb.asm.ByteVector r1 = r8.putInt(r1)
            int r2 = r0.F
            r1.putShort(r2)
            org.objectweb.asm.ByteVector r1 = r0.G
            byte[] r1 = r1.a
            org.objectweb.asm.ByteVector r2 = r0.G
            int r2 = r2.b
            r8.putByteArray(r1, r10, r2)
        L_0x01f4:
            org.objectweb.asm.ByteVector r1 = r0.I
            if (r1 == 0) goto L_0x021c
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "LineNumberTable"
            int r1 = r1.newUTF8(r2)
            r8.putShort(r1)
            org.objectweb.asm.ByteVector r1 = r0.I
            int r1 = r1.b
            int r1 = r1 + r6
            org.objectweb.asm.ByteVector r1 = r8.putInt(r1)
            int r2 = r0.H
            r1.putShort(r2)
            org.objectweb.asm.ByteVector r1 = r0.I
            byte[] r1 = r1.a
            org.objectweb.asm.ByteVector r2 = r0.I
            int r2 = r2.b
            r8.putByteArray(r1, r10, r2)
        L_0x021c:
            org.objectweb.asm.ByteVector r1 = r0.v
            if (r1 == 0) goto L_0x0255
            org.objectweb.asm.ClassWriter r1 = r0.b
            int r1 = r1.b
            r1 = r1 & r13
            r2 = 50
            if (r1 < r2) goto L_0x022b
            r1 = 1
            goto L_0x022c
        L_0x022b:
            r1 = r10
        L_0x022c:
            org.objectweb.asm.ClassWriter r2 = r0.b
            if (r1 == 0) goto L_0x0233
            java.lang.String r1 = "StackMapTable"
            goto L_0x0235
        L_0x0233:
            java.lang.String r1 = "StackMap"
        L_0x0235:
            int r1 = r2.newUTF8(r1)
            r8.putShort(r1)
            org.objectweb.asm.ByteVector r1 = r0.v
            int r1 = r1.b
            int r1 = r1 + r6
            org.objectweb.asm.ByteVector r1 = r8.putInt(r1)
            int r2 = r0.u
            r1.putShort(r2)
            org.objectweb.asm.ByteVector r1 = r0.v
            byte[] r1 = r1.a
            org.objectweb.asm.ByteVector r2 = r0.v
            int r2 = r2.b
            r8.putByteArray(r1, r10, r2)
        L_0x0255:
            org.objectweb.asm.AnnotationWriter r1 = r0.W
            if (r1 == 0) goto L_0x0267
            org.objectweb.asm.ClassWriter r1 = r0.b
            int r1 = r1.newUTF8(r7)
            r8.putShort(r1)
            org.objectweb.asm.AnnotationWriter r1 = r0.W
            r1.a(r8)
        L_0x0267:
            org.objectweb.asm.AnnotationWriter r1 = r0.X
            if (r1 == 0) goto L_0x0279
            org.objectweb.asm.ClassWriter r1 = r0.b
            int r1 = r1.newUTF8(r15)
            r8.putShort(r1)
            org.objectweb.asm.AnnotationWriter r1 = r0.X
            r1.a(r8)
        L_0x0279:
            org.objectweb.asm.Attribute r1 = r0.J
            if (r1 == 0) goto L_0x0294
            org.objectweb.asm.ClassWriter r2 = r0.b
            org.objectweb.asm.ByteVector r3 = r0.r
            byte[] r3 = r3.a
            org.objectweb.asm.ByteVector r4 = r0.r
            int r4 = r4.b
            int r5 = r0.t
            int r11 = r0.s
            r14 = r6
            r6 = r11
            r11 = r7
            r7 = r23
            r1.a(r2, r3, r4, r5, r6, r7)
            goto L_0x0296
        L_0x0294:
            r14 = r6
            r11 = r7
        L_0x0296:
            int r1 = r0.j
            if (r1 <= 0) goto L_0x02c1
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "Exceptions"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r1 = r8.putShort(r1)
            int r2 = r0.j
            int r2 = r2 * r14
            int r2 = r2 + r14
            r1.putInt(r2)
            int r1 = r0.j
            r8.putShort(r1)
            r1 = r10
        L_0x02b3:
            int r2 = r0.j
            if (r1 >= r2) goto L_0x02c1
            int[] r2 = r0.k
            r2 = r2[r1]
            r8.putShort(r2)
            int r1 = r1 + 1
            goto L_0x02b3
        L_0x02c1:
            int r1 = r0.c
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x02e2
            org.objectweb.asm.ClassWriter r1 = r0.b
            int r1 = r1.b
            r1 = r1 & r13
            if (r1 < r12) goto L_0x02d3
            int r1 = r0.c
            r1 = r1 & r9
            if (r1 == 0) goto L_0x02e2
        L_0x02d3:
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "Synthetic"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r1 = r8.putShort(r1)
            r1.putInt(r10)
        L_0x02e2:
            int r1 = r0.c
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x02f8
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "Deprecated"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r1 = r8.putShort(r1)
            r1.putInt(r10)
        L_0x02f8:
            java.lang.String r1 = r0.g
            if (r1 == 0) goto L_0x0317
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "Signature"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r1 = r8.putShort(r1)
            org.objectweb.asm.ByteVector r1 = r1.putInt(r14)
            org.objectweb.asm.ClassWriter r2 = r0.b
            java.lang.String r3 = r0.g
            int r2 = r2.newUTF8(r3)
            r1.putShort(r2)
        L_0x0317:
            org.objectweb.asm.ByteVector r1 = r0.$
            if (r1 == 0) goto L_0x0340
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "MethodParameters"
            int r1 = r1.newUTF8(r2)
            r8.putShort(r1)
            org.objectweb.asm.ByteVector r1 = r0.$
            int r1 = r1.b
            r2 = 1
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r1 = r8.putInt(r1)
            int r2 = r0.Z
            r1.putByte(r2)
            org.objectweb.asm.ByteVector r1 = r0.$
            byte[] r1 = r1.a
            org.objectweb.asm.ByteVector r2 = r0.$
            int r2 = r2.b
            r8.putByteArray(r1, r10, r2)
        L_0x0340:
            org.objectweb.asm.ByteVector r1 = r0.l
            if (r1 == 0) goto L_0x0361
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "AnnotationDefault"
            int r1 = r1.newUTF8(r2)
            r8.putShort(r1)
            org.objectweb.asm.ByteVector r1 = r0.l
            int r1 = r1.b
            r8.putInt(r1)
            org.objectweb.asm.ByteVector r1 = r0.l
            byte[] r1 = r1.a
            org.objectweb.asm.ByteVector r2 = r0.l
            int r2 = r2.b
            r8.putByteArray(r1, r10, r2)
        L_0x0361:
            org.objectweb.asm.AnnotationWriter r1 = r0.m
            if (r1 == 0) goto L_0x0375
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            int r1 = r1.newUTF8(r2)
            r8.putShort(r1)
            org.objectweb.asm.AnnotationWriter r1 = r0.m
            r1.a(r8)
        L_0x0375:
            org.objectweb.asm.AnnotationWriter r1 = r0.n
            if (r1 == 0) goto L_0x0389
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            int r1 = r1.newUTF8(r2)
            r8.putShort(r1)
            org.objectweb.asm.AnnotationWriter r1 = r0.n
            r1.a(r8)
        L_0x0389:
            org.objectweb.asm.AnnotationWriter r1 = r0.U
            if (r1 == 0) goto L_0x039b
            org.objectweb.asm.ClassWriter r1 = r0.b
            int r1 = r1.newUTF8(r11)
            r8.putShort(r1)
            org.objectweb.asm.AnnotationWriter r1 = r0.U
            r1.a(r8)
        L_0x039b:
            org.objectweb.asm.AnnotationWriter r1 = r0.V
            if (r1 == 0) goto L_0x03ad
            org.objectweb.asm.ClassWriter r1 = r0.b
            int r1 = r1.newUTF8(r15)
            r8.putShort(r1)
            org.objectweb.asm.AnnotationWriter r1 = r0.V
            r1.a(r8)
        L_0x03ad:
            org.objectweb.asm.AnnotationWriter[] r1 = r0.o
            if (r1 == 0) goto L_0x03c3
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "RuntimeVisibleParameterAnnotations"
            int r1 = r1.newUTF8(r2)
            r8.putShort(r1)
            org.objectweb.asm.AnnotationWriter[] r1 = r0.o
            int r2 = r0.S
            org.objectweb.asm.AnnotationWriter.a((org.objectweb.asm.AnnotationWriter[]) r1, (int) r2, (org.objectweb.asm.ByteVector) r8)
        L_0x03c3:
            org.objectweb.asm.AnnotationWriter[] r1 = r0.p
            if (r1 == 0) goto L_0x03d9
            org.objectweb.asm.ClassWriter r1 = r0.b
            java.lang.String r2 = "RuntimeInvisibleParameterAnnotations"
            int r1 = r1.newUTF8(r2)
            r8.putShort(r1)
            org.objectweb.asm.AnnotationWriter[] r1 = r0.p
            int r2 = r0.S
            org.objectweb.asm.AnnotationWriter.a((org.objectweb.asm.AnnotationWriter[]) r1, (int) r2, (org.objectweb.asm.ByteVector) r8)
        L_0x03d9:
            org.objectweb.asm.Attribute r1 = r0.q
            if (r1 == 0) goto L_0x03e8
            org.objectweb.asm.ClassWriter r2 = r0.b
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = r23
            r1.a(r2, r3, r4, r5, r6, r7)
        L_0x03e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.MethodWriter.a(org.objectweb.asm.ByteVector):void");
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z2) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, 2);
        if (z2) {
            annotationWriter.g = this.m;
            this.m = annotationWriter;
        } else {
            annotationWriter.g = this.n;
            this.n = annotationWriter;
        }
        return annotationWriter;
    }

    public AnnotationVisitor visitAnnotationDefault() {
        this.l = new ByteVector();
        return new AnnotationWriter(this.b, false, this.l, (ByteVector) null, 0);
    }

    public void visitAttribute(Attribute attribute) {
        if (attribute.isCodeAttribute()) {
            attribute.a = this.J;
            this.J = attribute;
            return;
        }
        attribute.a = this.q;
        this.q = attribute;
    }

    public void visitCode() {
    }

    public void visitEnd() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r0 = r0 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r0 <= r4.R) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        r4.R = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        r4.Q = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void visitFieldInsn(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            org.objectweb.asm.ByteVector r0 = r4.r
            int r0 = r0.b
            r4.Y = r0
            org.objectweb.asm.ClassWriter r0 = r4.b
            org.objectweb.asm.Item r6 = r0.a((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8)
            org.objectweb.asm.Label r7 = r4.P
            if (r7 == 0) goto L_0x0057
            int r0 = r4.M
            r1 = 0
            if (r0 != 0) goto L_0x001d
            org.objectweb.asm.Frame r7 = r7.h
            org.objectweb.asm.ClassWriter r8 = r4.b
            r7.a((int) r5, (int) r1, (org.objectweb.asm.ClassWriter) r8, (org.objectweb.asm.Item) r6)
            goto L_0x0057
        L_0x001d:
            char r7 = r8.charAt(r1)
            r8 = 1
            r0 = -2
            r2 = 74
            r3 = 68
            switch(r5) {
                case 178: goto L_0x0044;
                case 179: goto L_0x003a;
                case 180: goto L_0x0031;
                default: goto L_0x002a;
            }
        L_0x002a:
            int r8 = r4.Q
            if (r7 == r3) goto L_0x004d
            if (r7 != r2) goto L_0x0042
            goto L_0x004d
        L_0x0031:
            int r0 = r4.Q
            if (r7 == r3) goto L_0x0037
            if (r7 != r2) goto L_0x0038
        L_0x0037:
            r1 = r8
        L_0x0038:
            int r0 = r0 + r1
            goto L_0x004f
        L_0x003a:
            int r8 = r4.Q
            if (r7 == r3) goto L_0x0042
            if (r7 != r2) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = -1
        L_0x0042:
            int r0 = r0 + r8
            goto L_0x004f
        L_0x0044:
            int r0 = r4.Q
            if (r7 == r3) goto L_0x004a
            if (r7 != r2) goto L_0x004b
        L_0x004a:
            r8 = 2
        L_0x004b:
            int r0 = r0 + r8
            goto L_0x004f
        L_0x004d:
            r0 = -3
            goto L_0x0042
        L_0x004f:
            int r7 = r4.R
            if (r0 <= r7) goto L_0x0055
            r4.R = r0
        L_0x0055:
            r4.Q = r0
        L_0x0057:
            org.objectweb.asm.ByteVector r7 = r4.r
            int r6 = r6.a
            r7.b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.MethodWriter.visitFieldInsn(int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void visitFrame(int i2, int i3, Object[] objArr, int i4, Object[] objArr2) {
        int i5;
        ByteVector byteVector;
        int i6;
        int i7;
        if (this.M != 0) {
            int i8 = 0;
            if (i2 == -1) {
                if (this.x == null) {
                    f();
                }
                this.T = i3;
                int a = a(this.r.b, i3, i4);
                for (int i9 = 0; i9 < i3; i9++) {
                    String str = objArr[i9];
                    if (str instanceof String) {
                        i7 = a + 1;
                        this.z[a] = 24117248 | this.b.c(str);
                    } else if (str instanceof Integer) {
                        i7 = a + 1;
                        this.z[a] = ((Integer) str).intValue();
                    } else {
                        this.z[a] = this.b.a("", ((Label) str).c) | 25165824;
                        a++;
                    }
                    a = i7;
                }
                while (i8 < i4) {
                    String str2 = objArr2[i8];
                    if (str2 instanceof String) {
                        i6 = a + 1;
                        this.z[a] = this.b.c(str2) | 24117248;
                    } else if (str2 instanceof Integer) {
                        i6 = a + 1;
                        this.z[a] = ((Integer) str2).intValue();
                    } else {
                        i6 = a + 1;
                        this.z[a] = this.b.a("", ((Label) str2).c) | 25165824;
                    }
                    a = i6;
                    i8++;
                }
                b();
            } else {
                if (this.v == null) {
                    this.v = new ByteVector();
                    i5 = this.r.b;
                } else {
                    i5 = (this.r.b - this.w) - 1;
                    if (i5 < 0) {
                        if (i2 != 3) {
                            throw new IllegalStateException();
                        }
                        return;
                    }
                }
                if (i2 == 0) {
                    this.T = i3;
                    this.v.putByte(255).putShort(i5).putShort(i3);
                    for (int i10 = 0; i10 < i3; i10++) {
                        a(objArr[i10]);
                    }
                    this.v.putShort(i4);
                    while (i8 < i4) {
                        a(objArr2[i8]);
                        i8++;
                    }
                } else if (i2 != 1) {
                    int i11 = 251;
                    if (i2 == 2) {
                        this.T -= i3;
                        byteVector = this.v;
                        i11 = 251 - i3;
                    } else if (i2 == 3) {
                        byteVector = this.v;
                        if (i5 < 64) {
                            byteVector.putByte(i5);
                        }
                    } else if (i2 == 4) {
                        ByteVector byteVector2 = this.v;
                        if (i5 < 64) {
                            byteVector2.putByte(i5 + 64);
                        } else {
                            byteVector2.putByte(247).putShort(i5);
                        }
                        a(objArr2[0]);
                    }
                    byteVector.putByte(i11).putShort(i5);
                } else {
                    this.T += i3;
                    this.v.putByte(i3 + 251).putShort(i5);
                    while (i8 < i3) {
                        a(objArr[i8]);
                        i8++;
                    }
                }
                this.w = this.r.b;
                this.u++;
            }
            this.s = Math.max(this.s, i4);
            this.t = Math.max(this.t, this.T);
        }
    }

    public void visitIincInsn(int i2, int i3) {
        int i4;
        this.Y = this.r.b;
        Label label = this.P;
        if (label != null && this.M == 0) {
            label.h.a((int) Opcodes.IINC, i2, (ClassWriter) null, (Item) null);
        }
        if (this.M != 2 && (i4 = i2 + 1) > this.t) {
            this.t = i4;
        }
        if (i2 > 255 || i3 > 127 || i3 < -128) {
            this.r.putByte(196).b(Opcodes.IINC, i2).putShort(i3);
        } else {
            this.r.putByte(Opcodes.IINC).a(i2, i3);
        }
    }

    public void visitInsn(int i2) {
        this.Y = this.r.b;
        this.r.putByte(i2);
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(i2, 0, (ClassWriter) null, (Item) null);
            } else {
                int i3 = this.Q + Frame.a[i2];
                if (i3 > this.R) {
                    this.R = i3;
                }
                this.Q = i3;
            }
            if ((i2 >= 172 && i2 <= 177) || i2 == 191) {
                e();
            }
        }
    }

    public AnnotationVisitor visitInsnAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.a((i2 & -16776961) | (this.Y << 8), typePath, byteVector);
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, byteVector.b - 2);
        if (z2) {
            annotationWriter.g = this.W;
            this.W = annotationWriter;
        } else {
            annotationWriter.g = this.X;
            this.X = annotationWriter;
        }
        return annotationWriter;
    }

    public void visitIntInsn(int i2, int i3) {
        this.Y = this.r.b;
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(i2, i3, (ClassWriter) null, (Item) null);
            } else if (i2 != 188) {
                int i4 = this.Q + 1;
                if (i4 > this.R) {
                    this.R = i4;
                }
                this.Q = i4;
            }
        }
        if (i2 == 17) {
            this.r.b(i2, i3);
        } else {
            this.r.a(i2, i3);
        }
    }

    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.Y = this.r.b;
        Item a = this.b.a(str, str2, handle, objArr);
        int i2 = a.c;
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a((int) Opcodes.INVOKEDYNAMIC, 0, this.b, a);
            } else {
                if (i2 == 0) {
                    i2 = Type.getArgumentsAndReturnSizes(str2);
                    a.c = i2;
                }
                int i3 = (this.Q - (i2 >> 2)) + (i2 & 3) + 1;
                if (i3 > this.R) {
                    this.R = i3;
                }
                this.Q = i3;
            }
        }
        this.r.b(Opcodes.INVOKEDYNAMIC, a.a);
        this.r.putShort(0);
    }

    public void visitJumpInsn(int i2, Label label) {
        this.Y = this.r.b;
        Label label2 = this.P;
        Label label3 = null;
        if (label2 != null) {
            if (this.M == 0) {
                label2.h.a(i2, 0, (ClassWriter) null, (Item) null);
                label.a().a |= 16;
                a(0, label);
                if (i2 != 167) {
                    label3 = new Label();
                }
            } else if (i2 == 168) {
                if ((label.a & 512) == 0) {
                    label.a |= 512;
                    this.L++;
                }
                this.P.a |= 128;
                a(this.Q + 1, label);
                label3 = new Label();
            } else {
                int i3 = this.Q + Frame.a[i2];
                this.Q = i3;
                a(i3, label);
            }
        }
        if ((label.a & 2) == 0 || label.c - this.r.b >= -32768) {
            this.r.putByte(i2);
            ByteVector byteVector = this.r;
            label.a(this, byteVector, byteVector.b - 1, false);
        } else {
            if (i2 != 167) {
                if (i2 == 168) {
                    this.r.putByte(HttpStatus.SC_CREATED);
                    ByteVector byteVector2 = this.r;
                    label.a(this, byteVector2, byteVector2.b - 1, true);
                } else {
                    if (label3 != null) {
                        label3.a |= 16;
                    }
                    this.r.putByte(i2 <= 166 ? ((i2 + 1) ^ 1) - 1 : i2 ^ 1);
                    this.r.putShort(8);
                }
            }
            this.r.putByte(200);
            ByteVector byteVector22 = this.r;
            label.a(this, byteVector22, byteVector22.b - 1, true);
        }
        if (this.P != null) {
            if (label3 != null) {
                visitLabel(label3);
            }
            if (i2 == 167) {
                e();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r0 != null) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void visitLabel(org.objectweb.asm.Label r4) {
        /*
            r3 = this;
            boolean r0 = r3.K
            org.objectweb.asm.ByteVector r1 = r3.r
            int r1 = r1.b
            org.objectweb.asm.ByteVector r2 = r3.r
            byte[] r2 = r2.a
            boolean r1 = r4.a(r3, r1, r2)
            r0 = r0 | r1
            r3.K = r0
            int r0 = r4.a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0018
            return
        L_0x0018:
            int r0 = r3.M
            r2 = 0
            if (r0 != 0) goto L_0x0074
            org.objectweb.asm.Label r0 = r3.P
            if (r0 == 0) goto L_0x003e
            int r0 = r4.c
            org.objectweb.asm.Label r1 = r3.P
            int r1 = r1.c
            if (r0 != r1) goto L_0x003b
            org.objectweb.asm.Label r0 = r3.P
            int r1 = r0.a
            int r2 = r4.a
            r2 = r2 & 16
            r1 = r1 | r2
            r0.a = r1
            org.objectweb.asm.Label r0 = r3.P
            org.objectweb.asm.Frame r0 = r0.h
            r4.h = r0
            return
        L_0x003b:
            r3.a((int) r2, (org.objectweb.asm.Label) r4)
        L_0x003e:
            r3.P = r4
            org.objectweb.asm.Frame r0 = r4.h
            if (r0 != 0) goto L_0x004f
            org.objectweb.asm.Frame r0 = new org.objectweb.asm.Frame
            r0.<init>()
            r4.h = r0
            org.objectweb.asm.Frame r0 = r4.h
            r0.b = r4
        L_0x004f:
            org.objectweb.asm.Label r0 = r3.O
            if (r0 == 0) goto L_0x008f
            int r0 = r4.c
            org.objectweb.asm.Label r1 = r3.O
            int r1 = r1.c
            if (r0 != r1) goto L_0x0071
            org.objectweb.asm.Label r0 = r3.O
            int r1 = r0.a
            int r2 = r4.a
            r2 = r2 & 16
            r1 = r1 | r2
            r0.a = r1
            org.objectweb.asm.Label r0 = r3.O
            org.objectweb.asm.Frame r0 = r0.h
            r4.h = r0
            org.objectweb.asm.Label r4 = r3.O
            r3.P = r4
            return
        L_0x0071:
            org.objectweb.asm.Label r0 = r3.O
            goto L_0x008d
        L_0x0074:
            if (r0 != r1) goto L_0x0091
            org.objectweb.asm.Label r0 = r3.P
            if (r0 == 0) goto L_0x0083
            int r1 = r3.R
            r0.g = r1
            int r0 = r3.Q
            r3.a((int) r0, (org.objectweb.asm.Label) r4)
        L_0x0083:
            r3.P = r4
            r3.Q = r2
            r3.R = r2
            org.objectweb.asm.Label r0 = r3.O
            if (r0 == 0) goto L_0x008f
        L_0x008d:
            r0.i = r4
        L_0x008f:
            r3.O = r4
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.MethodWriter.visitLabel(org.objectweb.asm.Label):void");
    }

    public void visitLdcInsn(Object obj) {
        ByteVector byteVector;
        int i2;
        this.Y = this.r.b;
        Item a = this.b.a(obj);
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(18, 0, this.b, a);
            } else {
                int i3 = (a.b == 5 || a.b == 6) ? this.Q + 2 : this.Q + 1;
                if (i3 > this.R) {
                    this.R = i3;
                }
                this.Q = i3;
            }
        }
        int i4 = a.a;
        if (a.b == 5 || a.b == 6) {
            byteVector = this.r;
            i2 = 20;
        } else if (i4 >= 256) {
            byteVector = this.r;
            i2 = 19;
        } else {
            this.r.a(18, i4);
            return;
        }
        byteVector.b(i2, i4);
    }

    public void visitLineNumber(int i2, Label label) {
        if (this.I == null) {
            this.I = new ByteVector();
        }
        this.H++;
        this.I.putShort(label.c);
        this.I.putShort(i2);
    }

    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i2) {
        int i3 = 1;
        if (str3 != null) {
            if (this.G == null) {
                this.G = new ByteVector();
            }
            this.F++;
            this.G.putShort(label.c).putShort(label2.c - label.c).putShort(this.b.newUTF8(str)).putShort(this.b.newUTF8(str3)).putShort(i2);
        }
        if (this.E == null) {
            this.E = new ByteVector();
        }
        this.D++;
        this.E.putShort(label.c).putShort(label2.c - label.c).putShort(this.b.newUTF8(str)).putShort(this.b.newUTF8(str2)).putShort(i2);
        if (this.M != 2) {
            char charAt = str2.charAt(0);
            if (charAt == 'J' || charAt == 'D') {
                i3 = 2;
            }
            int i4 = i2 + i3;
            if (i4 > this.t) {
                this.t = i4;
            }
        }
    }

    public AnnotationVisitor visitLocalVariableAnnotation(int i2, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z2) {
        ByteVector byteVector = new ByteVector();
        byteVector.putByte(i2 >>> 24).putShort(labelArr.length);
        for (int i3 = 0; i3 < labelArr.length; i3++) {
            byteVector.putShort(labelArr[i3].c).putShort(labelArr2[i3].c - labelArr[i3].c).putShort(iArr[i3]);
        }
        if (typePath == null) {
            byteVector.putByte(0);
        } else {
            byteVector.putByteArray(typePath.a, typePath.b, (typePath.a[typePath.b] * 2) + 1);
        }
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, byteVector.b - 2);
        if (z2) {
            annotationWriter.g = this.W;
            this.W = annotationWriter;
        } else {
            annotationWriter.g = this.X;
            this.X = annotationWriter;
        }
        return annotationWriter;
    }

    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.Y = this.r.b;
        int i2 = this.r.b;
        this.r.putByte(Opcodes.LOOKUPSWITCH);
        ByteVector byteVector = this.r;
        byteVector.putByteArray((byte[]) null, 0, (4 - (byteVector.b % 4)) % 4);
        label.a(this, this.r, i2, true);
        this.r.putInt(labelArr.length);
        for (int i3 = 0; i3 < labelArr.length; i3++) {
            this.r.putInt(iArr[i3]);
            labelArr[i3].a(this, this.r, i2, true);
        }
        a(label, labelArr);
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void visitMaxs(int r14, int r15) {
        /*
            r13 = this;
            boolean r0 = r13.K
            if (r0 == 0) goto L_0x0007
            r13.d()
        L_0x0007:
            int r0 = r13.M
            r1 = 0
            r2 = 32
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x011d
            org.objectweb.asm.Handler r14 = r13.B
        L_0x0012:
            r15 = 24117248(0x1700000, float:4.4081038E-38)
            java.lang.String r0 = "java/lang/Throwable"
            if (r14 == 0) goto L_0x0055
            org.objectweb.asm.Label r5 = r14.a
            org.objectweb.asm.Label r5 = r5.a()
            org.objectweb.asm.Label r6 = r14.c
            org.objectweb.asm.Label r6 = r6.a()
            org.objectweb.asm.Label r7 = r14.b
            org.objectweb.asm.Label r7 = r7.a()
            java.lang.String r8 = r14.d
            if (r8 != 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            java.lang.String r0 = r14.d
        L_0x0031:
            org.objectweb.asm.ClassWriter r8 = r13.b
            int r0 = r8.c((java.lang.String) r0)
            r15 = r15 | r0
            int r0 = r6.a
            r0 = r0 | 16
            r6.a = r0
        L_0x003e:
            if (r5 == r7) goto L_0x0052
            org.objectweb.asm.Edge r0 = new org.objectweb.asm.Edge
            r0.<init>()
            r0.a = r15
            r0.b = r6
            org.objectweb.asm.Edge r8 = r5.j
            r0.c = r8
            r5.j = r0
            org.objectweb.asm.Label r5 = r5.i
            goto L_0x003e
        L_0x0052:
            org.objectweb.asm.Handler r14 = r14.f
            goto L_0x0012
        L_0x0055:
            org.objectweb.asm.Label r14 = r13.N
            org.objectweb.asm.Frame r14 = r14.h
            java.lang.String r5 = r13.f
            org.objectweb.asm.Type[] r5 = org.objectweb.asm.Type.getArgumentTypes((java.lang.String) r5)
            org.objectweb.asm.ClassWriter r6 = r13.b
            int r7 = r13.c
            int r8 = r13.t
            r14.a((org.objectweb.asm.ClassWriter) r6, (int) r7, (org.objectweb.asm.Type[]) r5, (int) r8)
            r13.b(r14)
            org.objectweb.asm.Label r14 = r13.N
            r5 = r3
        L_0x006e:
            if (r14 == 0) goto L_0x00b2
            org.objectweb.asm.Label r6 = r14.k
            r14.k = r1
            org.objectweb.asm.Frame r7 = r14.h
            int r8 = r14.a
            r8 = r8 & 16
            if (r8 == 0) goto L_0x0081
            int r8 = r14.a
            r8 = r8 | r2
            r14.a = r8
        L_0x0081:
            int r8 = r14.a
            r8 = r8 | 64
            r14.a = r8
            int[] r8 = r7.d
            int r8 = r8.length
            int r9 = r14.g
            int r8 = r8 + r9
            if (r8 <= r5) goto L_0x0090
            r5 = r8
        L_0x0090:
            org.objectweb.asm.Edge r14 = r14.j
        L_0x0092:
            if (r14 == 0) goto L_0x00b0
            org.objectweb.asm.Label r8 = r14.b
            org.objectweb.asm.Label r8 = r8.a()
            org.objectweb.asm.ClassWriter r9 = r13.b
            org.objectweb.asm.Frame r10 = r8.h
            int r11 = r14.a
            boolean r9 = r7.a(r9, r10, r11)
            if (r9 == 0) goto L_0x00ad
            org.objectweb.asm.Label r9 = r8.k
            if (r9 != 0) goto L_0x00ad
            r8.k = r6
            r6 = r8
        L_0x00ad:
            org.objectweb.asm.Edge r14 = r14.c
            goto L_0x0092
        L_0x00b0:
            r14 = r6
            goto L_0x006e
        L_0x00b2:
            org.objectweb.asm.Label r14 = r13.N
        L_0x00b4:
            if (r14 == 0) goto L_0x010b
            org.objectweb.asm.Frame r1 = r14.h
            int r6 = r14.a
            r6 = r6 & r2
            if (r6 == 0) goto L_0x00c0
            r13.b(r1)
        L_0x00c0:
            int r1 = r14.a
            r1 = r1 & 64
            if (r1 != 0) goto L_0x0108
            org.objectweb.asm.Label r1 = r14.i
            int r6 = r14.c
            if (r1 != 0) goto L_0x00d1
            org.objectweb.asm.ByteVector r7 = r13.r
            int r7 = r7.b
            goto L_0x00d3
        L_0x00d1:
            int r7 = r1.c
        L_0x00d3:
            int r7 = r7 - r4
            if (r7 < r6) goto L_0x0108
            int r5 = java.lang.Math.max(r5, r4)
            r8 = r6
        L_0x00db:
            if (r8 >= r7) goto L_0x00e6
            org.objectweb.asm.ByteVector r9 = r13.r
            byte[] r9 = r9.a
            r9[r8] = r3
            int r8 = r8 + 1
            goto L_0x00db
        L_0x00e6:
            org.objectweb.asm.ByteVector r8 = r13.r
            byte[] r8 = r8.a
            r9 = -65
            r8[r7] = r9
            int r6 = r13.a((int) r6, (int) r3, (int) r4)
            int[] r7 = r13.z
            org.objectweb.asm.ClassWriter r8 = r13.b
            int r8 = r8.c((java.lang.String) r0)
            r8 = r8 | r15
            r7[r6] = r8
            r13.b()
            org.objectweb.asm.Handler r6 = r13.B
            org.objectweb.asm.Handler r1 = org.objectweb.asm.Handler.a(r6, r14, r1)
            r13.B = r1
        L_0x0108:
            org.objectweb.asm.Label r14 = r14.i
            goto L_0x00b4
        L_0x010b:
            org.objectweb.asm.Handler r14 = r13.B
            r13.A = r3
        L_0x010f:
            if (r14 == 0) goto L_0x0119
            int r15 = r13.A
            int r15 = r15 + r4
            r13.A = r15
            org.objectweb.asm.Handler r14 = r14.f
            goto L_0x010f
        L_0x0119:
            r13.s = r5
            goto L_0x01fa
        L_0x011d:
            if (r0 != r4) goto L_0x01f6
            org.objectweb.asm.Handler r15 = r13.B
        L_0x0121:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r15 == 0) goto L_0x0158
            org.objectweb.asm.Label r5 = r15.a
            org.objectweb.asm.Label r6 = r15.c
            org.objectweb.asm.Label r7 = r15.b
        L_0x012c:
            if (r5 == r7) goto L_0x0155
            org.objectweb.asm.Edge r8 = new org.objectweb.asm.Edge
            r8.<init>()
            r8.a = r0
            r8.b = r6
            int r9 = r5.a
            r9 = r9 & 128(0x80, float:1.794E-43)
            if (r9 != 0) goto L_0x0144
            org.objectweb.asm.Edge r9 = r5.j
            r8.c = r9
            r5.j = r8
            goto L_0x0152
        L_0x0144:
            org.objectweb.asm.Edge r9 = r5.j
            org.objectweb.asm.Edge r9 = r9.c
            org.objectweb.asm.Edge r9 = r9.c
            r8.c = r9
            org.objectweb.asm.Edge r9 = r5.j
            org.objectweb.asm.Edge r9 = r9.c
            r9.c = r8
        L_0x0152:
            org.objectweb.asm.Label r5 = r5.i
            goto L_0x012c
        L_0x0155:
            org.objectweb.asm.Handler r15 = r15.f
            goto L_0x0121
        L_0x0158:
            int r15 = r13.L
            if (r15 <= 0) goto L_0x01b5
            org.objectweb.asm.Label r5 = r13.N
            r6 = 1
            r5.b(r1, r6, r15)
            org.objectweb.asm.Label r15 = r13.N
            r5 = r3
        L_0x0166:
            if (r15 == 0) goto L_0x018e
            int r8 = r15.a
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x018b
            org.objectweb.asm.Edge r8 = r15.j
            org.objectweb.asm.Edge r8 = r8.c
            org.objectweb.asm.Label r8 = r8.b
            int r9 = r8.a
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 != 0) goto L_0x018b
            int r5 = r5 + 1
            long r9 = (long) r5
            r11 = 32
            long r9 = r9 / r11
            long r9 = r9 << r2
            int r11 = r5 % 32
            long r11 = r6 << r11
            long r9 = r9 | r11
            int r11 = r13.L
            r8.b(r1, r9, r11)
        L_0x018b:
            org.objectweb.asm.Label r15 = r15.i
            goto L_0x0166
        L_0x018e:
            org.objectweb.asm.Label r15 = r13.N
        L_0x0190:
            if (r15 == 0) goto L_0x01b5
            int r1 = r15.a
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x01b2
            org.objectweb.asm.Label r1 = r13.N
        L_0x019a:
            if (r1 == 0) goto L_0x01a5
            int r2 = r1.a
            r2 = r2 & -2049(0xfffffffffffff7ff, float:NaN)
            r1.a = r2
            org.objectweb.asm.Label r1 = r1.i
            goto L_0x019a
        L_0x01a5:
            org.objectweb.asm.Edge r1 = r15.j
            org.objectweb.asm.Edge r1 = r1.c
            org.objectweb.asm.Label r1 = r1.b
            r5 = 0
            int r2 = r13.L
            r1.b(r15, r5, r2)
        L_0x01b2:
            org.objectweb.asm.Label r15 = r15.i
            goto L_0x0190
        L_0x01b5:
            org.objectweb.asm.Label r15 = r13.N
        L_0x01b7:
            if (r15 == 0) goto L_0x01ef
            org.objectweb.asm.Label r1 = r15.k
            int r2 = r15.f
            int r5 = r15.g
            int r5 = r5 + r2
            if (r5 <= r3) goto L_0x01c3
            r3 = r5
        L_0x01c3:
            org.objectweb.asm.Edge r5 = r15.j
            int r15 = r15.a
            r15 = r15 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x01cd
            org.objectweb.asm.Edge r5 = r5.c
        L_0x01cd:
            r15 = r1
        L_0x01ce:
            if (r5 == 0) goto L_0x01b7
            org.objectweb.asm.Label r1 = r5.b
            int r6 = r1.a
            r6 = r6 & 8
            if (r6 != 0) goto L_0x01ec
            int r6 = r5.a
            if (r6 != r0) goto L_0x01de
            r6 = r4
            goto L_0x01e1
        L_0x01de:
            int r6 = r5.a
            int r6 = r6 + r2
        L_0x01e1:
            r1.f = r6
            int r6 = r1.a
            r6 = r6 | 8
            r1.a = r6
            r1.k = r15
            r15 = r1
        L_0x01ec:
            org.objectweb.asm.Edge r5 = r5.c
            goto L_0x01ce
        L_0x01ef:
            int r14 = java.lang.Math.max(r14, r3)
            r13.s = r14
            goto L_0x01fa
        L_0x01f6:
            r13.s = r14
            r13.t = r15
        L_0x01fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.MethodWriter.visitMaxs(int, int):void");
    }

    public void visitMethodInsn(int i2, String str, String str2, String str3, boolean z2) {
        this.Y = this.r.b;
        Item a = this.b.a(str, str2, str3, z2);
        int i3 = a.c;
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(i2, 0, this.b, a);
            } else {
                if (i3 == 0) {
                    i3 = Type.getArgumentsAndReturnSizes(str3);
                    a.c = i3;
                }
                int i4 = i2 == 184 ? (this.Q - (i3 >> 2)) + (i3 & 3) + 1 : (this.Q - (i3 >> 2)) + (i3 & 3);
                if (i4 > this.R) {
                    this.R = i4;
                }
                this.Q = i4;
            }
        }
        if (i2 == 185) {
            if (i3 == 0) {
                i3 = Type.getArgumentsAndReturnSizes(str3);
                a.c = i3;
            }
            this.r.b(Opcodes.INVOKEINTERFACE, a.a).a(i3 >> 2, 0);
            return;
        }
        this.r.b(i2, a.a);
    }

    public void visitMultiANewArrayInsn(String str, int i2) {
        this.Y = this.r.b;
        Item a = this.b.a(str);
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a((int) Opcodes.MULTIANEWARRAY, i2, this.b, a);
            } else {
                this.Q += 1 - i2;
            }
        }
        this.r.b(Opcodes.MULTIANEWARRAY, a.a).putByte(i2);
    }

    public void visitParameter(String str, int i2) {
        if (this.$ == null) {
            this.$ = new ByteVector();
        }
        this.Z++;
        this.$.putShort(str == null ? 0 : this.b.newUTF8(str)).putShort(i2);
    }

    public AnnotationVisitor visitParameterAnnotation(int i2, String str, boolean z2) {
        ByteVector byteVector = new ByteVector();
        if ("Ljava/lang/Synthetic;".equals(str)) {
            this.S = Math.max(this.S, i2 + 1);
            return new AnnotationWriter(this.b, false, byteVector, (ByteVector) null, 0);
        }
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, 2);
        if (z2) {
            if (this.o == null) {
                this.o = new AnnotationWriter[Type.getArgumentTypes(this.f).length];
            }
            annotationWriter.g = this.o[i2];
            this.o[i2] = annotationWriter;
        } else {
            if (this.p == null) {
                this.p = new AnnotationWriter[Type.getArgumentTypes(this.f).length];
            }
            annotationWriter.g = this.p[i2];
            this.p[i2] = annotationWriter;
        }
        return annotationWriter;
    }

    public void visitTableSwitchInsn(int i2, int i3, Label label, Label... labelArr) {
        this.Y = this.r.b;
        int i4 = this.r.b;
        this.r.putByte(Opcodes.TABLESWITCH);
        ByteVector byteVector = this.r;
        byteVector.putByteArray((byte[]) null, 0, (4 - (byteVector.b % 4)) % 4);
        label.a(this, this.r, i4, true);
        this.r.putInt(i2).putInt(i3);
        for (Label a : labelArr) {
            a.a(this, this.r, i4, true);
        }
        a(label, labelArr);
    }

    public AnnotationVisitor visitTryCatchAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.a(i2, typePath, byteVector);
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, byteVector.b - 2);
        if (z2) {
            annotationWriter.g = this.W;
            this.W = annotationWriter;
        } else {
            annotationWriter.g = this.X;
            this.X = annotationWriter;
        }
        return annotationWriter;
    }

    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.A++;
        Handler handler = new Handler();
        handler.a = label;
        handler.b = label2;
        handler.c = label3;
        handler.d = str;
        handler.e = str != null ? this.b.newClass(str) : 0;
        Handler handler2 = this.C;
        if (handler2 == null) {
            this.B = handler;
        } else {
            handler2.f = handler;
        }
        this.C = handler;
    }

    public AnnotationVisitor visitTypeAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.a(i2, typePath, byteVector);
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, byteVector.b - 2);
        if (z2) {
            annotationWriter.g = this.U;
            this.U = annotationWriter;
        } else {
            annotationWriter.g = this.V;
            this.V = annotationWriter;
        }
        return annotationWriter;
    }

    public void visitTypeInsn(int i2, String str) {
        this.Y = this.r.b;
        Item a = this.b.a(str);
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(i2, this.r.b, this.b, a);
            } else if (i2 == 187) {
                int i3 = this.Q + 1;
                if (i3 > this.R) {
                    this.R = i3;
                }
                this.Q = i3;
            }
        }
        this.r.b(i2, a.a);
    }

    public void visitVarInsn(int i2, int i3) {
        this.Y = this.r.b;
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(i2, i3, (ClassWriter) null, (Item) null);
            } else if (i2 == 169) {
                label.a |= 256;
                this.P.f = this.Q;
                e();
            } else {
                int i4 = this.Q + Frame.a[i2];
                if (i4 > this.R) {
                    this.R = i4;
                }
                this.Q = i4;
            }
        }
        if (this.M != 2) {
            int i5 = (i2 == 22 || i2 == 24 || i2 == 55 || i2 == 57) ? i3 + 2 : i3 + 1;
            if (i5 > this.t) {
                this.t = i5;
            }
        }
        if (i3 >= 4 || i2 == 169) {
            ByteVector byteVector = this.r;
            if (i3 >= 256) {
                byteVector.putByte(196).b(i2, i3);
            } else {
                byteVector.a(i2, i3);
            }
        } else {
            this.r.putByte((i2 < 54 ? ((i2 - 21) << 2) + 26 : ((i2 - 54) << 2) + 59) + i3);
        }
        if (i2 >= 54 && this.M == 0 && this.A > 0) {
            visitLabel(new Label());
        }
    }
}
