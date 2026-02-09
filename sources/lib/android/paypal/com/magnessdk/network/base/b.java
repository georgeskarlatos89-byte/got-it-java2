package lib.android.paypal.com.magnessdk.network.base;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;

class b implements MagnesNetworking {
    private final f a = a();
    private byte[] b;
    private String c = null;
    private Uri d;
    private Map<String, String> e = new HashMap();

    private f a() throws SSLException {
        return f.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int execute(byte[] r9) {
        /*
            r8 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00d3, all -> 0x00cf }
            android.net.Uri r2 = r8.d     // Catch:{ Exception -> 0x00d3, all -> 0x00cf }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00d3, all -> 0x00cf }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00d3, all -> 0x00cf }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x00d3, all -> 0x00cf }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ Exception -> 0x00d3, all -> 0x00cf }
            lib.android.paypal.com.magnessdk.c$h$a r2 = lib.android.paypal.com.magnessdk.c.h.a.HTTP_READ_TIMEOUT     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            int r2 = r2.a()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            r1.setReadTimeout(r2)     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            lib.android.paypal.com.magnessdk.c$h$a r2 = lib.android.paypal.com.magnessdk.c.h.a.HTTP_CONNECT_TIMEOUT     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            int r2 = r2.a()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            r1.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            lib.android.paypal.com.magnessdk.c$h$b r2 = lib.android.paypal.com.magnessdk.c.h.b.POST     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            r1.setRequestMethod(r2)     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            lib.android.paypal.com.magnessdk.network.base.f r2 = r8.a     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            r1.setSSLSocketFactory(r2)     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            r2 = 1
            r1.setDoOutput(r2)     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            int r2 = r9.length     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            r1.setFixedLengthStreamingMode(r2)     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r8.e     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
        L_0x0044:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            r1.setRequestProperty(r4, r3)     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            goto L_0x0044
        L_0x0064:
            java.io.OutputStream r2 = r1.getOutputStream()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            r2.write(r9)     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            r2.flush()     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            int r9 = r1.getResponseCode()     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            java.lang.String r3 = "correlation-id"
            java.lang.String r3 = r1.getHeaderField(r3)     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            r8.c = r3     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 0
            if (r9 != r3) goto L_0x00ac
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            java.io.InputStream r5 = r1.getInputStream()     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            lib.android.paypal.com.magnessdk.c$h$a r0 = lib.android.paypal.com.magnessdk.c.h.a.READ_BYTE     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            int r0 = r0.a()     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            r5.<init>()     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
        L_0x0095:
            int r6 = r3.read(r0)     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            r7 = -1
            if (r6 == r7) goto L_0x00a0
            r5.write(r0, r4, r6)     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            goto L_0x0095
        L_0x00a0:
            byte[] r0 = r5.toByteArray()     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            r8.b = r0     // Catch:{ Exception -> 0x00aa, all -> 0x00a8 }
            r0 = r3
            goto L_0x00b0
        L_0x00a8:
            r9 = move-exception
            goto L_0x00fc
        L_0x00aa:
            r9 = move-exception
            goto L_0x00d7
        L_0x00ac:
            byte[] r3 = new byte[r4]     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            r8.b = r3     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
        L_0x00b0:
            java.lang.Class r3 = r8.getClass()
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r3, (java.io.Closeable) r0)
            java.lang.Class r0 = r8.getClass()
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r0, (java.io.Closeable) r2)
            r1.disconnect()
            return r9
        L_0x00c2:
            r9 = move-exception
            r3 = r0
            goto L_0x00ca
        L_0x00c5:
            r9 = move-exception
            goto L_0x00d6
        L_0x00c7:
            r9 = move-exception
            r2 = r0
            r3 = r2
        L_0x00ca:
            r0 = r1
            goto L_0x00fb
        L_0x00cc:
            r9 = move-exception
            r2 = r0
            goto L_0x00d6
        L_0x00cf:
            r9 = move-exception
            r2 = r0
            r3 = r2
            goto L_0x00fb
        L_0x00d3:
            r9 = move-exception
            r1 = r0
            r2 = r1
        L_0x00d6:
            r3 = r0
        L_0x00d7:
            r0 = r1
            java.lang.Class r1 = r8.getClass()     // Catch:{ all -> 0x00fa }
            r4 = 3
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) r1, (int) r4, (java.lang.Throwable) r9)     // Catch:{ all -> 0x00fa }
            lib.android.paypal.com.magnessdk.c$h$c r9 = lib.android.paypal.com.magnessdk.c.h.C0006c.HTTP_STATUS_FAILED     // Catch:{ all -> 0x00fa }
            int r9 = r9.a()     // Catch:{ all -> 0x00fa }
            java.lang.Class r1 = r8.getClass()
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r1, (java.io.Closeable) r3)
            java.lang.Class r1 = r8.getClass()
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r1, (java.io.Closeable) r2)
            if (r0 == 0) goto L_0x00f9
            r0.disconnect()
        L_0x00f9:
            return r9
        L_0x00fa:
            r9 = move-exception
        L_0x00fb:
            r1 = r0
        L_0x00fc:
            java.lang.Class r0 = r8.getClass()
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r0, (java.io.Closeable) r3)
            java.lang.Class r0 = r8.getClass()
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r0, (java.io.Closeable) r2)
            if (r1 == 0) goto L_0x010f
            r1.disconnect()
        L_0x010f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.network.base.b.execute(byte[]):int");
    }

    public String getPayPalDebugId() {
        return this.c;
    }

    public byte[] getResponseContent() {
        return this.b;
    }

    public void setHeader(Map<String, String> map) {
        this.e = map;
    }

    public void setUri(Uri uri) {
        this.d = uri;
    }
}
