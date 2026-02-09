package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.rainbow;

import com.cardinalcommerce.a.ButtonType;
import com.cardinalcommerce.a.InvalidInputException;
import com.cardinalcommerce.a.getAcsRefNumber;
import com.cardinalcommerce.a.getAcsSignedContent;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setCCAOnScrollChangeListener;
import com.cardinalcommerce.a.setOnScrollChangeListener;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class RainbowKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof InvalidInputException) {
            return new setOnScrollChangeListener((InvalidInputException) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return cca_continue(PrivateKeyInfo.cca_continue(getThreeDSRequestorAppURL.Cardinal(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder("Unsupported key specification: ").append(keySpec.getClass()).append(".").toString());
        }
    }

    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof setOnScrollChangeListener) || (key instanceof setCCAOnScrollChangeListener)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof ButtonType) {
            return new setCCAOnScrollChangeListener((ButtonType) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(SubjectPublicKeyInfo.configure(((X509EncodedKeySpec) keySpec).getEncoded()).Cardinal.init());
                getAcsRefNumber getacsrefnumber = Cardinal != null ? new getAcsRefNumber(isEnableLogging.getInstance((Object) Cardinal)) : null;
                return new setCCAOnScrollChangeListener(new BigInteger(getacsrefnumber.cca_continue.getInstance).intValue(), getacsrefnumber.init(), getacsrefnumber.cca_continue(), getacsrefnumber.configure());
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder("Unknown key specification: ").append(keySpec).append(".").toString());
        }
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        short[] sArr;
        if (key instanceof setOnScrollChangeListener) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (InvalidInputException.class.isAssignableFrom(cls)) {
                setOnScrollChangeListener setonscrollchangelistener = (setOnScrollChangeListener) key;
                return new InvalidInputException(setonscrollchangelistener.init, setonscrollchangelistener.Cardinal, setonscrollchangelistener.configure, setonscrollchangelistener.cca_continue, setonscrollchangelistener.getWarnings, setonscrollchangelistener.getInstance);
            }
        } else if (!(key instanceof setCCAOnScrollChangeListener)) {
            throw new InvalidKeySpecException(new StringBuilder("Unsupported key type: ").append(key.getClass()).append(".").toString());
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        } else {
            if (ButtonType.class.isAssignableFrom(cls)) {
                setCCAOnScrollChangeListener setccaonscrollchangelistener = (setCCAOnScrollChangeListener) key;
                int i = setccaonscrollchangelistener.configure;
                short[][] sArr2 = setccaonscrollchangelistener.getInstance;
                short[][] Cardinal = setccaonscrollchangelistener.Cardinal();
                short[] sArr3 = setccaonscrollchangelistener.cca_continue;
                if (sArr3 == null) {
                    sArr = null;
                } else {
                    short[] sArr4 = new short[sArr3.length];
                    System.arraycopy(sArr3, 0, sArr4, 0, sArr3.length);
                    sArr = sArr4;
                }
                return new ButtonType(i, sArr2, Cardinal, sArr);
            }
        }
        throw new InvalidKeySpecException(new StringBuilder("Unknown key specification: ").append(cls).append(".").toString());
    }

    public final PrivateKey cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(privateKeyInfo.Cardinal.getInstance());
        getAcsSignedContent getacssignedcontent = Cardinal != null ? new getAcsSignedContent(isEnableLogging.getInstance((Object) Cardinal)) : null;
        return new setOnScrollChangeListener(getacssignedcontent.cca_continue(), getacssignedcontent.configure(), getacssignedcontent.Cardinal(), getacssignedcontent.init(), getacssignedcontent.getInstance(), getacssignedcontent.init);
    }

    public final PublicKey configure(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(subjectPublicKeyInfo.Cardinal.init());
        getAcsRefNumber getacsrefnumber = Cardinal != null ? new getAcsRefNumber(isEnableLogging.getInstance((Object) Cardinal)) : null;
        return new setCCAOnScrollChangeListener(new BigInteger(getacsrefnumber.cca_continue.getInstance).intValue(), getacsrefnumber.init(), getacsrefnumber.cca_continue(), getacsrefnumber.configure());
    }
}
