package com.reactnativenavigation.options.params;

public class Text extends Param<String> {
    public Text(String str) {
        super(str);
    }

    public int length() {
        if (hasValue()) {
            return ((String) this.value).length();
        }
        return 0;
    }

    public String toString() {
        return hasValue() ? (String) this.value : "No Value";
    }
}
