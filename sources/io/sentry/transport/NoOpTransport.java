package io.sentry.transport;

import io.sentry.SentryEnvelope;
import java.io.IOException;

public final class NoOpTransport implements ITransport {
    private static final NoOpTransport instance = new NoOpTransport();

    public void close() throws IOException {
    }

    public void flush(long j) {
    }

    public void send(SentryEnvelope sentryEnvelope, Object obj) throws IOException {
    }

    public static NoOpTransport getInstance() {
        return instance;
    }

    private NoOpTransport() {
    }
}
