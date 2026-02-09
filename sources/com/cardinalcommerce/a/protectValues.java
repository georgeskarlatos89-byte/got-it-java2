package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;

public final class protectValues extends JSONNavi.Cardinal {
    public protectValues(toJSONString tojsonstring, merge merge, merge merge2) {
        this(tojsonstring, merge, merge2, false);
    }

    public protectValues(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
        super(tojsonstring, merge, merge2);
        if ((merge == null) == (merge2 != null ? false : true)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    protectValues(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
        super(tojsonstring, merge, merge2, mergeArr);
        this.Cardinal = z;
    }

    public final JSONNavi CardinalChallengeObserver() {
        return getString() ? this : new protectValues(this.configure, this.init, this.cca_continue.init(), this.getInstance, this.Cardinal);
    }

    public final JSONNavi CardinalUiType() {
        return (getString() || this.cca_continue.onCReqSuccess()) ? this : getActionCode().cca_continue(this);
    }

    public final JSONNavi init() {
        return new protectValues((toJSONString) null, onCReqSuccess(), getWarnings());
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
            com.cardinalcommerce.a.JSONStreamAwareEx r2 = (com.cardinalcommerce.a.JSONStreamAwareEx) r2
            com.cardinalcommerce.a.merge r4 = r0.cca_continue
            com.cardinalcommerce.a.JSONStreamAwareEx r4 = (com.cardinalcommerce.a.JSONStreamAwareEx) r4
            com.cardinalcommerce.a.merge r5 = r18.onValidated()
            com.cardinalcommerce.a.JSONStreamAwareEx r5 = (com.cardinalcommerce.a.JSONStreamAwareEx) r5
            com.cardinalcommerce.a.merge r6 = r18.getSDKVersion()
            com.cardinalcommerce.a.JSONStreamAwareEx r6 = (com.cardinalcommerce.a.JSONStreamAwareEx) r6
            com.cardinalcommerce.a.merge[] r7 = r0.getInstance
            r8 = 0
            r7 = r7[r8]
            com.cardinalcommerce.a.JSONStreamAwareEx r7 = (com.cardinalcommerce.a.JSONStreamAwareEx) r7
            com.cardinalcommerce.a.merge r1 = r1.getInstance((int) r8)
            com.cardinalcommerce.a.JSONStreamAwareEx r1 = (com.cardinalcommerce.a.JSONStreamAwareEx) r1
            r9 = 14
            int[] r9 = new int[r9]
            r10 = 7
            int[] r11 = new int[r10]
            int[] r12 = new int[r10]
            int[] r13 = new int[r10]
            boolean r14 = r7.cleanup()
            if (r14 == 0) goto L_0x0054
            int[] r5 = r5.cca_continue
            int[] r6 = r6.cca_continue
            goto L_0x006a
        L_0x0054:
            int[] r15 = r7.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.init(r15, r12)
            int[] r5 = r5.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.cca_continue((int[]) r12, (int[]) r5, (int[]) r11)
            int[] r5 = r7.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.cca_continue((int[]) r12, (int[]) r5, (int[]) r12)
            int[] r5 = r6.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.cca_continue((int[]) r12, (int[]) r5, (int[]) r12)
            r5 = r11
            r6 = r12
        L_0x006a:
            boolean r15 = r1.cleanup()
            if (r15 == 0) goto L_0x0075
            int[] r2 = r2.cca_continue
            int[] r4 = r4.cca_continue
            goto L_0x008b
        L_0x0075:
            int[] r8 = r1.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.init(r8, r13)
            int[] r2 = r2.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.cca_continue((int[]) r13, (int[]) r2, (int[]) r9)
            int[] r2 = r1.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.cca_continue((int[]) r13, (int[]) r2, (int[]) r13)
            int[] r2 = r4.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.cca_continue((int[]) r13, (int[]) r2, (int[]) r13)
            r2 = r9
            r4 = r13
        L_0x008b:
            int[] r8 = new int[r10]
            com.cardinalcommerce.a.JSONStreamAware.init(r2, r5, r8)
            com.cardinalcommerce.a.JSONStreamAware.init(r4, r6, r11)
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
            com.cardinalcommerce.a.JSONStreamAware.init(r8, r12)
            int[] r5 = new int[r10]
            com.cardinalcommerce.a.JSONStreamAware.cca_continue((int[]) r12, (int[]) r8, (int[]) r5)
            com.cardinalcommerce.a.JSONStreamAware.cca_continue((int[]) r12, (int[]) r2, (int[]) r12)
            com.cardinalcommerce.a.JSONStreamAware.configure(r5, r5)
            com.cardinalcommerce.a.getSDKTransactionID.getInstance(r4, r5, r9)
            int r2 = com.cardinalcommerce.a.getSDKTransactionID.configure((int[]) r12, (int[]) r12, (int[]) r5)
            com.cardinalcommerce.a.JSONStreamAware.getInstance((int) r2, (int[]) r5)
            com.cardinalcommerce.a.JSONStreamAwareEx r4 = new com.cardinalcommerce.a.JSONStreamAwareEx
            r4.<init>((int[]) r13)
            int[] r2 = r4.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.init(r11, r2)
            int[] r2 = r4.cca_continue
            int[] r10 = r4.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.init(r2, r5, r10)
            com.cardinalcommerce.a.JSONStreamAwareEx r10 = new com.cardinalcommerce.a.JSONStreamAwareEx
            r10.<init>((int[]) r5)
            int[] r2 = r4.cca_continue
            int[] r5 = r10.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.init(r12, r2, r5)
            int[] r2 = r10.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.getInstance(r2, r11, r9)
            int[] r2 = r10.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.cca_continue(r9, r2)
            com.cardinalcommerce.a.JSONStreamAwareEx r2 = new com.cardinalcommerce.a.JSONStreamAwareEx
            r2.<init>((int[]) r8)
            if (r14 != 0) goto L_0x010b
            int[] r5 = r2.cca_continue
            int[] r7 = r7.cca_continue
            int[] r8 = r2.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.cca_continue((int[]) r5, (int[]) r7, (int[]) r8)
        L_0x010b:
            if (r15 != 0) goto L_0x0116
            int[] r5 = r2.cca_continue
            int[] r1 = r1.cca_continue
            int[] r7 = r2.cca_continue
            com.cardinalcommerce.a.JSONStreamAware.cca_continue((int[]) r5, (int[]) r1, (int[]) r7)
        L_0x0116:
            com.cardinalcommerce.a.merge[] r6 = new com.cardinalcommerce.a.merge[r6]
            r1 = 0
            r6[r1] = r2
            com.cardinalcommerce.a.protectValues r1 = new com.cardinalcommerce.a.protectValues
            boolean r7 = r0.Cardinal
            r2 = r1
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.protectValues.cca_continue(com.cardinalcommerce.a.JSONNavi):com.cardinalcommerce.a.JSONNavi");
    }

    public final JSONNavi getActionCode() {
        if (getString()) {
            return this;
        }
        toJSONString configure = configure();
        JSONStreamAwareEx jSONStreamAwareEx = (JSONStreamAwareEx) this.cca_continue;
        if (jSONStreamAwareEx.onCReqSuccess()) {
            return configure.init();
        }
        JSONStreamAwareEx jSONStreamAwareEx2 = (JSONStreamAwareEx) this.init;
        JSONStreamAwareEx jSONStreamAwareEx3 = (JSONStreamAwareEx) this.getInstance[0];
        int[] iArr = new int[7];
        JSONStreamAware.init(jSONStreamAwareEx.cca_continue, iArr);
        int[] iArr2 = new int[7];
        JSONStreamAware.init(iArr, iArr2);
        int[] iArr3 = new int[7];
        JSONStreamAware.init(jSONStreamAwareEx2.cca_continue, iArr3);
        JSONStreamAware.getInstance(getSDKTransactionID.configure(iArr3, iArr3, iArr3), iArr3);
        JSONStreamAware.cca_continue(iArr, jSONStreamAwareEx2.cca_continue, iArr);
        JSONStreamAware.getInstance(getErrorMessage.getInstance(7, iArr, 0), iArr);
        int[] iArr4 = new int[7];
        JSONStreamAware.getInstance(getErrorMessage.getInstance(7, iArr2, 0, iArr4), iArr4);
        JSONStreamAwareEx jSONStreamAwareEx4 = new JSONStreamAwareEx(iArr2);
        JSONStreamAware.init(iArr3, jSONStreamAwareEx4.cca_continue);
        JSONStreamAware.init(jSONStreamAwareEx4.cca_continue, iArr, jSONStreamAwareEx4.cca_continue);
        JSONStreamAware.init(jSONStreamAwareEx4.cca_continue, iArr, jSONStreamAwareEx4.cca_continue);
        JSONStreamAwareEx jSONStreamAwareEx5 = new JSONStreamAwareEx(iArr);
        JSONStreamAware.init(iArr, jSONStreamAwareEx4.cca_continue, jSONStreamAwareEx5.cca_continue);
        JSONStreamAware.cca_continue(jSONStreamAwareEx5.cca_continue, iArr3, jSONStreamAwareEx5.cca_continue);
        JSONStreamAware.init(jSONStreamAwareEx5.cca_continue, iArr4, jSONStreamAwareEx5.cca_continue);
        JSONStreamAwareEx jSONStreamAwareEx6 = new JSONStreamAwareEx(iArr3);
        JSONStreamAware.Cardinal(jSONStreamAwareEx.cca_continue, jSONStreamAwareEx6.cca_continue);
        if (!jSONStreamAwareEx3.cleanup()) {
            JSONStreamAware.cca_continue(jSONStreamAwareEx6.cca_continue, jSONStreamAwareEx3.cca_continue, jSONStreamAwareEx6.cca_continue);
        }
        return new protectValues(configure, jSONStreamAwareEx4, jSONStreamAwareEx5, new merge[]{jSONStreamAwareEx6}, this.Cardinal);
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
