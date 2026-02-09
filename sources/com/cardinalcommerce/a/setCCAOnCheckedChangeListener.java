package com.cardinalcommerce.a;

public final class setCCAOnCheckedChangeListener extends setPadding {
    public final byte[] Cardinal;
    private final int cca_continue;
    public final setFocusableInTouchMode configure;
    public final byte[] getInstance;

    public static class init {
        public byte[] Cardinal = null;
        final setFocusableInTouchMode cca_continue;
        byte[] configure = null;
        public byte[] getInstance = null;

        public init(setFocusableInTouchMode setfocusableintouchmode) {
            this.cca_continue = setfocusableintouchmode;
        }
    }

    public /* synthetic */ setCCAOnCheckedChangeListener(init init2, byte b) {
        this(init2);
    }

    private setCCAOnCheckedChangeListener(init init2) {
        super(false, init2.cca_continue.getInstance.configure.cca_continue.configure());
        setFocusableInTouchMode setfocusableintouchmode = init2.cca_continue;
        this.configure = setfocusableintouchmode;
        if (setfocusableintouchmode != null) {
            int i = setfocusableintouchmode.getInstance.configure.getInstance;
            byte[] bArr = init2.configure;
            if (bArr == null) {
                if (setfocusableintouchmode.configure != null) {
                    this.cca_continue = setfocusableintouchmode.configure.Cardinal();
                } else {
                    this.cca_continue = 0;
                }
                byte[] bArr2 = init2.Cardinal;
                if (bArr2 == null) {
                    this.getInstance = new byte[i];
                } else if (bArr2.length == i) {
                    this.getInstance = bArr2;
                } else {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                byte[] bArr3 = init2.getInstance;
                if (bArr3 == null) {
                    this.Cardinal = new byte[i];
                } else if (bArr3.length == i) {
                    this.Cardinal = bArr3;
                } else {
                    throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
                }
            } else if (bArr.length == i + i) {
                this.cca_continue = 0;
                this.getInstance = setCCAFocusableInTouchMode.configure(bArr, 0, i);
                this.Cardinal = setCCAFocusableInTouchMode.configure(bArr, i, i);
            } else {
                int i2 = i + 4;
                if (bArr.length == i2 + i) {
                    this.cca_continue = setTextFontSize.getInstance(bArr, 0);
                    this.getInstance = setCCAFocusableInTouchMode.configure(bArr, 4, i);
                    this.Cardinal = setCCAFocusableInTouchMode.configure(bArr, i2, i);
                    return;
                }
                throw new IllegalArgumentException("public key has wrong size");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    public final byte[] Cardinal() {
        byte[] bArr;
        int i = this.configure.getInstance.configure.getInstance;
        int i2 = this.cca_continue;
        int i3 = 0;
        if (i2 != 0) {
            bArr = new byte[(i + 4 + i)];
            setTextFontSize.init(i2, bArr, 0);
            i3 = 4;
        } else {
            bArr = new byte[(i + i)];
        }
        setCCAFocusableInTouchMode.Cardinal(bArr, this.getInstance, i3);
        setCCAFocusableInTouchMode.Cardinal(bArr, this.Cardinal, i3 + i);
        return bArr;
    }
}
