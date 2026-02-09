package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONAware;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import java.io.Serializable;
import kotlin.text.Typography;

public final class setScrollIndicators implements JSONAware, Serializable {
    private final String Cardinal;

    static {
        new setScrollIndicators("JOSE");
        new setScrollIndicators("JOSE+JSON");
        new setScrollIndicators("JWT");
    }

    public setScrollIndicators(String str) {
        if (str != null) {
            this.Cardinal = str;
            return;
        }
        throw new IllegalArgumentException("The object type must not be null");
    }

    public final int hashCode() {
        return this.Cardinal.toLowerCase().hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof setScrollIndicators) && this.Cardinal.toLowerCase().equals(((setScrollIndicators) obj).Cardinal.toLowerCase());
    }

    public final String toString() {
        return this.Cardinal;
    }

    public final String toJSONString() {
        return new StringBuilder("\"").append(JSONObject.escape(this.Cardinal)).append(Typography.quote).toString();
    }
}
