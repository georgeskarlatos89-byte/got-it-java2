package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;

final class NoOpSentryClient implements ISentryClient {
    private static final NoOpSentryClient instance = new NoOpSentryClient();

    public void captureSession(Session session, Object obj) {
    }

    public void captureUserFeedback(UserFeedback userFeedback) {
    }

    public void close() {
    }

    public void flush(long j) {
    }

    public boolean isEnabled() {
        return false;
    }

    private NoOpSentryClient() {
    }

    public static NoOpSentryClient getInstance() {
        return instance;
    }

    public SentryId captureEvent(SentryEvent sentryEvent, Scope scope, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState, Scope scope, Object obj) {
        return SentryId.EMPTY_ID;
    }
}
