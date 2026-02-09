package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class newInstanceObject extends Sphincs256KeyFactorySpi {
    private AuthenticatedCipherText configure;
    private toJSONString init;

    public newInstanceObject(toJSONString tojsonstring, AuthenticatedCipherText authenticatedCipherText) {
        if (tojsonstring.onCReqSuccess() != null) {
            this.init = tojsonstring;
            this.configure = authenticatedCipherText;
            return;
        }
        throw new IllegalArgumentException("Need curve with known group order");
    }

    /* access modifiers changed from: protected */
    public final JSONNavi Cardinal(JSONNavi jSONNavi, BigInteger bigInteger) {
        JSONNavi[] jSONNaviArr;
        JSONNavi[] jSONNaviArr2;
        JSONNavi[] jSONNaviArr3;
        JSONNavi[] jSONNaviArr4;
        if (this.init.configure(jSONNavi.configure())) {
            BigInteger[] instance = this.configure.getInstance(bigInteger.mod(jSONNavi.configure().onCReqSuccess()));
            boolean z = false;
            BigInteger bigInteger2 = instance[0];
            BigInteger bigInteger3 = instance[1];
            JSONAwareEx Cardinal = this.configure.Cardinal();
            boolean z2 = bigInteger2.signum() < 0;
            if (bigInteger3.signum() < 0) {
                z = true;
            }
            BigInteger abs = bigInteger2.abs();
            BigInteger abs2 = bigInteger3.abs();
            int max = Math.max(2, Math.min(16, get.Cardinal(Math.max(abs.bitLength(), abs2.bitLength()))));
            JSONNavi instance2 = get.getInstance(jSONNavi, max, Cardinal);
            getDouble cca_continue = get.cca_continue(jSONNavi);
            getDouble cca_continue2 = get.cca_continue(instance2);
            if (z2) {
                jSONNaviArr = cca_continue.Cardinal;
            } else {
                jSONNaviArr = cca_continue.configure;
            }
            JSONNavi[] jSONNaviArr5 = jSONNaviArr;
            if (z) {
                jSONNaviArr2 = cca_continue2.Cardinal;
            } else {
                jSONNaviArr2 = cca_continue2.configure;
            }
            JSONNavi[] jSONNaviArr6 = jSONNaviArr2;
            if (z2) {
                jSONNaviArr3 = cca_continue.configure;
            } else {
                jSONNaviArr3 = cca_continue.Cardinal;
            }
            JSONNavi[] jSONNaviArr7 = jSONNaviArr3;
            if (z) {
                jSONNaviArr4 = cca_continue2.configure;
            } else {
                jSONNaviArr4 = cca_continue2.Cardinal;
            }
            return appendElement.init(jSONNaviArr5, jSONNaviArr7, get.getInstance(max, abs), jSONNaviArr6, jSONNaviArr4, get.getInstance(max, abs2));
        }
        throw new IllegalStateException();
    }
}
