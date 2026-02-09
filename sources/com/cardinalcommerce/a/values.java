package com.cardinalcommerce.a;

import com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError;
import com.cardinalcommerce.cardinalmobilesdk.models.Payload;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.facebook.AuthenticationTokenClaims;
import org.json.JSONException;
import org.json.JSONObject;

final class values {
    private static int getSDKVersion = 0;
    private static int getWarnings = 1;
    private boolean Cardinal;
    public ValidateResponse cca_continue;
    public setTransitionVisibility configure;
    public String getInstance;
    private int init;
    private String onCReqSuccess;
    private String onValidated;

    values() {
    }

    static onValidated cca_continue(String str) throws JSONException {
        onValidated onvalidated = new onValidated();
        JSONObject jSONObject = new JSONObject(str);
        char c = 0;
        onvalidated.configure(jSONObject.optInt("ErrorNumber", 0));
        onvalidated.Cardinal(jSONObject.optString("Message", ""));
        Throwable th = null;
        if (onvalidated.configure == 0) {
            int i = getSDKVersion;
            int i2 = (i & 52) + (i | 52);
            int i3 = (i2 & -1) + (i2 | -1);
            getWarnings = i3 % 128;
            if (!(i3 % 2 == 0)) {
                String optString = jSONObject.optString("CardinalJWT", "");
                if (optString != null) {
                    int i4 = getSDKVersion + 17;
                    getWarnings = i4 % 128;
                    if (!(i4 % 2 == 0)) {
                        String Cardinal2 = getActionCode.Cardinal(optString);
                        if (Cardinal2 != null) {
                            onValidated cca_continue2 = cca_continue(Cardinal2, onvalidated);
                            int i5 = getSDKVersion;
                            int i6 = (((i5 & -16) | ((~i5) & 15)) - (~((i5 & 15) << 1))) - 1;
                            getWarnings = i6 % 128;
                            if (i6 % 2 == 0) {
                                c = 1;
                            }
                            if (c != 1) {
                                return cca_continue2;
                            }
                            throw th;
                        }
                    } else {
                        getActionCode.Cardinal(optString);
                        throw th;
                    }
                }
            } else {
                jSONObject.optString("CardinalJWT", "");
                super.hashCode();
                throw th;
            }
        }
        int i7 = getWarnings;
        int i8 = i7 & 81;
        int i9 = ((i7 | 81) & (~i8)) + (i8 << 1);
        getSDKVersion = i9 % 128;
        if (i9 % 2 != 0) {
            c = '\'';
        }
        if (c == 0) {
            return onvalidated;
        }
        throw th;
    }

    private static onValidated cca_continue(String str, onValidated onvalidated) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_ISS, "");
        jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_IAT, "");
        jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_EXP, "");
        jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_JIT, "");
        onvalidated.configure(jSONObject.optString("ConsumerSessionId", ""));
        jSONObject.optString("ReferenceId", "");
        jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_AUD, "");
        jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_JIT, "");
        jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_JIT, "");
        onvalidated.Cardinal(Cardinal(jSONObject.optString("Payload", "")));
        int i = getSDKVersion;
        int i2 = (((i & -104) | ((~i) & 103)) - (~((i & 103) << 1))) - 1;
        getWarnings = i2 % 128;
        if ((i2 % 2 == 0 ? 22 : '\\') != 22) {
            return onvalidated;
        }
        throw null;
    }

    private static Payload Cardinal(String str) throws JSONException {
        Payload payload = new Payload();
        if (!str.equals("")) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("DeviceFingerprintingURL", "");
            payload.setDeviceFingerprint(init(optString));
            payload.setDeviceFingerprintUrl(optString);
            payload.setEnabledCCA(jSONObject.optBoolean("EnabledCCA", false));
            payload.setEnabledDiscover(jSONObject.optBoolean("EnabledDiscover", false));
            payload.setEnabledPaypal(jSONObject.optBoolean("EnabledPaypal", false));
            payload.setErrorNumber(jSONObject.optInt("ErrorNumber", 0));
            payload.setErrorDescription(jSONObject.optString("ErrorDescription", ""));
            int i = ((getWarnings + 26) - 0) - 1;
            getSDKVersion = i % 128;
            int i2 = i % 2;
        } else {
            payload.setErrorNumber(CardinalError.INIT_RESPONSE_ERROR_CODE);
            payload.setErrorDescription("Cardinal Init Response Error. Missing field :Payload");
            int i3 = getSDKVersion + 36;
            int i4 = ((i3 | -1) << 1) - (i3 ^ -1);
            getWarnings = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = getWarnings;
        int i7 = i6 & 95;
        int i8 = ((i6 ^ 95) | i7) << 1;
        int i9 = -((i6 | 95) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        getSDKVersion = i10 % 128;
        int i11 = i10 % 2;
        return payload;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014a, code lost:
        if ((r5.isEmpty()) != false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015c, code lost:
        if ((!r5.isEmpty() ? kotlin.text.Typography.greater : 27) != 27) goto L_0x015e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.cardinalcommerce.a.onCReqSuccess init(java.lang.String r11) {
        /*
            com.cardinalcommerce.a.onCReqSuccess r0 = new com.cardinalcommerce.a.onCReqSuccess
            r0.<init>()
            java.lang.String r1 = ""
            boolean r1 = r11.equals(r1)
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x019b
            android.net.Uri r11 = android.net.Uri.parse(r11)
            java.lang.String r1 = r11.getScheme()
            java.lang.String r5 = r11.getAuthority()
            java.lang.String r6 = r11.getPath()
            java.lang.Object r6 = java.util.Objects.requireNonNull(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "/"
            java.lang.String[] r6 = r6.split(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r1 = r8.append(r1)
            java.lang.String r8 = "://"
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.StringBuilder r1 = r1.append(r7)
            r5 = r6[r4]
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "orgUnitId"
            java.lang.String r5 = r11.getQueryParameter(r5)
            if (r5 == 0) goto L_0x0057
            r6 = r4
            goto L_0x0058
        L_0x0057:
            r6 = r3
        L_0x0058:
            if (r6 == r4) goto L_0x005b
            goto L_0x0086
        L_0x005b:
            int r6 = getSDKVersion
            r7 = r6 & 103(0x67, float:1.44E-43)
            r6 = r6 ^ 103(0x67, float:1.44E-43)
            r6 = r6 | r7
            int r7 = r7 + r6
            int r6 = r7 % 128
            getWarnings = r6
            int r7 = r7 % 2
            if (r7 != 0) goto L_0x006d
            r6 = r3
            goto L_0x006e
        L_0x006d:
            r6 = r4
        L_0x006e:
            r0.getInstance(r5)
            if (r6 == 0) goto L_0x0195
            int r5 = getWarnings
            r6 = r5 & 1
            int r7 = ~r6
            r5 = r5 | r4
            r5 = r5 & r7
            int r6 = r6 << r4
            r7 = r5 ^ r6
            r5 = r5 & r6
            int r5 = r5 << r4
            int r7 = r7 + r5
            int r5 = r7 % 128
            getSDKVersion = r5
            int r7 = r7 % 2
        L_0x0086:
            java.lang.String r5 = "referenceId"
            java.lang.String r5 = r11.getQueryParameter(r5)
            r6 = 79
            r7 = 91
            if (r5 == 0) goto L_0x0094
            r8 = r6
            goto L_0x0095
        L_0x0094:
            r8 = r7
        L_0x0095:
            if (r8 == r6) goto L_0x0098
            goto L_0x00d9
        L_0x0098:
            int r6 = getWarnings
            r8 = r6 | 65
            int r8 = r8 << r4
            r9 = r6 & -66
            int r6 = ~r6
            r10 = 65
            r6 = r6 & r10
            r6 = r6 | r9
            int r6 = -r6
            int r6 = ~r6
            int r8 = r8 - r6
            int r8 = r8 - r4
            int r6 = r8 % 128
            getSDKVersion = r6
            int r8 = r8 % 2
            r6 = 85
            if (r8 == 0) goto L_0x00b5
            r8 = 83
            goto L_0x00b6
        L_0x00b5:
            r8 = r6
        L_0x00b6:
            if (r8 == r6) goto L_0x00c1
            r0.configure(r5)
            r5 = 35
            int r5 = r5 / r3
            goto L_0x00c4
        L_0x00bf:
            r11 = move-exception
            throw r11
        L_0x00c1:
            r0.configure(r5)
        L_0x00c4:
            int r5 = getSDKVersion
            r6 = r5 | 87
            int r8 = r6 << 1
            r5 = r5 & 87
            int r5 = ~r5
            r5 = r5 & r6
            int r5 = -r5
            r6 = r8 & r5
            r5 = r5 | r8
            int r6 = r6 + r5
            int r5 = r6 % 128
            getWarnings = r5
            int r6 = r6 % 2
        L_0x00d9:
            java.lang.String r5 = "threatmetrix"
            java.lang.String r5 = r11.getQueryParameter(r5)
            r6 = 90
            if (r5 == 0) goto L_0x00e6
            r8 = 63
            goto L_0x00e7
        L_0x00e6:
            r8 = r6
        L_0x00e7:
            if (r8 == r6) goto L_0x0178
            int r6 = getSDKVersion
            int r6 = r6 + 51
            int r8 = r6 % 128
            getWarnings = r8
            int r6 = r6 % 2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r5.booleanValue()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            r0.init((java.lang.Boolean) r6)
            if (r5 == 0) goto L_0x0106
            r5 = r4
            goto L_0x0107
        L_0x0106:
            r5 = r3
        L_0x0107:
            if (r5 == 0) goto L_0x0178
            int r5 = getSDKVersion
            r6 = r5 & -2
            int r8 = ~r5
            r8 = r8 & r4
            r6 = r6 | r8
            r5 = r5 & r4
            int r5 = r5 << r4
            int r5 = -r5
            int r5 = -r5
            r8 = r6 | r5
            int r8 = r8 << r4
            r5 = r5 ^ r6
            int r8 = r8 - r5
            int r5 = r8 % 128
            getWarnings = r5
            int r8 = r8 % 2
            java.lang.String r5 = "tmEventType"
            java.lang.String r5 = r11.getQueryParameter(r5)
            if (r5 == 0) goto L_0x0129
            r6 = r3
            goto L_0x012a
        L_0x0129:
            r6 = r4
        L_0x012a:
            if (r6 == r4) goto L_0x0178
            int r6 = getWarnings
            r8 = r6 ^ 99
            r6 = r6 & 99
            int r6 = r6 << r4
            int r8 = r8 + r6
            int r6 = r8 % 128
            getSDKVersion = r6
            int r8 = r8 % 2
            r6 = 24
            if (r8 == 0) goto L_0x013f
            r7 = r6
        L_0x013f:
            if (r7 == r6) goto L_0x014d
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0149
            r6 = r3
            goto L_0x014a
        L_0x0149:
            r6 = r4
        L_0x014a:
            if (r6 == 0) goto L_0x015e
            goto L_0x0178
        L_0x014d:
            boolean r6 = r5.isEmpty()
            r7 = 75
            int r7 = r7 / r3
            r7 = 27
            if (r6 != 0) goto L_0x015b
            r6 = 62
            goto L_0x015c
        L_0x015b:
            r6 = r7
        L_0x015c:
            if (r6 == r7) goto L_0x0178
        L_0x015e:
            r0.init((java.lang.String) r5)
            int r5 = getWarnings
            r6 = r5 & 119(0x77, float:1.67E-43)
            r5 = r5 ^ 119(0x77, float:1.67E-43)
            r5 = r5 | r6
            int r5 = -r5
            int r5 = -r5
            r7 = r6 | r5
            int r7 = r7 << r4
            r5 = r5 ^ r6
            int r7 = r7 - r5
            int r5 = r7 % 128
            getSDKVersion = r5
            int r7 = r7 % 2
            goto L_0x0178
        L_0x0176:
            r11 = move-exception
            throw r11
        L_0x0178:
            java.lang.String r5 = "geolocation"
            r11.getQueryParameter(r5)
            r0.cca_continue(r1)
            int r11 = getSDKVersion
            r1 = r11 ^ 95
            r11 = r11 & 95
            r11 = r11 | r1
            int r11 = r11 << r4
            int r1 = -r1
            r5 = r11 | r1
            int r5 = r5 << r4
            r11 = r11 ^ r1
            int r5 = r5 - r11
            int r11 = r5 % 128
            getWarnings = r11
            int r5 = r5 % 2
            goto L_0x019b
        L_0x0195:
            super.hashCode()     // Catch:{ all -> 0x0199 }
            throw r2     // Catch:{ all -> 0x0199 }
        L_0x0199:
            r11 = move-exception
            throw r11
        L_0x019b:
            int r11 = getSDKVersion
            r1 = r11 | 124(0x7c, float:1.74E-43)
            int r1 = r1 << r4
            r11 = r11 ^ 124(0x7c, float:1.74E-43)
            int r1 = r1 - r11
            r11 = r1 ^ -1
            r1 = r1 & -1
            int r1 = r1 << r4
            int r11 = r11 + r1
            int r1 = r11 % 128
            getWarnings = r1
            int r11 = r11 % 2
            if (r11 != 0) goto L_0x01b2
            r3 = r4
        L_0x01b2:
            if (r3 != 0) goto L_0x01b5
            return r0
        L_0x01b5:
            super.hashCode()     // Catch:{ all -> 0x01b9 }
            throw r2     // Catch:{ all -> 0x01b9 }
        L_0x01b9:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.values.init(java.lang.String):com.cardinalcommerce.a.onCReqSuccess");
    }

    public values(String str) throws JSONException, UnsupportedOperationException {
        setTranslationY cca_continue2 = setTranslationY.cca_continue();
        JSONObject jSONObject = new JSONObject(getActionCode.Cardinal(str));
        String optString = jSONObject.optString("ConsumerSessionId", "");
        String optString2 = jSONObject.optString("Payload", "");
        if (optString2 != null && !optString2.equalsIgnoreCase("")) {
            JSONObject jSONObject2 = new JSONObject(optString2);
            this.Cardinal = jSONObject2.optBoolean("Successful", false);
            this.init = jSONObject2.optInt("ErrorNumber", 0);
            this.getInstance = jSONObject2.optString("ErrorDescription", "");
            String optString3 = jSONObject2.optString(ThreeDSStrings.MESSAGE_TYPE_CRES, "");
            this.onCReqSuccess = optString3;
            if (this.Cardinal) {
                String optString4 = jSONObject2.optString("ValidateResponse", "");
                this.onValidated = optString4;
                if (optString4 != null && !optString4.equalsIgnoreCase("")) {
                    this.cca_continue = new ValidateResponse(this.onValidated);
                }
            } else if (optString3 != null && !optString3.equalsIgnoreCase("")) {
                setTransitionVisibility settransitionvisibility = new setTransitionVisibility(setScrollbarFadingEnabled.Cardinal(this.onCReqSuccess));
                this.configure = settransitionvisibility;
                if (!settransitionvisibility.getInstance.cca_continue()) {
                    cca_continue2.configure("10705", CardinalError.SUBSEQUENT_CRES_VALIDATION_ERROR_MESSAGE, optString);
                    throw new RuntimeException(CardinalError.SUBSEQUENT_CRES_VALIDATION_ERROR_MESSAGE);
                }
            }
        }
    }

    public final String Cardinal() {
        int i = getSDKVersion;
        int i2 = (i ^ 113) + ((i & 113) << 1);
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onValidated;
        int i4 = (i ^ 50) + ((i & 50) << 1);
        int i5 = ((i4 | -1) << 1) - (i4 ^ -1);
        getWarnings = i5 % 128;
        if ((i5 % 2 == 0 ? '4' : 'O') == 'O') {
            return str;
        }
        throw null;
    }

    public final boolean getInstance() {
        int i = getWarnings;
        int i2 = i ^ 49;
        int i3 = -(-((i & 49) << 1));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        getSDKVersion = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.Cardinal;
        int i6 = i & 95;
        int i7 = i | 95;
        int i8 = (i6 & i7) + (i7 | i6);
        getSDKVersion = i8 % 128;
        int i9 = i8 % 2;
        return z;
    }

    public final int configure() {
        int i = getSDKVersion;
        int i2 = ((i + 115) - 1) - 1;
        getWarnings = i2 % 128;
        if ((i2 % 2 == 0 ? 'Q' : 18) != 'Q') {
            int i3 = this.init;
            int i4 = ((i & 39) - (~(-(-(i | 39))))) - 1;
            getWarnings = i4 % 128;
            if ((i4 % 2 == 0 ? (char) 15 : 3) != 15) {
                return i3;
            }
            throw null;
        }
        throw null;
    }
}
