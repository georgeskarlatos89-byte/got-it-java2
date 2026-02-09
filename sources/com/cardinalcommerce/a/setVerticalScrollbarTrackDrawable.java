package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONAware;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import java.io.Serializable;
import kotlin.text.Typography;

public class setVerticalScrollbarTrackDrawable implements JSONAware, Serializable {
    public static final setVerticalScrollbarTrackDrawable cca_continue = new setVerticalScrollbarTrackDrawable("none", setRevealOnFocusHint.REQUIRED);
    private final setRevealOnFocusHint Cardinal;
    public final String configure;

    public setVerticalScrollbarTrackDrawable(String str, setRevealOnFocusHint setrevealonfocushint) {
        if (str != null) {
            this.configure = str;
            this.Cardinal = setrevealonfocushint;
            return;
        }
        throw new IllegalArgumentException("The algorithm name must not be null");
    }

    private setVerticalScrollbarTrackDrawable(String str) {
        this(str, (setRevealOnFocusHint) null);
    }

    public final int hashCode() {
        return this.configure.hashCode();
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof setVerticalScrollbarTrackDrawable) && toString().equals(obj.toString());
    }

    public final String toString() {
        return this.configure;
    }

    public final String toJSONString() {
        return new StringBuilder("\"").append(JSONObject.escape(this.configure)).append(Typography.quote).toString();
    }

    public static setVerticalScrollbarTrackDrawable configure(String str) {
        if (str == null) {
            return null;
        }
        return new setVerticalScrollbarTrackDrawable(str);
    }
}
