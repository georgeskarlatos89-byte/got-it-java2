package com.google.zxing.datamatrix.encoder;

import com.facebook.imageutils.JfifUtil;
import org.apache.http.HttpStatus;
import org.objectweb.asm.Opcodes;

public final class ErrorCorrection {
    private static final int[] ALOG = new int[255];
    private static final int[][] FACTORS = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, Opcodes.D2F, Opcodes.I2F, 240, 92, 254}, new int[]{28, 24, Opcodes.INVOKEINTERFACE, Opcodes.IF_ACMPNE, 223, 248, 116, 255, 110, 61}, new int[]{Opcodes.DRETURN, Opcodes.L2D, HttpStatus.SC_RESET_CONTENT, 12, Opcodes.MONITORENTER, Opcodes.JSR, 39, 245, 60, 97, 120}, new int[]{41, Opcodes.IFEQ, Opcodes.IFLE, 91, 61, 42, Opcodes.D2I, 213, 97, Opcodes.GETSTATIC, 100, 242}, new int[]{Opcodes.IFGE, 97, 192, 252, 95, 9, Opcodes.IFGT, 119, Opcodes.L2D, 45, 18, Opcodes.INVOKEDYNAMIC, 83, Opcodes.INVOKEINTERFACE}, new int[]{83, Opcodes.MONITOREXIT, 100, 39, Opcodes.NEWARRAY, 75, 66, 61, 241, 213, 109, Opcodes.LOR, 94, 254, JfifUtil.MARKER_APP1, 48, 90, Opcodes.NEWARRAY}, new int[]{15, Opcodes.MONITOREXIT, 244, 9, 233, 71, Opcodes.JSR, 2, Opcodes.NEWARRAY, Opcodes.IF_ICMPNE, Opcodes.IFEQ, Opcodes.I2B, 253, 79, 108, 82, 27, Opcodes.FRETURN, Opcodes.INVOKEDYNAMIC, Opcodes.IRETURN}, new int[]{52, 190, 88, HttpStatus.SC_RESET_CONTENT, 109, 39, Opcodes.ARETURN, 21, Opcodes.IFLT, Opcodes.MULTIANEWARRAY, 251, 223, Opcodes.IFLT, 21, 5, Opcodes.IRETURN, 254, 124, 12, Opcodes.PUTFIELD, Opcodes.INVOKESTATIC, 96, 50, Opcodes.INSTANCEOF}, new int[]{211, 231, 43, 97, 71, 96, 103, Opcodes.FRETURN, 37, Opcodes.DCMPL, Opcodes.TABLESWITCH, 53, 75, 34, 249, 121, 17, Opcodes.L2D, 110, 213, Opcodes.F2D, Opcodes.L2I, 120, Opcodes.DCMPL, 233, Opcodes.JSR, 93, 255}, new int[]{245, 127, 242, JfifUtil.MARKER_SOS, Opcodes.IXOR, 250, Opcodes.IF_ICMPGE, Opcodes.PUTFIELD, 102, 120, 84, Opcodes.PUTSTATIC, 220, 251, 80, Opcodes.INVOKEVIRTUAL, 229, 18, 2, 4, 68, 33, 101, Opcodes.L2F, 95, 119, 115, 44, Opcodes.DRETURN, Opcodes.INVOKESTATIC, 59, 25, JfifUtil.MARKER_APP1, 98, 81, 112}, new int[]{77, Opcodes.INSTANCEOF, Opcodes.L2F, 31, 19, 38, 22, Opcodes.IFEQ, 247, 105, 122, 2, 245, Opcodes.I2L, 242, 8, Opcodes.DRETURN, 95, 100, 9, Opcodes.GOTO, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, HttpStatus.SC_ACCEPTED, 69, 50, Opcodes.FCMPG, Opcodes.RETURN, 226, 5, 9, 5}, new int[]{245, Opcodes.IINC, Opcodes.IRETURN, 223, 96, 32, 117, 22, 238, Opcodes.I2L, 238, 231, HttpStatus.SC_RESET_CONTENT, Opcodes.NEWARRAY, 237, 87, Opcodes.ATHROW, 106, 16, Opcodes.I2S, 118, 23, 37, 90, Opcodes.TABLESWITCH, HttpStatus.SC_RESET_CONTENT, Opcodes.LXOR, 88, 120, 100, 66, Opcodes.L2D, Opcodes.INVOKEDYNAMIC, 240, 82, 44, Opcodes.ARETURN, 87, Opcodes.NEW, Opcodes.I2S, Opcodes.IF_ICMPNE, Opcodes.DRETURN, 69, 213, 92, 253, JfifUtil.MARKER_APP1, 19}, new int[]{Opcodes.DRETURN, 9, 223, 238, 12, 17, 220, JfifUtil.MARKER_RST0, 100, 29, Opcodes.DRETURN, Opcodes.TABLESWITCH, 230, 192, JfifUtil.MARKER_RST7, 235, Opcodes.FCMPG, Opcodes.IF_ICMPEQ, 36, 223, 38, 200, Opcodes.IINC, 54, 228, Opcodes.I2C, JfifUtil.MARKER_SOS, 234, 117, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 29, 232, Opcodes.D2F, 238, 22, Opcodes.FCMPG, HttpStatus.SC_CREATED, 117, 62, HttpStatus.SC_MULTI_STATUS, Opcodes.IF_ICMPLE, 13, Opcodes.L2F, 245, 127, 67, 247, 28, Opcodes.IFLT, 43, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 107, 233, 53, Opcodes.D2L, 46}, new int[]{242, 93, Opcodes.RET, 50, Opcodes.D2F, 210, 39, 118, HttpStatus.SC_ACCEPTED, Opcodes.NEWARRAY, HttpStatus.SC_CREATED, Opcodes.ANEWARRAY, Opcodes.D2L, 108, 196, 37, Opcodes.INVOKEINTERFACE, 112, Opcodes.I2F, 230, 245, 63, Opcodes.MULTIANEWARRAY, 190, 250, 106, Opcodes.INVOKEINTERFACE, 221, Opcodes.DRETURN, 64, 114, 71, Opcodes.IF_ICMPLT, 44, Opcodes.I2S, 6, 27, JfifUtil.MARKER_SOS, 51, 63, 87, 10, 40, Opcodes.IXOR, Opcodes.NEWARRAY, 17, Opcodes.IF_ICMPGT, 31, Opcodes.ARETURN, Opcodes.TABLESWITCH, 4, 107, 232, 7, 94, Opcodes.IF_ACMPNE, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, Opcodes.LRETURN, 89, 251, Opcodes.FCMPL, Opcodes.IF_ICMPEQ, 56, 89, 33, Opcodes.I2S, 244, Opcodes.IFNE, 36, 73, 127, 213, Opcodes.L2I, 248, 180, 234, Opcodes.MULTIANEWARRAY, Opcodes.IFLE, Opcodes.RETURN, 68, 122, 93, 213, 15, Opcodes.IF_ICMPNE, 227, 236, 66, Opcodes.F2I, Opcodes.IFEQ, Opcodes.INVOKEINTERFACE, HttpStatus.SC_ACCEPTED, Opcodes.GOTO, Opcodes.PUTSTATIC, 25, 220, 232, 96, 210, 231, Opcodes.L2I, 223, 239, Opcodes.PUTFIELD, 241, 59, 52, Opcodes.IRETURN, 25, 49, 232, 211, Opcodes.ANEWARRAY, 64, 54, 108, Opcodes.IFEQ, Opcodes.IINC, 63, 96, 103, 82, Opcodes.INVOKEDYNAMIC}};
    private static final int[] FACTOR_SETS = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[] LOG = new int[256];
    private static final int MODULO_VALUE = 301;

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            ALOG[i2] = i;
            LOG[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    private ErrorCorrection() {
    }

    public static String encodeECC200(String str, SymbolInfo symbolInfo) {
        if (str.length() == symbolInfo.getDataCapacity()) {
            StringBuilder sb = new StringBuilder(symbolInfo.getDataCapacity() + symbolInfo.getErrorCodewords());
            sb.append(str);
            int interleavedBlockCount = symbolInfo.getInterleavedBlockCount();
            if (interleavedBlockCount == 1) {
                sb.append(createECCBlock(str, symbolInfo.getErrorCodewords()));
            } else {
                sb.setLength(sb.capacity());
                int[] iArr = new int[interleavedBlockCount];
                int[] iArr2 = new int[interleavedBlockCount];
                int[] iArr3 = new int[interleavedBlockCount];
                int i = 0;
                while (i < interleavedBlockCount) {
                    int i2 = i + 1;
                    iArr[i] = symbolInfo.getDataLengthForInterleavedBlock(i2);
                    iArr2[i] = symbolInfo.getErrorLengthForInterleavedBlock(i2);
                    iArr3[i] = 0;
                    if (i > 0) {
                        iArr3[i] = iArr3[i - 1] + iArr[i];
                    }
                    i = i2;
                }
                for (int i3 = 0; i3 < interleavedBlockCount; i3++) {
                    StringBuilder sb2 = new StringBuilder(iArr[i3]);
                    for (int i4 = i3; i4 < symbolInfo.getDataCapacity(); i4 += interleavedBlockCount) {
                        sb2.append(str.charAt(i4));
                    }
                    String createECCBlock = createECCBlock(sb2.toString(), iArr2[i3]);
                    int i5 = i3;
                    int i6 = 0;
                    while (i5 < iArr2[i3] * interleavedBlockCount) {
                        sb.setCharAt(symbolInfo.getDataCapacity() + i5, createECCBlock.charAt(i6));
                        i5 += interleavedBlockCount;
                        i6++;
                    }
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }

    private static String createECCBlock(CharSequence charSequence, int i) {
        return createECCBlock(charSequence, 0, charSequence.length(), i);
    }

    private static String createECCBlock(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 0;
        while (true) {
            int[] iArr = FACTOR_SETS;
            if (i6 >= iArr.length) {
                i6 = -1;
                break;
            } else if (iArr[i6] == i3) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int[] iArr2 = FACTORS[i6];
            char[] cArr = new char[i3];
            for (int i7 = 0; i7 < i3; i7++) {
                cArr[i7] = 0;
            }
            for (int i8 = i; i8 < i + i2; i8++) {
                int i9 = i3 - 1;
                char charAt = cArr[i9] ^ charSequence.charAt(i8);
                while (i9 > 0) {
                    if (charAt == 0 || (i5 = iArr2[i9]) == 0) {
                        cArr[i9] = cArr[i9 - 1];
                    } else {
                        char c = cArr[i9 - 1];
                        int[] iArr3 = ALOG;
                        int[] iArr4 = LOG;
                        cArr[i9] = (char) (iArr3[(iArr4[charAt] + iArr4[i5]) % 255] ^ c);
                    }
                    i9--;
                }
                if (charAt == 0 || (i4 = iArr2[0]) == 0) {
                    cArr[0] = 0;
                } else {
                    int[] iArr5 = ALOG;
                    int[] iArr6 = LOG;
                    cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[i4]) % 255];
                }
            }
            char[] cArr2 = new char[i3];
            for (int i10 = 0; i10 < i3; i10++) {
                cArr2[i10] = cArr[(i3 - i10) - 1];
            }
            return String.valueOf(cArr2);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i3)));
    }
}
