package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.a.setAllowedHandwritingDelegatePackage;
import com.cardinalcommerce.a.setAllowedHandwritingDelegatorPackage;
import com.cardinalcommerce.a.setPreferKeepClear;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.io.Serializable;

public final class Payload implements Serializable {
    private final byte[] Cardinal;
    private final String cca_continue;
    private final JWSObject cleanup;
    private final JSONObject configure;
    final Base64URL getInstance;
    private final setAllowedHandwritingDelegatorPackage getSDKVersion;
    private final getInstance init;

    public enum getInstance {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    public Payload(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.configure = jSONObject;
            this.cca_continue = null;
            this.Cardinal = null;
            this.getInstance = null;
            this.cleanup = null;
            this.getSDKVersion = null;
            this.init = getInstance.JSON;
            return;
        }
        throw new IllegalArgumentException("The JSON object must not be null");
    }

    public Payload(String str) {
        if (str != null) {
            this.configure = null;
            this.cca_continue = str;
            this.Cardinal = null;
            this.getInstance = null;
            this.cleanup = null;
            this.getSDKVersion = null;
            this.init = getInstance.STRING;
            return;
        }
        throw new IllegalArgumentException("The string must not be null");
    }

    public Payload(byte[] bArr) {
        if (bArr != null) {
            this.configure = null;
            this.cca_continue = null;
            this.Cardinal = bArr;
            this.getInstance = null;
            this.cleanup = null;
            this.getSDKVersion = null;
            this.init = getInstance.BYTE_ARRAY;
            return;
        }
        throw new IllegalArgumentException("The byte array must not be null");
    }

    public Payload(Base64URL base64URL) {
        if (base64URL != null) {
            this.configure = null;
            this.cca_continue = null;
            this.Cardinal = null;
            this.getInstance = base64URL;
            this.cleanup = null;
            this.getSDKVersion = null;
            this.init = getInstance.BASE64URL;
            return;
        }
        throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
    }

    public final String toString() {
        String str = this.cca_continue;
        if (str != null) {
            return str;
        }
        JWSObject jWSObject = this.cleanup;
        if (jWSObject == null) {
            JSONObject jSONObject = this.configure;
            if (jSONObject != null) {
                return jSONObject.toString();
            }
            byte[] bArr = this.Cardinal;
            if (bArr == null) {
                Base64URL base64URL = this.getInstance;
                if (base64URL != null) {
                    return new String(setPreferKeepClear.cca_continue(base64URL.cca_continue), setAllowedHandwritingDelegatePackage.configure);
                }
                return null;
            } else if (bArr != null) {
                return new String(bArr, setAllowedHandwritingDelegatePackage.configure);
            } else {
                return null;
            }
        } else if (jWSObject.init() != null) {
            return this.cleanup.init();
        } else {
            JWSObject jWSObject2 = this.cleanup;
            if (jWSObject2.getInstance == JWSObject.getInstance.SIGNED || jWSObject2.getInstance == JWSObject.getInstance.VERIFIED) {
                return new StringBuilder().append(jWSObject2.Cardinal).append('.').append(jWSObject2.init.toString()).toString();
            }
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
    }

    public final byte[] getInstance() {
        byte[] bArr = this.Cardinal;
        if (bArr != null) {
            return bArr;
        }
        Base64URL base64URL = this.getInstance;
        if (base64URL != null) {
            return setPreferKeepClear.cca_continue(base64URL.cca_continue);
        }
        String obj = toString();
        if (obj != null) {
            return obj.getBytes(setAllowedHandwritingDelegatePackage.configure);
        }
        return null;
    }
}
