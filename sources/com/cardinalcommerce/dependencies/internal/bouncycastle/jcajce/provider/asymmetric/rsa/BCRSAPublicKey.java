package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.isEnabledVisaCheckout;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

public class BCRSAPublicKey implements RSAPublicKey {
    private static final BCDSAPrivateKey getInstance = new BCDSAPrivateKey(KeyAgreementSpi.DHUwithSHA224CKDF.configure, isEnabledVisaCheckout.configure);
    private transient BCDSAPrivateKey cca_continue;
    private BigInteger configure;
    private BigInteger init;

    BCRSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.cca_continue = getInstance;
        this.init = rSAPublicKey.getModulus();
        this.configure = rSAPublicKey.getPublicExponent();
    }

    BCRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.cca_continue = getInstance;
        this.init = rSAPublicKeySpec.getModulus();
        this.configure = rSAPublicKeySpec.getPublicExponent();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (!this.cca_continue.equals(getInstance)) {
            objectOutputStream.writeObject(this.cca_continue.getEncoded());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
        return getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }

    public String getAlgorithm() {
        return "RSA";
    }

    public byte[] getEncoded() {
        return KeyUtil.configure(this.cca_continue, new KeyAgreementSpi.DHUwithSHA256KDF(getModulus(), getPublicExponent()));
    }

    public String getFormat() {
        return "X.509";
    }

    public BigInteger getModulus() {
        return this.init;
    }

    public BigInteger getPublicExponent() {
        return this.configure;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RSA Public Key [");
        String instance = getTextFontSize.getInstance();
        stringBuffer.append(RSAUtil.cca_continue(getModulus())).append("],[").append(RSAUtil.Cardinal(getPublicExponent())).append("]").append(instance);
        stringBuffer.append("        modulus: ").append(getModulus().toString(16)).append(instance);
        stringBuffer.append("public exponent: ").append(getPublicExponent().toString(16)).append(instance);
        return stringBuffer.toString();
    }

    BCRSAPublicKey(DigestSignatureSpi.SHA256 sha256) {
        this.cca_continue = getInstance;
        this.init = sha256.getInstance;
        this.configure = sha256.cca_continue;
    }

    BCRSAPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(subjectPublicKeyInfo.Cardinal.init());
            KeyAgreementSpi.DHUwithSHA256KDF dHUwithSHA256KDF = Cardinal != null ? new KeyAgreementSpi.DHUwithSHA256KDF(isEnableLogging.getInstance((Object) Cardinal)) : null;
            this.cca_continue = subjectPublicKeyInfo.cca_continue;
            this.init = dHUwithSHA256KDF.init;
            this.configure = dHUwithSHA256KDF.cca_continue;
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        try {
            Object readObject = objectInputStream.readObject();
            this.cca_continue = readObject instanceof BCDSAPrivateKey ? (BCDSAPrivateKey) readObject : readObject != null ? new BCDSAPrivateKey(isEnableLogging.getInstance(readObject)) : null;
        } catch (Exception unused) {
            this.cca_continue = getInstance;
        }
    }
}
