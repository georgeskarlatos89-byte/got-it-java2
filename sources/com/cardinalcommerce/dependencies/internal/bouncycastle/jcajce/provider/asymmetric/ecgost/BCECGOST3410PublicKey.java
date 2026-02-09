package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost;

import com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi;
import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.BaseKeyFactorySpi;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.DSAUtil;
import com.cardinalcommerce.a.ExtendedInvalidKeySpecException;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.JSONNavi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PEMUtil;
import com.cardinalcommerce.a.PQCObjectIdentifiers;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X509CRLObject;
import com.cardinalcommerce.a.X509CertificateObject;
import com.cardinalcommerce.a.getDeviceFingerprint;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnabledVisaCheckout;
import com.cardinalcommerce.a.setUICustomization;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

public class BCECGOST3410PublicKey implements ExtendedInvalidKeySpecException, ECPublicKey {
    private boolean Cardinal;
    private transient ECParameterSpec cca_continue;
    private transient CardinalConfigurationParameters configure;
    transient KeyPairGeneratorSpi.XDH getInstance;
    private String init;

    BCECGOST3410PublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.init = "ECGOST3410";
        getInstance(subjectPublicKeyInfo);
    }

    public BCECGOST3410PublicKey(String str, KeyPairGeneratorSpi.XDH xdh) {
        this.init = str;
        this.getInstance = xdh;
        this.cca_continue = null;
    }

    public BCECGOST3410PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.init = "ECGOST3410";
        this.cca_continue = eCPublicKeySpec.getParams();
        this.getInstance = new KeyPairGeneratorSpi.XDH(EC5Util.init(this.cca_continue, eCPublicKeySpec.getW()), EC5Util.Cardinal((PSSSignatureSpi.SHA512_256withRSA) null, eCPublicKeySpec.getParams()));
    }

    private static void Cardinal(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        getInstance(SubjectPublicKeyInfo.configure(getThreeDSRequestorAppURL.Cardinal((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final X509CertificateObject configure() {
        ECParameterSpec eCParameterSpec = this.cca_continue;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.getInstance(eCParameterSpec);
    }

    public String getAlgorithm() {
        return this.init;
    }

    public String getFormat() {
        return "X.509";
    }

    public ECParameterSpec getParams() {
        return this.cca_continue;
    }

    public BCECGOST3410PublicKey(PQCObjectIdentifiers pQCObjectIdentifiers, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.init = "ECGOST3410";
        if (pQCObjectIdentifiers.Cardinal != null) {
            toJSONString tojsonstring = pQCObjectIdentifiers.Cardinal.cca_continue;
            byte[] bArr = pQCObjectIdentifiers.Cardinal.init;
            EllipticCurve cca_continue2 = EC5Util.cca_continue(tojsonstring);
            this.getInstance = new KeyPairGeneratorSpi.XDH(pQCObjectIdentifiers.cca_continue, ECUtil.cca_continue(sHA512_256withRSA, pQCObjectIdentifiers.Cardinal));
            this.cca_continue = EC5Util.cca_continue(cca_continue2, pQCObjectIdentifiers.Cardinal);
            return;
        }
        ECParameterSpec eCParameterSpec = null;
        this.getInstance = new KeyPairGeneratorSpi.XDH(sHA512_256withRSA.cca_continue().cca_continue.configure(pQCObjectIdentifiers.cca_continue.onCReqSuccess().cca_continue(), pQCObjectIdentifiers.cca_continue.getWarnings().cca_continue(), false), EC5Util.Cardinal(sHA512_256withRSA, (ECParameterSpec) null));
        this.cca_continue = null;
    }

    public BCECGOST3410PublicKey(String str, KeyPairGeneratorSpi.XDH xdh, ECParameterSpec eCParameterSpec) {
        this.init = "ECGOST3410";
        KeyFactorySpi.EDDSA eddsa = xdh.Cardinal;
        if (eddsa instanceof KeyFactorySpi.X448) {
            KeyFactorySpi.X448 x448 = (KeyFactorySpi.X448) eddsa;
            this.configure = new AlgorithmParameterGeneratorSpi(x448.onValidated, x448.cleanup, x448.getWarnings);
        }
        this.init = str;
        this.getInstance = xdh;
        if (eCParameterSpec == null) {
            toJSONString tojsonstring = eddsa.cca_continue;
            byte[] bArr = eddsa.configure;
            if (bArr != null) {
                System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
            }
            this.cca_continue = new ECParameterSpec(EC5Util.cca_continue(tojsonstring), EC5Util.cca_continue(eddsa.init), eddsa.getInstance, eddsa.Cardinal.intValue());
            return;
        }
        this.cca_continue = eCParameterSpec;
    }

    public BCECGOST3410PublicKey(String str, KeyPairGeneratorSpi.XDH xdh, X509CertificateObject x509CertificateObject) {
        this.init = "ECGOST3410";
        KeyFactorySpi.EDDSA eddsa = xdh.Cardinal;
        this.init = str;
        this.getInstance = xdh;
        if (x509CertificateObject == null) {
            toJSONString tojsonstring = eddsa.cca_continue;
            byte[] bArr = eddsa.configure;
            if (bArr != null) {
                System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
            }
            this.cca_continue = new ECParameterSpec(EC5Util.cca_continue(tojsonstring), EC5Util.cca_continue(eddsa.init), eddsa.getInstance, eddsa.Cardinal.intValue());
            return;
        }
        toJSONString tojsonstring2 = x509CertificateObject.cca_continue;
        byte[] bArr2 = x509CertificateObject.init;
        this.cca_continue = EC5Util.cca_continue(EC5Util.cca_continue(tojsonstring2), x509CertificateObject);
    }

    private void getInstance(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        getDeviceFingerprint getdevicefingerprint = subjectPublicKeyInfo.Cardinal;
        this.init = "ECGOST3410";
        try {
            byte[] instance = ((setUICustomization) getThreeDSRequestorAppURL.Cardinal(getdevicefingerprint.getInstance())).getInstance();
            byte[] bArr = new byte[65];
            bArr[0] = 4;
            for (int i = 1; i <= 32; i++) {
                bArr[i] = instance[32 - i];
                bArr[i + 32] = instance[64 - i];
            }
            if (subjectPublicKeyInfo.cca_continue.Cardinal instanceof ASN1ObjectIdentifier) {
                aSN1ObjectIdentifier = ASN1ObjectIdentifier.cca_continue((Object) subjectPublicKeyInfo.cca_continue.Cardinal);
                this.configure = aSN1ObjectIdentifier;
            } else {
                CardinalConfigurationParameters cardinalConfigurationParameters = subjectPublicKeyInfo.cca_continue.Cardinal;
                AlgorithmParameterGeneratorSpi algorithmParameterGeneratorSpi = cardinalConfigurationParameters instanceof AlgorithmParameterGeneratorSpi ? (AlgorithmParameterGeneratorSpi) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new AlgorithmParameterGeneratorSpi(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null;
                this.configure = algorithmParameterGeneratorSpi;
                aSN1ObjectIdentifier = algorithmParameterGeneratorSpi.configure;
            }
            PEMUtil.Boundaries configure2 = BaseKeyFactorySpi.configure(IES.Mappings.init(aSN1ObjectIdentifier));
            toJSONString tojsonstring = configure2.cca_continue;
            byte[] bArr2 = configure2.init;
            EllipticCurve cca_continue2 = EC5Util.cca_continue(tojsonstring);
            this.getInstance = new KeyPairGeneratorSpi.XDH(tojsonstring.cca_continue(bArr), ECUtil.cca_continue((PSSSignatureSpi.SHA512_256withRSA) null, (X509CertificateObject) configure2));
            this.cca_continue = new X509CRLObject(IES.Mappings.init(aSN1ObjectIdentifier), cca_continue2, EC5Util.cca_continue(configure2.configure), configure2.getInstance, configure2.getWarnings);
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    public byte[] getEncoded() {
        CardinalConfigurationParameters instance = getInstance();
        if (instance == null) {
            ECParameterSpec eCParameterSpec = this.cca_continue;
            if (eCParameterSpec instanceof X509CRLObject) {
                instance = new AlgorithmParameterGeneratorSpi(IES.Mappings.init(((X509CRLObject) this.cca_continue).cca_continue), IES.getWarnings);
            } else {
                toJSONString instance2 = EC5Util.getInstance(eCParameterSpec.getCurve());
                instance = new DSAUtil(new GMCipherSpi(instance2, EC5Util.cca_continue(instance2, this.cca_continue.getGenerator()), this.cca_continue.getOrder(), BigInteger.valueOf((long) this.cca_continue.getCofactor()), this.cca_continue.getCurve().getSeed()));
            }
        }
        BigInteger cca_continue2 = this.getInstance.configure.onCReqSuccess().cca_continue();
        BigInteger cca_continue3 = this.getInstance.configure.getWarnings().cca_continue();
        byte[] bArr = new byte[64];
        Cardinal(bArr, 0, cca_continue2);
        Cardinal(bArr, 32, cca_continue3);
        try {
            return KeyUtil.getInstance(new SubjectPublicKeyInfo(new BCDSAPrivateKey(IES.onValidated, instance), (CardinalConfigurationParameters) new setEnabledVisaCheckout(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    public ECPoint getW() {
        return EC5Util.cca_continue(this.getInstance.configure);
    }

    public final JSONNavi Cardinal() {
        if (this.cca_continue == null) {
            return this.getInstance.configure.cca_continue();
        }
        return this.getInstance.configure;
    }

    public String toString() {
        String str = this.init;
        JSONNavi jSONNavi = this.getInstance.configure;
        ECParameterSpec eCParameterSpec = this.cca_continue;
        return ECUtil.Cardinal(str, jSONNavi, eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue());
    }

    public boolean equals(Object obj) {
        X509CertificateObject x509CertificateObject;
        if (!(obj instanceof BCECGOST3410PublicKey)) {
            return false;
        }
        BCECGOST3410PublicKey bCECGOST3410PublicKey = (BCECGOST3410PublicKey) obj;
        if (this.getInstance.configure.init(bCECGOST3410PublicKey.getInstance.configure)) {
            ECParameterSpec eCParameterSpec = this.cca_continue;
            X509CertificateObject instance = eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue();
            ECParameterSpec eCParameterSpec2 = bCECGOST3410PublicKey.cca_continue;
            if (eCParameterSpec2 != null) {
                boolean z = bCECGOST3410PublicKey.Cardinal;
                x509CertificateObject = EC5Util.getInstance(eCParameterSpec2);
            } else {
                x509CertificateObject = KeyFactory.init.cca_continue();
            }
            if (instance.equals(x509CertificateObject)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.getInstance.configure.hashCode();
        ECParameterSpec eCParameterSpec = this.cca_continue;
        return hashCode ^ (eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue()).hashCode();
    }

    /* access modifiers changed from: package-private */
    public final CardinalConfigurationParameters getInstance() {
        if (this.configure == null && (this.cca_continue instanceof X509CRLObject)) {
            this.configure = new AlgorithmParameterGeneratorSpi(IES.Mappings.init(((X509CRLObject) this.cca_continue).cca_continue), IES.getWarnings);
        }
        return this.configure;
    }
}
