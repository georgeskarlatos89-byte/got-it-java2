package com.reactnativenavigation.options.params;

public class Bool extends Param<Boolean> {
    public Bool(Boolean bool) {
        super(bool);
    }

    public boolean isFalseOrUndefined() {
        return !hasValue() || !((Boolean) get()).booleanValue();
    }

    public boolean isTrueOrUndefined() {
        return !hasValue() || ((Boolean) get()).booleanValue();
    }

    public boolean isTrue() {
        return hasValue() && ((Boolean) get()).booleanValue();
    }

    public boolean isFalse() {
        return hasValue() && !((Boolean) get()).booleanValue();
    }
}
