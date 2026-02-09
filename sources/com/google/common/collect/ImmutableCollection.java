package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Predicate;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@DoNotMock("Use ImmutableList.of or another implementation")
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] EMPTY_ARRAY = new Object[0];
    static final int SPLITERATOR_CHARACTERISTICS = 1296;

    public abstract boolean contains(@CheckForNull Object obj);

    /* access modifiers changed from: package-private */
    @CheckForNull
    public Object[] internalArray() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean isPartialView();

    public abstract UnmodifiableIterator<E> iterator();

    ImmutableCollection() {
    }

    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, SPLITERATOR_CHARACTERISTICS);
    }

    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }

    public final <T> T[] toArray(T[] tArr) {
        Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] internalArray = internalArray();
            if (internalArray != null) {
                return Platform.copy(internalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = ObjectArrays.newArray(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        int size = size();
        if (size == 0) {
            return ImmutableList.of();
        }
        if (size != 1) {
            return new RegularImmutableAsList(this, toArray());
        }
        return ImmutableList.of(iterator().next());
    }

    /* access modifiers changed from: package-private */
    public int copyIntoArray(Object[] objArr, int i) {
        UnmodifiableIterator it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    @DoNotMock
    public static abstract class Builder<E> {
        static final int DEFAULT_INITIAL_CAPACITY = 4;

        public abstract Builder<E> add(E e);

        public abstract ImmutableCollection<E> build();

        static int expandedCapacity(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        Builder() {
        }

        public Builder<E> add(E... eArr) {
            for (E add : eArr) {
                add(add);
            }
            return this;
        }

        public Builder<E> addAll(Iterable<? extends E> iterable) {
            for (Object add : iterable) {
                add(add);
            }
            return this;
        }

        public Builder<E> addAll(Iterator<? extends E> it) {
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }
    }
}
