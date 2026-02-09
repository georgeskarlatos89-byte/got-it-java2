package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JSONNavi;

public final class DirectDecrypter extends JSONNavi.init {
    public DirectDecrypter(toJSONString tojsonstring, merge merge, merge merge2) {
        this(tojsonstring, merge, merge2, false);
    }

    public DirectDecrypter(toJSONString tojsonstring, merge merge, merge merge2, boolean z) {
        super(tojsonstring, merge, merge2);
        if ((merge == null) == (merge2 != null ? false : true)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    DirectDecrypter(toJSONString tojsonstring, merge merge, merge merge2, merge[] mergeArr, boolean z) {
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
        return new DirectDecrypter(tojsonstring, merge, merge2.cca_continue(merge3), mergeArr, this.Cardinal);
    }

    public final JSONNavi configure(JSONNavi jSONNavi) {
        if (getString()) {
            return jSONNavi;
        }
        if (jSONNavi.getString()) {
            return getActionCode();
        }
        toJSONString configure = configure();
        merge merge = this.init;
        if (merge.onCReqSuccess()) {
            return jSONNavi;
        }
        merge valueOf = jSONNavi.valueOf();
        merge instance = jSONNavi.getInstance(0);
        if (valueOf.onCReqSuccess() || !instance.cleanup()) {
            return getActionCode().cca_continue(jSONNavi);
        }
        merge merge2 = this.cca_continue;
        merge merge3 = this.getInstance[0];
        merge CardinalEnvironment = jSONNavi.CardinalEnvironment();
        merge instance2 = merge.getInstance();
        merge instance3 = merge2.getInstance();
        merge instance4 = merge3.getInstance();
        merge cca_continue = instance3.cca_continue(merge2.init(merge3));
        merge configure2 = CardinalEnvironment.configure();
        merge Cardinal = configure2.init(instance4).cca_continue(instance3).Cardinal(cca_continue, instance2, instance4);
        merge init = valueOf.init(instance4);
        merge instance5 = init.cca_continue(cca_continue).getInstance();
        if (instance5.onCReqSuccess()) {
            return Cardinal.onCReqSuccess() ? jSONNavi.getActionCode() : configure.init();
        }
        if (Cardinal.onCReqSuccess()) {
            return new DirectDecrypter(configure, Cardinal, configure.cleanup(), this.Cardinal);
        }
        merge init2 = Cardinal.getInstance().init(init);
        merge init3 = Cardinal.init(instance5).init(instance4);
        return new DirectDecrypter(configure, init2, Cardinal.cca_continue(instance5).getInstance().Cardinal(cca_continue, configure2, init3), new merge[]{init3}, this.Cardinal);
    }

    public final JSONNavi getActionCode() {
        if (getString()) {
            return this;
        }
        toJSONString configure = configure();
        merge merge = this.init;
        if (merge.onCReqSuccess()) {
            return configure.init();
        }
        merge merge2 = this.cca_continue;
        merge merge3 = this.getInstance[0];
        boolean cleanup = merge3.cleanup();
        merge instance = cleanup ? merge3 : merge3.getInstance();
        merge cca_continue = cleanup ? merge2.getInstance().cca_continue(merge2) : merge2.cca_continue(merge3).init(merge2);
        if (cca_continue.onCReqSuccess()) {
            return new DirectDecrypter(configure, cca_continue, configure.cleanup(), this.Cardinal);
        }
        merge instance2 = cca_continue.getInstance();
        merge init = cleanup ? cca_continue : cca_continue.init(instance);
        merge instance3 = merge2.cca_continue(merge).getInstance();
        if (!cleanup) {
            merge3 = instance.getInstance();
        }
        return new DirectDecrypter(configure, instance2, instance3.cca_continue(cca_continue).cca_continue(instance).init(instance3).cca_continue(merge3).cca_continue(instance2).cca_continue(init), new merge[]{init}, this.Cardinal);
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
        return new DirectDecrypter((toJSONString) null, onCReqSuccess(), getWarnings());
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
            directEncrypter2 = (DirectEncrypter) instance.getInstance().cca_continue(instance).cca_continue(directEncrypter10);
            if (directEncrypter2.onCReqSuccess()) {
                return new DirectDecrypter(configure, directEncrypter2, configure.cleanup(), this.Cardinal);
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
                return new DirectDecrypter(configure, directEncrypter11, configure.cleanup(), this.Cardinal);
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
        return new DirectDecrypter(configure, directEncrypter2, directEncrypter, new merge[]{directEncrypter3}, this.Cardinal);
    }
}
