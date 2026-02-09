package com.cardinalcommerce.a;

import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class setStateListAnimator {
    private static int cleanup = 0;
    private static int onValidated = 1;
    private String Cardinal;
    private String cca_continue;
    private String configure;
    private String getInstance;
    private String init;
    private boolean onCReqSuccess;

    public static setStateListAnimator getInstance(String str, String str2, String str3) {
        setStateListAnimator setstatelistanimator = new setStateListAnimator();
        setstatelistanimator.cca_continue = str;
        setstatelistanimator.init = str2;
        setstatelistanimator.Cardinal = str3;
        setstatelistanimator.getInstance = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        int i = cleanup;
        boolean z = true;
        int i2 = (((i | 110) << 1) - (i ^ 110)) - 1;
        onValidated = i2 % 128;
        if (i2 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return setstatelistanimator;
        }
        int i3 = 20 / 0;
        return setstatelistanimator;
    }

    public static setStateListAnimator configure(String str, String str2, String str3) {
        setStateListAnimator setstatelistanimator = new setStateListAnimator();
        setstatelistanimator.configure = str;
        setstatelistanimator.init = str2;
        setstatelistanimator.Cardinal = str3;
        setstatelistanimator.getInstance = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        setstatelistanimator.onCReqSuccess = true;
        int i = (cleanup + 42) - 1;
        onValidated = i % 128;
        if (!(i % 2 == 0)) {
            return setstatelistanimator;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final String Cardinal() {
        int i = onValidated;
        int i2 = ((i | 19) << 1) - (i ^ 19);
        int i3 = i2 % 128;
        cleanup = i3;
        if ((i2 % 2 != 0 ? 'O' : 3) == 3) {
            String str = this.Cardinal;
            int i4 = (i3 + 19) - 1;
            int i5 = (i4 & -1) + (i4 | -1);
            onValidated = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
        throw null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, org.json.JSONObject, java.lang.Object] */
    public final JSONObject configure() {
        JSONObject jSONObject = new JSONObject();
        ? r1 = 0;
        try {
            boolean z = false;
            if (!this.onCReqSuccess) {
                jSONObject.put("event", this.cca_continue);
                int i = onValidated + 36;
                int i2 = (i ^ -1) + ((i & -1) << 1);
                cleanup = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = onValidated;
                int i5 = ((i4 ^ 9) | (i4 & 9)) << 1;
                int i6 = -(((~i4) & 9) | (i4 & -10));
                int i7 = (i5 & i6) + (i6 | i5);
                cleanup = i7 % 128;
                if (i7 % 2 != 0) {
                    z = true;
                }
                if (!z) {
                    jSONObject.put("error", this.configure);
                    int i8 = onValidated;
                    int i9 = i8 ^ 87;
                    int i10 = ((i8 & 87) | i9) << 1;
                    int i11 = -i9;
                    int i12 = (i10 & i11) + (i10 | i11);
                    cleanup = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    jSONObject.put("error", this.configure);
                    super.hashCode();
                    throw r1;
                }
            }
            jSONObject.put(ThreeDSStrings.DETAIL_KEY, this.init);
            jSONObject.put("timestamp", this.getInstance);
            int i14 = cleanup;
            int i15 = i14 ^ 105;
            int i16 = (((i14 & 105) | i15) << 1) - i15;
            int i17 = i16 % 128;
            onValidated = i17;
            int i18 = i16 % 2;
            int i19 = ((i17 | 103) << 1) - (i17 ^ 103);
            cleanup = i19 % 128;
            int i20 = i19 % 2;
            return jSONObject;
        } catch (JSONException unused) {
            return r1;
        }
    }
}
