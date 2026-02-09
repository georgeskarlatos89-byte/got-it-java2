package io.sentry;

import io.sentry.protocol.SentryTransaction;

public interface EventProcessor {
    SentryEvent process(SentryEvent sentryEvent, Object obj) {
        return sentryEvent;
    }

    SentryTransaction process(SentryTransaction sentryTransaction, Object obj) {
        return sentryTransaction;
    }
}
