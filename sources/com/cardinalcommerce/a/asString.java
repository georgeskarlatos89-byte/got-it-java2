package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;

public final class asString extends JSONNavi.Cardinal {
    public asString(toJSONString tojsonstring, merge merge, merge merge2) {
        this(tojsonstring, merge, merge2, false);
    }

    public asString(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
        super(tojsonstring, merge, merge2);
        if ((merge == null) == (merge2 != null ? false : true)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    asString(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
        super(tojsonstring, merge, merge2, mergeArr);
        this.Cardinal = z;
    }

    private asDouble configure(asDouble asdouble, int[] iArr) {
        asDouble asdouble2 = (asDouble) configure().getSDKVersion();
        if (asdouble.cleanup()) {
            return asdouble2;
        }
        asDouble asdouble3 = new asDouble();
        if (iArr == null) {
            iArr = asdouble3.getInstance;
            asDoubleObj.getInstance(asdouble.getInstance, iArr);
        }
        asDoubleObj.getInstance(iArr, asdouble3.getInstance);
        asDoubleObj.cca_continue(asdouble3.getInstance, asdouble2.getInstance, asdouble3.getInstance);
        return asdouble3;
    }

    private asDouble setRequestTimeout() {
        asDouble asdouble = (asDouble) this.getInstance[1];
        if (asdouble != null) {
            return asdouble;
        }
        merge[] mergeArr = this.getInstance;
        asDouble configure = configure((asDouble) this.getInstance[0], (int[]) null);
        mergeArr[1] = configure;
        return configure;
    }

    public final JSONNavi CardinalChallengeObserver() {
        return getString() ? this : new asString(configure(), this.init, this.cca_continue.init(), this.getInstance, this.Cardinal);
    }

    public final JSONNavi CardinalUiType() {
        return (!getString() && !this.cca_continue.onCReqSuccess()) ? init(false).cca_continue(this) : this;
    }

    public final JSONNavi configure(JSONNavi jSONNavi) {
        return this == jSONNavi ? CardinalUiType() : getString() ? jSONNavi : jSONNavi.getString() ? getActionCode() : this.cca_continue.onCReqSuccess() ? jSONNavi : init(false).cca_continue(jSONNavi);
    }

    public final JSONNavi getActionCode() {
        if (getString()) {
            return this;
        }
        return this.cca_continue.onCReqSuccess() ? configure().init() : init(true);
    }

    public final merge getInstance(int i) {
        return i == 1 ? setRequestTimeout() : super.getInstance(i);
    }

    public final JSONNavi init() {
        return new asString((toJSONString) null, onCReqSuccess(), getWarnings());
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
            com.cardinalcommerce.a.asDouble r2 = (com.cardinalcommerce.a.asDouble) r2
            com.cardinalcommerce.a.merge r4 = r0.cca_continue
            com.cardinalcommerce.a.asDouble r4 = (com.cardinalcommerce.a.asDouble) r4
            com.cardinalcommerce.a.merge[] r5 = r0.getInstance
            r6 = 0
            r5 = r5[r6]
            com.cardinalcommerce.a.asDouble r5 = (com.cardinalcommerce.a.asDouble) r5
            com.cardinalcommerce.a.merge r7 = r18.onValidated()
            com.cardinalcommerce.a.asDouble r7 = (com.cardinalcommerce.a.asDouble) r7
            com.cardinalcommerce.a.merge r8 = r18.getSDKVersion()
            com.cardinalcommerce.a.asDouble r8 = (com.cardinalcommerce.a.asDouble) r8
            com.cardinalcommerce.a.merge r1 = r1.getInstance((int) r6)
            com.cardinalcommerce.a.asDouble r1 = (com.cardinalcommerce.a.asDouble) r1
            r9 = 16
            int[] r9 = new int[r9]
            r10 = 8
            int[] r11 = new int[r10]
            int[] r12 = new int[r10]
            int[] r13 = new int[r10]
            boolean r14 = r5.cleanup()
            if (r14 == 0) goto L_0x0055
            int[] r7 = r7.getInstance
            int[] r8 = r8.getInstance
            goto L_0x006b
        L_0x0055:
            int[] r15 = r5.getInstance
            com.cardinalcommerce.a.asDoubleObj.getInstance((int[]) r15, (int[]) r12)
            int[] r7 = r7.getInstance
            com.cardinalcommerce.a.asDoubleObj.cca_continue((int[]) r12, (int[]) r7, (int[]) r11)
            int[] r7 = r5.getInstance
            com.cardinalcommerce.a.asDoubleObj.cca_continue((int[]) r12, (int[]) r7, (int[]) r12)
            int[] r7 = r8.getInstance
            com.cardinalcommerce.a.asDoubleObj.cca_continue((int[]) r12, (int[]) r7, (int[]) r12)
            r7 = r11
            r8 = r12
        L_0x006b:
            boolean r15 = r1.cleanup()
            if (r15 == 0) goto L_0x0076
            int[] r2 = r2.getInstance
            int[] r4 = r4.getInstance
            goto L_0x008c
        L_0x0076:
            int[] r6 = r1.getInstance
            com.cardinalcommerce.a.asDoubleObj.getInstance((int[]) r6, (int[]) r13)
            int[] r2 = r2.getInstance
            com.cardinalcommerce.a.asDoubleObj.cca_continue((int[]) r13, (int[]) r2, (int[]) r9)
            int[] r2 = r1.getInstance
            com.cardinalcommerce.a.asDoubleObj.cca_continue((int[]) r13, (int[]) r2, (int[]) r13)
            int[] r2 = r4.getInstance
            com.cardinalcommerce.a.asDoubleObj.cca_continue((int[]) r13, (int[]) r2, (int[]) r13)
            r2 = r9
            r4 = r13
        L_0x008c:
            int[] r6 = new int[r10]
            com.cardinalcommerce.a.asDoubleObj.Cardinal(r2, r7, r6)
            com.cardinalcommerce.a.asDoubleObj.Cardinal(r4, r8, r11)
            r7 = 0
        L_0x0095:
            r8 = 1
            if (r7 >= r10) goto L_0x00a1
            r16 = r6[r7]
            if (r16 == 0) goto L_0x009e
            r7 = 0
            goto L_0x00a2
        L_0x009e:
            int r7 = r7 + 1
            goto L_0x0095
        L_0x00a1:
            r7 = r8
        L_0x00a2:
            if (r7 == 0) goto L_0x00bd
            r1 = 0
        L_0x00a5:
            if (r1 >= r10) goto L_0x00b0
            r2 = r11[r1]
            if (r2 == 0) goto L_0x00ad
            r6 = 0
            goto L_0x00b1
        L_0x00ad:
            int r1 = r1 + 1
            goto L_0x00a5
        L_0x00b0:
            r6 = r8
        L_0x00b1:
            if (r6 == 0) goto L_0x00b8
            com.cardinalcommerce.a.JSONNavi r1 = r17.getActionCode()
            return r1
        L_0x00b8:
            com.cardinalcommerce.a.JSONNavi r1 = r3.init()
            return r1
        L_0x00bd:
            int[] r7 = new int[r10]
            com.cardinalcommerce.a.asDoubleObj.getInstance((int[]) r6, (int[]) r7)
            int[] r10 = new int[r10]
            com.cardinalcommerce.a.asDoubleObj.cca_continue((int[]) r7, (int[]) r6, (int[]) r10)
            com.cardinalcommerce.a.asDoubleObj.cca_continue((int[]) r7, (int[]) r2, (int[]) r12)
            com.cardinalcommerce.a.asDoubleObj.init(r10, r10)
            com.cardinalcommerce.a.setErrorCode.init(r4, r10, r9)
            int r2 = com.cardinalcommerce.a.setErrorCode.cca_continue(r12, r12, r10)
            com.cardinalcommerce.a.asDoubleObj.getInstance((int) r2, (int[]) r10)
            com.cardinalcommerce.a.asDouble r4 = new com.cardinalcommerce.a.asDouble
            r4.<init>((int[]) r13)
            int[] r2 = r4.getInstance
            com.cardinalcommerce.a.asDoubleObj.getInstance((int[]) r11, (int[]) r2)
            int[] r2 = r4.getInstance
            int[] r13 = r4.getInstance
            com.cardinalcommerce.a.asDoubleObj.Cardinal(r2, r10, r13)
            com.cardinalcommerce.a.asDouble r13 = new com.cardinalcommerce.a.asDouble
            r13.<init>((int[]) r10)
            int[] r2 = r4.getInstance
            int[] r10 = r13.getInstance
            com.cardinalcommerce.a.asDoubleObj.Cardinal(r12, r2, r10)
            int[] r2 = r13.getInstance
            com.cardinalcommerce.a.asDoubleObj.getInstance(r2, r11, r9)
            int[] r2 = r13.getInstance
            com.cardinalcommerce.a.asDoubleObj.configure(r9, r2)
            com.cardinalcommerce.a.asDouble r2 = new com.cardinalcommerce.a.asDouble
            r2.<init>((int[]) r6)
            if (r14 != 0) goto L_0x010e
            int[] r6 = r2.getInstance
            int[] r5 = r5.getInstance
            int[] r9 = r2.getInstance
            com.cardinalcommerce.a.asDoubleObj.cca_continue((int[]) r6, (int[]) r5, (int[]) r9)
        L_0x010e:
            if (r15 != 0) goto L_0x0119
            int[] r5 = r2.getInstance
            int[] r1 = r1.getInstance
            int[] r6 = r2.getInstance
            com.cardinalcommerce.a.asDoubleObj.cca_continue((int[]) r5, (int[]) r1, (int[]) r6)
        L_0x0119:
            if (r14 == 0) goto L_0x011e
            if (r15 == 0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r7 = 0
        L_0x011f:
            com.cardinalcommerce.a.asDouble r1 = r0.configure(r2, r7)
            r5 = 2
            com.cardinalcommerce.a.merge[] r6 = new com.cardinalcommerce.a.merge[r5]
            r5 = 0
            r6[r5] = r2
            r6[r8] = r1
            com.cardinalcommerce.a.asString r1 = new com.cardinalcommerce.a.asString
            boolean r7 = r0.Cardinal
            r2 = r1
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.asString.cca_continue(com.cardinalcommerce.a.JSONNavi):com.cardinalcommerce.a.JSONNavi");
    }

    private asString init(boolean z) {
        asDouble asdouble;
        asDouble asdouble2 = (asDouble) this.init;
        asDouble asdouble3 = (asDouble) this.cca_continue;
        asDouble asdouble4 = (asDouble) this.getInstance[0];
        asDouble requestTimeout = setRequestTimeout();
        int[] iArr = new int[8];
        asDoubleObj.getInstance(asdouble2.getInstance, iArr);
        asDoubleObj.getInstance(setErrorCode.cca_continue(iArr, iArr, iArr) + setErrorCode.configure(requestTimeout.getInstance, iArr), iArr);
        int[] iArr2 = new int[8];
        asDoubleObj.Cardinal(asdouble3.getInstance, iArr2);
        int[] iArr3 = new int[8];
        asDoubleObj.cca_continue(iArr2, asdouble3.getInstance, iArr3);
        int[] iArr4 = new int[8];
        asDoubleObj.cca_continue(iArr3, asdouble2.getInstance, iArr4);
        asDoubleObj.Cardinal(iArr4, iArr4);
        int[] iArr5 = new int[8];
        asDoubleObj.getInstance(iArr3, iArr5);
        asDoubleObj.Cardinal(iArr5, iArr5);
        asDouble asdouble5 = new asDouble(iArr3);
        asDoubleObj.getInstance(iArr, asdouble5.getInstance);
        asDoubleObj.Cardinal(asdouble5.getInstance, iArr4, asdouble5.getInstance);
        asDoubleObj.Cardinal(asdouble5.getInstance, iArr4, asdouble5.getInstance);
        asDouble asdouble6 = new asDouble(iArr4);
        asDoubleObj.Cardinal(iArr4, asdouble5.getInstance, asdouble6.getInstance);
        asDoubleObj.cca_continue(asdouble6.getInstance, iArr, asdouble6.getInstance);
        asDoubleObj.Cardinal(asdouble6.getInstance, iArr5, asdouble6.getInstance);
        asDouble asdouble7 = new asDouble(iArr2);
        if (!setErrorCode.init(asdouble4.getInstance)) {
            asDoubleObj.cca_continue(asdouble7.getInstance, asdouble4.getInstance, asdouble7.getInstance);
        }
        if (z) {
            asdouble = new asDouble(iArr5);
            asDoubleObj.cca_continue(asdouble.getInstance, requestTimeout.getInstance, asdouble.getInstance);
            asDoubleObj.Cardinal(asdouble.getInstance, asdouble.getInstance);
        } else {
            asdouble = null;
        }
        return new asString(configure(), asdouble5, asdouble6, new merge[]{asdouble7, asdouble}, this.Cardinal);
    }
}
