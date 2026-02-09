package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public class KeyUtil {
    public static byte[] cca_continue(BCDSAPrivateKey bCDSAPrivateKey, CardinalConfigurationParameters cardinalConfigurationParameters) {
        try {
            return cca_continue(new PrivateKeyInfo(bCDSAPrivateKey, cardinalConfigurationParameters.onCReqSuccess()));
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] cca_continue(PrivateKeyInfo privateKeyInfo) {
        try {
            return privateKeyInfo.configure("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] configure(BCDSAPrivateKey bCDSAPrivateKey, CardinalConfigurationParameters cardinalConfigurationParameters) {
        try {
            return getInstance(new SubjectPublicKeyInfo(bCDSAPrivateKey, cardinalConfigurationParameters));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getInstance(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return subjectPublicKeyInfo.configure("DER");
        } catch (Exception unused) {
            return null;
        }
    }
}
