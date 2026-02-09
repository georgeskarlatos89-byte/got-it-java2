package com.cardinalcommerce.a;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStreamWriter;

class setOutlineAmbientShadowColor {
    private static int cca_continue = 1;
    private static int getInstance;
    private Context Cardinal = setOutlineSpotShadowColor.cca_continue();
    private final String configure = "setOutlineAmbientShadowColor";
    private final String init = "cca_logs.txt";

    setOutlineAmbientShadowColor() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
        if ((r4 == null) != true) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f2, code lost:
        if ((r4 != null ? '$' : org.objectweb.asm.signature.SignatureVisitor.EXTENDS) != '$') goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010a, code lost:
        r4 = getInstance;
        r5 = (r4 & -118) | ((~r4) & 117);
        r4 = (r4 & 117) << 1;
        r6 = (r5 ^ r4) + ((r4 & r5) << 1);
        cca_continue = r6 % 128;
        r6 = r6 % 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String configure() {
        /*
            r11 = this;
            java.lang.String r0 = ""
            r1 = 29
            r2 = 0
            r3 = 1
            android.content.Context r4 = r11.Cardinal     // Catch:{ IOException -> 0x014a }
            java.lang.String r5 = "cca_logs.txt"
            java.io.FileInputStream r4 = r4.openFileInput(r5)     // Catch:{ IOException -> 0x014a }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x012b }
            r5.<init>(r4)     // Catch:{ all -> 0x012b }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0121 }
            r6.<init>(r5)     // Catch:{ all -> 0x0121 }
            if (r4 == 0) goto L_0x008b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r7.<init>()     // Catch:{ all -> 0x0081 }
            int r8 = cca_continue
            int r8 = r8 + 32
            int r8 = r8 - r3
            int r9 = r8 % 128
            getInstance = r9
            int r8 = r8 % 2
        L_0x002a:
            java.lang.String r8 = r6.readLine()     // Catch:{ all -> 0x0081 }
            r9 = 63
            if (r8 == 0) goto L_0x0034
            r10 = r9
            goto L_0x0036
        L_0x0034:
            r10 = 56
        L_0x0036:
            if (r10 == r9) goto L_0x0055
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0081 }
            int r7 = getInstance
            r8 = r7 ^ 81
            r9 = r7 & 81
            r8 = r8 | r9
            int r8 = r8 << r3
            int r9 = ~r9
            r7 = r7 | 81
            r7 = r7 & r9
            int r7 = -r7
            r9 = r8 | r7
            int r9 = r9 << r3
            r7 = r7 ^ r8
            int r9 = r9 - r7
            int r7 = r9 % 128
            cca_continue = r7
            int r9 = r9 % 2
            goto L_0x008b
        L_0x0055:
            int r9 = getInstance
            r10 = r9 | 6
            int r10 = r10 << r3
            r9 = r9 ^ 6
            int r10 = r10 - r9
            r9 = r10 | -1
            int r9 = r9 << r3
            r10 = r10 ^ -1
            int r9 = r9 - r10
            int r10 = r9 % 128
            cca_continue = r10
            int r9 = r9 % 2
            java.lang.StringBuilder r8 = r7.append(r8)     // Catch:{ all -> 0x0081 }
            java.lang.String r9 = "\n"
            r8.append(r9)     // Catch:{ all -> 0x0081 }
            int r8 = cca_continue
            r9 = r8 ^ 101(0x65, float:1.42E-43)
            r8 = r8 & 101(0x65, float:1.42E-43)
            int r8 = r8 << r3
            int r9 = r9 + r8
            int r8 = r9 % 128
            getInstance = r8
            int r9 = r9 % 2
            goto L_0x002a
        L_0x0081:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r6 = move-exception
            r7.addSuppressed(r6)     // Catch:{ all -> 0x0121 }
        L_0x008a:
            throw r7     // Catch:{ all -> 0x0121 }
        L_0x008b:
            r6.close()     // Catch:{ all -> 0x0121 }
            int r6 = cca_continue
            r7 = r6 & 109(0x6d, float:1.53E-43)
            r6 = r6 ^ 109(0x6d, float:1.53E-43)
            r6 = r6 | r7
            r8 = r7 | r6
            int r8 = r8 << r3
            r6 = r6 ^ r7
            int r8 = r8 - r6
            int r6 = r8 % 128
            getInstance = r6
            int r8 = r8 % 2
            int r6 = r6 + 100
            r7 = r6 & -1
            r6 = r6 | -1
            int r7 = r7 + r6
            int r6 = r7 % 128
            cca_continue = r6
            int r7 = r7 % 2
            r5.close()     // Catch:{ all -> 0x012b }
            int r5 = getInstance
            r6 = r5 & 47
            int r7 = ~r6
            r5 = r5 | 47
            r5 = r5 & r7
            int r6 = r6 << r3
            r7 = r5 ^ r6
            r5 = r5 & r6
            int r5 = r5 << r3
            int r7 = r7 + r5
            int r5 = r7 % 128
            cca_continue = r5
            int r7 = r7 % 2
            r6 = r5 & 104(0x68, float:1.46E-43)
            r5 = r5 | 104(0x68, float:1.46E-43)
            int r6 = r6 + r5
            r5 = r6 & -1
            r6 = r6 | -1
            int r5 = r5 + r6
            int r6 = r5 % 128
            getInstance = r6
            int r5 = r5 % 2
            r7 = 8
            if (r5 == 0) goto L_0x00da
            r5 = r1
            goto L_0x00db
        L_0x00da:
            r5 = r7
        L_0x00db:
            if (r5 == r7) goto L_0x00ea
            r5 = 64
            int r5 = r5 / r2
            if (r4 == 0) goto L_0x00e4
            r5 = r2
            goto L_0x00e5
        L_0x00e4:
            r5 = r3
        L_0x00e5:
            if (r5 == r3) goto L_0x00f4
            goto L_0x0107
        L_0x00e8:
            r0 = move-exception
            throw r0
        L_0x00ea:
            r5 = 36
            if (r4 == 0) goto L_0x00f0
            r7 = r5
            goto L_0x00f2
        L_0x00f0:
            r7 = 43
        L_0x00f2:
            if (r7 == r5) goto L_0x0107
        L_0x00f4:
            r4 = r6 | 82
            int r4 = r4 << r3
            r5 = r6 ^ 82
            int r4 = r4 - r5
            r5 = r4 | -1
            int r5 = r5 << r3
            r4 = r4 ^ -1
            int r5 = r5 - r4
            int r4 = r5 % 128
            cca_continue = r4
            int r5 = r5 % 2
            goto L_0x0163
        L_0x0107:
            r4.close()     // Catch:{ IOException -> 0x014a }
            int r4 = getInstance
            r5 = r4 & -118(0xffffffffffffff8a, float:NaN)
            int r6 = ~r4
            r6 = r6 & 117(0x75, float:1.64E-43)
            r5 = r5 | r6
            r4 = r4 & 117(0x75, float:1.64E-43)
            int r4 = r4 << r3
            r6 = r5 ^ r4
            r4 = r4 & r5
            int r4 = r4 << r3
            int r6 = r6 + r4
            int r4 = r6 % 128
            cca_continue = r4
            int r6 = r6 % 2
            goto L_0x0163
        L_0x0121:
            r6 = move-exception
            r5.close()     // Catch:{ all -> 0x0126 }
            goto L_0x012a
        L_0x0126:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch:{ all -> 0x012b }
        L_0x012a:
            throw r6     // Catch:{ all -> 0x012b }
        L_0x012b:
            r5 = move-exception
            if (r4 == 0) goto L_0x0149
            r4.close()     // Catch:{ all -> 0x0145 }
            int r4 = getInstance
            r6 = r4 ^ 19
            r7 = r4 & 19
            r6 = r6 | r7
            int r6 = r6 << r3
            int r7 = ~r7
            r4 = r4 | 19
            r4 = r4 & r7
            int r6 = r6 - r4
            int r4 = r6 % 128
            cca_continue = r4
            int r6 = r6 % 2
            goto L_0x0149
        L_0x0145:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch:{ IOException -> 0x014a }
        L_0x0149:
            throw r5     // Catch:{ IOException -> 0x014a }
        L_0x014a:
            r4 = move-exception
            java.lang.String r5 = r11.configure
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Exception during closing log file. Error: "
            r6.<init>(r7)
            java.lang.String r4 = r4.getLocalizedMessage()
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r5, r4)
        L_0x0163:
            java.lang.String r0 = r0.trim()
            int r4 = getInstance
            r5 = r4 | 29
            int r5 = r5 << r3
            r1 = r1 ^ r4
            int r5 = r5 - r1
            int r1 = r5 % 128
            cca_continue = r1
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x0178
            r1 = r3
            goto L_0x0179
        L_0x0178:
            r1 = r2
        L_0x0179:
            if (r1 == r3) goto L_0x017c
            return r0
        L_0x017c:
            r1 = 91
            int r1 = r1 / r2
            return r0
        L_0x0180:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setOutlineAmbientShadowColor.configure():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final void configure(String str) {
        int i = cca_continue;
        int i2 = i & 17;
        boolean z = true;
        int i3 = ((i ^ 17) | i2) << 1;
        int i4 = -((i | 17) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        getInstance = i5 % 128;
        boolean z2 = i5 % 2 != 0;
        Throwable th = null;
        getInstance(str);
        if (!z2) {
            int i6 = cca_continue;
            int i7 = (i6 & 95) + (i6 | 95);
            getInstance = i7 % 128;
            if (i7 % 2 == 0) {
                z = false;
            }
            if (z) {
                throw th;
            }
            return;
        }
        super.hashCode();
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void init() {
        int i = cca_continue;
        int i2 = (i ^ 75) + ((i & 75) << 1);
        getInstance = i2 % 128;
        char c = i2 % 2 != 0 ? 30 : 'E';
        getInstance("");
        if (c == 30) {
            int i3 = 1 / 0;
        }
    }

    private void getInstance(String str) {
        OutputStreamWriter outputStreamWriter;
        try {
            boolean z = false;
            outputStreamWriter = new OutputStreamWriter(this.Cardinal.openFileOutput("cca_logs.txt", 0));
            outputStreamWriter.append(str);
            outputStreamWriter.close();
            int i = getInstance;
            int i2 = (i ^ 17) + ((i & 17) << 1);
            cca_continue = i2 % 128;
            if (i2 % 2 == 0) {
                z = true;
            }
            if (z) {
                Throwable th = null;
                super.hashCode();
                throw th;
            }
            return;
        } catch (IOException e) {
            Log.e(this.configure, new StringBuilder("Exception during adding to log file. Error: ").append(e.getLocalizedMessage()).toString());
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
