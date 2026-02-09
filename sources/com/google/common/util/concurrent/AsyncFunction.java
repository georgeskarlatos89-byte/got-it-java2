package com.google.common.util.concurrent;

@FunctionalInterface
@ElementTypesAreNonnullByDefault
public interface AsyncFunction<I, O> {
    ListenableFuture<O> apply(@ParametricNullness I i) throws Exception;
}
