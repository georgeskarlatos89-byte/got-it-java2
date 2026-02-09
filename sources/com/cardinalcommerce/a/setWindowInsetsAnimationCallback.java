package com.cardinalcommerce.a;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Objects;

public final class setWindowInsetsAnimationCallback implements Serializable {
    public static final setWindowInsetsAnimationCallback Cardinal = new setWindowInsetsAnimationCallback("sig");
    public static final setWindowInsetsAnimationCallback init = new setWindowInsetsAnimationCallback("enc");
    public final String getInstance;

    private setWindowInsetsAnimationCallback(String str) {
        if (str != null) {
            this.getInstance = str;
            return;
        }
        throw new IllegalArgumentException("The key use identifier must not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setWindowInsetsAnimationCallback)) {
            return false;
        }
        return Objects.equals(this.getInstance, ((setWindowInsetsAnimationCallback) obj).getInstance);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.getInstance});
    }

    public static setWindowInsetsAnimationCallback getInstance(String str) throws ParseException {
        if (str == null) {
            return null;
        }
        setWindowInsetsAnimationCallback setwindowinsetsanimationcallback = Cardinal;
        if (str.equals(setwindowinsetsanimationcallback.getInstance)) {
            return setwindowinsetsanimationcallback;
        }
        setWindowInsetsAnimationCallback setwindowinsetsanimationcallback2 = init;
        if (str.equals(setwindowinsetsanimationcallback2.getInstance)) {
            return setwindowinsetsanimationcallback2;
        }
        if (!str.trim().isEmpty()) {
            return new setWindowInsetsAnimationCallback(str);
        }
        throw new ParseException("JWK use value must not be empty or blank", 0);
    }

    public final String toString() {
        return this.getInstance;
    }
}
