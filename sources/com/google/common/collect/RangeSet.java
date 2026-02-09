package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.lang.Comparable;
import java.util.Set;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@DoNotMock("Use ImmutableRangeSet or TreeRangeSet")
public interface RangeSet<C extends Comparable> {
    void add(Range<C> range);

    void addAll(RangeSet<C> rangeSet);

    Set<Range<C>> asDescendingSetOfRanges();

    Set<Range<C>> asRanges();

    void clear();

    RangeSet<C> complement();

    boolean contains(C c);

    boolean encloses(Range<C> range);

    boolean enclosesAll(RangeSet<C> rangeSet);

    boolean equals(@CheckForNull Object obj);

    int hashCode();

    boolean intersects(Range<C> range);

    boolean isEmpty();

    @CheckForNull
    Range<C> rangeContaining(C c);

    void remove(Range<C> range);

    void removeAll(RangeSet<C> rangeSet);

    Range<C> span();

    RangeSet<C> subRangeSet(Range<C> range);

    String toString();

    boolean enclosesAll(Iterable<Range<C>> iterable) {
        for (Range<C> encloses : iterable) {
            if (!encloses(encloses)) {
                return false;
            }
        }
        return true;
    }

    void addAll(Iterable<Range<C>> iterable) {
        for (Range<C> add : iterable) {
            add(add);
        }
    }

    void removeAll(Iterable<Range<C>> iterable) {
        for (Range<C> remove : iterable) {
            remove(remove);
        }
    }
}
