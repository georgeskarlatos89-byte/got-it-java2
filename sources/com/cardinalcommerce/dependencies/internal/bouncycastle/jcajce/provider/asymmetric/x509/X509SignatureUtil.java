package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.isEnabledVisaCheckout;
import com.cardinalcommerce.a.setUiType;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;

class X509SignatureUtil {
    private static final setUiType configure = isEnabledVisaCheckout.configure;

    X509SignatureUtil() {
    }

    static void Cardinal(Signature signature, CardinalConfigurationParameters cardinalConfigurationParameters) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (cardinalConfigurationParameters != null && !configure.equals(cardinalConfigurationParameters)) {
            AlgorithmParameters instance = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
            try {
                instance.init(cardinalConfigurationParameters.onCReqSuccess().getEncoded());
                if (signature.getAlgorithm().endsWith("MGF1")) {
                    try {
                        signature.setParameter(instance.getParameterSpec(PSSParameterSpec.class));
                    } catch (GeneralSecurityException e) {
                        throw new SignatureException(new StringBuilder("Exception extracting parameters: ").append(e.getMessage()).toString());
                    }
                }
            } catch (IOException e2) {
                throw new SignatureException(new StringBuilder("IOException decoding parameters: ").append(e2.getMessage()).toString());
            }
        }
    }

    private static String getInstance(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String configure2 = BaseCipherSpi.AnonymousClass1.configure(aSN1ObjectIdentifier);
        int indexOf = configure2.indexOf(45);
        return (indexOf <= 0 || configure2.startsWith("SHA3")) ? BaseCipherSpi.AnonymousClass1.configure(aSN1ObjectIdentifier) : new StringBuilder().append(configure2.substring(0, indexOf)).append(configure2.substring(indexOf + 1)).toString();
    }

    static String configure(BCDSAPrivateKey bCDSAPrivateKey) {
        String property;
        CardinalConfigurationParameters cardinalConfigurationParameters = bCDSAPrivateKey.Cardinal;
        if (cardinalConfigurationParameters != null && !configure.equals(cardinalConfigurationParameters)) {
            if (bCDSAPrivateKey.cca_continue.equals(KeyAgreementSpi.DHUwithSHA224CKDF.getSDKVersion)) {
                return new StringBuilder().append(getInstance(KeyAgreementSpi.DHUwithSHA384KDF.configure(cardinalConfigurationParameters).getInstance.cca_continue)).append("withRSAandMGF1").toString();
            } else if (bCDSAPrivateKey.cca_continue.equals(GMCipherSpi.SM2withMD5.values)) {
                return new StringBuilder().append(getInstance((ASN1ObjectIdentifier) isEnableLogging.getInstance((Object) cardinalConfigurationParameters).init(0))).append("withECDSA").toString();
            }
        }
        Provider provider = Security.getProvider("BC");
        if (provider != null && (property = provider.getProperty(new StringBuilder("Alg.Alias.Signature.").append(bCDSAPrivateKey.cca_continue.init).toString())) != null) {
            return property;
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            String property2 = providers[i].getProperty(new StringBuilder("Alg.Alias.Signature.").append(bCDSAPrivateKey.cca_continue.init).toString());
            if (property2 != null) {
                return property2;
            }
        }
        return bCDSAPrivateKey.cca_continue.init;
    }
}
