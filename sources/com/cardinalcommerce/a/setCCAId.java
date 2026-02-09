package com.cardinalcommerce.a;

import com.cardinalcommerce.a.IESCipher;

public final class setCCAId {
    public final setFocusableInTouchMode Cardinal;
    public final int configure;
    public final int getInstance;
    final setCCAButtonDrawable init;

    public setCCAId(int i, int i2, IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
        this.configure = i;
        this.getInstance = i2;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        } else if (i % i2 == 0) {
            int i3 = i / i2;
            if (i3 != 1) {
                setFocusableInTouchMode setfocusableintouchmode = new setFocusableInTouchMode(i3, eCIESwithAESCBC);
                this.Cardinal = setfocusableintouchmode;
                this.init = setOnClickListener.getInstance(setfocusableintouchmode.getInstance.configure.cca_continue.configure(), setfocusableintouchmode.getInstance.configure.getInstance, setfocusableintouchmode.getInstance.configure.Cardinal, setfocusableintouchmode.getInstance.configure.configure, i, i2);
                return;
            }
            throw new IllegalArgumentException("height / layers must be greater than 1");
        } else {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
    }

    /* access modifiers changed from: protected */
    public final IESCipher.ECIESwithAESCBC init() {
        return this.Cardinal.getInstance.configure.cca_continue;
    }
}
