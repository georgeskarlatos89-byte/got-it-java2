package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class setErrorNumber extends getEnvironment {
    public setErrorNumber(ASN1ObjectIdentifier aSN1ObjectIdentifier, setEnvironment setenvironment, getThreeDSRequestorAppURL getthreedsrequestorappurl, int i, getThreeDSRequestorAppURL getthreedsrequestorappurl2) {
        super(aSN1ObjectIdentifier, setenvironment, getthreedsrequestorappurl, i, getthreedsrequestorappurl2);
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() throws IOException {
        return getEncoded().length;
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.Cardinal != null) {
            byteArrayOutputStream.write(this.Cardinal.configure("DER"));
        }
        if (this.getInstance != null) {
            byteArrayOutputStream.write(this.getInstance.configure("DER"));
        }
        if (this.cca_continue != null) {
            byteArrayOutputStream.write(this.cca_continue.configure("DER"));
        }
        byteArrayOutputStream.write(new getPayment(true, this.init, this.configure).configure("DER"));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        getrendertype.Cardinal(32, 8);
        getrendertype.configure(byteArray.length);
        getrendertype.configure.write(byteArray);
    }
}
