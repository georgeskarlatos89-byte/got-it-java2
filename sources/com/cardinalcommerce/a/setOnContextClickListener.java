package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONAware;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import java.io.Serializable;
import kotlin.text.Typography;

public final class setOnContextClickListener implements JSONAware, Serializable {
    public static final setOnContextClickListener init = new setOnContextClickListener("DEF");
    private final String cca_continue;

    public setOnContextClickListener(String str) {
        if (str != null) {
            this.cca_continue = str;
            return;
        }
        throw new IllegalArgumentException("The compression algorithm name must not be null");
    }

    public final int hashCode() {
        return this.cca_continue.hashCode();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof setOnContextClickListener) && toString().equals(obj.toString());
    }

    public final String toString() {
        return this.cca_continue;
    }

    public final String toJSONString() {
        return new StringBuilder("\"").append(JSONObject.escape(this.cca_continue)).append(Typography.quote).toString();
    }
}
