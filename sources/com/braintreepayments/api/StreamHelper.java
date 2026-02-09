package com.braintreepayments.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/braintreepayments/api/StreamHelper;", "", "()V", "getString", "", "inputStream", "Ljava/io/InputStream;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: StreamHelper.kt */
public final class StreamHelper {
    public static final StreamHelper INSTANCE = new StreamHelper();

    private StreamHelper() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        throw r1;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String getString(java.io.InputStream r3) throws java.io.IOException {
        /*
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "UTF-8"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r1.<init>(r3, r2)
            java.io.Reader r1 = (java.io.Reader) r1
            r0.<init>(r1)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r3 = r0
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch:{ all -> 0x0034 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
        L_0x001c:
            java.lang.String r2 = r3.readLine()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0026
            r1.append(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x001c
        L_0x0026:
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0034 }
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            java.lang.String r0 = "buffReader.use { reader …data.toString()\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            return r3
        L_0x0034:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.StreamHelper.getString(java.io.InputStream):java.lang.String");
    }
}
