package com.cardinalcommerce.a;

public final class root implements JSONAwareEx {
    private merge cca_continue;

    public root(merge merge) {
        this.cca_continue = merge;
    }

    public final JSONNavi Cardinal(JSONNavi jSONNavi) {
        return jSONNavi.configure(this.cca_continue);
    }
}
