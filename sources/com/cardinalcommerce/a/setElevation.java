package com.cardinalcommerce.a;

final class setElevation {
    final byte[][] configure;

    protected setElevation(setCheckState setcheckstate, byte[][] bArr) {
        boolean z;
        if (setcheckstate != null) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= bArr.length) {
                    z = false;
                    break;
                } else if (bArr[i2] == null) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                throw new NullPointerException("publicKey byte array == null");
            } else if (bArr.length == setcheckstate.configure) {
                while (i < bArr.length) {
                    if (bArr[i].length == setcheckstate.getInstance) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("wrong publicKey format");
                    }
                }
                this.configure = setCCAFocusableInTouchMode.init(bArr);
            } else {
                throw new IllegalArgumentException("wrong publicKey size");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }
}
