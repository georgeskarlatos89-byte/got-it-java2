package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.isEnabledVisaCheckout;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;

public class BCRSAPrivateKey implements GMCipherSpi.SM2withRMD, RSAPrivateKey {
    private static BigInteger Cardinal = BigInteger.valueOf(0);
    protected BigInteger cca_continue;
    private transient PKCS12BagAttributeCarrierImpl configure = new PKCS12BagAttributeCarrierImpl();
    protected BigInteger getInstance;

    protected BCRSAPrivateKey() {
    }

    BCRSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        this.getInstance = rSAPrivateKey.getModulus();
        this.cca_continue = rSAPrivateKey.getPrivateExponent();
    }

    BCRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        this.getInstance = rSAPrivateKeySpec.getModulus();
        this.cca_continue = rSAPrivateKeySpec.getPrivateExponent();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.configure = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    public String getAlgorithm() {
        return "RSA";
    }

    public byte[] getEncoded() {
        BCDSAPrivateKey bCDSAPrivateKey = new BCDSAPrivateKey(KeyAgreementSpi.DHUwithSHA224CKDF.configure, isEnabledVisaCheckout.configure);
        BigInteger modulus = getModulus();
        BigInteger bigInteger = Cardinal;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = Cardinal;
        return KeyUtil.cca_continue(bCDSAPrivateKey, new KeyAgreementSpi.DHUwithSHA512CKDF(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public BigInteger getModulus() {
        return this.getInstance;
    }

    public BigInteger getPrivateExponent() {
        return this.cca_continue;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RSA Private Key [");
        String instance = getTextFontSize.getInstance();
        stringBuffer.append(RSAUtil.cca_continue(getModulus())).append("],[]").append(instance);
        stringBuffer.append("            modulus: ").append(getModulus().toString(16)).append(instance);
        return stringBuffer.toString();
    }

    BCRSAPrivateKey(DigestSignatureSpi.SHA256 sha256) {
        this.getInstance = sha256.getInstance;
        this.cca_continue = sha256.cca_continue;
    }

    BCRSAPrivateKey(KeyAgreementSpi.DHUwithSHA512CKDF dHUwithSHA512CKDF) {
        this.getInstance = dHUwithSHA512CKDF.getInstance;
        this.cca_continue = dHUwithSHA512CKDF.Cardinal;
    }
}
