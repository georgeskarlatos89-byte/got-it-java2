package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setTextColor;
import java.io.IOException;
import java.io.InputStream;

class PEMUtil {
    private final Boundaries[] configure;

    class Boundaries {
        final String getInstance;
        final String init;

        private Boundaries(String str) {
            this.init = new StringBuilder("-----BEGIN ").append(str).append("-----").toString();
            this.getInstance = new StringBuilder("-----END ").append(str).append("-----").toString();
        }

        /* synthetic */ Boundaries(PEMUtil pEMUtil, String str, byte b) {
            this(str);
        }
    }

    PEMUtil(String str) {
        this.configure = new Boundaries[]{new Boundaries(this, str, (byte) 0), new Boundaries(this, "X509 ".concat(String.valueOf(str)), (byte) 0), new Boundaries(this, "PKCS7", (byte) 0)};
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String cca_continue(java.io.InputStream r5) throws java.io.IOException {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L_0x0005:
            int r1 = r5.read()
            r2 = 10
            r3 = 13
            if (r1 == r3) goto L_0x0018
            if (r1 == r2) goto L_0x0018
            if (r1 < 0) goto L_0x0018
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x0005
        L_0x0018:
            if (r1 < 0) goto L_0x0020
            int r4 = r0.length()
            if (r4 == 0) goto L_0x0005
        L_0x0020:
            if (r1 >= 0) goto L_0x002f
            int r5 = r0.length()
            if (r5 != 0) goto L_0x002a
            r5 = 0
            return r5
        L_0x002a:
            java.lang.String r5 = r0.toString()
            return r5
        L_0x002f:
            if (r1 != r3) goto L_0x0043
            r1 = 1
            r5.mark(r1)
            int r3 = r5.read()
            if (r3 != r2) goto L_0x003e
            r5.mark(r1)
        L_0x003e:
            if (r3 <= 0) goto L_0x0043
            r5.reset()
        L_0x0043:
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.cca_continue(java.io.InputStream):java.lang.String");
    }

    private Boundaries Cardinal(String str) {
        Boundaries boundaries;
        int i = 0;
        while (true) {
            Boundaries[] boundariesArr = this.configure;
            if (i == boundariesArr.length) {
                return null;
            }
            boundaries = boundariesArr[i];
            if (str.startsWith(boundaries.init) || str.startsWith(boundaries.getInstance)) {
                return boundaries;
            }
            i++;
        }
        return boundaries;
    }

    /* access modifiers changed from: package-private */
    public final isEnableLogging Cardinal(InputStream inputStream) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        Boundaries boundaries = null;
        while (boundaries == null) {
            String cca_continue = cca_continue(inputStream);
            if (cca_continue == null) {
                break;
            }
            boundaries = Cardinal(cca_continue);
            if (boundaries != null && !cca_continue.startsWith(boundaries.init)) {
                throw new IOException("malformed PEM data: found footer where header was expected");
            }
        }
        if (boundaries != null) {
            Boundaries boundaries2 = null;
            while (boundaries2 == null) {
                String cca_continue2 = cca_continue(inputStream);
                if (cca_continue2 == null) {
                    break;
                }
                boundaries2 = Cardinal(cca_continue2);
                if (boundaries2 == null) {
                    stringBuffer.append(cca_continue2);
                } else if (!cca_continue2.startsWith(boundaries.getInstance)) {
                    throw new IOException("malformed PEM data: header/footer mismatch");
                }
            }
            if (boundaries2 == null) {
                throw new IOException("malformed PEM data: no footer found");
            } else if (stringBuffer.length() == 0) {
                return null;
            } else {
                try {
                    return isEnableLogging.getInstance((Object) setTextColor.getInstance(stringBuffer.toString()));
                } catch (Exception unused) {
                    throw new IOException("malformed PEM data encountered");
                }
            }
        } else {
            throw new IOException("malformed PEM data: no header found");
        }
    }
}
