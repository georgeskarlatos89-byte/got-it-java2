package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import java.io.InputStream;

final class getErrorNumber extends InputStream {
    private InputStream Cardinal;
    private final KeyAgreementSpi.MQVwithSHA1KDF configure;
    private boolean getInstance = true;

    getErrorNumber(KeyAgreementSpi.MQVwithSHA1KDF mQVwithSHA1KDF) {
        this.configure = mQVwithSHA1KDF;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read() throws java.io.IOException {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.Cardinal
            r1 = -1
            if (r0 != 0) goto L_0x0019
            boolean r0 = r3.getInstance
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA1KDF r0 = r3.configure
            com.cardinalcommerce.a.CardinalConfigurationParameters r0 = r0.cca_continue()
            com.cardinalcommerce.a.getUICustomization r0 = (com.cardinalcommerce.a.getUICustomization) r0
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            r2 = 0
            r3.getInstance = r2
            goto L_0x0030
        L_0x0019:
            java.io.InputStream r0 = r3.Cardinal
            int r0 = r0.read()
            if (r0 < 0) goto L_0x0022
            return r0
        L_0x0022:
            com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA1KDF r0 = r3.configure
            com.cardinalcommerce.a.CardinalConfigurationParameters r0 = r0.cca_continue()
            com.cardinalcommerce.a.getUICustomization r0 = (com.cardinalcommerce.a.getUICustomization) r0
            if (r0 != 0) goto L_0x0030
            r0 = 0
            r3.Cardinal = r0
            return r1
        L_0x0030:
            java.io.InputStream r0 = r0.cca_continue()
            r3.Cardinal = r0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getErrorNumber.read():int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002e A[EDGE_INSN: B:21:0x002e->B:15:0x002e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002d A[SYNTHETIC] */
    public final int read(byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            java.io.InputStream r0 = r5.Cardinal
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x001e
            boolean r0 = r5.getInstance
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA1KDF r0 = r5.configure
            com.cardinalcommerce.a.CardinalConfigurationParameters r0 = r0.cca_continue()
            com.cardinalcommerce.a.getUICustomization r0 = (com.cardinalcommerce.a.getUICustomization) r0
            if (r0 != 0) goto L_0x0016
            return r2
        L_0x0016:
            r5.getInstance = r1
        L_0x0018:
            java.io.InputStream r0 = r0.cca_continue()
            r5.Cardinal = r0
        L_0x001e:
            java.io.InputStream r0 = r5.Cardinal
            int r3 = r7 + r1
            int r4 = r8 - r1
            int r0 = r0.read(r6, r3, r4)
            if (r0 < 0) goto L_0x002e
            int r1 = r1 + r0
            if (r1 != r8) goto L_0x001e
            return r1
        L_0x002e:
            com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA1KDF r0 = r5.configure
            com.cardinalcommerce.a.CardinalConfigurationParameters r0 = r0.cca_continue()
            com.cardinalcommerce.a.getUICustomization r0 = (com.cardinalcommerce.a.getUICustomization) r0
            if (r0 != 0) goto L_0x0018
            r6 = 0
            r5.Cardinal = r6
            if (r1 > 0) goto L_0x003e
            return r2
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getErrorNumber.read(byte[], int, int):int");
    }
}
