package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

public class DHUtil {
    public static setCCAImageUri cca_continue(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            return new KeyAgreementSpi.X25519UwithSHA256CKDF(dHPrivateKey.getX(), new KeyAgreementSpi.X25519withSHA256CKDF(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG(), (BigInteger) null, dHPrivateKey.getParams().getL()));
        }
        throw new InvalidKeyException("can't identify DH private key.");
    }

    public static setCCAImageUri getInstance(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).Cardinal;
        }
        if (publicKey instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            return new KeyAgreementSpi.X25519withSHA256KDF(dHPublicKey.getY(), new KeyAgreementSpi.X25519withSHA256CKDF(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG(), (BigInteger) null, dHPublicKey.getParams().getL()));
        }
        throw new InvalidKeyException("can't identify DH public key.");
    }
}
