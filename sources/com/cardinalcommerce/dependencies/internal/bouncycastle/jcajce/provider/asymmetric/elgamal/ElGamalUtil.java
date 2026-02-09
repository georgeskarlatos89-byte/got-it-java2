package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.cardinalcommerce.a.BCElGamalPrivateKey;
import com.cardinalcommerce.a.BCGOST3410PrivateKey;
import com.cardinalcommerce.a.ECUtil;
import com.cardinalcommerce.a.PrimeCertaintyCalculator;
import com.cardinalcommerce.a.setCCAImageUri;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

public class ElGamalUtil {
    public static setCCAImageUri getInstance(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof PrimeCertaintyCalculator) {
            PrimeCertaintyCalculator primeCertaintyCalculator = (PrimeCertaintyCalculator) publicKey;
            return new BCGOST3410PrivateKey(primeCertaintyCalculator.getY(), new BCElGamalPrivateKey(primeCertaintyCalculator.getInstance().Cardinal, primeCertaintyCalculator.getInstance().configure));
        } else if (publicKey instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            return new BCGOST3410PrivateKey(dHPublicKey.getY(), new BCElGamalPrivateKey(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
        } else {
            throw new InvalidKeyException("can't identify public key for El Gamal.");
        }
    }

    public static setCCAImageUri configure(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof ECUtil) {
            ECUtil eCUtil = (ECUtil) privateKey;
            return new com.cardinalcommerce.a.ElGamalUtil(eCUtil.getX(), new BCElGamalPrivateKey(eCUtil.getInstance().Cardinal, eCUtil.getInstance().configure));
        } else if (privateKey instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            return new com.cardinalcommerce.a.ElGamalUtil(dHPrivateKey.getX(), new BCElGamalPrivateKey(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
        } else {
            throw new InvalidKeyException("can't identify private key for El Gamal.");
        }
    }
}
