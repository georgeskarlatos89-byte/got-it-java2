package com.cardinalcommerce.dependencies.internal.bouncycastle.util.io.pem;

import java.io.BufferedReader;
import java.io.Reader;

public class PemReader extends BufferedReader {
    public PemReader(Reader reader) {
        super(reader);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final com.cardinalcommerce.dependencies.internal.bouncycastle.util.io.pem.PemObject cca_continue() throws java.io.IOException {
        /*
            r8 = this;
        L_0x0000:
            java.lang.String r0 = r8.readLine()
            if (r0 == 0) goto L_0x000f
            java.lang.String r1 = "-----BEGIN "
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L_0x000f
            goto L_0x0000
        L_0x000f:
            if (r0 == 0) goto L_0x009b
            r1 = 11
            java.lang.String r0 = r0.substring(r1)
            r1 = 45
            int r1 = r0.indexOf(r1)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            if (r1 <= 0) goto L_0x009b
            java.lang.String r1 = "-----END "
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r1.concat(r3)
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0038:
            java.lang.String r5 = r8.readLine()
            if (r5 == 0) goto L_0x0072
            java.lang.String r6 = ":"
            int r6 = r5.indexOf(r6)
            if (r6 < 0) goto L_0x0063
            r6 = 58
            int r6 = r5.indexOf(r6)
            java.lang.String r7 = r5.substring(r2, r6)
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)
            java.lang.String r5 = r5.trim()
            com.cardinalcommerce.a.dismiss r6 = new com.cardinalcommerce.a.dismiss
            r6.<init>(r7, r5)
            r4.add(r6)
            goto L_0x0038
        L_0x0063:
            int r6 = r5.indexOf(r1)
            r7 = -1
            if (r6 != r7) goto L_0x0072
            java.lang.String r5 = r5.trim()
            r3.append(r5)
            goto L_0x0038
        L_0x0072:
            if (r5 == 0) goto L_0x0082
            com.cardinalcommerce.dependencies.internal.bouncycastle.util.io.pem.PemObject r1 = new com.cardinalcommerce.dependencies.internal.bouncycastle.util.io.pem.PemObject
            java.lang.String r2 = r3.toString()
            byte[] r2 = com.cardinalcommerce.a.setTextColor.getInstance(r2)
            r1.<init>(r0, r4, r2)
            return r1
        L_0x0082:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " not found"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.util.io.pem.PemReader.cca_continue():com.cardinalcommerce.dependencies.internal.bouncycastle.util.io.pem.PemObject");
    }
}
