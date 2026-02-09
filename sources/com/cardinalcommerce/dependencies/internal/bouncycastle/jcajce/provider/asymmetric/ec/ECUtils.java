package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec;

import com.cardinalcommerce.a.DSAUtil;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.X509CRLObject;
import com.cardinalcommerce.a.isEnabledVisaCheckout;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.a.setUiType;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;

class ECUtils {
    ECUtils() {
    }

    static GMCipherSpi configure(String str) {
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                return ECUtil.getInstance(new ASN1ObjectIdentifier(str));
            }
            if (str.indexOf(32) > 0) {
                str = str.substring(str.indexOf(32) + 1);
            }
            return ECUtil.Cardinal(str);
        } catch (IllegalArgumentException unused) {
            return ECUtil.Cardinal(str);
        }
    }

    static GMCipherSpi getInstance(ECGenParameterSpec eCGenParameterSpec) {
        return configure(eCGenParameterSpec.getName());
    }

    static setCCAImageUri cca_continue(PublicKey publicKey) throws InvalidKeyException {
        return publicKey instanceof BCECPublicKey ? ((BCECPublicKey) publicKey).cca_continue : ECUtil.init(publicKey);
    }

    static DSAUtil cca_continue(ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec instanceof X509CRLObject) {
            X509CRLObject x509CRLObject = (X509CRLObject) eCParameterSpec;
            ASN1ObjectIdentifier cca_continue = ECUtil.cca_continue(x509CRLObject.cca_continue);
            if (cca_continue == null) {
                cca_continue = new ASN1ObjectIdentifier(x509CRLObject.cca_continue);
            }
            return new DSAUtil(cca_continue);
        } else if (eCParameterSpec == null) {
            return new DSAUtil((setUiType) isEnabledVisaCheckout.configure);
        } else {
            toJSONString instance = EC5Util.getInstance(eCParameterSpec.getCurve());
            return new DSAUtil(new GMCipherSpi(instance, EC5Util.cca_continue(instance, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
    }
}
