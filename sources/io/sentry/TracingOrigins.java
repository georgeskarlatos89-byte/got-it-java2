package io.sentry;

import java.net.URI;
import java.util.List;

public final class TracingOrigins {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean contain(java.util.List<java.lang.String> r3, java.lang.String r4) {
        /*
            boolean r0 = r3.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Iterator r3 = r3.iterator()
        L_0x000c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r4.contains(r0)
            if (r2 != 0) goto L_0x0024
            boolean r0 = r4.matches(r0)
            if (r0 == 0) goto L_0x000c
        L_0x0024:
            return r1
        L_0x0025:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.TracingOrigins.contain(java.util.List, java.lang.String):boolean");
    }

    public static boolean contain(List<String> list, URI uri) {
        return contain(list, uri.toString());
    }
}
