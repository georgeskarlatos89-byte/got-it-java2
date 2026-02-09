package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {
    /* access modifiers changed from: private */
    public final ImmutableMap<K, V> map;

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return true;
    }

    ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    public int size() {
        return this.map.size();
    }

    public UnmodifiableIterator<V> iterator() {
        return new UnmodifiableIterator<V>() {
            final UnmodifiableIterator<Map.Entry<K, V>> entryItr;

            {
                this.entryItr = ImmutableMapValues.this.map.entrySet().iterator();
            }

            public boolean hasNext() {
                return this.entryItr.hasNext();
            }

            public V next() {
                return ((Map.Entry) this.entryItr.next()).getValue();
            }
        };
    }

    public Spliterator<V> spliterator() {
        return CollectSpliterators.map(this.map.entrySet().spliterator(), new ImmutableMapValues$$ExternalSyntheticLambda0());
    }

    public boolean contains(@CheckForNull Object obj) {
        return obj != null && Iterators.contains(iterator(), obj);
    }

    public ImmutableList<V> asList() {
        final ImmutableList<Map.Entry<K, V>> asList = this.map.entrySet().asList();
        return new ImmutableAsList<V>() {
            public V get(int i) {
                return ((Map.Entry) asList.get(i)).getValue();
            }

            /* access modifiers changed from: package-private */
            public ImmutableCollection<V> delegateCollection() {
                return ImmutableMapValues.this;
            }
        };
    }

    public void forEach(Consumer<? super V> consumer) {
        Preconditions.checkNotNull(consumer);
        this.map.forEach(new ImmutableMapValues$$ExternalSyntheticLambda1(consumer));
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
