package com.google.common.util.concurrent;

import com.google.errorprone.annotations.DoNotMock;
import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@DoNotMock("Use FakeTimeLimiter")
public interface TimeLimiter {
    <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException;

    <T> T callWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException;

    <T> T newProxy(T t, Class<T> cls, long j, TimeUnit timeUnit);

    void runUninterruptiblyWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException;

    void runWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException;

    <T> T newProxy(T t, Class<T> cls, Duration duration) {
        return newProxy(t, cls, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }

    <T> T callWithTimeout(Callable<T> callable, Duration duration) throws TimeoutException, InterruptedException, ExecutionException {
        return callWithTimeout(callable, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }

    <T> T callUninterruptiblyWithTimeout(Callable<T> callable, Duration duration) throws TimeoutException, ExecutionException {
        return callUninterruptiblyWithTimeout(callable, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }

    void runWithTimeout(Runnable runnable, Duration duration) throws TimeoutException, InterruptedException {
        runWithTimeout(runnable, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }

    void runUninterruptiblyWithTimeout(Runnable runnable, Duration duration) throws TimeoutException {
        runUninterruptiblyWithTimeout(runnable, Internal.toNanosSaturated(duration), TimeUnit.NANOSECONDS);
    }
}
