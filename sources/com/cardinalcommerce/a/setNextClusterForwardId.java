package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONAware;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import java.io.Serializable;
import kotlin.text.Typography;

public final class setNextClusterForwardId implements JSONAware, Serializable {
    public static final setNextClusterForwardId Cardinal = new setNextClusterForwardId("oct", setRevealOnFocusHint.OPTIONAL);
    public static final setNextClusterForwardId configure = new setNextClusterForwardId("EC", setRevealOnFocusHint.RECOMMENDED);
    public static final setNextClusterForwardId getInstance = new setNextClusterForwardId("OKP", setRevealOnFocusHint.OPTIONAL);
    public static final setNextClusterForwardId init = new setNextClusterForwardId("RSA", setRevealOnFocusHint.REQUIRED);
    public final String cca_continue;
    private final setRevealOnFocusHint getSDKVersion;

    private setNextClusterForwardId(String str, setRevealOnFocusHint setrevealonfocushint) {
        if (str != null) {
            this.cca_continue = str;
            this.getSDKVersion = setrevealonfocushint;
            return;
        }
        throw new IllegalArgumentException("The key type value must not be null");
    }

    public final int hashCode() {
        return this.cca_continue.hashCode();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof setNextClusterForwardId) && toString().equals(obj.toString());
    }

    public final String toString() {
        return this.cca_continue;
    }

    public final String toJSONString() {
        return new StringBuilder("\"").append(JSONObject.escape(this.cca_continue)).append(Typography.quote).toString();
    }

    public static setNextClusterForwardId Cardinal(String str) {
        if (str != null) {
            setNextClusterForwardId setnextclusterforwardid = configure;
            if (str.equals(setnextclusterforwardid.cca_continue)) {
                return setnextclusterforwardid;
            }
            setNextClusterForwardId setnextclusterforwardid2 = init;
            if (str.equals(setnextclusterforwardid2.cca_continue)) {
                return setnextclusterforwardid2;
            }
            setNextClusterForwardId setnextclusterforwardid3 = Cardinal;
            if (str.equals(setnextclusterforwardid3.cca_continue)) {
                return setnextclusterforwardid3;
            }
            setNextClusterForwardId setnextclusterforwardid4 = getInstance;
            if (str.equals(setnextclusterforwardid4.cca_continue)) {
                return setnextclusterforwardid4;
            }
            return new setNextClusterForwardId(str, (setRevealOnFocusHint) null);
        }
        throw new IllegalArgumentException("The key type to parse must not be null");
    }
}
