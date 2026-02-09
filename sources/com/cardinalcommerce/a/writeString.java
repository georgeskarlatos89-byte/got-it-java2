package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;

public final class writeString extends JSONNavi.Cardinal {
    public writeString(toJSONString tojsonstring, merge merge, merge merge2) {
        this(tojsonstring, merge, merge2, false);
    }

    public writeString(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
        super(tojsonstring, merge, merge2);
        if ((merge == null) == (merge2 != null ? false : true)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    writeString(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
        super(tojsonstring, merge, merge2, mergeArr);
        this.Cardinal = z;
    }

    public final JSONNavi CardinalChallengeObserver() {
        return getString() ? this : new writeString(this.configure, this.init, this.cca_continue.init(), this.getInstance, this.Cardinal);
    }

    public final JSONNavi CardinalUiType() {
        return (getString() || this.cca_continue.onCReqSuccess()) ? this : getActionCode().cca_continue(this);
    }

    public final JSONNavi init() {
        return new writeString((toJSONString) null, onCReqSuccess(), getWarnings());
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
            com.cardinalcommerce.a.objectStart r2 = (com.cardinalcommerce.a.objectStart) r2
            com.cardinalcommerce.a.merge r4 = r0.cca_continue
            com.cardinalcommerce.a.objectStart r4 = (com.cardinalcommerce.a.objectStart) r4
            com.cardinalcommerce.a.merge r5 = r18.onValidated()
            com.cardinalcommerce.a.objectStart r5 = (com.cardinalcommerce.a.objectStart) r5
            com.cardinalcommerce.a.merge r6 = r18.getSDKVersion()
            com.cardinalcommerce.a.objectStart r6 = (com.cardinalcommerce.a.objectStart) r6
            com.cardinalcommerce.a.merge[] r7 = r0.getInstance
            r8 = 0
            r7 = r7[r8]
            com.cardinalcommerce.a.objectStart r7 = (com.cardinalcommerce.a.objectStart) r7
            com.cardinalcommerce.a.merge r1 = r1.getInstance((int) r8)
            com.cardinalcommerce.a.objectStart r1 = (com.cardinalcommerce.a.objectStart) r1
            r9 = 16
            int[] r9 = new int[r9]
            r10 = 8
            int[] r11 = new int[r10]
            int[] r12 = new int[r10]
            int[] r13 = new int[r10]
            boolean r14 = r7.cleanup()
            if (r14 == 0) goto L_0x0055
            int[] r5 = r5.getInstance
            int[] r6 = r6.getInstance
            goto L_0x006b
        L_0x0055:
            int[] r15 = r7.getInstance
            com.cardinalcommerce.a.objectStop.init(r15, r12)
            int[] r5 = r5.getInstance
            com.cardinalcommerce.a.objectStop.configure(r12, r5, r11)
            int[] r5 = r7.getInstance
            com.cardinalcommerce.a.objectStop.configure(r12, r5, r12)
            int[] r5 = r6.getInstance
            com.cardinalcommerce.a.objectStop.configure(r12, r5, r12)
            r5 = r11
            r6 = r12
        L_0x006b:
            boolean r15 = r1.cleanup()
            if (r15 == 0) goto L_0x0076
            int[] r2 = r2.getInstance
            int[] r4 = r4.getInstance
            goto L_0x008c
        L_0x0076:
            int[] r8 = r1.getInstance
            com.cardinalcommerce.a.objectStop.init(r8, r13)
            int[] r2 = r2.getInstance
            com.cardinalcommerce.a.objectStop.configure(r13, r2, r9)
            int[] r2 = r1.getInstance
            com.cardinalcommerce.a.objectStop.configure(r13, r2, r13)
            int[] r2 = r4.getInstance
            com.cardinalcommerce.a.objectStop.configure(r13, r2, r13)
            r2 = r9
            r4 = r13
        L_0x008c:
            int[] r8 = new int[r10]
            com.cardinalcommerce.a.objectStop.cca_continue((int[]) r2, (int[]) r5, (int[]) r8)
            com.cardinalcommerce.a.objectStop.cca_continue((int[]) r4, (int[]) r6, (int[]) r11)
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
            com.cardinalcommerce.a.objectStop.init(r8, r12)
            int[] r5 = new int[r10]
            com.cardinalcommerce.a.objectStop.configure(r12, r8, r5)
            com.cardinalcommerce.a.objectStop.configure(r12, r2, r12)
            com.cardinalcommerce.a.objectStop.Cardinal(r5, r5)
            com.cardinalcommerce.a.setErrorCode.init(r4, r5, r9)
            int r2 = com.cardinalcommerce.a.setErrorCode.cca_continue(r12, r12, r5)
            com.cardinalcommerce.a.objectStop.getInstance((int) r2, (int[]) r5)
            com.cardinalcommerce.a.objectStart r4 = new com.cardinalcommerce.a.objectStart
            r4.<init>((int[]) r13)
            int[] r2 = r4.getInstance
            com.cardinalcommerce.a.objectStop.init(r11, r2)
            int[] r2 = r4.getInstance
            int[] r10 = r4.getInstance
            com.cardinalcommerce.a.objectStop.cca_continue((int[]) r2, (int[]) r5, (int[]) r10)
            com.cardinalcommerce.a.objectStart r10 = new com.cardinalcommerce.a.objectStart
            r10.<init>((int[]) r5)
            int[] r2 = r4.getInstance
            int[] r5 = r10.getInstance
            com.cardinalcommerce.a.objectStop.cca_continue((int[]) r12, (int[]) r2, (int[]) r5)
            int[] r2 = r10.getInstance
            com.cardinalcommerce.a.objectStop.init(r2, r11, r9)
            int[] r2 = r10.getInstance
            com.cardinalcommerce.a.objectStop.configure(r9, r2)
            com.cardinalcommerce.a.objectStart r2 = new com.cardinalcommerce.a.objectStart
            r2.<init>((int[]) r8)
            if (r14 != 0) goto L_0x010c
            int[] r5 = r2.getInstance
            int[] r7 = r7.getInstance
            int[] r8 = r2.getInstance
            com.cardinalcommerce.a.objectStop.configure(r5, r7, r8)
        L_0x010c:
            if (r15 != 0) goto L_0x0117
            int[] r5 = r2.getInstance
            int[] r1 = r1.getInstance
            int[] r7 = r2.getInstance
            com.cardinalcommerce.a.objectStop.configure(r5, r1, r7)
        L_0x0117:
            com.cardinalcommerce.a.merge[] r6 = new com.cardinalcommerce.a.merge[r6]
            r1 = 0
            r6[r1] = r2
            com.cardinalcommerce.a.writeString r1 = new com.cardinalcommerce.a.writeString
            boolean r7 = r0.Cardinal
            r2 = r1
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.writeString.cca_continue(com.cardinalcommerce.a.JSONNavi):com.cardinalcommerce.a.JSONNavi");
    }

    public final JSONNavi getActionCode() {
        if (getString()) {
            return this;
        }
        toJSONString configure = configure();
        objectStart objectstart = (objectStart) this.cca_continue;
        if (objectstart.onCReqSuccess()) {
            return configure.init();
        }
        objectStart objectstart2 = (objectStart) this.init;
        objectStart objectstart3 = (objectStart) this.getInstance[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        objectStop.init(objectstart.getInstance, iArr3);
        int[] iArr4 = new int[8];
        objectStop.init(iArr3, iArr4);
        boolean cleanup = objectstart3.cleanup();
        int[] iArr5 = objectstart3.getInstance;
        if (!cleanup) {
            objectStop.init(objectstart3.getInstance, iArr2);
            iArr5 = iArr2;
        }
        objectStop.cca_continue(objectstart2.getInstance, iArr5, iArr);
        objectStop.Cardinal(objectstart2.getInstance, iArr5, iArr2);
        objectStop.configure(iArr2, iArr, iArr2);
        objectStop.getInstance(setErrorCode.cca_continue(iArr2, iArr2, iArr2), iArr2);
        objectStop.configure(iArr3, objectstart2.getInstance, iArr3);
        objectStop.getInstance(getErrorMessage.getInstance(8, iArr3, 0), iArr3);
        objectStop.getInstance(getErrorMessage.getInstance(8, iArr4, 0, iArr), iArr);
        objectStart objectstart4 = new objectStart(iArr4);
        objectStop.init(iArr2, objectstart4.getInstance);
        objectStop.cca_continue(objectstart4.getInstance, iArr3, objectstart4.getInstance);
        objectStop.cca_continue(objectstart4.getInstance, iArr3, objectstart4.getInstance);
        objectStart objectstart5 = new objectStart(iArr3);
        objectStop.cca_continue(iArr3, objectstart4.getInstance, objectstart5.getInstance);
        objectStop.configure(objectstart5.getInstance, iArr2, objectstart5.getInstance);
        objectStop.cca_continue(objectstart5.getInstance, iArr, objectstart5.getInstance);
        objectStart objectstart6 = new objectStart(iArr2);
        objectStop.cca_continue(objectstart.getInstance, objectstart6.getInstance);
        if (!cleanup) {
            objectStop.configure(objectstart6.getInstance, objectstart3.getInstance, objectstart6.getInstance);
        }
        return new writeString(configure, objectstart4, objectstart5, new merge[]{objectstart6}, this.Cardinal);
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
