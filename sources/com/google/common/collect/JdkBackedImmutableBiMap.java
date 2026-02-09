package com.google.common.collect;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.common.collect.ImmutableMapEntrySet;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
final class JdkBackedImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    private final Map<V, K> backwardDelegate;
    /* access modifiers changed from: private */
    public final transient ImmutableList<Map.Entry<K, V>> entries;
    private final Map<K, V> forwardDelegate;
    @CheckForNull
    @LazyInit
    private transient JdkBackedImmutableBiMap<V, K> inverse;

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return false;
    }

    static <K, V> ImmutableBiMap<K, V> create(int i, Map.Entry<K, V>[] entryArr) {
        HashMap newHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(i);
        HashMap newHashMapWithExpectedSize2 = Maps.newHashMapWithExpectedSize(i);
        int i2 = 0;
        while (i2 < i) {
            ImmutableMapEntry makeImmutable = RegularImmutableMap.makeImmutable((Map.Entry) Objects.requireNonNull(entryArr[i2]));
            entryArr[i2] = makeImmutable;
            Object putIfAbsent = newHashMapWithExpectedSize.putIfAbsent(makeImmutable.getKey(), makeImmutable.getValue());
            if (putIfAbsent == null) {
                Object putIfAbsent2 = newHashMapWithExpectedSize2.putIfAbsent(makeImmutable.getValue(), makeImmutable.getKey());
                if (putIfAbsent2 == null) {
                    i2++;
                } else {
                    String valueOf = String.valueOf(putIfAbsent2);
                    String valueOf2 = String.valueOf(makeImmutable.getValue());
                    throw conflictException("value", new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString(), entryArr[i2]);
                }
            } else {
                String valueOf3 = String.valueOf(makeImmutable.getKey());
                String valueOf4 = String.valueOf(putIfAbsent);
                throw conflictException(SDKConstants.PARAM_KEY, new StringBuilder(String.valueOf(valueOf3).length() + 1 + String.valueOf(valueOf4).length()).append(valueOf3).append("=").append(valueOf4).toString(), entryArr[i2]);
            }
        }
        return new JdkBackedImmutableBiMap(ImmutableList.asImmutableList(entryArr, i), newHashMapWithExpectedSize, newHashMapWithExpectedSize2);
    }

    private JdkBackedImmutableBiMap(ImmutableList<Map.Entry<K, V>> immutableList, Map<K, V> map, Map<V, K> map2) {
        this.entries = immutableList;
        this.forwardDelegate = map;
        this.backwardDelegate = map2;
    }

    public int size() {
        return this.entries.size();
    }

    public ImmutableBiMap<V, K> inverse() {
        JdkBackedImmutableBiMap<V, K> jdkBackedImmutableBiMap = this.inverse;
        if (jdkBackedImmutableBiMap != null) {
            return jdkBackedImmutableBiMap;
        }
        JdkBackedImmutableBiMap<V, K> jdkBackedImmutableBiMap2 = new JdkBackedImmutableBiMap<>(new InverseEntries(), this.backwardDelegate, this.forwardDelegate);
        this.inverse = jdkBackedImmutableBiMap2;
        jdkBackedImmutableBiMap2.inverse = this;
        return jdkBackedImmutableBiMap2;
    }

    private final class InverseEntries extends ImmutableList<Map.Entry<V, K>> {
        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return false;
        }

        private InverseEntries() {
        }

        public Map.Entry<V, K> get(int i) {
            Map.Entry entry = (Map.Entry) JdkBackedImmutableBiMap.this.entries.get(i);
            return Maps.immutableEntry(entry.getValue(), entry.getKey());
        }

        public int size() {
            return JdkBackedImmutableBiMap.this.entries.size();
        }
    }

    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return this.forwardDelegate.get(obj);
    }

    /* access modifiers changed from: package-private */
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new ImmutableMapEntrySet.RegularEntrySet(this, this.entries);
    }

    /* access modifiers changed from: package-private */
    public ImmutableSet<K> createKeySet() {
        return new ImmutableMapKeySet(this);
    }
}
