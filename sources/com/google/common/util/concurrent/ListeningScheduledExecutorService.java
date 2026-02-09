package com.google.common.util.concurrent;

import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
public interface ListeningScheduledExecutorService extends ScheduledExecutorService, ListeningExecutorService {
    ListenableScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit);

    <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit);

    ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    ListenableScheduledFuture<?> schedule(Runnable runnable, Duration duration) {
        return schedule(runnable, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }

    <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, Duration duration) {
        return schedule(callable, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }

    ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, Duration duration, Duration duration2) {
        return scheduleAtFixedRate(runnable, Internal.toNanosSaturated(duration), Internal.toNanosSaturated(duration2), TimeUnit.NANOSECONDS);
    }

    ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, Duration duration, Duration duration2) {
        return scheduleWithFixedDelay(runnable, Internal.toNanosSaturated(duration), Internal.toNanosSaturated(duration2), TimeUnit.NANOSECONDS);
    }
}
