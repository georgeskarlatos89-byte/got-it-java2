package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.DSAUtil;
import com.cardinalcommerce.a.ExtendedInvalidKeySpecException;
import com.cardinalcommerce.a.GMCipherSpi;
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
import com.cardinalcommerce.a.merge;
import com.cardinalcommerce.a.setCornerRadius;
import com.cardinalcommerce.a.setEnabledVisaCheckout;
import com.cardinalcommerce.a.setEnvironment;
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

public class BCDSTU4145PublicKey implements ExtendedInvalidKeySpecException, ECPublicKey {
    private String Cardinal;
    private transient ECParameterSpec cca_continue;
    private boolean configure;
    transient KeyAgreementSpi.DHwithSHA256CKDF getInstance;
    transient KeyPairGeneratorSpi.XDH init;

    BCDSTU4145PublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.Cardinal = "DSTU4145";
        getInstance(subjectPublicKeyInfo);
    }

    public BCDSTU4145PublicKey(String str, KeyPairGeneratorSpi.XDH xdh) {
        this.Cardinal = str;
        this.init = xdh;
        this.cca_continue = null;
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.Cardinal = "DSTU4145";
        this.cca_continue = eCPublicKeySpec.getParams();
        this.init = new KeyPairGeneratorSpi.XDH(EC5Util.init(this.cca_continue, eCPublicKeySpec.getW()), EC5Util.Cardinal((PSSSignatureSpi.SHA512_256withRSA) null, this.cca_continue));
    }

    private static void cca_continue(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
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
        return this.Cardinal;
    }

    public String getFormat() {
        return "X.509";
    }

    public ECParameterSpec getParams() {
        return this.cca_continue;
    }

    public BCDSTU4145PublicKey(PQCObjectIdentifiers pQCObjectIdentifiers, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.Cardinal = "DSTU4145";
        if (pQCObjectIdentifiers.Cardinal != null) {
            toJSONString tojsonstring = pQCObjectIdentifiers.Cardinal.cca_continue;
            byte[] bArr = pQCObjectIdentifiers.Cardinal.init;
            EllipticCurve cca_continue2 = EC5Util.cca_continue(tojsonstring);
            this.init = new KeyPairGeneratorSpi.XDH(pQCObjectIdentifiers.cca_continue, ECUtil.cca_continue(sHA512_256withRSA, pQCObjectIdentifiers.Cardinal));
            this.cca_continue = EC5Util.cca_continue(cca_continue2, pQCObjectIdentifiers.Cardinal);
            return;
        }
        ECParameterSpec eCParameterSpec = null;
        this.init = new KeyPairGeneratorSpi.XDH(sHA512_256withRSA.cca_continue().cca_continue.configure(pQCObjectIdentifiers.cca_continue.onCReqSuccess().cca_continue(), pQCObjectIdentifiers.cca_continue.getWarnings().cca_continue(), false), EC5Util.Cardinal(sHA512_256withRSA, (ECParameterSpec) null));
        this.cca_continue = null;
    }

    public BCDSTU4145PublicKey(String str, KeyPairGeneratorSpi.XDH xdh, ECParameterSpec eCParameterSpec) {
        this.Cardinal = "DSTU4145";
        KeyFactorySpi.EDDSA eddsa = xdh.Cardinal;
        this.Cardinal = str;
        this.init = xdh;
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

    public BCDSTU4145PublicKey(String str, KeyPairGeneratorSpi.XDH xdh, X509CertificateObject x509CertificateObject) {
        this.Cardinal = "DSTU4145";
        KeyFactorySpi.EDDSA eddsa = xdh.Cardinal;
        this.Cardinal = str;
        if (x509CertificateObject == null) {
            toJSONString tojsonstring = eddsa.cca_continue;
            byte[] bArr = eddsa.configure;
            if (bArr != null) {
                System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
            }
            this.cca_continue = new ECParameterSpec(EC5Util.cca_continue(tojsonstring), EC5Util.cca_continue(eddsa.init), eddsa.getInstance, eddsa.Cardinal.intValue());
        } else {
            toJSONString tojsonstring2 = x509CertificateObject.cca_continue;
            byte[] bArr2 = x509CertificateObject.init;
            this.cca_continue = EC5Util.cca_continue(EC5Util.cca_continue(tojsonstring2), x509CertificateObject);
        }
        this.init = xdh;
    }

    private void getInstance(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        X509CertificateObject x509CertificateObject;
        GMCipherSpi gMCipherSpi;
        ECParameterSpec eCParameterSpec;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        SubjectPublicKeyInfo subjectPublicKeyInfo2 = subjectPublicKeyInfo;
        getDeviceFingerprint getdevicefingerprint = subjectPublicKeyInfo2.Cardinal;
        this.Cardinal = "DSTU4145";
        try {
            byte[] instance = ((setUICustomization) getThreeDSRequestorAppURL.Cardinal(getdevicefingerprint.getInstance())).getInstance();
            if (subjectPublicKeyInfo2.cca_continue.cca_continue.equals(KeyAgreementSpi.DHwithSHA512KDF.Cardinal)) {
                cca_continue(instance);
            }
            isEnableLogging instance2 = isEnableLogging.getInstance((Object) subjectPublicKeyInfo2.cca_continue.Cardinal);
            boolean z = false;
            if (instance2.init(0) instanceof setEnvironment) {
                gMCipherSpi = GMCipherSpi.cca_continue(instance2);
                toJSONString tojsonstring = gMCipherSpi.init;
                JSONNavi cca_continue2 = gMCipherSpi.getInstance.cca_continue();
                BigInteger bigInteger = gMCipherSpi.cca_continue;
                BigInteger bigInteger2 = gMCipherSpi.configure;
                byte[] bArr5 = gMCipherSpi.Cardinal;
                if (bArr5 == null) {
                    bArr4 = null;
                } else {
                    byte[] bArr6 = new byte[bArr5.length];
                    System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                    bArr4 = bArr6;
                }
                x509CertificateObject = new X509CertificateObject(tojsonstring, cca_continue2, bigInteger, bigInteger2, bArr4);
            } else {
                KeyAgreementSpi.DHwithSHA256CKDF init2 = KeyAgreementSpi.DHwithSHA256CKDF.init(instance2);
                this.getInstance = init2;
                if (init2.configure != null) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = this.getInstance.configure;
                    KeyFactorySpi.EDDSA instance3 = KeyAgreementSpi.DHwithSHA384CKDF.getInstance(aSN1ObjectIdentifier);
                    String str = aSN1ObjectIdentifier.init;
                    toJSONString tojsonstring2 = instance3.cca_continue;
                    JSONNavi jSONNavi = instance3.init;
                    BigInteger bigInteger3 = instance3.getInstance;
                    BigInteger bigInteger4 = instance3.Cardinal;
                    byte[] bArr7 = instance3.configure;
                    if (bArr7 == null) {
                        bArr3 = null;
                    } else {
                        byte[] bArr8 = new byte[bArr7.length];
                        System.arraycopy(bArr7, 0, bArr8, 0, bArr7.length);
                        bArr3 = bArr8;
                    }
                    x509CertificateObject = new PEMUtil.Boundaries(str, tojsonstring2, jSONNavi, bigInteger3, bigInteger4, bArr3);
                } else {
                    KeyAgreementSpi.DHwithSHA512CKDF dHwithSHA512CKDF = this.getInstance.init;
                    byte[] instance4 = dHwithSHA512CKDF.init.getInstance();
                    if (instance4 == null) {
                        bArr = null;
                    } else {
                        bArr = new byte[instance4.length];
                        System.arraycopy(instance4, 0, bArr, 0, instance4.length);
                    }
                    if (subjectPublicKeyInfo2.cca_continue.cca_continue.equals(KeyAgreementSpi.DHwithSHA512KDF.Cardinal)) {
                        cca_continue(bArr);
                    }
                    KeyAgreementSpi.DHwithSHA256KDF dHwithSHA256KDF = dHwithSHA512CKDF.cca_continue;
                    int i = dHwithSHA256KDF.Cardinal;
                    int i2 = dHwithSHA256KDF.getInstance;
                    int i3 = dHwithSHA256KDF.cca_continue;
                    int i4 = dHwithSHA256KDF.configure;
                    BigInteger bigInteger5 = new BigInteger(dHwithSHA512CKDF.Cardinal.getInstance);
                    BigInteger bigInteger6 = new BigInteger(1, bArr);
                    toJSONString.init init3 = r9;
                    toJSONString.init init4 = new toJSONString.init(i, i2, i3, i4, bigInteger5, bigInteger6);
                    byte[] instance5 = dHwithSHA512CKDF.getInstance.getInstance();
                    if (instance5 == null) {
                        bArr2 = null;
                    } else {
                        bArr2 = new byte[instance5.length];
                        System.arraycopy(instance5, 0, bArr2, 0, instance5.length);
                    }
                    if (subjectPublicKeyInfo2.cca_continue.cca_continue.equals(KeyAgreementSpi.DHwithSHA512KDF.Cardinal)) {
                        cca_continue(bArr2);
                    }
                    x509CertificateObject = new X509CertificateObject(init3, KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue((toJSONString) init3, bArr2), new BigInteger(dHwithSHA512CKDF.configure.getInstance));
                }
                gMCipherSpi = null;
            }
            toJSONString tojsonstring3 = x509CertificateObject.cca_continue;
            byte[] bArr9 = x509CertificateObject.init;
            EllipticCurve cca_continue3 = EC5Util.cca_continue(tojsonstring3);
            KeyAgreementSpi.DHwithSHA256CKDF dHwithSHA256CKDF = this.getInstance;
            if (dHwithSHA256CKDF != null) {
                if (dHwithSHA256CKDF.configure != null) {
                    z = true;
                }
                if (z) {
                    this.cca_continue = new X509CRLObject(this.getInstance.configure.init, cca_continue3, EC5Util.cca_continue(x509CertificateObject.configure), x509CertificateObject.getInstance, x509CertificateObject.getWarnings);
                    this.init = new KeyPairGeneratorSpi.XDH(KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(tojsonstring3, instance), EC5Util.Cardinal((PSSSignatureSpi.SHA512_256withRSA) null, this.cca_continue));
                }
                eCParameterSpec = new ECParameterSpec(cca_continue3, EC5Util.cca_continue(x509CertificateObject.configure), x509CertificateObject.getInstance, x509CertificateObject.getWarnings.intValue());
            } else {
                eCParameterSpec = EC5Util.Cardinal(gMCipherSpi);
            }
            this.cca_continue = eCParameterSpec;
            this.init = new KeyPairGeneratorSpi.XDH(KeyAgreementSpi.MQVwithSHA224CKDF.cca_continue(tojsonstring3, instance), EC5Util.Cardinal((PSSSignatureSpi.SHA512_256withRSA) null, this.cca_continue));
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    public byte[] getEncoded() {
        CardinalConfigurationParameters cardinalConfigurationParameters = this.getInstance;
        if (cardinalConfigurationParameters == null) {
            ECParameterSpec eCParameterSpec = this.cca_continue;
            if (eCParameterSpec instanceof X509CRLObject) {
                cardinalConfigurationParameters = new KeyAgreementSpi.DHwithSHA256CKDF(new ASN1ObjectIdentifier(((X509CRLObject) this.cca_continue).cca_continue));
            } else {
                toJSONString instance = EC5Util.getInstance(eCParameterSpec.getCurve());
                cardinalConfigurationParameters = new DSAUtil(new GMCipherSpi(instance, EC5Util.cca_continue(instance, this.cca_continue.getGenerator()), this.cca_continue.getOrder(), BigInteger.valueOf((long) this.cca_continue.getCofactor()), this.cca_continue.getCurve().getSeed()));
            }
        }
        JSONNavi CardinalRenderType = this.init.configure.CardinalRenderType();
        merge onCReqSuccess = CardinalRenderType.onCReqSuccess();
        byte[] instance2 = setCornerRadius.getInstance((onCReqSuccess.Cardinal() + 7) / 8, onCReqSuccess.cca_continue());
        if (!onCReqSuccess.onCReqSuccess()) {
            merge instance3 = CardinalRenderType.getWarnings().getInstance(onCReqSuccess);
            merge merge = instance3;
            for (int i = 1; i < instance3.Cardinal(); i++) {
                merge = merge.getInstance().cca_continue(instance3);
            }
            if (merge.cleanup()) {
                int length = instance2.length - 1;
                instance2[length] = (byte) (1 | instance2[length]);
            } else {
                int length2 = instance2.length - 1;
                instance2[length2] = (byte) (instance2[length2] & 254);
            }
        }
        try {
            return KeyUtil.getInstance(new SubjectPublicKeyInfo(new BCDSAPrivateKey(KeyAgreementSpi.DHwithSHA512KDF.cca_continue, cardinalConfigurationParameters), (CardinalConfigurationParameters) new setEnabledVisaCheckout(instance2)));
        } catch (IOException unused) {
            return null;
        }
    }

    public ECPoint getW() {
        return EC5Util.cca_continue(this.init.configure);
    }

    public final JSONNavi Cardinal() {
        JSONNavi jSONNavi = this.init.configure;
        return this.cca_continue == null ? jSONNavi.cca_continue() : jSONNavi;
    }

    public String toString() {
        String str = this.Cardinal;
        JSONNavi jSONNavi = this.init.configure;
        ECParameterSpec eCParameterSpec = this.cca_continue;
        return ECUtil.Cardinal(str, jSONNavi, eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue());
    }

    public boolean equals(Object obj) {
        X509CertificateObject x509CertificateObject;
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        if (this.init.configure.init(bCDSTU4145PublicKey.init.configure)) {
            ECParameterSpec eCParameterSpec = this.cca_continue;
            X509CertificateObject instance = eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue();
            ECParameterSpec eCParameterSpec2 = bCDSTU4145PublicKey.cca_continue;
            if (eCParameterSpec2 != null) {
                boolean z = bCDSTU4145PublicKey.configure;
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
        int hashCode = this.init.configure.hashCode();
        ECParameterSpec eCParameterSpec = this.cca_continue;
        return hashCode ^ (eCParameterSpec != null ? EC5Util.getInstance(eCParameterSpec) : KeyFactory.init.cca_continue()).hashCode();
    }
}
