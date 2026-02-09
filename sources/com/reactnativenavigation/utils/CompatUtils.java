package com.reactnativenavigation.utils;

import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

public class CompatUtils {
    private static final AtomicInteger viewId = new AtomicInteger(1);

    public static int generateViewId() {
        return View.generateViewId();
    }
}
