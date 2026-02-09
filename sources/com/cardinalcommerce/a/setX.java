package com.cardinalcommerce.a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class setX implements Runnable {
    private static int cleanup = 0;
    private static int getSDKVersion = 1;
    private final String Cardinal;
    private final boolean cca_continue;
    private final setTranslationY configure = setTranslationY.cca_continue();
    private final ExecutorService getInstance;
    private final setY init;

    static /* synthetic */ setY cca_continue(setX setx) {
        int i = cleanup;
        boolean z = true;
        int i2 = (i ^ 99) + ((i & 99) << 1);
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            z = false;
        }
        setY sety = setx.init;
        if (z) {
            return sety;
        }
        throw null;
    }

    private static /* synthetic */ void configure(setX setx) {
        int i = getSDKVersion;
        int i2 = (((i ^ 120) + ((i & 120) << 1)) + 0) - 1;
        cleanup = i2 % 128;
        int i3 = i2 % 2;
        setx.Cardinal();
        int i4 = getSDKVersion + 111;
        cleanup = i4 % 128;
        int i5 = i4 % 2;
    }

    public setX(setY sety, String str) {
        this.init = sety;
        this.Cardinal = str;
        this.cca_continue = str.substring(0, 4).equalsIgnoreCase("http");
        this.getInstance = Executors.newFixedThreadPool(5);
    }

    public final void init() {
        boolean z = true;
        int i = (getSDKVersion + 102) - 1;
        cleanup = i % 128;
        int i2 = i % 2;
        this.getInstance.execute(this);
        int i3 = getSDKVersion;
        int i4 = i3 & 113;
        int i5 = -(-((i3 ^ 113) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        cleanup = i6 % 128;
        if (i6 % 2 == 0) {
            z = false;
        }
        if (z) {
            int i7 = 30 / 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Throwable, android.graphics.Bitmap, java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x023b A[SYNTHETIC, Splitter:B:160:0x023b] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0307  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Cardinal() {
        /*
            r11 = this;
            int r0 = getSDKVersion
            r1 = r0 ^ 55
            r2 = r0 & 55
            r1 = r1 | r2
            r3 = 1
            int r1 = r1 << r3
            int r2 = ~r2
            r0 = r0 | 55
            r0 = r0 & r2
            int r1 = r1 - r0
            int r0 = r1 % 128
            cleanup = r0
            int r1 = r1 % 2
            r1 = 35
            r2 = 0
            r4 = 0
            boolean r5 = r11.cca_continue     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            if (r5 != 0) goto L_0x001e
            r5 = r4
            goto L_0x001f
        L_0x001e:
            r5 = r3
        L_0x001f:
            if (r5 == r3) goto L_0x008d
            r5 = r0 ^ 111(0x6f, float:1.56E-43)
            r0 = r0 & 111(0x6f, float:1.56E-43)
            int r0 = r0 << r3
            int r5 = r5 + r0
            int r0 = r5 % 128
            getSDKVersion = r0
            int r5 = r5 % 2
            r0 = 20
            if (r5 != 0) goto L_0x0033
            r5 = r0
            goto L_0x0035
        L_0x0033:
            r5 = 12
        L_0x0035:
            java.lang.String r6 = ","
            if (r5 == r0) goto L_0x0058
            java.lang.String r5 = r11.Cardinal     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            int r6 = r5.indexOf(r6)     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            r7 = r6 & 1
            r6 = r6 | r3
            int r6 = -r6
            int r6 = -r6
            int r6 = ~r6     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            int r7 = r7 - r6
            int r7 = r7 - r3
            java.lang.String r5 = r5.substring(r7)     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            byte[] r5 = android.util.Base64.decode(r5, r4)     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            int r6 = r5.length     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r5, r4, r6)     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
        L_0x0054:
            r11.cca_continue((android.graphics.Bitmap) r5)     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            goto L_0x0077
        L_0x0058:
            java.lang.String r5 = r11.Cardinal     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            int r6 = r5.indexOf(r6)     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            r7 = r6 & 0
            int r8 = ~r7     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            r6 = r6 | r4
            r6 = r6 & r8
            int r7 = r7 << r3
            r8 = r6 ^ r7
            r6 = r6 & r7
            int r6 = r6 << r3
            int r8 = r8 + r6
            java.lang.String r5 = r5.substring(r8)     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            byte[] r5 = android.util.Base64.decode(r5, r4)     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            int r6 = r5.length     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r5, r3, r6)     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            goto L_0x0054
        L_0x0077:
            int r1 = getSDKVersion
            int r1 = r1 + 19
            int r3 = r1 % 128
            cleanup = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0086
            r1 = 50
            goto L_0x0087
        L_0x0086:
            r1 = r0
        L_0x0087:
            if (r1 != r0) goto L_0x008a
            return
        L_0x008a:
            throw r2     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            throw r0
        L_0x008d:
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            java.lang.String r5 = r11.Cardinal     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ Exception -> 0x0236, all -> 0x0232 }
            int r5 = r0.getResponseCode()     // Catch:{ Exception -> 0x022c, all -> 0x0226 }
            r6 = 200(0xc8, float:2.8E-43)
            r7 = 14
            if (r5 == r6) goto L_0x00a7
            r5 = 80
            goto L_0x00a8
        L_0x00a7:
            r5 = r7
        L_0x00a8:
            if (r5 == r7) goto L_0x0115
            int r5 = cleanup
            r6 = r5 & 89
            r5 = r5 ^ 89
            r5 = r5 | r6
            int r5 = -r5
            int r5 = -r5
            int r5 = ~r5
            int r6 = r6 - r5
            int r6 = r6 - r3
            int r5 = r6 % 128
            getSDKVersion = r5
            int r6 = r6 % 2
            r11.cca_continue((android.graphics.Bitmap) r2)     // Catch:{ Exception -> 0x022c, all -> 0x0226 }
            if (r0 == 0) goto L_0x00c3
            r1 = r3
            goto L_0x00c4
        L_0x00c3:
            r1 = r4
        L_0x00c4:
            if (r1 == r3) goto L_0x00c7
            goto L_0x00f3
        L_0x00c7:
            int r1 = getSDKVersion
            int r1 = r1 + 109
            int r2 = r1 % 128
            cleanup = r2
            int r1 = r1 % 2
            r2 = 67
            if (r1 == 0) goto L_0x00d7
            r1 = r2
            goto L_0x00d9
        L_0x00d7:
            r1 = 85
        L_0x00d9:
            if (r1 == r2) goto L_0x00df
            r0.disconnect()
            goto L_0x00e5
        L_0x00df:
            r0.disconnect()
            r0 = 92
            int r0 = r0 / r4
        L_0x00e5:
            int r0 = getSDKVersion
            r1 = r0 & 119(0x77, float:1.67E-43)
            r0 = r0 ^ 119(0x77, float:1.67E-43)
            r0 = r0 | r1
            int r1 = r1 + r0
            int r0 = r1 % 128
            cleanup = r0
            int r1 = r1 % 2
        L_0x00f3:
            int r0 = cleanup
            r1 = r0 & -118(0xffffffffffffff8a, float:NaN)
            int r2 = ~r0
            r2 = r2 & 117(0x75, float:1.64E-43)
            r1 = r1 | r2
            r0 = r0 & 117(0x75, float:1.64E-43)
            int r0 = r0 << r3
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r3
            int r0 = r1 % 128
            getSDKVersion = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x010b
            r0 = r4
            goto L_0x010c
        L_0x010b:
            r0 = r3
        L_0x010c:
            if (r0 == 0) goto L_0x010f
            return
        L_0x010f:
            int r3 = r3 / r4
            return
        L_0x0111:
            r0 = move-exception
            throw r0
        L_0x0113:
            r0 = move-exception
            throw r0
        L_0x0115:
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ Exception -> 0x022c, all -> 0x0226 }
            if (r5 == 0) goto L_0x011d
            r6 = r3
            goto L_0x011e
        L_0x011d:
            r6 = r4
        L_0x011e:
            if (r6 == r3) goto L_0x0181
            r6 = 54
            if (r0 == 0) goto L_0x0126
            r7 = r4
            goto L_0x0127
        L_0x0126:
            r7 = r6
        L_0x0127:
            if (r7 == r6) goto L_0x0148
            int r6 = cleanup
            r7 = r6 & 16
            r6 = r6 | 16
            int r7 = r7 + r6
            int r7 = r7 - r3
            int r6 = r7 % 128
            getSDKVersion = r6
            int r7 = r7 % 2
            r0.disconnect()
            int r0 = cleanup
            r6 = r0 ^ 43
            r0 = r0 & 43
            int r0 = r0 << r3
            int r6 = r6 + r0
            int r0 = r6 % 128
            getSDKVersion = r0
            int r6 = r6 % 2
        L_0x0148:
            r0 = 42
            if (r5 == 0) goto L_0x014d
            goto L_0x014e
        L_0x014d:
            r1 = r0
        L_0x014e:
            if (r1 == r0) goto L_0x02bf
            int r0 = cleanup
            r1 = r0 ^ 31
            r0 = r0 & 31
            int r0 = r0 << r3
            int r1 = r1 + r0
            int r0 = r1 % 128
            getSDKVersion = r0
            int r1 = r1 % 2
            r0 = 70
            if (r1 != 0) goto L_0x0164
            r1 = r0
            goto L_0x0166
        L_0x0164:
            r1 = 15
        L_0x0166:
            if (r1 == r0) goto L_0x017b
            r5.close()     // Catch:{ IOException -> 0x02bb }
            int r0 = cleanup
            r1 = r0 ^ 123(0x7b, float:1.72E-43)
            r0 = r0 & 123(0x7b, float:1.72E-43)
            int r0 = r0 << r3
            int r1 = r1 + r0
            int r0 = r1 % 128
            getSDKVersion = r0
            int r1 = r1 % 2
            goto L_0x02bf
        L_0x017b:
            r5.close()     // Catch:{ IOException -> 0x02bb }
            throw r2     // Catch:{ all -> 0x017f }
        L_0x017f:
            r0 = move-exception
            throw r0
        L_0x0181:
            int r6 = getSDKVersion
            int r6 = r6 + 7
            int r7 = r6 % 128
            cleanup = r7
            int r6 = r6 % 2
            r7 = 82
            if (r6 == 0) goto L_0x0191
            r6 = r7
            goto L_0x0193
        L_0x0191:
            r6 = 75
        L_0x0193:
            if (r6 == r7) goto L_0x0219
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ Exception -> 0x0213, all -> 0x020d }
            r11.cca_continue((android.graphics.Bitmap) r6)     // Catch:{ Exception -> 0x0213, all -> 0x020d }
            if (r0 == 0) goto L_0x01a0
            r6 = r3
            goto L_0x01a1
        L_0x01a0:
            r6 = r4
        L_0x01a1:
            if (r6 == 0) goto L_0x01b6
            r0.disconnect()
            int r0 = getSDKVersion
            r6 = r0 & 21
            int r7 = ~r6
            r0 = r0 | 21
            r0 = r0 & r7
            int r6 = r6 << r3
            int r0 = r0 + r6
            int r6 = r0 % 128
            cleanup = r6
            int r0 = r0 % 2
        L_0x01b6:
            r0 = 60
            if (r5 == 0) goto L_0x01bb
            goto L_0x01bc
        L_0x01bb:
            r1 = r0
        L_0x01bc:
            if (r1 == r0) goto L_0x01f2
            int r0 = getSDKVersion
            r1 = r0 ^ 37
            r0 = r0 & 37
            int r0 = r0 << r3
            int r1 = r1 + r0
            int r0 = r1 % 128
            cleanup = r0
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x01d0
            r0 = r4
            goto L_0x01d1
        L_0x01d0:
            r0 = r3
        L_0x01d1:
            if (r0 == r3) goto L_0x01de
            r5.close()     // Catch:{ IOException -> 0x01dc }
            r0 = 71
            int r0 = r0 / r4
            goto L_0x01e1
        L_0x01da:
            r0 = move-exception
            throw r0
        L_0x01dc:
            r0 = move-exception
            goto L_0x01ef
        L_0x01de:
            r5.close()     // Catch:{ IOException -> 0x01dc }
        L_0x01e1:
            int r0 = getSDKVersion
            r1 = r0 & 19
            r0 = r0 | 19
            int r1 = r1 + r0
            int r0 = r1 % 128
            cleanup = r0
            int r1 = r1 % 2
            return
        L_0x01ef:
            r0.printStackTrace()
        L_0x01f2:
            int r0 = getSDKVersion
            r1 = r0 ^ 125(0x7d, float:1.75E-43)
            r0 = r0 & 125(0x7d, float:1.75E-43)
            int r0 = r0 << r3
            int r1 = r1 + r0
            int r0 = r1 % 128
            cleanup = r0
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0203
            goto L_0x0204
        L_0x0203:
            r4 = r3
        L_0x0204:
            if (r4 != r3) goto L_0x0207
            return
        L_0x0207:
            super.hashCode()     // Catch:{ all -> 0x020b }
            throw r2     // Catch:{ all -> 0x020b }
        L_0x020b:
            r0 = move-exception
            throw r0
        L_0x020d:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r6 = r5
            goto L_0x02e8
        L_0x0213:
            r6 = move-exception
            r10 = r5
            r5 = r0
            r0 = r6
            r6 = r10
            goto L_0x0239
        L_0x0219:
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ Exception -> 0x0213, all -> 0x020d }
            r11.cca_continue((android.graphics.Bitmap) r6)     // Catch:{ Exception -> 0x0213, all -> 0x020d }
            super.hashCode()     // Catch:{ all -> 0x0224 }
            throw r2     // Catch:{ all -> 0x0224 }
        L_0x0224:
            r0 = move-exception
            throw r0
        L_0x0226:
            r1 = move-exception
            r6 = r2
            r2 = r0
            r0 = r1
            goto L_0x02e8
        L_0x022c:
            r5 = move-exception
            r6 = r2
            r10 = r5
            r5 = r0
            r0 = r10
            goto L_0x0239
        L_0x0232:
            r0 = move-exception
            r6 = r2
            goto L_0x02e8
        L_0x0236:
            r0 = move-exception
            r5 = r2
            r6 = r5
        L_0x0239:
            if (r5 == 0) goto L_0x0254
            r5.disconnect()     // Catch:{ all -> 0x02e6 }
            int r7 = cleanup
            r8 = r7 | 35
            int r8 = r8 << r3
            r9 = r7 & -36
            int r7 = ~r7
            r1 = r1 & r7
            r1 = r1 | r9
            int r1 = -r1
            r7 = r8 ^ r1
            r1 = r1 & r8
            int r1 = r1 << r3
            int r7 = r7 + r1
            int r1 = r7 % 128
            getSDKVersion = r1
            int r7 = r7 % 2
        L_0x0254:
            com.cardinalcommerce.a.setTranslationY r1 = r11.configure     // Catch:{ all -> 0x02e6 }
            java.lang.String r7 = "13202"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e6 }
            java.lang.String r9 = "Error downloading bitmap for psImage/issuerImage"
            r8.<init>(r9)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x02e6 }
            java.lang.StringBuilder r0 = r8.append(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02e6 }
            r1.configure((java.lang.String) r7, (java.lang.String) r0, (java.lang.String) r2)     // Catch:{ all -> 0x02e6 }
            if (r5 == 0) goto L_0x0272
            r0 = r4
            goto L_0x0273
        L_0x0272:
            r0 = r3
        L_0x0273:
            if (r0 == r3) goto L_0x0292
            int r0 = getSDKVersion
            r1 = r0 & 105(0x69, float:1.47E-43)
            r0 = r0 | 105(0x69, float:1.47E-43)
            int r1 = r1 + r0
            int r0 = r1 % 128
            cleanup = r0
            int r1 = r1 % 2
            r5.disconnect()
            int r0 = getSDKVersion
            r1 = r0 & 23
            r0 = r0 | 23
            int r1 = r1 + r0
            int r0 = r1 % 128
            cleanup = r0
            int r1 = r1 % 2
        L_0x0292:
            if (r6 == 0) goto L_0x0296
            r0 = r4
            goto L_0x0297
        L_0x0296:
            r0 = r3
        L_0x0297:
            if (r0 == 0) goto L_0x029a
            goto L_0x02bf
        L_0x029a:
            int r0 = getSDKVersion
            r1 = r0 & 29
            r0 = r0 ^ 29
            r0 = r0 | r1
            r5 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r3
            int r5 = r5 + r0
            int r0 = r5 % 128
            cleanup = r0
            int r5 = r5 % 2
            r6.close()     // Catch:{ IOException -> 0x02bb }
            int r0 = getSDKVersion
            int r0 = r0 + 108
            int r0 = r0 - r3
            int r1 = r0 % 128
            cleanup = r1
            int r0 = r0 % 2
            goto L_0x02bf
        L_0x02bb:
            r0 = move-exception
            r0.printStackTrace()
        L_0x02bf:
            r11.cca_continue((android.graphics.Bitmap) r2)
            int r0 = getSDKVersion
            r1 = r0 ^ 13
            r5 = r0 & 13
            r1 = r1 | r5
            int r1 = r1 << r3
            r5 = r0 & -14
            int r0 = ~r0
            r0 = r0 & 13
            r0 = r0 | r5
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r3
            int r0 = r1 % 128
            cleanup = r0
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x02dd
            r4 = r3
        L_0x02dd:
            if (r4 == r3) goto L_0x02e0
            return
        L_0x02e0:
            super.hashCode()     // Catch:{ all -> 0x02e4 }
            throw r2     // Catch:{ all -> 0x02e4 }
        L_0x02e4:
            r0 = move-exception
            throw r0
        L_0x02e6:
            r0 = move-exception
            r2 = r5
        L_0x02e8:
            if (r2 == 0) goto L_0x0301
            r2.disconnect()
            int r1 = getSDKVersion
            r2 = r1 & 43
            int r5 = ~r2
            r1 = r1 | 43
            r1 = r1 & r5
            int r2 = r2 << r3
            r5 = r1 | r2
            int r5 = r5 << r3
            r1 = r1 ^ r2
            int r5 = r5 - r1
            int r1 = r5 % 128
            cleanup = r1
            int r5 = r5 % 2
        L_0x0301:
            if (r6 == 0) goto L_0x0304
            goto L_0x0305
        L_0x0304:
            r4 = r3
        L_0x0305:
            if (r4 == r3) goto L_0x0336
            int r1 = cleanup
            r2 = r1 ^ 10
            r1 = r1 & 10
            int r1 = r1 << r3
            int r2 = r2 + r1
            r1 = r2 & -1
            r2 = r2 | -1
            int r1 = r1 + r2
            int r2 = r1 % 128
            getSDKVersion = r2
            int r1 = r1 % 2
            r6.close()     // Catch:{ IOException -> 0x0332 }
            int r1 = getSDKVersion
            r2 = r1 & 69
            r1 = r1 ^ 69
            r1 = r1 | r2
            int r1 = -r1
            int r1 = -r1
            r4 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << r3
            int r4 = r4 + r1
            int r1 = r4 % 128
            cleanup = r1
            int r4 = r4 % 2
            goto L_0x0336
        L_0x0332:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0336:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setX.Cardinal():void");
    }

    private void cca_continue(Bitmap bitmap) {
        int i = cleanup;
        int i2 = (i ^ 79) + ((i & 79) << 1);
        getSDKVersion = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (cca_continue()) {
                int i4 = cleanup;
                int i5 = (((i4 ^ 96) + ((i4 & 96) << 1)) - 0) - 1;
                getSDKVersion = i5 % 128;
                int i6 = i5 % 2;
                int i7 = ((i4 | 63) << 1) - (i4 ^ 63);
                getSDKVersion = i7 % 128;
                int i8 = i7 % 2;
                bitmap = null;
            }
            setY sety = this.init;
            if (sety != null) {
                int i9 = getSDKVersion;
                int i10 = i9 & 27;
                int i11 = i10 + ((i9 ^ 27) | i10);
                cleanup = i11 % 128;
                int i12 = i11 % 2;
                if (bitmap != null) {
                    final Bitmap configure2 = configure(bitmap, sety.getWidth(), this.init.getHeight());
                    this.init.post(new Runnable() {
                        private static int Cardinal = 0;
                        private static int init = 1;

                        public final void run() {
                            int i = init + 43;
                            Cardinal = i % 128;
                            int i2 = i % 2;
                            setX.cca_continue(setX.this).setCCAImageBitmap(configure2);
                            boolean z = true;
                            setX.cca_continue(setX.this).setAdjustViewBounds(true);
                            int i3 = init;
                            int i4 = (((i3 | 54) << 1) - (i3 ^ 54)) - 1;
                            Cardinal = i4 % 128;
                            if (i4 % 2 == 0) {
                                z = false;
                            }
                            if (z) {
                                throw null;
                            }
                        }
                    });
                    int i13 = getSDKVersion;
                    int i14 = (i13 & 101) + (i13 | 101);
                    cleanup = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 98 / 0;
                        return;
                    }
                    return;
                }
                this.configure.configure("10613", "Error downloading image", (String) null);
                this.init.setVisibility(4);
                int i16 = cleanup;
                int i17 = i16 & 119;
                int i18 = i17 + ((i16 ^ 119) | i17);
                getSDKVersion = i18 % 128;
                int i19 = i18 % 2;
            }
            int i20 = cleanup;
            int i21 = (i20 & 95) + (i20 | 95);
            getSDKVersion = i21 % 128;
            int i22 = i21 % 2;
        } catch (Exception e) {
            this.configure.configure("13202", new StringBuilder(ThreeDSStrings.COMMON_MODULE_BITMAP_DOWNLOAD_EXCEPTION_MESSAGE).append(e.getLocalizedMessage()).toString(), (String) null);
        }
    }

    private static Bitmap configure(Bitmap bitmap, int i, int i2) {
        int i3 = getSDKVersion;
        int i4 = (i3 & 40) + (i3 | 40);
        int i5 = (i4 ^ -1) + ((i4 & -1) << 1);
        cleanup = i5 % 128;
        if ((i5 % 2 != 0 ? '!' : 24) != '!') {
            boolean z = false;
            if (bitmap.getByteCount() >= 100000) {
                Matrix matrix = new Matrix();
                float width = ((float) i) / ((float) bitmap.getWidth());
                float height = ((float) i2) / ((float) bitmap.getHeight());
                if (i > i2) {
                    z = true;
                }
                if (!z) {
                    matrix.postScale(height, height);
                    int i6 = getSDKVersion;
                    int i7 = (i6 ^ 121) + ((i6 & 121) << 1);
                    cleanup = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    int i9 = cleanup;
                    int i10 = i9 & 91;
                    int i11 = ((i9 ^ 91) | i10) << 1;
                    int i12 = -((i9 | 91) & (~i10));
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    getSDKVersion = i13 % 128;
                    int i14 = i13 % 2;
                    matrix.postScale(width, width);
                    int i15 = cleanup;
                    int i16 = ((i15 ^ 29) | (i15 & 29)) << 1;
                    int i17 = -(((~i15) & 29) | (i15 & -30));
                    int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                    getSDKVersion = i18 % 128;
                    int i19 = i18 % 2;
                }
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                int i20 = cleanup;
                int i21 = (i20 & -30) | ((~i20) & 29);
                int i22 = (29 & i20) << 1;
                int i23 = (i21 & i22) + (i22 | i21);
                getSDKVersion = i23 % 128;
                int i24 = i23 % 2;
                return createBitmap;
            }
            int i25 = ((cleanup + 23) - 1) - 1;
            getSDKVersion = i25 % 128;
            if (i25 % 2 != 0) {
                return bitmap;
            }
            int i26 = 45 / 0;
            return bitmap;
        }
        bitmap.getByteCount();
        throw null;
    }

    private boolean cca_continue() {
        int i = cleanup;
        int i2 = (i & -28) | ((~i) & 27);
        boolean z = true;
        int i3 = (i & 27) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getSDKVersion = i4 % 128;
        int i5 = i4 % 2;
        boolean isShutdown = this.getInstance.isShutdown();
        int i6 = (cleanup + 124) - 1;
        getSDKVersion = i6 % 128;
        if (i6 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return isShutdown;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final void run() {
        int i = getSDKVersion;
        int i2 = i & 51;
        int i3 = i2 - (~(-(-((i ^ 51) | i2))));
        boolean z = true;
        int i4 = i3 - 1;
        cleanup = i4 % 128;
        if (i4 % 2 == 0) {
            z = false;
        }
        configure(this);
        if (z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }
}
