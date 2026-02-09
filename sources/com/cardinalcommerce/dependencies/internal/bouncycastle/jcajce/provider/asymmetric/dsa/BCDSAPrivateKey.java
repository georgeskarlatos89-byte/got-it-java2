package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;

public class BCDSAPrivateKey implements GMCipherSpi.SM2withRMD, DSAPrivateKey {
    private transient PKCS12BagAttributeCarrierImpl cca_continue = new PKCS12BagAttributeCarrierImpl();
    private BigInteger configure;
    private transient DSAParams init;

    protected BCDSAPrivateKey() {
    }

    BCDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.configure = dSAPrivateKey.getX();
        this.init = dSAPrivateKey.getParams();
    }

    BCDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.configure = dSAPrivateKeySpec.getX();
        this.init = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.init = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.cca_continue = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.init.getP());
        objectOutputStream.writeObject(this.init.getQ());
        objectOutputStream.writeObject(this.init.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    public String getAlgorithm() {
        return "DSA";
    }

    public byte[] getEncoded() {
        return KeyUtil.cca_continue(new com.cardinalcommerce.a.BCDSAPrivateKey(GMCipherSpi.SM2withMD5.ExtendedData, new DSASigner.detDSA256(this.init.getP(), this.init.getQ(), this.init.getG()).onCReqSuccess()), new setEnvironment(getX()));
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public DSAParams getParams() {
        return this.init;
    }

    public BigInteger getX() {
        return this.configure;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("DSA Private Key [");
        String instance = getTextFontSize.getInstance();
        BigInteger modPow = getParams().getG().modPow(this.configure, getParams().getP());
        stringBuffer.append(DSAUtil.cca_continue(modPow, getParams())).append("]").append(instance);
        stringBuffer.append("            Y: ").append(modPow.toString(16)).append(instance);
        return stringBuffer.toString();
    }

    public BCDSAPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        CardinalConfigurationParameters cardinalConfigurationParameters = privateKeyInfo.cca_continue.Cardinal;
        DSASigner.detDSA256 detdsa256 = cardinalConfigurationParameters instanceof DSASigner.detDSA256 ? (DSASigner.detDSA256) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new DSASigner.detDSA256(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null;
        this.configure = new BigInteger(((setEnvironment) getThreeDSRequestorAppURL.Cardinal(privateKeyInfo.Cardinal.getInstance())).getInstance);
        this.init = new DSAParameterSpec(new BigInteger(1, detdsa256.Cardinal.getInstance), new BigInteger(1, detdsa256.configure.getInstance), new BigInteger(1, detdsa256.getInstance.getInstance));
    }

    BCDSAPrivateKey(KeyAgreementSpi.X448UwithSHA512KDF x448UwithSHA512KDF) {
        this.configure = x448UwithSHA512KDF.Cardinal;
        this.init = new DSAParameterSpec(x448UwithSHA512KDF.configure.configure, x448UwithSHA512KDF.configure.init, x448UwithSHA512KDF.configure.Cardinal);
    }
}
