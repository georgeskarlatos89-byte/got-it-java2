package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import lib.android.paypal.com.magnessdk.c;

public class getUiType extends getThreeDSRequestorAppURL {
    protected byte[] init;

    getUiType(byte[] bArr) {
        this.init = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = r0[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean Cardinal(int r3) {
        /*
            r2 = this;
            byte[] r0 = r2.init
            int r1 = r0.length
            if (r1 <= r3) goto L_0x0011
            byte r3 = r0[r3]
            r0 = 48
            if (r3 < r0) goto L_0x0011
            r0 = 57
            if (r3 > r0) goto L_0x0011
            r3 = 1
            return r3
        L_0x0011:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getUiType.Cardinal(int):boolean");
    }

    /* access modifiers changed from: package-private */
    public int Cardinal() {
        int length = this.init.length;
        return GM.Mappings.Cardinal(length) + 1 + length;
    }

    public final String cca_continue() {
        StringBuilder append;
        StringBuilder append2;
        String str;
        String instance = getTextFontSize.getInstance(this.init);
        if (instance.charAt(instance.length() - 1) == 'Z') {
            append2 = new StringBuilder().append(instance.substring(0, instance.length() - 1));
            str = "GMT+00:00";
        } else {
            int length = instance.length() - 5;
            char charAt = instance.charAt(length);
            if (charAt == '-' || charAt == '+') {
                int i = length + 3;
                append = new StringBuilder().append(instance.substring(0, length)).append("GMT").append(instance.substring(length, i)).append(CertificateUtil.DELIMITER).append(instance.substring(i));
                return append.toString();
            }
            int length2 = instance.length() - 3;
            char charAt2 = instance.charAt(length2);
            if (charAt2 == '-' || charAt2 == '+') {
                append2 = new StringBuilder().append(instance.substring(0, length2)).append("GMT").append(instance.substring(length2));
                str = ":00";
            } else {
                append2 = new StringBuilder().append(instance);
                str = CardinalError();
            }
        }
        append = append2.append(str);
        return append.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean cleanup() {
        return Cardinal(10) && Cardinal(11);
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof getUiType)) {
            return false;
        }
        return getBackgroundColor.Cardinal(this.init, ((getUiType) getthreedsrequestorappurl).init);
    }

    /* access modifiers changed from: package-private */
    public final getThreeDSRequestorAppURL getWarnings() {
        return new getDeviceFingerprintUrl(this.init);
    }

    public int hashCode() {
        return getBackgroundColor.init(this.init);
    }

    /* access modifiers changed from: protected */
    public final boolean init() {
        int i = 0;
        while (true) {
            byte[] bArr = this.init;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onValidated() {
        return Cardinal(12) && Cardinal(13);
    }

    private String CardinalError() {
        String str;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (((i * 60) * 60) * 1000)) / c.b.q;
        try {
            if (timeZone.useDaylightTime() && timeZone.inDaylightTime(getInstance())) {
                i += str.equals("+") ? 1 : -1;
            }
        } catch (ParseException unused) {
        }
        return new StringBuilder("GMT").append(str).append(i < 10 ? "0".concat(String.valueOf(i)) : Integer.toString(i)).append(CertificateUtil.DELIMITER).append(i2 < 10 ? "0".concat(String.valueOf(i2)) : Integer.toString(i2)).toString();
    }

    public final Date getInstance() throws ParseException {
        SimpleDateFormat simpleDateFormat;
        String obj;
        StringBuilder sb;
        SimpleDateFormat simpleDateFormat2;
        SimpleDateFormat simpleDateFormat3;
        String instance = getTextFontSize.getInstance(this.init);
        if (instance.endsWith("Z")) {
            if (init()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'");
            } else {
                if (Cardinal(12) && Cardinal(13)) {
                    simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
                } else {
                    simpleDateFormat = Cardinal(10) && Cardinal(11) ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'");
                }
            }
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (instance.indexOf(45) > 0 || instance.indexOf(43) > 0) {
            instance = cca_continue();
            if (init()) {
                simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");
            } else {
                if (Cardinal(12) && Cardinal(13)) {
                    simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHHmmssz");
                } else {
                    simpleDateFormat2 = Cardinal(10) && Cardinal(11) ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
                }
            }
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else {
            if (init()) {
                simpleDateFormat3 = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            } else {
                if (Cardinal(12) && Cardinal(13)) {
                    simpleDateFormat3 = new SimpleDateFormat("yyyyMMddHHmmss");
                } else {
                    simpleDateFormat3 = Cardinal(10) && Cardinal(11) ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
                }
            }
            simpleDateFormat = simpleDateFormat3;
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (init()) {
            String substring = instance.substring(14);
            int i = 1;
            while (i < substring.length() && '0' <= (r5 = substring.charAt(i)) && r5 <= '9') {
                i++;
            }
            int i2 = i - 1;
            if (i2 > 3) {
                obj = new StringBuilder().append(substring.substring(0, 4)).append(substring.substring(i)).toString();
                sb = new StringBuilder();
            } else if (i2 == 1) {
                obj = new StringBuilder().append(substring.substring(0, i)).append("00").append(substring.substring(i)).toString();
                sb = new StringBuilder();
            } else if (i2 == 2) {
                obj = new StringBuilder().append(substring.substring(0, i)).append("0").append(substring.substring(i)).toString();
                sb = new StringBuilder();
            }
            instance = sb.append(instance.substring(0, 14)).append(obj).toString();
        }
        return DSA.init(simpleDateFormat.parse(instance));
    }

    /* access modifiers changed from: package-private */
    public void getInstance(getRenderType getrendertype) throws IOException {
        byte[] bArr = this.init;
        getrendertype.getInstance(24);
        getrendertype.configure(bArr.length);
        getrendertype.configure.write(bArr);
    }
}
