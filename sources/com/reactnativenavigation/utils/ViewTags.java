package com.reactnativenavigation.utils;

import android.view.View;

public class ViewTags {
    public static <T> T get(View view, int i) {
        return get(view, i, (Object) null);
    }

    public static <T> T get(View view, int i, T t) {
        return view.getTag(i) == null ? t : view.getTag(i);
    }
}
