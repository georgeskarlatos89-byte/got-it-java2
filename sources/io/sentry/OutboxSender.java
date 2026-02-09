package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.hints.Flushable;
import io.sentry.hints.Resettable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.CollectionUtils;
import io.sentry.util.LogUtils;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public final class OutboxSender extends DirectoryProcessor implements IEnvelopeSender {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final IEnvelopeReader envelopeReader;
    private final IHub hub;
    private final ILogger logger;
    private final ISerializer serializer;

    public /* bridge */ /* synthetic */ void processDirectory(File file) {
        super.processDirectory(file);
    }

    public OutboxSender(IHub iHub, IEnvelopeReader iEnvelopeReader, ISerializer iSerializer, ILogger iLogger, long j) {
        super(iLogger, j);
        this.hub = (IHub) Objects.requireNonNull(iHub, "Hub is required.");
        this.envelopeReader = (IEnvelopeReader) Objects.requireNonNull(iEnvelopeReader, "Envelope reader is required.");
        this.serializer = (ISerializer) Objects.requireNonNull(iSerializer, "Serializer is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
    }

    /* access modifiers changed from: protected */
    public void processFile(File file, Object obj) {
        boolean z;
        boolean isRetry;
        boolean delete;
        BufferedInputStream bufferedInputStream;
        Objects.requireNonNull(file, "File is required.");
        if (!isRelevantFileName(file.getName())) {
            this.logger.log(SentryLevel.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
            return;
        }
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            SentryEnvelope read = this.envelopeReader.read(bufferedInputStream);
            if (read == null) {
                this.logger.log(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
            } else {
                processEnvelope(read, obj);
                this.logger.log(SentryLevel.DEBUG, "File '%s' is done.", file.getAbsolutePath());
            }
            bufferedInputStream.close();
            if (obj instanceof Retryable) {
                if (!((Retryable) obj).isRetry()) {
                    try {
                        if (!file.delete()) {
                            this.logger.log(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
                            return;
                        }
                        return;
                    } catch (RuntimeException e) {
                        this.logger.log(SentryLevel.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
                        return;
                    }
                } else {
                    return;
                }
            }
        } catch (IOException e2) {
            try {
                this.logger.log(SentryLevel.ERROR, "Error processing envelope.", (Throwable) e2);
                if (z) {
                    if (!isRetry) {
                        try {
                            if (delete) {
                                return;
                            }
                            return;
                        } catch (RuntimeException e3) {
                            this.logger.log(SentryLevel.ERROR, e3, "Failed to delete: %s", file.getAbsolutePath());
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } finally {
                if (!(obj instanceof Retryable)) {
                    LogUtils.logIfNotRetryable(this.logger, obj);
                } else if (!((Retryable) obj).isRetry()) {
                    try {
                        if (!file.delete()) {
                            this.logger.log(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
                        }
                    } catch (RuntimeException e4) {
                        this.logger.log(SentryLevel.ERROR, e4, "Failed to delete: %s", file.getAbsolutePath());
                    }
                }
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        LogUtils.logIfNotRetryable(this.logger, obj);
        return;
        throw th;
    }

    /* access modifiers changed from: protected */
    public boolean isRelevantFileName(String str) {
        return str != null && !str.startsWith(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE);
    }

    public void processEnvelopeFile(String str, Object obj) {
        Objects.requireNonNull(str, "Path is required.");
        processFile(new File(str), obj);
    }

    private void processEnvelope(SentryEnvelope sentryEnvelope, Object obj) throws IOException {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        this.logger.log(SentryLevel.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(CollectionUtils.size(sentryEnvelope.getItems())));
        int i = 0;
        for (SentryEnvelopeItem next : sentryEnvelope.getItems()) {
            i++;
            if (next.getHeader() == null) {
                this.logger.log(SentryLevel.ERROR, "Item %d has no header", Integer.valueOf(i));
            } else {
                if (SentryItemType.Event.equals(next.getHeader().getType())) {
                    try {
                        bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.getData()), UTF_8));
                        SentryEvent sentryEvent = (SentryEvent) this.serializer.deserialize(bufferedReader2, SentryEvent.class);
                        if (sentryEvent == null) {
                            logEnvelopeItemNull(next, i);
                        } else if (sentryEnvelope.getHeader().getEventId() == null || sentryEnvelope.getHeader().getEventId().equals(sentryEvent.getEventId())) {
                            this.hub.captureEvent(sentryEvent, obj);
                            logItemCaptured(i);
                            if (!waitFlush(obj)) {
                                logTimeout(sentryEvent.getEventId());
                                bufferedReader2.close();
                                return;
                            }
                        } else {
                            logUnexpectedEventId(sentryEnvelope, sentryEvent.getEventId(), i);
                            bufferedReader2.close();
                        }
                        bufferedReader2.close();
                    } catch (Throwable th) {
                        this.logger.log(SentryLevel.ERROR, "Item failed to process.", th);
                    }
                } else if (SentryItemType.Transaction.equals(next.getHeader().getType())) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.getData()), UTF_8));
                        SentryTransaction sentryTransaction = (SentryTransaction) this.serializer.deserialize(bufferedReader, SentryTransaction.class);
                        if (sentryTransaction == null) {
                            logEnvelopeItemNull(next, i);
                        } else if (sentryEnvelope.getHeader().getEventId() == null || sentryEnvelope.getHeader().getEventId().equals(sentryTransaction.getEventId())) {
                            if (sentryTransaction.getContexts().getTrace() != null) {
                                sentryTransaction.getContexts().getTrace().setSampled(true);
                            }
                            this.hub.captureTransaction(sentryTransaction, sentryEnvelope.getHeader().getTrace(), obj);
                            logItemCaptured(i);
                            if (!waitFlush(obj)) {
                                logTimeout(sentryTransaction.getEventId());
                                bufferedReader.close();
                                return;
                            }
                        } else {
                            logUnexpectedEventId(sentryEnvelope, sentryTransaction.getEventId(), i);
                            bufferedReader.close();
                        }
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        this.logger.log(SentryLevel.ERROR, "Item failed to process.", th2);
                    }
                } else {
                    this.hub.captureEnvelope(new SentryEnvelope(sentryEnvelope.getHeader().getEventId(), sentryEnvelope.getHeader().getSdkVersion(), next), obj);
                    this.logger.log(SentryLevel.DEBUG, "%s item %d is being captured.", next.getHeader().getType().getItemType(), Integer.valueOf(i));
                    if (!waitFlush(obj)) {
                        this.logger.log(SentryLevel.WARNING, "Timed out waiting for item type submission: %s", next.getHeader().getType().getItemType());
                        return;
                    }
                }
                if ((obj instanceof SubmissionResult) && !((SubmissionResult) obj).isSuccess()) {
                    this.logger.log(SentryLevel.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i));
                    return;
                } else if (obj instanceof Resettable) {
                    ((Resettable) obj).reset();
                }
            }
        }
        return;
        throw th;
        throw th;
    }

    private void logEnvelopeItemNull(SentryEnvelopeItem sentryEnvelopeItem, int i) {
        this.logger.log(SentryLevel.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i), sentryEnvelopeItem.getHeader().getType());
    }

    private void logUnexpectedEventId(SentryEnvelope sentryEnvelope, SentryId sentryId, int i) {
        this.logger.log(SentryLevel.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i), sentryEnvelope.getHeader().getEventId(), sentryId);
    }

    private void logItemCaptured(int i) {
        this.logger.log(SentryLevel.DEBUG, "Item %d is being captured.", Integer.valueOf(i));
    }

    private void logTimeout(SentryId sentryId) {
        this.logger.log(SentryLevel.WARNING, "Timed out waiting for event id submission: %s", sentryId);
    }

    private boolean waitFlush(Object obj) {
        if (obj instanceof Flushable) {
            return ((Flushable) obj).waitFlush();
        }
        LogUtils.logIfNotFlushable(this.logger, obj);
        return true;
    }
}
