package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.cardinalcommerce.a.AlgorithmProvider;
import com.cardinalcommerce.a.AsymmetricKeyInfoConverter;
import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.ECUtil;
import com.cardinalcommerce.a.ElGamalUtil;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

public class BCElGamalPrivateKey implements ECUtil, GMCipherSpi.SM2withRMD, DHPrivateKey {
    private BigInteger cca_continue;
    private transient AsymmetricKeyInfoConverter configure;
    private transient PKCS12BagAttributeCarrierImpl getInstance = new PKCS12BagAttributeCarrierImpl();

    protected BCElGamalPrivateKey() {
    }

    BCElGamalPrivateKey(ECUtil eCUtil) {
        this.cca_continue = eCUtil.getX();
        this.configure = eCUtil.getInstance();
    }

    BCElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.cca_continue = dHPrivateKey.getX();
        this.configure = new AsymmetricKeyInfoConverter(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    BCElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.cca_continue = dHPrivateKeySpec.getX();
        this.configure = new AsymmetricKeyInfoConverter(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.configure = new AsymmetricKeyInfoConverter((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.getInstance = new PKCS12BagAttributeCarrierImpl();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "ElGamal";
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public final AsymmetricKeyInfoConverter getInstance() {
        return this.configure;
    }

    public BigInteger getX() {
        return this.cca_continue;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    BCElGamalPrivateKey(AlgorithmProvider algorithmProvider) {
        this.cca_continue = algorithmProvider.cca_continue;
        this.configure = new AsymmetricKeyInfoConverter(algorithmProvider.getInstance.Cardinal, algorithmProvider.getInstance.configure);
    }

    BCElGamalPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        CardinalConfigurationParameters cardinalConfigurationParameters = privateKeyInfo.cca_continue.Cardinal;
        KeyAgreementSpi.DHUwithSHA224KDF dHUwithSHA224KDF = cardinalConfigurationParameters instanceof KeyAgreementSpi.DHUwithSHA224KDF ? (KeyAgreementSpi.DHUwithSHA224KDF) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new KeyAgreementSpi.DHUwithSHA224KDF(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null;
        this.cca_continue = new BigInteger(setEnvironment.getInstance((Object) getThreeDSRequestorAppURL.Cardinal(privateKeyInfo.Cardinal.getInstance())).getInstance);
        this.configure = new AsymmetricKeyInfoConverter(new BigInteger(1, dHUwithSHA224KDF.cca_continue.getInstance), new BigInteger(1, dHUwithSHA224KDF.getInstance.getInstance));
    }

    BCElGamalPrivateKey(ElGamalUtil elGamalUtil) {
        this.cca_continue = elGamalUtil.init;
        this.configure = new AsymmetricKeyInfoConverter(elGamalUtil.configure.init, elGamalUtil.configure.getInstance);
    }

    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new BCDSAPrivateKey(KeyAgreementSpi.DHUwithSHA1KDF.cleanup, new KeyAgreementSpi.DHUwithSHA224KDF(this.configure.Cardinal, this.configure.configure)), new setEnvironment(getX())).configure("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.configure.Cardinal, this.configure.configure);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.configure.Cardinal);
        objectOutputStream.writeObject(this.configure.configure);
    }
}
