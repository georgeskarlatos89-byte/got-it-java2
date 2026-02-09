package com.nimbusds.jose.crypto;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.protocol.HTTP;

class ECDH {

    public enum AlgorithmMode {
        DIRECT,
        KW
    }

    static AlgorithmMode resolveAlgorithmMode(JWEAlgorithm jWEAlgorithm) throws JOSEException {
        if (jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES)) {
            return AlgorithmMode.DIRECT;
        }
        if (jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES_A128KW) || jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES_A192KW) || jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES_A256KW)) {
            return AlgorithmMode.KW;
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(jWEAlgorithm, ECDHCryptoProvider.SUPPORTED_ALGORITHMS));
    }

    static int sharedKeyLength(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) throws JOSEException {
        if (jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES)) {
            int cekBitLength = encryptionMethod.cekBitLength();
            if (cekBitLength != 0) {
                return cekBitLength;
            }
            throw new JOSEException("Unsupported JWE encryption method " + encryptionMethod);
        } else if (jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES_A128KW)) {
            return 128;
        } else {
            if (jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES_A192KW)) {
                return 192;
            }
            if (jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES_A256KW)) {
                return 256;
            }
            throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(jWEAlgorithm, ECDHCryptoProvider.SUPPORTED_ALGORITHMS));
        }
    }

    static SecretKey deriveSharedSecret(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey, Provider provider) throws JOSEException {
        KeyAgreement keyAgreement;
        if (provider != null) {
            try {
                keyAgreement = KeyAgreement.getInstance("ECDH", provider);
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException("Couldn't get an ECDH key agreement instance: " + e.getMessage(), e);
            }
        } else {
            keyAgreement = KeyAgreement.getInstance("ECDH");
        }
        try {
            keyAgreement.init(eCPrivateKey);
            keyAgreement.doPhase(eCPublicKey, true);
            return new SecretKeySpec(keyAgreement.generateSecret(), "AES");
        } catch (InvalidKeyException e2) {
            throw new JOSEException("Invalid key for ECDH key agreement: " + e2.getMessage(), e2);
        }
    }

    static SecretKey deriveSharedKey(JWEHeader jWEHeader, SecretKey secretKey, ConcatKDF concatKDF) throws JOSEException {
        String str;
        int sharedKeyLength = sharedKeyLength(jWEHeader.getAlgorithm(), jWEHeader.getEncryptionMethod());
        AlgorithmMode resolveAlgorithmMode = resolveAlgorithmMode(jWEHeader.getAlgorithm());
        if (resolveAlgorithmMode == AlgorithmMode.DIRECT) {
            str = jWEHeader.getEncryptionMethod().getName();
        } else if (resolveAlgorithmMode == AlgorithmMode.KW) {
            str = jWEHeader.getAlgorithm().getName();
        } else {
            throw new JOSEException("Unsupported JWE ECDH algorithm mode: " + resolveAlgorithmMode);
        }
        return concatKDF.deriveKey(secretKey, sharedKeyLength, ConcatKDF.encodeDataWithLength(str.getBytes(Charset.forName(HTTP.ASCII))), ConcatKDF.encodeDataWithLength(jWEHeader.getAgreementPartyUInfo()), ConcatKDF.encodeDataWithLength(jWEHeader.getAgreementPartyVInfo()), ConcatKDF.encodeIntData(sharedKeyLength), ConcatKDF.encodeNoData());
    }

    private ECDH() {
    }
}
