package com.reactnativenavigation.options.params;

public class NullNumber extends Number {
    public boolean hasValue() {
        return false;
    }

    public NullNumber() {
        super(0);
    }
}
