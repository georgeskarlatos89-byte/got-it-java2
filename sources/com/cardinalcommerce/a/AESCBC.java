package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;

public final class AESCBC extends JSONNavi.init {
    public AESCBC(toJSONString tojsonstring, merge merge, merge merge2) {
        this(tojsonstring, merge, merge2, false);
    }

    public AESCBC(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
        super(tojsonstring, merge, merge2);
        if ((merge == null) == (merge2 != null ? false : true)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    AESCBC(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
        super(tojsonstring, merge, merge2, mergeArr);
        this.Cardinal = z;
    }

    public final boolean CardinalActionCode() {
        merge valueOf = valueOf();
        return !valueOf.onCReqSuccess() && CardinalEnvironment().values() != valueOf.values();
    }

    public final JSONNavi CardinalChallengeObserver() {
        if (getString()) {
            return this;
        }
        merge merge = this.init;
        if (merge.onCReqSuccess()) {
            return this;
        }
        merge merge2 = this.cca_continue;
        merge merge3 = this.getInstance[0];
        toJSONString tojsonstring = this.configure;
        merge[] mergeArr = {merge3};
        return new AESCBC(tojsonstring, merge, merge2.cca_continue(merge3), mergeArr, this.Cardinal);
    }

    public final merge getSDKVersion() {
        merge merge = this.init;
        merge merge2 = this.cca_continue;
        if (getString() || merge.onCReqSuccess()) {
            return merge2;
        }
        merge init = merge2.cca_continue(merge).init(merge);
        merge merge3 = this.getInstance[0];
        return !merge3.cleanup() ? init.getInstance(merge3) : init;
    }

    public final JSONNavi init() {
        return new AESCBC((toJSONString) null, onCReqSuccess(), getWarnings());
    }

    public final JSONNavi cca_continue(JSONNavi jSONNavi) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        boolean z;
        DirectEncrypter directEncrypter;
        DirectEncrypter directEncrypter2;
        DirectEncrypter directEncrypter3;
        boolean z2;
        JSONNavi jSONNavi2 = jSONNavi;
        if (getString()) {
            return jSONNavi2;
        }
        if (jSONNavi.getString()) {
            return this;
        }
        toJSONString configure = configure();
        DirectEncrypter directEncrypter4 = (DirectEncrypter) this.init;
        DirectEncrypter directEncrypter5 = (DirectEncrypter) jSONNavi.valueOf();
        if (directEncrypter4.onCReqSuccess()) {
            return directEncrypter5.onCReqSuccess() ? configure.init() : jSONNavi2.cca_continue(this);
        }
        DirectEncrypter directEncrypter6 = (DirectEncrypter) this.cca_continue;
        DirectEncrypter directEncrypter7 = (DirectEncrypter) this.getInstance[0];
        DirectEncrypter directEncrypter8 = (DirectEncrypter) jSONNavi.CardinalEnvironment();
        DirectEncrypter directEncrypter9 = (DirectEncrypter) jSONNavi2.getInstance(0);
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[9];
        long[] jArr7 = new long[9];
        long[] Cardinal = directEncrypter7.cleanup() ? null : ECDSAVerifier.Cardinal(directEncrypter7.Cardinal);
        if (Cardinal == null) {
            jArr = directEncrypter5.Cardinal;
            jArr2 = directEncrypter8.Cardinal;
        } else {
            ECDSAVerifier.Cardinal(directEncrypter5.Cardinal, Cardinal, jArr5);
            ECDSAVerifier.Cardinal(directEncrypter8.Cardinal, Cardinal, jArr7);
            jArr = jArr5;
            jArr2 = jArr7;
        }
        long[] Cardinal2 = directEncrypter9.cleanup() ? null : ECDSAVerifier.Cardinal(directEncrypter9.Cardinal);
        long[] jArr8 = directEncrypter4.Cardinal;
        if (Cardinal2 == null) {
            jArr3 = directEncrypter6.Cardinal;
        } else {
            ECDSAVerifier.Cardinal(jArr8, Cardinal2, jArr4);
            ECDSAVerifier.Cardinal(directEncrypter6.Cardinal, Cardinal2, jArr6);
            jArr8 = jArr4;
            jArr3 = jArr6;
        }
        ECDSAVerifier.configure(jArr3, jArr2, jArr6);
        ECDSAVerifier.configure(jArr8, jArr, jArr7);
        int i = 0;
        while (true) {
            if (i >= 9) {
                z = true;
                break;
            } else if (jArr7[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            int i2 = 0;
            while (true) {
                if (i2 >= 9) {
                    z2 = true;
                    break;
                } else if (jArr6[i2] != 0) {
                    z2 = false;
                    break;
                } else {
                    i2++;
                }
            }
            return z2 ? getActionCode() : configure.init();
        }
        if (directEncrypter5.onCReqSuccess()) {
            JSONNavi CardinalRenderType = CardinalRenderType();
            DirectEncrypter directEncrypter10 = (DirectEncrypter) CardinalRenderType.onValidated();
            merge sDKVersion = CardinalRenderType.getSDKVersion();
            merge instance = sDKVersion.cca_continue(directEncrypter8).getInstance(directEncrypter10);
            directEncrypter2 = (DirectEncrypter) instance.getInstance().cca_continue(instance).cca_continue(directEncrypter10).configure();
            if (directEncrypter2.onCReqSuccess()) {
                return new AESCBC(configure, directEncrypter2, AESGCM.getWarnings, this.Cardinal);
            }
            directEncrypter3 = (DirectEncrypter) configure.init(writeJSONString.CardinalRenderType);
            directEncrypter = (DirectEncrypter) instance.init(directEncrypter10.cca_continue(directEncrypter2)).cca_continue(directEncrypter2).cca_continue(sDKVersion).getInstance(directEncrypter2).cca_continue(directEncrypter2);
        } else {
            ECDSAVerifier.Cardinal(jArr7, jArr7);
            long[] Cardinal3 = ECDSAVerifier.Cardinal(jArr6);
            ECDSAVerifier.Cardinal(jArr8, Cardinal3, jArr4);
            ECDSAVerifier.Cardinal(jArr, Cardinal3, jArr5);
            DirectEncrypter directEncrypter11 = new DirectEncrypter(jArr4);
            ECDSAVerifier.getInstance(jArr4, jArr5, directEncrypter11.Cardinal);
            if (directEncrypter11.onCReqSuccess()) {
                return new AESCBC(configure, directEncrypter11, AESGCM.getWarnings, this.Cardinal);
            }
            DirectEncrypter directEncrypter12 = new DirectEncrypter(jArr6);
            ECDSAVerifier.Cardinal(jArr7, Cardinal3, directEncrypter12.Cardinal);
            if (Cardinal2 != null) {
                ECDSAVerifier.Cardinal(directEncrypter12.Cardinal, Cardinal2, directEncrypter12.Cardinal);
            }
            long[] jArr9 = new long[18];
            ECDSAVerifier.configure(jArr5, jArr7, jArr7);
            ECDSAVerifier.onCReqSuccess(jArr7, jArr9);
            ECDSAVerifier.configure(directEncrypter6.Cardinal, directEncrypter7.Cardinal, jArr7);
            ECDSAVerifier.init(jArr7, directEncrypter12.Cardinal, jArr9);
            DirectEncrypter directEncrypter13 = new DirectEncrypter(jArr7);
            ECDSAVerifier.init(jArr9, directEncrypter13.Cardinal);
            if (Cardinal != null) {
                ECDSAVerifier.Cardinal(directEncrypter12.Cardinal, Cardinal, directEncrypter12.Cardinal);
            }
            directEncrypter2 = directEncrypter11;
            directEncrypter = directEncrypter13;
            directEncrypter3 = directEncrypter12;
        }
        return new AESCBC(configure, directEncrypter2, directEncrypter, new merge[]{directEncrypter3}, this.Cardinal);
    }

    public final JSONNavi getActionCode() {
        long[] jArr;
        boolean z;
        if (getString()) {
            return this;
        }
        toJSONString configure = configure();
        DirectEncrypter directEncrypter = (DirectEncrypter) this.init;
        if (directEncrypter.onCReqSuccess()) {
            return configure.init();
        }
        DirectEncrypter directEncrypter2 = (DirectEncrypter) this.cca_continue;
        DirectEncrypter directEncrypter3 = (DirectEncrypter) this.getInstance[0];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        long[] Cardinal = directEncrypter3.cleanup() ? null : ECDSAVerifier.Cardinal(directEncrypter3.Cardinal);
        long[] jArr4 = directEncrypter2.Cardinal;
        if (Cardinal == null) {
            jArr = directEncrypter3.Cardinal;
        } else {
            ECDSAVerifier.Cardinal(jArr4, Cardinal, jArr2);
            ECDSAVerifier.Cardinal(directEncrypter3.Cardinal, jArr3);
            jArr4 = jArr2;
            jArr = jArr3;
        }
        long[] jArr5 = new long[9];
        ECDSAVerifier.Cardinal(directEncrypter2.Cardinal, jArr5);
        ECDSAVerifier.cca_continue(jArr4, jArr, jArr5);
        int i = 0;
        while (true) {
            if (i >= 9) {
                z = true;
                break;
            } else if (jArr5[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return new AESCBC(configure, new DirectEncrypter(jArr5), AESGCM.getWarnings, this.Cardinal);
        }
        long[] jArr6 = new long[18];
        ECDSAVerifier.init(jArr5, jArr4, jArr6);
        DirectEncrypter directEncrypter4 = new DirectEncrypter(jArr2);
        ECDSAVerifier.Cardinal(jArr5, directEncrypter4.Cardinal);
        DirectEncrypter directEncrypter5 = new DirectEncrypter(jArr5);
        if (Cardinal != null) {
            ECDSAVerifier.getInstance(directEncrypter5.Cardinal, jArr, directEncrypter5.Cardinal);
        }
        long[] jArr7 = directEncrypter.Cardinal;
        if (Cardinal != null) {
            ECDSAVerifier.Cardinal(jArr7, Cardinal, jArr3);
            jArr7 = jArr3;
        }
        ECDSAVerifier.onCReqSuccess(jArr7, jArr6);
        ECDSAVerifier.init(jArr6, jArr3);
        ECDSAVerifier.cca_continue(directEncrypter4.Cardinal, directEncrypter5.Cardinal, jArr3);
        return new AESCBC(configure, directEncrypter4, new DirectEncrypter(jArr3), new merge[]{directEncrypter5}, this.Cardinal);
    }

    public final JSONNavi configure(JSONNavi jSONNavi) {
        boolean z;
        boolean z2;
        boolean z3;
        JSONNavi jSONNavi2 = jSONNavi;
        if (getString()) {
            return jSONNavi2;
        }
        if (jSONNavi.getString()) {
            return getActionCode();
        }
        toJSONString configure = configure();
        DirectEncrypter directEncrypter = (DirectEncrypter) this.init;
        if (directEncrypter.onCReqSuccess()) {
            return jSONNavi2;
        }
        DirectEncrypter directEncrypter2 = (DirectEncrypter) jSONNavi.valueOf();
        DirectEncrypter directEncrypter3 = (DirectEncrypter) jSONNavi2.getInstance(0);
        if (directEncrypter2.onCReqSuccess() || !directEncrypter3.cleanup()) {
            return getActionCode().cca_continue(jSONNavi2);
        }
        DirectEncrypter directEncrypter4 = (DirectEncrypter) this.cca_continue;
        DirectEncrypter directEncrypter5 = (DirectEncrypter) this.getInstance[0];
        DirectEncrypter directEncrypter6 = (DirectEncrypter) jSONNavi.CardinalEnvironment();
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        ECDSAVerifier.Cardinal(directEncrypter.Cardinal, jArr);
        ECDSAVerifier.Cardinal(directEncrypter4.Cardinal, jArr2);
        ECDSAVerifier.Cardinal(directEncrypter5.Cardinal, jArr3);
        ECDSAVerifier.getInstance(directEncrypter4.Cardinal, directEncrypter5.Cardinal, jArr4);
        ECDSAVerifier.cca_continue(jArr3, jArr2, jArr4);
        long[] Cardinal = ECDSAVerifier.Cardinal(jArr3);
        ECDSAVerifier.Cardinal(directEncrypter6.Cardinal, Cardinal, jArr3);
        ECDSAVerifier.configure(jArr3, jArr2, jArr3);
        long[] jArr5 = new long[18];
        ECDSAVerifier.init(jArr3, jArr4, jArr5);
        ECDSAVerifier.cleanup(jArr, Cardinal, jArr5);
        ECDSAVerifier.init(jArr5, jArr3);
        ECDSAVerifier.Cardinal(directEncrypter2.Cardinal, Cardinal, jArr);
        ECDSAVerifier.configure(jArr, jArr4, jArr2);
        ECDSAVerifier.Cardinal(jArr2, jArr2);
        int i = 0;
        while (true) {
            z = true;
            if (i >= 9) {
                z2 = true;
                break;
            } else if (jArr2[i] != 0) {
                z2 = false;
                break;
            } else {
                i++;
            }
        }
        if (z2) {
            int i2 = 0;
            while (true) {
                if (i2 >= 9) {
                    break;
                } else if (jArr3[i2] != 0) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            return z ? jSONNavi.getActionCode() : configure.init();
        }
        int i3 = 0;
        while (true) {
            if (i3 >= 9) {
                z3 = true;
                break;
            } else if (jArr3[i3] != 0) {
                z3 = false;
                break;
            } else {
                i3++;
            }
        }
        if (z3) {
            return new AESCBC(configure, new DirectEncrypter(jArr3), AESGCM.getWarnings, this.Cardinal);
        }
        DirectEncrypter directEncrypter7 = new DirectEncrypter();
        ECDSAVerifier.Cardinal(jArr3, directEncrypter7.Cardinal);
        ECDSAVerifier.getInstance(directEncrypter7.Cardinal, jArr, directEncrypter7.Cardinal);
        DirectEncrypter directEncrypter8 = new DirectEncrypter(jArr);
        ECDSAVerifier.getInstance(jArr3, jArr2, directEncrypter8.Cardinal);
        ECDSAVerifier.Cardinal(directEncrypter8.Cardinal, Cardinal, directEncrypter8.Cardinal);
        DirectEncrypter directEncrypter9 = new DirectEncrypter(jArr2);
        ECDSAVerifier.configure(jArr3, jArr2, directEncrypter9.Cardinal);
        ECDSAVerifier.Cardinal(directEncrypter9.Cardinal, directEncrypter9.Cardinal);
        for (int i4 = 0; i4 < 18; i4++) {
            jArr5[i4] = 0;
        }
        ECDSAVerifier.init(directEncrypter9.Cardinal, jArr4, jArr5);
        ECDSAVerifier.configure(directEncrypter6.Cardinal, jArr4);
        ECDSAVerifier.init(jArr4, directEncrypter8.Cardinal, jArr5);
        ECDSAVerifier.init(jArr5, directEncrypter9.Cardinal);
        return new AESCBC(configure, directEncrypter7, directEncrypter9, new merge[]{directEncrypter8}, this.Cardinal);
    }
}
