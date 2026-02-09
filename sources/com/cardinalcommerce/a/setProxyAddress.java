package com.cardinalcommerce.a;

import java.io.IOException;

public final class setProxyAddress extends IOException {
    private Throwable cca_continue;

    public setProxyAddress(String str) {
        super(str);
    }

    public setProxyAddress(String str, Throwable th) {
        super(str);
        this.cca_continue = th;
    }

    public final Throwable getCause() {
        return this.cca_continue;
    }
}
