package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;

public final class mustProtectValue extends JSONNavi.Cardinal {
    public mustProtectValue(toJSONString tojsonstring, merge merge, merge merge2) {
        this(tojsonstring, merge, merge2, false);
    }

    public mustProtectValue(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
        super(tojsonstring, merge, merge2);
        if ((merge == null) == (merge2 != null ? false : true)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    mustProtectValue(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
        super(tojsonstring, merge, merge2, mergeArr);
        this.Cardinal = z;
    }

    public final JSONNavi CardinalChallengeObserver() {
        return getString() ? this : new mustProtectValue(this.configure, this.init, this.cca_continue.init(), this.getInstance, this.Cardinal);
    }

    public final JSONNavi CardinalUiType() {
        return (getString() || this.cca_continue.onCReqSuccess()) ? this : getActionCode().cca_continue(this);
    }

    public final JSONNavi init() {
        return new mustProtectValue((toJSONString) null, onCReqSuccess(), getWarnings());
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [com.cardinalcommerce.a.JSONNavi] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.cardinalcommerce.a.JSONNavi cca_continue(com.cardinalcommerce.a.JSONNavi r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r17.getString()
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r2 = r18.getString()
            if (r2 == 0) goto L_0x0012
            return r0
        L_0x0012:
            if (r0 != r1) goto L_0x0019
            com.cardinalcommerce.a.JSONNavi r1 = r17.getActionCode()
            return r1
        L_0x0019:
            com.cardinalcommerce.a.toJSONString r3 = r17.configure()
            com.cardinalcommerce.a.merge r2 = r0.init
            com.cardinalcommerce.a.ignoreNull r2 = (com.cardinalcommerce.a.ignoreNull) r2
            com.cardinalcommerce.a.merge r4 = r0.cca_continue
            com.cardinalcommerce.a.ignoreNull r4 = (com.cardinalcommerce.a.ignoreNull) r4
            com.cardinalcommerce.a.merge r5 = r18.onValidated()
            com.cardinalcommerce.a.ignoreNull r5 = (com.cardinalcommerce.a.ignoreNull) r5
            com.cardinalcommerce.a.merge r6 = r18.getSDKVersion()
            com.cardinalcommerce.a.ignoreNull r6 = (com.cardinalcommerce.a.ignoreNull) r6
            com.cardinalcommerce.a.merge[] r7 = r0.getInstance
            r8 = 0
            r7 = r7[r8]
            com.cardinalcommerce.a.ignoreNull r7 = (com.cardinalcommerce.a.ignoreNull) r7
            com.cardinalcommerce.a.merge r1 = r1.getInstance((int) r8)
            com.cardinalcommerce.a.ignoreNull r1 = (com.cardinalcommerce.a.ignoreNull) r1
            r9 = 14
            int[] r9 = new int[r9]
            r10 = 7
            int[] r11 = new int[r10]
            int[] r12 = new int[r10]
            int[] r13 = new int[r10]
            boolean r14 = r7.cleanup()
            if (r14 == 0) goto L_0x0054
            int[] r5 = r5.getInstance
            int[] r6 = r6.getInstance
            goto L_0x006a
        L_0x0054:
            int[] r15 = r7.getInstance
            com.cardinalcommerce.a.protectKeys.configure(r15, r12)
            int[] r5 = r5.getInstance
            com.cardinalcommerce.a.protectKeys.cca_continue(r12, r5, r11)
            int[] r5 = r7.getInstance
            com.cardinalcommerce.a.protectKeys.cca_continue(r12, r5, r12)
            int[] r5 = r6.getInstance
            com.cardinalcommerce.a.protectKeys.cca_continue(r12, r5, r12)
            r5 = r11
            r6 = r12
        L_0x006a:
            boolean r15 = r1.cleanup()
            if (r15 == 0) goto L_0x0075
            int[] r2 = r2.getInstance
            int[] r4 = r4.getInstance
            goto L_0x008b
        L_0x0075:
            int[] r8 = r1.getInstance
            com.cardinalcommerce.a.protectKeys.configure(r8, r13)
            int[] r2 = r2.getInstance
            com.cardinalcommerce.a.protectKeys.cca_continue(r13, r2, r9)
            int[] r2 = r1.getInstance
            com.cardinalcommerce.a.protectKeys.cca_continue(r13, r2, r13)
            int[] r2 = r4.getInstance
            com.cardinalcommerce.a.protectKeys.cca_continue(r13, r2, r13)
            r2 = r9
            r4 = r13
        L_0x008b:
            int[] r8 = new int[r10]
            com.cardinalcommerce.a.protectKeys.init(r2, r5, r8)
            com.cardinalcommerce.a.protectKeys.init(r4, r6, r11)
            r5 = 0
        L_0x0094:
            r6 = 1
            if (r5 >= r10) goto L_0x00a0
            r16 = r8[r5]
            if (r16 == 0) goto L_0x009d
            r5 = 0
            goto L_0x00a1
        L_0x009d:
            int r5 = r5 + 1
            goto L_0x0094
        L_0x00a0:
            r5 = r6
        L_0x00a1:
            if (r5 == 0) goto L_0x00bc
            r1 = 0
        L_0x00a4:
            if (r1 >= r10) goto L_0x00af
            r2 = r11[r1]
            if (r2 == 0) goto L_0x00ac
            r8 = 0
            goto L_0x00b0
        L_0x00ac:
            int r1 = r1 + 1
            goto L_0x00a4
        L_0x00af:
            r8 = r6
        L_0x00b0:
            if (r8 == 0) goto L_0x00b7
            com.cardinalcommerce.a.JSONNavi r1 = r17.getActionCode()
            return r1
        L_0x00b7:
            com.cardinalcommerce.a.JSONNavi r1 = r3.init()
            return r1
        L_0x00bc:
            com.cardinalcommerce.a.protectKeys.configure(r8, r12)
            int[] r5 = new int[r10]
            com.cardinalcommerce.a.protectKeys.cca_continue(r12, r8, r5)
            com.cardinalcommerce.a.protectKeys.cca_continue(r12, r2, r12)
            com.cardinalcommerce.a.protectKeys.Cardinal(r5, r5)
            com.cardinalcommerce.a.getSDKTransactionID.getInstance(r4, r5, r9)
            int r2 = com.cardinalcommerce.a.getSDKTransactionID.configure((int[]) r12, (int[]) r12, (int[]) r5)
            com.cardinalcommerce.a.protectKeys.init((int) r2, (int[]) r5)
            com.cardinalcommerce.a.ignoreNull r4 = new com.cardinalcommerce.a.ignoreNull
            r4.<init>((int[]) r13)
            int[] r2 = r4.getInstance
            com.cardinalcommerce.a.protectKeys.configure(r11, r2)
            int[] r2 = r4.getInstance
            int[] r10 = r4.getInstance
            com.cardinalcommerce.a.protectKeys.init(r2, r5, r10)
            com.cardinalcommerce.a.ignoreNull r10 = new com.cardinalcommerce.a.ignoreNull
            r10.<init>((int[]) r5)
            int[] r2 = r4.getInstance
            int[] r5 = r10.getInstance
            com.cardinalcommerce.a.protectKeys.init(r12, r2, r5)
            int[] r2 = r10.getInstance
            com.cardinalcommerce.a.protectKeys.getInstance(r2, r11, r9)
            int[] r2 = r10.getInstance
            com.cardinalcommerce.a.protectKeys.init((int[]) r9, (int[]) r2)
            com.cardinalcommerce.a.ignoreNull r2 = new com.cardinalcommerce.a.ignoreNull
            r2.<init>((int[]) r8)
            if (r14 != 0) goto L_0x010b
            int[] r5 = r2.getInstance
            int[] r7 = r7.getInstance
            int[] r8 = r2.getInstance
            com.cardinalcommerce.a.protectKeys.cca_continue(r5, r7, r8)
        L_0x010b:
            if (r15 != 0) goto L_0x0116
            int[] r5 = r2.getInstance
            int[] r1 = r1.getInstance
            int[] r7 = r2.getInstance
            com.cardinalcommerce.a.protectKeys.cca_continue(r5, r1, r7)
        L_0x0116:
            com.cardinalcommerce.a.merge[] r6 = new com.cardinalcommerce.a.merge[r6]
            r1 = 0
            r6[r1] = r2
            com.cardinalcommerce.a.mustProtectValue r1 = new com.cardinalcommerce.a.mustProtectValue
            boolean r7 = r0.Cardinal
            r2 = r1
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.mustProtectValue.cca_continue(com.cardinalcommerce.a.JSONNavi):com.cardinalcommerce.a.JSONNavi");
    }

    public final JSONNavi getActionCode() {
        if (getString()) {
            return this;
        }
        toJSONString configure = configure();
        ignoreNull ignorenull = (ignoreNull) this.cca_continue;
        if (ignorenull.onCReqSuccess()) {
            return configure.init();
        }
        ignoreNull ignorenull2 = (ignoreNull) this.init;
        ignoreNull ignorenull3 = (ignoreNull) this.getInstance[0];
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[7];
        protectKeys.configure(ignorenull.getInstance, iArr3);
        int[] iArr4 = new int[7];
        protectKeys.configure(iArr3, iArr4);
        boolean cleanup = ignorenull3.cleanup();
        int[] iArr5 = ignorenull3.getInstance;
        if (!cleanup) {
            protectKeys.configure(ignorenull3.getInstance, iArr2);
            iArr5 = iArr2;
        }
        protectKeys.init(ignorenull2.getInstance, iArr5, iArr);
        protectKeys.Cardinal(ignorenull2.getInstance, iArr5, iArr2);
        protectKeys.cca_continue(iArr2, iArr, iArr2);
        protectKeys.init(getSDKTransactionID.configure(iArr2, iArr2, iArr2), iArr2);
        protectKeys.cca_continue(iArr3, ignorenull2.getInstance, iArr3);
        protectKeys.init(getErrorMessage.getInstance(7, iArr3, 0), iArr3);
        protectKeys.init(getErrorMessage.getInstance(7, iArr4, 0, iArr), iArr);
        ignoreNull ignorenull4 = new ignoreNull(iArr4);
        protectKeys.configure(iArr2, ignorenull4.getInstance);
        protectKeys.init(ignorenull4.getInstance, iArr3, ignorenull4.getInstance);
        protectKeys.init(ignorenull4.getInstance, iArr3, ignorenull4.getInstance);
        ignoreNull ignorenull5 = new ignoreNull(iArr3);
        protectKeys.init(iArr3, ignorenull4.getInstance, ignorenull5.getInstance);
        protectKeys.cca_continue(ignorenull5.getInstance, iArr2, ignorenull5.getInstance);
        protectKeys.init(ignorenull5.getInstance, iArr, ignorenull5.getInstance);
        ignoreNull ignorenull6 = new ignoreNull(iArr2);
        protectKeys.getInstance(ignorenull.getInstance, ignorenull6.getInstance);
        if (!cleanup) {
            protectKeys.cca_continue(ignorenull6.getInstance, ignorenull3.getInstance, ignorenull6.getInstance);
        }
        return new mustProtectValue(configure, ignorenull4, ignorenull5, new merge[]{ignorenull6}, this.Cardinal);
    }

    public final JSONNavi configure(JSONNavi jSONNavi) {
        if (this == jSONNavi) {
            return (getString() || this.cca_continue.onCReqSuccess()) ? this : getActionCode().cca_continue(this);
        }
        if (getString()) {
            return jSONNavi;
        }
        if (jSONNavi.getString()) {
            return getActionCode();
        }
        return this.cca_continue.onCReqSuccess() ? jSONNavi : getActionCode().cca_continue(jSONNavi);
    }
}
