package com.cardinalcommerce.a;

import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class setVerticalScrollBarEnabled {
    private static int CardinalError = 1;
    private static int values;
    private String Cardinal;
    private String cca_continue;
    private String cleanup;
    private String configure;
    private String getInstance;
    private String getSDKVersion;
    private String getWarnings;
    private String init;
    private String onCReqSuccess;
    private String onValidated;

    public setVerticalScrollBarEnabled() {
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    public static String cca_continue(Class<?> cls) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int i = values;
        int i2 = i & 97;
        int i3 = (i ^ 97) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        CardinalError = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 1;
        while (true) {
            boolean z = false;
            if (!(i6 >= stackTrace.length)) {
                int i7 = values;
                int i8 = (i7 & 121) + (i7 | 121);
                CardinalError = i8 % 128;
                int i9 = i8 % 2;
                StackTraceElement stackTraceElement = stackTrace[i6];
                if (!stackTraceElement.getClassName().equals(cls.getName())) {
                    int i10 = ((values + 44) - 0) - 1;
                    CardinalError = i10 % 128;
                    int i11 = i10 % 2;
                    if (!(stackTraceElement.getClassName().indexOf("java.lang.Thread") != 0 ? true : true)) {
                        int i12 = values;
                        int i13 = (((i12 & 28) + (i12 | 28)) - 0) - 1;
                        CardinalError = i13 % 128;
                        int i14 = i13 % 2;
                        String className = stackTraceElement.getClassName();
                        int i15 = CardinalError;
                        int i16 = (((i15 | 16) << 1) - (i15 ^ 16)) - 1;
                        values = i16 % 128;
                        int i17 = i16 % 2;
                        return className;
                    }
                }
                i6 = ((((i6 | 2) << 1) - (i6 ^ 2)) - 0) - 1;
                int i18 = CardinalError;
                int i19 = i18 & 57;
                int i20 = (i18 | 57) & (~i19);
                int i21 = -(-(i19 << 1));
                int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                values = i22 % 128;
                int i23 = i22 % 2;
            } else {
                int i24 = values;
                int i25 = i24 & 21;
                int i26 = ((i24 | 21) & (~i25)) + (i25 << 1);
                CardinalError = i26 % 128;
                if (i26 % 2 == 0) {
                    z = true;
                }
                ? r8 = 0;
                if (!z) {
                    return r8;
                }
                super.hashCode();
                throw r8;
            }
        }
    }

    public setVerticalScrollBarEnabled(String str) {
        this.configure = "C";
        this.init = ThreeDSStrings.MESSAGE_TYPE_CRES;
        this.getWarnings = "Erro";
        this.onValidated = "";
        this.getSDKVersion = "";
        this.onCReqSuccess = "";
        this.cleanup = str;
    }

    public setVerticalScrollBarEnabled(char[] cArr) {
        this.configure = "C";
        this.init = ThreeDSStrings.MESSAGE_TYPE_CRES;
        this.getWarnings = "Erro";
        this.onValidated = "";
        this.getSDKVersion = "";
        this.onCReqSuccess = "";
        this.cleanup = new String(cArr);
    }

    public final void cca_continue(setTransitionVisibility settransitionvisibility) {
        int i = values;
        int i2 = i & 111;
        int i3 = ((i | 111) & (~i2)) + (i2 << 1);
        CardinalError = i3 % 128;
        int i4 = i3 % 2;
        this.onCReqSuccess = settransitionvisibility.Cardinal();
        this.getSDKVersion = settransitionvisibility.init();
        this.onValidated = settransitionvisibility.setChallengeTimeout();
        int i5 = values;
        int i6 = (((i5 | 47) << 1) - (~(-(((~i5) & 47) | (i5 & -48))))) - 1;
        CardinalError = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void init(setAccessibilityLiveRegion setaccessibilityliveregion) {
        int i = values;
        int i2 = (i & 37) + (i | 37);
        CardinalError = i2 % 128;
        if ((i2 % 2 == 0 ? '!' : '\\') == '\\') {
            this.onCReqSuccess = Arrays.toString(setaccessibilityliveregion.init());
            this.getSDKVersion = Arrays.toString(setaccessibilityliveregion.configure());
            this.onValidated = Arrays.toString(setaccessibilityliveregion.onValidated());
            return;
        }
        this.onCReqSuccess = Arrays.toString(setaccessibilityliveregion.init());
        this.getSDKVersion = Arrays.toString(setaccessibilityliveregion.configure());
        this.onValidated = Arrays.toString(setaccessibilityliveregion.onValidated());
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final void Cardinal(String str) {
        int i = values;
        int i2 = i | 125;
        int i3 = (i2 << 1) - (i2 & (~(i & 125)));
        CardinalError = i3 % 128;
        char c = i3 % 2 == 0 ? 26 : '*';
        this.getInstance = str;
        if (c == '*') {
            int i4 = (i ^ 118) + ((i & 118) << 1);
            int i5 = (i4 ^ -1) + ((i4 & -1) << 1);
            CardinalError = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final void cca_continue(String str) {
        int i = CardinalError;
        int i2 = (((i & -120) | ((~i) & 119)) - (~((i & 119) << 1))) - 1;
        values = i2 % 128;
        int i3 = i2 % 2;
        this.Cardinal = str;
        int i4 = (i + 42) - 1;
        values = i4 % 128;
        if ((i4 % 2 != 0 ? 31 : '?') == 31) {
            int i5 = 82 / 0;
        }
    }

    public final void getInstance(String str) {
        int i = values;
        int i2 = i & 15;
        int i3 = -(-(i | 15));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        CardinalError = i4 % 128;
        boolean z = i4 % 2 == 0;
        Throwable th = null;
        this.cca_continue = str;
        if (!z) {
            int i5 = (i + 80) - 1;
            CardinalError = i5 % 128;
            if ((i5 % 2 == 0 ? 'H' : '`') != '`') {
                throw th;
            }
            return;
        }
        super.hashCode();
        throw th;
    }

    public final void init(String str) {
        int i = CardinalError;
        int i2 = i & 117;
        int i3 = (i2 - (~((i ^ 117) | i2))) - 1;
        values = i3 % 128;
        boolean z = i3 % 2 == 0;
        this.onValidated = str;
        if (z) {
            int i4 = (i + 65) - 1;
            int i5 = (i4 ^ -1) + ((i4 & -1) << 1);
            values = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        throw null;
    }

    public final String cca_continue() {
        int i = CardinalError;
        int i2 = i & 109;
        int i3 = (i | 109) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        int i6 = i5 % 128;
        values = i6;
        int i7 = i5 % 2;
        String str = this.getSDKVersion;
        int i8 = i6 & 125;
        int i9 = -(-(i6 | 125));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        CardinalError = i10 % 128;
        int i11 = i10 % 2;
        return str;
    }

    public final void configure(String str) {
        int i = CardinalError;
        int i2 = (i & -68) | ((~i) & 67);
        boolean z = true;
        int i3 = -(-((i & 67) << 1));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        values = i4 % 128;
        int i5 = i4 % 2;
        this.getSDKVersion = str;
        int i6 = i & 55;
        int i7 = ((i ^ 55) | i6) << 1;
        int i8 = -((i | 55) & (~i6));
        int i9 = (i7 & i8) + (i7 | i8);
        values = i9 % 128;
        if (i9 % 2 != 0) {
            z = false;
        }
        if (!z) {
            int i10 = 36 / 0;
        }
    }

    public final void cleanup(String str) {
        int i = values;
        int i2 = i + 11;
        CardinalError = i2 % 128;
        int i3 = i2 % 2;
        this.onCReqSuccess = str;
        int i4 = ((i ^ 29) | (i & 29)) << 1;
        int i5 = -(((~i) & 29) | (i & -30));
        int i6 = (i4 & i5) + (i4 | i5);
        CardinalError = i6 % 128;
        if ((i6 % 2 == 0 ? 'L' : 'a') == 'L') {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public final String Cardinal() {
        String str;
        int i = CardinalError;
        int i2 = i & 33;
        int i3 = i2 + ((i ^ 33) | i2);
        values = i3 % 128;
        if ((i3 % 2 != 0 ? '^' : '&') != '&') {
            str = this.getInstance;
            int i4 = 2 / 0;
        } else {
            str = this.getInstance;
        }
        int i5 = i + 19;
        values = i5 % 128;
        if ((i5 % 2 != 0 ? 13 : 'X') != 13) {
            return str;
        }
        throw null;
    }

    public final String getInstance() {
        int i = CardinalError;
        int i2 = (i & 47) + (i | 47);
        values = i2 % 128;
        int i3 = i2 % 2;
        String str = this.Cardinal;
        int i4 = (i & 87) + (i | 87);
        values = i4 % 128;
        if (!(i4 % 2 != 0)) {
            return str;
        }
        throw null;
    }

    public final String configure() {
        int i = values;
        int i2 = (((i & -112) | ((~i) & 111)) - (~(-(-((i & 111) << 1))))) - 1;
        CardinalError = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cca_continue;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final JSONObject init() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("errorCode", this.getInstance);
        jSONObject.putOpt("errorComponent", this.configure);
        jSONObject.putOpt("errorDescription", this.Cardinal);
        jSONObject.putOpt("errorDetail", this.cca_continue);
        jSONObject.putOpt("errorMessageType", this.init);
        jSONObject.putOpt("messageType", this.getWarnings);
        jSONObject.putOpt("messageVersion", this.cleanup);
        jSONObject.putOpt("sdkTransID", this.onValidated);
        jSONObject.putOpt("threeDSServerTransID", this.getSDKVersion);
        jSONObject.putOpt("acsTransID", this.onCReqSuccess);
        int i = values;
        int i2 = (i ^ 24) + ((i & 24) << 1);
        int i3 = ((i2 | -1) << 1) - (i2 ^ -1);
        CardinalError = i3 % 128;
        if (i3 % 2 != 0) {
            return jSONObject;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }
}
