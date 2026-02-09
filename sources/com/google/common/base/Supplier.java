package com.google.common.base;

@FunctionalInterface
@ElementTypesAreNonnullByDefault
public interface Supplier<T> extends java.util.function.Supplier<T> {
    @ParametricNullness
    T get();
}
