package com.reactnativenavigation.options.params;

import javax.annotation.Nonnull;

public class DontApplyColour extends Colour {
    public boolean canApplyValue() {
        return false;
    }

    public boolean hasValue() {
        return true;
    }

    @Nonnull
    public String toString() {
        return "NoColor";
    }

    public DontApplyColour() {
        super(0);
    }
}
