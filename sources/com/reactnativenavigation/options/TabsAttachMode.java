package com.reactnativenavigation.options;

public enum TabsAttachMode {
    TOGETHER,
    AFTER_INITIAL_TAB,
    ON_SWITCH_TO_TAB,
    UNDEFINED;

    public static TabsAttachMode fromString(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1696815897:
                if (str.equals("onSwitchToTab")) {
                    c = 0;
                    break;
                }
                break;
            case -1218133446:
                if (str.equals("together")) {
                    c = 1;
                    break;
                }
                break;
            case 529250477:
                if (str.equals("afterInitialTab")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return ON_SWITCH_TO_TAB;
            case 1:
                return TOGETHER;
            case 2:
                return AFTER_INITIAL_TAB;
            default:
                return UNDEFINED;
        }
    }

    public boolean hasValue() {
        return this != UNDEFINED;
    }
}
