package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.cardinalcommerce.a.AsymmetricKeyInfoConverter;
import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.BCGOST3410PrivateKey;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.PrimeCertaintyCalculator;
import com.cardinalcommerce.a.RainbowKeyFactorySpi;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

public class BCElGamalPublicKey implements PrimeCertaintyCalculator, DHPublicKey {
    private transient AsymmetricKeyInfoConverter cca_continue;
    private BigInteger getInstance;

    BCElGamalPublicKey(PrimeCertaintyCalculator primeCertaintyCalculator) {
        this.getInstance = primeCertaintyCalculator.getY();
        this.cca_continue = primeCertaintyCalculator.getInstance();
    }

    BCElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.getInstance = dHPublicKey.getY();
        this.cca_continue = new AsymmetricKeyInfoConverter(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    BCElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.getInstance = dHPublicKeySpec.getY();
        this.cca_continue = new AsymmetricKeyInfoConverter(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.cca_continue = new AsymmetricKeyInfoConverter((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "ElGamal";
    }

    public String getFormat() {
        return "X.509";
    }

    public final AsymmetricKeyInfoConverter getInstance() {
        return this.cca_continue;
    }

    public BigInteger getY() {
        return this.getInstance;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    BCElGamalPublicKey(RainbowKeyFactorySpi rainbowKeyFactorySpi) {
        this.getInstance = rainbowKeyFactorySpi.cca_continue;
        this.cca_continue = new AsymmetricKeyInfoConverter(rainbowKeyFactorySpi.getInstance.Cardinal, rainbowKeyFactorySpi.getInstance.configure);
    }

    BCElGamalPublicKey(BCGOST3410PrivateKey bCGOST3410PrivateKey) {
        this.getInstance = bCGOST3410PrivateKey.cca_continue;
        this.cca_continue = new AsymmetricKeyInfoConverter(bCGOST3410PrivateKey.configure.init, bCGOST3410PrivateKey.configure.getInstance);
    }

    BCElGamalPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        CardinalConfigurationParameters cardinalConfigurationParameters = subjectPublicKeyInfo.cca_continue.Cardinal;
        KeyAgreementSpi.DHUwithSHA224KDF dHUwithSHA224KDF = cardinalConfigurationParameters instanceof KeyAgreementSpi.DHUwithSHA224KDF ? (KeyAgreementSpi.DHUwithSHA224KDF) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new KeyAgreementSpi.DHUwithSHA224KDF(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null;
        try {
            this.getInstance = new BigInteger(((setEnvironment) getThreeDSRequestorAppURL.Cardinal(subjectPublicKeyInfo.Cardinal.init())).getInstance);
            this.cca_continue = new AsymmetricKeyInfoConverter(new BigInteger(1, dHUwithSHA224KDF.cca_continue.getInstance), new BigInteger(1, dHUwithSHA224KDF.getInstance.getInstance));
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    public byte[] getEncoded() {
        try {
            return new SubjectPublicKeyInfo(new BCDSAPrivateKey(KeyAgreementSpi.DHUwithSHA1KDF.cleanup, new KeyAgreementSpi.DHUwithSHA224KDF(this.cca_continue.Cardinal, this.cca_continue.configure)), (CardinalConfigurationParameters) new setEnvironment(this.getInstance)).configure("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.cca_continue.Cardinal, this.cca_continue.configure);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.cca_continue.Cardinal);
        objectOutputStream.writeObject(this.cca_continue.configure);
    }
}
