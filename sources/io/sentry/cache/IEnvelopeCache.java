package io.sentry.cache;

import io.sentry.SentryEnvelope;

public interface IEnvelopeCache extends Iterable<SentryEnvelope> {
    void discard(SentryEnvelope sentryEnvelope);

    void store(SentryEnvelope sentryEnvelope, Object obj);

    void store(SentryEnvelope sentryEnvelope) {
        store(sentryEnvelope, (Object) null);
    }
}
