package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
final class SingletonImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    @CheckForNull
    private final transient ImmutableBiMap<V, K> inverse;
    @CheckForNull
    @LazyInit
    private transient ImmutableBiMap<V, K> lazyInverse;
    final transient K singleKey;
    final transient V singleValue;

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return 1;
    }

    SingletonImmutableBiMap(K k, V v) {
        CollectPreconditions.checkEntryNotNull(k, v);
        this.singleKey = k;
        this.singleValue = v;
        this.inverse = null;
    }

    private SingletonImmutableBiMap(K k, V v, ImmutableBiMap<V, K> immutableBiMap) {
        this.singleKey = k;
        this.singleValue = v;
        this.inverse = immutableBiMap;
    }

    @CheckForNull
    public V get(@CheckForNull Object obj) {
        if (this.singleKey.equals(obj)) {
            return this.singleValue;
        }
        return null;
    }

    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        ((BiConsumer) Preconditions.checkNotNull(biConsumer)).accept(this.singleKey, this.singleValue);
    }

    public boolean containsKey(@CheckForNull Object obj) {
        return this.singleKey.equals(obj);
    }

    public boolean containsValue(@CheckForNull Object obj) {
        return this.singleValue.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return ImmutableSet.of(Maps.immutableEntry(this.singleKey, this.singleValue));
    }

    /* access modifiers changed from: package-private */
    public ImmutableSet<K> createKeySet() {
        return ImmutableSet.of(this.singleKey);
    }

    public ImmutableBiMap<V, K> inverse() {
        ImmutableBiMap<V, K> immutableBiMap = this.inverse;
        if (immutableBiMap != null) {
            return immutableBiMap;
        }
        ImmutableBiMap<V, K> immutableBiMap2 = this.lazyInverse;
        if (immutableBiMap2 != null) {
            return immutableBiMap2;
        }
        SingletonImmutableBiMap singletonImmutableBiMap = new SingletonImmutableBiMap(this.singleValue, this.singleKey, this);
        this.lazyInverse = singletonImmutableBiMap;
        return singletonImmutableBiMap;
    }
}
