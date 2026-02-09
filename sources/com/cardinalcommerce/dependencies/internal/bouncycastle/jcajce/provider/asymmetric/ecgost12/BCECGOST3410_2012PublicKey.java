package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.cardinalcommerce.a.AlgorithmParameterGeneratorSpi;
import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.BaseKeyFactorySpi;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.DSAUtil;
import com.cardinalcommerce.a.ExtendedInvalidKeySpecException;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.JSONNavi;
import com.cardinalcommerce.a.KeyAgreementSpi;
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

public class BCECGOST3410_2012PublicKey implements ExtendedInvalidKeySpecException, ECPublicKey {
    private transient AlgorithmParameterGeneratorSpi Cardinal;
    private transient ECParameterSpec cca_continue;
    transient KeyPairGeneratorSpi.XDH configure;
    private String getInstance;
    private boolean init;

    BCECGOST3410_2012PublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.getInstance = "ECGOST3410-2012";
        cca_continue(subjectPublicKeyInfo);
    }

    public BCECGOST3410_2012PublicKey(String str, KeyPairGeneratorSpi.XDH xdh) {
        this.getInstance = str;
        this.configure = xdh;
        this.cca_continue = null;
    }

    public BCECGOST3410_2012PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.getInstance = "ECGOST3410-2012";
        this.cca_continue = eCPublicKeySpec.getParams();
        this.configure = new KeyPairGeneratorSpi.XDH(EC5Util.init(this.cca_continue, eCPublicKeySpec.getW()), EC5Util.Cardinal((PSSSignatureSpi.SHA512_256withRSA) null, eCPublicKeySpec.getParams()));
    }

    private static void getInstance(byte[] bArr, int i, int i2, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = byteArray[(byteArray.length - 1) - i3];
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        cca_continue(SubjectPublicKeyInfo.configure(getThreeDSRequestorAppURL.Cardinal((byte[]) objectInputStream.readObject())));
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
        return this.getInstance;
    }

    public String getFormat() {
        return "X.509";
    }

    public ECParameterSpec getParams() {
        return this.cca_continue;
    }

    public BCECGOST3410_2012PublicKey(PQCObjectIdentifiers pQCObjectIdentifiers, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.getInstance = "ECGOST3410-2012";
        if (pQCObjectIdentifiers.Cardinal != null) {
            toJSONString tojsonstring = pQCObjectIdentifiers.Cardinal.cca_continue;
            byte[] bArr = pQCObjectIdentifiers.Cardinal.init;
            EllipticCurve cca_continue2 = EC5Util.cca_continue(tojsonstring);
            this.configure = new KeyPairGeneratorSpi.XDH(pQCObjectIdentifiers.cca_continue, ECUtil.cca_continue(sHA512_256withRSA, pQCObjectIdentifiers.Cardinal));
            this.cca_continue = EC5Util.cca_continue(cca_continue2, pQCObjectIdentifiers.Cardinal);
            return;
        }
        ECParameterSpec eCParameterSpec = null;
        this.configure = new KeyPairGeneratorSpi.XDH(sHA512_256withRSA.cca_continue().cca_continue.configure(pQCObjectIdentifiers.cca_continue.onCReqSuccess().cca_continue(), pQCObjectIdentifiers.cca_continue.getWarnings().cca_continue(), false), EC5Util.Cardinal(sHA512_256withRSA, (ECParameterSpec) null));
        this.cca_continue = null;
    }

    public BCECGOST3410_2012PublicKey(String str, KeyPairGeneratorSpi.XDH xdh, ECParameterSpec eCParameterSpec) {
        this.getInstance = "ECGOST3410-2012";
        KeyFactorySpi.EDDSA eddsa = xdh.Cardinal;
        this.getInstance = str;
        this.configure = xdh;
        if (eddsa instanceof KeyFactorySpi.X448) {
            KeyFactorySpi.X448 x448 = (KeyFactorySpi.X448) eddsa;
            this.Cardinal = new AlgorithmParameterGeneratorSpi(x448.onValidated, x448.cleanup, x448.getWarnings);
        }
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

    public BCECGOST3410_2012PublicKey(String str, KeyPairGeneratorSpi.XDH xdh, X509CertificateObject x509CertificateObject) {
        this.getInstance = "ECGOST3410-2012";
        KeyFactorySpi.EDDSA eddsa = xdh.Cardinal;
        this.getInstance = str;
        this.configure = xdh;
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

    private void cca_continue(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = subjectPublicKeyInfo.cca_continue.cca_continue;
        getDeviceFingerprint getdevicefingerprint = subjectPublicKeyInfo.Cardinal;
        this.getInstance = "ECGOST3410-2012";
        try {
            byte[] instance = ((setUICustomization) getThreeDSRequestorAppURL.Cardinal(getdevicefingerprint.getInstance())).getInstance();
            int i = aSN1ObjectIdentifier.equals(KeyAgreementSpi.DHwithSHA224CKDF.getInstance) ? 64 : 32;
            int i2 = i * 2;
            byte[] bArr = new byte[(i2 + 1)];
            bArr[0] = 4;
            for (int i3 = 1; i3 <= i; i3++) {
                bArr[i3] = instance[i - i3];
                bArr[i3 + i] = instance[i2 - i3];
            }
            CardinalConfigurationParameters cardinalConfigurationParameters = subjectPublicKeyInfo.cca_continue.Cardinal;
            AlgorithmParameterGeneratorSpi algorithmParameterGeneratorSpi = cardinalConfigurationParameters instanceof AlgorithmParameterGeneratorSpi ? (AlgorithmParameterGeneratorSpi) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new AlgorithmParameterGeneratorSpi(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null;
            this.Cardinal = algorithmParameterGeneratorSpi;
            PEMUtil.Boundaries configure2 = BaseKeyFactorySpi.configure(IES.Mappings.init(algorithmParameterGeneratorSpi.configure));
            toJSONString tojsonstring = configure2.cca_continue;
            byte[] bArr2 = configure2.init;
            EllipticCurve cca_continue2 = EC5Util.cca_continue(tojsonstring);
            this.configure = new KeyPairGeneratorSpi.XDH(tojsonstring.cca_continue(bArr), ECUtil.cca_continue((PSSSignatureSpi.SHA512_256withRSA) null, (X509CertificateObject) configure2));
            this.cca_continue = new X509CRLObject(IES.Mappings.init(this.Cardinal.configure), cca_continue2, EC5Util.cca_continue(configure2.configure), configure2.getInstance, configure2.getWarnings);
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    public byte[] getEncoded() {
        int i;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        BigInteger cca_continue2 = this.configure.configure.onCReqSuccess().cca_continue();
        BigInteger cca_continue3 = this.configure.configure.getWarnings().cca_continue();
        boolean z = cca_continue2.bitLength() > 256;
        CardinalConfigurationParameters cca_continue4 = cca_continue();
        if (cca_continue4 == null) {
            ECParameterSpec eCParameterSpec = this.cca_continue;
            if (eCParameterSpec instanceof X509CRLObject) {
                cca_continue4 = z ? new AlgorithmParameterGeneratorSpi(IES.Mappings.init(((X509CRLObject) this.cca_continue).cca_continue), KeyAgreementSpi.DHwithSHA224CKDF.init) : new AlgorithmParameterGeneratorSpi(IES.Mappings.init(((X509CRLObject) this.cca_continue).cca_continue), KeyAgreementSpi.DHwithSHA224CKDF.cca_continue);
            } else {
                toJSONString instance = EC5Util.getInstance(eCParameterSpec.getCurve());
                cca_continue4 = new DSAUtil(new GMCipherSpi(instance, EC5Util.cca_continue(instance, this.cca_continue.getGenerator()), this.cca_continue.getOrder(), BigInteger.valueOf((long) this.cca_continue.getCofactor()), this.cca_continue.getCurve().getSeed()));
            }
        }
        int i2 = 64;
        if (z) {
            aSN1ObjectIdentifier = KeyAgreementSpi.DHwithSHA224CKDF.getInstance;
            i = 64;
            i2 = 128;
        } else {
            aSN1ObjectIdentifier = KeyAgreementSpi.DHwithSHA224CKDF.Cardinal;
            i = 32;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2 / 2;
        getInstance(bArr, i3, 0, cca_continue2);
        getInstance(bArr, i3, i, cca_continue3);
        try {
            return KeyUtil.getInstance(new SubjectPublicKeyInfo(new BCDSAPrivateKey(aSN1ObjectIdentifier, cca_continue4), (CardinalConfigurationParameters) new setEnabledVisaCheckout(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    public ECPoint getW() {
        return EC5Util.cca_continue(this.configure.configure);
    }

    public final JSONNavi Cardinal() {
        if (this.cca_continue == null) {
            return this.configure.configure.cca_continue();
        }
        return this.configure.configure;
    }

    public String toString() {
        String str = this.getInstance;
        JSONNavi jSONNavi = this.configure.configure;
        ECParameterSpec eCParameterSpec = this.cca_continue;
        return ECUtil.Cardinal(str, jSONNavi, eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue());
    }

    public boolean equals(Object obj) {
        X509CertificateObject x509CertificateObject;
        if (!(obj instanceof BCECGOST3410_2012PublicKey)) {
            return false;
        }
        BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = (BCECGOST3410_2012PublicKey) obj;
        if (this.configure.configure.init(bCECGOST3410_2012PublicKey.configure.configure)) {
            ECParameterSpec eCParameterSpec = this.cca_continue;
            X509CertificateObject instance = eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue();
            ECParameterSpec eCParameterSpec2 = bCECGOST3410_2012PublicKey.cca_continue;
            if (eCParameterSpec2 != null) {
                boolean z = bCECGOST3410_2012PublicKey.init;
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
        int hashCode = this.configure.configure.hashCode();
        ECParameterSpec eCParameterSpec = this.cca_continue;
        return hashCode ^ (eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue()).hashCode();
    }

    public final AlgorithmParameterGeneratorSpi cca_continue() {
        if (this.Cardinal == null && (this.cca_continue instanceof X509CRLObject)) {
            if (this.configure.configure.onCReqSuccess().cca_continue().bitLength() > 256) {
                this.Cardinal = new AlgorithmParameterGeneratorSpi(IES.Mappings.init(((X509CRLObject) this.cca_continue).cca_continue), KeyAgreementSpi.DHwithSHA224CKDF.init);
            } else {
                this.Cardinal = new AlgorithmParameterGeneratorSpi(IES.Mappings.init(((X509CRLObject) this.cca_continue).cca_continue), KeyAgreementSpi.DHwithSHA224CKDF.cca_continue);
            }
        }
        return this.Cardinal;
    }
}
