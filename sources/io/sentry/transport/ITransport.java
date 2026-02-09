package io.sentry.transport;

import io.sentry.SentryEnvelope;
import java.io.Closeable;
import java.io.IOException;

public interface ITransport extends Closeable {
    void flush(long j);

    void send(SentryEnvelope sentryEnvelope, Object obj) throws IOException;

    void send(SentryEnvelope sentryEnvelope) throws IOException {
        send(sentryEnvelope, (Object) null);
    }
}
