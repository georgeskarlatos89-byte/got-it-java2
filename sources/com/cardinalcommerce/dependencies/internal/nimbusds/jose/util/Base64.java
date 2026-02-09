package com.cardinalcommerce.dependencies.internal.nimbusds.jose.util;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONAware;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONValue;
import java.io.Serializable;

public class Base64 implements JSONAware, Serializable {
    public final String cca_continue;

    public Base64(String str) {
        if (str != null) {
            this.cca_continue = str;
            return;
        }
        throw new IllegalArgumentException("The Base64 value must not be null");
    }

    public String toJSONString() {
        return new StringBuilder("\"").append(JSONValue.escape(this.cca_continue)).append("\"").toString();
    }

    public String toString() {
        return this.cca_continue;
    }

    public int hashCode() {
        return this.cca_continue.hashCode();
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof Base64) && toString().equals(obj.toString());
    }
}
