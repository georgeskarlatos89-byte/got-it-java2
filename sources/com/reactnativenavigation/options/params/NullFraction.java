package com.reactnativenavigation.options.params;

public class NullFraction extends Fraction {
    public boolean hasValue() {
        return false;
    }

    public NullFraction() {
        super(0.0d);
    }
}
