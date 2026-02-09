package com.cardinalcommerce.a;

import android.content.Context;
import com.cardinalcommerce.emvco.utils.EMVCoError;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

public final class setLayoutDirection extends setKeyboardNavigationCluster {
    private static int Cardinal = 0;
    private static int configure = 1;
    private final setWillNotDraw cca_continue = setWillNotDraw.getInstance();
    private final Context getInstance;

    public setLayoutDirection(Context context) {
        this.getInstance = context.getApplicationContext();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdkrefID", ThreeDSStrings.SDKReferenceNumber);
        } catch (JSONException e) {
            this.cca_continue.cca_continue("EMVCoInitialize", new StringBuilder("Unable to get DSConfiguration ").append(e.getLocalizedMessage()).toString());
        }
        super.Cardinal("", jSONObject.toString(), 10000);
    }

    public final void getInstance(String str) {
        int i = (Cardinal + 122) - 1;
        configure = i % 128;
        int i2 = i % 2;
        boolean z = false;
        Throwable th = null;
        if (Cardinal(str)) {
            int i3 = configure;
            int i4 = (i3 ^ 5) + ((i3 & 5) << 1);
            Cardinal = i4 % 128;
            if (i4 % 2 == 0) {
                z = true;
            }
            if (z) {
                setLayoutParams.getInstance(this.getInstance).Cardinal("dsConfigurationString", str);
                return;
            }
            setLayoutParams.getInstance(this.getInstance).Cardinal("dsConfigurationString", str);
            super.hashCode();
            throw th;
        }
        this.cca_continue.cca_continue("EMVCoInitialize", "Invalid dynamic configurations received");
        int i5 = Cardinal;
        int i6 = ((i5 | 105) << 1) - (((~i5) & 105) | (i5 & -106));
        configure = i6 % 128;
        if (i6 % 2 == 0) {
            z = true;
        }
        if (z) {
            super.hashCode();
            throw th;
        }
    }

    public final void configure(String str, int i) {
        super.configure(str, i);
        this.cca_continue.getInstance(new EMVCoError(i, "Unable to get DSConfiguration ".concat(String.valueOf(str))));
        int i2 = Cardinal;
        boolean z = true;
        int i3 = ((i2 | 113) << 1) - (i2 ^ 113);
        configure = i3 % 128;
        if (i3 % 2 == 0) {
            z = false;
        }
        if (!z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public final void cca_continue(Exception exc, setContextClickable setcontextclickable) {
        super.cca_continue(exc, setcontextclickable);
        this.cca_continue.cca_continue("EMVCoInitialize", new StringBuilder("Unable to get DSConfiguration ").append(exc.getLocalizedMessage()).toString());
        int i = configure;
        int i2 = (i ^ 107) + ((i & 107) << 1);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
    }

    private static boolean Cardinal(String str) {
        int i = configure;
        int i2 = (i & -102) | ((~i) & 101);
        int i3 = (i & 101) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        Cardinal = i4 % 128;
        char c = i4 % 2 != 0 ? Typography.dollar : 'I';
        boolean contains = str.contains("dsConfigurations");
        if (c != 'I') {
            int i5 = 92 / 0;
        }
        int i6 = Cardinal;
        int i7 = i6 & 105;
        int i8 = -(-(i6 | 105));
        int i9 = (i7 & i8) + (i8 | i7);
        configure = i9 % 128;
        if ((i9 % 2 == 0 ? ',' : '8') == '8') {
            return contains;
        }
        throw null;
    }
}
