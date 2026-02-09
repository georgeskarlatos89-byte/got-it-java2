package com.google.common.collect;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMapEntrySet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
final class JdkBackedImmutableMap<K, V> extends ImmutableMap<K, V> {
    private final transient Map<K, V> delegateMap;
    private final transient ImmutableList<Map.Entry<K, V>> entries;

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return false;
    }

    static <K, V> ImmutableMap<K, V> create(int i, Map.Entry<K, V>[] entryArr) {
        HashMap newHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(i);
        int i2 = 0;
        while (i2 < i) {
            ImmutableMapEntry makeImmutable = RegularImmutableMap.makeImmutable((Map.Entry) Objects.requireNonNull(entryArr[i2]));
            entryArr[i2] = makeImmutable;
            Object putIfAbsent = newHashMapWithExpectedSize.putIfAbsent(makeImmutable.getKey(), entryArr[i2].getValue());
            if (putIfAbsent == null) {
                i2++;
            } else {
                Map.Entry<K, V> entry = entryArr[i2];
                String valueOf = String.valueOf(entry.getKey());
                String valueOf2 = String.valueOf(putIfAbsent);
                throw conflictException(SDKConstants.PARAM_KEY, entry, new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString());
            }
        }
        return new JdkBackedImmutableMap(newHashMapWithExpectedSize, ImmutableList.asImmutableList(entryArr, i));
    }

    JdkBackedImmutableMap(Map<K, V> map, ImmutableList<Map.Entry<K, V>> immutableList) {
        this.delegateMap = map;
        this.entries = immutableList;
    }

    public int size() {
        return this.entries.size();
    }

    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return this.delegateMap.get(obj);
    }

    /* access modifiers changed from: package-private */
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new ImmutableMapEntrySet.RegularEntrySet(this, this.entries);
    }

    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        Preconditions.checkNotNull(biConsumer);
        this.entries.forEach(new JdkBackedImmutableMap$$ExternalSyntheticLambda0(biConsumer));
    }

    /* access modifiers changed from: package-private */
    public ImmutableSet<K> createKeySet() {
        return new ImmutableMapKeySet(this);
    }

    /* access modifiers changed from: package-private */
    public ImmutableCollection<V> createValues() {
        return new ImmutableMapValues(this);
    }
}
