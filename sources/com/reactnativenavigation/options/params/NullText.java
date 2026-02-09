package com.reactnativenavigation.options.params;

public class NullText extends Text {
    public boolean hasValue() {
        return false;
    }

    public NullText() {
        super("");
    }
}
