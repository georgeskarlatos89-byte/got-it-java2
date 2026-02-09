package com.reactnativenavigation.options.params;

import android.graphics.Color;

public class Colour extends Param<Integer> {
    public Colour(int i) {
        super(Integer.valueOf(i));
    }

    public String toString() {
        return String.format("#%06X", new Object[]{Integer.valueOf(((Integer) get()).intValue() & 16777215)});
    }

    public boolean hasTransparency() {
        return hasValue() && Color.alpha(((Integer) this.value).intValue()) < 1;
    }
}
