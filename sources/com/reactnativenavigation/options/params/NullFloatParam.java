package com.reactnativenavigation.options.params;

public class NullFloatParam extends FloatParam {
    public boolean hasValue() {
        return false;
    }

    public NullFloatParam() {
        super(Float.valueOf(0.0f));
    }
}
