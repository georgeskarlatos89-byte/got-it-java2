package com.cardinalcommerce.a;

import java.io.IOException;

public final class setDeviceFingerprint extends CardinalUiType {
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
