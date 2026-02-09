package com.reactnativenavigation.utils;

import javax.annotation.Nullable;

public class Assertions {
    public static void assertNotNull(@Nullable Object obj) {
        if (obj == null) {
            throw new AssertionError();
        }
    }
}
