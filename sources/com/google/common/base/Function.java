package com.google.common.base;

import javax.annotation.CheckForNull;

@FunctionalInterface
@ElementTypesAreNonnullByDefault
public interface Function<F, T> extends java.util.function.Function<F, T> {
    @ParametricNullness
    T apply(@ParametricNullness F f);

    boolean equals(@CheckForNull Object obj);
}
