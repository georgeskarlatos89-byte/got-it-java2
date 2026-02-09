package com.google.common.collect;

import java.util.Comparator;
import java.util.Objects;
import java.util.Spliterator;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
final class ImmutableSortedAsList<E> extends RegularImmutableAsList<E> implements SortedIterable<E> {
    ImmutableSortedAsList(ImmutableSortedSet<E> immutableSortedSet, ImmutableList<E> immutableList) {
        super(immutableSortedSet, immutableList);
    }

    /* access modifiers changed from: package-private */
    public ImmutableSortedSet<E> delegateCollection() {
        return (ImmutableSortedSet) super.delegateCollection();
    }

    public Comparator<? super E> comparator() {
        return delegateCollection().comparator();
    }

    public int indexOf(@CheckForNull Object obj) {
        int indexOf = delegateCollection().indexOf(obj);
        if (indexOf < 0 || !get(indexOf).equals(obj)) {
            return -1;
        }
        return indexOf;
    }

    public int lastIndexOf(@CheckForNull Object obj) {
        return indexOf(obj);
    }

    public boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    public ImmutableList<E> subListUnchecked(int i, int i2) {
        return new RegularImmutableSortedSet(super.subListUnchecked(i, i2), comparator()).asList();
    }

    public Spliterator<E> spliterator() {
        int size = size();
        ImmutableList delegateList = delegateList();
        Objects.requireNonNull(delegateList);
        return CollectSpliterators.indexed(size, 1301, new ImmutableList$$ExternalSyntheticLambda0(delegateList), comparator());
    }
}
