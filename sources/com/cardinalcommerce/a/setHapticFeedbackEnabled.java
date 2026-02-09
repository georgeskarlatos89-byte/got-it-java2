package com.cardinalcommerce.a;

import android.content.Context;
import com.cardinalcommerce.emvco.utils.EMVCoError;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.json.JSONException;
import org.json.JSONObject;

public final class setHapticFeedbackEnabled {
    private static int Cardinal = 0;
    private static int getInstance = 1;
    private final setWillNotDraw cca_continue;
    private final setLayoutParams configure;
    private final Context init;

    setHapticFeedbackEnabled() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00da, code lost:
        if (r0.equals(com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.RENDER_TYPE_HTML) == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
        r0 = 'F';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
        r0 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e0, code lost:
        if (r0 == 'F') goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e3, code lost:
        r0 = Cardinal;
        r1 = (((r0 ^ 111) | (r0 & 111)) << 1) - ((r0 & -112) | ((~r0) & 111));
        getInstance = r1 % 128;
        r1 = r1 % 2;
        r1 = (r0 & 82) + (r0 | 82);
        r0 = (r1 ^ -1) + ((r1 & -1) << 1);
        getInstance = r0 % 128;
        r0 = r0 % 2;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0110, code lost:
        if (r0.equals(com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.RENDER_TYPE_OOB) == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0112, code lost:
        r0 = 'H';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0115, code lost:
        r0 = '+';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        if (r0 == '+') goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0118, code lost:
        r0 = getInstance;
        r1 = r0 & 101;
        r1 = r1 + ((r0 ^ 101) | r1);
        Cardinal = r1 % 128;
        r1 = r1 % 2;
        r8 = r0 & 27;
        r1 = (((r0 ^ 27) | r8) << 1) - ((r0 | 27) & (~r8));
        Cardinal = r1 % 128;
        r1 = r1 % 2;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013e, code lost:
        if (r0.equals(com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.RENDER_TYPE_MULTI_SELECT) == false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0140, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0143, code lost:
        if (r0 == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0147, code lost:
        r0 = Cardinal;
        r1 = ((r0 ^ 121) | (r0 & 121)) << 1;
        r0 = -(((~r0) & 121) | (r0 & -122));
        r8 = (r1 ^ r0) + ((r0 & r1) << 1);
        r0 = r8 % 128;
        getInstance = r0;
        r8 = r8 % 2;
        r1 = (((r0 ^ 101) | (r0 & 101)) << 1) - (((~r0) & 101) | (r0 & -102));
        Cardinal = r1 % 128;
        r1 = r1 % 2;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017d, code lost:
        if (r0.equals(com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.RENDER_TYPE_SINGLE_SELECT) == false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017f, code lost:
        r0 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0181, code lost:
        r0 = '^';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0183, code lost:
        if (r0 == 15) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0187, code lost:
        r0 = Cardinal;
        r1 = r0 & 15;
        r1 = r1 + ((r0 ^ 15) | r1);
        getInstance = r1 % 128;
        r1 = r1 % 2;
        r1 = r0 & 83;
        r0 = -(-((r0 ^ 83) | r1));
        r8 = ((r1 | r0) << 1) - (r0 ^ r1);
        getInstance = r8 % 128;
        r8 = r8 % 2;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01af, code lost:
        if (r0.equals("01") == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b1, code lost:
        r0 = 'A';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b4, code lost:
        r0 = '5';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b5, code lost:
        if (r0 == '5') goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b7, code lost:
        r0 = getInstance;
        r8 = r0 & 53;
        r0 = -(-(r0 | 53));
        r1 = (r8 ^ r0) + ((r0 & r8) << 1);
        r0 = r1 % 128;
        Cardinal = r0;
        r1 = r1 % 2;
        r1 = r0 | 93;
        r8 = (r1 << 1) - ((~(r0 & 93)) & r1);
        getInstance = r8 % 128;
        r8 = r8 % 2;
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.cardinalcommerce.a.setScrollX configure(com.cardinalcommerce.a.setTransitionVisibility r13) {
        /*
            java.lang.String r0 = r13.configure()
            com.cardinalcommerce.a.setScrollX r1 = new com.cardinalcommerce.a.setScrollX
            r1.<init>()
            java.lang.String r2 = r13.onCReqSuccess()
            boolean r2 = com.cardinalcommerce.a.setScrollbarFadingEnabled.init(r2)
            r3 = 84
            r4 = 6
            if (r2 != 0) goto L_0x0018
            r2 = r3
            goto L_0x0019
        L_0x0018:
            r2 = r4
        L_0x0019:
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == r4) goto L_0x0049
            int r2 = getInstance
            r8 = r2 ^ 87
            r9 = r2 & 87
            r8 = r8 | r9
            int r8 = r8 << r7
            int r9 = ~r9
            r2 = r2 | 87
            r2 = r2 & r9
            int r2 = -r2
            int r2 = ~r2
            int r8 = r8 - r2
            int r8 = r8 - r7
            int r2 = r8 % 128
            Cardinal = r2
            int r8 = r8 % r6
            java.lang.String r2 = "ChallengeCompletionInd"
            r1.getInstance(r5, r2)
            int r2 = getInstance
            r8 = r2 ^ 89
            r2 = r2 & 89
            int r2 = r2 << r7
            r9 = r8 | r2
            int r9 = r9 << r7
            r2 = r2 ^ r8
            int r9 = r9 - r2
            int r2 = r9 % 128
            Cardinal = r2
            int r9 = r9 % r6
        L_0x0049:
            boolean r2 = r1.cca_continue()
            if (r2 == 0) goto L_0x0051
            r2 = r7
            goto L_0x0052
        L_0x0051:
            r2 = r5
        L_0x0052:
            if (r2 == r7) goto L_0x005e
            int r13 = Cardinal
            int r13 = r13 + 89
            int r0 = r13 % 128
            getInstance = r0
            int r13 = r13 % r6
            return r1
        L_0x005e:
            int r2 = getInstance
            r8 = r2 ^ 3
            r9 = 3
            r2 = r2 & r9
            r2 = r2 | r8
            int r2 = r2 << r7
            int r8 = -r8
            int r8 = ~r8
            int r2 = r2 - r8
            int r2 = r2 - r7
            int r8 = r2 % 128
            Cardinal = r8
            int r2 = r2 % r6
            r8 = 69
            r10 = 82
            if (r2 == 0) goto L_0x0077
            r2 = r10
            goto L_0x0078
        L_0x0077:
            r2 = r8
        L_0x0078:
            java.lang.String r11 = "N"
            r12 = 0
            if (r2 != r8) goto L_0x02d3
            java.lang.String r2 = r13.onCReqSuccess()
            boolean r2 = r2.equalsIgnoreCase(r11)
            r8 = 33
            r11 = 35
            if (r2 == 0) goto L_0x008d
            r2 = r8
            goto L_0x008e
        L_0x008d:
            r2 = r11
        L_0x008e:
            if (r2 == r11) goto L_0x02b7
            boolean r2 = com.cardinalcommerce.a.setScrollbarFadingEnabled.Cardinal(r0, r6)
            r1.cca_continue(r2)
            boolean r2 = r1.cca_continue()
            if (r2 == 0) goto L_0x009f
            r2 = r7
            goto L_0x00a0
        L_0x009f:
            r2 = r5
        L_0x00a0:
            if (r2 == 0) goto L_0x0295
            int r1 = Cardinal
            r2 = r1 | 24
            int r2 = r2 << r7
            r1 = r1 ^ 24
            int r2 = r2 - r1
            r1 = r2 | -1
            int r1 = r1 << r7
            r4 = -1
            r2 = r2 ^ r4
            int r1 = r1 - r2
            int r2 = r1 % 128
            getInstance = r2
            int r1 = r1 % r6
            if (r1 != 0) goto L_0x00b9
            r1 = r5
            goto L_0x00ba
        L_0x00b9:
            r1 = r7
        L_0x00ba:
            r2 = 4
            if (r1 == 0) goto L_0x00c7
            int r1 = r0.hashCode()
            switch(r1) {
                case 1537: goto L_0x01a7;
                case 1538: goto L_0x0175;
                case 1539: goto L_0x0138;
                case 1540: goto L_0x0108;
                case 1541: goto L_0x00d2;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            r0 = r4
            goto L_0x01d7
        L_0x00c7:
            int r1 = r0.hashCode()
            r8 = 82
            int r8 = r8 / r5
            switch(r1) {
                case 1537: goto L_0x01a7;
                case 1538: goto L_0x0175;
                case 1539: goto L_0x0138;
                case 1540: goto L_0x0108;
                case 1541: goto L_0x00d2;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            goto L_0x00c4
        L_0x00d2:
            java.lang.String r1 = "05"
            boolean r0 = r0.equals(r1)
            r1 = 70
            if (r0 == 0) goto L_0x00de
            r0 = r1
            goto L_0x00e0
        L_0x00de:
            r0 = 30
        L_0x00e0:
            if (r0 == r1) goto L_0x00e3
            goto L_0x00c4
        L_0x00e3:
            int r0 = Cardinal
            r1 = r0 ^ 111(0x6f, float:1.56E-43)
            r8 = r0 & 111(0x6f, float:1.56E-43)
            r1 = r1 | r8
            int r1 = r1 << r7
            r8 = r0 & -112(0xffffffffffffff90, float:NaN)
            int r11 = ~r0
            r11 = r11 & 111(0x6f, float:1.56E-43)
            r8 = r8 | r11
            int r1 = r1 - r8
            int r8 = r1 % 128
            getInstance = r8
            int r1 = r1 % r6
            r1 = r0 & 82
            r0 = r0 | r10
            int r1 = r1 + r0
            r0 = r1 ^ -1
            r1 = r1 & r4
            int r1 = r1 << r7
            int r0 = r0 + r1
            int r1 = r0 % 128
            getInstance = r1
            int r0 = r0 % r6
            r0 = r5
            goto L_0x01d7
        L_0x0108:
            java.lang.String r1 = "04"
            boolean r0 = r0.equals(r1)
            r1 = 43
            if (r0 == 0) goto L_0x0115
            r0 = 72
            goto L_0x0116
        L_0x0115:
            r0 = r1
        L_0x0116:
            if (r0 == r1) goto L_0x00c4
            int r0 = getInstance
            r1 = r0 & 101(0x65, float:1.42E-43)
            r8 = r0 ^ 101(0x65, float:1.42E-43)
            r8 = r8 | r1
            int r1 = r1 + r8
            int r8 = r1 % 128
            Cardinal = r8
            int r1 = r1 % r6
            r1 = r0 ^ 27
            r8 = r0 & 27
            r1 = r1 | r8
            int r1 = r1 << r7
            int r8 = ~r8
            r0 = r0 | 27
            r0 = r0 & r8
            int r1 = r1 - r0
            int r0 = r1 % 128
            Cardinal = r0
            int r1 = r1 % r6
            r0 = r9
            goto L_0x01d7
        L_0x0138:
            java.lang.String r1 = "03"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0142
            r0 = r5
            goto L_0x0143
        L_0x0142:
            r0 = r7
        L_0x0143:
            if (r0 == 0) goto L_0x0147
            goto L_0x00c4
        L_0x0147:
            int r0 = Cardinal
            r1 = r0 ^ 121(0x79, float:1.7E-43)
            r8 = r0 & 121(0x79, float:1.7E-43)
            r1 = r1 | r8
            int r1 = r1 << r7
            r8 = r0 & -122(0xffffffffffffff86, float:NaN)
            int r0 = ~r0
            r10 = 121(0x79, float:1.7E-43)
            r0 = r0 & r10
            r0 = r0 | r8
            int r0 = -r0
            r8 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r7
            int r8 = r8 + r0
            int r0 = r8 % 128
            getInstance = r0
            int r8 = r8 % r6
            r1 = r0 ^ 101(0x65, float:1.42E-43)
            r8 = r0 & 101(0x65, float:1.42E-43)
            r1 = r1 | r8
            int r1 = r1 << r7
            r8 = r0 & -102(0xffffffffffffff9a, float:NaN)
            int r0 = ~r0
            r0 = r0 & 101(0x65, float:1.42E-43)
            r0 = r0 | r8
            int r1 = r1 - r0
            int r0 = r1 % 128
            Cardinal = r0
            int r1 = r1 % r6
            r0 = r6
            goto L_0x01d7
        L_0x0175:
            java.lang.String r1 = "02"
            boolean r0 = r0.equals(r1)
            r1 = 15
            if (r0 == 0) goto L_0x0181
            r0 = r1
            goto L_0x0183
        L_0x0181:
            r0 = 94
        L_0x0183:
            if (r0 == r1) goto L_0x0187
            goto L_0x00c4
        L_0x0187:
            int r0 = Cardinal
            r1 = r0 & 15
            r8 = r0 ^ 15
            r8 = r8 | r1
            int r1 = r1 + r8
            int r8 = r1 % 128
            getInstance = r8
            int r1 = r1 % r6
            r1 = r0 & 83
            r0 = r0 ^ 83
            r0 = r0 | r1
            int r0 = -r0
            int r0 = -r0
            r8 = r1 | r0
            int r8 = r8 << r7
            r0 = r0 ^ r1
            int r8 = r8 - r0
            int r0 = r8 % 128
            getInstance = r0
            int r8 = r8 % r6
            r0 = r2
            goto L_0x01d7
        L_0x01a7:
            java.lang.String r1 = "01"
            boolean r0 = r0.equals(r1)
            r1 = 53
            if (r0 == 0) goto L_0x01b4
            r0 = 65
            goto L_0x01b5
        L_0x01b4:
            r0 = r1
        L_0x01b5:
            if (r0 == r1) goto L_0x00c4
            int r0 = getInstance
            r8 = r0 & 53
            r0 = r0 | r1
            int r0 = -r0
            int r0 = -r0
            r1 = r8 ^ r0
            r0 = r0 & r8
            int r0 = r0 << r7
            int r1 = r1 + r0
            int r0 = r1 % 128
            Cardinal = r0
            int r1 = r1 % r6
            r1 = r0 | 93
            int r8 = r1 << 1
            r0 = r0 & 93
            int r0 = ~r0
            r0 = r0 & r1
            int r8 = r8 - r0
            int r0 = r8 % 128
            getInstance = r0
            int r8 = r8 % r6
            r0 = r7
        L_0x01d7:
            if (r0 == 0) goto L_0x027d
            if (r0 == r7) goto L_0x025d
            if (r0 == r6) goto L_0x023e
            if (r0 == r9) goto L_0x0222
            r1 = 99
            if (r0 == r2) goto L_0x01ff
            com.cardinalcommerce.a.setScrollX r13 = cleanup(r13)
            int r0 = getInstance
            int r0 = r0 + 125
            int r2 = r0 % 128
            Cardinal = r2
            int r0 = r0 % r6
            if (r0 == 0) goto L_0x01f4
            r1 = 8
        L_0x01f4:
            r0 = 8
            if (r1 == r0) goto L_0x01f9
            return r13
        L_0x01f9:
            super.hashCode()     // Catch:{ all -> 0x01fd }
            throw r12     // Catch:{ all -> 0x01fd }
        L_0x01fd:
            r13 = move-exception
            throw r13
        L_0x01ff:
            com.cardinalcommerce.a.setScrollX r13 = Cardinal(r13)
            int r0 = getInstance
            r2 = r0 & 99
            r0 = r0 ^ r1
            r0 = r0 | r2
            int r0 = -r0
            int r0 = -r0
            r1 = r2 & r0
            r0 = r0 | r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            Cardinal = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L_0x0218
            r0 = r7
            goto L_0x0219
        L_0x0218:
            r0 = r5
        L_0x0219:
            if (r0 == r7) goto L_0x021c
            return r13
        L_0x021c:
            r0 = 63
            int r0 = r0 / r5
            return r13
        L_0x0220:
            r13 = move-exception
            throw r13
        L_0x0222:
            com.cardinalcommerce.a.setScrollX r13 = cca_continue(r13)
            int r0 = getInstance
            r1 = r0 ^ 7
            r2 = r0 & 7
            r1 = r1 | r2
            int r1 = r1 << r7
            r2 = r0 & -8
            int r0 = ~r0
            r3 = 7
            r0 = r0 & r3
            r0 = r0 | r2
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r7
            int r0 = r1 % 128
            Cardinal = r0
            int r1 = r1 % r6
            return r13
        L_0x023e:
            com.cardinalcommerce.a.setScrollX r13 = init((com.cardinalcommerce.a.setTransitionVisibility) r13)
            int r0 = Cardinal
            int r0 = r0 + 40
            int r0 = r0 - r7
            int r1 = r0 % 128
            getInstance = r1
            int r0 = r0 % r6
            r1 = 14
            if (r0 != 0) goto L_0x0253
            r0 = 37
            goto L_0x0254
        L_0x0253:
            r0 = r1
        L_0x0254:
            if (r0 == r1) goto L_0x025c
            r0 = 50
            int r0 = r0 / r5
            return r13
        L_0x025a:
            r13 = move-exception
            throw r13
        L_0x025c:
            return r13
        L_0x025d:
            com.cardinalcommerce.a.setScrollX r13 = getInstance((com.cardinalcommerce.a.setTransitionVisibility) r13)
            int r0 = Cardinal
            r1 = r0 | 23
            int r2 = r1 << 1
            r0 = r0 & 23
            int r0 = ~r0
            r0 = r0 & r1
            int r2 = r2 - r0
            int r0 = r2 % 128
            getInstance = r0
            int r2 = r2 % r6
            if (r2 != 0) goto L_0x0274
            r5 = r7
        L_0x0274:
            if (r5 != 0) goto L_0x0277
            return r13
        L_0x0277:
            super.hashCode()     // Catch:{ all -> 0x027b }
            throw r12     // Catch:{ all -> 0x027b }
        L_0x027b:
            r13 = move-exception
            throw r13
        L_0x027d:
            com.cardinalcommerce.a.setScrollX r13 = onValidated(r13)
            int r0 = Cardinal
            r1 = r0 | 84
            int r1 = r1 << r7
            r0 = r0 ^ r3
            int r1 = r1 - r0
            r0 = r1 ^ -1
            r1 = r1 & r4
            int r1 = r1 << r7
            int r0 = r0 + r1
            int r1 = r0 % 128
            getInstance = r1
            int r0 = r0 % r6
            return r13
        L_0x0293:
            r13 = move-exception
            throw r13
        L_0x0295:
            java.lang.String r13 = "AcsUiType"
            r1.Cardinal(r13)
            int r13 = getInstance
            r0 = r13 ^ 33
            r13 = r13 & r8
            int r13 = r13 << r7
            int r13 = -r13
            int r13 = -r13
            r2 = r0 & r13
            r13 = r13 | r0
            int r2 = r2 + r13
            int r13 = r2 % 128
            Cardinal = r13
            int r2 = r2 % r6
            if (r2 == 0) goto L_0x02af
            r13 = r5
            goto L_0x02b0
        L_0x02af:
            r13 = r7
        L_0x02b0:
            if (r13 == r7) goto L_0x02b6
            int r4 = r4 / r5
            return r1
        L_0x02b4:
            r13 = move-exception
            throw r13
        L_0x02b6:
            return r1
        L_0x02b7:
            com.cardinalcommerce.a.setScrollX r13 = cleanup(r13)
            int r0 = getInstance
            r1 = r0 & 59
            r0 = r0 | 59
            int r1 = r1 + r0
            int r0 = r1 % 128
            Cardinal = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L_0x02ca
            r5 = r7
        L_0x02ca:
            if (r5 != 0) goto L_0x02cd
            return r13
        L_0x02cd:
            super.hashCode()     // Catch:{ all -> 0x02d1 }
            throw r12     // Catch:{ all -> 0x02d1 }
        L_0x02d1:
            r13 = move-exception
            throw r13
        L_0x02d3:
            java.lang.String r13 = r13.onCReqSuccess()
            r13.equalsIgnoreCase(r11)
            super.hashCode()     // Catch:{ all -> 0x02de }
            throw r12     // Catch:{ all -> 0x02de }
        L_0x02de:
            r13 = move-exception
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setHapticFeedbackEnabled.configure(com.cardinalcommerce.a.setTransitionVisibility):com.cardinalcommerce.a.setScrollX");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if ((!com.cardinalcommerce.a.setScrollbarFadingEnabled.cca_continue(r6.onValidated()) ? (char) 24 : 3) != 3) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if ((com.cardinalcommerce.a.setScrollbarFadingEnabled.cca_continue(r6.onValidated())) != false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.cardinalcommerce.a.setScrollX Cardinal(com.cardinalcommerce.a.setTransitionVisibility r6) {
        /*
            int r0 = Cardinal
            r1 = r0 ^ 55
            r0 = r0 & 55
            r2 = 1
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            getInstance = r0
            int r1 = r1 % 2
            r0 = 39
            if (r1 != 0) goto L_0x0015
            r1 = r0
            goto L_0x0017
        L_0x0015:
            r1 = 18
        L_0x0017:
            r3 = 0
            if (r1 == r0) goto L_0x0030
            com.cardinalcommerce.a.setScrollX r0 = cleanup(r6)
            java.lang.String r1 = r6.onValidated()
            boolean r1 = com.cardinalcommerce.a.setScrollbarFadingEnabled.cca_continue(r1)
            r4 = 3
            if (r1 != 0) goto L_0x002c
            r1 = 24
            goto L_0x002d
        L_0x002c:
            r1 = r4
        L_0x002d:
            if (r1 == r4) goto L_0x006d
            goto L_0x0047
        L_0x0030:
            com.cardinalcommerce.a.setScrollX r0 = cleanup(r6)
            java.lang.String r1 = r6.onValidated()
            boolean r1 = com.cardinalcommerce.a.setScrollbarFadingEnabled.cca_continue(r1)
            r4 = 88
            int r4 = r4 / r3
            if (r1 != 0) goto L_0x0043
            r1 = r3
            goto L_0x0044
        L_0x0043:
            r1 = r2
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            goto L_0x006d
        L_0x0047:
            int r1 = getInstance
            r4 = r1 ^ 93
            r1 = r1 & 93
            int r1 = r1 << r2
            int r1 = -r1
            int r1 = -r1
            r5 = r4 | r1
            int r5 = r5 << r2
            r1 = r1 ^ r4
            int r5 = r5 - r1
            int r1 = r5 % 128
            Cardinal = r1
            int r5 = r5 % 2
            java.lang.String r1 = "ChallengeInfoText"
            r0.getInstance(r3, r1)
            int r1 = getInstance
            r4 = r1 & 17
            r1 = r1 | 17
            int r4 = r4 + r1
            int r1 = r4 % 128
            Cardinal = r1
            int r4 = r4 % 2
        L_0x006d:
            java.lang.String r1 = r6.setRequestTimeout()
            boolean r1 = com.cardinalcommerce.a.setScrollbarFadingEnabled.cca_continue(r1)
            if (r1 != 0) goto L_0x0079
            r1 = r3
            goto L_0x007a
        L_0x0079:
            r1 = r2
        L_0x007a:
            if (r1 == r2) goto L_0x00a3
            int r1 = getInstance
            r4 = r1 | 23
            int r4 = r4 << r2
            r1 = r1 ^ 23
            int r4 = r4 - r1
            int r1 = r4 % 128
            Cardinal = r1
            int r4 = r4 % 2
            java.lang.String r1 = "SubmitAuthenticationLabel"
            r0.getInstance(r3, r1)
            int r1 = Cardinal
            r4 = r1 ^ 7
            r1 = r1 & 7
            int r1 = r1 << r2
            int r1 = -r1
            int r1 = -r1
            r5 = r4 | r1
            int r5 = r5 << r2
            r1 = r1 ^ r4
            int r5 = r5 - r1
            int r1 = r5 % 128
            getInstance = r1
            int r5 = r5 % 2
        L_0x00a3:
            java.util.ArrayList r6 = r6.valueOf()
            int r6 = r6.size()
            r1 = 65
            r4 = 87
            if (r6 > 0) goto L_0x00b3
            r6 = r1
            goto L_0x00b4
        L_0x00b3:
            r6 = r4
        L_0x00b4:
            if (r6 == r4) goto L_0x00d9
            int r6 = Cardinal
            r4 = r6 & 65
            int r5 = ~r4
            r6 = r6 | r1
            r6 = r6 & r5
            int r1 = r4 << 1
            r4 = r6 & r1
            r6 = r6 | r1
            int r4 = r4 + r6
            int r6 = r4 % 128
            getInstance = r6
            int r4 = r4 % 2
            java.lang.String r6 = "ChallengeSelectInfo"
            r0.getInstance(r3, r6)
            int r6 = Cardinal
            int r6 = r6 + 88
            int r6 = r6 - r2
            int r1 = r6 % 128
            getInstance = r1
            int r6 = r6 % 2
        L_0x00d9:
            int r6 = Cardinal
            r1 = r6 ^ 51
            r4 = r6 & 51
            r1 = r1 | r4
            int r1 = r1 << r2
            int r4 = ~r4
            r6 = r6 | 51
            r6 = r6 & r4
            int r6 = -r6
            int r6 = ~r6
            int r1 = r1 - r6
            int r1 = r1 - r2
            int r6 = r1 % 128
            getInstance = r6
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x00f2
            r3 = r2
        L_0x00f2:
            if (r3 == r2) goto L_0x00f5
            return r0
        L_0x00f5:
            r6 = 0
            super.hashCode()     // Catch:{ all -> 0x00fa }
            throw r6     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r6 = move-exception
            throw r6
        L_0x00fc:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setHapticFeedbackEnabled.Cardinal(com.cardinalcommerce.a.setTransitionVisibility):com.cardinalcommerce.a.setScrollX");
    }

    private static setScrollX cca_continue(setTransitionVisibility settransitionvisibility) {
        int i = getInstance + 15;
        Cardinal = i % 128;
        int i2 = i % 2;
        setScrollX cleanup = cleanup(settransitionvisibility);
        if (!setScrollbarFadingEnabled.cca_continue(settransitionvisibility.onValidated()) ? true : true) {
            int i3 = Cardinal;
            int i4 = i3 & 23;
            int i5 = (i4 - (~((i3 ^ 23) | i4))) - 1;
            getInstance = i5 % 128;
            if (!(i5 % 2 == 0)) {
                cleanup.getInstance(false, "ChallengeInfoText");
            } else {
                cleanup.getInstance(true, "ChallengeInfoText");
            }
            int i6 = getInstance;
            int i7 = ((i6 ^ 45) | (i6 & 45)) << 1;
            int i8 = -(((~i6) & 45) | (i6 & -46));
            int i9 = (i7 & i8) + (i8 | i7);
            Cardinal = i9 % 128;
            int i10 = i9 % 2;
        }
        if ((!setScrollbarFadingEnabled.init(settransitionvisibility.CardinalActionCode()) ? '^' : 28) == '^') {
            int i11 = Cardinal;
            int i12 = i11 & 123;
            int i13 = -(-((i11 ^ 123) | i12));
            int i14 = (i12 & i13) + (i13 | i12);
            getInstance = i14 % 128;
            int i15 = i14 % 2;
            cleanup.getInstance(false, "OobContinueLabel");
            int i16 = Cardinal;
            int i17 = (i16 & 67) + (i16 | 67);
            getInstance = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = Cardinal;
        int i20 = i19 & 79;
        int i21 = ((i19 ^ 79) | i20) << 1;
        int i22 = -((i19 | 79) & (~i20));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        getInstance = i23 % 128;
        if ((i23 % 2 == 0 ? '/' : 2) == 2) {
            return cleanup;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private static setScrollX init(setTransitionVisibility settransitionvisibility) {
        int i = Cardinal;
        int i2 = i & 101;
        int i3 = (i ^ 101) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getInstance = i4 % 128;
        int i5 = i4 % 2;
        setScrollX cleanup = cleanup(settransitionvisibility);
        if ((!setScrollbarFadingEnabled.cca_continue(settransitionvisibility.onValidated()) ? ';' : '1') == ';') {
            int i6 = getInstance;
            int i7 = ((i6 & -54) | ((~i6) & 53)) + ((i6 & 53) << 1);
            Cardinal = i7 % 128;
            if (i7 % 2 != 0) {
            }
            cleanup.getInstance(false, "ChallengeInfoText");
            int i8 = getInstance;
            int i9 = (i8 & 24) + (i8 | 24);
            int i10 = (i9 ^ -1) + ((i9 & -1) << 1);
            Cardinal = i10 % 128;
            int i11 = i10 % 2;
        }
        if (!setScrollbarFadingEnabled.cca_continue(settransitionvisibility.setRequestTimeout())) {
            int i12 = Cardinal;
            int i13 = (i12 & 17) + (i12 | 17);
            getInstance = i13 % 128;
            int i14 = i13 % 2;
            cleanup.getInstance(false, "SubmitAuthenticationLabel");
            int i15 = getInstance;
            int i16 = (i15 ^ 47) + ((i15 & 47) << 1);
            Cardinal = i16 % 128;
            int i17 = i16 % 2;
        }
        if (settransitionvisibility.valueOf().size() <= 0) {
            int i18 = getInstance;
            int i19 = ((i18 | 15) << 1) - (i18 ^ 15);
            Cardinal = i19 % 128;
            int i20 = i19 % 2;
            cleanup.getInstance(false, "ChallengeSelectInfo");
            int i21 = getInstance;
            int i22 = i21 & 111;
            int i23 = (i21 | 111) & (~i22);
            int i24 = -(-(i22 << 1));
            int i25 = (i23 & i24) + (i23 | i24);
            Cardinal = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = Cardinal;
        int i28 = i27 & 123;
        int i29 = (i28 - (~((i27 ^ 123) | i28))) - 1;
        getInstance = i29 % 128;
        int i30 = i29 % 2;
        return cleanup;
    }

    private static setScrollX getInstance(setTransitionVisibility settransitionvisibility) {
        int i = Cardinal;
        int i2 = i & 83;
        int i3 = (i2 - (~(-(-((i ^ 83) | i2))))) - 1;
        getInstance = i3 % 128;
        int i4 = i3 % 2;
        setScrollX cleanup = cleanup(settransitionvisibility);
        boolean z = false;
        if ((!setScrollbarFadingEnabled.cca_continue(settransitionvisibility.setRequestTimeout()) ? '>' : 'T') == '>') {
            int i5 = getInstance;
            int i6 = (i5 & -18) | ((~i5) & 17);
            int i7 = -(-((i5 & 17) << 1));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            Cardinal = i8 % 128;
            int i9 = i8 % 2;
            cleanup.getInstance(false, "SubmitAuthenticationLabel");
            int i10 = Cardinal;
            int i11 = ((i10 ^ 37) | (i10 & 37)) << 1;
            int i12 = -(((~i10) & 37) | (i10 & -38));
            int i13 = (i11 & i12) + (i12 | i11);
            getInstance = i13 % 128;
            int i14 = i13 % 2;
        }
        if (!(setScrollbarFadingEnabled.cca_continue(settransitionvisibility.onValidated()))) {
            int i15 = Cardinal;
            int i16 = (i15 & 21) + (i15 | 21);
            getInstance = i16 % 128;
            int i17 = i16 % 2;
            cleanup.getInstance(false, "ChallengeInfoText");
            int i18 = getInstance;
            int i19 = ((i18 ^ 31) | (i18 & 31)) << 1;
            int i20 = -(((~i18) & 31) | (i18 & -32));
            int i21 = (i19 & i20) + (i20 | i19);
            Cardinal = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = Cardinal;
        int i24 = i23 ^ 109;
        int i25 = -(-((i23 & 109) << 1));
        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
        getInstance = i26 % 128;
        if (i26 % 2 == 0) {
            z = true;
        }
        if (!z) {
            return cleanup;
        }
        throw null;
    }

    private static setScrollX onValidated(setTransitionVisibility settransitionvisibility) {
        int i = getInstance;
        int i2 = (i | 107) << 1;
        int i3 = -(i ^ 107);
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        Cardinal = i4 % 128;
        char c = i4 % 2 != 0 ? '\\' : '4';
        Throwable th = null;
        if (c == '4') {
            setScrollX cleanup = cleanup(settransitionvisibility);
            if (!(setScrollbarFadingEnabled.init(settransitionvisibility.cca_continue()))) {
                int i5 = getInstance;
                int i6 = ((i5 ^ 58) + ((i5 & 58) << 1)) - 1;
                Cardinal = i6 % 128;
                if (i6 % 2 != 0) {
                }
                cleanup.cca_continue(false);
                cleanup.Cardinal("AcsHTML");
            }
            int i7 = Cardinal;
            int i8 = i7 & 5;
            int i9 = (i8 - (~((i7 ^ 5) | i8))) - 1;
            getInstance = i9 % 128;
            if ((i9 % 2 == 0 ? '@' : 17) == 17) {
                return cleanup;
            }
            throw th;
        }
        cleanup(settransitionvisibility);
        setScrollbarFadingEnabled.init(settransitionvisibility.cca_continue());
        super.hashCode();
        throw th;
    }

    private static setScrollX cleanup(setTransitionVisibility settransitionvisibility) {
        setScrollX setscrollx = new setScrollX();
        if (!setScrollbarFadingEnabled.init(settransitionvisibility.init())) {
            int i = getInstance;
            int i2 = (i & 107) + (i | 107);
            Cardinal = i2 % 128;
            if (!(i2 % 2 != 0)) {
                setscrollx.getInstance(false, "ThreeDSServerTransID");
            } else {
                setscrollx.getInstance(true, "ThreeDSServerTransID");
            }
        }
        char c = 19;
        if (!(!setScrollbarFadingEnabled.init(settransitionvisibility.setProxyAddress()) ? true : true)) {
            int i3 = ((Cardinal + 91) - 1) - 1;
            getInstance = i3 % 128;
            if (!(i3 % 2 != 0)) {
                setscrollx.getInstance(true, "AcsCounterAtoS");
            } else {
                setscrollx.getInstance(false, "AcsCounterAtoS");
            }
        }
        if (!(setScrollbarFadingEnabled.init(settransitionvisibility.Cardinal()))) {
            int i4 = Cardinal;
            int i5 = i4 & 121;
            int i6 = (i4 | 121) & (~i5);
            int i7 = i5 << 1;
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            getInstance = i8 % 128;
            if (i8 % 2 != 0) {
                c = 'B';
            }
            if (c != 'B') {
                setscrollx.getInstance(true, "AcsTransID");
            } else {
                setscrollx.getInstance(false, "AcsTransID");
            }
            int i9 = (getInstance + 77) - 1;
            int i10 = (i9 ^ -1) + ((i9 & -1) << 1);
            Cardinal = i10 % 128;
            int i11 = i10 % 2;
        }
        if (setScrollbarFadingEnabled.init(settransitionvisibility.onCReqSuccess())) {
            if (settransitionvisibility.onCReqSuccess().equals("Y")) {
                int i12 = getInstance;
                int i13 = (i12 & 51) + (i12 | 51);
                Cardinal = i13 % 128;
                int i14 = i13 % 2;
                if (!(setScrollbarFadingEnabled.Cardinal(settransitionvisibility.CardinalConfigurationParameters(), 1))) {
                    int i15 = getInstance;
                    int i16 = i15 | 23;
                    int i17 = i16 << 1;
                    int i18 = -((~(i15 & 23)) & i16);
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    Cardinal = i19 % 128;
                    if (i19 % 2 != 0) {
                    }
                    setscrollx.getInstance(false, "TransStatus");
                }
            }
        } else {
            int i20 = Cardinal;
            int i21 = (i20 ^ 67) + ((i20 & 67) << 1);
            getInstance = i21 % 128;
            if (i21 % 2 == 0) {
            }
            setscrollx.getInstance(false, "ChallengeCompletionInd");
            int i22 = getInstance;
            int i23 = i22 & 45;
            int i24 = (i22 ^ 45) | i23;
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            Cardinal = i25 % 128;
            int i26 = i25 % 2;
        }
        if (!setScrollbarFadingEnabled.init(settransitionvisibility.CardinalChallengeObserver())) {
            int i27 = (Cardinal + 44) - 1;
            getInstance = i27 % 128;
            int i28 = i27 % 2;
            setscrollx.getInstance(false, "MessageVersion");
            int i29 = Cardinal;
            int i30 = i29 | 79;
            int i31 = (i30 << 1) - ((~(i29 & 79)) & i30);
            getInstance = i31 % 128;
            int i32 = i31 % 2;
        }
        if (!setScrollbarFadingEnabled.init(settransitionvisibility.setChallengeTimeout())) {
            int i33 = Cardinal;
            int i34 = ((i33 ^ 95) | (i33 & 95)) << 1;
            int i35 = -(((~i33) & 95) | (i33 & -96));
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            getInstance = i36 % 128;
            int i37 = i36 % 2;
            setscrollx.getInstance(false, "SdkTransID");
            int i38 = getInstance;
            int i39 = ((i38 | 49) << 1) - (i38 ^ 49);
            Cardinal = i39 % 128;
            int i40 = i39 % 2;
        }
        int i41 = Cardinal;
        int i42 = i41 & 121;
        int i43 = -(-((i41 ^ 121) | i42));
        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
        getInstance = i44 % 128;
        int i45 = i44 % 2;
        return setscrollx;
    }

    public setHapticFeedbackEnabled(Context context) {
        this.cca_continue = setWillNotDraw.getInstance();
        this.init = context;
        this.configure = setLayoutParams.getInstance(context);
    }

    public final void cca_continue() {
        new setLayoutDirection(this.init).cca_continue();
        int i = getInstance;
        int i2 = ((i | 39) << 1) - (i ^ 39);
        Cardinal = i2 % 128;
        if (!(i2 % 2 == 0)) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    private String getInstance() {
        int i = Cardinal + 68;
        int i2 = ((i | -1) << 1) - (i ^ -1);
        getInstance = i2 % 128;
        ? r3 = 0;
        if ((i2 % 2 == 0 ? 'G' : 'I') != 'G') {
            String init2 = this.configure.init("dsConfigurationString", r3);
            int i3 = getInstance;
            int i4 = (i3 ^ 6) + ((i3 & 6) << 1);
            int i5 = ((i4 | -1) << 1) - (i4 ^ -1);
            Cardinal = i5 % 128;
            int i6 = i5 % 2;
            return init2;
        }
        this.configure.init("dsConfigurationString", r3);
        super.hashCode();
        throw r3;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, com.cardinalcommerce.a.setWillNotCacheDrawing, java.lang.Object] */
    public final setWillNotCacheDrawing getInstance(String str) {
        setPressed setpressed;
        setFilterTouchesWhenObscured setfiltertoucheswhenobscured;
        int i;
        ? r1 = 0;
        boolean z = true;
        try {
            JSONObject jSONObject = new JSONObject(getInstance()).getJSONObject("dsConfigurations").getJSONObject("directoryServers").getJSONObject(str);
            if ((jSONObject != null ? 1 : '5') != 1) {
                int i2 = getInstance;
                int i3 = ((i2 | 43) << 1) - (i2 ^ 43);
                Cardinal = i3 % 128;
                int i4 = i3 % 2;
                int i5 = getInstance;
                int i6 = (i5 ^ 97) + ((i5 & 97) << 1);
                Cardinal = i6 % 128;
                int i7 = i6 % 2;
                return r1;
            }
            int i8 = Cardinal;
            int i9 = ((i8 | 19) << 1) - (i8 ^ 19);
            getInstance = i9 % 128;
            if (!(i9 % 2 == 0)) {
                String string = jSONObject.getString(SDKConstants.PARAM_KEY);
                if ((jSONObject.getString("type").equals("KEY") ? 5 : '%') != '%') {
                    int i10 = getInstance;
                    int i11 = i10 & 123;
                    int i12 = (((i10 | 123) & (~i11)) - (~(i11 << 1))) - 1;
                    Cardinal = i12 % 128;
                    if (!(i12 % 2 != 0)) {
                        setpressed = setPressed.KEY;
                        int i13 = getInstance;
                        int i14 = (i13 ^ 65) + ((i13 & 65) << 1);
                        Cardinal = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        setPressed setpressed2 = setPressed.KEY;
                        super.hashCode();
                        throw r1;
                    }
                } else {
                    setpressed = setPressed.CERTIFICATE;
                    int i16 = Cardinal + 11;
                    getInstance = i16 % 128;
                    int i17 = i16 % 2;
                }
                if ((jSONObject.getString("algorithm").equals("RSA") ? 'B' : 4) != 'B') {
                    setfiltertoucheswhenobscured = setFilterTouchesWhenObscured.EC;
                    int i18 = getInstance;
                    i = ((i18 ^ 10) + ((i18 & 10) << 1)) - 1;
                } else {
                    int i19 = getInstance;
                    int i20 = i19 ^ 33;
                    int i21 = ((((i19 & 33) | i20) << 1) - (~(-i20))) - 1;
                    Cardinal = i21 % 128;
                    if (!(i21 % 2 != 0)) {
                        setfiltertoucheswhenobscured = setFilterTouchesWhenObscured.RSA;
                        int i22 = getInstance;
                        i = (i22 ^ 29) + ((i22 & 29) << 1);
                    } else {
                        setFilterTouchesWhenObscured setfiltertoucheswhenobscured2 = setFilterTouchesWhenObscured.RSA;
                        super.hashCode();
                        throw r1;
                    }
                }
                Cardinal = i % 128;
                int i23 = i % 2;
                setWillNotCacheDrawing setwillnotcachedrawing = new setWillNotCacheDrawing(string, setfiltertoucheswhenobscured, setpressed);
                int i24 = getInstance;
                int i25 = ((i24 | 94) << 1) - (i24 ^ 94);
                int i26 = ((i25 | -1) << 1) - (i25 ^ -1);
                Cardinal = i26 % 128;
                if (i26 % 2 != 0) {
                    z = false;
                }
                if (z) {
                    return setwillnotcachedrawing;
                }
                int i27 = 96 / 0;
                return setwillnotcachedrawing;
            }
            jSONObject.getString(SDKConstants.PARAM_KEY);
            jSONObject.getString("type").equals("KEY");
            throw r1;
        } catch (JSONException e) {
            this.cca_continue.cca_continue("11406", new StringBuilder(EMVCoError.DO_CHALLENGE_PROGRESS_SCREEN_IMAGE_ERROR_MESSAGE).append(e.getLocalizedMessage()).toString());
        }
    }

    public final String configure(String str) {
        try {
            JSONObject jSONObject = new JSONObject(getInstance()).getJSONObject("dsConfigurations").getJSONObject("directoryServers").getJSONObject(str);
            if ((jSONObject != null ? '8' : 19) != 19) {
                int i = getInstance;
                int i2 = (((i & 20) + (i | 20)) + 0) - 1;
                Cardinal = i2 % 128;
                int i3 = i2 % 2;
                String string = jSONObject.getString("rootCertificate");
                if (string != null) {
                    String obj = new StringBuilder("-----BEGIN CERTIFICATE-----\n").append(string).append("\n-----END CERTIFICATE-----").toString();
                    int i4 = getInstance;
                    int i5 = (i4 ^ 125) + ((i4 & 125) << 1);
                    Cardinal = i5 % 128;
                    int i6 = i5 % 2;
                    return obj;
                }
            }
            int i7 = Cardinal + 113;
            getInstance = i7 % 128;
            int i8 = i7 % 2;
        } catch (JSONException e) {
            this.cca_continue.cca_continue("11406", new StringBuilder(EMVCoError.DO_CHALLENGE_PROGRESS_SCREEN_IMAGE_ERROR_MESSAGE).append(e.getLocalizedMessage()).toString());
        }
        int i9 = getInstance;
        int i10 = ((i9 & -44) | ((~i9) & 43)) + ((i9 & 43) << 1);
        Cardinal = i10 % 128;
        if ((i10 % 2 != 0 ? '[' : '^') != '[') {
            return null;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if ((!r0.isEmpty()) != true) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if ((!r0.isEmpty() ? '.' : 'Y') != '.') goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        r1 = Cardinal;
        r4 = r1 & 33;
        r3 = (((r1 ^ 33) | r4) << 1) - ((r1 | 33) & (~r4));
        getInstance = r3 % 128;
        r3 = r3 % 2;
        r7 = r0.contains(r7);
        r0 = (getInstance + 118) - 1;
        Cardinal = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        if ((r0 % 2) == 0) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (r5 == true) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean init(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = Cardinal
            r1 = r0 ^ 123(0x7b, float:1.72E-43)
            r2 = r0 & 123(0x7b, float:1.72E-43)
            r1 = r1 | r2
            r2 = 1
            int r1 = r1 << r2
            r3 = r0 & -124(0xffffffffffffff84, float:NaN)
            int r0 = ~r0
            r0 = r0 & 123(0x7b, float:1.72E-43)
            r0 = r0 | r3
            int r1 = r1 - r0
            int r0 = r1 % 128
            getInstance = r0
            int r1 = r1 % 2
            r0 = 41
            if (r1 != 0) goto L_0x001d
            r1 = 50
            goto L_0x001e
        L_0x001d:
            r1 = r0
        L_0x001e:
            java.lang.String r3 = ""
            java.lang.String r4 = "dsConfigurationString"
            r5 = 0
            if (r1 == r0) goto L_0x003c
            com.cardinalcommerce.a.setLayoutParams r0 = r6.configure
            java.lang.String r0 = r0.init(r4, r3)
            boolean r1 = r0.isEmpty()
            r3 = 48
            int r3 = r3 / r5
            if (r1 != 0) goto L_0x0036
            r1 = r2
            goto L_0x0037
        L_0x0036:
            r1 = r5
        L_0x0037:
            if (r1 == r2) goto L_0x006b
            goto L_0x0050
        L_0x003a:
            r7 = move-exception
            throw r7
        L_0x003c:
            com.cardinalcommerce.a.setLayoutParams r0 = r6.configure
            java.lang.String r0 = r0.init(r4, r3)
            boolean r1 = r0.isEmpty()
            r3 = 46
            if (r1 != 0) goto L_0x004c
            r1 = r3
            goto L_0x004e
        L_0x004c:
            r1 = 89
        L_0x004e:
            if (r1 == r3) goto L_0x006b
        L_0x0050:
            int r7 = getInstance
            r0 = r7 ^ 21
            r1 = r7 & 21
            r0 = r0 | r1
            int r0 = r0 << r2
            r1 = r7 & -22
            int r7 = ~r7
            r2 = 21
            r7 = r7 & r2
            r7 = r7 | r1
            int r7 = -r7
            r1 = r0 & r7
            r7 = r7 | r0
            int r1 = r1 + r7
            int r7 = r1 % 128
            Cardinal = r7
            int r1 = r1 % 2
            return r5
        L_0x006b:
            int r1 = Cardinal
            r3 = r1 ^ 33
            r4 = r1 & 33
            r3 = r3 | r4
            int r3 = r3 << r2
            int r4 = ~r4
            r1 = r1 | 33
            r1 = r1 & r4
            int r3 = r3 - r1
            int r1 = r3 % 128
            getInstance = r1
            int r3 = r3 % 2
            boolean r7 = r0.contains(r7)
            int r0 = getInstance
            int r0 = r0 + 118
            int r0 = r0 - r2
            int r1 = r0 % 128
            Cardinal = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0090
            r5 = r2
        L_0x0090:
            if (r5 == r2) goto L_0x0093
            return r7
        L_0x0093:
            r7 = 0
            throw r7     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setHapticFeedbackEnabled.init(java.lang.String):boolean");
    }
}
