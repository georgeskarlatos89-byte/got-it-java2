package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.a.BCRSAPrivateKey;
import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.GOSTUtil;
import com.cardinalcommerce.a.IESUtil;
import com.cardinalcommerce.a.KeyUtil;
import com.cardinalcommerce.a.NHKeyFactorySpi;
import com.cardinalcommerce.a.setCCAImageUri;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class GOST3410Util {
    public static setCCAImageUri configure(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof IESUtil) {
            IESUtil iESUtil = (IESUtil) publicKey;
            NHKeyFactorySpi Cardinal = iESUtil.Cardinal().Cardinal();
            return new BCRSAPrivateKey(iESUtil.getInstance(), new CipherSpi.PKCS1v1_5Padding(Cardinal.init, Cardinal.getInstance, Cardinal.configure));
        }
        throw new InvalidKeyException(new StringBuilder("can't identify GOST3410 public key: ").append(publicKey.getClass().getName()).toString());
    }

    public static setCCAImageUri init(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof KeyUtil) {
            KeyUtil keyUtil = (KeyUtil) privateKey;
            NHKeyFactorySpi Cardinal = keyUtil.Cardinal().Cardinal();
            return new GOSTUtil(keyUtil.configure(), new CipherSpi.PKCS1v1_5Padding(Cardinal.init, Cardinal.getInstance, Cardinal.configure));
        }
        throw new InvalidKeyException("can't identify GOST3410 private key.");
    }
}
