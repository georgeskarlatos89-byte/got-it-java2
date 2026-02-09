package io.sentry;

import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;

public final class SentryEnvelopeHeader {
    private final SentryId eventId;
    private final SdkVersion sdkVersion;
    private final TraceState trace;

    public SentryEnvelopeHeader(SentryId sentryId, SdkVersion sdkVersion2) {
        this(sentryId, sdkVersion2, (TraceState) null);
    }

    public SentryEnvelopeHeader(SentryId sentryId, SdkVersion sdkVersion2, TraceState traceState) {
        this.eventId = sentryId;
        this.sdkVersion = sdkVersion2;
        this.trace = traceState;
    }

    public SentryEnvelopeHeader(SentryId sentryId) {
        this(sentryId, (SdkVersion) null);
    }

    public SentryEnvelopeHeader() {
        this(new SentryId());
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public TraceState getTrace() {
        return this.trace;
    }
}
