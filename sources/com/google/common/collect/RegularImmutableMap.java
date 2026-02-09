package com.google.common.collect;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMapEntry;
import com.google.common.collect.ImmutableMapEntrySet;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    static final ImmutableMap<Object, Object> EMPTY = new RegularImmutableMap(ImmutableMap.EMPTY_ENTRY_ARRAY, (ImmutableMapEntry<K, V>[]) null, 0);
    static final double HASH_FLOODING_FPP = 0.001d;
    static final int MAX_HASH_BUCKET_LENGTH = 8;
    static final double MAX_LOAD_FACTOR = 1.2d;
    private static final long serialVersionUID = 0;
    final transient Map.Entry<K, V>[] entries;
    private final transient int mask;
    @CheckForNull
    private final transient ImmutableMapEntry<K, V>[] table;

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return false;
    }

    static <K, V> ImmutableMap<K, V> fromEntries(Map.Entry<K, V>... entryArr) {
        return fromEntryArray(entryArr.length, entryArr);
    }

    static <K, V> ImmutableMap<K, V> fromEntryArray(int i, Map.Entry<K, V>[] entryArr) {
        ImmutableMapEntry immutableMapEntry;
        Preconditions.checkPositionIndex(i, entryArr.length);
        if (i == 0) {
            return (RegularImmutableMap) EMPTY;
        }
        Map.Entry<K, V>[] createEntryArray = i == entryArr.length ? entryArr : ImmutableMapEntry.createEntryArray(i);
        int closedTableSize = Hashing.closedTableSize(i, MAX_LOAD_FACTOR);
        ImmutableMapEntry[] createEntryArray2 = ImmutableMapEntry.createEntryArray(closedTableSize);
        int i2 = closedTableSize - 1;
        for (int i3 = 0; i3 < i; i3++) {
            Map.Entry entry = (Map.Entry) Objects.requireNonNull(entryArr[i3]);
            Object key = entry.getKey();
            Object value = entry.getValue();
            CollectPreconditions.checkEntryNotNull(key, value);
            int smear = Hashing.smear(key.hashCode()) & i2;
            ImmutableMapEntry immutableMapEntry2 = createEntryArray2[smear];
            if (immutableMapEntry2 == null) {
                immutableMapEntry = makeImmutable(entry, key, value);
            } else {
                immutableMapEntry = new ImmutableMapEntry.NonTerminalImmutableMapEntry(key, value, immutableMapEntry2);
            }
            createEntryArray2[smear] = immutableMapEntry;
            createEntryArray[i3] = immutableMapEntry;
            if (checkNoConflictInKeyBucket(key, immutableMapEntry, immutableMapEntry2) > 8) {
                return JdkBackedImmutableMap.create(i, entryArr);
            }
        }
        return new RegularImmutableMap(createEntryArray, createEntryArray2, i2);
    }

    static <K, V> ImmutableMapEntry<K, V> makeImmutable(Map.Entry<K, V> entry, K k, V v) {
        return (entry instanceof ImmutableMapEntry) && ((ImmutableMapEntry) entry).isReusable() ? (ImmutableMapEntry) entry : new ImmutableMapEntry<>(k, v);
    }

    static <K, V> ImmutableMapEntry<K, V> makeImmutable(Map.Entry<K, V> entry) {
        return makeImmutable(entry, entry.getKey(), entry.getValue());
    }

    private RegularImmutableMap(Map.Entry<K, V>[] entryArr, @CheckForNull ImmutableMapEntry<K, V>[] immutableMapEntryArr, int i) {
        this.entries = entryArr;
        this.table = immutableMapEntryArr;
        this.mask = i;
    }

    static int checkNoConflictInKeyBucket(Object obj, Map.Entry<?, ?> entry, @CheckForNull ImmutableMapEntry<?, ?> immutableMapEntry) {
        int i = 0;
        while (immutableMapEntry != null) {
            checkNoConflict(!obj.equals(immutableMapEntry.getKey()), SDKConstants.PARAM_KEY, entry, immutableMapEntry);
            i++;
            immutableMapEntry = immutableMapEntry.getNextInKeyBucket();
        }
        return i;
    }

    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return get(obj, this.table, this.mask);
    }

    @CheckForNull
    static <V> V get(@CheckForNull Object obj, @CheckForNull ImmutableMapEntry<?, V>[] immutableMapEntryArr, int i) {
        if (!(obj == null || immutableMapEntryArr == null)) {
            for (ImmutableMapEntry<?, V> immutableMapEntry = immutableMapEntryArr[i & Hashing.smear(obj.hashCode())]; immutableMapEntry != null; immutableMapEntry = immutableMapEntry.getNextInKeyBucket()) {
                if (obj.equals(immutableMapEntry.getKey())) {
                    return immutableMapEntry.getValue();
                }
            }
        }
        return null;
    }

    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        Preconditions.checkNotNull(biConsumer);
        for (Map.Entry<K, V> entry : this.entries) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    public int size() {
        return this.entries.length;
    }

    /* access modifiers changed from: package-private */
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new ImmutableMapEntrySet.RegularEntrySet(this, this.entries);
    }

    /* access modifiers changed from: package-private */
    public ImmutableSet<K> createKeySet() {
        return new KeySet(this);
    }

    private static final class KeySet<K> extends IndexedImmutableSet<K> {
        private final RegularImmutableMap<K, ?> map;

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return true;
        }

        KeySet(RegularImmutableMap<K, ?> regularImmutableMap) {
            this.map = regularImmutableMap;
        }

        /* access modifiers changed from: package-private */
        public K get(int i) {
            return this.map.entries[i].getKey();
        }

        public boolean contains(@CheckForNull Object obj) {
            return this.map.containsKey(obj);
        }

        public int size() {
            return this.map.size();
        }

        private static class SerializedForm<K> implements Serializable {
            private static final long serialVersionUID = 0;
            final ImmutableMap<K, ?> map;

            SerializedForm(ImmutableMap<K, ?> immutableMap) {
                this.map = immutableMap;
            }

            /* access modifiers changed from: package-private */
            public Object readResolve() {
                return this.map.keySet();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ImmutableCollection<V> createValues() {
        return new Values(this);
    }

    private static final class Values<K, V> extends ImmutableList<V> {
        final RegularImmutableMap<K, V> map;

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return true;
        }

        Values(RegularImmutableMap<K, V> regularImmutableMap) {
            this.map = regularImmutableMap;
        }

        public V get(int i) {
            return this.map.entries[i].getValue();
        }

        public int size() {
            return this.map.size();
        }

        private static class SerializedForm<V> implements Serializable {
            private static final long serialVersionUID = 0;
            final ImmutableMap<?, V> map;

            SerializedForm(ImmutableMap<?, V> immutableMap) {
                this.map = immutableMap;
            }

            /* access modifiers changed from: package-private */
            public Object readResolve() {
                return this.map.values();
            }
        }
    }
}
