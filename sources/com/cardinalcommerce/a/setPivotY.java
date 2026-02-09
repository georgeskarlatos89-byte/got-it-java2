package com.cardinalcommerce.a;

import android.content.Context;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public final class setPivotY implements Serializable {
    private static int Cardinal = 0;
    private static int configure = 1;
    private final setForceDarkAllowed cca_continue;

    setPivotY(Context context) {
        this.cca_continue = new setForceDarkAllowed(context);
    }

    public final setForceDarkAllowed cca_continue() {
        int i = configure;
        int i2 = (i ^ 87) + ((i & 87) << 1);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
        setForceDarkAllowed setforcedarkallowed = this.cca_continue;
        int i4 = (i | 5) << 1;
        int i5 = -(i ^ 5);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        Cardinal = i6 % 128;
        if ((i6 % 2 != 0 ? 'B' : '(') == '(') {
            return setforcedarkallowed;
        }
        int i7 = 42 / 0;
        return setforcedarkallowed;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    public final JSONObject getInstance() {
        JSONObject jSONObject = new JSONObject();
        ? r1 = 0;
        try {
            jSONObject.putOpt("SettingsData", this.cca_continue.getInstance());
            int i = Cardinal;
            int i2 = (i ^ 2) + ((i & 2) << 1);
            int i3 = (i2 ^ -1) + ((i2 & -1) << 1);
            configure = i3 % 128;
            int i4 = i3 % 2;
        } catch (JSONException e) {
            setTranslationY.cca_continue().configure("13101", e.getLocalizedMessage(), (String) r1);
        }
        int i5 = (Cardinal + 47) - 1;
        int i6 = (i5 & -1) + (i5 | -1);
        configure = i6 % 128;
        if (!(i6 % 2 == 0)) {
            return jSONObject;
        }
        super.hashCode();
        throw r1;
    }
}
