package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import java.security.PrivateKey;

public final class setImageURI implements GMCipherSpi.SM2withRMD, PrivateKey {
    private removeParam Cardinal;

    public setImageURI(removeParam removeparam) {
        this.Cardinal = removeparam;
    }

    public final String getAlgorithm() {
        return "McEliece";
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setImageURI)) {
            return false;
        }
        setImageURI setimageuri = (setImageURI) obj;
        if (this.Cardinal.cca_continue != setimageuri.Cardinal.cca_continue || this.Cardinal.configure != setimageuri.Cardinal.configure || !this.Cardinal.getInstance.equals(setimageuri.Cardinal.getInstance) || !this.Cardinal.Cardinal.equals(setimageuri.Cardinal.Cardinal) || !this.Cardinal.init.equals(setimageuri.Cardinal.init) || !this.Cardinal.onValidated.equals(setimageuri.Cardinal.onValidated) || !this.Cardinal.onCReqSuccess.equals(setimageuri.Cardinal.onCReqSuccess)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((this.Cardinal.configure * 37) + this.Cardinal.cca_continue) * 37) + this.Cardinal.getInstance.hashCode()) * 37) + this.Cardinal.Cardinal.hashCode()) * 37) + this.Cardinal.onValidated.hashCode()) * 37) + this.Cardinal.onCReqSuccess.hashCode()) * 37) + this.Cardinal.init.hashCode();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] getEncoded() {
        /*
            r9 = this;
            com.cardinalcommerce.a.getDeviceData r8 = new com.cardinalcommerce.a.getDeviceData
            com.cardinalcommerce.a.removeParam r0 = r9.Cardinal
            int r1 = r0.cca_continue
            com.cardinalcommerce.a.removeParam r0 = r9.Cardinal
            int r2 = r0.configure
            com.cardinalcommerce.a.removeParam r0 = r9.Cardinal
            com.cardinalcommerce.a.DirectoryServerID r3 = r0.getInstance
            com.cardinalcommerce.a.removeParam r0 = r9.Cardinal
            com.cardinalcommerce.a.SDKRuntimeException r4 = r0.Cardinal
            com.cardinalcommerce.a.removeParam r0 = r9.Cardinal
            com.cardinalcommerce.a.ButtonCustomization r5 = r0.onValidated
            com.cardinalcommerce.a.removeParam r0 = r9.Cardinal
            com.cardinalcommerce.a.ButtonCustomization r6 = r0.onCReqSuccess
            com.cardinalcommerce.a.removeParam r0 = r9.Cardinal
            com.cardinalcommerce.a.getCause r7 = r0.init
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            com.cardinalcommerce.a.BCDSAPrivateKey r1 = new com.cardinalcommerce.a.BCDSAPrivateKey     // Catch:{ IOException -> 0x0033 }
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r2 = com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers.Cardinal     // Catch:{ IOException -> 0x0033 }
            r1.<init>((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r2)     // Catch:{ IOException -> 0x0033 }
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r2 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo     // Catch:{ IOException -> 0x0033 }
            r2.<init>(r1, r8)     // Catch:{ IOException -> 0x0033 }
            byte[] r0 = r2.getEncoded()     // Catch:{  }
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setImageURI.getEncoded():byte[]");
    }
}
