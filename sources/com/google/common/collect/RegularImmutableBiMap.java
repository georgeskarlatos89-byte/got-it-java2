package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMapEntry;
import com.google.common.collect.ImmutableMapEntrySet;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    static final RegularImmutableBiMap<Object, Object> EMPTY = new RegularImmutableBiMap((ImmutableMapEntry<K, V>[]) null, (ImmutableMapEntry<K, V>[]) null, ImmutableMap.EMPTY_ENTRY_ARRAY, 0, 0);
    static final double MAX_LOAD_FACTOR = 1.2d;
    final transient Map.Entry<K, V>[] entries;
    /* access modifiers changed from: private */
    public final transient int hashCode;
    @CheckForNull
    @LazyInit
    private transient ImmutableBiMap<V, K> inverse;
    @CheckForNull
    private final transient ImmutableMapEntry<K, V>[] keyTable;
    /* access modifiers changed from: private */
    public final transient int mask;
    /* access modifiers changed from: private */
    @CheckForNull
    public final transient ImmutableMapEntry<K, V>[] valueTable;

    /* access modifiers changed from: package-private */
    public boolean isHashCodeFast() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return false;
    }

    static <K, V> ImmutableBiMap<K, V> fromEntries(Map.Entry<K, V>... entryArr) {
        return fromEntryArray(entryArr.length, entryArr);
    }

    static <K, V> ImmutableBiMap<K, V> fromEntryArray(int i, Map.Entry<K, V>[] entryArr) {
        ImmutableMapEntry immutableMapEntry;
        int i2 = i;
        Map.Entry<K, V>[] entryArr2 = entryArr;
        Preconditions.checkPositionIndex(i2, entryArr2.length);
        int closedTableSize = Hashing.closedTableSize(i2, MAX_LOAD_FACTOR);
        int i3 = closedTableSize - 1;
        ImmutableMapEntry[] createEntryArray = ImmutableMapEntry.createEntryArray(closedTableSize);
        ImmutableMapEntry[] createEntryArray2 = ImmutableMapEntry.createEntryArray(closedTableSize);
        ImmutableMapEntry[] createEntryArray3 = i2 == entryArr2.length ? entryArr2 : ImmutableMapEntry.createEntryArray(i);
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Map.Entry entry = (Map.Entry) Objects.requireNonNull(entryArr2[i4]);
            Object key = entry.getKey();
            Object value = entry.getValue();
            CollectPreconditions.checkEntryNotNull(key, value);
            int hashCode2 = key.hashCode();
            int hashCode3 = value.hashCode();
            int smear = Hashing.smear(hashCode2) & i3;
            int smear2 = Hashing.smear(hashCode3) & i3;
            ImmutableMapEntry immutableMapEntry2 = createEntryArray[smear];
            int checkNoConflictInKeyBucket = RegularImmutableMap.checkNoConflictInKeyBucket(key, entry, immutableMapEntry2);
            ImmutableMapEntry immutableMapEntry3 = createEntryArray2[smear2];
            int i6 = i3;
            int checkNoConflictInValueBucket = checkNoConflictInValueBucket(value, entry, immutableMapEntry3);
            int i7 = i5;
            if (checkNoConflictInKeyBucket > 8 || checkNoConflictInValueBucket > 8) {
                return JdkBackedImmutableBiMap.create(i, entryArr);
            }
            if (immutableMapEntry3 == null && immutableMapEntry2 == null) {
                immutableMapEntry = RegularImmutableMap.makeImmutable(entry, key, value);
            } else {
                immutableMapEntry = new ImmutableMapEntry.NonTerminalImmutableBiMapEntry(key, value, immutableMapEntry2, immutableMapEntry3);
            }
            createEntryArray[smear] = immutableMapEntry;
            createEntryArray2[smear2] = immutableMapEntry;
            createEntryArray3[i4] = immutableMapEntry;
            i5 = i7 + (hashCode2 ^ hashCode3);
            i4++;
            i2 = i;
            entryArr2 = entryArr;
            i3 = i6;
        }
        int i8 = i3;
        int i9 = i5;
        return new RegularImmutableBiMap(createEntryArray, createEntryArray2, createEntryArray3, i3, i5);
    }

    private RegularImmutableBiMap(@CheckForNull ImmutableMapEntry<K, V>[] immutableMapEntryArr, @CheckForNull ImmutableMapEntry<K, V>[] immutableMapEntryArr2, Map.Entry<K, V>[] entryArr, int i, int i2) {
        this.keyTable = immutableMapEntryArr;
        this.valueTable = immutableMapEntryArr2;
        this.entries = entryArr;
        this.mask = i;
        this.hashCode = i2;
    }

    private static int checkNoConflictInValueBucket(Object obj, Map.Entry<?, ?> entry, @CheckForNull ImmutableMapEntry<?, ?> immutableMapEntry) {
        int i = 0;
        while (immutableMapEntry != null) {
            checkNoConflict(!obj.equals(immutableMapEntry.getValue()), "value", entry, immutableMapEntry);
            i++;
            immutableMapEntry = immutableMapEntry.getNextInValueBucket();
        }
        return i;
    }

    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return RegularImmutableMap.get(obj, this.keyTable, this.mask);
    }

    /* access modifiers changed from: package-private */
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        if (isEmpty()) {
            return ImmutableSet.of();
        }
        return new ImmutableMapEntrySet.RegularEntrySet(this, this.entries);
    }

    /* access modifiers changed from: package-private */
    public ImmutableSet<K> createKeySet() {
        return new ImmutableMapKeySet(this);
    }

    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        Preconditions.checkNotNull(biConsumer);
        for (Map.Entry<K, V> entry : this.entries) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    public int hashCode() {
        return this.hashCode;
    }

    public int size() {
        return this.entries.length;
    }

    public ImmutableBiMap<V, K> inverse() {
        if (isEmpty()) {
            return ImmutableBiMap.of();
        }
        ImmutableBiMap<V, K> immutableBiMap = this.inverse;
        if (immutableBiMap != null) {
            return immutableBiMap;
        }
        Inverse inverse2 = new Inverse();
        this.inverse = inverse2;
        return inverse2;
    }

    private final class Inverse extends ImmutableBiMap<V, K> {
        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return false;
        }

        private Inverse() {
        }

        public int size() {
            return inverse().size();
        }

        public ImmutableBiMap<K, V> inverse() {
            return RegularImmutableBiMap.this;
        }

        public void forEach(BiConsumer<? super V, ? super K> biConsumer) {
            Preconditions.checkNotNull(biConsumer);
            RegularImmutableBiMap.this.forEach(new RegularImmutableBiMap$Inverse$$ExternalSyntheticLambda0(biConsumer));
        }

        @CheckForNull
        public K get(@CheckForNull Object obj) {
            if (!(obj == null || RegularImmutableBiMap.this.valueTable == null)) {
                for (ImmutableMapEntry immutableMapEntry = RegularImmutableBiMap.this.valueTable[Hashing.smear(obj.hashCode()) & RegularImmutableBiMap.this.mask]; immutableMapEntry != null; immutableMapEntry = immutableMapEntry.getNextInValueBucket()) {
                    if (obj.equals(immutableMapEntry.getValue())) {
                        return immutableMapEntry.getKey();
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public ImmutableSet<V> createKeySet() {
            return new ImmutableMapKeySet(this);
        }

        /* access modifiers changed from: package-private */
        public ImmutableSet<Map.Entry<V, K>> createEntrySet() {
            return new InverseEntrySet();
        }

        final class InverseEntrySet extends ImmutableMapEntrySet<V, K> {
            /* access modifiers changed from: package-private */
            public boolean isHashCodeFast() {
                return true;
            }

            InverseEntrySet() {
            }

            /* access modifiers changed from: package-private */
            public ImmutableMap<V, K> map() {
                return Inverse.this;
            }

            public int hashCode() {
                return RegularImmutableBiMap.this.hashCode;
            }

            public UnmodifiableIterator<Map.Entry<V, K>> iterator() {
                return asList().iterator();
            }

            public void forEach(Consumer<? super Map.Entry<V, K>> consumer) {
                asList().forEach(consumer);
            }

            /* access modifiers changed from: package-private */
            public ImmutableList<Map.Entry<V, K>> createAsList() {
                return new ImmutableAsList<Map.Entry<V, K>>() {
                    public Map.Entry<V, K> get(int i) {
                        Map.Entry<K, V> entry = RegularImmutableBiMap.this.entries[i];
                        return Maps.immutableEntry(entry.getValue(), entry.getKey());
                    }

                    /* access modifiers changed from: package-private */
                    public ImmutableCollection<Map.Entry<V, K>> delegateCollection() {
                        return InverseEntrySet.this;
                    }
                };
            }
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return new InverseSerializedForm(RegularImmutableBiMap.this);
        }
    }

    private static class InverseSerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        private final ImmutableBiMap<K, V> forward;

        InverseSerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            this.forward = immutableBiMap;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.forward.inverse();
        }
    }
}
