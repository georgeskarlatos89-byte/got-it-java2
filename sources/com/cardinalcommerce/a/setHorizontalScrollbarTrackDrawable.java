package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class setHorizontalScrollbarTrackDrawable extends setVerticalScrollbarPosition {
    private final JWK Cardinal;
    private final Base64URL cleanup;
    private final URI configure;
    private final String getSDKVersion;
    private final URI getWarnings;
    private final Base64URL onCReqSuccess;
    private final List<Base64> onValidated;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setHorizontalScrollbarTrackDrawable(setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, setScrollIndicators setscrollindicators, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, Map<String, Object> map, Base64URL base64URL3) {
        super(setverticalscrollbartrackdrawable, setscrollindicators, str, set, map, base64URL3);
        List<Base64> list2 = list;
        this.configure = uri;
        this.Cardinal = jwk;
        this.getWarnings = uri2;
        this.cleanup = base64URL;
        this.onCReqSuccess = base64URL2;
        if (list2 != null) {
            this.onValidated = Collections.unmodifiableList(new ArrayList(list2));
        } else {
            this.onValidated = null;
        }
        this.getSDKVersion = str2;
    }

    public List<Base64> cca_continue() {
        return this.onValidated;
    }

    public JSONObject Cardinal() {
        JSONObject Cardinal2 = super.Cardinal();
        URI uri = this.configure;
        if (uri != null) {
            Cardinal2.put("jku", uri.toString());
        }
        JWK jwk = this.Cardinal;
        if (jwk != null) {
            Cardinal2.put("jwk", jwk.cca_continue());
        }
        URI uri2 = this.getWarnings;
        if (uri2 != null) {
            Cardinal2.put("x5u", uri2.toString());
        }
        Base64URL base64URL = this.cleanup;
        if (base64URL != null) {
            Cardinal2.put("x5t", base64URL.toString());
        }
        Base64URL base64URL2 = this.onCReqSuccess;
        if (base64URL2 != null) {
            Cardinal2.put("x5t#S256", base64URL2.toString());
        }
        List<Base64> list = this.onValidated;
        if (list != null && !list.isEmpty()) {
            Cardinal2.put("x5c", this.onValidated);
        }
        String str = this.getSDKVersion;
        if (str != null) {
            Cardinal2.put("kid", str);
        }
        return Cardinal2;
    }
}
