package com.cardinalcommerce.a;

public final class setHeadingTextFontName extends IllegalStateException {
    private Throwable configure;

    setHeadingTextFontName(String str, Throwable th) {
        super(str);
        this.configure = th;
    }

    public final Throwable getCause() {
        return this.configure;
    }
}
