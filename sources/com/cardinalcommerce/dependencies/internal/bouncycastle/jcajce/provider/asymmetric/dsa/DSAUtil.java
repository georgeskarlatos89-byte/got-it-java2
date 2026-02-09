package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.cardinalcommerce.a.Customization;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;

public class DSAUtil {
    public static final ASN1ObjectIdentifier[] init = {GMCipherSpi.SM2withMD5.ExtendedData, KeyAgreementSpi.DHUwithSHA1KDF.onCReqSuccess, GMCipherSpi.SM2withMD5.getXid};

    static String cca_continue(BigInteger bigInteger, DSAParams dSAParams) {
        return new Customization(getBackgroundColor.configure(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray())).toString();
    }

    static KeyAgreementSpi.X448withSHA256CKDF getInstance(DSAParams dSAParams) {
        if (dSAParams != null) {
            return new KeyAgreementSpi.X448withSHA256CKDF(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }

    public static setCCAImageUri init(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof DSAPrivateKey) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) privateKey;
            return new KeyAgreementSpi.X448UwithSHA512KDF(dSAPrivateKey.getX(), new KeyAgreementSpi.X448withSHA256CKDF(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()));
        }
        throw new InvalidKeyException("can't identify DSA private key.");
    }

    public static boolean init(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 0;
        while (true) {
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = init;
            if (i == aSN1ObjectIdentifierArr.length) {
                return false;
            }
            if (aSN1ObjectIdentifier.equals(aSN1ObjectIdentifierArr[i])) {
                return true;
            }
            i++;
        }
    }

    public static setCCAImageUri getInstance(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCDSAPublicKey) {
            return ((BCDSAPublicKey) publicKey).Cardinal;
        }
        if (publicKey instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) publicKey).Cardinal;
        }
        try {
            return new BCDSAPublicKey(SubjectPublicKeyInfo.configure(publicKey.getEncoded())).Cardinal;
        } catch (Exception unused) {
            throw new InvalidKeyException(new StringBuilder("can't identify DSA public key: ").append(publicKey.getClass().getName()).toString());
        }
    }
}
