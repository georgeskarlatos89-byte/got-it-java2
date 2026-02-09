package io.sentry;

import org.apache.http.HttpStatus;

public enum SpanStatus {
    OK(200, 299),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(HttpStatus.SC_GATEWAY_TIMEOUT),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(HttpStatus.SC_FORBIDDEN),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(HttpStatus.SC_NOT_IMPLEMENTED),
    UNAVAILABLE(HttpStatus.SC_SERVICE_UNAVAILABLE),
    DATA_LOSS(500),
    UNAUTHENTICATED(HttpStatus.SC_UNAUTHORIZED);
    
    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    private SpanStatus(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    private SpanStatus(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }

    public static SpanStatus fromHttpStatusCode(int i) {
        for (SpanStatus spanStatus : values()) {
            if (spanStatus.matches(i)) {
                return spanStatus;
            }
        }
        return null;
    }

    public static SpanStatus fromHttpStatusCode(Integer num, SpanStatus spanStatus) {
        SpanStatus fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : spanStatus;
        return fromHttpStatusCode != null ? fromHttpStatusCode : spanStatus;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }
}
