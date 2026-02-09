package com.cardinalcommerce.a;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class setOnApplyWindowInsetsListener {
    private static Map<setWindowInsetsAnimationCallback, Set<setNextFocusRightId>> configure;

    setOnApplyWindowInsetsListener() {
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(setWindowInsetsAnimationCallback.Cardinal, new HashSet(Arrays.asList(new setNextFocusRightId[]{setNextFocusRightId.SIGN, setNextFocusRightId.VERIFY})));
        hashMap.put(setWindowInsetsAnimationCallback.init, new HashSet(Arrays.asList(new setNextFocusRightId[]{setNextFocusRightId.ENCRYPT, setNextFocusRightId.DECRYPT, setNextFocusRightId.WRAP_KEY, setNextFocusRightId.UNWRAP_KEY})));
        configure = Collections.unmodifiableMap(hashMap);
    }

    public static boolean Cardinal(setWindowInsetsAnimationCallback setwindowinsetsanimationcallback, Set<setNextFocusRightId> set) {
        if (setwindowinsetsanimationcallback == null || set == null) {
            return true;
        }
        return configure.get(setwindowinsetsanimationcallback).containsAll(set);
    }
}
