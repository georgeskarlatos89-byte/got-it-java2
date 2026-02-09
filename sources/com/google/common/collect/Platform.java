package com.google.common.collect;

import com.google.common.base.Strings;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
final class Platform {
    private static final Logger logger = Logger.getLogger(Platform.class.getName());

    static int reduceExponentIfGwt(int i) {
        return i;
    }

    static int reduceIterationsIfGwt(int i) {
        return i;
    }

    static <K, V> Map<K, V> newHashMapWithExpectedSize(int i) {
        return Maps.newHashMapWithExpectedSize(i);
    }

    static <K, V> Map<K, V> newLinkedHashMapWithExpectedSize(int i) {
        return Maps.newLinkedHashMapWithExpectedSize(i);
    }

    static <E> Set<E> newHashSetWithExpectedSize(int i) {
        return Sets.newHashSetWithExpectedSize(i);
    }

    static <E> Set<E> newConcurrentHashSet() {
        return ConcurrentHashMap.newKeySet();
    }

    static <E> Set<E> newLinkedHashSetWithExpectedSize(int i) {
        return Sets.newLinkedHashSetWithExpectedSize(i);
    }

    static <K, V> Map<K, V> preservesInsertionOrderOnPutsMap() {
        return Maps.newLinkedHashMap();
    }

    static <E> Set<E> preservesInsertionOrderOnAddsSet() {
        return Sets.newLinkedHashSet();
    }

    static <T> T[] newArray(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    static <T> T[] copy(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    static MapMaker tryWeakKeys(MapMaker mapMaker) {
        return mapMaker.weakKeys();
    }

    static void checkGwtRpcEnabled() {
        if (Boolean.parseBoolean(System.getProperty("guava.gwt.emergency_reenable_rpc", "false"))) {
            logger.log(Level.WARNING, "Later in 2020, we will remove GWT-RPC support for Guava types. You are seeing this warning because you are sending a Guava type over GWT-RPC, which will break. You can identify which type by looking at the class name in the attached stack trace.", new Throwable());
        } else {
            throw new UnsupportedOperationException(Strings.lenientFormat("We are removing GWT-RPC support for Guava types. You can temporarily reenable support by setting the system property %s to true. For more about system properties, see %s. For more about Guava's GWT-RPC support, see %s.", "guava.gwt.emergency_reenable_rpc", "https://stackoverflow.com/q/5189914/28465", "https://groups.google.com/d/msg/guava-announce/zHZTFg7YF3o/rQNnwdHeEwAJ"));
        }
    }

    private Platform() {
    }
}
