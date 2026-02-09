package com.cardinalcommerce.a;

import android.content.Context;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.emvco.services.CardinalThreeDS2ServiceImpl;
import com.cardinalcommerce.emvco.utils.EMVCoError;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class setClickable {
    private static int CardinalActionCode = 0;
    private static int getString = 1;
    private final JSONObject Cardinal;
    private boolean CardinalEnvironment;
    private setRotation CardinalError;
    private setRotationX CardinalRenderType;
    private final JSONObject cca_continue;
    private setScaleY cleanup;
    private final JSONArray configure;
    private final JSONObject getInstance;
    private setRotationY getSDKVersion;
    private setPivotX getWarnings;
    private final Context init;
    private setTransitionAlpha onCReqSuccess;
    private setScrollY onValidated;
    private setForceDarkAllowed valueOf;
    private setWillNotDraw values = setWillNotDraw.getInstance();

    setClickable(setFocusable setfocusable) {
        this.init = setfocusable.Cardinal();
        this.configure = Cardinal(setfocusable);
        this.CardinalEnvironment = setfocusable.onValidated();
        init();
        this.getInstance = new JSONObject();
        this.cca_continue = new JSONObject();
        this.Cardinal = new JSONObject();
        try {
            getInstance();
            this.values.Cardinal("EMVCoTransaction", ThreeDSStrings.DEVICE_DATA_JSON_EVENT);
        } catch (JSONException e) {
            this.values.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_LASSO_INFORMATION_JSON_ERROR, new StringBuilder(EMVCoError.CREATE_TRANSACTION_ERROR_CREATING_LASSO_JSON).append(e.getLocalizedMessage()).toString()));
        }
    }

    private String configure() throws JSONException {
        int i = CardinalActionCode;
        int i2 = i & 101;
        int i3 = ((i ^ 101) | i2) << 1;
        int i4 = -((i | 101) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getString = i5 % 128;
        int i6 = i5 % 2;
        this.getInstance.put("DV", "1.1");
        this.getInstance.put("DD", this.cca_continue);
        this.getInstance.put("DPNA", this.Cardinal);
        this.getInstance.put("SW", this.configure);
        String jSONObject = this.getInstance.toString();
        boolean z = false;
        int i7 = ((getString + 4) - 0) - 1;
        CardinalActionCode = i7 % 128;
        if (i7 % 2 == 0) {
            z = true;
        }
        if (z) {
            return jSONObject;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private void init() {
        int i = CardinalActionCode + 66;
        int i2 = (i & -1) + (i | -1);
        getString = i2 % 128;
        int i3 = i2 % 2;
        setSaveFromParentEnabled.getInstance();
        setScaleY Cardinal2 = setSaveFromParentEnabled.Cardinal();
        this.cleanup = Cardinal2;
        this.CardinalRenderType = Cardinal2.getInstance();
        this.onValidated = this.cleanup.configure();
        this.onCReqSuccess = this.cleanup.init();
        this.getSDKVersion = this.cleanup.Cardinal().cca_continue();
        this.getWarnings = this.cleanup.getWarnings();
        this.CardinalError = this.cleanup.Cardinal().init();
        this.valueOf = this.cleanup.cca_continue().cca_continue();
        int i4 = ((CardinalActionCode + 2) + 0) - 1;
        getString = i4 % 128;
        if ((i4 % 2 == 0 ? (char) 16 : 10) != 10) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public final String init(String str) throws JSONException, ParseException, NoSuchAlgorithmException, IOException, JOSEException, InvalidAlgorithmParameterException, InvalidKeySpecException, CertificateException {
        boolean z = true;
        int i = (getString + 110) - 1;
        CardinalActionCode = i % 128;
        int i2 = i % 2;
        String init2 = setWillNotCacheDrawing.init(this.init, configure(), str);
        int i3 = CardinalActionCode;
        int i4 = (i3 & 52) + (i3 | 52);
        int i5 = ((i4 | -1) << 1) - (i4 ^ -1);
        getString = i5 % 128;
        if (i5 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return init2;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x044a, code lost:
        if (r4 != false) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x045b, code lost:
        if ((r15.CardinalError != null ? 'R' : 8) != 'R') goto L_0x04fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0528 A[LOOP:5: B:199:0x051b->B:205:0x0528, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0561 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getInstance() throws org.json.JSONException {
        /*
            r15 = this;
            int r0 = CardinalActionCode
            int r1 = r0 + 39
            int r2 = r1 % 128
            getString = r2
            int r1 = r1 % 2
            r2 = 42
            if (r1 != 0) goto L_0x0011
            r1 = 59
            goto L_0x0012
        L_0x0011:
            r1 = r2
        L_0x0012:
            r3 = 59
            r4 = 0
            if (r1 == r3) goto L_0x0026
            com.cardinalcommerce.a.setScaleY r1 = r15.cleanup
            if (r1 == 0) goto L_0x001e
            r1 = 48
            goto L_0x0020
        L_0x001e:
            r1 = 67
        L_0x0020:
            r3 = 48
            if (r1 == r3) goto L_0x0038
            goto L_0x05c9
        L_0x0026:
            com.cardinalcommerce.a.setScaleY r1 = r15.cleanup
            r3 = 79
            int r3 = r3 / r4
            if (r1 == 0) goto L_0x0030
            r1 = 16
            goto L_0x0032
        L_0x0030:
            r1 = 22
        L_0x0032:
            r3 = 16
            if (r1 == r3) goto L_0x0038
            goto L_0x05c9
        L_0x0038:
            com.cardinalcommerce.a.setRotationX r1 = r15.CardinalRenderType
            r3 = 10
            if (r1 == 0) goto L_0x0040
            r5 = r3
            goto L_0x0042
        L_0x0040:
            r5 = 98
        L_0x0042:
            java.lang.String r6 = "C004"
            java.lang.String r7 = "C003"
            java.lang.String r8 = "C001"
            r9 = 1
            if (r5 == r3) goto L_0x006a
            r15.cca_continue(r8)
            r15.cca_continue(r7)
            r15.cca_continue(r6)
            int r0 = getString
            r1 = r0 & -114(0xffffffffffffff8e, float:NaN)
            int r5 = ~r0
            r6 = 113(0x71, float:1.58E-43)
            r5 = r5 & r6
            r1 = r1 | r5
            r0 = r0 & r6
            int r0 = r0 << r9
            r5 = r1 & r0
            r0 = r0 | r1
            int r5 = r5 + r0
            int r0 = r5 % 128
            CardinalActionCode = r0
            int r5 = r5 % 2
            goto L_0x00c6
        L_0x006a:
            r5 = r0 ^ 113(0x71, float:1.58E-43)
            r10 = r0 & 113(0x71, float:1.58E-43)
            r5 = r5 | r10
            int r5 = r5 << r9
            int r10 = ~r10
            r0 = r0 | 113(0x71, float:1.58E-43)
            r0 = r0 & r10
            int r5 = r5 - r0
            int r0 = r5 % 128
            getString = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x007f
            r0 = r9
            goto L_0x0080
        L_0x007f:
            r0 = r4
        L_0x0080:
            if (r0 == 0) goto L_0x00a7
            char[] r0 = r1.getInstance
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            r15.getInstance((java.lang.String) r8, (java.lang.String) r0)
            com.cardinalcommerce.a.setRotationX r0 = r15.CardinalRenderType
            char[] r0 = r0.init
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            r15.getInstance((java.lang.String) r7, (java.lang.String) r0)
            com.cardinalcommerce.a.setRotationX r0 = r15.CardinalRenderType
            char[] r0 = r0.cca_continue
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            r15.getInstance((java.lang.String) r6, (java.lang.String) r0)
            r0 = 23
            int r0 = r0 / r4
            goto L_0x00c6
        L_0x00a5:
            r0 = move-exception
            throw r0
        L_0x00a7:
            char[] r0 = r1.getInstance
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            r15.getInstance((java.lang.String) r8, (java.lang.String) r0)
            com.cardinalcommerce.a.setRotationX r0 = r15.CardinalRenderType
            char[] r0 = r0.init
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            r15.getInstance((java.lang.String) r7, (java.lang.String) r0)
            com.cardinalcommerce.a.setRotationX r0 = r15.CardinalRenderType
            char[] r0 = r0.cca_continue
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            r15.getInstance((java.lang.String) r6, (java.lang.String) r0)
        L_0x00c6:
            com.cardinalcommerce.a.setTransitionAlpha r0 = r15.onCReqSuccess
            if (r0 == 0) goto L_0x00cc
            r1 = r9
            goto L_0x00cd
        L_0x00cc:
            r1 = r4
        L_0x00cd:
            r5 = 95
            if (r1 == 0) goto L_0x00f9
            int r1 = getString
            r6 = r1 | 95
            int r6 = r6 << r9
            r1 = r1 ^ r5
            int r6 = r6 - r1
            int r1 = r6 % 128
            CardinalActionCode = r1
            int r6 = r6 % 2
            char[] r0 = r0.cca_continue
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            java.lang.String r1 = "C006"
            r15.getInstance((java.lang.String) r1, (java.lang.String) r0)
            int r0 = getString
            r1 = r0 | 110(0x6e, float:1.54E-43)
            int r1 = r1 << r9
            r0 = r0 ^ 110(0x6e, float:1.54E-43)
            int r1 = r1 - r0
            int r1 = r1 - r9
            int r0 = r1 % 128
            CardinalActionCode = r0
            int r1 = r1 % 2
            goto L_0x0110
        L_0x00f9:
            java.lang.String r0 = "C006"
            r15.cca_continue(r0)
            int r0 = CardinalActionCode
            r1 = r0 & -88
            int r6 = ~r0
            r7 = 87
            r6 = r6 & r7
            r1 = r1 | r6
            r0 = r0 & r7
            int r0 = r0 << r9
            int r1 = r1 + r0
            int r0 = r1 % 128
            getString = r0
            int r1 = r1 % 2
        L_0x0110:
            com.cardinalcommerce.a.setForceDarkAllowed r0 = r15.valueOf
            r1 = 60
            if (r0 == 0) goto L_0x0119
            r0 = 49
            goto L_0x011a
        L_0x0119:
            r0 = r1
        L_0x011a:
            if (r0 == r1) goto L_0x017b
            int r0 = getString
            r6 = r0 ^ 94
            r0 = r0 & 94
            int r0 = r0 << r9
            int r6 = r6 + r0
            int r6 = r6 - r9
            int r0 = r6 % 128
            CardinalActionCode = r0
            int r6 = r6 % 2
            com.cardinalcommerce.a.setScrollY r0 = r15.onValidated
            char[] r0 = r0.configure
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            java.lang.String r6 = "C002"
            r15.getInstance((java.lang.String) r6, (java.lang.String) r0)
            com.cardinalcommerce.a.setScrollY r0 = r15.onValidated
            char[] r0 = r0.onValidated
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            java.lang.String r6 = "C005"
            r15.getInstance((java.lang.String) r6, (java.lang.String) r0)
            com.cardinalcommerce.a.setScrollY r0 = r15.onValidated
            char[] r0 = r0.getSDKVersion
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            java.lang.String r6 = "C007"
            r15.getInstance((java.lang.String) r6, (java.lang.String) r0)
            com.cardinalcommerce.a.setScrollY r0 = r15.onValidated
            char[] r0 = r0.init
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            java.lang.String r6 = "C008"
            r15.getInstance((java.lang.String) r6, (java.lang.String) r0)
            com.cardinalcommerce.a.setScrollY r0 = r15.onValidated
            char[] r0 = r0.onCReqSuccess
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            java.lang.String r6 = "C009"
            r15.getInstance((java.lang.String) r6, (java.lang.String) r0)
            int r0 = CardinalActionCode
            r6 = r0 | 11
            int r6 = r6 << r9
            r0 = r0 ^ 11
            int r6 = r6 - r0
            int r0 = r6 % 128
            getString = r0
            int r6 = r6 % 2
            goto L_0x019e
        L_0x017b:
            java.lang.String r0 = "C002"
            r15.cca_continue(r0)
            java.lang.String r0 = "C005"
            r15.cca_continue(r0)
            int r0 = getString
            int r0 = r0 + 14
            int r0 = r0 - r9
            int r6 = r0 % 128
            CardinalActionCode = r6
            int r0 = r0 % 2
            r0 = 7
        L_0x0191:
            r6 = 9
            if (r0 > r6) goto L_0x0198
            r6 = 44
            goto L_0x019a
        L_0x0198:
            r6 = 57
        L_0x019a:
            r7 = 44
            if (r6 == r7) goto L_0x05ca
        L_0x019e:
            com.cardinalcommerce.a.setRotationY r0 = r15.getSDKVersion
            if (r0 == 0) goto L_0x01a5
            r6 = 88
            goto L_0x01a7
        L_0x01a5:
            r6 = 54
        L_0x01a7:
            r7 = 54
            r8 = 27
            r10 = 77
            if (r6 == r7) goto L_0x01df
            int r6 = getString
            r7 = r6 & -28
            int r11 = ~r6
            r11 = r11 & r8
            r7 = r7 | r11
            r6 = r6 & r8
            int r6 = r6 << r9
            int r6 = -r6
            int r6 = -r6
            r11 = r7 | r6
            int r11 = r11 << r9
            r6 = r6 ^ r7
            int r11 = r11 - r6
            int r6 = r11 % 128
            CardinalActionCode = r6
            int r11 = r11 % 2
            char[] r0 = r0.configure
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            java.lang.String r6 = "C010"
            r15.getInstance((java.lang.String) r6, (java.lang.String) r0)
            int r0 = getString
            r6 = r0 | 87
            int r6 = r6 << r9
            r0 = r0 ^ 87
            int r6 = r6 - r0
            int r0 = r6 % 128
            CardinalActionCode = r0
            int r6 = r6 % 2
            goto L_0x01f0
        L_0x01df:
            java.lang.String r0 = "C010"
            r15.getInstance(r0)
            int r0 = getString
            r6 = r0 & 77
            r0 = r0 | r10
            int r6 = r6 + r0
            int r0 = r6 % 128
            CardinalActionCode = r0
            int r6 = r6 % 2
        L_0x01f0:
            boolean r0 = r15.CardinalEnvironment
            if (r0 == 0) goto L_0x01f6
            r0 = r4
            goto L_0x01f7
        L_0x01f6:
            r0 = r9
        L_0x01f7:
            r6 = 80
            r7 = 18
            if (r0 == 0) goto L_0x01fe
            goto L_0x0249
        L_0x01fe:
            int r0 = getString
            r11 = r0 ^ 105(0x69, float:1.47E-43)
            r12 = r0 & 105(0x69, float:1.47E-43)
            r11 = r11 | r12
            int r11 = r11 << r9
            int r12 = ~r12
            r0 = r0 | 105(0x69, float:1.47E-43)
            r0 = r0 & r12
            int r0 = -r0
            int r0 = ~r0
            int r11 = r11 - r0
            int r11 = r11 - r9
            int r0 = r11 % 128
            CardinalActionCode = r0
            int r11 = r11 % 2
            android.content.Context r0 = r15.init
            java.lang.String r11 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r11)
            if (r0 != 0) goto L_0x0220
            r0 = r6
            goto L_0x0221
        L_0x0220:
            r0 = r7
        L_0x0221:
            if (r0 == r6) goto L_0x0224
            goto L_0x0249
        L_0x0224:
            int r0 = CardinalActionCode
            r11 = r0 & -94
            int r12 = ~r0
            r12 = r12 & 93
            r11 = r11 | r12
            r0 = r0 & 93
            int r0 = r0 << r9
            int r11 = r11 + r0
            int r0 = r11 % 128
            getString = r0
            int r11 = r11 % 2
            android.content.Context r0 = r15.init
            java.lang.String r11 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r11)
            if (r0 != 0) goto L_0x0243
            r0 = 30
            goto L_0x0245
        L_0x0243:
            r0 = 47
        L_0x0245:
            r11 = 30
            if (r0 == r11) goto L_0x0266
        L_0x0249:
            java.lang.String r0 = "C011"
            r15.getInstance(r0)
            java.lang.String r0 = "C012"
            r15.getInstance(r0)
            int r0 = getString
            r11 = r0 & 51
            int r12 = ~r11
            r0 = r0 | 51
            r0 = r0 & r12
            int r11 = r11 << r9
            int r11 = ~r11
            int r0 = r0 - r11
            int r0 = r0 - r9
            int r11 = r0 % 128
            CardinalActionCode = r11
            int r0 = r0 % 2
            goto L_0x02a5
        L_0x0266:
            int r0 = CardinalActionCode
            r11 = r0 ^ 41
            r0 = r0 & 41
            r0 = r0 | r11
            int r0 = r0 << r9
            int r11 = -r11
            int r11 = ~r11
            int r0 = r0 - r11
            int r0 = r0 - r9
            int r11 = r0 % 128
            getString = r11
            int r0 = r0 % 2
            com.cardinalcommerce.a.setPivotX r0 = r15.getWarnings
            char[] r0 = r0.configure
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            java.lang.String r11 = "C011"
            r15.getInstance((java.lang.String) r11, (java.lang.String) r0)
            com.cardinalcommerce.a.setPivotX r0 = r15.getWarnings
            char[] r0 = r0.cca_continue
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            java.lang.String r11 = "C012"
            r15.getInstance((java.lang.String) r11, (java.lang.String) r0)
            int r0 = getString
            r11 = r0 & 95
            r0 = r0 ^ r5
            r0 = r0 | r11
            int r0 = -r0
            int r0 = -r0
            r12 = r11 | r0
            int r12 = r12 << r9
            r0 = r0 ^ r11
            int r12 = r12 - r0
            int r0 = r12 % 128
            CardinalActionCode = r0
            int r12 = r12 % 2
        L_0x02a5:
            android.content.Context r0 = r15.init
            java.lang.String r11 = "android.permission.READ_PHONE_STATE"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r11)
            if (r0 != 0) goto L_0x02b1
            r0 = r4
            goto L_0x02b2
        L_0x02b1:
            r0 = r9
        L_0x02b2:
            java.lang.String r11 = "A0"
            if (r0 == 0) goto L_0x0345
            int r0 = getString
            r12 = r0 & 73
            r0 = r0 ^ 73
            r0 = r0 | r12
            int r12 = r12 + r0
            int r0 = r12 % 128
            CardinalActionCode = r0
            int r12 = r12 % 2
            r0 = r9
        L_0x02c5:
            r12 = 9
            if (r0 > r12) goto L_0x02cc
            r12 = 13
            goto L_0x02ce
        L_0x02cc:
            r12 = 12
        L_0x02ce:
            r13 = 12
            if (r12 == r13) goto L_0x0314
            int r12 = getString
            r13 = r12 & 101(0x65, float:1.42E-43)
            r12 = r12 | 101(0x65, float:1.42E-43)
            int r13 = r13 + r12
            int r12 = r13 % 128
            CardinalActionCode = r12
            int r13 = r13 % 2
            java.lang.String r12 = "A00"
            java.lang.String r13 = java.lang.String.valueOf(r0)
            java.lang.String r12 = r12.concat(r13)
            r15.getInstance(r12)
            r12 = r0 & 27
            r0 = r0 ^ 27
            r0 = r0 | r12
            r13 = r12 & r0
            r0 = r0 | r12
            int r13 = r13 + r0
            r0 = r13 & 25
            int r12 = ~r13
            r14 = -26
            r12 = r12 & r14
            r0 = r0 | r12
            r12 = r13 & -26
            int r12 = r12 << r9
            r13 = r0 | r12
            int r13 = r13 << r9
            r0 = r0 ^ r12
            int r0 = r13 - r0
            int r12 = getString
            r13 = r12 ^ 111(0x6f, float:1.56E-43)
            r12 = r12 & 111(0x6f, float:1.56E-43)
            int r12 = r12 << r9
            int r13 = r13 + r12
            int r12 = r13 % 128
            CardinalActionCode = r12
            int r13 = r13 % 2
            goto L_0x02c5
        L_0x0314:
            if (r3 > r8) goto L_0x0318
            r0 = r7
            goto L_0x0319
        L_0x0318:
            r0 = r5
        L_0x0319:
            if (r0 == r7) goto L_0x031c
            goto L_0x0378
        L_0x031c:
            int r0 = CardinalActionCode
            r12 = r0 & 17
            r0 = r0 ^ 17
            r0 = r0 | r12
            r13 = r12 & r0
            r0 = r0 | r12
            int r13 = r13 + r0
            int r0 = r13 % 128
            getString = r0
            int r13 = r13 % 2
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r11.concat(r0)
            r15.getInstance(r0)
            r0 = r3 ^ 60
            r3 = r3 & 60
            int r3 = r3 << r9
            int r0 = r0 + r3
            r3 = r0 ^ -59
            r0 = r0 & -59
            int r0 = r0 << r9
            int r3 = r3 + r0
            goto L_0x0314
        L_0x0345:
            int r0 = CardinalActionCode
            r3 = r0 ^ 1
            r0 = r0 & r9
            int r0 = r0 << r9
            int r3 = r3 + r0
            int r0 = r3 % 128
            getString = r0
            int r3 = r3 % 2
            r15.getWarnings()     // Catch:{ Exception -> 0x0367 }
            int r0 = CardinalActionCode
            r3 = r0 & 121(0x79, float:1.7E-43)
            r0 = r0 ^ 121(0x79, float:1.7E-43)
            r0 = r0 | r3
            r5 = r3 & r0
            r0 = r0 | r3
            int r5 = r5 + r0
            int r0 = r5 % 128
            getString = r0
            int r5 = r5 % 2
            goto L_0x0378
        L_0x0367:
            r0 = move-exception
            com.cardinalcommerce.a.setWillNotDraw r3 = r15.values
            com.cardinalcommerce.emvco.utils.EMVCoError r5 = new com.cardinalcommerce.emvco.utils.EMVCoError
            r7 = 11304(0x2c28, float:1.584E-41)
            java.lang.String r0 = r0.getLocalizedMessage()
            r5.<init>(r7, r0)
            r3.getInstance(r5)
        L_0x0378:
            android.content.Context r0 = r15.init
            java.lang.String r3 = "android.permission.ACCESS_WIFI_STATE"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r3)
            if (r0 != 0) goto L_0x0384
            r0 = r9
            goto L_0x0386
        L_0x0384:
            r0 = 90
        L_0x0386:
            if (r0 == r9) goto L_0x03bf
            r0 = 28
        L_0x038a:
            r3 = 38
            if (r0 > r3) goto L_0x0390
            r3 = r4
            goto L_0x0391
        L_0x0390:
            r3 = r9
        L_0x0391:
            if (r3 == 0) goto L_0x0394
            goto L_0x03e4
        L_0x0394:
            int r3 = CardinalActionCode
            r5 = r3 ^ 65
            r7 = r3 & 65
            r5 = r5 | r7
            int r5 = r5 << r9
            int r7 = ~r7
            r3 = r3 | 65
            r3 = r3 & r7
            int r5 = r5 - r3
            int r3 = r5 % 128
            getString = r3
            int r5 = r5 % 2
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r3 = r11.concat(r3)
            r15.getInstance(r3)
            r3 = r0 ^ 1
            r0 = r0 & 1
            int r0 = r0 << r9
            int r0 = -r0
            int r0 = -r0
            r5 = r3 ^ r0
            r0 = r0 & r3
            int r0 = r0 << r9
            int r0 = r0 + r5
            goto L_0x038a
        L_0x03bf:
            int r0 = getString
            r3 = r0 | 122(0x7a, float:1.71E-43)
            int r3 = r3 << r9
            r0 = r0 ^ 122(0x7a, float:1.71E-43)
            int r3 = r3 - r0
            r0 = r3 | -1
            int r0 = r0 << r9
            r3 = r3 ^ -1
            int r0 = r0 - r3
            int r3 = r0 % 128
            CardinalActionCode = r3
            int r0 = r0 % 2
            r15.CardinalRenderType()
            int r0 = CardinalActionCode
            r3 = r0 & 53
            r0 = r0 ^ 53
            r0 = r0 | r3
            int r3 = r3 + r0
            int r0 = r3 % 128
            getString = r0
            int r3 = r3 % 2
        L_0x03e4:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r0 < r3) goto L_0x03eb
            goto L_0x03ec
        L_0x03eb:
            r6 = r10
        L_0x03ec:
            r0 = 0
            java.lang.String r3 = "android.permission.BLUETOOTH"
            if (r6 == r10) goto L_0x0471
            int r1 = getString
            r2 = r1 & 47
            int r5 = ~r2
            r1 = r1 | 47
            r1 = r1 & r5
            int r2 = r2 << r9
            int r1 = r1 + r2
            int r2 = r1 % 128
            CardinalActionCode = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0404
            goto L_0x0406
        L_0x0404:
            r10 = 33
        L_0x0406:
            r1 = 33
            if (r10 != r1) goto L_0x0466
            android.content.Context r0 = r15.init
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r3)
            if (r0 != 0) goto L_0x0414
            r0 = r4
            goto L_0x0415
        L_0x0414:
            r0 = r9
        L_0x0415:
            if (r0 == 0) goto L_0x0419
            goto L_0x04fc
        L_0x0419:
            android.content.Context r0 = r15.init
            java.lang.String r1 = "android.permission.BLUETOOTH_CONNECT"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r1)
            if (r0 != 0) goto L_0x0426
            r0 = 35
            goto L_0x0428
        L_0x0426:
            r0 = 34
        L_0x0428:
            r1 = 34
            if (r0 == r1) goto L_0x04fc
            int r0 = CardinalActionCode
            r1 = r0 | 65
            int r1 = r1 << r9
            r0 = r0 ^ 65
            int r1 = r1 - r0
            int r0 = r1 % 128
            getString = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x043f
            r0 = 70
            goto L_0x0441
        L_0x043f:
            r0 = 28
        L_0x0441:
            r1 = 70
            if (r0 == r1) goto L_0x044d
            com.cardinalcommerce.a.setRotation r0 = r15.CardinalError
            if (r0 == 0) goto L_0x044a
            r4 = r9
        L_0x044a:
            if (r4 == 0) goto L_0x04fc
            goto L_0x045f
        L_0x044d:
            com.cardinalcommerce.a.setRotation r0 = r15.CardinalError
            r1 = 72
            int r1 = r1 / r4
            if (r0 == 0) goto L_0x0457
            r0 = 82
            goto L_0x0459
        L_0x0457:
            r0 = 8
        L_0x0459:
            r1 = 82
            if (r0 == r1) goto L_0x045f
            goto L_0x04fc
        L_0x045f:
            r15.getSDKVersion()
            goto L_0x04fc
        L_0x0464:
            r0 = move-exception
            throw r0
        L_0x0466:
            android.content.Context r1 = r15.init
            androidx.core.content.ContextCompat.checkSelfPermission(r1, r3)
            super.hashCode()     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x046f:
            r0 = move-exception
            throw r0
        L_0x0471:
            android.content.Context r5 = r15.init
            int r3 = androidx.core.content.ContextCompat.checkSelfPermission(r5, r3)
            if (r3 != 0) goto L_0x047b
            r3 = r9
            goto L_0x047c
        L_0x047b:
            r3 = r4
        L_0x047c:
            if (r3 == 0) goto L_0x04b2
            int r3 = getString
            r5 = r3 | 5
            int r5 = r5 << r9
            r6 = r3 ^ 5
            int r5 = r5 - r6
            int r6 = r5 % 128
            CardinalActionCode = r6
            int r5 = r5 % 2
            com.cardinalcommerce.a.setRotation r5 = r15.CardinalError
            r6 = 25
            if (r5 == 0) goto L_0x0493
            r1 = r6
        L_0x0493:
            if (r1 == r6) goto L_0x0496
            goto L_0x04b2
        L_0x0496:
            int r3 = r3 + 17
            int r1 = r3 % 128
            CardinalActionCode = r1
            int r3 = r3 % 2
            r1 = 85
            if (r3 == 0) goto L_0x04a5
            r2 = 50
            goto L_0x04a6
        L_0x04a5:
            r2 = r1
        L_0x04a6:
            if (r2 != r1) goto L_0x04ac
            r15.getSDKVersion()
            goto L_0x04fc
        L_0x04ac:
            r15.getSDKVersion()
            throw r0     // Catch:{ all -> 0x04b0 }
        L_0x04b0:
            r0 = move-exception
            throw r0
        L_0x04b2:
            r0 = 39
        L_0x04b4:
            if (r0 > r2) goto L_0x04b8
            r1 = r4
            goto L_0x04b9
        L_0x04b8:
            r1 = r9
        L_0x04b9:
            if (r1 == r9) goto L_0x04fc
            int r1 = CardinalActionCode
            r3 = r1 & 101(0x65, float:1.42E-43)
            r1 = r1 | 101(0x65, float:1.42E-43)
            int r3 = r3 + r1
            int r1 = r3 % 128
            getString = r1
            int r3 = r3 % 2
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r11.concat(r1)
            r15.getInstance(r1)
            r1 = r0 & 61
            r0 = r0 ^ 61
            r0 = r0 | r1
            int r0 = -r0
            int r0 = -r0
            r3 = r1 | r0
            int r3 = r3 << r9
            r0 = r0 ^ r1
            int r3 = r3 - r0
            r0 = r3 ^ -60
            r1 = r3 & -60
            int r1 = r1 << r9
            int r1 = -r1
            int r1 = -r1
            r3 = r0 ^ r1
            r0 = r0 & r1
            int r0 = r0 << r9
            int r0 = r0 + r3
            int r1 = getString
            int r1 = r1 + 56
            r3 = r1 ^ -1
            r1 = r1 & -1
            int r1 = r1 << r9
            int r3 = r3 + r1
            int r1 = r3 % 128
            CardinalActionCode = r1
            int r3 = r3 % 2
            goto L_0x04b4
        L_0x04fc:
            r15.onValidated()
            r15.onCReqSuccess()
            r15.cleanup()
            r15.Cardinal()
            r15.cca_continue()
            int r0 = CardinalActionCode
            r1 = r0 ^ 105(0x69, float:1.47E-43)
            r0 = r0 & 105(0x69, float:1.47E-43)
            int r0 = r0 << r9
            int r1 = r1 + r0
            int r0 = r1 % 128
            getString = r0
            int r1 = r1 % 2
            r0 = 124(0x7c, float:1.74E-43)
        L_0x051b:
            r1 = 128(0x80, float:1.794E-43)
            if (r0 > r1) goto L_0x0522
            r1 = 36
            goto L_0x0524
        L_0x0522:
            r1 = 89
        L_0x0524:
            r2 = 89
            if (r1 == r2) goto L_0x0561
            int r1 = getString
            r2 = r1 & 125(0x7d, float:1.75E-43)
            r1 = r1 | 125(0x7d, float:1.75E-43)
            int r1 = -r1
            int r1 = -r1
            r3 = r2 | r1
            int r3 = r3 << r9
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            CardinalActionCode = r1
            int r3 = r3 % 2
            java.lang.String r1 = "A"
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r1.concat(r2)
            r15.getInstance(r1)
            r1 = r0 & 1
            r0 = r0 ^ 1
            r0 = r0 | r1
            int r0 = r0 + r1
            int r1 = getString
            r2 = r1 | 107(0x6b, float:1.5E-43)
            int r2 = r2 << r9
            r1 = r1 ^ 107(0x6b, float:1.5E-43)
            int r1 = -r1
            r3 = r2 & r1
            r1 = r1 | r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            CardinalActionCode = r1
            int r3 = r3 % 2
            goto L_0x051b
        L_0x0561:
            java.lang.String r0 = "A129"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            r15.getInstance((java.lang.String) r0, (java.lang.String) r1)
            com.cardinalcommerce.a.setScrollY r0 = r15.onValidated
            char[] r0 = r0.onValidated
            java.lang.String r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r0)
            java.lang.String r1 = "A130"
            r15.getInstance((java.lang.String) r1, (java.lang.String) r0)
            com.cardinalcommerce.a.setScrollY r0 = r15.onValidated
            float r0 = r0.CardinalUiType
            java.lang.String r1 = "A131"
            r15.configure(r1, r0)
            com.cardinalcommerce.a.setScrollY r0 = r15.onValidated
            int r0 = r0.setRequestTimeout
            java.lang.String r1 = "A132"
            r15.getInstance((java.lang.String) r1, (int) r0)
            com.cardinalcommerce.a.setScrollY r0 = r15.onValidated
            float r0 = r0.getChallengeTimeout
            java.lang.String r1 = "A133"
            r15.configure(r1, r0)
            com.cardinalcommerce.a.setScrollY r0 = r15.onValidated
            double r0 = r0.setChallengeTimeout
            long r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            java.lang.String r1 = "A134"
            r15.configure(r1, r0)
            com.cardinalcommerce.a.setScrollY r0 = r15.onValidated
            double r0 = r0.getRequestTimeout
            long r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            java.lang.String r1 = "A135"
            r15.configure(r1, r0)
            com.cardinalcommerce.a.setScrollY r0 = r15.onValidated
            long r0 = r0.CardinalConfigurationParameters
            float r0 = (float) r0
            java.lang.String r1 = "A136"
            r15.configure(r1, r0)
            int r0 = getString
            int r0 = r0 + 119
            int r0 = r0 - r9
            r1 = r0 ^ -1
            r0 = r0 & -1
            int r0 = r0 << r9
            int r1 = r1 + r0
            int r0 = r1 % 128
            CardinalActionCode = r0
            int r1 = r1 % 2
        L_0x05c9:
            return
        L_0x05ca:
            int r6 = CardinalActionCode
            r7 = r6 ^ 81
            r6 = r6 & 81
            int r6 = r6 << r9
            int r7 = r7 + r6
            int r6 = r7 % 128
            getString = r6
            int r7 = r7 % 2
            java.lang.String r6 = "C00"
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r6 = r6.concat(r7)
            r15.cca_continue(r6)
            r6 = r0 ^ 85
            r7 = r0 & 85
            r6 = r6 | r7
            int r6 = r6 << r9
            int r7 = ~r7
            r0 = r0 | 85
            r0 = r0 & r7
            int r6 = r6 - r0
            r0 = r6 & -84
            r6 = r6 ^ -84
            r6 = r6 | r0
            int r0 = r0 + r6
            int r6 = getString
            int r6 = r6 + 32
            r7 = r6 | -1
            int r7 = r7 << r9
            r6 = r6 ^ -1
            int r7 = r7 - r6
            int r6 = r7 % 128
            CardinalActionCode = r6
            int r7 = r7 % 2
            goto L_0x0191
        L_0x0608:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setClickable.getInstance():void");
    }

    private void cca_continue() throws JSONException {
        int i = getString;
        int i2 = i & 101;
        int i3 = i2 + ((i ^ 101) | i2);
        CardinalActionCode = i3 % 128;
        int i4 = i3 % 2;
        getInstance("A099", this.valueOf.getInstance);
        getInstance("A100", this.valueOf.Cardinal);
        getInstance("A101", this.valueOf.init);
        getInstance("A102", this.valueOf.cca_continue);
        getInstance("A103", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.CardinalConfigurationParameters));
        getInstance("A104", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.configure));
        getInstance("A105", this.valueOf.cleanup);
        getInstance("A106", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.onCReqSuccess));
        getInstance("A107", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.getWarnings));
        getInstance("A108", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.onValidated));
        getInstance("A109", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.getSDKVersion));
        getInstance("A110", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.CardinalEnvironment));
        getInstance("A111", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.CardinalRenderType));
        getInstance("A112", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.CardinalError));
        getInstance("A113", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.valueOf));
        getInstance("A114", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.values));
        getInstance("A115", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.CardinalActionCode));
        getInstance("A116", this.valueOf.CardinalUiType);
        getInstance("A117", this.valueOf.CardinalChallengeObserver);
        getInstance("A118", this.valueOf.getActionCode);
        getInstance("A119", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.getString));
        getInstance("A120", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.getRequestTimeout));
        getInstance("A121", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.getChallengeTimeout));
        getInstance("A122", this.valueOf.setChallengeTimeout);
        getInstance("A123", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.setRequestTimeout));
        int i5 = getString;
        int i6 = i5 ^ 5;
        int i7 = ((i5 & 5) | i6) << 1;
        int i8 = -i6;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        CardinalActionCode = i9 % 128;
        if ((i9 % 2 != 0 ? 'C' : 'P') == 'C') {
            throw null;
        }
    }

    private void Cardinal() throws JSONException {
        int i = getString;
        int i2 = i & 27;
        int i3 = -(-((i ^ 27) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        CardinalActionCode = i4 % 128;
        int i5 = i4 % 2;
        getInstance("A084", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.isEnableLogging));
        getInstance("A085", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.isEnableDFSync));
        getInstance("A086", this.valueOf.setThreeDSRequestorAppURL);
        getInstance("A087", this.valueOf.getEnrolled);
        getInstance("A088", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.getThreeDSRequestorAppURL));
        getInstance("A089", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.setEnableDFSync));
        getInstance("A090", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.isLocationDataConsentGiven));
        getInstance("A091", this.valueOf.setEnableLogging);
        getInstance("A092", this.valueOf.getJSON);
        getInstance("A093", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.ExtendedData));
        getInstance("A094", this.valueOf.setLocationDataConsentGiven);
        getInstance("A095", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.getEciFlag));
        getInstance("A096", this.valueOf.getPaResStatus);
        getInstance("A097", this.valueOf.getCavv);
        getInstance("A098", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.getXid));
        int i6 = getString;
        int i7 = ((i6 & 28) + (i6 | 28)) - 1;
        CardinalActionCode = i7 % 128;
        int i8 = i7 % 2;
    }

    private void cleanup() throws JSONException {
        int i = getString;
        int i2 = ((i | 28) << 1) - (i ^ 28);
        int i3 = ((i2 | -1) << 1) - (i2 ^ -1);
        CardinalActionCode = i3 % 128;
        int i4 = i3 % 2;
        getInstance("A065", this.valueOf.setEnabledPaypal);
        getInstance("A066", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.setEnvironment));
        getInstance("A067", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.getEnvironment));
        getInstance("A068", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.getUiType));
        cca_continue("A069");
        getInstance("A070", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.setEnabledDiscover));
        getInstance("A071", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.setProxyAddress));
        getInstance("A072", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.isEnabledDiscover));
        getInstance("A073", this.valueOf.setDeviceFingerprint);
        getInstance("A074", this.valueOf.setRenderType);
        getInstance("A075", this.valueOf.getProxyAddress);
        getInstance("A076", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.setUiType));
        getInstance("A077", this.valueOf.getErrorNumber);
        getInstance("A078", this.valueOf.Payload);
        getInstance("A079", setHorizontalScrollBarEnabled.cca_continue(this.valueOf.getSignatureVerification));
        getInstance("A080", this.valueOf.isEnabledPaypal);
        getInstance("A081", this.valueOf.setUICustomization);
        getInstance("A082", this.valueOf.getRenderType);
        getInstance("A083", this.valueOf.getUICustomization);
        int i5 = getString;
        int i6 = (i5 & -26) | ((~i5) & 25);
        int i7 = (i5 & 25) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        CardinalActionCode = i8 % 128;
        int i9 = i8 % 2;
    }

    private void onCReqSuccess() throws JSONException {
        int i = CardinalActionCode;
        int i2 = i & 55;
        int i3 = ((i ^ 55) | i2) << 1;
        int i4 = -((i | 55) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getString = i5 % 128;
        int i6 = i5 % 2;
        getInstance("A060", setHorizontalScrollBarEnabled.cca_continue(this.CardinalRenderType.Cardinal));
        getInstance("A061", setHorizontalScrollBarEnabled.cca_continue(this.CardinalRenderType.onValidated));
        getInstance("A062", this.CardinalRenderType.getSDKVersion);
        getInstance("A063", this.CardinalRenderType.getWarnings);
        getInstance("A064", setHorizontalScrollBarEnabled.cca_continue(this.CardinalRenderType.onCReqSuccess));
        int i7 = getString;
        int i8 = (i7 & 104) + (i7 | 104);
        int i9 = (i8 & -1) + (i8 | -1);
        CardinalActionCode = i9 % 128;
        if ((i9 % 2 != 0 ? 19 : 'M') != 'M') {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    private void onValidated() throws JSONException {
        int i = getString;
        int i2 = (i | 15) << 1;
        int i3 = -(((~i) & 15) | (i & -16));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        CardinalActionCode = i4 % 128;
        int i5 = i4 % 2;
        cca_continue("A042");
        getInstance("A043", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.cleanup));
        getInstance("A044", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.cca_continue));
        getInstance("A045", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.getWarnings));
        getInstance("A046", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.CardinalRenderType));
        cca_continue("A047");
        getInstance("A048", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.valueOf));
        cca_continue("A049");
        getInstance("A050", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.getInstance));
        getInstance("A051", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.CardinalEnvironment));
        getInstance("A052", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.values));
        cca_continue("A053");
        getInstance("A054", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.getActionCode));
        getInstance("A055", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.CardinalChallengeObserver));
        getInstance("A056", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.getString));
        configure("A057", (float) this.onValidated.Cardinal);
        getInstance("A058", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.CardinalActionCode));
        getInstance("A059", setHorizontalScrollBarEnabled.cca_continue(this.onValidated.CardinalError));
        int i6 = getString;
        int i7 = ((i6 | 86) << 1) - (i6 ^ 86);
        int i8 = (i7 & -1) + (i7 | -1);
        CardinalActionCode = i8 % 128;
        int i9 = i8 % 2;
    }

    private void getSDKVersion() throws JSONException {
        int i = CardinalActionCode;
        int i2 = i & 87;
        int i3 = i2 + ((i ^ 87) | i2);
        getString = i3 % 128;
        if ((i3 % 2 == 0 ? 30 : 'O') == 'O') {
            cca_continue("A039");
            getInstance("A040", (List) this.CardinalError.cca_continue);
            init("A041", this.CardinalError.Cardinal);
            int i4 = getString;
            int i5 = ((i4 | 19) << 1) - (i4 ^ 19);
            CardinalActionCode = i5 % 128;
            if ((i5 % 2 != 0 ? 31 : 'U') != 'U') {
                int i6 = 42 / 0;
                return;
            }
            return;
        }
        cca_continue("A039");
        getInstance("A040", (List) this.CardinalError.cca_continue);
        init("A041", this.CardinalError.Cardinal);
        throw null;
    }

    private void getWarnings() throws JSONException {
        int i = getString;
        int i2 = i & 73;
        int i3 = -(-((i ^ 73) | i2));
        int i4 = i2 ^ i3;
        int i5 = i3 & i2;
        boolean z = true;
        int i6 = i4 + (i5 << 1);
        CardinalActionCode = i6 % 128;
        int i7 = i6 % 2;
        cca_continue("A001");
        cca_continue("A002");
        cca_continue("A003");
        cca_continue("A004");
        cca_continue("A005");
        getInstance("A006", setHorizontalScrollBarEnabled.cca_continue(this.onCReqSuccess.Cardinal));
        getInstance("A007", setHorizontalScrollBarEnabled.cca_continue(this.onCReqSuccess.init));
        getInstance("A008", setHorizontalScrollBarEnabled.cca_continue(this.onCReqSuccess.getInstance));
        getInstance("A009", setHorizontalScrollBarEnabled.cca_continue(this.onCReqSuccess.onValidated));
        getInstance("A010", setHorizontalScrollBarEnabled.cca_continue(this.onCReqSuccess.getSDKVersion));
        getInstance("A011", this.onCReqSuccess.configure);
        getInstance("A013", this.onCReqSuccess.CardinalActionCode);
        getInstance("A014", setHorizontalScrollBarEnabled.cca_continue(this.onCReqSuccess.values));
        getInstance("A015", setHorizontalScrollBarEnabled.cca_continue(this.onCReqSuccess.CardinalEnvironment));
        getInstance("A016", setHorizontalScrollBarEnabled.cca_continue(this.onCReqSuccess.CardinalError));
        cca_continue("A017");
        getInstance("A018", this.onCReqSuccess.valueOf);
        cca_continue("A019");
        cca_continue("A020");
        init("A021", this.onCReqSuccess.CardinalRenderType);
        init("A023", this.onCReqSuccess.CardinalChallengeObserver);
        int i8 = getString;
        int i9 = i8 & 103;
        int i10 = ((i8 ^ 103) | i9) << 1;
        int i11 = -((i8 | 103) & (~i9));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        CardinalActionCode = i12 % 128;
        int i13 = i12 % 2;
        getInstance("A012", this.onCReqSuccess.getActionCode);
        init("A025", this.onCReqSuccess.cleanup);
        init("A022", this.onCReqSuccess.onCReqSuccess);
        init("A027", this.onCReqSuccess.getWarnings);
        int i14 = CardinalActionCode + 23;
        getString = i14 % 128;
        int i15 = i14 % 2;
        int i16 = getString + 39;
        CardinalActionCode = i16 % 128;
        int i17 = i16 % 2;
        init("A024", this.onCReqSuccess.CardinalUiType);
        int i18 = CardinalActionCode;
        int i19 = ((i18 ^ 9) | (i18 & 9)) << 1;
        int i20 = -(((~i18) & 9) | (i18 & -10));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        getString = i21 % 128;
        int i22 = i21 % 2;
        int i23 = getString;
        int i24 = i23 ^ 69;
        int i25 = -(-((i23 & 69) << 1));
        int i26 = (i24 & i25) + (i25 | i24);
        CardinalActionCode = i26 % 128;
        int i27 = i26 % 2;
        init("A026", this.onCReqSuccess.getString);
        int i28 = getString;
        int i29 = ((i28 | 11) << 1) - (i28 ^ 11);
        CardinalActionCode = i29 % 128;
        if (i29 % 2 == 0) {
            z = false;
        }
        if (z) {
            int i30 = 43 / 0;
        }
    }

    private void CardinalRenderType() throws JSONException {
        int i = getString;
        int i2 = i & 89;
        int i3 = (((i | 89) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        CardinalActionCode = i3 % 128;
        int i4 = i3 % 2;
        cca_continue("A028");
        getInstance("A029", setHorizontalScrollBarEnabled.cca_continue(this.getSDKVersion.cca_continue));
        getInstance("A030", setHorizontalScrollBarEnabled.cca_continue(this.getSDKVersion.init));
        getInstance("A031", this.getSDKVersion.Cardinal);
        int i5 = getString;
        int i6 = i5 & 43;
        int i7 = ((i5 ^ 43) | i6) << 1;
        int i8 = -((i5 | 43) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        CardinalActionCode = i9 % 128;
        int i10 = i9 % 2;
        init("A032", this.getSDKVersion.getInstance);
        init("A033", this.getSDKVersion.cleanup);
        init("A034", this.getSDKVersion.getWarnings);
        init("A035", this.getSDKVersion.getSDKVersion);
        init("A036", this.getSDKVersion.onValidated);
        init("A038", this.getSDKVersion.onCReqSuccess);
        int i11 = getString;
        int i12 = (i11 & 48) + (i11 | 48);
        int i13 = ((i12 | -1) << 1) - (i12 ^ -1);
        CardinalActionCode = i13 % 128;
        int i14 = i13 % 2;
        init("A037", this.getSDKVersion.CardinalError);
        int i15 = getString;
        int i16 = i15 & 75;
        int i17 = ((i15 | 75) & (~i16)) + (i16 << 1);
        CardinalActionCode = i17 % 128;
        if ((i17 % 2 != 0 ? '`' : 9) != 9) {
            int i18 = 50 / 0;
        }
    }

    private void getInstance(String str, String str2) throws JSONException {
        int i = CardinalActionCode;
        int i2 = i & 85;
        int i3 = (i | 85) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        getString = i6;
        int i7 = i5 % 2;
        if ((str2 != null ? 25 : '>') != '>') {
            int i8 = (i6 & 81) + (i6 | 81);
            CardinalActionCode = i8 % 128;
            if ((i8 % 2 != 0 ? '9' : 'b') == 'b') {
                this.cca_continue.put(str, str2);
                return;
            }
            this.cca_continue.put(str, str2);
            Throwable th = null;
            super.hashCode();
            throw th;
        }
        cca_continue(str);
        int i9 = CardinalActionCode;
        int i10 = (i9 & 119) + (i9 | 119);
        getString = i10 % 128;
        int i11 = i10 % 2;
    }

    private void getInstance(String str, List list) throws JSONException {
        int i = CardinalActionCode;
        int i2 = i | 77;
        int i3 = (i2 << 1) - ((~(i & 77)) & i2);
        int i4 = i3 % 128;
        getString = i4;
        if ((i3 % 2 == 0 ? 15 : 'L') != 15) {
            if ((list != null ? 12 : '@') != 12) {
                cca_continue(str);
                int i5 = CardinalActionCode;
                int i6 = (((i5 | 100) << 1) - (i5 ^ 100)) - 1;
                getString = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            int i8 = i4 ^ 107;
            int i9 = (i4 & 107) << 1;
            int i10 = (i8 & i9) + (i9 | i8);
            CardinalActionCode = i10 % 128;
            int i11 = i10 % 2;
            this.cca_continue.put(str, list);
            int i12 = getString;
            int i13 = i12 & 117;
            int i14 = i12 | 117;
            int i15 = (i13 & i14) + (i14 | i13);
            CardinalActionCode = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private void init(String str, boolean z) throws JSONException {
        int i = getString;
        int i2 = ((i | 49) << 1) - (i ^ 49);
        CardinalActionCode = i2 % 128;
        if ((i2 % 2 != 0 ? '`' : '4') != '`') {
            this.cca_continue.put(str, z);
            int i3 = getString + 49;
            CardinalActionCode = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.cca_continue.put(str, z);
        throw null;
    }

    private void getInstance(String str, int i) throws JSONException {
        int i2 = CardinalActionCode;
        int i3 = i2 & 17;
        int i4 = ((i2 ^ 17) | i3) << 1;
        int i5 = -((i2 | 17) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        getString = i6 % 128;
        if ((i6 % 2 == 0 ? 14 : 'K') == 'K') {
            this.cca_continue.put(str, i);
        } else {
            this.cca_continue.put(str, i);
            throw null;
        }
    }

    private void configure(String str, float f) throws JSONException {
        int i = getString;
        int i2 = (i ^ 11) + ((i & 11) << 1);
        CardinalActionCode = i2 % 128;
        int i3 = i2 % 2;
        this.cca_continue.put(str, (double) f);
        int i4 = CardinalActionCode;
        int i5 = i4 & 117;
        int i6 = ((i4 ^ 117) | i5) << 1;
        int i7 = -((i4 | 117) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        getString = i8 % 128;
        int i9 = i8 % 2;
    }

    private void cca_continue(String str) {
        int i = getString;
        int i2 = (i & -54) | ((~i) & 53);
        int i3 = -(-((i & 53) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        CardinalActionCode = i4 % 128;
        if (!(i4 % 2 != 0 ? true : true)) {
            try {
                this.Cardinal.putOpt(str, "RE02");
            } catch (JSONException e) {
                this.values.getInstance(new EMVCoError(EMVCoError.EMVCO_DD_JSON_EXCEPTION_ERROR_CODE, new StringBuilder("JSON Exception \n").append(e.getLocalizedMessage()).toString()));
                return;
            }
        } else {
            this.Cardinal.putOpt(str, "RE02");
            int i5 = 11 / 0;
        }
        int i6 = CardinalActionCode;
        int i7 = i6 & 71;
        int i8 = ((((i6 ^ 71) | i7) << 1) - (~(-((i6 | 71) & (~i7))))) - 1;
        getString = i8 % 128;
        if ((i8 % 2 == 0 ? 'Z' : 23) == 'Z') {
            throw null;
        }
    }

    private void getInstance(String str) {
        int i = CardinalActionCode + 33;
        getString = i % 128;
        int i2 = i % 2;
        try {
            this.Cardinal.putOpt(str, "RE03");
            int i3 = CardinalActionCode;
            int i4 = i3 & 111;
            int i5 = (i4 - (~(-(-((i3 ^ 111) | i4))))) - 1;
            getString = i5 % 128;
            int i6 = i5 % 2;
        } catch (JSONException e) {
            this.values.getInstance(new EMVCoError(EMVCoError.EMVCO_DD_JSON_EXCEPTION_ERROR_CODE, new StringBuilder("JSON Exception \n").append(e.getLocalizedMessage()).toString()));
        }
    }

    private static JSONArray Cardinal(setFocusable setfocusable) {
        setTop configure2 = setfocusable.configure();
        try {
            if (new Throwable().getStackTrace()[1].getClassName().equals(CardinalThreeDS2ServiceImpl.class.getCanonicalName())) {
                int i = CardinalActionCode;
                int i2 = i & 65;
                int i3 = (i | 65) & (~i2);
                int i4 = -(-(i2 << 1));
                int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
                getString = i5 % 128;
                int i6 = i5 % 2;
                configure2.init(false);
                int i7 = CardinalActionCode;
                int i8 = (i7 & -116) | ((~i7) & 115);
                int i9 = (i7 & 115) << 1;
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                getString = i10 % 128;
                int i11 = i10 % 2;
            } else {
                configure2.init(true);
                int i12 = (CardinalActionCode + 74) - 1;
                getString = i12 % 128;
                int i13 = i12 % 2;
            }
            JSONArray Cardinal2 = configure2.Cardinal();
            int i14 = getString + 36;
            int i15 = (i14 & -1) + (i14 | -1);
            CardinalActionCode = i15 % 128;
            int i16 = i15 % 2;
            return Cardinal2;
        } catch (Exception unused) {
            return configure2.Cardinal();
        }
    }
}
