package com.google.common.cache;

@FunctionalInterface
@ElementTypesAreNonnullByDefault
public interface Weigher<K, V> {
    int weigh(K k, V v);
}
