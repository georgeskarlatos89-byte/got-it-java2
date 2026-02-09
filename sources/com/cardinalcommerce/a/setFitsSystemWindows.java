package com.cardinalcommerce.a;

import org.json.JSONObject;

public final class setFitsSystemWindows {
    private static int configure = 0;
    private static int onValidated = 1;
    private String Cardinal;
    private String cca_continue;
    private String getInstance;
    private String init;

    public setFitsSystemWindows() {
    }

    public setFitsSystemWindows(JSONObject jSONObject) {
        this.cca_continue = jSONObject.optString("crv", "");
        this.init = jSONObject.optString("kty", "");
        this.Cardinal = jSONObject.optString("x", "");
        this.getInstance = jSONObject.optString("y", "");
    }

    public final String init() {
        String str;
        int i = onValidated;
        int i2 = i ^ 43;
        int i3 = -(-((i & 43) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        configure = i5;
        if (!(i4 % 2 == 0)) {
            str = this.Cardinal;
            int i6 = 62 / 0;
        } else {
            str = this.Cardinal;
        }
        int i7 = (((i5 & 100) + (i5 | 100)) - 0) - 1;
        onValidated = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public final String cca_continue() {
        int i = onValidated;
        int i2 = ((i ^ 47) | (i & 47)) << 1;
        int i3 = -(((~i) & 47) | (i & -48));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        configure = i4 % 128;
        if ((i4 % 2 != 0 ? '[' : 23) != '[') {
            return this.getInstance;
        }
        int i5 = 67 / 0;
        return this.getInstance;
    }
}
