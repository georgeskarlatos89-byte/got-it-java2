package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost;

import com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi;
import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.CertificateFactory;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.GOSTUtil;
import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.KeyUtil;
import com.cardinalcommerce.a.McElieceCCA2KeyFactorySpi;
import com.cardinalcommerce.a.NHKeyFactorySpi;
import com.cardinalcommerce.a.QTESLAKeyFactorySpi;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnabledVisaCheckout;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.a.setUICustomization;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;

public class BCGOST3410PrivateKey implements GMCipherSpi.SM2withRMD, KeyUtil {
    private BigInteger Cardinal;
    private transient GMCipherSpi.SM2withRMD cca_continue = new PKCS12BagAttributeCarrierImpl();
    private transient CertificateFactory configure;

    protected BCGOST3410PrivateKey() {
    }

    BCGOST3410PrivateKey(KeyUtil keyUtil) {
        this.Cardinal = keyUtil.configure();
        this.configure = keyUtil.Cardinal();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.configure = new QTESLAKeyFactorySpi(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        } else {
            this.configure = new QTESLAKeyFactorySpi(new NHKeyFactorySpi((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
            objectInputStream.readObject();
            objectInputStream.readObject();
        }
        this.cca_continue = new PKCS12BagAttributeCarrierImpl();
    }

    public final CertificateFactory Cardinal() {
        return this.configure;
    }

    public final BigInteger configure() {
        return this.Cardinal;
    }

    public String getAlgorithm() {
        return "GOST3410";
    }

    public String getFormat() {
        return "PKCS#8";
    }

    BCGOST3410PrivateKey(McElieceCCA2KeyFactorySpi mcElieceCCA2KeyFactorySpi) {
        this.Cardinal = mcElieceCCA2KeyFactorySpi.cca_continue;
        this.configure = new QTESLAKeyFactorySpi(new NHKeyFactorySpi(mcElieceCCA2KeyFactorySpi.init, mcElieceCCA2KeyFactorySpi.getInstance, mcElieceCCA2KeyFactorySpi.Cardinal));
    }

    BCGOST3410PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        CardinalConfigurationParameters cardinalConfigurationParameters = privateKeyInfo.cca_continue.Cardinal;
        AlgorithmParameterGeneratorSpi algorithmParameterGeneratorSpi = cardinalConfigurationParameters instanceof AlgorithmParameterGeneratorSpi ? (AlgorithmParameterGeneratorSpi) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new AlgorithmParameterGeneratorSpi(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null;
        getThreeDSRequestorAppURL Cardinal2 = getThreeDSRequestorAppURL.Cardinal(privateKeyInfo.Cardinal.getInstance());
        if (Cardinal2 instanceof setEnvironment) {
            this.Cardinal = new BigInteger(1, setEnvironment.getInstance((Object) Cardinal2).getInstance);
        } else {
            byte[] instance = setUICustomization.init(getThreeDSRequestorAppURL.Cardinal(privateKeyInfo.Cardinal.getInstance())).getInstance();
            byte[] bArr = new byte[instance.length];
            for (int i = 0; i != instance.length; i++) {
                bArr[i] = instance[(instance.length - 1) - i];
            }
            this.Cardinal = new BigInteger(1, bArr);
        }
        this.configure = QTESLAKeyFactorySpi.init(algorithmParameterGeneratorSpi);
    }

    BCGOST3410PrivateKey(GOSTUtil gOSTUtil, QTESLAKeyFactorySpi qTESLAKeyFactorySpi) {
        this.Cardinal = gOSTUtil.configure;
        this.configure = qTESLAKeyFactorySpi;
        if (qTESLAKeyFactorySpi == null) {
            throw new IllegalArgumentException("spec is null");
        }
    }

    public byte[] getEncoded() {
        byte[] byteArray = this.Cardinal.toByteArray();
        byte[] bArr = new byte[(byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length)];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            return (this.configure instanceof QTESLAKeyFactorySpi ? new PrivateKeyInfo(new BCDSAPrivateKey(IES.getSDKVersion, new AlgorithmParameterGeneratorSpi(new ASN1ObjectIdentifier(this.configure.getInstance()), new ASN1ObjectIdentifier(this.configure.configure()))), new setEnabledVisaCheckout(bArr)) : new PrivateKeyInfo(new BCDSAPrivateKey(IES.getSDKVersion), new setEnabledVisaCheckout(bArr))).configure("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyUtil)) {
            return false;
        }
        KeyUtil keyUtil = (KeyUtil) obj;
        if (this.Cardinal.equals(keyUtil.configure()) && this.configure.Cardinal().equals(keyUtil.Cardinal().Cardinal()) && this.configure.configure().equals(keyUtil.Cardinal().configure())) {
            String cca_continue2 = this.configure.cca_continue();
            String cca_continue3 = keyUtil.Cardinal().cca_continue();
            if (cca_continue2 == cca_continue3 ? true : cca_continue2 == null ? false : cca_continue2.equals(cca_continue3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.Cardinal.hashCode() ^ this.configure.hashCode();
    }

    public String toString() {
        try {
            return GOSTUtil.Cardinal("GOST3410", this.Cardinal, ((GOSTUtil) GOST3410Util.init(this)).Cardinal);
        } catch (InvalidKeyException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (this.configure.getInstance() != null) {
            objectOutputStream.writeObject(this.configure.getInstance());
            objectOutputStream.writeObject(this.configure.configure());
            objectOutputStream.writeObject(this.configure.cca_continue());
            return;
        }
        objectOutputStream.writeObject((Object) null);
        objectOutputStream.writeObject(this.configure.Cardinal().init);
        objectOutputStream.writeObject(this.configure.Cardinal().getInstance);
        objectOutputStream.writeObject(this.configure.Cardinal().configure);
        objectOutputStream.writeObject(this.configure.configure());
        objectOutputStream.writeObject(this.configure.cca_continue());
    }
}
