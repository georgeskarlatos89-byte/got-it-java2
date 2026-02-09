package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

final class NoOpSentryExecutorService implements ISentryExecutorService {
    private static final NoOpSentryExecutorService instance = new NoOpSentryExecutorService();

    static /* synthetic */ Object lambda$submit$0() throws Exception {
        return null;
    }

    public void close(long j) {
    }

    private NoOpSentryExecutorService() {
    }

    public static ISentryExecutorService getInstance() {
        return instance;
    }

    public Future<?> submit(Runnable runnable) {
        return new FutureTask(new NoOpSentryExecutorService$$ExternalSyntheticLambda0());
    }
}
