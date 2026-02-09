package com.cardinalcommerce.a;

import android.os.Build;
import com.google.common.net.HttpHeaders;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

public class onCReqSuccess {
    private static int getSDKVersion = 0;
    private static int onCReqSuccess = 1;
    private String Cardinal;
    private String cca_continue;
    private Boolean configure;
    private String getInstance;
    private String init;

    public final String configure() {
        int i = onCReqSuccess;
        int i2 = (i & -10) | ((~i) & 9);
        int i3 = (i & 9) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        getSDKVersion = i5;
        if ((i4 % 2 != 0 ? 14 : Typography.less) != 14) {
            String str = this.getInstance;
            int i6 = ((i5 | 51) << 1) - (i5 ^ 51);
            onCReqSuccess = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }
        throw null;
    }

    public final void cca_continue(String str) {
        int i = getSDKVersion;
        int i2 = ((((i ^ 37) | (i & 37)) << 1) - (~(-((i & -38) | ((~i) & 37))))) - 1;
        onCReqSuccess = i2 % 128;
        int i3 = i2 % 2;
        this.getInstance = str;
        int i4 = ((i | 31) << 1) - (i ^ 31);
        onCReqSuccess = i4 % 128;
        if ((i4 % 2 == 0 ? ')' : 21) == ')') {
            int i5 = 99 / 0;
        }
    }

    public final void getInstance(String str) {
        int i = onCReqSuccess;
        int i2 = i & 119;
        int i3 = (i2 - (~(-(-((i ^ 119) | i2))))) - 1;
        int i4 = i3 % 128;
        getSDKVersion = i4;
        boolean z = i3 % 2 != 0;
        this.init = str;
        if (!z) {
            int i5 = (i4 & -70) | ((~i4) & 69);
            int i6 = (i4 & 69) << 1;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            onCReqSuccess = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 68 / 0;
                return;
            }
            return;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final String cca_continue() {
        int i = onCReqSuccess;
        int i2 = (i ^ 112) + ((i & 112) << 1);
        int i3 = (i2 ^ -1) + ((i2 & -1) << 1);
        getSDKVersion = i3 % 128;
        int i4 = i3 % 2;
        String str = this.Cardinal;
        int i5 = i & 121;
        int i6 = (i5 - (~((i ^ 121) | i5))) - 1;
        getSDKVersion = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final void configure(String str) {
        int i = onCReqSuccess;
        int i2 = i & 15;
        int i3 = (i ^ 15) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        getSDKVersion = i4 % 128;
        boolean z = i4 % 2 != 0;
        this.Cardinal = str;
        if (z) {
            throw null;
        }
    }

    public final void init(Boolean bool) {
        int i = onCReqSuccess;
        int i2 = (((i & 108) + (i | 108)) + 0) - 1;
        int i3 = i2 % 128;
        getSDKVersion = i3;
        int i4 = i2 % 2;
        this.configure = bool;
        int i5 = i3 & 105;
        int i6 = -(-((i3 ^ 105) | i5));
        int i7 = (i5 & i6) + (i5 | i6);
        onCReqSuccess = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void init(String str) {
        int i = getSDKVersion;
        int i2 = i & 67;
        int i3 = (i | 67) & (~i2);
        boolean z = true;
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        onCReqSuccess = i6;
        int i7 = i5 % 2;
        this.cca_continue = str;
        int i8 = i6 & 71;
        int i9 = ((i6 ^ 71) | i8) << 1;
        int i10 = -((i6 | 71) & (~i8));
        int i11 = (i9 & i10) + (i9 | i10);
        getSDKVersion = i11 % 128;
        if (i11 % 2 != 0) {
            z = false;
        }
        if (!z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public final JSONObject init() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ReferenceId", this.Cardinal);
        jSONObject.put("OrgUnitId", this.init);
        jSONObject.put(HttpHeaders.ORIGIN, "CardinalMobileSdk_Android");
        jSONObject.put("DeviceChannel", "SDK");
        jSONObject.put("Fingerprint", Build.FINGERPRINT);
        jSONObject.put("UserAgent", Build.BRAND);
        jSONObject.put("ThreatMetrixEnabled", this.configure);
        jSONObject.put("ThreatMetrixEventType", this.cca_continue);
        setSaveFromParentEnabled.getInstance();
        jSONObject.put("NativeData", setSaveFromParentEnabled.Cardinal().cleanup());
        int i = getSDKVersion;
        int i2 = i & 111;
        int i3 = -(-((i ^ 111) | i2));
        int i4 = i2 ^ i3;
        int i5 = i3 & i2;
        boolean z = true;
        int i6 = i4 + (i5 << 1);
        onCReqSuccess = i6 % 128;
        if (i6 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return jSONObject;
        }
        int i7 = 32 / 0;
        return jSONObject;
    }
}
