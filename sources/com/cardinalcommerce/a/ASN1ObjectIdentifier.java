package com.cardinalcommerce.a;

import java.io.IOException;

public final class ASN1ObjectIdentifier extends CardinalUiType {
    public ASN1ObjectIdentifier(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        int i = this.cca_continue ? 96 : 64;
        int i2 = this.init;
        byte[] bArr = this.configure;
        getrendertype.Cardinal(i, i2);
        getrendertype.configure(bArr.length);
        getrendertype.configure.write(bArr);
    }
}
