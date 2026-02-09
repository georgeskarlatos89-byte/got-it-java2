package com.reactnativenavigation.utils;

import androidx.core.util.Pair;
import com.reactnativenavigation.utils.Functions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CollectionUtils {

    public interface Apply<T> {
        void on(T t);
    }

    public interface Comparator<T> {
        boolean compare(T t, T t2);
    }

    public interface Filter<T> {
        boolean filter(T t);
    }

    public interface KeyBy<K, V> {
        K by(V v);
    }

    public interface Mapper<T, S> {
        S map(T t);
    }

    public interface Reducer<S, T> {
        S reduce(T t, S s);
    }

    @SafeVarargs
    public static <T> List<T> asList(T... tArr) {
        ArrayList arrayList = new ArrayList();
        forEach(tArr, new CollectionUtils$$ExternalSyntheticLambda0(arrayList));
        return arrayList;
    }

    static /* synthetic */ void lambda$asList$0(ArrayList arrayList, Object obj) {
        if (obj != null) {
            arrayList.add(obj);
        }
    }

    public static boolean isNullOrEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static <K, V> Map<K, V> keyBy(Collection<V> collection, KeyBy<K, V> keyBy) {
        HashMap hashMap = new HashMap();
        for (V next : collection) {
            hashMap.put(keyBy.by(next), next);
        }
        return hashMap;
    }

    public static <T, S> ArrayList<S> map(Collection<T> collection, Mapper<T, S> mapper) {
        if (collection == null) {
            return null;
        }
        ArrayList<S> arrayList = new ArrayList<>();
        for (T map : collection) {
            arrayList.add(mapper.map(map));
        }
        return arrayList;
    }

    public static <T> List<T> filter(Collection<T> collection, Filter<T> filter) {
        ArrayList arrayList = new ArrayList();
        for (T next : collection) {
            if (filter.filter(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static <K, V> V getOrDefault(Map<K, V> map, K k, Functions.FuncR<V> funcR) {
        if (map == null) {
            return funcR.run();
        }
        return map.containsKey(k) ? map.get(k) : funcR.run();
    }

    public static <T> List<T> merge(Collection<T> collection, Collection<T> collection2, List<T> list) {
        ArrayList<T> merge = merge(collection, collection2);
        return merge == null ? list : merge;
    }

    public static <T> ArrayList<T> merge(Collection<T> collection, Collection<T> collection2) {
        if (collection == null && collection2 == null) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<>(get(collection));
        arrayList.addAll(get(collection2));
        return arrayList;
    }

    public static <T> List<T> difference(Collection<T> collection, Collection<T> collection2, Comparator<T> comparator) {
        if (collection2 == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        forEach(collection, new CollectionUtils$$ExternalSyntheticLambda1(collection2, comparator, arrayList));
        return arrayList;
    }

    static /* synthetic */ void lambda$difference$1(Collection collection, Comparator comparator, ArrayList arrayList, Object obj) {
        if (!contains(collection, obj, comparator)) {
            arrayList.add(obj);
        }
    }

    private static <T> boolean contains(Collection<T> collection, T t, Comparator<T> comparator) {
        for (T compare : collection) {
            if (comparator.compare(compare, t)) {
                return true;
            }
        }
        return false;
    }

    public static <T> void forEach(Collection<T> collection, Apply<T> apply) {
        if (collection != null) {
            forEach(new ArrayList(collection), 0, apply);
        }
    }

    public static <T> void forEach(T[] tArr, Apply<T> apply) {
        if (tArr != null) {
            for (T on : tArr) {
                apply.on(on);
            }
        }
    }

    public static <T> void forEach(List<T> list, Apply<T> apply) {
        forEach(list, 0, apply);
    }

    public static <T> void forEach(List<T> list, int i, Apply<T> apply) {
        if (list != null) {
            while (i < list.size()) {
                apply.on(list.get(i));
                i++;
            }
        }
    }

    public static <T> void forEachIndexed(List<T> list, Functions.Func2<T, Integer> func2) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                func2.run(list.get(i), Integer.valueOf(i));
            }
        }
    }

    public static <T> T first(Collection<T> collection, Filter<T> filter) {
        if (isNullOrEmpty(collection)) {
            return null;
        }
        for (T next : collection) {
            if (filter.filter(next)) {
                return next;
            }
        }
        return null;
    }

    public static <T> T first(Collection<T> collection, Filter<T> filter, Functions.Func1<T> func1) {
        if (isNullOrEmpty(collection)) {
            return null;
        }
        for (T next : collection) {
            if (filter.filter(next)) {
                func1.run(next);
                return next;
            }
        }
        return null;
    }

    public static <T> T last(List<T> list) {
        if (isNullOrEmpty(list)) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T> T requireLast(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> T removeLast(List<T> list) {
        return list.remove(list.size() - 1);
    }

    public static <S, T> S reduce(Collection<T> collection, S s, Reducer<S, T> reducer) {
        for (T reduce : collection) {
            s = reducer.reduce(reduce, s);
        }
        return s;
    }

    public static <T> Boolean reduce(Collection<T> collection, boolean z, Functions.FuncR1<T, Boolean> funcR1) {
        if (isNullOrEmpty(collection)) {
            return Boolean.valueOf(z);
        }
        for (T run : collection) {
            z &= funcR1.run(run).booleanValue();
            if (!z) {
                return false;
            }
        }
        return Boolean.valueOf(z);
    }

    public static <T> Collection<T> get(Collection<T> collection) {
        return collection == null ? Collections.emptyList() : collection;
    }

    public static <T> Collection<T> get(Map<?, T> map) {
        return map == null ? Collections.emptyList() : map.values();
    }

    public static <T> boolean equals(Collection<T> collection, Collection<T> collection2) {
        if (size(collection) != size(collection2)) {
            return false;
        }
        return ((Boolean) reduce(zip(collection, collection2), true, new CollectionUtils$$ExternalSyntheticLambda2())).booleanValue();
    }

    static /* synthetic */ Boolean lambda$equals$2(Pair pair, Boolean bool) {
        return Boolean.valueOf(bool.booleanValue() && Objects.equals(pair.first, pair.second));
    }

    public static int size(Collection collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static <T> Collection<Pair<T, T>> zip(Collection<T> collection, Collection<T> collection2) {
        if (collection == null || collection2 == null) {
            return new ArrayList();
        }
        Iterator<T> it = collection.iterator();
        Iterator<T> it2 = collection2.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> T safeGet(List<T> list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }
}
