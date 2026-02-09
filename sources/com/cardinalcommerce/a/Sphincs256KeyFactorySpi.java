package com.cardinalcommerce.a;

import java.math.BigInteger;

public abstract class Sphincs256KeyFactorySpi implements toString {
    /* access modifiers changed from: protected */
    public abstract JSONNavi Cardinal(JSONNavi jSONNavi, BigInteger bigInteger);

    public final JSONNavi cca_continue(JSONNavi jSONNavi, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || jSONNavi.getString()) {
            return jSONNavi.configure().init();
        }
        JSONNavi Cardinal = Cardinal(jSONNavi, bigInteger.abs());
        if (signum <= 0) {
            Cardinal = Cardinal.CardinalChallengeObserver();
        }
        if (Cardinal.init(false, false)) {
            return Cardinal;
        }
        throw new IllegalStateException("Invalid result");
    }
}
