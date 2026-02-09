package com.cardinalcommerce.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.signature.SignatureVisitor;

public abstract class setHorizontalScrollBarEnabled {
    private static char Cardinal = '0';
    private static int cca_continue = 1;
    private static int init;

    static {
        int i = 1 ^ 83;
        int i2 = ((1 & 83) | i) << 1;
        int i3 = -i;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        init = i4 % 128;
        int i5 = i4 % 2;
    }

    public static boolean Cardinal(char[] cArr) {
        int i = cca_continue;
        int i2 = i & 27;
        int i3 = ((~i2) & (i | 27)) + (i2 << 1);
        init = i3 % 128;
        if ((i3 % 2 != 0 ? SignatureVisitor.EXTENDS : '.') == '.') {
            if (!(cArr == null)) {
                int i4 = i | 69;
                int i5 = (i4 << 1) - (i4 & (~(i & 69)));
                init = i5 % 128;
                int i6 = i5 % 2;
                if ((cArr.length == 0 ? 15 : 'V') == 'V') {
                    int i7 = i & 101;
                    int i8 = i7 + ((i ^ 101) | i7);
                    init = i8 % 128;
                    if (!(i8 % 2 != 0)) {
                        return false;
                    }
                    throw null;
                }
            }
            int i9 = (i & -66) | ((~i) & 65);
            int i10 = (i & 65) << 1;
            int i11 = (i9 & i10) + (i9 | i10);
            init = i11 % 128;
            int i12 = i11 % 2;
            return true;
        }
        throw null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    public static String cca_continue(char[] cArr) {
        int i = cca_continue;
        int i2 = i & 25;
        int i3 = (i2 - (~((i ^ 25) | i2))) - 1;
        init = i3 % 128;
        int i4 = i3 % 2;
        ? r4 = 0;
        if ((cArr != null ? 'Q' : '5') == 'Q') {
            int i5 = i & 61;
            int i6 = -(-((i ^ 61) | i5));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            init = i7 % 128;
            if (!(i7 % 2 != 0)) {
                if (!(cArr.length == 0)) {
                    String str = new String(cArr);
                    int i8 = cca_continue;
                    int i9 = (i8 ^ 55) + ((i8 & 55) << 1);
                    init = i9 % 128;
                    if ((i9 % 2 != 0 ? '%' : '6') != '%') {
                        return str;
                    }
                    int i10 = 81 / 0;
                    return str;
                }
            } else {
                int length = cArr.length;
                super.hashCode();
                throw r4;
            }
        }
        int i11 = init;
        int i12 = (i11 & 44) + (i11 | 44);
        int i13 = (i12 & -1) + (i12 | -1);
        cca_continue = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return r4;
        }
        int i14 = 70 / 0;
        return r4;
    }

    public static String cca_continue(List<char[]> list) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        Iterator<char[]> it = list.iterator();
        int i = cca_continue;
        int i2 = ((i | 49) << 1) - (i ^ 49);
        init = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            int i4 = cca_continue;
            int i5 = ((i4 | 122) << 1) - (i4 ^ 122);
            int i6 = ((i5 | -1) << 1) - (i5 ^ -1);
            init = i6 % 128;
            int i7 = i6 % 2;
            sb.append(it.next());
            int i8 = cca_continue;
            int i9 = i8 ^ 39;
            int i10 = ((i8 & 39) | i9) << 1;
            int i11 = -i9;
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            init = i12 % 128;
            int i13 = i12 % 2;
        }
        String obj = sb.toString();
        int i14 = cca_continue;
        int i15 = ((i14 | 57) << 1) - (((~i14) & 57) | (i14 & -58));
        init = i15 % 128;
        if (i15 % 2 == 0) {
            z = true;
        }
        if (z) {
            return obj;
        }
        throw null;
    }

    public static char[] configure(String str) {
        int i = init;
        int i2 = (i ^ 33) + ((i & 33) << 1);
        cca_continue = i2 % 128;
        int i3 = i2 % 2;
        if ((str != null ? '\'' : '<') != '<') {
            int i4 = ((i & -76) | ((~i) & 75)) + ((i & 75) << 1);
            cca_continue = i4 % 128;
            int i5 = i4 % 2;
            if ((str.isEmpty() ? 'C' : 12) == 12) {
                char[] charArray = str.toCharArray();
                int i6 = cca_continue + 81;
                init = i6 % 128;
                int i7 = i6 % 2;
                return charArray;
            }
        }
        boolean z = false;
        char[] cArr = new char[0];
        int i8 = init;
        int i9 = i8 & 31;
        int i10 = ((i8 | 31) & (~i9)) + (i9 << 1);
        cca_continue = i10 % 128;
        if (i10 % 2 != 0) {
            z = true;
        }
        if (z) {
            return cArr;
        }
        throw null;
    }

    public static char[] getInstance(char[] cArr) {
        int i = init;
        int i2 = i & 77;
        int i3 = (i ^ 77) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        cca_continue = i4 % 128;
        int i5 = i4 % 2;
        if ((Cardinal(cArr) ? '%' : 'K') != 'K') {
            int i6 = init;
            int i7 = ((i6 | 65) << 1) - (i6 ^ 65);
            cca_continue = i7 % 128;
            char[] cArr2 = i7 % 2 != 0 ? new char[0] : new char[1];
            int i8 = i6 & 1;
            int i9 = (((i6 ^ 1) | i8) << 1) - ((i6 | 1) & (~i8));
            cca_continue = i9 % 128;
            int i10 = i9 % 2;
            return cArr2;
        }
        Arrays.fill(cArr, Cardinal);
        int i11 = cca_continue + 76;
        int i12 = (i11 & -1) + (i11 | -1);
        init = i12 % 128;
        int i13 = i12 % 2;
        return cArr;
    }

    public static List<char[]> Cardinal(List<char[]> list) {
        int i = cca_continue;
        int i2 = (i ^ 7) + ((i & 7) << 1);
        init = i2 % 128;
        int i3 = i2 % 2;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            int i4 = cca_continue + 24;
            int i5 = ((i4 | -1) << 1) - (i4 ^ -1);
            init = i5 % 128;
            int i6 = i5 % 2;
            return arrayList;
        }
        Iterator<char[]> it = list.iterator();
        int i7 = cca_continue;
        int i8 = (i7 | 35) << 1;
        int i9 = -(((~i7) & 35) | (i7 & -36));
        while (true) {
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            init = i10 % 128;
            int i11 = i10 % 2;
            if (!it.hasNext()) {
                break;
            }
            int i12 = (init + 126) - 1;
            cca_continue = i12 % 128;
            int i13 = i12 % 2;
            getInstance(it.next());
            int i14 = cca_continue;
            i8 = i14 & 21;
            i9 = (i14 ^ 21) | i8;
        }
        int i15 = (cca_continue + 122) - 1;
        init = i15 % 128;
        if ((i15 % 2 != 0 ? '(' : 8) == 8) {
            return list;
        }
        throw null;
    }
}
