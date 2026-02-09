package com.google.common.base;

import javax.annotation.CheckForNull;

@FunctionalInterface
@ElementTypesAreNonnullByDefault
public interface Predicate<T> extends java.util.function.Predicate<T> {
    boolean apply(@ParametricNullness T t);

    boolean equals(@CheckForNull Object obj);

    boolean test(@ParametricNullness T t) {
        return apply(t);
    }
}
