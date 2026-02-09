package com.reactnativenavigation.options.params;

public class NullDensityPixel extends DensityPixel {
    public boolean hasValue() {
        return false;
    }

    public NullDensityPixel() {
        super(0);
    }
}
