package com.cardinalcommerce.a;

public final class getHeadingTextColor extends IllegalStateException {
    private Throwable init;

    getHeadingTextColor(String str, Throwable th) {
        super(str);
        this.init = th;
    }

    public final Throwable getCause() {
        return this.init;
    }
}
