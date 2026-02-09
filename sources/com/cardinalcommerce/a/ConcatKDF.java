package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;

public abstract class ConcatKDF {

    public static class init {
        /* access modifiers changed from: private */
        public static final init getInstance = new init();

        private init() {
        }
    }

    public static void cca_continue(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        Base64URL.configure(init.getInstance, bArr, 0, iArr, iArr2);
        KeyAgreementSpi.MQVwithSHA224CKDF.init(iArr, iArr);
        KeyAgreementSpi.MQVwithSHA224CKDF.Cardinal(iArr, iArr2, iArr);
        KeyAgreementSpi.MQVwithSHA224CKDF.configure(iArr, iArr);
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr, 1);
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr, -1);
        KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(iArr, bArr2, 0);
    }
}
