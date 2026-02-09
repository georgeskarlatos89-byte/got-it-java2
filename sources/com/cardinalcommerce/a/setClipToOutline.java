package com.cardinalcommerce.a;

import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class setClipToOutline {
    private static int cleanup = 1;
    private static int onValidated;
    private String Cardinal;
    private String cca_continue;
    private String configure;
    private String getInstance;
    private String init;
    private JSONArray onCReqSuccess;

    setClipToOutline(String str, String str2, String str3) {
        this.cca_continue = "CardinalMobileSdk_Android";
        this.getInstance = "2.2.7-5";
        this.configure = str;
        this.Cardinal = str2;
        this.onCReqSuccess = new JSONArray();
        this.init = str3;
    }

    public setClipToOutline(JSONObject jSONObject) throws JSONException {
        this.cca_continue = jSONObject.getString(ThreeDSStrings.APPLICATION_KEY);
        this.getInstance = jSONObject.getString("version");
        this.configure = jSONObject.getString("identifier");
        this.Cardinal = jSONObject.getString(ThreeDSStrings.MUTATOR_KEY);
        if (jSONObject.has("data")) {
            this.onCReqSuccess = jSONObject.getJSONArray("data");
        } else {
            this.onCReqSuccess = new JSONArray();
        }
        if (jSONObject.has(ThreeDSStrings.SESSION_ID_KEY)) {
            this.init = jSONObject.getString(ThreeDSStrings.SESSION_ID_KEY);
        }
    }

    /* access modifiers changed from: protected */
    public final void configure(JSONObject jSONObject) {
        int i = cleanup;
        int i2 = i ^ 1;
        int i3 = (((i & 1) | i2) << 1) - i2;
        onValidated = i3 % 128;
        int i4 = i3 % 2;
        this.onCReqSuccess.put(jSONObject);
        int i5 = onValidated + 42;
        int i6 = (i5 ^ -1) + ((i5 & -1) << 1);
        cleanup = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void Cardinal(String str) {
        int i = cleanup;
        int i2 = i & 123;
        int i3 = -(-((i ^ 123) | i2));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        onValidated = i4 % 128;
        char c = i4 % 2 != 0 ? 17 : '`';
        this.init = str;
        if (c != 17) {
            int i5 = i | 65;
            int i6 = i5 << 1;
            int i7 = -(i5 & (~(i & 65)));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            onValidated = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, org.json.JSONObject, java.lang.Object] */
    public final JSONObject init() {
        JSONObject jSONObject = new JSONObject();
        ? r1 = 0;
        try {
            jSONObject.put(ThreeDSStrings.APPLICATION_KEY, this.cca_continue);
            jSONObject.put("version", this.getInstance);
            jSONObject.put("identifier", this.configure);
            jSONObject.put(ThreeDSStrings.MUTATOR_KEY, this.Cardinal);
            jSONObject.put("data", this.onCReqSuccess);
            String str = this.init;
            boolean z = false;
            if (str != null) {
                int i = onValidated;
                int i2 = i ^ 63;
                int i3 = (((i & 63) | i2) << 1) - i2;
                cleanup = i3 % 128;
                if (i3 % 2 != 0) {
                    z = true;
                }
                if (z) {
                    jSONObject.put(ThreeDSStrings.SESSION_ID_KEY, str);
                } else {
                    jSONObject.put(ThreeDSStrings.SESSION_ID_KEY, str);
                    super.hashCode();
                    throw r1;
                }
            }
            int i4 = onValidated;
            int i5 = (i4 & 108) + (i4 | 108);
            int i6 = (i5 ^ -1) + ((i5 & -1) << 1);
            int i7 = i6 % 128;
            cleanup = i7;
            int i8 = i6 % 2;
            int i9 = i7 & 67;
            int i10 = ((i7 ^ 67) | i9) << 1;
            int i11 = -((i7 | 67) & (~i9));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            onValidated = i12 % 128;
            if ((i12 % 2 != 0 ? 'T' : 'H') == 'H') {
                return jSONObject;
            }
            throw r1;
        } catch (JSONException unused) {
            return r1;
        }
    }
}
