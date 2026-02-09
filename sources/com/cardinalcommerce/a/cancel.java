package com.cardinalcommerce.a;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.text.Typography;
import okio.internal.BufferKt;

abstract class cancel {
    protected static boolean[] Cardinal;
    private static boolean[] CardinalError;
    private static boolean[] CardinalRenderType;
    private static boolean[] valueOf;
    private static boolean[] values;
    private boolean CardinalActionCode;
    private boolean CardinalChallengeObserver;
    private Object CardinalEnvironment;
    private boolean CardinalUiType;
    protected final init cca_continue = new init();
    protected final boolean cleanup;
    protected String configure;
    private boolean getActionCode;
    private boolean getChallengeTimeout;
    setFadingEdgeLength getInstance;
    private String getSDKVersion;
    private boolean getString;
    protected final boolean getWarnings;
    protected char init;
    protected final boolean onCReqSuccess;
    protected int onValidated;
    private boolean setChallengeTimeout;
    private boolean setRequestTimeout;

    /* access modifiers changed from: protected */
    public abstract Object cca_continue(boolean[] zArr) throws getToolbarCustomization, IOException;

    /* access modifiers changed from: protected */
    public abstract void cca_continue() throws getToolbarCustomization, IOException;

    /* access modifiers changed from: protected */
    public abstract void configure(boolean[] zArr) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void getInstance() throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void onCReqSuccess() throws IOException;

    /* access modifiers changed from: protected */
    public abstract void onValidated() throws getToolbarCustomization, IOException;

    static {
        boolean[] zArr = new boolean[126];
        Cardinal = zArr;
        boolean[] zArr2 = new boolean[126];
        values = zArr2;
        boolean[] zArr3 = new boolean[126];
        valueOf = zArr3;
        boolean[] zArr4 = new boolean[126];
        CardinalError = zArr4;
        boolean[] zArr5 = new boolean[126];
        CardinalRenderType = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public cancel(int i) {
        boolean z = false;
        this.getString = (i & 4) > 0;
        this.onCReqSuccess = (i & 2) > 0;
        this.cleanup = (i & 1) > 0;
        this.CardinalActionCode = (i & 8) > 0;
        this.setRequestTimeout = (i & 16) > 0;
        this.getWarnings = (i & 32) > 0;
        this.CardinalUiType = (i & 64) > 0;
        this.setChallengeTimeout = (i & 128) > 0;
        this.getActionCode = (i & 768) != 768;
        this.CardinalChallengeObserver = (i & 512) == 0;
        this.getChallengeTimeout = (i & 1024) > 0 ? true : z;
    }

    public final void init() throws getToolbarCustomization {
        if (!this.CardinalActionCode) {
            int length = this.configure.length();
            for (int i = 0; i < length; i++) {
                char charAt = this.configure.charAt(i);
                if (charAt >= 0) {
                    if (charAt <= 31) {
                        throw new getToolbarCustomization(this.onValidated + i, 0, Character.valueOf(charAt));
                    } else if (charAt == 127 && this.getChallengeTimeout) {
                        throw new getToolbarCustomization(this.onValidated + i, 0, Character.valueOf(charAt));
                    }
                }
            }
        }
    }

    public final void Cardinal() throws getToolbarCustomization {
        int length = this.configure.length();
        if (length != 1) {
            if (length != 2) {
                char charAt = this.configure.charAt(0);
                char charAt2 = this.configure.charAt(1);
                if (charAt == '-') {
                    char charAt3 = this.configure.charAt(2);
                    if (charAt2 == '0' && charAt3 >= '0' && charAt3 <= '9') {
                        throw new getToolbarCustomization(this.onValidated, 6, this.configure);
                    }
                } else if (charAt == '0' && charAt2 >= '0' && charAt2 <= '9') {
                    throw new getToolbarCustomization(this.onValidated, 6, this.configure);
                }
            } else if (this.configure.equals("00")) {
                throw new getToolbarCustomization(this.onValidated, 6, this.configure);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Number configure() throws getToolbarCustomization {
        if (!this.getWarnings) {
            Cardinal();
        }
        if (!this.setChallengeTimeout) {
            return Float.valueOf(Float.parseFloat(this.configure));
        }
        if (this.configure.length() > 18) {
            return new BigDecimal(this.configure);
        }
        return Double.valueOf(Double.parseDouble(this.configure));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c2, code lost:
        throw new com.cardinalcommerce.a.getToolbarCustomization(r5.onValidated, 0, java.lang.Character.valueOf(r5.init));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
        r0 = cca_continue(CardinalRenderType);
        r5.CardinalEnvironment = r0;
        r6 = r6.init(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T Cardinal(com.cardinalcommerce.a.setVerticalScrollbarThumbDrawable<T> r6) throws com.cardinalcommerce.a.getToolbarCustomization {
        /*
            r5 = this;
            r0 = -1
            r5.onValidated = r0
            r5.getInstance()     // Catch:{ IOException -> 0x0150 }
        L_0x0006:
            char r0 = r5.init     // Catch:{ IOException -> 0x0150 }
            r1 = 9
            if (r0 == r1) goto L_0x014b
            r1 = 10
            if (r0 == r1) goto L_0x014b
            r1 = 0
            r2 = 1
            switch(r0) {
                case 13: goto L_0x014b;
                case 32: goto L_0x014b;
                case 34: goto L_0x0112;
                case 39: goto L_0x0112;
                case 45: goto L_0x0105;
                case 78: goto L_0x00c8;
                case 91: goto L_0x00c3;
                case 93: goto L_0x00b4;
                case 102: goto L_0x0088;
                case 110: goto L_0x0060;
                case 116: goto L_0x0033;
                case 123: goto L_0x002d;
                case 125: goto L_0x00b4;
                default: goto L_0x0015;
            }     // Catch:{ IOException -> 0x0150 }
        L_0x0015:
            switch(r0) {
                case 48: goto L_0x0105;
                case 49: goto L_0x0105;
                case 50: goto L_0x0105;
                case 51: goto L_0x0105;
                case 52: goto L_0x0105;
                case 53: goto L_0x0105;
                case 54: goto L_0x0105;
                case 55: goto L_0x0105;
                case 56: goto L_0x0105;
                case 57: goto L_0x0105;
                case 58: goto L_0x00b4;
                default: goto L_0x0018;
            }     // Catch:{ IOException -> 0x0150 }
        L_0x0018:
            boolean[] r0 = CardinalRenderType     // Catch:{ IOException -> 0x0150 }
            r5.configure((boolean[]) r0)     // Catch:{ IOException -> 0x0150 }
            boolean r0 = r5.onCReqSuccess     // Catch:{ IOException -> 0x0150 }
            if (r0 == 0) goto L_0x0023
            goto L_0x0115
        L_0x0023:
            com.cardinalcommerce.a.getToolbarCustomization r6 = new com.cardinalcommerce.a.getToolbarCustomization     // Catch:{ IOException -> 0x0150 }
            int r0 = r5.onValidated     // Catch:{ IOException -> 0x0150 }
            java.lang.String r1 = r5.configure     // Catch:{ IOException -> 0x0150 }
            r6.<init>(r0, r2, r1)     // Catch:{ IOException -> 0x0150 }
            throw r6     // Catch:{ IOException -> 0x0150 }
        L_0x002d:
            java.lang.Object r6 = r5.cca_continue(r6)     // Catch:{ IOException -> 0x0150 }
            goto L_0x011b
        L_0x0033:
            boolean[] r0 = CardinalRenderType     // Catch:{ IOException -> 0x0150 }
            r5.configure((boolean[]) r0)     // Catch:{ IOException -> 0x0150 }
            java.lang.String r0 = "true"
            java.lang.String r3 = r5.configure     // Catch:{ IOException -> 0x0150 }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0150 }
            if (r0 == 0) goto L_0x004a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r6 = r6.init((java.lang.Object) r0)     // Catch:{ IOException -> 0x0150 }
            goto L_0x011b
        L_0x004a:
            boolean r0 = r5.onCReqSuccess     // Catch:{ IOException -> 0x0150 }
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = r5.configure     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r6 = r6.init((java.lang.Object) r0)     // Catch:{ IOException -> 0x0150 }
            goto L_0x011b
        L_0x0056:
            com.cardinalcommerce.a.getToolbarCustomization r6 = new com.cardinalcommerce.a.getToolbarCustomization     // Catch:{ IOException -> 0x0150 }
            int r0 = r5.onValidated     // Catch:{ IOException -> 0x0150 }
            java.lang.String r1 = r5.configure     // Catch:{ IOException -> 0x0150 }
            r6.<init>(r0, r2, r1)     // Catch:{ IOException -> 0x0150 }
            throw r6     // Catch:{ IOException -> 0x0150 }
        L_0x0060:
            boolean[] r0 = CardinalRenderType     // Catch:{ IOException -> 0x0150 }
            r5.configure((boolean[]) r0)     // Catch:{ IOException -> 0x0150 }
            java.lang.String r0 = "null"
            java.lang.String r3 = r5.configure     // Catch:{ IOException -> 0x0150 }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0150 }
            if (r0 == 0) goto L_0x0072
            r6 = r1
            goto L_0x011b
        L_0x0072:
            boolean r0 = r5.onCReqSuccess     // Catch:{ IOException -> 0x0150 }
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = r5.configure     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r6 = r6.init((java.lang.Object) r0)     // Catch:{ IOException -> 0x0150 }
            goto L_0x011b
        L_0x007e:
            com.cardinalcommerce.a.getToolbarCustomization r6 = new com.cardinalcommerce.a.getToolbarCustomization     // Catch:{ IOException -> 0x0150 }
            int r0 = r5.onValidated     // Catch:{ IOException -> 0x0150 }
            java.lang.String r1 = r5.configure     // Catch:{ IOException -> 0x0150 }
            r6.<init>(r0, r2, r1)     // Catch:{ IOException -> 0x0150 }
            throw r6     // Catch:{ IOException -> 0x0150 }
        L_0x0088:
            boolean[] r0 = CardinalRenderType     // Catch:{ IOException -> 0x0150 }
            r5.configure((boolean[]) r0)     // Catch:{ IOException -> 0x0150 }
            java.lang.String r0 = "false"
            java.lang.String r3 = r5.configure     // Catch:{ IOException -> 0x0150 }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0150 }
            if (r0 == 0) goto L_0x009f
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r6 = r6.init((java.lang.Object) r0)     // Catch:{ IOException -> 0x0150 }
            goto L_0x011b
        L_0x009f:
            boolean r0 = r5.onCReqSuccess     // Catch:{ IOException -> 0x0150 }
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = r5.configure     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r6 = r6.init((java.lang.Object) r0)     // Catch:{ IOException -> 0x0150 }
            goto L_0x011b
        L_0x00aa:
            com.cardinalcommerce.a.getToolbarCustomization r6 = new com.cardinalcommerce.a.getToolbarCustomization     // Catch:{ IOException -> 0x0150 }
            int r0 = r5.onValidated     // Catch:{ IOException -> 0x0150 }
            java.lang.String r1 = r5.configure     // Catch:{ IOException -> 0x0150 }
            r6.<init>(r0, r2, r1)     // Catch:{ IOException -> 0x0150 }
            throw r6     // Catch:{ IOException -> 0x0150 }
        L_0x00b4:
            com.cardinalcommerce.a.getToolbarCustomization r6 = new com.cardinalcommerce.a.getToolbarCustomization     // Catch:{ IOException -> 0x0150 }
            int r0 = r5.onValidated     // Catch:{ IOException -> 0x0150 }
            char r1 = r5.init     // Catch:{ IOException -> 0x0150 }
            java.lang.Character r1 = java.lang.Character.valueOf(r1)     // Catch:{ IOException -> 0x0150 }
            r2 = 0
            r6.<init>(r0, r2, r1)     // Catch:{ IOException -> 0x0150 }
            throw r6     // Catch:{ IOException -> 0x0150 }
        L_0x00c3:
            java.lang.Object r6 = r5.init(r6)     // Catch:{ IOException -> 0x0150 }
            goto L_0x011b
        L_0x00c8:
            boolean[] r0 = CardinalRenderType     // Catch:{ IOException -> 0x0150 }
            r5.configure((boolean[]) r0)     // Catch:{ IOException -> 0x0150 }
            boolean r0 = r5.getString     // Catch:{ IOException -> 0x0150 }
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = "NaN"
            java.lang.String r3 = r5.configure     // Catch:{ IOException -> 0x0150 }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0150 }
            if (r0 == 0) goto L_0x00e6
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r6 = r6.init((java.lang.Object) r0)     // Catch:{ IOException -> 0x0150 }
            goto L_0x011b
        L_0x00e6:
            boolean r0 = r5.onCReqSuccess     // Catch:{ IOException -> 0x0150 }
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = r5.configure     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r6 = r6.init((java.lang.Object) r0)     // Catch:{ IOException -> 0x0150 }
            goto L_0x011b
        L_0x00f1:
            com.cardinalcommerce.a.getToolbarCustomization r6 = new com.cardinalcommerce.a.getToolbarCustomization     // Catch:{ IOException -> 0x0150 }
            int r0 = r5.onValidated     // Catch:{ IOException -> 0x0150 }
            java.lang.String r1 = r5.configure     // Catch:{ IOException -> 0x0150 }
            r6.<init>(r0, r2, r1)     // Catch:{ IOException -> 0x0150 }
            throw r6     // Catch:{ IOException -> 0x0150 }
        L_0x00fb:
            com.cardinalcommerce.a.getToolbarCustomization r6 = new com.cardinalcommerce.a.getToolbarCustomization     // Catch:{ IOException -> 0x0150 }
            int r0 = r5.onValidated     // Catch:{ IOException -> 0x0150 }
            java.lang.String r1 = r5.configure     // Catch:{ IOException -> 0x0150 }
            r6.<init>(r0, r2, r1)     // Catch:{ IOException -> 0x0150 }
            throw r6     // Catch:{ IOException -> 0x0150 }
        L_0x0105:
            boolean[] r0 = CardinalRenderType     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r0 = r5.cca_continue((boolean[]) r0)     // Catch:{ IOException -> 0x0150 }
            r5.CardinalEnvironment = r0     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r6 = r6.init((java.lang.Object) r0)     // Catch:{ IOException -> 0x0150 }
            goto L_0x011b
        L_0x0112:
            r5.onValidated()     // Catch:{ IOException -> 0x0150 }
        L_0x0115:
            java.lang.String r0 = r5.configure     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r6 = r6.init((java.lang.Object) r0)     // Catch:{ IOException -> 0x0150 }
        L_0x011b:
            boolean r0 = r5.getActionCode     // Catch:{ IOException -> 0x0150 }
            if (r0 == 0) goto L_0x0146
            boolean r0 = r5.CardinalChallengeObserver     // Catch:{ IOException -> 0x0150 }
            r3 = 26
            if (r0 != 0) goto L_0x0132
        L_0x0125:
            char r0 = r5.init     // Catch:{ IOException -> 0x0150 }
            r4 = 32
            if (r0 > r4) goto L_0x0132
            if (r0 != r3) goto L_0x012e
            goto L_0x0132
        L_0x012e:
            r5.onCReqSuccess()     // Catch:{ IOException -> 0x0150 }
            goto L_0x0125
        L_0x0132:
            char r0 = r5.init     // Catch:{ IOException -> 0x0150 }
            if (r0 != r3) goto L_0x0137
            goto L_0x0146
        L_0x0137:
            com.cardinalcommerce.a.getToolbarCustomization r6 = new com.cardinalcommerce.a.getToolbarCustomization     // Catch:{ IOException -> 0x0150 }
            int r0 = r5.onValidated     // Catch:{ IOException -> 0x0150 }
            int r0 = r0 - r2
            char r1 = r5.init     // Catch:{ IOException -> 0x0150 }
            java.lang.Character r1 = java.lang.Character.valueOf(r1)     // Catch:{ IOException -> 0x0150 }
            r6.<init>(r0, r2, r1)     // Catch:{ IOException -> 0x0150 }
            throw r6     // Catch:{ IOException -> 0x0150 }
        L_0x0146:
            r5.configure = r1
            r5.CardinalEnvironment = r1
            return r6
        L_0x014b:
            r5.getInstance()     // Catch:{ IOException -> 0x0150 }
            goto L_0x0006
        L_0x0150:
            r6 = move-exception
            com.cardinalcommerce.a.getToolbarCustomization r0 = new com.cardinalcommerce.a.getToolbarCustomization
            int r1 = r5.onValidated
            r0.<init>(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.cancel.Cardinal(com.cardinalcommerce.a.setVerticalScrollbarThumbDrawable):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final Number getInstance(String str) throws getToolbarCustomization {
        int i;
        int i2;
        boolean z;
        int length = str.length();
        boolean z2 = false;
        if (str.charAt(0) == '-') {
            if (this.getWarnings || length < 3 || str.charAt(1) != '0') {
                i2 = 20;
                i = 1;
            } else {
                throw new getToolbarCustomization(this.onValidated, 6, str);
            }
        } else if (this.getWarnings || length < 2 || str.charAt(0) != '0') {
            i2 = 19;
            i = 0;
        } else {
            throw new getToolbarCustomization(this.onValidated, 6, str);
        }
        int i3 = i;
        if (length < i2) {
            z = false;
        } else if (length > i2) {
            return new BigInteger(str, 10);
        } else {
            length--;
            z = true;
        }
        long j = 0;
        while (i < length) {
            j = (j * 10) + ((long) ('0' - str.charAt(i)));
            i++;
        }
        if (z) {
            int i4 = (j > BufferKt.OVERFLOW_ZONE ? 1 : (j == BufferKt.OVERFLOW_ZONE ? 0 : -1));
            if (i4 <= 0 && (i4 < 0 || (i3 == 0 ? str.charAt(i) > '7' : str.charAt(i) > '8'))) {
                z2 = true;
            }
            if (z2) {
                return new BigInteger(str, 10);
            }
            j = (j * 10) + ((long) ('0' - str.charAt(i)));
        }
        if (i3 == 0) {
            long j2 = -j;
            if (!this.setRequestTimeout || j2 > 2147483647L) {
                return Long.valueOf(j2);
            }
            return Integer.valueOf((int) j2);
        } else if (!this.setRequestTimeout || j < -2147483648L) {
            return Long.valueOf(j);
        } else {
            return Integer.valueOf((int) j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r4 == ':') goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r4 == ']') goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r4 == '}') goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        if (r1 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        if (r7.CardinalUiType == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        throw new com.cardinalcommerce.a.getToolbarCustomization(r7.onValidated, 0, java.lang.Character.valueOf(r7.init));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        getInstance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        return r8.init(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T init(com.cardinalcommerce.a.setVerticalScrollbarThumbDrawable<T> r8) throws com.cardinalcommerce.a.getToolbarCustomization, java.io.IOException {
        /*
            r7 = this;
            java.lang.Object r0 = r8.cca_continue()
            char r1 = r7.init
            r2 = 91
            if (r1 != r2) goto L_0x00ad
            r7.getInstance()
            char r1 = r7.init
            r2 = 44
            r3 = 0
            if (r1 != r2) goto L_0x0027
            boolean r1 = r7.CardinalUiType
            if (r1 == 0) goto L_0x0019
            goto L_0x0027
        L_0x0019:
            com.cardinalcommerce.a.getToolbarCustomization r8 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r7.onValidated
            char r1 = r7.init
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L_0x0027:
            r1 = r3
        L_0x0028:
            char r4 = r7.init
            r5 = 9
            if (r4 == r5) goto L_0x00a8
            r5 = 10
            if (r4 == r5) goto L_0x00a8
            r5 = 13
            if (r4 == r5) goto L_0x00a8
            r5 = 26
            r6 = 1
            if (r4 == r5) goto L_0x009c
            r5 = 32
            if (r4 == r5) goto L_0x00a8
            if (r4 == r2) goto L_0x0082
            r5 = 58
            if (r4 == r5) goto L_0x0074
            r5 = 93
            if (r4 == r5) goto L_0x0057
            r1 = 125(0x7d, float:1.75E-43)
            if (r4 == r1) goto L_0x0074
            boolean[] r1 = values
            java.lang.Object r1 = r7.Cardinal(r8, r1)
            r8.Cardinal(r0, r1)
            goto L_0x0027
        L_0x0057:
            if (r1 == 0) goto L_0x006c
            boolean r1 = r7.CardinalUiType
            if (r1 == 0) goto L_0x005e
            goto L_0x006c
        L_0x005e:
            com.cardinalcommerce.a.getToolbarCustomization r8 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r7.onValidated
            char r1 = r7.init
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L_0x006c:
            r7.getInstance()
            java.lang.Object r8 = r8.init((java.lang.Object) r0)
            return r8
        L_0x0074:
            com.cardinalcommerce.a.getToolbarCustomization r8 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r7.onValidated
            char r1 = r7.init
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L_0x0082:
            if (r1 == 0) goto L_0x0097
            boolean r1 = r7.CardinalUiType
            if (r1 == 0) goto L_0x0089
            goto L_0x0097
        L_0x0089:
            com.cardinalcommerce.a.getToolbarCustomization r8 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r7.onValidated
            char r1 = r7.init
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L_0x0097:
            r7.getInstance()
            r1 = r6
            goto L_0x0028
        L_0x009c:
            com.cardinalcommerce.a.getToolbarCustomization r8 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r7.onValidated
            int r0 = r0 - r6
            r1 = 3
            java.lang.String r2 = "EOF"
            r8.<init>(r0, r1, r2)
            throw r8
        L_0x00a8:
            r7.getInstance()
            goto L_0x0028
        L_0x00ad:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Internal Error"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.cancel.init(com.cardinalcommerce.a.setVerticalScrollbarThumbDrawable):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a0, code lost:
        throw new com.cardinalcommerce.a.getToolbarCustomization(r2.onValidated, 0, java.lang.Character.valueOf(r2.init));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object Cardinal(com.cardinalcommerce.a.setVerticalScrollbarThumbDrawable<?> r3, boolean[] r4) throws com.cardinalcommerce.a.getToolbarCustomization, java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            char r0 = r2.init
            r1 = 9
            if (r0 == r1) goto L_0x00ea
            r1 = 10
            if (r0 == r1) goto L_0x00ea
            r1 = 1
            switch(r0) {
                case 13: goto L_0x00ea;
                case 32: goto L_0x00ea;
                case 34: goto L_0x00e4;
                case 39: goto L_0x00e4;
                case 45: goto L_0x00df;
                case 78: goto L_0x00ac;
                case 91: goto L_0x00a1;
                case 93: goto L_0x0092;
                case 102: goto L_0x0071;
                case 110: goto L_0x0051;
                case 116: goto L_0x0030;
                case 123: goto L_0x0025;
                case 125: goto L_0x0092;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r0) {
                case 48: goto L_0x00df;
                case 49: goto L_0x00df;
                case 50: goto L_0x00df;
                case 51: goto L_0x00df;
                case 52: goto L_0x00df;
                case 53: goto L_0x00df;
                case 54: goto L_0x00df;
                case 55: goto L_0x00df;
                case 56: goto L_0x00df;
                case 57: goto L_0x00df;
                case 58: goto L_0x0092;
                default: goto L_0x0011;
            }
        L_0x0011:
            r2.configure((boolean[]) r4)
            boolean r3 = r2.onCReqSuccess
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = r2.configure
            return r3
        L_0x001b:
            com.cardinalcommerce.a.getToolbarCustomization r3 = new com.cardinalcommerce.a.getToolbarCustomization
            int r4 = r2.onValidated
            java.lang.String r0 = r2.configure
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x0025:
            java.lang.String r4 = r2.getSDKVersion
            com.cardinalcommerce.a.setVerticalScrollbarThumbDrawable r3 = r3.init((java.lang.String) r4)
            java.lang.Object r3 = r2.cca_continue(r3)
            return r3
        L_0x0030:
            r2.configure((boolean[]) r4)
            java.lang.String r3 = "true"
            java.lang.String r4 = r2.configure
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0040
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L_0x0040:
            boolean r3 = r2.onCReqSuccess
            if (r3 == 0) goto L_0x0047
            java.lang.String r3 = r2.configure
            return r3
        L_0x0047:
            com.cardinalcommerce.a.getToolbarCustomization r3 = new com.cardinalcommerce.a.getToolbarCustomization
            int r4 = r2.onValidated
            java.lang.String r0 = r2.configure
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x0051:
            r2.configure((boolean[]) r4)
            java.lang.String r3 = "null"
            java.lang.String r4 = r2.configure
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0060
            r3 = 0
            return r3
        L_0x0060:
            boolean r3 = r2.onCReqSuccess
            if (r3 == 0) goto L_0x0067
            java.lang.String r3 = r2.configure
            return r3
        L_0x0067:
            com.cardinalcommerce.a.getToolbarCustomization r3 = new com.cardinalcommerce.a.getToolbarCustomization
            int r4 = r2.onValidated
            java.lang.String r0 = r2.configure
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x0071:
            r2.configure((boolean[]) r4)
            java.lang.String r3 = "false"
            java.lang.String r4 = r2.configure
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0081
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L_0x0081:
            boolean r3 = r2.onCReqSuccess
            if (r3 == 0) goto L_0x0088
            java.lang.String r3 = r2.configure
            return r3
        L_0x0088:
            com.cardinalcommerce.a.getToolbarCustomization r3 = new com.cardinalcommerce.a.getToolbarCustomization
            int r4 = r2.onValidated
            java.lang.String r0 = r2.configure
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x0092:
            com.cardinalcommerce.a.getToolbarCustomization r3 = new com.cardinalcommerce.a.getToolbarCustomization
            int r4 = r2.onValidated
            char r0 = r2.init
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r1 = 0
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x00a1:
            java.lang.String r4 = r2.getSDKVersion
            com.cardinalcommerce.a.setVerticalScrollbarThumbDrawable r3 = r3.configure(r4)
            java.lang.Object r3 = r2.init(r3)
            return r3
        L_0x00ac:
            r2.configure((boolean[]) r4)
            boolean r3 = r2.getString
            if (r3 == 0) goto L_0x00d5
            java.lang.String r3 = "NaN"
            java.lang.String r4 = r2.configure
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00c4
            r3 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L_0x00c4:
            boolean r3 = r2.onCReqSuccess
            if (r3 == 0) goto L_0x00cb
            java.lang.String r3 = r2.configure
            return r3
        L_0x00cb:
            com.cardinalcommerce.a.getToolbarCustomization r3 = new com.cardinalcommerce.a.getToolbarCustomization
            int r4 = r2.onValidated
            java.lang.String r0 = r2.configure
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x00d5:
            com.cardinalcommerce.a.getToolbarCustomization r3 = new com.cardinalcommerce.a.getToolbarCustomization
            int r4 = r2.onValidated
            java.lang.String r0 = r2.configure
            r3.<init>(r4, r1, r0)
            throw r3
        L_0x00df:
            java.lang.Object r3 = r2.cca_continue((boolean[]) r4)
            return r3
        L_0x00e4:
            r2.onValidated()
            java.lang.String r3 = r2.configure
            return r3
        L_0x00ea:
            r2.getInstance()
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.cancel.Cardinal(com.cardinalcommerce.a.setVerticalScrollbarThumbDrawable, boolean[]):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00a2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T cca_continue(com.cardinalcommerce.a.setVerticalScrollbarThumbDrawable<T> r14) throws com.cardinalcommerce.a.getToolbarCustomization, java.io.IOException {
        /*
            r13 = this;
            char r0 = r13.init
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L_0x010a
            java.lang.Object r0 = r14.getInstance()
            r2 = 0
            r3 = r2
        L_0x000c:
            r13.getInstance()
            char r4 = r13.init
            r5 = 9
            if (r4 == r5) goto L_0x000c
            r5 = 10
            if (r4 == r5) goto L_0x000c
            r5 = 13
            if (r4 == r5) goto L_0x000c
            r5 = 32
            if (r4 == r5) goto L_0x000c
            r6 = 44
            r7 = 1
            if (r4 == r6) goto L_0x00f2
            r8 = 58
            if (r4 == r8) goto L_0x00e4
            r9 = 91
            if (r4 == r9) goto L_0x00e4
            r9 = 93
            if (r4 == r9) goto L_0x00e4
            if (r4 == r1) goto L_0x00e4
            r9 = 125(0x7d, float:1.75E-43)
            if (r4 == r9) goto L_0x00c7
            r3 = 34
            if (r4 == r3) goto L_0x0055
            r3 = 39
            if (r4 != r3) goto L_0x0041
            goto L_0x0055
        L_0x0041:
            boolean[] r3 = valueOf
            r13.configure((boolean[]) r3)
            boolean r3 = r13.onCReqSuccess
            if (r3 == 0) goto L_0x004b
            goto L_0x0058
        L_0x004b:
            com.cardinalcommerce.a.getToolbarCustomization r14 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r13.onValidated
            java.lang.String r1 = r13.configure
            r14.<init>(r0, r7, r1)
            throw r14
        L_0x0055:
            r13.onValidated()
        L_0x0058:
            java.lang.String r3 = r13.configure
        L_0x005a:
            char r4 = r13.init
            r10 = 26
            if (r4 > r5) goto L_0x0067
            if (r4 != r10) goto L_0x0063
            goto L_0x0067
        L_0x0063:
            r13.onCReqSuccess()
            goto L_0x005a
        L_0x0067:
            r11 = 3
            r12 = 0
            if (r4 == r8) goto L_0x0085
            if (r4 != r10) goto L_0x0076
            com.cardinalcommerce.a.getToolbarCustomization r14 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r13.onValidated
            int r0 = r0 - r7
            r14.<init>(r0, r11, r12)
            throw r14
        L_0x0076:
            com.cardinalcommerce.a.getToolbarCustomization r14 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r13.onValidated
            int r0 = r0 - r7
            char r1 = r13.init
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r14.<init>(r0, r2, r1)
            throw r14
        L_0x0085:
            r13.cca_continue()
            r13.getSDKVersion = r3
            boolean[] r4 = CardinalError
            java.lang.Object r4 = r13.Cardinal(r14, r4)
            r14.getInstance(r0, r3, r4)
            r13.getSDKVersion = r12
        L_0x0095:
            char r3 = r13.init
            if (r3 > r5) goto L_0x00a0
            if (r3 != r10) goto L_0x009c
            goto L_0x00a0
        L_0x009c:
            r13.onCReqSuccess()
            goto L_0x0095
        L_0x00a0:
            if (r3 != r9) goto L_0x00aa
            r13.getInstance()
            java.lang.Object r14 = r14.init((java.lang.Object) r0)
            return r14
        L_0x00aa:
            if (r3 == r10) goto L_0x00be
            if (r3 != r6) goto L_0x00af
            goto L_0x0107
        L_0x00af:
            com.cardinalcommerce.a.getToolbarCustomization r14 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r13.onValidated
            int r0 = r0 - r7
            char r1 = r13.init
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r14.<init>(r0, r7, r1)
            throw r14
        L_0x00be:
            com.cardinalcommerce.a.getToolbarCustomization r14 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r13.onValidated
            int r0 = r0 - r7
            r14.<init>(r0, r11, r12)
            throw r14
        L_0x00c7:
            if (r3 == 0) goto L_0x00dc
            boolean r1 = r13.CardinalUiType
            if (r1 == 0) goto L_0x00ce
            goto L_0x00dc
        L_0x00ce:
            com.cardinalcommerce.a.getToolbarCustomization r14 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r13.onValidated
            char r1 = r13.init
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r14.<init>(r0, r2, r1)
            throw r14
        L_0x00dc:
            r13.getInstance()
            java.lang.Object r14 = r14.init((java.lang.Object) r0)
            return r14
        L_0x00e4:
            com.cardinalcommerce.a.getToolbarCustomization r14 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r13.onValidated
            char r1 = r13.init
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r14.<init>(r0, r2, r1)
            throw r14
        L_0x00f2:
            if (r3 == 0) goto L_0x0107
            boolean r3 = r13.CardinalUiType
            if (r3 == 0) goto L_0x00f9
            goto L_0x0107
        L_0x00f9:
            com.cardinalcommerce.a.getToolbarCustomization r14 = new com.cardinalcommerce.a.getToolbarCustomization
            int r0 = r13.onValidated
            char r1 = r13.init
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r14.<init>(r0, r2, r1)
            throw r14
        L_0x0107:
            r3 = r7
            goto L_0x000c
        L_0x010a:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.String r0 = "Internal Error"
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.cancel.cca_continue(com.cardinalcommerce.a.setVerticalScrollbarThumbDrawable):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final void cleanup() throws getToolbarCustomization, IOException {
        char c = this.init;
        while (true) {
            getInstance();
            char c2 = this.init;
            if (c2 == '\"' || c2 == '\'') {
                if (c == c2) {
                    getInstance();
                    this.configure = this.cca_continue.toString();
                    return;
                }
                this.cca_continue.configure(c2);
            } else if (c2 != '\\') {
                if (c2 != 127) {
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            if (this.CardinalActionCode) {
                                continue;
                            } else {
                                throw new getToolbarCustomization(this.onValidated, 0, Character.valueOf(this.init));
                            }
                        case 26:
                            throw new getToolbarCustomization(this.onValidated - 1, 3, (Object) null);
                    }
                } else if (this.CardinalActionCode) {
                    continue;
                } else if (this.getChallengeTimeout) {
                    throw new getToolbarCustomization(this.onValidated, 0, Character.valueOf(this.init));
                }
                this.cca_continue.configure(c2);
            } else {
                getInstance();
                char c3 = this.init;
                if (c3 == '\"') {
                    this.cca_continue.configure(Typography.quote);
                } else if (c3 == '\'') {
                    this.cca_continue.configure('\'');
                } else if (c3 == '/') {
                    this.cca_continue.configure('/');
                } else if (c3 == '\\') {
                    this.cca_continue.configure('\\');
                } else if (c3 == 'b') {
                    this.cca_continue.configure(8);
                } else if (c3 == 'f') {
                    this.cca_continue.configure(12);
                } else if (c3 == 'n') {
                    this.cca_continue.configure(10);
                } else if (c3 == 'r') {
                    this.cca_continue.configure(13);
                } else if (c3 == 'x') {
                    this.cca_continue.configure(configure(2));
                } else if (c3 == 't') {
                    this.cca_continue.configure(9);
                } else if (c3 == 'u') {
                    this.cca_continue.configure(configure(4));
                }
            }
        }
    }

    private char configure(int i) throws getToolbarCustomization, IOException {
        int i2;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i4 << 4;
            getInstance();
            char c = this.init;
            if (c > '9' || c < '0') {
                if (c <= 'F' && c >= 'A') {
                    i2 = c - 'A';
                } else if (c >= 'a' && c <= 'f') {
                    i2 = c - 'a';
                } else if (c == 26) {
                    throw new getToolbarCustomization(this.onValidated, 3, "EOF");
                } else {
                    throw new getToolbarCustomization(this.onValidated, 4, Character.valueOf(this.init));
                }
                i3 = i2 + 10;
            } else {
                i3 = c - '0';
            }
            i4 = i6 + i3;
        }
        return (char) i4;
    }

    /* access modifiers changed from: protected */
    public final void getSDKVersion() throws IOException {
        while (true) {
            char c = this.init;
            if (c >= '0' && c <= '9') {
                onCReqSuccess();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void Cardinal(boolean[] zArr) throws IOException {
        while (true) {
            char c = this.init;
            if (c == 26) {
                return;
            }
            if (c < 0 || c >= '~' || !zArr[c]) {
                onCReqSuccess();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void getWarnings() throws IOException {
        while (true) {
            char c = this.init;
            if (c <= ' ' && c != 26) {
                onCReqSuccess();
            } else {
                return;
            }
        }
    }

    public static class init {
        int Cardinal = -1;
        private char[] configure = new char[15];

        public final void configure(char c) {
            int i = this.Cardinal + 1;
            this.Cardinal = i;
            char[] cArr = this.configure;
            if (cArr.length <= i) {
                char[] cArr2 = new char[((cArr.length << 1) + 1)];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.configure = cArr2;
            }
            this.configure[this.Cardinal] = c;
        }

        public final String toString() {
            return new String(this.configure, 0, this.Cardinal + 1);
        }
    }
}
