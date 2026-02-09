package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        boolean equals(@CheckForNull Object obj);

        int getCount();

        @ParametricNullness
        E getElement();

        int hashCode();

        String toString();
    }

    int add(@ParametricNullness E e, int i);

    boolean add(@ParametricNullness E e);

    boolean contains(@CheckForNull Object obj);

    boolean containsAll(Collection<?> collection);

    int count(@CheckForNull Object obj);

    Set<E> elementSet();

    Set<Entry<E>> entrySet();

    boolean equals(@CheckForNull Object obj);

    int hashCode();

    Iterator<E> iterator();

    int remove(@CheckForNull Object obj, int i);

    boolean remove(@CheckForNull Object obj);

    boolean removeAll(Collection<?> collection);

    boolean retainAll(Collection<?> collection);

    int setCount(@ParametricNullness E e, int i);

    boolean setCount(@ParametricNullness E e, int i, int i2);

    int size();

    String toString();

    void forEachEntry(ObjIntConsumer<? super E> objIntConsumer) {
        Preconditions.checkNotNull(objIntConsumer);
        entrySet().forEach(new Multiset$$ExternalSyntheticLambda0(objIntConsumer));
    }

    void forEach(Consumer<? super E> consumer) {
        Preconditions.checkNotNull(consumer);
        entrySet().forEach(new Multiset$$ExternalSyntheticLambda1(consumer));
    }

    static /* synthetic */ void lambda$forEach$1(Consumer consumer, Entry entry) {
        Object element = entry.getElement();
        int count = entry.getCount();
        for (int i = 0; i < count; i++) {
            consumer.accept(element);
        }
    }

    Spliterator<E> spliterator() {
        return Multisets.spliteratorImpl(this);
    }
}
