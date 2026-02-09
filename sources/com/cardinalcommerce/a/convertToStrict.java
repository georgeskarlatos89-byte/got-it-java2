package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;

public final class convertToStrict extends JSONNavi.Cardinal {
    public convertToStrict(toJSONString tojsonstring, merge merge, merge merge2) {
        this(tojsonstring, merge, merge2, false);
    }

    public convertToStrict(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
        super(tojsonstring, merge, merge2);
        if ((merge == null) == (merge2 != null ? false : true)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    convertToStrict(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
        super(tojsonstring, merge, merge2, mergeArr);
        this.Cardinal = z;
    }

    public final JSONNavi CardinalChallengeObserver() {
        return getString() ? this : new convertToStrict(this.configure, this.init, this.cca_continue.init(), this.getInstance, this.Cardinal);
    }

    public final JSONNavi CardinalUiType() {
        return (getString() || this.cca_continue.onCReqSuccess()) ? this : getActionCode().cca_continue(this);
    }

    public final JSONNavi init() {
        return new convertToStrict((toJSONString) null, onCReqSuccess(), getWarnings());
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
            com.cardinalcommerce.a.convertToX r2 = (com.cardinalcommerce.a.convertToX) r2
            com.cardinalcommerce.a.merge r4 = r0.cca_continue
            com.cardinalcommerce.a.convertToX r4 = (com.cardinalcommerce.a.convertToX) r4
            com.cardinalcommerce.a.merge r5 = r18.onValidated()
            com.cardinalcommerce.a.convertToX r5 = (com.cardinalcommerce.a.convertToX) r5
            com.cardinalcommerce.a.merge r6 = r18.getSDKVersion()
            com.cardinalcommerce.a.convertToX r6 = (com.cardinalcommerce.a.convertToX) r6
            com.cardinalcommerce.a.merge[] r7 = r0.getInstance
            r8 = 0
            r7 = r7[r8]
            com.cardinalcommerce.a.convertToX r7 = (com.cardinalcommerce.a.convertToX) r7
            com.cardinalcommerce.a.merge r1 = r1.getInstance((int) r8)
            com.cardinalcommerce.a.convertToX r1 = (com.cardinalcommerce.a.convertToX) r1
            r9 = 17
            int[] r10 = new int[r9]
            int[] r11 = new int[r9]
            int[] r12 = new int[r9]
            int[] r13 = new int[r9]
            boolean r14 = r7.cleanup()
            if (r14 == 0) goto L_0x0053
            int[] r5 = r5.cca_continue
            int[] r6 = r6.cca_continue
            goto L_0x0069
        L_0x0053:
            int[] r15 = r7.cca_continue
            com.cardinalcommerce.a.JSONUtil.init(r15, r12)
            int[] r5 = r5.cca_continue
            com.cardinalcommerce.a.JSONUtil.getInstance(r12, r5, r11)
            int[] r5 = r7.cca_continue
            com.cardinalcommerce.a.JSONUtil.getInstance(r12, r5, r12)
            int[] r5 = r6.cca_continue
            com.cardinalcommerce.a.JSONUtil.getInstance(r12, r5, r12)
            r5 = r11
            r6 = r12
        L_0x0069:
            boolean r15 = r1.cleanup()
            if (r15 == 0) goto L_0x0074
            int[] r2 = r2.cca_continue
            int[] r4 = r4.cca_continue
            goto L_0x008a
        L_0x0074:
            int[] r8 = r1.cca_continue
            com.cardinalcommerce.a.JSONUtil.init(r8, r13)
            int[] r2 = r2.cca_continue
            com.cardinalcommerce.a.JSONUtil.getInstance(r13, r2, r10)
            int[] r2 = r1.cca_continue
            com.cardinalcommerce.a.JSONUtil.getInstance(r13, r2, r13)
            int[] r2 = r4.cca_continue
            com.cardinalcommerce.a.JSONUtil.getInstance(r13, r2, r13)
            r2 = r10
            r4 = r13
        L_0x008a:
            int[] r8 = new int[r9]
            com.cardinalcommerce.a.JSONUtil.configure(r2, r5, r8)
            com.cardinalcommerce.a.JSONUtil.configure(r4, r6, r11)
            r5 = 0
        L_0x0093:
            r6 = 1
            if (r5 >= r9) goto L_0x009f
            r16 = r8[r5]
            if (r16 == 0) goto L_0x009c
            r5 = 0
            goto L_0x00a0
        L_0x009c:
            int r5 = r5 + 1
            goto L_0x0093
        L_0x009f:
            r5 = r6
        L_0x00a0:
            if (r5 == 0) goto L_0x00bb
            r1 = 0
        L_0x00a3:
            if (r1 >= r9) goto L_0x00ae
            r2 = r11[r1]
            if (r2 == 0) goto L_0x00ab
            r8 = 0
            goto L_0x00af
        L_0x00ab:
            int r1 = r1 + 1
            goto L_0x00a3
        L_0x00ae:
            r8 = r6
        L_0x00af:
            if (r8 == 0) goto L_0x00b6
            com.cardinalcommerce.a.JSONNavi r1 = r17.getActionCode()
            return r1
        L_0x00b6:
            com.cardinalcommerce.a.JSONNavi r1 = r3.init()
            return r1
        L_0x00bb:
            com.cardinalcommerce.a.JSONUtil.init(r8, r12)
            int[] r5 = new int[r9]
            com.cardinalcommerce.a.JSONUtil.getInstance(r12, r8, r5)
            com.cardinalcommerce.a.JSONUtil.getInstance(r12, r2, r12)
            com.cardinalcommerce.a.JSONUtil.getInstance(r4, r5, r10)
            com.cardinalcommerce.a.convertToX r4 = new com.cardinalcommerce.a.convertToX
            r4.<init>((int[]) r13)
            int[] r2 = r4.cca_continue
            com.cardinalcommerce.a.JSONUtil.init(r11, r2)
            int[] r2 = r4.cca_continue
            int[] r9 = r4.cca_continue
            com.cardinalcommerce.a.JSONUtil.cca_continue(r2, r5, r9)
            int[] r2 = r4.cca_continue
            int[] r9 = r4.cca_continue
            com.cardinalcommerce.a.JSONUtil.configure(r2, r12, r9)
            int[] r2 = r4.cca_continue
            int[] r9 = r4.cca_continue
            com.cardinalcommerce.a.JSONUtil.configure(r2, r12, r9)
            com.cardinalcommerce.a.convertToX r9 = new com.cardinalcommerce.a.convertToX
            r9.<init>((int[]) r5)
            int[] r2 = r4.cca_continue
            int[] r5 = r9.cca_continue
            com.cardinalcommerce.a.JSONUtil.configure(r12, r2, r5)
            int[] r2 = r9.cca_continue
            com.cardinalcommerce.a.JSONUtil.getInstance(r2, r11, r11)
            int[] r2 = r9.cca_continue
            com.cardinalcommerce.a.JSONUtil.configure(r11, r10, r2)
            com.cardinalcommerce.a.convertToX r2 = new com.cardinalcommerce.a.convertToX
            r2.<init>((int[]) r8)
            if (r14 != 0) goto L_0x010e
            int[] r5 = r2.cca_continue
            int[] r7 = r7.cca_continue
            int[] r8 = r2.cca_continue
            com.cardinalcommerce.a.JSONUtil.getInstance(r5, r7, r8)
        L_0x010e:
            if (r15 != 0) goto L_0x0119
            int[] r5 = r2.cca_continue
            int[] r1 = r1.cca_continue
            int[] r7 = r2.cca_continue
            com.cardinalcommerce.a.JSONUtil.getInstance(r5, r1, r7)
        L_0x0119:
            com.cardinalcommerce.a.merge[] r6 = new com.cardinalcommerce.a.merge[r6]
            r1 = 0
            r6[r1] = r2
            com.cardinalcommerce.a.convertToStrict r1 = new com.cardinalcommerce.a.convertToStrict
            boolean r7 = r0.Cardinal
            r2 = r1
            r5 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.convertToStrict.cca_continue(com.cardinalcommerce.a.JSONNavi):com.cardinalcommerce.a.JSONNavi");
    }

    public final JSONNavi getActionCode() {
        if (getString()) {
            return this;
        }
        toJSONString configure = configure();
        convertToX converttox = (convertToX) this.cca_continue;
        if (converttox.onCReqSuccess()) {
            return configure.init();
        }
        convertToX converttox2 = (convertToX) this.init;
        convertToX converttox3 = (convertToX) this.getInstance[0];
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        JSONUtil.init(converttox.cca_continue, iArr3);
        int[] iArr4 = new int[17];
        JSONUtil.init(iArr3, iArr4);
        boolean cleanup = converttox3.cleanup();
        int[] iArr5 = converttox3.cca_continue;
        if (!cleanup) {
            JSONUtil.init(converttox3.cca_continue, iArr2);
            iArr5 = iArr2;
        }
        JSONUtil.configure(converttox2.cca_continue, iArr5, iArr);
        JSONUtil.cca_continue(converttox2.cca_continue, iArr5, iArr2);
        JSONUtil.getInstance(iArr2, iArr, iArr2);
        getErrorMessage.cca_continue(17, iArr2, iArr2, iArr2);
        JSONUtil.getInstance(iArr2);
        JSONUtil.getInstance(iArr3, converttox2.cca_continue, iArr3);
        getErrorMessage.getInstance(17, iArr3, 0);
        JSONUtil.getInstance(iArr3);
        getErrorMessage.getInstance(17, iArr4, 0, iArr);
        JSONUtil.getInstance(iArr);
        convertToX converttox4 = new convertToX(iArr4);
        JSONUtil.init(iArr2, converttox4.cca_continue);
        JSONUtil.configure(converttox4.cca_continue, iArr3, converttox4.cca_continue);
        JSONUtil.configure(converttox4.cca_continue, iArr3, converttox4.cca_continue);
        convertToX converttox5 = new convertToX(iArr3);
        JSONUtil.configure(iArr3, converttox4.cca_continue, converttox5.cca_continue);
        JSONUtil.getInstance(converttox5.cca_continue, iArr2, converttox5.cca_continue);
        JSONUtil.configure(converttox5.cca_continue, iArr, converttox5.cca_continue);
        convertToX converttox6 = new convertToX(iArr2);
        JSONUtil.cca_continue(converttox.cca_continue, converttox6.cca_continue);
        if (!cleanup) {
            JSONUtil.getInstance(converttox6.cca_continue, converttox3.cca_continue, converttox6.cca_continue);
        }
        return new convertToStrict(configure, converttox4, converttox5, new merge[]{converttox6}, this.Cardinal);
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
