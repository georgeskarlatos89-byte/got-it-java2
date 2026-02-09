package com.google.common.cache;

@FunctionalInterface
@ElementTypesAreNonnullByDefault
public interface RemovalListener<K, V> {
    void onRemoval(RemovalNotification<K, V> removalNotification);
}
