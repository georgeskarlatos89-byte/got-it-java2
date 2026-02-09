package com.cardinalcommerce.a;

public enum setContextClickable {
    PROTOCOL_EXCEPTION,
    MALFORMED_URL_EXCEPTION,
    SOCKET_TIMEOUT_EXCEPTION,
    IO_EXCEPTION,
    EXCEPTION;
    
    private static int configure = 0;
    private static int init = 1;

    static {
        int i = (init + 10) - 1;
        configure = i % 128;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
    }
}
