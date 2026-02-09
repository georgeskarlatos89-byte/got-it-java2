package com.cardinalcommerce.a;

import javax.crypto.SecretKey;

final class setAutofillHints {
    private static setAutofillHints Cardinal = null;
    private static int getWarnings = 0;
    private static int onCReqSuccess = 1;
    SecretKey cca_continue;
    private char[] cleanup;
    private char[] configure;
    int getInstance = 0;
    getActionCode init;

    private setAutofillHints() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (Cardinal == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        if (Cardinal == null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.cardinalcommerce.a.setAutofillHints init() {
        /*
            java.lang.Class<com.cardinalcommerce.a.setAutofillHints> r0 = com.cardinalcommerce.a.setAutofillHints.class
            monitor-enter(r0)
            int r1 = onCReqSuccess     // Catch:{ all -> 0x0064 }
            r2 = r1 & 67
            r1 = r1 | 67
            int r2 = r2 + r1
            int r1 = r2 % 128
            getWarnings = r1     // Catch:{ all -> 0x0064 }
            int r2 = r2 % 2
            r1 = 32
            if (r2 == 0) goto L_0x0017
            r2 = 73
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            r3 = 0
            r4 = 1
            if (r2 == r1) goto L_0x0026
            com.cardinalcommerce.a.setAutofillHints r1 = Cardinal     // Catch:{ all -> 0x0064 }
            r2 = 71
            int r2 = r2 / r3
            if (r1 != 0) goto L_0x004a
            goto L_0x002a
        L_0x0024:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0026:
            com.cardinalcommerce.a.setAutofillHints r1 = Cardinal     // Catch:{ all -> 0x0064 }
            if (r1 != 0) goto L_0x004a
        L_0x002a:
            com.cardinalcommerce.a.setAutofillHints r1 = new com.cardinalcommerce.a.setAutofillHints     // Catch:{ all -> 0x0064 }
            r1.<init>()     // Catch:{ all -> 0x0064 }
            Cardinal = r1     // Catch:{ all -> 0x0064 }
            int r1 = getWarnings     // Catch:{ all -> 0x0064 }
            r2 = r1 & -88
            int r5 = ~r1     // Catch:{ all -> 0x0064 }
            r5 = r5 & 87
            r2 = r2 | r5
            r1 = r1 & 87
            int r1 = r1 << r4
            int r1 = ~r1     // Catch:{ all -> 0x0064 }
            int r2 = r2 - r1
            int r2 = r2 - r4
            int r1 = r2 % 128
            onCReqSuccess = r1     // Catch:{ all -> 0x0064 }
            int r2 = r2 % 2
            if (r2 != 0) goto L_0x0049
            r1 = r3
            goto L_0x004a
        L_0x0049:
            r1 = r4
        L_0x004a:
            com.cardinalcommerce.a.setAutofillHints r1 = Cardinal     // Catch:{ all -> 0x0064 }
            int r2 = onCReqSuccess     // Catch:{ all -> 0x0064 }
            r5 = r2 & 49
            r2 = r2 | 49
            int r5 = r5 + r2
            int r2 = r5 % 128
            getWarnings = r2     // Catch:{ all -> 0x0064 }
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x005c
            r3 = r4
        L_0x005c:
            if (r3 != 0) goto L_0x0060
            monitor-exit(r0)
            return r1
        L_0x0060:
            r1 = 0
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setAutofillHints.init():com.cardinalcommerce.a.setAutofillHints");
    }

    public final getActionCode Cardinal() {
        int i = (onCReqSuccess + 14) - 1;
        int i2 = i % 128;
        getWarnings = i2;
        int i3 = i % 2;
        getActionCode getactioncode = this.init;
        int i4 = (i2 & 9) + (i2 | 9);
        onCReqSuccess = i4 % 128;
        if ((i4 % 2 == 0 ? '.' : '>') == '>') {
            return getactioncode;
        }
        throw null;
    }

    public static void getInstance() {
        int i = getWarnings;
        int i2 = (i ^ 95) + ((i & 95) << 1);
        onCReqSuccess = i2 % 128;
        char c = i2 % 2 == 0 ? '5' : '7';
        Cardinal = null;
        if (c == '7') {
            int i3 = ((i + 19) - 1) - 1;
            onCReqSuccess = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        throw null;
    }

    public final char[] configure() {
        char[] cArr;
        int i = onCReqSuccess;
        int i2 = i & 49;
        int i3 = -(-((i ^ 49) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        getWarnings = i5;
        if ((i4 % 2 != 0 ? (char) 22 : 12) != 12) {
            cArr = this.configure;
            int i6 = 68 / 0;
        } else {
            cArr = this.configure;
        }
        int i7 = (i5 ^ 109) + ((i5 & 109) << 1);
        onCReqSuccess = i7 % 128;
        if ((i7 % 2 == 0 ? (char) 20 : 24) != 20) {
            return cArr;
        }
        int i8 = 70 / 0;
        return cArr;
    }

    public final void configure(char[] cArr) {
        int i = getWarnings;
        int i2 = i & 3;
        boolean z = true;
        int i3 = ((~i2) & (i | 3)) + (i2 << 1);
        onCReqSuccess = i3 % 128;
        boolean z2 = i3 % 2 != 0;
        this.configure = cArr;
        if (!z2) {
            int i4 = 20 / 0;
        }
        int i5 = ((i | 109) << 1) - (i ^ 109);
        onCReqSuccess = i5 % 128;
        if (i5 % 2 == 0) {
            z = false;
        }
        if (!z) {
            int i6 = 88 / 0;
        }
    }

    public final char[] cca_continue() {
        int i = onCReqSuccess;
        int i2 = (i | 31) << 1;
        int i3 = -(i ^ 31);
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        getWarnings = i5;
        int i6 = i4 % 2;
        char[] cArr = this.cleanup;
        int i7 = (i5 & 37) + (i5 | 37);
        onCReqSuccess = i7 % 128;
        int i8 = i7 % 2;
        return cArr;
    }

    public final void cca_continue(char[] cArr) {
        int i = getWarnings;
        int i2 = i & 47;
        int i3 = i | 47;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        onCReqSuccess = i5;
        int i6 = i4 % 2;
        this.cleanup = cArr;
        int i7 = i5 & 103;
        int i8 = -(-(i5 | 103));
        int i9 = (i7 & i8) + (i7 | i8);
        getWarnings = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }
}
