package com.reactnativenavigation.options;

public enum Alignment {
    Center,
    Fill,
    Default;

    public static Alignment fromString(String str) {
        str.hashCode();
        if (str.equals("center")) {
            return Center;
        }
        if (!str.equals("fill")) {
            return Default;
        }
        return Fill;
    }
}
