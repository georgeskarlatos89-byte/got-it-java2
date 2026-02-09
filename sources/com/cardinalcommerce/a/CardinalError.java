package com.cardinalcommerce.a;

import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import org.json.JSONException;
import org.json.JSONObject;

public final class CardinalError extends setKeyboardNavigationCluster {
    private static int Cardinal = 0;
    private static int getWarnings = 1;
    private static final getString init = getString.getInstance();
    private final getSDKVersion cca_continue;
    private final setAccessibilityLiveRegion configure;
    private char[] getInstance;

    static {
        int i = Cardinal;
        int i2 = (((i & -52) | ((~i) & 51)) - (~((i & 51) << 1))) - 1;
        getWarnings = i2 % 128;
        if ((i2 % 2 == 0 ? '0' : 3) != 3) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public CardinalError(setAccessibilityLiveRegion setaccessibilityliveregion, getSDKVersion getsdkversion, String str) {
        this.cca_continue = getsdkversion;
        this.getInstance = setaccessibilityliveregion.getInstance();
        this.configure = setaccessibilityliveregion;
        init.cca_continue(ThreeDSStrings.CCAEventCardinalContinue, "Challenge task initialized", String.valueOf(setaccessibilityliveregion.CardinalError()));
        try {
            super.Cardinal(new StringBuilder().append(str).append(CardinalActionCode.getInstance()).toString(), String.valueOf(cca_continue(setaccessibilityliveregion)), 10000);
        } catch (JSONException e) {
            init.cca_continue(new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError((int) com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError.CONTINUE_JWT_PARSER_EXCEPTION, (Exception) e), String.valueOf(setaccessibilityliveregion.CardinalError()));
            init(new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError(com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError.CONTINUE_JWT_PARSER_EXCEPTION));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (java.util.Arrays.equals(r7.getInstance, com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_ERROR) != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getInstance() {
        /*
            r7 = this;
            int r0 = Cardinal
            r1 = r0 ^ 79
            r0 = r0 & 79
            r2 = 1
            int r0 = r0 << r2
            r3 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r2
            int r3 = r3 + r0
            int r0 = r3 % 128
            getWarnings = r0
            int r3 = r3 % 2
            r0 = 95
            if (r3 != 0) goto L_0x0019
            r1 = r0
            goto L_0x001b
        L_0x0019:
            r1 = 89
        L_0x001b:
            r3 = 0
            if (r1 == r0) goto L_0x008e
            super.getInstance()
            char[] r0 = r7.getInstance
            boolean r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.Cardinal((char[]) r0)
            r1 = 0
            if (r0 != 0) goto L_0x002c
            r0 = r1
            goto L_0x002d
        L_0x002c:
            r0 = r2
        L_0x002d:
            if (r0 == r2) goto L_0x0076
            char[] r0 = r7.getInstance
            char[] r4 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_CHAR
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 != 0) goto L_0x003b
            r0 = r1
            goto L_0x003c
        L_0x003b:
            r0 = r2
        L_0x003c:
            if (r0 == r2) goto L_0x0055
            int r0 = Cardinal
            int r0 = r0 + 69
            int r0 = r0 - r2
            int r0 = r0 - r1
            int r0 = r0 - r2
            int r4 = r0 % 128
            getWarnings = r4
            int r0 = r0 % 2
            char[] r0 = r7.getInstance
            char[] r4 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_ERROR
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L_0x0076
        L_0x0055:
            com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse r0 = new com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r4 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.CANCEL
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r5 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            java.lang.String r6 = ""
            r5.<init>((int) r1, (java.lang.String) r6)
            r0.<init>(r1, r4, r5)
            com.cardinalcommerce.a.getSDKVersion r4 = r7.cca_continue
            r4.onValidated(r0, r3)
            int r0 = Cardinal
            r4 = r0 | 23
            int r4 = r4 << r2
            r0 = r0 ^ 23
            int r4 = r4 - r0
            int r0 = r4 % 128
            getWarnings = r0
            int r4 = r4 % 2
        L_0x0076:
            int r0 = getWarnings
            r4 = r0 & 64
            r0 = r0 | 64
            int r4 = r4 + r0
            int r4 = r4 - r1
            int r4 = r4 - r2
            int r0 = r4 % 128
            Cardinal = r0
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x0088
            r1 = r2
        L_0x0088:
            if (r1 == r2) goto L_0x008b
            return
        L_0x008b:
            throw r3     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            throw r0
        L_0x008e:
            super.getInstance()
            char[] r0 = r7.getInstance
            com.cardinalcommerce.a.setHorizontalScrollBarEnabled.Cardinal((char[]) r0)
            throw r3     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.CardinalError.getInstance():void");
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if ((java.util.Arrays.equals(r8.getInstance, com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_CHAR)) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if ((!java.util.Arrays.equals(r8.getInstance, com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_ERROR) ? (char) 0 : 24) != 0) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (com.cardinalcommerce.a.setHorizontalScrollBarEnabled.Cardinal(r8.getInstance) == false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r4 = new com.cardinalcommerce.a.values(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        r9 = Cardinal;
        r5 = ((r9 ^ 47) | (r9 & 47)) << 1;
        r9 = -(((~r9) & 47) | (r9 & -48));
        r6 = ((r5 | r9) << 1) - (r9 ^ r5);
        getWarnings = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        init.cca_continue(new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError((int) com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError.SUBSEQUENT_CRES_INVALID_RUNTIME_EXCEPTION, new java.lang.StringBuilder(com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError.SUBSEQUENT_CRES_VALIDATION_ERROR_MESSAGE).append(r9.getLocalizedMessage()).toString()), java.lang.String.valueOf(r8.configure.CardinalError()));
        init(new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError(com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError.SUBSEQUENT_CRES_INVALID_RUNTIME_EXCEPTION));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        init.cca_continue(new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError((int) com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError.CONTINUE_JWT_PARSER_EXCEPTION, r9), java.lang.String.valueOf(r8.configure.CardinalError()));
        init(new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError(com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError.CONTINUE_JWT_PARSER_EXCEPTION));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cd, code lost:
        if (r4 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cf, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d1, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d2, code lost:
        if (r9 != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d4, code lost:
        r9 = Cardinal;
        r5 = r9 & 57;
        r9 = ((r9 | 57) & (~r5)) + (r5 << 1);
        getWarnings = r9 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e4, code lost:
        if ((r9 % 2) == 0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        r9 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        r9 = kotlin.text.Typography.greater;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ea, code lost:
        if (r9 != 5) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f0, code lost:
        if (r4.configure() == 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f2, code lost:
        r9 = 'R';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        r9 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f6, code lost:
        if (r9 != 5) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fa, code lost:
        if (r4.configure != null) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fc, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fe, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ff, code lost:
        if (r9 != true) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0105, code lost:
        if (r4.getInstance() != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0107, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0109, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010a, code lost:
        if (r9 != true) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010c, code lost:
        r8.cca_continue.onValidated(new com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse(false, com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR, new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError(com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError.SEND_STEPUP_DATA_STARTED_RESPONSE_ERROR_CODE)), r0);
        r9 = getWarnings;
        r0 = ((r9 ^ 47) | (r9 & 47)) << 1;
        r9 = -(((~r9) & 47) | (r9 & -48));
        r2 = ((r0 | r9) << 1) - (r9 ^ r0);
        Cardinal = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0139, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013a, code lost:
        r9 = Cardinal;
        r5 = r9 & 19;
        r9 = r9 | 19;
        r6 = (r5 & r9) + (r9 | r5);
        getWarnings = r6 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0149, code lost:
        if ((r6 % 2) != 0) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014c, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014d, code lost:
        r9 = r8.cca_continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014f, code lost:
        if (r2 == false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0151, code lost:
        r9.onValidated(r4.cca_continue, r4.Cardinal());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015b, code lost:
        r9.onValidated(r4.cca_continue, r4.Cardinal());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0167, code lost:
        r9 = (getWarnings + 108) - 1;
        Cardinal = r9 % 128;
        r9 = r9 % 2;
        r8.cca_continue.onCReqSuccess(r4.configure);
        r9 = (((Cardinal + 91) - 1) - 0) - 1;
        getWarnings = r9 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0184, code lost:
        if ((r9 % 2) == 0) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0186, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0187, code lost:
        if (r3 != true) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0189, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0190, code lost:
        r8.cca_continue.onValidated(new com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse(false, com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR, new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError(r4.configure(), r4.getInstance)), r0);
        r9 = (((Cardinal + 15) - 1) - 0) - 1;
        getWarnings = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b4, code lost:
        r4.configure();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ba, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bd, code lost:
        r9 = Cardinal;
        r0 = ((r9 & 27) - (~(-(-(r9 | 27))))) - 1;
        getWarnings = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01cf, code lost:
        if ((r0 % 2) != 0) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d2, code lost:
        r1 = 'N';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d3, code lost:
        if (r1 == 'N') goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r9 = 21 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if ((!java.util.Arrays.equals(r8.getInstance, com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_CHAR)) != true) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01db A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getInstance(java.lang.String r9) {
        /*
            r8 = this;
            int r0 = Cardinal
            r1 = r0 & 50
            r0 = r0 | 50
            int r1 = r1 + r0
            r0 = r1 ^ -1
            r1 = r1 & -1
            r2 = 1
            int r1 = r1 << r2
            int r0 = r0 + r1
            int r1 = r0 % 128
            getWarnings = r1
            r1 = 2
            int r0 = r0 % r1
            r3 = 0
            if (r0 != 0) goto L_0x0019
            r0 = r3
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            if (r0 == 0) goto L_0x002c
            char[] r0 = r8.getInstance
            char[] r4 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_CHAR
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L_0x0028
            r0 = r3
            goto L_0x0029
        L_0x0028:
            r0 = r2
        L_0x0029:
            if (r0 == r2) goto L_0x0050
            goto L_0x003e
        L_0x002c:
            char[] r0 = r8.getInstance
            char[] r4 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_CHAR
            boolean r0 = java.util.Arrays.equals(r0, r4)
            r4 = 60
            int r4 = r4 / r3
            if (r0 == 0) goto L_0x003b
            r0 = r2
            goto L_0x003c
        L_0x003b:
            r0 = r3
        L_0x003c:
            if (r0 == 0) goto L_0x0050
        L_0x003e:
            char[] r0 = r8.getInstance
            char[] r4 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_ERROR
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 != 0) goto L_0x004a
            r0 = r3
            goto L_0x004c
        L_0x004a:
            r0 = 24
        L_0x004c:
            if (r0 == 0) goto L_0x0050
            goto L_0x01bd
        L_0x0050:
            char[] r0 = r8.getInstance
            boolean r0 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.Cardinal((char[]) r0)
            if (r0 == 0) goto L_0x01bd
            r0 = 0
            com.cardinalcommerce.a.values r4 = new com.cardinalcommerce.a.values     // Catch:{ JSONException -> 0x00ad, UnsupportedOperationException -> 0x00ab, RuntimeException -> 0x0078 }
            r4.<init>(r9)     // Catch:{ JSONException -> 0x00ad, UnsupportedOperationException -> 0x00ab, RuntimeException -> 0x0078 }
            int r9 = Cardinal
            r5 = r9 ^ 47
            r6 = r9 & 47
            r5 = r5 | r6
            int r5 = r5 << r2
            r6 = r9 & -48
            int r9 = ~r9
            r9 = r9 & 47
            r9 = r9 | r6
            int r9 = -r9
            r6 = r5 | r9
            int r6 = r6 << r2
            r9 = r9 ^ r5
            int r6 = r6 - r9
            int r9 = r6 % 128
            getWarnings = r9
            int r6 = r6 % r1
            goto L_0x00cd
        L_0x0078:
            r9 = move-exception
            com.cardinalcommerce.a.getString r4 = init
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r5 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Subsequent CRes Validation fails."
            r6.<init>(r7)
            java.lang.String r9 = r9.getLocalizedMessage()
            java.lang.StringBuilder r9 = r6.append(r9)
            java.lang.String r9 = r9.toString()
            r6 = 10705(0x29d1, float:1.5001E-41)
            r5.<init>((int) r6, (java.lang.String) r9)
            com.cardinalcommerce.a.setAccessibilityLiveRegion r9 = r8.configure
            char[] r9 = r9.CardinalError()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r4.cca_continue(r5, r9)
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r9 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r9.<init>(r6)
            r8.init((com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError) r9)
            goto L_0x00cc
        L_0x00ab:
            r9 = move-exception
            goto L_0x00ae
        L_0x00ad:
            r9 = move-exception
        L_0x00ae:
            com.cardinalcommerce.a.getString r4 = init
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r5 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r6 = 10611(0x2973, float:1.4869E-41)
            r5.<init>((int) r6, (java.lang.Exception) r9)
            com.cardinalcommerce.a.setAccessibilityLiveRegion r9 = r8.configure
            char[] r9 = r9.CardinalError()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r4.cca_continue(r5, r9)
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r9 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r9.<init>(r6)
            r8.init((com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError) r9)
        L_0x00cc:
            r4 = r0
        L_0x00cd:
            if (r4 == 0) goto L_0x00d1
            r9 = r2
            goto L_0x00d2
        L_0x00d1:
            r9 = r3
        L_0x00d2:
            if (r9 == 0) goto L_0x01bd
            int r9 = Cardinal
            r5 = r9 & 57
            int r6 = ~r5
            r9 = r9 | 57
            r9 = r9 & r6
            int r5 = r5 << r2
            int r9 = r9 + r5
            int r5 = r9 % 128
            getWarnings = r5
            int r9 = r9 % r1
            r5 = 5
            if (r9 != 0) goto L_0x00e8
            r9 = r5
            goto L_0x00ea
        L_0x00e8:
            r9 = 62
        L_0x00ea:
            if (r9 == r5) goto L_0x01b4
            int r9 = r4.configure()
            if (r9 != 0) goto L_0x00f5
            r9 = 82
            goto L_0x00f6
        L_0x00f5:
            r9 = r5
        L_0x00f6:
            if (r9 == r5) goto L_0x0190
            com.cardinalcommerce.a.setTransitionVisibility r9 = r4.configure
            if (r9 == 0) goto L_0x00fe
            r9 = r2
            goto L_0x00ff
        L_0x00fe:
            r9 = r3
        L_0x00ff:
            if (r9 == r2) goto L_0x0167
            boolean r9 = r4.getInstance()
            if (r9 == 0) goto L_0x0109
            r9 = r2
            goto L_0x010a
        L_0x0109:
            r9 = r3
        L_0x010a:
            if (r9 == r2) goto L_0x013a
            com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse r9 = new com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r4 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r5 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r6 = 10702(0x29ce, float:1.4997E-41)
            r5.<init>(r6)
            r9.<init>(r3, r4, r5)
            com.cardinalcommerce.a.getSDKVersion r3 = r8.cca_continue
            r3.onValidated(r9, r0)
            int r9 = getWarnings
            r0 = r9 ^ 47
            r3 = r9 & 47
            r0 = r0 | r3
            int r0 = r0 << r2
            r3 = r9 & -48
            int r9 = ~r9
            r9 = r9 & 47
            r9 = r9 | r3
            int r9 = -r9
            r3 = r0 | r9
            int r2 = r3 << 1
            r9 = r9 ^ r0
            int r2 = r2 - r9
            int r9 = r2 % 128
            Cardinal = r9
            int r2 = r2 % r1
            return
        L_0x013a:
            int r9 = Cardinal
            r5 = r9 & 19
            r9 = r9 | 19
            r6 = r5 & r9
            r9 = r9 | r5
            int r6 = r6 + r9
            int r9 = r6 % 128
            getWarnings = r9
            int r6 = r6 % r1
            if (r6 != 0) goto L_0x014c
            goto L_0x014d
        L_0x014c:
            r2 = r3
        L_0x014d:
            com.cardinalcommerce.a.getSDKVersion r9 = r8.cca_continue
            if (r2 != 0) goto L_0x015b
            com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse r0 = r4.cca_continue
            java.lang.String r1 = r4.Cardinal()
            r9.onValidated(r0, r1)
            return
        L_0x015b:
            com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse r1 = r4.cca_continue
            java.lang.String r2 = r4.Cardinal()
            r9.onValidated(r1, r2)
            throw r0     // Catch:{ all -> 0x0165 }
        L_0x0165:
            r9 = move-exception
            throw r9
        L_0x0167:
            int r9 = getWarnings
            int r9 = r9 + 108
            int r9 = r9 - r2
            int r5 = r9 % 128
            Cardinal = r5
            int r9 = r9 % r1
            com.cardinalcommerce.a.getSDKVersion r9 = r8.cca_continue
            com.cardinalcommerce.a.setTransitionVisibility r4 = r4.configure
            r9.onCReqSuccess(r4)
            int r9 = Cardinal
            int r9 = r9 + 91
            int r9 = r9 - r2
            int r9 = r9 - r3
            int r9 = r9 - r2
            int r4 = r9 % 128
            getWarnings = r4
            int r9 = r9 % r1
            if (r9 != 0) goto L_0x0187
            r3 = r2
        L_0x0187:
            if (r3 == r2) goto L_0x018a
            return
        L_0x018a:
            super.hashCode()     // Catch:{ all -> 0x018e }
            throw r0     // Catch:{ all -> 0x018e }
        L_0x018e:
            r9 = move-exception
            throw r9
        L_0x0190:
            com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse r9 = new com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r5 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r6 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            int r7 = r4.configure()
            java.lang.String r4 = r4.getInstance
            r6.<init>((int) r7, (java.lang.String) r4)
            r9.<init>(r3, r5, r6)
            com.cardinalcommerce.a.getSDKVersion r4 = r8.cca_continue
            r4.onValidated(r9, r0)
            int r9 = Cardinal
            int r9 = r9 + 15
            int r9 = r9 - r2
            int r9 = r9 - r3
            int r9 = r9 - r2
            int r0 = r9 % 128
            getWarnings = r0
            int r9 = r9 % r1
            goto L_0x01bd
        L_0x01b4:
            r4.configure()
            super.hashCode()     // Catch:{ all -> 0x01bb }
            throw r0     // Catch:{ all -> 0x01bb }
        L_0x01bb:
            r9 = move-exception
            throw r9
        L_0x01bd:
            int r9 = Cardinal
            r0 = r9 & 27
            r9 = r9 | 27
            int r9 = -r9
            int r9 = -r9
            int r9 = ~r9
            int r0 = r0 - r9
            int r0 = r0 - r2
            int r9 = r0 % 128
            getWarnings = r9
            int r0 = r0 % r1
            r9 = 78
            if (r0 != 0) goto L_0x01d2
            goto L_0x01d3
        L_0x01d2:
            r1 = r9
        L_0x01d3:
            if (r1 == r9) goto L_0x01db
            r9 = 21
            int r9 = r9 / r3
            return
        L_0x01d9:
            r9 = move-exception
            throw r9
        L_0x01db:
            return
        L_0x01dc:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.CardinalError.getInstance(java.lang.String):void");
    }

    public final void configure(String str, int i) {
        init.cca_continue(new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError(i, str), String.valueOf(this.configure.CardinalError()));
        init(new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError(com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError.CONTINUE_IO_EXCEPTION));
        int i2 = Cardinal;
        int i3 = (i2 & -58) | ((~i2) & 57);
        int i4 = -(-((i2 & 57) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getWarnings = i5 % 128;
        if ((i5 % 2 == 0 ? ' ' : 7) != 7) {
            throw null;
        }
    }

    /* renamed from: com.cardinalcommerce.a.CardinalError$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] Cardinal;
        private static int configure = 0;
        private static int getInstance = 1;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(4:13|14|15|17)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0020 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0032 */
        static {
            /*
                com.cardinalcommerce.a.setContextClickable[] r0 = com.cardinalcommerce.a.setContextClickable.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Cardinal = r0
                r1 = 1
                r2 = 2
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r0 = getInstance
                r3 = r0 | 43
                int r3 = r3 << r1
                r0 = r0 ^ 43
                int r3 = r3 - r0
                int r0 = r3 % 128
                configure = r0
                int r3 = r3 % r2
            L_0x0020:
                int[] r0 = Cardinal     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.IO_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r0 = configure
                int r0 = r0 + r1
                int r3 = r0 % 128
                getInstance = r3
                int r0 = r0 % r2
            L_0x0032:
                int[] r0 = Cardinal     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.PROTOCOL_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r0 = getInstance
                r3 = r0 ^ 89
                r4 = r0 & 89
                r3 = r3 | r4
                int r1 = r3 << 1
                int r3 = ~r4
                r0 = r0 | 89
                r0 = r0 & r3
                int r0 = -r0
                r3 = r1 & r0
                r0 = r0 | r1
                int r3 = r3 + r0
                int r0 = r3 % 128
                configure = r0
                int r3 = r3 % r2
            L_0x0054:
                int[] r0 = Cardinal     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.cardinalcommerce.a.setContextClickable r1 = com.cardinalcommerce.a.setContextClickable.MALFORMED_URL_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r3 = 4
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r0 = getInstance
                int r0 = r0 + 55
                int r1 = r0 % 128
                configure = r1
                int r0 = r0 % r2
            L_0x0068:
                int[] r0 = Cardinal     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.cardinalcommerce.a.setContextClickable r1 = com.cardinalcommerce.a.setContextClickable.SOCKET_TIMEOUT_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r3 = 5
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r0 = configure
                r1 = r0 & 29
                r0 = r0 ^ 29
                r0 = r0 | r1
                r3 = r1 & r0
                r0 = r0 | r1
                int r3 = r3 + r0
                int r0 = r3 % 128
                getInstance = r0
                int r3 = r3 % r2
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.CardinalError.AnonymousClass3.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r10 != 5) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r10 != 5) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void cca_continue(java.lang.Exception r9, com.cardinalcommerce.a.setContextClickable r10) {
        /*
            r8 = this;
            int r0 = Cardinal
            r1 = r0 & 119(0x77, float:1.67E-43)
            r0 = r0 | 119(0x77, float:1.67E-43)
            int r1 = r1 + r0
            int r0 = r1 % 128
            getWarnings = r0
            r0 = 2
            int r1 = r1 % r0
            r2 = 16
            if (r1 != 0) goto L_0x0013
            r1 = r2
            goto L_0x0015
        L_0x0013:
            r1 = 54
        L_0x0015:
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 0
            r7 = 1
            if (r1 == r2) goto L_0x0032
            super.cca_continue((java.lang.Exception) r9, (com.cardinalcommerce.a.setContextClickable) r10)
            int[] r1 = com.cardinalcommerce.a.CardinalError.AnonymousClass3.Cardinal
            int r10 = r10.ordinal()
            r10 = r1[r10]
            if (r10 == r7) goto L_0x00fe
            if (r10 == r0) goto L_0x00fe
            if (r10 == r5) goto L_0x00c8
            if (r10 == r4) goto L_0x009f
            if (r10 == r3) goto L_0x004c
            goto L_0x0081
        L_0x0032:
            super.cca_continue((java.lang.Exception) r9, (com.cardinalcommerce.a.setContextClickable) r10)
            int[] r1 = com.cardinalcommerce.a.CardinalError.AnonymousClass3.Cardinal
            int r10 = r10.ordinal()
            r10 = r1[r10]
            r1 = 56
            int r1 = r1 / 0
            if (r10 == r7) goto L_0x00fe
            if (r10 == r0) goto L_0x00fe
            if (r10 == r5) goto L_0x00c8
            if (r10 == r4) goto L_0x009f
            if (r10 == r3) goto L_0x004c
            goto L_0x0081
        L_0x004c:
            com.cardinalcommerce.a.getString r10 = init
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r2 = 10614(0x2976, float:1.4873E-41)
            r1.<init>((int) r2, (java.lang.Exception) r9)
            com.cardinalcommerce.a.setAccessibilityLiveRegion r9 = r8.configure
            char[] r9 = r9.CardinalError()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r10.cca_continue(r1, r9)
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r9 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r9.<init>(r2)
            r8.init((com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError) r9)
            int r9 = getWarnings
            r10 = r9 ^ 77
            r1 = r9 & 77
            r10 = r10 | r1
            int r10 = r10 << r7
            int r1 = ~r1
            r9 = r9 | 77
            r9 = r9 & r1
            int r9 = -r9
            r1 = r10 ^ r9
            r9 = r9 & r10
            int r9 = r9 << r7
            int r1 = r1 + r9
            int r9 = r1 % 128
            Cardinal = r9
            int r1 = r1 % r0
        L_0x0081:
            int r9 = Cardinal
            r10 = r9 & 107(0x6b, float:1.5E-43)
            r9 = r9 ^ 107(0x6b, float:1.5E-43)
            r9 = r9 | r10
            int r10 = r10 + r9
            int r9 = r10 % 128
            getWarnings = r9
            int r10 = r10 % r0
            r9 = 76
            if (r10 != 0) goto L_0x0095
            r10 = 62
            goto L_0x0096
        L_0x0095:
            r10 = r9
        L_0x0096:
            if (r10 != r9) goto L_0x0099
            return
        L_0x0099:
            super.hashCode()     // Catch:{ all -> 0x009d }
            throw r6     // Catch:{ all -> 0x009d }
        L_0x009d:
            r9 = move-exception
            throw r9
        L_0x009f:
            com.cardinalcommerce.a.getString r10 = init
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r2 = 10613(0x2975, float:1.4872E-41)
            r1.<init>((int) r2, (java.lang.Exception) r9)
            com.cardinalcommerce.a.setAccessibilityLiveRegion r9 = r8.configure
            char[] r9 = r9.CardinalError()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r10.cca_continue(r1, r9)
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r9 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r9.<init>(r2)
            r8.init((com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError) r9)
            int r9 = getWarnings
            int r9 = r9 + 82
            int r9 = r9 - r7
            int r10 = r9 % 128
            Cardinal = r10
            int r9 = r9 % r0
            return
        L_0x00c8:
            com.cardinalcommerce.a.getString r10 = init
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r2 = 10615(0x2977, float:1.4875E-41)
            r1.<init>((int) r2, (java.lang.Exception) r9)
            com.cardinalcommerce.a.setAccessibilityLiveRegion r9 = r8.configure
            char[] r9 = r9.CardinalError()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r10.cca_continue(r1, r9)
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r9 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r9.<init>(r2)
            r8.init((com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError) r9)
            int r9 = getWarnings
            r10 = r9 & -108(0xffffffffffffff94, float:NaN)
            int r1 = ~r9
            r1 = r1 & 107(0x6b, float:1.5E-43)
            r10 = r10 | r1
            r9 = r9 & 107(0x6b, float:1.5E-43)
            int r9 = r9 << r7
            int r9 = -r9
            int r9 = -r9
            r1 = r10 ^ r9
            r9 = r9 & r10
            int r9 = r9 << r7
            int r1 = r1 + r9
            int r9 = r1 % 128
            Cardinal = r9
            int r1 = r1 % r0
            return
        L_0x00fe:
            com.cardinalcommerce.a.getString r10 = init
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r2 = 10612(0x2974, float:1.487E-41)
            r1.<init>((int) r2, (java.lang.Exception) r9)
            com.cardinalcommerce.a.setAccessibilityLiveRegion r9 = r8.configure
            char[] r9 = r9.CardinalError()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r10.cca_continue(r1, r9)
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r9 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r9.<init>(r2)
            r8.init((com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError) r9)
            int r9 = getWarnings
            r10 = r9 | 59
            int r1 = r10 << 1
            r9 = r9 & 59
            int r9 = ~r9
            r9 = r9 & r10
            int r9 = -r9
            r10 = r1 & r9
            r9 = r9 | r1
            int r10 = r10 + r9
            int r9 = r10 % 128
            Cardinal = r9
            int r10 = r10 % r0
            r9 = 89
            if (r10 == 0) goto L_0x0137
            r10 = 14
            goto L_0x0138
        L_0x0137:
            r10 = r9
        L_0x0138:
            if (r10 != r9) goto L_0x013b
            return
        L_0x013b:
            throw r6     // Catch:{ all -> 0x013c }
        L_0x013c:
            r9 = move-exception
            throw r9
        L_0x013e:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.CardinalError.cca_continue(java.lang.Exception, com.cardinalcommerce.a.setContextClickable):void");
    }

    private static JSONObject cca_continue(setAccessibilityLiveRegion setaccessibilityliveregion) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("ChallengeCancel", init(setaccessibilityliveregion.getInstance()));
        jSONObject2.putOpt("ChallengeDataEntry", init(setaccessibilityliveregion.cca_continue()));
        jSONObject2.putOpt("ChallengeHTMLDataEntry", init(setaccessibilityliveregion.Cardinal()));
        jSONObject2.putOpt("OobContinue", Boolean.valueOf(setaccessibilityliveregion.cleanup()));
        jSONObject2.putOpt("ResendChallenge", init(setaccessibilityliveregion.getWarnings()));
        jSONObject2.putOpt("TransactionId", init(setaccessibilityliveregion.CardinalRenderType()));
        jSONObject2.putOpt("ChallengeNoEntry", init(setaccessibilityliveregion.values()));
        jSONObject2.putOpt("RequestorAppUrl", init(setaccessibilityliveregion.getSDKVersion()));
        jSONObject2.putOpt("WhiteListDataEntry", init(setaccessibilityliveregion.onCReqSuccess()));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.putOpt("PaymentType", "cca");
        jSONObject3.putOpt("StepUp", jSONObject2);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.putOpt("Agent", "CardinalMobileSdk_Android");
        jSONObject4.putOpt("Version", ThreeDSStrings.SDKVersion);
        jSONObject.putOpt("BrowserPayload", jSONObject3);
        jSONObject.putOpt("Client", jSONObject4);
        char c = '9';
        if (setaccessibilityliveregion.CardinalError().length != 0) {
            int i = Cardinal;
            int i2 = i ^ 101;
            int i3 = (((i & 101) | i2) << 1) - i2;
            getWarnings = i3 % 128;
            if (i3 % 2 == 0) {
                jSONObject.putOpt("ConsumerSessionId", init(setaccessibilityliveregion.CardinalError()));
                int i4 = 57 / 0;
            } else {
                jSONObject.putOpt("ConsumerSessionId", init(setaccessibilityliveregion.CardinalError()));
            }
            int i5 = getWarnings;
            int i6 = (i5 & -92) | ((~i5) & 91);
            int i7 = -(-((i5 & 91) << 1));
            int i8 = (i6 & i7) + (i7 | i6);
            Cardinal = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((setaccessibilityliveregion.CardinalEnvironment().length != 0 ? '_' : '&') != '&') {
            int i10 = getWarnings;
            int i11 = (i10 ^ 115) + ((i10 & 115) << 1);
            Cardinal = i11 % 128;
            int i12 = i11 % 2;
            jSONObject.putOpt("ServerJWT", init(setaccessibilityliveregion.CardinalEnvironment()));
            int i13 = Cardinal;
            int i14 = (((i13 & -84) | ((~i13) & 83)) - (~(-(-((i13 & 83) << 1))))) - 1;
            getWarnings = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = Cardinal;
        int i17 = ((i16 ^ 5) - (~(-(-((i16 & 5) << 1))))) - 1;
        getWarnings = i17 % 128;
        if (i17 % 2 == 0) {
            c = 'G';
        }
        if (c != 'G') {
            return jSONObject;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private void init(com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError cardinalError) {
        this.cca_continue.onValidated(new ValidateResponse(false, CardinalActionCode.ERROR, cardinalError), "");
        int i = getWarnings;
        int i2 = (i & 95) + (i | 95);
        Cardinal = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    private static String init(char[] cArr) {
        int i = Cardinal;
        int i2 = (i & 79) + (i | 79);
        int i3 = i2 % 128;
        getWarnings = i3;
        ? r3 = 0;
        if ((i2 % 2 == 0 ? 'I' : '5') != 'I') {
            boolean z = false;
            if (!(cArr == null)) {
                String str = new String(cArr);
                int i4 = Cardinal;
                int i5 = ((i4 | 79) << 1) - (i4 ^ 79);
                getWarnings = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
            int i7 = i3 + 5;
            Cardinal = i7 % 128;
            if (i7 % 2 == 0) {
                z = true;
            }
            if (z) {
                return r3;
            }
            super.hashCode();
            throw r3;
        }
        throw r3;
    }
}
