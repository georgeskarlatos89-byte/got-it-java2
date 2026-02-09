package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.cardinalcommerce.a.Customization;
import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class RSAUtil {
    private static ASN1ObjectIdentifier[] getInstance = {KeyAgreementSpi.DHUwithSHA224CKDF.configure, DSASigner.noneDSA.d_, KeyAgreementSpi.DHUwithSHA224CKDF.onValidated, KeyAgreementSpi.DHUwithSHA224CKDF.getSDKVersion};

    static String Cardinal(BigInteger bigInteger) {
        return new Customization(bigInteger.toByteArray(), 32).toString();
    }

    public static boolean Cardinal(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 0;
        while (true) {
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = getInstance;
            if (i == aSN1ObjectIdentifierArr.length) {
                return false;
            }
            if (aSN1ObjectIdentifier.equals(aSN1ObjectIdentifierArr[i])) {
                return true;
            }
            i++;
        }
    }

    static DigestSignatureSpi.SHA256 cca_continue(RSAPublicKey rSAPublicKey) {
        return new DigestSignatureSpi.SHA256(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
    }

    static String cca_continue(BigInteger bigInteger) {
        return new Customization(bigInteger.toByteArray()).toString();
    }

    static DigestSignatureSpi.SHA256 init(RSAPrivateKey rSAPrivateKey) {
        if (!(rSAPrivateKey instanceof RSAPrivateCrtKey)) {
            return new DigestSignatureSpi.SHA256(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) rSAPrivateKey;
        return new DigestSignatureSpi.RIPEMD256(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
    }
}
