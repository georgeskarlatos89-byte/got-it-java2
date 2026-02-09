package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;

public final class ExtendedData extends getThreeDSRequestorAppURL {
    private byte[] configure;

    ExtendedData(byte[] bArr) {
        this.configure = bArr;
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() {
        int length = this.configure.length;
        return GM.Mappings.Cardinal(length) + 1 + length;
    }

    public final String cca_continue() {
        String init = init();
        return (init.charAt(0) < '5' ? "20" : "19").concat(String.valueOf(init));
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof ExtendedData)) {
            return false;
        }
        return getBackgroundColor.Cardinal(this.configure, ((ExtendedData) getthreedsrequestorappurl).configure);
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        getrendertype.getInstance(23);
        int length = this.configure.length;
        getrendertype.configure(length);
        for (int i = 0; i != length; i++) {
            getrendertype.getInstance((int) this.configure[i]);
        }
    }

    public final int hashCode() {
        return getBackgroundColor.init(this.configure);
    }

    public final String init() {
        StringBuilder append;
        String substring;
        StringBuilder append2;
        StringBuilder append3;
        String str;
        String instance = getTextFontSize.getInstance(this.configure);
        if (instance.indexOf(45) >= 0 || instance.indexOf(43) >= 0) {
            int indexOf = instance.indexOf(45);
            if (indexOf < 0) {
                indexOf = instance.indexOf(43);
            }
            if (indexOf == instance.length() - 3) {
                instance = new StringBuilder().append(instance).append("00").toString();
            }
            if (indexOf == 10) {
                append = new StringBuilder().append(instance.substring(0, 10)).append("00GMT").append(instance.substring(10, 13)).append(CertificateUtil.DELIMITER);
                substring = instance.substring(13, 15);
            } else {
                append = new StringBuilder().append(instance.substring(0, 12)).append("GMT").append(instance.substring(12, 15)).append(CertificateUtil.DELIMITER);
                substring = instance.substring(15, 17);
            }
            append2 = append.append(substring);
        } else {
            if (instance.length() == 11) {
                append3 = new StringBuilder().append(instance.substring(0, 10));
                str = "00GMT+00:00";
            } else {
                append3 = new StringBuilder().append(instance.substring(0, 12));
                str = "GMT+00:00";
            }
            append2 = append3.append(str);
        }
        return append2.toString();
    }

    public final String toString() {
        return getTextFontSize.getInstance(this.configure);
    }
}
