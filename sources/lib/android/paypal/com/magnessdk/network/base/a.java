package lib.android.paypal.com.magnessdk.network.base;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;

class a implements MagnesNetworking {
    private final f a = a();
    private byte[] b;
    private String c = null;
    private Uri d;
    private Map<String, String> e = new HashMap();

    public f a() throws SSLException {
        return f.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int execute(byte[] r9) {
        /*
            r8 = this;
            r9 = 0
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x00b4, all -> 0x00b0 }
            android.net.Uri r1 = r8.d     // Catch:{ Exception -> 0x00b4, all -> 0x00b0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00b4, all -> 0x00b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00b4, all -> 0x00b0 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x00b4, all -> 0x00b0 }
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ Exception -> 0x00b4, all -> 0x00b0 }
            lib.android.paypal.com.magnessdk.c$h$a r1 = lib.android.paypal.com.magnessdk.c.h.a.HTTP_READ_TIMEOUT     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            int r1 = r1.a()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r0.setReadTimeout(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            lib.android.paypal.com.magnessdk.c$h$a r1 = lib.android.paypal.com.magnessdk.c.h.a.HTTP_CONNECT_TIMEOUT     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            int r1 = r1.a()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r0.setConnectTimeout(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            lib.android.paypal.com.magnessdk.c$h$b r1 = lib.android.paypal.com.magnessdk.c.h.b.GET     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r0.setRequestMethod(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.e     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.util.Set r1 = r1.entrySet()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
        L_0x0037:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Object r3 = r2.getKey()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r0.setRequestProperty(r3, r2)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            goto L_0x0037
        L_0x0057:
            int r1 = r0.getResponseCode()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r2 = "correlation-id"
            java.lang.String r2 = r0.getHeaderField(r2)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r8.c = r2     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 0
            if (r1 != r2) goto L_0x0094
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.io.InputStream r4 = r0.getInputStream()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r2.<init>(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            lib.android.paypal.com.magnessdk.c$h$a r4 = lib.android.paypal.com.magnessdk.c.h.a.READ_BYTE     // Catch:{ Exception -> 0x0092 }
            int r4 = r4.a()     // Catch:{ Exception -> 0x0092 }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0092 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0092 }
            r5.<init>()     // Catch:{ Exception -> 0x0092 }
        L_0x007e:
            int r6 = r2.read(r4)     // Catch:{ Exception -> 0x0092 }
            r7 = -1
            if (r6 == r7) goto L_0x0089
            r5.write(r4, r3, r6)     // Catch:{ Exception -> 0x0092 }
            goto L_0x007e
        L_0x0089:
            byte[] r3 = r5.toByteArray()     // Catch:{ Exception -> 0x0092 }
            r8.b = r3     // Catch:{ Exception -> 0x0092 }
            goto L_0x0099
        L_0x0090:
            r1 = move-exception
            goto L_0x00d9
        L_0x0092:
            r1 = move-exception
            goto L_0x00b7
        L_0x0094:
            byte[] r2 = new byte[r3]     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r8.b = r2     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r2 = r9
        L_0x0099:
            java.lang.Class r3 = r8.getClass()
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r3, (java.io.Closeable) r2)
            java.lang.Class r2 = r8.getClass()
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r2, (java.io.Closeable) r9)
            r0.disconnect()
            return r1
        L_0x00ab:
            r1 = move-exception
            r2 = r9
            goto L_0x00d9
        L_0x00ae:
            r1 = move-exception
            goto L_0x00b6
        L_0x00b0:
            r1 = move-exception
            r0 = r9
            r2 = r0
            goto L_0x00d9
        L_0x00b4:
            r1 = move-exception
            r0 = r9
        L_0x00b6:
            r2 = r9
        L_0x00b7:
            java.lang.Class r3 = r8.getClass()     // Catch:{ all -> 0x0090 }
            r4 = 3
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) r3, (int) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0090 }
            lib.android.paypal.com.magnessdk.c$h$c r1 = lib.android.paypal.com.magnessdk.c.h.C0006c.HTTP_STATUS_FAILED     // Catch:{ all -> 0x0090 }
            int r1 = r1.a()     // Catch:{ all -> 0x0090 }
            java.lang.Class r3 = r8.getClass()
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r3, (java.io.Closeable) r2)
            java.lang.Class r2 = r8.getClass()
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r2, (java.io.Closeable) r9)
            if (r0 == 0) goto L_0x00d8
            r0.disconnect()
        L_0x00d8:
            return r1
        L_0x00d9:
            java.lang.Class r3 = r8.getClass()
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r3, (java.io.Closeable) r2)
            java.lang.Class r2 = r8.getClass()
            lib.android.paypal.com.magnessdk.f.a((java.lang.Class<?>) r2, (java.io.Closeable) r9)
            if (r0 == 0) goto L_0x00ec
            r0.disconnect()
        L_0x00ec:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.network.base.a.execute(byte[]):int");
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
