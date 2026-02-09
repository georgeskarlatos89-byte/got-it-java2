package com.cardinalcommerce.a;

public final class setOnCheckedChangeListener extends setCCAVisibility {
    private final int Cardinal;
    public final setCCAId cca_continue;
    public final byte[] configure;
    public final byte[] init;

    public static class Cardinal {
        public byte[] Cardinal = null;
        final setCCAId cca_continue;
        byte[] configure = null;
        public byte[] init = null;

        public Cardinal(setCCAId setccaid) {
            this.cca_continue = setccaid;
        }
    }

    public /* synthetic */ setOnCheckedChangeListener(Cardinal cardinal, byte b) {
        this(cardinal);
    }

    private setOnCheckedChangeListener(Cardinal cardinal) {
        super(false, cardinal.cca_continue.init().configure());
        setCCAId setccaid = cardinal.cca_continue;
        this.cca_continue = setccaid;
        if (setccaid != null) {
            int i = setccaid.Cardinal.getInstance.configure.getInstance;
            byte[] bArr = cardinal.configure;
            if (bArr == null) {
                if (setccaid.init != null) {
                    this.Cardinal = setccaid.init.Cardinal();
                } else {
                    this.Cardinal = 0;
                }
                byte[] bArr2 = cardinal.init;
                if (bArr2 == null) {
                    this.init = new byte[i];
                } else if (bArr2.length == i) {
                    this.init = bArr2;
                } else {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                byte[] bArr3 = cardinal.Cardinal;
                if (bArr3 == null) {
                    this.configure = new byte[i];
                } else if (bArr3.length == i) {
                    this.configure = bArr3;
                } else {
                    throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
                }
            } else if (bArr.length == i + i) {
                this.Cardinal = 0;
                this.init = setCCAFocusableInTouchMode.configure(bArr, 0, i);
                this.configure = setCCAFocusableInTouchMode.configure(bArr, i, i);
            } else {
                int i2 = i + 4;
                if (bArr.length == i2 + i) {
                    this.Cardinal = setTextFontSize.getInstance(bArr, 0);
                    this.init = setCCAFocusableInTouchMode.configure(bArr, 4, i);
                    this.configure = setCCAFocusableInTouchMode.configure(bArr, i2, i);
                    return;
                }
                throw new IllegalArgumentException("public key has wrong size");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    public final byte[] init() {
        byte[] bArr;
        int i = this.cca_continue.Cardinal.getInstance.configure.getInstance;
        int i2 = this.Cardinal;
        int i3 = 0;
        if (i2 != 0) {
            bArr = new byte[(i + 4 + i)];
            setTextFontSize.init(i2, bArr, 0);
            i3 = 4;
        } else {
            bArr = new byte[(i + i)];
        }
        setCCAFocusableInTouchMode.Cardinal(bArr, this.init, i3);
        setCCAFocusableInTouchMode.Cardinal(bArr, this.configure, i3 + i);
        return bArr;
    }
}
