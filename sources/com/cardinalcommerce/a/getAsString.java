package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;

public final class getAsString extends JSONNavi.Cardinal {
    public getAsString(toJSONString tojsonstring, merge merge, merge merge2) {
        this(tojsonstring, merge, merge2, false);
    }

    public getAsString(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
        super(tojsonstring, merge, merge2);
        if ((merge == null) == (merge2 != null ? false : true)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    getAsString(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
        super(tojsonstring, merge, merge2, mergeArr);
        this.Cardinal = z;
    }

    public final JSONNavi CardinalChallengeObserver() {
        return getString() ? this : new getAsString(this.configure, this.init, this.cca_continue.init(), this.getInstance, this.Cardinal);
    }

    public final JSONNavi CardinalUiType() {
        return (getString() || this.cca_continue.onCReqSuccess()) ? this : getActionCode().cca_continue(this);
    }

    public final JSONNavi init() {
        return new getAsString((toJSONString) null, onCReqSuccess(), getWarnings());
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
            com.cardinalcommerce.a.appendField r2 = (com.cardinalcommerce.a.appendField) r2
            com.cardinalcommerce.a.merge r4 = r0.cca_continue
            com.cardinalcommerce.a.appendField r4 = (com.cardinalcommerce.a.appendField) r4
            com.cardinalcommerce.a.merge r5 = r18.onValidated()
            com.cardinalcommerce.a.appendField r5 = (com.cardinalcommerce.a.appendField) r5
            com.cardinalcommerce.a.merge r6 = r18.getSDKVersion()
            com.cardinalcommerce.a.appendField r6 = (com.cardinalcommerce.a.appendField) r6
            com.cardinalcommerce.a.merge[] r7 = r0.getInstance
            r8 = 0
            r7 = r7[r8]
            com.cardinalcommerce.a.appendField r7 = (com.cardinalcommerce.a.appendField) r7
            com.cardinalcommerce.a.merge r1 = r1.getInstance((int) r8)
            com.cardinalcommerce.a.appendField r1 = (com.cardinalcommerce.a.appendField) r1
            r9 = 12
            int[] r9 = new int[r9]
            r10 = 6
            int[] r11 = new int[r10]
            int[] r12 = new int[r10]
            int[] r13 = new int[r10]
            boolean r14 = r7.cleanup()
            if (r14 == 0) goto L_0x0054
            int[] r5 = r5.Cardinal
            int[] r6 = r6.Cardinal
            goto L_0x006a
        L_0x0054:
            int[] r15 = r7.Cardinal
            com.cardinalcommerce.a.writeJSON.cca_continue(r15, r12)
            int[] r5 = r5.Cardinal
            com.cardinalcommerce.a.writeJSON.cca_continue(r12, r5, r11)
            int[] r5 = r7.Cardinal
            com.cardinalcommerce.a.writeJSON.cca_continue(r12, r5, r12)
            int[] r5 = r6.Cardinal
            com.cardinalcommerce.a.writeJSON.cca_continue(r12, r5, r12)
            r5 = r11
            r6 = r12
        L_0x006a:
            boolean r15 = r1.cleanup()
            if (r15 == 0) goto L_0x0075
            int[] r2 = r2.Cardinal
            int[] r4 = r4.Cardinal
            goto L_0x008b
        L_0x0075:
            int[] r8 = r1.Cardinal
            com.cardinalcommerce.a.writeJSON.cca_continue(r8, r13)
            int[] r2 = r2.Cardinal
            com.cardinalcommerce.a.writeJSON.cca_continue(r13, r2, r9)
            int[] r2 = r1.Cardinal
            com.cardinalcommerce.a.writeJSON.cca_continue(r13, r2, r13)
            int[] r2 = r4.Cardinal
            com.cardinalcommerce.a.writeJSON.cca_continue(r13, r2, r13)
            r2 = r9
            r4 = r13
        L_0x008b:
            int[] r8 = new int[r10]
            com.cardinalcommerce.a.writeJSON.configure(r2, r5, r8)
            com.cardinalcommerce.a.writeJSON.configure(r4, r6, r11)
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
            com.cardinalcommerce.a.writeJSON.cca_continue(r8, r12)
            int[] r5 = new int[r10]
            com.cardinalcommerce.a.writeJSON.cca_continue(r12, r8, r5)
            com.cardinalcommerce.a.writeJSON.cca_continue(r12, r2, r12)
            com.cardinalcommerce.a.writeJSON.init((int[]) r5, (int[]) r5)
            com.cardinalcommerce.a.RuntimeErrorEvent.Cardinal(r4, r5, r9)
            int r2 = com.cardinalcommerce.a.RuntimeErrorEvent.configure(r12, r12, r5)
            com.cardinalcommerce.a.writeJSON.init((int) r2, (int[]) r5)
            com.cardinalcommerce.a.appendField r4 = new com.cardinalcommerce.a.appendField
            r4.<init>((int[]) r13)
            int[] r2 = r4.Cardinal
            com.cardinalcommerce.a.writeJSON.cca_continue(r11, r2)
            int[] r2 = r4.Cardinal
            int[] r10 = r4.Cardinal
            com.cardinalcommerce.a.writeJSON.configure(r2, r5, r10)
            com.cardinalcommerce.a.appendField r10 = new com.cardinalcommerce.a.appendField
            r10.<init>((int[]) r5)
            int[] r2 = r4.Cardinal
            int[] r5 = r10.Cardinal
            com.cardinalcommerce.a.writeJSON.configure(r12, r2, r5)
            int[] r2 = r10.Cardinal
            com.cardinalcommerce.a.writeJSON.init(r2, r11, r9)
            int[] r2 = r10.Cardinal
            com.cardinalcommerce.a.writeJSON.getInstance(r9, r2)
            com.cardinalcommerce.a.appendField r2 = new com.cardinalcommerce.a.appendField
            r2.<init>((int[]) r8)
            if (r14 != 0) goto L_0x010b
            int[] r5 = r2.Cardinal
            int[] r7 = r7.Cardinal
            int[] r8 = r2.Cardinal
            com.cardinalcommerce.a.writeJSON.cca_continue(r5, r7, r8)
        L_0x010b:
            if (r15 != 0) goto L_0x0116
            int[] r5 = r2.Cardinal
            int[] r1 = r1.Cardinal
            int[] r7 = r2.Cardinal
            com.cardinalcommerce.a.writeJSON.cca_continue(r5, r1, r7)
        L_0x0116:
            com.cardinalcommerce.a.merge[] r6 = new com.cardinalcommerce.a.merge[r6]
            r1 = 0
            r6[r1] = r2
            com.cardinalcommerce.a.getAsString r1 = new com.cardinalcommerce.a.getAsString
            boolean r7 = r0.Cardinal
            r2 = r1
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getAsString.cca_continue(com.cardinalcommerce.a.JSONNavi):com.cardinalcommerce.a.JSONNavi");
    }

    public final JSONNavi getActionCode() {
        if (getString()) {
            return this;
        }
        toJSONString configure = configure();
        appendField appendfield = (appendField) this.cca_continue;
        if (appendfield.onCReqSuccess()) {
            return configure.init();
        }
        appendField appendfield2 = (appendField) this.init;
        appendField appendfield3 = (appendField) this.getInstance[0];
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        writeJSON.cca_continue(appendfield.Cardinal, iArr3);
        int[] iArr4 = new int[6];
        writeJSON.cca_continue(iArr3, iArr4);
        boolean cleanup = appendfield3.cleanup();
        int[] iArr5 = appendfield3.Cardinal;
        if (!cleanup) {
            writeJSON.cca_continue(appendfield3.Cardinal, iArr2);
            iArr5 = iArr2;
        }
        writeJSON.configure(appendfield2.Cardinal, iArr5, iArr);
        writeJSON.getInstance(appendfield2.Cardinal, iArr5, iArr2);
        writeJSON.cca_continue(iArr2, iArr, iArr2);
        writeJSON.init(RuntimeErrorEvent.configure(iArr2, iArr2, iArr2), iArr2);
        writeJSON.cca_continue(iArr3, appendfield2.Cardinal, iArr3);
        writeJSON.init(getErrorMessage.getInstance(6, iArr3, 0), iArr3);
        writeJSON.init(getErrorMessage.getInstance(6, iArr4, 0, iArr), iArr);
        appendField appendfield4 = new appendField(iArr4);
        writeJSON.cca_continue(iArr2, appendfield4.Cardinal);
        writeJSON.configure(appendfield4.Cardinal, iArr3, appendfield4.Cardinal);
        writeJSON.configure(appendfield4.Cardinal, iArr3, appendfield4.Cardinal);
        appendField appendfield5 = new appendField(iArr3);
        writeJSON.configure(iArr3, appendfield4.Cardinal, appendfield5.Cardinal);
        writeJSON.cca_continue(appendfield5.Cardinal, iArr2, appendfield5.Cardinal);
        writeJSON.configure(appendfield5.Cardinal, iArr, appendfield5.Cardinal);
        appendField appendfield6 = new appendField(iArr2);
        writeJSON.configure(appendfield.Cardinal, appendfield6.Cardinal);
        if (!cleanup) {
            writeJSON.cca_continue(appendfield6.Cardinal, appendfield3.Cardinal, appendfield6.Cardinal);
        }
        return new getAsString(configure, appendfield4, appendfield5, new merge[]{appendfield6}, this.Cardinal);
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
