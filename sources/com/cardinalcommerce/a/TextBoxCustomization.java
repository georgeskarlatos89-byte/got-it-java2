package com.cardinalcommerce.a;

public final class TextBoxCustomization extends setHeaderText {
    private byte[] CardinalEnvironment;

    public TextBoxCustomization(int i) {
        super(i);
    }

    public final <T> T configure(byte[] bArr, setVerticalScrollbarThumbDrawable<T> setverticalscrollbarthumbdrawable) throws getToolbarCustomization {
        this.getInstance = setverticalscrollbarthumbdrawable.valueOf;
        this.CardinalEnvironment = bArr;
        this.getSDKVersion = bArr.length;
        return Cardinal(setverticalscrollbarthumbdrawable);
    }

    /* access modifiers changed from: protected */
    public final void configure(int i, int i2) {
        this.configure = new String(this.CardinalEnvironment, i, i2 - i);
    }

    /* access modifiers changed from: protected */
    public final void init(int i, int i2) {
        byte[] bArr = this.CardinalEnvironment;
        while (i < i2 && bArr[i] <= 32) {
            i++;
        }
        while (i < i2 && bArr[i2 - 1] <= 32) {
            i2--;
        }
        this.configure = new String(this.CardinalEnvironment, i, i2 - i);
    }

    /* access modifiers changed from: protected */
    public final int Cardinal(char c, int i) {
        int i2 = i;
        while (i < this.getSDKVersion) {
            if (this.CardinalEnvironment[i2] == ((byte) c)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final void getInstance() {
        int i = this.onValidated + 1;
        this.onValidated = i;
        if (i >= this.getSDKVersion) {
            this.init = 26;
        } else {
            this.init = (char) this.CardinalEnvironment[this.onValidated];
        }
    }

    /* access modifiers changed from: protected */
    public final void onCReqSuccess() {
        int i = this.onValidated + 1;
        this.onValidated = i;
        if (i >= this.getSDKVersion) {
            this.init = 26;
        } else {
            this.init = (char) this.CardinalEnvironment[this.onValidated];
        }
    }

    /* access modifiers changed from: protected */
    public final void cca_continue() throws getToolbarCustomization {
        int i = this.onValidated + 1;
        this.onValidated = i;
        if (i < this.getSDKVersion) {
            this.init = (char) this.CardinalEnvironment[this.onValidated];
        } else {
            this.init = 26;
            throw new getToolbarCustomization(this.onValidated - 1, 3, "EOF");
        }
    }
}
