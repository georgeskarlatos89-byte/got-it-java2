package com.cardinalcommerce.a;

public final class isEnableDFSync extends IllegalStateException {
    private Throwable cca_continue;

    public isEnableDFSync(String str) {
        super(str);
    }

    public isEnableDFSync(String str, Throwable th) {
        super(str);
        this.cca_continue = th;
    }

    public final Throwable getCause() {
        return this.cca_continue;
    }
}
