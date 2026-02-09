package com.google.common.util.concurrent;

@FunctionalInterface
@ElementTypesAreNonnullByDefault
public interface AsyncCallable<V> {
    ListenableFuture<V> call() throws Exception;
}
