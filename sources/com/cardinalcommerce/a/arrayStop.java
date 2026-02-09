package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;

public final class arrayStop extends JSONNavi.Cardinal {
    public arrayStop(toJSONString tojsonstring, merge merge, merge merge2) {
        this(tojsonstring, merge, merge2, false);
    }

    public arrayStop(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
        super(tojsonstring, merge, merge2);
        if ((merge == null) == (merge2 != null ? false : true)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    arrayStop(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
        super(tojsonstring, merge, merge2, mergeArr);
        this.Cardinal = z;
    }

    public final JSONNavi CardinalChallengeObserver() {
        return getString() ? this : new arrayStop(this.configure, this.init, this.cca_continue.init(), this.getInstance, this.Cardinal);
    }

    public final JSONNavi CardinalUiType() {
        return (getString() || this.cca_continue.onCReqSuccess()) ? this : getActionCode().cca_continue(this);
    }

    public final JSONNavi init() {
        return new arrayStop((toJSONString) null, onCReqSuccess(), getWarnings());
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
            com.cardinalcommerce.a.objectElmStop r2 = (com.cardinalcommerce.a.objectElmStop) r2
            com.cardinalcommerce.a.merge r4 = r0.cca_continue
            com.cardinalcommerce.a.objectElmStop r4 = (com.cardinalcommerce.a.objectElmStop) r4
            com.cardinalcommerce.a.merge r5 = r18.onValidated()
            com.cardinalcommerce.a.objectElmStop r5 = (com.cardinalcommerce.a.objectElmStop) r5
            com.cardinalcommerce.a.merge r6 = r18.getSDKVersion()
            com.cardinalcommerce.a.objectElmStop r6 = (com.cardinalcommerce.a.objectElmStop) r6
            com.cardinalcommerce.a.merge[] r7 = r0.getInstance
            r8 = 0
            r7 = r7[r8]
            com.cardinalcommerce.a.objectElmStop r7 = (com.cardinalcommerce.a.objectElmStop) r7
            com.cardinalcommerce.a.merge r1 = r1.getInstance((int) r8)
            com.cardinalcommerce.a.objectElmStop r1 = (com.cardinalcommerce.a.objectElmStop) r1
            r9 = 24
            int[] r10 = new int[r9]
            int[] r9 = new int[r9]
            r11 = 12
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            boolean r14 = r7.cleanup()
            if (r14 == 0) goto L_0x0055
            int[] r5 = r5.configure
            int[] r6 = r6.configure
            goto L_0x006b
        L_0x0055:
            int[] r15 = r7.configure
            com.cardinalcommerce.a.arrayfirstObject.init(r15, r12)
            int[] r5 = r5.configure
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r12, r5, r9)
            int[] r5 = r7.configure
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r12, r5, r12)
            int[] r5 = r6.configure
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r12, r5, r12)
            r5 = r9
            r6 = r12
        L_0x006b:
            boolean r15 = r1.cleanup()
            if (r15 == 0) goto L_0x0076
            int[] r2 = r2.configure
            int[] r4 = r4.configure
            goto L_0x008c
        L_0x0076:
            int[] r8 = r1.configure
            com.cardinalcommerce.a.arrayfirstObject.init(r8, r13)
            int[] r2 = r2.configure
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r13, r2, r10)
            int[] r2 = r1.configure
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r13, r2, r13)
            int[] r2 = r4.configure
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r13, r2, r13)
            r2 = r10
            r4 = r13
        L_0x008c:
            int[] r8 = new int[r11]
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r2, (int[]) r5, (int[]) r8)
            int[] r5 = new int[r11]
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r4, (int[]) r6, (int[]) r5)
            r6 = 0
        L_0x0097:
            r0 = 1
            if (r6 >= r11) goto L_0x00a3
            r16 = r8[r6]
            if (r16 == 0) goto L_0x00a0
            r6 = 0
            goto L_0x00a4
        L_0x00a0:
            int r6 = r6 + 1
            goto L_0x0097
        L_0x00a3:
            r6 = r0
        L_0x00a4:
            if (r6 == 0) goto L_0x00bf
            r1 = 0
        L_0x00a7:
            if (r1 >= r11) goto L_0x00b2
            r2 = r5[r1]
            if (r2 == 0) goto L_0x00af
            r8 = 0
            goto L_0x00b3
        L_0x00af:
            int r1 = r1 + 1
            goto L_0x00a7
        L_0x00b2:
            r8 = r0
        L_0x00b3:
            if (r8 == 0) goto L_0x00ba
            com.cardinalcommerce.a.JSONNavi r0 = r17.getActionCode()
            return r0
        L_0x00ba:
            com.cardinalcommerce.a.JSONNavi r0 = r3.init()
            return r0
        L_0x00bf:
            com.cardinalcommerce.a.arrayfirstObject.init(r8, r12)
            int[] r6 = new int[r11]
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r12, r8, r6)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r12, r2, r12)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r6, r6)
            com.cardinalcommerce.a.getErrorCode.init(r4, r6, r10)
            int r2 = com.cardinalcommerce.a.getErrorMessage.cca_continue((int) r11, (int[]) r12, (int[]) r12, (int[]) r6)
            com.cardinalcommerce.a.arrayfirstObject.configure((int) r2, (int[]) r6)
            com.cardinalcommerce.a.objectElmStop r4 = new com.cardinalcommerce.a.objectElmStop
            r4.<init>((int[]) r13)
            int[] r2 = r4.configure
            com.cardinalcommerce.a.arrayfirstObject.init(r5, r2)
            int[] r2 = r4.configure
            int[] r11 = r4.configure
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r2, (int[]) r6, (int[]) r11)
            com.cardinalcommerce.a.objectElmStop r11 = new com.cardinalcommerce.a.objectElmStop
            r11.<init>((int[]) r6)
            int[] r2 = r4.configure
            int[] r6 = r11.configure
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r12, (int[]) r2, (int[]) r6)
            int[] r2 = r11.configure
            com.cardinalcommerce.a.getErrorCode.init(r2, r5, r9)
            com.cardinalcommerce.a.arrayfirstObject.getInstance(r10, r9, r10)
            int[] r2 = r11.configure
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r10, (int[]) r2)
            com.cardinalcommerce.a.objectElmStop r2 = new com.cardinalcommerce.a.objectElmStop
            r2.<init>((int[]) r8)
            if (r14 != 0) goto L_0x0111
            int[] r5 = r2.configure
            int[] r6 = r7.configure
            int[] r7 = r2.configure
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r5, r6, r7)
        L_0x0111:
            if (r15 != 0) goto L_0x011c
            int[] r5 = r2.configure
            int[] r1 = r1.configure
            int[] r6 = r2.configure
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r5, r1, r6)
        L_0x011c:
            com.cardinalcommerce.a.merge[] r6 = new com.cardinalcommerce.a.merge[r0]
            r0 = 0
            r6[r0] = r2
            com.cardinalcommerce.a.arrayStop r0 = new com.cardinalcommerce.a.arrayStop
            r1 = r17
            boolean r7 = r1.Cardinal
            r2 = r0
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.arrayStop.cca_continue(com.cardinalcommerce.a.JSONNavi):com.cardinalcommerce.a.JSONNavi");
    }

    public final JSONNavi getActionCode() {
        if (getString()) {
            return this;
        }
        toJSONString configure = configure();
        objectElmStop objectelmstop = (objectElmStop) this.cca_continue;
        if (objectelmstop.onCReqSuccess()) {
            return configure.init();
        }
        objectElmStop objectelmstop2 = (objectElmStop) this.init;
        objectElmStop objectelmstop3 = (objectElmStop) this.getInstance[0];
        int[] iArr = new int[12];
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        arrayfirstObject.init(objectelmstop.configure, iArr3);
        int[] iArr4 = new int[12];
        arrayfirstObject.init(iArr3, iArr4);
        boolean cleanup = objectelmstop3.cleanup();
        int[] iArr5 = objectelmstop3.configure;
        if (!cleanup) {
            arrayfirstObject.init(objectelmstop3.configure, iArr2);
            iArr5 = iArr2;
        }
        arrayfirstObject.configure(objectelmstop2.configure, iArr5, iArr);
        arrayfirstObject.init(objectelmstop2.configure, iArr5, iArr2);
        arrayfirstObject.cca_continue(iArr2, iArr, iArr2);
        arrayfirstObject.configure(getErrorMessage.cca_continue(12, iArr2, iArr2, iArr2), iArr2);
        arrayfirstObject.cca_continue(iArr3, objectelmstop2.configure, iArr3);
        arrayfirstObject.configure(getErrorMessage.getInstance(12, iArr3, 0), iArr3);
        arrayfirstObject.configure(getErrorMessage.getInstance(12, iArr4, 0, iArr), iArr);
        objectElmStop objectelmstop4 = new objectElmStop(iArr4);
        arrayfirstObject.init(iArr2, objectelmstop4.configure);
        arrayfirstObject.configure(objectelmstop4.configure, iArr3, objectelmstop4.configure);
        arrayfirstObject.configure(objectelmstop4.configure, iArr3, objectelmstop4.configure);
        objectElmStop objectelmstop5 = new objectElmStop(iArr3);
        arrayfirstObject.configure(iArr3, objectelmstop4.configure, objectelmstop5.configure);
        arrayfirstObject.cca_continue(objectelmstop5.configure, iArr2, objectelmstop5.configure);
        arrayfirstObject.configure(objectelmstop5.configure, iArr, objectelmstop5.configure);
        objectElmStop objectelmstop6 = new objectElmStop(iArr2);
        arrayfirstObject.getInstance(objectelmstop.configure, objectelmstop6.configure);
        if (!cleanup) {
            arrayfirstObject.cca_continue(objectelmstop6.configure, objectelmstop3.configure, objectelmstop6.configure);
        }
        return new arrayStop(configure, objectelmstop4, objectelmstop5, new merge[]{objectelmstop6}, this.Cardinal);
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
