package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost;

import com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi;
import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.BCRSAPrivateKey;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.CertificateFactory;
import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.IESUtil;
import com.cardinalcommerce.a.McElieceKeyFactorySpi;
import com.cardinalcommerce.a.NHKeyFactorySpi;
import com.cardinalcommerce.a.QTESLAKeyFactorySpi;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnabledVisaCheckout;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;

public class BCGOST3410PublicKey implements IESUtil {
    private BigInteger getInstance;
    private transient CertificateFactory init;

    BCGOST3410PublicKey(IESUtil iESUtil) {
        this.getInstance = iESUtil.getInstance();
        this.init = iESUtil.Cardinal();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.init = new QTESLAKeyFactorySpi(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
            return;
        }
        this.init = new QTESLAKeyFactorySpi(new NHKeyFactorySpi((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
        objectInputStream.readObject();
        objectInputStream.readObject();
    }

    public final CertificateFactory Cardinal() {
        return this.init;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCGOST3410PublicKey) {
            BCGOST3410PublicKey bCGOST3410PublicKey = (BCGOST3410PublicKey) obj;
            return this.getInstance.equals(bCGOST3410PublicKey.getInstance) && this.init.equals(bCGOST3410PublicKey.init);
        }
    }

    public String getAlgorithm() {
        return "GOST3410";
    }

    public String getFormat() {
        return "X.509";
    }

    public final BigInteger getInstance() {
        return this.getInstance;
    }

    public int hashCode() {
        return this.getInstance.hashCode() ^ this.init.hashCode();
    }

    BCGOST3410PublicKey(McElieceKeyFactorySpi mcElieceKeyFactorySpi) {
        this.getInstance = mcElieceKeyFactorySpi.Cardinal;
        this.init = new QTESLAKeyFactorySpi(new NHKeyFactorySpi(mcElieceKeyFactorySpi.cca_continue, mcElieceKeyFactorySpi.init, mcElieceKeyFactorySpi.getInstance));
    }

    BCGOST3410PublicKey(BCRSAPrivateKey bCRSAPrivateKey, QTESLAKeyFactorySpi qTESLAKeyFactorySpi) {
        this.getInstance = bCRSAPrivateKey.getInstance;
        this.init = qTESLAKeyFactorySpi;
    }

    BCGOST3410PublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        CardinalConfigurationParameters cardinalConfigurationParameters = subjectPublicKeyInfo.cca_continue.Cardinal;
        AlgorithmParameterGeneratorSpi algorithmParameterGeneratorSpi = cardinalConfigurationParameters instanceof AlgorithmParameterGeneratorSpi ? (AlgorithmParameterGeneratorSpi) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new AlgorithmParameterGeneratorSpi(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null;
        try {
            byte[] instance = ((setEnabledVisaCheckout) getThreeDSRequestorAppURL.Cardinal(subjectPublicKeyInfo.Cardinal.init())).getInstance();
            byte[] bArr = new byte[instance.length];
            for (int i = 0; i != instance.length; i++) {
                bArr[i] = instance[(instance.length - 1) - i];
            }
            this.getInstance = new BigInteger(1, bArr);
            this.init = QTESLAKeyFactorySpi.init(algorithmParameterGeneratorSpi);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }

    public byte[] getEncoded() {
        byte[] byteArray = this.getInstance.toByteArray();
        byte[] bArr = new byte[(byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length)];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            CertificateFactory certificateFactory = this.init;
            return KeyUtil.getInstance(certificateFactory instanceof QTESLAKeyFactorySpi ? certificateFactory.cca_continue() != null ? new SubjectPublicKeyInfo(new BCDSAPrivateKey(IES.getSDKVersion, new AlgorithmParameterGeneratorSpi(new ASN1ObjectIdentifier(this.init.getInstance()), new ASN1ObjectIdentifier(this.init.configure()), new ASN1ObjectIdentifier(this.init.cca_continue()))), (CardinalConfigurationParameters) new setEnabledVisaCheckout(bArr)) : new SubjectPublicKeyInfo(new BCDSAPrivateKey(IES.getSDKVersion, new AlgorithmParameterGeneratorSpi(new ASN1ObjectIdentifier(this.init.getInstance()), new ASN1ObjectIdentifier(this.init.configure()))), (CardinalConfigurationParameters) new setEnabledVisaCheckout(bArr)) : new SubjectPublicKeyInfo(new BCDSAPrivateKey(IES.getSDKVersion), (CardinalConfigurationParameters) new setEnabledVisaCheckout(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    public String toString() {
        try {
            return GOSTUtil.cca_continue("GOST3410", this.getInstance, ((BCRSAPrivateKey) GOST3410Util.configure(this)).Cardinal);
        } catch (InvalidKeyException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (this.init.getInstance() != null) {
            objectOutputStream.writeObject(this.init.getInstance());
            objectOutputStream.writeObject(this.init.configure());
            objectOutputStream.writeObject(this.init.cca_continue());
            return;
        }
        objectOutputStream.writeObject((Object) null);
        objectOutputStream.writeObject(this.init.Cardinal().init);
        objectOutputStream.writeObject(this.init.Cardinal().getInstance);
        objectOutputStream.writeObject(this.init.Cardinal().configure);
        objectOutputStream.writeObject(this.init.configure());
        objectOutputStream.writeObject(this.init.cca_continue());
    }
}
