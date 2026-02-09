package com.reactnativenavigation.options;

import android.text.TextUtils;
import com.facebook.hermes.intl.Constants;
import java.util.Locale;

public enum LayoutDirection {
    RTL(1),
    LTR(0),
    LOCALE(3),
    DEFAULT(0);
    
    private final int direction;

    private LayoutDirection(int i) {
        this.direction = i;
    }

    public static LayoutDirection fromString(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1097462182:
                if (str.equals(Constants.LOCALE)) {
                    c = 0;
                    break;
                }
                break;
            case 107498:
                if (str.equals("ltr")) {
                    c = 1;
                    break;
                }
                break;
            case 113258:
                if (str.equals("rtl")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return LOCALE;
            case 1:
                return LTR;
            case 2:
                return RTL;
            default:
                return DEFAULT;
        }
    }

    public boolean hasValue() {
        return this != DEFAULT;
    }

    public int get() {
        return this.direction;
    }

    public int inverse() {
        return (isRtl() ? LTR : RTL).direction;
    }

    public boolean isRtl() {
        int i = this.direction;
        if (i == 1) {
            return true;
        }
        if (i != 3) {
            return false;
        }
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }
}
