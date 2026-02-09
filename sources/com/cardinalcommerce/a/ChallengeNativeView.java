package com.cardinalcommerce.a;

import com.cardinalcommerce.a.setCCAOnFocusChangeListener;

final class ChallengeNativeView extends setCCAOnFocusChangeListener {
    final int Cardinal;
    final int cca_continue;
    private final int getInstance;

    public static class cca_continue extends setCCAOnFocusChangeListener.init<cca_continue> {
        int cca_continue = 0;
        int init = 0;

        protected cca_continue() {
            super(2);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ setCCAOnFocusChangeListener.init init() {
            return this;
        }
    }

    /* synthetic */ ChallengeNativeView(cca_continue cca_continue2, byte b) {
        this(cca_continue2);
    }

    /* access modifiers changed from: protected */
    public final byte[] Cardinal() {
        byte[] Cardinal2 = super.Cardinal();
        setTextFontSize.init(this.getInstance, Cardinal2, 16);
        setTextFontSize.init(this.cca_continue, Cardinal2, 20);
        setTextFontSize.init(this.Cardinal, Cardinal2, 24);
        return Cardinal2;
    }

    private ChallengeNativeView(cca_continue cca_continue2) {
        super(cca_continue2);
        this.getInstance = 0;
        this.cca_continue = cca_continue2.init;
        this.Cardinal = cca_continue2.cca_continue;
    }
}
