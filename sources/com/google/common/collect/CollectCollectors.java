package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.MultimapBuilder;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
final class CollectCollectors {
    private static final Collector<Object, ?, ImmutableList<Object>> TO_IMMUTABLE_LIST = Collector.of(new CollectCollectors$$ExternalSyntheticLambda17(), new CollectCollectors$$ExternalSyntheticLambda20(), new CollectCollectors$$ExternalSyntheticLambda21(), new CollectCollectors$$ExternalSyntheticLambda23(), new Collector.Characteristics[0]);
    private static final Collector<Range<Comparable<?>>, ?, ImmutableRangeSet<Comparable<?>>> TO_IMMUTABLE_RANGE_SET = Collector.of(new CollectCollectors$$ExternalSyntheticLambda28(), new CollectCollectors$$ExternalSyntheticLambda29(), new CollectCollectors$$ExternalSyntheticLambda18(), new CollectCollectors$$ExternalSyntheticLambda19(), new Collector.Characteristics[0]);
    private static final Collector<Object, ?, ImmutableSet<Object>> TO_IMMUTABLE_SET = Collector.of(new CollectCollectors$$ExternalSyntheticLambda24(), new CollectCollectors$$ExternalSyntheticLambda25(), new CollectCollectors$$ExternalSyntheticLambda26(), new CollectCollectors$$ExternalSyntheticLambda27(), new Collector.Characteristics[0]);

    public static /* synthetic */ LinkedHashMap $r8$lambda$Rr5wHpoNM5boD4b5K8greFBFLF8() {
        return new LinkedHashMap();
    }

    CollectCollectors() {
    }

    static <E> Collector<E, ?, ImmutableList<E>> toImmutableList() {
        return TO_IMMUTABLE_LIST;
    }

    static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return TO_IMMUTABLE_SET;
    }

    static <E> Collector<E, ?, ImmutableSortedSet<E>> toImmutableSortedSet(Comparator<? super E> comparator) {
        Preconditions.checkNotNull(comparator);
        return Collector.of(new CollectCollectors$$ExternalSyntheticLambda60(comparator), new CollectCollectors$$ExternalSyntheticLambda61(), new CollectCollectors$$ExternalSyntheticLambda62(), new CollectCollectors$$ExternalSyntheticLambda63(), new Collector.Characteristics[0]);
    }

    static /* synthetic */ ImmutableSortedSet.Builder lambda$toImmutableSortedSet$0(Comparator comparator) {
        return new ImmutableSortedSet.Builder(comparator);
    }

    static <E extends Enum<E>> Collector<E, ?, ImmutableSet<E>> toImmutableEnumSet() {
        return EnumSetAccumulator.TO_IMMUTABLE_ENUM_SET;
    }

    private static final class EnumSetAccumulator<E extends Enum<E>> {
        static final Collector<Enum<?>, ?, ImmutableSet<? extends Enum<?>>> TO_IMMUTABLE_ENUM_SET = Collector.of(new CollectCollectors$EnumSetAccumulator$$ExternalSyntheticLambda0(), new CollectCollectors$EnumSetAccumulator$$ExternalSyntheticLambda1(), new CollectCollectors$EnumSetAccumulator$$ExternalSyntheticLambda2(), new CollectCollectors$EnumSetAccumulator$$ExternalSyntheticLambda3(), new Collector.Characteristics[]{Collector.Characteristics.UNORDERED});
        @CheckForNull
        private EnumSet<E> set;

        public static /* synthetic */ EnumSetAccumulator $r8$lambda$DXK1D4ohk3Ds4wC3bR4Gyv_uoNM() {
            return new EnumSetAccumulator();
        }

        private EnumSetAccumulator() {
        }

        /* access modifiers changed from: package-private */
        public void add(E e) {
            EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                this.set = EnumSet.of(e);
            } else {
                enumSet.add(e);
            }
        }

        /* access modifiers changed from: package-private */
        public EnumSetAccumulator<E> combine(EnumSetAccumulator<E> enumSetAccumulator) {
            EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                return enumSetAccumulator;
            }
            EnumSet<E> enumSet2 = enumSetAccumulator.set;
            if (enumSet2 == null) {
                return this;
            }
            enumSet.addAll(enumSet2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public ImmutableSet<E> toImmutableSet() {
            EnumSet<E> enumSet = this.set;
            return enumSet == null ? ImmutableSet.of() : ImmutableEnumSet.asImmutable(enumSet);
        }
    }

    static <E extends Comparable<? super E>> Collector<Range<E>, ?, ImmutableRangeSet<E>> toImmutableRangeSet() {
        return TO_IMMUTABLE_RANGE_SET;
    }

    static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        return Collector.of(new CollectCollectors$$ExternalSyntheticLambda4(), new CollectCollectors$$ExternalSyntheticLambda5(function, toIntFunction), new CollectCollectors$$ExternalSyntheticLambda6(), new CollectCollectors$$ExternalSyntheticLambda7(), new Collector.Characteristics[0]);
    }

    static <T, E, M extends Multiset<E>> Collector<T, ?, M> toMultiset(Function<? super T, E> function, ToIntFunction<? super T> toIntFunction, Supplier<M> supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        Preconditions.checkNotNull(supplier);
        return Collector.of(supplier, new CollectCollectors$$ExternalSyntheticLambda0(function, toIntFunction), new CollectCollectors$$ExternalSyntheticLambda11(), new Collector.Characteristics[0]);
    }

    static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new CollectCollectors$$ExternalSyntheticLambda45(), new CollectCollectors$$ExternalSyntheticLambda46(function, function2), new CollectCollectors$$ExternalSyntheticLambda47(), new CollectCollectors$$ExternalSyntheticLambda48(), new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new CollectCollectors$$ExternalSyntheticLambda2()), new CollectCollectors$$ExternalSyntheticLambda3());
    }

    static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new CollectCollectors$$ExternalSyntheticLambda51(comparator), new CollectCollectors$$ExternalSyntheticLambda52(function, function2), new CollectCollectors$$ExternalSyntheticLambda53(), new CollectCollectors$$ExternalSyntheticLambda54(), new Collector.Characteristics[]{Collector.Characteristics.UNORDERED});
    }

    static /* synthetic */ ImmutableSortedMap.Builder lambda$toImmutableSortedMap$7(Comparator comparator) {
        return new ImmutableSortedMap.Builder(comparator);
    }

    static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new CollectCollectors$$ExternalSyntheticLambda22(comparator)), new CollectCollectors$$ExternalSyntheticLambda33());
    }

    static /* synthetic */ TreeMap lambda$toImmutableSortedMap$9(Comparator comparator) {
        return new TreeMap(comparator);
    }

    static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> toImmutableBiMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new CollectCollectors$$ExternalSyntheticLambda13(), new CollectCollectors$$ExternalSyntheticLambda14(function, function2), new CollectCollectors$$ExternalSyntheticLambda15(), new CollectCollectors$$ExternalSyntheticLambda16(), new Collector.Characteristics[0]);
    }

    static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new CollectCollectors$$ExternalSyntheticLambda8(), new CollectCollectors$$ExternalSyntheticLambda9(function, function2), new CollectCollectors$$ExternalSyntheticLambda10(), new CollectCollectors$$ExternalSyntheticLambda12(), new Collector.Characteristics[]{Collector.Characteristics.UNORDERED});
    }

    static /* synthetic */ EnumMapAccumulator lambda$toImmutableEnumMap$12() {
        return new EnumMapAccumulator(new CollectCollectors$$ExternalSyntheticLambda43());
    }

    static /* synthetic */ Object lambda$toImmutableEnumMap$11(Object obj, Object obj2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length()).append("Multiple values for key: ").append(valueOf).append(", ").append(valueOf2).toString());
    }

    static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collector.of(new CollectCollectors$$ExternalSyntheticLambda49(binaryOperator), new CollectCollectors$$ExternalSyntheticLambda50(function, function2), new CollectCollectors$$ExternalSyntheticLambda10(), new CollectCollectors$$ExternalSyntheticLambda12(), new Collector.Characteristics[0]);
    }

    static /* synthetic */ EnumMapAccumulator lambda$toImmutableEnumMap$14(BinaryOperator binaryOperator) {
        return new EnumMapAccumulator(binaryOperator);
    }

    private static class EnumMapAccumulator<K extends Enum<K>, V> {
        @CheckForNull
        private EnumMap<K, V> map = null;
        private final BinaryOperator<V> mergeFunction;

        EnumMapAccumulator(BinaryOperator<V> binaryOperator) {
            this.mergeFunction = binaryOperator;
        }

        /* access modifiers changed from: package-private */
        public void put(K k, V v) {
            if (this.map == null) {
                this.map = new EnumMap<>(k.getDeclaringClass());
            }
            this.map.merge(k, v, this.mergeFunction);
        }

        /* access modifiers changed from: package-private */
        public EnumMapAccumulator<K, V> combine(EnumMapAccumulator<K, V> enumMapAccumulator) {
            if (this.map == null) {
                return enumMapAccumulator;
            }
            EnumMap<K, V> enumMap = enumMapAccumulator.map;
            if (enumMap == null) {
                return this;
            }
            enumMap.forEach(new CollectCollectors$EnumMapAccumulator$$ExternalSyntheticLambda0(this));
            return this;
        }

        /* access modifiers changed from: package-private */
        public ImmutableMap<K, V> toImmutableMap() {
            EnumMap<K, V> enumMap = this.map;
            return enumMap == null ? ImmutableMap.of() : ImmutableEnumMap.asImmutable(enumMap);
        }
    }

    static <T, K extends Comparable<? super K>, V> Collector<T, ?, ImmutableRangeMap<K, V>> toImmutableRangeMap(Function<? super T, Range<K>> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new CollectCollectors$$ExternalSyntheticLambda39(), new CollectCollectors$$ExternalSyntheticLambda40(function, function2), new CollectCollectors$$ExternalSyntheticLambda41(), new CollectCollectors$$ExternalSyntheticLambda42(), new Collector.Characteristics[0]);
    }

    static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> toImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function, "keyFunction");
        Preconditions.checkNotNull(function2, "valueFunction");
        return Collector.of(new CollectCollectors$$ExternalSyntheticLambda56(), new CollectCollectors$$ExternalSyntheticLambda57(function, function2), new CollectCollectors$$ExternalSyntheticLambda58(), new CollectCollectors$$ExternalSyntheticLambda59(), new Collector.Characteristics[0]);
    }

    static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        CollectCollectors$$ExternalSyntheticLambda44 collectCollectors$$ExternalSyntheticLambda44 = new CollectCollectors$$ExternalSyntheticLambda44(function);
        CollectCollectors$$ExternalSyntheticLambda55 collectCollectors$$ExternalSyntheticLambda55 = new CollectCollectors$$ExternalSyntheticLambda55(function2);
        MultimapBuilder.ListMultimapBuilder<Object, Object> arrayListValues = MultimapBuilder.linkedHashKeys().arrayListValues();
        Objects.requireNonNull(arrayListValues);
        return Collectors.collectingAndThen(flatteningToMultimap(collectCollectors$$ExternalSyntheticLambda44, collectCollectors$$ExternalSyntheticLambda55, new CollectCollectors$$ExternalSyntheticLambda66(arrayListValues)), new CollectCollectors$$ExternalSyntheticLambda68());
    }

    static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> toImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function, "keyFunction");
        Preconditions.checkNotNull(function2, "valueFunction");
        return Collector.of(new CollectCollectors$$ExternalSyntheticLambda35(), new CollectCollectors$$ExternalSyntheticLambda36(function, function2), new CollectCollectors$$ExternalSyntheticLambda37(), new CollectCollectors$$ExternalSyntheticLambda38(), new Collector.Characteristics[0]);
    }

    static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> flatteningToImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        CollectCollectors$$ExternalSyntheticLambda30 collectCollectors$$ExternalSyntheticLambda30 = new CollectCollectors$$ExternalSyntheticLambda30(function);
        CollectCollectors$$ExternalSyntheticLambda31 collectCollectors$$ExternalSyntheticLambda31 = new CollectCollectors$$ExternalSyntheticLambda31(function2);
        MultimapBuilder.SetMultimapBuilder<Object, Object> linkedHashSetValues = MultimapBuilder.linkedHashKeys().linkedHashSetValues();
        Objects.requireNonNull(linkedHashSetValues);
        return Collectors.collectingAndThen(flatteningToMultimap(collectCollectors$$ExternalSyntheticLambda30, collectCollectors$$ExternalSyntheticLambda31, new CollectCollectors$$ExternalSyntheticLambda32(linkedHashSetValues)), new CollectCollectors$$ExternalSyntheticLambda34());
    }

    static <T, K, V, M extends Multimap<K, V>> Collector<T, ?, M> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Supplier<M> supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(supplier);
        return Collector.of(supplier, new CollectCollectors$$ExternalSyntheticLambda64(function, function2), new CollectCollectors$$ExternalSyntheticLambda65(), new Collector.Characteristics[0]);
    }

    static <T, K, V, M extends Multimap<K, V>> Collector<T, ?, M> flatteningToMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2, Supplier<M> supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(supplier);
        return Collector.of(supplier, new CollectCollectors$$ExternalSyntheticLambda69(function, function2), new CollectCollectors$$ExternalSyntheticLambda70(), new Collector.Characteristics[0]);
    }

    static /* synthetic */ void lambda$flatteningToMultimap$25(Function function, Function function2, Multimap multimap, Object obj) {
        Collection collection = multimap.get(function.apply(obj));
        Objects.requireNonNull(collection);
        ((Stream) function2.apply(obj)).forEachOrdered(new CollectCollectors$$ExternalSyntheticLambda67(collection));
    }
}
