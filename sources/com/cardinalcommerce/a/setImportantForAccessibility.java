package com.cardinalcommerce.a;

import java.io.Serializable;
import org.json.JSONObject;

public final class setImportantForAccessibility implements Serializable {
    private static int init = 0;
    private static int onCReqSuccess = 1;
    final boolean Cardinal;
    private final String cca_continue;
    final String configure;
    private final String getInstance;

    public setImportantForAccessibility(JSONObject jSONObject) {
        this.getInstance = jSONObject.optString("name");
        this.configure = jSONObject.optString("id");
        this.Cardinal = jSONObject.optBoolean("criticalityIndicator", true);
        this.cca_continue = jSONObject.optString("data");
    }

    public final String getInstance() {
        int i = init;
        int i2 = i & 7;
        int i3 = -(-(i | 7));
        int i4 = (i2 & i3) + (i3 | i2);
        onCReqSuccess = i4 % 128;
        if (!(i4 % 2 == 0)) {
            return this.getInstance;
        }
        int i5 = 59 / 0;
        return this.getInstance;
    }

    public final String configure() {
        int i = init;
        int i2 = (i & 64) + (i | 64);
        int i3 = (i2 & -1) + (i2 | -1);
        onCReqSuccess = i3 % 128;
        int i4 = i3 % 2;
        String str = this.configure;
        int i5 = i + 32;
        int i6 = (i5 ^ -1) + ((i5 & -1) << 1);
        onCReqSuccess = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String init() {
        int i = init;
        int i2 = ((i | 101) << 1) - (i ^ 101);
        int i3 = i2 % 128;
        onCReqSuccess = i3;
        int i4 = i2 % 2;
        String str = this.cca_continue;
        int i5 = (i3 & 98) + (i3 | 98);
        int i6 = (i5 & -1) + (i5 | -1);
        init = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
