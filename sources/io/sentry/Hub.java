package io.sentry;

import io.sentry.Scope;
import io.sentry.Stack;
import io.sentry.hints.SessionEndHint;
import io.sentry.hints.SessionStartHint;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.ExceptionUtils;
import io.sentry.util.Objects;
import io.sentry.util.Pair;
import java.io.Closeable;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class Hub implements IHub {
    private volatile boolean isEnabled;
    private volatile SentryId lastEventId;
    private final SentryOptions options;
    private final Stack stack;
    private final Map<Throwable, Pair<ISpan, String>> throwableToSpan;
    private final TracesSampler tracesSampler;

    public Hub(SentryOptions sentryOptions) {
        this(sentryOptions, createRootStackItem(sentryOptions));
    }

    private Hub(SentryOptions sentryOptions, Stack stack2) {
        this.throwableToSpan = Collections.synchronizedMap(new WeakHashMap());
        validateOptions(sentryOptions);
        this.options = sentryOptions;
        this.tracesSampler = new TracesSampler(sentryOptions);
        this.stack = stack2;
        this.lastEventId = SentryId.EMPTY_ID;
        this.isEnabled = true;
    }

    private Hub(SentryOptions sentryOptions, Stack.StackItem stackItem) {
        this(sentryOptions, new Stack(sentryOptions.getLogger(), stackItem));
    }

    private static void validateOptions(SentryOptions sentryOptions) {
        Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        if (sentryOptions.getDsn() == null || sentryOptions.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub is no DSN is available.");
        }
    }

    private static Stack.StackItem createRootStackItem(SentryOptions sentryOptions) {
        validateOptions(sentryOptions);
        return new Stack.StackItem(sentryOptions, new SentryClient(sentryOptions), new Scope(sentryOptions));
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public SentryId captureEvent(SentryEvent sentryEvent, Object obj) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return sentryId;
        } else if (sentryEvent == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return sentryId;
        } else {
            try {
                assignTraceContext(sentryEvent);
                Stack.StackItem peek = this.stack.peek();
                sentryId = peek.getClient().captureEvent(sentryEvent, peek.getScope(), obj);
                this.lastEventId = sentryId;
                return sentryId;
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing event with id: " + sentryEvent.getEventId(), th);
                return sentryId;
            }
        }
    }

    public SentryId captureMessage(String str, SentryLevel sentryLevel) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                Stack.StackItem peek = this.stack.peek();
                sentryId = peek.getClient().captureMessage(str, sentryLevel, peek.getScope());
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing message: " + str, th);
            }
        }
        this.lastEventId = sentryId;
        return sentryId;
    }

    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required.");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return sentryId;
        }
        try {
            SentryId captureEnvelope = this.stack.peek().getClient().captureEnvelope(sentryEnvelope, obj);
            if (captureEnvelope != null) {
                return captureEnvelope;
            }
            return sentryId;
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing envelope.", th);
            return sentryId;
        }
    }

    public SentryId captureException(Throwable th, Object obj) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                Stack.StackItem peek = this.stack.peek();
                SentryEvent sentryEvent = new SentryEvent(th);
                assignTraceContext(sentryEvent);
                sentryId = peek.getClient().captureEvent(sentryEvent, peek.getScope(), obj);
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing exception: " + th.getMessage(), th2);
            }
        }
        this.lastEventId = sentryId;
        return sentryId;
    }

    private void assignTraceContext(SentryEvent sentryEvent) {
        Pair pair;
        if (this.options.isTracingEnabled() && sentryEvent.getThrowable() != null && (pair = this.throwableToSpan.get(ExceptionUtils.findRootCause(sentryEvent.getThrowable()))) != null) {
            ISpan iSpan = (ISpan) pair.getFirst();
            if (sentryEvent.getContexts().getTrace() == null && iSpan != null) {
                sentryEvent.getContexts().setTrace(iSpan.getSpanContext());
            }
            String str = (String) pair.getSecond();
            if (sentryEvent.getTransaction() == null && str != null) {
                sentryEvent.setTransaction(str);
            }
        }
    }

    public void captureUserFeedback(UserFeedback userFeedback) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureUserFeedback' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.stack.peek().getClient().captureUserFeedback(userFeedback);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing captureUserFeedback: " + userFeedback.toString(), th);
        }
    }

    public void startSession() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem peek = this.stack.peek();
        Scope.SessionPair startSession = peek.getScope().startSession();
        if (startSession != null) {
            if (startSession.getPrevious() != null) {
                peek.getClient().captureSession(startSession.getPrevious(), new SessionEndHint());
            }
            peek.getClient().captureSession(startSession.getCurrent(), new SessionStartHint());
            return;
        }
        this.options.getLogger().log(SentryLevel.WARNING, "Session could not be started.", new Object[0]);
    }

    public void endSession() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem peek = this.stack.peek();
        Session endSession = peek.getScope().endSession();
        if (endSession != null) {
            peek.getClient().captureSession(endSession, new SessionEndHint());
        }
    }

    public void close() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (Integration next : this.options.getIntegrations()) {
                if (next instanceof Closeable) {
                    ((Closeable) next).close();
                }
            }
            this.options.getExecutorService().close(this.options.getShutdownTimeout());
            this.stack.peek().getClient().close();
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while closing the Hub.", th);
        }
        this.isEnabled = false;
    }

    public void addBreadcrumb(Breadcrumb breadcrumb, Object obj) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (breadcrumb == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().addBreadcrumb(breadcrumb, obj);
        }
    }

    public void setLevel(SentryLevel sentryLevel) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setLevel' call is a no-op.", new Object[0]);
        } else {
            this.stack.peek().getScope().setLevel(sentryLevel);
        }
    }

    public void setTransaction(String str) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTransaction' call is a no-op.", new Object[0]);
        } else if (str != null) {
            this.stack.peek().getScope().setTransaction(str);
        } else {
            this.options.getLogger().log(SentryLevel.WARNING, "Transaction cannot be null", new Object[0]);
        }
    }

    public void setUser(User user) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        } else {
            this.stack.peek().getScope().setUser(user);
        }
    }

    public void setFingerprint(List<String> list) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setFingerprint' call is a no-op.", new Object[0]);
        } else if (list == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "setFingerprint called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().setFingerprint(list);
        }
    }

    public void clearBreadcrumbs() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'clearBreadcrumbs' call is a no-op.", new Object[0]);
        } else {
            this.stack.peek().getScope().clearBreadcrumbs();
        }
    }

    public void setTag(String str, String str2) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().setTag(str, str2);
        }
    }

    public void removeTag(String str) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeTag' call is a no-op.", new Object[0]);
        } else if (str == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "removeTag called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().removeTag(str);
        }
    }

    public void setExtra(String str, String str2) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setExtra' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "setExtra called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().setExtra(str, str2);
        }
    }

    public void removeExtra(String str) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeExtra' call is a no-op.", new Object[0]);
        } else if (str == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "removeExtra called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().removeExtra(str);
        }
    }

    public SentryId getLastEventId() {
        return this.lastEventId;
    }

    public void pushScope() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'pushScope' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem peek = this.stack.peek();
        this.stack.push(new Stack.StackItem(this.options, peek.getClient(), new Scope(peek.getScope())));
    }

    public SentryOptions getOptions() {
        return this.stack.peek().getOptions();
    }

    public Boolean isCrashedLastRun() {
        return SentryCrashLastRunState.getInstance().isCrashedLastRun(this.options.getCacheDirPath(), !this.options.isEnableAutoSessionTracking());
    }

    public void popScope() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'popScope' call is a no-op.", new Object[0]);
        } else {
            this.stack.pop();
        }
    }

    public void withScope(ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'withScope' call is a no-op.", new Object[0]);
            return;
        }
        pushScope();
        try {
            scopeCallback.run(this.stack.peek().getScope());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'withScope' callback.", th);
        }
        popScope();
    }

    public void configureScope(ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            scopeCallback.run(this.stack.peek().getScope());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    public void bindClient(ISentryClient iSentryClient) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'bindClient' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem peek = this.stack.peek();
        if (iSentryClient != null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "New client bound to scope.", new Object[0]);
            peek.setClient(iSentryClient);
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "NoOp client bound to scope.", new Object[0]);
        peek.setClient(NoOpSentryClient.getInstance());
    }

    public void flush(long j) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.stack.peek().getClient().flush(j);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    public IHub clone() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        return new Hub(this.options, new Stack(this.stack));
    }

    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState, Object obj) {
        Objects.requireNonNull(sentryTransaction, "transaction is required");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return sentryId;
        } else if (!sentryTransaction.isFinished()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", sentryTransaction.getEventId());
            return sentryId;
        } else if (!Boolean.TRUE.equals(Boolean.valueOf(sentryTransaction.isSampled()))) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Transaction %s was dropped due to sampling decision.", sentryTransaction.getEventId());
            return sentryId;
        } else {
            try {
                Stack.StackItem peek = this.stack.peek();
                return peek.getClient().captureTransaction(sentryTransaction, traceState, peek.getScope(), obj);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing transaction with id: " + sentryTransaction.getEventId(), th);
                return sentryId;
            }
        }
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z) {
        return createTransaction(transactionContext, customSamplingContext, z, (Date) null, false, (TransactionFinishedCallback) null);
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date) {
        return createTransaction(transactionContext, customSamplingContext, z, date, false, (TransactionFinishedCallback) null);
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date, boolean z2, TransactionFinishedCallback transactionFinishedCallback) {
        return createTransaction(transactionContext, customSamplingContext, z, date, z2, transactionFinishedCallback);
    }

    private ITransaction createTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date, boolean z2, TransactionFinishedCallback transactionFinishedCallback) {
        ITransaction iTransaction;
        Objects.requireNonNull(transactionContext, "transactionContext is required");
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            iTransaction = NoOpTransaction.getInstance();
        } else if (!this.options.isTracingEnabled()) {
            this.options.getLogger().log(SentryLevel.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            iTransaction = NoOpTransaction.getInstance();
        } else {
            transactionContext.setSampled(Boolean.valueOf(this.tracesSampler.sample(new SamplingContext(transactionContext, customSamplingContext))));
            iTransaction = new SentryTracer(transactionContext, this, date, z2, transactionFinishedCallback);
        }
        if (z) {
            configureScope(new Hub$$ExternalSyntheticLambda0(iTransaction));
        }
        return iTransaction;
    }

    public SentryTraceHeader traceHeaders() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'traceHeaders' call is a no-op.", new Object[0]);
        } else {
            ISpan span = this.stack.peek().getScope().getSpan();
            if (span != null) {
                return span.toSentryTrace();
            }
        }
        return null;
    }

    public ISpan getSpan() {
        if (isEnabled()) {
            return this.stack.peek().getScope().getSpan();
        }
        this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    public void setSpanContext(Throwable th, ISpan iSpan, String str) {
        Objects.requireNonNull(th, "throwable is required");
        Objects.requireNonNull(iSpan, "span is required");
        Objects.requireNonNull(str, "transactionName is required");
        Throwable findRootCause = ExceptionUtils.findRootCause(th);
        if (!this.throwableToSpan.containsKey(findRootCause)) {
            this.throwableToSpan.put(findRootCause, new Pair(iSpan, str));
        }
    }

    /* access modifiers changed from: package-private */
    public SpanContext getSpanContext(Throwable th) {
        ISpan iSpan;
        Objects.requireNonNull(th, "throwable is required");
        Pair pair = this.throwableToSpan.get(ExceptionUtils.findRootCause(th));
        if (pair == null || (iSpan = (ISpan) pair.getFirst()) == null) {
            return null;
        }
        return iSpan.getSpanContext();
    }
}
