package com.nimbusds.jose.crypto;

import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.jca.JCAContext;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.StandardCharset;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class MACSigner extends MACProvider implements JWSSigner {
    public /* bridge */ /* synthetic */ JCAContext getJCAContext() {
        return super.getJCAContext();
    }

    public /* bridge */ /* synthetic */ byte[] getSecret() {
        return super.getSecret();
    }

    public /* bridge */ /* synthetic */ SecretKey getSecretKey() {
        return super.getSecretKey();
    }

    public /* bridge */ /* synthetic */ String getSecretString() {
        return super.getSecretString();
    }

    public /* bridge */ /* synthetic */ Set supportedJWSAlgorithms() {
        return super.supportedJWSAlgorithms();
    }

    public static int getMinRequiredSecretLength(JWSAlgorithm jWSAlgorithm) throws JOSEException {
        if (JWSAlgorithm.HS256.equals(jWSAlgorithm)) {
            return 256;
        }
        if (JWSAlgorithm.HS384.equals(jWSAlgorithm)) {
            return BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        }
        if (JWSAlgorithm.HS512.equals(jWSAlgorithm)) {
            return 512;
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, SUPPORTED_ALGORITHMS));
    }

    public static Set<JWSAlgorithm> getCompatibleAlgorithms(int i) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i >= 256) {
            linkedHashSet.add(JWSAlgorithm.HS256);
        }
        if (i >= 384) {
            linkedHashSet.add(JWSAlgorithm.HS384);
        }
        if (i >= 512) {
            linkedHashSet.add(JWSAlgorithm.HS512);
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public MACSigner(byte[] bArr) throws KeyLengthException {
        super(bArr, getCompatibleAlgorithms(ByteUtils.bitLength(bArr.length)));
    }

    public MACSigner(String str) throws KeyLengthException {
        this(str.getBytes(StandardCharset.UTF_8));
    }

    public MACSigner(SecretKey secretKey) throws KeyLengthException {
        this(secretKey.getEncoded());
    }

    public MACSigner(OctetSequenceKey octetSequenceKey) throws KeyLengthException {
        this(octetSequenceKey.toByteArray());
    }

    public Base64URL sign(JWSHeader jWSHeader, byte[] bArr) throws JOSEException {
        int minRequiredSecretLength = getMinRequiredSecretLength(jWSHeader.getAlgorithm());
        if (getSecret().length >= ByteUtils.byteLength(minRequiredSecretLength)) {
            return Base64URL.encode(HMAC.compute(getJCAAlgorithmName(jWSHeader.getAlgorithm()), getSecret(), bArr, getJCAContext().getProvider()));
        }
        throw new KeyLengthException("The secret length for " + jWSHeader.getAlgorithm() + " must be at least " + minRequiredSecretLength + " bits");
    }
}
