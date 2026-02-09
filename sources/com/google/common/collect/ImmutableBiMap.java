package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
public abstract class ImmutableBiMap<K, V> extends ImmutableBiMapFauxverideShim<K, V> implements BiMap<K, V> {
    public abstract ImmutableBiMap<V, K> inverse();

    public static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> toImmutableBiMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableBiMap(function, function2);
    }

    public static <K, V> ImmutableBiMap<K, V> of() {
        return RegularImmutableBiMap.EMPTY;
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v) {
        return new SingletonImmutableBiMap(k, v);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2) {
        return RegularImmutableBiMap.fromEntries(entryOf(k, v), entryOf(k2, v2));
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        return RegularImmutableBiMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3));
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return RegularImmutableBiMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4));
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return RegularImmutableBiMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5));
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        return RegularImmutableBiMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6));
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        return RegularImmutableBiMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6), entryOf(k7, v7));
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        return RegularImmutableBiMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6), entryOf(k7, v7), entryOf(k8, v8));
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        return RegularImmutableBiMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6), entryOf(k7, v7), entryOf(k8, v8), entryOf(k9, v9));
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        return RegularImmutableBiMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6), entryOf(k7, v7), entryOf(k8, v8), entryOf(k9, v9), entryOf(k10, v10));
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return RegularImmutableBiMap.fromEntries(entryArr);
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedSize(int i) {
        CollectPreconditions.checkNonnegative(i, "expectedSize");
        return new Builder<>(i);
    }

    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public Builder() {
        }

        Builder(int i) {
            super(i);
        }

        public Builder<K, V> put(K k, V v) {
            super.put(k, v);
            return this;
        }

        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put(entry);
            return this;
        }

        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll(map);
            return this;
        }

        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll(iterable);
            return this;
        }

        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            super.orderEntriesByValue(comparator);
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder<K, V> combine(ImmutableMap.Builder<K, V> builder) {
            super.combine(builder);
            return this;
        }

        public ImmutableBiMap<K, V> build() {
            return buildOrThrow();
        }

        public ImmutableBiMap<K, V> buildOrThrow() {
            int i = this.size;
            if (i == 0) {
                return ImmutableBiMap.of();
            }
            if (i != 1) {
                if (this.valueComparator != null) {
                    if (this.entriesUsed) {
                        this.entries = (Map.Entry[]) Arrays.copyOf(this.entries, this.size);
                    }
                    Arrays.sort(this.entries, 0, this.size, Ordering.from(this.valueComparator).onResultOf(Maps.valueFunction()));
                }
                this.entriesUsed = true;
                return RegularImmutableBiMap.fromEntryArray(this.size, this.entries);
            }
            Map.Entry entry = (Map.Entry) Objects.requireNonNull(this.entries[0]);
            return ImmutableBiMap.of(entry.getKey(), entry.getValue());
        }

        /* access modifiers changed from: package-private */
        public ImmutableBiMap<K, V> buildJdkBacked() {
            Preconditions.checkState(this.valueComparator == null, "buildJdkBacked is for tests only, doesn't support orderEntriesByValue");
            int i = this.size;
            if (i == 0) {
                return ImmutableBiMap.of();
            }
            if (i != 1) {
                this.entriesUsed = true;
                return RegularImmutableBiMap.fromEntryArray(this.size, this.entries);
            }
            Map.Entry entry = (Map.Entry) Objects.requireNonNull(this.entries[0]);
            return ImmutableBiMap.of(entry.getKey(), entry.getValue());
        }
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) Iterables.toArray(iterable, (T[]) EMPTY_ENTRY_ARRAY);
        int length = entryArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return RegularImmutableBiMap.fromEntries(entryArr);
        }
        Map.Entry entry = entryArr[0];
        return of(entry.getKey(), entry.getValue());
    }

    ImmutableBiMap() {
    }

    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    /* access modifiers changed from: package-private */
    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    @CheckForNull
    @Deprecated
    public final V forcePut(K k, V v) {
        throw new UnsupportedOperationException();
    }

    private static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        SerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        /* access modifiers changed from: package-private */
        public Builder<K, V> makeBuilder(int i) {
            return new Builder<>(i);
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
