package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class SentryTracer implements ITransaction {
    private final List<Span> children;
    private final Contexts contexts;
    private final SentryId eventId;
    private FinishStatus finishStatus;
    private final IHub hub;
    private String name;
    private Request request;
    private final Span root;
    private TraceState traceState;
    private final TransactionFinishedCallback transactionFinishedCallback;
    private final boolean waitForChildren;

    public SentryTracer(TransactionContext transactionContext, IHub iHub) {
        this(transactionContext, iHub, (Date) null);
    }

    public SentryTracer(TransactionContext transactionContext, IHub iHub, boolean z, TransactionFinishedCallback transactionFinishedCallback2) {
        this(transactionContext, iHub, (Date) null, z, transactionFinishedCallback2);
    }

    SentryTracer(TransactionContext transactionContext, IHub iHub, Date date) {
        this(transactionContext, iHub, date, false, (TransactionFinishedCallback) null);
    }

    SentryTracer(TransactionContext transactionContext, IHub iHub, Date date, boolean z, TransactionFinishedCallback transactionFinishedCallback2) {
        this.eventId = new SentryId();
        this.children = new CopyOnWriteArrayList();
        this.contexts = new Contexts();
        this.finishStatus = FinishStatus.NOT_FINISHED;
        Objects.requireNonNull(transactionContext, "context is required");
        Objects.requireNonNull(iHub, "hub is required");
        this.root = new Span(transactionContext, this, iHub, date);
        this.name = transactionContext.getName();
        this.hub = iHub;
        this.waitForChildren = z;
        this.transactionFinishedCallback = transactionFinishedCallback2;
    }

    public List<Span> getChildren() {
        return this.children;
    }

    public Date getStartTimestamp() {
        return this.root.getStartTimestamp();
    }

    public Date getTimestamp() {
        return this.root.getTimestamp();
    }

    /* access modifiers changed from: package-private */
    public ISpan startChild(SpanId spanId, String str, String str2) {
        ISpan createChild = createChild(spanId, str);
        createChild.setDescription(str2);
        return createChild;
    }

    /* access modifiers changed from: package-private */
    public ISpan startChild(SpanId spanId, String str, String str2, Date date) {
        return createChild(spanId, str, str2, date);
    }

    private ISpan createChild(SpanId spanId, String str) {
        return createChild(spanId, str, (String) null, (Date) null);
    }

    private ISpan createChild(SpanId spanId, String str, String str2, Date date) {
        if (this.root.isFinished()) {
            return NoOpSpan.getInstance();
        }
        Objects.requireNonNull(spanId, "parentSpanId is required");
        Objects.requireNonNull(str, "operation is required");
        Span span = new Span(this.root.getTraceId(), spanId, this, str, this.hub, date, new SentryTracer$$ExternalSyntheticLambda3(this));
        span.setDescription(str2);
        this.children.add(span);
        return span;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$createChild$0$io-sentry-SentryTracer  reason: not valid java name */
    public /* synthetic */ void m1077lambda$createChild$0$iosentrySentryTracer(Span span) {
        FinishStatus finishStatus2 = this.finishStatus;
        if (finishStatus2.isFinishing) {
            finish(finishStatus2.spanStatus);
        }
    }

    public ISpan startChild(String str) {
        String str2 = null;
        return startChild(str, (String) null);
    }

    public ISpan startChild(String str, String str2, Date date) {
        return createChild(str, str2, date);
    }

    public ISpan startChild(String str, String str2) {
        return createChild(str, str2, (Date) null);
    }

    private ISpan createChild(String str, String str2, Date date) {
        if (this.root.isFinished()) {
            return NoOpSpan.getInstance();
        }
        if (this.children.size() < this.hub.getOptions().getMaxSpans()) {
            return this.root.startChild(str, str2, date);
        }
        this.hub.getOptions().getLogger().log(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return NoOpSpan.getInstance();
    }

    public SentryTraceHeader toSentryTrace() {
        return this.root.toSentryTrace();
    }

    public void finish() {
        finish(getStatus());
    }

    public void finish(SpanStatus spanStatus) {
        this.finishStatus = FinishStatus.finishing(spanStatus);
        if (this.root.isFinished()) {
            return;
        }
        if (!this.waitForChildren || hasAllChildrenFinished()) {
            this.root.finish(this.finishStatus.spanStatus);
            Date timestamp = this.root.getTimestamp();
            if (timestamp == null) {
                this.hub.getOptions().getLogger().log(SentryLevel.WARNING, "Root span - op: %s, description: %s - has no timestamp set, when finishing unfinished spans.", this.root.getOperation(), this.root.getDescription());
                timestamp = DateUtils.getCurrentDateTime();
            }
            for (Span next : this.children) {
                if (!next.isFinished()) {
                    next.finish(SpanStatus.DEADLINE_EXCEEDED, timestamp);
                }
            }
            this.hub.configureScope(new SentryTracer$$ExternalSyntheticLambda0(this));
            SentryTransaction sentryTransaction = new SentryTransaction(this);
            TransactionFinishedCallback transactionFinishedCallback2 = this.transactionFinishedCallback;
            if (transactionFinishedCallback2 != null) {
                transactionFinishedCallback2.execute(this);
            }
            this.hub.captureTransaction(sentryTransaction, traceState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$finish$2$io-sentry-SentryTracer  reason: not valid java name */
    public /* synthetic */ void m1079lambda$finish$2$iosentrySentryTracer(Scope scope) {
        scope.withTransaction(new SentryTracer$$ExternalSyntheticLambda1(this, scope));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$finish$1$io-sentry-SentryTracer  reason: not valid java name */
    public /* synthetic */ void m1078lambda$finish$1$iosentrySentryTracer(Scope scope, ITransaction iTransaction) {
        if (iTransaction == this) {
            scope.clearTransaction();
        }
    }

    public TraceState traceState() {
        TraceState traceState2;
        if (!this.hub.getOptions().isTraceSampling()) {
            return null;
        }
        synchronized (this) {
            if (this.traceState == null) {
                AtomicReference atomicReference = new AtomicReference();
                this.hub.configureScope(new SentryTracer$$ExternalSyntheticLambda2(atomicReference));
                this.traceState = new TraceState(this, (User) atomicReference.get(), this.hub.getOptions());
            }
            traceState2 = this.traceState;
        }
        return traceState2;
    }

    public TraceStateHeader toTraceStateHeader() {
        TraceState traceState2 = traceState();
        if (!this.hub.getOptions().isTraceSampling() || traceState2 == null) {
            return null;
        }
        return TraceStateHeader.fromTraceState(traceState2, this.hub.getOptions().getSerializer(), this.hub.getOptions().getLogger());
    }

    private boolean hasAllChildrenFinished() {
        ArrayList<Span> arrayList = new ArrayList<>(this.children);
        if (arrayList.isEmpty()) {
            return true;
        }
        for (Span isFinished : arrayList) {
            if (!isFinished.isFinished()) {
                return false;
            }
        }
        return true;
    }

    public void setOperation(String str) {
        if (!this.root.isFinished()) {
            this.root.setOperation(str);
        }
    }

    public String getOperation() {
        return this.root.getOperation();
    }

    public void setDescription(String str) {
        if (!this.root.isFinished()) {
            this.root.setDescription(str);
        }
    }

    public String getDescription() {
        return this.root.getDescription();
    }

    public void setStatus(SpanStatus spanStatus) {
        if (!this.root.isFinished()) {
            this.root.setStatus(spanStatus);
        }
    }

    public SpanStatus getStatus() {
        return this.root.getStatus();
    }

    public void setThrowable(Throwable th) {
        if (!this.root.isFinished()) {
            this.root.setThrowable(th);
        }
    }

    public Throwable getThrowable() {
        return this.root.getThrowable();
    }

    public SpanContext getSpanContext() {
        return this.root.getSpanContext();
    }

    public void setTag(String str, String str2) {
        if (!this.root.isFinished()) {
            this.root.setTag(str, str2);
        }
    }

    public String getTag(String str) {
        return this.root.getTag(str);
    }

    public boolean isFinished() {
        return this.root.isFinished();
    }

    public void setData(String str, Object obj) {
        if (!this.root.isFinished()) {
            this.root.setData(str, obj);
        }
    }

    public Object getData(String str) {
        return this.root.getData(str);
    }

    public Map<String, Object> getData() {
        return this.root.getData();
    }

    public Boolean isSampled() {
        return this.root.isSampled();
    }

    public void setName(String str) {
        if (!this.root.isFinished()) {
            this.name = str;
        }
    }

    public String getName() {
        return this.name;
    }

    @Deprecated
    public void setRequest(Request request2) {
        if (!this.root.isFinished()) {
            this.request = request2;
        }
    }

    @Deprecated
    public Request getRequest() {
        return this.request;
    }

    @Deprecated
    public Contexts getContexts() {
        return this.contexts;
    }

    public List<Span> getSpans() {
        return this.children;
    }

    public Span getLatestActiveSpan() {
        ArrayList arrayList = new ArrayList(this.children);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((Span) arrayList.get(size)).isFinished()) {
                return (Span) arrayList.get(size);
            }
        }
        return null;
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    /* access modifiers changed from: package-private */
    public Span getRoot() {
        return this.root;
    }

    private static final class FinishStatus {
        static final FinishStatus NOT_FINISHED = notFinished();
        /* access modifiers changed from: private */
        public final boolean isFinishing;
        /* access modifiers changed from: private */
        public final SpanStatus spanStatus;

        static FinishStatus finishing(SpanStatus spanStatus2) {
            return new FinishStatus(true, spanStatus2);
        }

        private static FinishStatus notFinished() {
            return new FinishStatus(false, (SpanStatus) null);
        }

        private FinishStatus(boolean z, SpanStatus spanStatus2) {
            this.isFinishing = z;
            this.spanStatus = spanStatus2;
        }
    }
}
