package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;

public abstract class CardinalUiType extends getThreeDSRequestorAppURL {
    protected final boolean cca_continue;
    protected final byte[] configure;
    protected final int init;

    /* access modifiers changed from: package-private */
    public final int Cardinal() throws IOException {
        return GM.Mappings.init(this.init) + GM.Mappings.Cardinal(this.configure.length) + this.configure.length;
    }

    public final int cca_continue() {
        return this.init;
    }

    public final boolean configure() {
        return this.cca_continue;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof CardinalUiType)) {
            return false;
        }
        CardinalUiType cardinalUiType = (CardinalUiType) getthreedsrequestorappurl;
        return this.cca_continue == cardinalUiType.cca_continue && this.init == cardinalUiType.init && getBackgroundColor.Cardinal(this.configure, cardinalUiType.configure);
    }

    public int hashCode() {
        return (this.cca_continue ^ this.init) ^ getBackgroundColor.init(this.configure) ? 1 : 0;
    }

    CardinalUiType(boolean z, int i, byte[] bArr) {
        byte[] bArr2;
        this.cca_continue = z;
        this.init = i;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.configure = bArr2;
    }

    public final byte[] getInstance() {
        byte[] bArr = this.configure;
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* access modifiers changed from: package-private */
    public void getInstance(getRenderType getrendertype) throws IOException {
        int i = this.cca_continue ? 96 : 64;
        int i2 = this.init;
        byte[] bArr = this.configure;
        getrendertype.Cardinal(i, i2);
        getrendertype.configure(bArr.length);
        getrendertype.configure.write(bArr);
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer("[");
        if (this.cca_continue) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.init));
        stringBuffer.append("]");
        if (this.configure != null) {
            stringBuffer.append(" #");
            str = getHeadingTextFontName.configure(this.configure);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
