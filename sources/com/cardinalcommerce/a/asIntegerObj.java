package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;

public final class asIntegerObj extends JSONNavi.Cardinal {
    public asIntegerObj(toJSONString tojsonstring, merge merge, merge merge2) {
        this(tojsonstring, merge, merge2, false);
    }

    public asIntegerObj(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
        super(tojsonstring, merge, merge2);
        if ((merge == null) == (merge2 != null ? false : true)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    asIntegerObj(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
        super(tojsonstring, merge, merge2, mergeArr);
        this.Cardinal = z;
    }

    public final JSONNavi CardinalChallengeObserver() {
        return getString() ? this : new asIntegerObj(this.configure, this.init, this.cca_continue.init(), this.getInstance, this.Cardinal);
    }

    public final JSONNavi CardinalUiType() {
        return (getString() || this.cca_continue.onCReqSuccess()) ? this : getActionCode().cca_continue(this);
    }

    public final JSONNavi init() {
        return new asIntegerObj((toJSONString) null, onCReqSuccess(), getWarnings());
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
            com.cardinalcommerce.a.asLongObj r2 = (com.cardinalcommerce.a.asLongObj) r2
            com.cardinalcommerce.a.merge r4 = r0.cca_continue
            com.cardinalcommerce.a.asLongObj r4 = (com.cardinalcommerce.a.asLongObj) r4
            com.cardinalcommerce.a.merge r5 = r18.onValidated()
            com.cardinalcommerce.a.asLongObj r5 = (com.cardinalcommerce.a.asLongObj) r5
            com.cardinalcommerce.a.merge r6 = r18.getSDKVersion()
            com.cardinalcommerce.a.asLongObj r6 = (com.cardinalcommerce.a.asLongObj) r6
            com.cardinalcommerce.a.merge[] r7 = r0.getInstance
            r8 = 0
            r7 = r7[r8]
            com.cardinalcommerce.a.asLongObj r7 = (com.cardinalcommerce.a.asLongObj) r7
            com.cardinalcommerce.a.merge r1 = r1.getInstance((int) r8)
            com.cardinalcommerce.a.asLongObj r1 = (com.cardinalcommerce.a.asLongObj) r1
            r9 = 16
            int[] r9 = new int[r9]
            r10 = 8
            int[] r11 = new int[r10]
            int[] r12 = new int[r10]
            int[] r13 = new int[r10]
            boolean r14 = r7.cleanup()
            if (r14 == 0) goto L_0x0055
            int[] r5 = r5.cca_continue
            int[] r6 = r6.cca_continue
            goto L_0x006b
        L_0x0055:
            int[] r15 = r7.cca_continue
            com.cardinalcommerce.a.asFloatObj.init(r15, r12)
            int[] r5 = r5.cca_continue
            com.cardinalcommerce.a.asFloatObj.init(r12, r5, r11)
            int[] r5 = r7.cca_continue
            com.cardinalcommerce.a.asFloatObj.init(r12, r5, r12)
            int[] r5 = r6.cca_continue
            com.cardinalcommerce.a.asFloatObj.init(r12, r5, r12)
            r5 = r11
            r6 = r12
        L_0x006b:
            boolean r15 = r1.cleanup()
            if (r15 == 0) goto L_0x0076
            int[] r2 = r2.cca_continue
            int[] r4 = r4.cca_continue
            goto L_0x008c
        L_0x0076:
            int[] r8 = r1.cca_continue
            com.cardinalcommerce.a.asFloatObj.init(r8, r13)
            int[] r2 = r2.cca_continue
            com.cardinalcommerce.a.asFloatObj.init(r13, r2, r9)
            int[] r2 = r1.cca_continue
            com.cardinalcommerce.a.asFloatObj.init(r13, r2, r13)
            int[] r2 = r4.cca_continue
            com.cardinalcommerce.a.asFloatObj.init(r13, r2, r13)
            r2 = r9
            r4 = r13
        L_0x008c:
            int[] r8 = new int[r10]
            com.cardinalcommerce.a.asFloatObj.cca_continue(r2, r5, r8)
            com.cardinalcommerce.a.asFloatObj.cca_continue(r4, r6, r11)
            r5 = 0
        L_0x0095:
            r6 = 1
            if (r5 >= r10) goto L_0x00a1
            r16 = r8[r5]
            if (r16 == 0) goto L_0x009e
            r5 = 0
            goto L_0x00a2
        L_0x009e:
            int r5 = r5 + 1
            goto L_0x0095
        L_0x00a1:
            r5 = r6
        L_0x00a2:
            if (r5 == 0) goto L_0x00bd
            r1 = 0
        L_0x00a5:
            if (r1 >= r10) goto L_0x00b0
            r2 = r11[r1]
            if (r2 == 0) goto L_0x00ad
            r8 = 0
            goto L_0x00b1
        L_0x00ad:
            int r1 = r1 + 1
            goto L_0x00a5
        L_0x00b0:
            r8 = r6
        L_0x00b1:
            if (r8 == 0) goto L_0x00b8
            com.cardinalcommerce.a.JSONNavi r1 = r17.getActionCode()
            return r1
        L_0x00b8:
            com.cardinalcommerce.a.JSONNavi r1 = r3.init()
            return r1
        L_0x00bd:
            com.cardinalcommerce.a.asFloatObj.init(r8, r12)
            int[] r5 = new int[r10]
            com.cardinalcommerce.a.asFloatObj.init(r12, r8, r5)
            com.cardinalcommerce.a.asFloatObj.init(r12, r2, r12)
            com.cardinalcommerce.a.asFloatObj.configure((int[]) r5, (int[]) r5)
            com.cardinalcommerce.a.setErrorCode.init(r4, r5, r9)
            int r2 = com.cardinalcommerce.a.setErrorCode.cca_continue(r12, r12, r5)
            com.cardinalcommerce.a.asFloatObj.configure((int) r2, (int[]) r5)
            com.cardinalcommerce.a.asLongObj r4 = new com.cardinalcommerce.a.asLongObj
            r4.<init>((int[]) r13)
            int[] r2 = r4.cca_continue
            com.cardinalcommerce.a.asFloatObj.init(r11, r2)
            int[] r2 = r4.cca_continue
            int[] r10 = r4.cca_continue
            com.cardinalcommerce.a.asFloatObj.cca_continue(r2, r5, r10)
            com.cardinalcommerce.a.asLongObj r10 = new com.cardinalcommerce.a.asLongObj
            r10.<init>((int[]) r5)
            int[] r2 = r4.cca_continue
            int[] r5 = r10.cca_continue
            com.cardinalcommerce.a.asFloatObj.cca_continue(r12, r2, r5)
            int[] r2 = r10.cca_continue
            com.cardinalcommerce.a.asFloatObj.Cardinal(r2, r11, r9)
            int[] r2 = r10.cca_continue
            com.cardinalcommerce.a.asFloatObj.Cardinal(r9, r2)
            com.cardinalcommerce.a.asLongObj r2 = new com.cardinalcommerce.a.asLongObj
            r2.<init>((int[]) r8)
            if (r14 != 0) goto L_0x010c
            int[] r5 = r2.cca_continue
            int[] r7 = r7.cca_continue
            int[] r8 = r2.cca_continue
            com.cardinalcommerce.a.asFloatObj.init(r5, r7, r8)
        L_0x010c:
            if (r15 != 0) goto L_0x0117
            int[] r5 = r2.cca_continue
            int[] r1 = r1.cca_continue
            int[] r7 = r2.cca_continue
            com.cardinalcommerce.a.asFloatObj.init(r5, r1, r7)
        L_0x0117:
            com.cardinalcommerce.a.merge[] r6 = new com.cardinalcommerce.a.merge[r6]
            r1 = 0
            r6[r1] = r2
            com.cardinalcommerce.a.asIntegerObj r1 = new com.cardinalcommerce.a.asIntegerObj
            boolean r7 = r0.Cardinal
            r2 = r1
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.asIntegerObj.cca_continue(com.cardinalcommerce.a.JSONNavi):com.cardinalcommerce.a.JSONNavi");
    }

    public final JSONNavi getActionCode() {
        if (getString()) {
            return this;
        }
        toJSONString configure = configure();
        asLongObj aslongobj = (asLongObj) this.cca_continue;
        if (aslongobj.onCReqSuccess()) {
            return configure.init();
        }
        asLongObj aslongobj2 = (asLongObj) this.init;
        asLongObj aslongobj3 = (asLongObj) this.getInstance[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        asFloatObj.init(aslongobj.cca_continue, iArr3);
        int[] iArr4 = new int[8];
        asFloatObj.init(iArr3, iArr4);
        boolean cleanup = aslongobj3.cleanup();
        int[] iArr5 = aslongobj3.cca_continue;
        if (!cleanup) {
            asFloatObj.init(aslongobj3.cca_continue, iArr2);
            iArr5 = iArr2;
        }
        asFloatObj.cca_continue(aslongobj2.cca_continue, iArr5, iArr);
        asFloatObj.configure(aslongobj2.cca_continue, iArr5, iArr2);
        asFloatObj.init(iArr2, iArr, iArr2);
        asFloatObj.configure(setErrorCode.cca_continue(iArr2, iArr2, iArr2), iArr2);
        asFloatObj.init(iArr3, aslongobj2.cca_continue, iArr3);
        asFloatObj.configure(getErrorMessage.getInstance(8, iArr3, 0), iArr3);
        asFloatObj.configure(getErrorMessage.getInstance(8, iArr4, 0, iArr), iArr);
        asLongObj aslongobj4 = new asLongObj(iArr4);
        asFloatObj.init(iArr2, aslongobj4.cca_continue);
        asFloatObj.cca_continue(aslongobj4.cca_continue, iArr3, aslongobj4.cca_continue);
        asFloatObj.cca_continue(aslongobj4.cca_continue, iArr3, aslongobj4.cca_continue);
        asLongObj aslongobj5 = new asLongObj(iArr3);
        asFloatObj.cca_continue(iArr3, aslongobj4.cca_continue, aslongobj5.cca_continue);
        asFloatObj.init(aslongobj5.cca_continue, iArr2, aslongobj5.cca_continue);
        asFloatObj.cca_continue(aslongobj5.cca_continue, iArr, aslongobj5.cca_continue);
        asLongObj aslongobj6 = new asLongObj(iArr2);
        asFloatObj.getInstance(aslongobj.cca_continue, aslongobj6.cca_continue);
        if (!cleanup) {
            asFloatObj.init(aslongobj6.cca_continue, aslongobj3.cca_continue, aslongobj6.cca_continue);
        }
        return new asIntegerObj(configure, aslongobj4, aslongobj5, new merge[]{aslongobj6}, this.Cardinal);
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
