package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SpanContext {
    public static final String TYPE = "trace";
    protected String description;
    protected String op;
    private final SpanId parentSpanId;
    private transient Boolean sampled;
    private final SpanId spanId;
    protected SpanStatus status;
    protected Map<String, String> tags;
    private final SentryId traceId;

    public SpanContext(String str, Boolean bool) {
        this(new SentryId(), new SpanId(), str, (SpanId) null, bool);
    }

    public SpanContext(String str) {
        this(new SentryId(), new SpanId(), str, (SpanId) null, (Boolean) null);
    }

    public SpanContext(SentryId sentryId, SpanId spanId2, String str, SpanId spanId3, Boolean bool) {
        this(sentryId, spanId2, spanId3, str, (String) null, bool, (SpanStatus) null);
    }

    public SpanContext(SentryId sentryId, SpanId spanId2, SpanId spanId3, String str, String str2, Boolean bool, SpanStatus spanStatus) {
        this.tags = new ConcurrentHashMap();
        this.traceId = (SentryId) Objects.requireNonNull(sentryId, "traceId is required");
        this.spanId = (SpanId) Objects.requireNonNull(spanId2, "spanId is required");
        this.op = (String) Objects.requireNonNull(str, "operation is required");
        this.parentSpanId = spanId3;
        this.sampled = bool;
        this.description = str2;
        this.status = spanStatus;
    }

    public SpanContext(SpanContext spanContext) {
        this.tags = new ConcurrentHashMap();
        this.traceId = spanContext.traceId;
        this.spanId = spanContext.spanId;
        this.parentSpanId = spanContext.parentSpanId;
        this.sampled = spanContext.sampled;
        this.op = spanContext.op;
        this.description = spanContext.description;
        this.status = spanContext.status;
        Map<String, String> newConcurrentHashMap = CollectionUtils.newConcurrentHashMap(spanContext.tags);
        if (newConcurrentHashMap != null) {
            this.tags = newConcurrentHashMap;
        }
    }

    public void setOperation(String str) {
        this.op = (String) Objects.requireNonNull(str, "operation is required");
    }

    public void setTag(String str, String str2) {
        Objects.requireNonNull(str, "name is required");
        Objects.requireNonNull(str2, "value is required");
        this.tags.put(str, str2);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setStatus(SpanStatus spanStatus) {
        this.status = spanStatus;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public SpanId getParentSpanId() {
        return this.parentSpanId;
    }

    public String getOperation() {
        return this.op;
    }

    public String getDescription() {
        return this.description;
    }

    public SpanStatus getStatus() {
        return this.status;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public Boolean getSampled() {
        return this.sampled;
    }

    public void setSampled(Boolean bool) {
        this.sampled = bool;
    }
}
