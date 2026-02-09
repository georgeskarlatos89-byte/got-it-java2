package com.cardinalcommerce.a;

import java.security.PrivateKey;
import java.util.Arrays;

public final class setOnScrollChangeListener implements PrivateKey {
    public short[] Cardinal;
    public short[] cca_continue;
    public short[][] configure;
    public Transaction[] getInstance;
    public int[] getWarnings;
    public short[][] init;

    public setOnScrollChangeListener(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Transaction[] transactionArr) {
        this.init = sArr;
        this.Cardinal = sArr2;
        this.configure = sArr3;
        this.cca_continue = sArr4;
        this.getWarnings = iArr;
        this.getInstance = transactionArr;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] getEncoded() {
        /*
            r8 = this;
            com.cardinalcommerce.a.getAcsSignedContent r7 = new com.cardinalcommerce.a.getAcsSignedContent
            short[][] r1 = r8.init
            short[] r2 = r8.Cardinal
            short[][] r3 = r8.configure
            short[] r4 = r8.cca_continue
            int[] r5 = r8.getWarnings
            com.cardinalcommerce.a.Transaction[] r6 = r8.getInstance
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            com.cardinalcommerce.a.BCDSAPrivateKey r1 = new com.cardinalcommerce.a.BCDSAPrivateKey     // Catch:{ IOException -> 0x0025 }
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r2 = com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers.cca_continue     // Catch:{ IOException -> 0x0025 }
            com.cardinalcommerce.a.isEnabledVisaCheckout r3 = com.cardinalcommerce.a.isEnabledVisaCheckout.configure     // Catch:{ IOException -> 0x0025 }
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0025 }
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r2 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo     // Catch:{ IOException -> 0x0025 }
            r2.<init>(r1, r7)     // Catch:{ IOException -> 0x0025 }
            byte[] r0 = r2.getEncoded()     // Catch:{  }
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setOnScrollChangeListener.getEncoded():byte[]");
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public setOnScrollChangeListener(InvalidInputException invalidInputException) {
        this(invalidInputException.configure, invalidInputException.init, invalidInputException.cca_continue, invalidInputException.getInstance, invalidInputException.Cardinal, invalidInputException.getSDKVersion);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof setOnScrollChangeListener)) {
            return false;
        }
        setOnScrollChangeListener setonscrollchangelistener = (setOnScrollChangeListener) obj;
        boolean z = (((protocolError.Cardinal(this.init, setonscrollchangelistener.init) && protocolError.Cardinal(this.configure, setonscrollchangelistener.configure)) && protocolError.getInstance(this.Cardinal, setonscrollchangelistener.Cardinal)) && protocolError.getInstance(this.cca_continue, setonscrollchangelistener.cca_continue)) && Arrays.equals(this.getWarnings, setonscrollchangelistener.getWarnings);
        Transaction[] transactionArr = this.getInstance;
        if (transactionArr.length != setonscrollchangelistener.getInstance.length) {
            return false;
        }
        for (int length = transactionArr.length - 1; length >= 0; length--) {
            z &= this.getInstance[length].equals(setonscrollchangelistener.getInstance[length]);
        }
        return z;
    }

    public final int hashCode() {
        int length = this.getInstance.length * 37;
        short[][] sArr = this.init;
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + getBackgroundColor.getInstance(sArr[i2]);
        }
        int instance = (((length + i) * 37) + getBackgroundColor.getInstance(this.Cardinal)) * 37;
        short[][] sArr2 = this.configure;
        int i3 = 0;
        for (int i4 = 0; i4 != sArr2.length; i4++) {
            i3 = (i3 * 257) + getBackgroundColor.getInstance(sArr2[i4]);
        }
        int instance2 = ((((instance + i3) * 37) + getBackgroundColor.getInstance(this.cca_continue)) * 37) + getBackgroundColor.init(this.getWarnings);
        for (int length2 = this.getInstance.length - 1; length2 >= 0; length2--) {
            instance2 = (instance2 * 37) + this.getInstance[length2].hashCode();
        }
        return instance2;
    }
}
