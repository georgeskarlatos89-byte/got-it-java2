package com.reactnativenavigation.utils;

import android.util.Log;
import com.reactnativenavigation.utils.Functions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Time {
    private static AtomicInteger count = new AtomicInteger();
    private static Now now = new Now();
    private static Map<String, Long> tagsToStartTime = new HashMap();

    public static <T> T log(String str, Functions.Unit<T> unit) {
        int incrementAndGet = count.incrementAndGet();
        log(str + incrementAndGet);
        T t = unit.get();
        log(str + incrementAndGet);
        return t;
    }

    public static void log(String str, Functions.Func func) {
        int incrementAndGet = count.incrementAndGet();
        log(str + incrementAndGet);
        func.run();
        log(str + incrementAndGet);
    }

    public static void log(String str) {
        if (tagsToStartTime.containsKey(str)) {
            Log.i(str, "Elapsed: " + (now() - time(str)) + "ms");
        } else {
            Log.v(str, "logging start");
        }
        tagsToStartTime.put(str, Long.valueOf(now()));
    }

    private static long now() {
        return now.now();
    }

    private static long time(String str) {
        return tagsToStartTime.get(str).longValue();
    }
}
