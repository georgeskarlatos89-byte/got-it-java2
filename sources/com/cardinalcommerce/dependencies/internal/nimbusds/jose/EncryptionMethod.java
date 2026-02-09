package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.a.setRevealOnFocusHint;
import com.cardinalcommerce.a.setVerticalScrollbarTrackDrawable;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;

public final class EncryptionMethod extends setVerticalScrollbarTrackDrawable {
    public static final EncryptionMethod Cardinal = new EncryptionMethod("A192CBC-HS384", setRevealOnFocusHint.OPTIONAL, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
    public static final EncryptionMethod cleanup = new EncryptionMethod("A192GCM", setRevealOnFocusHint.OPTIONAL, 192);
    public static final EncryptionMethod getSDKVersion = new EncryptionMethod("A128CBC+HS256", setRevealOnFocusHint.OPTIONAL, 256);
    public static final EncryptionMethod getWarnings = new EncryptionMethod("A256CBC+HS512", setRevealOnFocusHint.OPTIONAL, 512);
    public static final EncryptionMethod init = new EncryptionMethod("A128CBC-HS256", setRevealOnFocusHint.REQUIRED, 256);
    public static final EncryptionMethod onCReqSuccess = new EncryptionMethod("A256CBC-HS512", setRevealOnFocusHint.REQUIRED, 512);
    public static final EncryptionMethod onValidated = new EncryptionMethod("A128GCM", setRevealOnFocusHint.RECOMMENDED, 128);
    public static final EncryptionMethod valueOf = new EncryptionMethod("A256GCM", setRevealOnFocusHint.RECOMMENDED, 256);
    public final int getInstance;

    private EncryptionMethod(String str, setRevealOnFocusHint setrevealonfocushint, int i) {
        super(str, setrevealonfocushint);
        this.getInstance = i;
    }

    private EncryptionMethod(String str) {
        this(str, (setRevealOnFocusHint) null, 0);
    }

    public static EncryptionMethod init(String str) {
        EncryptionMethod encryptionMethod = init;
        if (str.equals(encryptionMethod.configure)) {
            return encryptionMethod;
        }
        EncryptionMethod encryptionMethod2 = Cardinal;
        if (str.equals(encryptionMethod2.configure)) {
            return encryptionMethod2;
        }
        EncryptionMethod encryptionMethod3 = onCReqSuccess;
        if (str.equals(encryptionMethod3.configure)) {
            return encryptionMethod3;
        }
        EncryptionMethod encryptionMethod4 = onValidated;
        if (str.equals(encryptionMethod4.configure)) {
            return encryptionMethod4;
        }
        EncryptionMethod encryptionMethod5 = cleanup;
        if (str.equals(encryptionMethod5.configure)) {
            return encryptionMethod5;
        }
        EncryptionMethod encryptionMethod6 = valueOf;
        if (str.equals(encryptionMethod6.configure)) {
            return encryptionMethod6;
        }
        EncryptionMethod encryptionMethod7 = getSDKVersion;
        if (str.equals(encryptionMethod7.configure)) {
            return encryptionMethod7;
        }
        EncryptionMethod encryptionMethod8 = getWarnings;
        if (str.equals(encryptionMethod8.configure)) {
            return encryptionMethod8;
        }
        return new EncryptionMethod(str);
    }
}
