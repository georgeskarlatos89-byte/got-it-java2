package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;

public final class a extends JSONNavi.Cardinal {
    public a(toJSONString tojsonstring, merge merge, merge merge2) {
        this(tojsonstring, merge, merge2, false);
    }

    public a(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
        super(tojsonstring, merge, merge2);
        if ((merge == null) == (merge2 != null ? false : true)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    a(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
        super(tojsonstring, merge, merge2, mergeArr);
        this.Cardinal = z;
    }

    public final JSONNavi CardinalChallengeObserver() {
        return getString() ? this : new a(this.configure, this.init, this.cca_continue.init(), this.getInstance, this.Cardinal);
    }

    public final JSONNavi CardinalUiType() {
        return (getString() || this.cca_continue.onCReqSuccess()) ? this : getActionCode().cca_continue(this);
    }

    public final JSONNavi init() {
        return new a((toJSONString) null, onCReqSuccess(), getWarnings());
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
            com.cardinalcommerce.a.atNext r2 = (com.cardinalcommerce.a.atNext) r2
            com.cardinalcommerce.a.merge r4 = r0.cca_continue
            com.cardinalcommerce.a.atNext r4 = (com.cardinalcommerce.a.atNext) r4
            com.cardinalcommerce.a.merge r5 = r18.onValidated()
            com.cardinalcommerce.a.atNext r5 = (com.cardinalcommerce.a.atNext) r5
            com.cardinalcommerce.a.merge r6 = r18.getSDKVersion()
            com.cardinalcommerce.a.atNext r6 = (com.cardinalcommerce.a.atNext) r6
            com.cardinalcommerce.a.merge[] r7 = r0.getInstance
            r8 = 0
            r7 = r7[r8]
            com.cardinalcommerce.a.atNext r7 = (com.cardinalcommerce.a.atNext) r7
            com.cardinalcommerce.a.merge r1 = r1.getInstance((int) r8)
            com.cardinalcommerce.a.atNext r1 = (com.cardinalcommerce.a.atNext) r1
            r9 = 10
            int[] r9 = new int[r9]
            r10 = 5
            int[] r11 = new int[r10]
            int[] r12 = new int[r10]
            int[] r13 = new int[r10]
            boolean r14 = r7.cleanup()
            if (r14 == 0) goto L_0x0054
            int[] r5 = r5.configure
            int[] r6 = r6.configure
            goto L_0x006a
        L_0x0054:
            int[] r15 = r7.configure
            com.cardinalcommerce.a.store.Cardinal(r15, r12)
            int[] r5 = r5.configure
            com.cardinalcommerce.a.store.getInstance(r12, r5, r11)
            int[] r5 = r7.configure
            com.cardinalcommerce.a.store.getInstance(r12, r5, r12)
            int[] r5 = r6.configure
            com.cardinalcommerce.a.store.getInstance(r12, r5, r12)
            r5 = r11
            r6 = r12
        L_0x006a:
            boolean r15 = r1.cleanup()
            if (r15 == 0) goto L_0x0075
            int[] r2 = r2.configure
            int[] r4 = r4.configure
            goto L_0x008b
        L_0x0075:
            int[] r8 = r1.configure
            com.cardinalcommerce.a.store.Cardinal(r8, r13)
            int[] r2 = r2.configure
            com.cardinalcommerce.a.store.getInstance(r13, r2, r9)
            int[] r2 = r1.configure
            com.cardinalcommerce.a.store.getInstance(r13, r2, r13)
            int[] r2 = r4.configure
            com.cardinalcommerce.a.store.getInstance(r13, r2, r13)
            r2 = r9
            r4 = r13
        L_0x008b:
            int[] r8 = new int[r10]
            com.cardinalcommerce.a.store.configure(r2, r5, r8)
            com.cardinalcommerce.a.store.configure(r4, r6, r11)
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
            com.cardinalcommerce.a.store.Cardinal(r8, r12)
            int[] r5 = new int[r10]
            com.cardinalcommerce.a.store.getInstance(r12, r8, r5)
            com.cardinalcommerce.a.store.getInstance(r12, r2, r12)
            com.cardinalcommerce.a.store.getInstance(r5, r5)
            com.cardinalcommerce.a.ProtocolErrorEvent.init(r4, r5, r9)
            int r2 = com.cardinalcommerce.a.ProtocolErrorEvent.Cardinal(r12, r12, r5)
            com.cardinalcommerce.a.store.cca_continue((int) r2, (int[]) r5)
            com.cardinalcommerce.a.atNext r4 = new com.cardinalcommerce.a.atNext
            r4.<init>((int[]) r13)
            int[] r2 = r4.configure
            com.cardinalcommerce.a.store.Cardinal(r11, r2)
            int[] r2 = r4.configure
            int[] r10 = r4.configure
            com.cardinalcommerce.a.store.configure(r2, r5, r10)
            com.cardinalcommerce.a.atNext r10 = new com.cardinalcommerce.a.atNext
            r10.<init>((int[]) r5)
            int[] r2 = r4.configure
            int[] r5 = r10.configure
            com.cardinalcommerce.a.store.configure(r12, r2, r5)
            int[] r2 = r10.configure
            com.cardinalcommerce.a.store.Cardinal(r2, r11, r9)
            int[] r2 = r10.configure
            com.cardinalcommerce.a.store.configure(r9, r2)
            com.cardinalcommerce.a.atNext r2 = new com.cardinalcommerce.a.atNext
            r2.<init>((int[]) r8)
            if (r14 != 0) goto L_0x010b
            int[] r5 = r2.configure
            int[] r7 = r7.configure
            int[] r8 = r2.configure
            com.cardinalcommerce.a.store.getInstance(r5, r7, r8)
        L_0x010b:
            if (r15 != 0) goto L_0x0116
            int[] r5 = r2.configure
            int[] r1 = r1.configure
            int[] r7 = r2.configure
            com.cardinalcommerce.a.store.getInstance(r5, r1, r7)
        L_0x0116:
            com.cardinalcommerce.a.merge[] r6 = new com.cardinalcommerce.a.merge[r6]
            r1 = 0
            r6[r1] = r2
            com.cardinalcommerce.a.a r1 = new com.cardinalcommerce.a.a
            boolean r7 = r0.Cardinal
            r2 = r1
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.a.cca_continue(com.cardinalcommerce.a.JSONNavi):com.cardinalcommerce.a.JSONNavi");
    }

    public final JSONNavi getActionCode() {
        if (getString()) {
            return this;
        }
        toJSONString configure = configure();
        atNext atnext = (atNext) this.cca_continue;
        if (atnext.onCReqSuccess()) {
            return configure.init();
        }
        atNext atnext2 = (atNext) this.init;
        atNext atnext3 = (atNext) this.getInstance[0];
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        store.Cardinal(atnext.configure, iArr3);
        int[] iArr4 = new int[5];
        store.Cardinal(iArr3, iArr4);
        boolean cleanup = atnext3.cleanup();
        int[] iArr5 = atnext3.configure;
        if (!cleanup) {
            store.Cardinal(atnext3.configure, iArr2);
            iArr5 = iArr2;
        }
        store.configure(atnext2.configure, iArr5, iArr);
        store.cca_continue(atnext2.configure, iArr5, iArr2);
        store.getInstance(iArr2, iArr, iArr2);
        store.cca_continue(ProtocolErrorEvent.Cardinal(iArr2, iArr2, iArr2), iArr2);
        store.getInstance(iArr3, atnext2.configure, iArr3);
        store.cca_continue(getErrorMessage.getInstance(5, iArr3, 0), iArr3);
        store.cca_continue(getErrorMessage.getInstance(5, iArr4, 0, iArr), iArr);
        atNext atnext4 = new atNext(iArr4);
        store.Cardinal(iArr2, atnext4.configure);
        store.configure(atnext4.configure, iArr3, atnext4.configure);
        store.configure(atnext4.configure, iArr3, atnext4.configure);
        atNext atnext5 = new atNext(iArr3);
        store.configure(iArr3, atnext4.configure, atnext5.configure);
        store.getInstance(atnext5.configure, iArr2, atnext5.configure);
        store.configure(atnext5.configure, iArr, atnext5.configure);
        atNext atnext6 = new atNext(iArr2);
        store.init(atnext.configure, atnext6.configure);
        if (!cleanup) {
            store.getInstance(atnext6.configure, atnext3.configure, atnext6.configure);
        }
        return new a(configure, atnext4, atnext5, new merge[]{atnext6}, this.Cardinal);
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
