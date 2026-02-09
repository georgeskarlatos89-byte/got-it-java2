package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONValue;
import java.io.IOException;
import java.io.Reader;

public class getButtonText extends getHeaderText {
    private Reader getSDKVersion;

    public getButtonText(int i) {
        super(i);
    }

    public final Object getInstance(Reader reader) throws getToolbarCustomization {
        setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = JSONValue.defaultReader.Cardinal;
        this.getInstance = setverticalscrollbarthumbdrawable.valueOf;
        this.getSDKVersion = reader;
        return super.Cardinal(setverticalscrollbarthumbdrawable);
    }

    public final <T> T getInstance(Reader reader, setVerticalScrollbarThumbDrawable<T> setverticalscrollbarthumbdrawable) throws getToolbarCustomization {
        this.getInstance = setverticalscrollbarthumbdrawable.valueOf;
        this.getSDKVersion = reader;
        return super.Cardinal(setverticalscrollbarthumbdrawable);
    }

    /* access modifiers changed from: protected */
    public final void getInstance() throws IOException {
        int read = this.getSDKVersion.read();
        this.init = read == -1 ? 26 : (char) read;
        this.onValidated++;
    }

    /* access modifiers changed from: protected */
    public final void onCReqSuccess() throws IOException {
        this.cca_continue.configure(this.init);
        int read = this.getSDKVersion.read();
        if (read == -1) {
            this.init = 26;
            return;
        }
        this.init = (char) read;
        this.onValidated++;
    }

    /* access modifiers changed from: protected */
    public final void cca_continue() throws getToolbarCustomization, IOException {
        int read = this.getSDKVersion.read();
        if (read != -1) {
            this.init = (char) read;
            return;
        }
        throw new getToolbarCustomization(this.onValidated - 1, 3, "EOF");
    }
}
