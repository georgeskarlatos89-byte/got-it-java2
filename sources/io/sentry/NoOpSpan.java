package io.sentry;

import io.sentry.protocol.SentryId;
import java.util.Date;

public final class NoOpSpan implements ISpan {
    private static final NoOpSpan instance = new NoOpSpan();

    public void finish() {
    }

    public void finish(SpanStatus spanStatus) {
    }

    public Object getData(String str) {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public String getOperation() {
        return "";
    }

    public SpanStatus getStatus() {
        return null;
    }

    public String getTag(String str) {
        return null;
    }

    public Throwable getThrowable() {
        return null;
    }

    public boolean isFinished() {
        return false;
    }

    public void setData(String str, Object obj) {
    }

    public void setDescription(String str) {
    }

    public void setOperation(String str) {
    }

    public void setStatus(SpanStatus spanStatus) {
    }

    public void setTag(String str, String str2) {
    }

    public void setThrowable(Throwable th) {
    }

    private NoOpSpan() {
    }

    public static NoOpSpan getInstance() {
        return instance;
    }

    public ISpan startChild(String str) {
        return getInstance();
    }

    public ISpan startChild(String str, String str2, Date date) {
        return getInstance();
    }

    public ISpan startChild(String str, String str2) {
        return getInstance();
    }

    public SentryTraceHeader toSentryTrace() {
        return new SentryTraceHeader(SentryId.EMPTY_ID, SpanId.EMPTY_ID, false);
    }

    public TraceState traceState() {
        return new TraceState(SentryId.EMPTY_ID, "");
    }

    public TraceStateHeader toTraceStateHeader() {
        return new TraceStateHeader("");
    }

    public SpanContext getSpanContext() {
        return new SpanContext(SentryId.EMPTY_ID, SpanId.EMPTY_ID, "op", (SpanId) null, (Boolean) null);
    }
}
