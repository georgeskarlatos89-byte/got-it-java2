package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONValue;

public final class ToolbarCustomization extends setHeaderText {
    private String CardinalRenderType;

    public ToolbarCustomization(int i) {
        super(i);
    }

    public final Object configure(String str) throws getToolbarCustomization {
        setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = JSONValue.defaultReader.Cardinal;
        this.getInstance = setverticalscrollbarthumbdrawable.valueOf;
        this.CardinalRenderType = str;
        this.getSDKVersion = str.length();
        return Cardinal(setverticalscrollbarthumbdrawable);
    }

    public final <T> T configure(String str, setVerticalScrollbarThumbDrawable<T> setverticalscrollbarthumbdrawable) throws getToolbarCustomization {
        this.getInstance = setverticalscrollbarthumbdrawable.valueOf;
        this.CardinalRenderType = str;
        this.getSDKVersion = str.length();
        return Cardinal(setverticalscrollbarthumbdrawable);
    }

    /* access modifiers changed from: protected */
    public final void configure(int i, int i2) {
        this.configure = this.CardinalRenderType.substring(i, i2);
    }

    /* access modifiers changed from: protected */
    public final void init(int i, int i2) {
        while (i < i2 - 1 && Character.isWhitespace(this.CardinalRenderType.charAt(i))) {
            i++;
        }
        while (true) {
            int i3 = i2 - 1;
            if (i3 <= i || !Character.isWhitespace(this.CardinalRenderType.charAt(i3))) {
                this.configure = this.CardinalRenderType.substring(i, i2);
            } else {
                i2--;
            }
        }
        this.configure = this.CardinalRenderType.substring(i, i2);
    }

    /* access modifiers changed from: protected */
    public final int Cardinal(char c, int i) {
        return this.CardinalRenderType.indexOf(c, i);
    }

    /* access modifiers changed from: protected */
    public final void getInstance() {
        int i = this.onValidated + 1;
        this.onValidated = i;
        if (i >= this.getSDKVersion) {
            this.init = 26;
        } else {
            this.init = this.CardinalRenderType.charAt(this.onValidated);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCReqSuccess() {
        int i = this.onValidated + 1;
        this.onValidated = i;
        if (i >= this.getSDKVersion) {
            this.init = 26;
        } else {
            this.init = this.CardinalRenderType.charAt(this.onValidated);
        }
    }

    /* access modifiers changed from: protected */
    public final void cca_continue() throws getToolbarCustomization {
        int i = this.onValidated + 1;
        this.onValidated = i;
        if (i < this.getSDKVersion) {
            this.init = this.CardinalRenderType.charAt(this.onValidated);
        } else {
            this.init = 26;
            throw new getToolbarCustomization(this.onValidated - 1, 3, "EOF");
        }
    }
}
