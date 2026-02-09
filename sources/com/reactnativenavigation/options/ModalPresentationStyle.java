package com.reactnativenavigation.options;

public enum ModalPresentationStyle {
    Unspecified("unspecified"),
    None("none"),
    OverCurrentContext("overCurrentContext");
    
    public String name;

    private ModalPresentationStyle(String str) {
        this.name = str;
    }

    public static ModalPresentationStyle fromString(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return None;
        }
        if (!str.equals("overCurrentContext")) {
            return Unspecified;
        }
        return OverCurrentContext;
    }
}
