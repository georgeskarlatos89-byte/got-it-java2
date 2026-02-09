package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.isEnabledVisaCheckout;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;

public class BCDSAPublicKey implements DSAPublicKey {
    private static BigInteger getInstance = BigInteger.valueOf(0);
    transient KeyAgreementSpi.X448withSHA512CKDF Cardinal;
    private transient DSAParams configure;
    private BigInteger init;

    BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.init = dSAPublicKey.getY();
        this.configure = dSAPublicKey.getParams();
        this.Cardinal = new KeyAgreementSpi.X448withSHA512CKDF(this.init, DSAUtil.getInstance(this.configure));
    }

    BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.init = dSAPublicKeySpec.getY();
        this.configure = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.Cardinal = new KeyAgreementSpi.X448withSHA512CKDF(this.init, DSAUtil.getInstance(this.configure));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        BigInteger bigInteger = (BigInteger) objectInputStream.readObject();
        if (bigInteger.equals(getInstance)) {
            this.configure = null;
        } else {
            this.configure = new DSAParameterSpec(bigInteger, (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        }
        this.Cardinal = new KeyAgreementSpi.X448withSHA512CKDF(this.init, DSAUtil.getInstance(this.configure));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        BigInteger g;
        objectOutputStream.defaultWriteObject();
        DSAParams dSAParams = this.configure;
        if (dSAParams == null) {
            g = getInstance;
        } else {
            objectOutputStream.writeObject(dSAParams.getP());
            objectOutputStream.writeObject(this.configure.getQ());
            g = this.configure.getG();
        }
        objectOutputStream.writeObject(g);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return this.configure != null ? getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ()) : getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    public String getAlgorithm() {
        return "DSA";
    }

    public byte[] getEncoded() {
        BCDSAPrivateKey bCDSAPrivateKey;
        setEnvironment setenvironment;
        if (this.configure == null) {
            bCDSAPrivateKey = new BCDSAPrivateKey(GMCipherSpi.SM2withMD5.ExtendedData);
            setenvironment = new setEnvironment(this.init);
        } else {
            bCDSAPrivateKey = new BCDSAPrivateKey(GMCipherSpi.SM2withMD5.ExtendedData, new DSASigner.detDSA256(this.configure.getP(), this.configure.getQ(), this.configure.getG()).onCReqSuccess());
            setenvironment = new setEnvironment(this.init);
        }
        return KeyUtil.configure(bCDSAPrivateKey, setenvironment);
    }

    public String getFormat() {
        return "X.509";
    }

    public DSAParams getParams() {
        return this.configure;
    }

    public BigInteger getY() {
        return this.init;
    }

    public int hashCode() {
        return this.configure != null ? ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode() : getY().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("DSA Public Key [");
        String instance = getTextFontSize.getInstance();
        stringBuffer.append(DSAUtil.cca_continue(this.init, getParams())).append("]").append(instance);
        stringBuffer.append("            Y: ").append(getY().toString(16)).append(instance);
        return stringBuffer.toString();
    }

    BCDSAPublicKey(KeyAgreementSpi.X448withSHA512CKDF x448withSHA512CKDF) {
        this.init = x448withSHA512CKDF.init;
        this.configure = x448withSHA512CKDF != null ? new DSAParameterSpec(x448withSHA512CKDF.configure.configure, x448withSHA512CKDF.configure.init, x448withSHA512CKDF.configure.Cardinal) : null;
        this.Cardinal = x448withSHA512CKDF;
    }

    public BCDSAPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            this.init = new BigInteger(((setEnvironment) getThreeDSRequestorAppURL.Cardinal(subjectPublicKeyInfo.Cardinal.init())).getInstance);
            CardinalConfigurationParameters cardinalConfigurationParameters = subjectPublicKeyInfo.cca_continue.Cardinal;
            DSASigner.detDSA256 detdsa256 = null;
            if (cardinalConfigurationParameters != null && !isEnabledVisaCheckout.configure.equals(cardinalConfigurationParameters.onCReqSuccess())) {
                CardinalConfigurationParameters cardinalConfigurationParameters2 = subjectPublicKeyInfo.cca_continue.Cardinal;
                if (cardinalConfigurationParameters2 instanceof DSASigner.detDSA256) {
                    detdsa256 = (DSASigner.detDSA256) cardinalConfigurationParameters2;
                } else if (cardinalConfigurationParameters2 != null) {
                    detdsa256 = new DSASigner.detDSA256(isEnableLogging.getInstance((Object) cardinalConfigurationParameters2));
                }
                this.configure = new DSAParameterSpec(new BigInteger(1, detdsa256.Cardinal.getInstance), new BigInteger(1, detdsa256.configure.getInstance), new BigInteger(1, detdsa256.getInstance.getInstance));
            } else {
                this.configure = null;
            }
            this.Cardinal = new KeyAgreementSpi.X448withSHA512CKDF(this.init, DSAUtil.getInstance(this.configure));
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
