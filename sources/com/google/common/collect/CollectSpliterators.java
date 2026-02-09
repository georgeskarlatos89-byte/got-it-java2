package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
final class CollectSpliterators {
    private CollectSpliterators() {
    }

    static <T> Spliterator<T> indexed(int i, int i2, IntFunction<T> intFunction) {
        return indexed(i, i2, intFunction, (Comparator) null);
    }

    static <T> Spliterator<T> indexed(int i, int i2, IntFunction<T> intFunction, @CheckForNull Comparator<? super T> comparator) {
        if (comparator != null) {
            Preconditions.checkArgument((i2 & 4) != 0);
        }
        return new AnonymousClass1WithCharacteristics(IntStream.range(0, i).spliterator(), intFunction, i2, comparator);
    }

    /* renamed from: com.google.common.collect.CollectSpliterators$1WithCharacteristics  reason: invalid class name */
    class AnonymousClass1WithCharacteristics implements Spliterator<T> {
        private final Spliterator.OfInt delegate;
        final /* synthetic */ Comparator val$comparator;
        final /* synthetic */ int val$extraCharacteristics;
        final /* synthetic */ IntFunction val$function;

        {
            this.val$function = r2;
            this.val$extraCharacteristics = r3;
            this.val$comparator = r4;
            this.delegate = r1;
        }

        public boolean tryAdvance(Consumer<? super T> consumer) {
            return this.delegate.tryAdvance(new CollectSpliterators$1WithCharacteristics$$ExternalSyntheticLambda1(consumer, this.val$function));
        }

        public void forEachRemaining(Consumer<? super T> consumer) {
            this.delegate.forEachRemaining(new CollectSpliterators$1WithCharacteristics$$ExternalSyntheticLambda0(consumer, this.val$function));
        }

        @CheckForNull
        public Spliterator<T> trySplit() {
            Spliterator.OfInt trySplit = this.delegate.trySplit();
            if (trySplit == null) {
                return null;
            }
            return new AnonymousClass1WithCharacteristics(trySplit, this.val$function, this.val$extraCharacteristics, this.val$comparator);
        }

        public long estimateSize() {
            return this.delegate.estimateSize();
        }

        public int characteristics() {
            return this.val$extraCharacteristics | 16464;
        }

        @CheckForNull
        public Comparator<? super T> getComparator() {
            if (hasCharacteristics(4)) {
                return this.val$comparator;
            }
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: package-private */
    public static <InElementT, OutElementT> Spliterator<OutElementT> map(final Spliterator<InElementT> spliterator, final Function<? super InElementT, ? extends OutElementT> function) {
        Preconditions.checkNotNull(spliterator);
        Preconditions.checkNotNull(function);
        return new Spliterator<OutElementT>() {
            public boolean tryAdvance(Consumer<? super OutElementT> consumer) {
                return spliterator.tryAdvance(new CollectSpliterators$1$$ExternalSyntheticLambda1(consumer, function));
            }

            public void forEachRemaining(Consumer<? super OutElementT> consumer) {
                spliterator.forEachRemaining(new CollectSpliterators$1$$ExternalSyntheticLambda0(consumer, function));
            }

            @CheckForNull
            public Spliterator<OutElementT> trySplit() {
                Spliterator trySplit = spliterator.trySplit();
                if (trySplit != null) {
                    return CollectSpliterators.map(trySplit, function);
                }
                return null;
            }

            public long estimateSize() {
                return spliterator.estimateSize();
            }

            public int characteristics() {
                return spliterator.characteristics() & -262;
            }
        };
    }

    static <T> Spliterator<T> filter(final Spliterator<T> spliterator, final Predicate<? super T> predicate) {
        Preconditions.checkNotNull(spliterator);
        Preconditions.checkNotNull(predicate);
        return new Object() {
            @CheckForNull
            T holder = null;

            public void accept(@ParametricNullness T t) {
                this.holder = t;
            }

            public boolean tryAdvance(Consumer<? super T> consumer) {
                while (spliterator.tryAdvance(this)) {
                    try {
                        Object uncheckedCastNullableTToT = NullnessCasts.uncheckedCastNullableTToT(this.holder);
                        if (predicate.test(uncheckedCastNullableTToT)) {
                            consumer.accept(uncheckedCastNullableTToT);
                            this.holder = null;
                            return true;
                        }
                    } finally {
                        this.holder = null;
                    }
                }
                return false;
            }

            @CheckForNull
            public Spliterator<T> trySplit() {
                Spliterator trySplit = spliterator.trySplit();
                if (trySplit == null) {
                    return null;
                }
                return CollectSpliterators.filter(trySplit, predicate);
            }

            public long estimateSize() {
                return spliterator.estimateSize() / 2;
            }

            @CheckForNull
            public Comparator<? super T> getComparator() {
                return spliterator.getComparator();
            }

            public int characteristics() {
                return spliterator.characteristics() & 277;
            }
        };
    }

    static <InElementT, OutElementT> Spliterator<OutElementT> flatMap(Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator<OutElementT>> function, int i, long j) {
        boolean z = true;
        Preconditions.checkArgument((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        if ((i & 4) != 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "flatMap does not support SORTED characteristic");
        Preconditions.checkNotNull(spliterator);
        Preconditions.checkNotNull(function);
        return new FlatMapSpliteratorOfObject((Spliterator) null, spliterator, function, i, j);
    }

    static <InElementT> Spliterator.OfInt flatMapToInt(Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator.OfInt> function, int i, long j) {
        boolean z = true;
        Preconditions.checkArgument((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        if ((i & 4) != 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "flatMap does not support SORTED characteristic");
        Preconditions.checkNotNull(spliterator);
        Preconditions.checkNotNull(function);
        return new FlatMapSpliteratorOfInt((Spliterator.OfInt) null, spliterator, function, i, j);
    }

    static <InElementT> Spliterator.OfLong flatMapToLong(Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator.OfLong> function, int i, long j) {
        boolean z = true;
        Preconditions.checkArgument((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        if ((i & 4) != 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "flatMap does not support SORTED characteristic");
        Preconditions.checkNotNull(spliterator);
        Preconditions.checkNotNull(function);
        return new FlatMapSpliteratorOfLong((Spliterator.OfLong) null, spliterator, function, i, j);
    }

    static <InElementT> Spliterator.OfDouble flatMapToDouble(Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator.OfDouble> function, int i, long j) {
        boolean z = true;
        Preconditions.checkArgument((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        if ((i & 4) != 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "flatMap does not support SORTED characteristic");
        Preconditions.checkNotNull(spliterator);
        Preconditions.checkNotNull(function);
        return new FlatMapSpliteratorOfDouble((Spliterator.OfDouble) null, spliterator, function, i, j);
    }

    static abstract class FlatMapSpliterator<InElementT, OutElementT, OutSpliteratorT extends Spliterator<OutElementT>> implements Spliterator<OutElementT> {
        int characteristics;
        long estimatedSize;
        final Factory<InElementT, OutSpliteratorT> factory;
        final Spliterator<InElementT> from;
        final Function<? super InElementT, OutSpliteratorT> function;
        @CheckForNull
        OutSpliteratorT prefix;

        @FunctionalInterface
        interface Factory<InElementT, OutSpliteratorT extends Spliterator<?>> {
            OutSpliteratorT newFlatMapSpliterator(@CheckForNull OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function, int i, long j);
        }

        FlatMapSpliterator(@CheckForNull OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function2, Factory<InElementT, OutSpliteratorT> factory2, int i, long j) {
            this.prefix = outspliteratort;
            this.from = spliterator;
            this.function = function2;
            this.factory = factory2;
            this.characteristics = i;
            this.estimatedSize = j;
        }

        public final boolean tryAdvance(Consumer<? super OutElementT> consumer) {
            do {
                OutSpliteratorT outspliteratort = this.prefix;
                if (outspliteratort == null || !outspliteratort.tryAdvance(consumer)) {
                    this.prefix = null;
                } else {
                    long j = this.estimatedSize;
                    if (j == Long.MAX_VALUE) {
                        return true;
                    }
                    this.estimatedSize = j - 1;
                    return true;
                }
            } while (this.from.tryAdvance(new CollectSpliterators$FlatMapSpliterator$$ExternalSyntheticLambda1(this)));
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$tryAdvance$0$com-google-common-collect-CollectSpliterators$FlatMapSpliterator  reason: not valid java name */
        public /* synthetic */ void m843lambda$tryAdvance$0$comgooglecommoncollectCollectSpliterators$FlatMapSpliterator(Object obj) {
            this.prefix = (Spliterator) this.function.apply(obj);
        }

        public final void forEachRemaining(Consumer<? super OutElementT> consumer) {
            OutSpliteratorT outspliteratort = this.prefix;
            if (outspliteratort != null) {
                outspliteratort.forEachRemaining(consumer);
                this.prefix = null;
            }
            this.from.forEachRemaining(new CollectSpliterators$FlatMapSpliterator$$ExternalSyntheticLambda0(this, consumer));
            this.estimatedSize = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$forEachRemaining$1$com-google-common-collect-CollectSpliterators$FlatMapSpliterator  reason: not valid java name */
        public /* synthetic */ void m842lambda$forEachRemaining$1$comgooglecommoncollectCollectSpliterators$FlatMapSpliterator(Consumer consumer, Object obj) {
            Spliterator spliterator = (Spliterator) this.function.apply(obj);
            if (spliterator != null) {
                spliterator.forEachRemaining(consumer);
            }
        }

        @CheckForNull
        public final OutSpliteratorT trySplit() {
            Spliterator<InElementT> trySplit = this.from.trySplit();
            if (trySplit != null) {
                int i = this.characteristics & -65;
                long estimateSize = estimateSize();
                if (estimateSize < Long.MAX_VALUE) {
                    estimateSize /= 2;
                    this.estimatedSize -= estimateSize;
                    this.characteristics = i;
                }
                OutSpliteratorT newFlatMapSpliterator = this.factory.newFlatMapSpliterator(this.prefix, trySplit, this.function, i, estimateSize);
                this.prefix = null;
                return newFlatMapSpliterator;
            }
            OutSpliteratorT outspliteratort = this.prefix;
            if (outspliteratort == null) {
                return null;
            }
            this.prefix = null;
            return outspliteratort;
        }

        public final long estimateSize() {
            OutSpliteratorT outspliteratort = this.prefix;
            if (outspliteratort != null) {
                this.estimatedSize = Math.max(this.estimatedSize, outspliteratort.estimateSize());
            }
            return Math.max(this.estimatedSize, 0);
        }

        public final int characteristics() {
            return this.characteristics;
        }
    }

    static final class FlatMapSpliteratorOfObject<InElementT, OutElementT> extends FlatMapSpliterator<InElementT, OutElementT, Spliterator<OutElementT>> {
        FlatMapSpliteratorOfObject(@CheckForNull Spliterator<OutElementT> spliterator, Spliterator<InElementT> spliterator2, Function<? super InElementT, Spliterator<OutElementT>> function, int i, long j) {
            super(spliterator, spliterator2, function, new CollectSpliterators$FlatMapSpliteratorOfObject$$ExternalSyntheticLambda0(), i, j);
        }
    }

    static abstract class FlatMapSpliteratorOfPrimitive<InElementT, OutElementT, OutConsumerT, OutSpliteratorT extends Spliterator.OfPrimitive<OutElementT, OutConsumerT, OutSpliteratorT>> extends FlatMapSpliterator<InElementT, OutElementT, OutSpliteratorT> implements Spliterator.OfPrimitive<OutElementT, OutConsumerT, OutSpliteratorT> {
        @CheckForNull
        public /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
            return (Spliterator.OfPrimitive) super.trySplit();
        }

        FlatMapSpliteratorOfPrimitive(@CheckForNull OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function, FlatMapSpliterator.Factory<InElementT, OutSpliteratorT> factory, int i, long j) {
            super(outspliteratort, spliterator, function, factory, i, j);
        }

        public final boolean tryAdvance(OutConsumerT outconsumert) {
            do {
                if (this.prefix == null || !((Spliterator.OfPrimitive) this.prefix).tryAdvance(outconsumert)) {
                    this.prefix = null;
                } else if (this.estimatedSize == Long.MAX_VALUE) {
                    return true;
                } else {
                    this.estimatedSize--;
                    return true;
                }
            } while (this.from.tryAdvance(new CollectSpliterators$FlatMapSpliteratorOfPrimitive$$ExternalSyntheticLambda1(this)));
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$tryAdvance$0$com-google-common-collect-CollectSpliterators$FlatMapSpliteratorOfPrimitive  reason: not valid java name */
        public /* synthetic */ void m845lambda$tryAdvance$0$comgooglecommoncollectCollectSpliterators$FlatMapSpliteratorOfPrimitive(Object obj) {
            this.prefix = (Spliterator) this.function.apply(obj);
        }

        public final void forEachRemaining(OutConsumerT outconsumert) {
            if (this.prefix != null) {
                ((Spliterator.OfPrimitive) this.prefix).forEachRemaining(outconsumert);
                this.prefix = null;
            }
            this.from.forEachRemaining(new CollectSpliterators$FlatMapSpliteratorOfPrimitive$$ExternalSyntheticLambda0(this, outconsumert));
            this.estimatedSize = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$forEachRemaining$1$com-google-common-collect-CollectSpliterators$FlatMapSpliteratorOfPrimitive  reason: not valid java name */
        public /* synthetic */ void m844lambda$forEachRemaining$1$comgooglecommoncollectCollectSpliterators$FlatMapSpliteratorOfPrimitive(Object obj, Object obj2) {
            Spliterator.OfPrimitive ofPrimitive = (Spliterator.OfPrimitive) this.function.apply(obj2);
            if (ofPrimitive != null) {
                ofPrimitive.forEachRemaining(obj);
            }
        }
    }

    static final class FlatMapSpliteratorOfInt<InElementT> extends FlatMapSpliteratorOfPrimitive<InElementT, Integer, IntConsumer, Spliterator.OfInt> implements Spliterator.OfInt {
        public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
            super.forEachRemaining(intConsumer);
        }

        public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
            return super.tryAdvance(intConsumer);
        }

        @CheckForNull
        public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
            return (Spliterator.OfInt) super.trySplit();
        }

        FlatMapSpliteratorOfInt(@CheckForNull Spliterator.OfInt ofInt, Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator.OfInt> function, int i, long j) {
            super(ofInt, spliterator, function, new CollectSpliterators$FlatMapSpliteratorOfInt$$ExternalSyntheticLambda0(), i, j);
        }
    }

    static final class FlatMapSpliteratorOfLong<InElementT> extends FlatMapSpliteratorOfPrimitive<InElementT, Long, LongConsumer, Spliterator.OfLong> implements Spliterator.OfLong {
        public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
            super.forEachRemaining(longConsumer);
        }

        public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
            return super.tryAdvance(longConsumer);
        }

        @CheckForNull
        public /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
            return (Spliterator.OfLong) super.trySplit();
        }

        FlatMapSpliteratorOfLong(@CheckForNull Spliterator.OfLong ofLong, Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator.OfLong> function, int i, long j) {
            super(ofLong, spliterator, function, new CollectSpliterators$FlatMapSpliteratorOfLong$$ExternalSyntheticLambda0(), i, j);
        }
    }

    static final class FlatMapSpliteratorOfDouble<InElementT> extends FlatMapSpliteratorOfPrimitive<InElementT, Double, DoubleConsumer, Spliterator.OfDouble> implements Spliterator.OfDouble {
        public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
            super.forEachRemaining(doubleConsumer);
        }

        public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
            return super.tryAdvance(doubleConsumer);
        }

        @CheckForNull
        public /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
            return (Spliterator.OfDouble) super.trySplit();
        }

        FlatMapSpliteratorOfDouble(@CheckForNull Spliterator.OfDouble ofDouble, Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator.OfDouble> function, int i, long j) {
            super(ofDouble, spliterator, function, new CollectSpliterators$FlatMapSpliteratorOfDouble$$ExternalSyntheticLambda0(), i, j);
        }
    }
}
