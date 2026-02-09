package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class NoOpTransaction implements ITransaction {
    private static final NoOpTransaction instance = new NoOpTransaction();

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

    public Span getLatestActiveSpan() {
        return null;
    }

    public String getName() {
        return "";
    }

    public String getOperation() {
        return "";
    }

    @Deprecated
    public Request getRequest() {
        return null;
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
        return true;
    }

    public Boolean isSampled() {
        return null;
    }

    public void setData(String str, Object obj) {
    }

    public void setDescription(String str) {
    }

    public void setName(String str) {
    }

    public void setOperation(String str) {
    }

    @Deprecated
    public void setRequest(Request request) {
    }

    public void setStatus(SpanStatus spanStatus) {
    }

    public void setTag(String str, String str2) {
    }

    public void setThrowable(Throwable th) {
    }

    private NoOpTransaction() {
    }

    public static NoOpTransaction getInstance() {
        return instance;
    }

    public ISpan startChild(String str) {
        return NoOpSpan.getInstance();
    }

    public ISpan startChild(String str, String str2, Date date) {
        return NoOpSpan.getInstance();
    }

    public ISpan startChild(String str, String str2) {
        return NoOpSpan.getInstance();
    }

    @Deprecated
    public Contexts getContexts() {
        return new Contexts();
    }

    public List<Span> getSpans() {
        return Collections.emptyList();
    }

    public SentryId getEventId() {
        return SentryId.EMPTY_ID;
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
