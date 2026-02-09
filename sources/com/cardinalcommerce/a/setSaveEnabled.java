package com.cardinalcommerce.a;

public enum setSaveEnabled {
    EMVCO,
    CARDINAL;
    
    private static int configure = 0;
    private static int getInstance = 1;

    static {
        int i = configure + 13;
        getInstance = i % 128;
        if ((i % 2 == 0 ? 6 : 'T') == 6) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }
}
