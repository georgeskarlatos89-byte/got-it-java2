package com.cardinalcommerce.a;

import com.cardinalcommerce.a.setCCAOnFocusChangeListener;

final class setCCAText extends setCCAOnFocusChangeListener {
    final int cca_continue;
    final int getInstance;
    final int init;

    public static class init extends setCCAOnFocusChangeListener.init<init> {
        int Cardinal = 0;
        int configure = 0;
        int init = 0;

        protected init() {
            super(1);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ setCCAOnFocusChangeListener.init init() {
            return this;
        }
    }

    /* synthetic */ setCCAText(init init2, byte b) {
        this(init2);
    }

    /* access modifiers changed from: protected */
    public final byte[] Cardinal() {
        byte[] Cardinal = super.Cardinal();
        setTextFontSize.init(this.cca_continue, Cardinal, 16);
        setTextFontSize.init(this.getInstance, Cardinal, 20);
        setTextFontSize.init(this.init, Cardinal, 24);
        return Cardinal;
    }

    private setCCAText(init init2) {
        super(init2);
        this.cca_continue = init2.init;
        this.getInstance = init2.configure;
        this.init = init2.Cardinal;
    }
}
