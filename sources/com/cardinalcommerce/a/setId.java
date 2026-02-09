package com.cardinalcommerce.a;

import java.io.Serializable;

public final class setId implements Serializable {
    final byte[] Cardinal;
    final int cca_continue;

    protected setId(int i, byte[] bArr) {
        this.cca_continue = i;
        this.Cardinal = bArr;
    }

    public final byte[] cca_continue() {
        byte[] bArr = this.Cardinal;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new NullPointerException("in == null");
    }

    /* access modifiers changed from: protected */
    public final setId configure() {
        return new setId(this.cca_continue, cca_continue());
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new setId(this.cca_continue, cca_continue());
    }
}
