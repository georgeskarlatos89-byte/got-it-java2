package com.cardinalcommerce.a;

import android.util.Base64;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

public final class setScrollbarFadingEnabled implements Serializable {
    private static int init = 0;
    private static int onValidated = 1;
    private String Cardinal;
    public boolean cca_continue;
    private String configure;
    private String getInstance;

    public setScrollbarFadingEnabled() {
    }

    public static boolean Cardinal(String str, int i) {
        int i2 = init;
        int i3 = (i2 ^ 27) + ((i2 & 27) << 1);
        onValidated = i3 % 128;
        char c = 0;
        Throwable th = null;
        if (!(i3 % 2 == 0)) {
            if (!str.equals("")) {
                if (!(str.length() != i)) {
                    int i4 = init;
                    int i5 = ((i4 | 73) << 1) - (i4 ^ 73);
                    onValidated = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 & 101;
                    int i8 = (i7 - (~(-(-((i4 ^ 101) | i7))))) - 1;
                    onValidated = i8 % 128;
                    if (i8 % 2 != 0) {
                        c = Typography.amp;
                    }
                    if (c != 0) {
                        return true;
                    }
                    super.hashCode();
                    throw th;
                }
            }
            int i9 = init;
            int i10 = (((i9 ^ 87) | (i9 & 87)) << 1) - (((~i9) & 87) | (i9 & -88));
            onValidated = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        str.equals("");
        throw th;
    }

    public static boolean init(String str) {
        int i = onValidated;
        int i2 = i ^ 87;
        int i3 = (i & 87) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        init = i4 % 128;
        if ((i4 % 2 != 0 ? '`' : 'I') != '`') {
            if (!(!str.equals(""))) {
                int i5 = init;
                int i6 = (((i5 & -126) | ((~i5) & 125)) - (~((i5 & 125) << 1))) - 1;
                onValidated = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = init;
            int i9 = i8 & 39;
            int i10 = (((i8 | 39) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
            onValidated = i10 % 128;
            return (i10 % 2 == 0 ? 25 : '!') != 25;
        }
        str.equals("");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if ((r7 <= r9 / 1.2d) != true) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if ((r7 <= r9 * 1.2d ? (char) 10 : 12) != 12) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        r9 = init;
        r10 = (r9 & 79) + (r9 | 79);
        onValidated = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean init(java.lang.String r9, int r10) {
        /*
            int r0 = init
            r1 = r0 & -46
            int r2 = ~r0
            r3 = 45
            r2 = r2 & r3
            r1 = r1 | r2
            r0 = r0 & r3
            r2 = 1
            int r0 = r0 << r2
            int r0 = -r0
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r2
            int r0 = r1 % 128
            onValidated = r0
            int r1 = r1 % 2
            java.lang.String r0 = ""
            boolean r0 = r9.equals(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0022
            r0 = r2
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            r3 = 0
            if (r0 == 0) goto L_0x00a3
            int r0 = onValidated
            r4 = r0 & 47
            int r5 = ~r4
            r6 = 47
            r0 = r0 | r6
            r0 = r0 & r5
            int r4 = r4 << r2
            int r0 = r0 + r4
            int r4 = r0 % 128
            init = r4
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x003c
            r0 = 49
            goto L_0x003d
        L_0x003c:
            r0 = r2
        L_0x003d:
            r4 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            int r9 = r9.length()
            double r7 = (double) r9
            double r9 = (double) r10
            if (r0 == r2) goto L_0x0055
            double r9 = r9 / r4
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x0051
            r9 = r2
            goto L_0x0052
        L_0x0051:
            r9 = r1
        L_0x0052:
            if (r9 == r2) goto L_0x0062
            goto L_0x0095
        L_0x0055:
            double r9 = r9 * r4
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 12
            if (r9 > 0) goto L_0x005f
            r9 = 10
            goto L_0x0060
        L_0x005f:
            r9 = r10
        L_0x0060:
            if (r9 == r10) goto L_0x0095
        L_0x0062:
            int r9 = onValidated
            r10 = r9 ^ 64
            r0 = r9 & 64
            int r0 = r0 << r2
            int r10 = r10 + r0
            r0 = r10 ^ -1
            r10 = r10 & -1
            int r10 = r10 << r2
            int r0 = r0 + r10
            int r10 = r0 % 128
            init = r10
            int r0 = r0 % 2
            r10 = r9 ^ 87
            r9 = r9 & 87
            int r9 = r9 << r2
            r0 = r10 ^ r9
            r9 = r9 & r10
            int r9 = r9 << r2
            int r0 = r0 + r9
            int r9 = r0 % 128
            init = r9
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x008b
            r9 = 28
            goto L_0x008c
        L_0x008b:
            r9 = r6
        L_0x008c:
            if (r9 != r6) goto L_0x008f
            return r2
        L_0x008f:
            super.hashCode()     // Catch:{ all -> 0x0093 }
            throw r3     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r9 = move-exception
            throw r9
        L_0x0095:
            int r9 = init
            r10 = r9 & 79
            r9 = r9 | 79
            int r10 = r10 + r9
            int r9 = r10 % 128
            onValidated = r9
            int r10 = r10 % 2
            return r1
        L_0x00a3:
            int r9 = onValidated
            r10 = r9 | 2
            int r10 = r10 << r2
            r9 = r9 ^ 2
            int r10 = r10 - r9
            int r10 = r10 - r2
            int r9 = r10 % 128
            init = r9
            int r10 = r10 % 2
            if (r10 == 0) goto L_0x00b5
            r1 = r2
        L_0x00b5:
            if (r1 == r2) goto L_0x00b8
            return r2
        L_0x00b8:
            super.hashCode()     // Catch:{ all -> 0x00bc }
            throw r3     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setScrollbarFadingEnabled.init(java.lang.String, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
        if ((r8 <= 0 ? (char) 7 : 4) != 7) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
        if ((r8 <= 0) != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bc, code lost:
        r8 = init;
        r9 = r8 & 111;
        r8 = -(-((r8 ^ 111) | r9));
        r0 = (r9 & r8) + (r8 | r9);
        onValidated = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cf, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getInstance(java.lang.String r8, int r9) {
        /*
            int r0 = init
            r1 = r0 & 101(0x65, float:1.42E-43)
            int r2 = ~r1
            r0 = r0 | 101(0x65, float:1.42E-43)
            r0 = r0 & r2
            r2 = 1
            int r1 = r1 << r2
            int r0 = r0 + r1
            int r1 = r0 % 128
            onValidated = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x0016
            r0 = r1
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            r3 = 0
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r8.equals(r4)
            r5 = 67
            if (r0 == 0) goto L_0x0026
            r0 = 6
            goto L_0x0027
        L_0x0026:
            r0 = r5
        L_0x0027:
            if (r0 == r5) goto L_0x003c
            int r8 = init
            r9 = r8 & 17
            r8 = r8 ^ 17
            r8 = r8 | r9
            int r8 = -r8
            int r8 = -r8
            int r8 = ~r8
            int r9 = r9 - r8
            int r9 = r9 - r2
            int r8 = r9 % 128
            onValidated = r8
            int r9 = r9 % 2
            return r2
        L_0x003c:
            boolean r0 = r8.equals(r4)
            if (r0 != 0) goto L_0x0044
            r0 = r2
            goto L_0x0045
        L_0x0044:
            r0 = r1
        L_0x0045:
            if (r0 == r2) goto L_0x005e
            int r8 = onValidated
            int r8 = r8 + 83
            int r9 = r8 % 128
            init = r9
            int r8 = r8 % 2
            if (r8 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = r1
        L_0x0055:
            if (r2 != 0) goto L_0x0058
            return r1
        L_0x0058:
            super.hashCode()     // Catch:{ all -> 0x005c }
            throw r3     // Catch:{ all -> 0x005c }
        L_0x005c:
            r8 = move-exception
            throw r8
        L_0x005e:
            int r0 = onValidated
            r3 = r0 & -100
            int r4 = ~r0
            r4 = r4 & 99
            r3 = r3 | r4
            r0 = r0 & 99
            int r0 = r0 << r2
            r4 = r3 ^ r0
            r0 = r0 & r3
            int r0 = r0 << r2
            int r4 = r4 + r0
            int r0 = r4 % 128
            init = r0
            int r4 = r4 % 2
            r0 = 81
            if (r4 == 0) goto L_0x007b
            r3 = 20
            goto L_0x007c
        L_0x007b:
            r3 = r0
        L_0x007c:
            r4 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            int r8 = r8.length()
            double r6 = (double) r8
            double r8 = (double) r9
            double r8 = r8 * r4
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == r0) goto L_0x0095
            r9 = 7
            if (r8 > 0) goto L_0x0091
            r8 = r9
            goto L_0x0092
        L_0x0091:
            r8 = 4
        L_0x0092:
            if (r8 == r9) goto L_0x009c
            goto L_0x00bc
        L_0x0095:
            if (r8 > 0) goto L_0x0099
            r8 = r2
            goto L_0x009a
        L_0x0099:
            r8 = r1
        L_0x009a:
            if (r8 == 0) goto L_0x00bc
        L_0x009c:
            int r8 = init
            r9 = r8 ^ 25
            r8 = r8 & 25
            r8 = r8 | r9
            int r8 = r8 << r2
            int r9 = -r9
            r0 = r8 | r9
            int r0 = r0 << r2
            r8 = r8 ^ r9
            int r0 = r0 - r8
            int r8 = r0 % 128
            onValidated = r8
            int r0 = r0 % 2
            r8 = 35
            if (r0 != 0) goto L_0x00b7
            r9 = 88
            goto L_0x00b8
        L_0x00b7:
            r9 = r8
        L_0x00b8:
            if (r9 == r8) goto L_0x00bb
            r2 = r1
        L_0x00bb:
            return r2
        L_0x00bc:
            int r8 = init
            r9 = r8 & 111(0x6f, float:1.56E-43)
            r8 = r8 ^ 111(0x6f, float:1.56E-43)
            r8 = r8 | r9
            int r8 = -r8
            int r8 = -r8
            r0 = r9 & r8
            r8 = r8 | r9
            int r0 = r0 + r8
            int r8 = r0 % 128
            onValidated = r8
            int r0 = r0 % 2
            return r1
        L_0x00d0:
            r8.equals(r4)
            throw r3     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setScrollbarFadingEnabled.getInstance(java.lang.String, int):boolean");
    }

    public static boolean cca_continue(String str) {
        int i = init;
        int i2 = (i & -84) | ((~i) & 83);
        boolean z = true;
        int i3 = -(-((i & 83) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        onValidated = i4 % 128;
        Throwable th = null;
        if ((i4 % 2 == 0 ? 'N' : '@') == '@') {
            if (str.equals("")) {
                int i5 = onValidated;
                int i6 = i5 & 7;
                int i7 = (i6 - (~((i5 ^ 7) | i6))) - 1;
                init = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if ((!str.equals("") ? Typography.quote : ']') != ']') {
                int i9 = init;
                int i10 = (i9 & 85) + (i9 | 85);
                int i11 = i10 % 128;
                onValidated = i11;
                int i12 = i10 % 2;
                int i13 = ((((i11 ^ 41) | (i11 & 41)) << 1) - (~(-(((~i11) & 41) | (i11 & -42))))) - 1;
                init = i13 % 128;
                int i14 = i13 % 2;
                return true;
            }
            int i15 = onValidated;
            int i16 = (i15 ^ 72) + ((i15 & 72) << 1);
            int i17 = ((i16 | -1) << 1) - (i16 ^ -1);
            init = i17 % 128;
            if (i17 % 2 != 0) {
                z = false;
            }
            if (z) {
                return false;
            }
            super.hashCode();
            throw th;
        }
        str.equals("");
        super.hashCode();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if ((cca_continue(r9, 1) ? 'I' : '#') != 'I') goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if ((cca_continue(r9, 0) ? 'Q' : org.objectweb.asm.signature.SignatureVisitor.SUPER) != 'Q') goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r1 = r10.length;
        r1 = init;
        r3 = r1 & 97;
        r1 = -(-(r1 | 97));
        r6 = ((r3 | r1) << 1) - (r1 ^ r3);
        onValidated = r6 % 128;
        r6 = r6 % 2;
        r1 = 0;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (r1 >= 2) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        r7 = '^';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        r7 = 'H';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        if (r7 == 'H') goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        r6 = init;
        r7 = (((r6 & 124) + (r6 | 124)) - 0) - 1;
        onValidated = r7 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        if ((r7 % 2) != 0) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        if (r6 == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        r6 = r10[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r3 != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008a, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008d, code lost:
        if (r7 == true) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0090, code lost:
        r3 = r9.equalsIgnoreCase(r6);
        r6 = onValidated;
        r7 = r6 & 71;
        r6 = -(-((r6 ^ 71) | r7));
        r8 = (r7 & r6) + (r6 | r7);
        init = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        r6 = r1 ^ 1;
        r1 = (r1 & 1) << 1;
        r1 = ((r1 & r6) << 1) + (r6 ^ r1);
        r6 = onValidated;
        r7 = (r6 ^ 52) + ((r6 & 52) << 1);
        r6 = (r7 ^ -1) + ((r7 & -1) << 1);
        init = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c4, code lost:
        r9 = r10[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c9, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cc, code lost:
        r9 = onValidated;
        r10 = (r9 & 21) + (r9 | 21);
        init = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d8, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean cca_continue(java.lang.String r9, java.lang.String[] r10) {
        /*
            int r0 = onValidated
            r1 = r0 ^ 125(0x7d, float:1.75E-43)
            r0 = r0 & 125(0x7d, float:1.75E-43)
            r2 = 1
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            init = r0
            r0 = 2
            int r1 = r1 % r0
            r3 = 80
            if (r1 == 0) goto L_0x0015
            r1 = r3
            goto L_0x0017
        L_0x0015:
            r1 = 59
        L_0x0017:
            r4 = 0
            r5 = 0
            if (r1 == r3) goto L_0x002a
            boolean r1 = cca_continue((java.lang.String) r9, (int) r2)
            r3 = 73
            if (r1 == 0) goto L_0x0025
            r1 = r3
            goto L_0x0027
        L_0x0025:
            r1 = 35
        L_0x0027:
            if (r1 == r3) goto L_0x0052
            goto L_0x0038
        L_0x002a:
            boolean r1 = cca_continue((java.lang.String) r9, (int) r5)
            r3 = 81
            if (r1 == 0) goto L_0x0034
            r1 = r3
            goto L_0x0036
        L_0x0034:
            r1 = 45
        L_0x0036:
            if (r1 == r3) goto L_0x0052
        L_0x0038:
            int r9 = onValidated
            int r9 = r9 + 15
            int r10 = r9 % 128
            init = r10
            int r9 = r9 % r0
            r10 = 19
            if (r9 == 0) goto L_0x0047
            r9 = r10
            goto L_0x0049
        L_0x0047:
            r9 = 90
        L_0x0049:
            if (r9 == r10) goto L_0x004c
            return r5
        L_0x004c:
            super.hashCode()     // Catch:{ all -> 0x0050 }
            throw r4     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r9 = move-exception
            throw r9
        L_0x0052:
            int r1 = r10.length
            int r1 = init
            r3 = r1 & 97
            r1 = r1 | 97
            int r1 = -r1
            int r1 = -r1
            r6 = r3 | r1
            int r6 = r6 << r2
            r1 = r1 ^ r3
            int r6 = r6 - r1
            int r1 = r6 % 128
            onValidated = r1
            int r6 = r6 % r0
            r1 = r5
            r3 = r1
        L_0x0067:
            r6 = 72
            if (r1 >= r0) goto L_0x006e
            r7 = 94
            goto L_0x006f
        L_0x006e:
            r7 = r6
        L_0x006f:
            if (r7 == r6) goto L_0x00cc
            int r6 = init
            r7 = r6 & 124(0x7c, float:1.74E-43)
            r6 = r6 | 124(0x7c, float:1.74E-43)
            int r7 = r7 + r6
            int r7 = r7 - r5
            int r7 = r7 - r2
            int r6 = r7 % 128
            onValidated = r6
            int r7 = r7 % r0
            if (r7 != 0) goto L_0x0083
            r6 = r5
            goto L_0x0084
        L_0x0083:
            r6 = r2
        L_0x0084:
            if (r6 == 0) goto L_0x00c4
            r6 = r10[r1]
            if (r3 != 0) goto L_0x008c
            r7 = r2
            goto L_0x008d
        L_0x008c:
            r7 = r5
        L_0x008d:
            if (r7 == r2) goto L_0x0090
            goto L_0x00a6
        L_0x0090:
            boolean r3 = r9.equalsIgnoreCase(r6)
            int r6 = onValidated
            r7 = r6 & 71
            r6 = r6 ^ 71
            r6 = r6 | r7
            int r6 = -r6
            int r6 = -r6
            r8 = r7 & r6
            r6 = r6 | r7
            int r8 = r8 + r6
            int r6 = r8 % 128
            init = r6
            int r8 = r8 % r0
        L_0x00a6:
            r6 = r1 ^ 1
            r1 = r1 & 1
            int r1 = r1 << r2
            r7 = r6 ^ r1
            r1 = r1 & r6
            int r1 = r1 << r2
            int r1 = r1 + r7
            int r6 = onValidated
            r7 = r6 ^ 52
            r6 = r6 & 52
            int r6 = r6 << r2
            int r7 = r7 + r6
            r6 = r7 ^ -1
            r7 = r7 & -1
            int r7 = r7 << r2
            int r6 = r6 + r7
            int r7 = r6 % 128
            init = r7
            int r6 = r6 % r0
            goto L_0x0067
        L_0x00c4:
            r9 = r10[r1]
            super.hashCode()     // Catch:{ all -> 0x00ca }
            throw r4     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r9 = move-exception
            throw r9
        L_0x00cc:
            int r9 = onValidated
            r10 = r9 & 21
            r9 = r9 | 21
            int r10 = r10 + r9
            int r9 = r10 % 128
            init = r9
            int r10 = r10 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setScrollbarFadingEnabled.cca_continue(java.lang.String, java.lang.String[]):boolean");
    }

    public static boolean cca_continue(String str, int i) {
        int i2 = onValidated;
        int i3 = (((i2 ^ 17) | (i2 & 17)) << 1) - (((~i2) & 17) | (i2 & -18));
        init = i3 % 128;
        if (!(i3 % 2 != 0)) {
            if ((!str.equals("") ? 'I' : 'M') != 'I') {
                int i4 = onValidated;
                int i5 = (i4 & 39) + (i4 | 39);
                init = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(str.length() != i)) {
                int i7 = init;
                int i8 = i7 + 97;
                onValidated = i8 % 128;
                int i9 = i8 % 2;
                int i10 = (i7 & 41) + (i7 | 41);
                onValidated = i10 % 128;
                int i11 = i10 % 2;
                return true;
            }
            int i12 = ((init + 8) - 0) - 1;
            onValidated = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        str.equals("");
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if ((r4 == 36) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if ((r4 == 87 ? '9' : 'I') != 'I') goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r4 = onValidated;
        r1 = r4 | 61;
        r3 = r1 << 1;
        r4 = -((~(r4 & 61)) & r1);
        r1 = (r3 ^ r4) + ((r4 & r3) << 1);
        init = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean configure(java.lang.String r4) {
        /*
            int r0 = onValidated
            r1 = r0 & -20
            int r2 = ~r0
            r2 = r2 & 19
            r1 = r1 | r2
            r0 = r0 & 19
            r2 = 1
            int r0 = r0 << r2
            r3 = r1 & r0
            r0 = r0 | r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            init = r0
            int r3 = r3 % 2
            r0 = 0
            if (r3 == 0) goto L_0x001b
            r1 = r2
            goto L_0x001c
        L_0x001b:
            r1 = r0
        L_0x001c:
            int r4 = r4.length()
            if (r1 == r2) goto L_0x002c
            r1 = 36
            if (r4 != r1) goto L_0x0028
            r4 = r2
            goto L_0x0029
        L_0x0028:
            r4 = r0
        L_0x0029:
            if (r4 == 0) goto L_0x0047
            goto L_0x0038
        L_0x002c:
            r1 = 87
            r3 = 73
            if (r4 != r1) goto L_0x0035
            r4 = 57
            goto L_0x0036
        L_0x0035:
            r4 = r3
        L_0x0036:
            if (r4 == r3) goto L_0x0047
        L_0x0038:
            int r4 = init
            r0 = r4 & 121(0x79, float:1.7E-43)
            r4 = r4 ^ 121(0x79, float:1.7E-43)
            r4 = r4 | r0
            int r0 = r0 + r4
            int r4 = r0 % 128
            onValidated = r4
            int r0 = r0 % 2
            return r2
        L_0x0047:
            int r4 = onValidated
            r1 = r4 | 61
            int r3 = r1 << 1
            r4 = r4 & 61
            int r4 = ~r4
            r4 = r4 & r1
            int r4 = -r4
            r1 = r3 ^ r4
            r4 = r4 & r3
            int r4 = r4 << r2
            int r1 = r1 + r4
            int r4 = r1 % 128
            init = r4
            int r1 = r1 % 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setScrollbarFadingEnabled.configure(java.lang.String):boolean");
    }

    public static String Cardinal(String str) throws UnsupportedOperationException, IllegalArgumentException {
        String str2 = new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
        int i = init;
        int i2 = (i & -56) | ((~i) & 55);
        int i3 = (i & 55) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        onValidated = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    public static boolean getInstance(String str) {
        int i = onValidated + 87;
        init = i % 128;
        int i2 = i % 2;
        boolean matches = Pattern.compile("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$").matcher(str).matches();
        int i3 = onValidated;
        int i4 = i3 & 57;
        int i5 = i3 | 57;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        init = i6 % 128;
        if ((i6 % 2 != 0 ? 31 : 'P') != 31) {
            return matches;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public static String onValidated(String str) throws UnsupportedEncodingException {
        int i = onValidated;
        int i2 = ((i & 77) - (~(-(-(i | 77))))) - 1;
        init = i2 % 128;
        int i3 = i2 % 2;
        String encode = URLEncoder.encode(str, StandardCharsets.UTF_8.toString());
        int i4 = onValidated;
        int i5 = i4 & 91;
        int i6 = (i4 | 91) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        init = i8 % 128;
        if ((i8 % 2 != 0 ? 4 : 'M') == 'M') {
            return encode;
        }
        int i9 = 15 / 0;
        return encode;
    }

    public static boolean cleanup(String str) {
        int i = onValidated;
        int i2 = i & 111;
        int i3 = (i ^ 111) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        init = i4 % 128;
        int i5 = i4 % 2;
        boolean find = Pattern.compile("<[a-z/][\\s\\S]*>").matcher(getSDKVersion(str)).find();
        int i6 = init;
        int i7 = (i6 | 83) << 1;
        int i8 = -(i6 ^ 83);
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        onValidated = i9 % 128;
        int i10 = i9 % 2;
        return find;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getSDKVersion(java.lang.String r8) {
        /*
            int r0 = init
            r1 = r0 ^ 63
            r2 = r0 & 63
            r1 = r1 | r2
            r2 = 1
            int r1 = r1 << r2
            r3 = r0 & -64
            int r0 = ~r0
            r4 = 63
            r0 = r0 & r4
            r0 = r0 | r3
            int r0 = -r0
            r3 = r1 | r0
            int r3 = r3 << r2
            r0 = r0 ^ r1
            int r3 = r3 - r0
            int r0 = r3 % 128
            onValidated = r0
            int r3 = r3 % 2
            r0 = 8
            byte[] r8 = android.util.Base64.decode(r8, r0)
            r0 = 0
            if (r8 != 0) goto L_0x0027
            r1 = r2
            goto L_0x0028
        L_0x0027:
            r1 = r0
        L_0x0028:
            r3 = 0
            if (r1 == 0) goto L_0x0045
            int r1 = init
            r5 = r1 & -110(0xffffffffffffff92, float:NaN)
            int r6 = ~r1
            r7 = 109(0x6d, float:1.53E-43)
            r6 = r6 & r7
            r5 = r5 | r6
            r1 = r1 & r7
            int r1 = r1 << r2
            int r1 = ~r1
            int r5 = r5 - r1
            int r5 = r5 - r2
            int r1 = r5 % 128
            onValidated = r1
            int r5 = r5 % 2
            int r1 = r8.length
            if (r1 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r1 = r3
            goto L_0x005b
        L_0x0045:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r8, r5)
            int r8 = onValidated
            r5 = r8 & 40
            r8 = r8 | 40
            int r5 = r5 + r8
            int r5 = r5 - r0
            int r5 = r5 - r2
            int r8 = r5 % 128
            init = r8
            int r5 = r5 % 2
        L_0x005b:
            int r8 = init
            int r8 = r8 + r4
            int r4 = r8 % 128
            onValidated = r4
            int r8 = r8 % 2
            if (r8 != 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r0 = r2
        L_0x0068:
            if (r0 != r2) goto L_0x006b
            return r1
        L_0x006b:
            throw r3     // Catch:{ all -> 0x006c }
        L_0x006c:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setScrollbarFadingEnabled.getSDKVersion(java.lang.String):java.lang.String");
    }

    public setScrollbarFadingEnabled(String str) {
        if (str.contains("{}") || str.equals("")) {
            this.cca_continue = true;
        } else {
            this.cca_continue = getWarnings(str);
        }
    }

    private boolean getWarnings(String str) {
        boolean z = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Throwable th = null;
            if ((jSONObject.has("medium") ? '(' : 'V') == '(') {
                int i = onValidated;
                int i2 = (i & 68) + (i | 68);
                int i3 = (i2 ^ -1) + ((i2 & -1) << 1);
                init = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    this.configure = jSONObject.optString("medium", "");
                } else {
                    this.configure = jSONObject.optString("medium", "");
                    super.hashCode();
                    throw th;
                }
            }
            if ((jSONObject.has("extraHigh") ? 'E' : '^') == 'E') {
                int i4 = onValidated;
                int i5 = ((i4 & -50) | ((~i4) & 49)) + ((i4 & 49) << 1);
                init = i5 % 128;
                int i6 = i5 % 2;
                this.Cardinal = jSONObject.optString("extraHigh", "");
                int i7 = onValidated;
                int i8 = i7 & 117;
                int i9 = (i7 | 117) & (~i8);
                int i10 = i8 << 1;
                int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                init = i11 % 128;
                int i12 = i11 % 2;
            }
            if ((jSONObject.has("high") ? '@' : '`') != '`') {
                int i13 = init;
                int i14 = i13 & 89;
                int i15 = (i14 - (~(-(-((i13 ^ 89) | i14))))) - 1;
                onValidated = i15 % 128;
                int i16 = i15 % 2;
                this.getInstance = jSONObject.optString("high", "");
                int i17 = onValidated;
                int i18 = i17 & 41;
                int i19 = ((((i17 ^ 41) | i18) << 1) - (~(-((i17 | 41) & (~i18))))) - 1;
                init = i19 % 128;
                int i20 = i19 % 2;
            }
            int i21 = onValidated;
            int i22 = (i21 ^ 112) + ((i21 & 112) << 1);
            int i23 = ((i22 | -1) << 1) - (i22 ^ -1);
            init = i23 % 128;
            int i24 = i23 % 2;
            int i25 = (((i21 & -48) | ((~i21) & 47)) - (~(-(-((i21 & 47) << 1))))) - 1;
            int i26 = i25 % 128;
            init = i26;
            int i27 = i25 % 2;
            int i28 = (i26 ^ 105) + ((i26 & 105) << 1);
            onValidated = i28 % 128;
            if (i28 % 2 != 0) {
                z = true;
            }
            if (z) {
                return true;
            }
            throw th;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r12 != 4) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r12 != 4) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getInstance(android.content.Context r12) {
        /*
            r11 = this;
            int r0 = init
            r1 = r0 & 113(0x71, float:1.58E-43)
            r0 = r0 | 113(0x71, float:1.58E-43)
            int r1 = r1 + r0
            int r0 = r1 % 128
            onValidated = r0
            r0 = 2
            int r1 = r1 % r0
            r2 = 23
            if (r1 != 0) goto L_0x0013
            r1 = r2
            goto L_0x0015
        L_0x0013:
            r1 = 94
        L_0x0015:
            r3 = 86
            r4 = 3
            java.lang.String r5 = ""
            r6 = 4
            r7 = 54
            r8 = 0
            r9 = 0
            r10 = 1
            if (r1 == r2) goto L_0x0035
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r12 = r12.getConfiguration()
            int r12 = r12.screenLayout
            r12 = r12 & 15
            if (r12 == r0) goto L_0x0136
            if (r12 == r4) goto L_0x009c
            if (r12 == r6) goto L_0x009c
            goto L_0x0049
        L_0x0035:
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r12 = r12.getConfiguration()
            int r12 = r12.screenLayout
            r1 = r12 ^ 54
            r12 = r12 & r7
            r12 = r12 | r1
            if (r12 == r0) goto L_0x0136
            if (r12 == r4) goto L_0x009c
            if (r12 == r6) goto L_0x009c
        L_0x0049:
            java.lang.String r12 = r11.configure
            if (r12 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r9 = r10
        L_0x004f:
            if (r9 == r10) goto L_0x0078
            int r1 = onValidated
            r2 = r1 ^ 89
            r3 = r1 & 89
            r2 = r2 | r3
            int r2 = r2 << r10
            int r3 = ~r3
            r1 = r1 | 89
            r1 = r1 & r3
            int r1 = -r1
            r3 = r2 | r1
            int r3 = r3 << r10
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            init = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L_0x006c
            r1 = r7
            goto L_0x006e
        L_0x006c:
            r1 = 41
        L_0x006e:
            if (r1 == r7) goto L_0x0072
            r5 = r12
            goto L_0x0088
        L_0x0072:
            super.hashCode()     // Catch:{ all -> 0x0076 }
            throw r8     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r12 = move-exception
            throw r12
        L_0x0078:
            int r12 = init
            r1 = r12 & 55
            r12 = r12 | 55
            r2 = r1 | r12
            int r2 = r2 << r10
            r12 = r12 ^ r1
            int r2 = r2 - r12
            int r12 = r2 % 128
            onValidated = r12
            int r2 = r2 % r0
        L_0x0088:
            int r12 = init
            r1 = r12 & 74
            r12 = r12 | 74
            int r1 = r1 + r12
            r12 = r1 | -1
            int r12 = r12 << r10
            r1 = r1 ^ -1
            int r12 = r12 - r1
            int r1 = r12 % 128
            onValidated = r1
            int r12 = r12 % r0
            goto L_0x01b5
        L_0x009c:
            java.lang.String r12 = r11.Cardinal
            r1 = 99
            if (r12 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r6 = r1
        L_0x00a4:
            if (r6 == r1) goto L_0x00c2
            int r1 = init
            int r2 = r1 + 116
            int r2 = r2 - r10
            int r4 = r2 % 128
            onValidated = r4
            int r2 = r2 % r0
            r2 = r1 & 86
            r1 = r1 | r3
            int r2 = r2 + r1
            r1 = r2 | -1
            int r1 = r1 << r10
            r2 = r2 ^ -1
            int r1 = r1 - r2
            int r2 = r1 % 128
            onValidated = r2
            int r1 = r1 % r0
        L_0x00bf:
            r5 = r12
            goto L_0x0122
        L_0x00c2:
            java.lang.String r12 = r11.getInstance
            if (r12 == 0) goto L_0x00c8
            r1 = r10
            goto L_0x00c9
        L_0x00c8:
            r1 = r9
        L_0x00c9:
            if (r1 == 0) goto L_0x00e7
            int r1 = onValidated
            int r1 = r1 + 26
            r2 = r1 ^ -1
            r1 = r1 & -1
            int r1 = r1 << r10
            int r2 = r2 + r1
            int r1 = r2 % 128
            init = r1
            int r2 = r2 % r0
            if (r2 == 0) goto L_0x00de
            r1 = r10
            goto L_0x00df
        L_0x00de:
            r1 = r9
        L_0x00df:
            if (r1 == 0) goto L_0x00bf
            r1 = 45
            int r1 = r1 / r9
            goto L_0x00bf
        L_0x00e5:
            r12 = move-exception
            throw r12
        L_0x00e7:
            java.lang.String r12 = r11.configure
            if (r12 == 0) goto L_0x00ed
            r1 = r9
            goto L_0x00ee
        L_0x00ed:
            r1 = r10
        L_0x00ee:
            if (r1 == r10) goto L_0x0114
            int r1 = onValidated
            r2 = r1 | 98
            int r2 = r2 << r10
            r1 = r1 ^ 98
            int r2 = r2 - r1
            int r2 = r2 - r9
            int r2 = r2 - r10
            int r1 = r2 % 128
            init = r1
            int r2 = r2 % r0
            if (r2 == 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r9 = r10
        L_0x0103:
            if (r9 == 0) goto L_0x010e
            int r1 = r1 + 70
            int r1 = r1 - r10
            int r2 = r1 % 128
            onValidated = r2
            int r1 = r1 % r0
            goto L_0x00bf
        L_0x010e:
            super.hashCode()     // Catch:{ all -> 0x0112 }
            throw r8     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r12 = move-exception
            throw r12
        L_0x0114:
            int r12 = onValidated
            r1 = r12 | 102(0x66, float:1.43E-43)
            int r1 = r1 << r10
            r12 = r12 ^ 102(0x66, float:1.43E-43)
            int r1 = r1 - r12
            int r1 = r1 - r10
            int r12 = r1 % 128
            init = r12
            int r1 = r1 % r0
        L_0x0122:
            int r12 = init
            r1 = r12 & 9
            r12 = r12 | 9
            int r12 = -r12
            int r12 = -r12
            r2 = r1 ^ r12
            r12 = r12 & r1
            int r12 = r12 << r10
            int r2 = r2 + r12
            int r12 = r2 % 128
            onValidated = r12
            int r2 = r2 % r0
            goto L_0x01b5
        L_0x0136:
            java.lang.String r12 = r11.getInstance
            r1 = 52
            if (r12 == 0) goto L_0x013f
            r2 = 78
            goto L_0x0140
        L_0x013f:
            r2 = r1
        L_0x0140:
            if (r2 == r1) goto L_0x0160
            int r1 = onValidated
            r2 = r1 & -40
            int r3 = ~r1
            r3 = r3 & 39
            r2 = r2 | r3
            r1 = r1 & 39
            int r1 = r1 << r10
            int r2 = r2 + r1
            int r1 = r2 % 128
            init = r1
            int r2 = r2 % r0
            r2 = r1 | 81
            int r2 = r2 << r10
            r1 = r1 ^ 81
            int r2 = r2 - r1
            int r1 = r2 % 128
            onValidated = r1
            int r2 = r2 % r0
        L_0x015e:
            r5 = r12
            goto L_0x01a2
        L_0x0160:
            java.lang.String r12 = r11.configure
            r1 = 30
            if (r12 == 0) goto L_0x0168
            r2 = r1
            goto L_0x016a
        L_0x0168:
            r2 = 93
        L_0x016a:
            if (r2 == r1) goto L_0x017e
            int r12 = onValidated
            r1 = r12 & 71
            r12 = r12 ^ 71
            r12 = r12 | r1
            int r12 = -r12
            int r12 = -r12
            int r12 = ~r12
            int r1 = r1 - r12
            int r1 = r1 - r10
            int r12 = r1 % 128
            init = r12
            int r1 = r1 % r0
            goto L_0x01a2
        L_0x017e:
            int r1 = init
            r2 = r1 ^ 83
            r1 = r1 & 83
            int r1 = r1 << r10
            int r1 = -r1
            int r1 = -r1
            r4 = r2 & r1
            r1 = r1 | r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            onValidated = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L_0x0194
            r2 = r10
            goto L_0x0195
        L_0x0194:
            r2 = r9
        L_0x0195:
            if (r2 == r10) goto L_0x0198
            goto L_0x0199
        L_0x0198:
            int r3 = r3 / r9
        L_0x0199:
            int r1 = r1 + 44
            int r1 = r1 - r10
            int r2 = r1 % 128
            init = r2
            int r1 = r1 % r0
            goto L_0x015e
        L_0x01a2:
            int r12 = onValidated
            r1 = r12 & 79
            int r2 = ~r1
            r12 = r12 | 79
            r12 = r12 & r2
            int r1 = r1 << r10
            r2 = r12 ^ r1
            r12 = r12 & r1
            int r12 = r12 << r10
            int r2 = r2 + r12
            int r12 = r2 % 128
            init = r12
            int r2 = r2 % r0
        L_0x01b5:
            int r12 = onValidated
            r1 = r12 & 17
            r12 = r12 ^ 17
            r12 = r12 | r1
            r2 = r1 ^ r12
            r12 = r12 & r1
            int r12 = r12 << r10
            int r2 = r2 + r12
            int r12 = r2 % 128
            init = r12
            int r2 = r2 % r0
            return r5
        L_0x01c7:
            r12 = move-exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setScrollbarFadingEnabled.getInstance(android.content.Context):java.lang.String");
    }
}
