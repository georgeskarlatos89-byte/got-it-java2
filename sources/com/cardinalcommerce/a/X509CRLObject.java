package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

public final class X509CRLObject extends ECParameterSpec {
    public String cca_continue;

    public X509CRLObject(String str, toJSONString tojsonstring, JSONNavi jSONNavi, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(configure(tojsonstring, bArr), EC5Util.cca_continue(jSONNavi), bigInteger, bigInteger2.intValue());
        this.cca_continue = str;
    }

    public X509CRLObject(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.cca_continue = str;
    }

    private static EllipticCurve configure(toJSONString tojsonstring, byte[] bArr) {
        ECField eCField;
        Base64 base64 = tojsonstring.cca_continue;
        if (base64.Cardinal() == 1) {
            eCField = new ECFieldFp(base64.configure());
        } else {
            JWTClaimsSet cca_continue2 = ((CompletionEvent) base64).cca_continue();
            int[] instance = cca_continue2.getInstance();
            eCField = new ECFieldF2m(cca_continue2.cca_continue(), getBackgroundColor.cca_continue(getBackgroundColor.getInstance(instance, instance.length - 1)));
        }
        return new EllipticCurve(eCField, tojsonstring.getSDKVersion().cca_continue(), tojsonstring.cleanup().cca_continue(), bArr);
    }
}
