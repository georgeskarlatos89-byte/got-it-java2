package com.reactnativenavigation.options.params;

public class NullColor extends Colour {
    public boolean hasValue() {
        return false;
    }

    public String toString() {
        return "Null Color";
    }

    public NullColor() {
        super(0);
    }
}
