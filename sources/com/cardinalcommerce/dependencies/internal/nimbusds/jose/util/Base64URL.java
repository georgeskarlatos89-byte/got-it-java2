package com.cardinalcommerce.dependencies.internal.nimbusds.jose.util;

import com.cardinalcommerce.a.setAllowedHandwritingDelegatePackage;
import com.cardinalcommerce.a.setPreferKeepClear;

public class Base64URL extends Base64 {
    public Base64URL(String str) {
        super(str);
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof Base64URL) && toString().equals(obj.toString());
    }

    public static Base64URL configure(String str) {
        if (str == null) {
            return null;
        }
        return new Base64URL(str);
    }

    public static Base64URL init(byte[] bArr) {
        return new Base64URL(setPreferKeepClear.configure(bArr));
    }

    public static Base64URL Cardinal(String str) {
        return new Base64URL(setPreferKeepClear.configure(str.getBytes(setAllowedHandwritingDelegatePackage.configure)));
    }
}
