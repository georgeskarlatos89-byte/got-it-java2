package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.hints.Flushable;
import io.sentry.hints.Retryable;
import io.sentry.util.LogUtils;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class EnvelopeSender extends DirectoryProcessor implements IEnvelopeSender {
    private final IHub hub;
    private final ILogger logger;
    private final ISerializer serializer;

    public /* bridge */ /* synthetic */ void processDirectory(File file) {
        super.processDirectory(file);
    }

    public EnvelopeSender(IHub iHub, ISerializer iSerializer, ILogger iLogger, long j) {
        super(iLogger, j);
        this.hub = (IHub) Objects.requireNonNull(iHub, "Hub is required.");
        this.serializer = (ISerializer) Objects.requireNonNull(iSerializer, "Serializer is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
    }

    /* access modifiers changed from: protected */
    public void processFile(File file, Object obj) {
        boolean z;
        boolean isRetry;
        BufferedInputStream bufferedInputStream;
        if (!file.isFile()) {
            this.logger.log(SentryLevel.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        } else if (!isRelevantFileName(file.getName())) {
            this.logger.log(SentryLevel.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        } else if (!file.getParentFile().canWrite()) {
            this.logger.log(SentryLevel.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
            return;
        } else {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                SentryEnvelope deserializeEnvelope = this.serializer.deserializeEnvelope(bufferedInputStream);
                if (deserializeEnvelope == null) {
                    this.logger.log(SentryLevel.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                } else {
                    this.hub.captureEnvelope(deserializeEnvelope, obj);
                }
                if (!(obj instanceof Flushable)) {
                    LogUtils.logIfNotFlushable(this.logger, obj);
                } else if (!((Flushable) obj).waitFlush()) {
                    this.logger.log(SentryLevel.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
                }
                bufferedInputStream.close();
                if (obj instanceof Retryable) {
                    if (!((Retryable) obj).isRetry()) {
                        safeDelete(file, "after trying to capture it");
                        this.logger.log(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
                        return;
                    }
                    this.logger.log(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
                    return;
                }
            } catch (FileNotFoundException e) {
                this.logger.log(SentryLevel.ERROR, e, "File '%s' cannot be found.", file.getAbsolutePath());
                if (obj instanceof Retryable) {
                    if (!((Retryable) obj).isRetry()) {
                        safeDelete(file, "after trying to capture it");
                        this.logger.log(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
                        return;
                    }
                    this.logger.log(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
                    return;
                }
            } catch (IOException e2) {
                this.logger.log(SentryLevel.ERROR, e2, "I/O on file '%s' failed.", file.getAbsolutePath());
                if (obj instanceof Retryable) {
                    if (!((Retryable) obj).isRetry()) {
                        safeDelete(file, "after trying to capture it");
                        this.logger.log(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
                        return;
                    }
                    this.logger.log(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
                    return;
                }
            } catch (Throwable th) {
                try {
                    this.logger.log(SentryLevel.ERROR, th, "Failed to capture cached envelope %s", file.getAbsolutePath());
                    if (obj instanceof Retryable) {
                        ((Retryable) obj).setRetry(false);
                        this.logger.log(SentryLevel.INFO, th, "File '%s' won't retry.", file.getAbsolutePath());
                    } else {
                        LogUtils.logIfNotRetryable(this.logger, obj);
                    }
                    if (z) {
                        if (isRetry) {
                            this.logger.log(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
                            return;
                        }
                        return;
                    }
                } finally {
                    if (!(obj instanceof Retryable)) {
                        LogUtils.logIfNotRetryable(this.logger, obj);
                    } else if (!((Retryable) obj).isRetry()) {
                        safeDelete(file, "after trying to capture it");
                        this.logger.log(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
                    } else {
                        this.logger.log(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
                    }
                }
            }
            LogUtils.logIfNotRetryable(this.logger, obj);
            return;
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public boolean isRelevantFileName(String str) {
        return str.endsWith(EnvelopeCache.SUFFIX_ENVELOPE_FILE);
    }

    public void processEnvelopeFile(String str, Object obj) {
        Objects.requireNonNull(str, "Path is required.");
        processFile(new File(str), obj);
    }

    private void safeDelete(File file, String str) {
        try {
            if (!file.delete()) {
                this.logger.log(SentryLevel.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
            }
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }
}
